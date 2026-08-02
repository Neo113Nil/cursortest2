package com.google.android.gms.location;

/* loaded from: classes8.dex */
public interface SettingsClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationSettingsResponse> checkLocationSettings(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest);

    com.google.android.gms.tasks.Task<java.lang.Boolean> isGoogleLocationAccuracyEnabled();
}
