package com.google.firebase.auth;

import android.support.v4.media.b;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.gms.internal.p002firebaseauthapi.zzaix;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzcc;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzt implements Continuation<zzair, Task<TotpSecret>> {
    private final /* synthetic */ FirebaseAuth zza;

    public zzt(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.zza = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<TotpSecret> then(Task<zzair> task) throws Exception {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C0875q.g(exception);
            return Tasks.forException(exception);
        }
        zzair result = task.getResult();
        if (!(result instanceof zzaix)) {
            throw new IllegalArgumentException(b.b("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", result.getClass().getName(), "."));
        }
        zzaix zzaixVar = (zzaix) result;
        String zzf = zzaixVar.zzf();
        C0875q.d(zzf);
        String zze = zzaixVar.zze();
        C0875q.d(zze);
        int zzc = zzaixVar.zzc();
        int zzb = zzaixVar.zzb();
        long zzd = zzaixVar.zzd();
        String zza = zzaixVar.zza();
        C0875q.d(zza);
        return Tasks.forResult(new zzcc(zzf, zze, zzc, zzb, zzd, zza, this.zza));
    }
}
