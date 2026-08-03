package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5372a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f5373b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5374c;

    public Z3(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        this.f5372a = str;
        this.f5373b = num;
        this.f5374c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.Z3.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.Z3 z3 = (io.appmetrica.analytics.impl.Z3) obj;
        if (!this.f5372a.equals(z3.f5372a)) {
            return false;
        }
        java.lang.Integer num = this.f5373b;
        if (num == null ? z3.f5373b != null : !num.equals(z3.f5373b)) {
            return false;
        }
        java.lang.String str = this.f5374c;
        java.lang.String str2 = z3.f5374c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f5372a.hashCode() * 31;
        java.lang.Integer num = this.f5373b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        java.lang.String str = this.f5374c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
