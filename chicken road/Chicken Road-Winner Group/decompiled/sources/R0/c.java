package R0;

import I1.y;
import S0.B;
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
import io.appmetrica.analytics.impl.C0644l9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.C1153c;
import p.C1157g;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f1188o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f1189p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f1190q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static c f1191r;

    /* renamed from: a, reason: collision with root package name */
    public long f1192a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1193b;

    /* renamed from: c, reason: collision with root package name */
    public S0.i f1194c;

    /* renamed from: d, reason: collision with root package name */
    public U0.c f1195d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1196e;
    public final P0.e f;

    /* renamed from: g, reason: collision with root package name */
    public final a1.e f1197g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f1198h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1199i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f1200j;

    /* renamed from: k, reason: collision with root package name */
    public final C1153c f1201k;

    /* renamed from: l, reason: collision with root package name */
    public final C1153c f1202l;

    /* renamed from: m, reason: collision with root package name */
    public final b1.e f1203m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f1204n;

    public c(Context context, Looper looper) {
        P0.e eVar = P0.e.f1132d;
        this.f1192a = 10000L;
        this.f1193b = false;
        this.f1198h = new AtomicInteger(1);
        this.f1199i = new AtomicInteger(0);
        this.f1200j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f1201k = new C1153c(0);
        this.f1202l = new C1153c(0);
        this.f1204n = true;
        this.f1196e = context;
        b1.e eVar2 = new b1.e(looper, this);
        Looper.getMainLooper();
        this.f1203m = eVar2;
        this.f = eVar;
        this.f1197g = new a1.e(17);
        PackageManager packageManager = context.getPackageManager();
        if (F2.b.f == null) {
            F2.b.f = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (F2.b.f.booleanValue()) {
            this.f1204n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(a aVar, P0.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f1180b.f1789c) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f1123c, bVar);
    }

    public static c e(Context context) {
        c cVar;
        HandlerThread handlerThread;
        synchronized (f1190q) {
            if (f1191r == null) {
                synchronized (B.f1289g) {
                    try {
                        handlerThread = B.f1291i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            B.f1291i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = B.f1291i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = P0.e.f1131c;
                f1191r = new c(applicationContext, looper);
            }
            cVar = f1191r;
        }
        return cVar;
    }

    public final boolean a() {
        if (this.f1193b) {
            return false;
        }
        S0.h hVar = (S0.h) S0.g.b().f1329a;
        if (hVar != null && !hVar.f1331b) {
            return false;
        }
        int i3 = ((SparseIntArray) this.f1197g.f1788b).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    public final boolean b(P0.b bVar, int i3) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        P0.e eVar = this.f;
        Context context = this.f1196e;
        eVar.getClass();
        synchronized (X0.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = X0.a.f1625a;
            if (context2 != null && (bool = X0.a.f1626b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            X0.a.f1626b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                X0.a.f1626b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    X0.a.f1626b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    X0.a.f1626b = Boolean.FALSE;
                }
            }
            X0.a.f1625a = applicationContext;
            booleanValue = X0.a.f1626b.booleanValue();
        }
        if (!booleanValue) {
            int i4 = bVar.f1122b;
            if (i4 == 0 || (activity = bVar.f1123c) == null) {
                Intent a3 = eVar.a(i4, context, null);
                activity = a3 != null ? PendingIntent.getActivity(context, 0, a3, 201326592) : null;
            }
            if (activity != null) {
                int i5 = bVar.f1122b;
                int i6 = GoogleApiActivity.f2563b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i3);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i5, PendingIntent.getActivity(context, 0, intent, b1.d.f2477a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final l d(Q0.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f1200j;
        a aVar = fVar.f1165e;
        l lVar = (l) concurrentHashMap.get(aVar);
        if (lVar == null) {
            lVar = new l(this, fVar);
            concurrentHashMap.put(aVar, lVar);
        }
        if (lVar.f1209d.j()) {
            this.f1202l.add(aVar);
        }
        lVar.m();
        return lVar;
    }

    public final void f(P0.b bVar, int i3) {
        if (b(bVar, i3)) {
            return;
        }
        b1.e eVar = this.f1203m;
        eVar.sendMessage(eVar.obtainMessage(5, i3, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        l lVar;
        P0.d[] b3;
        int i3 = 25;
        int i4 = message.what;
        switch (i4) {
            case 1:
                this.f1192a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f1203m.removeMessages(12);
                for (a aVar : this.f1200j.keySet()) {
                    b1.e eVar = this.f1203m;
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, aVar), this.f1192a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (l lVar2 : this.f1200j.values()) {
                    S0.r.a(lVar2.f1219o.f1203m);
                    lVar2.f1217m = null;
                    lVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t tVar = (t) message.obj;
                l lVar3 = (l) this.f1200j.get(tVar.f1241c.f1165e);
                if (lVar3 == null) {
                    lVar3 = d(tVar.f1241c);
                }
                if (!lVar3.f1209d.j() || this.f1199i.get() == tVar.f1240b) {
                    lVar3.n(tVar.f1239a);
                    return true;
                }
                tVar.f1239a.c(f1188o);
                lVar3.q();
                return true;
            case 5:
                int i5 = message.arg1;
                P0.b bVar = (P0.b) message.obj;
                Iterator it = this.f1200j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        lVar = (l) it.next();
                        if (lVar.f1213i == i5) {
                        }
                    } else {
                        lVar = null;
                    }
                }
                if (lVar == null) {
                    Log.wtf("GoogleApiManager", B0.c.i(i5, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i6 = bVar.f1122b;
                if (i6 != 13) {
                    lVar.e(c(lVar.f1210e, bVar));
                    return true;
                }
                this.f.getClass();
                int i7 = P0.i.f1137c;
                lVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + P0.b.a(i6) + ": " + bVar.f1124d, null, null));
                return true;
            case 6:
                if (this.f1196e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f1196e.getApplicationContext();
                    b bVar2 = b.f1183e;
                    synchronized (bVar2) {
                        try {
                            if (!bVar2.f1187d) {
                                application.registerActivityLifecycleCallbacks(bVar2);
                                application.registerComponentCallbacks(bVar2);
                                bVar2.f1187d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j jVar = new j(this);
                    synchronized (bVar2) {
                        bVar2.f1186c.add(jVar);
                    }
                    AtomicBoolean atomicBoolean = bVar2.f1185b;
                    boolean z3 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = bVar2.f1184a;
                    if (!z3) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f1192a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((Q0.f) message.obj);
                return true;
            case 9:
                if (this.f1200j.containsKey(message.obj)) {
                    l lVar4 = (l) this.f1200j.get(message.obj);
                    S0.r.a(lVar4.f1219o.f1203m);
                    if (lVar4.f1215k) {
                        lVar4.m();
                        return true;
                    }
                }
                return true;
            case 10:
                Iterator it2 = this.f1202l.iterator();
                while (true) {
                    C1157g c1157g = (C1157g) it2;
                    if (!c1157g.hasNext()) {
                        this.f1202l.clear();
                        return true;
                    }
                    l lVar5 = (l) this.f1200j.remove((a) c1157g.next());
                    if (lVar5 != null) {
                        lVar5.q();
                    }
                }
            case 11:
                if (this.f1200j.containsKey(message.obj)) {
                    l lVar6 = (l) this.f1200j.get(message.obj);
                    c cVar = lVar6.f1219o;
                    S0.r.a(cVar.f1203m);
                    boolean z4 = lVar6.f1215k;
                    if (z4) {
                        if (z4) {
                            c cVar2 = lVar6.f1219o;
                            b1.e eVar2 = cVar2.f1203m;
                            a aVar2 = lVar6.f1210e;
                            eVar2.removeMessages(11, aVar2);
                            cVar2.f1203m.removeMessages(9, aVar2);
                            lVar6.f1215k = false;
                        }
                        lVar6.e(cVar.f.b(cVar.f1196e, P0.f.f1133a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        lVar6.f1209d.c("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.f1200j.containsKey(message.obj)) {
                    l lVar7 = (l) this.f1200j.get(message.obj);
                    S0.r.a(lVar7.f1219o.f1203m);
                    Q0.c cVar3 = lVar7.f1209d;
                    if (cVar3.a() && lVar7.f1212h.isEmpty()) {
                        a1.e eVar3 = lVar7.f;
                        if (((Map) eVar3.f1788b).isEmpty() && ((Map) eVar3.f1789c).isEmpty()) {
                            cVar3.c("Timing out service connection.");
                            return true;
                        }
                        lVar7.j();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                m mVar = (m) message.obj;
                if (this.f1200j.containsKey(mVar.f1220a)) {
                    l lVar8 = (l) this.f1200j.get(mVar.f1220a);
                    if (lVar8.f1216l.contains(mVar) && !lVar8.f1215k) {
                        if (lVar8.f1209d.a()) {
                            lVar8.g();
                            return true;
                        }
                        lVar8.m();
                        return true;
                    }
                }
                return true;
            case 16:
                m mVar2 = (m) message.obj;
                if (this.f1200j.containsKey(mVar2.f1220a)) {
                    l lVar9 = (l) this.f1200j.get(mVar2.f1220a);
                    if (lVar9.f1216l.remove(mVar2)) {
                        c cVar4 = lVar9.f1219o;
                        cVar4.f1203m.removeMessages(15, mVar2);
                        cVar4.f1203m.removeMessages(16, mVar2);
                        P0.d dVar = mVar2.f1221b;
                        LinkedList<q> linkedList = lVar9.f1208a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (q qVar : linkedList) {
                            if (qVar != null && (b3 = qVar.b(lVar9)) != null) {
                                int length = b3.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length) {
                                        break;
                                    }
                                    if (!S0.r.e(b3[i8], dVar)) {
                                        i8++;
                                    } else if (i8 >= 0) {
                                        arrayList.add(qVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            q qVar2 = (q) arrayList.get(i9);
                            linkedList.remove(qVar2);
                            qVar2.d(new Q0.k(dVar));
                        }
                    }
                }
                return true;
            case 17:
                S0.i iVar = this.f1194c;
                if (iVar != null) {
                    if (iVar.f1335a > 0 || a()) {
                        if (this.f1195d == null) {
                            this.f1195d = new U0.c(this.f1196e, U0.c.f1596i, S0.j.f1337b, Q0.e.f1159b);
                        }
                        U0.c cVar5 = this.f1195d;
                        cVar5.getClass();
                        y yVar = new y();
                        yVar.f685b = 0;
                        yVar.f687d = new P0.d[]{b1.c.f2475a};
                        yVar.f684a = false;
                        yVar.f686c = new b0.i(i3, iVar);
                        cVar5.b(2, yVar.a());
                    }
                    this.f1194c = null;
                    return true;
                }
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f1237c == 0) {
                    S0.i iVar2 = new S0.i(sVar.f1236b, Arrays.asList(sVar.f1235a));
                    if (this.f1195d == null) {
                        this.f1195d = new U0.c(this.f1196e, U0.c.f1596i, S0.j.f1337b, Q0.e.f1159b);
                    }
                    U0.c cVar6 = this.f1195d;
                    cVar6.getClass();
                    y yVar2 = new y();
                    yVar2.f685b = 0;
                    yVar2.f687d = new P0.d[]{b1.c.f2475a};
                    yVar2.f684a = false;
                    yVar2.f686c = new b0.i(i3, iVar2);
                    cVar6.b(2, yVar2.a());
                    return true;
                }
                S0.i iVar3 = this.f1194c;
                if (iVar3 != null) {
                    List list = iVar3.f1336b;
                    if (iVar3.f1335a != sVar.f1236b || (list != null && list.size() >= sVar.f1238d)) {
                        this.f1203m.removeMessages(17);
                        S0.i iVar4 = this.f1194c;
                        if (iVar4 != null) {
                            if (iVar4.f1335a > 0 || a()) {
                                if (this.f1195d == null) {
                                    this.f1195d = new U0.c(this.f1196e, U0.c.f1596i, S0.j.f1337b, Q0.e.f1159b);
                                }
                                U0.c cVar7 = this.f1195d;
                                cVar7.getClass();
                                y yVar3 = new y();
                                yVar3.f685b = 0;
                                yVar3.f687d = new P0.d[]{b1.c.f2475a};
                                yVar3.f684a = false;
                                yVar3.f686c = new b0.i(i3, iVar4);
                                cVar7.b(2, yVar3.a());
                            }
                            this.f1194c = null;
                        }
                    } else {
                        S0.i iVar5 = this.f1194c;
                        S0.f fVar = sVar.f1235a;
                        if (iVar5.f1336b == null) {
                            iVar5.f1336b = new ArrayList();
                        }
                        iVar5.f1336b.add(fVar);
                    }
                }
                if (this.f1194c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sVar.f1235a);
                    this.f1194c = new S0.i(sVar.f1236b, arrayList2);
                    b1.e eVar4 = this.f1203m;
                    eVar4.sendMessageDelayed(eVar4.obtainMessage(17), sVar.f1237c);
                    return true;
                }
                return true;
            case C0644l9.f7759C /* 19 */:
                this.f1193b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i4);
                return false;
        }
    }
}
