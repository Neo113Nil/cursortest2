package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzaco extends zzady<AuthResult, InterfaceC1088E> {
    private final zzafn zzu;

    public zzaco(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        D.j(emailAuthCredential, "credential cannot be null");
        this.zzu = new zzafn(emailAuthCredential, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "sendSignInLinkToEmail";
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
