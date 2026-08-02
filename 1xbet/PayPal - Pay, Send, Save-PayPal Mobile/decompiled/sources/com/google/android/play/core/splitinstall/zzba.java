package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzba extends com.google.android.play.core.splitinstall.zzbb {
    zzba(com.google.android.play.core.splitinstall.zzbc zzbcVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzi(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        super.zzi(i, bundle);
        this.zza.trySetResult(java.lang.Integer.valueOf(i));
    }
}
