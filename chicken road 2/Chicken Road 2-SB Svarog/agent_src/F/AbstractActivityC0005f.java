package F;

import a.AbstractC0018a;
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
import com.luminance.color.alchemy.MainActivity;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0005f extends Activity implements InterfaceC0008i, androidx.lifecycle.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f71e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f72a = false;

    /* renamed from: b, reason: collision with root package name */
    public C0009j f73b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j f74c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f75d;

    public AbstractActivityC0005f() {
        int i2 = Build.VERSION.SDK_INT;
        this.f75d = i2 < 33 ? null : i2 >= 34 ? new C0004e(this) : new OnBackInvokedCallback() { // from class: F.d
            public final void onBackInvoked() {
                AbstractActivityC0005f.this.onBackPressed();
            }
        };
        this.f74c = new androidx.lifecycle.j(this);
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.j a() {
        return this.f74c;
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int c() {
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

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle g2 = g();
            String string = g2 != null ? g2.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle g2 = g();
            if (g2 != null) {
                return g2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f72a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f75d);
                this.f72a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f72a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f75d);
        this.f72a = false;
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (d() != null || this.f73b.f86g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean j() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : d() == null;
    }

    public final boolean k(String str) {
        C0009j c0009j = this.f73b;
        if (c0009j == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0009j.f89j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (k("onActivityResult")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            if (c0009j.f81b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            G.e eVar = c0009j.f81b.f153d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            V.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((G.d) eVar.f186h).a(i2, i3, intent);
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
        if (k("onBackPressed")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                cVar.f158i.f283a.e("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:139|140|(1:142)|143|144|(1:146)|147|(1:149)(1:280)|150|(2:152|(1:154)(2:155|(1:157)(1:158)))|159|(4:161|162|163|(1:165)(2:264|(2:266|267)(2:268|269)))(1:279)|166|(1:168)|169|(1:171)(1:263)|(1:173)(1:262)|174|(3:176|(1:178)(1:256)|179)(3:257|(1:259)(1:261)|260)|180|(8:182|(1:184)|185|(2:187|(3:189|(1:191)|192)(2:193|194))|195|(1:197)|198|199)|200|(1:202)|203|204|205|206|(2:(1:252)(1:210)|211)(1:253)|212|(2:215|213)|216|217|(3:220|(1:222)(3:223|224|225)|218)|226|227|(5:229|(3:232|(1:234)(3:235|236|237)|230)|238|239|(2:241|(8:243|(1:245)|185|(0)|195|(0)|198|199)(2:246|247))(2:248|249))(2:250|251)) */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x050d, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06c3  */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            Bundle g2 = g();
            if (g2 != null && (i2 = g2.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            h(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0009j c0009j = new C0009j(this);
        this.f73b = c0009j;
        c0009j.c();
        if (c0009j.f81b == null) {
            String d2 = c0009j.f80a.d();
            if (d2 != null) {
                if (G.k.f214c == null) {
                    G.k.f214c = new G.k(1);
                }
                G.c cVar = (G.c) G.k.f214c.f215a.get(d2);
                c0009j.f81b = cVar;
                c0009j.f86g = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + d2 + "'");
                }
            } else {
                c0009j.f80a.getClass();
                c0009j.f81b = null;
                String stringExtra = c0009j.f80a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (G.k.f213b == null) {
                        synchronized (G.k.class) {
                            try {
                                if (G.k.f213b == null) {
                                    G.k.f213b = new G.k(0);
                                }
                            } finally {
                            }
                        }
                    }
                    G.j jVar = (G.j) G.k.f213b.f215a.get(stringExtra);
                    if (jVar == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0005f abstractActivityC0005f = c0009j.f80a;
                    abstractActivityC0005f.getClass();
                    G.i iVar = new G.i(abstractActivityC0005f);
                    c0009j.a(iVar);
                    c0009j.f81b = jVar.a(iVar);
                    c0009j.f86g = false;
                } else {
                    AbstractActivityC0005f abstractActivityC0005f2 = c0009j.f80a;
                    abstractActivityC0005f2.getClass();
                    Intent intent = abstractActivityC0005f2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            G.f a2 = G.g.a(str);
                            if (a2 == null) {
                                a2 = G.g.a("--".concat(str));
                            }
                            if (a2 == null) {
                                a2 = G.g.a("--" + str + "=");
                            }
                            if (a2 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC0005f abstractActivityC0005f3 = c0009j.f80a;
                    abstractActivityC0005f3.getClass();
                    Intent intent2 = c0009j.f80a.getIntent();
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
                    G.j jVar2 = new G.j(abstractActivityC0005f3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0005f abstractActivityC0005f4 = c0009j.f80a;
                    abstractActivityC0005f4.getClass();
                    G.i iVar2 = new G.i(abstractActivityC0005f4);
                    iVar2.f210e = false;
                    iVar2.f211f = c0009j.f80a.j();
                    c0009j.a(iVar2);
                    c0009j.f81b = jVar2.a(iVar2);
                    c0009j.f86g = false;
                }
            }
        }
        c0009j.f80a.getClass();
        G.e eVar = c0009j.f81b.f153d;
        androidx.lifecycle.j jVar3 = c0009j.f80a.f74c;
        eVar.getClass();
        V.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C0009j c0009j2 = (C0009j) eVar.f185g;
            if (c0009j2 != null) {
                c0009j2.b();
            }
            eVar.e();
            eVar.f185g = c0009j;
            AbstractActivityC0005f abstractActivityC0005f5 = c0009j.f80a;
            abstractActivityC0005f5.getClass();
            eVar.b(abstractActivityC0005f5, jVar3);
            Trace.endSection();
            AbstractActivityC0005f abstractActivityC0005f6 = c0009j.f80a;
            abstractActivityC0005f6.getClass();
            AbstractActivityC0005f abstractActivityC0005f7 = c0009j.f80a;
            G.c cVar2 = c0009j.f81b;
            abstractActivityC0005f7.getClass();
            c0009j.f83d = new io.flutter.plugin.platform.e(abstractActivityC0005f7, cVar2.f161l, abstractActivityC0005f7);
            AbstractActivityC0005f abstractActivityC0005f8 = c0009j.f80a;
            G.c cVar3 = c0009j.f81b;
            abstractActivityC0005f8.getClass();
            int i3 = f71e;
            c0009j.f84e = new T.a(i3, abstractActivityC0005f6, cVar3.f163n);
            AbstractActivityC0005f abstractActivityC0005f9 = c0009j.f80a;
            G.c cVar4 = c0009j.f81b;
            MainActivity mainActivity = (MainActivity) abstractActivityC0005f9;
            mainActivity.getClass();
            g0.h.e(cVar4, "flutterEngine");
            if (!mainActivity.f73b.f86g) {
                AbstractC0018a.x(cVar4);
            }
            new E.b(cVar4.f152c.f224f, mainActivity.f481f, P.n.f369a).h(new D.b(mainActivity));
            c0009j.f89j = true;
            C0009j c0009j3 = this.f73b;
            c0009j3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c0009j3.f80a.j()) {
                O.m mVar = c0009j3.f81b.f160k;
                mVar.f331e = true;
                O.l lVar = mVar.f330d;
                if (lVar != null) {
                    lVar.d(O.m.a(bArr));
                    mVar.f330d = null;
                    mVar.f328b = bArr;
                } else if (mVar.f332f) {
                    mVar.f329c.e("push", O.m.a(bArr), new O.l(0, mVar, bArr));
                } else {
                    mVar.f328b = bArr;
                }
            }
            c0009j3.f80a.getClass();
            G.e eVar2 = c0009j3.f81b.f153d;
            if (eVar2.f()) {
                V.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((G.d) eVar2.f186h).f178f.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } finally {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f74c.a(androidx.lifecycle.d.ON_CREATE);
            if (c() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C0009j c0009j4 = this.f73b;
            boolean z2 = c() == 1 ? true : 2;
            c0009j4.c();
            if (c0009j4.f80a.c() == 1) {
                AbstractActivityC0005f abstractActivityC0005f10 = c0009j4.f80a;
                abstractActivityC0005f10.getClass();
                C0014o c0014o = new C0014o(abstractActivityC0005f10, c0009j4.f80a.c() != 1);
                c0009j4.f80a.getClass();
                AbstractActivityC0005f abstractActivityC0005f11 = c0009j4.f80a;
                abstractActivityC0005f11.getClass();
                c0009j4.f82c = new x(abstractActivityC0005f11, c0014o);
            } else {
                AbstractActivityC0005f abstractActivityC0005f12 = c0009j4.f80a;
                abstractActivityC0005f12.getClass();
                C0016q c0016q = new C0016q(abstractActivityC0005f12);
                c0016q.setOpaque(c0009j4.f80a.c() == 1);
                c0009j4.f80a.getClass();
                AbstractActivityC0005f abstractActivityC0005f13 = c0009j4.f80a;
                abstractActivityC0005f13.getClass();
                c0009j4.f82c = new x(abstractActivityC0005f13, c0016q);
            }
            c0009j4.f82c.f128g.add(c0009j4.f91l);
            c0009j4.f80a.getClass();
            x xVar = c0009j4.f82c;
            G.c cVar5 = c0009j4.f81b;
            C0006g c0006g = xVar.f144x;
            Objects.toString(cVar5);
            if (xVar.c()) {
                if (cVar5 != xVar.f130i) {
                    xVar.a();
                }
                c0009j4.f82c.setId(i3);
                if (z2) {
                    x xVar2 = c0009j4.f82c;
                    if (c0009j4.f80a.c() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c0009j4.f85f != null) {
                        xVar2.getViewTreeObserver().removeOnPreDrawListener(c0009j4.f85f);
                    }
                    c0009j4.f85f = new ViewTreeObserverOnPreDrawListenerC0007h(c0009j4, xVar2);
                    xVar2.getViewTreeObserver().addOnPreDrawListener(c0009j4.f85f);
                }
                setContentView(c0009j4.f82c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            xVar.f130i = cVar5;
            io.flutter.embedding.engine.renderer.h hVar = cVar5.f151b;
            xVar.f129h = hVar.f595c;
            xVar.f126e.a(hVar);
            hVar.a(c0006g);
            if (xVar.f122a) {
                hVar.f593a.addResizingFlutterUiListener(xVar.f143w);
            }
            xVar.f132k = new C.a(xVar, xVar.f130i.f157h);
            G.c cVar6 = xVar.f130i;
            xVar.f133l = new io.flutter.plugin.editing.l(xVar, cVar6.f167r, cVar6.f162m, cVar6.f168s, cVar6.f169t);
            TextServicesManager textServicesManager = (TextServicesManager) xVar.getContext().getSystemService("textservices");
            xVar.f139r = textServicesManager;
            xVar.f134m = new io.flutter.plugin.editing.g(textServicesManager, xVar.f130i.f165p);
            new C.a(xVar, xVar.f133l.f647b, xVar.f130i.f162m);
            xVar.f135n = xVar.f130i.f154e;
            E.b bVar = new E.b();
            bVar.f19b = new HashSet();
            bVar.f20c = xVar;
            bVar.f18a = new H[]{new D(xVar.getBinaryMessenger()), new C.a(new O.c(xVar.getBinaryMessenger()))};
            new t(xVar.getBinaryMessenger()).f114c = bVar;
            xVar.f136o = bVar;
            xVar.f137p = new C0001b(xVar.f130i.f151b, false);
            io.flutter.view.i iVar3 = new io.flutter.view.i(xVar, cVar5.f155f, (AccessibilityManager) xVar.getContext().getSystemService("accessibility"), xVar.getContext().getContentResolver(), cVar5.f170u);
            xVar.f138q = iVar3;
            iVar3.f825r = xVar.f142u;
            boolean isEnabled = iVar3.f810c.isEnabled();
            boolean isTouchExplorationEnabled = xVar.f138q.f810c.isTouchExplorationEnabled();
            if (xVar.f130i.f151b.f593a.getIsSoftwareRenderingEnabled()) {
                xVar.setWillNotDraw(false);
            } else {
                xVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            G.c cVar7 = xVar.f130i;
            cVar7.f168s.f697i.f662a = xVar.f138q;
            new C0001b(cVar7.f151b, true);
            G.c cVar8 = xVar.f130i;
            cVar8.f169t.f681g.f662a = xVar.f138q;
            new C0001b(cVar8.f151b, true);
            xVar.f133l.f647b.restartInput(xVar);
            xVar.d();
            xVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, xVar.v);
            xVar.e();
            io.flutter.plugin.platform.k kVar = cVar5.f168s;
            SparseArray sparseArray = kVar.f700l;
            SparseArray sparseArray2 = kVar.f701m;
            SparseArray sparseArray3 = kVar.f703o;
            kVar.f692d = xVar;
            for (int i4 = 0; i4 < sparseArray3.size(); i4++) {
                kVar.f692d.addView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i4));
            }
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                if (sparseArray2.valueAt(i5) != null) {
                    throw new ClassCastException();
                }
                kVar.f692d.addView(null);
            }
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            io.flutter.plugin.platform.j jVar4 = cVar5.f169t;
            SparseArray sparseArray4 = jVar4.f682h;
            SparseArray sparseArray5 = jVar4.f683i;
            jVar4.f678d = xVar;
            for (int i6 = 0; i6 < sparseArray5.size(); i6++) {
                if (sparseArray5.valueAt(i6) != null) {
                    throw new ClassCastException();
                }
                jVar4.f678d.addView(null);
            }
            if (sparseArray4.size() > 0) {
                sparseArray4.valueAt(0).getClass();
                throw new ClassCastException();
            }
            Iterator it2 = xVar.f131j.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (xVar.f129h) {
                c0006g.b();
            }
            c0009j4.f82c.setId(i3);
            if (z2) {
            }
            setContentView(c0009j4.f82c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
            }
            window2.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th2) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (k("onDestroy")) {
            this.f73b.e();
            this.f73b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f75d);
            this.f72a = false;
        }
        C0009j c0009j = this.f73b;
        if (c0009j != null) {
            c0009j.f80a = null;
            c0009j.f81b = null;
            c0009j.f82c = null;
            c0009j.f83d = null;
            c0009j.f84e = null;
            this.f73b = null;
        }
        this.f74c.a(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            G.e eVar = cVar.f153d;
            if (eVar.f()) {
                V.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((G.d) eVar.f186h).f176d.iterator();
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
            String d2 = c0009j.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            O.b bVar = c0009j.f81b.f158i;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            bVar.f283a.e("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            c0009j.f80a.getClass();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                O.d dVar = cVar.f156g;
                dVar.a(3, dVar.f287c);
            }
        }
        this.f74c.a(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            if (c0009j.f81b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = c0009j.f83d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = c0009j.f81b.f168s.f698j.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.q) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            if (c0009j.f81b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            G.e eVar = c0009j.f81b.f153d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            V.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((G.d) eVar.f186h).f174b.iterator();
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
        this.f74c.a(androidx.lifecycle.d.ON_RESUME);
        if (k("onResume")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            c0009j.f81b.f151b.d();
            c0009j.f80a.getClass();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                O.d dVar = cVar.f156g;
                dVar.a(2, dVar.f287c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            if (c0009j.f80a.j()) {
                bundle.putByteArray("framework", c0009j.f81b.f160k.f328b);
            }
            c0009j.f80a.getClass();
            Bundle bundle2 = new Bundle();
            G.e eVar = c0009j.f81b.f153d;
            if (eVar.f()) {
                V.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((G.d) eVar.f186h).f178f.iterator();
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
            if (c0009j.f80a.d() == null || c0009j.f80a.i()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c0009j.f80a.f72a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String b2;
        Bundle g2;
        super.onStart();
        this.f74c.a(androidx.lifecycle.d.ON_START);
        if (k("onStart")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            if (c0009j.f80a.d() == null && !c0009j.f81b.f152c.f225g) {
                String f2 = c0009j.f80a.f();
                if (f2 == null) {
                    AbstractActivityC0005f abstractActivityC0005f = c0009j.f80a;
                    abstractActivityC0005f.getClass();
                    f2 = c0009j.d(abstractActivityC0005f.getIntent());
                    if (f2 == null) {
                        f2 = "/";
                    }
                }
                AbstractActivityC0005f abstractActivityC0005f2 = c0009j.f80a;
                abstractActivityC0005f2.getClass();
                try {
                    g2 = abstractActivityC0005f2.g();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (g2 != null) {
                    str = g2.getString("io.flutter.EntrypointUri");
                    c0009j.f80a.e();
                    c0009j.f81b.f158i.f283a.e("setInitialRoute", f2, null);
                    b2 = c0009j.f80a.b();
                    if (b2 != null || b2.isEmpty()) {
                        b2 = ((K.d) E.b.d().f18a).f279e.f267b;
                    }
                    c0009j.f81b.f152c.a(str != null ? new H.a(b2, c0009j.f80a.e()) : new H.a(b2, str, c0009j.f80a.e()), (List) c0009j.f80a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c0009j.f80a.e();
                c0009j.f81b.f158i.f283a.e("setInitialRoute", f2, null);
                b2 = c0009j.f80a.b();
                if (b2 != null) {
                }
                b2 = ((K.d) E.b.d().f18a).f279e.f267b;
                c0009j.f81b.f152c.a(str != null ? new H.a(b2, c0009j.f80a.e()) : new H.a(b2, str, c0009j.f80a.e()), (List) c0009j.f80a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c0009j.f90k;
            if (num != null) {
                c0009j.f82c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            c0009j.f80a.getClass();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                O.d dVar = cVar.f156g;
                dVar.a(5, dVar.f287c);
            }
            c0009j.f90k = Integer.valueOf(c0009j.f82c.getVisibility());
            c0009j.f82c.setVisibility(8);
            G.c cVar2 = c0009j.f81b;
            if (cVar2 != null) {
                cVar2.f151b.b(40);
            }
        }
        this.f74c.a(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (k("onTrimMemory")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                if (c0009j.f88i && i2 >= 10) {
                    FlutterJNI flutterJNI = cVar.f152c.f220b;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    O.c cVar2 = c0009j.f81b.f166q;
                    cVar2.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    cVar2.f284a.g(hashMap, null);
                }
                c0009j.f81b.f151b.b(i2);
                io.flutter.plugin.platform.k kVar = c0009j.f81b.f168s;
                if (i2 < 40) {
                    kVar.getClass();
                    return;
                }
                Iterator it = kVar.f698j.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.q) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            G.e eVar = cVar.f153d;
            if (!eVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            V.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((G.d) eVar.f186h).f177e.iterator();
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
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (k("onWindowFocusChanged")) {
            C0009j c0009j = this.f73b;
            c0009j.c();
            c0009j.f80a.getClass();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                O.d dVar = cVar.f156g;
                if (z2) {
                    dVar.a(dVar.f285a, true);
                } else {
                    dVar.a(dVar.f285a, false);
                }
            }
        }
    }
}
