package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzde extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.MetadataBuffer> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzde(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.DriveResource driveResource) {
        this.zzfq = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.MetadataBuffer> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzex(this.zzfq.getDriveId()), new com.google.android.gms.internal.drive.zzho(taskCompletionSource));
    }
}
