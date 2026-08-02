package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0991fn implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13497k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1893zs f13498l;

    public /* synthetic */ RunnableC0991fn(C1893zs c1893zs, int i) {
        this.f13497k = i;
        this.f13498l = c1893zs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13497k) {
            case 0:
                this.f13498l.c();
                break;
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue() && AbstractC1803xs.f16343b.f2300l) {
                    this.f13498l.a();
                    break;
                }
                break;
        }
    }
}
