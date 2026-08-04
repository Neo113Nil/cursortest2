package p034e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionCodeSettings f12723f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12724x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings, int i7) {
        super(23);
        this.f12721d = i7;
        this.f12722e = str;
        this.f12723f = actionCodeSettings;
        this.f12724x = firebaseAuth;
    }

    @Override // p113p3.f
    public final Task j0(String str) {
        switch (this.f12721d) {
            case 0:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                String str2 = this.f12722e;
                if (zIsEmpty) {
                    Log.i("FirebaseAuth", "Email link sign in for " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + str2);
                }
                FirebaseAuth firebaseAuth = this.f12724x;
                return firebaseAuth.f11853e.zzb(firebaseAuth.f11849a, this.f12722e, this.f12723f, firebaseAuth.f11858k, str);
            default:
                boolean zIsEmpty2 = TextUtils.isEmpty(str);
                String str3 = this.f12722e;
                if (zIsEmpty2) {
                    Log.i("FirebaseAuth", "Password reset request " + str3 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str3);
                }
                FirebaseAuth firebaseAuth2 = this.f12724x;
                return firebaseAuth2.f11853e.zza(firebaseAuth2.f11849a, this.f12722e, this.f12723f, firebaseAuth2.f11858k, str);
        }
    }
}
