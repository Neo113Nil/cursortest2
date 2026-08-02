package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzabw extends zzady<AuthResult, InterfaceC1088E> {
    private final EmailAuthCredential zzu;

    public zzabw(EmailAuthCredential emailAuthCredential) {
        super(2);
        D.j(emailAuthCredential, "credential cannot be null");
        this.zzu = emailAuthCredential;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkEmailAuthCredential";
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
        EmailAuthCredential emailAuthCredential = this.zzu;
        FirebaseUser firebaseUser = this.zzd;
        emailAuthCredential.getClass();
        emailAuthCredential.f11844d = ((zzad) firebaseUser).f11908a.zzf();
        emailAuthCredential.f11845e = true;
        zzadhVar.zza(new zzafn(emailAuthCredential, null, null), this.zzb);
    }
}
