package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroid/content/Context;", "context", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "startTracking", "(Landroid/view/Window;Landroid/content/Context;Lcom/datadog/android/api/SdkCore;)V", "stopTracking", "(Landroid/view/Window;Landroid/content/Context;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GesturesTracker {
    void startTracking(android.view.Window window, android.content.Context context, com.datadog.android.api.SdkCore sdkCore);

    void stopTracking(android.view.Window window, android.content.Context context);
}
