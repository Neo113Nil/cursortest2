package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzbk extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzew;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(com.google.android.gms.internal.drive.zzbi zzbiVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.zzn zznVar) {
        super(googleApiClient);
        this.zzev = zzbiVar;
        this.zzew = metadataChangeSet;
        this.zzex = zznVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar) throws android.os.RemoteException {
        com.google.android.gms.drive.Contents contents;
        com.google.android.gms.drive.Contents contents2;
        com.google.android.gms.drive.Contents contents3;
        com.google.android.gms.internal.drive.zzaw zzawVar2 = zzawVar;
        this.zzew.zzq().zza(zzawVar2.getContext());
        com.google.android.gms.internal.drive.zzeo zzeoVar = (com.google.android.gms.internal.drive.zzeo) zzawVar2.getService();
        contents = this.zzev.zzes;
        com.google.android.gms.drive.DriveId driveId = contents.getDriveId();
        com.google.android.gms.drive.metadata.internal.MetadataBundle zzq = this.zzew.zzq();
        contents2 = this.zzev.zzes;
        int requestId = contents2.getRequestId();
        contents3 = this.zzev.zzes;
        zzeoVar.zza(new com.google.android.gms.internal.drive.zzm(driveId, zzq, requestId, contents3.zzb(), this.zzex), new com.google.android.gms.internal.drive.zzgy(this));
    }
}
