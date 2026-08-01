package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ua {

    /* renamed from: a, reason: collision with root package name */
    public int f5030a;
    public int b;
    public int c;
    public int d;

    public ua(int i, int i2, int i3, int i4) {
        this.f5030a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.f5030a;
    }

    public final int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return this.f5030a == uaVar.f5030a && this.b == uaVar.b && this.c == uaVar.c && this.d == uaVar.d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f5030a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "IntRectangle(x=" + this.f5030a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final void c(int i) {
        this.f5030a = i;
    }

    public final void d(int i) {
        this.b = i;
    }

    public /* synthetic */ ua(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
