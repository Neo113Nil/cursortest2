package com.google.android.gms.internal.p002firebaseauthapi;

import P6.b;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzabu extends zzady<AuthResult, E> {
    private final zzahr zzu;

    public zzabu(AuthCredential authCredential) {
        super(2);
        D.j(authCredential, "credential cannot be null");
        this.zzu = b.W(authCredential, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zzadVarZza = zzabj.zza(this.zzc, this.zzk);
        ((E) this.zze).a(this.zzj, zzadVarZza);
        zzb(new zzx(zzadVarZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(((zzad) this.zzd).f11908a.zzf(), this.zzu, this.zzb);
    }
}
