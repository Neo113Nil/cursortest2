package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzrv extends com.google.android.gms.internal.mlkit_common.zzsi {
    private com.google.android.gms.internal.mlkit_common.zzmu zza;
    private java.lang.String zzb;
    private boolean zzc;
    private boolean zzd;
    private com.google.mlkit.common.sdkinternal.ModelType zze;
    private com.google.android.gms.internal.mlkit_common.zzna zzf;
    private int zzg;
    private byte zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zza(com.google.android.gms.internal.mlkit_common.zzna zznaVar) {
        if (zznaVar == null) {
            throw new java.lang.NullPointerException("Null downloadStatus");
        }
        this.zzf = zznaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzb(com.google.android.gms.internal.mlkit_common.zzmu zzmuVar) {
        if (zzmuVar == null) {
            throw new java.lang.NullPointerException("Null errorCode");
        }
        this.zza = zzmuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzd(com.google.mlkit.common.sdkinternal.ModelType modelType) {
        if (modelType == null) {
            throw new java.lang.NullPointerException("Null modelType");
        }
        this.zze = modelType;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsj zzh() {
        com.google.android.gms.internal.mlkit_common.zzmu zzmuVar;
        java.lang.String str;
        com.google.mlkit.common.sdkinternal.ModelType modelType;
        com.google.android.gms.internal.mlkit_common.zzna zznaVar;
        if (this.zzh == 7 && (zzmuVar = this.zza) != null && (str = this.zzb) != null && (modelType = this.zze) != null && (zznaVar = this.zzf) != null) {
            return new com.google.android.gms.internal.mlkit_common.zzrx(zzmuVar, str, this.zzc, this.zzd, modelType, zznaVar, this.zzg, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" errorCode");
        }
        if (this.zzb == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb.append(" modelType");
        }
        if (this.zzf == null) {
            sb.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final com.google.android.gms.internal.mlkit_common.zzsi zzg(java.lang.String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzf(boolean z) {
        this.zzc = z;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zze(boolean z) {
        this.zzd = z;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final com.google.android.gms.internal.mlkit_common.zzsi zzc(int i) {
        this.zzg = i;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    zzrv() {
    }
}
