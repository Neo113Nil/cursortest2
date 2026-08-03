package P0;

/* renamed from: P0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0047e extends android.app.Activity implements androidx.lifecycle.j {

    /* renamed from: e, reason: collision with root package name */
    public static final int f1338e = android.view.View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1339a = false;

    /* renamed from: b, reason: collision with root package name */
    public P0.C0050h f1340b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.l f1341c;

    /* renamed from: d, reason: collision with root package name */
    public final android.window.OnBackInvokedCallback f1342d;

    public AbstractActivityC0047e() {
        int i2 = android.os.Build.VERSION.SDK_INT;
        this.f1342d = i2 < 33 ? null : i2 >= 34 ? new P0.C0046d(this) : new android.window.OnBackInvokedCallback() { // from class: P0.c
            public final void onBackInvoked() {
                P0.AbstractActivityC0047e.this.onBackPressed();
            }
        };
        this.f1341c = new androidx.lifecycle.l(this);
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.l b() {
        return this.f1341c;
    }

    public final java.lang.String c() {
        java.lang.String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new java.lang.NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final java.lang.String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final java.lang.String f() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle h2 = h();
            java.lang.String string = h2 != null ? h2.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final java.lang.String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            android.os.Bundle h2 = h();
            if (h2 != null) {
                return h2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final android.os.Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void i(boolean z2) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f1339a) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f1342d);
                this.f1339a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f1339a || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1342d);
        this.f1339a = false;
    }

    public final boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (e() != null || this.f1340b.f1353g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean k() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : e() == null;
    }

    public final boolean l(java.lang.String str) {
        P0.C0050h c0050h = this.f1340b;
        if (c0050h == null) {
            android.util.Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0050h.f1356j) {
            return true;
        }
        android.util.Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, android.content.Intent intent) {
        if (l("onActivityResult")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            if (c0050h.f1348b == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            java.util.Objects.toString(intent);
            N.a aVar = c0050h.f1348b.f7618d;
            if (!aVar.f()) {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((P1.h) aVar.f1109h).d(i2, i3, intent);
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (l("onBackPressed")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                flutterEngine.f7623i.f1866a.G("popRoute", null, null);
            } else {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:138|139|(1:141)|142|143|(1:145)|146|(1:148)(1:276)|149|(2:151|(1:153)(2:154|(1:156)(1:157)))|158|(4:160|161|162|(1:164)(2:262|(1:264)(2:265|266)))(1:275)|165|(1:167)|168|(1:170)|(1:172)(1:261)|173|(3:175|(1:177)(1:255)|178)(3:256|(1:258)(1:260)|259)|179|(8:181|(1:183)|184|(2:186|(3:188|(1:190)|191)(2:192|193))|194|(1:196)|197|198)|199|(1:201)|202|203|204|205|(2:(1:251)(1:209)|210)(1:252)|211|(2:212|(1:214)(1:215))|216|(2:217|(2:219|(1:221)(3:222|223|224))(3:225|226|(2:228|(2:229|(2:231|(1:233)(3:234|235|236))(3:237|238|(2:240|(2:242|(1:244))(2:245|246))(2:247|248))))(2:249|250)))) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x050a, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            android.os.Bundle h2 = h();
            if (h2 != null && (i2 = h2.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            i(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        P0.C0050h c0050h = new P0.C0050h(this);
        this.f1340b = c0050h;
        c0050h.c();
        if (c0050h.f1348b == null) {
            java.lang.String e2 = c0050h.f1347a.e();
            if (e2 != null) {
                if (Q0.h.f1610c == null) {
                    Q0.h.f1610c = new Q0.h(1);
                }
                io.flutter.embedding.engine.FlutterEngine flutterEngine = (io.flutter.embedding.engine.FlutterEngine) Q0.h.f1610c.f1611a.get(e2);
                c0050h.f1348b = flutterEngine;
                c0050h.f1353g = true;
                if (flutterEngine == null) {
                    throw new java.lang.IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + e2 + "'");
                }
            } else {
                c0050h.f1347a.getClass();
                c0050h.f1348b = null;
                java.lang.String stringExtra = c0050h.f1347a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (Q0.h.f1609b == null) {
                        synchronized (Q0.h.class) {
                            try {
                                if (Q0.h.f1609b == null) {
                                    Q0.h.f1609b = new Q0.h(0);
                                }
                            } finally {
                            }
                        }
                    }
                    Q0.g gVar = (Q0.g) Q0.h.f1609b.f1611a.get(stringExtra);
                    if (gVar == null) {
                        throw new java.lang.IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    P0.AbstractActivityC0047e abstractActivityC0047e = c0050h.f1347a;
                    abstractActivityC0047e.getClass();
                    Q0.f fVar = new Q0.f(abstractActivityC0047e);
                    c0050h.a(fVar);
                    c0050h.f1348b = gVar.a(fVar);
                    c0050h.f1353g = false;
                } else {
                    P0.AbstractActivityC0047e abstractActivityC0047e2 = c0050h.f1347a;
                    abstractActivityC0047e2.getClass();
                    android.content.Intent intent = abstractActivityC0047e2.getIntent();
                    if (intent.getExtras() != null) {
                        for (java.lang.String str : intent.getExtras().keySet()) {
                            Q0.c a2 = Q0.d.a(str);
                            if (a2 == null) {
                                a2 = Q0.d.a("--".concat(str));
                            }
                            if (a2 == null) {
                                a2 = Q0.d.a("--" + str + "=");
                            }
                            if (a2 != null) {
                                break;
                            }
                        }
                    }
                    P0.AbstractActivityC0047e abstractActivityC0047e3 = c0050h.f1347a;
                    abstractActivityC0047e3.getClass();
                    android.content.Intent intent2 = c0050h.f1347a.getIntent();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (intent2.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent2.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent2.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + intExtra);
                    }
                    if (intent2.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent2.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent2.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent2.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent2.getBooleanExtra("profile-startup", false)) {
                        arrayList.add("--profile-startup");
                    }
                    if (intent2.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent2.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent2.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    java.lang.String stringExtra2 = intent2.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent2.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent2.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent2.getStringExtra("trace-to-file"));
                    }
                    if (intent2.hasExtra("profile-microtasks")) {
                        arrayList.add("--profile-microtasks");
                    }
                    if (intent2.hasExtra("enable-impeller")) {
                        if (intent2.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent2.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent2.hasExtra("enable-hcpp-and-surface-control")) {
                        if (intent2.getBooleanExtra("enable-hcpp-and-surface-control", false)) {
                            arrayList.add("--enable-hcpp-and-surface-control=true");
                        } else {
                            arrayList.add("--enable-hcpp-and-surface-control=false");
                        }
                    }
                    if (intent2.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent2.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent2.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent2.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent2.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent2.getStringExtra("dart-flags"));
                    }
                    java.util.HashSet hashSet = new java.util.HashSet(arrayList);
                    Q0.g gVar2 = new Q0.g(abstractActivityC0047e3, (java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()]));
                    P0.AbstractActivityC0047e abstractActivityC0047e4 = c0050h.f1347a;
                    abstractActivityC0047e4.getClass();
                    Q0.f fVar2 = new Q0.f(abstractActivityC0047e4);
                    fVar2.f1606e = false;
                    fVar2.f1607f = c0050h.f1347a.k();
                    c0050h.a(fVar2);
                    c0050h.f1348b = gVar2.a(fVar2);
                    c0050h.f1353g = false;
                }
            }
        }
        c0050h.f1347a.getClass();
        N.a aVar = c0050h.f1348b.f7618d;
        androidx.lifecycle.l lVar = c0050h.f1347a.f1341c;
        aVar.getClass();
        g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            P0.C0050h c0050h2 = (P0.C0050h) aVar.f1108g;
            if (c0050h2 != null) {
                c0050h2.b();
            }
            aVar.e();
            aVar.f1108g = c0050h;
            P0.AbstractActivityC0047e abstractActivityC0047e5 = c0050h.f1347a;
            abstractActivityC0047e5.getClass();
            aVar.b(abstractActivityC0047e5, lVar);
            android.os.Trace.endSection();
            P0.AbstractActivityC0047e abstractActivityC0047e6 = c0050h.f1347a;
            abstractActivityC0047e6.getClass();
            P0.AbstractActivityC0047e abstractActivityC0047e7 = c0050h.f1347a;
            io.flutter.embedding.engine.FlutterEngine flutterEngine2 = c0050h.f1348b;
            abstractActivityC0047e7.getClass();
            c0050h.f1350d = new io.flutter.plugin.platform.e(abstractActivityC0047e7, flutterEngine2.f7626l, abstractActivityC0047e7);
            P0.AbstractActivityC0047e abstractActivityC0047e8 = c0050h.f1347a;
            io.flutter.embedding.engine.FlutterEngine flutterEngine3 = c0050h.f1348b;
            abstractActivityC0047e8.getClass();
            c0050h.f1351e = new N1.h(f1338e, abstractActivityC0047e6, flutterEngine3.f7628n);
            P0.AbstractActivityC0047e abstractActivityC0047e9 = c0050h.f1347a;
            io.flutter.embedding.engine.FlutterEngine flutterEngine4 = c0050h.f1348b;
            com.watchfacestudio.huasi_urx110.MainActivity mainActivity = (com.watchfacestudio.huasi_urx110.MainActivity) abstractActivityC0047e9;
            mainActivity.getClass();
            kotlin.jvm.internal.i.e(flutterEngine4, "flutterEngine");
            if (!mainActivity.f1340b.f1353g) {
                a.AbstractC0059a.w(flutterEngine4);
            }
            new I0.b(flutterEngine4.f7617c.f1658e, "com.watchfacestudio.huasi_urx110/lane_crossing").M(new E0.a(0, new C.j(mainActivity)));
            c0050h.f1356j = true;
            P0.C0050h c0050h3 = this.f1340b;
            c0050h3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0050h3.f1347a.k()) {
                Z0.k kVar = c0050h3.f1348b.f7625k;
                kVar.f1914e = true;
                Z0.j jVar = kVar.f1913d;
                if (jVar != null) {
                    jVar.c(Z0.k.a(bArr));
                    kVar.f1913d = null;
                    kVar.f1911b = bArr;
                } else if (kVar.f1915f) {
                    kVar.f1912c.G("push", Z0.k.a(bArr), new Z0.j(0, kVar, bArr));
                } else {
                    kVar.f1911b = bArr;
                }
            }
            c0050h3.f1347a.getClass();
            N.a aVar2 = c0050h3.f1348b.f7618d;
            if (aVar2.f()) {
                g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    java.util.Iterator it = ((java.util.HashSet) ((P1.h) aVar2.f1109h).f1488f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f1341c.d(androidx.lifecycle.d.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            }
            P0.C0050h c0050h4 = this.f1340b;
            boolean z2 = (d() == 1 ? (char) 1 : (char) 2) == 1;
            c0050h4.c();
            if (c0050h4.f1347a.d() == 1) {
                P0.AbstractActivityC0047e abstractActivityC0047e10 = c0050h4.f1347a;
                abstractActivityC0047e10.getClass();
                P0.l lVar2 = new P0.l(abstractActivityC0047e10, c0050h4.f1347a.d() != 1);
                c0050h4.f1347a.getClass();
                P0.AbstractActivityC0047e abstractActivityC0047e11 = c0050h4.f1347a;
                abstractActivityC0047e11.getClass();
                c0050h4.f1349c = new P0.t(abstractActivityC0047e11, lVar2);
            } else {
                P0.AbstractActivityC0047e abstractActivityC0047e12 = c0050h4.f1347a;
                abstractActivityC0047e12.getClass();
                P0.n nVar = new P0.n(abstractActivityC0047e12);
                nVar.setOpaque(c0050h4.f1347a.d() == 1);
                c0050h4.f1347a.getClass();
                P0.AbstractActivityC0047e abstractActivityC0047e13 = c0050h4.f1347a;
                abstractActivityC0047e13.getClass();
                c0050h4.f1349c = new P0.t(abstractActivityC0047e13, nVar);
            }
            c0050h4.f1349c.f1392g.add(c0050h4.f1358l);
            c0050h4.f1347a.getClass();
            P0.t tVar = c0050h4.f1349c;
            io.flutter.embedding.engine.FlutterEngine flutterEngine5 = c0050h4.f1348b;
            tVar.getClass();
            java.util.Objects.toString(flutterEngine5);
            if (tVar.c()) {
                if (flutterEngine5 != tVar.f1394i) {
                    tVar.a();
                }
                c0050h4.f1349c.setId(f1338e);
                if (z2) {
                    P0.t tVar2 = c0050h4.f1349c;
                    if (c0050h4.f1347a.d() != 1) {
                        throw new java.lang.IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0050h4.f1352f != null) {
                        tVar2.getViewTreeObserver().removeOnPreDrawListener(c0050h4.f1352f);
                    }
                    c0050h4.f1352f = new P0.ViewTreeObserverOnPreDrawListenerC0049g(c0050h4, tVar2);
                    tVar2.getViewTreeObserver().addOnPreDrawListener(c0050h4.f1352f);
                }
                setContentView(c0050h4.f1349c);
                android.view.Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (android.os.Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
                return;
            }
            tVar.f1394i = flutterEngine5;
            io.flutter.embedding.engine.renderer.h hVar = flutterEngine5.f7616b;
            tVar.f1393h = hVar.f7678c;
            tVar.f1390e.a(hVar);
            P0.C0048f c0048f = tVar.f1408x;
            hVar.a(c0048f);
            if (tVar.f1386a) {
                hVar.f7676a.addResizingFlutterUiListener(tVar.f1407w);
            }
            tVar.f1396k = new x0.e(tVar, tVar.f1394i.f7622h);
            io.flutter.embedding.engine.FlutterEngine flutterEngine6 = tVar.f1394i;
            tVar.f1397l = new io.flutter.plugin.editing.j(tVar, flutterEngine6.f7632r, flutterEngine6.f7627m, flutterEngine6.f7633s, flutterEngine6.t);
            android.view.textservice.TextServicesManager textServicesManager = (android.view.textservice.TextServicesManager) tVar.getContext().getSystemService("textservices");
            tVar.f1403r = textServicesManager;
            tVar.f1398m = new io.flutter.plugin.editing.g(textServicesManager, tVar.f1394i.f7630p);
            new x0.e(tVar, tVar.f1397l.f7725b, tVar.f1394i.f7627m);
            tVar.f1399n = tVar.f1394i.f7619e;
            tVar.f1400o = new I0.b(tVar);
            tVar.f1401p = new P0.C0044b(tVar.f1394i.f7616b, false);
            io.flutter.view.h hVar2 = new io.flutter.view.h(tVar, flutterEngine5.f7620f, (android.view.accessibility.AccessibilityManager) tVar.getContext().getSystemService("accessibility"), tVar.getContext().getContentResolver(), flutterEngine5.f7634u);
            tVar.f1402q = hVar2;
            hVar2.f7901r = tVar.f1405u;
            boolean isEnabled = hVar2.f7886c.isEnabled();
            boolean isTouchExplorationEnabled = tVar.f1402q.f7886c.isTouchExplorationEnabled();
            if (tVar.f1394i.f7616b.f7676a.getIsSoftwareRenderingEnabled()) {
                tVar.setWillNotDraw(false);
            } else {
                tVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            io.flutter.embedding.engine.FlutterEngine flutterEngine7 = tVar.f1394i;
            flutterEngine7.f7633s.f7773h.f7740a = tVar.f1402q;
            new P0.C0044b(flutterEngine7.f7616b, true);
            io.flutter.embedding.engine.FlutterEngine flutterEngine8 = tVar.f1394i;
            flutterEngine8.t.f7757f.f7740a = tVar.f1402q;
            new P0.C0044b(flutterEngine8.f7616b, true);
            tVar.f1397l.f7725b.restartInput(tVar);
            tVar.d();
            tVar.getContext().getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("show_password"), false, tVar.f1406v);
            tVar.e();
            io.flutter.plugin.platform.k kVar2 = flutterEngine5.f7633s;
            kVar2.f7768c = tVar;
            int i3 = 0;
            while (true) {
                android.util.SparseArray sparseArray = kVar2.f7779n;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                kVar2.f7768c.addView((io.flutter.plugin.platform.g) sparseArray.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                android.util.SparseArray sparseArray2 = kVar2.f7777l;
                if (i4 >= sparseArray2.size()) {
                    android.util.SparseArray sparseArray3 = kVar2.f7776k;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new java.lang.ClassCastException();
                    }
                    io.flutter.plugin.platform.j jVar2 = flutterEngine5.t;
                    jVar2.f7754c = tVar;
                    int i5 = 0;
                    while (true) {
                        android.util.SparseArray sparseArray4 = jVar2.f7759h;
                        if (i5 >= sparseArray4.size()) {
                            android.util.SparseArray sparseArray5 = jVar2.f7758g;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new java.lang.ClassCastException();
                            }
                            java.util.Iterator it2 = tVar.f1395j.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new java.lang.ClassCastException();
                            }
                            if (tVar.f1393h) {
                                c0048f.b();
                            }
                        } else {
                            if (sparseArray4.valueAt(i5) != null) {
                                throw new java.lang.ClassCastException();
                            }
                            jVar2.f7754c.addView(null);
                            i5++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i4) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    kVar2.f7768c.addView(null);
                    i4++;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (l("onDestroy")) {
            this.f1340b.e();
            this.f1340b.f();
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f1342d);
            this.f1339a = false;
        }
        P0.C0050h c0050h = this.f1340b;
        if (c0050h != null) {
            c0050h.f1347a = null;
            c0050h.f1348b = null;
            c0050h.f1349c = null;
            c0050h.f1350d = null;
            c0050h.f1351e = null;
            this.f1340b = null;
        }
        this.f1341c.d(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (l("onNewIntent")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            N.a aVar = flutterEngine.f7618d;
            if (aVar.f()) {
                g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    java.util.Iterator it = ((java.util.HashSet) ((P1.h) aVar.f1109h).f1486d).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            java.lang.String d2 = c0050h.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            Z0.a aVar2 = c0050h.f1348b.f7623i;
            aVar2.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("location", d2);
            aVar2.f1866a.G("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (l("onPause")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            c0050h.f1347a.getClass();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7621g;
                cVar.a(3, cVar.f1870c);
            }
        }
        this.f1341c.d(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (l("onPostResume")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            if (c0050h.f1348b == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = c0050h.f1350d;
            if (eVar != null) {
                eVar.b();
            }
            java.util.Iterator it = c0050h.f1348b.f7633s.f7774i.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.q) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, java.lang.String[] strArr, int[] iArr) {
        if (l("onRequestPermissionsResult")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            if (c0050h.f1348b == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            java.util.Arrays.toString(strArr);
            java.util.Arrays.toString(iArr);
            N.a aVar = c0050h.f1348b.f7618d;
            if (!aVar.f()) {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                java.util.Iterator it = ((java.util.HashSet) ((P1.h) aVar.f1109h).f1484b).iterator();
                if (!it.hasNext()) {
                    android.os.Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f1341c.d(androidx.lifecycle.d.ON_RESUME);
        if (l("onResume")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            c0050h.f1348b.f7616b.d();
            c0050h.f1347a.getClass();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7621g;
                cVar.a(2, cVar.f1870c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l("onSaveInstanceState")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            if (c0050h.f1347a.k()) {
                bundle.putByteArray("framework", c0050h.f1348b.f7625k.f1911b);
            }
            c0050h.f1347a.getClass();
            android.os.Bundle bundle2 = new android.os.Bundle();
            N.a aVar = c0050h.f1348b.f7618d;
            if (aVar.f()) {
                g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    java.util.Iterator it = ((java.util.HashSet) ((P1.h) aVar.f1109h).f1488f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    try {
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0050h.f1347a.e() == null || c0050h.f1347a.j()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0050h.f1347a.f1339a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        java.lang.String str;
        java.lang.String c2;
        android.os.Bundle h2;
        super.onStart();
        this.f1341c.d(androidx.lifecycle.d.ON_START);
        if (l("onStart")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            if (c0050h.f1347a.e() == null && !c0050h.f1348b.f7617c.f1659f) {
                java.lang.String g2 = c0050h.f1347a.g();
                if (g2 == null) {
                    P0.AbstractActivityC0047e abstractActivityC0047e = c0050h.f1347a;
                    abstractActivityC0047e.getClass();
                    g2 = c0050h.d(abstractActivityC0047e.getIntent());
                    if (g2 == null) {
                        g2 = "/";
                    }
                }
                P0.AbstractActivityC0047e abstractActivityC0047e2 = c0050h.f1347a;
                abstractActivityC0047e2.getClass();
                try {
                    h2 = abstractActivityC0047e2.h();
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                if (h2 != null) {
                    str = h2.getString("io.flutter.EntrypointUri");
                    c0050h.f1347a.f();
                    c0050h.f1348b.f7623i.f1866a.G("setInitialRoute", g2, null);
                    c2 = c0050h.f1347a.c();
                    if (c2 != null || c2.isEmpty()) {
                        c2 = (java.lang.String) ((U0.c) I0.b.F().f657b).f1736e.f1039c;
                    }
                    c0050h.f1348b.f7617c.a(str != null ? new R0.a(c2, c0050h.f1347a.f()) : new R0.a(c2, str, c0050h.f1347a.f()), (java.util.List) c0050h.f1347a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0050h.f1347a.f();
                c0050h.f1348b.f7623i.f1866a.G("setInitialRoute", g2, null);
                c2 = c0050h.f1347a.c();
                if (c2 != null) {
                }
                c2 = (java.lang.String) ((U0.c) I0.b.F().f657b).f1736e.f1039c;
                c0050h.f1348b.f7617c.a(str != null ? new R0.a(c2, c0050h.f1347a.f()) : new R0.a(c2, str, c0050h.f1347a.f()), (java.util.List) c0050h.f1347a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            java.lang.Integer num = c0050h.f1357k;
            if (num != null) {
                c0050h.f1349c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (l("onStop")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            c0050h.f1347a.getClass();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7621g;
                cVar.a(5, cVar.f1870c);
            }
            c0050h.f1357k = java.lang.Integer.valueOf(c0050h.f1349c.getVisibility());
            c0050h.f1349c.setVisibility(8);
            io.flutter.embedding.engine.FlutterEngine flutterEngine2 = c0050h.f1348b;
            if (flutterEngine2 != null) {
                flutterEngine2.f7616b.b(40);
            }
        }
        this.f1341c.d(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (l("onTrimMemory")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                if (c0050h.f1355i && i2 >= 10) {
                    io.flutter.embedding.engine.FlutterJNI flutterJNI = flutterEngine.f7617c.f1654a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    Z0.b bVar = c0050h.f1348b.f7631q;
                    bVar.getClass();
                    java.util.HashMap hashMap = new java.util.HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    bVar.f1867a.g(hashMap, null);
                }
                c0050h.f1348b.f7616b.b(i2);
                io.flutter.plugin.platform.k kVar = c0050h.f1348b.f7633s;
                if (i2 < 40) {
                    kVar.getClass();
                    return;
                }
                java.util.Iterator it = kVar.f7774i.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.q) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (l("onUserLeaveHint")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            N.a aVar = flutterEngine.f7618d;
            if (!aVar.f()) {
                android.util.Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            g1.AbstractC0130a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                java.util.Iterator it = ((java.util.HashSet) ((P1.h) aVar.f1109h).f1487e).iterator();
                if (!it.hasNext()) {
                    android.os.Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (l("onWindowFocusChanged")) {
            P0.C0050h c0050h = this.f1340b;
            c0050h.c();
            c0050h.f1347a.getClass();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                Z0.c cVar = flutterEngine.f7621g;
                if (z2) {
                    cVar.a(cVar.f1868a, true);
                } else {
                    cVar.a(cVar.f1868a, false);
                }
            }
        }
    }
}
