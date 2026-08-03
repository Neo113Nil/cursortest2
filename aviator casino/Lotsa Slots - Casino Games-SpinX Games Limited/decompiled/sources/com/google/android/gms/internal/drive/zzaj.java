package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzaj extends com.google.android.gms.internal.drive.zzav {
    zzaj(com.google.android.gms.internal.drive.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.internal.drive.zzaw zzawVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzgy(this));
    }
}
