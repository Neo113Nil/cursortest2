package com.google.android.gms.location;

/* loaded from: classes8.dex */
public interface FusedOrientationProviderClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<java.lang.Void> removeOrientationUpdates(com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener);

    com.google.android.gms.tasks.Task<java.lang.Void> requestOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener);
}
