package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import f4.C1095g;
import f4.InterfaceC1088E;
import java.util.List;

/* loaded from: classes.dex */
final class zzabp extends zzady<C1095g, InterfaceC1088E> {
    private final String zzu;
    private final String zzv;

    public zzabp(String str, String str2) {
        super(3);
        D.f(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        List<String> zza;
        if (this.zzl.zza() == null) {
            zza = zzal.zzh();
        } else {
            zza = this.zzl.zza();
            D.i(zza);
        }
        zzb(new C1095g(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zze(this.zzu, this.zzv, this.zzb);
    }
}
