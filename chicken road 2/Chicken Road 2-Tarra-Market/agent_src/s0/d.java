package s0;

import Q.C0005c;
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
import com.skytonedarps.arskthrp.MainActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p.AbstractC0819i;
import r.C0825a;
import u0.C0839a;

/* loaded from: classes.dex */
public abstract class d extends Activity implements androidx.lifecycle.j {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6507e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6508a = false;

    /* renamed from: b, reason: collision with root package name */
    public f f6509b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.l f6510c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f6511d;

    public d() {
        int i2 = Build.VERSION.SDK_INT;
        this.f6511d = i2 < 33 ? null : i2 >= 34 ? new C0835c(this) : new OnBackInvokedCallback() { // from class: s0.b
            public final void onBackInvoked() {
                d.this.onBackPressed();
            }
        };
        this.f6510c = new androidx.lifecycle.l(this);
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.l b() {
        return this.f6510c;
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

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle h2 = h();
            String string = h2 != null ? h2.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle h2 = h();
            if (h2 != null) {
                return h2.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void i(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z2 && !this.f6508a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f6511d);
                this.f6508a = true;
                return;
            }
            return;
        }
        if (z2 || !this.f6508a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f6511d);
        this.f6508a = false;
    }

    public final boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (e() != null || this.f6509b.f6520g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean k() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : e() == null;
    }

