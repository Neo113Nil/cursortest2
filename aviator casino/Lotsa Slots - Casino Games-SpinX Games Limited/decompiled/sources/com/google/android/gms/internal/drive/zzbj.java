package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzbj extends com.google.android.gms.internal.drive.zzam {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(com.google.android.gms.internal.drive.zzbi zzbiVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzev = zzbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar) throws android.os.RemoteException {
        com.google.android.gms.drive.Contents contents;
        com.google.android.gms.internal.drive.zzeo zzeoVar = (com.google.android.gms.internal.drive.zzeo) zzawVar.getService();
        com.google.android.gms.drive.DriveId driveId = this.zzev.getDriveId();
        contents = this.zzev.zzes;
        zzeoVar.zza(new com.google.android.gms.internal.drive.zzgj(driveId, 536870912, contents.getRequestId()), new com.google.android.gms.internal.drive.zzgl(this, null));
    }
}
