package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import p034e4.m;

/* JADX INFO: loaded from: classes.dex */
final class zzadz implements zzaeg {
    private final /* synthetic */ String zza;

    public zzadz(zzaea zzaeaVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(m mVar, Object... objArr) {
        mVar.onCodeSent(this.zza, new PhoneAuthProvider$ForceResendingToken());
    }
}
