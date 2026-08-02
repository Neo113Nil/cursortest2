package com.google.android.gms.internal.identity;

/* loaded from: classes4.dex */
public final class zzbi extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.FusedLocationProviderClient {
    static final com.google.android.gms.common.api.Api.ClientKey zza;
    public static final com.google.android.gms.common.api.Api zzb;
    private static final java.lang.Object zzc;
    private static java.lang.Object zzd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        zzb = new com.google.android.gms.common.api.Api("LocationServices.API", new com.google.android.gms.internal.identity.zzbf(), clientKey);
        zzc = new java.lang.Object();
    }

    public zzbi(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final com.google.android.gms.tasks.Task zza(final com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        final com.google.android.gms.internal.identity.zzbh zzbhVar = new com.google.android.gms.internal.identity.zzbh(this, listenerHolder, com.google.android.gms.internal.identity.zzcd.zza);
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbt
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzs(com.google.android.gms.internal.identity.zzbh.this, locationRequest, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).unregister(zzbhVar).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    private final com.google.android.gms.tasks.Task zzb(final com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        final com.google.android.gms.internal.identity.zzbh zzbhVar = new com.google.android.gms.internal.identity.zzbh(this, listenerHolder, com.google.android.gms.internal.identity.zzbz.zza);
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzt(com.google.android.gms.internal.identity.zzbh.this, locationRequest, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).unregister(zzbhVar).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    private final com.google.android.gms.tasks.Task zzc(final com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, final com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        com.google.android.gms.common.api.internal.RemoteCall remoteCall = new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzC(com.google.android.gms.common.api.internal.ListenerHolder.this, deviceOrientationRequest, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        };
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(remoteCall).unregister(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
                com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) obj;
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = com.google.android.gms.common.api.internal.ListenerHolder.this.getListenerKey();
                if (listenerKey != null) {
                    zzdzVar.zzD(listenerKey, taskCompletionSource);
                }
            }
        }).withHolder(listenerHolder).setMethodKey(2434).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> flushLocations() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.identity.zzca.zza).setMethodKey(2422).build());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final java.lang.String getApiFallbackAttributionTag(android.content.Context context) {
        return null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(int i, com.google.android.gms.tasks.CancellationToken cancellationToken) {
        com.google.android.gms.location.CurrentLocationRequest.Builder builder = new com.google.android.gms.location.CurrentLocationRequest.Builder();
        builder.setPriority(i);
        com.google.android.gms.location.CurrentLocationRequest build = builder.build();
        if (cancellationToken != null) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        com.google.android.gms.tasks.Task<android.location.Location> doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.identity.zzbp(build, cancellationToken)).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return doRead;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationToken);
        doRead.continueWith(new com.google.android.gms.internal.identity.zzbq(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<android.location.Location> getLastLocation() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.identity.zzby.zza).setMethodKey(2414).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationAvailability> getLocationAvailability() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.identity.zzbr.zza).setMethodKey(2416).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzx(pendingIntent, (com.google.android.gms.tasks.TaskCompletionSource) obj2, null);
            }
        }).setMethodKey(2418).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener, android.os.Looper looper) {
        if (looper == null) {
            looper = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return zzc(deviceOrientationRequest, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(deviceOrientationListener, looper, "DeviceOrientationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(final com.google.android.gms.location.LocationRequest locationRequest, final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbs
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzu(pendingIntent, locationRequest, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2417).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setMockLocation(final android.location.Location location) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(location != null);
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzA(location, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2421).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> setMockMode(boolean z) {
        synchronized (zzc) {
            if (!z) {
                java.lang.Object obj = zzd;
                if (obj != null) {
                    zzd = null;
                    return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(obj, java.lang.Object.class.getSimpleName()), 2420).continueWith(com.google.android.gms.internal.identity.zzcf.zza, com.google.android.gms.internal.identity.zzbk.zza);
                }
            } else if (zzd == null) {
                java.lang.Object obj2 = new java.lang.Object();
                zzd = obj2;
                return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(com.google.android.gms.internal.identity.zzcb.zza).unregister(com.google.android.gms.internal.identity.zzcc.zza).withHolder(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(obj2, android.os.Looper.getMainLooper(), java.lang.Object.class.getSimpleName())).setMethodKey(2420).build());
            }
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
    }

    public zzbi(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(deviceOrientationListener, "DeviceOrientationListener"), 2440).continueWith(com.google.android.gms.internal.identity.zzcg.zza, com.google.android.gms.internal.identity.zzbo.zza);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<android.location.Location> getLastLocation(final com.google.android.gms.location.LastLocationRequest lastLocationRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzq(com.google.android.gms.location.LastLocationRequest.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2414).setFeatures(com.google.android.gms.location.zzo.zzf).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationCallback locationCallback) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).continueWith(com.google.android.gms.internal.identity.zzce.zza, com.google.android.gms.internal.identity.zzbw.zza);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        if (looper == null) {
            looper = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return zzb(locationRequest, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener) {
        return zzc(deviceOrientationRequest, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(deviceOrientationListener, executor, "DeviceOrientationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationListener locationListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(locationListener, "LocationListener"), 2418).continueWith(com.google.android.gms.internal.identity.zzch.zza, com.google.android.gms.internal.identity.zzbv.zza);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper) {
        if (looper == null) {
            looper = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return zza(locationRequest, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<android.location.Location> getCurrentLocation(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        com.google.android.gms.tasks.Task<android.location.Location> doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.identity.zzbp(currentLocationRequest, cancellationToken)).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return doRead;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationToken);
        doRead.continueWith(new com.google.android.gms.internal.identity.zzbq(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.LocationCallback locationCallback) {
        return zzb(locationRequest, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.LocationListener locationListener) {
        return zza(locationRequest, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationListener, executor, "LocationListener"));
    }
}
