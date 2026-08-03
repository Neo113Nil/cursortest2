package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzac extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzaw zzb;

    zzac(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.app.Activity activity) {
        this.zza = activity;
        java.util.Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        android.app.Activity activity = this.zza;
        com.google.android.gms.internal.ads.zzbiq.zza(activity);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmd)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar = this.zzb;
            return zzawVar.zzq().zza(this.zza);
        }
        try {
            return com.google.android.gms.internal.ads.zzbza.zzI(((com.google.android.gms.internal.ads.zzbze) com.google.android.gms.ads.internal.util.client.zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", com.google.android.gms.ads.internal.client.zzab.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity)));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.client.zzaw zzawVar2 = this.zzb;
            zzawVar2.zzs(com.google.android.gms.internal.ads.zzbzy.zza(this.zza.getApplicationContext()));
            zzawVar2.zzr().zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza));
    }
}
