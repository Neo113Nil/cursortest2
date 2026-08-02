package com.google.firebase.auth;

import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzag implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ ActionCodeSettings zza;
    private final /* synthetic */ FirebaseUser zzb;

    public zzag(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.zza = actionCodeSettings;
        Objects.requireNonNull(firebaseUser);
        this.zzb = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) throws Exception {
        GetTokenResult result = task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(this.zzb.zza());
        ActionCodeSettings actionCodeSettings = this.zza;
        String token = result.getToken();
        C0875q.g(token);
        return firebaseAuth.zza(actionCodeSettings, token);
    }
}
