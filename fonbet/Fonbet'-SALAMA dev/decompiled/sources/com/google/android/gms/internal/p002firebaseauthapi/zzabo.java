package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import e4.AbstractC1037k;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzabo extends zzady<Void, InterfaceC1088E> {
    private final AbstractC1037k zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzabo(AbstractC1037k abstractC1037k, String str, String str2, String str3) {
        super(2);
        D.i(abstractC1037k);
        this.zzu = abstractC1037k;
        D.e(str);
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((InterfaceC1088E) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
