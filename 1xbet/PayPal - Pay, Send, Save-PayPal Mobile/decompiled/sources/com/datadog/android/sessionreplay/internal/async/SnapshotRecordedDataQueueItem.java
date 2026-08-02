package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0010R\"\u0010\u0012\u001a\u00020\u000e8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/SnapshotRecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueItem;", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "recordedQueuedItemContext", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "systemInformation", "", "creationTimestampInNs", "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;Lcom/datadog/android/sessionreplay/recorder/SystemInformation;J)V", "", "decrementPendingJobs$dd_sdk_android_session_replay_release", "()I", "incrementPendingJobs$dd_sdk_android_session_replay_release", "", "isReady$dd_sdk_android_session_replay_release", "()Z", "isValid$dd_sdk_android_session_replay_release", "isFinishedTraversal", "Z", "isFinishedTraversal$dd_sdk_android_session_replay_release", "setFinishedTraversal$dd_sdk_android_session_replay_release", "(Z)V", "", "Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "nodes", "Ljava/util/List;", "getNodes$dd_sdk_android_session_replay_release", "()Ljava/util/List;", "setNodes$dd_sdk_android_session_replay_release", "(Ljava/util/List;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "pendingJobs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getPendingJobs$dd_sdk_android_session_replay_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "getSystemInformation$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/recorder/SystemInformation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SnapshotRecordedDataQueueItem extends com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem {
    private volatile boolean isFinishedTraversal;
    private volatile java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> nodes;
    private final java.util.concurrent.atomic.AtomicInteger pendingJobs;
    private final com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation;

    /* renamed from: getSystemInformation$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.recorder.SystemInformation getSystemInformation() {
        return this.systemInformation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotRecordedDataQueueItem(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, long j) {
        super(recordedQueuedItemContext, j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedQueuedItemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInformation, "");
        this.systemInformation = systemInformation;
        this.nodes = kotlin.collections.CollectionsKt.emptyList();
        this.pendingJobs = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> getNodes$dd_sdk_android_session_replay_release() {
        return this.nodes;
    }

    public final void setNodes$dd_sdk_android_session_replay_release(java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.nodes = list;
    }

    /* renamed from: isFinishedTraversal$dd_sdk_android_session_replay_release, reason: from getter */
    public final boolean getIsFinishedTraversal() {
        return this.isFinishedTraversal;
    }

    public final void setFinishedTraversal$dd_sdk_android_session_replay_release(boolean z) {
        this.isFinishedTraversal = z;
    }

    /* renamed from: getPendingJobs$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicInteger getPendingJobs() {
        return this.pendingJobs;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem
    public final boolean isValid$dd_sdk_android_session_replay_release() {
        if (this.isFinishedTraversal) {
            return !this.nodes.isEmpty();
        }
        return true;
    }

    @Override // com.datadog.android.sessionreplay.internal.async.RecordedDataQueueItem
    public final boolean isReady$dd_sdk_android_session_replay_release() {
        return this.isFinishedTraversal && this.pendingJobs.get() == 0;
    }

    public final int incrementPendingJobs$dd_sdk_android_session_replay_release() {
        return this.pendingJobs.incrementAndGet();
    }

    public final int decrementPendingJobs$dd_sdk_android_session_replay_release() {
        return this.pendingJobs.decrementAndGet();
    }
}
