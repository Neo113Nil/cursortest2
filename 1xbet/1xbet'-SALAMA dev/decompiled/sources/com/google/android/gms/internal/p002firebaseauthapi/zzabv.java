package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzabv extends zzady<AuthResult, E> {
    private final EmailAuthCredential zzu;
    private final String zzv;

    public zzabv(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        D.j(emailAuthCredential, "credential cannot be null");
        this.zzu = emailAuthCredential;
        D.f(emailAuthCredential.f11841a, "email cannot be null");
        D.f(emailAuthCredential.f11842b, "password cannot be null");
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkEmailAuthCredential";
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
        EmailAuthCredential emailAuthCredential = this.zzu;
        String str = emailAuthCredential.f11841a;
        String str2 = emailAuthCredential.f11842b;
        D.e(str2);
        zzadhVar.zza(str, str2, ((zzad) this.zzd).f11908a.zzf(), this.zzd.j(), this.zzv, this.zzb);
    }
}
