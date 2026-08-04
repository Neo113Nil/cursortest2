package E5;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.internal.zzao;
import java.util.ArrayList;
import java.util.UUID;
import p155w1.C1052y0;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public interface y {
    static void a(A5.f fVar, final y yVar) {
        C0201t c0201t = C0201t.f2405h;
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret", c0201t, obj, 1);
        if (yVar != null) {
            final int i7 = 0;
            f7.M(new A5.b(yVar) { // from class: E5.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y f2413b;

                {
                    this.f2413b = yVar;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 14);
                            ((C0196n) this.f2413b).getClass();
                            MultiFactorSession multiFactorSession = (MultiFactorSession) C0195m.f2387b.get(str);
                            com.google.android.gms.common.internal.D.i(multiFactorSession);
                            zzao zzaoVar = (zzao) multiFactorSession;
                            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzaoVar.f11929e.f11910c));
                            firebaseAuth.getClass();
                            firebaseAuth.f11853e.zza(zzaoVar, firebaseAuth.f11858k).continueWithTask(new C1052y0(firebaseAuth, 14)).addOnCompleteListener(new C0185c(rVar, 24));
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str2 = (String) arrayList3.get(0);
                            String str3 = (String) arrayList3.get(1);
                            ((C0196n) this.f2413b).getClass();
                            p042f4.w wVar = (p042f4.w) C0196n.f2390a.get(str2);
                            com.google.android.gms.common.internal.D.i(str3);
                            com.google.android.gms.common.internal.D.i(wVar);
                            p034e4.o oVar = new p034e4.o(str3, wVar, null);
                            String string = UUID.randomUUID().toString();
                            C0195m.f2389d.put(string, oVar);
                            arrayList2.add(0, string);
                            v6.f(arrayList2);
                            break;
                        default:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            String str4 = (String) arrayList5.get(0);
                            String str5 = (String) arrayList5.get(1);
                            ((C0196n) this.f2413b).getClass();
                            com.google.android.gms.common.internal.D.i(str5);
                            com.google.android.gms.common.internal.D.i(str4);
                            p034e4.o oVar2 = new p034e4.o(str5, null, str4);
                            String string2 = UUID.randomUUID().toString();
                            C0195m.f2389d.put(string2, oVar2);
                            arrayList4.add(0, string2);
                            v6.f(arrayList4);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment", c0201t, obj, 1);
        if (yVar != null) {
            final int i8 = 1;
            f8.M(new A5.b(yVar) { // from class: E5.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y f2413b;

                {
                    this.f2413b = yVar;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 14);
                            ((C0196n) this.f2413b).getClass();
                            MultiFactorSession multiFactorSession = (MultiFactorSession) C0195m.f2387b.get(str);
                            com.google.android.gms.common.internal.D.i(multiFactorSession);
                            zzao zzaoVar = (zzao) multiFactorSession;
                            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzaoVar.f11929e.f11910c));
                            firebaseAuth.getClass();
                            firebaseAuth.f11853e.zza(zzaoVar, firebaseAuth.f11858k).continueWithTask(new C1052y0(firebaseAuth, 14)).addOnCompleteListener(new C0185c(rVar, 24));
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str2 = (String) arrayList3.get(0);
                            String str3 = (String) arrayList3.get(1);
                            ((C0196n) this.f2413b).getClass();
                            p042f4.w wVar = (p042f4.w) C0196n.f2390a.get(str2);
                            com.google.android.gms.common.internal.D.i(str3);
                            com.google.android.gms.common.internal.D.i(wVar);
                            p034e4.o oVar = new p034e4.o(str3, wVar, null);
                            String string = UUID.randomUUID().toString();
                            C0195m.f2389d.put(string, oVar);
                            arrayList2.add(0, string);
                            v6.f(arrayList2);
                            break;
                        default:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            String str4 = (String) arrayList5.get(0);
                            String str5 = (String) arrayList5.get(1);
                            ((C0196n) this.f2413b).getClass();
                            com.google.android.gms.common.internal.D.i(str5);
                            com.google.android.gms.common.internal.D.i(str4);
                            p034e4.o oVar2 = new p034e4.o(str5, null, str4);
                            String string2 = UUID.randomUUID().toString();
                            C0195m.f2389d.put(string2, oVar2);
                            arrayList4.add(0, string2);
                            v6.f(arrayList4);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn", c0201t, obj, 1);
        if (yVar == null) {
            f9.M(null);
        } else {
            final int i9 = 2;
            f9.M(new A5.b(yVar) { // from class: E5.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y f2413b;

                {
                    this.f2413b = yVar;
                }

                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    switch (i9) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 14);
                            ((C0196n) this.f2413b).getClass();
                            MultiFactorSession multiFactorSession = (MultiFactorSession) C0195m.f2387b.get(str);
                            com.google.android.gms.common.internal.D.i(multiFactorSession);
                            zzao zzaoVar = (zzao) multiFactorSession;
                            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzaoVar.f11929e.f11910c));
                            firebaseAuth.getClass();
                            firebaseAuth.f11853e.zza(zzaoVar, firebaseAuth.f11858k).continueWithTask(new C1052y0(firebaseAuth, 14)).addOnCompleteListener(new C0185c(rVar, 24));
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str2 = (String) arrayList3.get(0);
                            String str3 = (String) arrayList3.get(1);
                            ((C0196n) this.f2413b).getClass();
                            p042f4.w wVar = (p042f4.w) C0196n.f2390a.get(str2);
                            com.google.android.gms.common.internal.D.i(str3);
                            com.google.android.gms.common.internal.D.i(wVar);
                            p034e4.o oVar = new p034e4.o(str3, wVar, null);
                            String string = UUID.randomUUID().toString();
                            C0195m.f2389d.put(string, oVar);
                            arrayList2.add(0, string);
                            v6.f(arrayList2);
                            break;
                        default:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            String str4 = (String) arrayList5.get(0);
                            String str5 = (String) arrayList5.get(1);
                            ((C0196n) this.f2413b).getClass();
                            com.google.android.gms.common.internal.D.i(str5);
                            com.google.android.gms.common.internal.D.i(str4);
                            p034e4.o oVar2 = new p034e4.o(str5, null, str4);
                            String string2 = UUID.randomUUID().toString();
                            C0195m.f2389d.put(string2, oVar2);
                            arrayList4.add(0, string2);
                            v6.f(arrayList4);
                            break;
                    }
                }
            });
        }
    }
}
