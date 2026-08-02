package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzacj extends zzady<Void, InterfaceC1088E> {
    private final zzagg zzu;

    public zzacj(String str, ActionCodeSettings actionCodeSettings) {
        super(6);
        D.f(str, "token cannot be null or empty");
        zzagg zzaggVar = new zzagg(4);
        this.zzu = zzaggVar;
        zzaggVar.zzd(str);
        if (actionCodeSettings != null) {
            zzaggVar.zza(actionCodeSettings);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "sendEmailVerification";
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
