package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjo {
    private final com.google.android.libraries.places.internal.zzbjn zza;
    private final com.google.android.libraries.places.internal.zzbnp zzb;

    private zzbjo(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbjn) com.google.common.base.Preconditions.checkNotNull(zzbjnVar, "state is null");
        this.zzb = (com.google.android.libraries.places.internal.zzbnp) com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status is null");
    }

    public static com.google.android.libraries.places.internal.zzbjo zza(com.google.android.libraries.places.internal.zzbjn zzbjnVar) {
        com.google.common.base.Preconditions.checkArgument(zzbjnVar != com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new com.google.android.libraries.places.internal.zzbjo(zzbjnVar, com.google.android.libraries.places.internal.zzbnp.zza);
    }

    public static com.google.android.libraries.places.internal.zzbjo zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkArgument(!zzbnpVar.zzj(), "The error status must not be OK");
        return new com.google.android.libraries.places.internal.zzbjo(com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE, zzbnpVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbjo)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbjo zzbjoVar = (com.google.android.libraries.places.internal.zzbjo) obj;
        return this.zza.equals(zzbjoVar.zza) && this.zzb.equals(zzbjoVar.zzb);
    }

    public final int hashCode() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzb;
        return zzbnpVar.hashCode() ^ this.zza.hashCode();
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zzb;
        if (zzbnpVar.zzj()) {
            return this.zza.toString();
        }
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(zzbnpVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }

    public final com.google.android.libraries.places.internal.zzbnp zzd() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbjn zzc() {
        return this.zza;
    }
}
