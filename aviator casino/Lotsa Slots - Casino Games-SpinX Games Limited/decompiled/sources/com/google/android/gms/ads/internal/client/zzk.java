package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzk extends com.google.android.gms.dynamic.RemoteCreator {
    private com.google.android.gms.internal.ads.zzcaa zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbv ? (com.google.android.gms.ads.internal.client.zzbv) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbv(iBinder);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zza(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmd)).booleanValue()) {
            try {
                android.os.IBinder zze = ((com.google.android.gms.ads.internal.client.zzbv) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zzrVar, str, zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, i);
                if (zze == null) {
                    return null;
                }
                android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbs(zze);
            } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            android.os.IBinder zze2 = ((com.google.android.gms.ads.internal.client.zzbv) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", com.google.android.gms.ads.internal.client.zzj.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), zzrVar, str, zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, i);
            if (zze2 == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzbu ? (com.google.android.gms.ads.internal.client.zzbu) queryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzbs(zze2);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException e2) {
            com.google.android.gms.internal.ads.zzcaa zza = com.google.android.gms.internal.ads.zzbzy.zza(context);
            this.zza = zza;
            zza.zzh(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
