package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaaz implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zab;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zac;

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zac.zam((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.GoogleApiClient) this.zaa.get()), this.zab, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    zaaz(com.google.android.gms.common.api.internal.zabe zabeVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult) {
        this.zac = zabeVar;
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
    }
}
