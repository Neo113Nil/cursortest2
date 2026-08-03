package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzi extends com.google.android.gms.dynamic.RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbr ? (com.google.android.gms.ads.internal.client.zzbr) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbr(iBinder);
    }

    public final com.google.android.gms.ads.internal.client.zzbq zza(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        try {
            android.os.IBinder zze = ((com.google.android.gms.ads.internal.client.zzbr) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbq ? (com.google.android.gms.ads.internal.client.zzbq) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbo(zze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
