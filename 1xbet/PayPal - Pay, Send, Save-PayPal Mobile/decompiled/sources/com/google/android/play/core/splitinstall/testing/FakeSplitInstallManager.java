package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
public class FakeSplitInstallManager implements com.google.android.play.core.splitinstall.SplitInstallManager {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
    private final android.os.Handler zzc;
    private final android.content.Context zzd;
    private final com.google.android.play.core.splitinstall.zzs zze;
    private final com.google.android.play.core.splitinstall.internal.zzby zzf;
    private final com.google.android.play.core.splitinstall.internal.zzbs zzg;
    private final com.google.android.play.core.splitinstall.internal.zzt zzh;
    private final com.google.android.play.core.splitinstall.internal.zzt zzi;
    private final java.util.concurrent.Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final java.io.File zzl;
    private final java.util.concurrent.atomic.AtomicReference zzm;
    private final java.util.Set zzn;
    private final java.util.Set zzo;
    private final java.util.concurrent.atomic.AtomicBoolean zzp;
    private final com.google.android.play.core.splitinstall.testing.zzj zzq;

    private final com.google.android.gms.tasks.Task zzk(final int i) {
        zzn(new com.google.android.play.core.splitinstall.testing.zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzp
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final com.google.android.play.core.splitinstall.SplitInstallSessionState zza(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
                int i2 = i;
                if (splitInstallSessionState == null) {
                    return null;
                }
                return com.google.android.play.core.splitinstall.SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i2, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
            }
        });
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(i));
    }

    private final com.google.android.play.core.splitinstall.zzk zzl() {
        try {
            com.google.android.play.core.splitinstall.zzk zza2 = this.zze.zza(this.zzd.getPackageManager().getPackageInfo(this.zzd.getPackageName(), 128).applicationInfo.metaData);
            if (zza2 != null) {
                return zza2;
            }
            throw new java.lang.IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalStateException("App is not found in PackageManager", e);
        }
    }

    private final com.google.android.play.core.splitinstall.SplitInstallSessionState zzm() {
        return (com.google.android.play.core.splitinstall.SplitInstallSessionState) this.zzm.get();
    }

    private final com.google.android.play.core.splitinstall.SplitInstallSessionState zzn(com.google.android.play.core.splitinstall.testing.zzr zzrVar) {
        synchronized (this) {
            com.google.android.play.core.splitinstall.SplitInstallSessionState zzm = zzm();
            com.google.android.play.core.splitinstall.SplitInstallSessionState zza2 = zzrVar.zza(zzm);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.zzm;
            while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzm, zza2)) {
                if (atomicReference.get() != zzm) {
                    return null;
                }
            }
            return zza2;
        }
    }

    private static java.lang.String zzo(java.lang.String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(java.util.List list, java.util.List list2, java.util.List list3, long j, boolean z) {
        this.zzk.zza().zzd(list, new com.google.android.play.core.splitinstall.testing.zzq(this, list2, list3, j, z, list));
    }

    private final void zzq(final com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
        this.zzc.post(new java.lang.Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzf
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.this.zzg(splitInstallSessionState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzr(java.util.List list, java.util.List list2, long j) {
        this.zzn.addAll(list);
        this.zzo.addAll(list2);
        java.lang.Long valueOf = java.lang.Long.valueOf(j);
        zzs(5, 0, valueOf, valueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzs(final int i, final int i2, final java.lang.Long l, final java.lang.Long l2, final java.util.List list, final java.lang.Integer num, final java.util.List list2) {
        com.google.android.play.core.splitinstall.SplitInstallSessionState zzn = zzn(new com.google.android.play.core.splitinstall.testing.zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzg
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final com.google.android.play.core.splitinstall.SplitInstallSessionState zza(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
                java.lang.Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                java.lang.Long l3 = l;
                java.lang.Long l4 = l2;
                java.util.List<java.lang.String> list3 = list;
                java.util.List<java.lang.String> list4 = list2;
                com.google.android.play.core.splitinstall.SplitInstallSessionState create = splitInstallSessionState == null ? com.google.android.play.core.splitinstall.SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new java.util.ArrayList(), new java.util.ArrayList()) : splitInstallSessionState;
                return com.google.android.play.core.splitinstall.SplitInstallSessionState.create(num2 == null ? create.sessionId() : num2.intValue(), i3, i4, l3 == null ? create.bytesDownloaded() : l3.longValue(), l4 == null ? create.totalBytesToDownload() : l4.longValue(), list3 == null ? create.moduleNames() : list3, list4 == null ? create.languages() : list4);
            }
        });
        if (zzn == null) {
            return false;
        }
        zzq(zzn);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> cancelInstall(final int i) {
        try {
            com.google.android.play.core.splitinstall.SplitInstallSessionState zzn = zzn(new com.google.android.play.core.splitinstall.testing.zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzh
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final com.google.android.play.core.splitinstall.SplitInstallSessionState zza(final com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
                    final int i2 = i;
                    return (com.google.android.play.core.splitinstall.SplitInstallSessionState) com.google.android.play.core.splitinstall.internal.zzbx.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzo
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            int status;
                            com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState2 = com.google.android.play.core.splitinstall.SplitInstallSessionState.this;
                            int i3 = i2;
                            if (splitInstallSessionState2 != null && i3 == splitInstallSessionState2.sessionId() && ((status = splitInstallSessionState2.status()) == 1 || status == 2 || status == 8 || status == 9 || status == 7)) {
                                return com.google.android.play.core.splitinstall.SplitInstallSessionState.create(i3, 7, splitInstallSessionState2.errorCode(), splitInstallSessionState2.bytesDownloaded(), splitInstallSessionState2.totalBytesToDownload(), splitInstallSessionState2.moduleNames(), splitInstallSessionState2.languages());
                            }
                            throw new com.google.android.play.core.splitinstall.SplitInstallException(-3);
                        }
                    });
                }
            });
            if (zzn != null) {
                zzq(zzn);
            }
            return com.google.android.gms.tasks.Tasks.forResult(null);
        } catch (com.google.android.play.core.splitinstall.internal.zzbx e) {
            return com.google.android.gms.tasks.Tasks.forException(e.zzb(com.google.android.play.core.splitinstall.SplitInstallException.class));
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list) {
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list) {
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list) {
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list) {
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (this.zze.zzd() != null) {
            hashSet.addAll(this.zze.zzd());
        }
        hashSet.addAll(this.zzo);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledModules() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.zze.zzc());
        hashSet.addAll(this.zzn);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i) {
        com.google.android.play.core.splitinstall.SplitInstallSessionState zzm = zzm();
        return (zzm == null || zzm.sessionId() != i) ? com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(-4)) : com.google.android.gms.tasks.Tasks.forResult(zzm);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
        com.google.android.play.core.splitinstall.SplitInstallSessionState zzm = zzm();
        return com.google.android.gms.tasks.Tasks.forResult(zzm != null ? java.util.Collections.singletonList(zzm) : java.util.Collections.emptyList());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zza(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z) {
        this.zzp.set(z);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, androidx.view.result.ActivityResultLauncher<androidx.view.result.IntentSenderRequest> activityResultLauncher) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i) throws android.content.IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        if (r1.contains(r14) == false) goto L41;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(final com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        java.lang.Integer zza2;
        java.io.File[] fileArr;
        java.util.Iterator it;
        try {
            com.google.android.play.core.splitinstall.SplitInstallSessionState zzn = zzn(new com.google.android.play.core.splitinstall.testing.zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzk
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final com.google.android.play.core.splitinstall.SplitInstallSessionState zza(final com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
                    final com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest2 = com.google.android.play.core.splitinstall.SplitInstallRequest.this;
                    return (com.google.android.play.core.splitinstall.SplitInstallSessionState) com.google.android.play.core.splitinstall.internal.zzbx.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzn
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState2 = com.google.android.play.core.splitinstall.SplitInstallSessionState.this;
                            com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest3 = splitInstallRequest2;
                            if (splitInstallSessionState2 == null || splitInstallSessionState2.hasTerminalStatus()) {
                                return com.google.android.play.core.splitinstall.SplitInstallSessionState.create(splitInstallSessionState2 != null ? 1 + splitInstallSessionState2.sessionId() : 1, 1, 0, 0L, 0L, splitInstallRequest3.getModuleNames(), new java.util.ArrayList());
                            }
                            throw new com.google.android.play.core.splitinstall.SplitInstallException(-1);
                        }
                    });
                }
            });
            if (zzn == null) {
                return zzk(-100);
            }
            int sessionId = zzn.sessionId();
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.util.Locale> it2 = splitInstallRequest.getLanguages().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getLanguage());
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.io.File[] listFiles = this.zzl.listFiles(new java.io.FileFilter() { // from class: com.google.android.play.core.splitinstall.testing.zzl
                @Override // java.io.FileFilter
                public final boolean accept(java.io.File file) {
                    return file.getName().endsWith(".apk");
                }
            });
            if (listFiles == null) {
                return zzk(-5);
            }
            int i = 0;
            long j = 0;
            while (i < listFiles.length) {
                java.io.File file = listFiles[i];
                java.lang.String zza3 = com.google.android.play.core.splitinstall.internal.zzbw.zza(file);
                java.lang.String zzo = zzo(zza3);
                hashSet.add(zza3);
                if (splitInstallRequest.getModuleNames().contains(zzo)) {
                    java.lang.String zzo2 = zzo(zza3);
                    java.util.HashSet hashSet2 = new java.util.HashSet(this.zzg.zza());
                    java.util.Map zza4 = zzl().zza(java.util.Arrays.asList(zzo2));
                    java.util.HashSet hashSet3 = new java.util.HashSet();
                    java.util.Iterator it3 = zza4.values().iterator();
                    while (it3.hasNext()) {
                        hashSet3.addAll((java.util.Set) it3.next());
                    }
                    java.util.HashSet hashSet4 = new java.util.HashSet();
                    java.util.Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        java.lang.String str = (java.lang.String) it4.next();
                        java.io.File[] fileArr2 = listFiles;
                        if (str.contains("_")) {
                            it = it4;
                            str = str.split("_", -1)[0];
                        } else {
                            it = it4;
                        }
                        hashSet4.add(str);
                        listFiles = fileArr2;
                        it4 = it;
                    }
                    fileArr = listFiles;
                    hashSet4.addAll(this.zzo);
                    hashSet4.addAll(arrayList);
                    java.util.HashSet hashSet5 = new java.util.HashSet();
                    for (java.util.Map.Entry entry : zza4.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((java.util.Collection) entry.getValue());
                        }
                    }
                    if (hashSet3.contains(zza3)) {
                    }
                    j += file.length();
                    arrayList2.add(file);
                    break;
                    i++;
                    listFiles = fileArr;
                } else {
                    fileArr = listFiles;
                }
                java.util.List<java.util.Locale> languages = splitInstallRequest.getLanguages();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(this.zzn);
                arrayList3.addAll(java.util.Arrays.asList("", "base"));
                java.util.Map zza5 = zzl().zza(arrayList3);
                for (java.util.Locale locale : languages) {
                    if (zza5.containsKey(locale.getLanguage()) && ((java.util.Set) zza5.get(locale.getLanguage())).contains(zza3)) {
                        j += file.length();
                        arrayList2.add(file);
                        break;
                    }
                }
                i++;
                listFiles = fileArr;
            }
            splitInstallRequest.getModuleNames();
            if (splitInstallRequest.getModuleNames().size() != 1 || (zza2 = (java.lang.Integer) ((com.google.android.play.core.splitinstall.testing.zzv) this.zzf.zza()).zzb().get(splitInstallRequest.getModuleNames().get(0))) == null) {
                zza2 = ((com.google.android.play.core.splitinstall.testing.zzv) this.zzf.zza()).zza();
            }
            if (zza2 != null) {
                return zzk(zza2.intValue());
            }
            if (!hashSet.containsAll(new java.util.HashSet(splitInstallRequest.getModuleNames()))) {
                return zzk(-2);
            }
            java.util.List<java.lang.String> moduleNames = splitInstallRequest.getModuleNames();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(sessionId);
            zzs(1, 0, 0L, java.lang.Long.valueOf(j), moduleNames, valueOf, arrayList);
            this.zzj.execute(new java.lang.Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzm
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.this.zzi(arrayList2, arrayList);
                }
            });
            return com.google.android.gms.tasks.Tasks.forResult(valueOf);
        } catch (com.google.android.play.core.splitinstall.internal.zzbx e) {
            return zzk(((com.google.android.play.core.splitinstall.SplitInstallException) e.zzb(com.google.android.play.core.splitinstall.SplitInstallException.class)).getErrorCode());
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zzb(splitInstallStateUpdatedListener);
    }

    final /* synthetic */ void zzf(final long j, final java.util.List list, final java.util.List list2, final java.util.List list3) {
        long j2 = 0;
        for (int i = 0; i < 3; i++) {
            j2 = java.lang.Math.min(j, j2 + (j / 3));
            zzs(2, 0, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j), null, null, null);
            android.os.SystemClock.sleep(zzb);
            com.google.android.play.core.splitinstall.SplitInstallSessionState zzm = zzm();
            if (zzm.status() == 9 || zzm.status() == 7 || zzm.status() == 6) {
                return;
            }
        }
        this.zzj.execute(new java.lang.Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzd
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.this.zzh(list, list2, list3, j);
            }
        });
    }

    final /* synthetic */ void zzg(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState) {
        this.zzh.zzc(splitInstallSessionState);
        this.zzi.zzc(splitInstallSessionState);
    }

    final /* synthetic */ void zzh(java.util.List list, java.util.List list2, java.util.List list3, long j) {
        if (this.zzp.get()) {
            zzs(6, -6, null, null, null, null, null);
        } else if (this.zzk.zza() != null) {
            zzp(list, list2, list3, j, false);
        } else {
            zzr(list2, list3, j);
        }
    }

    final /* synthetic */ void zzi(java.util.List list, final java.util.List list2) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.io.File file = (java.io.File) it.next();
            java.lang.String zza2 = com.google.android.play.core.splitinstall.internal.zzbw.zza(file);
            android.net.Uri fromFile = android.net.Uri.fromFile(file);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.zzd.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", zzo(zza2));
            intent.putExtra("split_id", zza2);
            arrayList.add(intent);
            arrayList2.add(zzo(com.google.android.play.core.splitinstall.internal.zzbw.zza(file)));
        }
        com.google.android.play.core.splitinstall.SplitInstallSessionState zzm = zzm();
        if (zzm == null) {
            return;
        }
        final long j = zzm.totalBytesToDownload();
        this.zzj.execute(new java.lang.Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzi
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.this.zzf(j, arrayList, arrayList2, list2);
            }
        });
    }

    @java.lang.Deprecated
    public FakeSplitInstallManager(android.content.Context context, java.io.File file) {
        this(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new com.google.android.play.core.splitinstall.internal.zzby() { // from class: com.google.android.play.core.splitinstall.testing.zze
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final java.lang.Object zza() {
                return com.google.android.play.core.splitinstall.testing.zzv.zza;
            }
        });
    }

    FakeSplitInstallManager(android.content.Context context, java.io.File file, com.google.android.play.core.splitinstall.zzs zzsVar, com.google.android.play.core.splitinstall.internal.zzby zzbyVar) {
        java.util.concurrent.Executor zza2 = com.google.android.play.core.splitcompat.zzd.zza();
        com.google.android.play.core.splitinstall.internal.zzbs zzbsVar = new com.google.android.play.core.splitinstall.internal.zzbs(context);
        com.google.android.play.core.splitinstall.testing.zzj zzjVar = new java.lang.Object() { // from class: com.google.android.play.core.splitinstall.testing.zzj
        };
        this.zzc = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = new java.util.concurrent.atomic.AtomicReference();
        this.zzn = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.zzo = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.zzp = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzd = context;
        this.zzl = file;
        this.zze = zzsVar;
        this.zzf = zzbyVar;
        this.zzj = zza2;
        this.zzg = zzbsVar;
        this.zzq = zzjVar;
        this.zzi = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzh = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzk = com.google.android.play.core.splitinstall.zzo.INSTANCE;
    }

    final java.io.File zzc() {
        return this.zzl;
    }
}
