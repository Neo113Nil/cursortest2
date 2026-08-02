package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzbs implements java.io.Serializable, com.google.android.gms.internal.fido.zzbp {
    final java.lang.Object zza;

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.fido.zzbs) {
            return com.google.android.gms.internal.fido.zzbk.zza(this.zza, ((com.google.android.gms.internal.fido.zzbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zza});
    }

    public final java.lang.String toString() {
        return "Suppliers.ofInstance(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.fido.zzbp
    public final java.lang.Object zza() {
        return this.zza;
    }

    zzbs(java.lang.Object obj) {
        this.zza = obj;
    }
}
