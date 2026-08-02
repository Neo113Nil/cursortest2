package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327n9 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14590b;

    /* renamed from: c, reason: collision with root package name */
    public final Q3 f14591c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14592d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14593e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14594g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14595h;
    public final int i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C1327n9(Object obj, int i, Q3 q32, Object obj2, int i5, long j5, long j6, int i6, int i7) {
        this.f14589a = obj;
        this.f14590b = i;
        this.f14591c = q32;
        this.f14592d = obj2;
        this.f14593e = i5;
        this.f = j5;
        this.f14594g = j6;
        this.f14595h = i6;
        this.i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1327n9.class == obj.getClass()) {
            C1327n9 c1327n9 = (C1327n9) obj;
            if (this.f14590b == c1327n9.f14590b && this.f14593e == c1327n9.f14593e && this.f == c1327n9.f && this.f14594g == c1327n9.f14594g && this.f14595h == c1327n9.f14595h && this.i == c1327n9.i && AbstractC1400ot.q(this.f14591c, c1327n9.f14591c) && AbstractC1400ot.q(this.f14589a, c1327n9.f14589a) && AbstractC1400ot.q(this.f14592d, c1327n9.f14592d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14589a, Integer.valueOf(this.f14590b), this.f14591c, this.f14592d, Integer.valueOf(this.f14593e), Long.valueOf(this.f), Long.valueOf(this.f14594g), Integer.valueOf(this.f14595h), Integer.valueOf(this.i)});
    }
}
