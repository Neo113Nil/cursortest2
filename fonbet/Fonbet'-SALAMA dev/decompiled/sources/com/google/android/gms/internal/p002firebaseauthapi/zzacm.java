package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzacm extends zzady<AuthResult, InterfaceC1088E> {
    private final zzahw zzu;

    public zzacm(String str, String str2) {
        super(2);
        D.f(str, "token cannot be null or empty");
        this.zzu = new zzahw(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "signInWithCustomToken";
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
