package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class m extends com.iovation.mobile.android.b.o {

    /* renamed from: a, reason: collision with root package name */
    public final android.location.Location f3936a;

    public m(android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        this.f3936a = location;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.iovation.mobile.android.b.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3936a, ((com.iovation.mobile.android.b.m) obj).f3936a);
    }

    public final int hashCode() {
        return this.f3936a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RetrievedLocation(location=");
        sb.append(this.f3936a);
        sb.append(')');
        return sb.toString();
    }
}
