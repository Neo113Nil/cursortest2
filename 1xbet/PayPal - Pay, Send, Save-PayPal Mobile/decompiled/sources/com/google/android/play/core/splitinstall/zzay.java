package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzay extends com.google.android.play.core.splitinstall.zzbb {
    zzay(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzg(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        super.zzg(i, bundle);
        this.zza.trySetResult(com.google.android.play.core.splitinstall.SplitInstallSessionState.zzd(bundle));
    }
}
