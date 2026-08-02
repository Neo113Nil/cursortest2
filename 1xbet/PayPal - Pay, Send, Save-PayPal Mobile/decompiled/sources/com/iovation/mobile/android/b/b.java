package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class b extends com.iovation.mobile.android.b.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3927a;

    public b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f3927a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.iovation.mobile.android.b.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3927a, ((com.iovation.mobile.android.b.b) obj).f3927a);
    }

    public final int hashCode() {
        return this.f3927a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(failure=");
        sb.append(this.f3927a);
        sb.append(')');
        return sb.toString();
    }
}
