package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzace extends zzady<AuthResult, E> {
    private final zzzg zzu;

    public zzace(PhoneAuthCredential phoneAuthCredential, String str) {
        super(2);
        D.j(phoneAuthCredential, "credential cannot be null");
        phoneAuthCredential.f11880d = false;
        this.zzu = new zzzg(phoneAuthCredential, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithPhoneCredentialWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zzadVarZza = zzabj.zza(this.zzc, this.zzk);
        if (!((zzad) this.zzd).f11909b.f11939a.equalsIgnoreCase(zzadVarZza.f11909b.f11939a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((E) this.zze).a(this.zzj, zzadVarZza);
            zzb(new zzx(zzadVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
