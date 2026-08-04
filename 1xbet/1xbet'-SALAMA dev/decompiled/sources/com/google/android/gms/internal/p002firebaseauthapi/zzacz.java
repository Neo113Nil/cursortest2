package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzad;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzacz extends zzady<Void, E> {
    private final String zzu;

    public zzacz(String str) {
        super(2);
        D.f(str, "password cannot be null or empty");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "updatePassword";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((E) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzc(((zzad) this.zzd).f11908a.zzf(), this.zzu, this.zzb);
    }
}
