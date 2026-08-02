package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\rR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/TouchEventRecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "recordedQueuedItemContext", "", "creationTimestampInNs", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "touchData", "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;JLjava/util/List;)V", "", "isReady$dd_sdk_android_session_replay_release", "()Z", "isValid$dd_sdk_android_session_replay_release", "Ljava/util/List;", "getTouchData$dd_sdk_android_session_replay_release", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TouchEventRecordedDataQueueItem extends com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem {
    private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> touchData;

    @Override // com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem
    public final boolean isReady$dd_sdk_android_session_replay_release() {
        return true;
    }

    public /* synthetic */ TouchEventRecordedDataQueueItem(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(recordedQueuedItemContext, j, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> getTouchData$dd_sdk_android_session_replay_release() {
        return this.touchData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TouchEventRecordedDataQueueItem(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, long j, java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> list) {
        super(recordedQueuedItemContext, j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedQueuedItemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.touchData = list;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem
    public final boolean isValid$dd_sdk_android_session_replay_release() {
        return !this.touchData.isEmpty();
    }
}
