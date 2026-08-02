package com.google.android.gms.auth.api.signin;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class GoogleSignInClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.signin.GoogleSignInOptions> {
    private static final com.google.android.gms.auth.api.signin.zba zbb = new com.google.android.gms.auth.api.signin.zba(null);
    static int zba = 1;

    GoogleSignInClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(activity, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    private final int zba() {
        int i;
        synchronized (this) {
            i = zba;
            if (i == 1) {
                android.content.Context applicationContext = getApplicationContext();
                com.google.android.gms.common.GoogleApiAvailability googleApiAvailability = com.google.android.gms.common.GoogleApiAvailability.getInstance();
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable == 0) {
                    i = 4;
                    zba = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) != null || com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    zba = 2;
                } else {
                    i = 3;
                    zba = 3;
                }
            }
        }
        return i;
    }

    public android.content.Intent getSignInIntent() {
        android.content.Context applicationContext = getApplicationContext();
        int zba2 = zba();
        int i = zba2 - 1;
        if (zba2 != 0) {
            return i != 2 ? i != 3 ? com.google.android.gms.auth.api.signin.internal.zbm.zbc(applicationContext, getApiOptions()) : com.google.android.gms.auth.api.signin.internal.zbm.zba(applicationContext, getApiOptions()) : com.google.android.gms.auth.api.signin.internal.zbm.zbb(applicationContext, getApiOptions());
        }
        throw null;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> revokeAccess() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zbm.zbf(asGoogleApiClient(), getApplicationContext(), zba() == 3));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.signin.internal.zbm.zbe(asGoogleApiClient(), getApplicationContext(), zba() == 3));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> silentSignIn() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(com.google.android.gms.auth.api.signin.internal.zbm.zbd(asGoogleApiClient(), getApplicationContext(), getApiOptions(), zba() == 3), zbb);
    }

    GoogleSignInClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(context, com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
    }
}
