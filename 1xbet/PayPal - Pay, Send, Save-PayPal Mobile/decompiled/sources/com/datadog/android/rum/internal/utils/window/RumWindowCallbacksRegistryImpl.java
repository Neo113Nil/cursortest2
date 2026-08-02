package com.datadog.android.rum.internal.utils.window;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbacksRegistryImpl;", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbacksRegistry;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbackListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Landroid/app/Activity;Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbackListener;)V", "removeListener", "Ljava/util/WeakHashMap;", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallback;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/WeakHashMap;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumWindowCallbacksRegistryImpl implements com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistry {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.WeakHashMap<android.app.Activity, com.datadog.android.rum.internal.utils.window.RumWindowCallback> Camera2StreamConfigurationMap = new java.util.WeakHashMap<>();

    @Override // com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistry
    public final void addListener(android.app.Activity activity, com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        java.util.WeakHashMap<android.app.Activity, com.datadog.android.rum.internal.utils.window.RumWindowCallback> weakHashMap = this.Camera2StreamConfigurationMap;
        com.datadog.android.rum.internal.utils.window.RumWindowCallback rumWindowCallback = weakHashMap.get(activity);
        if (rumWindowCallback == null) {
            android.view.Window window = activity.getWindow();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "");
            android.view.Window.Callback callback = window.getCallback();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callback, "");
            com.datadog.android.rum.internal.utils.window.RumWindowCallback rumWindowCallback2 = new com.datadog.android.rum.internal.utils.window.RumWindowCallback(callback);
            window.setCallback(rumWindowCallback2);
            weakHashMap.put(activity, rumWindowCallback2);
            rumWindowCallback = rumWindowCallback2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        rumWindowCallback.getHighResolutionOutputSizeshNQ4ISI.addListener(listener);
    }

    @Override // com.datadog.android.rum.internal.utils.window.RumWindowCallbacksRegistry
    public final void removeListener(android.app.Activity activity, com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        com.datadog.android.rum.internal.utils.window.RumWindowCallback rumWindowCallback = this.Camera2StreamConfigurationMap.get(activity);
        if (rumWindowCallback != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            rumWindowCallback.getHighResolutionOutputSizeshNQ4ISI.removeListener(listener);
            if (rumWindowCallback.getHighResolutionOutputSizeshNQ4ISI.getListenersCount() == 0) {
                android.view.Window window = activity.getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "");
                android.view.Window.Callback callback = window.getCallback();
                if ((callback instanceof com.datadog.android.rum.internal.utils.window.RumWindowCallback) && this.Camera2StreamConfigurationMap.values().contains(callback)) {
                    window.setCallback(((com.datadog.android.rum.internal.utils.window.RumWindowCallback) callback).Camera2StreamConfigurationMap);
                }
                this.Camera2StreamConfigurationMap.remove(activity);
            }
        }
    }
}
