package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzcw extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveContents> {
    private final /* synthetic */ int zzdv = 536870912;

    zzcw(com.google.android.gms.internal.drive.zzch zzchVar, int i) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveContents> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzr(this.zzdv), new com.google.android.gms.internal.drive.zzhi(taskCompletionSource));
    }
}
