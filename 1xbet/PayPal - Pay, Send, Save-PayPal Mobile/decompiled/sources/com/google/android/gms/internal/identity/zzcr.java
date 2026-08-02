package com.google.android.gms.internal.identity;

/* loaded from: classes4.dex */
public final class zzcr implements com.google.android.gms.location.GeofencingApi {
    static /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza(final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzcs
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder2 = com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder.this;
                if (task.isSuccessful()) {
                    resultHolder2.setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
                    return;
                }
                if (task.isCanceled()) {
                    resultHolder2.setFailedResult(com.google.android.gms.common.api.Status.RESULT_CANCELED);
                    return;
                }
                java.lang.Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.ApiException) {
                    resultHolder2.setFailedResult(((com.google.android.gms.common.api.ApiException) exception).getStatus());
                } else {
                    resultHolder2.setFailedResult(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                }
            }
        });
        return taskCompletionSource;
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzcn(this, googleApiClient, geofencingRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzco(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<com.google.android.gms.location.Geofence> list, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzcn(this, googleApiClient, builder.build(), pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeGeofences(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.String> list) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzcp(this, googleApiClient, list));
    }
}
