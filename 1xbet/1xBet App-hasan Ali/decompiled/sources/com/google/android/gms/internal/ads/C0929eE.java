package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0929eE implements Yj {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13239k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1519re f13240l;

    public /* synthetic */ C0929eE(C1519re c1519re) {
        this.f13240l = c1519re;
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public final void mo11k(Object obj) {
        switch (this.f13239k) {
            case 0:
                SE se = (SE) obj;
                OE l5 = se.l();
                se.i(l5, 25, new C0929eE(l5, this.f13240l));
                break;
            default:
                C1519re c1519re = this.f13240l;
                ((PE) obj).m(c1519re);
                int i = c1519re.f15322a;
                break;
        }
    }

    public /* synthetic */ C0929eE(OE oe, C1519re c1519re) {
        this.f13240l = c1519re;
    }
}
