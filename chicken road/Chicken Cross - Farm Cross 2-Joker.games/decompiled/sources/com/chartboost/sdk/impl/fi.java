package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4771a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public fi(boolean z, List blackList, String endpoint, int i, int i2, boolean z2, int i3, boolean z3) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f4771a = z;
        this.b = blackList;
        this.c = endpoint;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = i3;
        this.h = z3;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return this.f4771a == fiVar.f4771a && Intrinsics.areEqual(this.b, fiVar.b) && Intrinsics.areEqual(this.c, fiVar.c) && this.d == fiVar.d && this.e == fiVar.e && this.f == fiVar.f && this.g == fiVar.g && this.h == fiVar.h;
    }

    public final int f() {
        return this.g;
    }

    public final int g() {
        return this.e;
    }

    public final boolean h() {
        return this.f4771a;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f4771a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Integer.hashCode(this.g)) * 31) + Boolean.hashCode(this.h);
    }

    public String toString() {
        return "TrackingConfig(isEnabled=" + this.f4771a + ", blackList=" + this.b + ", endpoint=" + this.c + ", eventLimit=" + this.d + ", windowDuration=" + this.e + ", persistenceEnabled=" + this.f + ", persistenceMaxEvents=" + this.g + ", logContextEnabled=" + this.h + ")";
    }

    public /* synthetic */ fi(boolean z, List list, String str, int i, int i2, boolean z2, int i3, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? gi.a() : list, (i4 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i4 & 8) != 0 ? 10 : i, (i4 & 16) != 0 ? 60 : i2, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? 100 : i3, (i4 & 128) == 0 ? z3 : true);
    }
}
