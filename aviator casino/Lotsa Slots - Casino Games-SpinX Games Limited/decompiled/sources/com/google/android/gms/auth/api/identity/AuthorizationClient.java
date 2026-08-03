package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public interface AuthorizationClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zbc> {
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.AuthorizationResult> authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest);

    com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException;
}
