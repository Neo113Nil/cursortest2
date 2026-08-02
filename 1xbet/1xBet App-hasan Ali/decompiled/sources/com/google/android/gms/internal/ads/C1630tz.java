package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630tz extends Bz {

    /* renamed from: a, reason: collision with root package name */
    public final int f15743a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15744b;

    /* renamed from: c, reason: collision with root package name */
    public final C1091hx f15745c;

    public C1630tz(int i, int i5, C1091hx c1091hx) {
        this.f15743a = i;
        this.f15744b = i5;
        this.f15745c = c1091hx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f15745c != C1091hx.f13820B;
    }

    public final int b() {
        C1091hx c1091hx = C1091hx.f13820B;
        int i = this.f15744b;
        C1091hx c1091hx2 = this.f15745c;
        if (c1091hx2 == c1091hx) {
            return i;
        }
        if (c1091hx2 == C1091hx.f13833y || c1091hx2 == C1091hx.f13834z || c1091hx2 == C1091hx.f13819A) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1630tz)) {
            return false;
        }
        C1630tz c1630tz = (C1630tz) obj;
        return c1630tz.f15743a == this.f15743a && c1630tz.b() == b() && c1630tz.f15745c == this.f15745c;
    }

    public final int hashCode() {
        return Objects.hash(C1630tz.class, Integer.valueOf(this.f15743a), Integer.valueOf(this.f15744b), this.f15745c);
    }

    public final String toString() {
        StringBuilder w5 = AbstractC0467k.w("AES-CMAC Parameters (variant: ", String.valueOf(this.f15745c), ", ");
        w5.append(this.f15744b);
        w5.append("-byte tags, and ");
        return L1.a.o(w5, this.f15743a, "-byte key)");
    }
}
