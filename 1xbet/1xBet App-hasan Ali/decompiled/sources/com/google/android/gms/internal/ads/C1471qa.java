package com.google.android.gms.internal.ads;

import A0.AbstractC0015c;

/* renamed from: com.google.android.gms.internal.ads.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471qa extends AbstractC0015c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f15122c;

    /* renamed from: d, reason: collision with root package name */
    public final C1515ra f15123d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15124e;

    public C1471qa(C1515ra c1515ra) {
        super(1);
        this.f15122c = new Object();
        this.f15123d = c1515ra;
    }

    public final void q() {
        T2.G.m("release: Trying to acquire lock");
        synchronized (this.f15122c) {
            try {
                T2.G.m("release: Lock acquired");
                if (this.f15124e) {
                    T2.G.m("release: Lock already released");
                    return;
                }
                this.f15124e = true;
                p(new V9(3), new V9(18));
                p(new Qt(6, this), new U4(7, this));
                T2.G.m("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
