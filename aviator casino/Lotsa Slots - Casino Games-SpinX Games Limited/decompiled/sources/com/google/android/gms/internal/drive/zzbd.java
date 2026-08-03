package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzbd extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.TransferPreferences> {
    zzbd(com.google.android.gms.internal.drive.zzbb zzbbVar) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.TransferPreferences> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zzb(new com.google.android.gms.internal.drive.zzhm(taskCompletionSource));
    }
}
