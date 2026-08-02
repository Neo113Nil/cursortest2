package com.datadog.android.sessionreplay;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/_SessionReplayInternalProxy;", "", "Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "builder", "<init>", "(Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;)V", "Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;", "internalCallback", "setInternalCallback", "(Lcom/datadog/android/sessionreplay/SessionReplayInternalCallback;)Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/SessionReplayConfiguration$Builder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class _SessionReplayInternalProxy {
    private final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder Camera2StreamConfigurationMap;

    public _SessionReplayInternalProxy(com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        this.Camera2StreamConfigurationMap = builder;
    }

    public final com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder setInternalCallback(com.datadog.android.sessionreplay.SessionReplayInternalCallback internalCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalCallback, "");
        return this.Camera2StreamConfigurationMap.setInternalCallback$dd_sdk_android_session_replay_release(internalCallback);
    }
}
