package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfsv extends com.google.android.gms.internal.ads.zzfub {
    public zzfsv(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfoo zzfooVar, com.google.android.gms.internal.ads.zzfsw zzfswVar, com.google.android.gms.common.util.Clock clock) {
        super(clientApi, context, i, zzfluVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfooVar, zzfswVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final com.google.common.util.concurrent.ListenableFuture zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzbvc zzd = this.zzd.zzd();
        if (zzd == null) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzfso(1, "Failed to create an app open ad manager."));
        }
        com.google.android.gms.internal.ads.zzfgm zzfgmVar = (com.google.android.gms.internal.ads.zzfgm) this.zza.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzd, this.zzc);
        if (zzfgmVar == null) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzfso(1, "Failed to create an app open ad manager."));
        }
        com.google.android.gms.internal.ads.zzhcp zze = com.google.android.gms.internal.ads.zzhcp.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzf;
            if (zzfsnVar != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzT)).booleanValue()) {
                    zzfgmVar.zzL(new com.google.android.gms.internal.ads.zzfsy(zzfsnVar, this.zzi, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzW)).longValue(), this));
                }
            }
            zzfgmVar.zzJ(new com.google.android.gms.internal.ads.zzfsu(new com.google.android.gms.internal.ads.zzfto(this, zze), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza));
            zzfgmVar.zze(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            return zze;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e);
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzfso(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final long zzb() {
        return ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzS)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(java.lang.Object obj) {
        try {
            return ((com.google.android.gms.internal.ads.zzbgj) obj).zzg();
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e);
            return null;
        }
    }

    public zzfsv(java.lang.String str, com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfoo zzfooVar, com.google.android.gms.internal.ads.zzfsw zzfswVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfsn zzfsnVar) {
        super(str, clientApi, context, i, zzfluVar, zzfpVar, zzceVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, zzfsnVar);
    }
}
