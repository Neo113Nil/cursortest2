package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1299mi implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14519k;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f14520l;

    public /* synthetic */ RunnableC1299mi(C1344ni c1344ni, int i) {
        this.f14519k = i;
        switch (i) {
            case 1:
                this.f14520l = new WeakReference(c1344ni);
                break;
            default:
                this.f14520l = new WeakReference(c1344ni);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14519k) {
            case 0:
                C1344ni c1344ni = (C1344ni) this.f14520l.get();
                if (c1344ni != null) {
                    c1344ni.n1(new Jh(17));
                    break;
                }
                break;
            default:
                C1344ni c1344ni2 = (C1344ni) this.f14520l.get();
                if (c1344ni2 != null) {
                    c1344ni2.n1(new Jh(18));
                    break;
                }
                break;
        }
    }
}
