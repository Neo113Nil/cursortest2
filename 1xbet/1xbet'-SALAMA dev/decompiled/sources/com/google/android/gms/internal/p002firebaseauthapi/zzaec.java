package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import p034e4.m;

/* JADX INFO: loaded from: classes.dex */
final class zzaec implements zzaeg {
    private final /* synthetic */ PhoneAuthCredential zza;

    public zzaec(zzaea zzaeaVar, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(m mVar, Object... objArr) {
        mVar.onVerificationCompleted(this.zza);
    }
}
