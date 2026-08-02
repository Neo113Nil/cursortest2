package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public final class zbm {
    private static final com.google.android.gms.common.logging.Logger zba = new com.google.android.gms.common.logging.Logger("GoogleSignInCommon", new java.lang.String[0]);

    public static android.content.Intent zba(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zba.d("getSignInIntent()", new java.lang.Object[0]);
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration signInConfiguration = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(context.getPackageName(), googleSignInOptions);
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static android.content.Intent zbb(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zba.d("getFallbackSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zba2 = zba(context, googleSignInOptions);
        zba2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zba2;
    }

    public static android.content.Intent zbc(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        zba.d("getNoImplementationSignInIntent()", new java.lang.Object[0]);
        android.content.Intent zba2 = zba(context, googleSignInOptions);
        zba2.setAction("com.google.android.gms.auth.NO_IMPL");
        return zba2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.common.api.OptionalPendingResult zbd(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, boolean z) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount zbd;
        com.google.android.gms.common.logging.Logger logger = zba;
        logger.d("silentSignIn()", new java.lang.Object[0]);
        logger.d("getEligibleSavedSignInResult()", new java.lang.Object[0]);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions zbe = com.google.android.gms.auth.api.signin.internal.zbn.zba(context).zbe();
        if (zbe != null) {
            android.accounts.Account account = zbe.getAccount();
            android.accounts.Account account2 = googleSignInOptions.getAccount();
            if (account != null ? account.equals(account2) : account2 == null) {
                if (!googleSignInOptions.isServerAuthCodeRequested() && ((!googleSignInOptions.isIdTokenRequested() || (zbe.isIdTokenRequested() && com.google.android.gms.common.internal.Objects.equal(googleSignInOptions.getServerClientId(), zbe.getServerClientId()))) && new java.util.HashSet(zbe.getScopes()).containsAll(new java.util.HashSet(googleSignInOptions.getScopes())) && (zbd = com.google.android.gms.auth.api.signin.internal.zbn.zba(context).zbd()) != null && !zbd.isExpired())) {
                    googleSignInResult = new com.google.android.gms.auth.api.signin.GoogleSignInResult(zbd, com.google.android.gms.common.api.Status.RESULT_SUCCESS);
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

    public static com.google.android.gms.common.api.PendingResult zbe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z) {
        zba.d("Signing out", new java.lang.Object[0]);
        zbh(context);
        return z ? com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zbi(googleApiClient));
    }

    public static com.google.android.gms.common.api.PendingResult zbf(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, boolean z) {
        zba.d("Revoking access", new java.lang.Object[0]);
        java.lang.String savedRefreshToken = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context).getSavedRefreshToken();
        zbh(context);
        return z ? com.google.android.gms.auth.api.signin.internal.zbb.zba(savedRefreshToken) : googleApiClient.execute(new com.google.android.gms.auth.api.signin.internal.zbk(googleApiClient));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInResult zbg(android.content.Intent intent) {
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

    private static void zbh(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zbn.zba(context).zbb();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
    }
}
