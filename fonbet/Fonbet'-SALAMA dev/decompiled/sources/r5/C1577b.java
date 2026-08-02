package r5;

import A5.y;
import D3.j;
import G4.C0282o;
import W5.S1;
import Y4.D;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.w;
import d6.C0977k;
import e6.C1054c;
import h5.C1212d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.r;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import l.C1373k;
import p6.AbstractC1539a;
import s5.i;
import u5.AbstractC1647a;
import u5.C1648b;
import u5.C1649c;
import w1.C1719l1;
import w1.C1726n0;
import w1.C1761y0;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import z5.C1819a;
import z5.C1820b;
import z5.C1828j;
import z5.l;
import z5.m;
import z5.s;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1577b implements S5.b {

    /* renamed from: w, reason: collision with root package name */
    public static long f16029w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap f16030x = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f16031a;

    /* renamed from: b, reason: collision with root package name */
    public final k f16032b;

    /* renamed from: c, reason: collision with root package name */
    public final C1373k f16033c;

    /* renamed from: d, reason: collision with root package name */
    public final C1578c f16034d;

    /* renamed from: e, reason: collision with root package name */
    public final B5.a f16035e;

    /* renamed from: f, reason: collision with root package name */
    public final C1726n0 f16036f;

    /* renamed from: g, reason: collision with root package name */
    public final S1 f16037g;

    /* renamed from: h, reason: collision with root package name */
    public final C1761y0 f16038h;

    /* renamed from: i, reason: collision with root package name */
    public final C1819a f16039i;
    public final C1819a j;

    /* renamed from: k, reason: collision with root package name */
    public final j f16040k;

    /* renamed from: l, reason: collision with root package name */
    public final C0977k f16041l;

    /* renamed from: m, reason: collision with root package name */
    public final C1828j f16042m;

    /* renamed from: n, reason: collision with root package name */
    public final l f16043n;

    /* renamed from: o, reason: collision with root package name */
    public final m f16044o;

    /* renamed from: p, reason: collision with root package name */
    public final R4.c f16045p;

    /* renamed from: q, reason: collision with root package name */
    public final s f16046q;

    /* renamed from: r, reason: collision with root package name */
    public final io.flutter.plugin.platform.s f16047r;

    /* renamed from: s, reason: collision with root package name */
    public final r f16048s;

    /* renamed from: u, reason: collision with root package name */
    public final long f16050u;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f16049t = new HashSet();

    /* renamed from: v, reason: collision with root package name */
    public final C1212d f16051v = new C1212d(this, 1);

    public C1577b(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.s sVar) {
        AssetManager assets;
        FlutterJNI flutterJNI2;
        t tVar;
        FlutterJNI flutterJNI3;
        w wVar;
        B5.a aVar;
        C1649c c1649c;
        long j = f16029w;
        f16029w = 1 + j;
        this.f16050u = j;
        f16030x.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        t l02 = t.l0();
        if (flutterJNI == null) {
            Object obj = l02.f8077c;
            flutterJNI2 = new FlutterJNI();
        } else {
            flutterJNI2 = flutterJNI;
        }
        this.f16031a = flutterJNI2;
        C1373k c1373k = new C1373k(flutterJNI2, assets, this.f16050u);
        this.f16033c = c1373k;
        flutterJNI2.setPlatformMessageHandler((i) c1373k.f14855e);
        t.l0().getClass();
        this.f16036f = new C1726n0(c1373k, flutterJNI2);
        new A5.s(c1373k, "flutter/deferredcomponent", y.f688b, null).b(new R4.c(new C1820b(), 27));
        t.l0().getClass();
        new HashMap();
        this.f16037g = new S1(c1373k);
        w wVar2 = new w(c1373k, 26);
        this.f16038h = new C1761y0(c1373k);
        this.f16039i = new C1819a(c1373k, 1);
        this.j = new C1819a(c1373k, 0);
        this.f16041l = new C0977k(c1373k, 24);
        w wVar3 = new w(c1373k, context.getPackageManager());
        this.f16040k = new j(c1373k);
        C1828j c1828j = new C1828j();
        new A5.s(c1373k, "flutter/scribe", A5.m.f675a, null).b(new C1761y0(c1828j, 27));
        this.f16042m = c1828j;
        this.f16043n = new l(c1373k);
        m mVar = new m();
        new A5.s(c1373k, "flutter/spellcheck", y.f688b, null).b(new C1719l1(mVar));
        this.f16044o = mVar;
        this.f16045p = new R4.c(c1373k);
        this.f16046q = new s(c1373k);
        B5.a aVar2 = new B5.a(context, wVar2);
        this.f16035e = aVar2;
        C1649c c1649c2 = (C1649c) l02.f8076b;
        if (flutterJNI2.isAttached()) {
            tVar = l02;
            flutterJNI3 = flutterJNI2;
            wVar = wVar3;
            aVar = aVar2;
            c1649c = c1649c2;
        } else {
            Context applicationContext = context.getApplicationContext();
            C1054c c1054c = new C1054c(25);
            if (((C1054c) c1649c2.f16878c) == null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("startInitialization must be called on the main thread");
                }
                S5.a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    c1649c2.f16878c = c1054c;
                    c1649c2.f16876a = SystemClock.uptimeMillis();
                    c1649c2.f16879d = AbstractC1647a.a(applicationContext2);
                    io.flutter.view.r p5 = io.flutter.view.r.p((DisplayManager) applicationContext2.getSystemService("display"), (FlutterJNI) c1649c2.f16880e);
                    ((FlutterJNI) p5.f14351b).setAsyncWaitForVsyncDelegate((io.flutter.view.a) p5.f14353d);
                    c1649c2.f16882g = ((ExecutorService) c1649c2.f16881f).submit(new E2.f(7, c1649c2, applicationContext2));
                    Trace.endSection();
                } finally {
                }
            }
            wVar = wVar3;
            tVar = l02;
            aVar = aVar2;
            if (c1649c2.f16877b) {
                c1649c = c1649c2;
                flutterJNI3 = flutterJNI2;
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
                }
                if (((C1054c) c1649c2.f16878c) == null) {
                    throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
                }
                try {
                    S5.a.b("FlutterLoader#ensureInitializationComplete");
                    try {
                        C1648b c1648b = (C1648b) c1649c2.f16882g.get();
                        ArrayList arrayList = new ArrayList();
                        flutterJNI3 = flutterJNI2;
                        arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                        StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                        sb.append((String) ((C0282o) c1649c2.f16879d).f3013e);
                        String str = File.separator;
                        sb.append(str);
                        sb.append("libflutter.so");
                        arrayList.add(sb.toString());
                        arrayList.add("--aot-shared-library-name=".concat((String) ((C0282o) c1649c2.f16879d).f3010b));
                        arrayList.add("--aot-shared-library-name=" + ((String) ((C0282o) c1649c2.f16879d).f3013e) + str + ((String) ((C0282o) c1649c2.f16879d).f3010b));
                        StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                        sb2.append(c1648b.f16875b);
                        arrayList.add(sb2.toString());
                        arrayList.add("--domain-network-policy=".concat((String) ((C0282o) c1649c2.f16879d).f3012d));
                        ((C1054c) c1649c2.f16878c).getClass();
                        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        int i7 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                        if (i7 == 0) {
                            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                            i7 = (int) ((r11.totalMem / 1000000.0d) / 2.0d);
                        }
                        arrayList.add("--old-gen-heap-size=" + i7);
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                        arrayList.add("--prefetched-default-font-manager");
                        if (bundle != null) {
                            if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                                if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                    arrayList.add("--enable-impeller=true");
                                } else {
                                    arrayList.add("--enable-impeller=false");
                                }
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                                arrayList.add("--enable-vulkan-validation");
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                                arrayList.add("--enable-opengl-gpu-tracing");
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                                arrayList.add("--enable-vulkan-gpu-tracing");
                            }
                            if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                                arrayList.add("--no-enable-merged-platform-ui-thread");
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                                arrayList.add("--enable-surface-control");
                            }
                            String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                            if (string != null) {
                                arrayList.add("--impeller-backend=".concat(string));
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                                arrayList.add("--impeller-lazy-shader-mode");
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                                arrayList.add("--impeller-antialias-lines");
                            }
                        }
                        arrayList.add("--leak-vm=".concat(bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                        c1649c = c1649c2;
                        ((FlutterJNI) c1649c2.f16880e).init(context, (String[]) arrayList.toArray(new String[0]), null, c1648b.f16874a, c1648b.f16875b, SystemClock.uptimeMillis() - c1649c2.f16876a, Build.VERSION.SDK_INT);
                        c1649c.f16877b = true;
                        Trace.endSection();
                    } finally {
                    }
                } catch (Exception e7) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e7);
                    throw new RuntimeException(e7);
                }
            }
        }
        r rVar = new r();
        rVar.f14170a = sVar.f14186a;
        FlutterJNI flutterJNI4 = flutterJNI3;
        rVar.f14174e = flutterJNI4;
        flutterJNI4.addEngineLifecycleListener(this.f16051v);
        flutterJNI4.setPlatformViewsController(sVar);
        flutterJNI4.setPlatformViewsController2(rVar);
        B5.a aVar3 = aVar;
        flutterJNI4.setLocalizationPlugin(aVar3);
        tVar.getClass();
        flutterJNI4.setDeferredComponentManager(null);
        if (!flutterJNI4.isAttached()) {
            flutterJNI4.attachToNative();
            if (!flutterJNI4.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f16032b = new k(flutterJNI4);
        this.f16047r = sVar;
        this.f16048s = rVar;
        C1578c c1578c = new C1578c(context.getApplicationContext(), this, c1649c);
        this.f16034d = c1578c;
        aVar3.b(context.getResources().getConfiguration());
        if (((C0282o) c1649c.f16879d).f3009a) {
            AbstractC1539a.h(this);
        }
        D.g(context, this);
        c1578c.b(new D5.a(wVar));
    }

    public final void a() {
        Iterator it = this.f16049t.iterator();
        while (it.hasNext()) {
            ((InterfaceC1576a) it.next()).a();
        }
        C1578c c1578c = this.f16034d;
        c1578c.f();
        HashMap hashMap = (HashMap) c1578c.f16053b;
        Iterator it2 = new HashSet(hashMap.keySet()).iterator();
        while (it2.hasNext()) {
            Class cls = (Class) it2.next();
            InterfaceC1783c interfaceC1783c = (InterfaceC1783c) hashMap.get(cls);
            if (interfaceC1783c != null) {
                S5.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                try {
                    if (interfaceC1783c instanceof InterfaceC1789a) {
                        if (c1578c.h()) {
                            ((InterfaceC1789a) interfaceC1783c).onDetachedFromActivity();
                        }
                        ((HashMap) c1578c.f16054c).remove(cls);
                    }
                    interfaceC1783c.onDetachedFromEngine((C1782b) c1578c.f16056e);
                    hashMap.remove(cls);
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        hashMap.clear();
        while (true) {
            io.flutter.plugin.platform.s sVar = this.f16047r;
            SparseArray sparseArray = sVar.f14195k;
            if (sparseArray.size() <= 0) {
                break;
            }
            sVar.f14206v.f(sparseArray.keyAt(0));
        }
        while (true) {
            r rVar = this.f16048s;
            SparseArray sparseArray2 = rVar.f14178i;
            if (sparseArray2.size() <= 0) {
                ((FlutterJNI) this.f16033c.f14853c).setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = this.f16031a;
                flutterJNI.removeEngineLifecycleListener(this.f16051v);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                t.l0().getClass();
                f16030x.remove(Long.valueOf(this.f16050u));
                return;
            }
            rVar.f14184p.f(sparseArray2.keyAt(0));
        }
    }
}
