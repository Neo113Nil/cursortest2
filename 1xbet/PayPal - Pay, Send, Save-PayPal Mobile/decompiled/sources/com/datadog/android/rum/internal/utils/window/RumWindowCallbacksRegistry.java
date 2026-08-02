package com.datadog.android.rum.internal.utils.window;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbacksRegistry;", "", "Landroid/app/Activity;", "activity", "Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbackListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Landroid/app/Activity;Lcom/datadog/android/rum/internal/utils/window/RumWindowCallbackListener;)V", "removeListener"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RumWindowCallbacksRegistry {
    void addListener(android.app.Activity activity, com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener listener);

    void removeListener(android.app.Activity activity, com.datadog.android.rum.internal.utils.window.RumWindowCallbackListener listener);
}
