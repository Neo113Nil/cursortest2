package com.datadog.android.sessionreplay.internal.recorder.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/mapper/QueueStatusCallback;", "Lcom/datadog/android/sessionreplay/utils/AsyncJobStatusCallback;", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "recordedDataQueueRefs", "<init>", "(Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;)V", "", "jobFinished", "()V", "jobStarted", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QueueStatusCallback implements com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback {
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs getHighSpeedVideoSizes;

    public QueueStatusCallback(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs recordedDataQueueRefs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueRefs, "");
        this.getHighSpeedVideoSizes = recordedDataQueueRefs;
    }

    @Override // com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback
    public final void jobStarted() {
        this.getHighSpeedVideoSizes.incrementPendingJobs$dd_sdk_android_session_replay_release();
    }

    @Override // com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback
    public final void jobFinished() {
        this.getHighSpeedVideoSizes.decrementPendingJobs$dd_sdk_android_session_replay_release();
        this.getHighSpeedVideoSizes.tryToConsumeItem$dd_sdk_android_session_replay_release();
    }
}
