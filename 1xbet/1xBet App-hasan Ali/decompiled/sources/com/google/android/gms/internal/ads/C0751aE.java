package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0751aE implements Yj {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12646k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EE f12647l;

    public /* synthetic */ C0751aE(EE ee, int i) {
        this.f12646k = 0;
        this.f12647l = ee;
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public final void mo11k(Object obj) {
        EE ee = this.f12647l;
        SE se = (SE) obj;
        switch (this.f12646k) {
            case 0:
                int i = C1109iE.f13882f0;
                AbstractC0715Xa abstractC0715Xa = ee.f8476a;
                ME me = se.f11526g;
                me.getClass();
                C1324n6 c1324n6 = se.f11524d;
                c1324n6.f14581n = C1324n6.v(me, (AbstractC1044gv) c1324n6.f14579l, (C1603tG) c1324n6.f14582o, (C1785xa) c1324n6.f14578k);
                c1324n6.y(me.l1());
                se.i(se.g(), 0, new QE(7));
                break;
            case 1:
                int i5 = C1109iE.f13882f0;
                boolean z3 = ee.f8485l;
                se.i(se.g(), 5, new QE(21));
                break;
            case 2:
                int i6 = C1109iE.f13882f0;
                ee.getClass();
                se.i(se.g(), 7, new QE(15));
                break;
            default:
                int i7 = C1109iE.f13882f0;
                Object obj2 = ee.i.f14379n;
                se.i(se.g(), 2, new QE(16));
                break;
        }
    }

    public /* synthetic */ C0751aE(EE ee, int i, byte b3) {
        this.f12646k = i;
        this.f12647l = ee;
    }
}
