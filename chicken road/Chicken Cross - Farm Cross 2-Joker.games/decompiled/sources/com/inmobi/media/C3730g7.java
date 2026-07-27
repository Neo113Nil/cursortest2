package com.inmobi.media;

/* renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3730g7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f7117a;
    public final float b;
    public final int c;
    public final int d;

    public C3730g7(float f, float f2, int i, int i2) {
        this.f7117a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3730g7)) {
            return false;
        }
        C3730g7 c3730g7 = (C3730g7) obj;
        return Float.compare(this.f7117a, c3730g7.f7117a) == 0 && Float.compare(this.b, c3730g7.b) == 0 && this.c == c3730g7.c && this.d == c3730g7.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, (Float.hashCode(this.b) + (Float.hashCode(this.f7117a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.f7117a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
