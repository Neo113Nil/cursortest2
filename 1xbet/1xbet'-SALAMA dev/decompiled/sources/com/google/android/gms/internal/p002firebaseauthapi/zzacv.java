package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzacv extends zzady<Void, E> {
    private final String zzu;
    private final String zzv;
    private final String zzw;

    public zzacv(String str, String str2, String str3) {
        super(2);
        D.e(str);
        this.zzu = str;
        D.e(str2);
        this.zzv = str2;
        this.zzw = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((E) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzv, this.zzw, this.zzb);
    }
}
