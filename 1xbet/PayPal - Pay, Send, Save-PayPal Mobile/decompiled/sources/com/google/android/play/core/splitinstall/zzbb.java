package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
class zzbb extends com.google.android.play.core.splitinstall.internal.zzbp {
    final com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.zzbc zzb;

    zzbb(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzb = zzbcVar;
        this.zza = taskCompletionSource;
    }

    public void zzb(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onCancelInstall(%d)", java.lang.Integer.valueOf(i));
    }

    public void zzc(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onDeferredInstall", new java.lang.Object[0]);
    }

    public void zzd(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onDeferredLanguageInstall", new java.lang.Object[0]);
    }

    public void zze(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onDeferredLanguageUninstall", new java.lang.Object[0]);
    }

    public void zzf(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onDeferredUninstall", new java.lang.Object[0]);
    }

    public void zzg(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onGetSession(%d)", java.lang.Integer.valueOf(i));
    }

    public void zzh(java.util.List list) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onGetSessionStates", new java.lang.Object[0]);
    }

    public void zzi(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onStartInstall(%d)", java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzj(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onCompleteInstall(%d)", java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzk(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onCompleteInstallForAppUpdate", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzl(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        int i = bundle.getInt(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzb("onError(%d)", java.lang.Integer.valueOf(i));
        this.zza.trySetException(new com.google.android.play.core.splitinstall.SplitInstallException(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzm(android.os.Bundle bundle) throws android.os.RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzu(this.zza);
        zzuVar = com.google.android.play.core.splitinstall.zzbc.zzb;
        zzuVar.zzd("onGetSplitsForAppUpdate", new java.lang.Object[0]);
    }
}
