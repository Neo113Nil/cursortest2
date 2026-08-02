package e4;

import E5.V;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* renamed from: e4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1046t extends AbstractC1039m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f12709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12710b;

    public C1046t(FirebaseAuth firebaseAuth, V v6) {
        this.f12709a = v6;
        this.f12710b = firebaseAuth;
    }

    @Override // e4.AbstractC1039m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        String str2 = (String) this.f12710b.f11855g.f2874d;
        D.i(str2);
        this.f12709a.onVerificationCompleted(PhoneAuthCredential.n(str, str2));
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f12709a.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationFailed(Y3.j jVar) {
        this.f12709a.onVerificationFailed(jVar);
    }

    @Override // e4.AbstractC1039m
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }
}
