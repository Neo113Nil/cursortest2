package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1700vf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16016a;

    /* renamed from: b, reason: collision with root package name */
    public final ED f16017b;

    public /* synthetic */ C1700vf(ED ed, int i) {
        this.f16016a = i;
        this.f16017b = ed;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f16016a) {
            case 0:
                C0554Af c0554Af = (C0554Af) this.f16017b.f8474a;
                AbstractC1400ot.D(c0554Af);
                return c0554Af;
            case 1:
                return new C1529ro(21, (I9) this.f16017b.f8474a);
            case 2:
                return new Mt(29, (C0622Jf) this.f16017b.f8474a);
            case 3:
                return new Mo(3, (C1217kq) this.f16017b.f8474a);
            default:
                return new Kp((C1666uq) this.f16017b.f8474a);
        }
    }
}
