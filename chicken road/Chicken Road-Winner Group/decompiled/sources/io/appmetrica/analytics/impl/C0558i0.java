package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7468b;

    public C0558i0(String str, long j3) {
        this.f7467a = str;
        this.f7468b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0558i0.class == obj.getClass()) {
            C0558i0 c0558i0 = (C0558i0) obj;
            if (this.f7468b != c0558i0.f7468b) {
                return false;
            }
            String str = this.f7467a;
            String str2 = c0558i0.f7467a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7467a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.f7468b;
        return (hashCode * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }
}
