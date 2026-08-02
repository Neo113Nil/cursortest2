package com.google.android.gms.auth.account;

/* loaded from: classes8.dex */
final class zzf extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zzf() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzam(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
