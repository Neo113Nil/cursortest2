package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzxf extends com.google.android.gms.internal.mlkit_vision_barcode.zzxm {
    private final int zzb;
    private final int zzc;
    private final float zzd;
    private final float zze;
    private final boolean zzf;
    private final float zzg;
    private final float zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final float zzl;
    private final float zzm;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzxm)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzxm zzxmVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxm) obj;
        return this.zzb == zzxmVar.zzh() && this.zzc == zzxmVar.zzg() && java.lang.Float.floatToIntBits(this.zzd) == java.lang.Float.floatToIntBits(zzxmVar.zzd()) && java.lang.Float.floatToIntBits(this.zze) == java.lang.Float.floatToIntBits(zzxmVar.zzc()) && this.zzf == zzxmVar.zzl() && java.lang.Float.floatToIntBits(this.zzg) == java.lang.Float.floatToIntBits(zzxmVar.zzb()) && java.lang.Float.floatToIntBits(this.zzh) == java.lang.Float.floatToIntBits(zzxmVar.zza()) && this.zzi == zzxmVar.zzj() && this.zzj == zzxmVar.zzi() && this.zzk == zzxmVar.zzk() && java.lang.Float.floatToIntBits(this.zzl) == java.lang.Float.floatToIntBits(zzxmVar.zze()) && java.lang.Float.floatToIntBits(this.zzm) == java.lang.Float.floatToIntBits(zzxmVar.zzf());
    }

    public final int hashCode() {
        int i = this.zzb;
        float f = this.zzd;
        int i2 = this.zzc;
        int floatToIntBits = java.lang.Float.floatToIntBits(f);
        int floatToIntBits2 = java.lang.Float.floatToIntBits(this.zze);
        int i3 = true != this.zzf ? 1237 : 1231;
        int floatToIntBits3 = java.lang.Float.floatToIntBits(this.zzg);
        int floatToIntBits4 = java.lang.Float.floatToIntBits(this.zzh);
        int i4 = (int) this.zzi;
        int i5 = (int) this.zzj;
        return ((((((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ floatToIntBits) * 1000003) ^ floatToIntBits2) * 1000003) ^ i3) * 1000003) ^ floatToIntBits3) * 1000003) ^ floatToIntBits4) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzl)) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzm);
    }

    public final java.lang.String toString() {
        return "AutoZoomOptions{recentFramesToCheck=" + this.zzb + ", recentFramesContainingPredictedArea=" + this.zzc + ", recentFramesIou=" + this.zzd + ", maxCoverage=" + this.zze + ", useConfidenceScore=" + this.zzf + ", lowerConfidenceScore=" + this.zzg + ", higherConfidenceScore=" + this.zzh + ", zoomIntervalInMillis=" + this.zzi + ", resetIntervalInMillis=" + this.zzj + ", enableZoomThreshold=" + this.zzk + ", zoomInThreshold=" + this.zzl + ", zoomOutThreshold=" + this.zzm + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final boolean zzl() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final long zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final long zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zze() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    final float zza() {
        return this.zzh;
    }

    /* synthetic */ zzxf(int i, int i2, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6, com.google.android.gms.internal.mlkit_vision_barcode.zzxe zzxeVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
        this.zze = f2;
        this.zzf = z;
        this.zzg = f3;
        this.zzh = f4;
        this.zzi = j;
        this.zzj = j2;
        this.zzk = z2;
        this.zzl = f5;
        this.zzm = f6;
    }
}
