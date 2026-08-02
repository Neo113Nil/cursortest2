package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class m1 extends com.dyneti.android.dyscan.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f3324a;

    public m1(java.lang.Boolean bool) {
        this.f3324a = bool;
    }

    @Override // com.dyneti.android.dyscan.n1
    public final boolean a() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(isGenerated=");
        sb.append(this.f3324a);
        sb.append(", isSuccess=true, isFailure=false)");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.f3324a;
        return java.lang.Boolean.hashCode(false) + ((java.lang.Boolean.hashCode(true) + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.dyneti.android.dyscan.m1) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3324a, ((com.dyneti.android.dyscan.m1) obj).f3324a);
    }
}
