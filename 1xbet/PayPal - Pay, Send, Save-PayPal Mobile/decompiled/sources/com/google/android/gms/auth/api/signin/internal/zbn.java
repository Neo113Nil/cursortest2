package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public final class zbn {
    private static com.google.android.gms.auth.api.signin.internal.zbn zbd;
    final com.google.android.gms.auth.api.signin.internal.Storage zba;
    com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;
    com.google.android.gms.auth.api.signin.GoogleSignInOptions zbc;

    private zbn(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.Storage storage = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context);
        this.zba = storage;
        this.zbb = storage.getSavedDefaultGoogleSignInAccount();
        this.zbc = storage.getSavedDefaultGoogleSignInOptions();
    }

    public static com.google.android.gms.auth.api.signin.internal.zbn zba(android.content.Context context) {
        com.google.android.gms.auth.api.signin.internal.zbn zbf;
        synchronized (com.google.android.gms.auth.api.signin.internal.zbn.class) {
            zbf = zbf(context.getApplicationContext());
        }
        return zbf;
    }

    private static com.google.android.gms.auth.api.signin.internal.zbn zbf(android.content.Context context) {
        synchronized (com.google.android.gms.auth.api.signin.internal.zbn.class) {
            com.google.android.gms.auth.api.signin.internal.zbn zbnVar = zbd;
            if (zbnVar != null) {
                return zbnVar;
            }
            com.google.android.gms.auth.api.signin.internal.zbn zbnVar2 = new com.google.android.gms.auth.api.signin.internal.zbn(context);
            zbd = zbnVar2;
            return zbnVar2;
        }
    }

    public final void zbb() {
        synchronized (this) {
            this.zba.clear();
            this.zbb = null;
            this.zbc = null;
        }
    }

    public final void zbc(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            this.zba.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
            this.zbb = googleSignInAccount;
            this.zbc = googleSignInOptions;
        }
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zbe() {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions;
        synchronized (this) {
            googleSignInOptions = this.zbc;
        }
        return googleSignInOptions;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbd() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount;
        synchronized (this) {
            googleSignInAccount = this.zbb;
        }
        return googleSignInAccount;
    }
}
