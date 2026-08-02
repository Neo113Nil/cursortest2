package l3;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.Jt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k3.InterfaceC2035c;
import m3.F;
import n.AbstractC2107A;
import n.C2138i;
import o3.C2221b;
import q3.AbstractC2309b;
import r.C2323a;
import r.C2328f;
import r3.AbstractC2349a;
import w3.AbstractC2553b;
import w3.AbstractC2554c;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2057d implements Handler.Callback {

    /* renamed from: B, reason: collision with root package name */
    public static C2057d f17783B;

    /* renamed from: k, reason: collision with root package name */
    public long f17786k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17787l;

    /* renamed from: m, reason: collision with root package name */
    public m3.m f17788m;

    /* renamed from: n, reason: collision with root package name */
    public C2221b f17789n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f17790o;

    /* renamed from: p, reason: collision with root package name */
    public final j3.e f17791p;

    /* renamed from: q, reason: collision with root package name */
    public final G.v f17792q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicInteger f17793r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicInteger f17794s;

    /* renamed from: t, reason: collision with root package name */
    public final ConcurrentHashMap f17795t;

    /* renamed from: u, reason: collision with root package name */
    public final C2328f f17796u;

    /* renamed from: v, reason: collision with root package name */
    public final C2328f f17797v;

    /* renamed from: w, reason: collision with root package name */
    public final Jt f17798w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f17799x;

    /* renamed from: y, reason: collision with root package name */
    public static final Status f17784y = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: z, reason: collision with root package name */
    public static final Status f17785z = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: A, reason: collision with root package name */
    public static final Object f17782A = new Object();

    public C2057d(Context context, Looper looper) {
        j3.e eVar = j3.e.f17512d;
        this.f17786k = 10000L;
        this.f17787l = false;
        this.f17793r = new AtomicInteger(1);
        this.f17794s = new AtomicInteger(0);
        this.f17795t = new ConcurrentHashMap(5, 0.75f, 1);
        this.f17796u = new C2328f(0);
        this.f17797v = new C2328f(0);
        this.f17799x = true;
        this.f17790o = context;
        Jt jt = new Jt(looper, this, 1);
        this.f17798w = jt;
        this.f17791p = eVar;
        this.f17792q = new G.v(17);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC2309b.f == null) {
            AbstractC2309b.f = Boolean.valueOf(AbstractC2309b.e() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC2309b.f.booleanValue()) {
            this.f17799x = false;
        }
        jt.sendMessage(jt.obtainMessage(6));
    }

    public static Status c(C2055b c2055b, j3.b bVar) {
        String str = (String) c2055b.f17774b.f20440m;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), bVar.f17503m, bVar);
    }

    public static C2057d e(Context context) {
        C2057d c2057d;
        synchronized (f17782A) {
            try {
                if (f17783B == null) {
                    Looper looper = F.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = j3.e.f17511c;
                    f17783B = new C2057d(applicationContext, looper);
                }
                c2057d = f17783B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2057d;
    }

    public final boolean a() {
        if (this.f17787l) {
            return false;
        }
        m3.l lVar = (m3.l) m3.k.b().f18078k;
        if (lVar != null && !lVar.f18080l) {
            return false;
        }
        int i = ((SparseIntArray) this.f17792q.f1749l).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(j3.b bVar, int i) {
        j3.e eVar = this.f17791p;
        eVar.getClass();
        Context context = this.f17790o;
        if (!AbstractC2349a.G(context)) {
            int i5 = bVar.f17502l;
            PendingIntent pendingIntent = bVar.f17503m;
            if (!((i5 == 0 || pendingIntent == null) ? false : true)) {
                pendingIntent = null;
                Intent b3 = eVar.b(i5, context, null);
                if (b3 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b3, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i6 = GoogleApiActivity.f7479l;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.g(context, i5, PendingIntent.getActivity(context, 0, intent, AbstractC2554c.f20532a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m d(k3.f fVar) {
        C2055b c2055b = fVar.f17594o;
        ConcurrentHashMap concurrentHashMap = this.f17795t;
        m mVar = (m) concurrentHashMap.get(c2055b);
        if (mVar == null) {
            mVar = new m(this, fVar);
            concurrentHashMap.put(c2055b, mVar);
        }
        if (mVar.f17807l.m()) {
            this.f17797v.add(c2055b);
        }
        mVar.j();
        return mVar;
    }

    public final void f(j3.b bVar, int i) {
        if (b(bVar, i)) {
            return;
        }
        Jt jt = this.f17798w;
        jt.sendMessage(jt.obtainMessage(5, i, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        m mVar;
        j3.d[] b3;
        int i = 6;
        int i5 = message.what;
        switch (i5) {
            case 1:
                this.f17786k = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f17798w.removeMessages(12);
                for (C2055b c2055b : this.f17795t.keySet()) {
                    Jt jt = this.f17798w;
                    jt.sendMessageDelayed(jt.obtainMessage(12, c2055b), this.f17786k);
                }
                return true;
            case 2:
                throw AbstractC2107A.p(message.obj);
            case 3:
                for (m mVar2 : this.f17795t.values()) {
                    m3.v.b(mVar2.f17818w.f17798w);
                    mVar2.f17816u = null;
                    mVar2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t tVar = (t) message.obj;
                m mVar3 = (m) this.f17795t.get(tVar.f17835c.f17594o);
                if (mVar3 == null) {
                    mVar3 = d(tVar.f17835c);
                }
                if (!mVar3.f17807l.m() || this.f17794s.get() == tVar.f17834b) {
                    mVar3.k(tVar.f17833a);
                    return true;
                }
                tVar.f17833a.c(f17784y);
                mVar3.m();
                return true;
            case 5:
                int i6 = message.arg1;
                j3.b bVar = (j3.b) message.obj;
                Iterator it = this.f17795t.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f17812q == i6) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i6);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i7 = bVar.f17502l;
                if (i7 != 13) {
                    mVar.b(c(mVar.f17808m, bVar));
                    return true;
                }
                this.f17791p.getClass();
                AtomicBoolean atomicBoolean = j3.h.f17515a;
                String a5 = j3.b.a(i7);
                String str = bVar.f17504n;
                StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(a5);
                sb2.append(": ");
                sb2.append(str);
                mVar.b(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                if (this.f17790o.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f17790o.getApplicationContext();
                    ComponentCallbacks2C2056c componentCallbacks2C2056c = ComponentCallbacks2C2056c.f17777o;
                    synchronized (componentCallbacks2C2056c) {
                        try {
                            if (!componentCallbacks2C2056c.f17781n) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C2056c);
                                application.registerComponentCallbacks(componentCallbacks2C2056c);
                                componentCallbacks2C2056c.f17781n = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    componentCallbacks2C2056c.a(new l(this));
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C2056c.f17779l;
                    boolean z3 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C2056c.f17778k;
                    if (!z3) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f17786k = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((k3.f) message.obj);
                return true;
            case 9:
                if (this.f17795t.containsKey(message.obj)) {
                    m mVar4 = (m) this.f17795t.get(message.obj);
                    m3.v.b(mVar4.f17818w.f17798w);
                    if (mVar4.f17814s) {
                        mVar4.j();
                        return true;
                    }
                }
                return true;
            case 10:
                C2328f c2328f = this.f17797v;
                c2328f.getClass();
                C2323a c2323a = new C2323a(c2328f);
                while (c2323a.hasNext()) {
                    m mVar5 = (m) this.f17795t.remove((C2055b) c2323a.next());
                    if (mVar5 != null) {
                        mVar5.m();
                    }
                }
                this.f17797v.clear();
                return true;
            case 11:
                if (this.f17795t.containsKey(message.obj)) {
                    m mVar6 = (m) this.f17795t.get(message.obj);
                    C2057d c2057d = mVar6.f17818w;
                    m3.v.b(c2057d.f17798w);
                    boolean z5 = mVar6.f17814s;
                    if (z5) {
                        if (z5) {
                            C2057d c2057d2 = mVar6.f17818w;
                            Jt jt2 = c2057d2.f17798w;
                            C2055b c2055b2 = mVar6.f17808m;
                            jt2.removeMessages(11, c2055b2);
                            c2057d2.f17798w.removeMessages(9, c2055b2);
                            mVar6.f17814s = false;
                        }
                        mVar6.b(c2057d.f17791p.c(c2057d.f17790o, j3.f.f17513a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        mVar6.f17807l.f("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.f17795t.containsKey(message.obj)) {
                    m mVar7 = (m) this.f17795t.get(message.obj);
                    m3.v.b(mVar7.f17818w.f17798w);
                    InterfaceC2035c interfaceC2035c = mVar7.f17807l;
                    if (interfaceC2035c.a() && mVar7.f17811p.size() == 0) {
                        v3.g gVar = mVar7.f17809n;
                        if (((Map) gVar.f20439l).isEmpty() && ((Map) gVar.f20440m).isEmpty()) {
                            interfaceC2035c.f("Timing out service connection.");
                            return true;
                        }
                        mVar7.g();
                        return true;
                    }
                }
                return true;
            case 14:
                throw AbstractC2107A.p(message.obj);
            case 15:
                n nVar = (n) message.obj;
                if (this.f17795t.containsKey(nVar.f17819a)) {
                    m mVar8 = (m) this.f17795t.get(nVar.f17819a);
                    if (mVar8.f17815t.contains(nVar) && !mVar8.f17814s) {
                        if (mVar8.f17807l.a()) {
                            mVar8.d();
                            return true;
                        }
                        mVar8.j();
                        return true;
                    }
                }
                return true;
            case 16:
                n nVar2 = (n) message.obj;
                if (this.f17795t.containsKey(nVar2.f17819a)) {
                    m mVar9 = (m) this.f17795t.get(nVar2.f17819a);
                    if (mVar9.f17815t.remove(nVar2)) {
                        C2057d c2057d3 = mVar9.f17818w;
                        c2057d3.f17798w.removeMessages(15, nVar2);
                        c2057d3.f17798w.removeMessages(16, nVar2);
                        j3.d dVar = nVar2.f17820b;
                        LinkedList<q> linkedList = mVar9.f17806k;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (q qVar : linkedList) {
                            if (qVar != null && (b3 = qVar.b(mVar9)) != null) {
                                int length = b3.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length) {
                                        break;
                                    }
                                    if (!m3.v.g(b3[i8], dVar)) {
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
                            qVar2.d(new k3.k(dVar));
                        }
                    }
                }
                return true;
            case 17:
                m3.m mVar10 = this.f17788m;
                if (mVar10 != null) {
                    if (mVar10.f18084k > 0 || a()) {
                        if (this.f17789n == null) {
                            this.f17789n = new C2221b(this.f17790o, C2221b.f18651s, m3.n.f18086b, k3.e.f17588b);
                        }
                        C2221b c2221b = this.f17789n;
                        c2221b.getClass();
                        j jVar = new j();
                        jVar.f17803d = 0;
                        jVar.f17801b = new j3.d[]{AbstractC2553b.f20530a};
                        jVar.f17802c = false;
                        jVar.f17804e = new C2138i(i, mVar10);
                        c2221b.b(2, jVar.a());
                    }
                    this.f17788m = null;
                    return true;
                }
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f17831c == 0) {
                    m3.m mVar11 = new m3.m(sVar.f17830b, Arrays.asList(sVar.f17829a));
                    if (this.f17789n == null) {
                        this.f17789n = new C2221b(this.f17790o, C2221b.f18651s, m3.n.f18086b, k3.e.f17588b);
                    }
                    C2221b c2221b2 = this.f17789n;
                    c2221b2.getClass();
                    j jVar2 = new j();
                    jVar2.f17803d = 0;
                    jVar2.f17801b = new j3.d[]{AbstractC2553b.f20530a};
                    jVar2.f17802c = false;
                    jVar2.f17804e = new C2138i(i, mVar11);
                    c2221b2.b(2, jVar2.a());
                    return true;
                }
                m3.m mVar12 = this.f17788m;
                if (mVar12 != null) {
                    List list = mVar12.f18085l;
                    if (mVar12.f18084k != sVar.f17830b || (list != null && list.size() >= sVar.f17832d)) {
                        this.f17798w.removeMessages(17);
                        m3.m mVar13 = this.f17788m;
                        if (mVar13 != null) {
                            if (mVar13.f18084k > 0 || a()) {
                                if (this.f17789n == null) {
                                    this.f17789n = new C2221b(this.f17790o, C2221b.f18651s, m3.n.f18086b, k3.e.f17588b);
                                }
                                C2221b c2221b3 = this.f17789n;
                                c2221b3.getClass();
                                j jVar3 = new j();
                                jVar3.f17803d = 0;
                                jVar3.f17801b = new j3.d[]{AbstractC2553b.f20530a};
                                jVar3.f17802c = false;
                                jVar3.f17804e = new C2138i(i, mVar13);
                                c2221b3.b(2, jVar3.a());
                            }
                            this.f17788m = null;
                        }
                    } else {
                        m3.m mVar14 = this.f17788m;
                        m3.j jVar4 = sVar.f17829a;
                        if (mVar14.f18085l == null) {
                            mVar14.f18085l = new ArrayList();
                        }
                        mVar14.f18085l.add(jVar4);
                    }
                }
                if (this.f17788m == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sVar.f17829a);
                    this.f17788m = new m3.m(sVar.f17830b, arrayList2);
                    Jt jt3 = this.f17798w;
                    jt3.sendMessageDelayed(jt3.obtainMessage(17), sVar.f17831c);
                    return true;
                }
                return true;
            case 19:
                this.f17787l = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
