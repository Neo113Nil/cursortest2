package e4;

import E5.V;
import G4.A;
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
import f4.F;
import w1.L;

/* renamed from: e4.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1044r implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1038l f12702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f12704d;

    public /* synthetic */ C1044r(FirebaseAuth firebaseAuth, C1038l c1038l, String str, int i7) {
        this.f12701a = i7;
        this.f12702b = c1038l;
        this.f12703c = str;
        this.f12704d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [e4.t] */
    /* JADX WARN: Type inference failed for: r3v11, types: [e4.s] */
    /* JADX WARN: Type inference failed for: r6v15, types: [e4.t] */
    /* JADX WARN: Type inference failed for: r8v3, types: [e4.s] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String str;
        String str2;
        String str3;
        FirebaseAuth firebaseAuth = this.f12704d;
        String str4 = this.f12703c;
        C1038l c1038l = this.f12702b;
        switch (this.f12701a) {
            case 0:
                if (task.isSuccessful()) {
                    str = ((F) task.getResult()).f12916a;
                    str2 = ((F) task.getResult()).f12917b;
                    str3 = ((F) task.getResult()).f12918c;
                } else {
                    Exception exception = task.getException();
                    Log.e("FirebaseAuth", exception != null ? L.i("Error while validating application identity: ", exception.getMessage()) : "Error while validating application identity: ");
                    if (exception != null && ((exception instanceof C1032f) || ((exception instanceof C1031e) && ((C1031e) exception).f12676a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                        FirebaseAuth.i((Y3.j) exception, c1038l, str4);
                        return;
                    }
                    Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                    str3 = null;
                    str = null;
                    str2 = null;
                }
                long longValue = c1038l.f12684b.longValue();
                String str5 = c1038l.f12687e;
                V v6 = c1038l.f12685c;
                A a2 = firebaseAuth.f11855g;
                String str6 = (String) a2.f2873c;
                if (str6 != null && ((String) a2.f2874d) != null && str5 != null && str5.equals(str6)) {
                    v6 = new C1046t(firebaseAuth, v6);
                }
                if (TextUtils.isEmpty(str)) {
                    F f7 = (F) task.getResult();
                    if (!c1038l.j) {
                        v6 = new C1045s(firebaseAuth, c1038l, f7, v6);
                    }
                }
                V v7 = v6;
                MultiFactorSession multiFactorSession = c1038l.f12690h;
                D.i(multiFactorSession);
                zzao zzaoVar = (zzao) multiFactorSession;
                String str7 = (zzag.zzc(str3) && firebaseAuth.m() != null && firebaseAuth.m().s()) ? "NO_RECAPTCHA" : str3;
                if (zzaoVar.f11925a != null) {
                    String str8 = c1038l.f12687e;
                    D.i(str8);
                    firebaseAuth.f11853e.zza(zzaoVar, str8, firebaseAuth.f11857i, longValue, c1038l.f12689g != null, false, str, str2, str7, firebaseAuth.q(), (AbstractC1039m) v7, c1038l.f12686d, c1038l.f12688f);
                    return;
                } else {
                    PhoneMultiFactorInfo phoneMultiFactorInfo = c1038l.f12691i;
                    D.i(phoneMultiFactorInfo);
                    firebaseAuth.f11853e.zza(zzaoVar, phoneMultiFactorInfo, firebaseAuth.f11857i, longValue, c1038l.f12689g != null, false, str, str2, str7, firebaseAuth.q(), (AbstractC1039m) v7, c1038l.f12686d, c1038l.f12688f);
                    return;
                }
            default:
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    L.n("Error while validating application identity: ", exception2 != null ? exception2.getMessage() : "", "FirebaseAuth");
                    if (exception2 != null && ((exception2 instanceof C1032f) || ((exception2 instanceof C1031e) && ((C1031e) exception2).f12676a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                        FirebaseAuth.i((Y3.j) exception2, c1038l, str4);
                        return;
                    }
                    Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                }
                F f8 = (F) task.getResult();
                firebaseAuth.getClass();
                long longValue2 = c1038l.f12684b.longValue();
                if (longValue2 < 0 || longValue2 > 120) {
                    throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
                }
                String str9 = c1038l.f12687e;
                D.e(str9);
                String str10 = f8.f12918c;
                String str11 = (zzag.zzc(str10) && firebaseAuth.m() != null && firebaseAuth.m().s()) ? "NO_RECAPTCHA" : str10;
                boolean z4 = c1038l.f12689g != null;
                String str12 = firebaseAuth.f11857i;
                String str13 = firebaseAuth.f11858k;
                boolean q7 = firebaseAuth.q();
                String str14 = f8.f12916a;
                String str15 = f8.f12917b;
                zzagz zzagzVar = new zzagz(str9, longValue2, z4, str12, str13, str14, str15, str11, q7);
                V v8 = c1038l.f12685c;
                A a4 = firebaseAuth.f11855g;
                String str16 = (String) a4.f2873c;
                if (str16 != null && ((String) a4.f2874d) != null && str9 != null && str9.equals(str16)) {
                    v8 = new C1046t(firebaseAuth, v8);
                }
                if (TextUtils.isEmpty(f8.f12916a)) {
                    F f9 = new F(str14, str15, str11);
                    if (!c1038l.j) {
                        v8 = new C1045s(firebaseAuth, c1038l, f9, v8);
                    }
                }
                firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzagzVar, v8, c1038l.f12688f, c1038l.f12686d);
                return;
        }
    }
}
