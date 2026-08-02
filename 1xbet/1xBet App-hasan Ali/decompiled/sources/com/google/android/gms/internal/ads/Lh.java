package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Lh implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10454a;

    /* renamed from: b, reason: collision with root package name */
    public final KD f10455b;

    public /* synthetic */ Lh(KD kd, int i) {
        this.f10454a = i;
        this.f10455b = kd;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f10454a) {
            case 0:
                return new Kh(this.f10455b.d());
            case 1:
                return new Rh(this.f10455b.d());
            case 2:
                Uh uh = new Uh(this.f10455b.d());
                uh.f11782m = false;
                return uh;
            case 3:
                return new Xh(this.f10455b.d());
            case 4:
                return new Yh(this.f10455b.d());
            case 5:
                return new C0763ai(this.f10455b.d());
            case 6:
                return new C0852ci(this.f10455b.d());
            case 7:
                return new C0941ei(this.f10455b.d());
            case 8:
                return new C0986fi(this.f10455b.d());
            case 9:
                return new C1076hi(this.f10455b.d());
            case 10:
                return new C1389oi(this.f10455b.d());
            case 11:
                return new C1568si(this.f10455b.d());
            case 12:
                return new C1658ui(this.f10455b.d());
            case 13:
                return new C1793xi(this.f10455b.d());
            case 14:
                return new Ai(this.f10455b.d());
            case 15:
                return new Ci(this.f10455b.d());
            case 16:
                return new Ii(this.f10455b.d());
            case 17:
                return new Pi(this.f10455b.d());
            case 18:
                return new Qi(this.f10455b.d());
            case 19:
                return new Ui(this.f10455b.d());
            case 20:
                return new Wi(this.f10455b.d());
            case C1639u7.zzm /* 21 */:
                return new Zi(this.f10455b.d());
            case 22:
                return new C0809bj(this.f10455b.d());
            case 23:
                return new C0853cj(this.f10455b.d());
            default:
                return new Fr(this.f10455b.d());
        }
    }
}
