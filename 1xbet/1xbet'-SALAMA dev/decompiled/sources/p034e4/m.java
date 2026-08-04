package p034e4;

import Y3.j;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import p062i3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    private static final a zza = new a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken);

    public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

    public abstract void onVerificationFailed(j jVar);
}
