package com.google.android.gms.internal.p002firebaseauthapi;

import P6.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzad;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzabz extends zzady<Void, E> {
    private final zzahr zzu;

    public zzabz(AuthCredential authCredential, String str) {
        super(2);
        D.j(authCredential, "credential cannot be null");
        this.zzu = b.W(authCredential, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzad zzadVarZza = zzabj.zza(this.zzc, this.zzk);
        if (!((zzad) this.zzd).f11909b.f11939a.equalsIgnoreCase(zzadVarZza.f11909b.f11939a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((E) this.zze).a(this.zzj, zzadVarZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
