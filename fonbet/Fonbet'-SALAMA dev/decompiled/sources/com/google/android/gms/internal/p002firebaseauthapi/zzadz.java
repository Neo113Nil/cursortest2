package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import e4.AbstractC1039m;

/* loaded from: classes.dex */
final class zzadz implements zzaeg {
    private final /* synthetic */ String zza;

    public zzadz(zzaea zzaeaVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(AbstractC1039m abstractC1039m, Object... objArr) {
        abstractC1039m.onCodeSent(this.zza, new PhoneAuthProvider$ForceResendingToken());
    }
}
