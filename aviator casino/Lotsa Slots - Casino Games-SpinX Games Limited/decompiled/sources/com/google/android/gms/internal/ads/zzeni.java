package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeni extends com.google.android.gms.internal.ads.zzcbz implements com.google.android.gms.internal.ads.zzdeb {
    private com.google.android.gms.internal.ads.zzcca zza;
    private com.google.android.gms.internal.ads.zzdea zzb;
    private com.google.android.gms.internal.ads.zzdlj zzc;

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zza(com.google.android.gms.internal.ads.zzdea zzdeaVar) {
        this.zzb = zzdeaVar;
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzcca zzccaVar) {
        this.zza = zzccaVar;
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzdlj zzdljVar) {
        this.zzc = zzdljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdlj zzdljVar = this.zzc;
        if (zzdljVar != null) {
            final com.google.android.gms.internal.ads.zzelv zzelvVar = ((com.google.android.gms.internal.ads.zzeqi) zzdljVar).zzc;
            final com.google.android.gms.internal.ads.zzfkf zzfkfVar = ((com.google.android.gms.internal.ads.zzeqi) zzdljVar).zzb;
            final com.google.android.gms.internal.ads.zzfkq zzfkqVar = ((com.google.android.gms.internal.ads.zzeqi) zzdljVar).zza;
            final com.google.android.gms.internal.ads.zzeqi zzeqiVar = (com.google.android.gms.internal.ads.zzeqi) zzdljVar;
            ((com.google.android.gms.internal.ads.zzeqi) zzdljVar).zzd.zzc().execute(new java.lang.Runnable(zzeqiVar, zzfkqVar, zzfkfVar, zzelvVar) { // from class: com.google.android.gms.internal.ads.zzeqh
                private final /* synthetic */ com.google.android.gms.internal.ads.zzfkq zza;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzb;
                private final /* synthetic */ com.google.android.gms.internal.ads.zzelv zzc;

                {
                    this.zza = zzfkqVar;
                    this.zzb = zzfkfVar;
                    this.zzc = zzelvVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzeql.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdlj zzdljVar = this.zzc;
        if (zzdljVar != null) {
            java.lang.String str = ((com.google.android.gms.internal.ads.zzeqi) zzdljVar).zzc.zza;
            java.lang.String.valueOf(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            zzccaVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzccb zzccbVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zzd.zzb(zzccbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((com.google.android.gms.internal.ads.zzeqk) zzccaVar).zzd.zzb(null);
        }
    }
}
