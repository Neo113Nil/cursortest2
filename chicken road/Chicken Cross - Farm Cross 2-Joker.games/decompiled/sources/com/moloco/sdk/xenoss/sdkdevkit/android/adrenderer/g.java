package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class g {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10886a;
    public final float b;
    public final int c;
    public final int d;

    public g() {
        this(false, 0.0f, 0, 0, 15, null);
    }

    public final boolean a() {
        return this.f10886a;
    }

    public final float b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10886a == gVar.f10886a && Float.compare(this.b, gVar.b) == 0 && this.c == gVar.c && this.d == gVar.d;
    }

    public final int f() {
        return this.c;
    }

    public final boolean g() {
        return this.f10886a;
    }

    public final float h() {
        return this.b;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f10886a) * 31) + Float.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "AdaptiveBlurConfig(enabled=" + this.f10886a + ", gapThresholdFraction=" + this.b + ", creativeWidthPx=" + this.c + ", creativeHeightPx=" + this.d + ')';
    }

    public g(boolean z, float f, int i, int i2) {
        this.f10886a = z;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final g a(boolean z, float f, int i, int i2) {
        return new g(z, f, i, i2);
    }

    public static /* synthetic */ g a(g gVar, boolean z, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = gVar.f10886a;
        }
        if ((i3 & 2) != 0) {
            f = gVar.b;
        }
        if ((i3 & 4) != 0) {
            i = gVar.c;
        }
        if ((i3 & 8) != 0) {
            i2 = gVar.d;
        }
        return gVar.a(z, f, i, i2);
    }

    public /* synthetic */ g(boolean z, float f, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0.1f : f, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
