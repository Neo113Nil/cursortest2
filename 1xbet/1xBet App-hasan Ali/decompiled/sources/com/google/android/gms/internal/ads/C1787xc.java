package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1787xc {

    /* renamed from: a, reason: collision with root package name */
    public final int f16300a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16301b;

    /* renamed from: c, reason: collision with root package name */
    public final C1761wv f16302c;

    /* renamed from: d, reason: collision with root package name */
    public final C1761wv f16303d;

    /* renamed from: e, reason: collision with root package name */
    public final C1761wv f16304e;
    public final C1761wv f;

    /* renamed from: g, reason: collision with root package name */
    public final C0716Xb f16305g;

    /* renamed from: h, reason: collision with root package name */
    public final C1761wv f16306h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final Cv f16307j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1177jv f16308k;

    static {
        new C1787xc(new C1158jc());
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public C1787xc(C1158jc c1158jc) {
        this.f16300a = c1158jc.f14101a;
        this.f16301b = c1158jc.f14102b;
        this.f16302c = c1158jc.f14103c;
        this.f16303d = c1158jc.f14104d;
        this.f16304e = c1158jc.f14105e;
        this.f = c1158jc.f;
        this.f16305g = c1158jc.f14106g;
        this.f16306h = c1158jc.f14107h;
        this.i = c1158jc.i;
        this.f16307j = Cv.a(c1158jc.f14108j);
        Object[] array = c1158jc.f14109k.toArray();
        this.f16308k = AbstractC1177jv.m(array.length, array);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1787xc c1787xc = (C1787xc) obj;
        if (this.f16300a != c1787xc.f16300a || this.f16301b != c1787xc.f16301b || !this.f16302c.equals(c1787xc.f16302c) || !this.f16303d.equals(c1787xc.f16303d) || !this.f16304e.equals(c1787xc.f16304e) || !this.f.equals(c1787xc.f) || !this.f16305g.equals(c1787xc.f16305g) || !this.f16306h.equals(c1787xc.f16306h) || this.i != c1787xc.i) {
            return false;
        }
        Cv cv = this.f16307j;
        cv.getClass();
        return AbstractC0952et.K(c1787xc.f16307j, cv) && this.f16308k.equals(c1787xc.f16308k);
    }

    public int hashCode() {
        return this.f16308k.hashCode() + ((this.f16307j.hashCode() + ((((this.f16306h.hashCode() + ((((this.f.hashCode() + ((((((this.f16304e.hashCode() + ((this.f16303d.hashCode() + ((this.f16302c.hashCode() + ((((1871669920 + this.f16300a) * 31) + this.f16301b) * 31)) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31) + 29791) * 31)) * 31) + this.i) * 887503681)) * 31);
    }
}
