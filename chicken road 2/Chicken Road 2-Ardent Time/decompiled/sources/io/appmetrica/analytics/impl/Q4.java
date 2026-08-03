package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Q4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4859a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4860b;

    public Q4(java.lang.String str, java.lang.String str2) {
        this.f4859a = str;
        this.f4860b = str2;
    }

    public final java.lang.String a() {
        return io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(this.f4860b);
    }

    public final java.lang.String b() {
        return this.f4860b;
    }

    public final java.lang.String c() {
        return this.f4859a;
    }

    public boolean d() {
        return false;
    }

    public java.lang.String e() {
        return this.f4859a + "_" + io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(this.f4860b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.Q4 q4 = (io.appmetrica.analytics.impl.Q4) obj;
        java.lang.String str = this.f4859a;
        if (str == null ? q4.f4859a != null : !str.equals(q4.f4859a)) {
            return false;
        }
        java.lang.String str2 = this.f4860b;
        java.lang.String str3 = q4.f4860b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        java.lang.String str = this.f4859a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f4860b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return this.f4859a + "_" + this.f4860b;
    }
}
