package w2;

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
import androidx.lifecycle.AbstractC0245o;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0243m;
import androidx.lifecycle.InterfaceC0250u;
import b2.AbstractC0279e;
import com.chickyneer.roadway.MainActivity;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import h2.C0482c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import x2.AbstractC1541d;
import x2.C1540c;
import x2.C1543f;
import x2.C1544g;
import x2.C1545h;
import y2.C1556a;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1515c extends Activity implements InterfaceC0250u {

    /* renamed from: e, reason: collision with root package name */
    public static final int f12126e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f12127a = false;

    /* renamed from: b, reason: collision with root package name */
    public C1517e f12128b;

    /* renamed from: c, reason: collision with root package name */
    public final C0252w f12129c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f12130d;

    public AbstractActivityC1515c() {
        int i2 = Build.VERSION.SDK_INT;
        this.f12130d = i2 < 33 ? null : i2 >= 34 ? new C1514b(this) : new androidx.activity.p(1, this);
        this.f12129c = new C0252w(this);
    }

    public final String a() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int b() {
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

    public final String c() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String d() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle f3 = f();
            String string = f3 != null ? f3.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String e() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle f3 = f();
            if (f3 != null) {
                return f3.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle f() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z && !this.f12127a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f12130d);
                this.f12127a = true;
                return;
            }
            return;
        }
        if (z || !this.f12127a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f12130d);
        this.f12127a = false;
    }

    @Override // androidx.lifecycle.InterfaceC0250u
    public final AbstractC0245o getLifecycle() {
        return this.f12129c;
    }

    public final boolean h() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (c() != null || this.f12128b.f12139g) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean i() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : c() == null;
    }

    public final boolean j(String str) {
        C1517e c1517e = this.f12128b;
        if (c1517e == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c1517e.f12142j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (j("onActivityResult")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            if (c1517e.f12134b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            U.b bVar = c1517e.f12134b.f10085d;
            if (!bVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            O2.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                ((M0.e) bVar.f3042h).l(i2, i3, intent);
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
        if (j("onBackPressed")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                ((H2.o) flutterEngine.f10090i.f5783b).a("popRoute", null, null);
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
            Bundle f3 = f();
            if (f3 != null && (i2 = f3.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i2);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            g(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C1517e c1517e = new C1517e(this);
        this.f12128b = c1517e;
        c1517e.c();
        if (c1517e.f12134b == null) {
            String c2 = c1517e.f12133a.c();
            if (c2 != null) {
                if (C1545h.f12298c == null) {
                    C1545h.f12298c = new C1545h(3);
                }
                FlutterEngine flutterEngine = (FlutterEngine) C1545h.f12298c.f12299a.get(c2);
                c1517e.f12134b = flutterEngine;
                c1517e.f12139g = true;
                if (flutterEngine == null) {
                    throw new IllegalStateException(AbstractC0279e.f("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", c2, "'"));
                }
            } else {
                c1517e.f12133a.getClass();
                c1517e.f12134b = null;
                String stringExtra = c1517e.f12133a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (C1545h.f12297b == null) {
                        synchronized (C1545h.class) {
                            try {
                                if (C1545h.f12297b == null) {
                                    C1545h.f12297b = new C1545h(0);
                                }
                            } finally {
                            }
                        }
                    }
                    C1544g c1544g = (C1544g) C1545h.f12297b.f12299a.get(stringExtra);
                    if (c1544g == null) {
                        throw new IllegalStateException(AbstractC0279e.f("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    AbstractActivityC1515c abstractActivityC1515c = c1517e.f12133a;
                    abstractActivityC1515c.getClass();
                    C1543f c1543f = new C1543f(abstractActivityC1515c);
                    c1517e.a(c1543f);
                    c1517e.f12134b = c1544g.a(c1543f);
                    c1517e.f12139g = false;
                } else {
                    AbstractActivityC1515c abstractActivityC1515c2 = c1517e.f12133a;
                    abstractActivityC1515c2.getClass();
                    Intent intent = abstractActivityC1515c2.getIntent();
                    if (intent.getExtras() != null) {
                        for (String str : intent.getExtras().keySet()) {
                            C1540c a6 = AbstractC1541d.a(str);
                            if (a6 == null) {
                                a6 = AbstractC1541d.a("--".concat(str));
                            }
                            if (a6 == null) {
                                a6 = AbstractC1541d.a("--" + str + "=");
                            }
                            if (a6 != null) {
                                break;
                            }
                        }
                    }
                    AbstractActivityC1515c abstractActivityC1515c3 = c1517e.f12133a;
                    abstractActivityC1515c3.getClass();
                    Intent intent2 = c1517e.f12133a.getIntent();
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
                    C1544g c1544g2 = new C1544g(abstractActivityC1515c3, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC1515c abstractActivityC1515c4 = c1517e.f12133a;
                    abstractActivityC1515c4.getClass();
                    C1543f c1543f2 = new C1543f(abstractActivityC1515c4);
                    c1543f2.f12294e = false;
                    c1543f2.f12295f = c1517e.f12133a.i();
                    c1517e.a(c1543f2);
                    c1517e.f12134b = c1544g2.a(c1543f2);
                    c1517e.f12139g = false;
                }
            }
        }
        c1517e.f12133a.getClass();
        U.b bVar = c1517e.f12134b.f10085d;
        C0252w c0252w = c1517e.f12133a.f12129c;
        bVar.getClass();
        O2.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C1517e c1517e2 = (C1517e) bVar.f3041g;
            if (c1517e2 != null) {
                c1517e2.b();
            }
            bVar.e();
            bVar.f3041g = c1517e;
            AbstractActivityC1515c abstractActivityC1515c5 = c1517e.f12133a;
            abstractActivityC1515c5.getClass();
            bVar.b(abstractActivityC1515c5, c0252w);
            Trace.endSection();
            AbstractActivityC1515c abstractActivityC1515c6 = c1517e.f12133a;
            abstractActivityC1515c6.getClass();
            AbstractActivityC1515c abstractActivityC1515c7 = c1517e.f12133a;
            FlutterEngine flutterEngine2 = c1517e.f12134b;
            abstractActivityC1515c7.getClass();
            c1517e.f12136d = new io.flutter.plugin.platform.f(abstractActivityC1515c7, flutterEngine2.f10093l, abstractActivityC1515c7);
            AbstractActivityC1515c abstractActivityC1515c8 = c1517e.f12133a;
            FlutterEngine flutterEngine3 = c1517e.f12134b;
            abstractActivityC1515c8.getClass();
            c1517e.f12137e = new B3.d(f12126e, abstractActivityC1515c6, flutterEngine3.f10095n);
            AbstractActivityC1515c abstractActivityC1515c9 = c1517e.f12133a;
            FlutterEngine flutterEngine4 = c1517e.f12134b;
            MainActivity mainActivity = (MainActivity) abstractActivityC1515c9;
            mainActivity.getClass();
            kotlin.jvm.internal.i.e(flutterEngine4, "flutterEngine");
            if (!mainActivity.f12128b.f12139g) {
                B0.f.I(flutterEngine4);
            }
            new H2.o(flutterEngine4.f10084c.f12350e, "com.chickyneer.roadway/cross_lane_view").b(new D3.g(2, mainActivity));
            c1517e.f12142j = true;
            C1517e c1517e3 = this.f12128b;
            c1517e3.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            if (c1517e3.f12133a.i()) {
                G2.j jVar = c1517e3.f12134b.f10092k;
                jVar.f974e = true;
                G2.i iVar = jVar.f973d;
                if (iVar != null) {
                    iVar.success(G2.j.a(bArr));
                    jVar.f973d = null;
                    jVar.f971b = bArr;
                } else if (jVar.f975f) {
                    jVar.f972c.a(InAppMessagePromptTypes.PUSH_PROMPT_KEY, G2.j.a(bArr), new G2.i(jVar, 0, bArr));
                } else {
                    jVar.f971b = bArr;
                }
            }
            c1517e3.f12133a.getClass();
            U.b bVar2 = c1517e3.f12134b.f10085d;
            if (bVar2.f()) {
                O2.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((M0.e) bVar2.f3042h).f1787g).iterator();
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
            this.f12129c.e(EnumC0243m.ON_CREATE);
            if (b() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C1517e c1517e4 = this.f12128b;
            boolean z = (b() == 1 ? (char) 1 : (char) 2) == 1;
            c1517e4.c();
            if (c1517e4.f12133a.b() == 1) {
                AbstractActivityC1515c abstractActivityC1515c10 = c1517e4.f12133a;
                abstractActivityC1515c10.getClass();
                C1520h c1520h = new C1520h(abstractActivityC1515c10, c1517e4.f12133a.b() != 1);
                c1517e4.f12133a.getClass();
                AbstractActivityC1515c abstractActivityC1515c11 = c1517e4.f12133a;
                abstractActivityC1515c11.getClass();
                c1517e4.f12135c = new m(abstractActivityC1515c11, c1520h);
            } else {
                AbstractActivityC1515c abstractActivityC1515c12 = c1517e4.f12133a;
                abstractActivityC1515c12.getClass();
                j jVar2 = new j(abstractActivityC1515c12);
                jVar2.setOpaque(c1517e4.f12133a.b() == 1);
                c1517e4.f12133a.getClass();
                AbstractActivityC1515c abstractActivityC1515c13 = c1517e4.f12133a;
                abstractActivityC1515c13.getClass();
                c1517e4.f12135c = new m(abstractActivityC1515c13, jVar2);
            }
            c1517e4.f12135c.f12176g.add(c1517e4.f12144l);
            c1517e4.f12133a.getClass();
            m mVar = c1517e4.f12135c;
            FlutterEngine flutterEngine5 = c1517e4.f12134b;
            mVar.getClass();
            Objects.toString(flutterEngine5);
            if (mVar.c()) {
                if (flutterEngine5 != mVar.f12178i) {
                    mVar.a();
                }
                c1517e4.f12135c.setId(f12126e);
                if (z) {
                    m mVar2 = c1517e4.f12135c;
                    if (c1517e4.f12133a.b() != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c1517e4.f12138f != null) {
                        mVar2.getViewTreeObserver().removeOnPreDrawListener(c1517e4.f12138f);
                    }
                    c1517e4.f12138f = new ViewTreeObserverOnPreDrawListenerC1516d(c1517e4, mVar2);
                    mVar2.getViewTreeObserver().addOnPreDrawListener(c1517e4.f12138f);
                }
                setContentView(c1517e4.f12135c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 35) {
                    window.setStatusBarColor(1073741824);
                }
                window.getDecorView().setSystemUiVisibility(1280);
            }
            mVar.f12178i = flutterEngine5;
            io.flutter.embedding.engine.renderer.i iVar2 = flutterEngine5.f10083b;
            mVar.f12177h = iVar2.f10148c;
            mVar.f12174e.d(iVar2);
            io.flutter.embedding.engine.renderer.a aVar = mVar.f12193x;
            iVar2.a(aVar);
            if (mVar.f12170a) {
                iVar2.f10146a.addResizingFlutterUiListener(mVar.f12192w);
            }
            mVar.f12180k = new B0.l(mVar, mVar.f12178i.f10089h);
            FlutterEngine flutterEngine6 = mVar.f12178i;
            mVar.f12181l = new io.flutter.plugin.editing.j(mVar, flutterEngine6.f10099r, flutterEngine6.f10094m, flutterEngine6.f10100s, flutterEngine6.f10101t);
            TextServicesManager textServicesManager = (TextServicesManager) mVar.getContext().getSystemService("textservices");
            mVar.f12187r = textServicesManager;
            mVar.f12182m = new io.flutter.plugin.editing.h(textServicesManager, mVar.f12178i.f10097p);
            new B0.c(mVar, mVar.f12181l.f10194b, mVar.f12178i.f10094m);
            mVar.f12183n = mVar.f12178i.f10086e;
            mVar.f12184o = new x0.c(mVar);
            mVar.f12185p = new C1513a(mVar.f12178i.f10083b, false);
            io.flutter.view.g gVar = new io.flutter.view.g(mVar, flutterEngine5.f10087f, (AccessibilityManager) mVar.getContext().getSystemService("accessibility"), mVar.getContext().getContentResolver(), flutterEngine5.f10102u);
            mVar.f12186q = gVar;
            gVar.f10374r = mVar.f12190u;
            boolean isEnabled = gVar.f10359c.isEnabled();
            boolean isTouchExplorationEnabled = mVar.f12186q.f10359c.isTouchExplorationEnabled();
            if (mVar.f12178i.f10083b.f10146a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
            } else {
                mVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            FlutterEngine flutterEngine7 = mVar.f12178i;
            flutterEngine7.f10100s.f10242h.f10209a = mVar.f12186q;
            new C1513a(flutterEngine7.f10083b, true);
            FlutterEngine flutterEngine8 = mVar.f12178i;
            flutterEngine8.f10101t.f10226f.f10209a = mVar.f12186q;
            new C1513a(flutterEngine8.f10083b, true);
            mVar.f12181l.f10194b.restartInput(mVar);
            mVar.d();
            mVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, mVar.f12191v);
            mVar.e();
            io.flutter.plugin.platform.m mVar3 = flutterEngine5.f10100s;
            mVar3.f10237c = mVar;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = mVar3.f10248n;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                mVar3.f10237c.addView((io.flutter.plugin.platform.h) sparseArray.valueAt(i3));
                i3++;
            }
            int i6 = 0;
            while (true) {
                SparseArray sparseArray2 = mVar3.f10246l;
                if (i6 >= sparseArray2.size()) {
                    SparseArray sparseArray3 = mVar3.f10245k;
                    if (sparseArray3.size() > 0) {
                        sparseArray3.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                    io.flutter.plugin.platform.l lVar = flutterEngine5.f10101t;
                    lVar.f10223c = mVar;
                    int i7 = 0;
                    while (true) {
                        SparseArray sparseArray4 = lVar.f10228h;
                        if (i7 >= sparseArray4.size()) {
                            SparseArray sparseArray5 = lVar.f10227g;
                            if (sparseArray5.size() > 0) {
                                sparseArray5.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            Iterator it2 = mVar.f12179j.iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw new ClassCastException();
                            }
                            if (mVar.f12177h) {
                                aVar.b();
                            }
                        } else {
                            if (sparseArray4.valueAt(i7) != null) {
                                throw new ClassCastException();
                            }
                            lVar.f10223c.addView(null);
                            i7++;
                        }
                    }
                } else {
                    if (sparseArray2.valueAt(i6) != null) {
                        throw new ClassCastException();
                    }
                    mVar3.f10237c.addView(null);
                    i6++;
                }
            }
            c1517e4.f12135c.setId(f12126e);
            if (z) {
            }
            setContentView(c1517e4.f12135c);
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
        if (j("onDestroy")) {
            this.f12128b.e();
            this.f12128b.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f12130d);
            this.f12127a = false;
        }
        C1517e c1517e = this.f12128b;
        if (c1517e != null) {
            c1517e.f12133a = null;
            c1517e.f12134b = null;
            c1517e.f12135c = null;
            c1517e.f12136d = null;
            c1517e.f12137e = null;
            this.f12128b = null;
        }
        this.f12129c.e(EnumC0243m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (j("onNewIntent")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            U.b bVar = flutterEngine.f10085d;
            if (bVar.f()) {
                O2.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((M0.e) bVar.f3042h).f1785e).iterator();
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
            String d6 = c1517e.d(intent);
            if (d6 == null || d6.isEmpty()) {
                return;
            }
            C0482c c0482c = c1517e.f12134b.f10090i;
            c0482c.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(InAppMessagePromptTypes.LOCATION_PROMPT_KEY, d6);
            ((H2.o) c0482c.f5783b).a("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (j("onPause")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            c1517e.f12133a.getClass();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                G2.b bVar = flutterEngine.f10088g;
                bVar.a(3, bVar.f929c);
            }
        }
        this.f12129c.e(EnumC0243m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (j("onPostResume")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            if (c1517e.f12134b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            io.flutter.plugin.platform.f fVar = c1517e.f12136d;
            if (fVar != null) {
                fVar.b();
            }
            Iterator it = c1517e.f12134b.f10100s.f10243i.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.s) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (j("onRequestPermissionsResult")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            if (c1517e.f12134b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            U.b bVar = c1517e.f12134b.f10085d;
            if (!bVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            O2.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                Iterator it = ((HashSet) ((M0.e) bVar.f3042h).f1783c).iterator();
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
        this.f12129c.e(EnumC0243m.ON_RESUME);
        if (j("onResume")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            c1517e.f12134b.f10083b.d();
            c1517e.f12133a.getClass();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                G2.b bVar = flutterEngine.f10088g;
                bVar.a(2, bVar.f929c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (j("onSaveInstanceState")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            if (c1517e.f12133a.i()) {
                bundle.putByteArray("framework", c1517e.f12134b.f10092k.f971b);
            }
            c1517e.f12133a.getClass();
            Bundle bundle2 = new Bundle();
            U.b bVar = c1517e.f12134b.f10085d;
            if (bVar.f()) {
                O2.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((M0.e) bVar.f3042h).f1787g).iterator();
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
            if (c1517e.f12133a.c() == null || c1517e.f12133a.h()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c1517e.f12133a.f12127a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        String a6;
        Bundle f3;
        super.onStart();
        this.f12129c.e(EnumC0243m.ON_START);
        if (j("onStart")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            if (c1517e.f12133a.c() == null && !c1517e.f12134b.f10084c.f12351f) {
                String e3 = c1517e.f12133a.e();
                if (e3 == null) {
                    AbstractActivityC1515c abstractActivityC1515c = c1517e.f12133a;
                    abstractActivityC1515c.getClass();
                    e3 = c1517e.d(abstractActivityC1515c.getIntent());
                    if (e3 == null) {
                        e3 = "/";
                    }
                }
                AbstractActivityC1515c abstractActivityC1515c2 = c1517e.f12133a;
                abstractActivityC1515c2.getClass();
                try {
                    f3 = abstractActivityC1515c2.f();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (f3 != null) {
                    str = f3.getString("io.flutter.EntrypointUri");
                    c1517e.f12133a.d();
                    ((H2.o) c1517e.f12134b.f10090i.f5783b).a("setInitialRoute", e3, null);
                    a6 = c1517e.f12133a.a();
                    if (a6 != null || a6.isEmpty()) {
                        a6 = (String) ((B2.e) B4.i.K().f311b).f255e.f241c;
                    }
                    c1517e.f12134b.f10084c.a(str != null ? new C1556a(a6, c1517e.f12133a.d()) : new C1556a(a6, str, c1517e.f12133a.d()), (List) c1517e.f12133a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c1517e.f12133a.d();
                ((H2.o) c1517e.f12134b.f10090i.f5783b).a("setInitialRoute", e3, null);
                a6 = c1517e.f12133a.a();
                if (a6 != null) {
                }
                a6 = (String) ((B2.e) B4.i.K().f311b).f255e.f241c;
                c1517e.f12134b.f10084c.a(str != null ? new C1556a(a6, c1517e.f12133a.d()) : new C1556a(a6, str, c1517e.f12133a.d()), (List) c1517e.f12133a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c1517e.f12143k;
            if (num != null) {
                c1517e.f12135c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (j("onStop")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            c1517e.f12133a.getClass();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                G2.b bVar = flutterEngine.f10088g;
                bVar.a(5, bVar.f929c);
            }
            c1517e.f12143k = Integer.valueOf(c1517e.f12135c.getVisibility());
            c1517e.f12135c.setVisibility(8);
            FlutterEngine flutterEngine2 = c1517e.f12134b;
            if (flutterEngine2 != null) {
                flutterEngine2.f10083b.b(40);
            }
        }
        this.f12129c.e(EnumC0243m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (j("onTrimMemory")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                if (c1517e.f12141i && i2 >= 10) {
                    FlutterJNI flutterJNI = flutterEngine.f10084c.f12346a;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0482c c0482c = c1517e.f12134b.f10098q;
                    c0482c.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(WebViewManager.EVENT_TYPE_KEY, "memoryPressure");
                    ((f2.t) c0482c.f5783b).g(hashMap, null);
                }
                c1517e.f12134b.f10083b.b(i2);
                io.flutter.plugin.platform.m mVar = c1517e.f12134b.f10100s;
                if (i2 < 40) {
                    mVar.getClass();
                    return;
                }
                Iterator it = mVar.f10243i.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.s) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (j("onUserLeaveHint")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            U.b bVar = flutterEngine.f10085d;
            if (!bVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            O2.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((M0.e) bVar.f3042h).f1786f).iterator();
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
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (j("onWindowFocusChanged")) {
            C1517e c1517e = this.f12128b;
            c1517e.c();
            c1517e.f12133a.getClass();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                G2.b bVar = flutterEngine.f10088g;
                if (z) {
                    bVar.a(bVar.f927a, true);
                } else {
                    bVar.a(bVar.f927a, false);
                }
            }
        }
    }
}
