package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import e4.AbstractC1039m;

/* loaded from: classes.dex */
final class zzaec implements zzaeg {
    private final /* synthetic */ PhoneAuthCredential zza;

    public zzaec(zzaea zzaeaVar, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(AbstractC1039m abstractC1039m, Object... objArr) {
        abstractC1039m.onVerificationCompleted(this.zza);
    }
}
