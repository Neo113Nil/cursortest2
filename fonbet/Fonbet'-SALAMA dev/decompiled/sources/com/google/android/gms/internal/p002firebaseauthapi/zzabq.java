package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import e4.C1036j;
import f4.InterfaceC1088E;
import f4.p;

/* loaded from: classes.dex */
final class zzabq extends zzady<C1036j, InterfaceC1088E> {
    private final String zzu;

    public zzabq(String str) {
        super(1);
        D.f(str, "refresh token cannot be null");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzu);
        }
        ((InterfaceC1088E) this.zze).a(this.zzj, this.zzd);
        zzb(p.a(this.zzj.zzc()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzb(this.zzu, this.zzb);
    }
}
