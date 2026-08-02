package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzy implements Runnable {
    private final /* synthetic */ FirebaseAuth zza;

    public zzy(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<FirebaseAuth.AuthStateListener> it = this.zza.zzb.iterator();
        while (it.hasNext()) {
            it.next().onAuthStateChanged(this.zza);
        }
    }
}
