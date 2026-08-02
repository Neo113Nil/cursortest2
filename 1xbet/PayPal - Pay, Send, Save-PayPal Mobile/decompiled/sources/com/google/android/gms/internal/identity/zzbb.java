package com.google.android.gms.internal.identity;

/* loaded from: classes4.dex */
public final class zzbb implements com.google.android.gms.location.FusedLocationProviderApi {
    static /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza(final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbd
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

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> flushLocations(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzaq(this, googleApiClient));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) googleApiClient.getClient(com.google.android.gms.internal.identity.zzbi.zza);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        try {
            zzdzVar.zzq(new com.google.android.gms.location.LastLocationRequest.Builder().build(), taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbe
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task) {
                    if (task.isSuccessful()) {
                        atomicReference.set((android.location.Location) task.getResult());
                    }
                    countDownLatch.countDown();
                }
            });
            if (com.google.android.gms.internal.identity.zzfd.zza(countDownLatch, 30L, java.util.concurrent.TimeUnit.SECONDS)) {
                return (android.location.Location) atomicReference.get();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) googleApiClient.getClient(com.google.android.gms.internal.identity.zzbi.zza);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        try {
            zzdzVar.zzp(com.google.android.gms.location.zzac.zza(), taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbc
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task) {
                    if (task.isSuccessful()) {
                        atomicReference.set((com.google.android.gms.location.LocationAvailability) task.getResult());
                    }
                    countDownLatch.countDown();
                }
            });
            if (com.google.android.gms.internal.identity.zzfd.zza(countDownLatch, 30L, java.util.concurrent.TimeUnit.SECONDS)) {
                return (com.google.android.gms.location.LocationAvailability) atomicReference.get();
            }
            return null;
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzav(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzat(this, googleApiClient, pendingIntent, locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzay(this, googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockMode(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzax(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzaw(this, googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        if (looper == null) {
            looper = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzas(this, googleApiClient, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzau(this, googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(myLooper, "invalid null looper");
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzar(this, googleApiClient, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationListener, myLooper, "LocationListener"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper) {
        if (looper == null) {
            looper = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzar(this, googleApiClient, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"), locationRequest));
    }
}
