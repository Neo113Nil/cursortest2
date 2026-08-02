package com.google.android.gms.common.internal.service;

/* loaded from: classes8.dex */
final class zac extends com.google.android.gms.common.internal.service.zaf {
    zac(com.google.android.gms.common.internal.service.zae zaeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.common.internal.service.zal) ((com.google.android.gms.common.internal.service.zah) anyClient).getService()).zae(new com.google.android.gms.common.internal.service.zad(this));
    }
}
