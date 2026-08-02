package e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import f4.InterfaceC1088E;
import f4.z;

/* renamed from: e4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1043q extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f12698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EmailAuthCredential f12699f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12700x;

    public C1043q(FirebaseAuth firebaseAuth, boolean z4, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        super(23);
        this.f12697d = z4;
        this.f12698e = firebaseUser;
        this.f12699f = emailAuthCredential;
        this.f12700x = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
    @Override // p3.f
    public final Task j0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        EmailAuthCredential emailAuthCredential = this.f12699f;
        boolean z4 = this.f12697d;
        FirebaseAuth firebaseAuth = this.f12700x;
        if (!z4) {
            return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, emailAuthCredential, str, (InterfaceC1088E) new C1028b(firebaseAuth));
        }
        zzabj zzabjVar = firebaseAuth.f11853e;
        FirebaseUser firebaseUser = this.f12698e;
        D.i(firebaseUser);
        return zzabjVar.zzb(firebaseAuth.f11849a, firebaseUser, emailAuthCredential, str, (z) new C1029c(firebaseAuth, 0));
    }
}
