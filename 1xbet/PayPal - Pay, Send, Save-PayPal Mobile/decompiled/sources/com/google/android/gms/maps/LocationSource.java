package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public interface LocationSource {

    public interface OnLocationChangedListener {
        void onLocationChanged(android.location.Location location);
    }

    void activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
