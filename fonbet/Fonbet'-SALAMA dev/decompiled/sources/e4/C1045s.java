package e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import f4.F;

/* renamed from: e4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1045s extends AbstractC1039m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1038l f12705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f12706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1039m f12707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12708d;

    public C1045s(FirebaseAuth firebaseAuth, C1038l c1038l, F f7, AbstractC1039m abstractC1039m) {
        this.f12705a = c1038l;
        this.f12706b = f7;
        this.f12707c = abstractC1039m;
        this.f12708d = firebaseAuth;
    }

    @Override // e4.AbstractC1039m
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f12707c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // e4.AbstractC1039m
    public final void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
        this.f12707c.onCodeSent(str, phoneAuthProvider$ForceResendingToken);
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f12707c.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // e4.AbstractC1039m
    public final void onVerificationFailed(Y3.j jVar) {
        boolean zza = zzadg.zza(jVar);
        C1038l c1038l = this.f12705a;
        if (zza) {
            c1038l.j = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + c1038l.f12687e);
            FirebaseAuth.l(c1038l);
            return;
        }
        F f7 = this.f12706b;
        boolean isEmpty = TextUtils.isEmpty(f7.f12918c);
        AbstractC1039m abstractC1039m = this.f12707c;
        if (isEmpty) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + c1038l.f12687e + ", error - " + jVar.getMessage());
            abstractC1039m.onVerificationFailed(jVar);
            return;
        }
        if (zzadg.zzb(jVar) && this.f12708d.m().s() && TextUtils.isEmpty(f7.f12917b)) {
            c1038l.f12692k = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + c1038l.f12687e);
            FirebaseAuth.l(c1038l);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + c1038l.f12687e + ", error - " + jVar.getMessage());
        abstractC1039m.onVerificationFailed(jVar);
    }
}
