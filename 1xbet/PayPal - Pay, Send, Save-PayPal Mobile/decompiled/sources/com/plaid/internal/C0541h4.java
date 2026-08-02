package com.plaid.internal;

/* renamed from: com.plaid.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0541h4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6428a;
    public final java.lang.String b;

    public C0541h4(int i, java.lang.String str) {
        this.f6428a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.C0541h4)) {
            return false;
        }
        com.plaid.internal.C0541h4 c0541h4 = (com.plaid.internal.C0541h4) obj;
        return this.f6428a == c0541h4.f6428a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0541h4.b);
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f6428a);
        java.lang.String str = this.b;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkRequestResult(status=");
        sb.append(this.f6428a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
