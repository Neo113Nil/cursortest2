package e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: e4.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1048v extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionCodeSettings f12717f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12718x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1048v(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings, int i7) {
        super(23);
        this.f12715d = i7;
        this.f12716e = str;
        this.f12717f = actionCodeSettings;
        this.f12718x = firebaseAuth;
    }

    @Override // p3.f
    public final Task j0(String str) {
        switch (this.f12715d) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(str);
                String str2 = this.f12716e;
                if (isEmpty) {
                    Log.i("FirebaseAuth", "Email link sign in for " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + str2);
                }
                FirebaseAuth firebaseAuth = this.f12718x;
                return firebaseAuth.f11853e.zzb(firebaseAuth.f11849a, this.f12716e, this.f12717f, firebaseAuth.f11858k, str);
            default:
                boolean isEmpty2 = TextUtils.isEmpty(str);
                String str3 = this.f12716e;
                if (isEmpty2) {
                    Log.i("FirebaseAuth", "Password reset request " + str3 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str3);
                }
                FirebaseAuth firebaseAuth2 = this.f12718x;
                return firebaseAuth2.f11853e.zza(firebaseAuth2.f11849a, this.f12716e, this.f12717f, firebaseAuth2.f11858k, str);
        }
    }
}
