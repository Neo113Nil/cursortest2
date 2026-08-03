package com.inmobi.media;

/* loaded from: classes5.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f4807a;
    public final android.graphics.RectF b;
    public final android.graphics.RectF c;
    public final android.graphics.RectF d;

    public L(android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3, android.graphics.RectF rectF4) {
        this.f4807a = rectF;
        this.b = rectF2;
        this.c = rectF3;
        this.d = rectF4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.L)) {
            return false;
        }
        com.inmobi.media.L l = (com.inmobi.media.L) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4807a, l.f4807a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, l.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, l.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, l.d);
    }

    public final int hashCode() {
        android.graphics.RectF rectF = this.f4807a;
        int hashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        android.graphics.RectF rectF2 = this.b;
        int hashCode2 = (hashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        android.graphics.RectF rectF3 = this.c;
        int hashCode3 = (hashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        android.graphics.RectF rectF4 = this.d;
        return hashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CurvedEdges(topLeft=" + this.f4807a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
    }
}
