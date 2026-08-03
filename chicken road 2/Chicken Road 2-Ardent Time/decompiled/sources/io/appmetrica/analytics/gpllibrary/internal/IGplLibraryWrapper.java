package io.appmetrica.analytics.gpllibrary.internal;

/* loaded from: classes.dex */
public interface IGplLibraryWrapper {
    void startLocationUpdates(io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper.Priority priority);

    void stopLocationUpdates();

    void updateLastKnownLocation();
}
