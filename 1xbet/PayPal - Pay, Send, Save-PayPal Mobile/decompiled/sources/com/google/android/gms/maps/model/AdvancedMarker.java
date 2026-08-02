package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public class AdvancedMarker extends com.google.android.gms.maps.model.Marker {
    public AdvancedMarker(com.google.android.gms.internal.maps.zzaj zzajVar) {
        super(zzajVar);
    }

    public android.view.View getIconView() {
        try {
            return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zza.zzh());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setIconView(android.view.View view) {
        if (view != null && view.getParent() != null) {
            throw new java.lang.IllegalArgumentException("View already has a parent, can not be used as Marker");
        }
        try {
            this.zza.zzu(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
