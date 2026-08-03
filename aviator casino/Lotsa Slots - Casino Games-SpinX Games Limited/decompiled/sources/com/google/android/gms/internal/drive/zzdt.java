package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzdt extends com.google.android.gms.internal.drive.zzea {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdt(com.google.android.gms.internal.drive.zzdp zzdpVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet) {
        super(zzdpVar, googleApiClient, null);
        this.zzgq = zzdpVar;
        this.zzfd = metadataChangeSet;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar2 = zzawVar;
        this.zzfd.zzq().zza(zzawVar2.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar2.getService()).zza(new com.google.android.gms.internal.drive.zzhf(this.zzgq.zzk, this.zzfd.zzq()), new com.google.android.gms.internal.drive.zzdy(this));
    }
}
