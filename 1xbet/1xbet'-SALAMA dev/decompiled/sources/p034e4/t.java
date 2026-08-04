package p034e4;

import E5.V;
import Y3.j;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f12715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12716b;

    public t(FirebaseAuth firebaseAuth, V v6) {
        this.f12715a = v6;
        this.f12716b = firebaseAuth;
    }

    @Override // p034e4.m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        String str2 = (String) this.f12716b.f11855g.f2874d;
        D.i(str2);
        this.f12715a.onVerificationCompleted(PhoneAuthCredential.n(str, str2));
    }

    @Override // p034e4.m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f12715a.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // p034e4.m
    public final void onVerificationFailed(j jVar) {
        this.f12715a.onVerificationFailed(jVar);
    }

    @Override // p034e4.m
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }
}
