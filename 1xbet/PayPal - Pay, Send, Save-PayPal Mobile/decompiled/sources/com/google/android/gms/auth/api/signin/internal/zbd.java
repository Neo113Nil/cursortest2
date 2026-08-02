package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public final class zbd implements com.google.android.gms.auth.api.signin.GoogleSignInApi {
    private static final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return ((com.google.android.gms.auth.api.signin.internal.zbe) googleApiClient.getClient(com.google.android.gms.auth.api.Auth.zbb)).zba();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zba(googleApiClient.getContext(), zba(googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbg(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbf(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbe(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbd(googleApiClient, googleApiClient.getContext(), zba(googleApiClient), false);
    }
}
