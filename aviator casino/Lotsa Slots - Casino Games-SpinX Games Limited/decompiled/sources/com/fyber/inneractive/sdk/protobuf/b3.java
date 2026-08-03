package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class b3 implements java.util.Map.Entry, java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Comparable f4179a;
    public java.lang.Object b;
    public final /* synthetic */ com.fyber.inneractive.sdk.protobuf.e3 c;

    public b3(com.fyber.inneractive.sdk.protobuf.e3 e3Var, java.util.Map.Entry entry) {
        java.lang.Comparable comparable = (java.lang.Comparable) entry.getKey();
        java.lang.Object value = entry.getValue();
        this.c = e3Var;
        this.f4179a = comparable;
        this.b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f4179a.compareTo(((com.fyber.inneractive.sdk.protobuf.b3) obj).f4179a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Comparable comparable = this.f4179a;
        java.lang.Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            java.lang.Object obj2 = this.b;
            java.lang.Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f4179a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.f4179a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.b;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.c.a();
        java.lang.Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return this.f4179a + com.ironsource.X3.j.b + this.b;
    }

    public b3(com.fyber.inneractive.sdk.protobuf.e3 e3Var, java.lang.Comparable comparable, java.lang.Object obj) {
        this.c = e3Var;
        this.f4179a = comparable;
        this.b = obj;
    }
}
