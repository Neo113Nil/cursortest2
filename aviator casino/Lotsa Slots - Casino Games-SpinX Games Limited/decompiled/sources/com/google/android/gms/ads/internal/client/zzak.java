package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzak extends com.google.android.gms.ads.internal.client.zzax {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbvc zzb;
    final /* synthetic */ com.google.android.gms.ads.h5.OnH5AdsEventListener zzc;

    zzak(com.google.android.gms.ads.internal.client.zzaw zzawVar, android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbvcVar;
        this.zzc = onH5AdsEventListener;
        java.util.Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* synthetic */ java.lang.Object zza() {
        return new com.google.android.gms.internal.ads.zzbra();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() throws android.os.RemoteException {
        android.content.Context context = this.zza;
        try {
            return ((com.google.android.gms.internal.ads.zzbqw) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", com.google.android.gms.ads.internal.client.zzaj.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzb, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, new com.google.android.gms.internal.ads.zzbqn(this.zzc));
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.ads.internal.client.zzco zzcoVar) throws android.os.RemoteException {
        return zzcoVar.zzp(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), this.zzb, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, new com.google.android.gms.internal.ads.zzbqn(this.zzc));
    }
}
