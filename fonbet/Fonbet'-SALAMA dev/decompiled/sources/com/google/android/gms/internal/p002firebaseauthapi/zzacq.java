package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzao;
import f4.InterfaceC1088E;

/* loaded from: classes.dex */
final class zzacq extends zzady<Void, InterfaceC1088E> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzacq(zzao zzaoVar, String str, String str2, long j, boolean z4, boolean z7, String str3, String str4, String str5, boolean z8) {
        super(8);
        D.i(zzaoVar);
        D.e(str);
        String str6 = zzaoVar.f11925a;
        D.e(str6);
        this.zzu = str6;
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j;
        this.zzy = z4;
        this.zzz = z7;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z8;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
