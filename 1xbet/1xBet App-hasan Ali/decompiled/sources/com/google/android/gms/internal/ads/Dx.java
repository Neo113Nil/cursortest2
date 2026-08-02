package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Dx implements Ei {

    /* renamed from: m, reason: collision with root package name */
    public static final Dx f8421m;

    /* renamed from: n, reason: collision with root package name */
    public static final Dx f8422n;

    /* renamed from: o, reason: collision with root package name */
    public static final Dx f8423o;

    /* renamed from: p, reason: collision with root package name */
    public static final Dx f8424p;

    /* renamed from: q, reason: collision with root package name */
    public static final Dx f8425q;

    /* renamed from: r, reason: collision with root package name */
    public static final Dx f8426r;

    /* renamed from: s, reason: collision with root package name */
    public static final Dx f8427s;

    /* renamed from: t, reason: collision with root package name */
    public static final Dx f8428t;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8429k;

    /* renamed from: l, reason: collision with root package name */
    public String f8430l;

    static {
        int i = 0;
        f8421m = new Dx("TINK", i);
        f8422n = new Dx("CRUNCHY", i);
        f8423o = new Dx("NO_PREFIX", i);
        int i5 = 1;
        f8424p = new Dx("TINK", i5);
        f8425q = new Dx("CRUNCHY", i5);
        f8426r = new Dx("NO_PREFIX", i5);
        int i6 = 2;
        f8427s = new Dx("TINK", i6);
        f8428t = new Dx("NO_PREFIX", i6);
    }

    public static Dx a(C1617tm c1617tm) {
        String str;
        c1617tm.k(2);
        int v4 = c1617tm.v();
        int i = v4 >> 1;
        int i5 = v4 & 1;
        int v5 = c1617tm.v() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i6 = v5 | (i5 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i6 >= 10 ? "." : ".0");
        sb.append(i6);
        return new Dx(sb.toString(), 3);
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        ((Ji) obj).C(this.f8430l);
    }

    public String toString() {
        switch (this.f8429k) {
            case 0:
                return this.f8430l;
            case 1:
                return this.f8430l;
            case 2:
                return this.f8430l;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Dx(String str, int i) {
        this.f8429k = i;
        this.f8430l = str;
    }
}
