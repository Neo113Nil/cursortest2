package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5045a;
    public boolean b;
    public int c;
    public int d;
    public long e;
    public int f;
    public List g;

    public vd(boolean z, boolean z2, int i, int i2, long j, int i3, List list) {
        this.f5045a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = i3;
        this.g = list;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f;
    }

    public final boolean d() {
        return this.b;
    }

    public final List e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return this.f5045a == vdVar.f5045a && this.b == vdVar.b && this.c == vdVar.c && this.d == vdVar.d && this.e == vdVar.e && this.f == vdVar.f && Intrinsics.areEqual(this.g, vdVar.g);
    }

    public final long f() {
        return this.e;
    }

    public final boolean g() {
        return this.f5045a;
    }

    public int hashCode() {
        int hashCode = ((((((((((Boolean.hashCode(this.f5045a) * 31) + Boolean.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31;
        List list = this.g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "OmSdkModel(isEnabled=" + this.f5045a + ", verificationEnabled=" + this.b + ", minVisibleDips=" + this.c + ", minVisibleDurationMs=" + this.d + ", visibilityCheckIntervalMs=" + this.e + ", traversalLimit=" + this.f + ", verificationList=" + this.g + ")";
    }

    public /* synthetic */ vd(boolean z, boolean z2, int i, int i2, long j, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? 1 : i, (i4 & 8) == 0 ? i2 : 0, (i4 & 16) != 0 ? 100L : j, (i4 & 32) != 0 ? 25 : i3, (i4 & 64) != 0 ? null : list);
    }
}
