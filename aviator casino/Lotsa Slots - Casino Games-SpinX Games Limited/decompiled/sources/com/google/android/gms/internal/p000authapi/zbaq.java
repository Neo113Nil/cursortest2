package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbaq extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.SignInClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final java.lang.String zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zbal zbalVar = new com.google.android.gms.internal.p000authapi.zbal();
        zbb = zbalVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.SignIn.API", zbalVar, clientKey);
    }

    public zbaq(android.app.Activity activity, com.google.android.gms.auth.api.identity.zbu zbuVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbu>) zbc, zbuVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbat.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(beginSignInRequest);
        com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.zba(beginSignInRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.BeginSignInRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbas.zba).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p000authapi.zbw) ((com.google.android.gms.internal.p000authapi.zbar) obj).getService()).zbc(new com.google.android.gms.internal.p000authapi.zbam(com.google.android.gms.internal.p000authapi.zbaq.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.BeginSignInRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
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
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(final com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(getPhoneNumberHintIntentRequest);
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbas.zbh).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbaq.this.zba(getPhoneNumberHintIntentRequest, (com.google.android.gms.internal.p000authapi.zbar) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(1653).build());
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

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(getSignInIntentRequest);
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba2 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.zba(getSignInIntentRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.GetSignInIntentRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbas.zbf).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p000authapi.zbw) ((com.google.android.gms.internal.p000authapi.zbar) obj).getService()).zbe(new com.google.android.gms.internal.p000authapi.zbao(com.google.android.gms.internal.p000authapi.zbaq.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(build));
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
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbas.zbb).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbaq.this.zbb((com.google.android.gms.internal.p000authapi.zbar) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zba(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, com.google.android.gms.internal.p000authapi.zbar zbarVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.p000authapi.zbw) zbarVar.getService()).zbd(new com.google.android.gms.internal.p000authapi.zbap(this, taskCompletionSource), getPhoneNumberHintIntentRequest, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zbb(com.google.android.gms.internal.p000authapi.zbar zbarVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.p000authapi.zbw) zbarVar.getService()).zbf(new com.google.android.gms.internal.p000authapi.zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(android.content.Context context, com.google.android.gms.auth.api.identity.zbu zbuVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbu>) zbc, zbuVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbat.zba();
    }
}
