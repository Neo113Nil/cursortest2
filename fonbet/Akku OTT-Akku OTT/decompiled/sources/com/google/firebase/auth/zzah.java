package com.google.firebase.auth;

import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzah implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ FirebaseUser zza;

    public zzah(FirebaseUser firebaseUser) {
        Objects.requireNonNull(firebaseUser);
        this.zza = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) throws Exception {
        GetTokenResult result = task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(this.zza.zza());
        String token = result.getToken();
        C0875q.g(token);
        return firebaseAuth.zza((ActionCodeSettings) null, token);
    }
}
