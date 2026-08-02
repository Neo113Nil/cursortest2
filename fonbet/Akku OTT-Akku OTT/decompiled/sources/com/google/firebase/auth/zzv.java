package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzv implements Runnable {
    private final /* synthetic */ FirebaseAuth zza;
    private final /* synthetic */ InternalTokenResult zzb;

    public zzv(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.zza = firebaseAuth;
        this.zzb = internalTokenResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator<IdTokenListener> it = this.zza.zzc.iterator();
        while (it.hasNext()) {
            it.next().onIdTokenChanged(this.zzb);
        }
        Iterator<FirebaseAuth.IdTokenListener> it2 = this.zza.zza.iterator();
        while (it2.hasNext()) {
            it2.next().onIdTokenChanged(this.zza);
        }
    }
}
