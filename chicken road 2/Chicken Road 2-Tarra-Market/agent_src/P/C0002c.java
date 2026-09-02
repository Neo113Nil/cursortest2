package P;

import Q.D;
import a.AbstractC0009a;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.impl.C0370l9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: P.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f298o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f299p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f300q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static C0002c f301r;

    /* renamed from: a, reason: collision with root package name */
    public long f302a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f303b;

    /* renamed from: c, reason: collision with root package name */
    public Q.j f304c;

    /* renamed from: d, reason: collision with root package name */
    public S.c f305d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f306e;

    /* renamed from: f, reason: collision with root package name */
    public final N.e f307f;

    /* renamed from: g, reason: collision with root package name */
    public final Y.e f308g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f309h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f310i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f311j;

    /* renamed from: k, reason: collision with root package name */
    public final f.c f312k;

    /* renamed from: l, reason: collision with root package name */
    public final f.c f313l;

    /* renamed from: m, reason: collision with root package name */
    public final Z.e f314m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f315n;

    public C0002c(Context context, Looper looper) {
        N.e eVar = N.e.f241d;
        this.f302a = 10000L;
        this.f303b = false;
        this.f309h = new AtomicInteger(1);
        this.f310i = new AtomicInteger(0);
        this.f311j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f312k = new f.c(0);
        this.f313l = new f.c(0);
        this.f315n = true;
        this.f306e = context;
        Z.e eVar2 = new Z.e(looper, this);
        Looper.getMainLooper();
        this.f314m = eVar2;
        this.f307f = eVar;
        this.f308g = new Y.e(18);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0009a.f541e == null) {
            AbstractC0009a.f541e = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC0009a.f541e.booleanValue()) {
            this.f315n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(C0000a c0000a, N.b bVar) {
        return new Status(17, "API: " + ((String) c0000a.f290b.f524c) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f232c, bVar);
    }

    public static C0002c e(Context context) {
        C0002c c0002c;
        HandlerThread handlerThread;
        synchronized (f300q) {
            if (f301r == null) {
                synchronized (D.f387g) {
                    try {
                        handlerThread = D.f389i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            D.f389i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = D.f389i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = N.e.f240c;
                f301r = new C0002c(applicationContext, looper);
            }
            c0002c = f301r;
        }
        return c0002c;
    }

    public final boolean a() {
        if (this.f303b) {
            return false;
        }
        Q.i iVar = (Q.i) Q.h.b().f439a;
        if (iVar != null && !iVar.f441b) {
            return false;
        }
        int i2 = ((SparseIntArray) this.f308g.f523b).get(203400000, -1);
        return i2 == -1 || i2 == 0;
    }

    public final boolean b(N.b bVar, int i2) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        N.e eVar = this.f307f;
        Context context = this.f306e;
        eVar.getClass();
        synchronized (V.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = V.a.f496a;
            if (context2 != null && (bool = V.a.f497b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            V.a.f497b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                V.a.f497b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    V.a.f497b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    V.a.f497b = Boolean.FALSE;
                }
            }
            V.a.f496a = applicationContext;
            booleanValue = V.a.f497b.booleanValue();
        }
        if (!booleanValue) {
            int i3 = bVar.f231b;
            if (i3 == 0 || (activity = bVar.f232c) == null) {
                Intent a2 = eVar.a(context, null, i3);
                activity = a2 != null ? PendingIntent.getActivity(context, 0, a2, 201326592) : null;
            }
            if (activity != null) {
                int i4 = bVar.f231b;
                int i5 = GoogleApiActivity.f723b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i2);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i4, PendingIntent.getActivity(context, 0, intent, Z.d.f535a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final o d(O.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f311j;
        C0000a c0000a = fVar.f270e;
        o oVar = (o) concurrentHashMap.get(c0000a);
        if (oVar == null) {
            oVar = new o(this, fVar);
            concurrentHashMap.put(c0000a, oVar);
        }
        if (oVar.f329b.j()) {
            this.f313l.add(c0000a);
        }
        oVar.m();
        return oVar;
    }

    public final void f(N.b bVar, int i2) {
        if (b(bVar, i2)) {
            return;
        }
        Z.e eVar = this.f314m;
        eVar.sendMessage(eVar.obtainMessage(5, i2, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        o oVar;
        N.d[] b2;
        int i2 = 24;
        int i3 = message.what;
        switch (i3) {
            case 1:
                this.f302a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f314m.removeMessages(12);
                for (C0000a c0000a : this.f311j.keySet()) {
                    Z.e eVar = this.f314m;
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, c0000a), this.f302a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (o oVar2 : this.f311j.values()) {
                    Q.s.a(oVar2.f340m.f314m);
                    oVar2.f338k = null;
                    oVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                x xVar = (x) message.obj;
                o oVar3 = (o) this.f311j.get(xVar.f366c.f270e);
                if (oVar3 == null) {
                    oVar3 = d(xVar.f366c);
                }
                if (!oVar3.f329b.j() || this.f310i.get() == xVar.f365b) {
                    oVar3.n(xVar.f364a);
                } else {
                    xVar.f364a.c(f298o);
                    oVar3.q();
                }
                return true;
            case 5:
                int i4 = message.arg1;
                N.b bVar = (N.b) message.obj;
                Iterator it = this.f311j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        oVar = (o) it.next();
                        if (oVar.f334g == i4) {
                        }
                    } else {
                        oVar = null;
                    }
                }
                if (oVar != null) {
                    int i5 = bVar.f231b;
                    if (i5 == 13) {
                        this.f307f.getClass();
                        int i6 = N.h.f246c;
                        oVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + N.b.a(i5) + ": " + bVar.f233d, null, null));
                    } else {
                        oVar.e(c(oVar.f330c, bVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i4 + " while trying to fail enqueued calls.", new Exception());
                }
                return true;
            case 6:
                if (this.f306e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f306e.getApplicationContext();
                    ComponentCallbacks2C0001b componentCallbacks2C0001b = ComponentCallbacks2C0001b.f293e;
                    synchronized (componentCallbacks2C0001b) {
                        try {
                            if (!componentCallbacks2C0001b.f297d) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C0001b);
                                application.registerComponentCallbacks(componentCallbacks2C0001b);
                                componentCallbacks2C0001b.f297d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    l lVar = new l(this);
                    synchronized (componentCallbacks2C0001b) {
                        componentCallbacks2C0001b.f296c.add(lVar);
                    }
                    AtomicBoolean atomicBoolean = componentCallbacks2C0001b.f295b;
                    boolean z2 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0001b.f294a;
                    if (!z2) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f302a = 300000L;
                    }
                }
                return true;
            case 7:
                d((O.f) message.obj);
                return true;
            case 9:
                if (this.f311j.containsKey(message.obj)) {
                    o oVar4 = (o) this.f311j.get(message.obj);
                    Q.s.a(oVar4.f340m.f314m);
                    if (oVar4.f336i) {
                        oVar4.m();
                    }
                }
                return true;
            case 10:
                Iterator it2 = this.f313l.iterator();
                while (true) {
                    f.e eVar2 = (f.e) it2;
                    if (!eVar2.hasNext()) {
                        this.f313l.clear();
                        return true;
                    }
                    o oVar5 = (o) this.f311j.remove((C0000a) eVar2.next());
                    if (oVar5 != null) {
                        oVar5.q();
                    }
                }
            case 11:
                if (this.f311j.containsKey(message.obj)) {
                    o oVar6 = (o) this.f311j.get(message.obj);
                    C0002c c0002c = oVar6.f340m;
                    Q.s.a(c0002c.f314m);
                    boolean z3 = oVar6.f336i;
                    if (z3) {
                        if (z3) {
                            C0002c c0002c2 = oVar6.f340m;
                            Z.e eVar3 = c0002c2.f314m;
                            C0000a c0000a2 = oVar6.f330c;
                            eVar3.removeMessages(11, c0000a2);
                            c0002c2.f314m.removeMessages(9, c0000a2);
                            oVar6.f336i = false;
                        }
                        oVar6.e(c0002c.f307f.b(c0002c.f306e, N.f.f242a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        oVar6.f329b.i("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f311j.containsKey(message.obj)) {
                    o oVar7 = (o) this.f311j.get(message.obj);
                    Q.s.a(oVar7.f340m.f314m);
                    O.c cVar = oVar7.f329b;
                    if (cVar.c() && oVar7.f333f.isEmpty()) {
                        Y.e eVar4 = oVar7.f331d;
                        if (((Map) eVar4.f523b).isEmpty() && ((Map) eVar4.f524c).isEmpty()) {
                            cVar.i("Timing out service connection.");
                        } else {
                            oVar7.j();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                p pVar = (p) message.obj;
                if (this.f311j.containsKey(pVar.f341a)) {
                    o oVar8 = (o) this.f311j.get(pVar.f341a);
                    if (oVar8.f337j.contains(pVar) && !oVar8.f336i) {
                        if (oVar8.f329b.c()) {
                            oVar8.g();
                        } else {
                            oVar8.m();
                        }
                    }
                }
                return true;
            case 16:
                p pVar2 = (p) message.obj;
                if (this.f311j.containsKey(pVar2.f341a)) {
                    o oVar9 = (o) this.f311j.get(pVar2.f341a);
                    if (oVar9.f337j.remove(pVar2)) {
                        C0002c c0002c3 = oVar9.f340m;
                        c0002c3.f314m.removeMessages(15, pVar2);
                        c0002c3.f314m.removeMessages(16, pVar2);
                        N.d dVar = pVar2.f342b;
                        LinkedList<u> linkedList = oVar9.f328a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (u uVar : linkedList) {
                            if (uVar != null && (b2 = uVar.b(oVar9)) != null) {
                                int length = b2.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= length) {
                                        break;
                                    }
                                    if (!Q.s.e(b2[i7], dVar)) {
                                        i7++;
                                    } else if (i7 >= 0) {
                                        arrayList.add(uVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            u uVar2 = (u) arrayList.get(i8);
                            linkedList.remove(uVar2);
                            uVar2.d(new O.k(dVar));
                        }
                    }
                }
                return true;
            case 17:
                Q.j jVar = this.f304c;
                if (jVar != null) {
                    if (jVar.f445a > 0 || a()) {
                        if (this.f305d == null) {
                            this.f305d = new S.c(this.f306e, S.c.f491i, Q.k.f447b, O.e.f264b);
                        }
                        S.c cVar2 = this.f305d;
                        cVar2.getClass();
                        i iVar = new i();
                        iVar.f319d = 0;
                        iVar.f317b = new N.d[]{Z.c.f533a};
                        iVar.f318c = false;
                        iVar.f320e = new C0.a(i2, jVar);
                        cVar2.b(2, iVar.a());
                    }
                    this.f304c = null;
                }
                return true;
            case 18:
                w wVar = (w) message.obj;
                if (wVar.f362c == 0) {
                    Q.j jVar2 = new Q.j(wVar.f361b, Arrays.asList(wVar.f360a));
                    if (this.f305d == null) {
                        this.f305d = new S.c(this.f306e, S.c.f491i, Q.k.f447b, O.e.f264b);
                    }
                    S.c cVar3 = this.f305d;
                    cVar3.getClass();
                    i iVar2 = new i();
                    iVar2.f319d = 0;
                    iVar2.f317b = new N.d[]{Z.c.f533a};
                    iVar2.f318c = false;
                    iVar2.f320e = new C0.a(i2, jVar2);
                    cVar3.b(2, iVar2.a());
                } else {
                    Q.j jVar3 = this.f304c;
                    if (jVar3 != null) {
                        List list = jVar3.f446b;
                        if (jVar3.f445a != wVar.f361b || (list != null && list.size() >= wVar.f363d)) {
                            this.f314m.removeMessages(17);
                            Q.j jVar4 = this.f304c;
                            if (jVar4 != null) {
                                if (jVar4.f445a > 0 || a()) {
                                    if (this.f305d == null) {
                                        this.f305d = new S.c(this.f306e, S.c.f491i, Q.k.f447b, O.e.f264b);
                                    }
                                    S.c cVar4 = this.f305d;
                                    cVar4.getClass();
                                    i iVar3 = new i();
                                    iVar3.f319d = 0;
                                    iVar3.f317b = new N.d[]{Z.c.f533a};
                                    iVar3.f318c = false;
                                    iVar3.f320e = new C0.a(i2, jVar4);
                                    cVar4.b(2, iVar3.a());
                                }
                                this.f304c = null;
                            }
                        } else {
                            Q.j jVar5 = this.f304c;
                            Q.g gVar = wVar.f360a;
                            if (jVar5.f446b == null) {
                                jVar5.f446b = new ArrayList();
                            }
                            jVar5.f446b.add(gVar);
                        }
                    }
                    if (this.f304c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(wVar.f360a);
                        this.f304c = new Q.j(wVar.f361b, arrayList2);
                        Z.e eVar5 = this.f314m;
                        eVar5.sendMessageDelayed(eVar5.obtainMessage(17), wVar.f362c);
                    }
                }
                return true;
            case C0370l9.f4317C /* 19 */:
                this.f303b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i3);
                return false;
        }
    }
}
