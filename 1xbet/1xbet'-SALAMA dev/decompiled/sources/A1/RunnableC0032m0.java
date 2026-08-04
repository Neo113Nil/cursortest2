package A1;

import B4.C0070n;
import B4.C0072p;
import B4.C0074s;
import E3.AbstractC0167z;
import E3.C0164w;
import E4.C0169b;
import E5.C0197o;
import E5.C0199q;
import G4.C0274g;
import G4.C0279l;
import G4.C0284q;
import R5.C0410f;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.firestore.FirebaseFirestore;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.sentry.IScope;
import io.sentry.ReplayRecording;
import io.sentry.SpanContext;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorder;
import io.sentry.android.replay.util.PersistableLinkedList;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.cache.PersistingScopeObserver;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p018c2.C0779z;
import p155w1.C1010l1;

/* JADX INFO: renamed from: A1.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0032m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f497d;

    public /* synthetic */ RunnableC0032m0(Object obj, Object obj2, Object obj3, int i7) {
        this.f494a = i7;
        this.f495b = obj;
        this.f496c = obj2;
        this.f497d = obj3;
    }

    private final void a() {
        C1010l1 c1010l1 = (C1010l1) this.f495b;
        p113p3.f fVar = (p113p3.f) this.f496c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f497d;
        c1010l1.getClass();
        try {
            p046g0.q qVarM = p097n3.a.m((Context) c1010l1.f17777a);
            if (qVarM == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            p046g0.p pVar = (p046g0.p) ((p046g0.i) qVarM.f13026b);
            synchronized (pVar.f13055d) {
                pVar.f13057f = threadPoolExecutor;
            }
            ((p046g0.i) qVarM.f13026b).b(new p046g0.l(fVar, threadPoolExecutor));
        } catch (Throwable th) {
            fVar.T(th);
            threadPoolExecutor.shutdown();
        }
    }

    private final void b() {
        ScreenshotRecorder.capture$lambda$3$lambda$2$lambda$1((ScreenshotRecorder) this.f495b, (ViewHierarchyNode) this.f496c, (View) this.f497d);
    }

    private final void c() {
        PersistableLinkedList.persistRecording$lambda$1((PersistableLinkedList) this.f495b, (ReplayRecording) this.f496c, (ReplayCache) this.f497d);
    }

    /* JADX WARN: Type inference failed for: r3v50, types: [c2.J, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        boolean z4;
        Task taskE;
        int i7 = 6;
        int i8 = 3;
        switch (this.f494a) {
            case 0:
                C0034n0 c0034n0 = (C0034n0) this.f495b;
                c0034n0.getClass();
                E3.L lD = ((C0164w) this.f496c).d();
                B1.h hVar = c0034n0.f509c;
                AbstractC0021h abstractC0021h = hVar.f992x;
                abstractC0021h.getClass();
                Q3.o oVar = hVar.f989d;
                oVar.getClass();
                oVar.f5823b = AbstractC0167z.E(lD);
                if (!lD.isEmpty()) {
                    oVar.f5826e = (p018c2.D) lD.get(0);
                    p018c2.D d7 = (p018c2.D) this.f497d;
                    d7.getClass();
                    oVar.f5827f = d7;
                }
                if (((p018c2.D) oVar.f5825d) == null) {
                    oVar.f5825d = Q3.o.f(abstractC0021h, (AbstractC0167z) oVar.f5823b, (p018c2.D) oVar.f5826e, (P0) oVar.f5822a);
                }
                oVar.p(((N) abstractC0021h).A());
                return;
            case 1:
                C0169b c0169b = (C0169b) this.f495b;
                Object obj = this.f496c;
                B4.I i9 = (B4.I) this.f497d;
                if (c0169b.f2168c) {
                    return;
                }
                c0169b.f2167b.a(obj, i9);
                return;
            case 2:
                E4.H h6 = ((E4.t) this.f495b).f2237i;
                h6.a("writeMutations");
                C0279l c0279l = h6.f2111a;
                Timestamp timestamp = new Timestamp(new Date());
                HashSet hashSet = new HashSet();
                List list = (List) this.f496c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(((I4.h) it.next()).f3670a);
                }
                C0274g c0274g = (C0274g) c0279l.f2991a.G("Locally write mutations", new E4.s(c0279l, hashSet, list, timestamp));
                int i10 = c0274g.f2975a;
                HashMap map = h6.f2119i;
                Map map2 = (Map) map.get(h6.f2121l);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(h6.f2121l, map2);
                }
                map2.put(Integer.valueOf(i10), (TaskCompletionSource) this.f497d);
                h6.b(c0274g.f2976b, null);
                h6.f2112b.f();
                return;
            case 3:
                C0279l c0279l2 = ((E4.t) this.f495b).f2235g;
                c0279l2.getClass();
                D4.i iVar = (D4.i) c0279l2.f2991a.G("Get named query", new B1.c(i7, c0279l2, (String) this.f496c));
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f497d;
                if (iVar == null) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                D4.h hVar2 = iVar.f1767b;
                E4.I i11 = hVar2.f1764a;
                taskCompletionSource.setResult(new E4.C(i11.f2126d, i11.f2127e, i11.f2125c, i11.f2124b, i11.f2128f, hVar2.f1765b, i11.f2129g, i11.f2130h));
                return;
            case 4:
                D4.f fVar = (D4.f) this.f496c;
                ByteArrayInputStream byteArrayInputStream = fVar.f1756b;
                B4.Q q7 = (B4.Q) this.f497d;
                E4.H h7 = ((E4.t) this.f495b).f2237i;
                C0279l c0279l3 = h7.f2111a;
                P6.b bVar = c0279l3.f2991a;
                try {
                    try {
                        try {
                            D4.e eVar = fVar.f1757c;
                            try {
                                if (eVar == null) {
                                    D4.c cVarC = fVar.c();
                                    if (!(cVarC instanceof D4.e)) {
                                        fVar.a("Expected first element in bundle to be a metadata object");
                                        throw null;
                                    }
                                    eVar = (D4.e) cVarC;
                                    fVar.f1757c = eVar;
                                    fVar.f1759e = 0L;
                                }
                                if (((Boolean) bVar.G("Has newer bundle", new B1.c(5, c0279l3, eVar))).booleanValue()) {
                                    try {
                                        int i12 = eVar.f1752d;
                                        long j = eVar.f1753e;
                                        q7.b(new B4.S(i12, i12, j, j, null, 3));
                                        try {
                                            byteArrayInputStream.close();
                                            return;
                                        } catch (IOException e7) {
                                            Q0.a.v(2, "SyncEngine", "Exception while closing bundle", e7);
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    q7.c(new B4.S(0, eVar.f1752d, 0L, eVar.f1753e, null, 2));
                                    D4.d dVar = new D4.d(c0279l3, eVar);
                                    long j3 = 0;
                                    while (true) {
                                        if (fVar.f1757c == null) {
                                            D4.c cVarC2 = fVar.c();
                                            if (!(cVarC2 instanceof D4.e)) {
                                                fVar.a("Expected first element in bundle to be a metadata object");
                                                throw null;
                                            }
                                            fVar.f1757c = (D4.e) cVarC2;
                                            fVar.f1759e = 0L;
                                        }
                                        D4.c cVarC3 = fVar.c();
                                        if (cVarC3 == null) {
                                            h7.b(dVar.b(), null);
                                            bVar.H(new A0.f(13, c0279l3, eVar), "Save bundle");
                                            int i13 = eVar.f1752d;
                                            long j7 = eVar.f1753e;
                                            q7.b(new B4.S(i13, i13, j7, j7, null, 3));
                                            try {
                                                byteArrayInputStream.close();
                                                return;
                                            } catch (IOException e8) {
                                                Q0.a.v(2, "SyncEngine", "Exception while closing bundle", e8);
                                                return;
                                            }
                                        }
                                        long j8 = fVar.f1759e;
                                        B4.S sA = dVar.a(cVarC3, j8 - j3);
                                        if (sA != null) {
                                            q7.c(sA);
                                        }
                                        j3 = j8;
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                Q0.a.v(2, "Firestore", "Loading bundle failed : %s", e);
                                q7.a(new B4.I("Bundle failed to load", B4.H.INVALID_ARGUMENT, e));
                                try {
                                    byteArrayInputStream.close();
                                    return;
                                } catch (IOException e10) {
                                    Q0.a.v(2, "SyncEngine", "Exception while closing bundle", e10);
                                    return;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e12) {
                    Q0.a.v(2, "SyncEngine", "Exception while closing bundle", e12);
                    throw th;
                }
            case 5:
                Boolean bool = (Boolean) this.f497d;
                FirebaseUser firebaseUserS = p096n1.e.s((C0197o) this.f495b);
                C0199q c0199q = (C0199q) this.f496c;
                if (firebaseUserS == null) {
                    c0199q.a(Y4.D.E());
                    return;
                }
                try {
                    c0199q.success(p097n3.a.M((p034e4.j) Tasks.await(FirebaseAuth.getInstance(Y3.i.f(((zzad) firebaseUserS).f11910c)).h(firebaseUserS, bool.booleanValue()))));
                    return;
                } catch (Exception e13) {
                    c0199q.a(Y4.D.L(e13));
                    return;
                }
            case 6:
                F5.c cVar = (F5.c) this.f495b;
                Y3.i iVar2 = (Y3.i) this.f496c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f497d;
                HashMap map3 = F5.c.f2760c;
                cVar.getClass();
                try {
                    iVar2.b();
                    String str = iVar2.f7664b;
                    iVar2.b();
                    F5.i iVarC = F5.c.c(iVar2.f7665c);
                    iVar2.b();
                    O4.a aVar = (O4.a) iVar2.f7669g.get();
                    synchronized (aVar) {
                        z4 = aVar.f5007d;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    Map map4 = (Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(iVar2));
                    F5.j jVar = new F5.j();
                    if (str == null) {
                        throw new IllegalStateException("Nonnull field \"name\" is null.");
                    }
                    jVar.f2781a = str;
                    jVar.f2782b = iVarC;
                    jVar.f2783c = boolValueOf;
                    if (map4 == null) {
                        throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                    }
                    jVar.f2784d = map4;
                    taskCompletionSource2.setResult(jVar);
                    return;
                } catch (Exception e14) {
                    taskCompletionSource2.setException(e14);
                    return;
                }
            case 7:
                C0279l c0279l4 = (C0279l) this.f495b;
                p023d1.n nVar = c0279l4.f3002m;
                int i14 = nVar.f12371a;
                nVar.f12371a = 2 + i14;
                C0284q c0284q = (C0284q) this.f496c;
                c0284q.f3015a = i14;
                G4.Z z7 = new G4.Z((E4.I) this.f497d, i14, c0279l4.f2991a.r().l(), G4.B.f2875a);
                c0284q.f3016b = z7;
                c0279l4.f2999i.b(z7);
                return;
            case 8:
                H5.m mVar = (H5.m) this.f495b;
                String str2 = (String) this.f496c;
                C0199q c0199q2 = (C0199q) this.f497d;
                try {
                    Tasks.await(H5.e.a(mVar).i(str2));
                    c0199q2.success(null);
                    return;
                } catch (Exception e15) {
                    Y4.D.R(c0199q2, e15);
                    return;
                }
            case 9:
                H5.m mVar2 = (H5.m) this.f495b;
                H5.i iVar3 = (H5.i) this.f496c;
                E5.r rVar = (E5.r) this.f497d;
                try {
                    rVar.success((Void) Tasks.await(H5.e.a(mVar2).d(iVar3.f3375a).b()));
                    return;
                } catch (Exception e16) {
                    Y4.D.R(rVar, e16);
                    return;
                }
            case 10:
                H5.m mVar3 = (H5.m) this.f495b;
                H5.i iVar4 = (H5.i) this.f496c;
                C0199q c0199q3 = (C0199q) this.f497d;
                try {
                    C0070n c0070nD = H5.e.a(mVar3).d(iVar4.f3375a);
                    Map map5 = iVar4.f3376b;
                    Objects.requireNonNull(map5);
                    Map map6 = map5;
                    Boolean bool2 = iVar4.f3377c.f3393a;
                    if (bool2 == null || !bool2.booleanValue()) {
                        List list2 = iVar4.f3377c.f3394b;
                        taskE = list2 != null ? c0070nD.e(map6, B4.e0.a(p003a.a.h0(list2))) : c0070nD.e(map6, B4.e0.f1151c);
                    } else {
                        taskE = c0070nD.e(map6, B4.e0.f1152d);
                    }
                    c0199q3.success((Void) Tasks.await(taskE));
                    return;
                } catch (Exception e17) {
                    Y4.D.R(c0199q3, e17);
                    return;
                }
            case 11:
                H5.i iVar5 = (H5.i) this.f495b;
                H5.m mVar4 = (H5.m) this.f496c;
                C0199q c0199q4 = (C0199q) this.f497d;
                HashMap map7 = H5.e.f3360y;
                try {
                    c0199q4.success(p003a.a.r0((C0072p) Tasks.await(H5.e.a(mVar4).d(iVar5.f3375a).c(p003a.a.k0(iVar5.f3378d))), p003a.a.j0(iVar5.f3379e)));
                    return;
                } catch (Exception e18) {
                    Y4.D.R(c0199q4, e18);
                    return;
                }
            case 12:
                H5.m mVar5 = (H5.m) this.f495b;
                List<H5.w> list3 = (List) this.f496c;
                C0199q c0199q5 = (C0199q) this.f497d;
                try {
                    FirebaseFirestore firebaseFirestoreA = H5.e.a(mVar5);
                    firebaseFirestoreA.f11971k.k();
                    C0011c c0011c = new C0011c(firebaseFirestoreA);
                    ArrayList arrayList = (ArrayList) c0011c.f334d;
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) c0011c.f333c;
                    for (H5.w wVar : list3) {
                        int i15 = wVar.f3419a;
                        if (i15 == 0) {
                            throw null;
                        }
                        String str3 = wVar.f3420b;
                        Objects.requireNonNull(str3);
                        Map map8 = wVar.f3421c;
                        C0070n c0070nD2 = firebaseFirestoreA.d(str3);
                        int iE = p136t.e.e(i15);
                        H4.h hVar3 = c0070nD2.f1179a;
                        if (iE == 1) {
                            Objects.requireNonNull(map8);
                            android.support.v4.media.session.t tVarP = firebaseFirestore.f11969h.p(map8);
                            firebaseFirestore.k(c0070nD2);
                            c0011c.n();
                            arrayList.add(new I4.m(hVar3, (H4.l) tVarP.f8076b, (I4.f) tVarP.f8077c, I4.n.a(true), (List) tVarP.f8078d));
                        } else if (iE == 2) {
                            H5.p pVar = wVar.f3422d;
                            Objects.requireNonNull(pVar);
                            Boolean bool3 = pVar.f3393a;
                            if (bool3 == null || !bool3.booleanValue()) {
                                List list4 = pVar.f3394b;
                                if (list4 != null) {
                                    ArrayList arrayListH0 = p003a.a.h0(list4);
                                    Objects.requireNonNull(map8);
                                    c0011c.g(c0070nD2, map8, B4.e0.a(arrayListH0));
                                } else {
                                    Objects.requireNonNull(map8);
                                    c0011c.g(c0070nD2, map8, B4.e0.f1151c);
                                }
                            } else {
                                Objects.requireNonNull(map8);
                                c0011c.g(c0070nD2, map8, B4.e0.f1152d);
                            }
                        } else if (iE == 3) {
                            firebaseFirestore.k(c0070nD2);
                            c0011c.n();
                            arrayList.add(new I4.e(hVar3, I4.n.f3688c));
                        }
                    }
                    Tasks.await(c0011c.d());
                    c0199q5.success(null);
                    return;
                } catch (Exception e19) {
                    Y4.D.R(c0199q5, e19);
                    return;
                }
            case 13:
                H5.m mVar6 = (H5.m) this.f495b;
                H5.i iVar6 = (H5.i) this.f496c;
                E5.r rVar2 = (E5.r) this.f497d;
                try {
                    C0070n c0070nD3 = H5.e.a(mVar6).d(iVar6.f3375a);
                    Map map9 = iVar6.f3376b;
                    Objects.requireNonNull(map9);
                    Map map10 = map9;
                    HashMap map11 = new HashMap();
                    for (Object obj2 : map10.keySet()) {
                        if (obj2 instanceof String) {
                            map11.put(C0074s.b((String) obj2), map10.get(obj2));
                        } else {
                            if (!(obj2 instanceof C0074s)) {
                                throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                            }
                            map11.put((C0074s) obj2, map10.get(obj2));
                        }
                    }
                    C0074s c0074s = (C0074s) map11.keySet().iterator().next();
                    Object obj3 = map11.get(c0074s);
                    ArrayList arrayList2 = new ArrayList();
                    for (C0074s c0074s2 : map11.keySet()) {
                        if (!c0074s2.equals(c0074s)) {
                            arrayList2.add(c0074s2);
                            arrayList2.add(map11.get(c0074s2));
                        }
                    }
                    rVar2.success((Void) Tasks.await(c0070nD3.f(c0074s, obj3, arrayList2.toArray())));
                    return;
                } catch (Exception e20) {
                    Y4.D.R(rVar2, e20);
                    return;
                }
            case 14:
                B4.G g3 = (B4.G) this.f495b;
                Executor executor = (Executor) this.f496c;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f497d;
                try {
                    ((Task) g3.call()).continueWith(executor, new C0042s(taskCompletionSource3, 24));
                    return;
                } catch (Exception e21) {
                    taskCompletionSource3.setException(e21);
                    return;
                } catch (Throwable th5) {
                    taskCompletionSource3.setException(new IllegalStateException("Unhandled throwable in callTask.", th5));
                    return;
                }
            case 15:
                C0410f c0410f = new C0410f(i8);
                R5.e0 e0Var = (R5.e0) this.f495b;
                R5.T t7 = e0Var.f6159a;
                WebView webView = (WebView) this.f496c;
                ClientCertRequest clientCertRequest = (ClientCertRequest) this.f497d;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView, "viewArg");
                t6.h.e(clientCertRequest, "requestArg");
                I4.j jVar2 = t7.f6101a;
                jVar2.getClass();
                new p155w1.F0((A5.f) jVar2.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", jVar2.a(), (Object) null, 1).L(p050g6.i.M0(e0Var, webView, clientCertRequest), new R5.O(i7, c0410f));
                return;
            case 16:
                C0410f c0410f2 = new C0410f(i8);
                R5.e0 e0Var2 = (R5.e0) this.f495b;
                R5.T t8 = e0Var2.f6159a;
                WebView webView2 = (WebView) this.f496c;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.f497d;
                t8.getClass();
                t6.h.e(e0Var2, "pigeon_instanceArg");
                t6.h.e(webView2, "webViewArg");
                t6.h.e(webResourceRequest, "requestArg");
                I4.j jVar3 = t8.f6101a;
                jVar3.getClass();
                new p155w1.F0((A5.f) jVar3.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", jVar3.a(), (Object) null, 1).L(p050g6.i.M0(e0Var2, webView2, webResourceRequest), new R5.O(7, c0410f2));
                return;
            case 17:
                p018c2.I i16 = (p018c2.I) this.f495b;
                this.f496c.H(i16.f10179a, i16.f10180b, (C0779z) this.f497d);
                return;
            case 18:
                a();
                return;
            case 19:
                ScreenshotRecorder.capture$lambda$3((ScreenshotRecorder) this.f495b, (Window) this.f496c, (View) this.f497d);
                return;
            case 20:
                ScreenshotRecorder.capture$lambda$3$lambda$2$lambda$1$lambda$0((ScreenshotRecorder) this.f495b, (View) this.f496c, (ArrayList) this.f497d);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                b();
                return;
            case 22:
                c();
                return;
            default:
                ((PersistingScopeObserver) this.f495b).lambda$setTrace$10((SpanContext) this.f496c, (IScope) this.f497d);
                return;
        }
    }
}
