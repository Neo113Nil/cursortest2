package E5;

import A1.AbstractC0021h;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.MultiFactorSession;
import f4.C1095g;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import n3.AbstractC1464a;

/* renamed from: E5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0185c implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2355b;

    public /* synthetic */ C0185c(Object obj, int i7) {
        this.f2354a = i7;
        this.f2355b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i7;
        String str;
        String str2 = null;
        Object obj = this.f2355b;
        switch (this.f2354a) {
            case 0:
                HashMap hashMap = C0188f.f2361z;
                r rVar = (r) obj;
                if (task.isSuccessful()) {
                    rVar.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    rVar.a(Y4.D.L(task.getException()));
                    return;
                }
            case 1:
                HashMap hashMap2 = C0188f.f2361z;
                C0199q c0199q = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q.c();
                    return;
                } else {
                    c0199q.a(Y4.D.L(task.getException()));
                    return;
                }
            case 2:
                HashMap hashMap3 = C0188f.f2361z;
                r rVar2 = (r) obj;
                if (task.isSuccessful()) {
                    rVar2.success((String) task.getResult());
                    return;
                } else {
                    rVar2.a(Y4.D.L(task.getException()));
                    return;
                }
            case 3:
                HashMap hashMap4 = C0188f.f2361z;
                C0199q c0199q2 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q2.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    c0199q2.a(Y4.D.L(task.getException()));
                    return;
                }
            case 4:
                HashMap hashMap5 = C0188f.f2361z;
                r rVar3 = (r) obj;
                if (!task.isSuccessful()) {
                    rVar3.a(Y4.D.L(task.getException()));
                    return;
                }
                f4.L l7 = (f4.L) task.getResult();
                int i8 = l7.f12929a;
                if (i8 == 0) {
                    i7 = 2;
                } else if (i8 != 1) {
                    i7 = 4;
                    if (i8 != 2) {
                        if (i8 != 4) {
                            i7 = 6;
                            if (i8 != 5) {
                                i7 = i8 != 6 ? 0 : 7;
                            }
                        } else {
                            i7 = 5;
                        }
                    }
                } else {
                    i7 = 3;
                }
                AbstractC0021h abstractC0021h = l7.f12930b;
                if ((abstractC0021h != null && i8 == 1) || i8 == 0) {
                    str2 = abstractC0021h.f();
                    str = null;
                } else if (i8 == 2 || i8 == 5) {
                    Objects.requireNonNull(abstractC0021h);
                    f4.I i9 = (f4.I) abstractC0021h;
                    str2 = (String) i9.f364a;
                    str = i9.f12925b;
                } else {
                    str = null;
                }
                D d7 = new D();
                d7.f2261a = str2;
                d7.f2262b = str;
                C c3 = new C();
                if (i7 == 0) {
                    throw new IllegalStateException("Nonnull field \"operation\" is null.");
                }
                c3.f2259a = i7;
                c3.f2260b = d7;
                rVar3.success(c3);
                return;
            case 5:
                HashMap hashMap6 = C0188f.f2361z;
                r rVar4 = (r) obj;
                if (task.isSuccessful()) {
                    rVar4.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    rVar4.a(Y4.D.L(task.getException()));
                    return;
                }
            case 6:
                HashMap hashMap7 = C0188f.f2361z;
                r rVar5 = (r) obj;
                if (task.isSuccessful()) {
                    rVar5.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    rVar5.a(Y4.D.L(task.getException()));
                    return;
                }
            case 7:
                HashMap hashMap8 = C0188f.f2361z;
                C0199q c0199q3 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q3.c();
                    return;
                } else {
                    c0199q3.a(Y4.D.L(task.getException()));
                    return;
                }
            case 8:
                HashMap hashMap9 = C0188f.f2361z;
                C0199q c0199q4 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q4.c();
                    return;
                } else {
                    c0199q4.a(Y4.D.L(task.getException()));
                    return;
                }
            case 9:
                HashMap hashMap10 = C0188f.f2361z;
                C0199q c0199q5 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q5.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    c0199q5.a(Y4.D.L(task.getException()));
                    return;
                }
            case 10:
                HashMap hashMap11 = C0188f.f2361z;
                C0199q c0199q6 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q6.success(((C1095g) task.getResult()).f12936a);
                    return;
                } else {
                    c0199q6.a(Y4.D.L(task.getException()));
                    return;
                }
            case 11:
                HashMap hashMap12 = C0188f.f2361z;
                r rVar6 = (r) obj;
                if (task.isSuccessful()) {
                    rVar6.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    rVar6.a(Y4.D.L(task.getException()));
                    return;
                }
            case 12:
                HashMap hashMap13 = C0188f.f2361z;
                C0199q c0199q7 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q7.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    c0199q7.a(Y4.D.L(task.getException()));
                    return;
                }
            case 13:
                C0199q c0199q8 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q8.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    c0199q8.a(Y4.D.L(task.getException()));
                    return;
                }
            case 14:
                r rVar7 = (r) obj;
                if (task.isSuccessful()) {
                    rVar7.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    rVar7.a(Y4.D.L(task.getException()));
                    return;
                }
            case 15:
                r rVar8 = (r) obj;
                if (task.isSuccessful()) {
                    rVar8.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    rVar8.a(Y4.D.L(task.getException()));
                    return;
                }
            case 16:
                r rVar9 = (r) obj;
                if (task.isSuccessful()) {
                    rVar9.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                }
                Exception exception = task.getException();
                if (exception.getMessage().contains("User was not linked to an account with the given provider.")) {
                    rVar9.a(new C0203v("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null));
                    return;
                } else {
                    rVar9.a(Y4.D.L(exception));
                    return;
                }
            case 17:
                r rVar10 = (r) obj;
                if (task.isSuccessful()) {
                    rVar10.b();
                    return;
                } else {
                    rVar10.a(Y4.D.L(task.getException()));
                    return;
                }
            case 18:
                C0199q c0199q9 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q9.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    c0199q9.a(Y4.D.L(task.getException()));
                    return;
                }
            case 19:
                C0199q c0199q10 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q10.success(AbstractC1464a.K((AuthResult) task.getResult()));
                    return;
                } else {
                    c0199q10.a(Y4.D.L(task.getException()));
                    return;
                }
            case 20:
                C0199q c0199q11 = (C0199q) obj;
                if (!task.isSuccessful()) {
                    c0199q11.a(Y4.D.L(task.getException()));
                    return;
                }
                MultiFactorSession multiFactorSession = (MultiFactorSession) task.getResult();
                String uuid = UUID.randomUUID().toString();
                C0195m.f2387b.put(uuid, multiFactorSession);
                K k7 = new K();
                if (uuid == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                k7.f2296a = uuid;
                c0199q11.success(k7);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                r rVar11 = (r) obj;
                if (task.isSuccessful()) {
                    rVar11.b();
                    return;
                } else {
                    rVar11.a(Y4.D.L(task.getException()));
                    return;
                }
            case 22:
                r rVar12 = (r) obj;
                if (task.isSuccessful()) {
                    rVar12.b();
                    return;
                } else {
                    rVar12.a(Y4.D.L(task.getException()));
                    return;
                }
            case 23:
                C0199q c0199q12 = (C0199q) obj;
                if (task.isSuccessful()) {
                    c0199q12.c();
                    return;
                } else {
                    c0199q12.a(Y4.D.L(task.getException()));
                    return;
                }
            case 24:
                r rVar13 = (r) obj;
                if (!task.isSuccessful()) {
                    rVar13.a(Y4.D.L(task.getException()));
                    return;
                }
                f4.w wVar = (f4.w) task.getResult();
                C0196n.f2390a.put(wVar.f12978a, wVar);
                Long valueOf = Long.valueOf(wVar.f12981d);
                Long valueOf2 = Long.valueOf(wVar.f12980c);
                Long valueOf3 = Long.valueOf(wVar.f12982e);
                N n2 = new N();
                n2.f2302a = valueOf;
                n2.f2303b = valueOf2;
                n2.f2304c = valueOf3;
                n2.f2305d = wVar.f12979b;
                String str3 = wVar.f12978a;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
                }
                n2.f2306e = str3;
                rVar13.success(n2);
                return;
            case 25:
                HashMap hashMap14 = F5.c.f2760c;
                F5.k kVar = (F5.k) obj;
                if (task.isSuccessful()) {
                    kVar.success(task.getResult());
                    return;
                } else {
                    kVar.a(task.getException());
                    return;
                }
            case 26:
                HashMap hashMap15 = K5.b.f4087c;
                K5.e eVar = (K5.e) obj;
                if (task.isSuccessful()) {
                    eVar.b(null);
                    return;
                } else {
                    eVar.a(Q0.a.I(task.getException()));
                    return;
                }
            case 27:
                HashMap hashMap16 = K5.b.f4087c;
                r rVar14 = (r) obj;
                if (task.isSuccessful()) {
                    rVar14.success((byte[]) task.getResult());
                    return;
                }
                K5.i I7 = Q0.a.I(task.getException());
                rVar14.getClass();
                rVar14.f2401c.f(Y4.D.g0(I7));
                return;
            default:
                HashMap hashMap17 = K5.b.f4087c;
                K5.f fVar = (K5.f) obj;
                if (task.isSuccessful()) {
                    fVar.b(((Uri) task.getResult()).toString());
                    return;
                } else {
                    fVar.a(Q0.a.I(task.getException()));
                    return;
                }
        }
    }
}
