package com.google.android.gms.internal.p002firebaseauthapi;

import P6.b;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzacn extends zzady<AuthResult, InterfaceC1088E> {
    private final zzahr zzu;

    public zzacn(AuthCredential authCredential, String str) {
        super(2);
        D.j(authCredential, "credential cannot be null");
        this.zzu = b.W(authCredential, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "signInWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zza = zzabj.zza(this.zzc, this.zzk);
        ((InterfaceC1088E) this.zze).a(this.zzj, zza);
        zzb(new zzx(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
