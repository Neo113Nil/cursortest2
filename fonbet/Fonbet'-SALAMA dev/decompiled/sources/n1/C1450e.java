package n1;

import A1.C0045t0;
import A1.K0;
import A1.RunnableC0032m0;
import B.v;
import C1.C0095a;
import E5.C0197o;
import E5.C0201t;
import G4.InterfaceC0291y;
import G4.S;
import P.InterfaceC0351g;
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
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Window;
import androidx.appcompat.widget.InterfaceC0650m;
import androidx.work.impl.WorkDatabase;
import c2.C0814u;
import c2.X;
import c2.Y;
import c2.e0;
import c2.f0;
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
import d6.C0977k;
import e4.C1029c;
import e4.C1049w;
import f2.C1074f;
import h2.C1190l;
import h2.C1196r;
import i.u;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.sentry.protocol.Device;
import j2.InterfaceC1309f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l4.InterfaceC1390a;
import m.w;
import m1.C1428c;
import n1.C1450e;
import n3.AbstractC1464a;
import org.json.JSONException;
import org.json.JSONObject;
import q5.AbstractActivityC1559c;
import u2.F;
import u2.H;
import u2.K;
import u2.N;
import v2.AbstractC1664a;
import w1.C1759x1;
import w1.C1761y0;
import w1.F0;
import w1.V0;
import w2.C1767b;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1450e implements InterfaceC0291y, zzapf, InterfaceC0351g, W3.h, InterfaceC0650m, F, X, w, InterfaceC1390a, InterfaceC1309f, B3.d, A5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15307a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15308b;

    public /* synthetic */ C1450e(int i7) {
        this.f15307a = i7;
    }

    public static void B(A5.f fVar, final C1450e c1450e) {
        C0201t c0201t = C0201t.f2403f;
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete", c0201t, obj, 1);
        if (c1450e != null) {
            final int i7 = 0;
            f02.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i8 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i8) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i9 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i9) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i10 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i10) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i11 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i11) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken", c0201t, obj, 1);
        if (c1450e != null) {
            final int i8 = 9;
            f03.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i9 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i9) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i10 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i10) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i11 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i11) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential", c0201t, obj, 1);
        if (c1450e != null) {
            final int i9 = 10;
            f04.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i9) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i10 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i10) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i11 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i11) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider", c0201t, obj, 1);
        if (c1450e != null) {
            final int i10 = 11;
            f05.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i11 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i11) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential", c0201t, obj, 1);
        if (c1450e != null) {
            final int i11 = 12;
            f06.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider", c0201t, obj, 1);
        if (c1450e != null) {
            final int i12 = 13;
            f07.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f07.M(null);
        }
        F0 f08 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload", c0201t, obj, 1);
        if (c1450e != null) {
            final int i13 = 1;
            f08.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f08.M(null);
        }
        F0 f09 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification", c0201t, obj, 1);
        if (c1450e != null) {
            final int i14 = 2;
            f09.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f09.M(null);
        }
        F0 f010 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink", c0201t, obj, 1);
        if (c1450e != null) {
            final int i15 = 3;
            f010.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f010.M(null);
        }
        F0 f011 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail", c0201t, obj, 1);
        if (c1450e != null) {
            final int i16 = 4;
            f011.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f011.M(null);
        }
        F0 f012 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword", c0201t, obj, 1);
        if (c1450e != null) {
            final int i17 = 5;
            f012.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f012.M(null);
        }
        F0 f013 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber", c0201t, obj, 1);
        if (c1450e != null) {
            final int i18 = 6;
            f013.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f013.M(null);
        }
        F0 f014 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile", c0201t, obj, 1);
        if (c1450e != null) {
            final int i19 = 7;
            f014.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
            f014.M(null);
        }
        F0 f015 = new F0(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail", c0201t, obj, 1);
        if (c1450e == null) {
            f015.M(null);
        } else {
            final int i20 = 8;
            f015.M(new A5.b(c1450e) { // from class: E5.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1450e f2409b;

                {
                    this.f2409b = c1450e;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v53, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v10, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v14, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v18, types: [e4.c, f4.z] */
                /* JADX WARN: Type inference failed for: r1v22, types: [e4.c, f4.z] */
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    boolean z4;
                    String str;
                    Uri uri;
                    Task task;
                    Task task2;
                    switch (i20) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            C0197o c0197o = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s7 = C1450e.s(c0197o);
                            if (s7 != null) {
                                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(((zzad) s7).f11910c));
                                firebaseAuth.getClass();
                                firebaseAuth.f11853e.zza(s7, new C1049w(firebaseAuth, s7)).addOnCompleteListener(new C0185c(rVar, 17));
                                break;
                            } else {
                                rVar.a(Y4.D.E());
                                break;
                            }
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            C0197o c0197o2 = (C0197o) ((ArrayList) obj2).get(0);
                            r rVar2 = new r(arrayList2, v02, 12);
                            this.f2409b.getClass();
                            FirebaseUser s8 = C1450e.s(c0197o2);
                            if (s8 != null) {
                                s8.m().addOnCompleteListener(new E4.K(2, rVar2, s8));
                                break;
                            } else {
                                rVar2.a(Y4.D.E());
                                break;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            C0197o c0197o3 = (C0197o) arrayList4.get(0);
                            E e7 = (E) arrayList4.get(1);
                            final C0199q c0199q = new C0199q(arrayList3, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s9 = C1450e.s(c0197o3);
                            if (s9 != null) {
                                if (e7 != null) {
                                    final int i82 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new C0977k(2, (Object) s9, (Object) AbstractC1464a.u(e7), false)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i82) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i92 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s9).f11910c)).h(s9, false).continueWithTask(new u1.c(s9, 16)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.k
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i92) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q2 = c0199q;
                                                    if (!isSuccessful) {
                                                        c0199q2.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q2.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q3 = c0199q;
                                                    if (!isSuccessful2) {
                                                        c0199q3.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q3.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q.a(Y4.D.E());
                                break;
                            }
                        case 3:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            C0197o c0197o4 = (C0197o) arrayList6.get(0);
                            String str2 = (String) arrayList6.get(1);
                            r rVar3 = new r(arrayList5, v02, 13);
                            this.f2409b.getClass();
                            FirebaseUser s10 = C1450e.s(c0197o4);
                            if (s10 != null) {
                                com.google.android.gms.common.internal.D.e(str2);
                                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s10).f11910c));
                                firebaseAuth2.getClass();
                                com.google.android.gms.common.internal.D.e(str2);
                                firebaseAuth2.f11853e.zzb(firebaseAuth2.f11849a, s10, str2, new C1029c(firebaseAuth2, 0)).addOnCompleteListener(new C0185c(rVar3, 16));
                                break;
                            } else {
                                rVar3.a(Y4.D.E());
                                break;
                            }
                        case 4:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj2;
                            C0197o c0197o5 = (C0197o) arrayList8.get(0);
                            String str3 = (String) arrayList8.get(1);
                            C0199q c0199q2 = new C0199q(arrayList7, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s11 = C1450e.s(c0197o5);
                            if (s11 != null) {
                                com.google.android.gms.common.internal.D.e(str3);
                                FirebaseAuth firebaseAuth3 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s11).f11910c));
                                firebaseAuth3.getClass();
                                com.google.android.gms.common.internal.D.e(str3);
                                firebaseAuth3.f11853e.zzc(firebaseAuth3.f11849a, s11, str3, new C1029c(firebaseAuth3, 0)).addOnCompleteListener(new C0191i(s11, c0199q2));
                                break;
                            } else {
                                c0199q2.a(Y4.D.E());
                                break;
                            }
                        case 5:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj2;
                            C0197o c0197o6 = (C0197o) arrayList10.get(0);
                            String str4 = (String) arrayList10.get(1);
                            r rVar4 = new r(arrayList9, v02, 7);
                            this.f2409b.getClass();
                            FirebaseUser s12 = C1450e.s(c0197o6);
                            if (s12 != null) {
                                com.google.android.gms.common.internal.D.e(str4);
                                FirebaseAuth firebaseAuth4 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s12).f11910c));
                                firebaseAuth4.getClass();
                                com.google.android.gms.common.internal.D.e(str4);
                                firebaseAuth4.f11853e.zzd(firebaseAuth4.f11849a, s12, str4, new C1029c(firebaseAuth4, 0)).addOnCompleteListener(new C0190h(s12, rVar4));
                                break;
                            } else {
                                rVar4.a(Y4.D.E());
                                break;
                            }
                        case 6:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj2;
                            C0197o c0197o7 = (C0197o) arrayList12.get(0);
                            Map map = (Map) arrayList12.get(1);
                            C0199q c0199q3 = new C0199q(arrayList11, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s13 = C1450e.s(c0197o7);
                            if (s13 != null) {
                                PhoneAuthCredential phoneAuthCredential = (PhoneAuthCredential) AbstractC1464a.v(map);
                                if (phoneAuthCredential != null) {
                                    FirebaseAuth firebaseAuth5 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s13).f11910c));
                                    firebaseAuth5.getClass();
                                    firebaseAuth5.f11853e.zza(firebaseAuth5.f11849a, s13, (PhoneAuthCredential) phoneAuthCredential.clone(), (f4.z) new C1029c(firebaseAuth5, 0)).addOnCompleteListener(new C0189g(s13, c0199q3));
                                    break;
                                } else {
                                    c0199q3.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                c0199q3.a(Y4.D.E());
                                break;
                            }
                        case 7:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj2;
                            boolean z7 = false;
                            C0197o c0197o8 = (C0197o) arrayList14.get(0);
                            S s14 = (S) arrayList14.get(1);
                            r rVar5 = new r(arrayList13, v02, 8);
                            this.f2409b.getClass();
                            FirebaseUser s15 = C1450e.s(c0197o8);
                            if (s15 != null) {
                                if (s14.f2325c.booleanValue()) {
                                    str = s14.f2323a;
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
                                if (s14.f2326d.booleanValue()) {
                                    String str5 = s14.f2324b;
                                    if (str5 == null || (uri = Uri.parse(str5)) == null) {
                                        uri = null;
                                        z7 = true;
                                    }
                                } else {
                                    uri = null;
                                }
                                UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest(str, uri != null ? uri.toString() : null, z4, z7);
                                FirebaseAuth firebaseAuth6 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s15).f11910c));
                                firebaseAuth6.getClass();
                                firebaseAuth6.f11853e.zza(firebaseAuth6.f11849a, s15, userProfileChangeRequest, (f4.z) new C1029c(firebaseAuth6, 0)).addOnCompleteListener(new C0192j(s15, rVar5));
                                break;
                            } else {
                                rVar5.a(Y4.D.E());
                                break;
                            }
                        case 8:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj2;
                            C0197o c0197o9 = (C0197o) arrayList16.get(0);
                            String str6 = (String) arrayList16.get(1);
                            E e8 = (E) arrayList16.get(2);
                            final C0199q c0199q4 = new C0199q(arrayList15, v02, 9);
                            this.f2409b.getClass();
                            FirebaseUser s16 = C1450e.s(c0197o9);
                            if (s16 != null) {
                                if (e8 != null) {
                                    final int i102 = 1;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, AbstractC1464a.u(e8))).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i102) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                } else {
                                    final int i112 = 0;
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s16).f11910c)).h(s16, false).continueWithTask(new C1759x1(s16, str6, null)).addOnCompleteListener(new OnCompleteListener() { // from class: E5.l
                                        @Override // com.google.android.gms.tasks.OnCompleteListener
                                        public final void onComplete(Task task3) {
                                            switch (i112) {
                                                case 0:
                                                    boolean isSuccessful = task3.isSuccessful();
                                                    C0199q c0199q5 = c0199q4;
                                                    if (!isSuccessful) {
                                                        c0199q5.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q5.c();
                                                        break;
                                                    }
                                                default:
                                                    boolean isSuccessful2 = task3.isSuccessful();
                                                    C0199q c0199q6 = c0199q4;
                                                    if (!isSuccessful2) {
                                                        c0199q6.a(Y4.D.L(task3.getException()));
                                                        break;
                                                    } else {
                                                        c0199q6.c();
                                                        break;
                                                    }
                                            }
                                        }
                                    });
                                    break;
                                }
                            } else {
                                c0199q4.a(Y4.D.E());
                                break;
                            }
                        case 9:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj2;
                            C0197o c0197o10 = (C0197o) arrayList18.get(0);
                            Boolean bool = (Boolean) arrayList18.get(1);
                            C0199q c0199q5 = new C0199q(arrayList17, v02, 10);
                            this.f2409b.getClass();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(c0197o10, c0199q5, bool, 5));
                            break;
                        case 10:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj2;
                            C0197o c0197o11 = (C0197o) arrayList20.get(0);
                            Map map2 = (Map) arrayList20.get(1);
                            r rVar6 = new r(arrayList19, v02, 10);
                            this.f2409b.getClass();
                            FirebaseUser s17 = C1450e.s(c0197o11);
                            AuthCredential v6 = AbstractC1464a.v(map2);
                            if (s17 != null) {
                                if (v6 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s17).f11910c)).g(s17, v6).addOnCompleteListener(new C0185c(rVar6, 15));
                                    break;
                                } else {
                                    rVar6.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar6.a(Y4.D.E());
                                break;
                            }
                        case 11:
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = (ArrayList) obj2;
                            C0197o c0197o12 = (C0197o) arrayList22.get(0);
                            M m7 = (M) arrayList22.get(1);
                            C0199q c0199q6 = new C0199q(arrayList21, v02, 11);
                            C1450e c1450e2 = this.f2409b;
                            c1450e2.getClass();
                            FirebaseUser s18 = C1450e.s(c0197o12);
                            com.google.android.gms.common.internal.w F7 = Q0.a.F(m7.f2299a, FirebaseAuth.getInstance());
                            List list = m7.f2300b;
                            Bundle bundle = (Bundle) F7.f11335b;
                            if (list != null) {
                                bundle.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
                            }
                            Map map3 = m7.f2301c;
                            if (map3 != null) {
                                F7.t(map3);
                            }
                            AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) c1450e2.f15308b;
                            s18.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c);
                            FirebaseAuth firebaseAuth7 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s18).f11910c));
                            firebaseAuth7.getClass();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            if (firebaseAuth7.f11867t.f12903b.o(abstractActivityC1559c, taskCompletionSource, firebaseAuth7, s18)) {
                                f4.s.c(abstractActivityC1559c.getApplicationContext(), firebaseAuth7, s18);
                                Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
                                intent.setClass(abstractActivityC1559c, GenericIdpActivity.class);
                                intent.setPackage(abstractActivityC1559c.getPackageName());
                                intent.putExtras(bundle);
                                abstractActivityC1559c.startActivity(intent);
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
                            r rVar7 = new r(arrayList23, v02, 11);
                            this.f2409b.getClass();
                            FirebaseUser s19 = C1450e.s(c0197o13);
                            AuthCredential v7 = AbstractC1464a.v(map4);
                            if (s19 != null) {
                                if (v7 != null) {
                                    FirebaseAuth.getInstance(Y3.i.f(((zzad) s19).f11910c)).o(s19, v7).addOnCompleteListener(new C0185c(rVar7, 14));
                                    break;
                                } else {
                                    rVar7.a(Y4.D.w());
                                    break;
                                }
                            } else {
                                rVar7.a(Y4.D.E());
                                break;
                            }
                        default:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj2;
                            C0197o c0197o14 = (C0197o) arrayList26.get(0);
                            M m8 = (M) arrayList26.get(1);
                            C0199q c0199q7 = new C0199q(arrayList25, v02, 12);
                            C1450e c1450e3 = this.f2409b;
                            c1450e3.getClass();
                            FirebaseUser s20 = C1450e.s(c0197o14);
                            com.google.android.gms.common.internal.w F8 = Q0.a.F(m8.f2299a, FirebaseAuth.getInstance());
                            List list2 = m8.f2300b;
                            Bundle bundle2 = (Bundle) F8.f11335b;
                            if (list2 != null) {
                                bundle2.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list2));
                            }
                            Map map5 = m8.f2301c;
                            if (map5 != null) {
                                F8.t(map5);
                            }
                            AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) c1450e3.f15308b;
                            s20.getClass();
                            com.google.android.gms.common.internal.D.i(abstractActivityC1559c2);
                            FirebaseAuth firebaseAuth8 = FirebaseAuth.getInstance(Y3.i.f(((zzad) s20).f11910c));
                            firebaseAuth8.getClass();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            if (firebaseAuth8.f11867t.f12903b.o(abstractActivityC1559c2, taskCompletionSource2, firebaseAuth8, s20)) {
                                f4.s.c(abstractActivityC1559c2.getApplicationContext(), firebaseAuth8, s20);
                                Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
                                intent2.setClass(abstractActivityC1559c2, GenericIdpActivity.class);
                                intent2.setPackage(abstractActivityC1559c2.getPackageName());
                                intent2.putExtras(bundle2);
                                abstractActivityC1559c2.startActivity(intent2);
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
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(c0197o.f2391a));
        String str = c0197o.f2392b;
        if (str != null) {
            firebaseAuth.e(str);
        }
        return firebaseAuth.f11854f;
    }

    public void A(int i7, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i7;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        ((Messenger) this.f15308b).send(obtain);
    }

    public void C(int i7, long j, long j3) {
        L1.d dVar = (L1.d) this.f15308b;
        AbstractC1664a.i(dVar.f4287b0);
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
                        dVar.f4287b0.m(new F1.n(dVar.f4304t));
                        dVar.f4306v = true;
                        return;
                    }
                }
                return;
            }
        }
        L1.c cVar = new L1.c();
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

    @Override // l4.InterfaceC1390a
    public void Q(String str) {
        ((TaskCompletionSource) this.f15308b).setResult(str);
    }

    @Override // W3.h
    public Object R(String str) {
        return ((W3.j) this.f15308b).d(str, null);
    }

    @Override // l4.InterfaceC1390a
    public void W(String str) {
        ((TaskCompletionSource) this.f15308b).setException(new Exception(str));
    }

    @Override // m.w
    public void a(m.k kVar, boolean z4) {
        u uVar;
        m.k k7 = kVar.k();
        int i7 = 0;
        boolean z7 = k7 != kVar;
        if (z7) {
            kVar = k7;
        }
        i.v vVar = (i.v) this.f15308b;
        u[] uVarArr = vVar.c0;
        int length = uVarArr != null ? uVarArr.length : 0;
        while (true) {
            if (i7 < length) {
                uVar = uVarArr[i7];
                if (uVar != null && uVar.f13736h == kVar) {
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
                vVar.r(uVar.f13729a, uVar, k7);
                vVar.t(uVar, true);
            }
        }
    }

    @Override // c2.X
    public void b(Y y4) {
        C1190l c1190l = (C1190l) this.f15308b;
        c1190l.f13427H.b(c1190l);
    }

    @Override // P.InterfaceC0351g
    public int c() {
        int flags;
        flags = ((ContentInfo) this.f15308b).getFlags();
        return flags;
    }

    @Override // j2.InterfaceC1309f
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // P.InterfaceC0351g
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.f15308b).getClip();
        return clip;
    }

    @Override // u2.F
    public void g(H h6, long j, long j3) {
        N n2 = (N) h6;
        C1074f c1074f = (C1074f) this.f15308b;
        c1074f.getClass();
        long j7 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        c1074f.f12844n.getClass();
        c1074f.f12847q.f(c0814u, n2.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        c1074f.f12835L = ((Long) n2.f16733f).longValue() - j;
        c1074f.s(true);
    }

    @Override // j2.InterfaceC1309f
    public long h(int i7) {
        AbstractC1664a.f(i7 == 0);
        return 0L;
    }

    @Override // u2.F
    public Q1.e i(H h6, IOException iOException, int i7) {
        N n2 = (N) h6;
        C1074f c1074f = (C1074f) this.f15308b;
        c1074f.getClass();
        long j = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        c1074f.f12847q.i(new C0814u(), n2.f16730c, iOException, true);
        c1074f.f12844n.getClass();
        AbstractC1664a.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        c1074f.s(true);
        return K.f16723e;
    }

    @Override // P.InterfaceC0351g
    public ContentInfo j() {
        return (ContentInfo) this.f15308b;
    }

    @Override // P.InterfaceC0351g
    public int k() {
        int source;
        source = ((ContentInfo) this.f15308b).getSource();
        return source;
    }

    @Override // u2.F
    public void l(H h6, long j, long j3, boolean z4) {
        N n2 = (N) h6;
        C1074f c1074f = (C1074f) this.f15308b;
        c1074f.getClass();
        long j7 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        c1074f.f12844n.getClass();
        c1074f.f12847q.d(c0814u, n2.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // j2.InterfaceC1309f
    public List m(long j) {
        return j >= 0 ? (List) this.f15308b : Collections.emptyList();
    }

    @Override // m.w
    public boolean n(m.k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        i.v vVar = (i.v) this.f15308b;
        if (!vVar.f13770W || (callback = vVar.f13750C.getCallback()) == null || vVar.f13780h0) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x026c, code lost:
    
        throw A1.C0045t0.a(null, "EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i7, int i8, F1.h hVar) {
        L1.c cVar;
        L1.c cVar2;
        L1.c cVar3;
        long j;
        int i9;
        int i10;
        int i11;
        L1.d dVar = (L1.d) this.f15308b;
        SparseArray sparseArray = dVar.f4288c;
        int i12 = 4;
        int i13 = 0;
        int i14 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (dVar.f4264G != 2) {
                    return;
                }
                L1.c cVar4 = (L1.c) sparseArray.get(dVar.f4270M);
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
                L1.c cVar5 = dVar.f4305u;
                int i15 = cVar5.f4234g;
                if (i15 != 1685485123 && i15 != 1685480259) {
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
                L1.c cVar6 = dVar.f4305u;
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
                L1.c cVar7 = dVar.f4305u;
                byte[] bArr4 = new byte[i8];
                cVar7.f4237k = bArr4;
                hVar.a(bArr4, 0, i8, false);
                return;
            }
            if (i7 != 30322) {
                throw C0045t0.a(null, "Unexpected id: " + i7);
            }
            dVar.c(i7);
            L1.c cVar8 = dVar.f4305u;
            byte[] bArr5 = new byte[i8];
            cVar8.f4248v = bArr5;
            hVar.a(bArr5, 0, i8, false);
            return;
        }
        int i16 = dVar.f4264G;
        C0095a c0095a3 = dVar.f4292g;
        if (i16 == 0) {
            L1.e eVar = dVar.f4286b;
            dVar.f4270M = (int) eVar.c(hVar, false, true, 8);
            dVar.f4271N = eVar.f4314c;
            dVar.f4266I = -9223372036854775807L;
            dVar.f4264G = 1;
            c0095a3.A(0);
        }
        L1.c cVar9 = (L1.c) sparseArray.get(dVar.f4270M);
        if (cVar9 == null) {
            hVar.q(i8 - dVar.f4271N);
            dVar.f4264G = 0;
            return;
        }
        cVar9.f4226X.getClass();
        if (dVar.f4264G == 1) {
            dVar.i(hVar, 3);
            int i17 = (((byte[]) c0095a3.f1465c)[2] & 6) >> 1;
            byte b7 = 255;
            if (i17 == 0) {
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
                int i18 = (((byte[]) c0095a3.f1465c)[3] & 255) + 1;
                dVar.f4268K = i18;
                int[] iArr2 = dVar.f4269L;
                if (iArr2 == null) {
                    iArr2 = new int[i18];
                } else if (iArr2.length < i18) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i18)];
                }
                dVar.f4269L = iArr2;
                if (i17 == 2) {
                    int i19 = (i8 - dVar.f4271N) - 4;
                    int i20 = dVar.f4268K;
                    Arrays.fill(iArr2, 0, i20, i19 / i20);
                } else if (i17 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        i9 = dVar.f4268K - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        dVar.f4269L[i21] = 0;
                        while (true) {
                            i10 = i12 + 1;
                            dVar.i(hVar, i10);
                            int i23 = ((byte[]) c0095a3.f1465c)[i12] & 255;
                            int[] iArr3 = dVar.f4269L;
                            i11 = iArr3[i21] + i23;
                            iArr3[i21] = i11;
                            if (i23 != 255) {
                                break;
                            } else {
                                i12 = i10;
                            }
                        }
                        i22 += i11;
                        i21++;
                        i12 = i10;
                    }
                    dVar.f4269L[i9] = ((i8 - dVar.f4271N) - i12) - i22;
                } else {
                    if (i17 != 3) {
                        throw C0045t0.a(null, "Unexpected lacing value: " + i17);
                    }
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        int i26 = dVar.f4268K - i14;
                        if (i24 >= i26) {
                            cVar2 = cVar9;
                            dVar.f4269L[i26] = ((i8 - dVar.f4271N) - i12) - i25;
                            break;
                        }
                        dVar.f4269L[i24] = i13;
                        int i27 = i12 + 1;
                        dVar.i(hVar, i27);
                        if (((byte[]) c0095a3.f1465c)[i12] == 0) {
                            throw C0045t0.a(null, "No valid varint length mask found");
                        }
                        int i28 = i13;
                        while (true) {
                            if (i28 >= 8) {
                                cVar3 = cVar9;
                                j = 0;
                                i12 = i27;
                                break;
                            }
                            int i29 = i14 << (7 - i28);
                            if ((((byte[]) c0095a3.f1465c)[i12] & i29) != 0) {
                                int i30 = i27 + i28;
                                dVar.i(hVar, i30);
                                L1.c cVar10 = cVar9;
                                j = ((byte[]) c0095a3.f1465c)[i12] & b7 & (~i29);
                                while (i27 < i30) {
                                    j = (j << 8) | (((byte[]) c0095a3.f1465c)[i27] & 255);
                                    i27++;
                                    cVar10 = cVar10;
                                }
                                cVar3 = cVar10;
                                if (i24 > 0) {
                                    j -= (1 << ((i28 * 7) + 6)) - 1;
                                }
                                i12 = i30;
                            } else {
                                i28++;
                                b7 = 255;
                                i14 = 1;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i31 = (int) j;
                        int[] iArr4 = dVar.f4269L;
                        if (i24 != 0) {
                            i31 += iArr4[i24 - 1];
                        }
                        iArr4[i24] = i31;
                        i25 += i31;
                        i24++;
                        cVar9 = cVar3;
                        b7 = 255;
                        i13 = 0;
                        i14 = 1;
                    }
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = (byte[]) c0095a3.f1465c;
            dVar.f4265H = dVar.k((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f4259B;
            cVar = cVar2;
            dVar.f4272O = (cVar.f4231d == 2 || (i7 == 163 && (((byte[]) c0095a3.f1465c)[2] & 128) == 128)) ? 1 : 0;
            dVar.f4264G = 2;
            dVar.f4267J = 0;
        } else {
            cVar = cVar9;
        }
        if (i7 == 163) {
            while (true) {
                int i32 = dVar.f4267J;
                if (i32 >= dVar.f4268K) {
                    dVar.f4264G = 0;
                    return;
                }
                dVar.d(cVar, ((dVar.f4267J * cVar.f4232e) / zzbbd.zzq.zzf) + dVar.f4265H, dVar.f4272O, dVar.l(hVar, cVar, dVar.f4269L[i32], false), 0);
                dVar.f4267J++;
                cVar = cVar;
            }
        } else {
            L1.c cVar11 = cVar;
            while (true) {
                int i33 = dVar.f4267J;
                if (i33 >= dVar.f4268K) {
                    return;
                }
                int[] iArr5 = dVar.f4269L;
                iArr5[i33] = dVar.l(hVar, cVar11, iArr5[i33], true);
                dVar.f4267J++;
            }
        }
    }

    @Override // B3.d
    public void onConsentInfoUpdateFailure(B3.i iVar) {
        String valueOf = String.valueOf(iVar.f1067a);
        String str = iVar.f1068b;
        y1.a aVar = (y1.a) this.f15308b;
        aVar.getClass();
        try {
            aVar.f18129c.error(valueOf, str, "");
        } catch (Exception unused) {
        }
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        switch (this.f15307a) {
            case 25:
                com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f15308b;
                if (((C1761y0) wVar.f11336c) != null) {
                    String str = oVar.f676a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((A5.p) rVar).notImplemented();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) oVar.f677b;
                        try {
                            ((A5.p) rVar).success(((C1761y0) wVar.f11336c).f(jSONObject.getString("key"), jSONObject.has(Device.JsonKeys.LOCALE) ? jSONObject.getString(Device.JsonKeys.LOCALE) : null));
                            break;
                        } catch (JSONException e7) {
                            ((A5.p) rVar).error("error", e7.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            default:
                com.google.android.gms.common.internal.w wVar2 = (com.google.android.gms.common.internal.w) this.f15308b;
                if (((D5.a) wVar2.f11336c) != null) {
                    String str2 = oVar.f676a;
                    Object obj = oVar.f677b;
                    str2.getClass();
                    if (str2.equals("ProcessText.processTextAction")) {
                        try {
                            ArrayList arrayList = (ArrayList) obj;
                            ((D5.a) wVar2.f11336c).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (A5.p) rVar);
                            break;
                        } catch (IllegalStateException e8) {
                            ((A5.p) rVar).error("error", e8.getMessage(), null);
                        }
                    } else if (!str2.equals("ProcessText.queryTextActions")) {
                        ((A5.p) rVar).notImplemented();
                        break;
                    } else {
                        try {
                            ((A5.p) rVar).success(((D5.a) wVar2.f11336c).b());
                            break;
                        } catch (IllegalStateException e9) {
                            ((A5.p) rVar).error("error", e9.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // j2.InterfaceC1309f
    public int p() {
        return 1;
    }

    public ApplicationInfo q(int i7, String str) {
        return ((Context) this.f15308b).getPackageManager().getApplicationInfo(str, i7);
    }

    public CharSequence r(String str) {
        Context context = (Context) this.f15308b;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @Override // G4.InterfaceC0291y
    public void run() {
        ((S) this.f15308b).H(new K0(this, 6), "build overlays");
    }

    public PackageInfo t(int i7, String str) {
        return ((Context) this.f15308b).getPackageManager().getPackageInfo(str, i7);
    }

    public String toString() {
        switch (this.f15307a) {
            case 7:
                return "ContentInfoCompat{" + ((ContentInfo) this.f15308b) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i7, long j) {
        L1.d dVar = (L1.d) this.f15308b;
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
                        int a2 = C1767b.a((int) j);
                        if (a2 != -1) {
                            dVar.f4305u.f4251y = a2;
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
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = (Context) this.f15308b;
        if (callingUid == myUid) {
            return AbstractC1464a.E(context);
        }
        if (!m3.c.h() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    public InputStream w() {
        InputStream inputStream = (InputStream) this.f15308b;
        this.f15308b = null;
        return inputStream;
    }

    public int x(int i7) {
        WorkDatabase workDatabase;
        int i8;
        synchronized (C1450e.class) {
            try {
                workDatabase = (WorkDatabase) this.f15308b;
                workDatabase.c();
                Long E7 = workDatabase.j().E("next_job_scheduler_id");
                int intValue = E7 != null ? E7.intValue() : 0;
                workDatabase.j().I(new C1428c("next_job_scheduler_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
                i8 = (intValue >= 0 && intValue <= i7) ? intValue : 0;
                ((WorkDatabase) this.f15308b).j().I(new C1428c("next_job_scheduler_id", 1));
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i8;
    }

    public void y(String str, List list, Bundle bundle, Bundle bundle2) {
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
        C1190l c1190l = (C1190l) this.f15308b;
        int i7 = c1190l.f13428I - 1;
        c1190l.f13428I = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (C1196r c1196r : c1190l.f13430K) {
            c1196r.c();
            i8 += c1196r.f13495Z.f10347a;
        }
        e0[] e0VarArr = new e0[i8];
        int i9 = 0;
        for (C1196r c1196r2 : c1190l.f13430K) {
            c1196r2.c();
            int i10 = c1196r2.f13495Z.f10347a;
            int i11 = 0;
            while (i11 < i10) {
                c1196r2.c();
                e0VarArr[i9] = c1196r2.f13495Z.a(i11);
                i11++;
                i9++;
            }
        }
        c1190l.f13429J = new f0(e0VarArr);
        c1190l.f13427H.f(c1190l);
    }

    @Override // com.google.android.gms.internal.ads.zzapf
    public void zza(zzapk zzapkVar) {
        ((zzbzf) this.f15308b).zzd(zzapkVar);
    }

    public /* synthetic */ C1450e(Object obj, int i7) {
        this.f15307a = i7;
        this.f15308b = obj;
    }

    public C1450e(ArrayList arrayList) {
        this.f15307a = 20;
        this.f15308b = Collections.unmodifiableList(arrayList);
    }

    public C1450e(UUID uuid, int i7, byte[] bArr) {
        this.f15307a = 6;
        this.f15308b = uuid;
    }

    public C1450e(ContentInfo contentInfo) {
        this.f15307a = 7;
        contentInfo.getClass();
        this.f15308b = B1.k.o(contentInfo);
    }
}
