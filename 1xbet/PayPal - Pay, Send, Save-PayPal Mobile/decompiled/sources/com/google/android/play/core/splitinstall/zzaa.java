package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzaa implements com.google.android.play.core.splitinstall.SplitInstallManager {
    private final com.google.android.play.core.splitinstall.zzbc zza;
    private final com.google.android.play.core.splitinstall.zzx zzb;
    private final com.google.android.play.core.splitinstall.zzs zzc;
    private final com.google.android.play.core.splitinstall.zzbe zzd;
    private final android.os.Handler zze = new android.os.Handler(android.os.Looper.getMainLooper());

    zzaa(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.play.core.splitinstall.zzx zzxVar, com.google.android.play.core.splitinstall.zzs zzsVar, com.google.android.play.core.splitinstall.zzbe zzbeVar) {
        this.zza = zzbcVar;
        this.zzb = zzxVar;
        this.zzc = zzsVar;
        this.zzd = zzbeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.List zze(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.util.Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> cancelInstall(int i) {
        return this.zza.zzc(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list) {
        return this.zza.zzd(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list) {
        return this.zza.zze(zze(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list) {
        return this.zza.zzf(zze(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list) {
        this.zzd.zzc(list);
        return this.zza.zzg(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
        java.util.Set<java.lang.String> zzd = this.zzc.zzd();
        return zzd == null ? java.util.Collections.emptySet() : zzd;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledModules() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i) {
        return this.zza.zzh(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
        return this.zza.zzi();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzb.zzb(splitInstallStateUpdatedListener);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        return startConfirmationDialogForResult(splitInstallSessionState, new com.google.android.play.core.splitinstall.zzz(this, activity), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r2.containsAll(r3) != false) goto L12;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        com.google.android.play.core.splitinstall.internal.zzn zznVar = new com.google.android.play.core.splitinstall.internal.zzn();
        zznVar.zzb(1);
        splitInstallRequest.getLanguages().isEmpty();
        java.util.List<java.util.Locale> languages = splitInstallRequest.getLanguages();
        if (!languages.isEmpty() && (r2 = this.zzc.zzd()) != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<java.util.Locale> it = languages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
        }
        if (this.zzc.zzc().containsAll(splitInstallRequest.getModuleNames()) && java.util.Collections.disjoint(splitInstallRequest.getModuleNames(), this.zzd.zza())) {
            this.zze.post(new com.google.android.play.core.splitinstall.zzy(this, splitInstallRequest));
            return com.google.android.gms.tasks.Tasks.forResult(0);
        }
        this.zzd.zzd(splitInstallRequest.getModuleNames());
        return this.zza.zzj(splitInstallRequest.getModuleNames(), zze(splitInstallRequest.getLanguages()), zznVar);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzb.zzd(splitInstallStateUpdatedListener);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzb.zzi(splitInstallStateUpdatedListener);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            this.zzb.zzj(splitInstallStateUpdatedListener);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, androidx.view.result.ActivityResultLauncher<androidx.view.result.IntentSenderRequest> activityResultLauncher) {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        activityResultLauncher.launch(new androidx.activity.result.IntentSenderRequest.Builder(splitInstallSessionState.resolutionIntent().getIntentSender()).build());
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i) throws android.content.IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        intentSenderForResultStarter.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }
}
