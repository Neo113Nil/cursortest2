package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0902dn implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13168k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1893zs f13169l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f13170m;

    public /* synthetic */ RunnableC0902dn(C1893zs c1893zs, View view, int i) {
        this.f13168k = i;
        this.f13169l = c1893zs;
        this.f13170m = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13168k) {
            case 0:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue() && AbstractC1803xs.f16343b.f2300l) {
                    Bs bs = Bs.f7902k;
                    C1893zs c1893zs = this.f13169l;
                    if (!c1893zs.f) {
                        c1893zs.f16776b.a(this.f13170m, bs);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue() && AbstractC1803xs.f16343b.f2300l) {
                    this.f13169l.b(this.f13170m);
                    break;
                }
                break;
        }
    }
}
