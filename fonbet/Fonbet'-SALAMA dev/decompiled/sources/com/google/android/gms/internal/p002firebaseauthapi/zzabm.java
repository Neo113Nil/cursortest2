package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import e4.C1049w;
import f4.InterfaceC1097i;

/* loaded from: classes.dex */
final class zzabm extends zzady<Void, InterfaceC1097i> {
    public zzabm() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        C1049w c1049w = (C1049w) ((InterfaceC1097i) this.zze);
        FirebaseAuth firebaseAuth = c1049w.f12720b;
        FirebaseUser firebaseUser = firebaseAuth.f11854f;
        if (firebaseUser != null && ((zzad) firebaseUser).f11909b.f11939a.equalsIgnoreCase(((zzad) c1049w.f12719a).f11909b.f11939a)) {
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
