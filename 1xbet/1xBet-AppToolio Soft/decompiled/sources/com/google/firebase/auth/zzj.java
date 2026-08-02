package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class zzj implements Runnable {
    private final /* synthetic */ FirebaseAuth zzeo;
    private final /* synthetic */ FirebaseAuth.AuthStateListener zzep;

    zzj(FirebaseAuth firebaseAuth, FirebaseAuth.AuthStateListener authStateListener) {
        this.zzeo = firebaseAuth;
        this.zzep = authStateListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzep.onAuthStateChanged(this.zzeo);
    }
}
