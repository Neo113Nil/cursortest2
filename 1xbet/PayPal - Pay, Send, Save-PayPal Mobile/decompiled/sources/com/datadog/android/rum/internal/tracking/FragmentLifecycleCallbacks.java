package com.datadog.android.rum.internal.tracking;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroid/app/Activity;", "T", "", "activity", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "register", "(Landroid/app/Activity;Lcom/datadog/android/api/SdkCore;)V", "unregister", "(Landroid/app/Activity;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FragmentLifecycleCallbacks<T extends android.app.Activity> {
    void register(T activity, com.datadog.android.api.SdkCore sdkCore);

    void unregister(T activity);
}
