package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzl implements Runnable {
    private final /* synthetic */ FirebaseAuth zzeo;

    zzl(FirebaseAuth firebaseAuth) {
        this.zzeo = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.zzeo.zzee;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.AuthStateListener) it.next()).onAuthStateChanged(this.zzeo);
        }
    }
}
