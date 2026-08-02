package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzaci extends zzady<Void, InterfaceC1088E> {
    private final zzagg zzu;
    private final String zzv;

    public zzaci(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, String str4) {
        super(4);
        D.f(str, "email cannot be null or empty");
        zzagg zzaggVar = new zzagg(actionCodeSettings.f11840z);
        this.zzu = zzaggVar;
        zzaggVar.zzb(str);
        zzaggVar.zza(actionCodeSettings);
        zzaggVar.zzc(str2);
        zzaggVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzb(this.zzu, this.zzb);
    }
}
