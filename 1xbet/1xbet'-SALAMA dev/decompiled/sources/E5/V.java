package E5;

import W5.AbstractC0486a1;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends p034e4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f2336a;

    public V(W w7) {
        this.f2336a = w7;
    }

    @Override // p034e4.m
    public final void onCodeAutoRetrievalTimeOut(String str) {
        HashMap map = new HashMap();
        map.put("verificationId", str);
        map.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
        A5.h hVar = this.f2336a.f2338A;
        if (hVar != null) {
            hVar.c(map);
        }
    }

    @Override // p034e4.m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        int iHashCode = phoneAuthProvider$ForceResendingToken.hashCode();
        W.f2337B.put(Integer.valueOf(iHashCode), phoneAuthProvider$ForceResendingToken);
        HashMap map = new HashMap();
        map.put("verificationId", str);
        AbstractC0486a1.m(iHashCode, map, "forceResendingToken", "name", "Auth#phoneCodeSent");
        A5.h hVar = this.f2336a.f2338A;
        if (hVar != null) {
            hVar.c(map);
        }
    }

    @Override // p034e4.m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        int iHashCode = phoneAuthCredential.hashCode();
        W w7 = this.f2336a;
        w7.f2344f.getClass();
        HashMap map = C0188f.f2361z;
        C0188f.f2361z.put(Integer.valueOf(phoneAuthCredential.hashCode()), phoneAuthCredential);
        HashMap map2 = new HashMap();
        map2.put("token", Integer.valueOf(iHashCode));
        String str = phoneAuthCredential.f11878b;
        if (str != null) {
            map2.put("smsCode", str);
        }
        map2.put("name", "Auth#phoneVerificationCompleted");
        A5.h hVar = w7.f2338A;
        if (hVar != null) {
            hVar.c(map2);
        }
    }

    @Override // p034e4.m
    public final void onVerificationFailed(Y3.j jVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C0203v c0203vL = Y4.D.L(jVar);
        map2.put("code", c0203vL.f2410a.replaceAll("ERROR_", "").toLowerCase(Locale.ROOT).replaceAll("_", "-"));
        map2.put("message", c0203vL.getMessage());
        map2.put("details", c0203vL.f2411b);
        map.put("error", map2);
        map.put("name", "Auth#phoneVerificationFailed");
        A5.h hVar = this.f2336a.f2338A;
        if (hVar != null) {
            hVar.c(map);
        }
    }
}
