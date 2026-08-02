package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzacl extends zzady<Void, InterfaceC1088E> {
    private final zzahd zzu;

    public zzacl(String str) {
        super(9);
        this.zzu = new zzahd(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "setFirebaseUIVersion";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
