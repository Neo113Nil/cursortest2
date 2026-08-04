package p034e4;

import Y3.j;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import p042f4.F;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f12712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12714d;

    public s(FirebaseAuth firebaseAuth, l lVar, F f7, m mVar) {
        this.f12711a = lVar;
        this.f12712b = f7;
        this.f12713c = mVar;
        this.f12714d = firebaseAuth;
    }

    @Override // p034e4.m
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f12713c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // p034e4.m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.f12713c.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    @Override // p034e4.m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f12713c.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // p034e4.m
    public final void onVerificationFailed(j jVar) {
        boolean zZza = zzadg.zza(jVar);
        l lVar = this.f12711a;
        if (zZza) {
            lVar.j = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + lVar.f12693e);
            FirebaseAuth.l(lVar);
            return;
        }
        F f7 = this.f12712b;
        boolean zIsEmpty = TextUtils.isEmpty(f7.f12924c);
        m mVar = this.f12713c;
        if (zIsEmpty) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + lVar.f12693e + ", error - " + jVar.getMessage());
            mVar.onVerificationFailed(jVar);
            return;
        }
        if (zzadg.zzb(jVar) && this.f12714d.m().s() && TextUtils.isEmpty(f7.f12923b)) {
            lVar.f12698k = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + lVar.f12693e);
            FirebaseAuth.l(lVar);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + lVar.f12693e + ", error - " + jVar.getMessage());
        mVar.onVerificationFailed(jVar);
    }
}
