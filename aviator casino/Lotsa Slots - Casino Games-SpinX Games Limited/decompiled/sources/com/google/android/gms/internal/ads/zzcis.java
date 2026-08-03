package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcis extends com.google.android.gms.ads.internal.util.zzb {
    final com.google.android.gms.internal.ads.zzchn zza;
    final com.google.android.gms.internal.ads.zzcja zzb;
    private final java.lang.String zzc;
    private final java.lang.String[] zzd;

    zzcis(com.google.android.gms.internal.ads.zzchn zzchnVar, com.google.android.gms.internal.ads.zzcja zzcjaVar, java.lang.String str, java.lang.String[] strArr) {
        this.zza = zzchnVar;
        this.zzb = zzcjaVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzciq(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcH)).booleanValue() && (this.zzb instanceof com.google.android.gms.internal.ads.zzcjj)) ? com.google.android.gms.internal.ads.zzcfr.zzf.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzcir
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzcis.this.zze();
            }
        }) : super.zzb();
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Boolean zze() {
        return java.lang.Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}
