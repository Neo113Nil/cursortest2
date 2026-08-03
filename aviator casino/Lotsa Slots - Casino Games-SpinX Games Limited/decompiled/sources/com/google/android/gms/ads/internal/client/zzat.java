package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzat extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzaw zzb;

    zzat(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.content.Context context) {
        this.zza = context;
        java.util.Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zza, "mobile_ads_settings");
        return new com.google.android.gms.ads.internal.client.zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmd)).booleanValue()) {
            return this.zzb.zzo().zza(this.zza);
        }
        try {
            android.os.IBinder zze = ((com.google.android.gms.ads.internal.client.zzcz) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", com.google.android.gms.ads.internal.client.zzas.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcy ? (com.google.android.gms.ads.internal.client.zzcy) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcw(zze);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar = this.zzb;
            zzawVar.zzs(com.google.android.gms.internal.ads.zzbzy.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
    }
}
