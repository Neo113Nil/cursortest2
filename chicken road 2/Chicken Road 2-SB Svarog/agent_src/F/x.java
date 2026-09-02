package F;

import a.AbstractC0018a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import h.AbstractC0039a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import k.ExecutorC0042a;
import m0.AbstractC0044a;
import m0.AbstractC0062t;
import m0.AbstractC0067y;
import m0.C0060q;
import m0.Y;
import o.AbstractC0071c;
import u.C0091a;
import w.C0093b;
import w.C0094c;
import w.C0098g;

/* loaded from: classes.dex */
public final class x extends FrameLayout implements R.a, I {

    /* renamed from: A, reason: collision with root package name */
    public int f121A;
    public z B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f122a;

    /* renamed from: b, reason: collision with root package name */
    public final C0014o f123b;

    /* renamed from: c, reason: collision with root package name */
    public final C0016q f124c;

    /* renamed from: d, reason: collision with root package name */
    public C0012m f125d;

    /* renamed from: e, reason: collision with root package name */
    public View f126e;

    /* renamed from: f, reason: collision with root package name */
    public View f127f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f128g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f129h;

    /* renamed from: i, reason: collision with root package name */
    public G.c f130i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f131j;

    /* renamed from: k, reason: collision with root package name */
    public C.a f132k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.l f133l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.g f134m;

    /* renamed from: n, reason: collision with root package name */
    public Q.a f135n;

    /* renamed from: o, reason: collision with root package name */
    public E.b f136o;

    /* renamed from: p, reason: collision with root package name */
    public C0001b f137p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.i f138q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f139r;

    /* renamed from: s, reason: collision with root package name */
    public t f140s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f141t;

    /* renamed from: u, reason: collision with root package name */
    public final t f142u;
    public final u v;

    /* renamed from: w, reason: collision with root package name */
    public final v f143w;

    /* renamed from: x, reason: collision with root package name */
    public final C0006g f144x;

    /* renamed from: y, reason: collision with root package name */
    public C0017s f145y;

    /* renamed from: z, reason: collision with root package name */
    public int f146z;

