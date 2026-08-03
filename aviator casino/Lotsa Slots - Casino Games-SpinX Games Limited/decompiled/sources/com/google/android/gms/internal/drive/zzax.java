package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzax extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzj zzek;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzee zzel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.google.android.gms.internal.drive.zzaw zzawVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.internal.drive.zzj zzjVar, com.google.android.gms.internal.drive.zzee zzeeVar) {
        super(googleApiClient);
        this.zzek = zzjVar;
        this.zzel = zzeeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(this.zzek, this.zzel, (java.lang.String) null, new com.google.android.gms.internal.drive.zzgy(this));
    }
}
