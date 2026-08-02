package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbad extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.AuthorizationClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final java.lang.String zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zbw zbwVar = new com.google.android.gms.internal.p000authapi.zbw();
        zbb = zbwVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.Authorization.API", zbwVar, clientKey);
    }

    public zbad(android.app.Activity activity, com.google.android.gms.auth.api.identity.zba zbaVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zba>) zbc, zbaVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbaw.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.AuthorizationResult> authorize(com.google.android.gms.auth.api.identity.AuthorizationRequest authorizationRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(authorizationRequest);
        com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder zba2 = com.google.android.gms.auth.api.identity.AuthorizationRequest.zba(authorizationRequest);
        zba2.zbb(this.zbd);
        final com.google.android.gms.auth.api.identity.AuthorizationRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbc).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbf zbfVar = (com.google.android.gms.internal.p000authapi.zbf) obj;
                ((com.google.android.gms.internal.p000authapi.zbj) zbfVar.getService()).zbc(new com.google.android.gms.internal.p000authapi.zbx(com.google.android.gms.internal.p000authapi.zbad.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.AuthorizationRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbfVar.getContext()));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1534).build());
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> clearToken(com.google.android.gms.auth.api.identity.ClearTokenRequest clearTokenRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(clearTokenRequest);
        com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder zba2 = clearTokenRequest.zba();
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.ClearTokenRequest build = zba2.build();
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbe).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbf zbfVar = (com.google.android.gms.internal.p000authapi.zbf) obj;
                ((com.google.android.gms.internal.p000authapi.zbj) zbfVar.getService()).zbe(new com.google.android.gms.internal.p000authapi.zbz(com.google.android.gms.internal.p000authapi.zbad.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.ClearTokenRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbfVar.getContext()));
            }
        }).setMethodKey(1721).build());
    }

    @Override // com.google.android.gms.auth.api.identity.AuthorizationClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> revokeAccess(com.google.android.gms.auth.api.identity.RevokeAccessRequest revokeAccessRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(revokeAccessRequest);
        com.google.android.gms.auth.api.identity.RevokeAccessRequest.Builder zba2 = revokeAccessRequest.zba();
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.RevokeAccessRequest build = zba2.build();
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbd).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbaa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbf zbfVar = (com.google.android.gms.internal.p000authapi.zbf) obj;
                ((com.google.android.gms.internal.p000authapi.zbj) zbfVar.getService()).zbd(new com.google.android.gms.internal.p000authapi.zby(com.google.android.gms.internal.p000authapi.zbad.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.RevokeAccessRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbfVar.getContext()));
            }
        }).setMethodKey(1721).build());
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

    public zbad(android.content.Context context, com.google.android.gms.auth.api.identity.zba zbaVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zba>) zbc, zbaVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbaw.zba();
    }
}
