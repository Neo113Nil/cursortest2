package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzan extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvc zzd;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzaw zze;

    zzan(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = str;
        this.zzd = zzbvcVar;
        java.util.Objects.requireNonNull(zzawVar);
        this.zze = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
        com.google.android.gms.ads.internal.client.zzaw.zzl(this.zza, "interstitial");
        return new com.google.android.gms.ads.internal.client.zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        return this.zze.zzm().zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zzc(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
    }
}
