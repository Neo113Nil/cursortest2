package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbaj extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.CredentialSavingClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final java.lang.String zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zbae zbaeVar = new com.google.android.gms.internal.p000authapi.zbae();
        zbb = zbaeVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.CredentialSaving.API", zbaeVar, clientKey);
    }

    public zbaj(android.app.Activity activity, com.google.android.gms.auth.api.identity.zbi zbiVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbi>) zbc, zbiVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbaw.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.common.api.Status getStatusFromIntent(android.content.Intent intent) {
        if (intent == null) {
            return com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", com.google.android.gms.common.api.Status.CREATOR);
        return status == null ? com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR : status;
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult> saveAccountLinkingToken(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zba2 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.zba(saveAccountLinkingTokenRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbh).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbg zbgVar = (com.google.android.gms.internal.p000authapi.zbg) obj;
                ((com.google.android.gms.internal.p000authapi.zbm) zbgVar.getService()).zbc(new com.google.android.gms.internal.p000authapi.zbaf(com.google.android.gms.internal.p000authapi.zbaj.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbgVar.getContext()));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SavePasswordResult> savePassword(com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(savePasswordRequest);
        com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zba2 = com.google.android.gms.auth.api.identity.SavePasswordRequest.zba(savePasswordRequest);
        zba2.zbb(this.zbd);
        final com.google.android.gms.auth.api.identity.SavePasswordRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbf).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbah
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbg zbgVar = (com.google.android.gms.internal.p000authapi.zbg) obj;
                ((com.google.android.gms.internal.p000authapi.zbm) zbgVar.getService()).zbd(new com.google.android.gms.internal.p000authapi.zbag(com.google.android.gms.internal.p000authapi.zbaj.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.SavePasswordRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbgVar.getContext()));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public zbaj(android.content.Context context, com.google.android.gms.auth.api.identity.zbi zbiVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbi>) zbc, zbiVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbaw.zba();
    }
}
