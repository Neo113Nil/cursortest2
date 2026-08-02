package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class j2 extends com.dyneti.android.dyscan.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.n1 f3315a;

    public j2(com.dyneti.android.dyscan.n1 n1Var) {
        this.f3315a = n1Var;
    }

    @Override // com.dyneti.android.dyscan.k2
    public final boolean a() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(imageUploadResult=");
        sb.append(this.f3315a);
        sb.append(", isSuccess=true, isFailure=false)");
        return sb.toString();
    }

    public final int hashCode() {
        com.dyneti.android.dyscan.n1 n1Var = this.f3315a;
        return java.lang.Boolean.hashCode(false) + ((java.lang.Boolean.hashCode(true) + ((n1Var == null ? 0 : n1Var.hashCode()) * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.dyneti.android.dyscan.j2) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3315a, ((com.dyneti.android.dyscan.j2) obj).f3315a);
    }
}
