package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548s6 extends C0634Ld {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15424l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final Object f15425m;

    public C1548s6(D3.l lVar) {
        this.f15425m = lVar;
    }

    @Override // com.google.android.gms.internal.ads.C0634Ld, java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        switch (this.f15424l) {
            case 0:
                D3.l.m((D3.l) this.f15425m);
                return this.f10334k.cancel(z3);
            default:
                return super.cancel(z3);
        }
    }

    public void d() {
        b(this.f15425m);
    }

    public C1548s6(Object obj) {
        this.f15425m = obj;
    }
}
