package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzwb extends com.google.android.gms.internal.mlkit_vision_barcode.zzwg {
    private java.lang.String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwg
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzwh zzd() {
        java.lang.String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new com.google.android.gms.internal.mlkit_vision_barcode.zzwd(str, this.zzb, this.zzc, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzwg zzc(java.lang.String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwg
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzwg zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwg
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzwg zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    zzwb() {
    }
}
