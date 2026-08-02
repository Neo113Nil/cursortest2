package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class i2 extends com.dyneti.android.dyscan.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Exception f3312a;

    public i2(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        this.f3312a = exc;
    }

    @Override // com.dyneti.android.dyscan.k2
    public final boolean a() {
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(exception=");
        sb.append(this.f3312a);
        sb.append(", isSuccess=false, isFailure=true)");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.f3312a.hashCode();
        return java.lang.Boolean.hashCode(true) + ((java.lang.Boolean.hashCode(false) + (hashCode * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.dyneti.android.dyscan.i2) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3312a, ((com.dyneti.android.dyscan.i2) obj).f3312a);
    }
}
