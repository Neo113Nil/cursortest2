package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1709vo implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16048k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1754wo f16049l;

    public /* synthetic */ RunnableC1709vo(C1754wo c1754wo, int i) {
        this.f16048k = i;
        this.f16049l = c1754wo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16048k) {
            case 0:
                C1754wo c1754wo = this.f16049l;
                synchronized (c1754wo) {
                    c1754wo.f16162b.clear();
                    c1754wo.f16161a.clear();
                    c1754wo.f16165e.clear();
                    c1754wo.f16164d.clear();
                    c1754wo.i();
                    c1754wo.j();
                    c1754wo.g();
                }
                return;
            default:
                C1754wo c1754wo2 = this.f16049l;
                c1754wo2.getClass();
                c1754wo2.f.execute(new RunnableC1709vo(c1754wo2, 0));
                return;
        }
    }
}
