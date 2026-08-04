package p121q5;

import A5.p;
import A5.u;
import A5.v;
import D3.j;
import G4.C0282o;
import G4.C0286t;
import Q3.o;
import S5.a;
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
import androidx.activity.t;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.InterfaceC0724t;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.editing.ScribePlugin;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.C;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import io.sentry.protocol.SentryThread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p049g5.l;
import p128r5.b;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends Activity implements InterfaceC0724t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15881e = View.generateViewId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15882a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f15883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0726v f15884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f15885d;

    public c() {
        int i7 = Build.VERSION.SDK_INT;
        this.f15885d = i7 < 33 ? null : i7 >= 34 ? new b(this) : new t(this, 3);
        this.f15884c = new C0726v(this);
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
            Bundle bundleE = e();
            String string = bundleE != null ? bundleE.getString("io.flutter.Entrypoint") : null;
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
            Bundle bundleE = e();
            if (bundleE != null) {
                return bundleE.getString("io.flutter.InitialRoute");
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
        if (z4 && !this.f15882a) {
            if (Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f15885d);
                this.f15882a = true;
                return;
            }
            return;
        }
        if (z4 || !this.f15882a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f15885d);
        this.f15882a = false;
    }

    public final boolean g() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (b() != null || this.f15883b.f15895f) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // androidx.lifecycle.InterfaceC0724t
    public final AbstractC0720o getLifecycle() {
        return this.f15884c;
    }

    public final boolean h(String str) {
        f fVar = this.f15883b;
        if (fVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (fVar.f15898i) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (!h("onActivityResult")) {
            return;
        }
        f fVar = this.f15883b;
        fVar.b();
        if (fVar.f15891b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Objects.toString(intent);
        p128r5.c cVar = fVar.f15891b.f16040d;
        if (!cVar.h()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return;
        }
        a.b("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            o oVar = (o) cVar.f16064g;
            oVar.getClass();
            Iterator it = new HashSet((HashSet) oVar.f5824c).iterator();
            while (true) {
                boolean z4 = false;
                while (true) {
                    if (!it.hasNext()) {
                        Trace.endSection();
                        return;
                    } else if (((u) it.next()).onActivityResult(i7, i8, intent) || z4) {
                        z4 = true;
                    }
                }
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

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (h("onBackPressed")) {
            f fVar = this.f15883b;
            fVar.b();
            b bVar = fVar.f15891b;
            if (bVar != null) {
                bVar.f16045i.f18464a.a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0254  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0305  */
    /* JADX WARN: Code duplicated, block: B:122:0x030a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0362 A[LOOP:0: B:124:0x035a->B:126:0x0362, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0379 A[LOOP:1: B:128:0x0371->B:130:0x0379, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0390 A[LOOP:2: B:132:0x0388->B:134:0x0390, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x03ab A[LOOP:3: B:136:0x03a3->B:138:0x03ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x03c1 A[LOOP:4: B:139:0x03b9->B:141:0x03c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x03db  */
    /* JADX WARN: Code duplicated, block: B:146:0x03df  */
    /* JADX WARN: Code duplicated, block: B:161:0x043b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0370 A[EDGE_INSN: B:179:0x0370->B:127:0x0370 BREAK  A[LOOP:0: B:124:0x035a->B:126:0x0362], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0387 A[EDGE_INSN: B:180:0x0387->B:131:0x0387 BREAK  A[LOOP:1: B:128:0x0371->B:130:0x0379], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x039e A[EDGE_INSN: B:181:0x039e->B:135:0x039e BREAK  A[LOOP:2: B:132:0x0388->B:134:0x0390], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03b9 A[EDGE_INSN: B:182:0x03b9->B:139:0x03b9 BREAK  A[LOOP:3: B:136:0x03a3->B:138:0x03ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x03cf A[EDGE_INSN: B:183:0x03cf->B:142:0x03cf BREAK  A[LOOP:4: B:139:0x03b9->B:141:0x03c1], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] byteArray;
        boolean booleanExtra;
        k kVar;
        d dVar;
        boolean zIsEnabled;
        s sVar;
        int i7;
        SparseArray sparseArray;
        int i8;
        SparseArray sparseArray2;
        int i9;
        SparseArray sparseArray3;
        r rVar;
        int i10;
        SparseArray sparseArray4;
        SparseArray sparseArray5;
        Iterator it;
        boolean z4;
        int i11;
        try {
            Bundle bundleE = e();
            if (bundleE != null && (i11 = bundleE.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i11);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            f(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        f fVar = new f(this);
        this.f15883b = fVar;
        fVar.b();
        if (fVar.f15891b == null) {
            String strB = fVar.f15890a.b();
            if (strB != null) {
                b bVar = (b) C0286t.b().f3024a.get(strB);
                fVar.f15891b = bVar;
                fVar.f15895f = true;
                if (bVar == null) {
                    throw new IllegalStateException(AbstractC0486a1.h("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", strB, "'"));
                }
            } else {
                c cVar = fVar.f15890a;
                cVar.getClass();
                fVar.f15891b = l.i(cVar);
                fVar.f15895f = true;
            }
        }
        fVar.f15890a.getClass();
        p128r5.c cVar2 = fVar.f15891b.f16040d;
        C0726v c0726v = fVar.f15890a.f15884c;
        cVar2.getClass();
        a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            f fVar2 = (f) cVar2.f16063f;
            if (fVar2 != null) {
                fVar2.a();
            }
            cVar2.f();
            cVar2.f16063f = fVar;
            c cVar3 = fVar.f15890a;
            cVar3.getClass();
            cVar2.c(cVar3, c0726v);
            Trace.endSection();
            c cVar4 = fVar.f15890a;
            cVar4.getClass();
            fVar.f15893d = new O1.k(cVar4, fVar.f15891b.f16047l, cVar4);
            c cVar5 = fVar.f15890a;
            b bVar2 = fVar.f15891b;
            if (!cVar5.f15883b.f15895f) {
                p115p6.a.h(bVar2);
            }
            fVar.f15898i = true;
            f fVar3 = this.f15883b;
            fVar3.b();
            if (bundle != null) {
                bundle.getBundle("plugins");
                byteArray = bundle.getByteArray("framework");
            } else {
                byteArray = null;
            }
            c cVar6 = fVar3.f15890a;
            int i12 = 0;
            if (cVar6.getIntent().hasExtra("enable_state_restoration")) {
                booleanExtra = cVar6.getIntent().getBooleanExtra("enable_state_restoration", false);
            } else {
                booleanExtra = cVar6.b() == null;
            }
            if (booleanExtra) {
                j jVar = fVar3.f15891b.f16046k;
                jVar.getClass();
                p pVar = (p) jVar.f1726e;
                if (pVar != null) {
                    pVar.success(j.j(byteArray));
                    jVar.f1726e = null;
                    jVar.f1723b = byteArray;
                } else if (jVar.f1724c) {
                    ((A5.s) jVar.f1725d).a("push", j.j(byteArray), new p(2, jVar, byteArray));
                } else {
                    jVar.f1723b = byteArray;
                }
            }
            fVar3.f15890a.getClass();
            p128r5.c cVar7 = fVar3.f15891b.f16040d;
            if (cVar7.h()) {
                a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it2 = ((HashSet) ((o) cVar7.f16064g).f5827f).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
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
            this.f15884c.e(EnumC0718m.ON_CREATE);
            if (a() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            f fVar4 = this.f15883b;
            boolean z7 = (a() == 1 ? (char) 1 : (char) 2) == 1;
            fVar4.b();
            if ((fVar4.f15890a.a() == 1 ? (char) 1 : (char) 2) == 1) {
                c cVar8 = fVar4.f15890a;
                cVar8.getClass();
                i iVar = new i(cVar8, (fVar4.f15890a.a() == 1 ? (char) 1 : (char) 2) == 2);
                fVar4.f15890a.getClass();
                c cVar9 = fVar4.f15890a;
                cVar9.getClass();
                fVar4.f15892c = new m(cVar9, iVar);
            } else {
                c cVar10 = fVar4.f15890a;
                cVar10.getClass();
                k kVar2 = new k(cVar10, null);
                kVar2.f15912a = false;
                kVar2.f15913b = false;
                kVar2.setSurfaceTextureListener(new j(kVar2));
                kVar2.setOpaque((fVar4.f15890a.a() == 1 ? (char) 1 : (char) 2) == 1);
                fVar4.f15890a.getClass();
                c cVar11 = fVar4.f15890a;
                cVar11.getClass();
                fVar4.f15892c = new m(cVar11, kVar2);
            }
            fVar4.f15892c.f15939f.add(fVar4.f15899k);
            fVar4.f15890a.getClass();
            m mVar = fVar4.f15892c;
            b bVar3 = fVar4.f15891b;
            mVar.getClass();
            Objects.toString(bVar3);
            if (!mVar.c()) {
                mVar.f15941y = bVar3;
                kVar = bVar3.f16038b;
                mVar.f15940x = kVar.f14115d;
                mVar.f15937d.a(kVar);
                FlutterJNI flutterJNI = kVar.f14112a;
                dVar = mVar.f15931M;
                flutterJNI.addIsDisplayingFlutterUiListener(dVar);
                if (kVar.f14115d) {
                    dVar.b();
                }
                mVar.f15919A = new V0(mVar, mVar.f15941y.f16044h);
                b bVar4 = mVar.f15941y;
                mVar.f15920B = new TextInputPlugin(mVar, bVar4.f16052q, bVar4.f16048m, bVar4.f16053r, bVar4.f16054s);
                try {
                    TextServicesManager textServicesManager = (TextServicesManager) mVar.getContext().getSystemService("textservices");
                    mVar.f15926H = textServicesManager;
                    mVar.f15921C = new SpellCheckPlugin(textServicesManager, mVar.f15941y.f16050o);
                    while (true) {
                        sparseArray = sVar.f14204n;
                        if (i7 < sparseArray.size()) {
                            break;
                        }
                        sVar.f14195d.addView((io.flutter.plugin.platform.k) sparseArray.valueAt(i7));
                        i7++;
                    }
                    while (true) {
                        sparseArray2 = sVar.f14202l;
                        if (i8 < sparseArray2.size()) {
                            break;
                        }
                        sVar.f14195d.addView((p153v5.a) sparseArray2.valueAt(i8));
                        i8++;
                    }
                    while (true) {
                        sparseArray3 = sVar.f14201k;
                        if (i9 < sparseArray3.size()) {
                            break;
                        }
                        ((f) sparseArray3.valueAt(i9)).onFlutterViewAttached(sVar.f14195d);
                        i9++;
                    }
                    while (true) {
                        sparseArray4 = rVar.j;
                        if (i10 < sparseArray4.size()) {
                            break;
                        }
                        rVar.f14179d.addView((p153v5.a) sparseArray4.valueAt(i10));
                        i10++;
                    }
                    while (true) {
                        sparseArray5 = rVar.f14184i;
                        if (i12 < sparseArray5.size()) {
                            break;
                        }
                        ((f) sparseArray5.valueAt(i12)).onFlutterViewAttached(rVar.f14179d);
                        i12++;
                    }
                } catch (Exception unused2) {
                    Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
                }
                new ScribePlugin(mVar, mVar.f15920B.getInputMethodManager(), mVar.f15941y.f16048m);
                mVar.f15922D = mVar.f15941y.f16041e;
                mVar.f15923E = new u(mVar);
                mVar.f15924F = new a(mVar.f15941y.f16038b, false);
                io.flutter.view.k kVar3 = new io.flutter.view.k(mVar, bVar3.f16042f, (AccessibilityManager) mVar.getContext().getSystemService("accessibility"), mVar.getContext().getContentResolver(), mVar.f15941y.f16053r);
                mVar.f15925G = kVar3;
                kVar3.f14337s = mVar.f15929K;
                zIsEnabled = kVar3.f14322c.isEnabled();
                boolean zIsTouchExplorationEnabled = mVar.f15925G.f14322c.isTouchExplorationEnabled();
                if (mVar.f15941y.f16038b.f14112a.getIsSoftwareRenderingEnabled()) {
                    mVar.setWillNotDraw(false);
                } else {
                    if (!zIsEnabled || zIsTouchExplorationEnabled) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    mVar.setWillNotDraw(z4);
                }
                b bVar5 = mVar.f15941y;
                s sVar2 = bVar5.f16053r;
                sVar2.f14199h.f14143a = mVar.f15925G;
                sVar2.f14193b = new a(bVar5.f16038b, true);
                b bVar6 = mVar.f15941y;
                r rVar2 = bVar6.f16054s;
                rVar2.f14183h.f14143a = mVar.f15925G;
                rVar2.f14177b = new a(bVar6.f16038b, true);
                mVar.f15920B.getInputMethodManager().restartInput(mVar);
                mVar.d();
                mVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, mVar.f15930L);
                mVar.e();
                sVar = bVar3.f16053r;
                sVar.f14195d = mVar;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                rVar = bVar3.f16054s;
                rVar.f14179d = mVar;
                i10 = 0;
                it = mVar.f15942z.iterator();
                if (!it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (mVar.f15940x) {
                    dVar.b();
                }
            } else if (bVar3 != mVar.f15941y) {
                mVar.a();
                mVar.f15941y = bVar3;
                kVar = bVar3.f16038b;
                mVar.f15940x = kVar.f14115d;
                mVar.f15937d.a(kVar);
                FlutterJNI flutterJNI2 = kVar.f14112a;
                dVar = mVar.f15931M;
                flutterJNI2.addIsDisplayingFlutterUiListener(dVar);
                if (kVar.f14115d) {
                    dVar.b();
                }
                mVar.f15919A = new V0(mVar, mVar.f15941y.f16044h);
                b bVar7 = mVar.f15941y;
                mVar.f15920B = new TextInputPlugin(mVar, bVar7.f16052q, bVar7.f16048m, bVar7.f16053r, bVar7.f16054s);
                TextServicesManager textServicesManager2 = (TextServicesManager) mVar.getContext().getSystemService("textservices");
                mVar.f15926H = textServicesManager2;
                mVar.f15921C = new SpellCheckPlugin(textServicesManager2, mVar.f15941y.f16050o);
                new ScribePlugin(mVar, mVar.f15920B.getInputMethodManager(), mVar.f15941y.f16048m);
                mVar.f15922D = mVar.f15941y.f16041e;
                mVar.f15923E = new u(mVar);
                mVar.f15924F = new a(mVar.f15941y.f16038b, false);
                io.flutter.view.k kVar4 = new io.flutter.view.k(mVar, bVar3.f16042f, (AccessibilityManager) mVar.getContext().getSystemService("accessibility"), mVar.getContext().getContentResolver(), mVar.f15941y.f16053r);
                mVar.f15925G = kVar4;
                kVar4.f14337s = mVar.f15929K;
                zIsEnabled = kVar4.f14322c.isEnabled();
                boolean zIsTouchExplorationEnabled2 = mVar.f15925G.f14322c.isTouchExplorationEnabled();
                if (mVar.f15941y.f16038b.f14112a.getIsSoftwareRenderingEnabled()) {
                    if (zIsEnabled) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    mVar.setWillNotDraw(z4);
                } else {
                    mVar.setWillNotDraw(false);
                }
                b bVar8 = mVar.f15941y;
                s sVar3 = bVar8.f16053r;
                sVar3.f14199h.f14143a = mVar.f15925G;
                sVar3.f14193b = new a(bVar8.f16038b, true);
                b bVar9 = mVar.f15941y;
                r rVar3 = bVar9.f16054s;
                rVar3.f14183h.f14143a = mVar.f15925G;
                rVar3.f14177b = new a(bVar9.f16038b, true);
                mVar.f15920B.getInputMethodManager().restartInput(mVar);
                mVar.d();
                mVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, mVar.f15930L);
                mVar.e();
                sVar = bVar3.f16053r;
                sVar.f14195d = mVar;
                i7 = 0;
                while (true) {
                    sparseArray = sVar.f14204n;
                    if (i7 < sparseArray.size()) {
                        break;
                        break;
                    } else {
                        sVar.f14195d.addView((io.flutter.plugin.platform.k) sparseArray.valueAt(i7));
                        i7++;
                    }
                }
                i8 = 0;
                while (true) {
                    sparseArray2 = sVar.f14202l;
                    if (i8 < sparseArray2.size()) {
                        break;
                        break;
                    } else {
                        sVar.f14195d.addView((p153v5.a) sparseArray2.valueAt(i8));
                        i8++;
                    }
                }
                i9 = 0;
                while (true) {
                    sparseArray3 = sVar.f14201k;
                    if (i9 < sparseArray3.size()) {
                        break;
                        break;
                    } else {
                        ((f) sparseArray3.valueAt(i9)).onFlutterViewAttached(sVar.f14195d);
                        i9++;
                    }
                }
                rVar = bVar3.f16054s;
                rVar.f14179d = mVar;
                i10 = 0;
                while (true) {
                    sparseArray4 = rVar.j;
                    if (i10 < sparseArray4.size()) {
                        break;
                        break;
                    } else {
                        rVar.f14179d.addView((p153v5.a) sparseArray4.valueAt(i10));
                        i10++;
                    }
                }
                while (true) {
                    sparseArray5 = rVar.f14184i;
                    if (i12 < sparseArray5.size()) {
                        break;
                        break;
                    } else {
                        ((f) sparseArray5.valueAt(i12)).onFlutterViewAttached(rVar.f14179d);
                        i12++;
                    }
                }
                it = mVar.f15942z.iterator();
                if (!it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (mVar.f15940x) {
                    dVar.b();
                }
            }
            fVar4.f15892c.setId(f15881e);
            if (z7) {
                m mVar2 = fVar4.f15892c;
                if ((fVar4.f15890a.a() == 1 ? (char) 1 : (char) 2) != 1) {
                    throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                }
                if (fVar4.f15894e != null) {
                    mVar2.getViewTreeObserver().removeOnPreDrawListener(fVar4.f15894e);
                }
                fVar4.f15894e = new e(fVar4, mVar2);
                mVar2.getViewTreeObserver().addOnPreDrawListener(fVar4.f15894e);
            }
            setContentView(fVar4.f15892c);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
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
        super.onDestroy();
        if (h("onDestroy")) {
            this.f15883b.d();
            this.f15883b.e();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f15885d);
            this.f15882a = false;
        }
        f fVar = this.f15883b;
        if (fVar != null) {
            fVar.f15890a = null;
            fVar.f15891b = null;
            fVar.f15892c = null;
            fVar.f15893d = null;
            this.f15883b = null;
        }
        this.f15884c.e(EnumC0718m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (h("onNewIntent")) {
            f fVar = this.f15883b;
            fVar.b();
            b bVar = fVar.f15891b;
            if (bVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            p128r5.c cVar = bVar.f16040d;
            if (cVar.h()) {
                a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) ((o) cVar.f16064g).f5825d).iterator();
                    while (it.hasNext()) {
                        ((v) it.next()).a(intent);
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
            String strC = fVar.c(intent);
            if (strC == null || strC.isEmpty()) {
                return;
            }
            p174z5.a aVar = fVar.f15891b.f16045i;
            aVar.getClass();
            HashMap map = new HashMap();
            map.put("location", strC);
            aVar.f18464a.a("pushRouteInformation", map, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (h("onPause")) {
            f fVar = this.f15883b;
            fVar.b();
            fVar.f15890a.getClass();
            b bVar = fVar.f15891b;
            if (bVar != null) {
                S1 s7 = bVar.f16043g;
                s7.a(3, s7.f7028c);
            }
        }
        this.f15884c.e(EnumC0718m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (h("onPostResume")) {
            f fVar = this.f15883b;
            fVar.b();
            if (fVar.f15891b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            O1.k kVar = fVar.f15893d;
            if (kVar != null) {
                kVar.m();
            }
            fVar.f15891b.f16053r.m();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (h("onRequestPermissionsResult")) {
            f fVar = this.f15883b;
            fVar.b();
            if (fVar.f15891b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            Arrays.toString(strArr);
            Arrays.toString(iArr);
            p128r5.c cVar = fVar.f15891b.f16040d;
            if (!cVar.h()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                ((o) cVar.f16064g).k(i7, strArr, iArr);
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
        this.f15884c.e(EnumC0718m.ON_RESUME);
        if (h("onResume")) {
            f fVar = this.f15883b;
            fVar.b();
            fVar.f15890a.getClass();
            b bVar = fVar.f15891b;
            if (bVar != null) {
                S1 s7 = bVar.f16043g;
                s7.a(2, s7.f7028c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (h("onSaveInstanceState")) {
            f fVar = this.f15883b;
            fVar.b();
            c cVar = fVar.f15890a;
            boolean booleanExtra = false;
            if (cVar.getIntent().hasExtra("enable_state_restoration")) {
                booleanExtra = cVar.getIntent().getBooleanExtra("enable_state_restoration", false);
            } else if (cVar.b() == null) {
                booleanExtra = true;
            }
            if (booleanExtra) {
                bundle.putByteArray("framework", (byte[]) fVar.f15891b.f16046k.f1723b);
            }
            fVar.f15890a.getClass();
            Bundle bundle2 = new Bundle();
            p128r5.c cVar2 = fVar.f15891b.f16040d;
            if (cVar2.h()) {
                a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) ((o) cVar2.f16064g).f5827f).iterator();
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
            if (fVar.f15890a.b() == null || fVar.f15890a.g()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", fVar.f15890a.f15882a);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        String string;
        String dataString;
        super.onStart();
        this.f15884c.e(EnumC0718m.ON_START);
        if (h("onStart")) {
            f fVar = this.f15883b;
            fVar.b();
            if (fVar.f15890a.b() == null && !fVar.f15891b.f16039c.f14858b) {
                String strD = fVar.f15890a.d();
                if (strD == null) {
                    c cVar = fVar.f15890a;
                    cVar.getClass();
                    strD = fVar.c(cVar.getIntent());
                    if (strD == null) {
                        strD = "/";
                    }
                }
                c cVar2 = fVar.f15890a;
                cVar2.getClass();
                String str = null;
                try {
                    Bundle bundleE = cVar2.e();
                    string = bundleE != null ? bundleE.getString("io.flutter.EntrypointUri") : null;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                fVar.f15890a.c();
                fVar.f15891b.f16045i.f18464a.a("setInitialRoute", strD, null);
                c cVar3 = fVar.f15890a;
                if ((cVar3.getApplicationInfo().flags & 2) != 0 && "android.intent.action.RUN".equals(cVar3.getIntent().getAction()) && (dataString = cVar3.getIntent().getDataString()) != null) {
                    str = dataString;
                }
                if (str == null || str.isEmpty()) {
                    str = (String) ((C0282o) ((p148u5.c) android.support.v4.media.session.t.l0().f8076b).f16885d).f3011c;
                }
                fVar.f15891b.f16039c.b(string == null ? new p135s5.a(str, fVar.f15890a.c()) : new p135s5.a(str, string, fVar.f15890a.c()), (List) fVar.f15890a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = fVar.j;
            if (num != null) {
                fVar.f15892c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (h("onStop")) {
            f fVar = this.f15883b;
            fVar.b();
            fVar.f15890a.getClass();
            b bVar = fVar.f15891b;
            if (bVar != null) {
                S1 s7 = bVar.f16043g;
                s7.a(5, s7.f7028c);
            }
            fVar.j = Integer.valueOf(fVar.f15892c.getVisibility());
            fVar.f15892c.setVisibility(8);
            b bVar2 = fVar.f15891b;
            if (bVar2 != null) {
                bVar2.f16038b.e(40);
            }
        }
        this.f15884c.e(EnumC0718m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (h("onTrimMemory")) {
            f fVar = this.f15883b;
            fVar.b();
            b bVar = fVar.f15891b;
            if (bVar != null) {
                if (fVar.f15897h && i7 >= 10) {
                    FlutterJNI flutterJNI = (FlutterJNI) bVar.f16039c.f14859c;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    R4.c cVar = fVar.f15891b.f16051p;
                    cVar.getClass();
                    HashMap map = new HashMap(1);
                    map.put("type", "memoryPressure");
                    ((F0) cVar.f6064b).L(map, null);
                }
                fVar.f15891b.f16038b.e(i7);
                s sVar = fVar.f15891b.f16053r;
                if (i7 < 40) {
                    sVar.getClass();
                    return;
                }
                Iterator it = sVar.f14200i.values().iterator();
                while (it.hasNext()) {
                    ((C) it.next()).f14140h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (h("onUserLeaveHint")) {
            f fVar = this.f15883b;
            fVar.b();
            b bVar = fVar.f15891b;
            if (bVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            p128r5.c cVar = bVar.f16040d;
            if (!cVar.h()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) ((o) cVar.f16064g).f5826e).iterator();
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
            f fVar = this.f15883b;
            fVar.b();
            fVar.f15890a.getClass();
            b bVar = fVar.f15891b;
            if (bVar != null) {
                S1 s7 = bVar.f16043g;
                if (z4) {
                    s7.a(s7.f7026a, true);
                } else {
                    s7.a(s7.f7026a, false);
                }
            }
        }
    }
}
