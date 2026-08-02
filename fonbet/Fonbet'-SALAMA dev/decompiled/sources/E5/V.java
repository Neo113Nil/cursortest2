package E5;

import W5.AbstractC0486a1;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import e4.AbstractC1039m;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class V extends AbstractC1039m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f2336a;

    public V(W w7) {
        this.f2336a = w7;
    }

    @Override // e4.AbstractC1039m
    public final void onCodeAutoRetrievalTimeOut(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("verificationId", str);
        hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
        A5.h hVar = this.f2336a.f2338A;
        if (hVar != null) {
            hVar.c(hashMap);
        }
    }

    @Override // e4.AbstractC1039m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        int hashCode = phoneAuthProvider$ForceResendingToken.hashCode();
        W.f2337B.put(Integer.valueOf(hashCode), phoneAuthProvider$ForceResendingToken);
        HashMap hashMap = new HashMap();
        hashMap.put("verificationId", str);
        AbstractC0486a1.m(hashCode, hashMap, "forceResendingToken", "name", "Auth#phoneCodeSent");
        A5.h hVar = this.f2336a.f2338A;
        if (hVar != null) {
            hVar.c(hashMap);
        }
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        int hashCode = phoneAuthCredential.hashCode();
        W w7 = this.f2336a;
        w7.f2344f.getClass();
        HashMap hashMap = C0188f.f2361z;
        C0188f.f2361z.put(Integer.valueOf(phoneAuthCredential.hashCode()), phoneAuthCredential);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("token", Integer.valueOf(hashCode));
        String str = phoneAuthCredential.f11878b;
        if (str != null) {
            hashMap2.put("smsCode", str);
        }
        hashMap2.put("name", "Auth#phoneVerificationCompleted");
        A5.h hVar = w7.f2338A;
        if (hVar != null) {
            hVar.c(hashMap2);
        }
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationFailed(Y3.j jVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C0203v L7 = Y4.D.L(jVar);
        hashMap2.put("code", L7.f2410a.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
        hashMap2.put("message", L7.getMessage());
        hashMap2.put("details", L7.f2411b);
        hashMap.put("error", hashMap2);
        hashMap.put("name", "Auth#phoneVerificationFailed");
        A5.h hVar = this.f2336a.f2338A;
        if (hVar != null) {
            hVar.c(hashMap);
        }
    }
}
