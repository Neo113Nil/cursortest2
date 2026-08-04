package p034e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f12729f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f12730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f12731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12732z;

    public x(FirebaseAuth firebaseAuth, String str, boolean z4, FirebaseUser firebaseUser, String str2, String str3) {
        super(23);
        this.f12727d = str;
        this.f12728e = z4;
        this.f12729f = firebaseUser;
        this.f12730x = str2;
        this.f12731y = str3;
        this.f12732z = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [e4.c, f4.z] */
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
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f12727d;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z4 = this.f12728e;
        FirebaseAuth firebaseAuth = this.f12732z;
        if (!z4) {
            return firebaseAuth.f11853e.zzb(firebaseAuth.f11849a, this.f12727d, this.f12730x, this.f12731y, str, new b(firebaseAuth));
        }
        zzabj zzabjVar = firebaseAuth.f11853e;
        FirebaseUser firebaseUser = this.f12729f;
        D.i(firebaseUser);
        return zzabjVar.zzb(firebaseAuth.f11849a, firebaseUser, this.f12727d, this.f12730x, this.f12731y, str, new c(firebaseAuth, 0));
    }
}
