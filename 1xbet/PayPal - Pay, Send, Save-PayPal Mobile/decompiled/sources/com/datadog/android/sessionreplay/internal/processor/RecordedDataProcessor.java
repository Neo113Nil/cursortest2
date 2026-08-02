package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010(R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u00102\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/RecordedDataProcessor;", "Lcom/datadog/android/sessionreplay/internal/processor/Processor;", "Lcom/datadog/android/sessionreplay/internal/resources/ResourceDataStoreManager;", "resourceDataStoreManager", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "resourcesWriter", "Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "writer", "Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver;", "mutationResolver", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/sessionreplay/internal/processor/NodeFlattener;", "nodeFlattener", "<init>", "(Lcom/datadog/android/sessionreplay/internal/resources/ResourceDataStoreManager;Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver;Lcom/datadog/android/internal/time/TimeProvider;Lcom/datadog/android/sessionreplay/internal/processor/NodeFlattener;)V", "Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;", "item", "", "processResources", "(Lcom/datadog/android/sessionreplay/internal/async/ResourceRecordedDataQueueItem;)V", "Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "processScreenSnapshots", "(Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;)V", "Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "processTouchEventsRecords", "(Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/internal/processor/MutationResolver;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/processor/NodeFlattener;", "Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "Ljava/util/List;", "", "getOutputMinFrameDuration", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizesFor", "getInputFormats", "Lcom/datadog/android/sessionreplay/internal/resources/ResourceDataStoreManager;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "Lcom/datadog/android/internal/time/TimeProvider;", "getOutputFormats", "Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecordedDataProcessor implements com.datadog.android.sessionreplay.internal.processor.Processor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor.Companion(null);
    private static final long FULL_SNAPSHOT_INTERVAL_IN_NS = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(3000);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.processor.MutationResolver getHighSpeedVideoSizes;
    private long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.processor.NodeFlattener Camera2StreamConfigurationMap;
    private com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.storage.ResourcesWriter getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.storage.RecordWriter getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    public RecordedDataProcessor(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager, com.datadog.android.sessionreplay.internal.storage.ResourcesWriter resourcesWriter, com.datadog.android.sessionreplay.internal.storage.RecordWriter recordWriter, com.datadog.android.sessionreplay.internal.processor.MutationResolver mutationResolver, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.sessionreplay.internal.processor.NodeFlattener nodeFlattener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceDataStoreManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourcesWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutationResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nodeFlattener, "");
        this.getInputSizeshNQ4ISI = resourceDataStoreManager;
        this.getInputFormats = resourcesWriter;
        this.getOutputMinFrameDuration = recordWriter;
        this.getHighSpeedVideoSizes = mutationResolver;
        this.getOutputFormats = timeProvider;
        this.Camera2StreamConfigurationMap = nodeFlattener;
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
        this.getHighSpeedVideoFpsRangesFor = new com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext(null, null, null, 0L, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RecordedDataProcessor(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager, com.datadog.android.sessionreplay.internal.storage.ResourcesWriter resourcesWriter, com.datadog.android.sessionreplay.internal.storage.RecordWriter recordWriter, com.datadog.android.sessionreplay.internal.processor.MutationResolver mutationResolver, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.sessionreplay.internal.processor.NodeFlattener nodeFlattener, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(resourceDataStoreManager, resourcesWriter, recordWriter, mutationResolver, timeProvider, nodeFlattener);
        if ((i & 32) != 0) {
            nodeFlattener = new com.datadog.android.sessionreplay.internal.processor.NodeFlattener(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.processor.Processor
    public final void processResources(com.datadog.android.sessionreplay.internal.async.ResourceRecordedDataQueueItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String identifier = item.getIdentifier();
        if (this.getInputSizeshNQ4ISI.isPreviouslySentResource$dd_sdk_android_session_replay_release(identifier)) {
            return;
        }
        if (this.getInputSizeshNQ4ISI.isReady$dd_sdk_android_session_replay_release()) {
            this.getInputSizeshNQ4ISI.cacheResourceHash$dd_sdk_android_session_replay_release(identifier);
        }
        this.getInputFormats.write(new com.datadog.android.sessionreplay.internal.processor.EnrichedResource(item.getResourceData(), identifier, item.getMimeType()));
    }

    @Override // com.datadog.android.sessionreplay.internal.processor.Processor
    public final void processScreenSnapshots(com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem item) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext newRumContext$dd_sdk_android_session_replay_release = item.getRecordedQueuedItemContext().getNewRumContext$dd_sdk_android_session_replay_release();
        long timestamp$dd_sdk_android_session_replay_release = item.getRecordedQueuedItemContext().getTimestamp$dd_sdk_android_session_replay_release();
        java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> nodes$dd_sdk_android_session_replay_release = item.getNodes$dd_sdk_android_session_replay_release();
        com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation = item.getSystemInformation();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = nodes$dd_sdk_android_session_replay_release.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, this.Camera2StreamConfigurationMap.flattenNode$dd_sdk_android_session_replay_release((com.datadog.android.sessionreplay.internal.recorder.Node) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean z2 = (kotlin.jvm.internal.Intrinsics.areEqual(newRumContext$dd_sdk_android_session_replay_release.getApplicationId(), this.getHighSpeedVideoFpsRangesFor.getApplicationId()) && kotlin.jvm.internal.Intrinsics.areEqual(newRumContext$dd_sdk_android_session_replay_release.getSessionId(), this.getHighSpeedVideoFpsRangesFor.getSessionId()) && kotlin.jvm.internal.Intrinsics.areEqual(newRumContext$dd_sdk_android_session_replay_release.getViewId(), this.getHighSpeedVideoFpsRangesFor.getViewId())) ? false : true;
            if (this.getOutputFormats.getDeviceElapsedTimeNanos() - this.getHighResolutionOutputSizeshNQ4ISI >= FULL_SNAPSHOT_INTERVAL_IN_NS) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getOutputFormats.getDeviceElapsedTimeNanos();
                z = true;
            } else {
                z = false;
            }
            boolean z3 = systemInformation.getScreenOrientation() != this.getHighSpeedVideoSizesFor;
            boolean z4 = z2 || z || z3;
            if (z2) {
                if (this.getHighSpeedVideoFpsRangesFor.isValid$dd_sdk_android_session_replay_release()) {
                    com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord viewEndRecord = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.ViewEndRecord(timestamp$dd_sdk_android_session_replay_release, null, 2, null);
                    com.datadog.android.sessionreplay.internal.storage.RecordWriter recordWriter = this.getOutputMinFrameDuration;
                    com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext = this.getHighSpeedVideoFpsRangesFor;
                    recordWriter.write(new com.datadog.android.sessionreplay.internal.processor.EnrichedRecord(sessionReplayRumContext.getApplicationId(), sessionReplayRumContext.getSessionId(), sessionReplayRumContext.getViewId(), kotlin.collections.CollectionsKt.listOf(viewEndRecord)));
                }
                com.datadog.android.sessionreplay.utils.GlobalBounds screenBounds = systemInformation.getScreenBounds();
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord metaRecord = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MetaRecord(timestamp$dd_sdk_android_session_replay_release, null, new com.datadog.android.sessionreplay.model.MobileSegment.Data1(screenBounds.getWidth(), screenBounds.getHeight(), null, 4, null), 2, null);
                com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord focusRecord = new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.FocusRecord(timestamp$dd_sdk_android_session_replay_release, null, new com.datadog.android.sessionreplay.model.MobileSegment.Data2(true), 2, null);
                linkedList.add(metaRecord);
                linkedList.add(focusRecord);
            }
            if (z3) {
                com.datadog.android.sessionreplay.utils.GlobalBounds screenBounds2 = systemInformation.getScreenBounds();
                linkedList.add(new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord(timestamp$dd_sdk_android_session_replay_release, new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.ViewportResizeData(screenBounds2.getWidth(), screenBounds2.getHeight())));
            }
            if (z4) {
                linkedList.add(new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileFullSnapshotRecord(timestamp$dd_sdk_android_session_replay_release, new com.datadog.android.sessionreplay.model.MobileSegment.Data(arrayList2)));
            } else {
                com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.MobileMutationData resolveMutations$dd_sdk_android_session_replay_release = this.getHighSpeedVideoSizes.resolveMutations$dd_sdk_android_session_replay_release(this.getHighSpeedVideoFpsRanges, arrayList2);
                if (resolveMutations$dd_sdk_android_session_replay_release != null) {
                    linkedList.add(new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord(timestamp$dd_sdk_android_session_replay_release, resolveMutations$dd_sdk_android_session_replay_release));
                }
            }
            this.getHighSpeedVideoFpsRanges = arrayList2;
            this.getHighSpeedVideoSizesFor = systemInformation.getScreenOrientation();
            if (!linkedList.isEmpty()) {
                this.getOutputMinFrameDuration.write(new com.datadog.android.sessionreplay.internal.processor.EnrichedRecord(newRumContext$dd_sdk_android_session_replay_release.getApplicationId(), newRumContext$dd_sdk_android_session_replay_release.getSessionId(), newRumContext$dd_sdk_android_session_replay_release.getViewId(), linkedList));
            }
        }
        this.getHighSpeedVideoFpsRangesFor = item.getRecordedQueuedItemContext().getNewRumContext$dd_sdk_android_session_replay_release();
    }

    @Override // com.datadog.android.sessionreplay.internal.processor.Processor
    public final void processTouchEventsRecords(com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext newRumContext$dd_sdk_android_session_replay_release = item.getRecordedQueuedItemContext().getNewRumContext$dd_sdk_android_session_replay_release();
        this.getOutputMinFrameDuration.write(new com.datadog.android.sessionreplay.internal.processor.EnrichedRecord(newRumContext$dd_sdk_android_session_replay_release.getApplicationId(), newRumContext$dd_sdk_android_session_replay_release.getSessionId(), newRumContext$dd_sdk_android_session_replay_release.getViewId(), item.getTouchData$dd_sdk_android_session_replay_release()));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/RecordedDataProcessor$Companion;", "", "<init>", "()V", "", "FULL_SNAPSHOT_INTERVAL_IN_NS", "J", "getFULL_SNAPSHOT_INTERVAL_IN_NS$dd_sdk_android_session_replay_release", "()J"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getFULL_SNAPSHOT_INTERVAL_IN_NS$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.processor.RecordedDataProcessor.FULL_SNAPSHOT_INTERVAL_IN_NS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
