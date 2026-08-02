package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class c extends com.iovation.mobile.android.b.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f3928a;

    public c(java.util.List list) {
        this.f3928a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.iovation.mobile.android.b.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3928a, ((com.iovation.mobile.android.b.c) obj).f3928a);
    }

    public final int hashCode() {
        java.util.List list = this.f3928a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(addresses=");
        sb.append(this.f3928a);
        sb.append(')');
        return sb.toString();
    }
}
