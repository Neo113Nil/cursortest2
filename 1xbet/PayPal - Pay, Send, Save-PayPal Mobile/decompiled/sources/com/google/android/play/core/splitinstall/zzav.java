package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzav extends com.google.android.play.core.splitinstall.zzbb {
    zzav(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzd(android.os.Bundle bundle) throws android.os.RemoteException {
        super.zzd(bundle);
        this.zza.trySetResult(null);
    }
}
