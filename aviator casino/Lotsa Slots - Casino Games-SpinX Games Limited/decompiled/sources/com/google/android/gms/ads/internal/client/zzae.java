package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzae extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvc zzb;

    zzae(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        this.zza = context;
        this.zzb = zzbvcVar;
        java.util.Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        android.content.Context context = this.zza;
        com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkN)).booleanValue()) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.internal.client.zzdu) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", com.google.android.gms.ads.internal.client.zzad.zza)).zze(wrap, this.zzb, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.internal.ads.zzbzy.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        android.content.Context context = this.zza;
        com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkN)).booleanValue()) {
            return zzcoVar.zzq(wrap, this.zzb, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
