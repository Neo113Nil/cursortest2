package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public interface SplitInstallManager {
    com.google.android.gms.tasks.Task<java.lang.Void> cancelInstall(int i);

    com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list);

    com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list);

    com.google.android.gms.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list);

    com.google.android.gms.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list);

    java.util.Set<java.lang.String> getInstalledLanguages();

    java.util.Set<java.lang.String> getInstalledModules();

    com.google.android.gms.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i);

    com.google.android.gms.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates();

    void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException;

    boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, androidx.view.result.ActivityResultLauncher<androidx.view.result.IntentSenderRequest> activityResultLauncher);

    boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, com.google.android.play.core.common.IntentSenderForResultStarter intentSenderForResultStarter, int i) throws android.content.IntentSender.SendIntentException;

    com.google.android.gms.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest);

    void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zza(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zzb(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);
}
