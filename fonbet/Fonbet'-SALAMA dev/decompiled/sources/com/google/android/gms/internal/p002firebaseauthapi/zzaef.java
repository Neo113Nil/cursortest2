package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class zzaef<ResultT, CallbackT> implements zzadw<ResultT> {
    private final zzady<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzaef(zzady<ResultT, CallbackT> zzadyVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzadyVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadw
    public final void zza(ResultT resultt, Status status) {
        D.j(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzady<ResultT, CallbackT> zzadyVar = this.zza;
        if (zzadyVar.zzq != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzadyVar.zzc);
            zzady<ResultT, CallbackT> zzadyVar2 = this.zza;
            taskCompletionSource.setException(zzadg.zza(firebaseAuth, zzadyVar2.zzq, ("reauthenticateWithCredential".equals(zzadyVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AuthCredential authCredential = zzadyVar.zzn;
        if (authCredential != null) {
            this.zzb.setException(zzadg.zza(status, authCredential, zzadyVar.zzo, zzadyVar.zzp));
        } else {
            this.zzb.setException(zzadg.zza(status));
        }
    }
}
