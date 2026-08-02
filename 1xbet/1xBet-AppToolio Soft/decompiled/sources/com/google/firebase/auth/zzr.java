package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class zzr implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ FirebaseUser zzew;
    private final /* synthetic */ ActionCodeSettings zzex;

    zzr(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.zzew = firebaseUser;
        this.zzex = actionCodeSettings;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(@NonNull Task<GetTokenResult> task) throws Exception {
        return FirebaseAuth.getInstance(this.zzew.zzo()).zza(this.zzex, task.getResult().getToken());
    }
}
