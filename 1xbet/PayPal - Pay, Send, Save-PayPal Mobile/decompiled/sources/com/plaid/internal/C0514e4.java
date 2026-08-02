package com.plaid.internal;

/* renamed from: com.plaid.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0514e4 extends com.plaid.internal.X {
    public final java.lang.String b;
    public final java.util.Map<java.lang.String, java.lang.String> c;
    public final int d;

    public C0514e4(java.util.Map map, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.b = str;
        this.c = map;
        this.d = 4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.C0514e4)) {
            return false;
        }
        com.plaid.internal.C0514e4 c0514e4 = (com.plaid.internal.C0514e4) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0514e4.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0514e4.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        java.util.Map<java.lang.String, java.lang.String> map = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationBreadCrumb(message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
