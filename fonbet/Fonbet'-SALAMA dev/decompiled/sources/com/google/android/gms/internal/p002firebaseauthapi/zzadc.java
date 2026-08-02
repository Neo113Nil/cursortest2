package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import e4.AbstractC1039m;

/* loaded from: classes.dex */
final class zzadc extends zzady<Void, AbstractC1039m> {
    private final zzagz zzu;

    public zzadc(zzagz zzagzVar) {
        super(8);
        D.i(zzagzVar);
        this.zzu = zzagzVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
