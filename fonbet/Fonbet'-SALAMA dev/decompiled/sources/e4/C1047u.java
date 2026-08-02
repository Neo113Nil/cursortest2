package e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import f4.z;

/* renamed from: e4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047u extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12713f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12714x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1047u(FirebaseAuth firebaseAuth, Object obj, Object obj2, int i7) {
        super(23);
        this.f12711d = i7;
        this.f12713f = obj;
        this.f12714x = obj2;
        this.f12712e = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [e4.c, f4.z] */
    @Override // p3.f
    public final Task j0(String str) {
        switch (this.f12711d) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(str);
                String str2 = (String) this.f12713f;
                if (isEmpty) {
                    Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str2);
                }
                FirebaseAuth firebaseAuth = this.f12712e;
                return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, (String) this.f12713f, (String) this.f12714x, firebaseAuth.f11858k, str, new C1028b(firebaseAuth));
            default:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                FirebaseAuth firebaseAuth2 = this.f12712e;
                return firebaseAuth2.f11853e.zza(firebaseAuth2.f11849a, (FirebaseUser) this.f12713f, (AuthCredential) this.f12714x, str, (z) new C1029c(firebaseAuth2, 0));
        }
    }
}
