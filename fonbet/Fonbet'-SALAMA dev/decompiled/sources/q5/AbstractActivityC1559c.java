package q5;

import G4.C0282o;
import G4.C0286t;
import W5.AbstractC0486a1;
import W5.S1;
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
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.InterfaceC0745t;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.ScribePlugin;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.C;
import io.sentry.protocol.SentryThread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p6.AbstractC1539a;
import r5.C1577b;
import r5.C1578c;
import s5.C1599a;
import u5.C1649c;
import v5.C1667a;
import w1.F0;
import w1.V0;
import z5.C1819a;

/* renamed from: q5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC1559c extends Activity implements InterfaceC0745t {

    /* renamed from: e, reason: collision with root package name */
    public static final int f15875e = View.generateViewId();

    /* renamed from: a, reason: collision with root package name */
    public boolean f15876a = false;

    /* renamed from: b, reason: collision with root package name */
    public C1562f f15877b;

    /* renamed from: c, reason: collision with root package name */
    public final C0747v f15878c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f15879d;

    public AbstractActivityC1559c() {
        int i7 = Build.VERSION.SDK_INT;
        this.f15879d = i7 < 33 ? null : i7 >= 34 ? new C1558b(this) : new androidx.activity.t(this, 3);
        this.f15878c = new C0747v(this);
    }

    public final int a() {
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

    public final String b() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String c() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle e7 = e();
            String string = e7 != null ? e7.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : SentryThread.JsonKeys.MAIN;
        } catch (PackageManager.NameNotFoundException unused) {
            return SentryThread.JsonKeys.MAIN;
        }
    }

    public final String d() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle e7 = e();
            if (e7 != null) {
                return e7.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle e() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void f(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z4 && !this.f15876a) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f15879d);
                this.f15876a = true;
                return;
            }
            return;
        }
        if (z4 || !this.f15876a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f15879d);
        this.f15876a = false;
    }

    public final boolean g() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (b() != null || this.f15877b.f15889f) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // androidx.lifecycle.InterfaceC0745t
    public final AbstractC0741o getLifecycle() {
        return this.f15878c;
    }

    public final boolean h(String str) {
        C1562f c1562f = this.f15877b;
        if (c1562f == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c1562f.f15892i) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (h("onActivityResult")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            if (c1562f.f15885b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Objects.toString(intent);
            C1578c c1578c = c1562f.f15885b.f16034d;
            if (!c1578c.h()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            S5.a.b("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                Q3.o oVar = (Q3.o) c1578c.f16058g;
                oVar.getClass();
                Iterator it = new HashSet((HashSet) oVar.f5824c).iterator();
                while (true) {
                    boolean z4 = false;
                    while (it.hasNext()) {
                        if (((A5.u) it.next()).onActivityResult(i7, i8, intent) || z4) {
                            z4 = true;
                        }
                    }
                    Trace.endSection();
                    return;
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
    public final void onBackPressed() {
        if (h("onBackPressed")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                c1577b.f16039i.f18458a.a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:22|23|(1:25)|26|27|(1:29)|30|(1:32)(1:166)|33|(1:35)(2:162|(1:164)(1:165))|(2:37|(1:39)(2:40|(1:42)(1:43)))|44|(4:46|47|48|(1:50)(2:148|(1:150)(2:151|152)))(1:161)|51|(1:53)|54|(1:56)(1:147)|(1:58)(1:146)|59|(1:61)(1:145)|(4:63|(1:65)(1:136)|(1:67)(1:135)|68)(4:137|(1:139)(1:144)|(1:141)(1:143)|142)|69|(6:71|(1:73)|74|(3:76|(1:78)|(3:80|(1:82)|83)(2:84|85))|86|87)|88|(1:90)|91|92|93|94|(2:(1:131)(1:98)|99)(1:132)|100|(2:101|(1:103)(1:104))|105|(2:106|(1:108)(1:109))|110|(2:111|(1:113)(1:114))|115|(2:116|(1:118)(1:119))|(2:120|(1:122)(1:123))|124|(6:126|(1:128)|74|(0)|86|87)(2:129|130)) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028f, code lost:
    
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03eb  */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        int i7;
        try {
            Bundle e7 = e();
            if (e7 != null && (i7 = e7.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i7);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            f(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C1562f c1562f = new C1562f(this);
        this.f15877b = c1562f;
        c1562f.b();
        if (c1562f.f15885b == null) {
            String b7 = c1562f.f15884a.b();
            if (b7 != null) {
                C1577b c1577b = (C1577b) C0286t.b().f3024a.get(b7);
                c1562f.f15885b = c1577b;
                c1562f.f15889f = true;
                if (c1577b == null) {
                    throw new IllegalStateException(AbstractC0486a1.h("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", b7, "'"));
                }
            } else {
                AbstractActivityC1559c abstractActivityC1559c = c1562f.f15884a;
                abstractActivityC1559c.getClass();
                c1562f.f15885b = g5.l.i(abstractActivityC1559c);
                c1562f.f15889f = true;
            }
        }
        c1562f.f15884a.getClass();
        C1578c c1578c = c1562f.f15885b.f16034d;
        C0747v c0747v = c1562f.f15884a.f15878c;
        c1578c.getClass();
        S5.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C1562f c1562f2 = (C1562f) c1578c.f16057f;
            if (c1562f2 != null) {
                c1562f2.a();
            }
            c1578c.f();
            c1578c.f16057f = c1562f;
            AbstractActivityC1559c abstractActivityC1559c2 = c1562f.f15884a;
            abstractActivityC1559c2.getClass();
            c1578c.c(abstractActivityC1559c2, c0747v);
            Trace.endSection();
            AbstractActivityC1559c abstractActivityC1559c3 = c1562f.f15884a;
            abstractActivityC1559c3.getClass();
            c1562f.f15887d = new O1.k(abstractActivityC1559c3, c1562f.f15885b.f16041l, abstractActivityC1559c3);
            AbstractActivityC1559c abstractActivityC1559c4 = c1562f.f15884a;
            C1577b c1577b2 = c1562f.f15885b;
            if (!abstractActivityC1559c4.f15877b.f15889f) {
                AbstractC1539a.h(c1577b2);
            }
            c1562f.f15892i = true;
            C1562f c1562f3 = this.f15877b;
            c1562f3.b();
            if (bundle != null) {
                bundle.getBundle("plugins");
                bArr = bundle.getByteArray("framework");
            } else {
                bArr = null;
            }
            AbstractActivityC1559c abstractActivityC1559c5 = c1562f3.f15884a;
            int i8 = 0;
            if (abstractActivityC1559c5.getIntent().hasExtra("enable_state_restoration") ? abstractActivityC1559c5.getIntent().getBooleanExtra("enable_state_restoration", false) : abstractActivityC1559c5.b() == null) {
                D3.j jVar = c1562f3.f15885b.f16040k;
                jVar.getClass();
                A5.p pVar = (A5.p) jVar.f1726e;
                if (pVar != null) {
                    pVar.success(D3.j.j(bArr));
                    jVar.f1726e = null;
                    jVar.f1723b = bArr;
                } else if (jVar.f1724c) {
                    ((A5.s) jVar.f1725d).a("push", D3.j.j(bArr), new A5.p(2, jVar, bArr));
                } else {
                    jVar.f1723b = bArr;
                }
            }
            c1562f3.f15884a.getClass();
            C1578c c1578c2 = c1562f3.f15885b.f16034d;
            if (c1578c2.h()) {
                S5.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it = ((HashSet) ((Q3.o) c1578c2.f16058g).f5827f).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } finally {
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f15878c.e(EnumC0739m.ON_CREATE);
            if (a() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            C1562f c1562f4 = this.f15877b;
            boolean z4 = a() == 1 ? true : 2;
            c1562f4.b();
            if (c1562f4.f15884a.a() == 1 ? true : 2) {
                AbstractActivityC1559c abstractActivityC1559c6 = c1562f4.f15884a;
                abstractActivityC1559c6.getClass();
                C1565i c1565i = new C1565i(abstractActivityC1559c6, (c1562f4.f15884a.a() == 1 ? (char) 1 : (char) 2) == 2);
                c1562f4.f15884a.getClass();
                AbstractActivityC1559c abstractActivityC1559c7 = c1562f4.f15884a;
                abstractActivityC1559c7.getClass();
                c1562f4.f15886c = new m(abstractActivityC1559c7, c1565i);
            } else {
                AbstractActivityC1559c abstractActivityC1559c8 = c1562f4.f15884a;
                abstractActivityC1559c8.getClass();
                k kVar = new k(abstractActivityC1559c8, null);
                kVar.f15906a = false;
                kVar.f15907b = false;
                kVar.setSurfaceTextureListener(new j(kVar));
                kVar.setOpaque(c1562f4.f15884a.a() == 1 ? true : 2);
                c1562f4.f15884a.getClass();
                AbstractActivityC1559c abstractActivityC1559c9 = c1562f4.f15884a;
                abstractActivityC1559c9.getClass();
                c1562f4.f15886c = new m(abstractActivityC1559c9, kVar);
            }
            c1562f4.f15886c.f15933f.add(c1562f4.f15893k);
            c1562f4.f15884a.getClass();
            m mVar = c1562f4.f15886c;
            C1577b c1577b3 = c1562f4.f15885b;
            mVar.getClass();
            Objects.toString(c1577b3);
            if (mVar.c()) {
                if (c1577b3 != mVar.f15935y) {
                    mVar.a();
                }
                c1562f4.f15886c.setId(f15875e);
                if (z4) {
                    m mVar2 = c1562f4.f15886c;
                    if ((c1562f4.f15884a.a() == 1 ? (char) 1 : (char) 2) != 1) {
                        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                    }
                    if (c1562f4.f15888e != null) {
                        mVar2.getViewTreeObserver().removeOnPreDrawListener(c1562f4.f15888e);
                    }
                    c1562f4.f15888e = new ViewTreeObserverOnPreDrawListenerC1561e(c1562f4, mVar2);
                    mVar2.getViewTreeObserver().addOnPreDrawListener(c1562f4.f15888e);
                }
                setContentView(c1562f4.f15886c);
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(1073741824);
                window.getDecorView().setSystemUiVisibility(1280);
            }
            mVar.f15935y = c1577b3;
            io.flutter.embedding.engine.renderer.k kVar2 = c1577b3.f16032b;
            mVar.f15934x = kVar2.f14109d;
            mVar.f15931d.a(kVar2);
            FlutterJNI flutterJNI = kVar2.f14106a;
            C1560d c1560d = mVar.f15925M;
            flutterJNI.addIsDisplayingFlutterUiListener(c1560d);
            if (kVar2.f14109d) {
                c1560d.b();
            }
            mVar.f15913A = new V0(mVar, mVar.f15935y.f16038h);
            C1577b c1577b4 = mVar.f15935y;
            mVar.f15914B = new TextInputPlugin(mVar, c1577b4.f16046q, c1577b4.f16042m, c1577b4.f16047r, c1577b4.f16048s);
            TextServicesManager textServicesManager = (TextServicesManager) mVar.getContext().getSystemService("textservices");
            mVar.f15920H = textServicesManager;
            mVar.f15915C = new SpellCheckPlugin(textServicesManager, mVar.f15935y.f16044o);
            new ScribePlugin(mVar, mVar.f15914B.getInputMethodManager(), mVar.f15935y.f16042m);
            mVar.f15916D = mVar.f15935y.f16035e;
            mVar.f15917E = new u(mVar);
            mVar.f15918F = new C1557a(mVar.f15935y.f16032b, false);
            io.flutter.view.k kVar3 = new io.flutter.view.k(mVar, c1577b3.f16036f, (AccessibilityManager) mVar.getContext().getSystemService("accessibility"), mVar.getContext().getContentResolver(), mVar.f15935y.f16047r);
            mVar.f15919G = kVar3;
            kVar3.f14331s = mVar.f15923K;
            boolean isEnabled = kVar3.f14316c.isEnabled();
            boolean isTouchExplorationEnabled = mVar.f15919G.f14316c.isTouchExplorationEnabled();
            if (mVar.f15935y.f16032b.f14106a.getIsSoftwareRenderingEnabled()) {
                mVar.setWillNotDraw(false);
            } else {
                mVar.setWillNotDraw((isEnabled || isTouchExplorationEnabled) ? false : true);
            }
            C1577b c1577b5 = mVar.f15935y;
            io.flutter.plugin.platform.s sVar = c1577b5.f16047r;
            sVar.f14193h.f14137a = mVar.f15919G;
            sVar.f14187b = new C1557a(c1577b5.f16032b, true);
            C1577b c1577b6 = mVar.f15935y;
            io.flutter.plugin.platform.r rVar = c1577b6.f16048s;
            rVar.f14177h.f14137a = mVar.f15919G;
            rVar.f14171b = new C1557a(c1577b6.f16032b, true);
            mVar.f15914B.getInputMethodManager().restartInput(mVar);
            mVar.d();
            mVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, mVar.f15924L);
            mVar.e();
            io.flutter.plugin.platform.s sVar2 = c1577b3.f16047r;
            sVar2.f14189d = mVar;
            int i9 = 0;
            while (true) {
                SparseArray sparseArray = sVar2.f14198n;
                if (i9 >= sparseArray.size()) {
                    break;
                }
                sVar2.f14189d.addView((io.flutter.plugin.platform.k) sparseArray.valueAt(i9));
                i9++;
            }
            int i10 = 0;
            while (true) {
                SparseArray sparseArray2 = sVar2.f14196l;
                if (i10 >= sparseArray2.size()) {
                    break;
                }
                sVar2.f14189d.addView((C1667a) sparseArray2.valueAt(i10));
                i10++;
            }
            int i11 = 0;
            while (true) {
                SparseArray sparseArray3 = sVar2.f14195k;
                if (i11 >= sparseArray3.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f) sparseArray3.valueAt(i11)).onFlutterViewAttached(sVar2.f14189d);
                i11++;
            }
            io.flutter.plugin.platform.r rVar2 = c1577b3.f16048s;
            rVar2.f14173d = mVar;
            int i12 = 0;
            while (true) {
                SparseArray sparseArray4 = rVar2.j;
                if (i12 >= sparseArray4.size()) {
                    break;
                }
                rVar2.f14173d.addView((C1667a) sparseArray4.valueAt(i12));
                i12++;
            }
            while (true) {
                SparseArray sparseArray5 = rVar2.f14178i;
                if (i8 >= sparseArray5.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f) sparseArray5.valueAt(i8)).onFlutterViewAttached(rVar2.f14173d);
                i8++;
            }
            Iterator it2 = mVar.f15936z.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            if (mVar.f15934x) {
                c1560d.b();
            }
            c1562f4.f15886c.setId(f15875e);
            if (z4) {
            }
            setContentView(c1562f4.f15886c);
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.setStatusBarColor(1073741824);
            window2.getDecorView().setSystemUiVisibility(1280);
        } finally {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (h("onDestroy")) {
            this.f15877b.d();
            this.f15877b.e();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f15879d);
            this.f15876a = false;
        }
        C1562f c1562f = this.f15877b;
        if (c1562f != null) {
            c1562f.f15884a = null;
            c1562f.f15885b = null;
            c1562f.f15886c = null;
            c1562f.f15887d = null;
            this.f15877b = null;
        }
        this.f15878c.e(EnumC0739m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (h("onNewIntent")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C1578c c1578c = c1577b.f16034d;
            if (c1578c.h()) {
                S5.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((Q3.o) c1578c.f16058g).f5825d).iterator();
                    while (it.hasNext()) {
                        ((A5.v) it.next()).a(intent);
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
            String c3 = c1562f.c(intent);
            if (c3 == null || c3.isEmpty()) {
                return;
            }
            C1819a c1819a = c1562f.f15885b.f16039i;
            c1819a.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("location", c3);
            c1819a.f18458a.a("pushRouteInformation", hashMap, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (h("onPause")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            c1562f.f15884a.getClass();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                S1 s12 = c1577b.f16037g;
                s12.a(3, s12.f7028c);
            }
        }
        this.f15878c.e(EnumC0739m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (h("onPostResume")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            if (c1562f.f15885b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            O1.k kVar = c1562f.f15887d;
            if (kVar != null) {
                kVar.m();
            }
            c1562f.f15885b.f16047r.m();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (h("onRequestPermissionsResult")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            if (c1562f.f15885b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            C1578c c1578c = c1562f.f15885b.f16034d;
            if (!c1578c.h()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            S5.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                ((Q3.o) c1578c.f16058g).k(i7, strArr, iArr);
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
    public final void onResume() {
        super.onResume();
        this.f15878c.e(EnumC0739m.ON_RESUME);
        if (h("onResume")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            c1562f.f15884a.getClass();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                S1 s12 = c1577b.f16037g;
                s12.a(2, s12.f7028c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (h("onSaveInstanceState")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            AbstractActivityC1559c abstractActivityC1559c = c1562f.f15884a;
            boolean z4 = false;
            if (abstractActivityC1559c.getIntent().hasExtra("enable_state_restoration")) {
                z4 = abstractActivityC1559c.getIntent().getBooleanExtra("enable_state_restoration", false);
            } else if (abstractActivityC1559c.b() == null) {
                z4 = true;
            }
            if (z4) {
                bundle.putByteArray("framework", (byte[]) c1562f.f15885b.f16040k.f1723b);
            }
            c1562f.f15884a.getClass();
            Bundle bundle2 = new Bundle();
            C1578c c1578c = c1562f.f15885b.f16034d;
            if (c1578c.h()) {
                S5.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((Q3.o) c1578c.f16058g).f5827f).iterator();
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
            if (c1562f.f15884a.b() == null || c1562f.f15884a.g()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", c1562f.f15884a.f15876a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStart() {
        String str;
        AbstractActivityC1559c abstractActivityC1559c;
        String dataString;
        Bundle e7;
        super.onStart();
        this.f15878c.e(EnumC0739m.ON_START);
        if (h("onStart")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            if (c1562f.f15884a.b() == null && !c1562f.f15885b.f16033c.f14852b) {
                String d7 = c1562f.f15884a.d();
                if (d7 == null) {
                    AbstractActivityC1559c abstractActivityC1559c2 = c1562f.f15884a;
                    abstractActivityC1559c2.getClass();
                    d7 = c1562f.c(abstractActivityC1559c2.getIntent());
                    if (d7 == null) {
                        d7 = "/";
                    }
                }
                AbstractActivityC1559c abstractActivityC1559c3 = c1562f.f15884a;
                abstractActivityC1559c3.getClass();
                String str2 = null;
                try {
                    e7 = abstractActivityC1559c3.e();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (e7 != null) {
                    str = e7.getString("io.flutter.EntrypointUri");
                    c1562f.f15884a.c();
                    c1562f.f15885b.f16039i.f18458a.a("setInitialRoute", d7, null);
                    abstractActivityC1559c = c1562f.f15884a;
                    if ((abstractActivityC1559c.getApplicationInfo().flags & 2) != 0 && "android.intent.action.RUN".equals(abstractActivityC1559c.getIntent().getAction()) && (dataString = abstractActivityC1559c.getIntent().getDataString()) != null) {
                        str2 = dataString;
                    }
                    if (str2 != null || str2.isEmpty()) {
                        str2 = (String) ((C0282o) ((C1649c) android.support.v4.media.session.t.l0().f8076b).f16879d).f3011c;
                    }
                    c1562f.f15885b.f16033c.b(str != null ? new C1599a(str2, c1562f.f15884a.c()) : new C1599a(str2, str, c1562f.f15884a.c()), (List) c1562f.f15884a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                }
                str = null;
                c1562f.f15884a.c();
                c1562f.f15885b.f16039i.f18458a.a("setInitialRoute", d7, null);
                abstractActivityC1559c = c1562f.f15884a;
                if ((abstractActivityC1559c.getApplicationInfo().flags & 2) != 0) {
                    str2 = dataString;
                }
                if (str2 != null) {
                }
                str2 = (String) ((C0282o) ((C1649c) android.support.v4.media.session.t.l0().f8076b).f16879d).f3011c;
                c1562f.f15885b.f16033c.b(str != null ? new C1599a(str2, c1562f.f15884a.c()) : new C1599a(str2, str, c1562f.f15884a.c()), (List) c1562f.f15884a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = c1562f.j;
            if (num != null) {
                c1562f.f15886c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (h("onStop")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            c1562f.f15884a.getClass();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                S1 s12 = c1577b.f16037g;
                s12.a(5, s12.f7028c);
            }
            c1562f.j = Integer.valueOf(c1562f.f15886c.getVisibility());
            c1562f.f15886c.setVisibility(8);
            C1577b c1577b2 = c1562f.f15885b;
            if (c1577b2 != null) {
                c1577b2.f16032b.e(40);
            }
        }
        this.f15878c.e(EnumC0739m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (h("onTrimMemory")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                if (c1562f.f15891h && i7 >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) c1577b.f16033c.f14853c;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    R4.c cVar = c1562f.f15885b.f16045p;
                    cVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((F0) cVar.f6064b).L(hashMap, null);
                }
                c1562f.f15885b.f16032b.e(i7);
                io.flutter.plugin.platform.s sVar = c1562f.f15885b.f16047r;
                if (i7 < 40) {
                    sVar.getClass();
                    return;
                }
                Iterator it = sVar.f14194i.values().iterator();
                while (it.hasNext()) {
                    ((C) it.next()).f14134h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (h("onUserLeaveHint")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            C1578c c1578c = c1577b.f16034d;
            if (!c1578c.h()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            S5.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((Q3.o) c1578c.f16058g).f5826e).iterator();
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
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (h("onWindowFocusChanged")) {
            C1562f c1562f = this.f15877b;
            c1562f.b();
            c1562f.f15884a.getClass();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                S1 s12 = c1577b.f16037g;
                if (z4) {
                    s12.a(s12.f7026a, true);
                } else {
                    s12.a(s12.f7026a, false);
                }
            }
        }
    }
}
