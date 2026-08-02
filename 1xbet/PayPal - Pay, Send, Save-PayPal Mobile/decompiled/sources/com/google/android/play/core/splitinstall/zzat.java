package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzat extends com.google.android.play.core.splitinstall.zzbb {
    zzat(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzb(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        super.zzb(i, bundle);
        this.zza.trySetResult(null);
    }
}
