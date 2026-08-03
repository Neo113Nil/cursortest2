package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfxk extends com.google.android.gms.internal.ads.zzfxh {
    private java.lang.String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    zzfxk() {
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zzb(boolean z) {
        this.zzb = z;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zzc(boolean z) {
        this.zzc = true;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zzd(boolean z) {
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zze(long j) {
        this.zzd = 100L;
        this.zzf = (byte) (this.zzf | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zzf(boolean z) {
        this.zzf = (byte) (this.zzf | com.google.common.base.Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxh zzg(long j) {
        this.zze = 300L;
        this.zzf = (byte) (this.zzf | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final com.google.android.gms.internal.ads.zzfxi zzh() {
        java.lang.String str;
        if (this.zzf == 63 && (str = this.zza) != null) {
            return new com.google.android.gms.internal.ads.zzfxl(str, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" clientVersion");
        }
        if ((this.zzf & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.zzf & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.zzf & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.zzf & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.zzf & com.google.common.base.Ascii.DLE) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.zzf & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
