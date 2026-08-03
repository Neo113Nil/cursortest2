package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzar extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvc zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzaw zzc;

    zzar(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        this.zza = context;
        this.zzb = zzbvcVar;
        java.util.Objects.requireNonNull(zzawVar);
        this.zzc = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzch zzcfVar;
        android.content.Context context = this.zza;
        com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmd)).booleanValue()) {
            return this.zzc.zzt().zza(this.zza, this.zzb);
        }
        try {
            com.google.android.gms.ads.internal.client.zzci zzciVar = (com.google.android.gms.ads.internal.client.zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", com.google.android.gms.ads.internal.client.zzaq.zza);
            com.google.android.gms.internal.ads.zzbvc zzbvcVar = this.zzb;
            android.os.IBinder zze = zzciVar.zze(wrap, zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                zzcfVar = null;
            } else {
                android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzch ? (com.google.android.gms.ads.internal.client.zzch) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcf(zze);
            }
            zzcfVar.zzl(zzbvcVar);
            return zzcfVar;
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar = this.zzc;
            zzawVar.zzs(com.google.android.gms.internal.ads.zzbzy.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
    }
}
