package p034e4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p042f4.z;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12719f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12720x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(FirebaseAuth firebaseAuth, Object obj, Object obj2, int i7) {
        super(23);
        this.f12717d = i7;
        this.f12719f = obj;
        this.f12720x = obj2;
        this.f12718e = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [e4.c, f4.z] */
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
        switch (this.f12717d) {
            case 0:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                String str2 = (String) this.f12719f;
                if (zIsEmpty) {
                    Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str2);
                }
                FirebaseAuth firebaseAuth = this.f12718e;
                return firebaseAuth.f11853e.zza(firebaseAuth.f11849a, (String) this.f12719f, (String) this.f12720x, firebaseAuth.f11858k, str, new b(firebaseAuth));
            default:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                FirebaseAuth firebaseAuth2 = this.f12718e;
                return firebaseAuth2.f11853e.zza(firebaseAuth2.f11849a, (FirebaseUser) this.f12719f, (AuthCredential) this.f12720x, str, (z) new c(firebaseAuth2, 0));
        }
    }
}
