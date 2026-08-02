package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzdn implements java.io.Serializable, com.google.android.gms.internal.auth.zzdj {
    final java.lang.Object zza;

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.auth.zzdn)) {
            return false;
        }
        java.lang.Object obj2 = this.zza;
        java.lang.Object obj3 = ((com.google.android.gms.internal.auth.zzdn) obj).zza;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zza});
    }

    public final java.lang.String toString() {
        return "Suppliers.ofInstance(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final java.lang.Object zza() {
        return this.zza;
    }

    zzdn(java.lang.Object obj) {
        this.zza = obj;
    }
}
