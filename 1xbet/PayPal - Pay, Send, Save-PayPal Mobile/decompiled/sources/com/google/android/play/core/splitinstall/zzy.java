package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallRequest zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzaa zzb;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.play.core.splitinstall.zzx zzxVar;
        java.util.List zze;
        zzxVar = this.zzb.zzb;
        java.util.List<java.lang.String> moduleNames = this.zza.getModuleNames();
        zze = com.google.android.play.core.splitinstall.zzaa.zze(this.zza.getLanguages());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new java.util.ArrayList<>(moduleNames));
        }
        if (!zze.isEmpty()) {
            bundle.putStringArrayList("languages", new java.util.ArrayList<>(zze));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        zzxVar.zzk(com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(bundle));
    }

    zzy(com.google.android.play.core.splitinstall.zzaa zzaaVar, com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        this.zzb = zzaaVar;
        this.zza = splitInstallRequest;
    }
}
