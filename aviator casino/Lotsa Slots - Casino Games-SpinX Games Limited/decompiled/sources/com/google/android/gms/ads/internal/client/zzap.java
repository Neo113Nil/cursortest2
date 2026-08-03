package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzap extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvc zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzaw zzd;

    zzap(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvcVar;
        java.util.Objects.requireNonNull(zzawVar);
        this.zzd = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zza, "native_ad");
        return new com.google.android.gms.ads.internal.client.zzff();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmd)).booleanValue()) {
            return this.zzd.zzn().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            android.os.IBinder zze = ((com.google.android.gms.ads.internal.client.zzbr) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", com.google.android.gms.ads.internal.client.zzao.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzb, this.zzc, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbq ? (com.google.android.gms.ads.internal.client.zzbq) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbo(zze);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar = this.zzd;
            zzawVar.zzs(com.google.android.gms.internal.ads.zzbzy.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zzd(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
    }
}
