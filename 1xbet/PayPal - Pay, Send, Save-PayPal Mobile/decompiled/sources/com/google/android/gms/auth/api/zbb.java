package com.google.android.gms.auth.api;

/* loaded from: classes8.dex */
final class zbb extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zbb() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.auth.api.signin.internal.zbe(context, looper, clientSettings, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final /* synthetic */ java.util.List getImpliedScopes(java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
        return googleSignInOptions == null ? java.util.Collections.emptyList() : googleSignInOptions.getScopes();
    }
}
