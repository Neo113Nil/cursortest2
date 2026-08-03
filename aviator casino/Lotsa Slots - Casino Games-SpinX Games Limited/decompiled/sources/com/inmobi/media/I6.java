package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I6 {

    /* renamed from: a, reason: collision with root package name */
    public final float f4758a;
    public final com.inmobi.media.J6 b;
    public final java.util.ArrayList c;

    public I6(float f, com.inmobi.media.J6 j6, java.util.ArrayList arrayList) {
        this.f4758a = f;
        this.b = j6;
        this.c = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.I6)) {
            return false;
        }
        com.inmobi.media.I6 i6 = (com.inmobi.media.I6) obj;
        return java.lang.Float.compare(this.f4758a, i6.f4758a) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.b, i6.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, i6.c);
    }

    public final int hashCode() {
        int floatToIntBits = java.lang.Float.floatToIntBits(this.f4758a) * 31;
        com.inmobi.media.J6 j6 = this.b;
        int hashCode = (floatToIntBits + (j6 == null ? 0 : j6.hashCode())) * 31;
        java.util.ArrayList arrayList = this.c;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f4758a + ", visibleRectangle=" + this.b + ", occlusionRectangles=" + this.c + ")";
    }
}
