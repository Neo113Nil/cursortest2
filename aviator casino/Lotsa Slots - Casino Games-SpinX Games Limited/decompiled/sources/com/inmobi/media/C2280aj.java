package com.inmobi.media;

/* renamed from: com.inmobi.media.aj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2280aj {

    /* renamed from: a, reason: collision with root package name */
    public final int f5107a;
    public final int b;
    public final int c;

    public C2280aj(int i, int i2, int i3) {
        this.f5107a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2280aj)) {
            return false;
        }
        com.inmobi.media.C2280aj c2280aj = (com.inmobi.media.C2280aj) obj;
        return this.f5107a == c2280aj.f5107a && this.b == c2280aj.b && this.c == c2280aj.c;
    }

    public final int hashCode() {
        return this.c + com.inmobi.media.AbstractC2755si.a(this.b, this.f5107a * 31, 31);
    }

    public final java.lang.String toString() {
        return "SemVer(major=" + this.f5107a + ", minor=" + this.b + ", patch=" + this.c + ")";
    }
}
