package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzag implements com.google.android.gms.internal.measurement.zzao {
    private final com.google.android.gms.internal.measurement.zzao zza;
    private final java.lang.String zzb;

    public zzag() {
        this.zza = zzf;
        this.zzb = "return";
    }

    public zzag(java.lang.String str) {
        this.zza = zzf;
        this.zzb = str;
    }

    public zzag(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        this.zza = zzaoVar;
        this.zzb = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzag)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzag zzagVar = (com.google.android.gms.internal.measurement.zzag) obj;
        return this.zzb.equals(zzagVar.zzb) && this.zza.equals(zzagVar.zza);
    }

    public final int hashCode() {
        return (this.zzb.hashCode() * 31) + this.zza.hashCode();
    }

    public final com.google.android.gms.internal.measurement.zzao zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        throw new java.lang.IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        throw new java.lang.IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        throw new java.lang.IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        throw new java.lang.IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return null;
    }

    public final java.lang.String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return new com.google.android.gms.internal.measurement.zzag(this.zzb, this.zza.zzt());
    }
}
