package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public final class zaci {
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod zaa;
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod zab;
    public final java.lang.Runnable zac;

    public zaci(com.google.android.gms.common.api.internal.RegisterListenerMethod registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod unregisterListenerMethod, java.lang.Runnable runnable) {
        this.zaa = registerListenerMethod;
        this.zab = unregisterListenerMethod;
        this.zac = runnable;
    }
}
