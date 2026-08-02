package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import e4.AbstractC1037k;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzabr extends zzady<AuthResult, InterfaceC1088E> {
    private final AbstractC1037k zzu;
    private final String zzv;
    private final String zzw;

    public zzabr(AbstractC1037k abstractC1037k, String str, String str2) {
        super(2);
        D.i(abstractC1037k);
        this.zzu = abstractC1037k;
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
        zzad zza = zzabj.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !((zzad) firebaseUser).f11909b.f11939a.equalsIgnoreCase(zza.f11909b.f11939a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((InterfaceC1088E) this.zze).a(this.zzj, zza);
            zzb(new zzx(zza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
