package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1252lg implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14390k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1342ng f14391l;

    public /* synthetic */ RunnableC1252lg(C1342ng c1342ng, int i) {
        this.f14390k = i;
        this.f14391l = c1342ng;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14390k) {
            case 0:
                C1342ng c1342ng = this.f14391l;
                c1342ng.getClass();
                c1342ng.f14666l.execute(new RunnableC1252lg(c1342ng, 1));
                break;
            default:
                this.f14391l.j();
                break;
        }
    }
}
