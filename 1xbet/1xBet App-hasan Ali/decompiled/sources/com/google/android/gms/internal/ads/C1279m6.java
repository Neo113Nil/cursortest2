package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279m6 implements S5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14473b;

    public /* synthetic */ C1279m6(int i, Object obj) {
        this.f14472a = i;
        this.f14473b = obj;
    }

    @Override // com.google.android.gms.internal.ads.S5
    public final void A(boolean z3) {
        switch (this.f14472a) {
            case 0:
                C1324n6 c1324n6 = (C1324n6) this.f14473b;
                if (!z3) {
                    C1324n6.s(c1324n6);
                    break;
                } else {
                    c1324n6.x();
                    break;
                }
            default:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8905u)).booleanValue()) {
                    ((C1489qs) this.f14473b).g(z3);
                    break;
                }
                break;
        }
    }
}
