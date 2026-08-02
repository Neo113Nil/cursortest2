package com.google.android.gms.location;

/* loaded from: classes8.dex */
public interface GeofencingClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<java.lang.Void> addGeofences(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(java.util.List<java.lang.String> list);
}
