package A1;

import B4.C0070n;
import B4.C0072p;
import C1.C0101g;
import E5.C0185c;
import E5.C0195m;
import E5.C0199q;
import E5.InterfaceC0204w;
import G4.C0271d;
import G4.C0272e;
import G4.C0274g;
import G4.InterfaceC0268a;
import G4.InterfaceC0273f;
import R5.C0405a;
import R5.C0407c;
import R5.C0412h;
import R5.C0420p;
import R5.C0421q;
import Y4.C0587n;
import a.AbstractC0603a;
import android.content.Context;
import android.util.Log;
import c2.C0814u;
import c2.C0819z;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.firestore.FirebaseFirestore;
import e4.AbstractC1037k;
import e4.C1028b;
import e4.C1040n;
import e4.C1041o;
import f4.C1091c;
import f4.InterfaceC1090b;
import g4.C1144q;
import g4.C1145r;
import g4.InterfaceC1131d;
import j2.C1306c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k4.AbstractC1341c;
import w1.P2;
import w1.V0;

/* renamed from: A1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0042s implements D3.q, v2.e, Continuation, N4.a, A5.b, L4.p, F1.c, InterfaceC1131d, D3.g, R1.v, A5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f550b;

    public /* synthetic */ C0042s(B1.a aVar, C0814u c0814u, C0819z c0819z, IOException iOException, boolean z4) {
        this.f549a = 9;
        this.f550b = c0819z;
    }

    @Override // R1.v
    public int a(Object obj) {
        try {
            return ((R1.m) obj).c((X) this.f550b) ? 1 : 0;
        } catch (R1.t unused) {
            return -1;
        }
    }

    @Override // D3.g
    public Object apply(Object obj) {
        N1.q qVar = (N1.q) obj;
        ((N1.j) this.f550b).getClass();
        return qVar;
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        f4.u uVar;
        C4.d dVar = (C4.d) this.f550b;
        synchronized (dVar) {
            dVar.f1575d = (InterfaceC1090b) bVar.get();
            dVar.b0();
            InterfaceC1090b interfaceC1090b = dVar.f1575d;
            C4.c cVar = dVar.f1574c;
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1090b;
            CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f11851c;
            copyOnWriteArrayList.add(cVar);
            synchronized (firebaseAuth) {
                try {
                    if (firebaseAuth.f11871x == null) {
                        Y3.i iVar = firebaseAuth.f11849a;
                        com.google.android.gms.common.internal.D.i(iVar);
                        firebaseAuth.f11871x = new f4.u(iVar);
                    }
                    uVar = firebaseAuth.f11871x;
                } catch (Throwable th) {
                    throw th;
                }
            }
            uVar.a(copyOnWriteArrayList.size());
        }
    }

    @Override // F1.c
    public long c(long j) {
        return v2.t.k((j * r0.f2553e) / 1000000, 0L, ((F1.o) this.f550b).j - 1);
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        return new M4.d((Context) c1145r.a(Context.class), ((Y3.i) c1145r.a(Y3.i.class)).g(), c1145r.b(C1144q.a(M4.e.class)), c1145r.d(R4.b.class), (Executor) c1145r.f((C1144q) this.f550b));
    }

    @Override // A5.c
    public void f(Object obj) {
        boolean z4 = obj instanceof List;
        long j = ((C0412h) this.f550b).f6168a;
        if (!z4) {
            AbstractC0603a.h(new C0405a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            Object obj2 = list.get(0);
            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
            AbstractC0603a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
        }
    }

    @Override // D3.q
    public Object get() {
        InterfaceC0273f interfaceC0273f;
        switch (this.f549a) {
            case 0:
                return (C0033n) this.f550b;
            case 1:
                return (C0037p) this.f550b;
            case 8:
                return Boolean.valueOf(((U) this.f550b).f252P);
            default:
                C0272e c0272e = (C0272e) this.f550b;
                C0271d c0271d = c0272e.f2972c;
                InterfaceC0273f interfaceC0273f2 = c0271d.f2967b.f2992b;
                HashSet hashSet = new HashSet();
                int i7 = c0272e.f2974e;
                int i8 = i7;
                while (i8 > 0) {
                    String z4 = interfaceC0273f2.z();
                    if (z4 != null && !hashSet.contains(z4)) {
                        Q0.a.v(1, "IndexBackfiller", "Processing collection: %s", z4);
                        InterfaceC0273f interfaceC0273f3 = c0271d.f2967b.f2992b;
                        k1.g gVar = c0272e.f2973d.f2967b.f2996f;
                        H4.b O7 = interfaceC0273f3.O(z4);
                        Map v6 = ((G4.D) gVar.f14674a).v(z4, O7, i8);
                        HashMap i9 = i8 - v6.size() > 0 ? ((InterfaceC0268a) gVar.f14676c).i(O7.f3307c, i8 - v6.size(), z4) : new HashMap();
                        int i10 = -1;
                        for (I4.d dVar : i9.values()) {
                            C0272e c0272e2 = c0272e;
                            C0271d c0271d2 = c0271d;
                            if (v6.containsKey(dVar.f3665b.f3670a)) {
                                interfaceC0273f = interfaceC0273f2;
                            } else {
                                I4.h hVar = dVar.f3665b;
                                interfaceC0273f = interfaceC0273f2;
                                boolean z7 = hVar instanceof I4.m;
                                H4.h hVar2 = hVar.f3670a;
                                v6.put(hVar2, z7 ? ((G4.D) gVar.f14674a).y(hVar2) : H4.k.g(hVar2));
                            }
                            i10 = Math.max(i10, dVar.f3664a);
                            c0271d = c0271d2;
                            c0272e = c0272e2;
                            interfaceC0273f2 = interfaceC0273f;
                        }
                        C0272e c0272e3 = c0272e;
                        C0271d c0271d3 = c0271d;
                        InterfaceC0273f interfaceC0273f4 = interfaceC0273f2;
                        gVar.L(i9, v6.keySet());
                        C0274g a2 = C0274g.a(i10, gVar.n(v6, i9, Collections.emptySet()));
                        AbstractC1341c abstractC1341c = a2.f2976b;
                        interfaceC0273f3.e(abstractC1341c);
                        Iterator it = abstractC1341c.iterator();
                        H4.b bVar = O7;
                        while (it.hasNext()) {
                            H4.b b7 = H4.b.b((H4.k) ((Map.Entry) it.next()).getValue());
                            if (b7.compareTo(bVar) > 0) {
                                bVar = b7;
                            }
                        }
                        H4.b bVar2 = new H4.b(bVar.f3305a, bVar.f3306b, Math.max(a2.f2975a, O7.f3307c));
                        Q0.a.v(1, "IndexBackfiller", "Updating offset: %s", bVar2);
                        interfaceC0273f3.u(z4, bVar2);
                        i8 -= abstractC1341c.size();
                        hashSet.add(z4);
                        c0271d = c0271d3;
                        c0272e = c0272e3;
                        interfaceC0273f2 = interfaceC0273f4;
                    }
                    return Integer.valueOf(i7 - i8);
                }
                return Integer.valueOf(i7 - i8);
        }
    }

    @Override // A5.b
    public void i(Object obj, V0 v02) {
        Task<AuthResult> zza;
        List w02;
        switch (this.f549a) {
            case 17:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                String str = (String) arrayList2.get(0);
                E5.L l7 = (E5.L) arrayList2.get(1);
                String str2 = (String) arrayList2.get(2);
                C0199q c0199q = new C0199q(arrayList, v02, 14);
                ((C0195m) ((InterfaceC0204w) this.f550b)).getClass();
                MultiFactorResolver multiFactorResolver = (MultiFactorResolver) C0195m.f2388c.get(str);
                if (multiFactorResolver == null) {
                    c0199q.a(Y4.D.L(new Exception("Resolver not found")));
                    return;
                }
                Object c1040n = l7 != null ? new C1040n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)) : (AbstractC1037k) C0195m.f2389d.get(str2);
                zzaj zzajVar = (zzaj) multiFactorResolver;
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzajVar.f11921c));
                firebaseAuth.getClass();
                com.google.android.gms.common.internal.D.i(c1040n);
                zzao zzaoVar = zzajVar.f11920b;
                com.google.android.gms.common.internal.D.i(zzaoVar);
                boolean z4 = c1040n instanceof C1040n;
                zzad zzadVar = zzajVar.f11923e;
                if (z4) {
                    String str3 = zzaoVar.f11926b;
                    com.google.android.gms.common.internal.D.e(str3);
                    zza = firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar, (C1040n) c1040n, str3, new C1028b(firebaseAuth));
                } else {
                    if (!(c1040n instanceof C1041o)) {
                        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
                    }
                    String str4 = zzaoVar.f11926b;
                    com.google.android.gms.common.internal.D.e(str4);
                    zza = firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar, (C1041o) c1040n, str4, firebaseAuth.f11858k, new C1028b(firebaseAuth));
                }
                zza.continueWithTask(new C1091c(zzajVar, 2)).addOnCompleteListener(new C0185c(c0199q, 19));
                return;
            default:
                C0421q c0421q = (C0421q) this.f550b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0407c) c0421q.f6203a.f3679c).a(((Long) obj2).longValue(), new C0420p(c0421q));
                    w02 = Y4.D.D(null);
                } catch (Throwable th) {
                    w02 = AbstractC0603a.w0(th);
                }
                v02.f(w02);
                return;
        }
    }

    @Override // v2.e
    public void invoke(Object obj) {
        switch (this.f549a) {
            case 2:
                ((z0) obj).d((C0026j0) this.f550b);
                break;
            case 3:
                ((z0) obj).e((C0101g) this.f550b);
                break;
            case 4:
                ((z0) obj).t((C1306c) this.f550b);
                break;
            case 5:
                ((z0) obj).d(((K) this.f550b).f109a.f137L);
                break;
            case 6:
                ((z0) obj).q((Metadata) this.f550b);
                break;
            case 7:
                ((z0) obj).x((C0039q) this.f550b);
                break;
            case 8:
            default:
                B1.n nVar = (B1.n) ((B1.b) obj);
                int i7 = nVar.f1040x;
                D1.e eVar = (D1.e) this.f550b;
                nVar.f1040x = i7 + eVar.f1691g;
                nVar.f1041y += eVar.f1689e;
                break;
            case 9:
                B1.n nVar2 = (B1.n) ((B1.b) obj);
                nVar2.getClass();
                nVar2.f1038v = ((C0819z) this.f550b).f10426a;
                break;
            case 10:
                ((B1.n) ((B1.b) obj)).f1030n = (r) this.f550b;
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        H4.n nVar;
        switch (this.f549a) {
            case 12:
                C0070n c0070n = (C0070n) this.f550b;
                c0070n.getClass();
                H4.k kVar = (H4.k) task.getResult();
                return new C0072p(c0070n.f1180b, c0070n.f1179a, kVar, true, kVar != null && kVar.c());
            case 13:
                B4.Z z4 = (B4.Z) this.f550b;
                E4.C c3 = z4.f1135a;
                FirebaseFirestore firebaseFirestore = z4.f1136b;
                return new B4.c0(new B4.Z(c3, firebaseFirestore), (E4.O) task.getResult(), firebaseFirestore);
            case 14:
                B4.h0 h0Var = (B4.h0) this.f550b;
                h0Var.getClass();
                if (!task.isSuccessful()) {
                    throw task.getException();
                }
                List list = (List) task.getResult();
                if (list.size() != 1) {
                    p3.f.F("Mismatch in docs returned from document lookup.", new Object[0]);
                    throw null;
                }
                H4.k kVar2 = (H4.k) list.get(0);
                boolean d7 = kVar2.d();
                FirebaseFirestore firebaseFirestore2 = h0Var.f1161b;
                if (d7) {
                    return new C0072p(firebaseFirestore2, kVar2.f3323a, kVar2, false, false);
                }
                if (kVar2.e()) {
                    return new C0072p(firebaseFirestore2, kVar2.f3323a, null, false, false);
                }
                p3.f.F(e1.k.h(new StringBuilder("BatchGetDocumentsRequest returned unexpected document type: "), H4.k.class), new Object[0]);
                throw null;
            case 16:
                E4.J j = (E4.J) this.f550b;
                j.getClass();
                if (task.isSuccessful()) {
                    for (H4.k kVar3 : (List) task.getResult()) {
                        if (kVar3.d()) {
                            nVar = kVar3.f3325c;
                        } else {
                            if (!kVar3.e()) {
                                p3.f.F("Unexpected document type in transaction: " + kVar3, new Object[0]);
                                throw null;
                            }
                            nVar = H4.n.f3332b;
                        }
                        HashMap hashMap = j.f2133b;
                        H4.h hVar = kVar3.f3323a;
                        if (!hashMap.containsKey(hVar)) {
                            hashMap.put(hVar, nVar);
                        } else if (!((H4.n) hashMap.get(hVar)).equals(kVar3.f3325c)) {
                            throw new B4.I("Document version changed between two reads.", B4.H.ABORTED);
                        }
                    }
                }
                return task;
            case 22:
                K4.j jVar = (K4.j) this.f550b;
                jVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof B4.I) && ((B4.I) task.getException()).f1098a == B4.H.UNAUTHENTICATED) {
                        K4.r rVar = jVar.f4026c;
                        rVar.f4054b.a0();
                        rVar.f4055c.Z();
                    }
                    throw task.getException();
                }
                C0587n c0587n = (C0587n) task.getResult();
                H4.n n2 = P2.n(c0587n.v());
                int y4 = c0587n.y();
                ArrayList arrayList = new ArrayList(y4);
                for (int i7 = 0; i7 < y4; i7++) {
                    arrayList.add(P2.l(c0587n.x(i7), n2));
                }
                return arrayList;
            default:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f550b;
                if (isSuccessful) {
                    taskCompletionSource.setResult(task.getResult());
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
        }
    }

    public /* synthetic */ C0042s(B1.a aVar, Object obj, int i7) {
        this.f549a = i7;
        this.f550b = obj;
    }

    public /* synthetic */ C0042s(Object obj, int i7) {
        this.f549a = i7;
        this.f550b = obj;
    }
}
