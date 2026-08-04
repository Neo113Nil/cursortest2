package p034e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p042f4.E;
import p042f4.z;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f12704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EmailAuthCredential f12705f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12706x;

    public q(FirebaseAuth firebaseAuth, boolean z4, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        super(23);
        this.f12703d = z4;
        this.f12704e = firebaseUser;
        this.f12705f = emailAuthCredential;
        this.f12706x = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [e4.c, f4.z] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p113p3.f
    public final Task j0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        EmailAuthCredential emailAuthCredential = this.f12705f;
        boolean z4 = this.f12703d;
        FirebaseAuth firebaseAuth = this.f12706x;
        if (!z4) {
            return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, emailAuthCredential, str, (E) new b(firebaseAuth));
        }
        zzabj zzabjVar = firebaseAuth.f11853e;
        FirebaseUser firebaseUser = this.f12704e;
        D.i(firebaseUser);
        return zzabjVar.zzb(firebaseAuth.f11849a, firebaseUser, emailAuthCredential, str, (z) new c(firebaseAuth, 0));
    }
}
