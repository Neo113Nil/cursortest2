package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import p034e4.m;

/* JADX INFO: loaded from: classes.dex */
final class zzacs extends zzady<Void, m> {
    private final zzzj zzu;

    public zzacs(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j, boolean z4, boolean z7, String str3, String str4, String str5, boolean z8) {
        super(8);
        D.i(phoneMultiFactorInfo);
        D.e(str);
        this.zzu = new zzzj(phoneMultiFactorInfo, str, str2, j, z4, z7, str3, str4, str5, z8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
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
