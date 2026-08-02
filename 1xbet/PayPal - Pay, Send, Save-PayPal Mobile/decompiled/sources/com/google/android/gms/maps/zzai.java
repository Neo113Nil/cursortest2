package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzai extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.maps.GoogleMapOptions zzd;
    private final java.util.List zze = new java.util.ArrayList();

    zzai(android.view.ViewGroup viewGroup, android.content.Context context, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzah) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zze.add(onMapReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            android.content.Context context = this.zzc;
            com.google.android.gms.maps.MapsInitializer.initialize(context);
            com.google.android.gms.maps.internal.IMapViewDelegate zzg = com.google.android.gms.maps.internal.zzcc.zza(context, null).zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzd);
            if (zzg == null) {
                return;
            }
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzah(this.zzb, zzg));
            java.util.List list = this.zze;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzah) getDelegate()).getMapAsync((com.google.android.gms.maps.OnMapReadyCallback) it.next());
            }
            list.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
