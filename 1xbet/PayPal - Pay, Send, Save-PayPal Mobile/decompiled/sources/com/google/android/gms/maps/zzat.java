package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzat implements com.google.android.gms.maps.internal.StreetViewLifecycleDelegate {
    private final android.view.ViewGroup zza;
    private final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzb;
    private android.view.View zzc;

    public zzat(android.view.ViewGroup viewGroup, com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
        this.zzb = (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iStreetViewPanoramaViewDelegate);
        this.zza = (android.view.ViewGroup) com.google.android.gms.common.internal.Preconditions.checkNotNull(viewGroup);
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onCreate(android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.maps.internal.zzcb.zzb(bundle, bundle2);
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate = this.zzb;
            iStreetViewPanoramaViewDelegate.onCreate(bundle2);
            com.google.android.gms.maps.internal.zzcb.zzb(bundle2, bundle);
            this.zzc = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iStreetViewPanoramaViewDelegate.getView());
            android.view.ViewGroup viewGroup = this.zza;
            viewGroup.removeAllViews();
            viewGroup.addView(this.zzc);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        throw new java.lang.UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onDestroyView() {
        throw new java.lang.UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onInflate(android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        throw new java.lang.UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.maps.internal.zzcb.zzb(bundle, bundle2);
            this.zzb.onSaveInstanceState(bundle2);
            com.google.android.gms.maps.internal.zzcb.zzb(bundle2, bundle);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
    public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.zzb.getStreetViewPanoramaAsync(new com.google.android.gms.maps.zzas(this, onStreetViewPanoramaReadyCallback));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onDestroy() {
        try {
            this.zzb.onDestroy();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onLowMemory() {
        try {
            this.zzb.onLowMemory();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onPause() {
        try {
            this.zzb.onPause();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onResume() {
        try {
            this.zzb.onResume();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onStart() {
        try {
            this.zzb.onStart();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onStop() {
        try {
            this.zzb.onStop();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
