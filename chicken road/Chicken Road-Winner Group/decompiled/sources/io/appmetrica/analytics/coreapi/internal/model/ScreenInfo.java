package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f5357a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5358b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5359c;

    /* renamed from: d, reason: collision with root package name */
    private final float f5360d;

    public ScreenInfo(int i3, int i4, int i5, float f) {
        this.f5357a = i3;
        this.f5358b = i4;
        this.f5359c = i5;
        this.f5360d = f;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i3, int i4, int i5, float f, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i3 = screenInfo.f5357a;
        }
        if ((i6 & 2) != 0) {
            i4 = screenInfo.f5358b;
        }
        if ((i6 & 4) != 0) {
            i5 = screenInfo.f5359c;
        }
        if ((i6 & 8) != 0) {
            f = screenInfo.f5360d;
        }
        return screenInfo.copy(i3, i4, i5, f);
    }

    public final int component1() {
        return this.f5357a;
    }

    public final int component2() {
        return this.f5358b;
    }

    public final int component3() {
        return this.f5359c;
    }

    public final float component4() {
        return this.f5360d;
    }

    public final ScreenInfo copy(int i3, int i4, int i5, float f) {
        return new ScreenInfo(i3, i4, i5, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f5357a == screenInfo.f5357a && this.f5358b == screenInfo.f5358b && this.f5359c == screenInfo.f5359c && Float.valueOf(this.f5360d).equals(Float.valueOf(screenInfo.f5360d));
    }

    public final int getDpi() {
        return this.f5359c;
    }

    public final int getHeight() {
        return this.f5358b;
    }

    public final float getScaleFactor() {
        return this.f5360d;
    }

    public final int getWidth() {
        return this.f5357a;
    }

    public int hashCode() {
        return Float.hashCode(this.f5360d) + ((Integer.hashCode(this.f5359c) + ((Integer.hashCode(this.f5358b) + (Integer.hashCode(this.f5357a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f5357a + ", height=" + this.f5358b + ", dpi=" + this.f5359c + ", scaleFactor=" + this.f5360d + ')';
    }
}
