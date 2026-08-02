package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzxd extends com.google.android.gms.internal.mlkit_vision_barcode.zzxl {
    private int zza;
    private int zzb;
    private float zzc;
    private float zzd;
    private boolean zze;
    private float zzf;
    private float zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private float zzk;
    private float zzl;
    private short zzm;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxm zzm() {
        if (this.zzm == 4095) {
            return new com.google.android.gms.internal.mlkit_vision_barcode.zzxf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.zzm & 1) == 0) {
            sb.append(" recentFramesToCheck");
        }
        if ((this.zzm & 2) == 0) {
            sb.append(" recentFramesContainingPredictedArea");
        }
        if ((this.zzm & 4) == 0) {
            sb.append(" recentFramesIou");
        }
        if ((this.zzm & 8) == 0) {
            sb.append(" maxCoverage");
        }
        if ((this.zzm & 16) == 0) {
            sb.append(" useConfidenceScore");
        }
        if ((this.zzm & 32) == 0) {
            sb.append(" lowerConfidenceScore");
        }
        if ((this.zzm & 64) == 0) {
            sb.append(" higherConfidenceScore");
        }
        if ((this.zzm & 128) == 0) {
            sb.append(" zoomIntervalInMillis");
        }
        if ((this.zzm & com.visa.cbp.getEncExpo.initializeViewTreeOwners) == 0) {
            sb.append(" resetIntervalInMillis");
        }
        if ((this.zzm & 512) == 0) {
            sb.append(" enableZoomThreshold");
        }
        if ((this.zzm & 1024) == 0) {
            sb.append(" zoomInThreshold");
        }
        if ((this.zzm & 2048) == 0) {
            sb.append(" zoomOutThreshold");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzl(float f) {
        this.zzl = 0.05f;
        this.zzm = (short) (this.zzm | 2048);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzk(long j) {
        this.zzh = 1500L;
        this.zzm = (short) (this.zzm | 128);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzj(float f) {
        this.zzk = 0.1f;
        this.zzm = (short) (this.zzm | 1024);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzi(boolean z) {
        this.zze = z;
        this.zzm = (short) (this.zzm | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzh(long j) {
        this.zzi = 3000L;
        this.zzm = (short) (this.zzm | com.visa.cbp.getEncExpo.initializeViewTreeOwners);
        return this;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzg(int i) {
        this.zza = 10;
        this.zzm = (short) (this.zzm | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzf(float f) {
        this.zzc = 0.25f;
        this.zzm = (short) (this.zzm | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zze(int i) {
        this.zzb = 5;
        this.zzm = (short) (this.zzm | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzd(float f) {
        this.zzd = 0.8f;
        this.zzm = (short) (this.zzm | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzc(float f) {
        this.zzf = 0.5f;
        this.zzm = (short) (this.zzm | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zzb(float f) {
        this.zzg = 0.8f;
        this.zzm = (short) (this.zzm | 64);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxl
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxl zza(boolean z) {
        this.zzj = true;
        this.zzm = (short) (this.zzm | 512);
        return this;
    }

    zzxd() {
    }
}
