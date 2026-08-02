package com.plaid.internal;

/* loaded from: classes16.dex */
public final class A1 extends com.plaid.internal.X {
    public final java.lang.String b;
    public final java.util.Map<java.lang.String, java.lang.String> c;
    public final int d;

    public A1(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.b = str;
        this.c = map;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.A1)) {
            return false;
        }
        com.plaid.internal.A1 a1 = (com.plaid.internal.A1) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.b, a1.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, a1.c) && this.d == a1.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return java.lang.Integer.hashCode(this.d) + ((this.c.hashCode() + (hashCode * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        java.util.Map<java.lang.String, java.lang.String> map = this.c;
        int i = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InformationBreadCrumb(message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(map);
        sb.append(", logLevel=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
