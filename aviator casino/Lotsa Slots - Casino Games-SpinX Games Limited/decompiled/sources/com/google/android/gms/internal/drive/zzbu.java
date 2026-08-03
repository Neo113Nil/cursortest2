package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzbu extends com.google.android.gms.internal.drive.zzca {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbs zzfh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbu(com.google.android.gms.internal.drive.zzbs zzbsVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        super(googleApiClient);
        this.zzfh = zzbsVar;
        this.zzfd = metadataChangeSet;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar2 = zzawVar;
        this.zzfd.zzq().zza(zzawVar2.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar2.getService()).zza(new com.google.android.gms.internal.drive.zzy(this.zzfh.getDriveId(), this.zzfd.zzq()), new com.google.android.gms.internal.drive.zzbw(this));
    }
}
