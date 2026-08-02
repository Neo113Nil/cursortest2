package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzacf extends zzady<Void, InterfaceC1088E> {
    private final zzzg zzu;

    public zzacf(PhoneAuthCredential phoneAuthCredential, String str) {
        super(2);
        D.j(phoneAuthCredential, "credential cannot be null");
        phoneAuthCredential.f11880d = false;
        this.zzu = new zzzg(phoneAuthCredential, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zza = zzabj.zza(this.zzc, this.zzk);
        if (!((zzad) this.zzd).f11909b.f11939a.equalsIgnoreCase(zza.f11909b.f11939a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((InterfaceC1088E) this.zze).a(this.zzj, zza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
