package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzl extends com.google.android.gms.dynamic.RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzci ? (com.google.android.gms.ads.internal.client.zzci) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzci(iBinder);
    }

    @javax.annotation.Nullable
    public final com.google.android.gms.ads.internal.client.zzch zza(android.content.Context context, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        try {
            android.os.IBinder zze = ((com.google.android.gms.ads.internal.client.zzci) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzch ? (com.google.android.gms.ads.internal.client.zzch) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcf(zze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
