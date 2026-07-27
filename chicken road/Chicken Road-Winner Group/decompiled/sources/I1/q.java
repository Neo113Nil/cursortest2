package I1;

import D.C0009j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
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
import d0.C0262b;
import g0.C0303b;
import g0.C0304c;
import g0.C0308g;
import g0.C0310i;
import g0.C0311j;
import g0.InterfaceC0309h;
import io.flutter.embedding.engine.FlutterEngine;
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
import w2.AbstractC1242v;
import w2.C1240t;
import w2.J;
import w2.P;

/* loaded from: classes.dex */
public final class q extends FrameLayout implements V1.a, A {

    /* renamed from: A, reason: collision with root package name */
    public int f640A;

    /* renamed from: B, reason: collision with root package name */
    public s f641B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f642a;

    /* renamed from: b, reason: collision with root package name */
    public final j f643b;

    /* renamed from: c, reason: collision with root package name */
    public final l f644c;

    /* renamed from: d, reason: collision with root package name */
    public C0031h f645d;

    /* renamed from: e, reason: collision with root package name */
    public View f646e;
    public View f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f647g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f648h;

    /* renamed from: i, reason: collision with root package name */
    public FlutterEngine f649i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f650j;

    /* renamed from: k, reason: collision with root package name */
    public V1.b f651k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.l f652l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.i f653m;

    /* renamed from: n, reason: collision with root package name */
    public U1.a f654n;

    /* renamed from: o, reason: collision with root package name */
    public A0.j f655o;

    /* renamed from: p, reason: collision with root package name */
    public C0024a f656p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.i f657q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f658r;

    /* renamed from: s, reason: collision with root package name */
    public J1.i f659s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f660t;

    /* renamed from: u, reason: collision with root package name */
    public final b0.i f661u;

    /* renamed from: v, reason: collision with root package name */
    public final I.a f662v;

    /* renamed from: w, reason: collision with root package name */
    public final o f663w;

    /* renamed from: x, reason: collision with root package name */
    public final C0028e f664x;
    public n y;

    /* renamed from: z, reason: collision with root package name */
    public int f665z;

