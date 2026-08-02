package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzbs extends com.google.android.gms.internal.auth.zzbj {
    zzbs(com.google.android.gms.internal.auth.zzbt zzbtVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.internal.auth.zzbj
    protected final void zza(android.content.Context context, com.google.android.gms.internal.auth.zzbh zzbhVar) throws android.os.RemoteException {
        zzbhVar.zzd(new com.google.android.gms.internal.auth.zzbr(this));
    }
}
