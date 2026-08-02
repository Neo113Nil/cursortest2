package com.google.firebase.auth;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzk implements Runnable {
    private final /* synthetic */ FirebaseAuth zzeo;
    private final /* synthetic */ InternalTokenResult zzeq;

    zzk(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.zzeo = firebaseAuth;
        this.zzeq = internalTokenResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseApp firebaseApp;
        List list;
        List list2;
        firebaseApp = this.zzeo.zzeb;
        firebaseApp.notifyIdTokenListeners(this.zzeq);
        list = this.zzeo.zzed;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((IdTokenListener) it.next()).onIdTokenChanged(this.zzeq);
        }
        list2 = this.zzeo.zzec;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.IdTokenListener) it2.next()).onIdTokenChanged(this.zzeo);
        }
    }
}
