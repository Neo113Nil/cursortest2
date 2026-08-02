package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
public final class HE {

    /* renamed from: a, reason: collision with root package name */
    public final RF f9338a;

    /* renamed from: b, reason: collision with root package name */
    public int f9339b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9340c;

    /* renamed from: d, reason: collision with root package name */
    public final Looper f9341d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9342e;

    public HE(FE fe, RF rf, Looper looper) {
        this.f9338a = rf;
        this.f9341d = looper;
    }

    public final synchronized void a(boolean z3) {
        notifyAll();
    }
}
