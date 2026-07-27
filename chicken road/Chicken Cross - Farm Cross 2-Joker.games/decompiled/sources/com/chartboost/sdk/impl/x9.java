package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class x9 {

    /* renamed from: a, reason: collision with root package name */
    public int f5075a;
    public int b;
    public int c;
    public int d;

    public x9(int i, int i2, int i3, int i4) {
        this.f5075a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.f5075a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return this.f5075a == x9Var.f5075a && this.b == x9Var.b && this.c == x9Var.c && this.d == x9Var.d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f5075a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ImpressionCounter(onVideoCompletedPlayCount=" + this.f5075a + ", onRewardedVideoCompletedPlayCount=" + this.b + ", impressionNotifyDidCompleteAdPlayCount=" + this.c + ", impressionSendVideoCompleteRequestPlayCount=" + this.d + ")";
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.b = i;
    }

    public final void d(int i) {
        this.f5075a = i;
    }

    public /* synthetic */ x9(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? 1 : i4);
    }
}
