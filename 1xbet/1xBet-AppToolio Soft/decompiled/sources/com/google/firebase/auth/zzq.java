package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class zzq implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ FirebaseUser zzew;

    zzq(FirebaseUser firebaseUser) {
        this.zzew = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(@NonNull Task<GetTokenResult> task) throws Exception {
        return FirebaseAuth.getInstance(this.zzew.zzo()).zza((ActionCodeSettings) null, task.getResult().getToken());
    }
}
