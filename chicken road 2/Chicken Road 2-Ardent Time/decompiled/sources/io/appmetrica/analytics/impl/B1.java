package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class B1 implements io.appmetrica.analytics.impl.A1, io.appmetrica.analytics.impl.InterfaceC0679s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4082a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f4083b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0862z1 f4084c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0218a4 f4085d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J1 f4086e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Sg f4087f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0327ea f4088g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0371g2 f4089h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C1 f4090i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0309dh f4091j;

    public B1(android.content.Context context, io.appmetrica.analytics.impl.InterfaceC0862z1 interfaceC0862z1) {
        this(context, interfaceC0862z1, new io.appmetrica.analytics.impl.C0297d5(context));
    }

    public final void a() {
        this.f4086e.c(new io.appmetrica.analytics.impl.Wo(2, this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(android.content.Intent intent) {
        this.f4086e.d(intent);
        if (intent != null) {
            java.lang.String action = intent.getAction();
            android.net.Uri data = intent.getData();
            java.lang.String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !java.util.Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int parseInt = java.lang.Integer.parseInt(data.getQueryParameter("pid"));
            this.f4085d.a(encodedAuthority, java.lang.Integer.valueOf(parseInt), data.getQueryParameter("psid"));
            this.f4089h.a(parseInt);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(android.content.Intent intent) {
        io.appmetrica.analytics.impl.J1 j12 = this.f4086e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        java.lang.String action = intent.getAction();
        if (!android.text.TextUtils.isEmpty(action)) {
            j12.f4474a.a(action, java.lang.Integer.valueOf(io.appmetrica.analytics.impl.J1.a(intent)));
        }
        for (java.util.Map.Entry entry : j12.f4475b.entrySet()) {
            io.appmetrica.analytics.impl.I1 i12 = (io.appmetrica.analytics.impl.I1) entry.getKey();
            if (((io.appmetrica.analytics.impl.H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public final void d(android.content.Intent intent) {
        io.appmetrica.analytics.impl.C0560na.f6484I.v().a(io.appmetrica.analytics.impl.AbstractC0380gb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        io.appmetrica.analytics.impl.C0560na.f6484I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onCreate() {
        if (this.f4082a) {
            io.appmetrica.analytics.impl.C0560na.f6484I.v().a(this.f4083b.getResources().getConfiguration());
        } else {
            this.f4088g.b(this.f4083b);
            io.appmetrica.analytics.impl.C0560na c0560na = io.appmetrica.analytics.impl.C0560na.f6484I;
            synchronized (c0560na) {
                c0560na.f6486B.initAsync();
                c0560na.f6511u.a(c0560na.f6492a);
                c0560na.f6511u.a(new io.appmetrica.analytics.impl.C0470jo(c0560na.f6486B));
                io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator.init(c0560na.f6492a, new io.appmetrica.analytics.impl.C0348f5(new io.appmetrica.analytics.impl.C0620pi(c0560na.h()), new io.appmetrica.analytics.impl.C0607p5(c0560na.f6492a)));
                c0560na.l().a(c0560na.f6508q);
                c0560na.E();
            }
            io.appmetrica.analytics.impl.Wj.f5222a.e();
            io.appmetrica.analytics.impl.C0417hm c0417hm = io.appmetrica.analytics.impl.C0560na.f6484I.f6511u;
            c0417hm.b();
            io.appmetrica.analytics.impl.C0365fm b2 = c0417hm.b();
            io.appmetrica.analytics.impl.C0829xk p2 = io.appmetrica.analytics.impl.C0560na.f6484I.p();
            p2.a(new io.appmetrica.analytics.impl.C0286ck(new io.appmetrica.analytics.impl.C0227ad(this.f4086e)), b2);
            c0417hm.a(p2);
            ((io.appmetrica.analytics.impl.Al) io.appmetrica.analytics.impl.C0560na.f6484I.z()).getClass();
            a();
            io.appmetrica.analytics.impl.C0560na.f6484I.m().init();
            io.appmetrica.analytics.impl.C0560na.f6484I.c().init();
            io.appmetrica.analytics.impl.C1 c1 = this.f4090i;
            android.content.Context context = this.f4083b;
            io.appmetrica.analytics.impl.C0218a4 c0218a4 = this.f4085d;
            c1.getClass();
            this.f4087f = new io.appmetrica.analytics.impl.Sg(context, c0218a4);
            android.content.Context context2 = this.f4083b;
            io.appmetrica.analytics.impl.AbstractC0732u1.f6870a.b(context2);
            io.appmetrica.analytics.AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            android.content.Context context3 = this.f4083b;
            io.appmetrica.analytics.impl.Sg sg = this.f4087f;
            io.appmetrica.analytics.impl.Od r2 = io.appmetrica.analytics.impl.C0560na.k().r();
            io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor d2 = io.appmetrica.analytics.impl.C0560na.k().w().d();
            io.appmetrica.analytics.impl.C0375g6 c0375g6 = new io.appmetrica.analytics.impl.C0375g6(context3, sg, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new io.appmetrica.analytics.impl.X(), new io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor(), "previous");
            io.appmetrica.analytics.impl.C0375g6 c0375g62 = new io.appmetrica.analytics.impl.C0375g6(context3, sg, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new io.appmetrica.analytics.impl.C0535mb(), d2, "actual");
            java.io.File crashesDirectory = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                io.appmetrica.analytics.impl.FileObserverC0323e6 fileObserverC0323e6 = new io.appmetrica.analytics.impl.FileObserverC0323e6(crashesDirectory, c0375g62, new io.appmetrica.analytics.impl.C0224aa());
                d2.execute(new io.appmetrica.analytics.impl.Uf(crashesDirectory, c0375g6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0323e6.startWatching();
                io.appmetrica.analytics.impl.C0560na.f6484I.f6489E.storeReference(fileObserverC0323e6);
            }
            r2.getClass();
            java.io.File nativeCrashDirectory = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getNativeCrashDirectory(context3);
            java.lang.String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                r2.f4769a.init(context3, new io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig(absolutePath));
                java.util.List<io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash> allCrashes = r2.f4769a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    io.appmetrica.analytics.impl.Jd b3 = r2.f4770b.b(context3, sg);
                    java.util.Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        b3.newCrash((io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash) it.next());
                    }
                }
                r2.f4769a.setDefaultCrashHandler(r2.f4770b.a(context3, sg));
            }
            new io.appmetrica.analytics.impl.I5(u0.AbstractC0995a.q(new io.appmetrica.analytics.impl.Yg())).run();
            this.f4082a = true;
        }
        io.appmetrica.analytics.impl.C0560na.f6484I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        io.appmetrica.analytics.impl.Fb l2 = io.appmetrica.analytics.impl.C0560na.f6484I.l();
        synchronized (l2) {
            java.util.Iterator it = l2.f4289c.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.impl.InterfaceC0518lk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(android.os.Bundle bundle) {
        io.appmetrica.analytics.impl.Bf bf;
        bundle.setClassLoader(io.appmetrica.analytics.impl.Bf.class.getClassLoader());
        java.lang.String str = io.appmetrica.analytics.impl.Bf.f4122c;
        try {
            bf = (io.appmetrica.analytics.impl.Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (java.lang.Throwable unused) {
            bf = null;
        }
        java.lang.Integer asInteger = bf != null ? bf.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f4089h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i2, android.os.Bundle bundle) {
        this.f4091j.getClass();
        java.util.List list = (java.util.List) io.appmetrica.analytics.impl.C0560na.f6484I.f6512v.f5859a.get(java.lang.Integer.valueOf(i2));
        if (list == null) {
            list = i1.C0199r.f3325a;
        }
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.InterfaceC0312dk) it.next()).reportData(i2, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(android.os.Bundle bundle) {
        io.appmetrica.analytics.impl.Bf bf;
        bundle.setClassLoader(io.appmetrica.analytics.impl.Bf.class.getClassLoader());
        java.lang.String str = io.appmetrica.analytics.impl.Bf.f4122c;
        try {
            bf = (io.appmetrica.analytics.impl.Bf) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (java.lang.Throwable unused) {
            bf = null;
        }
        java.lang.Integer asInteger = bf != null ? bf.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f4089h.c(asInteger.intValue());
        }
    }

    public B1(android.content.Context context, io.appmetrica.analytics.impl.InterfaceC0862z1 interfaceC0862z1, io.appmetrica.analytics.impl.C0297d5 c0297d5) {
        this(context, interfaceC0862z1, new io.appmetrica.analytics.impl.C0218a4(context, c0297d5), new io.appmetrica.analytics.impl.J1(), io.appmetrica.analytics.impl.C0327ea.f5833d, io.appmetrica.analytics.impl.C0560na.k().e(), new io.appmetrica.analytics.impl.C1());
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(android.content.Intent intent) {
        io.appmetrica.analytics.impl.J1 j12 = this.f4086e;
        if (intent == null) {
            j12.getClass();
            return;
        }
        j12.getClass();
        java.lang.String action = intent.getAction();
        if (!android.text.TextUtils.isEmpty(action)) {
            j12.f4474a.a(action, java.lang.Integer.valueOf(io.appmetrica.analytics.impl.J1.a(intent)));
        }
        for (java.util.Map.Entry entry : j12.f4475b.entrySet()) {
            io.appmetrica.analytics.impl.I1 i12 = (io.appmetrica.analytics.impl.I1) entry.getKey();
            if (((io.appmetrica.analytics.impl.H1) entry.getValue()).a(intent)) {
                i12.a(intent);
            }
        }
    }

    public B1(android.content.Context context, io.appmetrica.analytics.impl.InterfaceC0862z1 interfaceC0862z1, io.appmetrica.analytics.impl.C0218a4 c0218a4, io.appmetrica.analytics.impl.J1 j12, io.appmetrica.analytics.impl.C0327ea c0327ea, io.appmetrica.analytics.impl.C0371g2 c0371g2, io.appmetrica.analytics.impl.C1 c1) {
        this.f4082a = false;
        this.f4083b = context;
        this.f4084c = interfaceC0862z1;
        this.f4085d = c0218a4;
        this.f4086e = j12;
        this.f4088g = c0327ea;
        this.f4089h = c0371g2;
        this.f4090i = c1;
        this.f4091j = new io.appmetrica.analytics.impl.C0309dh();
    }

    public final void a(android.os.Bundle bundle) {
        bundle.setClassLoader(io.appmetrica.analytics.internal.CounterConfiguration.class.getClassLoader());
        io.appmetrica.analytics.impl.P5.b(bundle);
        io.appmetrica.analytics.impl.Sg sg = this.f4087f;
        if (sg != null) {
            sg.a(io.appmetrica.analytics.impl.P5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(android.content.Intent intent, int i2) {
        ((io.appmetrica.analytics.impl.C0731u0) this.f4084c).f6869a.stopSelf(i2);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(android.content.Intent intent, int i2, int i3) {
        ((io.appmetrica.analytics.impl.C0731u0) this.f4084c).f6869a.stopSelf(i3);
    }
}
