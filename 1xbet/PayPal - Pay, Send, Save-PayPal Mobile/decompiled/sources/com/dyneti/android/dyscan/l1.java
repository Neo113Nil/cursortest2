package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class l1 extends com.dyneti.android.dyscan.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.RuntimeException f3320a;

    public l1(java.lang.RuntimeException runtimeException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runtimeException, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runtimeException, "");
        this.f3320a = runtimeException;
    }

    @Override // com.dyneti.android.dyscan.n1
    public final boolean a() {
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(exception=");
        sb.append(this.f3320a);
        sb.append(", isSuccess=false, isFailure=true)");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.f3320a.hashCode();
        return java.lang.Boolean.hashCode(true) + ((java.lang.Boolean.hashCode(false) + (hashCode * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.dyneti.android.dyscan.l1) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3320a, ((com.dyneti.android.dyscan.l1) obj).f3320a);
    }
}
