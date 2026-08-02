package q5;

import D6.E;
import D6.InterfaceC0118e0;
import D6.Z;
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
import d6.C0977k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
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
import r5.C1577b;
import v5.C1667a;
import w1.C1719l1;
import w1.C1726n0;
import w1.C1759x1;
import w1.C1761y0;
import w1.F0;
import w1.P2;
import w1.V0;

/* loaded from: classes2.dex */
public final class m extends FrameLayout implements C5.b, t {

    /* renamed from: A, reason: collision with root package name */
    public V0 f15913A;

    /* renamed from: B, reason: collision with root package name */
    public TextInputPlugin f15914B;

    /* renamed from: C, reason: collision with root package name */
    public SpellCheckPlugin f15915C;

    /* renamed from: D, reason: collision with root package name */
    public B5.a f15916D;

    /* renamed from: E, reason: collision with root package name */
    public u f15917E;

    /* renamed from: F, reason: collision with root package name */
    public C1557a f15918F;

    /* renamed from: G, reason: collision with root package name */
    public io.flutter.view.k f15919G;

    /* renamed from: H, reason: collision with root package name */
    public TextServicesManager f15920H;

    /* renamed from: I, reason: collision with root package name */
    public R4.c f15921I;

    /* renamed from: J, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f15922J;

    /* renamed from: K, reason: collision with root package name */
    public final C1719l1 f15923K;

    /* renamed from: L, reason: collision with root package name */
    public final Y.a f15924L;

    /* renamed from: M, reason: collision with root package name */
    public final C1560d f15925M;

    /* renamed from: N, reason: collision with root package name */
    public X0.i f15926N;

    /* renamed from: O, reason: collision with root package name */
    public n f15927O;

    /* renamed from: a, reason: collision with root package name */
    public final C1565i f15928a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15929b;

    /* renamed from: c, reason: collision with root package name */
    public C1563g f15930c;

    /* renamed from: d, reason: collision with root package name */
    public View f15931d;

    /* renamed from: e, reason: collision with root package name */
    public View f15932e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f15933f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15934x;

    /* renamed from: y, reason: collision with root package name */
    public C1577b f15935y;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f15936z;

