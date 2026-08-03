package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzbs implements com.google.android.gms.internal.games_v2.zzbc {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.internal.games_v2.zzbp.UNINITIALIZED);
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.internal.games_v2.zzbo.AUTOMATIC);
    private final java.util.Queue zzc = new java.util.ArrayDeque();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final android.app.Application zzf;
    private final com.google.android.gms.games.internal.zzg zzg;
    private final com.google.android.gms.internal.games_v2.zzbt zzh;
    private final com.google.android.gms.games.internal.v2.resolution.zzb zzi;

    zzbs(android.app.Application application, com.google.android.gms.games.internal.zzg zzgVar, com.google.android.gms.games.internal.v2.resolution.zzb zzbVar, com.google.android.gms.internal.games_v2.zzbt zzbtVar) {
        this.zzf = application;
        this.zzg = zzgVar;
        this.zzi = zzbVar;
        this.zzh = zzbtVar;
    }

    private static com.google.android.gms.common.api.ApiException zzj() {
        return new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(4));
    }

    private static com.google.android.gms.tasks.Task zzk(java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        int ordinal = ((com.google.android.gms.internal.games_v2.zzbp) atomicReference.get()).ordinal();
        if (ordinal == 0) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(10)));
        }
        if (ordinal == 2) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zza);
        }
        if (ordinal == 3) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zzb);
        }
        if (taskCompletionSource == null) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zzb);
        }
        com.google.android.gms.tasks.Task task = taskCompletionSource.getTask();
        if (task.isSuccessful()) {
            return ((java.lang.Boolean) task.getResult()).booleanValue() ? com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zza) : com.google.android.gms.tasks.Tasks.forResult(com.google.android.gms.games.AuthenticationResult.zzb);
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
        task.addOnCompleteListener(com.google.android.gms.internal.games_v2.zzgl.zza(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbm
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource3 = com.google.android.gms.tasks.TaskCompletionSource.this;
                if (task2.isSuccessful() && ((java.lang.Boolean) task2.getResult()).booleanValue()) {
                    taskCompletionSource3.trySetResult(com.google.android.gms.games.AuthenticationResult.zza);
                } else {
                    taskCompletionSource3.trySetResult(com.google.android.gms.games.AuthenticationResult.zzb);
                }
            }
        });
        return taskCompletionSource2.getTask();
    }

    private static com.google.android.gms.tasks.Task zzl(final com.google.android.gms.internal.games_v2.zzgm zzgmVar) {
        if (zzp()) {
            return (com.google.android.gms.tasks.Task) zzgmVar.zza();
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.games_v2.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Object zza = com.google.android.gms.internal.games_v2.zzgm.this.zza();
                final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                ((com.google.android.gms.tasks.Task) zza).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbi
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(com.google.android.gms.tasks.Task task) {
                        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource3 = com.google.android.gms.tasks.TaskCompletionSource.this;
                        if (task.isSuccessful()) {
                            taskCompletionSource3.trySetResult(task.getResult());
                            return;
                        }
                        java.lang.Exception exception = task.getException();
                        com.google.android.gms.internal.games_v2.zzfx.zza(exception);
                        taskCompletionSource3.trySetException(exception);
                    }
                });
            }
        });
        return taskCompletionSource.getTask();
    }

    private final void zzm(final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, final com.google.android.gms.internal.games_v2.zzy zzyVar) {
        com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Attempting authentication: ".concat(zzyVar.toString()));
        this.zzh.zza(zzyVar).addOnCompleteListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbl
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.internal.games_v2.zzbs.this.zzg(taskCompletionSource, zzyVar, task);
            }
        });
    }

    private final void zzn(final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, final int i, android.app.PendingIntent pendingIntent, boolean z, boolean z2) {
        android.app.Activity zza;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        int clientVersion = com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(this.zzf, "com.google.android.gms");
        com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", java.lang.String.format(java.util.Locale.US, "GmsCore version is %d", java.lang.Integer.valueOf(clientVersion)));
        if (clientVersion < 220812000) {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.util.ClientLibraryUtils.getPackageInfo(this.zzf, "com.android.vending");
            if (packageInfo == null) {
                com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "PlayStore is not installed");
            } else {
                int i2 = packageInfo.versionCode;
                if (i2 < 82470600) {
                    com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", java.lang.String.format(java.util.Locale.US, "PlayStore version is below resolution threshold: %s", java.lang.Integer.valueOf(i2)));
                } else {
                    com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Installed PlayStore version can be used for resolution.");
                }
            }
            com.google.android.gms.internal.games_v2.zzfn.zzg("GamesApiManager", "PlayStore is too old or not available and the version of GmsCore would attempt PGA installation on automatic sign-in. Skipping it.");
            taskCompletionSource.trySetResult(false);
            this.zza.set(com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATION_FAILED);
            return;
        }
        if (z && pendingIntent != null && (zza = this.zzg.zza()) != null) {
            com.google.android.gms.games.internal.v2.resolution.zzb.zzb(zza, pendingIntent).addOnCompleteListener(com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.internal.games_v2.zzbg
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    com.google.android.gms.internal.games_v2.zzbs.this.zzh(taskCompletionSource, i, task);
                }
            });
            com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Resolution triggered");
            return;
        }
        boolean zza2 = com.google.android.gms.internal.games_v2.zzbf.zza(this.zzb, com.google.android.gms.internal.games_v2.zzbo.AUTOMATIC_PENDING_EXPLICIT, com.google.android.gms.internal.games_v2.zzbo.EXPLICIT);
        if (!z2 && zza2) {
            com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
            zzm(taskCompletionSource, com.google.android.gms.internal.games_v2.zzy.zzb(0));
            return;
        }
        taskCompletionSource.trySetResult(false);
        this.zza.set(com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATION_FAILED);
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.games_v2.zzbr) it.next()).zzc(zzj());
            it.remove();
        }
    }

    private final void zzo(int i) {
        com.google.android.gms.internal.games_v2.zzbo zzboVar;
        com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "startAuthenticationIfNecessary() signInType: " + i);
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        int i2 = 0;
        if (!com.google.android.gms.internal.games_v2.zzbf.zza(this.zza, com.google.android.gms.internal.games_v2.zzbp.UNINITIALIZED, com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATING)) {
            if (i != 1) {
                if (com.google.android.gms.internal.games_v2.zzbf.zza(this.zza, com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATION_FAILED, com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATING)) {
                    i = 0;
                } else {
                    com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Explicit sign-in during existing authentication. Marking pending explicit sign-in: " + com.google.android.gms.internal.games_v2.zzbf.zza(this.zzb, com.google.android.gms.internal.games_v2.zzbo.AUTOMATIC, com.google.android.gms.internal.games_v2.zzbo.AUTOMATIC_PENDING_EXPLICIT));
                }
            }
            com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zza.get()))));
            return;
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get();
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(new java.lang.IllegalStateException("New authentication attempt in progress"));
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zzd.set(taskCompletionSource2);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        if (i == 0) {
            zzboVar = com.google.android.gms.internal.games_v2.zzbo.EXPLICIT;
        } else {
            zzboVar = com.google.android.gms.internal.games_v2.zzbo.AUTOMATIC;
            i2 = 1;
        }
        atomicReference.set(zzboVar);
        zzm(taskCompletionSource2, com.google.android.gms.internal.games_v2.zzy.zzb(i2));
    }

    private static boolean zzp() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    @Override // com.google.android.gms.internal.games_v2.zzbc
    public final com.google.android.gms.tasks.Task zza() {
        return zzl(new com.google.android.gms.internal.games_v2.zzgm() { // from class: com.google.android.gms.internal.games_v2.zzbj
            @Override // com.google.android.gms.internal.games_v2.zzgm
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.games_v2.zzbs.this.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.games_v2.zzbc
    public final com.google.android.gms.tasks.Task zzb() {
        return zzl(new com.google.android.gms.internal.games_v2.zzgm() { // from class: com.google.android.gms.internal.games_v2.zzbn
            @Override // com.google.android.gms.internal.games_v2.zzgm
            public final java.lang.Object zza() {
                return com.google.android.gms.internal.games_v2.zzbs.this.zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.games_v2.zzbc
    public final com.google.android.gms.tasks.Task zzc() {
        return zzk(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get());
    }

    @Override // com.google.android.gms.internal.games_v2.zzbc
    public final com.google.android.gms.tasks.Task zzd(com.google.android.gms.internal.games_v2.zzaw zzawVar) {
        com.google.android.gms.internal.games_v2.zzbp zzbpVar = (com.google.android.gms.internal.games_v2.zzbp) this.zza.get();
        com.google.android.gms.internal.games_v2.zzfn.zzf("GamesApiManager", "Executing API call with authentication state: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzbpVar))));
        if (zzbpVar == com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATED) {
            return zzawVar.zza((com.google.android.gms.common.api.GoogleApi) this.zze.get());
        }
        if (zzbpVar == com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATION_FAILED) {
            return com.google.android.gms.tasks.Tasks.forException(zzj());
        }
        if (zzbpVar == com.google.android.gms.internal.games_v2.zzbp.UNINITIALIZED) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(10)));
        }
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        final com.google.android.gms.internal.games_v2.zzbr zzbrVar = new com.google.android.gms.internal.games_v2.zzbr(zzawVar, taskCompletionSource);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.games_v2.zzbh
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.games_v2.zzbs.this.zzi(zzbrVar);
            }
        };
        if (zzp()) {
            runnable.run();
        } else {
            com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD.execute(runnable);
        }
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zze() {
        zzo(1);
        return zzk(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzf() {
        zzo(0);
        return zzk(this.zza, (com.google.android.gms.tasks.TaskCompletionSource) this.zzd.get());
    }

    final /* synthetic */ void zzg(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.internal.games_v2.zzy zzyVar, com.google.android.gms.tasks.Task task) {
        if (!task.isSuccessful()) {
            java.lang.Exception exception = task.getException();
            com.google.android.gms.internal.games_v2.zzfx.zza(exception);
            com.google.android.gms.internal.games_v2.zzfn.zzb("GamesApiManager", "Authentication task failed", exception);
            zzn(taskCompletionSource, zzyVar.zza(), null, false, !zzyVar.zzd());
            return;
        }
        com.google.android.gms.internal.games_v2.zzbx zzbxVar = (com.google.android.gms.internal.games_v2.zzbx) task.getResult();
        if (!zzbxVar.zze()) {
            com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Failed to authenticate: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzbxVar))));
            zzn(taskCompletionSource, zzyVar.zza(), zzbxVar.zza(), true, !zzyVar.zzd());
            return;
        }
        java.lang.String zzd = zzbxVar.zzd();
        if (zzd == null) {
            com.google.android.gms.internal.games_v2.zzfn.zzg("GamesApiManager", "Unexpected state: game run token absent");
            zzn(taskCompletionSource, zzyVar.zza(), null, false, !zzyVar.zzd());
            return;
        }
        com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Successfully authenticated");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        com.google.android.gms.games.zzl zzb = com.google.android.gms.games.zzn.zzb();
        zzb.zzd(2101523);
        zzb.zzc(com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault());
        zzb.zza(zzd);
        com.google.android.gms.games.internal.zzj zza = com.google.android.gms.games.internal.zzl.zza();
        zza.zzb(true);
        zza.zzc(true);
        zza.zza(true);
        zzb.zzb(zza.zzd());
        com.google.android.gms.internal.games_v2.zze zzeVar = new com.google.android.gms.internal.games_v2.zze(this.zzf, zzb.zze());
        this.zze.set(zzeVar);
        this.zza.set(com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATED);
        taskCompletionSource.trySetResult(true);
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.games_v2.zzbr) it.next()).zza(zzeVar);
            it.remove();
        }
    }

    final /* synthetic */ void zzh(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.tasks.Task task) {
        if (!task.isSuccessful()) {
            java.lang.Exception exception = task.getException();
            com.google.android.gms.internal.games_v2.zzfx.zza(exception);
            com.google.android.gms.internal.games_v2.zzfn.zzh("GamesApiManager", "Resolution failed", exception);
            zzn(taskCompletionSource, i, null, false, true);
            return;
        }
        com.google.android.gms.games.internal.v2.resolution.zzc zzcVar = (com.google.android.gms.games.internal.v2.resolution.zzc) task.getResult();
        if (zzcVar.zzd()) {
            com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Resolution successful");
            zzm(taskCompletionSource, com.google.android.gms.internal.games_v2.zzy.zzc(i, com.google.android.gms.internal.games_v2.zzaf.zza(zzcVar.zza())));
        } else {
            com.google.android.gms.internal.games_v2.zzfn.zza("GamesApiManager", "Resolution attempt was canceled");
            zzn(taskCompletionSource, i, null, false, true);
        }
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.games_v2.zzbr zzbrVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the main thread.");
        com.google.android.gms.internal.games_v2.zzbp zzbpVar = (com.google.android.gms.internal.games_v2.zzbp) this.zza.get();
        if (zzbpVar == com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATED) {
            zzbrVar.zza((com.google.android.gms.common.api.GoogleApi) this.zze.get());
        } else if (zzbpVar == com.google.android.gms.internal.games_v2.zzbp.AUTHENTICATION_FAILED) {
            zzbrVar.zzc(zzj());
        } else {
            this.zzc.add(zzbrVar);
        }
    }
}
