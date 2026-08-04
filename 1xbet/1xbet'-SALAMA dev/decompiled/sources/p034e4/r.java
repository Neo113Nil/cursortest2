package p034e4;

import E5.V;
import G4.A;
import Y3.j;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.zzao;
import p042f4.F;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f12708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12710d;

    public /* synthetic */ r(FirebaseAuth firebaseAuth, l lVar, String str, int i7) {
        this.f12707a = i7;
        this.f12708b = lVar;
        this.f12709c = str;
        this.f12710d = firebaseAuth;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String str;
        String str2;
        String str3;
        FirebaseAuth firebaseAuth = this.f12710d;
        String str4 = this.f12709c;
        l lVar = this.f12708b;
        switch (this.f12707a) {
            case 0:
                if (task.isSuccessful()) {
                    str = ((F) task.getResult()).f12922a;
                    str2 = ((F) task.getResult()).f12923b;
                    str3 = ((F) task.getResult()).f12924c;
                } else {
                    Exception exception = task.getException();
                    Log.e("FirebaseAuth", exception != null ? L.i("Error while validating application identity: ", exception.getMessage()) : "Error while validating application identity: ");
                    if (exception != null && ((exception instanceof f) || ((exception instanceof e) && ((e) exception).f12682a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                        FirebaseAuth.i((j) exception, lVar, str4);
                        return;
                    }
                    Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                    str3 = null;
                    str = null;
                    str2 = null;
                }
                long jLongValue = lVar.f12690b.longValue();
                String str5 = lVar.f12693e;
                V v6 = lVar.f12691c;
                A a2 = firebaseAuth.f11855g;
                String str6 = (String) a2.f2873c;
                m tVar = v6;
                if (str6 != null && ((String) a2.f2874d) != null && str5 != null) {
                    tVar = v6;
                    if (str5.equals(str6)) {
                        tVar = new t(firebaseAuth, v6);
                    }
                }
                tVar = v6;
                tVar = v6;
                m sVar = tVar;
                if (TextUtils.isEmpty(str)) {
                    F f7 = (F) task.getResult();
                    if (!lVar.j) {
                        sVar = tVar;
                        sVar = new s(firebaseAuth, lVar, f7, tVar);
                    }
                }
                sVar = tVar;
                m mVar = sVar;
                MultiFactorSession multiFactorSession = lVar.f12696h;
                D.i(multiFactorSession);
                zzao zzaoVar = (zzao) multiFactorSession;
                String str7 = (zzag.zzc(str3) && firebaseAuth.m() != null && firebaseAuth.m().s()) ? "NO_RECAPTCHA" : str3;
                if (zzaoVar.f11925a != null) {
                    String str8 = lVar.f12693e;
                    D.i(str8);
                    firebaseAuth.f11853e.zza(zzaoVar, str8, firebaseAuth.f11857i, jLongValue, lVar.f12695g != null, false, str, str2, str7, firebaseAuth.q(), mVar, lVar.f12692d, lVar.f12694f);
                    return;
                } else {
                    PhoneMultiFactorInfo phoneMultiFactorInfo = lVar.f12697i;
                    D.i(phoneMultiFactorInfo);
                    firebaseAuth.f11853e.zza(zzaoVar, phoneMultiFactorInfo, firebaseAuth.f11857i, jLongValue, lVar.f12695g != null, false, str, str2, str7, firebaseAuth.q(), mVar, lVar.f12692d, lVar.f12694f);
                    return;
                }
            default:
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    L.n("Error while validating application identity: ", exception2 != null ? exception2.getMessage() : "", "FirebaseAuth");
                    if (exception2 != null && ((exception2 instanceof f) || ((exception2 instanceof e) && ((e) exception2).f12682a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                        FirebaseAuth.i((j) exception2, lVar, str4);
                        return;
                    }
                    Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                }
                F f8 = (F) task.getResult();
                firebaseAuth.getClass();
                long jLongValue2 = lVar.f12690b.longValue();
                if (jLongValue2 < 0 || jLongValue2 > 120) {
                    throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
                }
                String str9 = lVar.f12693e;
                D.e(str9);
                String str10 = f8.f12924c;
                String str11 = (zzag.zzc(str10) && firebaseAuth.m() != null && firebaseAuth.m().s()) ? "NO_RECAPTCHA" : str10;
                boolean z4 = lVar.f12695g != null;
                String str12 = firebaseAuth.f11857i;
                String str13 = firebaseAuth.f11858k;
                boolean zQ = firebaseAuth.q();
                String str14 = f8.f12922a;
                String str15 = f8.f12923b;
                zzagz zzagzVar = new zzagz(str9, jLongValue2, z4, str12, str13, str14, str15, str11, zQ);
                V v7 = lVar.f12691c;
                A a4 = firebaseAuth.f11855g;
                String str16 = (String) a4.f2873c;
                m tVar2 = v7;
                if (str16 != null && ((String) a4.f2874d) != null && str9 != null) {
                    tVar2 = v7;
                    if (str9.equals(str16)) {
                        tVar2 = new t(firebaseAuth, v7);
                    }
                }
                tVar2 = v7;
                tVar2 = v7;
                m sVar2 = tVar2;
                if (TextUtils.isEmpty(f8.f12922a)) {
                    F f9 = new F(str14, str15, str11);
                    if (!lVar.j) {
                        sVar2 = tVar2;
                        sVar2 = new s(firebaseAuth, lVar, f9, tVar2);
                    }
                }
                sVar2 = tVar2;
                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzagzVar, sVar2, lVar.f12694f, lVar.f12692d);
                return;
        }
    }
}
