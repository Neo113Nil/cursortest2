package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.j;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import e4.AbstractC1039m;

/* loaded from: classes.dex */
final class zzaeu extends AbstractC1039m {
    private final /* synthetic */ AbstractC1039m zza;
    private final /* synthetic */ String zzb;

    public zzaeu(AbstractC1039m abstractC1039m, String str) {
        this.zza = abstractC1039m;
        this.zzb = str;
    }

    @Override // e4.AbstractC1039m
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaer.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // e4.AbstractC1039m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.zza.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationFailed(j jVar) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationFailed(jVar);
    }
}
