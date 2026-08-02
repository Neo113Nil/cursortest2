package com.datadog.android.sessionreplay.internal.async;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueItem;", "", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "recordedQueuedItemContext", "", "creationTimestampInNs", "<init>", "(Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;J)V", "", "isReady$dd_sdk_android_session_replay_release", "()Z", "isValid$dd_sdk_android_session_replay_release", "J", "getCreationTimestampInNs$dd_sdk_android_session_replay_release", "()J", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "getRecordedQueuedItemContext$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class RecordedDataQueueItem {
    private final long creationTimestampInNs;
    private final com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext;

    public abstract boolean isReady$dd_sdk_android_session_replay_release();

    public abstract boolean isValid$dd_sdk_android_session_replay_release();

    public RecordedDataQueueItem(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedQueuedItemContext, "");
        this.recordedQueuedItemContext = recordedQueuedItemContext;
        this.creationTimestampInNs = j;
    }

    /* renamed from: getRecordedQueuedItemContext$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext getRecordedQueuedItemContext() {
        return this.recordedQueuedItemContext;
    }

    /* renamed from: getCreationTimestampInNs$dd_sdk_android_session_replay_release, reason: from getter */
    public final long getCreationTimestampInNs() {
        return this.creationTimestampInNs;
    }
}
