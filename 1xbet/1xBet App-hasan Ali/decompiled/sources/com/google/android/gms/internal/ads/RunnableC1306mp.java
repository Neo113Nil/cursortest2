package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1306mp implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14538k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1396op f14539l;

    public /* synthetic */ RunnableC1306mp(C1396op c1396op, int i) {
        this.f14538k = i;
        this.f14539l = c1396op;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14538k) {
            case 0:
                C1396op c1396op = this.f14539l;
                c1396op.f14859d.execute(new RunnableC1306mp(c1396op, 1));
                break;
            default:
                C1396op c1396op2 = this.f14539l;
                c1396op2.f14856a.set(new C1351np(c1396op2.f14860e.d(), c1396op2.f, c1396op2.f14858c));
                break;
        }
    }
}
