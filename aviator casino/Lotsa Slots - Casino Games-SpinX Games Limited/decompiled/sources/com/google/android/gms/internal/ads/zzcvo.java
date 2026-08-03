package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcvo extends com.google.android.gms.internal.ads.zzcvl {
    private final android.content.Context zzc;
    private final android.view.View zzd;
    private final com.google.android.gms.internal.ads.zzcku zze;
    private final com.google.android.gms.internal.ads.zzfkg zzf;
    private final com.google.android.gms.internal.ads.zzcxr zzg;
    private final com.google.android.gms.internal.ads.zzdqd zzh;
    private final com.google.android.gms.internal.ads.zzdla zzi;
    private final com.google.android.gms.internal.ads.zzimo zzj;
    private final java.util.concurrent.Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    zzcvo(com.google.android.gms.internal.ads.zzcxs zzcxsVar, android.content.Context context, com.google.android.gms.internal.ads.zzfkg zzfkgVar, android.view.View view, com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzcxr zzcxrVar, com.google.android.gms.internal.ads.zzdqd zzdqdVar, com.google.android.gms.internal.ads.zzdla zzdlaVar, com.google.android.gms.internal.ads.zzimo zzimoVar, java.util.concurrent.Executor executor) {
        super(zzcxsVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzckuVar;
        this.zzf = zzfkgVar;
        this.zzg = zzcxrVar;
        this.zzh = zzdqdVar;
        this.zzi = zzdlaVar;
        this.zzj = zzimoVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final android.view.View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzb(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (viewGroup == null || (zzckuVar = this.zze) == null) {
            return;
        }
        zzckuVar.zzaf(com.google.android.gms.internal.ads.zzcne.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final com.google.android.gms.ads.internal.client.zzea zzc() {
        try {
            return this.zzg.zza();
        } catch (com.google.android.gms.internal.ads.zzflf unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final com.google.android.gms.internal.ads.zzfkg zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return com.google.android.gms.internal.ads.zzfle.zzb(zzrVar);
        }
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzb;
        if (zzfkfVar.zzac) {
            for (java.lang.String str : zzfkfVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            android.view.View view = this.zzd;
            return new com.google.android.gms.internal.ads.zzfkg(view.getWidth(), view.getHeight(), false);
        }
        return (com.google.android.gms.internal.ads.zzfkg) zzfkfVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final com.google.android.gms.internal.ads.zzfkg zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final int zzg() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && this.zzb.zzag) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzja)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzj() {
        this.zzk.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcvn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcvo.this.zzk();
            }
        });
        super.zzj();
    }

    final /* synthetic */ void zzk() {
        com.google.android.gms.internal.ads.zzbnm zzd = this.zzh.zzd();
        if (zzd == null) {
            return;
        }
        try {
            zzd.zze((com.google.android.gms.ads.internal.client.zzbu) this.zzj.zzb(), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc));
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
