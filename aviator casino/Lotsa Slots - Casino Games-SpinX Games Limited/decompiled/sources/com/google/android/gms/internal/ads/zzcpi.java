package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcpi {
    private com.google.android.gms.internal.ads.zzcnl zza;
    private com.google.android.gms.internal.ads.zzcqf zzb;
    private com.google.android.gms.internal.ads.zzfpo zzc;
    private com.google.android.gms.internal.ads.zzcqt zzd;
    private com.google.android.gms.internal.ads.zzfmb zze;

    private zzcpi() {
        throw null;
    }

    /* synthetic */ zzcpi(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzcpi zza(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcpi zzb(com.google.android.gms.internal.ads.zzcqf zzcqfVar) {
        this.zzb = zzcqfVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcnj zzc() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zza, com.google.android.gms.internal.ads.zzcnl.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, com.google.android.gms.internal.ads.zzcqf.class);
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.ads.zzfpo();
        }
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.ads.zzcqt();
        }
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.ads.zzfmb();
        }
        return new com.google.android.gms.internal.ads.zzcox(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
