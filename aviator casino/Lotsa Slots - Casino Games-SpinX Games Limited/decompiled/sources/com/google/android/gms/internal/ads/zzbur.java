package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbur {
    private final com.google.android.gms.internal.ads.zzbtu zza;
    private com.google.common.util.concurrent.ListenableFuture zzb;

    zzbur(com.google.android.gms.internal.ads.zzbtu zzbtuVar) {
        this.zza = zzbtuVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
            this.zzb = zzcfwVar;
            this.zza.zzb(null).zze(new com.google.android.gms.internal.ads.zzcga() { // from class: com.google.android.gms.internal.ads.zzbuq
                @Override // com.google.android.gms.internal.ads.zzcga
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    com.google.android.gms.internal.ads.zzcfw.this.zzc((com.google.android.gms.internal.ads.zzbtv) obj);
                }
            }, new com.google.android.gms.internal.ads.zzcfy() { // from class: com.google.android.gms.internal.ads.zzbun
                @Override // com.google.android.gms.internal.ads.zzcfy
                public final /* synthetic */ void zza() {
                    com.google.android.gms.internal.ads.zzcfw.this.zzd(new com.google.android.gms.internal.ads.zzbtx("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final com.google.android.gms.internal.ads.zzbuu zza(java.lang.String str, com.google.android.gms.internal.ads.zzbub zzbubVar, com.google.android.gms.internal.ads.zzbua zzbuaVar) {
        zzd();
        return new com.google.android.gms.internal.ads.zzbuu(this.zzb, "google.afma.activeView.handleUpdate", zzbubVar, zzbuaVar);
    }

    public final void zzb(final java.lang.String str, final com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        zzd();
        this.zzb = com.google.android.gms.internal.ads.zzhbw.zzj(this.zzb, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzbuo
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzbtv zzbtvVar = (com.google.android.gms.internal.ads.zzbtv) obj;
                zzbtvVar.zzm(str, zzbpqVar);
                return com.google.android.gms.internal.ads.zzhbw.zza(zzbtvVar);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    public final void zzc(final java.lang.String str, final com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        this.zzb = com.google.android.gms.internal.ads.zzhbw.zzk(this.zzb, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzbup
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzbtv zzbtvVar = (com.google.android.gms.internal.ads.zzbtv) obj;
                zzbtvVar.zzn(str, zzbpqVar);
                return zzbtvVar;
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }
}
