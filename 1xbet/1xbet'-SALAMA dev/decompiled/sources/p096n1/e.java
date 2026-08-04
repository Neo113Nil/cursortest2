package p096n1;

import A1.C0045t0;
import A1.K0;
import A1.RunnableC0032m0;
import A5.b;
import A5.o;
import A5.p;
import A5.q;
import A5.r;
import B.v;
import B3.d;
import C1.C0095a;
import E5.C0197o;
import E5.C0201t;
import F1.n;
import G4.InterfaceC0291y;
import G4.S;
import L1.c;
import P.InterfaceC0351g;
import W3.h;
import W3.j;
import Y3.i;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Window;
import androidx.appcompat.widget.InterfaceC0629m;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.zzad;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.sentry.protocol.Device;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p018c2.C0774u;
import p018c2.X;
import p018c2.Y;
import p018c2.e0;
import p018c2.f0;
import p054h2.l;
import p058i.u;
import p068j2.f;
import p083l4.a;
import p086m.k;
import p086m.w;
import p146u2.F;
import p146u2.H;
import p146u2.K;
import p146u2.N;
import p155w1.C1050x1;
import p155w1.C1052y0;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0291y, zzapf, InterfaceC0351g, h, InterfaceC0629m, F, X, w, a, f, d, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15314b;

    public /* synthetic */ e(int i7) {
        this.f15313a = i7;
    }

    public static void B(A5.f fVar, final e eVar) {
        C0201t c0201t = C0201t.f2403f;
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete", c0201t, obj, 1);
        if (eVar != null) {
            final int i7 = 0;
            f7.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i8 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i8) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i9 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i9) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i10 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i10) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i11 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i11) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken", c0201t, obj, 1);
        if (eVar != null) {
            final int i8 = 9;
            f8.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i9 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i9) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i10 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i10) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i11 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i11) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i12 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i12) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential", c0201t, obj, 1);
        if (eVar != null) {
            final int i9 = 10;
            f9.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i9) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i10 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i10) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i11 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i11) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i12 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i12) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i13 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i13) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider", c0201t, obj, 1);
        if (eVar != null) {
            final int i10 = 11;
            f10.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i11 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i11) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i12 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i12) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i13 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i13) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i14 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i14) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential", c0201t, obj, 1);
        if (eVar != null) {
            final int i11 = 12;
            f11.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i12 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i12) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i13 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i13) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i14 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i14) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i15 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i15) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider", c0201t, obj, 1);
        if (eVar != null) {
            final int i12 = 13;
            f12.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i13 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i13) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i14 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i14) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i15 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i15) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i16 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i16) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f12.M(null);
        }
        F0 f13 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload", c0201t, obj, 1);
        if (eVar != null) {
            final int i13 = 1;
            f13.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i14 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i14) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i15 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i15) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i16 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i16) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i17 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i17) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f13.M(null);
        }
        F0 f14 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification", c0201t, obj, 1);
        if (eVar != null) {
            final int i14 = 2;
            f14.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i15 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i15) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i16 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i16) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i17 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i17) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i18 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i18) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f14.M(null);
        }
        F0 f15 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink", c0201t, obj, 1);
        if (eVar != null) {
            final int i15 = 3;
            f15.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i16 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i16) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i17 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i17) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i18 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i18) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i19 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i19) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f15.M(null);
        }
        F0 f16 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail", c0201t, obj, 1);
        if (eVar != null) {
            final int i16 = 4;
            f16.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i17 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i17) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i18 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i18) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i19 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i19) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i110 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i110) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f16.M(null);
        }
        F0 f17 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword", c0201t, obj, 1);
        if (eVar != null) {
            final int i17 = 5;
            f17.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i18 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i18) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i19 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i19) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i110 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i110) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i111 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i111) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f17.M(null);
        }
        F0 f18 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber", c0201t, obj, 1);
        if (eVar != null) {
            final int i18 = 6;
            f18.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i19 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i19) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i110 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i110) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i111 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i111) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i112 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i112) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f18.M(null);
        }
        F0 f19 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile", c0201t, obj, 1);
        if (eVar != null) {
            final int i19 = 7;
            f19.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i110 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i110) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i111 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i111) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i112 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i112) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i113 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i113) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        } else {
            f19.M(null);
        }
        F0 f20 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail", c0201t, obj, 1);
        if (eVar == null) {
            f20.M(null);
        } else {
            final int i20 = 8;
            f20.M(new b(eVar) { // from class: E5.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p096n1.e f2409b;

                {
                    this.f2409b = eVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
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
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i20) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS = p096n1.e.s(c0197o);
                            if (firebaseUserS != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(firebaseUserS, new p034e4.w(firebaseAuth, firebaseUserS)).addOnCompleteListener(new C0185c(rVar, 17));
                            } else {
                                rVar.a(Y4.D.E());
                            }
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v6, 12);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS2 = p096n1.e.s(c0197o2);
                            if (firebaseUserS2 != null) {
                                firebaseUserS2.m().addOnCompleteListener(new E4.K(2, rVar2, firebaseUserS2));
                            } else {
                                rVar2.a(Y4.D.E());
                            }
                            break;
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS3 = p096n1.e.s(c0197o3);
                            if (firebaseUserS3 == null) {
                                c0199q.a(Y4.D.E());
                            } else if (e7 != null) {
                                final int i110 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p028d6.k(2, (Object) firebaseUserS3, (Object) p097n3.a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i110) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i111 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS3).f11910c)).h(firebaseUserS3, false).continueWithTask(new p145u1.c(firebaseUserS3, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i111) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q2 = c0199q;
                                                if (!zIsSuccessful) {
                                                    c0199q2.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q2.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q3 = c0199q;
                                                if (!zIsSuccessful2) {
                                                    c0199q3.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q3.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v6, 13);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS4 = p096n1.e.s(c0197o4);
                            if (firebaseUserS4 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS4).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, firebaseUserS4, str2, new p034e4.c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                            } else {
                                rVar3.a(Y4.D.E());
                            }
                            break;
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS5 = p096n1.e.s(c0197o5);
                            if (firebaseUserS5 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS5).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, firebaseUserS5, str3, new p034e4.c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(firebaseUserS5, c0199q2));
                            } else {
                                c0199q2.a(Y4.D.E());
                            }
                            break;
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v6, 7);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS6 = p096n1.e.s(c0197o6);
                            if (firebaseUserS6 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS6).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, firebaseUserS6, str4, new p034e4.c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(firebaseUserS6, rVar4));
                            } else {
                                rVar4.a(Y4.D.E());
                            }
                            break;
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS7 = p096n1.e.s(c0197o7);
                            if (firebaseUserS7 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) p097n3.a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS7).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, firebaseUserS7, (PhoneAuthCredential) phoneAuthCredential.clone(), (p042f4.z) new p034e4.c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(firebaseUserS7, c0199q3));
                                } else {
                                    c0199q3.a(Y4.D.w());
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                            }
                            break;
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s7 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v6, 8);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS8 = p096n1.e.s(c0197o8);
                            if (firebaseUserS8 != null) {
                                if (s7.f2325c.booleanValue()) {
                                    str = s7.f2323a;
                                    if (str == null) {
                                        str = null;
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                    str = null;
                                }
                                if (s7.f2326d.booleanValue()) {
                                    String str5 = s7.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS8).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, firebaseUserS8, userProfileChangeRequest, (p042f4.z) new p034e4.c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(firebaseUserS8, rVar5));
                            } else {
                                rVar5.a(Y4.D.E());
                            }
                            break;
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v6, 9);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS9 = p096n1.e.s(c0197o9);
                            if (firebaseUserS9 == null) {
                                c0199q4.a(Y4.D.E());
                            } else if (e8 != null) {
                                final int i112 = 1;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, p097n3.a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i112) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                final int i113 = 0;
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS9).f11910c)).h(firebaseUserS9, false).continueWithTask(new C1050x1(firebaseUserS9, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task3) {
                                        switch (i113) {
                                            case 0:
                                                boolean zIsSuccessful = task3.isSuccessful();
                                                C0199q c0199q5 = c0199q4;
                                                if (!zIsSuccessful) {
                                                    c0199q5.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q5.c();
                                                }
                                                break;
                                            default:
                                                boolean zIsSuccessful2 = task3.isSuccessful();
                                                C0199q c0199q6 = c0199q4;
                                                if (!zIsSuccessful2) {
                                                    c0199q6.a(Y4.D.L(task3.getException()));
                                                } else {
                                                    c0199q6.c();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v6, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v6, 10);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS10 = p096n1.e.s(c0197o11);
                            AuthCredential authCredentialV = p097n3.a.v(map2);
                            if (firebaseUserS10 == null) {
                                rVar6.a(Y4.D.E());
                            } else if (authCredentialV != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS10).f11910c)).g(firebaseUserS10, authCredentialV).addOnCompleteListener(new C0185c(rVar6, 15));
                            } else {
                                rVar6.a(Y4.D.w());
                            }
                            break;
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v6, 11);
                            p096n1.e eVar2 = this.f2409b;
                            eVar2.getClass();
                            FirebaseUser firebaseUserS11 = p096n1.e.s(c0197o12);
                            com.google.android.gms.common.internal.w wVarF = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) wVarF.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                wVarF.t(map3);
                            }
                            p121q5.c cVar = (p121q5.c) eVar2.f15314b;
                            firebaseUserS11.getClass();
                            com.google.android.gms.common.internal.D.i(cVar);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS11).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12909b.o(cVar, taskCompletionSource, firebaseAuth7, firebaseUserS11)) {
                                p042f4.s.c(cVar.getApplicationContext(), firebaseAuth7, firebaseUserS11);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(cVar, GenericIdpActivity.class);
                                intent.setPackage(cVar.getPackageName());
                                intent.putExtras(bundle);
                                cVar.startActivity(intent);
                                task = taskCompletionSource.getTask();
                            } else {
                                task = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task.addOnCompleteListener(new C0185c(c0199q6, 13));
                            break;
                        case 12:
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj2;
                            C0197o c0197o13 = (C0197o) arrayList24.get(0);
                            Map map4 = (Map) arrayList24.get(1);
                            r rVar7 = new r(arrayList23, v6, 11);
                            this.f2409b.getClass();
                            FirebaseUser firebaseUserS12 = p096n1.e.s(c0197o13);
                            AuthCredential authCredentialV2 = p097n3.a.v(map4);
                            if (firebaseUserS12 == null) {
                                rVar7.a(Y4.D.E());
                            } else if (authCredentialV2 != null) {
                                FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS12).f11910c)).o(firebaseUserS12, authCredentialV2).addOnCompleteListener(new C0185c(rVar7, 14));
                            } else {
                                rVar7.a(Y4.D.w());
                            }
                            break;
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v6, 12);
                            p096n1.e eVar3 = this.f2409b;
                            eVar3.getClass();
                            FirebaseUser firebaseUserS13 = p096n1.e.s(c0197o14);
                            com.google.android.gms.common.internal.w wVarF2 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) wVarF2.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                wVarF2.t(map5);
                            }
                            p121q5.c cVar2 = (p121q5.c) eVar3.f15314b;
                            firebaseUserS13.getClass();
                            com.google.android.gms.common.internal.D.i(cVar2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS13).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12909b.o(cVar2, taskCompletionSource2, firebaseAuth8, firebaseUserS13)) {
                                p042f4.s.c(cVar2.getApplicationContext(), firebaseAuth8, firebaseUserS13);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(cVar2, GenericIdpActivity.class);
                                intent2.setPackage(cVar2.getPackageName());
                                intent2.putExtras(bundle2);
                                cVar2.startActivity(intent2);
                                task2 = taskCompletionSource2.getTask();
                            } else {
                                task2 = Tasks.forException(zzadg.zza(new Status(17057, null, null, null)));
                            }
                            task2.addOnCompleteListener(new C0185c(c0199q7, 18));
                            break;
                    }
                }
            });
        }
    }

    public static FirebaseUser s(C0197o c0197o) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(i.f(c0197o.f2391a));
        String str = c0197o.f2392b;
        if (str != null) {
            firebaseAuth.e(str);
        }
        return firebaseAuth.f11854f;
    }

    public void A(int i7, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i7;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.f15314b).send(messageObtain);
    }

    public void C(int i7, long j, long j3) throws C0045t0 {
        L1.d dVar = (L1.d) this.f15314b;
        p151v2.a.i(dVar.f4287b0);
        if (i7 == 160) {
            dVar.f4274Q = false;
            dVar.f4275R = 0L;
            return;
        }
        if (i7 != 174) {
            if (i7 == 187) {
                dVar.f4262E = false;
                return;
            }
            if (i7 == 19899) {
                dVar.f4307w = -1;
                dVar.f4308x = -1L;
                return;
            }
            if (i7 == 20533) {
                dVar.c(i7);
                dVar.f4305u.f4235h = true;
                return;
            }
            if (i7 == 21968) {
                dVar.c(i7);
                dVar.f4305u.f4250x = true;
                return;
            }
            if (i7 == 408125543) {
                long j7 = dVar.f4301q;
                if (j7 != -1 && j7 != j) {
                    throw C0045t0.a(null, "Multiple Segment elements not supported");
                }
                dVar.f4301q = j;
                dVar.f4300p = j3;
                return;
            }
            if (i7 == 475249515) {
                dVar.f4260C = new v(13, (byte) 0);
                dVar.f4261D = new v(13, (byte) 0);
                return;
            } else {
                if (i7 == 524531317 && !dVar.f4306v) {
                    if (dVar.f4289d && dVar.f4310z != -1) {
                        dVar.f4309y = true;
                        return;
                    } else {
                        dVar.f4287b0.m(new n(dVar.f4304t));
                        dVar.f4306v = true;
                        return;
                    }
                }
                return;
            }
        }
        c cVar = new c();
        cVar.f4239m = -1;
        cVar.f4240n = -1;
        cVar.f4241o = -1;
        cVar.f4242p = -1;
        cVar.f4243q = 0;
        cVar.f4244r = -1;
        cVar.f4245s = 0.0f;
        cVar.f4246t = 0.0f;
        cVar.f4247u = 0.0f;
        cVar.f4248v = null;
        cVar.f4249w = -1;
        cVar.f4250x = false;
        cVar.f4251y = -1;
        cVar.f4252z = -1;
        cVar.f4203A = -1;
        cVar.f4204B = zzbbd.zzq.zzf;
        cVar.f4205C = 200;
        cVar.f4206D = -1.0f;
        cVar.f4207E = -1.0f;
        cVar.f4208F = -1.0f;
        cVar.f4209G = -1.0f;
        cVar.f4210H = -1.0f;
        cVar.f4211I = -1.0f;
        cVar.f4212J = -1.0f;
        cVar.f4213K = -1.0f;
        cVar.f4214L = -1.0f;
        cVar.f4215M = -1.0f;
        cVar.f4217O = 1;
        cVar.f4218P = -1;
        cVar.f4219Q = 8000;
        cVar.f4220R = 0L;
        cVar.f4221S = 0L;
        cVar.f4224V = true;
        cVar.f4225W = "eng";
        dVar.f4305u = cVar;
    }

    @Override // p083l4.a
    public void Q(String str) {
        ((TaskCompletionSource) this.f15314b).setResult(str);
    }

    @Override // W3.h
    public Object R(String str) {
        return ((j) this.f15314b).d(str, null);
    }

    @Override // p083l4.a
    public void W(String str) {
        ((TaskCompletionSource) this.f15314b).setException(new Exception(str));
    }

    @Override // p086m.w
    public void a(k kVar, boolean z4) {
        u uVar;
        k kVarK = kVar.k();
        int i7 = 0;
        boolean z7 = kVarK != kVar;
        if (z7) {
            kVar = kVarK;
        }
        p058i.v vVar = (p058i.v) this.f15314b;
        u[] uVarArr = vVar.c0;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i7 < length) {
                uVar = uVarArr[i7];
                if (uVar != null && uVar.f13742h == kVar) {
                    break;
                } else {
                    i7++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (!z7) {
                vVar.t(uVar, z4);
            } else {
                vVar.r(uVar.f13735a, uVar, kVarK);
                vVar.t(uVar, true);
            }
        }
    }

    @Override // p018c2.X
    public void b(Y y4) {
        l lVar = (l) this.f15314b;
        lVar.f13433H.b(lVar);
    }

    @Override // P.InterfaceC0351g
    public int c() {
        return ((ContentInfo) this.f15314b).getFlags();
    }

    @Override // p068j2.f
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // P.InterfaceC0351g
    public ClipData e() {
        return ((ContentInfo) this.f15314b).getClip();
    }

    @Override // p146u2.F
    public void g(H h6, long j, long j3) {
        N n2 = (N) h6;
        p040f2.f fVar = (p040f2.f) this.f15314b;
        fVar.getClass();
        long j7 = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        fVar.f12850n.getClass();
        fVar.f12853q.f(c0774u, n2.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        fVar.f12841L = ((Long) n2.f16739f).longValue() - j;
        fVar.s(true);
    }

    @Override // p068j2.f
    public long h(int i7) {
        p151v2.a.f(i7 == 0);
        return 0L;
    }

    @Override // p146u2.F
    public Q1.e i(H h6, IOException iOException, int i7) {
        N n2 = (N) h6;
        p040f2.f fVar = (p040f2.f) this.f15314b;
        fVar.getClass();
        long j = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        fVar.f12853q.i(new C0774u(), n2.f16736c, iOException, true);
        fVar.f12850n.getClass();
        p151v2.a.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        fVar.s(true);
        return K.f16729e;
    }

    @Override // P.InterfaceC0351g
    public ContentInfo j() {
        return (ContentInfo) this.f15314b;
    }

    @Override // P.InterfaceC0351g
    public int k() {
        return ((ContentInfo) this.f15314b).getSource();
    }

    @Override // p146u2.F
    public void l(H h6, long j, long j3, boolean z4) {
        N n2 = (N) h6;
        p040f2.f fVar = (p040f2.f) this.f15314b;
        fVar.getClass();
        long j7 = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        fVar.f12850n.getClass();
        fVar.f12853q.d(c0774u, n2.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p068j2.f
    public List m(long j) {
        return j >= 0 ? (List) this.f15314b : Collections.emptyList();
    }

    @Override // p086m.w
    public boolean n(k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        p058i.v vVar = (p058i.v) this.f15314b;
        if (!vVar.f13776W || (callback = vVar.f13756C.getCallback()) == null || vVar.f13786h0) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    public void o(int i7, int i8, F1.h hVar) throws C0045t0, EOFException, InterruptedIOException {
        c cVar;
        c cVar2;
        c cVar3;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        L1.d dVar = (L1.d) this.f15314b;
        SparseArray sparseArray = dVar.f4288c;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (dVar.f4264G != 2) {
                    return;
                }
                c cVar4 = (c) sparseArray.get(dVar.f4270M);
                if (dVar.f4273P != 4 || !"V_VP9".equals(cVar4.f4229b)) {
                    hVar.q(i8);
                    return;
                }
                C0095a c0095a = dVar.f4298n;
                c0095a.A(i8);
                hVar.a((byte[]) c0095a.f1465c, 0, i8, false);
                return;
            }
            if (i7 == 16877) {
                dVar.c(i7);
                c cVar5 = dVar.f4305u;
                int i16 = cVar5.f4234g;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    hVar.q(i8);
                    return;
                }
                byte[] bArr = new byte[i8];
                cVar5.f4216N = bArr;
                hVar.a(bArr, 0, i8, false);
                return;
            }
            if (i7 == 16981) {
                dVar.c(i7);
                c cVar6 = dVar.f4305u;
                byte[] bArr2 = new byte[i8];
                cVar6.f4236i = bArr2;
                hVar.a(bArr2, 0, i8, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i8];
                hVar.a(bArr3, 0, i8, false);
                dVar.c(i7);
                dVar.f4305u.j = new F1.u(1, bArr3, 0, 0);
                return;
            }
            if (i7 == 21419) {
                C0095a c0095a2 = dVar.f4294i;
                Arrays.fill((byte[]) c0095a2.f1465c, (byte) 0);
                hVar.a((byte[]) c0095a2.f1465c, 4 - i8, i8, false);
                c0095a2.D(0);
                dVar.f4307w = (int) c0095a2.u();
                return;
            }
            if (i7 == 25506) {
                dVar.c(i7);
                c cVar7 = dVar.f4305u;
                byte[] bArr4 = new byte[i8];
                cVar7.f4237k = bArr4;
                hVar.a(bArr4, 0, i8, false);
                return;
            }
            if (i7 != 30322) {
                throw C0045t0.a(null, "Unexpected id: " + i7);
            }
            dVar.c(i7);
            c cVar8 = dVar.f4305u;
            byte[] bArr5 = new byte[i8];
            cVar8.f4248v = bArr5;
            hVar.a(bArr5, 0, i8, false);
            return;
        }
        int i17 = dVar.f4264G;
        C0095a c0095a3 = dVar.f4292g;
        if (i17 == 0) {
            L1.e eVar = dVar.f4286b;
            dVar.f4270M = (int) eVar.c(hVar, false, true, 8);
            dVar.f4271N = eVar.f4314c;
            dVar.f4266I = -9223372036854775807L;
            dVar.f4264G = 1;
            c0095a3.A(0);
        }
        c cVar9 = (c) sparseArray.get(dVar.f4270M);
        if (cVar9 == null) {
            hVar.q(i8 - dVar.f4271N);
            dVar.f4264G = 0;
            return;
        }
        cVar9.f4226X.getClass();
        if (dVar.f4264G == 1) {
            dVar.i(hVar, 3);
            int i18 = (((byte[]) c0095a3.f1465c)[2] & 6) >> 1;
            byte b7 = 255;
            if (i18 == 0) {
                dVar.f4268K = 1;
                int[] iArr = dVar.f4269L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f4269L = iArr;
                iArr[0] = (i8 - dVar.f4271N) - 3;
            } else {
                dVar.i(hVar, 4);
                int i19 = (((byte[]) c0095a3.f1465c)[3] & 255) + 1;
                dVar.f4268K = i19;
                int[] iArr2 = dVar.f4269L;
                if (iArr2 == null) {
                    iArr2 = new int[i19];
                } else if (iArr2.length < i19) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i19)];
                }
                dVar.f4269L = iArr2;
                if (i18 == 2) {
                    int i20 = (i8 - dVar.f4271N) - 4;
                    int i21 = dVar.f4268K;
                    Arrays.fill(iArr2, 0, i21, i20 / i21);
                } else {
                    if (i18 == 1) {
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            i9 = dVar.f4268K - 1;
                            if (i22 >= i9) {
                                break;
                            }
                            dVar.f4269L[i22] = 0;
                            while (true) {
                                i10 = i13 + 1;
                                dVar.i(hVar, i10);
                                int i24 = ((byte[]) c0095a3.f1465c)[i13] & 255;
                                int[] iArr3 = dVar.f4269L;
                                i11 = iArr3[i22] + i24;
                                iArr3[i22] = i11;
                                if (i24 != 255) {
                                    break;
                                } else {
                                    i13 = i10;
                                }
                            }
                            i23 += i11;
                            i22++;
                            i13 = i10;
                        }
                        dVar.f4269L[i9] = ((i8 - dVar.f4271N) - i13) - i23;
                    } else {
                        if (i18 != 3) {
                            throw C0045t0.a(null, "Unexpected lacing value: " + i18);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            int i27 = dVar.f4268K - i15;
                            if (i25 >= i27) {
                                cVar2 = cVar9;
                                dVar.f4269L[i27] = ((i8 - dVar.f4271N) - i13) - i26;
                                break;
                            }
                            dVar.f4269L[i25] = i14;
                            int i28 = i13 + 1;
                            dVar.i(hVar, i28);
                            if (((byte[]) c0095a3.f1465c)[i13] == 0) {
                                throw C0045t0.a(null, "No valid varint length mask found");
                            }
                            int i29 = i14;
                            while (true) {
                                if (i29 >= 8) {
                                    cVar3 = cVar9;
                                    j = 0;
                                    i13 = i28;
                                    break;
                                }
                                int i30 = i15 << (7 - i29);
                                if ((((byte[]) c0095a3.f1465c)[i13] & i30) != 0) {
                                    int i31 = i28 + i29;
                                    dVar.i(hVar, i31);
                                    c cVar10 = cVar9;
                                    j = ((byte[]) c0095a3.f1465c)[i13] & b7 & (~i30);
                                    while (i28 < i31) {
                                        j = (j << 8) | ((long) (((byte[]) c0095a3.f1465c)[i28] & 255));
                                        i28++;
                                        cVar10 = cVar10;
                                    }
                                    cVar3 = cVar10;
                                    if (i25 > 0) {
                                        j -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                    i13 = i31;
                                    break;
                                }
                                i29++;
                                b7 = 255;
                                i15 = 1;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw C0045t0.a(null, "EBML lacing sample size out of range.");
                            }
                            int i32 = (int) j;
                            int[] iArr4 = dVar.f4269L;
                            if (i25 != 0) {
                                i32 += iArr4[i25 - 1];
                            }
                            iArr4[i25] = i32;
                            i26 += i32;
                            i25++;
                            cVar9 = cVar3;
                            b7 = 255;
                            i14 = 0;
                            i15 = 1;
                        }
                    }
                    byte[] bArr6 = (byte[]) c0095a3.f1465c;
                    dVar.f4265H = dVar.k((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f4259B;
                    cVar = cVar2;
                    if (cVar.f4231d != 2 || (i7 == 163 && (((byte[]) c0095a3.f1465c)[2] & 128) == 128)) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    dVar.f4272O = i12;
                    dVar.f4264G = 2;
                    dVar.f4267J = 0;
                }
            }
            cVar2 = cVar9;
            byte[] bArr7 = (byte[]) c0095a3.f1465c;
            dVar.f4265H = dVar.k((bArr7[1] & 255) | (bArr7[0] << 8)) + dVar.f4259B;
            cVar = cVar2;
            if (cVar.f4231d != 2) {
                i12 = 1;
            } else {
                i12 = 1;
            }
            dVar.f4272O = i12;
            dVar.f4264G = 2;
            dVar.f4267J = 0;
        } else {
            cVar = cVar9;
        }
        if (i7 == 163) {
            while (true) {
                int i33 = dVar.f4267J;
                if (i33 >= dVar.f4268K) {
                    dVar.f4264G = 0;
                    return;
                }
                dVar.d(cVar, ((long) ((dVar.f4267J * cVar.f4232e) / zzbbd.zzq.zzf)) + dVar.f4265H, dVar.f4272O, dVar.l(hVar, cVar, dVar.f4269L[i33], false), 0);
                dVar.f4267J++;
                cVar = cVar;
            }
        } else {
            c cVar11 = cVar;
            while (true) {
                int i34 = dVar.f4267J;
                if (i34 >= dVar.f4268K) {
                    return;
                }
                int[] iArr5 = dVar.f4269L;
                iArr5[i34] = dVar.l(hVar, cVar11, iArr5[i34], true);
                dVar.f4267J++;
            }
        }
    }

    @Override // B3.d
    public void onConsentInfoUpdateFailure(B3.i iVar) {
        String strValueOf = String.valueOf(iVar.f1067a);
        String str = iVar.f1068b;
        y1.a aVar = (y1.a) this.f15314b;
        aVar.getClass();
        try {
            aVar.f18135c.error(strValueOf, str, "");
        } catch (Exception unused) {
        }
    }

    @Override // A5.q
    public void onMethodCall(o oVar, r rVar) {
        switch (this.f15313a) {
            case 25:
                com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f15314b;
                if (((C1052y0) wVar.f11336c) != null) {
                    String str = oVar.f676a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((p) rVar).notImplemented();
                    } else {
                        JSONObject jSONObject = (JSONObject) oVar.f677b;
                        try {
                            ((p) rVar).success(((C1052y0) wVar.f11336c).f(jSONObject.getString("key"), jSONObject.has(Device.JsonKeys.LOCALE) ? jSONObject.getString(Device.JsonKeys.LOCALE) : null));
                        } catch (JSONException e7) {
                            ((p) rVar).error("error", e7.getMessage(), null);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                com.google.android.gms.common.internal.w wVar2 = (com.google.android.gms.common.internal.w) this.f15314b;
                if (((D5.a) wVar2.f11336c) != null) {
                    String str2 = oVar.f676a;
                    Object obj = oVar.f677b;
                    str2.getClass();
                    if (str2.equals("ProcessText.processTextAction")) {
                        try {
                            ArrayList arrayList = (ArrayList) obj;
                            ((D5.a) wVar2.f11336c).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (p) rVar);
                        } catch (IllegalStateException e8) {
                            ((p) rVar).error("error", e8.getMessage(), null);
                        }
                    } else if (!str2.equals("ProcessText.queryTextActions")) {
                        ((p) rVar).notImplemented();
                    } else {
                        try {
                            ((p) rVar).success(((D5.a) wVar2.f11336c).b());
                        } catch (IllegalStateException e9) {
                            ((p) rVar).error("error", e9.getMessage(), null);
                            return;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // p068j2.f
    public int p() {
        return 1;
    }

    public ApplicationInfo q(int i7, String str) {
        return ((Context) this.f15314b).getPackageManager().getApplicationInfo(str, i7);
    }

    public CharSequence r(String str) {
        Context context = (Context) this.f15314b;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @Override // G4.InterfaceC0291y
    public void run() {
        ((S) this.f15314b).H(new K0(this, 6), "build overlays");
    }

    public PackageInfo t(int i7, String str) {
        return ((Context) this.f15314b).getPackageManager().getPackageInfo(str, i7);
    }

    public String toString() {
        switch (this.f15313a) {
            case 7:
                return "ContentInfoCompat{" + ((ContentInfo) this.f15314b) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i7, long j) throws C0045t0 {
        L1.d dVar = (L1.d) this.f15314b;
        dVar.getClass();
        if (i7 == 20529) {
            if (j == 0) {
                return;
            }
            throw C0045t0.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i7 == 20530) {
            if (j == 1) {
                return;
            }
            throw C0045t0.a(null, "ContentEncodingScope " + j + " not supported");
        }
        int i8 = 3;
        switch (i7) {
            case 131:
                dVar.c(i7);
                dVar.f4305u.f4231d = (int) j;
                return;
            case 136:
                dVar.c(i7);
                dVar.f4305u.f4224V = j == 1;
                return;
            case 155:
                dVar.f4266I = dVar.k(j);
                return;
            case 159:
                dVar.c(i7);
                dVar.f4305u.f4217O = (int) j;
                return;
            case 176:
                dVar.c(i7);
                dVar.f4305u.f4239m = (int) j;
                return;
            case 179:
                dVar.b(i7);
                dVar.f4260C.d(dVar.k(j));
                return;
            case 186:
                dVar.c(i7);
                dVar.f4305u.f4240n = (int) j;
                return;
            case 215:
                dVar.c(i7);
                dVar.f4305u.f4230c = (int) j;
                return;
            case 231:
                dVar.f4259B = dVar.k(j);
                return;
            case 238:
                dVar.f4273P = (int) j;
                return;
            case 241:
                if (dVar.f4262E) {
                    return;
                }
                dVar.b(i7);
                dVar.f4261D.d(j);
                dVar.f4262E = true;
                return;
            case 251:
                dVar.f4274Q = true;
                return;
            case 16871:
                dVar.c(i7);
                dVar.f4305u.f4234g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C0045t0.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw C0045t0.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C0045t0.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C0045t0.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C0045t0.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                dVar.f4308x = j + dVar.f4301q;
                return;
            case 21432:
                int i9 = (int) j;
                dVar.c(i7);
                if (i9 == 0) {
                    dVar.f4305u.f4249w = 0;
                    return;
                }
                if (i9 == 1) {
                    dVar.f4305u.f4249w = 2;
                    return;
                } else if (i9 == 3) {
                    dVar.f4305u.f4249w = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    dVar.f4305u.f4249w = 3;
                    return;
                }
            case 21680:
                dVar.c(i7);
                dVar.f4305u.f4241o = (int) j;
                return;
            case 21682:
                dVar.c(i7);
                dVar.f4305u.f4243q = (int) j;
                return;
            case 21690:
                dVar.c(i7);
                dVar.f4305u.f4242p = (int) j;
                return;
            case 21930:
                dVar.c(i7);
                dVar.f4305u.f4223U = j == 1;
                return;
            case 21998:
                dVar.c(i7);
                dVar.f4305u.f4233f = (int) j;
                return;
            case 22186:
                dVar.c(i7);
                dVar.f4305u.f4220R = j;
                return;
            case 22203:
                dVar.c(i7);
                dVar.f4305u.f4221S = j;
                return;
            case 25188:
                dVar.c(i7);
                dVar.f4305u.f4218P = (int) j;
                return;
            case 30114:
                dVar.f4275R = j;
                return;
            case 30321:
                dVar.c(i7);
                int i10 = (int) j;
                if (i10 == 0) {
                    dVar.f4305u.f4244r = 0;
                    return;
                }
                if (i10 == 1) {
                    dVar.f4305u.f4244r = 1;
                    return;
                } else if (i10 == 2) {
                    dVar.f4305u.f4244r = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    dVar.f4305u.f4244r = 3;
                    return;
                }
            case 2352003:
                dVar.c(i7);
                dVar.f4305u.f4232e = (int) j;
                return;
            case 2807729:
                dVar.f4302r = j;
                return;
            default:
                switch (i7) {
                    case 21945:
                        dVar.c(i7);
                        int i11 = (int) j;
                        if (i11 == 1) {
                            dVar.f4305u.f4203A = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            dVar.f4305u.f4203A = 1;
                            return;
                        }
                    case 21946:
                        dVar.c(i7);
                        int i12 = (int) j;
                        if (i12 != 1) {
                            if (i12 == 16) {
                                i8 = 6;
                            } else if (i12 == 18) {
                                i8 = 7;
                            } else if (i12 != 6 && i12 != 7) {
                                i8 = -1;
                            }
                        }
                        if (i8 != -1) {
                            dVar.f4305u.f4252z = i8;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.c(i7);
                        dVar.f4305u.f4250x = true;
                        int iA = p156w2.b.a((int) j);
                        if (iA != -1) {
                            dVar.f4305u.f4251y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.c(i7);
                        dVar.f4305u.f4204B = (int) j;
                        return;
                    case 21949:
                        dVar.c(i7);
                        dVar.f4305u.f4205C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean v() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = (Context) this.f15314b;
        if (callingUid == iMyUid) {
            return p097n3.a.E(context);
        }
        if (!p090m3.c.h() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public InputStream w() {
        InputStream inputStream = (InputStream) this.f15314b;
        this.f15314b = null;
        return inputStream;
    }

    public int x(int i7) {
        int i8;
        synchronized (e.class) {
            try {
                WorkDatabase workDatabase = (WorkDatabase) this.f15314b;
                workDatabase.c();
                try {
                    Long lE = workDatabase.j().E("next_job_scheduler_id");
                    i8 = 0;
                    int iIntValue = lE != null ? lE.intValue() : 0;
                    workDatabase.j().I(new p088m1.c("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                    workDatabase.h();
                    workDatabase.f();
                    if (iIntValue < 0 || iIntValue > i7) {
                        ((WorkDatabase) this.f15314b).j().I(new p088m1.c("next_job_scheduler_id", 1));
                    } else {
                        i8 = iIntValue;
                    }
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i8;
    }

    public void y(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        A(3, bundle3);
    }

    public void z() {
        l lVar = (l) this.f15314b;
        int i7 = lVar.f13434I - 1;
        lVar.f13434I = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (p054h2.r rVar : lVar.f13436K) {
            rVar.c();
            i8 += rVar.f13501Z.f10347a;
        }
        e0[] e0VarArr = new e0[i8];
        int i9 = 0;
        for (p054h2.r rVar2 : lVar.f13436K) {
            rVar2.c();
            int i10 = rVar2.f13501Z.f10347a;
            int i11 = 0;
            while (i11 < i10) {
                rVar2.c();
                e0VarArr[i9] = rVar2.f13501Z.a(i11);
                i11++;
                i9++;
            }
        }
        lVar.f13435J = new f0(e0VarArr);
        lVar.f13433H.f(lVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapf
    public void zza(zzapk zzapkVar) {
        ((zzbzf) this.f15314b).zzd(zzapkVar);
    }

    public /* synthetic */ e(Object obj, int i7) {
        this.f15313a = i7;
        this.f15314b = obj;
    }

    public e(ArrayList arrayList) {
        this.f15313a = 20;
        this.f15314b = Collections.unmodifiableList(arrayList);
    }

    public e(UUID uuid, int i7, byte[] bArr) {
        this.f15313a = 6;
        this.f15314b = uuid;
    }

    public e(ContentInfo contentInfo) {
        this.f15313a = 7;
        contentInfo.getClass();
        this.f15314b = B1.k.o(contentInfo);
    }
}
