package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzao;

/* JADX INFO: loaded from: classes.dex */
final class zzact extends zzady<zzahh, Void> {
    private final zzaho zzu;

    public zzact(zzao zzaoVar, String str) {
        super(12);
        D.i(zzaoVar);
        String str2 = zzaoVar.f11925a;
        D.e(str2);
        this.zzu = zzaho.zza(str2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
