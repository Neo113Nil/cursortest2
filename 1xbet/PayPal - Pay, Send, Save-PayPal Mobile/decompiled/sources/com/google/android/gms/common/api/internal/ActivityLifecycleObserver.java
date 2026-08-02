package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public abstract class ActivityLifecycleObserver {
    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity activity) {
        return new com.google.android.gms.common.api.internal.zab(com.google.android.gms.common.api.internal.zaa.zaa(activity));
    }

    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable);
}
