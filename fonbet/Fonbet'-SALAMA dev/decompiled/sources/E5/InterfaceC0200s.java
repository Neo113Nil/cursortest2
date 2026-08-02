package E5;

import a.AbstractC0603a;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzadx;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzx;
import e4.C1028b;
import e4.C1047u;
import e4.C1048v;
import e4.C1050x;
import f4.C1096h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n3.AbstractC1464a;
import q5.AbstractActivityC1559c;
import w1.F0;
import w1.V0;

/* renamed from: E5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0200s {
    static void a(A5.f fVar, final C0188f c0188f) {
        C0201t c0201t = C0201t.f2402e;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i8 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i8) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i9 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i9) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i8 = 2;
            f03.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i9 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i9) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i9 = 5;
            f04.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i9) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i10 = 6;
            f05.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i11 = 7;
            f06.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i12 = 8;
            f07.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f07.M(null);
        }
        F0 f08 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i13 = 9;
            f08.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f08.M(null);
        }
        F0 f09 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i14 = 10;
            f09.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f09.M(null);
        }
        F0 f010 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i15 = 12;
            f010.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f010.M(null);
        }
        F0 f011 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i16 = 13;
            f011.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f011.M(null);
        }
        F0 f012 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i17 = 11;
            f012.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f012.M(null);
        }
        F0 f013 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i18 = 14;
            f013.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f013.M(null);
        }
        F0 f014 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i19 = 15;
            f014.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f014.M(null);
        }
        F0 f015 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i20 = 16;
            f015.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i20) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f015.M(null);
        }
        F0 f016 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i21 = 17;
            f016.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i21) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f016.M(null);
        }
        F0 f017 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i22 = 18;
            f017.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f017.M(null);
        }
        F0 f018 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i23 = 19;
            f018.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i23) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f018.M(null);
        }
        F0 f019 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i24 = 20;
            f019.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i24) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f019.M(null);
        }
        F0 f020 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i25 = 21;
            f020.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i25) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f020.M(null);
        }
        F0 f021 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i26 = 1;
            f021.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i26) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f021.M(null);
        }
        F0 f022 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i27 = 3;
            f022.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i27) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f022.M(null);
        }
        C0201t c0201t2 = C0201t.f2402e;
        F0 f023 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode", c0201t, (Object) null, 1);
        if (c0188f == null) {
            f023.M(null);
        } else {
            final int i28 = 4;
            f023.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task<AuthResult> zza;
                    Task task;
                    Map map;
                    String str;
                    switch (i28) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f2 = c0188f;
                            c0188f2.getClass();
                            try {
                                FirebaseAuth b7 = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(b7, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = b7.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String sb2 = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, sb2);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, sb2);
                                v02.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v02.f(AbstractC0603a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b8 = C0188f.b(c0197o2);
                            b8.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            b8.f11853e.zzd(b8.f11849a, str2, b8.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth b9 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(b9, 0);
                                StringBuilder sb3 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = b9.f11849a;
                                iVar2.b();
                                sb3.append(iVar2.f7664b);
                                String sb4 = sb3.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, sb4);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, sb4);
                                v02.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v02.f(AbstractC0603a.v0(e8));
                                return;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            T t7 = (T) arrayList6.get(1);
                            C0188f c0188f4 = c0188f;
                            c0188f4.getClass();
                            try {
                                String str3 = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
                                A5.j jVar3 = new A5.j(c0188f4.f2362a, str3);
                                String str4 = t7.f2332f;
                                PhoneMultiFactorInfo phoneMultiFactorInfo = null;
                                MultiFactorSession multiFactorSession = str4 != null ? (MultiFactorSession) C0195m.f2387b.get(str4) : null;
                                String str5 = t7.f2331e;
                                if (str5 != null) {
                                    Iterator it = C0195m.f2388c.keySet().iterator();
                                    while (it.hasNext()) {
                                        Iterator it2 = ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it2.next();
                                                if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                    phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                                }
                                            }
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v02.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v02.f(AbstractC0603a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth b10 = C0188f.b(c0197o5);
                                int intValue = valueOf.intValue();
                                b10.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (intValue < 0 || intValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(b10.f11849a, str6, intValue);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v02.f(AbstractC0603a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b11 = C0188f.b(c0197o6);
                            b11.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            b11.f11853e.zza(b11.f11849a, str7, b11.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v02, 4);
                            c0188f.getClass();
                            FirebaseAuth b12 = C0188f.b(c0197o7);
                            b12.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            b12.f11853e.zzb(b12.f11849a, str8, b12.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b13 = C0188f.b(c0197o8);
                            b13.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            b13.f11853e.zza(b13.f11849a, str9, str10, b13.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v02, 5);
                            c0188f.getClass();
                            FirebaseAuth b14 = C0188f.b(c0197o9);
                            b14.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new C1047u(b14, str11, str12, 0).i0(b14, b14.f11858k, b14.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b15 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = b15.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                zza = b15.f11853e.zza(b15.f11849a, new C1028b(b15), b15.f11858k);
                            } else {
                                zzad zzadVar = (zzad) b15.f11854f;
                                zzadVar.f11904A = false;
                                zza = Tasks.forResult(new zzx(zzadVar));
                            }
                            zza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b16 = C0188f.b(c0197o11);
                            b16.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = b16.f11858k;
                            new C1050x(b16, str13, false, null, str14, str15).i0(b16, str15, b16.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v02, 6);
                            c0188f.getClass();
                            FirebaseAuth b17 = C0188f.b(c0197o12);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (v6 == null) {
                                throw Y4.D.w();
                            }
                            b17.f(v6).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v02, 0);
                            c0188f.getClass();
                            FirebaseAuth b18 = C0188f.b(c0197o13);
                            b18.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            b18.f11853e.zza(b18.f11849a, str16, b18.f11858k, new C1028b(b18)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v02, 1);
                            c0188f.getClass();
                            FirebaseAuth b19 = C0188f.b(c0197o14);
                            b19.getClass();
                            b19.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v02, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth b20 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, b20);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (b20.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, b20, null)) {
                                f4.s.b(abstractActivityC1559c.getApplicationContext(), b20);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(rVar6, 6));
                            return;
                        case 16:
                            ArrayList arrayList30 = new ArrayList();
                            C0197o c0197o16 = (C0197o) ((ArrayList) obj).get(0);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b21 = C0188f.b(c0197o16);
                                if (b21.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) b21.f11854f).f11909b.f11939a);
                                }
                                b21.p();
                                f4.u uVar = b21.f11871x;
                                if (uVar != null) {
                                    C1096h c1096h = uVar.f12968b;
                                    c1096h.f12941d.removeCallbacks(c1096h.f12942e);
                                }
                                arrayList30.add(0, null);
                                v02.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v02.f(AbstractC0603a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b22 = C0188f.b(c0197o17);
                            b22.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            b22.f11853e.zzc(b22.f11849a, str19, b22.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v02, 2);
                            c0188f.getClass();
                            FirebaseAuth b23 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i82 = 1;
                                b23.c(str20, AbstractC1464a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i82) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            } else {
                                b23.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i92 = 0;
                                b23.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i92) {
                                            case 0:
                                                HashMap hashMap = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                            default:
                                                HashMap hashMap2 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                    break;
                                                } else {
                                                    rVar8.b();
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        case 19:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            C0197o c0197o19 = (C0197o) arrayList36.get(0);
                            String str21 = (String) arrayList36.get(1);
                            E e13 = (E) arrayList36.get(2);
                            C0199q c0199q7 = new C0199q(arrayList35, v02, 3);
                            c0188f.getClass();
                            FirebaseAuth b24 = C0188f.b(c0197o19);
                            ActionCodeSettings u4 = AbstractC1464a.u(e13);
                            b24.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!u4.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = b24.f11857i;
                            if (str22 != null) {
                                u4.f11839y = str22;
                            }
                            new C1048v(b24, str21, u4, 0).i0(b24, b24.f11858k, b24.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth b25 = C0188f.b(c0197o20);
                                if (str23 == null) {
                                    synchronized (b25.f11856h) {
                                        b25.f11857i = zzadx.zza();
                                    }
                                    arrayList37.add(0, b25.a());
                                    v02.f(arrayList37);
                                    return;
                                }
                                b25.getClass();
                                com.google.android.gms.common.internal.D.e(str23);
                                synchronized (b25.f11856h) {
                                    b25.f11857i = str23;
                                }
                                arrayList37.add(0, b25.a());
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v02.f(AbstractC0603a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth b26 = C0188f.b(c0197o21);
                                b26.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = b26.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v02.f(AbstractC0603a.v0(e15));
                                return;
                            }
                    }
                }
            });
        }
    }
}
