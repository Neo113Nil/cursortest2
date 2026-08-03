package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzenb implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcwq zzb;
    private android.view.View zzc;
    private com.google.android.gms.internal.ads.zzbvl zzd;

    public zzenb(android.content.Context context, com.google.android.gms.internal.ads.zzcwq zzcwqVar) {
        this.zza = context;
        this.zzb = zzcwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        try {
            com.google.android.gms.internal.ads.zzbxb zzbxbVar = (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb;
            zzbxbVar.zzo(zzfkfVar.zzZ);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && zzfkfVar.zzag) {
                java.lang.String str = zzfkfVar.zzU;
                java.lang.String jSONObject = zzfkfVar.zzv.toString();
                com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
                zzbxbVar.zzq(str, jSONObject, zzfkyVar.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzena(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc, zzfkyVar.zzf);
                return;
            }
            java.lang.String str2 = zzfkfVar.zzU;
            java.lang.String jSONObject2 = zzfkfVar.zzv.toString();
            com.google.android.gms.internal.ads.zzfky zzfkyVar2 = zzfkqVar.zza.zza;
            zzbxbVar.zzi(str2, jSONObject2, zzfkyVar2.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzena(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc, zzfkyVar2.zzf);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.internal.ads.zzflf(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        final android.view.View view;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && zzfkfVar.zzag) {
            try {
                view = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new com.google.android.gms.internal.ads.zzflf(new java.lang.Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (android.view.View) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzemy
                            @Override // com.google.android.gms.internal.ads.zzhbe
                            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return com.google.android.gms.internal.ads.zzenb.this.zzc(view, zzfkfVar, obj);
                            }
                        }, com.google.android.gms.internal.ads.zzcfr.zzf).get();
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                        throw new com.google.android.gms.internal.ads.zzflf(e);
                    }
                }
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.gms.internal.ads.zzflf(e2);
            }
        } else {
            view = this.zzc;
        }
        com.google.android.gms.internal.ads.zzcvm zzf2 = this.zzb.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzcvs(view, null, new com.google.android.gms.internal.ads.zzcxr() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzcxr
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                try {
                    return ((com.google.android.gms.internal.ads.zzbxb) com.google.android.gms.internal.ads.zzelv.this.zzb).zzh();
                } catch (android.os.RemoteException e3) {
                    throw new com.google.android.gms.internal.ads.zzflf(e3);
                }
            }
        }, (com.google.android.gms.internal.ads.zzfkg) zzfkfVar.zzu.get(0)));
        zzf2.zzk().zza(view);
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzf2.zzg());
        return zzf2.zzi();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.view.View view, com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.internal.ads.zzcxf.zza(this.zza, view, zzfkfVar));
    }

    final /* synthetic */ void zzd(android.view.View view) {
        this.zzc = view;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbvl zzbvlVar) {
        this.zzd = zzbvlVar;
    }
}
