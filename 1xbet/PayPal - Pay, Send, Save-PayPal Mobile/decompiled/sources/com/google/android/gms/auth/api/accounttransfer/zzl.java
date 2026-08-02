package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
abstract class zzl extends com.google.android.gms.common.api.internal.TaskApiCall {
    protected com.google.android.gms.tasks.TaskCompletionSource zzb;

    /* synthetic */ zzl(int i, com.google.android.gms.auth.api.accounttransfer.zzk zzkVar) {
        super(null, false, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zzb = taskCompletionSource;
        zza((com.google.android.gms.internal.auth.zzau) ((com.google.android.gms.internal.auth.zzap) anyClient).getService());
    }

    protected abstract void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException;
}
