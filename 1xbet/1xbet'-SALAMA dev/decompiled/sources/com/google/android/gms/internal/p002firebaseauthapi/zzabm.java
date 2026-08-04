package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import p034e4.w;
import p042f4.InterfaceC0900i;

/* JADX INFO: loaded from: classes.dex */
final class zzabm extends zzady<Void, InterfaceC0900i> {
    public zzabm() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        w wVar = (w) ((InterfaceC0900i) this.zze);
        FirebaseAuth firebaseAuth = wVar.f12726b;
        FirebaseUser firebaseUser = firebaseAuth.f11854f;
        if (firebaseUser != null && ((zzad) firebaseUser).f11909b.f11939a.equalsIgnoreCase(((zzad) wVar.f12725a).f11909b.f11939a)) {
            firebaseAuth.p();
        }
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(((zzad) this.zzd).f11908a.zzf(), this.zzb);
    }
}
