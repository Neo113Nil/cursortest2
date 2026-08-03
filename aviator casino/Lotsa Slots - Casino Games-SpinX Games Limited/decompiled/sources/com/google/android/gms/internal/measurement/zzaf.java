package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzaf implements com.google.android.gms.internal.measurement.zzao {
    private final boolean zza;

    public zzaf(java.lang.Boolean bool) {
        this.zza = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.internal.measurement.zzaf) && this.zza == ((com.google.android.gms.internal.measurement.zzaf) obj).zza;
    }

    public final int hashCode() {
        return java.lang.Boolean.valueOf(this.zza).hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        return java.lang.Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        if ("toString".equals(str)) {
            return new com.google.android.gms.internal.measurement.zzas(java.lang.Boolean.toString(this.zza));
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s.%s is not a function.", java.lang.Boolean.toString(this.zza), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        return java.lang.Double.valueOf(true != this.zza ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        return java.lang.Boolean.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return new com.google.android.gms.internal.measurement.zzaf(java.lang.Boolean.valueOf(this.zza));
    }
}