    public m(AbstractActivityC1559c abstractActivityC1559c, C1565i c1565i) {
        super(abstractActivityC1559c, null);
        this.f15933f = new HashSet();
        this.f15936z = new HashSet();
        this.f15922J = new io.flutter.embedding.engine.renderer.j();
        this.f15923K = new C1719l1(this);
        this.f15924L = new Y.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f15925M = new C1560d(this, 2);
        this.f15927O = new n();
        this.f15928a = c1565i;
        this.f15931d = c1565i;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f15935y);
        if (c()) {
            Iterator it = this.f15936z.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f15924L);
            io.flutter.plugin.platform.s sVar = this.f15935y.f16047r;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray2 = sVar.f14198n;
                if (i7 >= sparseArray2.size()) {
                    break;
                }
                sVar.f14189d.removeView((io.flutter.plugin.platform.k) sparseArray2.valueAt(i7));
                i7++;
            }
            int i8 = 0;
            while (true) {
                SparseArray sparseArray3 = sVar.f14196l;
                if (i8 >= sparseArray3.size()) {
                    break;
                }
                sVar.f14189d.removeView((C1667a) sparseArray3.valueAt(i8));
                i8++;
            }
            sVar.g();
            if (sVar.f14189d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i9 = 0;
                while (true) {
                    sparseArray = sVar.f14197m;
                    if (i9 >= sparseArray.size()) {
                        break;
                    }
                    sVar.f14189d.removeView((View) sparseArray.valueAt(i9));
                    i9++;
                }
                sparseArray.clear();
            }
            sVar.f14189d = null;
            sVar.f14200p = false;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray4 = sVar.f14195k;
                if (i10 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f) sparseArray4.valueAt(i10)).onFlutterViewDetached();
                i10++;
            }
            io.flutter.plugin.platform.r rVar = this.f15935y.f16048s;
            int i11 = 0;
            while (true) {
                SparseArray sparseArray5 = rVar.j;
                if (i11 >= sparseArray5.size()) {
                    break;
                }
                rVar.f14173d.removeView((C1667a) sparseArray5.valueAt(i11));
                i11++;
            }
            Surface surface = rVar.f14182n;
            if (surface != null) {
                surface.release();
                rVar.f14182n = null;
                rVar.f14183o = null;
            }
            rVar.f14173d = null;
            int i12 = 0;
            while (true) {
                SparseArray sparseArray6 = rVar.f14178i;
                if (i12 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.f) sparseArray6.valueAt(i12)).onFlutterViewDetached();
                i12++;
            }
            this.f15935y.f16047r.d();
            this.f15935y.f16048s.d();
            io.flutter.view.k kVar = this.f15919G;
            kVar.f14333u = true;
            kVar.f14318e.d();
            kVar.f14331s = null;
            AccessibilityManager accessibilityManager = kVar.f14316c;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f14335w);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.f14336x);
            kVar.f14319f.unregisterContentObserver(kVar.f14337y);
            C1726n0 c1726n0 = kVar.f14315b;
            c1726n0.f17807d = null;
            ((FlutterJNI) c1726n0.f17806c).setAccessibilityDelegate(null);
            this.f15919G = null;
            this.f15914B.getInputMethodManager().restartInput(this);
            this.f15914B.destroy();
            int size = this.f15917E.f15955b.size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            SpellCheckPlugin spellCheckPlugin = this.f15915C;
            if (spellCheckPlugin != null) {
                spellCheckPlugin.destroy();
            }
            V0 v02 = this.f15913A;
            if (v02 != null) {
                ((C1761y0) v02.f17563c).f17932b = null;
            }
            io.flutter.embedding.engine.renderer.k kVar2 = this.f15935y.f16032b;
            this.f15934x = false;
            kVar2.f14106a.removeIsDisplayingFlutterUiListener(this.f15925M);
            kVar2.g();
            kVar2.f14106a.setSemanticsEnabled(false);
            View view = this.f15932e;
            if (view != null && this.f15931d == this.f15930c) {
                this.f15931d = view;
            }
            this.f15931d.b();
            C1563g c1563g = this.f15930c;
            if (c1563g != null) {
                c1563g.f15894a.close();
                removeView(this.f15930c);
                this.f15930c = null;
            }
            this.f15932e = null;
            this.f15935y = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        this.f15914B.autofill(sparseArray);
    }

    public final void b() {
        C1565i c1565i = this.f15928a;
        if (c1565i != null) {
            addView(c1565i);
        } else {
            k kVar = this.f15929b;
            if (kVar != null) {
                addView(kVar);
            } else {
                addView(this.f15930c);
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
        C1577b c1577b = this.f15935y;
        if (c1577b != null) {
            if (c1577b.f16032b == this.f15931d.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C1577b c1577b = this.f15935y;
        if (c1577b == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.s sVar = c1577b.f16047r;
        if (view == null) {
            sVar.getClass();
            return false;
        }
        HashMap hashMap = sVar.j;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z4;
        F0 f02;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z7;
        boolean isSpellCheckerEnabled;
        char c3 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f15920H;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z7 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z7 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f15920H.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z4 = true;
            f02 = this.f15935y.f16043n.f18499a;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z4));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c3 != 1) {
                str = "light";
            } else {
                if (c3 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            if ((Build.VERSION.SDK_INT >= 34) || displayMetrics == null) {
                f02.L(hashMap, null);
            }
            z5.k kVar = new z5.k(displayMetrics);
            C1759x1 c1759x1 = z5.l.f18498b;
            ((ConcurrentLinkedQueue) c1759x1.f17925b).add(kVar);
            z5.k kVar2 = (z5.k) c1759x1.f17927d;
            c1759x1.f17927d = kVar;
            C0977k c0977k = kVar2 != null ? new C0977k(26, (Object) c1759x1, (Object) kVar2, false) : null;
            hashMap.put("configurationId", Integer.valueOf(kVar.f18496a));
            f02.L(hashMap, c0977k);
            return;
        }
        z4 = false;
        f02 = this.f15935y.f16043n.f18499a;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z4));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c3 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        f02.L(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f15917E.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f7 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.j jVar = this.f15922J;
        jVar.f14089a = f7;
        jVar.f14103p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.k kVar = this.f15935y.f16032b;
        kVar.getClass();
        if (jVar.f14090b <= 0 || jVar.f14091c <= 0 || jVar.f14089a <= 0.0f) {
            return;
        }
        ArrayList arrayList = jVar.f14104q;
        arrayList.size();
        ArrayList arrayList2 = jVar.f14105r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i7);
            int i8 = i7 * 4;
            Rect rect = cVar.f14071a;
            iArr[i8] = rect.left;
            iArr[i8 + 1] = rect.top;
            iArr[i8 + 2] = rect.right;
            iArr[i8 + 3] = rect.bottom;
            iArr2[i7] = t.e.e(cVar.f14072b);
            iArr3[i7] = t.e.e(cVar.f14073c);
        }
        int size2 = arrayList.size() * 4;
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i9);
            int i10 = (i9 * 4) + size2;
            Rect rect2 = cVar2.f14071a;
            iArr[i10] = rect2.left;
            iArr[i10 + 1] = rect2.top;
            iArr[i10 + 2] = rect2.right;
            iArr[i10 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i9] = t.e.e(cVar2.f14072b);
            iArr3[arrayList.size() + i9] = t.e.e(cVar2.f14073c);
        }
        kVar.f14106a.setViewportMetrics(jVar.f14089a, jVar.f14090b, jVar.f14091c, jVar.f14092d, jVar.f14093e, jVar.f14094f, jVar.f14095g, jVar.f14096h, jVar.f14097i, jVar.j, jVar.f14098k, jVar.f14099l, jVar.f14100m, jVar.f14101n, jVar.f14102o, jVar.f14103p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.k kVar = this.f15919G;
        if (kVar == null || !kVar.f14316c.isEnabled()) {
            return null;
        }
        return this.f15919G;
    }

    public C1577b getAttachedFlutterEngine() {
        return this.f15935y;
    }

    public A5.f getBinaryMessenger() {
        return this.f15935y.f16033c;
    }

    public C1563g getCurrentImageSurface() {
        return this.f15930c;
    }

    public io.flutter.embedding.engine.renderer.j getViewportMetrics() {
        return this.f15922J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b0, code lost:
    
        r1 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c3;
        int i7;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i8;
        int i9;
        int i10;
        int i11;
        int ime;
        Insets insets2;
        int i12;
        int i13;
        int i14;
        int i15;
        int systemGestures;
        Insets insets3;
        int i16;
        int i17;
        int i18;
        int i19;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i20;
        int safeInsetTop;
        int i21;
        int safeInsetRight;
        int i22;
        int safeInsetBottom;
        int i23;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i24;
        int i25;
        int i26;
        int i27;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i28 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.j jVar = this.f15922J;
        if (i28 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i24 = systemGestureInsets.top;
            jVar.f14099l = i24;
            i25 = systemGestureInsets.right;
            jVar.f14100m = i25;
            i26 = systemGestureInsets.bottom;
            jVar.f14101n = i26;
            i27 = systemGestureInsets.left;
            jVar.f14102o = i27;
        }
        boolean z4 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z7 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i28 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i8 = insets.top;
            jVar.f14092d = i8;
            i9 = insets.right;
            jVar.f14093e = i9;
            i10 = insets.bottom;
            jVar.f14094f = i10;
            i11 = insets.left;
            jVar.f14095g = i11;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i12 = insets2.top;
            jVar.f14096h = i12;
            i13 = insets2.right;
            jVar.f14097i = i13;
            i14 = insets2.bottom;
            jVar.j = i14;
            i15 = insets2.left;
            jVar.f14098k = i15;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i16 = insets3.top;
            jVar.f14099l = i16;
            i17 = insets3.right;
            jVar.f14100m = i17;
            i18 = insets3.bottom;
            jVar.f14101n = i18;
            i19 = insets3.left;
            jVar.f14102o = i19;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i29 = jVar.f14092d;
                i20 = waterfallInsets.top;
                int max = Math.max(i29, i20);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                jVar.f14092d = Math.max(max, safeInsetTop);
                int i30 = jVar.f14093e;
                i21 = waterfallInsets.right;
                int max2 = Math.max(i30, i21);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                jVar.f14093e = Math.max(max2, safeInsetRight);
                int i31 = jVar.f14094f;
                i22 = waterfallInsets.bottom;
                int max3 = Math.max(i31, i22);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                jVar.f14094f = Math.max(max3, safeInsetBottom);
                int i32 = jVar.f14095g;
                i23 = waterfallInsets.left;
                int max4 = Math.max(i32, i23);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                jVar.f14095g = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z7) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c3 = 3;
                    } else if (rotation == 3) {
                        c3 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c3 = 4;
                    }
                    jVar.f14092d = !z4 ? windowInsets.getSystemWindowInsetTop() : 0;
                    jVar.f14093e = (c3 != 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z7) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i7 = windowInsets.getSystemWindowInsetBottom();
                            jVar.f14094f = i7;
                            jVar.f14095g = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            jVar.f14096h = 0;
                            jVar.f14097i = 0;
                            jVar.j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            jVar.f14098k = 0;
                        }
                    }
                    i7 = 0;
                    jVar.f14094f = i7;
                    jVar.f14095g = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    jVar.f14096h = 0;
                    jVar.f14097i = 0;
                    jVar.j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    jVar.f14098k = 0;
                }
            }
            c3 = 1;
            jVar.f14092d = !z4 ? windowInsets.getSystemWindowInsetTop() : 0;
            jVar.f14093e = (c3 != 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z7) {
            }
            i7 = 0;
            jVar.f14094f = i7;
            jVar.f14095g = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            jVar.f14096h = 0;
            jVar.f14097i = 0;
            jVar.j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            jVar.f14098k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i28 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.c(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = jVar.f14105r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            n nVar = this.f15927O;
            Context context2 = getContext();
            nVar.getClass();
            Activity q7 = D.q(context2);
            WindowInsets windowInsets2 = null;
            if (q7 != null && (window = q7.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i33 = jVar.f14092d;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i33 = Math.max(i33, ((Rect) it.next()).bottom);
            }
            jVar.f14092d = i33;
        }
        e();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        R4.c cVar;
        super.onAttachedToWindow();
        try {
            X0.g gVar = X0.h.f7445k;
            Context context = getContext();
            gVar.getClass();
            cVar = new R4.c(new P2(X0.g.a(context)), 23);
        } catch (NoClassDefFoundError unused) {
            cVar = null;
        }
        this.f15921I = cVar;
        Activity q7 = D.q(getContext());
        R4.c cVar2 = this.f15921I;
        if (cVar2 == null || q7 == null) {
            return;
        }
        this.f15926N = new X0.i(this, 1);
        Executor mainExecutor = G.h.getMainExecutor(getContext());
        X0.i iVar = this.f15926N;
        P2 p22 = (P2) cVar2.f6064b;
        t6.h.e(mainExecutor, "executor");
        t6.h.e(iVar, "consumer");
        G6.g a2 = ((X0.b) p22.f17508b).a(q7);
        V0 v02 = (V0) p22.f17509c;
        v02.getClass();
        t6.h.e(a2, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) v02.f17562b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) v02.f17563c;
        try {
            if (linkedHashMap.get(iVar) == null) {
                linkedHashMap.put(iVar, E.p(E.b(new Z(mainExecutor)), new V0.a(a2, iVar, null)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f15935y != null) {
            this.f15916D.b(configuration);
            d();
            D.g(getContext(), this.f15935y);
        }
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !c() ? super.onCreateInputConnection(editorInfo) : this.f15914B.createInputConnection(this, this.f15917E, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        X0.i iVar;
        R4.c cVar = this.f15921I;
        if (cVar != null && (iVar = this.f15926N) != null) {
            V0 v02 = (V0) ((P2) cVar.f6064b).f17509c;
            v02.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) v02.f17562b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) v02.f17563c;
            try {
                InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) linkedHashMap.get(iVar);
                if (interfaceC0118e0 != null) {
                    interfaceC0118e0.cancel(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f15926N = null;
        this.f15921I = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C1557a c1557a = this.f15918F;
            Context context = getContext();
            c1557a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z4 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z4) {
                int b7 = C1557a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c1557a.a(motionEvent, motionEvent.getActionIndex(), b7, 0, C1557a.f15868f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c1557a.f15869a.f14106a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f15919G.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        this.f15914B.onProvideAutofillVirtualStructure(viewStructure, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        io.flutter.embedding.engine.renderer.j jVar = this.f15922J;
        jVar.f14090b = i7;
        jVar.f14091c = i8;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f15918F.d(motionEvent, C1557a.f15868f);
        return true;
    }

    public void setDelegate(n nVar) {
        this.f15927O = nVar;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f15931d;
        if (view instanceof C1565i) {
            ((C1565i) view).setVisibility(i7);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(X0.l lVar) {
        ?? r8 = lVar.f7455a;
        ArrayList arrayList = new ArrayList();
        for (X0.c cVar : r8) {
            cVar.f7433a.c().toString();
            U0.b bVar = cVar.f7433a;
            int b7 = bVar.b();
            X0.b bVar2 = X0.b.f7425d;
            int i7 = 2;
            int i8 = ((b7 == 0 || bVar.a() == 0) ? X0.b.f7424c : bVar2) == bVar2 ? 3 : 2;
            X0.b bVar3 = X0.b.f7428x;
            X0.b bVar4 = cVar.f7435c;
            if (bVar4 != bVar3) {
                i7 = bVar4 == X0.b.f7429y ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.c(), i8, i7));
        }
        ArrayList arrayList2 = this.f15922J.f14104q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public m(AbstractActivityC1559c abstractActivityC1559c, k kVar) {
        super(abstractActivityC1559c, null);
        this.f15933f = new HashSet();
        this.f15936z = new HashSet();
        this.f15922J = new io.flutter.embedding.engine.renderer.j();
        this.f15923K = new C1719l1(this);
        this.f15924L = new Y.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f15925M = new C1560d(this, 2);
        this.f15927O = new n();
        this.f15929b = kVar;
        this.f15931d = kVar;
        b();
    }
}
