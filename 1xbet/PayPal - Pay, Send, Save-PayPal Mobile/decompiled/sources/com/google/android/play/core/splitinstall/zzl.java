package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzl implements com.google.android.play.core.splitinstall.SplitInstallManager {
    private final com.google.android.play.core.splitinstall.internal.zzby zza;
    private final com.google.android.play.core.splitinstall.internal.zzby zzb;
    private final com.google.android.play.core.splitinstall.internal.zzby zzc;

    private final com.google.android.play.core.splitinstall.SplitInstallManager zzc() {
        return this.zzc.zza() != null ? (com.google.android.play.core.splitinstall.SplitInstallManager) this.zzb.zza() : (com.google.android.play.core.splitinstall.SplitInstallManager) this.zza.zza();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> cancelInstall(int i) {
        return zzc().cancelInstall(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list) {
        return zzc().deferredInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list) {
        return zzc().deferredLanguageInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list) {
        return zzc().deferredLanguageUninstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list) {
        return zzc().deferredUninstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
        return zzc().getInstalledLanguages();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledModules() {
        return zzc().getInstalledModules();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i) {
        return zzc().getSessionState(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
        return zzc().getSessionStates();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().registerListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        return zzc().startInstall(splitInstallRequest);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().unregisterListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, androidx.view.result.ActivityResultLauncher<androidx.view.result.IntentSenderRequest> activityResultLauncher) {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, activityResultLauncher);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i) throws android.content.IntentSender.SendIntentException {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, intentSenderForResultStarter, i);
    }

    zzl(com.google.android.play.core.splitinstall.internal.zzby zzbyVar, com.google.android.play.core.splitinstall.internal.zzby zzbyVar2, com.google.android.play.core.splitinstall.internal.zzby zzbyVar3) {
        this.zza = zzbyVar;
        this.zzb = zzbyVar2;
        this.zzc = zzbyVar3;
    }
}
