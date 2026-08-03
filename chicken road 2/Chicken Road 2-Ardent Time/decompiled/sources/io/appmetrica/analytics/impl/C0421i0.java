package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6067a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6068b;

    public C0421i0(java.lang.String str, long j2) {
        this.f6067a = str;
        this.f6068b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.C0421i0.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0421i0 c0421i0 = (io.appmetrica.analytics.impl.C0421i0) obj;
        if (this.f6068b != c0421i0.f6068b) {
            return false;
        }
        java.lang.String str = this.f6067a;
        java.lang.String str2 = c0421i0.f6067a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f6067a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f6068b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
