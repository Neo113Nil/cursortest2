package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzaf extends com.google.android.gms.dynamic.DeferredLifecycleHelper {
    protected com.google.android.gms.dynamic.OnDelegateCreatedListener zza;
    private final android.app.Fragment zzb;
    private android.app.Activity zzc;
    private final java.util.List zzd = new java.util.ArrayList();

    zzaf(android.app.Fragment fragment) {
        this.zzb = fragment;
    }

    static /* synthetic */ void zza(com.google.android.gms.maps.zzaf zzafVar, android.app.Activity activity) {
        zzafVar.zzc = activity;
        zzafVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(com.google.android.gms.dynamic.OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((com.google.android.gms.maps.zzae) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            com.google.android.gms.maps.MapsInitializer.initialize(this.zzc);
            com.google.android.gms.maps.internal.IMapFragmentDelegate zzf = com.google.android.gms.maps.internal.zzcc.zza(this.zzc, null).zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc));
            if (zzf == null) {
                return;
            }
            this.zza.onDelegateCreated(new com.google.android.gms.maps.zzae(this.zzb, zzf));
            java.util.List list = this.zzd;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.maps.zzae) getDelegate()).getMapAsync((com.google.android.gms.maps.OnMapReadyCallback) it.next());
            }
            list.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
        }
    }
}
