package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzacp extends zzady<AuthResult, E> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzacp(String str, String str2, String str3, String str4) {
        super(2);
        D.f(str, "email cannot be null or empty");
        D.f(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "signInWithEmailAndPassword";
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
        zzadhVar.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
