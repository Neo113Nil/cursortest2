package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzcy extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzew;
    private final /* synthetic */ com.google.android.gms.drive.DriveContents zzfx;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzfy;

    zzcy(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.zzn zznVar, com.google.android.gms.drive.DriveContents driveContents, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        this.zzfy = zznVar;
        this.zzfx = driveContents;
        this.zzew = metadataChangeSet;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar2 = zzawVar;
        try {
            this.zzfy.zza(zzawVar2);
        } catch (java.lang.IllegalStateException e) {
            taskCompletionSource.setException(e);
        }
        this.zzfx.zzj();
        this.zzew.zzq().zza(zzawVar2.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar2.getService()).zza(new com.google.android.gms.internal.drive.zzm(this.zzfx.getDriveId(), this.zzew.zzq(), this.zzfx.zzi().getRequestId(), this.zzfx.zzi().zzb(), this.zzfy), new com.google.android.gms.internal.drive.zzhr(taskCompletionSource));
    }
}
