package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzw implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzw(FirebaseAuth firebaseAuth, String str) {
        this.zza = str;
        Objects.requireNonNull(firebaseAuth);
        this.zzb = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(@NonNull Task<GetTokenResult> task) throws Exception {
        String str;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C0875q.g(exception);
            return Tasks.forException(exception);
        }
        zzacq zzacqVar = this.zzb.zzd;
        String str2 = this.zza;
        String token = task.getResult().getToken();
        C0875q.g(token);
        str = this.zzb.zzl;
        return zzacqVar.zza(str2, token, "apple.com", str);
    }
}
