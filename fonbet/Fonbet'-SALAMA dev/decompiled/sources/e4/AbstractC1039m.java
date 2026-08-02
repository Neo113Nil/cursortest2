package e4;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import i3.C1263a;

/* renamed from: e4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1039m {
    private static final C1263a zza = new C1263a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken);

    public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

    public abstract void onVerificationFailed(Y3.j jVar);
}
