package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public interface LifecycleFragment {
    void addCallback(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback);

    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String str, java.lang.Class<T> cls);

    android.app.Activity getLifecycleActivity();

    boolean isCreated();

    boolean isStarted();

    void startActivityForResult(android.content.Intent intent, int i);
}
