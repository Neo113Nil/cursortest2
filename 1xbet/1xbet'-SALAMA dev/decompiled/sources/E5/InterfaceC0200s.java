package E5;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p042f4.C0899h;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: renamed from: E5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0200s {
    static void a(A5.f fVar, final C0188f c0188f) {
        C0201t c0201t = C0201t.f2402e;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i8 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i8) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i9 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i9) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i8 = 2;
            f8.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i9 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i9) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i10 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i10) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i9 = 5;
            f9.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i10 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i10) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i11 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i11) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i10 = 6;
            f10.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i11 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i11) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i12 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i12) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i11 = 7;
            f11.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i12 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i12) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i13 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i13) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i12 = 8;
            f12.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i13 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i13) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i14 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i14) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f12.M(null);
        }
        F0 f13 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i13 = 9;
            f13.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i14 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i14) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i15 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i15) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f13.M(null);
        }
        F0 f14 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i14 = 10;
            f14.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i15 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i15) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i16 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i16) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f14.M(null);
        }
        F0 f15 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i15 = 12;
            f15.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i16 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i16) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i17 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i17) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f15.M(null);
        }
        F0 f16 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i16 = 13;
            f16.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i17 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i17) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i18 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i18) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f16.M(null);
        }
        F0 f17 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i17 = 11;
            f17.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i18 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i18) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i19 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i19) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f17.M(null);
        }
        F0 f18 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i18 = 14;
            f18.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i19 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i19) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i110 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f18.M(null);
        }
        F0 f19 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i19 = 15;
            f19.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f19.M(null);
        }
        F0 f20 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i20 = 16;
            f20.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f20.M(null);
        }
        F0 f21 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i21 = 17;
            f21.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f21.M(null);
        }
        F0 f22 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i22 = 18;
            f22.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f22.M(null);
        }
        F0 f23 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i23 = 19;
            f23.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f23.M(null);
        }
        F0 f24 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i24 = 20;
            f24.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f24.M(null);
        }
        F0 f25 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i25 = 21;
            f25.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f25.M(null);
        }
        F0 f26 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i26 = 1;
            f26.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f26.M(null);
        }
        F0 f27 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber", c0201t, (Object) null, 1);
        if (c0188f != null) {
            final int i27 = 3;
            f27.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        } else {
            f27.M(null);
        }
        C0201t c0201t2 = C0201t.f2402e;
        F0 f28 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode", c0201t, (Object) null, 1);
        if (c0188f == null) {
            f28.M(null);
        } else {
            final int i28 = 4;
            f28.M(new A5.b() { // from class: E5.p
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    Task<AuthResult> taskZza;
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
                                FirebaseAuth firebaseAuthB = C0188f.b(c0197o);
                                C0184b c0184b = new C0184b(firebaseAuthB, 1);
                                StringBuilder sb = new StringBuilder("plugins.flutter.io/firebase_auth/id-token/");
                                Y3.i iVar = firebaseAuthB.f11849a;
                                iVar.b();
                                sb.append(iVar.f7664b);
                                String string = sb.toString();
                                A5.j jVar = new A5.j(c0188f2.f2362a, string);
                                jVar.a(c0184b);
                                c0188f2.f2365d.put(jVar, c0184b);
                                arrayList.add(0, string);
                                v6.f(arrayList);
                                return;
                            } catch (Exception e7) {
                                v6.f(p003a.a.v0(e7));
                                return;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            C0197o c0197o2 = (C0197o) arrayList3.get(0);
                            String str2 = (String) arrayList3.get(1);
                            r rVar = new r(arrayList2, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB2 = C0188f.b(c0197o2);
                            firebaseAuthB2.getClass();
                            com.google.android.gms.common.internal.D.e(str2);
                            firebaseAuthB2.f11853e.zzd(firebaseAuthB2.f11849a, str2, firebaseAuthB2.f11858k).addOnCompleteListener(new C0185c(rVar, 2));
                            return;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            C0197o c0197o3 = (C0197o) ((ArrayList) obj).get(0);
                            C0188f c0188f3 = c0188f;
                            c0188f3.getClass();
                            try {
                                FirebaseAuth firebaseAuthB3 = C0188f.b(c0197o3);
                                C0184b c0184b2 = new C0184b(firebaseAuthB3, 0);
                                StringBuilder sb2 = new StringBuilder("plugins.flutter.io/firebase_auth/auth-state/");
                                Y3.i iVar2 = firebaseAuthB3.f11849a;
                                iVar2.b();
                                sb2.append(iVar2.f7664b);
                                String string2 = sb2.toString();
                                A5.j jVar2 = new A5.j(c0188f3.f2362a, string2);
                                jVar2.a(c0184b2);
                                c0188f3.f2365d.put(jVar2, c0184b2);
                                arrayList4.add(0, string2);
                                v6.f(arrayList4);
                                return;
                            } catch (Exception e8) {
                                v6.f(p003a.a.v0(e8));
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
                                        for (MultiFactorInfo multiFactorInfo : ((MultiFactorResolver) C0195m.f2388c.get((String) it.next())).j()) {
                                            if (multiFactorInfo.a().equals(str5) && (multiFactorInfo instanceof PhoneMultiFactorInfo)) {
                                                phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                                            }
                                            break;
                                        }
                                    }
                                }
                                W w7 = new W(c0188f4.f2364c, c0197o4, t7, multiFactorSession, phoneMultiFactorInfo, new B1.f(13));
                                jVar3.a(w7);
                                c0188f4.f2365d.put(jVar3, w7);
                                arrayList5.add(0, str3);
                                v6.f(arrayList5);
                                return;
                            } catch (Exception e9) {
                                v6.f(p003a.a.v0(e9));
                                return;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            c0188f.getClass();
                            arrayList7.add(0, null);
                            v6.f(arrayList7);
                            return;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            C0197o c0197o5 = (C0197o) arrayList10.get(0);
                            boolean z4 = true;
                            String str6 = (String) arrayList10.get(1);
                            Number number = (Number) arrayList10.get(2);
                            Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB4 = C0188f.b(c0197o5);
                                int iIntValue = lValueOf.intValue();
                                firebaseAuthB4.getClass();
                                com.google.android.gms.common.internal.D.e(str6);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    z4 = false;
                                }
                                com.google.android.gms.common.internal.D.a("Port number must be in the range 0-65535", z4);
                                zzafb.zza(firebaseAuthB4.f11849a, str6, iIntValue);
                                arrayList9.add(0, null);
                                v6.f(arrayList9);
                                return;
                            } catch (Exception e10) {
                                v6.f(p003a.a.v0(e10));
                                return;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            C0197o c0197o6 = (C0197o) arrayList12.get(0);
                            String str7 = (String) arrayList12.get(1);
                            C0199q c0199q = new C0199q(arrayList11, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB5 = C0188f.b(c0197o6);
                            firebaseAuthB5.getClass();
                            com.google.android.gms.common.internal.D.e(str7);
                            firebaseAuthB5.f11853e.zza(firebaseAuthB5.f11849a, str7, firebaseAuthB5.f11858k).addOnCompleteListener(new C0185c(c0199q, 1));
                            return;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            C0197o c0197o7 = (C0197o) arrayList14.get(0);
                            String str8 = (String) arrayList14.get(1);
                            r rVar2 = new r(arrayList13, v6, 4);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB6 = C0188f.b(c0197o7);
                            firebaseAuthB6.getClass();
                            com.google.android.gms.common.internal.D.e(str8);
                            firebaseAuthB6.f11853e.zzb(firebaseAuthB6.f11849a, str8, firebaseAuthB6.f11858k).addOnCompleteListener(new C0185c(rVar2, 4));
                            return;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            C0197o c0197o8 = (C0197o) arrayList16.get(0);
                            String str9 = (String) arrayList16.get(1);
                            String str10 = (String) arrayList16.get(2);
                            C0199q c0199q2 = new C0199q(arrayList15, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB7 = C0188f.b(c0197o8);
                            firebaseAuthB7.getClass();
                            com.google.android.gms.common.internal.D.e(str9);
                            com.google.android.gms.common.internal.D.e(str10);
                            firebaseAuthB7.f11853e.zza(firebaseAuthB7.f11849a, str9, str10, firebaseAuthB7.f11858k).addOnCompleteListener(new C0185c(c0199q2, 7));
                            return;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            C0197o c0197o9 = (C0197o) arrayList18.get(0);
                            String str11 = (String) arrayList18.get(1);
                            String str12 = (String) arrayList18.get(2);
                            r rVar3 = new r(arrayList17, v6, 5);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB8 = C0188f.b(c0197o9);
                            firebaseAuthB8.getClass();
                            com.google.android.gms.common.internal.D.e(str11);
                            com.google.android.gms.common.internal.D.e(str12);
                            new p034e4.u(firebaseAuthB8, str11, str12, 0).i0(firebaseAuthB8, firebaseAuthB8.f11858k, firebaseAuthB8.f11862o).addOnCompleteListener(new C0185c(rVar3, 11));
                            return;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            C0197o c0197o10 = (C0197o) ((ArrayList) obj).get(0);
                            C0199q c0199q3 = new C0199q(arrayList19, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB9 = C0188f.b(c0197o10);
                            FirebaseUser firebaseUser = firebaseAuthB9.f11854f;
                            if (firebaseUser == null || !firebaseUser.k()) {
                                taskZza = firebaseAuthB9.f11853e.zza(firebaseAuthB9.f11849a, new p034e4.b(firebaseAuthB9), firebaseAuthB9.f11858k);
                            } else {
                                zzad zzadVar = (zzad) firebaseAuthB9.f11854f;
                                zzadVar.f11904A = false;
                                taskZza = Tasks.forResult(new zzx(zzadVar));
                            }
                            taskZza.addOnCompleteListener(new C0185c(c0199q3, 9));
                            return;
                        case 11:
                            ArrayList arrayList20 = new ArrayList();
                            ArrayList arrayList21 = (ArrayList) obj;
                            C0197o c0197o11 = (C0197o) arrayList21.get(0);
                            String str13 = (String) arrayList21.get(1);
                            String str14 = (String) arrayList21.get(2);
                            r rVar4 = new r(arrayList20, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB10 = C0188f.b(c0197o11);
                            firebaseAuthB10.getClass();
                            com.google.android.gms.common.internal.D.e(str13);
                            com.google.android.gms.common.internal.D.e(str14);
                            String str15 = firebaseAuthB10.f11858k;
                            new p034e4.x(firebaseAuthB10, str13, false, null, str14, str15).i0(firebaseAuthB10, str15, firebaseAuthB10.f11861n).addOnCompleteListener(new C0185c(rVar4, 0));
                            return;
                        case 12:
                            ArrayList arrayList22 = new ArrayList();
                            ArrayList arrayList23 = (ArrayList) obj;
                            C0197o c0197o12 = (C0197o) arrayList23.get(0);
                            Map map2 = (Map) arrayList23.get(1);
                            r rVar5 = new r(arrayList22, v6, 6);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB11 = C0188f.b(c0197o12);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (authCredentialV == null) {
                                throw Y4.D.w();
                            }
                            firebaseAuthB11.f(authCredentialV).addOnCompleteListener(new C0185c(rVar5, 5));
                            return;
                        case 13:
                            ArrayList arrayList24 = new ArrayList();
                            ArrayList arrayList25 = (ArrayList) obj;
                            C0197o c0197o13 = (C0197o) arrayList25.get(0);
                            String str16 = (String) arrayList25.get(1);
                            C0199q c0199q4 = new C0199q(arrayList24, v6, 0);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB12 = C0188f.b(c0197o13);
                            firebaseAuthB12.getClass();
                            com.google.android.gms.common.internal.D.e(str16);
                            firebaseAuthB12.f11853e.zza(firebaseAuthB12.f11849a, str16, firebaseAuthB12.f11858k, new p034e4.b(firebaseAuthB12)).addOnCompleteListener(new C0185c(c0199q4, 3));
                            return;
                        case 14:
                            ArrayList arrayList26 = new ArrayList();
                            ArrayList arrayList27 = (ArrayList) obj;
                            C0197o c0197o14 = (C0197o) arrayList27.get(0);
                            String str17 = (String) arrayList27.get(1);
                            String str18 = (String) arrayList27.get(2);
                            C0199q c0199q5 = new C0199q(arrayList26, v6, 1);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB13 = C0188f.b(c0197o14);
                            firebaseAuthB13.getClass();
                            firebaseAuthB13.f(P6.b.m(str17, str18)).addOnCompleteListener(new C0185c(c0199q5, 12));
                            return;
                        case 15:
                            ArrayList arrayList28 = new ArrayList();
                            ArrayList arrayList29 = (ArrayList) obj;
                            C0197o c0197o15 = (C0197o) arrayList29.get(0);
                            M m7 = (M) arrayList29.get(1);
                            r rVar6 = new r(arrayList28, v6, 1);
                            C0188f c0188f5 = c0188f;
                            c0188f5.getClass();
                            FirebaseAuth firebaseAuthB14 = C0188f.b(c0197o15);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, firebaseAuthB14);
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = c0188f5.f2364c;
                            com.google.android.gms.common.internal.D.i(cVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuthB14.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuthB14, null)) {
                                p042f4.s.b(cVar.getApplicationContext(), firebaseAuthB14);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
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
                                FirebaseAuth firebaseAuthB15 = C0188f.b(c0197o16);
                                if (firebaseAuthB15.f11854f != null && (map = (Map) C0195m.f2386a.get(c0197o16.f2391a)) != null) {
                                    map.remove(((zzad) firebaseAuthB15.f11854f).f11909b.f11939a);
                                }
                                firebaseAuthB15.p();
                                p042f4.u uVar = firebaseAuthB15.f11871x;
                                if (uVar != null) {
                                    C0899h c0899h = uVar.f12974b;
                                    c0899h.f12947d.removeCallbacks(c0899h.f12948e);
                                }
                                arrayList30.add(0, null);
                                v6.f(arrayList30);
                                return;
                            } catch (Exception e11) {
                                v6.f(p003a.a.v0(e11));
                                return;
                            }
                        case 17:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            C0197o c0197o17 = (C0197o) arrayList32.get(0);
                            String str19 = (String) arrayList32.get(1);
                            C0199q c0199q6 = new C0199q(arrayList31, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB16 = C0188f.b(c0197o17);
                            firebaseAuthB16.getClass();
                            com.google.android.gms.common.internal.D.e(str19);
                            firebaseAuthB16.f11853e.zzc(firebaseAuthB16.f11849a, str19, firebaseAuthB16.f11858k).addOnCompleteListener(new C0185c(c0199q6, 10));
                            return;
                        case 18:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            C0197o c0197o18 = (C0197o) arrayList34.get(0);
                            String str20 = (String) arrayList34.get(1);
                            E e12 = (E) arrayList34.get(2);
                            final r rVar7 = new r(arrayList33, v6, 2);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB17 = C0188f.b(c0197o18);
                            if (e12 != null) {
                                final int i110 = 1;
                                firebaseAuthB17.c(str20, p097n3.a.u(e12)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i110) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                firebaseAuthB17.getClass();
                                com.google.android.gms.common.internal.D.e(str20);
                                final int i111 = 0;
                                firebaseAuthB17.c(str20, null).addOnCompleteListener(new OnCompleteListener() { // from class: E5.d
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        r rVar8 = rVar7;
                                        switch (i111) {
                                            case 0:
                                                HashMap map4 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
                                            default:
                                                HashMap map5 = C0188f.f2361z;
                                                if (!task2.isSuccessful()) {
                                                    rVar8.a(Y4.D.L(task2.getException()));
                                                } else {
                                                    rVar8.b();
                                                }
                                                break;
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
                            C0199q c0199q7 = new C0199q(arrayList35, v6, 3);
                            c0188f.getClass();
                            FirebaseAuth firebaseAuthB18 = C0188f.b(c0197o19);
                            ActionCodeSettings actionCodeSettingsU = p097n3.a.u(e13);
                            firebaseAuthB18.getClass();
                            com.google.android.gms.common.internal.D.e(str21);
                            if (!actionCodeSettingsU.f11838x) {
                                throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                            }
                            String str22 = firebaseAuthB18.f11857i;
                            if (str22 != null) {
                                actionCodeSettingsU.f11839y = str22;
                            }
                            new p034e4.v(firebaseAuthB18, str21, actionCodeSettingsU, 0).i0(firebaseAuthB18, firebaseAuthB18.f11858k, firebaseAuthB18.f11860m).addOnCompleteListener(new C0185c(c0199q7, 8));
                            return;
                        case 20:
                            C0188f c0188f6 = c0188f;
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            C0197o c0197o20 = (C0197o) arrayList38.get(0);
                            String str23 = (String) arrayList38.get(1);
                            c0188f6.getClass();
                            try {
                                FirebaseAuth firebaseAuthB19 = C0188f.b(c0197o20);
                                if (str23 != null) {
                                    firebaseAuthB19.getClass();
                                    com.google.android.gms.common.internal.D.e(str23);
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = str23;
                                        break;
                                    }
                                } else {
                                    synchronized (firebaseAuthB19.f11856h) {
                                        firebaseAuthB19.f11857i = zzadx.zza();
                                        break;
                                    }
                                }
                                arrayList37.add(0, firebaseAuthB19.a());
                                v6.f(arrayList37);
                                return;
                            } catch (Exception e14) {
                                v6.f(p003a.a.v0(e14));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            C0197o c0197o21 = (C0197o) arrayList40.get(0);
                            H h6 = (H) arrayList40.get(1);
                            c0188f.getClass();
                            try {
                                FirebaseAuth firebaseAuthB20 = C0188f.b(c0197o21);
                                firebaseAuthB20.f11855g.f2871a = h6.f2279a.booleanValue();
                                Boolean bool = h6.f2283e;
                                G4.A a2 = firebaseAuthB20.f11855g;
                                if (bool != null) {
                                    a2.f2872b = bool.booleanValue();
                                }
                                String str24 = h6.f2281c;
                                if (str24 != null && (str = h6.f2282d) != null) {
                                    a2.f2873c = str24;
                                    a2.f2874d = str;
                                }
                                arrayList39.add(0, null);
                                v6.f(arrayList39);
                                return;
                            } catch (Exception e15) {
                                v6.f(p003a.a.v0(e15));
                                return;
                            }
                    }
                }
            });
        }
    }
}
