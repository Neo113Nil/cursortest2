package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class LocationSettingsResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.location.LocationSettingsResult> {
    public LocationSettingsResponse(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }
}
