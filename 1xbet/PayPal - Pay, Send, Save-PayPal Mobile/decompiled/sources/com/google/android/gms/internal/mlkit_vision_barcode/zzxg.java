package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzxg extends com.google.android.gms.internal.mlkit_vision_barcode.zzxn {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzxn)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzxn zzxnVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxn) obj;
        if (java.lang.Float.floatToIntBits(this.zza) != java.lang.Float.floatToIntBits(zzxnVar.zzc()) || java.lang.Float.floatToIntBits(this.zzb) != java.lang.Float.floatToIntBits(zzxnVar.zze()) || java.lang.Float.floatToIntBits(this.zzc) != java.lang.Float.floatToIntBits(zzxnVar.zzb()) || java.lang.Float.floatToIntBits(this.zzd) != java.lang.Float.floatToIntBits(zzxnVar.zzd())) {
            return false;
        }
        int floatToIntBits = java.lang.Float.floatToIntBits(0.0f);
        zzxnVar.zza();
        return floatToIntBits == java.lang.Float.floatToIntBits(0.0f);
    }

    public final int hashCode() {
        int floatToIntBits = java.lang.Float.floatToIntBits(this.zza);
        int floatToIntBits2 = java.lang.Float.floatToIntBits(this.zzb);
        return ((((((((floatToIntBits ^ 1000003) * 1000003) ^ floatToIntBits2) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzc)) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzd)) * 1000003) ^ java.lang.Float.floatToIntBits(0.0f);
    }

    public final java.lang.String toString() {
        return "PredictedArea{xMin=" + this.zza + ", yMin=" + this.zzb + ", xMax=" + this.zzc + ", yMax=" + this.zzd + ", confidenceScore=0.0}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zza() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxn
    final float zzb() {
        return this.zzc;
    }

    zzxg(float f, float f2, float f3, float f4, float f5) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
        this.zzd = f4;
    }
}
