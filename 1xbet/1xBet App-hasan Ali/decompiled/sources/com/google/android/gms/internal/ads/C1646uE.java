package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1646uE {

    /* renamed from: a, reason: collision with root package name */
    public final C1603tG f15816a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15817b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15818c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15819d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15820e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15821g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15822h;

    public C1646uE(C1603tG c1603tG, long j5, long j6, long j7, long j8, boolean z3, boolean z5, boolean z6) {
        AbstractC1668us.S(!z6 || z3);
        AbstractC1668us.S(!z5 || z3);
        this.f15816a = c1603tG;
        this.f15817b = j5;
        this.f15818c = j6;
        this.f15819d = j7;
        this.f15820e = j8;
        this.f = z3;
        this.f15821g = z5;
        this.f15822h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1646uE.class == obj.getClass()) {
            C1646uE c1646uE = (C1646uE) obj;
            if (this.f15817b == c1646uE.f15817b && this.f15818c == c1646uE.f15818c && this.f15819d == c1646uE.f15819d && this.f15820e == c1646uE.f15820e && this.f == c1646uE.f && this.f15821g == c1646uE.f15821g && this.f15822h == c1646uE.f15822h && Objects.equals(this.f15816a, c1646uE.f15816a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f15816a.hashCode() + 527) * 31) + ((int) this.f15817b)) * 31) + ((int) this.f15818c)) * 31) + ((int) this.f15819d)) * 31) + ((int) this.f15820e)) * 961) + (this.f ? 1 : 0)) * 31) + (this.f15821g ? 1 : 0)) * 31) + (this.f15822h ? 1 : 0);
    }
}
