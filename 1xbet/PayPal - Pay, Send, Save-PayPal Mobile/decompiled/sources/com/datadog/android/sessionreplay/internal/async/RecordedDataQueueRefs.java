package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 "}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "recordedDataQueueHandler", "<init>", "(Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;)V", "copy", "(Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;)Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "", "decrementPendingJobs$dd_sdk_android_session_replay_release", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "incrementPendingJobs$dd_sdk_android_session_replay_release", "", "toString", "()Ljava/lang/String;", "tryToConsumeItem$dd_sdk_android_session_replay_release", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "recordedDataQueueItem", "Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "getRecordedDataQueueItem$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "setRecordedDataQueueItem$dd_sdk_android_session_replay_release", "(Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RecordedDataQueueRefs {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getHighSpeedVideoFpsRanges;
    private com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem recordedDataQueueItem;

    public RecordedDataQueueRefs(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        this.getHighSpeedVideoFpsRanges = recordedDataQueueHandler;
    }

    /* renamed from: getRecordedDataQueueItem$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem getRecordedDataQueueItem() {
        return this.recordedDataQueueItem;
    }

    public final void setRecordedDataQueueItem$dd_sdk_android_session_replay_release(com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem snapshotRecordedDataQueueItem) {
        this.recordedDataQueueItem = snapshotRecordedDataQueueItem;
    }

    public final void incrementPendingJobs$dd_sdk_android_session_replay_release() {
        com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem snapshotRecordedDataQueueItem = this.recordedDataQueueItem;
        if (snapshotRecordedDataQueueItem != null) {
            snapshotRecordedDataQueueItem.incrementPendingJobs$dd_sdk_android_session_replay_release();
        }
    }

    public final void decrementPendingJobs$dd_sdk_android_session_replay_release() {
        com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem snapshotRecordedDataQueueItem = this.recordedDataQueueItem;
        if (snapshotRecordedDataQueueItem != null) {
            snapshotRecordedDataQueueItem.decrementPendingJobs$dd_sdk_android_session_replay_release();
        }
    }

    public final void tryToConsumeItem$dd_sdk_android_session_replay_release() {
        this.getHighSpeedVideoFpsRanges.tryToConsumeItems();
    }

    public final java.lang.String toString() {
        com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecordedDataQueueRefs(getHighSpeedVideoFpsRanges=");
        sb.append(recordedDataQueueHandler);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, ((com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs) other).getHighSpeedVideoFpsRanges);
    }

    public final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs copy(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        return new com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs(recordedDataQueueHandler);
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs copy$default(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs recordedDataQueueRefs, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recordedDataQueueHandler = recordedDataQueueRefs.getHighSpeedVideoFpsRanges;
        }
        return recordedDataQueueRefs.copy(recordedDataQueueHandler);
    }
}
