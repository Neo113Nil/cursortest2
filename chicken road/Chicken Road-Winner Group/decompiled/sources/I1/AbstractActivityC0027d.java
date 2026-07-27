package I1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b2.AbstractC0164a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: I1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0027d extends Activity implements androidx.lifecycle.k {

    /* renamed from: e, reason: collision with root package name */
    public static final int f596e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f597a = false;

    /* renamed from: b, reason: collision with root package name */
    public C0030g f598b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.m f599c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f600d;

    public AbstractActivityC0027d() {
        int i3 = Build.VERSION.SDK_INT;
        this.f600d = i3 < 33 ? null : i3 >= 34 ? new C0026c(this) : new C0025b(0, this);
        this.f599c = new androidx.lifecycle.m(this);
    }

    public final String c() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    @Override // androidx.lifecycle.k
    public final androidx.lifecycle.m e() {
        return this.f599c;
    }

    public final String f() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String g() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle i3 = i();
            String string = i3 != null ? i3.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String h() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle i3 = i();
            if (i3 != null) {
                return i3.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle i() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void j(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z3 && !this.f597a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f600d);
                this.f597a = true;
                return;
            }
            return;
        }
        if (z3 || !this.f597a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f600d);
        this.f597a = false;
    }

    public final boolean k() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (f() != null || this.f598b.f610g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean l() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : f() == null;
    }

    public final boolean m(String str) {
        C0030g c0030g = this.f598b;
        if (c0030g == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0030g.f613j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (m("onActivityResult")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            if (c0030g.f606b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            J1.c cVar = c0030g.f606b.f9101d;
            if (!cVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            AbstractC0164a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((A0.h) cVar.f702h).i(i3, i4, intent);
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

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (m("onBackPressed")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                ((T1.o) flutterEngine.f9105i.f729b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:138|139|(1:141)|142|143|(1:145)|146|(1:148)(1:268)|149|(2:151|(1:153)(2:154|(1:156)(1:157)))|158|(4:160|161|162|(1:164)(2:253|(1:255)(2:256|257)))(1:267)|165|(1:167)|168|(1:170)|(1:172)(1:252)|173|(3:175|(1:177)(1:246)|178)(3:247|(1:249)(1:251)|250)|179|(8:181|(1:183)|184|(2:186|(3:188|(1:190)|191)(2:192|193))|194|(1:196)|197|198)|199|(1:201)|202|203|204|205|(2:(1:242)(1:209)|210)(1:243)|211|(2:212|(1:214)(1:215))|216|(2:217|(1:219)(1:220))|221|(2:222|(1:224)(1:225))|226|(2:227|(1:229)(1:230))|(2:231|(1:233)(1:234))|235|(8:237|(1:239)|184|(0)|194|(0)|197|198)(2:240|241)) */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04df, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0677  */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i3;
        try {
            Bundle i4 = i();
            if (i4 != null && (i3 = i4.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i3);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            j(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0030g c0030g = new C0030g(this);
        this.f598b = c0030g;
        c0030g.c();
        int i5 = 0;
        if (c0030g.f606b == null) {
            String f = c0030g.f605a.f();
            if (f != null) {
                if (b0.i.f2459c == null) {
                    b0.i.f2459c = new b0.i(5);
                }
                FlutterEngine flutterEngine = (FlutterEngine) ((HashMap) b0.i.f2459c.f2461b).get(f);
                c0030g.f606b = flutterEngine;
                c0030g.f610g = true;
                if (flutterEngine == null) {
                    throw new IllegalStateException(B0.c.k("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", f, "'"));
                }
            } else {
                c0030g.f605a.getClass();
                c0030g.f606b = null;
                String stringExtra = c0030g.f605a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (J1.i.f727c == null) {
                        synchronized (J1.i.class) {
                            try {
                                if (J1.i.f727c == null) {
                                    J1.i.f727c = new J1.i(0);
                                }
                            } finally {
                            }
                        }
                    }
                    J1.h hVar = (J1.h) ((HashMap) J1.i.f727c.f729b).get(stringExtra);
                    if (hVar == null) {
                        throw new IllegalStateException(B0.c.k("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC0027d abstractActivityC0027d = c0030g.f605a;
                    abstractActivityC0027d.getClass();
                    J1.g gVar = new J1.g(abstractActivityC0027d);
                    c0030g.a(gVar);
                    c0030g.f606b = hVar.a(gVar);
                    c0030g.f610g = false;
                } else {
                    AbstractActivityC0027d abstractActivityC0027d2 = c0030g.f605a;
                    abstractActivityC0027d2.getClass();
                    Intent intent = abstractActivityC0027d2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            J1.d a3 = J1.e.a(str);
                            if (a3 == null) {
                                a3 = J1.e.a("--".concat(str));
                            }
                            if (a3 == null) {
                                a3 = J1.e.a("--" + str + "=");
                            }
                            if (a3 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0027d abstractActivityC0027d3 = c0030g.f605a;
                    abstractActivityC0027d3.getClass();
                    Intent intent2 = c0030g.f605a.getIntent();
                    ArrayList arrayList = new ArrayList();
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
                    String stringExtra2 = intent2.getStringExtra("trace-skia-allowlist");
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
                    HashSet hashSet = new HashSet(arrayList);
                    J1.h hVar2 = new J1.h(abstractActivityC0027d3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0027d abstractActivityC0027d4 = c0030g.f605a;
                    abstractActivityC0027d4.getClass();
                    J1.g gVar2 = new J1.g(abstractActivityC0027d4);
                    gVar2.f725e = false;
                    gVar2.f = c0030g.f605a.l();
                    c0030g.a(gVar2);
                    c0030g.f606b = hVar2.a(gVar2);
                    c0030g.f610g = false;
                }
            }
        }
        c0030g.f605a.getClass();
        J1.c cVar = c0030g.f606b.f9101d;
        androidx.lifecycle.m mVar = c0030g.f605a.f599c;
        cVar.getClass();
        AbstractC0164a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0030g c0030g2 = (C0030g) cVar.f701g;
            if (c0030g2 != null) {
                c0030g2.b();
            }
            cVar.e();
            cVar.f701g = c0030g;
            AbstractActivityC0027d abstractActivityC0027d5 = c0030g.f605a;
            abstractActivityC0027d5.getClass();
            cVar.b(abstractActivityC0027d5, mVar);
            Trace.endSection();
            AbstractActivityC0027d abstractActivityC0027d6 = c0030g.f605a;
            abstractActivityC0027d6.getClass();
            AbstractActivityC0027d abstractActivityC0027d7 = c0030g.f605a;
            FlutterEngine flutterEngine2 = c0030g.f606b;
            abstractActivityC0027d7.getClass();
            c0030g.f608d = new io.flutter.plugin.platform.f(abstractActivityC0027d7, flutterEngine2.f9108l, abstractActivityC0027d7);
            AbstractActivityC0027d abstractActivityC0027d8 = c0030g.f605a;
            FlutterEngine flutterEngine3 = c0030g.f606b;
            abstractActivityC0027d8.getClass();
            b0.i iVar = flutterEngine3.f9110n;
            int i6 = f596e;
            X1.a aVar = new X1.a();
            aVar.f1633b = abstractActivityC0027d6;
            aVar.f1632a = i6;
            aVar.f1634c = iVar;
            iVar.f2461b = aVar;
            c0030g.f609e = aVar;
            AbstractActivityC0027d abstractActivityC0027d9 = c0030g.f605a;
            FlutterEngine flutterEngine4 = c0030g.f606b;
            if (!abstractActivityC0027d9.f598b.f610g) {
                X0.a.D(flutterEngine4);
            }
            c0030g.f613j = true;
            C0030g c0030g3 = this.f598b;
            c0030g3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0030g3.f605a.l()) {
                S1.j jVar = c0030g3.f606b.f9107k;
                jVar.f1432e = true;
                S1.i iVar2 = jVar.f1431d;
                if (iVar2 != null) {
                    iVar2.success(S1.j.a(bArr));
                    jVar.f1431d = null;
                    jVar.f1429b = bArr;
                } else if (jVar.f) {
                    jVar.f1430c.a("push", S1.j.a(bArr), new S1.i(jVar, 0, bArr));
                } else {
                    jVar.f1429b = bArr;
                }
            }
            c0030g3.f605a.getClass();
            J1.c cVar2 = c0030g3.f606b.f9101d;
            if (cVar2.f()) {
                AbstractC0164a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((A0.h) cVar2.f702h).f58g).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
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
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f599c.e(androidx.lifecycle.e.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0030g c0030g4 = this.f598b;
            boolean z3 = (d() == 1 ? (char) 1 : (char) 2) == 1;
            c0030g4.c();
            if (c0030g4.f605a.d() == 1) {
                AbstractActivityC0027d abstractActivityC0027d10 = c0030g4.f605a;
                abstractActivityC0027d10.getClass();
                j jVar2 = new j(abstractActivityC0027d10, c0030g4.f605a.d() != 1);
                c0030g4.f605a.getClass();
                AbstractActivityC0027d abstractActivityC0027d11 = c0030g4.f605a;
                abstractActivityC0027d11.getClass();
                c0030g4.f607c = new q(abstractActivityC0027d11, jVar2);
            } else {
                AbstractActivityC0027d abstractActivityC0027d12 = c0030g4.f605a;
                abstractActivityC0027d12.getClass();
                l lVar = new l(abstractActivityC0027d12);
                lVar.setOpaque(c0030g4.f605a.d() == 1);
                c0030g4.f605a.getClass();
                AbstractActivityC0027d abstractActivityC0027d13 = c0030g4.f605a;
                abstractActivityC0027d13.getClass();
                c0030g4.f607c = new q(abstractActivityC0027d13, lVar);
            }
            c0030g4.f607c.f647g.add(c0030g4.f615l);
            c0030g4.f605a.getClass();
            q qVar = c0030g4.f607c;
            FlutterEngine flutterEngine5 = c0030g4.f606b;
            qVar.getClass();
            Objects.toString(flutterEngine5);
            if (qVar.c()) {
                if (flutterEngine5 != qVar.f649i) {
                    qVar.a();
                }
                c0030g4.f607c.setId(f596e);
                if (z3) {
                    q qVar2 = c0030g4.f607c;
                    if (c0030g4.f605a.d() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0030g4.f != null) {
                        qVar2.getViewTreeObserver().removeOnPreDrawListener(c0030g4.f);
                    }
                    c0030g4.f = new ViewTreeObserverOnPreDrawListenerC0029f(c0030g4, qVar2);
                    qVar2.getViewTreeObserver().addOnPreDrawListener(c0030g4.f);
                }
                setContentView(c0030g4.f607c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            qVar.f649i = flutterEngine5;
            io.flutter.embedding.engine.renderer.j jVar3 = flutterEngine5.f9099b;
            qVar.f648h = jVar3.f9168d;
            qVar.f646e.d(jVar3);
            C0028e c0028e = qVar.f664x;
            jVar3.a(c0028e);
            if (qVar.f642a) {
                jVar3.f9165a.addResizingFlutterUiListener(qVar.f663w);
            }
            qVar.f651k = new V1.b(qVar, qVar.f649i.f9104h);
            FlutterEngine flutterEngine6 = qVar.f649i;
            qVar.f652l = new io.flutter.plugin.editing.l(qVar, flutterEngine6.f9114r, flutterEngine6.f9109m, flutterEngine6.f9115s, flutterEngine6.f9116t);
            TextServicesManager textServicesManager = (TextServicesManager) qVar.getContext().getSystemService("textservices");
            qVar.f658r = textServicesManager;
            qVar.f653m = new io.flutter.plugin.editing.i(textServicesManager, qVar.f649i.f9112p);
            new V1.b(qVar, qVar.f652l.f9218b, qVar.f649i.f9109m);
            qVar.f654n = qVar.f649i.f9102e;
            qVar.f655o = new A0.j(qVar);
            qVar.f656p = new C0024a(qVar.f649i.f9099b, false);
            io.flutter.view.i iVar3 = new io.flutter.view.i(qVar, flutterEngine5.f, (AccessibilityManager) qVar.getContext().getSystemService("accessibility"), qVar.getContext().getContentResolver(), flutterEngine5.f9117u);
            qVar.f657q = iVar3;
            iVar3.f9444s = qVar.f661u;
            boolean isEnabled = iVar3.f9429c.isEnabled();
            boolean isTouchExplorationEnabled = qVar.f657q.f9429c.isTouchExplorationEnabled();
            if (qVar.f649i.f9099b.f9165a.getIsSoftwareRenderingEnabled()) {
                qVar.setWillNotDraw(false);
            } else {
                qVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            FlutterEngine flutterEngine7 = qVar.f649i;
            io.flutter.plugin.platform.r rVar = flutterEngine7.f9115s;
            rVar.f9308i.f9249a = qVar.f657q;
            rVar.f9302b = new C0024a(flutterEngine7.f9099b, true);
            FlutterEngine flutterEngine8 = qVar.f649i;
            io.flutter.plugin.platform.q qVar3 = flutterEngine8.f9116t;
            qVar3.f9290h.f9249a = qVar.f657q;
            qVar3.f9285b = new C0024a(flutterEngine8.f9099b, true);
            qVar.f652l.f9218b.restartInput(qVar);
            qVar.d();
            qVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, qVar.f662v);
            qVar.e();
            io.flutter.plugin.platform.r rVar2 = flutterEngine5.f9115s;
            rVar2.f9304d = qVar;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = rVar2.f9314o;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                rVar2.f9304d.addView((io.flutter.plugin.platform.j) sparseArray.valueAt(i7));
                i7++;
            }
            int i8 = 0;
            while (true) {
                SparseArray sparseArray2 = rVar2.f9312m;
                if (i8 >= sparseArray2.size()) {
                    break;
                }
                rVar2.f9304d.addView((O1.b) sparseArray2.valueAt(i8));
                i8++;
            }
            int i9 = 0;
            while (true) {
                SparseArray sparseArray3 = rVar2.f9311l;
                if (i9 >= sparseArray3.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray3.valueAt(i9)).onFlutterViewAttached(rVar2.f9304d);
                i9++;
            }
            io.flutter.plugin.platform.q qVar4 = flutterEngine5.f9116t;
            qVar4.f9287d = qVar;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray4 = qVar4.f9292j;
                if (i10 >= sparseArray4.size()) {
                    break;
                }
                qVar4.f9287d.addView((O1.b) sparseArray4.valueAt(i10));
                i10++;
            }
            while (true) {
                SparseArray sparseArray5 = qVar4.f9291i;
                if (i5 >= sparseArray5.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray5.valueAt(i5)).onFlutterViewAttached(qVar4.f9287d);
                i5++;
            }
            Iterator it2 = qVar.f650j.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (qVar.f648h) {
                c0028e.b();
            }
            c0030g4.f607c.setId(f596e);
            if (z3) {
            }
            setContentView(c0030g4.f607c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
            }
            window2.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th3) {
            try {
                Trace.endSection();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (m("onDestroy")) {
            this.f598b.e();
            this.f598b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f600d);
            this.f597a = false;
        }
        C0030g c0030g = this.f598b;
        if (c0030g != null) {
            c0030g.f605a = null;
            c0030g.f606b = null;
            c0030g.f607c = null;
            c0030g.f608d = null;
            c0030g.f609e = null;
            this.f598b = null;
        }
        this.f599c.e(androidx.lifecycle.e.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m("onNewIntent")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            J1.c cVar = flutterEngine.f9101d;
            if (cVar.f()) {
                AbstractC0164a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((A0.h) cVar.f702h).f57e).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String d3 = c0030g.d(intent);
            if (d3 == null || d3.isEmpty()) {
                return;
            }
            J1.i iVar = c0030g.f606b.f9105i;
            iVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d3);
            ((T1.o) iVar.f729b).a("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (m("onPause")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            c0030g.f605a.getClass();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                S1.a aVar = flutterEngine.f9103g;
                aVar.a(3, aVar.f1385c);
            }
        }
        this.f599c.e(androidx.lifecycle.e.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (m("onPostResume")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            if (c0030g.f606b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c0030g.f608d;
            if (fVar != null) {
                fVar.b();
            }
            c0030g.f606b.f9115s.l();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (m("onRequestPermissionsResult")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            if (c0030g.f606b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            J1.c cVar = c0030g.f606b.f9101d;
            if (!cVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            AbstractC0164a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((A0.h) cVar.f702h).f55c).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
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

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f599c.e(androidx.lifecycle.e.ON_RESUME);
        if (m("onResume")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            c0030g.f606b.f9099b.i();
            c0030g.f605a.getClass();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                S1.a aVar = flutterEngine.f9103g;
                aVar.a(2, aVar.f1385c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m("onSaveInstanceState")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            if (c0030g.f605a.l()) {
                bundle.putByteArray("framework", c0030g.f606b.f9107k.f1429b);
            }
            c0030g.f605a.getClass();
            Bundle bundle2 = new Bundle();
            J1.c cVar = c0030g.f606b.f9101d;
            if (cVar.f()) {
                AbstractC0164a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((A0.h) cVar.f702h).f58g).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0030g.f605a.f() == null || c0030g.f605a.k()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0030g.f605a.f597a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String c3;
        Bundle i3;
        super.onStart();
        this.f599c.e(androidx.lifecycle.e.ON_START);
        if (m("onStart")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            if (c0030g.f605a.f() == null && !c0030g.f606b.f9100c.f) {
                String h3 = c0030g.f605a.h();
                if (h3 == null) {
                    AbstractActivityC0027d abstractActivityC0027d = c0030g.f605a;
                    abstractActivityC0027d.getClass();
                    h3 = c0030g.d(abstractActivityC0027d.getIntent());
                    if (h3 == null) {
                        h3 = "/";
                    }
                }
                AbstractActivityC0027d abstractActivityC0027d2 = c0030g.f605a;
                abstractActivityC0027d2.getClass();
                try {
                    i3 = abstractActivityC0027d2.i();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (i3 != null) {
                    str = i3.getString("io.flutter.EntrypointUri");
                    c0030g.f605a.g();
                    ((T1.o) c0030g.f606b.f9105i.f729b).a("setInitialRoute", h3, null);
                    c3 = c0030g.f605a.c();
                    if (c3 != null || c3.isEmpty()) {
                        c3 = ((N1.d) A0.j.F().f66b).f1002e.f989b;
                    }
                    c0030g.f606b.f9100c.a(str != null ? new K1.a(c3, c0030g.f605a.g()) : new K1.a(c3, str, c0030g.f605a.g()), (List) c0030g.f605a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0030g.f605a.g();
                ((T1.o) c0030g.f606b.f9105i.f729b).a("setInitialRoute", h3, null);
                c3 = c0030g.f605a.c();
                if (c3 != null) {
                }
                c3 = ((N1.d) A0.j.F().f66b).f1002e.f989b;
                c0030g.f606b.f9100c.a(str != null ? new K1.a(c3, c0030g.f605a.g()) : new K1.a(c3, str, c0030g.f605a.g()), (List) c0030g.f605a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0030g.f614k;
            if (num != null) {
                c0030g.f607c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (m("onStop")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            c0030g.f605a.getClass();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                S1.a aVar = flutterEngine.f9103g;
                aVar.a(5, aVar.f1385c);
            }
            c0030g.f614k = Integer.valueOf(c0030g.f607c.getVisibility());
            c0030g.f607c.setVisibility(8);
            FlutterEngine flutterEngine2 = c0030g.f606b;
            if (flutterEngine2 != null) {
                flutterEngine2.f9099b.f(40);
            }
        }
        this.f599c.e(androidx.lifecycle.e.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (m("onTrimMemory")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                if (c0030g.f612i && i3 >= 10) {
                    FlutterJNI flutterJNI = flutterEngine.f9100c.f921a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    J1.i iVar = c0030g.f606b.f9113q;
                    iVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((D0.a) iVar.f729b).f(hashMap, null);
                }
                c0030g.f606b.f9099b.f(i3);
                io.flutter.plugin.platform.r rVar = c0030g.f606b.f9115s;
                if (i3 < 40) {
                    rVar.getClass();
                    return;
                }
                Iterator it = rVar.f9309j.values().iterator();
                while (it.hasNext()) {
                    ((io.flutter.plugin.platform.D) it.next()).f9246h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (m("onUserLeaveHint")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            J1.c cVar = flutterEngine.f9101d;
            if (!cVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            AbstractC0164a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((A0.h) cVar.f702h).f).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (m("onWindowFocusChanged")) {
            C0030g c0030g = this.f598b;
            c0030g.c();
            c0030g.f605a.getClass();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                S1.a aVar = flutterEngine.f9103g;
                if (z3) {
                    aVar.a(aVar.f1383a, true);
                } else {
                    aVar.a(aVar.f1383a, false);
                }
            }
        }
    }
}
