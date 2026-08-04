package A1;

import C0.RunnableC0085d;
import F.AbstractC0212h;
import F.C0211g;
import G4.C0272e;
import G4.C0279l;
import G4.C0282o;
import G4.InterfaceC0268a;
import G4.InterfaceC0273f;
import G4.InterfaceC0290x;
import K4.AbstractC0315b;
import K4.C0321h;
import K4.RunnableC0314a;
import R5.C0407c;
import R5.C0409e;
import R5.C0412h;
import W5.C0508i;
import W5.C0522m1;
import W5.Q1;
import W5.R1;
import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.widget.Toast;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Task;
import com.ryanheise.audioservice.AudioService;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import p155w1.C1017n0;
import p155w1.C1050x1;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f111b;

    public /* synthetic */ K0(Object obj, int i7) {
        this.f110a = i7;
        this.f111b = obj;
    }

    private final void a() {
        p046g0.p pVar = (p046g0.p) this.f111b;
        synchronized (pVar.f13055d) {
            try {
                if (pVar.f13059y == null) {
                    return;
                }
                try {
                    M.f fVarC = pVar.c();
                    int i7 = fVarC.f4536e;
                    if (i7 == 2) {
                        synchronized (pVar.f13055d) {
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    }
                    try {
                        int i8 = L.l.f4188a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        B4.V v6 = pVar.f13054c;
                        Context context = pVar.f13052a;
                        v6.getClass();
                        Typeface typefaceW = I.f.f3467a.w(context, new M.f[]{fVarC}, 0);
                        MappedByteBuffer mappedByteBufferA = P6.b.A(pVar.f13052a, fVarC.f4532a);
                        if (mappedByteBufferA == null || typefaceW == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            p155w1.F0 f7 = new p155w1.F0(typefaceW, P6.b.D(mappedByteBufferA));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (pVar.f13055d) {
                                try {
                                    p113p3.f fVar = pVar.f13059y;
                                    if (fVar != null) {
                                        fVar.U(f7);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            pVar.a();
                        } catch (Throwable th2) {
                            int i9 = L.l.f4188a;
                            Trace.endSection();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        int i10 = L.l.f4188a;
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    synchronized (pVar.f13055d) {
                        try {
                            p113p3.f fVar2 = pVar.f13059y;
                            if (fVar2 != null) {
                                fVar2.T(th4);
                            }
                            pVar.a();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r7;
        ?? r8;
        int i7 = 3;
        int i8 = 28;
        int i9 = 4;
        Handler handler = null;
        Application application = 1;
        application = 1;
        switch (this.f110a) {
            case 0:
                ((M0) this.f111b).f();
                return;
            case 1:
                B1.h hVar = (B1.h) this.f111b;
                hVar.N(hVar.a(), 1028, new B1.f(false ? 1 : 0));
                hVar.f991f.j();
                return;
            case 2:
                E4.L l7 = (E4.L) this.f111b;
                C0043s0 c0043s0 = (C0043s0) l7.f2143c;
                c0043s0.getClass();
                E4.J j = new E4.J((K4.j) c0043s0.f556f);
                ((Task) ((B4.E) l7.f2144d).apply(j)).addOnCompleteListener(((L4.f) l7.f2142b).f4359a, new E4.K(false ? 1 : 0, l7, j));
                return;
            case 3:
                Activity activity = (Activity) this.f111b;
                if (activity.isFinishing()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    Class cls = AbstractC0212h.f2435a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0212h.f2435a;
                C0211g c0211g = 27;
                boolean z4 = i10 == 26 || i10 == 27;
                Method method = AbstractC0212h.f2440f;
                if ((!z4 || method != null) && (AbstractC0212h.f2439e != null || AbstractC0212h.f2438d != null)) {
                    try {
                        Object obj2 = AbstractC0212h.f2437c.get(activity);
                        if (obj2 != null && (obj = AbstractC0212h.f2436b.get(activity)) != null) {
                            application = activity.getApplication();
                            c0211g = new C0211g(activity);
                            application.registerActivityLifecycleCallbacks(c0211g);
                            handler = AbstractC0212h.f2441g;
                            handler.post(new D6.y0(i7, c0211g, obj2));
                            if (i10 != 26 && i10 != 27) {
                                application = 0;
                            }
                            try {
                                if (application != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        handler = handler;
                                        r8 = c0211g;
                                        r7 = application;
                                        handler.post(new D6.y0(i9, (Object) r7, (Object) r8));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new D6.y0(i9, application, c0211g));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r8 = c0211g;
                                r7 = application;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 4:
                C1017n0 c1017n0 = (C1017n0) this.f111b;
                C0272e c0272e = (C0272e) c1017n0.f17813d;
                c0272e.getClass();
                Integer num = (Integer) c0272e.f2971b.G("Backfill Indexes", new C0042s(c0272e, 18));
                num.getClass();
                Q0.a.v(1, "IndexBackfiller", "Documents written: %s", num);
                c1017n0.f17811b = ((L4.f) c1017n0.f17812c).b(L4.e.f4348A, C0272e.f2969g, new K0(c1017n0, i9));
                return;
            case 5:
                C0282o c0282o = (C0282o) this.f111b;
                C0279l c0279l = (C0279l) c0282o.f3011c;
                c0282o.f3009a = true;
                c0282o.f3012d = ((L4.f) c0282o.f3010b).b(L4.e.f4356x, G4.r.f3018d, new K0(c0282o, 5));
                return;
            case 6:
                Boolean[] boolArr = {Boolean.FALSE};
                G4.S s7 = (G4.S) ((p096n1.e) this.f111b).f15314b;
                s7.c0("SELECT migration_name FROM data_migrations").m(new G4.I(boolArr, 1 == true ? 1 : 0));
                if (boolArr[0].booleanValue()) {
                    HashSet hashSet = new HashSet();
                    Cursor cursorJ = s7.c0("SELECT DISTINCT uid FROM mutation_queues").J();
                    while (cursorJ.moveToNext()) {
                        try {
                            hashSet.add(cursorJ.getString(0));
                        } catch (Throwable th3) {
                            if (cursorJ == null) {
                                throw th3;
                            }
                            try {
                                cursorJ.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    cursorJ.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C4.e eVar = new C4.e((String) it.next());
                        InterfaceC0290x interfaceC0290xP = s7.p(eVar, s7.o(eVar));
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = ((ArrayList) ((E4.L) interfaceC0290xP).j()).iterator();
                        while (it2.hasNext()) {
                            hashSet2.addAll(((I4.i) it2.next()).b());
                        }
                        InterfaceC0268a interfaceC0268aN = s7.n(eVar);
                        InterfaceC0273f interfaceC0273fO = s7.o(eVar);
                        C1050x1 c1050x1 = s7.f2933g;
                        new p072k1.g(c1050x1, interfaceC0290xP, interfaceC0268aN, interfaceC0273fO).M(c1050x1.n(hashSet2));
                    }
                    s7.b0("DELETE FROM data_migrations WHERE migration_name = ?", "BUILD_OVERLAYS");
                    return;
                }
                return;
            case 7:
                ((C0321h) this.f111b).getClass();
                return;
            case 8:
                ((A5.h) this.f111b).c(null);
                return;
            case 9:
                AbstractC0315b abstractC0315b = (AbstractC0315b) ((B1.m) this.f111b).f1016d;
                Q0.a.v(1, abstractC0315b.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(abstractC0315b)));
                abstractC0315b.f4003h = K4.x.f4074c;
                abstractC0315b.f4006l.a();
                if (abstractC0315b.f3996a == null) {
                    abstractC0315b.f3996a = abstractC0315b.f4001f.b(L4.e.f4354e, AbstractC0315b.f3994p, new RunnableC0314a(abstractC0315b, 1 == true ? 1 : 0));
                    return;
                }
                return;
            case 10:
                K4.u uVar = (K4.u) this.f111b;
                uVar.f4067d = null;
                p113p3.f.O("Timer should be canceled if we transitioned to a different state.", uVar.f4064a == 1, new Object[0]);
                Locale locale = Locale.ENGLISH;
                uVar.c("Backend didn't respond within 10 seconds\n");
                uVar.d(3);
                return;
            case 11:
                Throwable th5 = (Throwable) this.f111b;
                if (!(th5 instanceof OutOfMemoryError)) {
                    throw new RuntimeException("Internal error in Cloud Firestore (25.1.1).", th5);
                }
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (25.1.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                outOfMemoryError.initCause(th5);
                throw outOfMemoryError;
            case 12:
                C1017n0 c1017n1 = (C1017n0) this.f111b;
                ((L4.f) c1017n1.f17813d).d();
                if (((ScheduledFuture) c1017n1.f17812c) != null) {
                    c1017n1.C();
                    ((Runnable) c1017n1.f17811b).run();
                    return;
                }
                return;
            case 13:
                R1.f fVar = (R1.f) this.f111b;
                synchronized (fVar.f5901a) {
                    try {
                        if (fVar.f5911l) {
                            return;
                        }
                        long j3 = fVar.f5910k - 1;
                        fVar.f5910k = j3;
                        if (j3 > 0) {
                            return;
                        }
                        if (j3 >= 0) {
                            fVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (fVar.f5901a) {
                            fVar.f5912m = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 14:
                C0407c c0407c = (C0407c) this.f111b;
                if (c0407c.j) {
                    return;
                }
                while (true) {
                    WeakReference weakReference = (WeakReference) c0407c.f6139e.poll();
                    if (weakReference == null) {
                        c0407c.f6141g.postDelayed(c0407c.f6142h, c0407c.f6144k);
                        return;
                    }
                    HashMap map = c0407c.f6140f;
                    Object obj3 = null;
                    if (map instanceof u6.a) {
                        t6.s.c(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    Long l8 = (Long) map.remove(weakReference);
                    if (l8 != null) {
                        c0407c.f6137c.remove(l8);
                        c0407c.f6138d.remove(l8);
                        new p155w1.F0(((C0409e) c0407c.f6135a.f12673a).f6157a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (A5.n) C0409e.f6156b.getValue(), obj3, 1).L(Y4.D.D(l8), new C0042s(new C0412h(l8.longValue()), i8));
                    }
                }
                break;
            case 15:
                Toast toast = (Toast) ((P2) this.f111b).f17515c;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
            case 16:
                C0508i c0508i = (C0508i) this.f111b;
                P2 p5 = c0508i.f7238d;
                if (p5 != null) {
                    P2.F f7 = (P2.F) p5.f17514b;
                    if (!f7.f5421c && !f7.f5420b) {
                        p5.d();
                    }
                }
                c0508i.f7237c = null;
                return;
            case 17:
                ((C0522m1) this.f111b).e();
                return;
            case 18:
                R1 r9 = ((Q1) this.f111b).f6984e;
                r9.f7017b.a(new RunnableC0085d(r9, 24));
                return;
            case 19:
                ((androidx.fragment.app.A) this.f111b).invalidateMenu();
                return;
            case 20:
                androidx.activity.n nVar = (androidx.activity.n) this.f111b;
                Runnable runnable = nVar.f8108b;
                if (runnable != null) {
                    runnable.run();
                    nVar.f8108b = null;
                    return;
                }
                return;
            case zzbbd.zzt.zzm /* 21 */:
                androidx.activity.p.a((androidx.activity.p) this.f111b);
                return;
            case 22:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f9594z;
                ProcessLifecycleOwner processLifecycleOwner2 = (ProcessLifecycleOwner) this.f111b;
                t6.h.e(processLifecycleOwner2, "this$0");
                int i11 = processLifecycleOwner2.f9596b;
                C0726v c0726v = processLifecycleOwner2.f9600f;
                if (i11 == 0) {
                    processLifecycleOwner2.f9597c = true;
                    c0726v.e(EnumC0718m.ON_PAUSE);
                }
                if (processLifecycleOwner2.f9595a == 0 && processLifecycleOwner2.f9597c) {
                    c0726v.e(EnumC0718m.ON_STOP);
                    processLifecycleOwner2.f9598d = true;
                    return;
                }
                return;
            case 23:
                com.google.firebase.storage.s sVar = (com.google.firebase.storage.s) this.f111b;
                try {
                    sVar.k();
                    return;
                } finally {
                    sVar.a();
                }
            case 24:
                a();
                return;
            case 25:
                ((Map.Entry) this.f111b).getKey().getClass();
                throw new ClassCastException();
            case 26:
                AudioService audioService = AudioService.f12300P;
                AudioService audioService2 = (AudioService) this.f111b;
                if (audioService2.f12316L) {
                    ((NotificationManager) audioService2.getSystemService("notification")).notify(1124, audioService2.g());
                    return;
                }
                return;
            case 27:
                ((p096n1.e) this.f111b).z();
                return;
            case 28:
                break;
            default:
                ((io.flutter.plugin.platform.s) this.f111b).i(false);
                return;
        }
        while (true) {
            p064i5.d dVar = (p064i5.d) this.f111b;
            ArrayList arrayList = dVar.f14025f;
            if (arrayList.isEmpty() || dVar.f14030l != null) {
                return;
            }
            ((j5.d) arrayList.get(0)).f14647a.run();
            arrayList.remove(0);
        }
    }

    public /* synthetic */ K0(Map.Entry entry, A4.a aVar) {
        this.f110a = 25;
        this.f111b = entry;
    }
}
