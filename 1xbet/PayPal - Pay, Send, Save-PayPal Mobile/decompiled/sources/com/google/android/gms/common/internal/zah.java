package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
final class zah implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.ConnectionCallbacks zaa;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zaa.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaa.onConnectionSuspended(i);
    }

    zah(com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks) {
        this.zaa = connectionCallbacks;
    }
}
