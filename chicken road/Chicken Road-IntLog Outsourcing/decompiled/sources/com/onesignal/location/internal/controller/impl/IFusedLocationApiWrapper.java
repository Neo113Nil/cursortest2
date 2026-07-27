package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public interface IFusedLocationApiWrapper {
    void cancelLocationUpdates(GoogleApiClient googleApiClient, E1.b bVar);

    Location getLastLocation(GoogleApiClient googleApiClient);

    void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, E1.b bVar);
}
