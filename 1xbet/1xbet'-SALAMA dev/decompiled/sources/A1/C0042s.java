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
import android.content.Context;
import android.util.Log;
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
import p018c2.C0774u;
import p018c2.C0779z;
import p042f4.C0894c;
import p042f4.InterfaceC0893b;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: renamed from: A1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0042s implements D3.q, p151v2.e, Continuation, N4.a, A5.b, L4.p, F1.c, p048g4.d, D3.g, R1.v, A5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f550b;

    public /* synthetic */ C0042s(B1.a aVar, C0774u c0774u, C0779z c0779z, IOException iOException, boolean z4) {
        this.f549a = 9;
        this.f550b = c0779z;
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
        p042f4.u uVar;
        C4.d dVar = (C4.d) this.f550b;
        synchronized (dVar) {
            dVar.f1575d = (InterfaceC0893b) bVar.get();
            dVar.b0();
            InterfaceC0893b interfaceC0893b = dVar.f1575d;
            C4.c cVar = dVar.f1574c;
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0893b;
            CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f11851c;
            copyOnWriteArrayList.add(cVar);
            synchronized (firebaseAuth) {
                try {
                    if (firebaseAuth.f11871x == null) {
                        Y3.i iVar = firebaseAuth.f11849a;
                        com.google.android.gms.common.internal.D.i(iVar);
                        firebaseAuth.f11871x = new p042f4.u(iVar);
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
        F1.o oVar = (F1.o) this.f550b;
        return p151v2.t.k((j * ((long) oVar.f2553e)) / 1000000, 0L, oVar.j - 1);
    }

    @Override // p048g4.d
    public Object e(p048g4.r rVar) {
        return new M4.d((Context) rVar.a(Context.class), ((Y3.i) rVar.a(Y3.i.class)).g(), rVar.b(p048g4.q.a(M4.e.class)), rVar.d(R4.b.class), (Executor) rVar.f((p048g4.q) this.f550b));
    }

    @Override // A5.c
    public void f(Object obj) {
        boolean z4 = obj instanceof List;
        long j = ((C0412h) this.f550b).f6168a;
        if (!z4) {
            p003a.a.h(new C0405a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""));
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            Object obj2 = list.get(0);
            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
            p003a.a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
            Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j);
        }
    }

    @Override // D3.q
    public Object get() {
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
                InterfaceC0273f interfaceC0273f = c0271d.f2967b.f2992b;
                HashSet hashSet = new HashSet();
                int i7 = c0272e.f2974e;
                int size = i7;
                while (size > 0) {
                    String strZ = interfaceC0273f.z();
                    if (strZ == null || hashSet.contains(strZ)) {
                        return Integer.valueOf(i7 - size);
                    }
                    Q0.a.v(1, "IndexBackfiller", "Processing collection: %s", strZ);
                    InterfaceC0273f interfaceC0273f2 = c0271d.f2967b.f2992b;
                    p072k1.g gVar = c0272e.f2973d.f2967b.f2996f;
                    H4.b bVarO = interfaceC0273f2.O(strZ);
                    Map mapV = ((G4.D) gVar.f14680a).v(strZ, bVarO, size);
                    HashMap mapI = size - mapV.size() > 0 ? ((InterfaceC0268a) gVar.f14682c).i(bVarO.f3307c, size - mapV.size(), strZ) : new HashMap();
                    int iMax = -1;
                    for (I4.d dVar : mapI.values()) {
                        C0272e c0272e2 = c0272e;
                        C0271d c0271d2 = c0271d;
                        if (!mapV.containsKey(dVar.f3665b.f3670a)) {
                            I4.h hVar = dVar.f3665b;
                            boolean z4 = hVar instanceof I4.m;
                            H4.h hVar2 = hVar.f3670a;
                            mapV.put(hVar2, z4 ? ((G4.D) gVar.f14680a).y(hVar2) : H4.k.g(hVar2));
                        }
                        iMax = Math.max(iMax, dVar.f3664a);
                        c0271d = c0271d2;
                        c0272e = c0272e2;
                        interfaceC0273f = interfaceC0273f;
                    }
                    C0272e c0272e3 = c0272e;
                    C0271d c0271d3 = c0271d;
                    InterfaceC0273f interfaceC0273f3 = interfaceC0273f;
                    gVar.L(mapI, mapV.keySet());
                    C0274g c0274gA = C0274g.a(iMax, gVar.n(mapV, mapI, Collections.emptySet()));
                    p075k4.c cVar = c0274gA.f2976b;
                    interfaceC0273f2.e(cVar);
                    Iterator it = cVar.iterator();
                    H4.b bVar = bVarO;
                    while (it.hasNext()) {
                        H4.b bVarB = H4.b.b((H4.k) ((Map.Entry) it.next()).getValue());
                        if (bVarB.compareTo(bVar) > 0) {
                            bVar = bVarB;
                        }
                    }
                    H4.b bVar2 = new H4.b(bVar.f3305a, bVar.f3306b, Math.max(c0274gA.f2975a, bVarO.f3307c));
                    Q0.a.v(1, "IndexBackfiller", "Updating offset: %s", bVar2);
                    interfaceC0273f2.u(strZ, bVar2);
                    size -= cVar.size();
                    hashSet.add(strZ);
                    c0271d = c0271d3;
                    c0272e = c0272e3;
                    interfaceC0273f = interfaceC0273f3;
                }
                return Integer.valueOf(i7 - size);
        }
    }

    @Override // A5.b
    public void i(Object obj, V0 v6) {
        Task<AuthResult> taskZza;
        List listW0;
        switch (this.f549a) {
            case 17:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                String str = (String) arrayList2.get(0);
                E5.L l7 = (E5.L) arrayList2.get(1);
                String str2 = (String) arrayList2.get(2);
                C0199q c0199q = new C0199q(arrayList, v6, 14);
                ((C0195m) ((InterfaceC0204w) this.f550b)).getClass();
                MultiFactorResolver multiFactorResolver = (MultiFactorResolver) C0195m.f2388c.get(str);
                if (multiFactorResolver == null) {
                    c0199q.a(Y4.D.L(new Exception("Resolver not found")));
                    return;
                }
                Object nVar = l7 != null ? new p034e4.n(PhoneAuthCredential.n(l7.f2297a, l7.f2298b)) : (p034e4.k) C0195m.f2389d.get(str2);
                zzaj zzajVar = (zzaj) multiFactorResolver;
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(Y3.i.f(zzajVar.f11921c));
                firebaseAuth.getClass();
                com.google.android.gms.common.internal.D.i(nVar);
                zzao zzaoVar = zzajVar.f11920b;
                com.google.android.gms.common.internal.D.i(zzaoVar);
                boolean z4 = nVar instanceof p034e4.n;
                zzad zzadVar = zzajVar.f11923e;
                if (z4) {
                    String str3 = zzaoVar.f11926b;
                    com.google.android.gms.common.internal.D.e(str3);
                    taskZza = firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar, (p034e4.n) nVar, str3, new p034e4.b(firebaseAuth));
                } else {
                    if (!(nVar instanceof p034e4.o)) {
                        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
                    }
                    String str4 = zzaoVar.f11926b;
                    com.google.android.gms.common.internal.D.e(str4);
                    taskZza = firebaseAuth.f11853e.zza(firebaseAuth.f11849a, zzadVar, (p034e4.o) nVar, str4, firebaseAuth.f11858k, new p034e4.b(firebaseAuth));
                }
                taskZza.continueWithTask(new C0894c(zzajVar, 2)).addOnCompleteListener(new C0185c(c0199q, 19));
                return;
            default:
                C0421q c0421q = (C0421q) this.f550b;
                t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                t6.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0407c) c0421q.f6203a.f3679c).a(((Long) obj2).longValue(), new C0420p(c0421q));
                    listW0 = Y4.D.D(null);
                    break;
                } catch (Throwable th) {
                    listW0 = p003a.a.w0(th);
                }
                v6.f(listW0);
                return;
        }
    }

    @Override // p151v2.e
    public void invoke(Object obj) {
        switch (this.f549a) {
            case 2:
                ((z0) obj).d((C0026j0) this.f550b);
                break;
            case 3:
                ((z0) obj).e((C0101g) this.f550b);
                break;
            case 4:
                ((z0) obj).t((p068j2.c) this.f550b);
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
                nVar2.f1038v = ((C0779z) this.f550b).f10426a;
                break;
            case 10:
                ((B1.n) ((B1.b) obj)).f1030n = (r) this.f550b;
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
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
                    p113p3.f.F("Mismatch in docs returned from document lookup.", new Object[0]);
                    throw null;
                }
                H4.k kVar2 = (H4.k) list.get(0);
                boolean zD = kVar2.d();
                FirebaseFirestore firebaseFirestore2 = h0Var.f1161b;
                if (zD) {
                    return new C0072p(firebaseFirestore2, kVar2.f3323a, kVar2, false, false);
                }
                if (kVar2.e()) {
                    return new C0072p(firebaseFirestore2, kVar2.f3323a, null, false, false);
                }
                p113p3.f.F(p031e1.k.h(new StringBuilder("BatchGetDocumentsRequest returned unexpected document type: "), H4.k.class), new Object[0]);
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
                                p113p3.f.F("Unexpected document type in transaction: " + kVar3, new Object[0]);
                                throw null;
                            }
                            nVar = H4.n.f3332b;
                        }
                        HashMap map = j.f2133b;
                        H4.h hVar = kVar3.f3323a;
                        if (!map.containsKey(hVar)) {
                            map.put(hVar, nVar);
                        } else if (!((H4.n) map.get(hVar)).equals(kVar3.f3325c)) {
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
                H4.n nVarN = P2.n(c0587n.v());
                int iY = c0587n.y();
                ArrayList arrayList = new ArrayList(iY);
                for (int i7 = 0; i7 < iY; i7++) {
                    arrayList.add(P2.l(c0587n.x(i7), nVarN));
                }
                return arrayList;
            default:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f550b;
                if (zIsSuccessful) {
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