    public q(AbstractActivityC0027d abstractActivityC0027d, j jVar) {
        super(abstractActivityC0027d, null);
        this.f642a = false;
        this.f647g = new HashSet();
        this.f650j = new HashSet();
        this.f660t = new io.flutter.embedding.engine.renderer.i();
        this.f661u = new b0.i(3, this);
        this.f662v = new I.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f663w = new o(this);
        this.f664x = new C0028e(1, this);
        this.f641B = new s();
        this.f643b = jVar;
        this.f646e = jVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f649i);
        if (c()) {
            Iterator it = this.f650j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f662v);
            io.flutter.plugin.platform.r rVar = this.f649i.f9115s;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray2 = rVar.f9314o;
                if (i3 >= sparseArray2.size()) {
                    break;
                }
                rVar.f9304d.removeView((io.flutter.plugin.platform.j) sparseArray2.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray3 = rVar.f9312m;
                if (i4 >= sparseArray3.size()) {
                    break;
                }
                rVar.f9304d.removeView((O1.b) sparseArray3.valueAt(i4));
                i4++;
            }
            rVar.d();
            if (rVar.f9304d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i5 = 0;
                while (true) {
                    sparseArray = rVar.f9313n;
                    if (i5 >= sparseArray.size()) {
                        break;
                    }
                    rVar.f9304d.removeView((View) sparseArray.valueAt(i5));
                    i5++;
                }
                sparseArray.clear();
            }
            rVar.f9304d = null;
            rVar.f9316q = false;
            int i6 = 0;
            while (true) {
                SparseArray sparseArray4 = rVar.f9311l;
                if (i6 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray4.valueAt(i6)).onFlutterViewDetached();
                i6++;
            }
            io.flutter.plugin.platform.q qVar = this.f649i.f9116t;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray5 = qVar.f9292j;
                if (i7 >= sparseArray5.size()) {
                    break;
                }
                qVar.f9287d.removeView((O1.b) sparseArray5.valueAt(i7));
                i7++;
            }
            Surface surface = qVar.f9296n;
            if (surface != null) {
                surface.release();
                qVar.f9296n = null;
                qVar.f9297o = null;
            }
            qVar.f9287d = null;
            int i8 = 0;
            while (true) {
                SparseArray sparseArray6 = qVar.f9291i;
                if (i8 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.g) sparseArray6.valueAt(i8)).onFlutterViewDetached();
                i8++;
            }
            this.f649i.f9115s.k();
            this.f649i.f9116t.k();
            io.flutter.view.i iVar = this.f657q;
            iVar.f9446u = true;
            iVar.f9431e.k();
            iVar.f9444s = null;
            AccessibilityManager accessibilityManager = iVar.f9429c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar.f9447v);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar.f9448w);
            iVar.f.unregisterContentObserver(iVar.f9449x);
            A0.j jVar = iVar.f9428b;
            jVar.f68d = null;
            ((FlutterJNI) jVar.f67c).setAccessibilityDelegate(null);
            this.f657q = null;
            this.f652l.f9218b.restartInput(this);
            this.f652l.c();
            int size = ((HashSet) this.f655o.f67c).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.i iVar2 = this.f653m;
            if (iVar2 != null) {
                iVar2.f9205a.f2461b = null;
                SpellCheckerSession spellCheckerSession = iVar2.f9207c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            V1.b bVar = this.f651k;
            if (bVar != null) {
                ((b0.i) bVar.f1615c).f2461b = null;
            }
            io.flutter.embedding.engine.renderer.j jVar2 = this.f649i.f9099b;
            this.f648h = false;
            jVar2.g(this.f664x);
            boolean z3 = this.f642a;
            FlutterJNI flutterJNI = jVar2.f9165a;
            if (z3) {
                flutterJNI.removeResizingFlutterUiListener(this.f663w);
            }
            jVar2.j();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f;
            if (view != null && this.f646e == this.f645d) {
                this.f646e = view;
            }
            this.f646e.b();
            C0031h c0031h = this.f645d;
            if (c0031h != null) {
                c0031h.f616a.close();
                removeView(this.f645d);
                this.f645d = null;
            }
            this.f = null;
            this.f649i = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        S1.m mVar;
        D0.a aVar;
        D0.a aVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f652l;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || (mVar = lVar.f) == null || lVar.f9222g == null || (aVar = mVar.f1446j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            S1.m mVar2 = (S1.m) lVar.f9222g.get(sparseArray.keyAt(i3));
            if (mVar2 != null && (aVar2 = mVar2.f1446j) != null) {
                textValue = com.startapp.sdk.internal.I.e(sparseArray.valueAt(i3)).getTextValue();
                String charSequence = textValue.toString();
                S1.o oVar = new S1.o(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) aVar2.f264d;
                if (str.equals((String) aVar.f264d)) {
                    lVar.f9223h.f(oVar);
                } else {
                    hashMap.put(str, oVar);
                }
            }
        }
        int i4 = lVar.f9221e.f246c;
        a1.e eVar = lVar.f9220d;
        eVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            S1.o oVar2 = (S1.o) entry.getValue();
            hashMap2.put((String) entry.getKey(), a1.e.v(oVar2.f1453a, oVar2.f1454b, oVar2.f1455c, -1, -1));
        }
        ((T1.o) eVar.f1788b).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), hashMap2), null);
    }

    public final void b() {
        j jVar = this.f643b;
        if (jVar != null) {
            addView(jVar);
        } else {
            l lVar = this.f644c;
            if (lVar != null) {
                addView(lVar);
            } else {
                addView(this.f645d);
            }
        }
        this.f642a = F2.b.z(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final boolean c() {
        FlutterEngine flutterEngine = this.f649i;
        if (flutterEngine != null) {
            return flutterEngine.f9099b == this.f646e.getAttachedRenderer();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.f649i;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.r rVar = flutterEngine.f9115s;
        if (view == null) {
            rVar.getClass();
            return false;
        }
        HashMap hashMap = rVar.f9310k;
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z3;
        HashMap hashMap;
        String str;
        boolean z4;
        D0.a aVar;
        List enabledSpellCheckerInfos;
        boolean z5;
        boolean isSpellCheckerEnabled;
        char c3 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f658r;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z5 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f658r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z3 = true;
            S1.l lVar = this.f649i.f9111o;
            lVar.getClass();
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z3));
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
            z4 = Build.VERSION.SDK_INT >= 34;
            aVar = lVar.f1437b;
            if (z4 || displayMetrics == null) {
                aVar.f(hashMap, null);
            }
            S1.k kVar = new S1.k(displayMetrics);
            A0.j jVar = lVar.f1436a;
            ((ConcurrentLinkedQueue) jVar.f66b).add(kVar);
            S1.k kVar2 = (S1.k) jVar.f68d;
            jVar.f68d = kVar;
            a1.e eVar = kVar2 != null ? new a1.e(jVar, kVar2, 24, false) : null;
            hashMap.put("configurationId", Integer.valueOf(kVar.f1434a));
            aVar.f(hashMap, eVar);
            return;
        }
        z3 = false;
        S1.l lVar2 = this.f649i.f9111o;
        lVar2.getClass();
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z3));
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
        aVar = lVar2.f1437b;
        if (z4) {
        }
        aVar.f(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f655o.E(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.i iVar = this.f660t;
        iVar.f9141a = f;
        iVar.f9159t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.j jVar = this.f649i.f9099b;
        jVar.getClass();
        int i3 = iVar.f9142b;
        if (i3 == 0) {
            int i4 = iVar.f9144d;
            int i5 = iVar.f9145e;
            if (i4 <= 0 && i5 <= 0) {
                return;
            }
        } else {
            int i6 = iVar.f9143c;
            if (i6 == 0) {
                int i7 = iVar.f;
                int i8 = iVar.f9146g;
                if (i7 <= 0 && i8 <= 0) {
                    return;
                }
            } else if (i3 <= 0 || i6 <= 0 || iVar.f9141a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = iVar.y;
        arrayList.size();
        ArrayList arrayList2 = iVar.f9164z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i9);
            int i10 = i9 * 4;
            Rect rect = aVar.f9121a;
            iArr[i10] = rect.left;
            iArr[i10 + 1] = rect.top;
            iArr[i10 + 2] = rect.right;
            iArr[i10 + 3] = rect.bottom;
            iArr2[i9] = M.j.b(aVar.f9122b);
            iArr3[i9] = M.j.b(aVar.f9123c);
        }
        int size2 = arrayList.size() * 4;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i11);
            int i12 = (i11 * 4) + size2;
            Rect rect2 = aVar2.f9121a;
            iArr[i12] = rect2.left;
            iArr[i12 + 1] = rect2.top;
            iArr[i12 + 2] = rect2.right;
            iArr[i12 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i11] = M.j.b(aVar2.f9122b);
            iArr3[arrayList.size() + i11] = M.j.b(aVar2.f9123c);
        }
        jVar.f9165a.setViewportMetrics(iVar.f9141a, iVar.f9142b, iVar.f9143c, iVar.f9147h, iVar.f9148i, iVar.f9149j, iVar.f9150k, iVar.f9151l, iVar.f9152m, iVar.f9153n, iVar.f9154o, iVar.f9155p, iVar.f9156q, iVar.f9157r, iVar.f9158s, iVar.f9159t, iArr, iArr2, iArr3, iVar.f9144d, iVar.f9145e, iVar.f, iVar.f9146g, iVar.f9160u, iVar.f9161v, iVar.f9162w, iVar.f9163x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f657q;
        if (iVar == null || !iVar.f9429c.isEnabled()) {
            return null;
        }
        return this.f657q;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.f649i;
    }

    public T1.f getBinaryMessenger() {
        return this.f649i.f9100c;
    }

    public C0031h getCurrentImageSurface() {
        return this.f645d;
    }

    public io.flutter.embedding.engine.renderer.i getViewportMetrics() {
        return this.f660t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b3, code lost:
    
        r3 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c3;
        double d3;
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
        io.flutter.embedding.engine.renderer.i iVar = this.f660t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            iVar.f9155p = i20;
            i21 = systemGestureInsets.right;
            iVar.f9156q = i21;
            i22 = systemGestureInsets.bottom;
            iVar.f9157r = i22;
            i23 = systemGestureInsets.left;
            iVar.f9158s = i23;
        }
        boolean z3 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z4 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            iVar.f9147h = i4;
            i5 = insets.right;
            iVar.f9148i = i5;
            i6 = insets.bottom;
            iVar.f9149j = i6;
            i7 = insets.left;
            iVar.f9150k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            iVar.f9151l = i8;
            i9 = insets2.right;
            iVar.f9152m = i9;
            i10 = insets2.bottom;
            iVar.f9153n = i10;
            i11 = insets2.left;
            iVar.f9154o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            iVar.f9155p = i12;
            i13 = insets3.right;
            iVar.f9156q = i13;
            i14 = insets3.bottom;
            iVar.f9157r = i14;
            i15 = insets3.left;
            iVar.f9158s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = iVar.f9147h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                iVar.f9147h = Math.max(max, safeInsetTop);
                int i26 = iVar.f9148i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                iVar.f9148i = Math.max(max2, safeInsetRight);
                int i27 = iVar.f9149j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                iVar.f9149j = Math.max(max3, safeInsetBottom);
                int i28 = iVar.f9150k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                iVar.f9150k = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z4) {
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
                    iVar.f9147h = !z3 ? windowInsets.getSystemWindowInsetTop() : 0;
                    iVar.f9148i = (c3 != 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z4) {
                        d3 = 0.18d;
                    } else {
                        d3 = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i3 = windowInsets.getSystemWindowInsetBottom();
                            iVar.f9149j = i3;
                            iVar.f9150k = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            iVar.f9151l = 0;
                            iVar.f9152m = 0;
                            iVar.f9153n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d3 ? 0 : windowInsets.getSystemWindowInsetBottom();
                            iVar.f9154o = 0;
                        }
                    }
                    i3 = 0;
                    iVar.f9149j = i3;
                    iVar.f9150k = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    iVar.f9151l = 0;
                    iVar.f9152m = 0;
                    iVar.f9153n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d3 ? 0 : windowInsets.getSystemWindowInsetBottom();
                    iVar.f9154o = 0;
                }
            }
            c3 = 1;
            iVar.f9147h = !z3 ? windowInsets.getSystemWindowInsetTop() : 0;
            iVar.f9148i = (c3 != 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z4) {
            }
            i3 = 0;
            iVar.f9149j = i3;
            iVar.f9150k = (c3 != 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            iVar.f9151l = 0;
            iVar.f9152m = 0;
            iVar.f9153n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d3 ? 0 : windowInsets.getSystemWindowInsetBottom();
            iVar.f9154o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = iVar.f9164z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            s sVar = this.f641B;
            Context context2 = getContext();
            sVar.getClass();
            Activity u3 = F2.b.u(context2);
            WindowInsets windowInsets2 = null;
            if (u3 != null && (window = u3.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = iVar.f9147h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            iVar.f9147h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            iVar.f9160u = roundedCorner != null ? roundedCorner.getRadius() : 0;
            iVar.f9161v = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            iVar.f9162w = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            iVar.f9163x = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [z2.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        J1.i iVar;
        super.onAttachedToWindow();
        try {
            C0308g c0308g = InterfaceC0309h.v0;
            Context context = getContext();
            c0308g.getClass();
            iVar = new J1.i(5, new V1.b(C0308g.a(context)));
        } catch (NoClassDefFoundError unused) {
            iVar = null;
        }
        this.f659s = iVar;
        Activity u3 = F2.b.u(getContext());
        J1.i iVar2 = this.f659s;
        if (iVar2 == null || u3 == null) {
            return;
        }
        this.y = new n(0, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? t.c.a(context2) : new A0.q(3, new Handler(context2.getMainLooper()));
        n consumer = this.y;
        V1.b bVar = (V1.b) iVar2.f729b;
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(consumer, "consumer");
        C0303b c0303b = (C0303b) bVar.f1614b;
        c0303b.getClass();
        C0310i c0310i = new C0310i(c0303b, u3, null);
        g2.i iVar3 = g2.i.f4981a;
        z2.c cVar = new z2.c(c0310i, iVar3, -2, 1);
        D2.d dVar = w2.B.f10462a;
        x2.c cVar2 = B2.o.f177a;
        if (cVar2.k(C1240t.f10525b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        z2.c flow = cVar;
        if (!cVar2.equals(iVar3)) {
            flow = A2.l.a(cVar, cVar2, 0, 0, 6);
        }
        V1.b bVar2 = (V1.b) bVar.f1615c;
        bVar2.getClass();
        kotlin.jvm.internal.j.e(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) bVar2.f1614b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar2.f1615c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, AbstractC1242v.g(AbstractC1242v.a(new J(executor)), null, new e0.a(flow, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f649i != null) {
            this.f654n.b(configuration);
            d();
            F2.b.i(getContext(), this.f649i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r2.f1452c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.l lVar = this.f652l;
        A0.j jVar = this.f655o;
        C0009j c0009j = lVar.f9221e;
        int i5 = c0009j.f245b;
        if (i5 == 1) {
            lVar.f9225j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (lVar.f9231p) {
                return lVar.f9225j;
            }
            InputConnection onCreateInputConnection = lVar.f9226k.h(c0009j.f246c).onCreateInputConnection(editorInfo);
            lVar.f9225j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        S1.m mVar = lVar.f;
        S1.n nVar = mVar.f1443g;
        int i7 = nVar.f1450a;
        if (i7 != 2) {
            if (i7 == 5) {
                i6 = nVar.f1451b ? 4098 : 2;
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                int i8 = i7 == 7 ? 131073 : (i7 == 8 || i7 == 13) ? 33 : (i7 == 9 || i7 == 12) ? 17 : i7 == 10 ? 145 : i7 == 3 ? 97 : i7 == 4 ? 113 : 1;
                if (!mVar.f1438a) {
                    if (mVar.f1439b) {
                        i8 |= 32768;
                    }
                    i4 = mVar.f1440c ? 524416 : 524432;
                    i6 = i8;
                    i3 = mVar.f;
                    if (i3 != 1) {
                        i6 |= 4096;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                i6 |= 16384;
                            }
                        }
                        i6 |= 8192;
                    }
                }
                i8 |= i4;
                i6 = i8;
                i3 = mVar.f;
                if (i3 != 1) {
                }
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !mVar.f1441d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = mVar.f1444h.intValue();
        S1.m mVar2 = lVar.f;
        String str = mVar2.f1445i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (mVar2.f1449m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f.f1449m);
        }
        String[] strArr = lVar.f.f1447k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.e eVar = new io.flutter.plugin.editing.e(this, lVar.f9221e.f246c, lVar.f9220d, jVar, lVar.f9223h, editorInfo);
        io.flutter.plugin.editing.h hVar = lVar.f9223h;
        hVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(hVar);
        io.flutter.plugin.editing.h hVar2 = lVar.f9223h;
        hVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(hVar2);
        lVar.f9225j = eVar;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n nVar;
        J1.i iVar = this.f659s;
        if (iVar != null && (nVar = this.y) != null) {
            V1.b bVar = (V1.b) ((V1.b) iVar.f729b).f1615c;
            bVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) bVar.f1614b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f1615c;
            try {
                P p3 = (P) linkedHashMap.get(nVar);
                if (p3 != null) {
                    p3.b(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.y = null;
        this.f659s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0024a c0024a = this.f656p;
            Context context = getContext();
            c0024a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z3 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z3) {
                int b3 = C0024a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0024a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, C0024a.f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0024a.f588a.f9165a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f657q.f(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        this.f665z = View.MeasureSpec.getMode(i3);
        this.f640A = View.MeasureSpec.getMode(i4);
        super.onMeasure(i3, i4);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        io.flutter.plugin.editing.l lVar = this.f652l;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || lVar.f9222g == null) {
            return;
        }
        String str = (String) lVar.f.f1446j.f264d;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i4 = 0; i4 < lVar.f9222g.size(); i4++) {
            int keyAt = lVar.f9222g.keyAt(i4);
            D0.a aVar = ((S1.m) lVar.f9222g.valueAt(i4)).f1446j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i4);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) aVar.f261a;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) aVar.f263c;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = lVar.f9228m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((S1.o) aVar.f262b).f1453a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f9228m.height());
                    newChild.setAutofillValue(AutofillValue.forText(lVar.f9223h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        io.flutter.embedding.engine.renderer.i iVar = this.f660t;
        iVar.f9142b = i3;
        iVar.f9143c = i4;
        boolean z3 = this.f642a;
        if (z3 && this.f640A == 0) {
            iVar.f = 0;
            iVar.f9146g = 8192;
        } else {
            iVar.f = i4;
            iVar.f9146g = i4;
        }
        if (z3 && this.f665z == 0) {
            iVar.f9144d = 0;
            iVar.f9145e = 8192;
        } else {
            iVar.f9144d = i3;
            iVar.f9145e = i3;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f656p.d(motionEvent, C0024a.f);
        return true;
    }

    public void setDelegate(s sVar) {
        this.f641B = sVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f646e;
        if (view instanceof j) {
            ((j) view).setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(C0311j c0311j) {
        ?? r8 = c0311j.f4970a;
        ArrayList arrayList = new ArrayList();
        for (C0304c c0304c : r8) {
            c0304c.f4956a.a().toString();
            C0262b c0262b = c0304c.f4956a;
            int i3 = c0262b.f4824c - c0262b.f4822a;
            C0303b c0303b = C0303b.f4950d;
            int i4 = 2;
            int i5 = ((i3 == 0 || c0262b.f4825d - c0262b.f4823b == 0) ? C0303b.f4949c : c0303b) == c0303b ? 3 : 2;
            C0303b c0303b2 = C0303b.f4951e;
            C0303b c0303b3 = c0304c.f4958c;
            if (c0303b3 != c0303b2) {
                i4 = c0303b3 == C0303b.f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(c0262b.a(), i5, i4));
        }
        ArrayList arrayList2 = this.f660t.y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public q(AbstractActivityC0027d abstractActivityC0027d, l lVar) {
        super(abstractActivityC0027d, null);
        this.f642a = false;
        this.f647g = new HashSet();
        this.f650j = new HashSet();
        this.f660t = new io.flutter.embedding.engine.renderer.i();
        this.f661u = new b0.i(3, this);
        this.f662v = new I.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f663w = new o(this);
        this.f664x = new C0028e(1, this);
        this.f641B = new s();
        this.f644c = lVar;
        this.f646e = lVar;
        b();
    }
}
