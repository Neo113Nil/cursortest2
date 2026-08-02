package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class g extends com.iovation.mobile.android.b.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3931a;

    public g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f3931a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.iovation.mobile.android.b.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3931a, ((com.iovation.mobile.android.b.g) obj).f3931a);
    }

    public final int hashCode() {
        return this.f3931a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(failureReason=");
        sb.append(this.f3931a);
        sb.append(')');
        return sb.toString();
    }
}
