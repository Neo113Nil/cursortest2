package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzcx extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveContents> {
    private final /* synthetic */ com.google.android.gms.drive.DriveContents zzfx;

    zzcx(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.DriveContents driveContents) {
        this.zzfx = driveContents;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveContents> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzgj(this.zzfx.getDriveId(), 536870912, this.zzfx.zzi().getRequestId()), new com.google.android.gms.internal.drive.zzhi(taskCompletionSource));
    }
}
