package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1156ja implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14099k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1068ha f14100l;

    public /* synthetic */ RunnableC1156ja(C1068ha c1068ha, int i) {
        this.f14099k = i;
        this.f14100l = c1068ha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14099k) {
            case 0:
                this.f14100l.p();
                break;
            case 1:
                this.f14100l.p();
                break;
            default:
                C1641u9 c1641u9 = AbstractC1776x9.f16254o;
                C1068ha c1068ha = this.f14100l;
                c1068ha.i("/result", c1641u9);
                c1068ha.p();
                break;
        }
    }
}
