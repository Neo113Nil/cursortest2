package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u0004\u0018\u00010&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u00020\u00122\n\u0010+\u001a\u00060.j\u0002`/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00107R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010;R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010B"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "Lcom/datadog/android/sessionreplay/internal/async/DataQueueHandler;", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedDataProcessor;", "processor", "Lcom/datadog/android/sessionreplay/internal/processor/RumContextDataHandler;", "rumContextDataHandler", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/Queue;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueItem;", "recordedDataQueue", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "", "telemetrySampleRate", "Lcom/datadog/android/core/sampling/RateBasedSampler;", "", "sampler", "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/RecordedDataProcessor;Lcom/datadog/android/sessionreplay/internal/processor/RumContextDataHandler;Lcom/datadog/android/api/InternalLogger;Ljava/util/concurrent/ExecutorService;Ljava/util/Queue;Lcom/datadog/android/internal/time/TimeProvider;FLcom/datadog/android/core/sampling/RateBasedSampler;)V", "", "identifier", "", "resourceData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "addResourceItem", "(Ljava/lang/String;[BLjava/lang/String;)Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "systemInformation", "Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "addSnapshotItem", "(Lcom/datadog/android/sessionreplay/recorder/SystemInformation;)Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "pointerInteractions", "Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "addTouchEventItem", "(Ljava/util/List;)Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "clearAndStopProcessingQueue", "()V", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueItem;)V", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Exception;)V", "tryToConsumeItems", "getHighSpeedVideoSizes", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedDataProcessor;", "Ljava/util/Queue;", "getRecordedDataQueue$dd_sdk_android_session_replay_release", "()Ljava/util/Queue;", "Lcom/datadog/android/sessionreplay/internal/processor/RumContextDataHandler;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/sampling/RateBasedSampler;", "getInputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getOutputFormats", "getInputFormats", "Lcom/datadog/android/internal/time/TimeProvider;", "getOutputMinFrameDuration", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecordedDataQueueHandler implements com.datadog.android.sessionreplay.internal.async.DataQueueHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.Companion(null);
    public static final java.lang.String FAILED_TO_ADD_RECORDS_TO_QUEUE_ERROR_MESSAGE = "SR RecordedDataQueueHandler: failed to add records into the queue";
    public static final java.lang.String ITEM_DROPPED_EXPIRED_MESSAGE = "SR RecordedDataQueueHandler: dropped item from the queue. age=%d ns";
    public static final java.lang.String ITEM_DROPPED_INVALID_MESSAGE = "SR RecordedDataQueueHandler: dropped item from the queue. isValid=false, type=%s";
    public static final long MAX_DELAY_NS = 1000000000;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.sampling.RateBasedSampler<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.ExecutorService getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getOutputFormats;
    private final java.util.Queue<com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem> recordedDataQueue;

    public RecordedDataQueueHandler(com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor recordedDataProcessor, com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler rumContextDataHandler, com.datadog.android.api.InternalLogger internalLogger, java.util.concurrent.ExecutorService executorService, java.util.Queue<com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem> queue, com.datadog.android.internal.time.TimeProvider timeProvider, float f, com.datadog.android.core.sampling.RateBasedSampler<kotlin.Unit> rateBasedSampler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextDataHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rateBasedSampler, "");
        this.getHighResolutionOutputSizeshNQ4ISI = recordedDataProcessor;
        this.Camera2StreamConfigurationMap = rumContextDataHandler;
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.getHighSpeedVideoSizes = executorService;
        this.recordedDataQueue = queue;
        this.getOutputMinFrameDuration = timeProvider;
        this.getOutputFormats = f;
        this.getHighSpeedVideoFpsRangesFor = rateBasedSampler;
    }

    public final java.util.Queue<com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem> getRecordedDataQueue$dd_sdk_android_session_replay_release() {
        return this.recordedDataQueue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RecordedDataQueueHandler(com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor recordedDataProcessor, com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler rumContextDataHandler, com.datadog.android.api.InternalLogger internalLogger, java.util.concurrent.ExecutorService executorService, java.util.Queue queue, com.datadog.android.internal.time.TimeProvider timeProvider, float f, com.datadog.android.core.sampling.RateBasedSampler rateBasedSampler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(recordedDataProcessor, rumContextDataHandler, internalLogger, executorService, queue, timeProvider, r9, (i & 128) != 0 ? new com.datadog.android.core.sampling.RateBasedSampler(r9) : rateBasedSampler);
        float f2 = (i & 64) != 0 ? 1.0f : f;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.DataQueueHandler
    public final void clearAndStopProcessingQueue() {
        synchronized (this) {
            this.recordedDataQueue.clear();
            this.getHighSpeedVideoSizes.shutdown();
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.async.DataQueueHandler
    public final com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem addResourceItem(java.lang.String identifier, byte[] resourceData, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceData, "");
        com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext createRumContextData$dd_sdk_android_session_replay_release = this.Camera2StreamConfigurationMap.createRumContextData$dd_sdk_android_session_replay_release();
        if (createRumContextData$dd_sdk_android_session_replay_release == null) {
            return null;
        }
        com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem resourceRecordedDataQueueItem = new com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem(createRumContextData$dd_sdk_android_session_replay_release, identifier, resourceData, this.getOutputMinFrameDuration.getDeviceElapsedTimeNanos(), mimeType);
        getHighSpeedVideoFpsRanges(resourceRecordedDataQueueItem);
        return resourceRecordedDataQueueItem;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.DataQueueHandler
    public final com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem addTouchEventItem(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> pointerInteractions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInteractions, "");
        com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext createRumContextData$dd_sdk_android_session_replay_release = this.Camera2StreamConfigurationMap.createRumContextData$dd_sdk_android_session_replay_release();
        if (createRumContextData$dd_sdk_android_session_replay_release == null) {
            return null;
        }
        com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem touchEventRecordedDataQueueItem = new com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem(createRumContextData$dd_sdk_android_session_replay_release, this.getOutputMinFrameDuration.getDeviceElapsedTimeNanos(), pointerInteractions);
        getHighSpeedVideoFpsRanges(touchEventRecordedDataQueueItem);
        return touchEventRecordedDataQueueItem;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.DataQueueHandler
    public final com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem addSnapshotItem(com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInformation, "");
        com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext createRumContextData$dd_sdk_android_session_replay_release = this.Camera2StreamConfigurationMap.createRumContextData$dd_sdk_android_session_replay_release();
        if (createRumContextData$dd_sdk_android_session_replay_release == null) {
            return null;
        }
        com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem snapshotRecordedDataQueueItem = new com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem(createRumContextData$dd_sdk_android_session_replay_release, systemInformation, this.getOutputMinFrameDuration.getDeviceElapsedTimeNanos());
        getHighSpeedVideoFpsRanges(snapshotRecordedDataQueueItem);
        return snapshotRecordedDataQueueItem;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.DataQueueHandler
    public final void tryToConsumeItems() {
        if (this.recordedDataQueue.isEmpty()) {
            return;
        }
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoSizes, "Recorded Data queue processing", this.getHighSpeedVideoFpsRanges, new java.lang.Runnable() { // from class: com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.$r8$lambda$UqEmK1wWbn_GM7tqZcbKwh5IeqY(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.this);
            }
        });
    }

    private final void getHighSpeedVideoFpsRanges(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem p0) {
        try {
            this.recordedDataQueue.offer(p0);
        } catch (java.lang.ClassCastException e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
        } catch (java.lang.IllegalArgumentException e2) {
            getHighResolutionOutputSizeshNQ4ISI(e2);
        } catch (java.lang.NullPointerException e3) {
            getHighResolutionOutputSizeshNQ4ISI(e3);
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Exception p0) {
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler$logAddToQueueException$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.FAILED_TO_ADD_RECORDS_TO_QUEUE_ERROR_MESSAGE;
            }
        }, (java.lang.Throwable) p0, false, (java.util.Map) null, 48, (java.lang.Object) null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\b\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\f\n\u0004\b\t\u0010\u0006\u0012\u0004\b\n\u0010\u0003R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler$Companion;", "", "<init>", "()V", "", "FAILED_TO_ADD_RECORDS_TO_QUEUE_ERROR_MESSAGE", "Ljava/lang/String;", "ITEM_DROPPED_EXPIRED_MESSAGE", "getITEM_DROPPED_EXPIRED_MESSAGE$dd_sdk_android_session_replay_release$annotations", "ITEM_DROPPED_INVALID_MESSAGE", "getITEM_DROPPED_INVALID_MESSAGE$dd_sdk_android_session_replay_release$annotations", "", "MAX_DELAY_NS", "J", "getMAX_DELAY_NS$dd_sdk_android_session_replay_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getITEM_DROPPED_EXPIRED_MESSAGE$dd_sdk_android_session_replay_release$annotations() {
        }

        public static /* synthetic */ void getITEM_DROPPED_INVALID_MESSAGE$dd_sdk_android_session_replay_release$annotations() {
        }

        public static /* synthetic */ void getMAX_DELAY_NS$dd_sdk_android_session_replay_release$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$UqEmK1wWbn_GM7tqZcbKwh5IeqY(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler) {
        synchronized (recordedDataQueueHandler) {
            while (!recordedDataQueueHandler.recordedDataQueue.isEmpty()) {
                final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem peek = recordedDataQueueHandler.recordedDataQueue.peek();
                if (peek != null) {
                    final long deviceElapsedTimeNanos = recordedDataQueueHandler.getOutputMinFrameDuration.getDeviceElapsedTimeNanos() - peek.getCreationTimestampInNs();
                    if (!peek.isValid$dd_sdk_android_session_replay_release()) {
                        if (recordedDataQueueHandler.getHighSpeedVideoFpsRangesFor.sample(kotlin.Unit.INSTANCE)) {
                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(recordedDataQueueHandler.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler$logInvalidQueueItemException$1
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                                public final java.lang.String invoke() {
                                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.ITEM_DROPPED_INVALID_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem.this.getClass().getSimpleName()}, 1));
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                    return format;
                                }

                                {
                                    super(0);
                                }
                            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        }
                        recordedDataQueueHandler.recordedDataQueue.poll();
                    } else if (deviceElapsedTimeNanos > 1000000000) {
                        if (recordedDataQueueHandler.getHighSpeedVideoFpsRangesFor.sample(kotlin.Unit.INSTANCE)) {
                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(recordedDataQueueHandler.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler$logExpiredItemException$1
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                public final java.lang.String invoke() {
                                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler.ITEM_DROPPED_EXPIRED_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(deviceElapsedTimeNanos)}, 1));
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                                    return format;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                        }
                        recordedDataQueueHandler.recordedDataQueue.poll();
                    } else {
                        if (!peek.isReady$dd_sdk_android_session_replay_release()) {
                            break;
                        }
                        com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem poll = recordedDataQueueHandler.recordedDataQueue.poll();
                        if (poll instanceof com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem) {
                            recordedDataQueueHandler.getHighResolutionOutputSizeshNQ4ISI.processScreenSnapshots((com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem) poll);
                        } else if (poll instanceof com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem) {
                            recordedDataQueueHandler.getHighResolutionOutputSizeshNQ4ISI.processTouchEventsRecords((com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem) poll);
                        } else if (poll instanceof com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem) {
                            recordedDataQueueHandler.getHighResolutionOutputSizeshNQ4ISI.processResources((com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem) poll);
                        }
                    }
                }
            }
        }
    }
}
