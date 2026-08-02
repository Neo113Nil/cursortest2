package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/NoOpGesturesTracker;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "<init>", "()V", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroid/content/Context;", "context", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "startTracking", "(Landroid/view/Window;Landroid/content/Context;Lcom/datadog/android/api/SdkCore;)V", "stopTracking", "(Landroid/view/Window;Landroid/content/Context;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpGesturesTracker implements com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker {
    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker
    public final void stopTracking(android.view.Window window, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker
    public final void startTracking(android.view.Window window, android.content.Context context, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
    }
}