    public x(AbstractActivityC0005f abstractActivityC0005f, C0014o c0014o) {
        super(abstractActivityC0005f, null);
        this.f122a = false;
        this.f128g = new HashSet();
        this.f131j = new HashSet();
        this.f141t = new io.flutter.embedding.engine.renderer.g();
        this.f142u = new t(0, this);
        this.v = new u(this, new Handler(Looper.getMainLooper()), 0);
        this.f143w = new v(this);
        this.f144x = new C0006g(1, this);
        this.B = new z();
        this.f123b = c0014o;
        this.f126e = c0014o;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        Objects.toString(this.f130i);
        if (c()) {
            Iterator it = this.f131j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.v);
            io.flutter.plugin.platform.k kVar = this.f130i.f168s;
            SparseArray sparseArray = kVar.f700l;
            SparseArray sparseArray2 = kVar.f701m;
            SparseArray sparseArray3 = kVar.f703o;
            for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                kVar.f692d.removeView((io.flutter.plugin.platform.g) sparseArray3.valueAt(i2));
            }
            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                if (sparseArray2.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                kVar.f692d.removeView(null);
            }
            kVar.b();
            SparseArray sparseArray4 = kVar.f702n;
            if (kVar.f692d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i4 = 0; i4 < sparseArray4.size(); i4++) {
                    kVar.f692d.removeView((View) sparseArray4.valueAt(i4));
                }
                sparseArray4.clear();
            }
            kVar.f692d = null;
            kVar.f705q = false;
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            io.flutter.plugin.platform.j jVar = this.f130i.f169t;
            SparseArray sparseArray5 = jVar.f682h;
            SparseArray sparseArray6 = jVar.f683i;
            for (int i5 = 0; i5 < sparseArray6.size(); i5++) {
                if (sparseArray6.valueAt(i5) != null) {
                    throw new ClassCastException();
                }
                jVar.f678d.removeView(null);
            }
            Surface surface = jVar.f686l;
            if (surface != null) {
                surface.release();
                jVar.f686l = null;
                jVar.f687m = null;
            }
            jVar.f678d = null;
            if (sparseArray5.size() > 0) {
                sparseArray5.valueAt(0).getClass();
                throw new ClassCastException();
            }
            this.f130i.f168s.c();
            this.f130i.f169t.c();
            io.flutter.view.i iVar = this.f138q;
            iVar.f827t = true;
            iVar.f812e.c();
            iVar.f825r = null;
            AccessibilityManager accessibilityManager = iVar.f810c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar.f828u);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar.v);
            iVar.f813f.unregisterContentObserver(iVar.f829w);
            E.b bVar = iVar.f809b;
            bVar.f20c = null;
            ((FlutterJNI) bVar.f19b).setAccessibilityDelegate(null);
            this.f138q = null;
            this.f133l.f647b.restartInput(this);
            this.f133l.b();
            int size = ((HashSet) this.f136o.f19b).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f134m;
            if (gVar != null) {
                gVar.f628a.f114c = null;
                SpellCheckerSession spellCheckerSession = gVar.f630c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            C.a aVar = this.f132k;
            if (aVar != null) {
                ((t) aVar.f5d).f114c = null;
            }
            io.flutter.embedding.engine.renderer.h hVar = this.f130i.f151b;
            this.f129h = false;
            hVar.c(this.f144x);
            FlutterJNI flutterJNI = hVar.f593a;
            if (this.f122a) {
                flutterJNI.removeResizingFlutterUiListener(this.f143w);
            }
            hVar.e();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f127f;
            if (view != null && this.f126e == this.f125d) {
                this.f126e = view;
            }
            this.f126e.c();
            C0012m c0012m = this.f125d;
            if (c0012m != null) {
                c0012m.f92a.close();
                removeView(this.f125d);
                this.f125d = null;
            }
            this.f127f = null;
            this.f130i = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        O.p pVar;
        C.e eVar;
        C.e eVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f133l;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || (pVar = lVar.f651f) == null || lVar.f652g == null || (eVar = pVar.f347j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            O.p pVar2 = (O.p) lVar.f652g.get(sparseArray.keyAt(i2));
            if (pVar2 != null && (eVar2 = pVar2.f347j) != null) {
                String str = (String) eVar2.f8a;
                textValue = AbstractC0000a.f(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                O.r rVar = new O.r(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (str.equals((String) eVar.f8a)) {
                    lVar.f653h.f(rVar);
                } else {
                    hashMap.put(str, rVar);
                }
            }
        }
        C.a aVar = lVar.f649d;
        int i3 = lVar.f650e.f645b;
        aVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            O.r rVar2 = (O.r) entry.getValue();
            hashMap2.put((String) entry.getKey(), C.a.x(rVar2.f354a, rVar2.f355b, rVar2.f356c, -1, -1));
        }
        ((E.b) aVar.f4c).e("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        C0014o c0014o = this.f123b;
        if (c0014o != null) {
            addView(c0014o);
        } else {
            C0016q c0016q = this.f124c;
            if (c0016q != null) {
                addView(c0016q);
            } else {
                addView(this.f125d);
            }
        }
        this.f122a = AbstractC0018a.o(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        G.c cVar = this.f130i;
        return cVar != null && cVar.f151b == this.f126e.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        G.c cVar = this.f130i;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = cVar.f168s.f699k;
        if (view == null || !hashMap.containsKey(view.getContext())) {
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z2;
        C.e eVar;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z3;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f139r;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z3 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f139r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            O.o oVar = this.f130i.f164o;
            oVar.getClass();
            eVar = oVar.f337b;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c2 != 1) {
                str = "light";
            } else {
                if (c2 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            if (Build.VERSION.SDK_INT >= 34 || displayMetrics == null) {
                eVar.g(hashMap, null);
            }
            O.n nVar = new O.n(displayMetrics);
            E.b bVar = oVar.f336a;
            ((ConcurrentLinkedQueue) bVar.f18a).add(nVar);
            O.n nVar2 = (O.n) bVar.f20c;
            bVar.f20c = nVar;
            C.a aVar = nVar2 != null ? new C.a(bVar, nVar2, 8, false) : null;
            hashMap.put("configurationId", Integer.valueOf(nVar.f334a));
            eVar.g(hashMap, aVar);
            return;
        }
        z2 = false;
        O.o oVar2 = this.f130i.f164o;
        oVar2.getClass();
        eVar = oVar2.f337b;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        eVar.g(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f136o.c(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.f141t;
        gVar.f568a = f2;
        gVar.f587t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f130i.f151b;
        hVar.getClass();
        int i2 = gVar.f569b;
        ArrayList arrayList = gVar.f592z;
        ArrayList arrayList2 = gVar.f591y;
        if (i2 == 0) {
            int i3 = gVar.f571d;
            int i4 = gVar.f572e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f570c;
            if (i5 == 0) {
                int i6 = gVar.f573f;
                int i7 = gVar.f574g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f568a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i8);
            int i9 = i8 * 4;
            Rect rect = aVar.f555a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = AbstractC0071c.a(aVar.f556b);
            iArr3[i8] = AbstractC0071c.a(aVar.f557c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = aVar2.f555a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i10] = AbstractC0071c.a(aVar2.f556b);
            iArr3[arrayList2.size() + i10] = AbstractC0071c.a(aVar2.f557c);
        }
        hVar.f593a.setViewportMetrics(gVar.f568a, gVar.f569b, gVar.f570c, gVar.f575h, gVar.f576i, gVar.f577j, gVar.f578k, gVar.f579l, gVar.f580m, gVar.f581n, gVar.f582o, gVar.f583p, gVar.f584q, gVar.f585r, gVar.f586s, gVar.f587t, iArr, iArr2, iArr3, gVar.f571d, gVar.f572e, gVar.f573f, gVar.f574g, gVar.f588u, gVar.v, gVar.f589w, gVar.f590x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f138q;
        if (iVar == null || !iVar.f810c.isEnabled()) {
            return null;
        }
        return this.f138q;
    }

    public G.c getAttachedFlutterEngine() {
        return this.f130i;
    }

    public P.f getBinaryMessenger() {
        return this.f130i.f152c;
    }

    public C0012m getCurrentImageSurface() {
        return this.f125d;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.f141t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b6, code lost:
    
        r3 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        double d2;
        int i2;
        int i3;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        int ime;
        Insets insets2;
        int i8;
        int i9;
        int i10;
        int i11;
        int systemGestures;
        Insets insets3;
        int i12;
        int i13;
        int i14;
        int i15;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i16;
        int safeInsetTop;
        int i17;
        int safeInsetRight;
        int i18;
        int safeInsetBottom;
        int i19;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i20;
        int i21;
        int i22;
        int i23;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i24 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.g gVar = this.f141t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            gVar.f583p = i20;
            i21 = systemGestureInsets.right;
            gVar.f584q = i21;
            i22 = systemGestureInsets.bottom;
            gVar.f585r = i22;
            i23 = systemGestureInsets.left;
            gVar.f586s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            gVar.f575h = i4;
            i5 = insets.right;
            gVar.f576i = i5;
            i6 = insets.bottom;
            gVar.f577j = i6;
            i7 = insets.left;
            gVar.f578k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            gVar.f579l = i8;
            i9 = insets2.right;
            gVar.f580m = i9;
            i10 = insets2.bottom;
            gVar.f581n = i10;
            i11 = insets2.left;
            gVar.f582o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            gVar.f583p = i12;
            i13 = insets3.right;
            gVar.f584q = i13;
            i14 = insets3.bottom;
            gVar.f585r = i14;
            i15 = insets3.left;
            gVar.f586s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = gVar.f575h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f575h = Math.max(max, safeInsetTop);
                int i26 = gVar.f576i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f576i = Math.max(max2, safeInsetRight);
                int i27 = gVar.f577j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f577j = Math.max(max3, safeInsetBottom);
                int i28 = gVar.f578k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f578k = Math.max(max4, safeInsetLeft);
            }
            i3 = 0;
        } else {
            if (!z3) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c2 = 3;
                    } else if (rotation == 3) {
                        c2 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c2 = 4;
                    }
                    gVar.f575h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f576i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        d2 = 0.18d;
                    } else {
                        d2 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f577j = i2;
                            gVar.f578k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f579l = 0;
                            gVar.f580m = 0;
                            gVar.f581n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            gVar.f582o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f577j = i2;
                    gVar.f578k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f579l = 0;
                    gVar.f580m = 0;
                    gVar.f581n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    gVar.f582o = 0;
                }
            }
            c2 = 1;
            gVar.f575h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f576i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f577j = i2;
            gVar.f578k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f579l = 0;
            gVar.f580m = 0;
            gVar.f581n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d2 ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            gVar.f582o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f592z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            z zVar = this.B;
            Context context2 = getContext();
            zVar.getClass();
            Activity j2 = AbstractC0018a.j(context2);
            WindowInsets windowInsets2 = null;
            if (j2 != null && (window = j2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = gVar.f575h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            gVar.f575h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.f588u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            gVar.v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            gVar.f589w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            gVar.f590x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [Y.i] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t tVar;
        super.onAttachedToWindow();
        int i2 = 1;
        try {
            C0098g c0098g = w.h.f1298a;
            Context context = getContext();
            c0098g.getClass();
            tVar = new t(i2, new C.a(C0098g.a(context)));
        } catch (NoClassDefFoundError unused) {
            tVar = null;
        }
        this.f140s = tVar;
        Activity j2 = AbstractC0018a.j(getContext());
        t tVar2 = this.f140s;
        if (tVar2 == null || j2 == null) {
            return;
        }
        this.f145y = new C0017s(0, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? AbstractC0039a.a(context2) : new ExecutorC0042a(new Handler(context2.getMainLooper()));
        C0017s c0017s = this.f145y;
        C.a aVar = (C.a) tVar2.f114c;
        g0.h.e(a2, "executor");
        g0.h.e(c0017s, "consumer");
        C.a aVar2 = (C.a) aVar.f5d;
        C0093b c0093b = (C0093b) aVar.f4c;
        c0093b.getClass();
        w.j jVar = new w.j(c0093b, j2, null);
        Y.j jVar2 = Y.j.f410b;
        p0.b bVar = new p0.b(jVar, jVar2, -2, 1);
        s0.d dVar = AbstractC0067y.f957a;
        n0.c cVar = r0.p.f1193a;
        if (cVar.d(C0060q.f943c) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
        }
        if (!cVar.equals(jVar2)) {
            Y.i g2 = cVar.g(jVar2);
            if (!g0.h.a(g2, jVar2)) {
                bVar = new p0.b(bVar.f1111f, g2, -2, 1);
            }
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) aVar2.f5d;
        ReentrantLock reentrantLock = (ReentrantLock) aVar2.f4c;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(c0017s) == null) {
                m0.F f2 = new m0.F(a2);
                r0.e eVar = new r0.e(f2.d(C0060q.f943c) != null ? f2 : AbstractC0018a.s(f2, new m0.N()));
                C0091a c0091a = new C0091a(bVar, c0017s, null);
                AbstractC0044a y2 = new Y(AbstractC0062t.e(eVar, jVar2), true);
                y2.M(1, y2, c0091a);
                linkedHashMap.put(c0017s, y2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f130i != null) {
            this.f135n.b(configuration);
            d();
            AbstractC0018a.c(getContext(), this.f130i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r2.f353c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.l lVar = this.f133l;
        E.b bVar = this.f136o;
        io.flutter.plugin.editing.k kVar = lVar.f650e;
        int i3 = kVar.f644a;
        if (i3 == 1) {
            lVar.f655j = null;
            return null;
        }
        int i4 = 4;
        if (i3 == 4) {
            return null;
        }
        if (i3 == 3) {
            if (lVar.f661p) {
                return lVar.f655j;
            }
            lVar.f656k.r(kVar.f645b);
            throw null;
        }
        O.p pVar = lVar.f651f;
        O.q qVar = pVar.f344g;
        boolean z2 = pVar.f338a;
        boolean z3 = pVar.f339b;
        boolean z4 = pVar.f340c;
        boolean z5 = pVar.f341d;
        int i5 = pVar.f343f;
        int i6 = qVar.f351a;
        if (i6 != 2) {
            if (i6 == 5) {
                i4 = qVar.f352b ? 4098 : 2;
            } else if (i6 == 6) {
                i4 = 3;
            } else if (i6 == 11) {
                i4 = 0;
            } else {
                int i7 = i6 == 7 ? 131073 : (i6 == 8 || i6 == 13) ? 33 : (i6 == 9 || i6 == 12) ? 17 : i6 == 10 ? 145 : i6 == 3 ? 97 : i6 == 4 ? 113 : 1;
                if (!z2) {
                    if (z3) {
                        i7 |= 32768;
                    }
                    i2 = z4 ? 524416 : 524432;
                    i4 = i7;
                    if (i5 != 1) {
                        i4 |= 4096;
                    } else {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i4 |= 16384;
                            }
                        }
                        i4 |= 8192;
                    }
                }
                i7 |= i2;
                i4 = i7;
                if (i5 != 1) {
                }
            }
        }
        editorInfo.inputType = i4;
        editorInfo.imeOptions = 33554432;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 && !z5) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = pVar.f345h.intValue();
        O.p pVar2 = lVar.f651f;
        String str = pVar2.f346i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (pVar2.f350m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f651f.f350m);
        }
        String[] strArr = lVar.f651f.f348k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i8 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, lVar.f650e.f645b, lVar.f649d, bVar, lVar.f653h, editorInfo);
        io.flutter.plugin.editing.f fVar = lVar.f653h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = lVar.f653h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        lVar.f655j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0017s c0017s;
        t tVar = this.f140s;
        if (tVar != null && (c0017s = this.f145y) != null) {
            C.a aVar = (C.a) ((C.a) tVar.f114c).f5d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f5d;
            ReentrantLock reentrantLock = (ReentrantLock) aVar.f4c;
            reentrantLock.lock();
            try {
                m0.K k2 = (m0.K) linkedHashMap.get(c0017s);
                if (k2 != null) {
                    k2.a(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f145y = null;
        this.f140s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0001b c0001b = this.f137p;
            Context context = getContext();
            c0001b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0001b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0001b.f63f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0001b.f64a.f593a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f138q.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f146z = View.MeasureSpec.getMode(i2);
        this.f121A = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.l lVar = this.f133l;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || lVar.f652g == null) {
            return;
        }
        String str = (String) lVar.f651f.f347j.f8a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < lVar.f652g.size(); i3++) {
            int keyAt = lVar.f652g.keyAt(i3);
            C.e eVar = ((O.p) lVar.f652g.valueAt(i3)).f347j;
            if (eVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) eVar.f9b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) eVar.f11d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = lVar.f658m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((O.r) eVar.f10c).f354a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f658m.height());
                    newChild.setAutofillValue(AutofillValue.forText(lVar.f653h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.f141t;
        gVar.f569b = i2;
        gVar.f570c = i3;
        boolean z2 = this.f122a;
        if (z2 && this.f121A == 0) {
            gVar.f573f = 0;
            gVar.f574g = 8192;
        } else {
            gVar.f573f = i3;
            gVar.f574g = i3;
        }
        if (z2 && this.f146z == 0) {
            gVar.f571d = 0;
            gVar.f572e = 8192;
        } else {
            gVar.f571d = i2;
            gVar.f572e = i2;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0001b c0001b = this.f137p;
        Matrix matrix = C0001b.f63f;
        c0001b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0001b.b(motionEvent.getActionMasked());
        char c2 = 5;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c2 = 0;
        } else if (toolType == 2) {
            c2 = 2;
        } else if (toolType == 3) {
            c2 = 1;
        } else if (toolType == 4) {
            c2 = 3;
        }
        int i2 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i2) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            byteBuffer = allocateDirect;
            c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
        } else {
            byteBuffer = allocateDirect;
            if (z3) {
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                        c0001b.a(motionEvent, i3, 5, 1, matrix, byteBuffer, null);
                    }
                }
                c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i2 != 0) {
                    c0001b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    c0001b.a(motionEvent, i4, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0001b.f64a.f593a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(z zVar) {
        this.B = zVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f126e;
        if (view instanceof C0014o) {
            ((C0014o) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(w.k kVar) {
        C0093b c0093b = C0093b.f1279e;
        ?? r9 = kVar.f1305a;
        ArrayList arrayList = new ArrayList();
        for (C0094c c0094c : r9) {
            c0094c.f1286a.a().toString();
            t.b bVar = c0094c.f1286a;
            int i2 = 2;
            int i3 = ((bVar.f1253c - bVar.f1251a == 0 || bVar.f1254d - bVar.f1252b == 0) ? C0093b.f1278d : c0093b) == c0093b ? 3 : 2;
            C0093b c0093b2 = c0094c.f1288c;
            if (c0093b2 != C0093b.f1280f) {
                i2 = c0093b2 == C0093b.f1281g ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.a(), i3, i2));
        }
        ArrayList arrayList2 = this.f141t.f591y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public x(AbstractActivityC0005f abstractActivityC0005f, C0016q c0016q) {
        super(abstractActivityC0005f, null);
        this.f122a = false;
        this.f128g = new HashSet();
        this.f131j = new HashSet();
        this.f141t = new io.flutter.embedding.engine.renderer.g();
        this.f142u = new t(0, this);
        this.v = new u(this, new Handler(Looper.getMainLooper()), 0);
        this.f143w = new v(this);
        this.f144x = new C0006g(1, this);
        this.B = new z();
        this.f124c = c0016q;
        this.f126e = c0016q;
        b();
    }
}
