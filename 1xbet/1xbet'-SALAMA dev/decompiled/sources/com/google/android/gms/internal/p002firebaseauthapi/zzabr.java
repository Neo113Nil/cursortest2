package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import p034e4.k;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzabr extends zzady<AuthResult, E> {
    private final k zzu;
    private final String zzv;
    private final String zzw;

    public zzabr(k kVar, String str, String str2) {
        super(2);
        D.i(kVar);
        this.zzu = kVar;
        D.e(str);
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zzadVarZza = zzabj.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !((zzad) firebaseUser).f11909b.f11939a.equalsIgnoreCase(zzadVarZza.f11909b.f11939a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((E) this.zze).a(this.zzj, zzadVarZza);
            zzb(new zzx(zzadVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
