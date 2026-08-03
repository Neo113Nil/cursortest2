package o0;

/* loaded from: classes.dex */
public final class c implements android.os.Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f8129o = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f8130p = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f8131q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public static o0.c f8132r;

    /* renamed from: a, reason: collision with root package name */
    public long f8133a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8134b;

    /* renamed from: c, reason: collision with root package name */
    public p0.C0957i f8135c;

    /* renamed from: d, reason: collision with root package name */
    public r0.C0986b f8136d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f8137e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.f f8138f;

    /* renamed from: g, reason: collision with root package name */
    public final o0.i f8139g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f8140h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f8141i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f8142j;

    /* renamed from: k, reason: collision with root package name */
    public final l.C0925c f8143k;

    /* renamed from: l, reason: collision with root package name */
    public final l.C0925c f8144l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.a f8145m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f8146n;

    public c(android.content.Context context, android.os.Looper looper) {
        m0.f fVar = m0.f.f8053d;
        this.f8133a = 10000L;
        this.f8134b = false;
        this.f8140h = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f8141i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f8142j = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
        this.f8143k = new l.C0925c(0);
        this.f8144l = new l.C0925c(0);
        this.f8146n = true;
        this.f8137e = context;
        A0.a aVar = new A0.a(looper, this);
        android.os.Looper.getMainLooper();
        this.f8145m = aVar;
        this.f8138f = fVar;
        this.f8139g = new o0.i(4);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (Q1.l.f1641h == null) {
            Q1.l.f1641h = java.lang.Boolean.valueOf(android.os.Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (Q1.l.f1641h.booleanValue()) {
            this.f8146n = false;
        }
        aVar.sendMessage(aVar.obtainMessage(6));
    }

    public static com.google.android.gms.common.api.Status c(o0.C0942a c0942a, m0.b bVar) {
        return new com.google.android.gms.common.api.Status(17, "API: " + ((java.lang.String) c0942a.f8121b.f8410c) + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(bVar), bVar.f8044c, bVar);
    }

    public static o0.c e(android.content.Context context) {
        o0.c cVar;
        android.os.HandlerThread handlerThread;
        synchronized (f8131q) {
            if (f8132r == null) {
                synchronized (p0.C0947B.f8211g) {
                    try {
                        handlerThread = p0.C0947B.f8213i;
                        if (handlerThread == null) {
                            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
                            p0.C0947B.f8213i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = p0.C0947B.f8213i;
                        }
                    } finally {
                    }
                }
                android.os.Looper looper = handlerThread.getLooper();
                android.content.Context applicationContext = context.getApplicationContext();
                java.lang.Object obj = m0.f.f8052c;
                f8132r = new o0.c(applicationContext, looper);
            }
            cVar = f8132r;
        }
        return cVar;
    }

    public final boolean a() {
        if (this.f8134b) {
            return false;
        }
        p0.C0956h c0956h = (p0.C0956h) p0.C0955g.b().f8255a;
        if (c0956h != null && !c0956h.f8257b) {
            return false;
        }
        int i2 = ((android.util.SparseIntArray) this.f8139g.f8148b).get(203400000, -1);
        return i2 == -1 || i2 == 0;
    }

    public final boolean b(m0.b bVar, int i2) {
        boolean booleanValue;
        boolean isInstantApp;
        android.app.PendingIntent activity;
        java.lang.Boolean bool;
        m0.f fVar = this.f8138f;
        android.content.Context context = this.f8137e;
        fVar.getClass();
        synchronized (u0.AbstractC0995a.class) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.Context context2 = u0.AbstractC0995a.f8357a;
            if (context2 != null && (bool = u0.AbstractC0995a.f8358b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            u0.AbstractC0995a.f8358b = null;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                u0.AbstractC0995a.f8358b = java.lang.Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    u0.AbstractC0995a.f8358b = java.lang.Boolean.TRUE;
                } catch (java.lang.ClassNotFoundException unused) {
                    u0.AbstractC0995a.f8358b = java.lang.Boolean.FALSE;
                }
            }
            u0.AbstractC0995a.f8357a = applicationContext;
            booleanValue = u0.AbstractC0995a.f8358b.booleanValue();
        }
        if (!booleanValue) {
            int i3 = bVar.f8043b;
            if (i3 == 0 || (activity = bVar.f8044c) == null) {
                android.content.Intent a2 = fVar.a(context, null, i3);
                activity = a2 != null ? android.app.PendingIntent.getActivity(context, 0, a2, 201326592) : null;
            }
            if (activity != null) {
                int i4 = bVar.f8043b;
                int i5 = com.google.android.gms.common.api.GoogleApiActivity.f2590b;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i2);
                intent.putExtra("notify_manager", true);
                fVar.f(context, i4, android.app.PendingIntent.getActivity(context, 0, intent, y0.d.f8485a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final o0.m d(n0.f fVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f8142j;
        o0.C0942a c0942a = fVar.f8091e;
        o0.m mVar = (o0.m) concurrentHashMap.get(c0942a);
        if (mVar == null) {
            mVar = new o0.m(this, fVar);
            concurrentHashMap.put(c0942a, mVar);
        }
        if (mVar.f8154b.i()) {
            this.f8144l.add(c0942a);
        }
        mVar.m();
        return mVar;
    }

    public final void f(m0.b bVar, int i2) {
        if (b(bVar, i2)) {
            return;
        }
        A0.a aVar = this.f8145m;
        aVar.sendMessage(aVar.obtainMessage(5, i2, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        o0.m mVar;
        m0.d[] b2;
        int i2 = 28;
        int i3 = message.what;
        switch (i3) {
            case 1:
                this.f8133a = true == ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f8145m.removeMessages(12);
                for (o0.C0942a c0942a : this.f8142j.keySet()) {
                    A0.a aVar = this.f8145m;
                    aVar.sendMessageDelayed(aVar.obtainMessage(12, c0942a), this.f8133a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new java.lang.ClassCastException();
            case 3:
                for (o0.m mVar2 : this.f8142j.values()) {
                    p0.AbstractC0966r.a(mVar2.f8165m.f8145m);
                    mVar2.f8163k = null;
                    mVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                o0.u uVar = (o0.u) message.obj;
                o0.m mVar3 = (o0.m) this.f8142j.get(uVar.f8188c.f8091e);
                if (mVar3 == null) {
                    mVar3 = d(uVar.f8188c);
                }
                if (!mVar3.f8154b.i() || this.f8141i.get() == uVar.f8187b) {
                    mVar3.n(uVar.f8186a);
                } else {
                    uVar.f8186a.c(f8129o);
                    mVar3.q();
                }
                return true;
            case 5:
                int i4 = message.arg1;
                m0.b bVar = (m0.b) message.obj;
                java.util.Iterator it = this.f8142j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (o0.m) it.next();
                        if (mVar.f8159g == i4) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar != null) {
                    int i5 = bVar.f8043b;
                    if (i5 == 13) {
                        this.f8138f.getClass();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = m0.i.f8056a;
                        mVar.e(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + m0.b.a(i5) + ": " + bVar.f8045d, null, null));
                    } else {
                        mVar.e(c(mVar.f8155c, bVar));
                    }
                } else {
                    android.util.Log.wtf("GoogleApiManager", B1.a.g(i4, "Could not find API instance ", " while trying to fail enqueued calls."), new java.lang.Exception());
                }
                return true;
            case 6:
                if (this.f8137e.getApplicationContext() instanceof android.app.Application) {
                    android.app.Application application = (android.app.Application) this.f8137e.getApplicationContext();
                    o0.b bVar2 = o0.b.f8124e;
                    synchronized (bVar2) {
                        try {
                            if (!bVar2.f8128d) {
                                application.registerActivityLifecycleCallbacks(bVar2);
                                application.registerComponentCallbacks(bVar2);
                                bVar2.f8128d = true;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    o0.k kVar = new o0.k(this);
                    synchronized (bVar2) {
                        bVar2.f8127c.add(kVar);
                    }
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = bVar2.f8126b;
                    boolean z2 = atomicBoolean2.get();
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = bVar2.f8125a;
                    if (!z2) {
                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f8133a = 300000L;
                    }
                }
                return true;
            case 7:
                d((n0.f) message.obj);
                return true;
            case 9:
                if (this.f8142j.containsKey(message.obj)) {
                    o0.m mVar4 = (o0.m) this.f8142j.get(message.obj);
                    p0.AbstractC0966r.a(mVar4.f8165m.f8145m);
                    if (mVar4.f8161i) {
                        mVar4.m();
                    }
                }
                return true;
            case 10:
                java.util.Iterator it2 = this.f8144l.iterator();
                while (true) {
                    l.g gVar = (l.g) it2;
                    if (!gVar.hasNext()) {
                        this.f8144l.clear();
                        return true;
                    }
                    o0.m mVar5 = (o0.m) this.f8142j.remove((o0.C0942a) gVar.next());
                    if (mVar5 != null) {
                        mVar5.q();
                    }
                }
            case 11:
                if (this.f8142j.containsKey(message.obj)) {
                    o0.m mVar6 = (o0.m) this.f8142j.get(message.obj);
                    o0.c cVar = mVar6.f8165m;
                    p0.AbstractC0966r.a(cVar.f8145m);
                    boolean z3 = mVar6.f8161i;
                    if (z3) {
                        if (z3) {
                            o0.c cVar2 = mVar6.f8165m;
                            A0.a aVar2 = cVar2.f8145m;
                            o0.C0942a c0942a2 = mVar6.f8155c;
                            aVar2.removeMessages(11, c0942a2);
                            cVar2.f8145m.removeMessages(9, c0942a2);
                            mVar6.f8161i = false;
                        }
                        mVar6.e(cVar.f8138f.b(cVar.f8137e, m0.g.f8054a) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        mVar6.f8154b.h("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f8142j.containsKey(message.obj)) {
                    o0.m mVar7 = (o0.m) this.f8142j.get(message.obj);
                    p0.AbstractC0966r.a(mVar7.f8165m.f8145m);
                    n0.InterfaceC0939c interfaceC0939c = mVar7.f8154b;
                    if (interfaceC0939c.c() && mVar7.f8158f.isEmpty()) {
                        o0.i iVar = mVar7.f8156d;
                        if (((java.util.Map) iVar.f8148b).isEmpty() && ((java.util.Map) iVar.f8149c).isEmpty()) {
                            interfaceC0939c.h("Timing out service connection.");
                        } else {
                            mVar7.j();
                        }
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new java.lang.ClassCastException();
            case 15:
                o0.n nVar = (o0.n) message.obj;
                if (this.f8142j.containsKey(nVar.f8166a)) {
                    o0.m mVar8 = (o0.m) this.f8142j.get(nVar.f8166a);
                    if (mVar8.f8162j.contains(nVar) && !mVar8.f8161i) {
                        if (mVar8.f8154b.c()) {
                            mVar8.g();
                        } else {
                            mVar8.m();
                        }
                    }
                }
                return true;
            case 16:
                o0.n nVar2 = (o0.n) message.obj;
                if (this.f8142j.containsKey(nVar2.f8166a)) {
                    o0.m mVar9 = (o0.m) this.f8142j.get(nVar2.f8166a);
                    if (mVar9.f8162j.remove(nVar2)) {
                        o0.c cVar3 = mVar9.f8165m;
                        cVar3.f8145m.removeMessages(15, nVar2);
                        cVar3.f8145m.removeMessages(16, nVar2);
                        m0.d dVar = nVar2.f8167b;
                        java.util.LinkedList<o0.r> linkedList = mVar9.f8153a;
                        java.util.ArrayList arrayList = new java.util.ArrayList(linkedList.size());
                        for (o0.r rVar : linkedList) {
                            if (rVar != null && (b2 = rVar.b(mVar9)) != null) {
                                int length = b2.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!p0.AbstractC0966r.e(b2[i6], dVar)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList.add(rVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            o0.r rVar2 = (o0.r) arrayList.get(i7);
                            linkedList.remove(rVar2);
                            rVar2.d(new n0.k(dVar));
                        }
                    }
                }
                return true;
            case 17:
                p0.C0957i c0957i = this.f8135c;
                if (c0957i != null) {
                    if (c0957i.f8261a > 0 || a()) {
                        if (this.f8136d == null) {
                            this.f8136d = new r0.C0986b(this.f8137e, r0.C0986b.f8348i, p0.C0958j.f8263b, n0.e.f8085b);
                        }
                        r0.C0986b c0986b = this.f8136d;
                        c0986b.getClass();
                        K.a aVar3 = new K.a();
                        aVar3.f939b = 0;
                        aVar3.f942e = new m0.d[]{y0.c.f8483a};
                        aVar3.f940c = false;
                        aVar3.f941d = new Z0.h(i2, c0957i);
                        c0986b.b(2, aVar3.a());
                    }
                    this.f8135c = null;
                }
                return true;
            case 18:
                o0.t tVar = (o0.t) message.obj;
                if (tVar.f8184c == 0) {
                    p0.C0957i c0957i2 = new p0.C0957i(tVar.f8183b, java.util.Arrays.asList(tVar.f8182a));
                    if (this.f8136d == null) {
                        this.f8136d = new r0.C0986b(this.f8137e, r0.C0986b.f8348i, p0.C0958j.f8263b, n0.e.f8085b);
                    }
                    r0.C0986b c0986b2 = this.f8136d;
                    c0986b2.getClass();
                    K.a aVar4 = new K.a();
                    aVar4.f939b = 0;
                    aVar4.f942e = new m0.d[]{y0.c.f8483a};
                    aVar4.f940c = false;
                    aVar4.f941d = new Z0.h(i2, c0957i2);
                    c0986b2.b(2, aVar4.a());
                } else {
                    p0.C0957i c0957i3 = this.f8135c;
                    if (c0957i3 != null) {
                        java.util.List list = c0957i3.f8262b;
                        if (c0957i3.f8261a != tVar.f8183b || (list != null && list.size() >= tVar.f8185d)) {
                            this.f8145m.removeMessages(17);
                            p0.C0957i c0957i4 = this.f8135c;
                            if (c0957i4 != null) {
                                if (c0957i4.f8261a > 0 || a()) {
                                    if (this.f8136d == null) {
                                        this.f8136d = new r0.C0986b(this.f8137e, r0.C0986b.f8348i, p0.C0958j.f8263b, n0.e.f8085b);
                                    }
                                    r0.C0986b c0986b3 = this.f8136d;
                                    c0986b3.getClass();
                                    K.a aVar5 = new K.a();
                                    aVar5.f939b = 0;
                                    aVar5.f942e = new m0.d[]{y0.c.f8483a};
                                    aVar5.f940c = false;
                                    aVar5.f941d = new Z0.h(i2, c0957i4);
                                    c0986b3.b(2, aVar5.a());
                                }
                                this.f8135c = null;
                            }
                        } else {
                            p0.C0957i c0957i5 = this.f8135c;
                            p0.C0954f c0954f = tVar.f8182a;
                            if (c0957i5.f8262b == null) {
                                c0957i5.f8262b = new java.util.ArrayList();
                            }
                            c0957i5.f8262b.add(c0954f);
                        }
                    }
                    if (this.f8135c == null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(tVar.f8182a);
                        this.f8135c = new p0.C0957i(tVar.f8183b, arrayList2);
                        A0.a aVar6 = this.f8145m;
                        aVar6.sendMessageDelayed(aVar6.obtainMessage(17), tVar.f8184c);
                    }
                }
                return true;
            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                this.f8134b = false;
                return true;
            default:
                android.util.Log.w("GoogleApiManager", "Unknown message id: " + i3);
                return false;
        }
    }
}
