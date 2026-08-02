package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzak implements Continuation<AuthResult, Task<AuthResult>> {
    private final /* synthetic */ zzal zza;

    public zzak(zzal zzalVar) {
        Objects.requireNonNull(zzalVar);
        this.zza = zzalVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<AuthResult> then(@NonNull Task<AuthResult> task) throws Exception {
        com.google.firebase.auth.zze zzeVar;
        com.google.firebase.auth.zze zzeVar2;
        com.google.firebase.auth.zze zzeVar3;
        zzeVar = this.zza.zzd;
        if (zzeVar == null) {
            return task;
        }
        if (task.isSuccessful()) {
            AuthResult result = task.getResult();
            zzaf zzafVar = (zzaf) result.getUser();
            zzx zzxVar = (zzx) result.getAdditionalUserInfo();
            zzeVar3 = this.zza.zzd;
            return Tasks.forResult(new zzz(zzafVar, zzxVar, zzeVar3));
        }
        Exception exception = task.getException();
        if (exception instanceof FirebaseAuthUserCollisionException) {
            zzeVar2 = this.zza.zzd;
            ((FirebaseAuthUserCollisionException) exception).zza(zzeVar2);
        }
        return Tasks.forException(exception);
    }
}
