package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870zD {

    /* renamed from: j, reason: collision with root package name */
    public static final C1870zD f16562j = new C1870zD(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C1870zD f16563k = new C1870zD(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C1870zD f16564l = new C1870zD(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C1870zD f16565m = new C1870zD(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f16566a;

    /* renamed from: b, reason: collision with root package name */
    public final double f16567b;

    /* renamed from: c, reason: collision with root package name */
    public final double f16568c;

    /* renamed from: d, reason: collision with root package name */
    public final double f16569d;

    /* renamed from: e, reason: collision with root package name */
    public final double f16570e;
    public final double f;

    /* renamed from: g, reason: collision with root package name */
    public final double f16571g;

    /* renamed from: h, reason: collision with root package name */
    public final double f16572h;
    public final double i;

    public C1870zD(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.f16566a = d9;
        this.f16567b = d10;
        this.f16568c = d11;
        this.f16569d = d5;
        this.f16570e = d6;
        this.f = d7;
        this.f16571g = d8;
        this.f16572h = d12;
        this.i = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1870zD.class != obj.getClass()) {
            return false;
        }
        C1870zD c1870zD = (C1870zD) obj;
        return Double.compare(c1870zD.f16569d, this.f16569d) == 0 && Double.compare(c1870zD.f16570e, this.f16570e) == 0 && Double.compare(c1870zD.f, this.f) == 0 && Double.compare(c1870zD.f16571g, this.f16571g) == 0 && Double.compare(c1870zD.f16572h, this.f16572h) == 0 && Double.compare(c1870zD.i, this.i) == 0 && Double.compare(c1870zD.f16566a, this.f16566a) == 0 && Double.compare(c1870zD.f16567b, this.f16567b) == 0 && Double.compare(c1870zD.f16568c, this.f16568c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f16566a);
        long j5 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f16567b);
        long j6 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f16568c);
        long j7 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f16569d);
        long j8 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f16570e);
        long j9 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        long j10 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f16571g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f16572h);
        long j11 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j5) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j11)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f16562j)) {
            return "Rotate 0°";
        }
        if (equals(f16563k)) {
            return "Rotate 90°";
        }
        if (equals(f16564l)) {
            return "Rotate 180°";
        }
        if (equals(f16565m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f16566a);
        sb.append(", v=");
        sb.append(this.f16567b);
        sb.append(", w=");
        sb.append(this.f16568c);
        sb.append(", a=");
        sb.append(this.f16569d);
        sb.append(", b=");
        sb.append(this.f16570e);
        sb.append(", c=");
        sb.append(this.f);
        sb.append(", d=");
        sb.append(this.f16571g);
        sb.append(", tx=");
        sb.append(this.f16572h);
        sb.append(", ty=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
