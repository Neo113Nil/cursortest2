package com.google.android.gms.internal.identity;

/* loaded from: classes4.dex */
public final class zzdz extends com.google.android.gms.common.internal.GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final androidx.collection.SimpleArrayMap zzf;
    private final androidx.collection.SimpleArrayMap zzg;
    private final androidx.collection.SimpleArrayMap zzh;
    private final androidx.collection.SimpleArrayMap zzi;

    public zzdz(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new androidx.collection.SimpleArrayMap();
        this.zzg = new androidx.collection.SimpleArrayMap();
        this.zzh = new androidx.collection.SimpleArrayMap();
        this.zzi = new androidx.collection.SimpleArrayMap();
    }

    private final boolean zzG(com.google.android.gms.common.Feature feature) {
        com.google.android.gms.common.Feature feature2;
        com.google.android.gms.common.Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i = 0;
            while (true) {
                if (i >= availableFeatures.length) {
                    feature2 = null;
                    break;
                }
                feature2 = availableFeatures[i];
                if (feature.getName().equals(feature2.getName())) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.getVersion() >= feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.identity.zzv ? (com.google.android.gms.internal.identity.zzv) queryLocalInterface : new com.google.android.gms.internal.identity.zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.location.zzo.zzp;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(android.location.Location location, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzh)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzB(location, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
        } else {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzA(location);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzv) getService()).zzC(new com.google.android.gms.internal.identity.zzdn(null, taskCompletionSource));
    }

    public final void zzC(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) java.util.Objects.requireNonNull(listenerHolder.getListenerKey());
        synchronized (this.zzh) {
            com.google.android.gms.internal.identity.zzdq zzdqVar = (com.google.android.gms.internal.identity.zzdq) this.zzh.get(listenerKey);
            if (zzdqVar == null) {
                zzdqVar = new com.google.android.gms.internal.identity.zzdq(listenerHolder);
                this.zzh.put(listenerKey, zzdqVar);
            } else {
                zzdqVar.zzc(listenerHolder);
            }
            ((com.google.android.gms.internal.identity.zzv) getService()).zzF(new com.google.android.gms.internal.identity.zzj(1, new com.google.android.gms.internal.identity.zzh(deviceOrientationRequest, com.google.android.gms.internal.identity.zzh.zza, null), zzdqVar, new com.google.android.gms.internal.identity.zzdn(null, taskCompletionSource)));
        }
    }

    public final void zzD(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        synchronized (this.zzh) {
            com.google.android.gms.internal.identity.zzdq zzdqVar = (com.google.android.gms.internal.identity.zzdq) this.zzh.remove(listenerKey);
            if (zzdqVar == null) {
                taskCompletionSource.setResult(java.lang.Boolean.FALSE);
            } else {
                zzdqVar.zze();
                ((com.google.android.gms.internal.identity.zzv) getService()).zzF(new com.google.android.gms.internal.identity.zzj(2, null, zzdqVar, new com.google.android.gms.internal.identity.zzdn(java.lang.Boolean.TRUE, taskCompletionSource)));
            }
        }
    }

    public final void zzE(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzn)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zze(geofencingRequest, pendingIntent, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
        } else {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzd(geofencingRequest, pendingIntent, new com.google.android.gms.internal.identity.zzdg(taskCompletionSource));
        }
    }

    public final void zzF(com.google.android.gms.internal.identity.zzem zzemVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzn)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzg(zzemVar, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
        } else {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzf(zzemVar, new com.google.android.gms.internal.identity.zzdg(taskCompletionSource));
        }
    }

    public final void zzp(com.google.android.gms.location.zzad zzadVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzo(zzadVar, new com.google.android.gms.internal.identity.zzee(5, null, new com.google.android.gms.internal.identity.zzdl(taskCompletionSource), null, null));
        } else {
            taskCompletionSource.setResult(((com.google.android.gms.internal.identity.zzv) getService()).zzp(getContext().getPackageName()));
        }
    }

    public final void zzq(com.google.android.gms.location.LastLocationRequest lastLocationRequest, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzq(lastLocationRequest, com.google.android.gms.internal.identity.zzee.zzd(new com.google.android.gms.internal.identity.zzdk(taskCompletionSource)));
        } else if (zzG(com.google.android.gms.location.zzo.zzf)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzr(lastLocationRequest, new com.google.android.gms.internal.identity.zzdk(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((com.google.android.gms.internal.identity.zzv) getService()).zzs());
        }
    }

    public final void zzr(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.CancellationToken cancellationToken, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            final com.google.android.gms.common.internal.ICancelToken zzt = ((com.google.android.gms.internal.identity.zzv) getService()).zzt(currentLocationRequest, com.google.android.gms.internal.identity.zzee.zzd(new com.google.android.gms.internal.identity.zzdk(taskCompletionSource)));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzed
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final /* synthetic */ void onCanceled() {
                        int i = com.google.android.gms.internal.identity.zzdz.zze;
                        try {
                            com.google.android.gms.common.internal.ICancelToken.this.cancel();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        if (zzG(com.google.android.gms.location.zzo.zze)) {
            final com.google.android.gms.common.internal.ICancelToken zzu = ((com.google.android.gms.internal.identity.zzv) getService()).zzu(currentLocationRequest, new com.google.android.gms.internal.identity.zzdk(taskCompletionSource));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzeb
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final /* synthetic */ void onCanceled() {
                        int i = com.google.android.gms.internal.identity.zzdz.zze;
                        try {
                            com.google.android.gms.common.internal.ICancelToken.this.cancel();
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(new com.google.android.gms.internal.identity.zzdh(this, taskCompletionSource), com.google.android.gms.internal.identity.zzfc.zza(), "GetCurrentLocation");
        final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) java.util.Objects.requireNonNull(createListenerHolder.getListenerKey());
        com.google.android.gms.internal.identity.zzdi zzdiVar = new com.google.android.gms.internal.identity.zzdi(this, createListenerHolder, taskCompletionSource);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.android.gms.location.LocationRequest.Builder builder = new com.google.android.gms.location.LocationRequest.Builder(currentLocationRequest.getPriority(), 0L);
        builder.setMinUpdateIntervalMillis(0L);
        builder.setDurationMillis(currentLocationRequest.getDurationMillis());
        builder.setGranularity(currentLocationRequest.getGranularity());
        builder.setMaxUpdateAgeMillis(currentLocationRequest.getMaxUpdateAgeMillis());
        builder.zzb(currentLocationRequest.zza());
        builder.zza(currentLocationRequest.zzb());
        builder.setWaitForAccurateLocation(true);
        builder.zzc(currentLocationRequest.zzc());
        zzt(zzdiVar, builder.build(), taskCompletionSource2);
        taskCompletionSource2.getTask().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzea
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(com.google.android.gms.tasks.Task task) {
                int i = com.google.android.gms.internal.identity.zzdz.zze;
                if (task.isSuccessful()) {
                    return;
                }
                com.google.android.gms.tasks.TaskCompletionSource.this.trySetException((java.lang.Exception) java.util.Objects.requireNonNull(task.getException()));
            }
        });
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzec
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    try {
                        com.google.android.gms.internal.identity.zzdz.this.zzw(listenerKey, true, new com.google.android.gms.tasks.TaskCompletionSource());
                    } catch (android.os.RemoteException unused) {
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:4:0x001d, B:8:0x002b, B:10:0x0040, B:11:0x0076, B:15:0x0057, B:16:0x0031), top: B:3:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:4:0x001d, B:8:0x002b, B:10:0x0040, B:11:0x0076, B:15:0x0057, B:16:0x0031), top: B:3:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzs(com.google.android.gms.internal.identity.zzdr zzdrVar, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.identity.zzdy zzdyVar;
        com.google.android.gms.common.api.internal.ListenerHolder zza = zzdrVar.zza();
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) java.util.Objects.requireNonNull(zza.getListenerKey());
        boolean zzG = zzG(com.google.android.gms.location.zzo.zzj);
        synchronized (this.zzf) {
            com.google.android.gms.internal.identity.zzdy zzdyVar2 = (com.google.android.gms.internal.identity.zzdy) this.zzf.get(listenerKey);
            if (zzdyVar2 != null && !zzG) {
                zzdyVar2.zzc(zza);
                zzdyVar = zzdyVar2;
                zzdyVar2 = null;
                if (zzG) {
                    ((com.google.android.gms.internal.identity.zzv) getService()).zzv(new com.google.android.gms.internal.identity.zzei(1, com.google.android.gms.internal.identity.zzeg.zza(null, locationRequest), zzdyVar, null, null, new com.google.android.gms.internal.identity.zzdo(taskCompletionSource, zzdyVar), listenerKey.toIdString()));
                } else {
                    ((com.google.android.gms.internal.identity.zzv) getService()).zzw(com.google.android.gms.internal.identity.zzee.zza(zzdyVar2, zzdyVar, listenerKey.toIdString()), locationRequest, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
                }
            }
            com.google.android.gms.internal.identity.zzdy zzdyVar3 = new com.google.android.gms.internal.identity.zzdy(zzdrVar);
            this.zzf.put(listenerKey, zzdyVar3);
            zzdyVar = zzdyVar3;
            if (zzG) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:4:0x001d, B:8:0x002b, B:10:0x0040, B:11:0x0076, B:15:0x0057, B:16:0x0031), top: B:3:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:4:0x001d, B:8:0x002b, B:10:0x0040, B:11:0x0076, B:15:0x0057, B:16:0x0031), top: B:3:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzt(com.google.android.gms.internal.identity.zzdr zzdrVar, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.identity.zzdv zzdvVar;
        com.google.android.gms.common.api.internal.ListenerHolder zza = zzdrVar.zza();
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) java.util.Objects.requireNonNull(zza.getListenerKey());
        boolean zzG = zzG(com.google.android.gms.location.zzo.zzj);
        synchronized (this.zzg) {
            com.google.android.gms.internal.identity.zzdv zzdvVar2 = (com.google.android.gms.internal.identity.zzdv) this.zzg.get(listenerKey);
            if (zzdvVar2 != null && !zzG) {
                zzdvVar2.zzc(zza);
                zzdvVar = zzdvVar2;
                zzdvVar2 = null;
                if (zzG) {
                    ((com.google.android.gms.internal.identity.zzv) getService()).zzv(new com.google.android.gms.internal.identity.zzei(1, com.google.android.gms.internal.identity.zzeg.zza(null, locationRequest), null, zzdvVar, null, new com.google.android.gms.internal.identity.zzdd(taskCompletionSource, zzdvVar), listenerKey.toIdString()));
                } else {
                    ((com.google.android.gms.internal.identity.zzv) getService()).zzw(com.google.android.gms.internal.identity.zzee.zzb(zzdvVar2, zzdvVar, listenerKey.toIdString()), locationRequest, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
                }
            }
            com.google.android.gms.internal.identity.zzdv zzdvVar3 = new com.google.android.gms.internal.identity.zzdv(zzdrVar);
            this.zzg.put(listenerKey, zzdvVar3);
            zzdvVar = zzdvVar3;
            if (zzG) {
            }
        }
    }

    public final void zzu(android.app.PendingIntent pendingIntent, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzw(com.google.android.gms.internal.identity.zzee.zzc(pendingIntent), locationRequest, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
            return;
        }
        com.google.android.gms.internal.identity.zzv zzvVar = (com.google.android.gms.internal.identity.zzv) getService();
        com.google.android.gms.internal.identity.zzeg zza = com.google.android.gms.internal.identity.zzeg.zza(null, locationRequest);
        com.google.android.gms.internal.identity.zzdn zzdnVar = new com.google.android.gms.internal.identity.zzdn(null, taskCompletionSource);
        int hashCode = pendingIntent.hashCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(hashCode).length() + 14);
        sb.append("PendingIntent@");
        sb.append(hashCode);
        zzvVar.zzv(new com.google.android.gms.internal.identity.zzei(1, zza, null, null, pendingIntent, zzdnVar, sb.toString()));
    }

    public final void zzv(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, boolean z, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        synchronized (this.zzf) {
            com.google.android.gms.internal.identity.zzdy zzdyVar = (com.google.android.gms.internal.identity.zzdy) this.zzf.remove(listenerKey);
            if (zzdyVar == null) {
                taskCompletionSource.setResult(java.lang.Boolean.FALSE);
                return;
            }
            zzdyVar.zzf();
            if (!z) {
                taskCompletionSource.setResult(java.lang.Boolean.TRUE);
            } else if (zzG(com.google.android.gms.location.zzo.zzj)) {
                com.google.android.gms.internal.identity.zzv zzvVar = (com.google.android.gms.internal.identity.zzv) getService();
                int identityHashCode = java.lang.System.identityHashCode(zzdyVar);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(identityHashCode).length() + 18);
                sb.append("ILocationListener@");
                sb.append(identityHashCode);
                zzvVar.zzx(com.google.android.gms.internal.identity.zzee.zza(null, zzdyVar, sb.toString()), new com.google.android.gms.internal.identity.zzdj(java.lang.Boolean.TRUE, taskCompletionSource));
            } else {
                ((com.google.android.gms.internal.identity.zzv) getService()).zzv(new com.google.android.gms.internal.identity.zzei(2, null, zzdyVar, null, null, new com.google.android.gms.internal.identity.zzdn(java.lang.Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzw(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, boolean z, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        synchronized (this.zzg) {
            com.google.android.gms.internal.identity.zzdv zzdvVar = (com.google.android.gms.internal.identity.zzdv) this.zzg.remove(listenerKey);
            if (zzdvVar == null) {
                taskCompletionSource.setResult(java.lang.Boolean.FALSE);
                return;
            }
            zzdvVar.zzg();
            if (!z) {
                taskCompletionSource.setResult(java.lang.Boolean.TRUE);
            } else if (zzG(com.google.android.gms.location.zzo.zzj)) {
                com.google.android.gms.internal.identity.zzv zzvVar = (com.google.android.gms.internal.identity.zzv) getService();
                int identityHashCode = java.lang.System.identityHashCode(zzdvVar);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(identityHashCode).length() + 18);
                sb.append("ILocationCallback@");
                sb.append(identityHashCode);
                zzvVar.zzx(com.google.android.gms.internal.identity.zzee.zzb(null, zzdvVar, sb.toString()), new com.google.android.gms.internal.identity.zzdj(java.lang.Boolean.TRUE, taskCompletionSource));
            } else {
                ((com.google.android.gms.internal.identity.zzv) getService()).zzv(new com.google.android.gms.internal.identity.zzei(2, null, null, zzdvVar, null, new com.google.android.gms.internal.identity.zzdn(java.lang.Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzx(android.app.PendingIntent pendingIntent, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.Object obj) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzx(com.google.android.gms.internal.identity.zzee.zzc(pendingIntent), new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
        } else {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzv(new com.google.android.gms.internal.identity.zzei(2, null, null, null, pendingIntent, new com.google.android.gms.internal.identity.zzdn(null, taskCompletionSource), null));
        }
    }

    public final void zzy(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzg)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzz(true, new com.google.android.gms.internal.identity.zzdj(null, taskCompletionSource));
        } else {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzy(true);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzz(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        if (zzG(com.google.android.gms.location.zzo.zzg)) {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzz(false, new com.google.android.gms.internal.identity.zzdj(true, taskCompletionSource));
        } else {
            ((com.google.android.gms.internal.identity.zzv) getService()).zzy(false);
            taskCompletionSource.setResult(true);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
