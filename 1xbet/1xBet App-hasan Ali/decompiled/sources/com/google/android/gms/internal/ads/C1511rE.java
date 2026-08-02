package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511rE {

    /* renamed from: a, reason: collision with root package name */
    public final long f15283a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15284b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15285c;

    public /* synthetic */ C1511rE(C1467qE c1467qE) {
        this.f15283a = c1467qE.f15113a;
        this.f15284b = c1467qE.f15114b;
        this.f15285c = c1467qE.f15115c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1511rE)) {
            return false;
        }
        C1511rE c1511rE = (C1511rE) obj;
        return this.f15283a == c1511rE.f15283a && this.f15284b == c1511rE.f15284b && this.f15285c == c1511rE.f15285c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15283a), Float.valueOf(this.f15284b), Long.valueOf(this.f15285c)});
    }
}
