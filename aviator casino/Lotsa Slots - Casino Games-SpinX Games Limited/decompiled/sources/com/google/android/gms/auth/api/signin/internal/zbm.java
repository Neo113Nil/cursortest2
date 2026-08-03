package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public final class zbm {
    private static final com.google.android.gms.common.logging.Logger zba = new com.google.android.gms.common.logging.Logger("GoogleSignInCommon", new java.lang.String[0]);

    public static android.content.Intent zba(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zba.d("getFallbackSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zbc = zbc(context, googleSignInOptions);
        zbc.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zbc;
    }

    public static android.content.Intent zbb(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zba.d("getNoImplementationSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zbc = zbc(context, googleSignInOptions);
        zbc.setAction("com.google.android.gms.auth.NO_IMPL");
        return zbc;
    }

    public static android.content.Intent zbc(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zba.d("getSignInIntent()", new java.lang.Object[0]);
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(context.getPackageName(), googleSignInOptions);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(com.helpshift.proactive.InAppViewConstants.CONFIG, signInConfiguration);
        intent.putExtra(com.helpshift.proactive.InAppViewConstants.CONFIG, bundle);
        return intent;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInResult zbd(android.content.Intent intent) {
        if (intent == null) {
            return new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) intent.getParcelableExtra("googleSignInStatus");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.common.api.OptionalPendingResult zbe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, boolean z) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount zba2;
        com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult;
        com.google.android.gms.common.logging.Logger logger = zba;
        logger.d("silentSignIn()", new java.lang.Object[0]);
        logger.d("getEligibleSavedSignInResult()", new java.lang.Object[0]);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb = com.google.android.gms.auth.api.signin.internal.zbn.zbc(context).zbb();
        if (zbb != null) {
            android.accounts.Account account = zbb.getAccount();
            android.accounts.Account account2 = googleSignInOptions.getAccount();
            if (account != null ? account.equals(account2) : account2 == null) {
                if (!googleSignInOptions.isServerAuthCodeRequested() && ((!googleSignInOptions.isIdTokenRequested() || (zbb.isIdTokenRequested() && com.google.android.gms.common.internal.Objects.equal(googleSignInOptions.getServerClientId(), zbb.getServerClientId()))) && new java.util.HashSet(zbb.getScopes()).containsAll(new java.util.HashSet(googleSignInOptions.getScopes())) && (zba2 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(context).zba()) != null && !zba2.isExpired())) {
                    googleSignInResult = new com.google.android.gms.auth.api.signin.GoogleSignInResult(zba2, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
                    if (googleSignInResult == null) {
                        logger.d("Eligible saved sign in result found", new java.lang.Object[0]);
                        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(googleSignInResult, googleApiClient);
                    }
                    if (z) {
                        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, new com.google.android.gms.common.api.Status(4)), googleApiClient);
                    }
                    logger.d("trySilentSignIn()", new java.lang.Object[0]);
                    return new com.google.android.gms.common.api.internal.OptionalPendingResultImpl(googleApiClient.enqueue(new com.google.android.gms.auth.api.signin.internal.zbg(googleApiClient, context, googleSignInOptions)));
                }
            }
        }
        googleSignInResult = null;
        if (googleSignInResult == null) {
        }
    }

    public static com.google.android.gms.common.api.PendingResult zbf(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z) {
        zba.d("Revoking access", new java.lang.Object[0]);
        java.lang.String savedRefreshToken = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context).getSavedRefreshToken();
        zbh(context);
        return z ? com.google.android.gms.auth.api.signin.internal.zbb.zba(savedRefreshToken) : googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zbk(googleApiClient));
    }

    public static com.google.android.gms.common.api.PendingResult zbg(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z) {
        zba.d("Signing out", new java.lang.Object[0]);
        zbh(context);
        return z ? com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zbi(googleApiClient));
    }

    private static void zbh(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zbn.zbc(context).zbd();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
    }
}
