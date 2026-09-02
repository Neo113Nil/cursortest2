package s0;

import a.AbstractC0009a;
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
import b1.AbstractC0013a;
import b1.AbstractC0030s;
import b1.AbstractC0035x;
import b1.C0029q;
import b1.E;
import b1.J;
import b1.M;
import b1.X;
import i.AbstractC0067a;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
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
import p.AbstractC0819i;
import x.C0857b;
import y.C0863a;
import z.C0864a;

/* loaded from: classes.dex */
public final class o extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f6549A;

    /* renamed from: B, reason: collision with root package name */
    public p f6550B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final j f6552b;

    /* renamed from: c, reason: collision with root package name */
    public final l f6553c;

    /* renamed from: d, reason: collision with root package name */
    public h f6554d;

    /* renamed from: e, reason: collision with root package name */
    public View f6555e;

    /* renamed from: f, reason: collision with root package name */
    public View f6556f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f6557g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6558h;

    /* renamed from: i, reason: collision with root package name */
    public FlutterEngine f6559i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f6560j;

    /* renamed from: k, reason: collision with root package name */
    public Y.e f6561k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.l f6562l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.h f6563m;

    /* renamed from: n, reason: collision with root package name */
    public E0.b f6564n;

    /* renamed from: o, reason: collision with root package name */
    public C0.b f6565o;

    /* renamed from: p, reason: collision with root package name */
    public C0833a f6566p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.i f6567q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f6568r;

    /* renamed from: s, reason: collision with root package name */
    public io.flutter.plugin.editing.a f6569s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f6570t;

    /* renamed from: u, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f6571u;

    /* renamed from: v, reason: collision with root package name */
    public final io.flutter.view.d f6572v;

    /* renamed from: w, reason: collision with root package name */
    public final m f6573w;

    /* renamed from: x, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f6574x;

    /* renamed from: y, reason: collision with root package name */
    public A.i f6575y;

    /* renamed from: z, reason: collision with root package name */
    public int f6576z;

    public o(d dVar, j jVar) {
        super(dVar, null);
        this.f6551a = false;
        this.f6557g = new HashSet();
        this.f6560j = new HashSet();
        this.f6570t = new io.flutter.embedding.engine.renderer.h();
        this.f6571u = new io.flutter.plugin.editing.a(8, this);
        this.f6572v = new io.flutter.view.d(this, new Handler(Looper.getMainLooper()), 1);
        this.f6573w = new m(this);
        this.f6574x = new io.flutter.embedding.engine.renderer.a(2, this);
        this.f6550B = new p();
        this.f6552b = jVar;
        this.f6555e = jVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f6559i);
        if (!c()) {
            return;
        }
        Iterator it = this.f6560j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f6572v);
        io.flutter.plugin.platform.j jVar = this.f6559i.f5737s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.f5891n;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            jVar.f5880c.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = jVar.f5889l;
            if (i3 >= sparseArray3.size()) {
                jVar.e();
                if (jVar.f5880c == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = jVar.f5890m;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        jVar.f5880c.removeView((View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                jVar.f5880c = null;
                jVar.f5893p = false;
                SparseArray sparseArray4 = jVar.f5888k;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.i iVar = this.f6559i.f5738t;
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray5 = iVar.f5871h;
                    if (i5 >= sparseArray5.size()) {
                        Surface surface = iVar.f5874k;
                        if (surface != null) {
                            surface.release();
                            iVar.f5874k = null;
                            iVar.f5875l = null;
                        }
                        iVar.f5866c = null;
                        SparseArray sparseArray6 = iVar.f5870g;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f6559i.f5737s.a();
                        this.f6559i.f5738t.a();
                        io.flutter.view.i iVar2 = this.f6567q;
                        iVar2.f6018t = true;
                        iVar2.f6003e.a();
                        iVar2.f6016r = null;
                        AccessibilityManager accessibilityManager = iVar2.f6001c;
                        accessibilityManager.removeAccessibilityStateChangeListener(iVar2.f6019u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(iVar2.f6020v);
                        iVar2.f6004f.unregisterContentObserver(iVar2.f6021w);
                        C0.b bVar = iVar2.f6000b;
                        bVar.f56d = null;
                        ((FlutterJNI) bVar.f55c).setAccessibilityDelegate(null);
                        this.f6567q = null;
                        this.f6562l.f5837b.restartInput(this);
                        this.f6562l.b();
                        int size = ((HashSet) this.f6565o.f55c).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.h hVar = this.f6563m;
                        if (hVar != null) {
                            hVar.f5821a.f51b = null;
                            SpellCheckerSession spellCheckerSession = hVar.f5823c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        Y.e eVar = this.f6561k;
                        if (eVar != null) {
                            ((C0.a) eVar.f524c).f51b = null;
                        }
                        io.flutter.embedding.engine.renderer.i iVar3 = this.f6559i.f5720b;
                        this.f6558h = false;
                        iVar3.c(this.f6574x);
                        boolean z2 = this.f6551a;
                        FlutterJNI flutterJNI = iVar3.f5784a;
                        if (z2) {
                            flutterJNI.removeResizingFlutterUiListener(this.f6573w);
                        }
                        iVar3.e();
                        flutterJNI.setSemanticsEnabled(false);
                        View view = this.f6556f;
                        if (view != null && this.f6555e == this.f6554d) {
                            this.f6555e = view;
                        }
                        this.f6555e.c();
                        h hVar2 = this.f6554d;
                        if (hVar2 != null) {
                            hVar2.f6526a.close();
                            removeView(this.f6554d);
                            this.f6554d = null;
                        }
                        this.f6556f = null;
                        this.f6559i = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    iVar.f5866c.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                jVar.f5880c.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0.u uVar;
        C0.t tVar;
        C0.t tVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f6562l;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || (uVar = lVar.f5841f) == null || lVar.f5842g == null || (tVar = uVar.f129j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C0.u uVar2 = (C0.u) lVar.f5842g.get(sparseArray.keyAt(i2));
            if (uVar2 != null && (tVar2 = uVar2.f129j) != null) {
                textValue = E0.a.g(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                C0.w wVar = new C0.w(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) tVar2.f116a;
                if (str.equals((String) tVar.f116a)) {
                    lVar.f5843h.f(wVar);
                } else {
                    hashMap.put(str, wVar);
                }
            }
        }
        int i3 = lVar.f5840e.f5835b;
        Y.e eVar = lVar.f5839d;
        eVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            C0.w wVar2 = (C0.w) entry.getValue();
            hashMap2.put((String) entry.getKey(), Y.e.o(wVar2.f136a, wVar2.f137b, wVar2.f138c, -1, -1));
        }
        ((C0.t) eVar.f523b).f("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        j jVar = this.f6552b;
        if (jVar != null) {
            addView(jVar);
        } else {
            l lVar = this.f6553c;
            if (lVar != null) {
                addView(lVar);
            } else {
                addView(this.f6554d);
            }
        }
        this.f6551a = V.a.o(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final boolean c() {
        FlutterEngine flutterEngine = this.f6559i;
        if (flutterEngine != null) {
            if (flutterEngine.f5720b == this.f6555e.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.f6559i;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.j jVar = flutterEngine.f5737s;
        if (view == null) {
            jVar.getClass();
            return false;
        }
        HashMap hashMap = jVar.f5887j;
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
        boolean z2;
        HashMap hashMap;
        String str;
        boolean z3;
        C0.t tVar;
        List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f6568r;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z4 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f6568r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            C0.s sVar = this.f6559i.f5733o;
            sVar.getClass();
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
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
            z3 = Build.VERSION.SDK_INT >= 34;
            tVar = sVar.f115b;
            if (z3 || displayMetrics == null) {
                tVar.h(hashMap, null);
            }
            C0.r rVar = new C0.r(displayMetrics);
            C0.b bVar = sVar.f114a;
            ((ConcurrentLinkedQueue) bVar.f54b).add(rVar);
            C0.r rVar2 = (C0.r) bVar.f56d;
            bVar.f56d = rVar;
            Y.e eVar = rVar2 != null ? new Y.e(5, bVar, rVar2) : null;
            hashMap.put("configurationId", Integer.valueOf(rVar.f112a));
            tVar.h(hashMap, eVar);
            return;
        }
        z2 = false;
        C0.s sVar2 = this.f6559i.f5733o;
        sVar2.getClass();
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        tVar = sVar2.f115b;
        if (z3) {
        }
        tVar.h(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f6565o.h(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.h hVar = this.f6570t;
        hVar.f5758a = f2;
        hVar.f5777t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.i iVar = this.f6559i.f5720b;
        iVar.getClass();
        int i2 = hVar.f5759b;
        if (i2 == 0) {
            int i3 = hVar.f5761d;
            int i4 = hVar.f5762e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = hVar.f5760c;
            if (i5 == 0) {
                int i6 = hVar.f5763f;
                int i7 = hVar.f5764g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || hVar.f5758a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = hVar.f5782y;
        arrayList.size();
        ArrayList arrayList2 = hVar.f5783z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            io.flutter.embedding.engine.renderer.b bVar = (io.flutter.embedding.engine.renderer.b) arrayList.get(i8);
            int i9 = i8 * 4;
            Rect rect = bVar.f5745a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = AbstractC0819i.c(bVar.f5746b);
            iArr3[i8] = AbstractC0819i.c(bVar.f5747c);
        }
        int size2 = arrayList.size() * 4;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            io.flutter.embedding.engine.renderer.b bVar2 = (io.flutter.embedding.engine.renderer.b) arrayList2.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = bVar2.f5745a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i10] = AbstractC0819i.c(bVar2.f5746b);
            iArr3[arrayList.size() + i10] = AbstractC0819i.c(bVar2.f5747c);
        }
        iVar.f5784a.setViewportMetrics(hVar.f5758a, hVar.f5759b, hVar.f5760c, hVar.f5765h, hVar.f5766i, hVar.f5767j, hVar.f5768k, hVar.f5769l, hVar.f5770m, hVar.f5771n, hVar.f5772o, hVar.f5773p, hVar.f5774q, hVar.f5775r, hVar.f5776s, hVar.f5777t, iArr, iArr2, iArr3, hVar.f5761d, hVar.f5762e, hVar.f5763f, hVar.f5764g, hVar.f5778u, hVar.f5779v, hVar.f5780w, hVar.f5781x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f6567q;
        if (iVar == null || !iVar.f6001c.isEnabled()) {
            return null;
        }
        return this.f6567q;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.f6559i;
    }

    public D0.f getBinaryMessenger() {
        return this.f6559i.f5721c;
    }

    public h getCurrentImageSurface() {
        return this.f6554d;
    }

    public io.flutter.embedding.engine.renderer.h getViewportMetrics() {
        return this.f6570t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b1, code lost:
    
        r3 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
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
        io.flutter.embedding.engine.renderer.h hVar = this.f6570t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            hVar.f5773p = i20;
            i21 = systemGestureInsets.right;
            hVar.f5774q = i21;
            i22 = systemGestureInsets.bottom;
            hVar.f5775r = i22;
            i23 = systemGestureInsets.left;
            hVar.f5776s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            hVar.f5765h = i4;
            i5 = insets.right;
            hVar.f5766i = i5;
            i6 = insets.bottom;
            hVar.f5767j = i6;
            i7 = insets.left;
            hVar.f5768k = i7;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            hVar.f5769l = i8;
            i9 = insets2.right;
            hVar.f5770m = i9;
            i10 = insets2.bottom;
            hVar.f5771n = i10;
            i11 = insets2.left;
            hVar.f5772o = i11;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            hVar.f5773p = i12;
            i13 = insets3.right;
            hVar.f5774q = i13;
            i14 = insets3.bottom;
            hVar.f5775r = i14;
            i15 = insets3.left;
            hVar.f5776s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = hVar.f5765h;
                i16 = waterfallInsets.top;
                int max = Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                hVar.f5765h = Math.max(max, safeInsetTop);
                int i26 = hVar.f5766i;
                i17 = waterfallInsets.right;
                int max2 = Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                hVar.f5766i = Math.max(max2, safeInsetRight);
                int i27 = hVar.f5767j;
                i18 = waterfallInsets.bottom;
                int max3 = Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                hVar.f5767j = Math.max(max3, safeInsetBottom);
                int i28 = hVar.f5768k;
                i19 = waterfallInsets.left;
                int max4 = Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                hVar.f5768k = Math.max(max4, safeInsetLeft);
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
                    hVar.f5765h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    hVar.f5766i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            hVar.f5767j = i2;
                            hVar.f5768k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            hVar.f5769l = 0;
                            hVar.f5770m = 0;
                            hVar.f5771n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            hVar.f5772o = 0;
                        }
                    }
                    i2 = 0;
                    hVar.f5767j = i2;
                    hVar.f5768k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    hVar.f5769l = 0;
                    hVar.f5770m = 0;
                    hVar.f5771n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    hVar.f5772o = 0;
                }
            }
            c2 = 1;
            hVar.f5765h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            hVar.f5766i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            hVar.f5767j = i2;
            hVar.f5768k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            hVar.f5769l = 0;
            hVar.f5770m = 0;
            hVar.f5771n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            hVar.f5772o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.b(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = hVar.f5783z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            p pVar = this.f6550B;
            Context context2 = getContext();
            pVar.getClass();
            Activity k2 = AbstractC0009a.k(context2);
            WindowInsets windowInsets2 = null;
            if (k2 != null && (window = k2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = hVar.f5765h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = Math.max(i29, ((Rect) it.next()).bottom);
            }
            hVar.f5765h = i29;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            hVar.f5778u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            hVar.f5779v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            hVar.f5780w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            hVar.f5781x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [M0.i] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        io.flutter.plugin.editing.a aVar;
        M0.j jVar = M0.j.f226a;
        int i2 = 1;
        super.onAttachedToWindow();
        try {
            A.g gVar = A.h.f22a;
            Context context = getContext();
            gVar.getClass();
            aVar = new io.flutter.plugin.editing.a(9, new C0864a(A.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            aVar = null;
        }
        this.f6569s = aVar;
        Activity k2 = AbstractC0009a.k(getContext());
        io.flutter.plugin.editing.a aVar2 = this.f6569s;
        if (aVar2 == null || k2 == null) {
            return;
        }
        this.f6575y = new A.i(i2, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? AbstractC0067a.a(context2) : new P.k(new Handler(context2.getMainLooper()), 2);
        A.i consumer = this.f6575y;
        C0864a c0864a = (C0864a) aVar2.f5792b;
        kotlin.jvm.internal.j.e(executor, "executor");
        kotlin.jvm.internal.j.e(consumer, "consumer");
        A.b bVar = (A.b) c0864a.f6798b;
        bVar.getClass();
        e1.b bVar2 = new e1.b(new A.k(bVar, k2, null), jVar, -2, 1);
        h1.d dVar = AbstractC0035x.f693a;
        c1.c cVar = g1.o.f1172a;
        if (cVar.i(C0029q.f679b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
        }
        if (!cVar.equals(jVar)) {
            M0.i k3 = cVar.k(jVar);
            if (!kotlin.jvm.internal.j.a(k3, jVar)) {
                bVar2 = new e1.b(bVar2.f982e, k3, -2, 1);
            }
        }
        C0864a c0864a2 = (C0864a) c0864a.f6799c;
        c0864a2.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) c0864a2.f6798b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0864a2.f6799c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                E e2 = new E(executor);
                g1.e eVar = new g1.e(e2.i(C0029q.f679b) != null ? e2 : V.a.u(e2, new M(null)));
                C0863a c0863a = new C0863a(bVar2, consumer, null);
                AbstractC0013a x2 = new X(AbstractC0030s.f(eVar, jVar), true);
                x2.L(1, x2, c0863a);
                linkedHashMap.put(consumer, x2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6559i != null) {
            this.f6564n.b(configuration);
            d();
            AbstractC0009a.a(getContext(), this.f6559i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.l lVar = this.f6562l;
        C0.b bVar = this.f6565o;
        io.flutter.plugin.editing.k kVar = lVar.f5840e;
        int i5 = kVar.f5834a;
        if (i5 == 1) {
            lVar.f5845j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (lVar.f5851p) {
                return lVar.f5845j;
            }
            lVar.f5846k.g(kVar.f5835b);
            throw null;
        }
        C0.u uVar = lVar.f5841f;
        C0.v vVar = uVar.f126g;
        int i7 = vVar.f134b;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = vVar.f133a ? 4098 : 2;
                if (vVar.f135c) {
                    i2 = i8 | 8192;
                    i6 = i2;
                } else {
                    i6 = i8;
                }
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                i2 = i7 == 7 ? 131073 : (i7 == 8 || i7 == 13) ? 33 : (i7 == 9 || i7 == 12) ? 17 : i7 == 10 ? 145 : i7 == 3 ? 97 : i7 == 4 ? 113 : 1;
                if (!uVar.f120a) {
                    if (uVar.f121b) {
                        i2 |= 32768;
                    }
                    i4 = uVar.f122c ? 524416 : 524432;
                    i3 = uVar.f125f;
                    if (i3 != 1) {
                        i2 |= Base64Utils.IO_BUFFER_SIZE;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i6 = i2;
                }
                i2 |= i4;
                i3 = uVar.f125f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !uVar.f123d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = uVar.f127h.intValue();
        C0.u uVar2 = lVar.f5841f;
        String str = uVar2.f128i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (uVar2.f132m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f5841f.f132m);
        }
        String[] strArr = lVar.f5841f.f130k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.d dVar = new io.flutter.plugin.editing.d(this, lVar.f5840e.f5835b, lVar.f5839d, bVar, lVar.f5843h, editorInfo);
        io.flutter.plugin.editing.g gVar = lVar.f5843h;
        gVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(gVar);
        io.flutter.plugin.editing.g gVar2 = lVar.f5843h;
        gVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(gVar2);
        lVar.f5845j = dVar;
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A.i iVar;
        io.flutter.plugin.editing.a aVar = this.f6569s;
        if (aVar != null && (iVar = this.f6575y) != null) {
            C0864a c0864a = (C0864a) ((C0864a) aVar.f5792b).f6799c;
            c0864a.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) c0864a.f6798b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0864a.f6799c;
            try {
                J j2 = (J) linkedHashMap.get(iVar);
                if (j2 != null) {
                    j2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f6575y = null;
        this.f6569s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0833a c0833a = this.f6566p;
            Context context = getContext();
            c0833a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0833a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0833a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0833a.f6499f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0833a.f6500a.f5784a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f6567q.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f6576z = View.MeasureSpec.getMode(i2);
        this.f6549A = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.l lVar = this.f6562l;
        if (lVar == null || Build.VERSION.SDK_INT < 26 || lVar.f5842g == null) {
            return;
        }
        String str = (String) lVar.f5841f.f129j.f116a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < lVar.f5842g.size(); i3++) {
            int keyAt = lVar.f5842g.keyAt(i3);
            C0.t tVar = ((C0.u) lVar.f5842g.valueAt(i3)).f129j;
            if (tVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) tVar.f118c;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) tVar.f117b;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = lVar.f5848m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((C0.w) tVar.f119d).f136a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f5848m.height());
                    newChild.setAutofillValue(AutofillValue.forText(lVar.f5843h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.h hVar = this.f6570t;
        hVar.f5759b = i2;
        hVar.f5760c = i3;
        boolean z2 = this.f6551a;
        if (z2 && this.f6549A == 0) {
            hVar.f5763f = 0;
            hVar.f5764g = 8192;
        } else {
            hVar.f5763f = i3;
            hVar.f5764g = i3;
        }
        if (z2 && this.f6576z == 0) {
            hVar.f5761d = 0;
            hVar.f5762e = 8192;
        } else {
            hVar.f5761d = i2;
            hVar.f5762e = i2;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0833a c0833a = this.f6566p;
        Matrix matrix = C0833a.f6499f;
        c0833a.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0833a.b(motionEvent.getActionMasked());
        char c2 = 5;
        int i3 = 1;
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
        int i4 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            c0833a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else {
            ByteBuffer byteBuffer3 = allocateDirect;
            if (z3) {
                int i5 = 0;
                while (i5 < pointerCount) {
                    if (i5 == motionEvent.getActionIndex() || motionEvent.getToolType(i5) != i3) {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                    } else {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                        c0833a.a(motionEvent, i5, 5, 1, matrix, byteBuffer2, null);
                    }
                    i5++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c0833a.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i4 != 0) {
                    c0833a.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    c0833a.a(motionEvent, i6, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0833a.f6500a.f5784a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(p pVar) {
        this.f6550B = pVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f6555e;
        if (view instanceof j) {
            ((j) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(A.l lVar) {
        ?? r8 = lVar.f31a;
        ArrayList arrayList = new ArrayList();
        for (A.c cVar : r8) {
            cVar.f10a.c().toString();
            C0857b c0857b = cVar.f10a;
            int b2 = c0857b.b();
            A.b bVar = A.b.f3e;
            int i2 = 2;
            int i3 = ((b2 == 0 || c0857b.a() == 0) ? A.b.f2d : bVar) == bVar ? 3 : 2;
            A.b bVar2 = A.b.f4f;
            A.b bVar3 = cVar.f12c;
            if (bVar3 != bVar2) {
                i2 = bVar3 == A.b.f5g ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(c0857b.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f6570t.f5782y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public o(d dVar, l lVar) {
        super(dVar, null);
        this.f6551a = false;
        this.f6557g = new HashSet();
        this.f6560j = new HashSet();
        this.f6570t = new io.flutter.embedding.engine.renderer.h();
        this.f6571u = new io.flutter.plugin.editing.a(8, this);
        this.f6572v = new io.flutter.view.d(this, new Handler(Looper.getMainLooper()), 1);
        this.f6573w = new m(this);
        this.f6574x = new io.flutter.embedding.engine.renderer.a(2, this);
        this.f6550B = new p();
        this.f6553c = lVar;
        this.f6555e = lVar;
        b();
    }
}
