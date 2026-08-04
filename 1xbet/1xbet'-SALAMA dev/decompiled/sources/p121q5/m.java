package p121q5;

import B5.a;
import C5.b;
import D6.E;
import D6.InterfaceC0118e0;
import D6.Z;
import R4.c;
import X0.g;
import X0.h;
import X0.i;
import Y4.D;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import io.flutter.view.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p136t.e;
import p155w1.C1010l1;
import p155w1.C1017n0;
import p155w1.C1050x1;
import p155w1.C1052y0;
import p155w1.F0;
import p155w1.P2;
import p155w1.V0;
import p174z5.l;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends FrameLayout implements b, t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public V0 f15919A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextInputPlugin f15920B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SpellCheckPlugin f15921C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public a f15922D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public u f15923E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public a f15924F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public k f15925G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextServicesManager f15926H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public c f15927I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final j f15928J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C1010l1 f15929K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Y.a f15930L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final d f15931M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public i f15932N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public n f15933O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f15936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f15937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f15938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f15939f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p128r5.b f15941y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f15942z;

    public m(c cVar, i iVar) {
        super(cVar, null);
        this.f15939f = new HashSet();
        this.f15942z = new HashSet();
        this.f15928J = new j();
        this.f15929K = new C1010l1(this);
        this.f15930L = new Y.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f15931M = new d(this, 2);
        this.f15933O = new n();
        this.f15934a = iVar;
        this.f15937d = iVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f15941y);
        if (c()) {
            Iterator it = this.f15942z.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f15930L);
            s sVar = this.f15941y.f16053r;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray2 = sVar.f14204n;
                if (i7 >= sparseArray2.size()) {
                    break;
                }
                sVar.f14195d.removeView((io.flutter.plugin.platform.k) sparseArray2.valueAt(i7));
                i7++;
            }
            int i8 = 0;
            while (true) {
                SparseArray sparseArray3 = sVar.f14202l;
                if (i8 >= sparseArray3.size()) {
                    break;
                }
                sVar.f14195d.removeView((p153v5.a) sparseArray3.valueAt(i8));
                i8++;
            }
            sVar.g();
            if (sVar.f14195d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i9 = 0;
                while (true) {
                    sparseArray = sVar.f14203m;
                    if (i9 >= sparseArray.size()) {
                        break;
                    }
                    sVar.f14195d.removeView((View) sparseArray.valueAt(i9));
                    i9++;
                }
                sparseArray.clear();
            }
            sVar.f14195d = null;
            sVar.f14206p = false;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray4 = sVar.f14201k;
                if (i10 >= sparseArray4.size()) {
                    break;
                }
                ((f) sparseArray4.valueAt(i10)).onFlutterViewDetached();
                i10++;
            }
            r rVar = this.f15941y.f16054s;
            int i11 = 0;
            while (true) {
                SparseArray sparseArray5 = rVar.j;
                if (i11 >= sparseArray5.size()) {
                    break;
                }
                rVar.f14179d.removeView((p153v5.a) sparseArray5.valueAt(i11));
                i11++;
            }
            Surface surface = rVar.f14188n;
            if (surface != null) {
                surface.release();
                rVar.f14188n = null;
                rVar.f14189o = null;
            }
            rVar.f14179d = null;
            int i12 = 0;
            while (true) {
                SparseArray sparseArray6 = rVar.f14184i;
                if (i12 >= sparseArray6.size()) {
                    break;
                }
                ((f) sparseArray6.valueAt(i12)).onFlutterViewDetached();
                i12++;
            }
            this.f15941y.f16053r.d();
            this.f15941y.f16054s.d();
            k kVar = this.f15925G;
            kVar.f14339u = true;
            kVar.f14324e.d();
            kVar.f14337s = null;
            AccessibilityManager accessibilityManager = kVar.f14322c;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f14341w);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f14342x);
            kVar.f14325f.unregisterContentObserver(kVar.f14343y);
            C1017n0 c1017n0 = kVar.f14321b;
            c1017n0.f17813d = null;
            ((FlutterJNI) c1017n0.f17812c).setAccessibilityDelegate(null);
            this.f15925G = null;
            this.f15920B.getInputMethodManager().restartInput(this);
            this.f15920B.destroy();
            int size = this.f15923E.f15961b.size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            SpellCheckPlugin spellCheckPlugin = this.f15921C;
            if (spellCheckPlugin != null) {
                spellCheckPlugin.destroy();
            }
            V0 v6 = this.f15919A;
            if (v6 != null) {
                ((C1052y0) v6.f17569c).f17938b = null;
            }
            io.flutter.embedding.engine.renderer.k kVar2 = this.f15941y.f16038b;
            this.f15940x = false;
            kVar2.f14112a.removeIsDisplayingFlutterUiListener(this.f15931M);
            kVar2.g();
            kVar2.f14112a.setSemanticsEnabled(false);
            View view = this.f15938e;
            if (view != null && this.f15937d == this.f15936c) {
                this.f15937d = view;
            }
            this.f15937d.b();
            g gVar = this.f15936c;
            if (gVar != null) {
                gVar.f15900a.close();
                removeView(this.f15936c);
                this.f15936c = null;
            }
            this.f15938e = null;
            this.f15941y = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        this.f15920B.autofill(sparseArray);
    }

    public final void b() {
        i iVar = this.f15934a;
        if (iVar != null) {
            addView(iVar);
        } else {
            k kVar = this.f15935b;
            if (kVar != null) {
                addView(kVar);
            } else {
                addView(this.f15936c);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final boolean c() {
        p128r5.b bVar = this.f15941y;
        if (bVar != null) {
            if (bVar.f16038b == this.f15937d.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        p128r5.b bVar = this.f15941y;
        if (bVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        s sVar = bVar.f16053r;
        if (view == null) {
            sVar.getClass();
            return false;
        }
        HashMap map = sVar.j;
        if (!map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final void d() {
        boolean z4;
        String str;
        boolean z7;
        char c3 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f15926H;
        if (textServicesManager == null) {
            z4 = false;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                Iterator it = textServicesManager.getEnabledSpellCheckerInfos().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z7 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z7 = true;
                        break;
                    }
                }
                if (!this.f15926H.isSpellCheckerEnabled() || !z7) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        F0 f7 = this.f15941y.f16049n.f18505a;
        HashMap map = new HashMap();
        map.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        map.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z4));
        map.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        map.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c3 == 1) {
            str = "light";
        } else {
            if (c3 != 2) {
                throw null;
            }
            str = "dark";
        }
        map.put("platformBrightness", str);
        Objects.toString(map.get("textScaleFactor"));
        Objects.toString(map.get("alwaysUse24HourFormat"));
        Objects.toString(map.get("platformBrightness"));
        if (!(Build.VERSION.SDK_INT >= 34) || displayMetrics == null) {
            f7.L(map, null);
            return;
        }
        p174z5.k kVar = new p174z5.k(displayMetrics);
        C1050x1 c1050x1 = l.f18504b;
        ((ConcurrentLinkedQueue) c1050x1.f17931b).add(kVar);
        p174z5.k kVar2 = (p174z5.k) c1050x1.f17933d;
        c1050x1.f17933d = kVar;
        p028d6.k kVar3 = kVar2 != null ? new p028d6.k(26, (Object) c1050x1, (Object) kVar2, false) : null;
        map.put("configurationId", Integer.valueOf(kVar.f18502a));
        f7.L(map, kVar3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f15923E.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f7 = getResources().getDisplayMetrics().density;
        j jVar = this.f15928J;
        jVar.f14095a = f7;
        jVar.f14109p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.k kVar = this.f15941y.f16038b;
        kVar.getClass();
        if (jVar.f14096b <= 0 || jVar.f14097c <= 0 || jVar.f14095a <= 0.0f) {
            return;
        }
        ArrayList arrayList = jVar.f14110q;
        arrayList.size();
        ArrayList arrayList2 = jVar.f14111r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i7);
            int i8 = i7 * 4;
            Rect rect = cVar.f14077a;
            iArr[i8] = rect.left;
            iArr[i8 + 1] = rect.top;
            iArr[i8 + 2] = rect.right;
            iArr[i8 + 3] = rect.bottom;
            iArr2[i7] = e.e(cVar.f14078b);
            iArr3[i7] = e.e(cVar.f14079c);
        }
        int size2 = arrayList.size() * 4;
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i9);
            int i10 = (i9 * 4) + size2;
            Rect rect2 = cVar2.f14077a;
            iArr[i10] = rect2.left;
            iArr[i10 + 1] = rect2.top;
            iArr[i10 + 2] = rect2.right;
            iArr[i10 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i9] = e.e(cVar2.f14078b);
            iArr3[arrayList.size() + i9] = e.e(cVar2.f14079c);
        }
        kVar.f14112a.setViewportMetrics(jVar.f14095a, jVar.f14096b, jVar.f14097c, jVar.f14098d, jVar.f14099e, jVar.f14100f, jVar.f14101g, jVar.f14102h, jVar.f14103i, jVar.j, jVar.f14104k, jVar.f14105l, jVar.f14106m, jVar.f14107n, jVar.f14108o, jVar.f14109p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        k kVar = this.f15925G;
        if (kVar == null || !kVar.f14322c.isEnabled()) {
            return null;
        }
        return this.f15925G;
    }

    public p128r5.b getAttachedFlutterEngine() {
        return this.f15941y;
    }

    public A5.f getBinaryMessenger() {
        return this.f15941y.f16039c;
    }

    public g getCurrentImageSurface() {
        return this.f15936c;
    }

    public j getViewportMetrics() {
        return this.f15928J;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0134  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c3;
        int systemWindowInsetBottom;
        Window window;
        DisplayCutout displayCutout;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        j jVar = this.f15928J;
        if (i7 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            jVar.f14105l = systemGestureInsets.top;
            jVar.f14106m = systemGestureInsets.right;
            jVar.f14107n = systemGestureInsets.bottom;
            jVar.f14108o = systemGestureInsets.left;
        }
        boolean z4 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z7 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i7 >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            jVar.f14098d = insets.top;
            jVar.f14099e = insets.right;
            jVar.f14100f = insets.bottom;
            jVar.f14101g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            jVar.f14102h = insets2.top;
            jVar.f14103i = insets2.right;
            jVar.j = insets2.bottom;
            jVar.f14104k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            jVar.f14105l = insets3.top;
            jVar.f14106m = insets3.right;
            jVar.f14107n = insets3.bottom;
            jVar.f14108o = insets3.left;
            DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                jVar.f14098d = Math.max(Math.max(jVar.f14098d, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                jVar.f14099e = Math.max(Math.max(jVar.f14099e, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                jVar.f14100f = Math.max(Math.max(jVar.f14100f, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                jVar.f14101g = Math.max(Math.max(jVar.f14101g, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            if (z7) {
                c3 = 1;
            } else {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation != 2) {
                    c3 = 1;
                } else {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c3 = 3;
                    } else if (rotation == 3) {
                        c3 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c3 = 4;
                    } else {
                        c3 = 1;
                    }
                }
            }
            jVar.f14098d = z4 ? windowInsets.getSystemWindowInsetTop() : 0;
            jVar.f14099e = (c3 == 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (!z7) {
                systemWindowInsetBottom = 0;
            } else if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            } else {
                systemWindowInsetBottom = 0;
            }
            jVar.f14100f = systemWindowInsetBottom;
            jVar.f14101g = (c3 == 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            jVar.f14102h = 0;
            jVar.f14103i = 0;
            jVar.j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            jVar.f14104k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i7 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.c(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = jVar.f14111r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            n nVar = this.f15933O;
            Context context2 = getContext();
            nVar.getClass();
            Activity activityQ = D.q(context2);
            WindowInsets rootWindowInsets = null;
            if (activityQ != null && (window = activityQ.getWindow()) != null) {
                rootWindowInsets = window.getDecorView().getRootWindowInsets();
            }
            List listEmptyList = rootWindowInsets == null ? Collections.emptyList() : rootWindowInsets.getBoundingRects(WindowInsets.Type.captionBar());
            int iMax = jVar.f14098d;
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                iMax = Math.max(iMax, ((Rect) it.next()).bottom);
            }
            jVar.f14098d = iMax;
        }
        e();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c cVar;
        super.onAttachedToWindow();
        try {
            g gVar = h.f7445k;
            Context context = getContext();
            gVar.getClass();
            cVar = new c(new P2(g.a(context)), 23);
        } catch (NoClassDefFoundError unused) {
            cVar = null;
        }
        this.f15927I = cVar;
        Activity activityQ = D.q(getContext());
        c cVar2 = this.f15927I;
        if (cVar2 == null || activityQ == null) {
            return;
        }
        this.f15932N = new i(this, 1);
        Executor mainExecutor = G.h.getMainExecutor(getContext());
        i iVar = this.f15932N;
        P2 p5 = (P2) cVar2.f6064b;
        t6.h.e(mainExecutor, "executor");
        t6.h.e(iVar, "consumer");
        G6.g gVarA = ((X0.b) p5.f17514b).a(activityQ);
        V0 v6 = (V0) p5.f17515c;
        v6.getClass();
        t6.h.e(gVarA, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) v6.f17568b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) v6.f17569c;
        try {
            if (linkedHashMap.get(iVar) == null) {
                linkedHashMap.put(iVar, E.p(E.b(new Z(mainExecutor)), new V0.a(gVarA, iVar, null)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Exception {
        super.onConfigurationChanged(configuration);
        if (this.f15941y != null) {
            this.f15922D.b(configuration);
            d();
            D.g(getContext(), this.f15941y);
        }
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !c() ? super.onCreateInputConnection(editorInfo) : this.f15920B.createInputConnection(this, this.f15923E, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i iVar;
        c cVar = this.f15927I;
        if (cVar != null && (iVar = this.f15932N) != null) {
            V0 v6 = (V0) ((P2) cVar.f6064b).f17515c;
            v6.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) v6.f17568b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) v6.f17569c;
            try {
                InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) linkedHashMap.get(iVar);
                if (interfaceC0118e0 != null) {
                    interfaceC0118e0.cancel(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f15932N = null;
        this.f15927I = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            a aVar = this.f15924F;
            Context context = getContext();
            aVar.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z4) {
                int iB = a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                aVar.a(motionEvent, motionEvent.getActionIndex(), iB, 0, a.f15874f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                aVar.f15875a.f14112a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f15925G.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        this.f15920B.onProvideAutofillVirtualStructure(viewStructure, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        j jVar = this.f15928J;
        jVar.f14096b = i7;
        jVar.f14097c = i8;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f15924F.d(motionEvent, a.f15874f);
        return true;
    }

    public void setDelegate(n nVar) {
        this.f15933O = nVar;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f15937d;
        if (view instanceof i) {
            ((i) view).setVisibility(i7);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(X0.l lVar) {
        ?? r8 = lVar.f7455a;
        ArrayList arrayList = new ArrayList();
        for (X0.c cVar : r8) {
            cVar.f7433a.c().toString();
            U0.b bVar = cVar.f7433a;
            int iB = bVar.b();
            X0.b bVar2 = X0.b.f7425d;
            int i7 = 2;
            int i8 = ((iB == 0 || bVar.a() == 0) ? X0.b.f7424c : bVar2) == bVar2 ? 3 : 2;
            X0.b bVar3 = X0.b.f7428x;
            X0.b bVar4 = cVar.f7435c;
            if (bVar4 != bVar3) {
                i7 = bVar4 == X0.b.f7429y ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.c(), i8, i7));
        }
        ArrayList arrayList2 = this.f15928J.f14110q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public m(c cVar, k kVar) {
        super(cVar, null);
        this.f15939f = new HashSet();
        this.f15942z = new HashSet();
        this.f15928J = new j();
        this.f15929K = new C1010l1(this);
        this.f15930L = new Y.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f15931M = new d(this, 2);
        this.f15933O = new n();
        this.f15935b = kVar;
        this.f15937d = kVar;
        b();
    }
}
