package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public interface LocationProvider {
    android.location.Location getSystemLocation();

    android.location.Location getUserLocation();
}
