package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyy extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbyy() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbze ? (com.google.android.gms.internal.ads.zzbze) queryLocalInterface : new com.google.android.gms.internal.ads.zzbzc(iBinder);
    }

    public final com.google.android.gms.internal.ads.zzbzb zza(android.app.Activity activity) {
        try {
            android.os.IBinder zze = ((com.google.android.gms.internal.ads.zzbze) getRemoteCreatorInstance(activity)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbzb ? (com.google.android.gms.internal.ads.zzbzb) queryLocalInterface : new com.google.android.gms.internal.ads.zzbyz(zze);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e);
            return null;
        } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
