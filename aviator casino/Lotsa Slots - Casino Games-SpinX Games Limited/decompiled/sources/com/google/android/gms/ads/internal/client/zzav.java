package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzav extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.widget.FrameLayout zza;
    final /* synthetic */ android.widget.FrameLayout zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzaw zzd;

    zzav(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, android.content.Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        java.util.Objects.requireNonNull(zzawVar);
        this.zzd = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zzc, "native_ad_view_delegate");
        return new com.google.android.gms.ads.internal.client.zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        android.content.Context context = this.zzc;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmd)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar = this.zzd;
            return zzawVar.zzp().zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return com.google.android.gms.internal.ads.zzbmh.zzdG(((com.google.android.gms.internal.ads.zzbml) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", com.google.android.gms.ads.internal.client.zzau.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar2 = this.zzd;
            zzawVar2.zzs(com.google.android.gms.internal.ads.zzbzy.zza(this.zzc));
            zzawVar2.zzr().zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb));
    }
}
