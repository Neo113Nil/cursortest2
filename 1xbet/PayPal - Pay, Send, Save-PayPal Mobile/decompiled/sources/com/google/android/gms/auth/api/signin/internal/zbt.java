package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public final class zbt extends com.google.android.gms.auth.api.signin.internal.zbo {
    private final android.content.Context zba;

    public zbt(android.content.Context context) {
        this.zba = context;
    }

    private final void zbd() {
        if (com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(this.zba, android.os.Binder.getCallingUid())) {
            return;
        }
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new java.lang.SecurityException(sb.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbb() {
        zbd();
        android.content.Context context = this.zba;
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        com.google.android.gms.auth.api.signin.GoogleSignInClient client = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(context, googleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            client.revokeAccess();
        } else {
            client.signOut();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbc() {
        zbd();
        com.google.android.gms.auth.api.signin.internal.zbn.zba(this.zba).zbb();
    }
}
