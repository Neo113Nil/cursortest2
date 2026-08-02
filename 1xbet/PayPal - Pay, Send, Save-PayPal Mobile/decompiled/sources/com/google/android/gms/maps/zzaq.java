package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzaq extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.app.Fragment zzb;
    private android.app.Activity zzc;
    private final java.util.List zzd = new java.util.ArrayList();

    zzaq(android.app.Fragment fragment) {
        this.zzb = fragment;
    }

    static /* synthetic */ void zza(com.google.android.gms.maps.zzaq zzaqVar, android.app.Activity activity) {
        zzaqVar.zzc = activity;
        zzaqVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzap) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zzd.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            com.google.android.gms.maps.MapsInitializer.initialize(this.zzc);
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzap(this.zzb, com.google.android.gms.maps.internal.zzcc.zza(this.zzc, null).zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc))));
            java.util.List list = this.zzd;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzap) getDelegate()).getStreetViewPanoramaAsync((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) it.next());
            }
            list.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
