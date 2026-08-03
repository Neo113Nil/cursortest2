package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzdb extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveFolder> {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ com.google.android.gms.drive.DriveFolder zzfz;

    zzdb(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveFolder driveFolder) {
        this.zzfd = metadataChangeSet;
        this.zzfz = driveFolder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveFolder> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar2 = zzawVar;
        this.zzfd.zzq().zza(zzawVar2.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar2.getService()).zza(new com.google.android.gms.internal.drive.zzy(this.zzfz.getDriveId(), this.zzfd.zzq()), new com.google.android.gms.internal.drive.zzhk(taskCompletionSource));
    }
}
