package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourceItemCreationHandler;", "", "Lcom/datadog/android/sessionreplay/internal/async/DataQueueHandler;", "recordedDataQueueHandler", "<init>", "(Lcom/datadog/android/sessionreplay/internal/async/DataQueueHandler;)V", "", "resourceId", "", "resourceData", "", "queueItem$dd_sdk_android_session_replay_release", "(Ljava/lang/String;[B)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/async/DataQueueHandler;", "getHighSpeedVideoFpsRanges", "", "resourceIdsSeen", "Ljava/util/Set;", "getResourceIdsSeen$dd_sdk_android_session_replay_release", "()Ljava/util/Set;", "getResourceIdsSeen$dd_sdk_android_session_replay_release$annotations", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceItemCreationHandler {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.DataQueueHandler getHighSpeedVideoFpsRanges;
    private final java.util.Set<java.lang.String> resourceIdsSeen;

    public static /* synthetic */ void getResourceIdsSeen$dd_sdk_android_session_replay_release$annotations() {
    }

    public ResourceItemCreationHandler(com.datadog.android.sessionreplay.internal.async.DataQueueHandler dataQueueHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataQueueHandler, "");
        this.getHighSpeedVideoFpsRanges = dataQueueHandler;
        java.util.Set<java.lang.String> synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedSet, "");
        this.resourceIdsSeen = synchronizedSet;
    }

    public final java.util.Set<java.lang.String> getResourceIdsSeen$dd_sdk_android_session_replay_release() {
        return this.resourceIdsSeen;
    }

    public final void queueItem$dd_sdk_android_session_replay_release(java.lang.String resourceId, byte[] resourceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceData, "");
        if (this.resourceIdsSeen.contains(resourceId)) {
            return;
        }
        this.resourceIdsSeen.add(resourceId);
        com.datadog.android.sessionreplay.internal.async.DataQueueHandler.DefaultImpls.addResourceItem$default(this.getHighSpeedVideoFpsRanges, resourceId, resourceData, null, 4, null);
    }
}
