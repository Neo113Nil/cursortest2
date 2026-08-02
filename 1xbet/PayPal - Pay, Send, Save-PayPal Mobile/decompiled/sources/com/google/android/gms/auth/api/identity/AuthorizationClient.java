package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public interface AuthorizationClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zba> {
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.AuthorizationResult> authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest);

    com.google.android.gms.tasks.Task<java.lang.Void> clearToken(com.google.android.gms.auth.api.identity.ClearTokenRequest clearTokenRequest);

    com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException;

    com.google.android.gms.tasks.Task<java.lang.Void> revokeAccess(com.google.android.gms.auth.api.identity.RevokeAccessRequest revokeAccessRequest);
}
