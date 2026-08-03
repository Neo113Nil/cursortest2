package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbaa extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.AuthorizationClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zby zbyVar = new com.google.android.gms.internal.p000authapi.zby();
        zbb = zbyVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.Authorization.API", zbyVar, clientKey);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zbaa(android.app.Activity activity, com.google.android.gms.auth.api.identity.zbc zbcVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbc>) r0, r4.zbb(), com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        com.google.android.gms.common.api.Api api = zbc;
        com.google.android.gms.auth.api.identity.zbb zbc2 = com.google.android.gms.auth.api.identity.zbb.zbc(zbcVar);
        zbc2.zba(com.google.android.gms.internal.p000authapi.zbat.zba());
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.AuthorizationResult> authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(authorizationRequest);
        com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba2 = com.google.android.gms.auth.api.identity.AuthorizationRequest.zba(authorizationRequest);
        zba2.zbb(((com.google.android.gms.auth.api.identity.zbc) getApiOptions()).zbb());
        final com.google.android.gms.auth.api.identity.AuthorizationRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbas.zbc).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p000authapi.zbk) ((com.google.android.gms.internal.p000authapi.zbg) obj).getService()).zbc(new com.google.android.gms.internal.p000authapi.zbz(com.google.android.gms.internal.p000authapi.zbaa.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.AuthorizationRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1534).build());
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException {
        if (intent == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", com.google.android.gms.common.api.Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new com.google.android.gms.common.api.ApiException(status);
        }
        com.google.android.gms.auth.api.identity.AuthorizationResult authorizationResult = (com.google.android.gms.auth.api.identity.AuthorizationResult) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "authorization_result", com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zbaa(android.content.Context context, com.google.android.gms.auth.api.identity.zbc zbcVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbc>) r0, r4.zbb(), com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        com.google.android.gms.common.api.Api api = zbc;
        com.google.android.gms.auth.api.identity.zbb zbc2 = com.google.android.gms.auth.api.identity.zbb.zbc(zbcVar);
        zbc2.zba(com.google.android.gms.internal.p000authapi.zbat.zba());
    }
}
