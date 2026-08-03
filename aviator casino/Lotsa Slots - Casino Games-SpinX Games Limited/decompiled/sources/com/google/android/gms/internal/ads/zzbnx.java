package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbnx extends com.google.android.gms.dynamic.RemoteCreator {
    public zzbnx() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbml ? (com.google.android.gms.internal.ads.zzbml) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmj(iBinder);
    }

    public final com.google.android.gms.internal.ads.zzbmi zza(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        try {
            android.os.IBinder zze = ((com.google.android.gms.internal.ads.zzbml) getRemoteCreatorInstance(context)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamic.ObjectWrapper.wrap(frameLayout), com.google.android.gms.dynamic.ObjectWrapper.wrap(frameLayout2), com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmi ? (com.google.android.gms.internal.ads.zzbmi) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmg(zze);
        } catch (android.os.RemoteException | com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
