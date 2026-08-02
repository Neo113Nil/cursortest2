package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzj extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.fido.zzk(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
