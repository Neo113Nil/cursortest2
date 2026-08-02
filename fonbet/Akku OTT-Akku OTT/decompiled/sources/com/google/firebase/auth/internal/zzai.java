package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactorSession;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzai implements Continuation<GetTokenResult, Task<MultiFactorSession>> {
    private final /* synthetic */ zzaj zza;

    public zzai(zzaj zzajVar) {
        Objects.requireNonNull(zzajVar);
        this.zza = zzajVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<MultiFactorSession> then(Task<GetTokenResult> task) throws Exception {
        zzaf zzafVar;
        if (task.isSuccessful()) {
            String token = task.getResult().getToken();
            zzafVar = this.zza.zza;
            return Tasks.forResult(zzam.zza(token, zzafVar));
        }
        Exception exception = task.getException();
        C0875q.g(exception);
        return Tasks.forException(exception);
    }
}
