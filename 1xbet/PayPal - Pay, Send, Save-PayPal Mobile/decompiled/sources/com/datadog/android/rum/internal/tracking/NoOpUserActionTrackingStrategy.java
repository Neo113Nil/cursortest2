package com.datadog.android.rum.internal.tracking;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/NoOpUserActionTrackingStrategy;", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "<init>", "()V", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "getGesturesTracker", "()Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "unregister", "(Landroid/content/Context;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpUserActionTrackingStrategy implements com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy {
    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
    }

    @Override // com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy
    public final com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker getGesturesTracker() {
        return new com.datadog.android.rum.internal.instrumentation.gestures.NoOpGesturesTracker();
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
