package com.inmobi.media;

/* loaded from: classes5.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f4826a;
    public final java.util.ArrayList b;
    public final int c;
    public final int d;

    public M(android.graphics.RectF visibleRect, java.util.ArrayList obstructions, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibleRect, "visibleRect");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obstructions, "obstructions");
        this.f4826a = visibleRect;
        this.b = obstructions;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.M)) {
            return false;
        }
        com.inmobi.media.M m = (com.inmobi.media.M) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4826a, m.f4826a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, m.b) && this.c == m.c && this.d == m.d;
    }

    public final int hashCode() {
        return this.d + com.inmobi.media.AbstractC2755si.a(this.c, (this.b.hashCode() + (this.f4826a.hashCode() * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "ExposureInputData(visibleRect=" + this.f4826a + ", obstructions=" + this.b + ", screenWidth=" + this.c + ", screenHeight=" + this.d + ")";
    }
}
