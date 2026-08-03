package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
final class zba extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zba() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.p000authapi.zbe(context, looper, clientSettings, (com.google.android.gms.auth.api.zbd) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
