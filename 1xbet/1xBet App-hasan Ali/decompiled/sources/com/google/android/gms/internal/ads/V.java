package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final V f11847c = new V(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f11848a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11849b;

    public V(long j5, long j6) {
        this.f11848a = j5;
        this.f11849b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V.class == obj.getClass()) {
            V v4 = (V) obj;
            if (this.f11848a == v4.f11848a && this.f11849b == v4.f11849b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11848a) * 31) + ((int) this.f11849b);
    }

    public final String toString() {
        return "[timeUs=" + this.f11848a + ", position=" + this.f11849b + "]";
    }
}
