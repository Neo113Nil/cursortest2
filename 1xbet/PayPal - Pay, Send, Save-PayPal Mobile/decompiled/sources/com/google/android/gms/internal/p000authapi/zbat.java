package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbat extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.SignInClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final java.lang.String zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zbak zbakVar = new com.google.android.gms.internal.p000authapi.zbak();
        zbb = zbakVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.SignIn.API", zbakVar, clientKey);
    }

    public zbat(android.app.Activity activity, com.google.android.gms.auth.api.identity.zbv zbvVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbv>) zbc, zbvVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbaw.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(beginSignInRequest);
        com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.zba(beginSignInRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.BeginSignInRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(new com.google.android.gms.common.Feature("auth_api_credentials_begin_sign_in", 8L)).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbau zbauVar = (com.google.android.gms.internal.p000authapi.zbau) obj;
                ((com.google.android.gms.internal.p000authapi.zbv) zbauVar.getService()).zbc(new com.google.android.gms.internal.p000authapi.zbal(com.google.android.gms.internal.p000authapi.zbat.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.BeginSignInRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbauVar.getContext()));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(final com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(getPhoneNumberHintIntentRequest);
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbi).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbat.this.zbb(getPhoneNumberHintIntentRequest, (com.google.android.gms.internal.p000authapi.zbau) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(1653).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(getSignInIntentRequest);
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba2 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.zba(getSignInIntentRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.GetSignInIntentRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbg).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbaq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbau zbauVar = (com.google.android.gms.internal.p000authapi.zbau) obj;
                ((com.google.android.gms.internal.p000authapi.zbv) zbauVar.getService()).zbe(new com.google.android.gms.internal.p000authapi.zban(com.google.android.gms.internal.p000authapi.zbat.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build), com.google.android.gms.internal.p000authapi.zbba.zba(zbauVar.getContext()));
            }
        }).setMethodKey(1555).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbav.zbb).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbap
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbat.this.zba((com.google.android.gms.internal.p000authapi.zbau) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zba(com.google.android.gms.internal.p000authapi.zbau zbauVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        com.google.android.gms.internal.p000authapi.zbam zbamVar = new com.google.android.gms.internal.p000authapi.zbam(this, taskCompletionSource);
        ((com.google.android.gms.internal.p000authapi.zbv) zbauVar.getService()).zbd(zbamVar, this.zbd, com.google.android.gms.internal.p000authapi.zbba.zba(zbauVar.getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zbb(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, com.google.android.gms.internal.p000authapi.zbau zbauVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        com.google.android.gms.internal.p000authapi.zbao zbaoVar = new com.google.android.gms.internal.p000authapi.zbao(this, taskCompletionSource);
        ((com.google.android.gms.internal.p000authapi.zbv) zbauVar.getService()).zbf(zbaoVar, getPhoneNumberHintIntentRequest, this.zbd, com.google.android.gms.internal.p000authapi.zbba.zba(zbauVar.getContext()));
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final java.lang.String getPhoneNumberFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException {
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
        java.lang.String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException {
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
        com.google.android.gms.auth.api.identity.SignInCredential signInCredential = (com.google.android.gms.auth.api.identity.SignInCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", com.google.android.gms.auth.api.identity.SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
    }

    public zbat(android.content.Context context, com.google.android.gms.auth.api.identity.zbv zbvVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbv>) zbc, zbvVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbaw.zba();
    }
}
