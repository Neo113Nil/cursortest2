package com.google.android.gms.location;

/* loaded from: classes4.dex */
public interface FusedLocationProviderClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {

    @java.lang.Deprecated
    public static final java.lang.String KEY_MOCK_LOCATION = "mockLocation";

    @java.lang.Deprecated
    public static final java.lang.String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    com.google.android.gms.tasks.Task<java.lang.Void> flushLocations();

    com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(int i, com.google.android.gms.tasks.CancellationToken cancellationToken);

    com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.CancellationToken cancellationToken);

    com.google.android.gms.tasks.Task<android.location.Location> getLastLocation();

    com.google.android.gms.tasks.Task<android.location.Location> getLastLocation(com.google.android.gms.location.LastLocationRequest lastLocationRequest);

    com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationAvailability> getLocationAvailability();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Void> removeDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener);

    com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationCallback locationCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationListener locationListener);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Void> requestDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener, android.os.Looper looper);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.Void> requestDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener);

    com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper);

    com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper);

    com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.LocationCallback locationCallback);

    com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.LocationListener locationListener);

    com.google.android.gms.tasks.Task<java.lang.Void> setMockLocation(android.location.Location location);

    com.google.android.gms.tasks.Task<java.lang.Void> setMockMode(boolean z);
}
