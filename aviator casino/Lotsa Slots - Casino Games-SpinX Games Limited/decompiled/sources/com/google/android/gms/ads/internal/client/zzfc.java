package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzfc extends com.google.android.gms.dynamic.RemoteCreator {
    public zzfc() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcz ? (com.google.android.gms.ads.internal.client.zzcz) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcz(iBinder);
    }

    public final com.google.android.gms.ads.internal.client.zzcy zza(android.content.Context context) {
        try {
            android.os.IBinder zze = ((com.google.android.gms.ads.internal.client.zzcz) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzcy ? (com.google.android.gms.ads.internal.client.zzcy) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzcw(zze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
