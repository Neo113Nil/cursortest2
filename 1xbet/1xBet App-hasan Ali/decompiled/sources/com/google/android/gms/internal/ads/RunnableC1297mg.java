package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1297mg implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14505k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1342ng f14506l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f14507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f14508n;

    public /* synthetic */ RunnableC1297mg(C1342ng c1342ng, int i, int i5, int i6) {
        this.f14505k = i6;
        this.f14506l = c1342ng;
        this.f14507m = i;
        this.f14508n = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14505k) {
            case 0:
                C1342ng c1342ng = this.f14506l;
                c1342ng.getClass();
                c1342ng.f14666l.execute(new RunnableC1297mg(c1342ng, this.f14507m, this.f14508n, 1));
                break;
            default:
                this.f14506l.k(this.f14507m - 1, this.f14508n);
                break;
        }
    }
}
