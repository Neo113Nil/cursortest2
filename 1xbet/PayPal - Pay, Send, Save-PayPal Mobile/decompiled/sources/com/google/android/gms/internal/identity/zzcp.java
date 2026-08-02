package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzcp extends com.google.android.gms.internal.identity.zzcq {
    final /* synthetic */ java.util.List zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcp(com.google.android.gms.internal.identity.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List list) {
        super(googleApiClient);
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.identity.zzdz) anyClient).zzF(com.google.android.gms.internal.identity.zzem.zza(this.zza), com.google.android.gms.internal.identity.zzcr.zza(this));
    }
}
