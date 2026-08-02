package e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* renamed from: e4.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1050x extends p3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f12723f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f12724x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f12725y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12726z;

    public C1050x(FirebaseAuth firebaseAuth, String str, boolean z4, FirebaseUser firebaseUser, String str2, String str3) {
        super(23);
        this.f12721d = str;
        this.f12722e = z4;
        this.f12723f = firebaseUser;
        this.f12724x = str2;
        this.f12725y = str3;
        this.f12726z = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [e4.c, f4.z] */
    @Override // p3.f
    public final Task j0(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f12721d;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z4 = this.f12722e;
        FirebaseAuth firebaseAuth = this.f12726z;
        if (!z4) {
            return firebaseAuth.f11853e.zzb(firebaseAuth.f11849a, this.f12721d, this.f12724x, this.f12725y, str, new C1028b(firebaseAuth));
        }
        zzabj zzabjVar = firebaseAuth.f11853e;
        FirebaseUser firebaseUser = this.f12723f;
        D.i(firebaseUser);
        return zzabjVar.zzb(firebaseAuth.f11849a, firebaseUser, this.f12721d, this.f12724x, this.f12725y, str, new C1029c(firebaseAuth, 0));
    }
}