    public final boolean l(String str) {
        f fVar = this.f6509b;
        if (fVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (fVar.f6523j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (l("onActivityResult")) {
            f fVar = this.f6509b;
            fVar.c();
            if (fVar.f6515b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            C0825a c0825a = fVar.f6515b.f5722d;
            if (!c0825a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            J0.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((C0005c) c0825a.f6452h).a(i2, i3, intent);
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
        if (l("onBackPressed")) {
            f fVar = this.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                flutterEngine.f5727i.f57a.f("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:138|139|(1:141)|142|143|(1:145)|146|(1:148)(1:276)|149|(2:151|(1:153)(2:154|(1:156)(1:157)))|158|(4:160|161|162|(1:164)(2:262|(1:264)(2:265|266)))(1:275)|165|(1:167)|168|(1:170)|(1:172)(1:261)|173|(3:175|(1:177)(1:255)|178)(3:256|(1:258)(1:260)|259)|179|(8:181|(1:183)|184|(2:186|(3:188|(1:190)|191)(2:192|193))|194|(1:196)|197|198)|199|(1:201)|202|203|204|205|(2:(1:251)(1:209)|210)(1:252)|211|(2:212|(1:214)(1:215))|216|(2:217|(2:219|(1:221)(3:222|223|224))(3:225|226|(2:228|(2:229|(2:231|(1:233)(3:234|235|236))(3:237|238|(2:240|(2:242|(1:244))(2:245|246))(2:247|248))))(2:249|250)))|184|(0)|194|(0)|197|198) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04ef, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0674  */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i2;
        try {
            Bundle h2 = h();
            if (h2 != null && (i2 = h2.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            i(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        f fVar = new f(this);
        this.f6509b = fVar;
        fVar.c();
        if (fVar.f6515b == null) {
            String e2 = fVar.f6514a.e();
            if (e2 != null) {
                if (t0.h.f6691c == null) {
                    t0.h.f6691c = new t0.h(2);
                }
                FlutterEngine flutterEngine = (FlutterEngine) t0.h.f6691c.f6692a.get(e2);
                fVar.f6515b = flutterEngine;
                fVar.f6520g = true;
                if (flutterEngine == null) {
                    throw new IllegalStateException(AbstractC0819i.a("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", e2, "'"));
                }
            } else {
                fVar.f6514a.getClass();
                fVar.f6515b = null;
                String stringExtra = fVar.f6514a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (t0.h.f6690b == null) {
                        synchronized (t0.h.class) {
                            try {
                                if (t0.h.f6690b == null) {
                                    t0.h.f6690b = new t0.h(0);
                                }
                            } finally {
                            }
                        }
                    }
                    t0.g gVar = (t0.g) t0.h.f6690b.f6692a.get(stringExtra);
                    if (gVar == null) {
                        throw new IllegalStateException(AbstractC0819i.a("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    d dVar = fVar.f6514a;
                    dVar.getClass();
                    t0.f fVar2 = new t0.f(dVar);
                    fVar.a(fVar2);
                    fVar.f6515b = gVar.a(fVar2);
                    fVar.f6520g = false;
                } else {
                    d dVar2 = fVar.f6514a;
                    dVar2.getClass();
                    Intent intent = dVar2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            t0.c a2 = t0.d.a(str);
                            if (a2 == null) {
                                a2 = t0.d.a("--".concat(str));
                            }
                            if (a2 == null) {
                                a2 = t0.d.a("--" + str + "=");
                            }
                            if (a2 != null) {
                                break;
                            }
                        }
                    }
                    d dVar3 = fVar.f6514a;
                    dVar3.getClass();
                    Intent intent2 = fVar.f6514a.getIntent();
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
                    t0.g gVar2 = new t0.g(dVar3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    d dVar4 = fVar.f6514a;
                    dVar4.getClass();
                    t0.f fVar3 = new t0.f(dVar4);
                    fVar3.f6687e = false;
                    fVar3.f6688f = fVar.f6514a.k();
                    fVar.a(fVar3);
                    fVar.f6515b = gVar2.a(fVar3);
                    fVar.f6520g = false;
                }
            }
        }
        fVar.f6514a.getClass();
        C0825a c0825a = fVar.f6515b.f5722d;
        androidx.lifecycle.l lVar = fVar.f6514a.f6510c;
        c0825a.getClass();
        J0.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            f fVar4 = (f) c0825a.f6451g;
            if (fVar4 != null) {
                fVar4.b();
            }
            c0825a.e();
            c0825a.f6451g = fVar;
            d dVar5 = fVar.f6514a;
            dVar5.getClass();
            c0825a.b(dVar5, lVar);
            Trace.endSection();
            d dVar6 = fVar.f6514a;
            dVar6.getClass();
            d dVar7 = fVar.f6514a;
            FlutterEngine flutterEngine2 = fVar.f6515b;
            dVar7.getClass();
            fVar.f6517d = new io.flutter.plugin.platform.e(dVar7, flutterEngine2.f5730l, dVar7);
            d dVar8 = fVar.f6514a;
            FlutterEngine flutterEngine3 = fVar.f6515b;
            dVar8.getClass();
            fVar.f6518e = new H0.b(f6507e, dVar6, flutterEngine3.f5732n);
            d dVar9 = fVar.f6514a;
            FlutterEngine flutterEngine4 = fVar.f6515b;
            MainActivity mainActivity = (MainActivity) dVar9;
            mainActivity.getClass();
            kotlin.jvm.internal.j.e(flutterEngine4, "flutterEngine");
            if (!mainActivity.f6509b.f6520g) {
                V.a.x(flutterEngine4);
            }
            new C0.t(flutterEngine4.f5721c.f6701e, mainActivity.f756f).j(new C0.e(1, mainActivity));
            fVar.f6523j = true;
            f fVar5 = this.f6509b;
            fVar5.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (fVar5.f6514a.k()) {
                C0.q qVar = fVar5.f6515b.f5729k;
                qVar.f109e = true;
                C0.p pVar = qVar.f108d;
                if (pVar != null) {
                    pVar.c(C0.q.a(bArr));
                    qVar.f108d = null;
                    qVar.f106b = bArr;
                } else if (qVar.f110f) {
                    qVar.f107c.f("push", C0.q.a(bArr), new C0.p(0, qVar, bArr));
                } else {
                    qVar.f106b = bArr;
                }
            }
            fVar5.f6514a.getClass();
            C0825a c0825a2 = fVar5.f6515b.f5722d;
            if (c0825a2.f()) {
                J0.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((C0005c) c0825a2.f6452h).f405f).iterator();
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
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f6510c.d(androidx.lifecycle.d.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            f fVar6 = this.f6509b;
            boolean z2 = (d() == 1 ? (char) 1 : (char) 2) == 1;
            fVar6.c();
            if (fVar6.f6514a.d() == 1) {
                d dVar10 = fVar6.f6514a;
                dVar10.getClass();
                j jVar = new j(dVar10, fVar6.f6514a.d() != 1);
                fVar6.f6514a.getClass();
                d dVar11 = fVar6.f6514a;
                dVar11.getClass();
                fVar6.f6516c = new o(dVar11, jVar);
            } else {
                d dVar12 = fVar6.f6514a;
                dVar12.getClass();
                l lVar2 = new l(dVar12);
                lVar2.setOpaque(fVar6.f6514a.d() == 1);
                fVar6.f6514a.getClass();
                d dVar13 = fVar6.f6514a;
                dVar13.getClass();
                fVar6.f6516c = new o(dVar13, lVar2);
            }
            fVar6.f6516c.f6557g.add(fVar6.f6525l);
            fVar6.f6514a.getClass();
            o oVar = fVar6.f6516c;
            FlutterEngine flutterEngine5 = fVar6.f6515b;
            oVar.getClass();
            Objects.toString(flutterEngine5);
            if (oVar.c()) {
                if (flutterEngine5 != oVar.f6559i) {
                    oVar.a();
                }
                fVar6.f6516c.setId(f6507e);
                if (z2) {
                    o oVar2 = fVar6.f6516c;
                    if (fVar6.f6514a.d() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (fVar6.f6519f != null) {
                        oVar2.getViewTreeObserver().removeOnPreDrawListener(fVar6.f6519f);
                    }
                    fVar6.f6519f = new e(fVar6, oVar2);
                    oVar2.getViewTreeObserver().addOnPreDrawListener(fVar6.f6519f);
                }
                setContentView(fVar6.f6516c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            oVar.f6559i = flutterEngine5;
            io.flutter.embedding.engine.renderer.i iVar = flutterEngine5.f5720b;
            oVar.f6558h = iVar.f5786c;
            oVar.f6555e.a(iVar);
            io.flutter.embedding.engine.renderer.a aVar = oVar.f6574x;
            iVar.a(aVar);
            if (oVar.f6551a) {
                iVar.f5784a.addResizingFlutterUiListener(oVar.f6573w);
            }
            oVar.f6561k = new Y.e(oVar, oVar.f6559i.f5726h);
            FlutterEngine flutterEngine6 = oVar.f6559i;
            oVar.f6562l = new io.flutter.plugin.editing.l(oVar, flutterEngine6.f5736r, flutterEngine6.f5731m, flutterEngine6.f5737s, flutterEngine6.f5738t);
            TextServicesManager textServicesManager = (TextServicesManager) oVar.getContext().getSystemService("textservices");
            oVar.f6568r = textServicesManager;
            oVar.f6563m = new io.flutter.plugin.editing.h(textServicesManager, oVar.f6559i.f5734p);
            new Y.e(oVar, oVar.f6562l.f5837b, oVar.f6559i.f5731m);
            oVar.f6564n = oVar.f6559i.f5723e;
            oVar.f6565o = new C0.b(oVar);
            oVar.f6566p = new C0833a(oVar.f6559i.f5720b, false);
            io.flutter.view.i iVar2 = new io.flutter.view.i(oVar, flutterEngine5.f5724f, (AccessibilityManager) oVar.getContext().getSystemService("accessibility"), oVar.getContext().getContentResolver(), flutterEngine5.f5739u);
            oVar.f6567q = iVar2;
            iVar2.f6016r = oVar.f6571u;
            boolean isEnabled = iVar2.f6001c.isEnabled();
            boolean isTouchExplorationEnabled = oVar.f6567q.f6001c.isTouchExplorationEnabled();
            if (oVar.f6559i.f5720b.f5784a.getIsSoftwareRenderingEnabled()) {
                oVar.setWillNotDraw(false);
            } else {
                oVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            FlutterEngine flutterEngine7 = oVar.f6559i;
            flutterEngine7.f5737s.f5885h.f5852a = oVar.f6567q;
            new C0833a(flutterEngine7.f5720b, true);
            FlutterEngine flutterEngine8 = oVar.f6559i;
            flutterEngine8.f5738t.f5869f.f5852a = oVar.f6567q;
            new C0833a(flutterEngine8.f5720b, true);
            oVar.f6562l.f5837b.restartInput(oVar);
            oVar.d();
            oVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, oVar.f6572v);
            oVar.e();
            io.flutter.plugin.platform.j jVar2 = flutterEngine5.f5737s;
            jVar2.f5880c = oVar;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = jVar2.f5891n;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                jVar2.f5880c.addView((io.flutter.plugin.platform.g) sparseArray.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray2 = jVar2.f5889l;
                if (i4 >= sparseArray2.size()) {
                    SparseArray sparseArray3 = jVar2.f5888k;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                    io.flutter.plugin.platform.i iVar3 = flutterEngine5.f5738t;
                    iVar3.f5866c = oVar;
                    int i5 = 0;
                    while (true) {
                        SparseArray sparseArray4 = iVar3.f5871h;
                        if (i5 >= sparseArray4.size()) {
                            SparseArray sparseArray5 = iVar3.f5870g;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            Iterator it2 = oVar.f6560j.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            if (oVar.f6558h) {
                                aVar.b();
                            }
                        } else {
                            if (sparseArray4.valueAt(i5) != null) {
                                throw new ClassCastException();
                            }
                            iVar3.f5866c.addView(null);
                            i5++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i4) != null) {
                        throw new ClassCastException();
                    }
                    jVar2.f5880c.addView(null);
                    i4++;
                }
            }
            fVar6.f6516c.setId(f6507e);
            if (z2) {
            }
            setContentView(fVar6.f6516c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 35) {
            }
            window2.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (l("onDestroy")) {
            this.f6509b.e();
            this.f6509b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f6511d);
            this.f6508a = false;
        }
        f fVar = this.f6509b;
        if (fVar != null) {
            fVar.f6514a = null;
            fVar.f6515b = null;
            fVar.f6516c = null;
            fVar.f6517d = null;
            fVar.f6518e = null;
            this.f6509b = null;
        }
        this.f6510c.d(androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l("onNewIntent")) {
            f fVar = this.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0825a c0825a = flutterEngine.f5722d;
            if (c0825a.f()) {
                J0.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((C0005c) c0825a.f6452h).f403d).iterator();
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
            String d2 = fVar.d(intent);
            if (d2 == null || d2.isEmpty()) {
                return;
            }
            C0.d dVar = fVar.f6515b.f5727i;
            dVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", d2);
            dVar.f57a.f("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (l("onPause")) {
            f fVar = this.f6509b;
            fVar.c();
            fVar.f6514a.getClass();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                C0.h hVar = flutterEngine.f5725g;
                hVar.a(3, hVar.f63c);
            }
        }
        this.f6510c.d(androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (l("onPostResume")) {
            f fVar = this.f6509b;
            fVar.c();
            if (fVar.f6515b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.e eVar = fVar.f6517d;
            if (eVar != null) {
                eVar.b();
            }
            Iterator it = fVar.f6515b.f5737s.f5886i.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.p) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (l("onRequestPermissionsResult")) {
            f fVar = this.f6509b;
            fVar.c();
            if (fVar.f6515b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            C0825a c0825a = fVar.f6515b.f5722d;
            if (!c0825a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            J0.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((C0005c) c0825a.f6452h).f401b).iterator();
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
        this.f6510c.d(androidx.lifecycle.d.ON_RESUME);
        if (l("onResume")) {
            f fVar = this.f6509b;
            fVar.c();
            fVar.f6515b.f5720b.d();
            fVar.f6514a.getClass();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                C0.h hVar = flutterEngine.f5725g;
                hVar.a(2, hVar.f63c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l("onSaveInstanceState")) {
            f fVar = this.f6509b;
            fVar.c();
            if (fVar.f6514a.k()) {
                bundle.putByteArray("framework", fVar.f6515b.f5729k.f106b);
            }
            fVar.f6514a.getClass();
            Bundle bundle2 = new Bundle();
            C0825a c0825a = fVar.f6515b.f5722d;
            if (c0825a.f()) {
                J0.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((C0005c) c0825a.f6452h).f405f).iterator();
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
            if (fVar.f6514a.e() == null || fVar.f6514a.j()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", fVar.f6514a.f6508a);
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
        String c2;
        Bundle h2;
        super.onStart();
        this.f6510c.d(androidx.lifecycle.d.ON_START);
        if (l("onStart")) {
            f fVar = this.f6509b;
            fVar.c();
            if (fVar.f6514a.e() == null && !fVar.f6515b.f5721c.f6702f) {
                String g2 = fVar.f6514a.g();
                if (g2 == null) {
                    d dVar = fVar.f6514a;
                    dVar.getClass();
                    g2 = fVar.d(dVar.getIntent());
                    if (g2 == null) {
                        g2 = "/";
                    }
                }
                d dVar2 = fVar.f6514a;
                dVar2.getClass();
                try {
                    h2 = dVar2.h();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (h2 != null) {
                    str = h2.getString("io.flutter.EntrypointUri");
                    fVar.f6514a.f();
                    fVar.f6515b.f5727i.f57a.f("setInitialRoute", g2, null);
                    c2 = fVar.f6514a.c();
                    if (c2 != null || c2.isEmpty()) {
                        c2 = ((x0.d) C0.b.i().f54b).f6791e.f6779b;
                    }
                    fVar.f6515b.f5721c.a(str != null ? new C0839a(c2, fVar.f6514a.f()) : new C0839a(c2, str, fVar.f6514a.f()), (List) fVar.f6514a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                fVar.f6514a.f();
                fVar.f6515b.f5727i.f57a.f("setInitialRoute", g2, null);
                c2 = fVar.f6514a.c();
                if (c2 != null) {
                }
                c2 = ((x0.d) C0.b.i().f54b).f6791e.f6779b;
                fVar.f6515b.f5721c.a(str != null ? new C0839a(c2, fVar.f6514a.f()) : new C0839a(c2, str, fVar.f6514a.f()), (List) fVar.f6514a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = fVar.f6524k;
            if (num != null) {
                fVar.f6516c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (l("onStop")) {
            f fVar = this.f6509b;
            fVar.c();
            fVar.f6514a.getClass();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                C0.h hVar = flutterEngine.f5725g;
                hVar.a(5, hVar.f63c);
            }
            fVar.f6524k = Integer.valueOf(fVar.f6516c.getVisibility());
            fVar.f6516c.setVisibility(8);
            FlutterEngine flutterEngine2 = fVar.f6515b;
            if (flutterEngine2 != null) {
                flutterEngine2.f5720b.b(40);
            }
        }
        this.f6510c.d(androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (l("onTrimMemory")) {
            f fVar = this.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                if (fVar.f6522i && i2 >= 10) {
                    FlutterJNI flutterJNI = flutterEngine.f5721c.f6697a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0.f fVar2 = fVar.f6515b.f5735q;
                    fVar2.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    fVar2.f60a.h(hashMap, null);
                }
                fVar.f6515b.f5720b.b(i2);
                io.flutter.plugin.platform.j jVar = fVar.f6515b.f5737s;
                if (i2 < 40) {
                    jVar.getClass();
                    return;
                }
                Iterator it = jVar.f5886i.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.p) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (l("onUserLeaveHint")) {
            f fVar = this.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C0825a c0825a = flutterEngine.f5722d;
            if (!c0825a.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            J0.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((C0005c) c0825a.f6452h).f404e).iterator();
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
        if (l("onWindowFocusChanged")) {
            f fVar = this.f6509b;
            fVar.c();
            fVar.f6514a.getClass();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                C0.h hVar = flutterEngine.f5725g;
                if (z2) {
                    hVar.a(hVar.f61a, true);
                } else {
                    hVar.a(hVar.f61a, false);
                }
            }
        }
    }
}
