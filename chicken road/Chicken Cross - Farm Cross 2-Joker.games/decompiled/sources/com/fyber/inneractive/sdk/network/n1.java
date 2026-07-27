package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5504a;
    public final WeakReference b;
    public final int c;
    public final m1 d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i) {
        this.b = new WeakReference(t0Var);
        this.f5504a = new WeakReference(thread);
        this.c = i;
    }
}
