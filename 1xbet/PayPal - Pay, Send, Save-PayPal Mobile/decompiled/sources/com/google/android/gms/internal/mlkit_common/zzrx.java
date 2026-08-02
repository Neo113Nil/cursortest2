package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzrx extends com.google.android.gms.internal.mlkit_common.zzsj {
    private final com.google.android.gms.internal.mlkit_common.zzmu zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final com.google.mlkit.common.sdkinternal.ModelType zze;
    private final com.google.android.gms.internal.mlkit_common.zzna zzf;
    private final int zzg;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_common.zzsj)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_common.zzsj zzsjVar = (com.google.android.gms.internal.mlkit_common.zzsj) obj;
        return this.zza.equals(zzsjVar.zzc()) && this.zzb.equals(zzsjVar.zze()) && this.zzc == zzsjVar.zzg() && this.zzd == zzsjVar.zzf() && this.zze.equals(zzsjVar.zzb()) && this.zzf.equals(zzsjVar.zzd()) && this.zzg == zzsjVar.zza();
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        int i = true != this.zzc ? 1237 : 1231;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.mlkit_common.zzna zznaVar = this.zzf;
        com.google.mlkit.common.sdkinternal.ModelType modelType = this.zze;
        return "RemoteModelLoggingOptions{errorCode=" + this.zza.toString() + ", tfliteSchemaVersion=" + this.zzb + ", shouldLogRoughDownloadTime=" + this.zzc + ", shouldLogExactDownloadTime=" + this.zzd + ", modelType=" + modelType.toString() + ", downloadStatus=" + zznaVar.toString() + ", failureStatusCode=" + this.zzg + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final java.lang.String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.android.gms.internal.mlkit_common.zzna zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.android.gms.internal.mlkit_common.zzmu zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final com.google.mlkit.common.sdkinternal.ModelType zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.zzg;
    }

    /* synthetic */ zzrx(com.google.android.gms.internal.mlkit_common.zzmu zzmuVar, java.lang.String str, boolean z, boolean z2, com.google.mlkit.common.sdkinternal.ModelType modelType, com.google.android.gms.internal.mlkit_common.zzna zznaVar, int i, com.google.android.gms.internal.mlkit_common.zzrw zzrwVar) {
        this.zza = zzmuVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = modelType;
        this.zzf = zznaVar;
        this.zzg = i;
    }
}
