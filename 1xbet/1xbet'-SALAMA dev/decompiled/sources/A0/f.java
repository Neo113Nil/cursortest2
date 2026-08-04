package A0;

import A1.C0043s0;
import A1.D0;
import A1.E0;
import A1.K;
import A1.M;
import A1.N;
import A1.P0;
import A1.Q;
import A1.R0;
import A1.U;
import A1.r;
import A1.v0;
import A5.s;
import B4.I;
import B4.InterfaceC0073q;
import B4.P;
import E4.C0169b;
import E4.H;
import E4.RunnableC0179l;
import E5.C0188f;
import E5.C0199q;
import G4.C0279l;
import G4.RunnableC0275h;
import G4.RunnableC0276i;
import G4.S;
import K4.AbstractC0315b;
import K4.C0318e;
import K4.C0319f;
import K4.C0321h;
import K4.G;
import K4.u;
import K4.x;
import U5.C0443j;
import U5.W;
import U5.Y;
import U5.b0;
import U5.l0;
import Y4.D;
import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0867k;
import io.sentry.logger.LoggerBatchProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import p151v2.t;
import p155w1.C1017n0;
import p155w1.F0;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f45a = i7;
        this.f46b = obj;
        this.f47c = obj2;
    }

    private final void a() {
        H5.e eVar = (H5.e) this.f46b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f47c;
        HashMap map = H5.e.f3360y;
        eVar.getClass();
        try {
            HashMap map2 = H5.e.f3360y;
            synchronized (map2) {
                try {
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) ((Map.Entry) it.next()).getKey();
                        Tasks.await(firebaseFirestore.j());
                        HashMap map3 = H5.e.f3360y;
                        synchronized (map3) {
                            try {
                                if (((H5.b) map3.get(firebaseFirestore)) != null) {
                                    map3.remove(firebaseFirestore);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            eVar.f();
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    private final void b() {
        H5.m mVar = (H5.m) this.f46b;
        C0199q c0199q = (C0199q) this.f47c;
        try {
            FirebaseFirestore firebaseFirestoreA = H5.e.a(mVar);
            Tasks.await(firebaseFirestoreA.j());
            HashMap map = H5.e.f3360y;
            synchronized (map) {
                try {
                    if (((H5.b) map.get(firebaseFirestoreA)) != null) {
                        map.remove(firebaseFirestoreA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0199q.success(null);
        } catch (Exception e7) {
            D.R(c0199q, e7);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        long j;
        long j3;
        Task taskA;
        Task taskA2;
        Set<String> setUnmodifiableSet;
        int i7 = 2;
        int i8 = 0;
        boolean z7 = true;
        z7 = true;
        switch (this.f45a) {
            case 0:
                ((ProfileInstallerInitializer) this.f46b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g((Context) this.f47c, i8), new Random().nextInt(Math.max(zzbbd.zzq.zzf, 1)) + LoggerBatchProcessor.FLUSH_AFTER_MS);
                return;
            case 1:
                N n2 = (N) this.f46b;
                Q q7 = (Q) this.f47c;
                int i9 = n2.f130E - q7.f194b;
                n2.f130E = i9;
                if (q7.f196d) {
                    n2.f131F = q7.f195c;
                    n2.f132G = true;
                }
                if (q7.f198f) {
                    n2.f133H = q7.f197e;
                }
                if (i9 == 0) {
                    R0 r7 = ((v0) q7.f199g).f585a;
                    if (!n2.f154b0.f585a.p() && r7.p()) {
                        n2.c0 = -1;
                        n2.f157d0 = 0L;
                    }
                    if (!r7.p()) {
                        List listAsList = Arrays.asList(((E0) r7).f93y);
                        p151v2.a.h(listAsList.size() == n2.f167o.size());
                        for (int i10 = 0; i10 < listAsList.size(); i10++) {
                            ((M) n2.f167o.get(i10)).f117b = (R0) listAsList.get(i10);
                        }
                    }
                    if (n2.f132G) {
                        if (((v0) q7.f199g).f586b.equals(n2.f154b0.f586b) && ((v0) q7.f199g).f588d == n2.f154b0.f602s) {
                            z7 = false;
                        }
                        if (z7) {
                            if (r7.p() || ((v0) q7.f199g).f586b.a()) {
                                j3 = ((v0) q7.f199g).f588d;
                            } else {
                                v0 v0Var = (v0) q7.f199g;
                                p018c2.D d7 = v0Var.f586b;
                                long j7 = v0Var.f588d;
                                Object obj = d7.f10161a;
                                P0 p5 = n2.f166n;
                                r7.g(obj, p5);
                                j3 = j7 + p5.f190e;
                            }
                            z4 = z7;
                            j = j3;
                        } else {
                            z4 = z7;
                        }
                        n2.f132G = false;
                        n2.U((v0) q7.f199g, 1, n2.f133H, false, z4, n2.f131F, j, -1);
                        return;
                    }
                    z4 = false;
                    j = -9223372036854775807L;
                    n2.f132G = false;
                    n2.U((v0) q7.f199g, 1, n2.f133H, false, z4, n2.f131F, j, -1);
                    return;
                }
                return;
            case 2:
                D0 d8 = (D0) this.f47c;
                ((U) this.f46b).getClass();
                try {
                    synchronized (d8) {
                    }
                    try {
                        d8.f76a.c(d8.f79d, d8.f80e);
                        return;
                    } finally {
                        d8.b(true);
                    }
                } catch (r e7) {
                    p151v2.a.l("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f47c;
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f46b;
                firebaseFirestore.getClass();
                try {
                    S.Z(firebaseFirestore.f11963b, firebaseFirestore.f11964c, firebaseFirestore.f11965d);
                    taskCompletionSource.setResult(null);
                    return;
                } catch (I e8) {
                    taskCompletionSource.setException(e8);
                    return;
                }
            case 4:
                ((A5.h) ((P) this.f46b).f1119b.f550b).c((B4.S) this.f47c);
                return;
            case 5:
                P2 p7 = (P2) this.f46b;
                D1.e eVar = (D1.e) this.f47c;
                p7.getClass();
                synchronized (eVar) {
                }
                K k7 = (K) p7.f17515c;
                int i11 = t.f17159a;
                B1.h hVar = k7.f109a.f169q;
                hVar.N(hVar.K((p018c2.D) hVar.f989d.f5826e), 1013, new B1.d(9));
                return;
            case 6:
                H h6 = ((E4.t) this.f46b).f2237i;
                if (!h6.f2112b.f552b) {
                    Q0.a.v(1, "H", "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
                }
                int iF = h6.f2111a.f2993c.f();
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f47c;
                if (iF == -1) {
                    taskCompletionSource2.setResult(null);
                    return;
                }
                HashMap map = h6.j;
                if (!map.containsKey(Integer.valueOf(iF))) {
                    map.put(Integer.valueOf(iF), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iF))).add(taskCompletionSource2);
                return;
            case 7:
                E4.t tVar = (E4.t) this.f46b;
                p113p3.f.O("SyncEngine not yet initialized", tVar.f2237i != null, new Object[0]);
                C4.e eVar2 = (C4.e) this.f47c;
                Q0.a.v(1, "FirestoreClient", "Credential changed. Current user: %s", eVar2.f1580a);
                H h7 = tVar.f2237i;
                boolean zEquals = h7.f2121l.equals(eVar2);
                h7.f2121l = eVar2;
                if (!zEquals) {
                    HashMap map2 = h7.j;
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                        while (it2.hasNext()) {
                            ((TaskCompletionSource) it2.next()).setException(new I("'waitForPendingWrites' task is cancelled due to User change.", B4.H.CANCELLED));
                        }
                    }
                    map2.clear();
                    C0279l c0279l = h7.f2111a;
                    List listJ = c0279l.f2993c.j();
                    c0279l.c(eVar2);
                    RunnableC0275h runnableC0275h = new RunnableC0275h(c0279l, 0);
                    P6.b bVar = c0279l.f2991a;
                    bVar.H(runnableC0275h, "Start IndexManager");
                    bVar.H(new RunnableC0275h(c0279l, 1), "Start MutationQueue");
                    List listJ2 = c0279l.f2993c.j();
                    p075k4.e eVarL = H4.h.f3317c;
                    Iterator it3 = Arrays.asList(listJ, listJ2).iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((List) it3.next()).iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = ((I4.i) it4.next()).f3676d.iterator();
                            while (it5.hasNext()) {
                                eVarL = eVarL.l(((I4.h) it5.next()).f3670a);
                            }
                        }
                    }
                    h7.b(c0279l.f2996f.v(eVarL), null);
                }
                C0043s0 c0043s0 = h7.f2112b;
                if (c0043s0.f552b) {
                    Q0.a.v(1, "RemoteStore", "Restarting streams for new credential.", new Object[0]);
                    c0043s0.f552b = false;
                    c0043s0.c();
                    ((u) c0043s0.f558h).e(1);
                    ((K4.H) c0043s0.j).b();
                    ((G) c0043s0.f559i).b();
                    c0043s0.e();
                    return;
                }
                return;
            case 8:
                C0279l c0279l2 = ((E4.t) this.f46b).f2235g;
                c0279l2.getClass();
                c0279l2.f2991a.H(new RunnableC0276i(c0279l2, (ArrayList) this.f47c, z7 ? 1 : 0), "Configure indexes");
                return;
            case 9:
                ((HashSet) ((E4.t) this.f46b).j.f17145d).remove((InterfaceC0073q) this.f47c);
                return;
            case 10:
                HashSet hashSet = (HashSet) ((E4.t) this.f46b).j.f17145d;
                C0169b c0169b = (C0169b) this.f47c;
                hashSet.add(c0169b);
                c0169b.a(null, null);
                return;
            case 11:
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f47c;
                HashMap map3 = C0188f.f2361z;
                C0188f c0188f = (C0188f) this.f46b;
                c0188f.getClass();
                try {
                    c0188f.c();
                    C0188f.f2361z.clear();
                    taskCompletionSource3.setResult(null);
                    return;
                } catch (Exception e9) {
                    taskCompletionSource3.setException(e9);
                    return;
                }
            case 12:
                String str = (String) this.f46b;
                TaskCompletionSource taskCompletionSource4 = (TaskCompletionSource) this.f47c;
                HashMap map4 = F5.c.f2760c;
                try {
                    try {
                        Y3.i.f(str).c();
                        break;
                    } catch (IllegalStateException unused) {
                    }
                    taskCompletionSource4.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource4.setException(e10);
                    return;
                }
            case 13:
                P2 p8 = ((C0279l) this.f46b).j;
                D4.e eVar3 = (D4.e) this.f47c;
                switch (p8.f17513a) {
                    case 9:
                        ((HashMap) p8.f17514b).put(eVar3.f1749a, eVar3);
                        return;
                    default:
                        Integer numValueOf = Integer.valueOf(eVar3.f1750b);
                        Timestamp timestamp = eVar3.f1751c.f3333a;
                        ((S) p8.f17514b).b0("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar3.f1749a, numValueOf, Long.valueOf(timestamp.f11828a), Integer.valueOf(timestamp.f11829b), Integer.valueOf(eVar3.f1752d), Long.valueOf(eVar3.f1753e));
                        return;
                }
            case 14:
                ((C0279l) this.f46b).f2993c.b((AbstractC0867k) this.f47c);
                return;
            case 15:
                TaskCompletionSource taskCompletionSource5 = (TaskCompletionSource) this.f47c;
                HashMap map5 = G5.d.f3055e;
                G5.d dVar = (G5.d) this.f46b;
                dVar.getClass();
                try {
                    dVar.a();
                    taskCompletionSource5.setResult(null);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource5.setException(e11);
                    return;
                }
            case 16:
                P2 p9 = (P2) this.f46b;
                ((s) p9.f17515c).a("FirebaseDatabase#callTransactionHandler", (HashMap) this.f47c, new G5.f(p9, i8));
                return;
            case 17:
                ((C0321h) this.f46b).e((Typeface) this.f47c);
                return;
            case 18:
                H5.m mVar = (H5.m) this.f46b;
                E5.r rVar = (E5.r) this.f47c;
                try {
                    Tasks.await(H5.e.a(mVar).a());
                    rVar.success(null);
                    return;
                } catch (Exception e12) {
                    D.R(rVar, e12);
                    return;
                }
            case 19:
                H5.m mVar2 = (H5.m) this.f46b;
                C0199q c0199q = (C0199q) this.f47c;
                try {
                    C1017n0 c1017n0 = H5.e.a(mVar2).f11971k;
                    synchronized (c1017n0) {
                        c1017n0.k();
                        E4.t tVar2 = (E4.t) c1017n0.f17812c;
                        tVar2.e();
                        taskA = tVar2.f2232d.a(new RunnableC0179l(tVar2, i7));
                    }
                    Tasks.await(taskA);
                    c0199q.success(null);
                    return;
                } catch (Exception e13) {
                    D.R(c0199q, e13);
                    return;
                }
            case 20:
                Boolean bool = (Boolean) this.f46b;
                E5.r rVar2 = (E5.r) this.f47c;
                HashMap map6 = H5.e.f3360y;
                try {
                    if (bool.booleanValue()) {
                        Q0.a.f5736a = 1;
                    } else {
                        Q0.a.f5736a = 2;
                    }
                    rVar2.success(null);
                    return;
                } catch (Exception e14) {
                    D.R(rVar2, e14);
                    return;
                }
            case zzbbd.zzt.zzm /* 21 */:
                a();
                return;
            case 22:
                H5.m mVar3 = (H5.m) this.f46b;
                E5.r rVar3 = (E5.r) this.f47c;
                try {
                    C1017n0 c1017n1 = H5.e.a(mVar3).f11971k;
                    synchronized (c1017n1) {
                        c1017n1.k();
                        E4.t tVar3 = (E4.t) c1017n1.f17812c;
                        tVar3.e();
                        taskA2 = tVar3.f2232d.a(new RunnableC0179l(tVar3, z7 ? 1 : 0));
                    }
                    Tasks.await(taskA2);
                    rVar3.success(null);
                    return;
                } catch (Exception e15) {
                    D.R(rVar3, e15);
                    return;
                }
            case 23:
                H5.m mVar4 = (H5.m) this.f46b;
                E5.r rVar4 = (E5.r) this.f47c;
                try {
                    Tasks.await(H5.e.a(mVar4).l());
                    rVar4.success(null);
                    return;
                } catch (Exception e16) {
                    D.R(rVar4, e16);
                    return;
                }
            case 24:
                b();
                return;
            case 25:
                B1.m mVar5 = (B1.m) this.f46b;
                if (Q0.a.E()) {
                    HashMap map7 = new HashMap();
                    b0 b0Var = (b0) this.f47c;
                    if (b0Var.f6460b == 0) {
                        setUnmodifiableSet = Collections.emptySet();
                    } else {
                        HashSet hashSet2 = new HashSet(b0Var.f6460b);
                        for (int i12 = 0; i12 < b0Var.f6460b; i12++) {
                            hashSet2.add(new String(b0Var.e(i12), 0));
                        }
                        setUnmodifiableSet = Collections.unmodifiableSet(hashSet2);
                    }
                    for (String str2 : setUnmodifiableSet) {
                        if (K4.j.f4023d.contains(str2.toLowerCase(Locale.ENGLISH))) {
                            C0443j c0443j = b0.f6457d;
                            BitSet bitSet = Y.f6448d;
                            map7.put(str2, (String) b0Var.c(new W(str2, c0443j)));
                        }
                    }
                    if (map7.isEmpty()) {
                        return;
                    }
                    AbstractC0315b abstractC0315b = (AbstractC0315b) mVar5.f1016d;
                    Q0.a.v(1, abstractC0315b.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(abstractC0315b)), map7);
                    return;
                }
                return;
            case 26:
                B1.m mVar6 = (B1.m) this.f46b;
                l0 l0Var = (l0) this.f47c;
                boolean zE = l0Var.e();
                AbstractC0315b abstractC0315b2 = (AbstractC0315b) mVar6.f1016d;
                if (zE) {
                    Q0.a.v(1, abstractC0315b2.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(abstractC0315b2)));
                } else {
                    Q0.a.v(2, abstractC0315b2.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(abstractC0315b2)), l0Var);
                }
                p113p3.f.O("Can't handle server close on non-started stream!", abstractC0315b2.d(), new Object[0]);
                abstractC0315b2.a(x.f4076e, l0Var);
                return;
            case 27:
                ((ConnectivityManager) ((F0) this.f46b).f17380c).unregisterNetworkCallback((C0318e) this.f47c);
                return;
            case 28:
                ((Context) ((F0) this.f46b).f17379b).unregisterReceiver((C0319f) this.f47c);
                return;
            default:
                C0043s0 c0043s1 = (C0043s0) this.f46b;
                c0043s1.getClass();
                K4.i iVar = K4.i.f4021b;
                K4.i iVar2 = (K4.i) this.f47c;
                boolean zEquals2 = iVar2.equals(iVar);
                u uVar = (u) c0043s1.f558h;
                if (zEquals2 && p136t.e.b(uVar.f4064a, 2)) {
                    return;
                }
                if (!(iVar2.equals(K4.i.f4020a) && p136t.e.b(uVar.f4064a, 3)) && c0043s1.f552b) {
                    Q0.a.v(1, "RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                    c0043s1.f552b = false;
                    c0043s1.c();
                    uVar.e(1);
                    ((K4.H) c0043s1.j).b();
                    ((G) c0043s1.f559i).b();
                    c0043s1.e();
                    return;
                }
                return;
        }
    }
}
