package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f3673a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3674b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3675c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3676d;

    public ScreenInfo(int i2, int i3, int i4, float f2) {
        this.f3673a = i2;
        this.f3674b = i3;
        this.f3675c = i4;
        this.f3676d = f2;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.model.ScreenInfo copy$default(io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo, int i2, int i3, int i4, float f2, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i2 = screenInfo.f3673a;
        }
        if ((i5 & 2) != 0) {
            i3 = screenInfo.f3674b;
        }
        if ((i5 & 4) != 0) {
            i4 = screenInfo.f3675c;
        }
        if ((i5 & 8) != 0) {
            f2 = screenInfo.f3676d;
        }
        return screenInfo.copy(i2, i3, i4, f2);
    }

    public final int component1() {
        return this.f3673a;
    }

    public final int component2() {
        return this.f3674b;
    }

    public final int component3() {
        return this.f3675c;
    }

    public final float component4() {
        return this.f3676d;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.ScreenInfo copy(int i2, int i3, int i4, float f2) {
        return new io.appmetrica.analytics.coreapi.internal.model.ScreenInfo(i2, i3, i4, f2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.model.ScreenInfo)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo = (io.appmetrica.analytics.coreapi.internal.model.ScreenInfo) obj;
        return this.f3673a == screenInfo.f3673a && this.f3674b == screenInfo.f3674b && this.f3675c == screenInfo.f3675c && java.lang.Float.valueOf(this.f3676d).equals(java.lang.Float.valueOf(screenInfo.f3676d));
    }

    public final int getDpi() {
        return this.f3675c;
    }

    public final int getHeight() {
        return this.f3674b;
    }

    public final float getScaleFactor() {
        return this.f3676d;
    }

    public final int getWidth() {
        return this.f3673a;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f3676d) + ((java.lang.Integer.hashCode(this.f3675c) + ((java.lang.Integer.hashCode(this.f3674b) + (java.lang.Integer.hashCode(this.f3673a) * 31)) * 31)) * 31);
    }

    public java.lang.String toString() {
        return "ScreenInfo(width=" + this.f3673a + ", height=" + this.f3674b + ", dpi=" + this.f3675c + ", scaleFactor=" + this.f3676d + ')';
    }
}
