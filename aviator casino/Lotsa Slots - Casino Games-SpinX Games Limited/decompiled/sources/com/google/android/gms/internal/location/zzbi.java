package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
public final class zzbi implements com.google.android.gms.location.SettingsApi {
    @Override // com.google.android.gms.location.SettingsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.location.LocationSettingsResult> checkLocationSettings(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.location.zzbh(this, googleApiClient, locationSettingsRequest, null));
    }
}
