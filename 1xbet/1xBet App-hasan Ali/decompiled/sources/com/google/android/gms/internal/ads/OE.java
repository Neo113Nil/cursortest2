package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class OE {

    /* renamed from: a, reason: collision with root package name */
    public final long f10941a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0715Xa f10942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10943c;

    /* renamed from: d, reason: collision with root package name */
    public final C1603tG f10944d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10945e;
    public final AbstractC0715Xa f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10946g;

    /* renamed from: h, reason: collision with root package name */
    public final C1603tG f10947h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10948j;

    public OE(long j5, AbstractC0715Xa abstractC0715Xa, int i, C1603tG c1603tG, long j6, AbstractC0715Xa abstractC0715Xa2, int i5, C1603tG c1603tG2, long j7, long j8) {
        this.f10941a = j5;
        this.f10942b = abstractC0715Xa;
        this.f10943c = i;
        this.f10944d = c1603tG;
        this.f10945e = j6;
        this.f = abstractC0715Xa2;
        this.f10946g = i5;
        this.f10947h = c1603tG2;
        this.i = j7;
        this.f10948j = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OE.class == obj.getClass()) {
            OE oe = (OE) obj;
            if (this.f10941a == oe.f10941a && this.f10943c == oe.f10943c && this.f10945e == oe.f10945e && this.f10946g == oe.f10946g && this.i == oe.i && this.f10948j == oe.f10948j && AbstractC1400ot.q(this.f10942b, oe.f10942b) && AbstractC1400ot.q(this.f10944d, oe.f10944d) && AbstractC1400ot.q(this.f, oe.f) && AbstractC1400ot.q(this.f10947h, oe.f10947h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10941a), this.f10942b, Integer.valueOf(this.f10943c), this.f10944d, Long.valueOf(this.f10945e), this.f, Integer.valueOf(this.f10946g), this.f10947h, Long.valueOf(this.i), Long.valueOf(this.f10948j)});
    }
}
