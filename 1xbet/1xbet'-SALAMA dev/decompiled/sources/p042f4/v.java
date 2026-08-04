package p042f4;

import Q3.o;
import android.app.Activity;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ C0894c f12976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ TaskCompletionSource f12977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f12978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ RecaptchaAction f12979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f12980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Activity f12981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f12982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ A f12983h;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z4;
        C0894c c0894c = this.f12976a;
        c0894c.getClass();
        if (!task.isSuccessful()) {
            L.n("Failed to initialize reCAPTCHA config: ", task.getException().getMessage(), "c");
        }
        FirebaseAuth firebaseAuth = this.f12978c;
        o oVarM = firebaseAuth.m();
        TaskCompletionSource taskCompletionSource = this.f12977b;
        String str = this.f12980e;
        Activity activity = this.f12981f;
        boolean z7 = this.f12982g;
        A a2 = this.f12983h;
        if (oVarM != null) {
            o oVarM2 = firebaseAuth.m();
            synchronized (oVarM2.f5822a) {
                try {
                    zzagm zzagmVar = (zzagm) oVarM2.f5824c;
                    z4 = zzagmVar != null && zzagmVar.zzc("PHONE_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                firebaseAuth.m().r(firebaseAuth.b(), Boolean.FALSE, this.f12979d).addOnSuccessListener(new B(0, taskCompletionSource)).addOnFailureListener(new C(c0894c, firebaseAuth, str, activity, z7, a2, taskCompletionSource));
                return;
            }
        }
        c0894c.c(firebaseAuth, str, activity, z7, false, a2, taskCompletionSource);
    }
}
