package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzax extends com.google.android.gms.internal.identity.zzba {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.google.android.gms.internal.identity.zzbb zzbbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.zza = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) anyClient;
        if (this.zza) {
            zzdzVar.zzy(com.google.android.gms.internal.identity.zzbb.zza(this));
        } else {
            zzdzVar.zzz(com.google.android.gms.internal.identity.zzbb.zza(this));
        }
    }
}
