package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public interface CredentialSavingClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.identity.zbi> {
    com.google.android.gms.common.api.Status getStatusFromIntent(android.content.Intent intent);

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult> saveAccountLinkingToken(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SavePasswordResult> savePassword(com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest);
}
