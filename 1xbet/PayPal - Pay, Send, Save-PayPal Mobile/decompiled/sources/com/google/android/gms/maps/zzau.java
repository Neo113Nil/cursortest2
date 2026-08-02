package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzau extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.maps.StreetViewPanoramaOptions zzd;
    private final java.util.List zze = new java.util.ArrayList();

    zzau(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzat) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zze.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            android.content.Context context = this.zzc;
            com.google.android.gms.maps.MapsInitializer.initialize(context);
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzat(this.zzb, com.google.android.gms.maps.internal.zzcc.zza(context, null).zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzd)));
            java.util.List list = this.zze;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzat) getDelegate()).getStreetViewPanoramaAsync((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) it.next());
            }
            list.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
