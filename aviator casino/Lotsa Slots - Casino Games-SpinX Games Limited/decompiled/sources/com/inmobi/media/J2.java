package com.inmobi.media;

/* loaded from: classes5.dex */
public final class J2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4774a;
    public final java.lang.String b;
    public final java.util.Map c;

    public J2(int i, int i2, java.lang.String str) {
        str = (i2 & 2) != 0 ? null : str;
        this.f4774a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.J2)) {
            return false;
        }
        com.inmobi.media.J2 j2 = (com.inmobi.media.J2) obj;
        return this.f4774a == j2.f4774a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, j2.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, j2.c);
    }

    public final int hashCode() {
        int i = this.f4774a * 31;
        java.lang.String str = this.b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        java.util.Map map = this.c;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BusEvent(eventId=" + this.f4774a + ", eventMessage=" + this.b + ", eventData=" + this.c + ")";
    }

    public J2(int i, java.lang.String str, java.util.Map map) {
        this.f4774a = i;
        this.b = str;
        this.c = map;
    }
}
