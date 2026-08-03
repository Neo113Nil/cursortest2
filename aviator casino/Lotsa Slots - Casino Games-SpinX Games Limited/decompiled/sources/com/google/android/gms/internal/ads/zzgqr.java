package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqr extends com.google.android.gms.internal.ads.zzgrs {
    private android.os.IBinder zza;
    private java.lang.String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private java.lang.String zzf;
    private byte zzg;

    zzgqr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            throw new java.lang.NullPointerException("Null windowToken");
        }
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zzc(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zzd(float f) {
        this.zzd = f;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zze(int i) {
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zzf(int i) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zzg(int i) {
        this.zze = i;
        this.zzg = (byte) (this.zzg | com.google.common.base.Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrs zzh(java.lang.String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrs
    public final com.google.android.gms.internal.ads.zzgrt zzi() {
        android.os.IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new com.google.android.gms.internal.ads.zzgqs(iBinder, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.zzg & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.zzg & com.google.common.base.Ascii.DLE) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
