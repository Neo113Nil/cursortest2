package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p042f4.C0898g;
import p042f4.E;

/* JADX INFO: loaded from: classes.dex */
final class zzabp extends zzady<C0898g, E> {
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
        List<String> listZza;
        if (this.zzl.zza() == null) {
            listZza = zzal.zzh();
        } else {
            listZza = this.zzl.zza();
            D.i(listZza);
        }
        zzb(new C0898g(listZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zze(this.zzu, this.zzv, this.zzb);
    }
}
