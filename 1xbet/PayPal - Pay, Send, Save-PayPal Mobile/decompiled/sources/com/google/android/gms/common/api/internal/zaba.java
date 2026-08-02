package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaba implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.setResult(new com.google.android.gms.common.api.Status(8));
    }

    zaba(com.google.android.gms.common.api.internal.zabe zabeVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }
}
