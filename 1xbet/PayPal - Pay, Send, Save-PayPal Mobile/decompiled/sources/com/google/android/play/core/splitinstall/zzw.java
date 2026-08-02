package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallSessionState zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzx zzd;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.play.core.splitinstall.zzx zzxVar = this.zzd;
        com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState = this.zza;
        zzxVar.zzk(new com.google.android.play.core.splitinstall.zza(splitInstallSessionState.sessionId(), this.zzb, this.zzc, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.zzb(), splitInstallSessionState.zza(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.zzc()));
    }

    zzw(com.google.android.play.core.splitinstall.zzx zzxVar, com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = i;
        this.zzc = i2;
    }
}
