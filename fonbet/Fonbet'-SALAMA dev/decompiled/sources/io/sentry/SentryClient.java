package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Backfillable;
import io.sentry.hints.Cached;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.TransactionEnd;
import io.sentry.logger.ILoggerBatchProcessor;
import io.sentry.logger.LoggerBatchProcessor;
import io.sentry.logger.NoOpLoggerBatchProcessor;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransport;
import io.sentry.transport.RateLimiter;
import io.sentry.util.CheckInUtils;
import io.sentry.util.ErrorUtils;
import io.sentry.util.ExceptionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.Random;
import io.sentry.util.SentryRandom;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SentryClient implements ISentryClient {
    static final String SENTRY_PROTOCOL_VERSION = "7";
    private final ILoggerBatchProcessor loggerBatchProcessor;
    private final SentryOptions options;
    private final ITransport transport;
    private final SortBreadcrumbsByDate sortBreadcrumbsByDate = new SortBreadcrumbsByDate();
    private boolean enabled = true;

    public static final class SortBreadcrumbsByDate implements Comparator<Breadcrumb> {
        private SortBreadcrumbsByDate() {
        }

        @Override // java.util.Comparator
        public int compare(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
            return breadcrumb.getTimestamp().compareTo(breadcrumb2.getTimestamp());
        }
    }

    public SentryClient(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        ITransportFactory transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof NoOpTransportFactory) {
            transportFactory = new AsyncHttpTransportFactory();
            sentryOptions.setTransportFactory(transportFactory);
        }
        this.transport = transportFactory.create(sentryOptions, new RequestDetailsResolver(sentryOptions).resolve());
        if (sentryOptions.getLogs().isEnabled()) {
            this.loggerBatchProcessor = new LoggerBatchProcessor(sentryOptions, this);
        } else {
            this.loggerBatchProcessor = NoOpLoggerBatchProcessor.getInstance();
        }
    }

    private void addScopeAttachmentsToHint(IScope iScope, Hint hint) {
        if (iScope != null) {
            hint.addAttachments(iScope.getAttachments());
        }
    }

    private SentryEvent applyFeedbackScope(SentryEvent sentryEvent, IScope iScope, Hint hint) {
        if (sentryEvent.getUser() == null) {
            sentryEvent.setUser(iScope.getUser());
        }
        if (sentryEvent.getTags() == null) {
            sentryEvent.setTags(new HashMap(iScope.getTags()));
        } else {
            for (Map.Entry<String, String> entry : iScope.getTags().entrySet()) {
                if (!sentryEvent.getTags().containsKey(entry.getKey())) {
                    sentryEvent.getTags().put(entry.getKey(), entry.getValue());
                }
            }
        }
        Contexts contexts = sentryEvent.getContexts();
        for (Map.Entry<String, Object> entry2 : new Contexts(iScope.getContexts()).entrySet()) {
            if (!contexts.containsKey(entry2.getKey())) {
                contexts.put(entry2.getKey(), entry2.getValue());
            }
        }
        ISpan span = iScope.getSpan();
        if (sentryEvent.getContexts().getTrace() == null) {
            if (span == null) {
                sentryEvent.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
            } else {
                sentryEvent.getContexts().setTrace(span.getSpanContext());
            }
        }
        return processFeedbackEvent(sentryEvent, hint, iScope.getEventProcessors());
    }

    private SentryEvent applyScope(SentryEvent sentryEvent, IScope iScope, Hint hint) {
        if (iScope == null) {
            return sentryEvent;
        }
        applyScope((SentryClient) sentryEvent, iScope);
        if (sentryEvent.getTransaction() == null) {
            sentryEvent.setTransaction(iScope.getTransactionName());
        }
        if (sentryEvent.getFingerprints() == null) {
            sentryEvent.setFingerprints(iScope.getFingerprint());
        }
        if (iScope.getLevel() != null) {
            sentryEvent.setLevel(iScope.getLevel());
        }
        ISpan span = iScope.getSpan();
        if (sentryEvent.getContexts().getTrace() == null) {
            if (span == null) {
                sentryEvent.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
            } else {
                sentryEvent.getContexts().setTrace(span.getSpanContext());
            }
        }
        return processEvent(sentryEvent, hint, iScope.getEventProcessors());
    }

    private SentryEnvelope buildEnvelope(SentryBaseEvent sentryBaseEvent, List<Attachment> list, Session session, TraceContext traceContext, ProfilingTraceData profilingTraceData) {
        SentryId sentryId;
        ArrayList arrayList = new ArrayList();
        if (sentryBaseEvent != null) {
            arrayList.add(SentryEnvelopeItem.fromEvent(this.options.getSerializer(), sentryBaseEvent));
            sentryId = sentryBaseEvent.getEventId();
        } else {
            sentryId = null;
        }
        if (session != null) {
            arrayList.add(SentryEnvelopeItem.fromSession(this.options.getSerializer(), session));
        }
        if (profilingTraceData != null) {
            arrayList.add(SentryEnvelopeItem.fromProfilingTrace(profilingTraceData, this.options.getMaxTraceFileSize(), this.options.getSerializer()));
            if (sentryId == null) {
                sentryId = new SentryId(profilingTraceData.getProfileId());
            }
        }
        if (list != null) {
            Iterator<Attachment> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SentryEnvelopeItem.fromAttachment(this.options.getSerializer(), this.options.getLogger(), it.next(), this.options.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new SentryEnvelope(new SentryEnvelopeHeader(sentryId, this.options.getSdkVersion(), traceContext), arrayList);
    }

    private SentryEvent executeBeforeSend(SentryEvent sentryEvent, Hint hint) {
        SentryOptions.BeforeSendCallback beforeSend = this.options.getBeforeSend();
        if (beforeSend == null) {
            return sentryEvent;
        }
        try {
            return beforeSend.execute(sentryEvent, hint);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    private SentryEvent executeBeforeSendFeedback(SentryEvent sentryEvent, Hint hint) {
        SentryOptions.BeforeSendCallback beforeSendFeedback = this.options.getBeforeSendFeedback();
        if (beforeSendFeedback == null) {
            return sentryEvent;
        }
        try {
            return beforeSendFeedback.execute(sentryEvent, hint);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendFeedback callback threw an exception.", th);
            return null;
        }
    }

    private SentryLogEvent executeBeforeSendLog(SentryLogEvent sentryLogEvent) {
        SentryOptions.Logs.BeforeSendLogCallback beforeSend = this.options.getLogs().getBeforeSend();
        if (beforeSend == null) {
            return sentryLogEvent;
        }
        try {
            return beforeSend.execute(sentryLogEvent);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendLog callback threw an exception. Dropping log event.", th);
            return null;
        }
    }

    private SentryReplayEvent executeBeforeSendReplay(SentryReplayEvent sentryReplayEvent, Hint hint) {
        SentryOptions.BeforeSendReplayCallback beforeSendReplay = this.options.getBeforeSendReplay();
        if (beforeSendReplay == null) {
            return sentryReplayEvent;
        }
        try {
            return beforeSendReplay.execute(sentryReplayEvent, hint);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendReplay callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    private SentryTransaction executeBeforeSendTransaction(SentryTransaction sentryTransaction, Hint hint) {
        SentryOptions.BeforeSendTransactionCallback beforeSendTransaction = this.options.getBeforeSendTransaction();
        if (beforeSendTransaction == null) {
            return sentryTransaction;
        }
        try {
            return beforeSendTransaction.execute(sentryTransaction, hint);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    private List<Attachment> filterForTransaction(List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Attachment attachment : list) {
            if (attachment.isAddToTransactions()) {
                arrayList.add(attachment);
            }
        }
        return arrayList;
    }

    private void finalizeTransaction(IScope iScope, Hint hint) {
        ITransaction transaction = iScope.getTransaction();
        if (transaction == null || !HintUtils.hasType(hint, TransactionEnd.class)) {
            return;
        }
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (!(sentrySdkHint instanceof DiskFlushNotification)) {
            transaction.forceFinish(SpanStatus.ABORTED, false, null);
        } else {
            ((DiskFlushNotification) sentrySdkHint).setFlushable(transaction.getEventId());
            transaction.forceFinish(SpanStatus.ABORTED, false, hint);
        }
    }

    private List<Attachment> getAttachments(Hint hint) {
        List<Attachment> attachments = hint.getAttachments();
        Attachment screenshot = hint.getScreenshot();
        if (screenshot != null) {
            attachments.add(screenshot);
        }
        Attachment viewHierarchy = hint.getViewHierarchy();
        if (viewHierarchy != null) {
            attachments.add(viewHierarchy);
        }
        Attachment threadDump = hint.getThreadDump();
        if (threadDump != null) {
            attachments.add(threadDump);
        }
        return attachments;
    }

    private TraceContext getTraceContext(IScope iScope, Hint hint, SentryEvent sentryEvent) {
        return getTraceContext(iScope, hint, sentryEvent, sentryEvent != null ? sentryEvent.getTransaction() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureEvent$0(Session session) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionData$1(SentryEvent sentryEvent, Hint hint, Session session) {
        if (session == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String str = null;
        Session.State state = sentryEvent.isCrashed() ? Session.State.Crashed : null;
        boolean z4 = Session.State.Crashed == state || sentryEvent.isErrored();
        String str2 = (sentryEvent.getRequest() == null || sentryEvent.getRequest().getHeaders() == null || !sentryEvent.getRequest().getHeaders().containsKey("user-agent")) ? null : sentryEvent.getRequest().getHeaders().get("user-agent");
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (sentrySdkHint instanceof AbnormalExit) {
            str = ((AbnormalExit) sentrySdkHint).mechanism();
            state = Session.State.Abnormal;
        }
        if (session.update(state, str2, z4, str) && session.isTerminated()) {
            session.end();
        }
    }

    private SentryEvent processEvent(SentryEvent sentryEvent, Hint hint, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                boolean z4 = next instanceof BackfillingEventProcessor;
                boolean hasType = HintUtils.hasType(hint, Backfillable.class);
                if (hasType && z4) {
                    sentryEvent = next.process(sentryEvent, hint);
                } else if (!hasType && !z4) {
                    sentryEvent = next.process(sentryEvent, hint);
                }
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing event by processor: %s", next.getClass().getName());
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
                break;
            }
        }
        return sentryEvent;
    }

    private SentryEvent processFeedbackEvent(SentryEvent sentryEvent, Hint hint, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryEvent = next.process(sentryEvent, hint);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing feedback event by processor: %s", next.getClass().getName());
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Feedback event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Feedback);
                break;
            }
        }
        return sentryEvent;
    }

    private SentryLogEvent processLogEvent(SentryLogEvent sentryLogEvent, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryLogEvent = next.process(sentryLogEvent);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing log event by processor: %s", next.getClass().getName());
            }
            if (sentryLogEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Log event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.LogItem);
                break;
            }
        }
        return sentryLogEvent;
    }

    private SentryReplayEvent processReplayEvent(SentryReplayEvent sentryReplayEvent, Hint hint, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryReplayEvent = next.process(sentryReplayEvent, hint);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (sentryReplayEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Replay);
                break;
            }
        }
        return sentryReplayEvent;
    }

    private SentryTransaction processTransaction(SentryTransaction sentryTransaction, Hint hint, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            int size = sentryTransaction.getSpans().size();
            try {
                sentryTransaction = next.process(sentryTransaction, hint);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
            }
            int size2 = sentryTransaction == null ? 0 : sentryTransaction.getSpans().size();
            if (sentryTransaction == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
                clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
                this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i7 = size - size2;
                this.options.getLogger().log(SentryLevel.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i7), next.getClass().getName());
                this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Span, i7);
            }
        }
        return sentryTransaction;
    }

    private boolean sample() {
        Random current = this.options.getSampleRate() == null ? null : SentryRandom.current();
        return this.options.getSampleRate() == null || current == null || this.options.getSampleRate().doubleValue() >= current.nextDouble();
    }

    private SentryId sendEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        SentryOptions.BeforeEnvelopeCallback beforeEnvelopeCallback = this.options.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.execute(sentryEnvelope, hint);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        SentryIntegrationPackageStorage.getInstance().checkForMixedVersions(this.options.getLogger());
        if (hint == null) {
            this.transport.send(sentryEnvelope);
        } else {
            this.transport.send(sentryEnvelope, hint);
        }
        SentryId eventId = sentryEnvelope.getHeader().getEventId();
        return eventId != null ? eventId : SentryId.EMPTY_ID;
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", sentryBaseEvent.getEventId());
        return false;
    }

    private boolean shouldSendSessionUpdateForDroppedEvent(Session session, Session session2) {
        if (session2 == null) {
            return false;
        }
        if (session == null) {
            return true;
        }
        Session.State status = session2.getStatus();
        Session.State state = Session.State.Crashed;
        if (status != state || session.getStatus() == state) {
            return session2.errorCount() > 0 && session.errorCount() <= 0;
        }
        return true;
    }

    private void sortBreadcrumbsByDate(SentryBaseEvent sentryBaseEvent, Collection<Breadcrumb> collection) {
        List<Breadcrumb> breadcrumbs = sentryBaseEvent.getBreadcrumbs();
        if (breadcrumbs == null || collection.isEmpty()) {
            return;
        }
        breadcrumbs.addAll(collection);
        Collections.sort(breadcrumbs, this.sortBreadcrumbsByDate);
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedLogEvents(SentryLogEvents sentryLogEvents) {
        try {
            sendEnvelope(buildEnvelope(sentryLogEvents), null);
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing log failed.", new Object[0]);
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureCheckIn(CheckIn checkIn, IScope iScope, Hint hint) {
        if (hint == null) {
            hint = new Hint();
        }
        if (checkIn.getEnvironment() == null) {
            checkIn.setEnvironment(this.options.getEnvironment());
        }
        if (checkIn.getRelease() == null) {
            checkIn.setRelease(this.options.getRelease());
        }
        if (shouldApplyScopeData(checkIn, hint)) {
            checkIn = applyScope(checkIn, iScope);
        }
        if (CheckInUtils.isIgnored(this.options.getIgnoredCheckIns(), checkIn.getMonitorSlug())) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Check-in was dropped as slug %s is ignored", checkIn.getMonitorSlug());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Monitor);
            return SentryId.EMPTY_ID;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing check-in: %s", checkIn.getCheckInId());
        SentryId checkInId = checkIn.getCheckInId();
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(checkIn, getTraceContext(iScope, hint, null));
            hint.clear();
            return sendEnvelope(buildEnvelope, hint);
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing check-in %s failed.", checkInId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        if (hint == null) {
            hint = new Hint();
        }
        try {
            hint.clear();
            return sendEnvelope(sentryEnvelope, hint);
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope.", e7);
            return SentryId.EMPTY_ID;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    @Override // io.sentry.ISentryClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SentryId captureEvent(SentryEvent sentryEvent, IScope iScope, Hint hint) {
        SentryEvent sentryEvent2;
        Objects.requireNonNull(sentryEvent, "SentryEvent is required.");
        if (hint == null) {
            hint = new Hint();
        }
        if (shouldApplyScopeData(sentryEvent, hint)) {
            addScopeAttachmentsToHint(iScope, hint);
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing event: %s", sentryEvent.getEventId());
        Throwable throwable = sentryEvent.getThrowable();
        if (throwable != null && ExceptionUtils.isIgnored(this.options.getIgnoredExceptionsForType(), throwable)) {
            this.options.getLogger().log(sentryLevel, "Event was dropped as the exception %s is ignored", throwable.getClass());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
            return SentryId.EMPTY_ID;
        }
        if (ErrorUtils.isIgnored(this.options.getIgnoredErrors(), sentryEvent)) {
            this.options.getLogger().log(sentryLevel, "Event was dropped as it matched a string/pattern in ignoredErrors", sentryEvent.getMessage());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
            return SentryId.EMPTY_ID;
        }
        boolean z4 = false;
        if (shouldApplyScopeData(sentryEvent, hint) && (sentryEvent = applyScope(sentryEvent, iScope, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by applyScope", new Object[0]);
            return SentryId.EMPTY_ID;
        }
        SentryEvent processEvent = processEvent(sentryEvent, hint, this.options.getEventProcessors());
        if (processEvent != null && (processEvent = executeBeforeSend(processEvent, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSend", new Object[0]);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Error);
        }
        if (processEvent == null) {
            return SentryId.EMPTY_ID;
        }
        Session withSession = iScope != null ? iScope.withSession(new f(1)) : null;
        Session updateSessionData = (withSession == null || !withSession.isTerminated()) ? updateSessionData(processEvent, hint, iScope) : null;
        if (sample()) {
            sentryEvent2 = processEvent;
        } else {
            this.options.getLogger().log(sentryLevel, "Event %s was dropped due to sampling decision.", processEvent.getEventId());
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.SAMPLE_RATE, DataCategory.Error);
            sentryEvent2 = null;
        }
        boolean shouldSendSessionUpdateForDroppedEvent = shouldSendSessionUpdateForDroppedEvent(withSession, updateSessionData);
        if (sentryEvent2 == null && !shouldSendSessionUpdateForDroppedEvent) {
            this.options.getLogger().log(sentryLevel, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return SentryId.EMPTY_ID;
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        if (sentryEvent2 != null && sentryEvent2.getEventId() != null) {
            sentryId = sentryEvent2.getEventId();
        }
        boolean hasType = HintUtils.hasType(hint, Backfillable.class);
        if (HintUtils.hasType(hint, Cached.class) && !HintUtils.hasType(hint, ApplyScopeData.class)) {
            z4 = true;
        }
        if (sentryEvent2 != null && !hasType && !z4 && (sentryEvent2.isErrored() || sentryEvent2.isCrashed())) {
            this.options.getReplayController().captureReplay(Boolean.valueOf(sentryEvent2.isCrashed()));
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(sentryEvent2, sentryEvent2 != null ? getAttachments(hint) : null, updateSessionData, getTraceContext(iScope, hint, sentryEvent2), null);
            hint.clear();
            if (buildEnvelope != null) {
                sentryId = sendEnvelope(buildEnvelope, hint);
            }
        } catch (SentryEnvelopeException e7) {
            e = e7;
            this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing event %s failed.", sentryId);
            sentryId = SentryId.EMPTY_ID;
            if (iScope != null) {
            }
            return sentryId;
        } catch (IOException e8) {
            e = e8;
            this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing event %s failed.", sentryId);
            sentryId = SentryId.EMPTY_ID;
            if (iScope != null) {
            }
            return sentryId;
        }
        if (iScope != null) {
            finalizeTransaction(iScope, hint);
        }
        return sentryId;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureFeedback(Feedback feedback, Hint hint, IScope iScope) {
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.getContexts().setFeedback(feedback);
        if (hint == null) {
            hint = new Hint();
        }
        if (feedback.getUrl() == null) {
            feedback.setUrl(iScope.getScreen());
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing feedback: %s", sentryEvent.getEventId());
        if (shouldApplyScopeData(sentryEvent, hint) && (sentryEvent = applyFeedbackScope(sentryEvent, iScope, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Feedback was dropped by applyScope", new Object[0]);
            return SentryId.EMPTY_ID;
        }
        SentryEvent processFeedbackEvent = processFeedbackEvent(sentryEvent, hint, this.options.getEventProcessors());
        if (processFeedbackEvent != null && (processFeedbackEvent = executeBeforeSendFeedback(processFeedbackEvent, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSend", new Object[0]);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Feedback);
        }
        SentryEvent sentryEvent2 = processFeedbackEvent;
        if (sentryEvent2 == null) {
            return SentryId.EMPTY_ID;
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryEvent2.getEventId() != null ? sentryEvent2.getEventId() : sentryId;
        if (feedback.getReplayId() == null) {
            this.options.getReplayController().captureReplay(Boolean.FALSE);
            SentryId replayId = iScope.getReplayId();
            if (!replayId.equals(sentryId)) {
                feedback.setReplayId(replayId);
            }
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(sentryEvent2, getAttachments(hint), null, getTraceContext(iScope, hint, sentryEvent2), null);
            hint.clear();
            return buildEnvelope != null ? sendEnvelope(buildEnvelope, hint) : eventId;
        } catch (SentryEnvelopeException | IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing feedback %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureLog(SentryLogEvent sentryLogEvent, IScope iScope) {
        if (sentryLogEvent == null || iScope == null || (sentryLogEvent = processLogEvent(sentryLogEvent, iScope.getEventProcessors())) != null) {
            if ((sentryLogEvent == null || (sentryLogEvent = processLogEvent(sentryLogEvent, this.options.getEventProcessors())) != null) && sentryLogEvent != null) {
                SentryLogEvent executeBeforeSendLog = executeBeforeSendLog(sentryLogEvent);
                if (executeBeforeSendLog != null) {
                    this.loggerBatchProcessor.add(executeBeforeSendLog);
                } else {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Log Event was dropped by beforeSendLog", new Object[0]);
                    this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.LogItem);
                }
            }
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureProfileChunk(ProfileChunk profileChunk, IScope iScope) {
        Objects.requireNonNull(profileChunk, "profileChunk is required.");
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing profile chunk: %s", profileChunk.getChunkId());
        SentryId chunkId = profileChunk.getChunkId();
        DebugMeta buildDebugMeta = DebugMeta.buildDebugMeta(profileChunk.getDebugMeta(), this.options);
        if (buildDebugMeta != null) {
            profileChunk.setDebugMeta(buildDebugMeta);
        }
        try {
            return sendEnvelope(new SentryEnvelope(new SentryEnvelopeHeader(chunkId, this.options.getSdkVersion(), null), Collections.singletonList(SentryEnvelopeItem.fromProfileChunk(profileChunk, this.options.getSerializer()))), null);
        } catch (SentryEnvelopeException | IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing profile chunk %s failed.", chunkId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureReplayEvent(SentryReplayEvent sentryReplayEvent, IScope iScope, Hint hint) {
        Objects.requireNonNull(sentryReplayEvent, "SessionReplay is required.");
        if (hint == null) {
            hint = new Hint();
        }
        if (shouldApplyScopeData(sentryReplayEvent, hint)) {
            applyScope(sentryReplayEvent, iScope);
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing session replay: %s", sentryReplayEvent.getEventId());
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryReplayEvent.getEventId() != null ? sentryReplayEvent.getEventId() : sentryId;
        SentryReplayEvent processReplayEvent = processReplayEvent(sentryReplayEvent, hint, this.options.getEventProcessors());
        if (processReplayEvent != null && (processReplayEvent = executeBeforeSendReplay(processReplayEvent, hint)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSendReplay", new Object[0]);
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Replay);
        }
        if (processReplayEvent == null) {
            return sentryId;
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(processReplayEvent, hint.getReplayRecording(), getTraceContext(iScope, hint, processReplayEvent, null), HintUtils.hasType(hint, Backfillable.class));
            hint.clear();
            this.transport.send(buildEnvelope, hint);
            return eventId;
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing event %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureSession(Session session, Hint hint) {
        Objects.requireNonNull(session, "Session is required.");
        if (session.getRelease() == null || session.getRelease().isEmpty()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            captureEnvelope(SentryEnvelope.from(this.options.getSerializer(), session, this.options.getSdkVersion()), hint);
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture session.", e7);
        }
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, IScope iScope, Hint hint, ProfilingTraceData profilingTraceData) {
        SentryTransaction sentryTransaction2;
        Objects.requireNonNull(sentryTransaction, "Transaction is required.");
        Hint hint2 = hint == null ? new Hint() : hint;
        if (shouldApplyScopeData(sentryTransaction, hint2)) {
            addScopeAttachmentsToHint(iScope, hint2);
        }
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing transaction: %s", sentryTransaction.getEventId());
        if (TracingUtils.isIgnored(this.options.getIgnoredTransactions(), sentryTransaction.getTransaction())) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped as transaction name %s is ignored", sentryTransaction.getTransaction());
            IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
            clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            return SentryId.EMPTY_ID;
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        SentryId eventId = sentryTransaction.getEventId() != null ? sentryTransaction.getEventId() : sentryId;
        if (shouldApplyScopeData(sentryTransaction, hint2)) {
            sentryTransaction2 = (SentryTransaction) applyScope((SentryClient) sentryTransaction, iScope);
            if (sentryTransaction2 != null && iScope != null) {
                sentryTransaction2 = processTransaction(sentryTransaction2, hint2, iScope.getEventProcessors());
            }
            if (sentryTransaction2 == null) {
                this.options.getLogger().log(sentryLevel, "Transaction was dropped by applyScope", new Object[0]);
            }
        } else {
            sentryTransaction2 = sentryTransaction;
        }
        if (sentryTransaction2 != null) {
            sentryTransaction2 = processTransaction(sentryTransaction2, hint2, this.options.getEventProcessors());
        }
        if (sentryTransaction2 == null) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped by Event processors.", new Object[0]);
            return sentryId;
        }
        int size = sentryTransaction2.getSpans().size();
        SentryTransaction executeBeforeSendTransaction = executeBeforeSendTransaction(sentryTransaction2, hint2);
        int size2 = executeBeforeSendTransaction == null ? 0 : executeBeforeSendTransaction.getSpans().size();
        if (executeBeforeSendTransaction == null) {
            this.options.getLogger().log(sentryLevel, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            IClientReportRecorder clientReportRecorder2 = this.options.getClientReportRecorder();
            DiscardReason discardReason2 = DiscardReason.BEFORE_SEND;
            clientReportRecorder2.recordLostEvent(discardReason2, DataCategory.Transaction);
            this.options.getClientReportRecorder().recordLostEvent(discardReason2, DataCategory.Span, size + 1);
            return sentryId;
        }
        if (size2 < size) {
            int i7 = size - size2;
            this.options.getLogger().log(sentryLevel, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i7));
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.BEFORE_SEND, DataCategory.Span, i7);
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(executeBeforeSendTransaction, filterForTransaction(getAttachments(hint2)), null, traceContext, profilingTraceData);
            hint2.clear();
            return buildEnvelope != null ? sendEnvelope(buildEnvelope, hint2) : eventId;
        } catch (SentryEnvelopeException | IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing transaction %s failed.", eventId);
            return SentryId.EMPTY_ID;
        }
    }

    @Override // io.sentry.ISentryClient
    public void captureUserFeedback(UserFeedback userFeedback) {
        Objects.requireNonNull(userFeedback, "SentryEvent is required.");
        if (SentryId.EMPTY_ID.equals(userFeedback.getEventId())) {
            this.options.getLogger().log(SentryLevel.WARNING, "Capturing userFeedback without a Sentry Id.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing userFeedback: %s", userFeedback.getEventId());
        try {
            sendEnvelope(buildEnvelope(userFeedback), null);
        } catch (IOException e7) {
            this.options.getLogger().log(SentryLevel.WARNING, e7, "Capturing user feedback %s failed.", userFeedback.getEventId());
        }
    }

    @Override // io.sentry.ISentryClient
    public void close() {
        close(false);
    }

    @Override // io.sentry.ISentryClient
    public void flush(long j) {
        this.loggerBatchProcessor.flush(j);
        this.transport.flush(j);
    }

    @Override // io.sentry.ISentryClient
    public RateLimiter getRateLimiter() {
        return this.transport.getRateLimiter();
    }

    @Override // io.sentry.ISentryClient
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override // io.sentry.ISentryClient
    public boolean isHealthy() {
        return this.transport.isHealthy();
    }

    public Session updateSessionData(SentryEvent sentryEvent, Hint hint, IScope iScope) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            if (iScope != null) {
                return iScope.withSession(new m(this, sentryEvent, hint));
            }
            this.options.getLogger().log(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    private TraceContext getTraceContext(IScope iScope, Hint hint, SentryBaseEvent sentryBaseEvent, String str) {
        if (HintUtils.hasType(hint, Backfillable.class)) {
            if (sentryBaseEvent != null) {
                return Baggage.fromEvent(sentryBaseEvent, str, this.options).toTraceContext();
            }
        } else if (iScope != null) {
            ITransaction transaction = iScope.getTransaction();
            return transaction != null ? transaction.traceContext() : TracingUtils.maybeUpdateBaggage(iScope, this.options).traceContext();
        }
        return null;
    }

    @Override // io.sentry.ISentryClient
    public void close(boolean z4) {
        long shutdownTimeoutMillis;
        this.options.getLogger().log(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        if (z4) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.options.getShutdownTimeoutMillis();
            } catch (IOException e7) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e7);
            }
        }
        flush(shutdownTimeoutMillis);
        this.loggerBatchProcessor.close(z4);
        this.transport.close(z4);
        for (EventProcessor eventProcessor : this.options.getEventProcessors()) {
            if (eventProcessor instanceof Closeable) {
                try {
                    ((Closeable) eventProcessor).close();
                } catch (IOException e8) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the event processor {}.", eventProcessor, e8);
                }
            }
        }
        this.enabled = false;
    }

    private boolean shouldApplyScopeData(CheckIn checkIn, Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Check-in was cached so not applying scope: %s", checkIn.getCheckInId());
        return false;
    }

    private CheckIn applyScope(CheckIn checkIn, IScope iScope) {
        if (iScope != null) {
            ISpan span = iScope.getSpan();
            if (checkIn.getContexts().getTrace() == null) {
                if (span == null) {
                    checkIn.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
                } else {
                    checkIn.getContexts().setTrace(span.getSpanContext());
                }
            }
        }
        return checkIn;
    }

    private SentryReplayEvent applyScope(SentryReplayEvent sentryReplayEvent, IScope iScope) {
        if (iScope != null) {
            if (sentryReplayEvent.getRequest() == null) {
                sentryReplayEvent.setRequest(iScope.getRequest());
            }
            if (sentryReplayEvent.getUser() == null) {
                sentryReplayEvent.setUser(iScope.getUser());
            }
            if (sentryReplayEvent.getTags() == null) {
                sentryReplayEvent.setTags(new HashMap(iScope.getTags()));
            } else {
                for (Map.Entry<String, String> entry : iScope.getTags().entrySet()) {
                    if (!sentryReplayEvent.getTags().containsKey(entry.getKey())) {
                        sentryReplayEvent.getTags().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            Contexts contexts = sentryReplayEvent.getContexts();
            for (Map.Entry<String, Object> entry2 : new Contexts(iScope.getContexts()).entrySet()) {
                if (!contexts.containsKey(entry2.getKey())) {
                    contexts.put(entry2.getKey(), entry2.getValue());
                }
            }
            ISpan span = iScope.getSpan();
            if (sentryReplayEvent.getContexts().getTrace() == null) {
                if (span == null) {
                    sentryReplayEvent.getContexts().setTrace(TransactionContext.fromPropagationContext(iScope.getPropagationContext()));
                } else {
                    sentryReplayEvent.getContexts().setTrace(span.getSpanContext());
                }
            }
        }
        return sentryReplayEvent;
    }

    private SentryEnvelope buildEnvelope(UserFeedback userFeedback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromUserFeedback(this.options.getSerializer(), userFeedback));
        return new SentryEnvelope(new SentryEnvelopeHeader(userFeedback.getEventId(), this.options.getSdkVersion()), arrayList);
    }

    private SentryEnvelope buildEnvelope(CheckIn checkIn, TraceContext traceContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromCheckIn(this.options.getSerializer(), checkIn));
        return new SentryEnvelope(new SentryEnvelopeHeader(checkIn.getCheckInId(), this.options.getSdkVersion(), traceContext), arrayList);
    }

    private <T extends SentryBaseEvent> T applyScope(T t7, IScope iScope) {
        if (iScope != null) {
            if (t7.getRequest() == null) {
                t7.setRequest(iScope.getRequest());
            }
            if (t7.getUser() == null) {
                t7.setUser(iScope.getUser());
            }
            if (t7.getTags() == null) {
                t7.setTags(new HashMap(iScope.getTags()));
            } else {
                for (Map.Entry<String, String> entry : iScope.getTags().entrySet()) {
                    if (!t7.getTags().containsKey(entry.getKey())) {
                        t7.getTags().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t7.getBreadcrumbs() == null) {
                t7.setBreadcrumbs(new ArrayList(iScope.getBreadcrumbs()));
            } else {
                sortBreadcrumbsByDate(t7, iScope.getBreadcrumbs());
            }
            if (t7.getExtras() == null) {
                t7.setExtras(new HashMap(iScope.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : iScope.getExtras().entrySet()) {
                    if (!t7.getExtras().containsKey(entry2.getKey())) {
                        t7.getExtras().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Contexts contexts = t7.getContexts();
            for (Map.Entry<String, Object> entry3 : new Contexts(iScope.getContexts()).entrySet()) {
                if (!contexts.containsKey(entry3.getKey())) {
                    contexts.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t7;
    }

    private SentryEnvelope buildEnvelope(SentryLogEvents sentryLogEvents) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromLogs(this.options.getSerializer(), sentryLogEvents));
        return new SentryEnvelope(new SentryEnvelopeHeader(null, this.options.getSdkVersion(), null), arrayList);
    }

    private SentryEnvelope buildEnvelope(SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, TraceContext traceContext, boolean z4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromReplay(this.options.getSerializer(), this.options.getLogger(), sentryReplayEvent, replayRecording, z4));
        return new SentryEnvelope(new SentryEnvelopeHeader(sentryReplayEvent.getEventId(), this.options.getSessionReplay().getSdkVersion(), traceContext), arrayList);
    }
}
