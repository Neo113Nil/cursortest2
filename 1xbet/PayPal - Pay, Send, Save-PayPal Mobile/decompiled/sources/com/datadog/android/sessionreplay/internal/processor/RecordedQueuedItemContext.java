package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "", "", "timestamp", "Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "newRumContext", "<init>", "(JLcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;)V", "component1$dd_sdk_android_session_replay_release", "()J", "component2$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "copy", "(JLcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;)Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "getNewRumContext$dd_sdk_android_session_replay_release", "J", "getTimestamp$dd_sdk_android_session_replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RecordedQueuedItemContext {
    private final com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext newRumContext;
    private final long timestamp;

    public RecordedQueuedItemContext(long j, com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReplayRumContext, "");
        this.timestamp = j;
        this.newRumContext = sessionReplayRumContext;
    }

    public final long getTimestamp$dd_sdk_android_session_replay_release() {
        return this.timestamp;
    }

    public final com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext getNewRumContext$dd_sdk_android_session_replay_release() {
        return this.newRumContext;
    }

    public final java.lang.String toString() {
        long j = this.timestamp;
        com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext = this.newRumContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecordedQueuedItemContext(timestamp=");
        sb.append(j);
        sb.append(", newRumContext=");
        sb.append(sessionReplayRumContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.timestamp) * 31) + this.newRumContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext = (com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext) other;
        return this.timestamp == recordedQueuedItemContext.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.newRumContext, recordedQueuedItemContext.newRumContext);
    }

    public final com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext copy(long timestamp, com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext newRumContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newRumContext, "");
        return new com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext(timestamp, newRumContext);
    }

    /* renamed from: component2$dd_sdk_android_session_replay_release, reason: from getter */
    public final com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext getNewRumContext() {
        return this.newRumContext;
    }

    /* renamed from: component1$dd_sdk_android_session_replay_release, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext copy$default(com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext recordedQueuedItemContext, long j, com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = recordedQueuedItemContext.timestamp;
        }
        if ((i & 2) != 0) {
            sessionReplayRumContext = recordedQueuedItemContext.newRumContext;
        }
        return recordedQueuedItemContext.copy(j, sessionReplayRumContext);
    }
}
