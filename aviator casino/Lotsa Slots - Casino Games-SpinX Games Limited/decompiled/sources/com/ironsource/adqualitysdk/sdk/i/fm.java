package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class fm<T> extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final T f2105;

    public fm(T t) {
        this.f2105 = t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        return new com.ironsource.adqualitysdk.sdk.i.ea(this.f2105);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f2105);
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = this.f2105;
            T t2 = ((com.ironsource.adqualitysdk.sdk.i.fm) obj).f2105;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.f2105;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}
