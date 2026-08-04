package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.j;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import p034e4.m;

/* JADX INFO: loaded from: classes.dex */
final class zzaeu extends m {
    private final /* synthetic */ m zza;
    private final /* synthetic */ String zzb;

    public zzaeu(m mVar, String str) {
        this.zza = mVar;
        this.zzb = str;
    }

    @Override // p034e4.m
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaer.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // p034e4.m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.zza.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    @Override // p034e4.m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // p034e4.m
    public final void onVerificationFailed(j jVar) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationFailed(jVar);
    }
}
