package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.DateUtils;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ClientReportRecorder implements IClientReportRecorder {
    private final SentryOptions options;
    private final IClientReportStorage storage = new AtomicClientReportStorage();

    public ClientReportRecorder(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private DataCategory categoryFromItemType(SentryItemType sentryItemType) {
        return SentryItemType.Event.equals(sentryItemType) ? DataCategory.Error : SentryItemType.Session.equals(sentryItemType) ? DataCategory.Session : SentryItemType.Transaction.equals(sentryItemType) ? DataCategory.Transaction : SentryItemType.UserFeedback.equals(sentryItemType) ? DataCategory.UserReport : SentryItemType.Feedback.equals(sentryItemType) ? DataCategory.Feedback : SentryItemType.Profile.equals(sentryItemType) ? DataCategory.Profile : SentryItemType.ProfileChunk.equals(sentryItemType) ? DataCategory.ProfileChunkUi : SentryItemType.Attachment.equals(sentryItemType) ? DataCategory.Attachment : SentryItemType.CheckIn.equals(sentryItemType) ? DataCategory.Monitor : SentryItemType.ReplayVideo.equals(sentryItemType) ? DataCategory.Replay : SentryItemType.Log.equals(sentryItemType) ? DataCategory.LogItem : DataCategory.Default;
    }

    private void recordLostEventInternal(String str, String str2, Long l7) {
        this.storage.addCount(new ClientReportKey(str, str2), l7);
    }

    private void restoreCountsFromClientReport(ClientReport clientReport) {
        if (clientReport == null) {
            return;
        }
        for (DiscardedEvent discardedEvent : clientReport.getDiscardedEvents()) {
            recordLostEventInternal(discardedEvent.getReason(), discardedEvent.getCategory(), discardedEvent.getQuantity());
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public SentryEnvelope attachReportToEnvelope(SentryEnvelope sentryEnvelope) {
        ClientReport resetCountsAndGenerateClientReport = resetCountsAndGenerateClientReport();
        if (resetCountsAndGenerateClientReport == null) {
            return sentryEnvelope;
        }
        try {
            this.options.getLogger().log(SentryLevel.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<SentryEnvelopeItem> it = sentryEnvelope.getItems().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(SentryEnvelopeItem.fromClientReport(this.options.getSerializer(), resetCountsAndGenerateClientReport));
            return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return sentryEnvelope;
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEnvelope(DiscardReason discardReason, SentryEnvelope sentryEnvelope) {
        if (sentryEnvelope == null) {
            return;
        }
        try {
            Iterator<SentryEnvelopeItem> it = sentryEnvelope.getItems().iterator();
            while (it.hasNext()) {
                recordLostEnvelopeItem(discardReason, it.next());
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEnvelopeItem(DiscardReason discardReason, SentryEnvelopeItem sentryEnvelopeItem) {
        SentryTransaction transaction;
        if (sentryEnvelopeItem == null) {
            return;
        }
        try {
            SentryItemType type = sentryEnvelopeItem.getHeader().getType();
            if (SentryItemType.ClientReport.equals(type)) {
                try {
                    restoreCountsFromClientReport(sentryEnvelopeItem.getClientReport(this.options.getSerializer()));
                } catch (Exception unused) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                DataCategory categoryFromItemType = categoryFromItemType(type);
                if (categoryFromItemType.equals(DataCategory.Transaction) && (transaction = sentryEnvelopeItem.getTransaction(this.options.getSerializer())) != null) {
                    recordLostEventInternal(discardReason.getReason(), DataCategory.Span.getCategory(), Long.valueOf(transaction.getSpans().size() + 1));
                }
                recordLostEventInternal(discardReason.getReason(), categoryFromItemType.getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory) {
        recordLostEvent(discardReason, dataCategory, 1L);
    }

    public ClientReport resetCountsAndGenerateClientReport() {
        Date currentDateTime = DateUtils.getCurrentDateTime();
        List<DiscardedEvent> resetCountsAndGet = this.storage.resetCountsAndGet();
        if (resetCountsAndGet.isEmpty()) {
            return null;
        }
        return new ClientReport(currentDateTime, resetCountsAndGet);
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory, long j) {
        try {
            recordLostEventInternal(discardReason.getReason(), dataCategory.getCategory(), Long.valueOf(j));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }
}
