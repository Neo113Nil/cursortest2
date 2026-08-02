package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;

/* loaded from: classes.dex */
final class zzada extends zzady<Void, Void> {
    private final zzagg zzu;

    public zzada(String str, String str2, ActionCodeSettings actionCodeSettings) {
        super(6);
        D.e(str);
        D.e(str2);
        D.i(actionCodeSettings);
        this.zzu = zzagg.zza(actionCodeSettings, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzc(this.zzu, this.zzb);
    }
}
