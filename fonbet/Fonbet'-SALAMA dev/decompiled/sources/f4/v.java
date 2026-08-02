package f4;

import android.app.Activity;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1091c f12970a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ TaskCompletionSource f12971b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f12972c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ RecaptchaAction f12973d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f12974e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Activity f12975f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f12976g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ C1084A f12977h;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z4;
        C1091c c1091c = this.f12970a;
        c1091c.getClass();
        if (!task.isSuccessful()) {
            w1.L.n("Failed to initialize reCAPTCHA config: ", task.getException().getMessage(), "c");
        }
        FirebaseAuth firebaseAuth = this.f12972c;
        Q3.o m7 = firebaseAuth.m();
        TaskCompletionSource taskCompletionSource = this.f12971b;
        String str = this.f12974e;
        Activity activity = this.f12975f;
        boolean z7 = this.f12976g;
        C1084A c1084a = this.f12977h;
        if (m7 != null) {
            Q3.o m8 = firebaseAuth.m();
            synchronized (m8.f5822a) {
                try {
                    zzagm zzagmVar = (zzagm) m8.f5824c;
                    z4 = zzagmVar != null && zzagmVar.zzc("PHONE_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                firebaseAuth.m().r(firebaseAuth.b(), Boolean.FALSE, this.f12973d).addOnSuccessListener(new C1085B(0, taskCompletionSource)).addOnFailureListener(new C1086C(c1091c, firebaseAuth, str, activity, z7, c1084a, taskCompletionSource));
                return;
            }
        }
        c1091c.c(firebaseAuth, str, activity, z7, false, c1084a, taskCompletionSource);
    }
}
