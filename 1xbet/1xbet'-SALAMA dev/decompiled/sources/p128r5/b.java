package p128r5;

import A5.y;
import B5.a;
import D3.j;
import E2.f;
import G4.C0282o;
import R4.c;
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
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.r;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import p057h5.d;
import p135s5.i;
import p155w1.C1010l1;
import p155w1.C1017n0;
import p155w1.C1052y0;
import p174z5.l;
import p174z5.m;
import p174z5.s;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements S5.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static long f16035w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap f16036x = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f16037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f16038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p078l.k f16039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f16040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f16041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1017n0 f16042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S1 f16043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1052y0 f16044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p174z5.a f16045i;
    public final p174z5.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f16046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p028d6.k f16047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p174z5.j f16048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f16049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f16050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f16051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f16052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final io.flutter.plugin.platform.s f16053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f16054s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f16056u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f16055t = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f16057v = new d(this, 1);

    public b(Context context, FlutterJNI flutterJNI, io.flutter.plugin.platform.s sVar) throws Exception {
        AssetManager assets;
        FlutterJNI flutterJNI2;
        t tVar;
        w wVar;
        a aVar;
        p148u5.c cVar;
        long j = f16035w;
        f16035w = 1 + j;
        this.f16056u = j;
        f16036x.put(Long.valueOf(j), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        t tVarL0 = t.l0();
        if (flutterJNI == null) {
            Object obj = tVarL0.f8077c;
            flutterJNI2 = new FlutterJNI();
        } else {
            flutterJNI2 = flutterJNI;
        }
        this.f16037a = flutterJNI2;
        p078l.k kVar = new p078l.k(flutterJNI2, assets, this.f16056u);
        this.f16039c = kVar;
        flutterJNI2.setPlatformMessageHandler((i) kVar.f14861e);
        t.l0().getClass();
        this.f16042f = new C1017n0(kVar, flutterJNI2);
        new A5.s(kVar, "flutter/deferredcomponent", y.f688b, null).b(new c(new p174z5.b(), 27));
        t.l0().getClass();
        new HashMap();
        this.f16043g = new S1(kVar);
        w wVar2 = new w(kVar, 26);
        this.f16044h = new C1052y0(kVar);
        this.f16045i = new p174z5.a(kVar, 1);
        this.j = new p174z5.a(kVar, 0);
        this.f16047l = new p028d6.k(kVar, 24);
        w wVar3 = new w(kVar, context.getPackageManager());
        this.f16046k = new j(kVar);
        p174z5.j jVar = new p174z5.j();
        new A5.s(kVar, "flutter/scribe", A5.m.f675a, null).b(new C1052y0(jVar, 27));
        this.f16048m = jVar;
        this.f16049n = new l(kVar);
        m mVar = new m();
        new A5.s(kVar, "flutter/spellcheck", y.f688b, null).b(new C1010l1(mVar));
        this.f16050o = mVar;
        this.f16051p = new c(kVar);
        this.f16052q = new s(kVar);
        a aVar2 = new a(context, wVar2);
        this.f16041e = aVar2;
        p148u5.c cVar2 = (p148u5.c) tVarL0.f8076b;
        if (flutterJNI2.isAttached()) {
            tVar = tVarL0;
            wVar = wVar3;
            aVar = aVar2;
            cVar = cVar2;
        } else {
            Context applicationContext = context.getApplicationContext();
            p036e6.c cVar3 = new p036e6.c(25);
            if (((p036e6.c) cVar2.f16884c) == null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("startInitialization must be called on the main thread");
                }
                S5.a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    cVar2.f16884c = cVar3;
                    cVar2.f16882a = SystemClock.uptimeMillis();
                    cVar2.f16885d = p148u5.a.a(applicationContext2);
                    io.flutter.view.r rVarP = io.flutter.view.r.p((DisplayManager) applicationContext2.getSystemService("display"), (FlutterJNI) cVar2.f16886e);
                    ((FlutterJNI) rVarP.f14357b).setAsyncWaitForVsyncDelegate((io.flutter.view.a) rVarP.f14359d);
                    cVar2.f16888g = ((ExecutorService) cVar2.f16887f).submit(new f(7, cVar2, applicationContext2));
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            wVar = wVar3;
            tVar = tVarL0;
            aVar = aVar2;
            if (cVar2.f16883b) {
                cVar = cVar2;
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
                }
                if (((p036e6.c) cVar2.f16884c) == null) {
                    throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
                }
                try {
                    S5.a.b("FlutterLoader#ensureInitializationComplete");
                    try {
                        p148u5.b bVar = (p148u5.b) cVar2.f16888g.get();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                        StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                        sb.append((String) ((C0282o) cVar2.f16885d).f3013e);
                        String str = File.separator;
                        sb.append(str);
                        sb.append("libflutter.so");
                        arrayList.add(sb.toString());
                        arrayList.add("--aot-shared-library-name=".concat((String) ((C0282o) cVar2.f16885d).f3010b));
                        arrayList.add("--aot-shared-library-name=" + ((String) ((C0282o) cVar2.f16885d).f3013e) + str + ((String) ((C0282o) cVar2.f16885d).f3010b));
                        StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                        sb2.append(bVar.f16881b);
                        arrayList.add(sb2.toString());
                        arrayList.add("--domain-network-policy=".concat((String) ((C0282o) cVar2.f16885d).f3012d));
                        ((p036e6.c) cVar2.f16884c).getClass();
                        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        int i7 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                        if (i7 == 0) {
                            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            i7 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
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
                        cVar = cVar2;
                        ((FlutterJNI) cVar2.f16886e).init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f16880a, bVar.f16881b, SystemClock.uptimeMillis() - cVar2.f16882a, Build.VERSION.SDK_INT);
                        cVar.f16883b = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        try {
                            Trace.endSection();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Exception e7) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e7);
                    throw new RuntimeException(e7);
                }
            }
        }
        r rVar = new r();
        rVar.f14176a = sVar.f14192a;
        FlutterJNI flutterJNI3 = flutterJNI2;
        rVar.f14180e = flutterJNI3;
        flutterJNI3.addEngineLifecycleListener(this.f16057v);
        flutterJNI3.setPlatformViewsController(sVar);
        flutterJNI3.setPlatformViewsController2(rVar);
        a aVar3 = aVar;
        flutterJNI3.setLocalizationPlugin(aVar3);
        tVar.getClass();
        flutterJNI3.setDeferredComponentManager(null);
        if (!flutterJNI3.isAttached()) {
            flutterJNI3.attachToNative();
            if (!flutterJNI3.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f16038b = new k(flutterJNI3);
        this.f16053r = sVar;
        this.f16054s = rVar;
        c cVar4 = new c(context.getApplicationContext(), this, cVar);
        this.f16040d = cVar4;
        aVar3.b(context.getResources().getConfiguration());
        if (((C0282o) cVar.f16885d).f3009a) {
            p115p6.a.h(this);
        }
        D.g(context, this);
        cVar4.b(new D5.a(wVar));
    }

    public final void a() {
        Iterator it = this.f16055t.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        c cVar = this.f16040d;
        cVar.f();
        HashMap map = (HashMap) cVar.f16059b;
        for (Class cls : new HashSet(map.keySet())) {
            p159w5.c cVar2 = (p159w5.c) map.get(cls);
            if (cVar2 != null) {
                S5.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                try {
                    if (cVar2 instanceof p164x5.a) {
                        if (cVar.h()) {
                            ((p164x5.a) cVar2).onDetachedFromActivity();
                        }
                        ((HashMap) cVar.f16060c).remove(cls);
                    }
                    cVar2.onDetachedFromEngine((p159w5.b) cVar.f16062e);
                    map.remove(cls);
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
        map.clear();
        while (true) {
            io.flutter.plugin.platform.s sVar = this.f16053r;
            SparseArray sparseArray = sVar.f14201k;
            if (sparseArray.size() <= 0) {
                break;
            }
            sVar.f14212v.f(sparseArray.keyAt(0));
        }
        while (true) {
            r rVar = this.f16054s;
            SparseArray sparseArray2 = rVar.f14184i;
            if (sparseArray2.size() <= 0) {
                ((FlutterJNI) this.f16039c.f14859c).setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = this.f16037a;
                flutterJNI.removeEngineLifecycleListener(this.f16057v);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                t.l0().getClass();
                f16036x.remove(Long.valueOf(this.f16056u));
                return;
            }
            rVar.f14190p.f(sparseArray2.keyAt(0));
        }
    }
}
