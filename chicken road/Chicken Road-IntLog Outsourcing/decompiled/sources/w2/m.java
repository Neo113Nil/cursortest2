package w2;

import D4.AbstractC0024y;
import D4.C0021v;
import D4.E;
import D4.Q;
import D4.X;
import E.C0042q;
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
import k0.C1204a;
import k4.C1224j;
import m0.C1267b;
import m0.C1268c;
import m0.C1272g;
import m0.InterfaceC1273h;

/* loaded from: classes.dex */
public final class m extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f12168A;

    /* renamed from: B, reason: collision with root package name */
    public n f12169B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12170a;

    /* renamed from: b, reason: collision with root package name */
    public final C1520h f12171b;

    /* renamed from: c, reason: collision with root package name */
    public final j f12172c;

    /* renamed from: d, reason: collision with root package name */
    public C1518f f12173d;

    /* renamed from: e, reason: collision with root package name */
    public View f12174e;

    /* renamed from: f, reason: collision with root package name */
    public View f12175f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f12176g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12177h;

    /* renamed from: i, reason: collision with root package name */
    public FlutterEngine f12178i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f12179j;

    /* renamed from: k, reason: collision with root package name */
    public B0.l f12180k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.j f12181l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.h f12182m;

    /* renamed from: n, reason: collision with root package name */
    public I2.a f12183n;

    /* renamed from: o, reason: collision with root package name */
    public x0.c f12184o;

    /* renamed from: p, reason: collision with root package name */
    public C1513a f12185p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.g f12186q;

    /* renamed from: r, reason: collision with root package name */
    public TextServicesManager f12187r;

    /* renamed from: s, reason: collision with root package name */
    public U.e f12188s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f12189t;

    /* renamed from: u, reason: collision with root package name */
    public final V0.j f12190u;

    /* renamed from: v, reason: collision with root package name */
    public final J.a f12191v;

    /* renamed from: w, reason: collision with root package name */
    public final k f12192w;

    /* renamed from: x, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f12193x;

    /* renamed from: y, reason: collision with root package name */
    public m0.i f12194y;
    public int z;

    public m(AbstractActivityC1515c abstractActivityC1515c, C1520h c1520h) {
        super(abstractActivityC1515c, null);
        this.f12170a = false;
        this.f12176g = new HashSet();
        this.f12179j = new HashSet();
        this.f12189t = new io.flutter.embedding.engine.renderer.h();
        this.f12190u = new V0.j(25, this);
        this.f12191v = new J.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f12192w = new k(this);
        this.f12193x = new io.flutter.embedding.engine.renderer.a(2, this);
        this.f12169B = new n();
        this.f12171b = c1520h;
        this.f12174e = c1520h;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f12178i);
        if (!c()) {
            return;
        }
        Iterator it = this.f12179j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f12191v);
        io.flutter.plugin.platform.m mVar = this.f12178i.f10100s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = mVar.f10248n;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            mVar.f10237c.removeView((io.flutter.plugin.platform.h) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = mVar.f10246l;
            if (i3 >= sparseArray3.size()) {
                mVar.f();
                if (mVar.f10237c == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i6 = 0;
                    while (true) {
                        sparseArray = mVar.f10247m;
                        if (i6 >= sparseArray.size()) {
                            break;
                        }
                        mVar.f10237c.removeView((View) sparseArray.valueAt(i6));
                        i6++;
                    }
                    sparseArray.clear();
                }
                mVar.f10237c = null;
                mVar.f10250p = false;
                SparseArray sparseArray4 = mVar.f10245k;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.l lVar = this.f12178i.f10101t;
                int i7 = 0;
                while (true) {
                    SparseArray sparseArray5 = lVar.f10228h;
                    if (i7 >= sparseArray5.size()) {
                        Surface surface = lVar.f10231k;
                        if (surface != null) {
                            surface.release();
                            lVar.f10231k = null;
                            lVar.f10232l = null;
                        }
                        lVar.f10223c = null;
                        SparseArray sparseArray6 = lVar.f10227g;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f12178i.f10100s.e();
                        this.f12178i.f10101t.e();
                        io.flutter.view.g gVar = this.f12186q;
                        gVar.f10376t = true;
                        gVar.f10361e.e();
                        gVar.f10374r = null;
                        AccessibilityManager accessibilityManager = gVar.f10359c;
                        accessibilityManager.removeAccessibilityStateChangeListener(gVar.f10377u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(gVar.f10378v);
                        gVar.f10362f.unregisterContentObserver(gVar.f10379w);
                        B4.i iVar = gVar.f10358b;
                        iVar.f313d = null;
                        ((FlutterJNI) iVar.f312c).setAccessibilityDelegate(null);
                        this.f12186q = null;
                        this.f12181l.f10194b.restartInput(this);
                        this.f12181l.b();
                        int size = ((HashSet) this.f12184o.f12259b).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.h hVar = this.f12182m;
                        if (hVar != null) {
                            hVar.f10181a.f215b = null;
                            SpellCheckerSession spellCheckerSession = hVar.f10183c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        B0.l lVar2 = this.f12180k;
                        if (lVar2 != null) {
                            ((B1.g) lVar2.f164c).f215b = null;
                        }
                        io.flutter.embedding.engine.renderer.i iVar2 = this.f12178i.f10083b;
                        this.f12177h = false;
                        iVar2.c(this.f12193x);
                        boolean z = this.f12170a;
                        FlutterJNI flutterJNI = iVar2.f10146a;
                        if (z) {
                            flutterJNI.removeResizingFlutterUiListener(this.f12192w);
                        }
                        iVar2.e();
                        flutterJNI.setSemanticsEnabled(false);
                        View view = this.f12175f;
                        if (view != null && this.f12174e == this.f12173d) {
                            this.f12174e = view;
                        }
                        this.f12174e.b();
                        C1518f c1518f = this.f12173d;
                        if (c1518f != null) {
                            c1518f.f12145a.close();
                            removeView(this.f12173d);
                            this.f12173d = null;
                        }
                        this.f12175f = null;
                        this.f12178i = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i7) != null) {
                        throw new ClassCastException();
                    }
                    lVar.f10223c.removeView(null);
                    i7++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                mVar.f10237c.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        G2.m mVar;
        B0.n nVar;
        B0.n nVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.j jVar = this.f12181l;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || (mVar = jVar.f10198f) == null || jVar.f10199g == null || (nVar = mVar.f990j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            G2.m mVar2 = (G2.m) jVar.f10199g.get(sparseArray.keyAt(i2));
            if (mVar2 != null && (nVar2 = mVar2.f990j) != null) {
                textValue = W1.h.f(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                G2.o oVar = new G2.o(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) nVar2.f167a;
                if (str.equals((String) nVar.f167a)) {
                    jVar.f10200h.f(oVar);
                } else {
                    hashMap.put(str, oVar);
                }
            }
        }
        int i3 = jVar.f10197e.f632c;
        x1.e eVar = jVar.f10196d;
        eVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            G2.o oVar2 = (G2.o) entry.getValue();
            hashMap2.put((String) entry.getKey(), x1.e.q(oVar2.f997a, oVar2.f998b, oVar2.f999c, -1, -1));
        }
        ((H2.o) eVar.f12265a).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        C1520h c1520h = this.f12171b;
        if (c1520h != null) {
            addView(c1520h);
        } else {
            j jVar = this.f12172c;
            if (jVar != null) {
                addView(jVar);
            } else {
                addView(this.f12173d);
            }
        }
        this.f12170a = e5.g.q(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final boolean c() {
        FlutterEngine flutterEngine = this.f12178i;
        if (flutterEngine != null) {
            if (flutterEngine.f10083b == this.f12174e.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.f12178i;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.m mVar = flutterEngine.f10100s;
        if (view == null) {
            mVar.getClass();
            return false;
        }
        HashMap hashMap = mVar.f10244j;
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
        boolean z;
        HashMap hashMap;
        String str;
        boolean z5;
        f2.t tVar;
        List enabledSpellCheckerInfos;
        boolean z6;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f12187r;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z6 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f12187r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z = true;
            G2.l lVar = this.f12178i.f10096o;
            lVar.getClass();
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
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
            z5 = Build.VERSION.SDK_INT >= 34;
            tVar = lVar.f980b;
            if (z5 || displayMetrics == null) {
                tVar.g(hashMap, null);
            }
            G2.k kVar = new G2.k(displayMetrics);
            B4.i iVar = lVar.f979a;
            ((ConcurrentLinkedQueue) iVar.f311b).add(kVar);
            G2.k kVar2 = (G2.k) iVar.f313d;
            iVar.f313d = kVar;
            B0.t tVar2 = kVar2 != null ? new B0.t(iVar, 3, kVar2) : null;
            hashMap.put("configurationId", Integer.valueOf(kVar.f977a));
            tVar.g(hashMap, tVar2);
            return;
        }
        z = false;
        G2.l lVar2 = this.f12178i.f10096o;
        lVar2.getClass();
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
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
        tVar = lVar2.f980b;
        if (z5) {
        }
        tVar.g(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f12184o.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f3 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.h hVar = this.f12189t;
        hVar.f10121a = f3;
        hVar.f10140t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.i iVar = this.f12178i.f10083b;
        iVar.getClass();
        int i2 = hVar.f10122b;
        if (i2 == 0) {
            int i3 = hVar.f10124d;
            int i6 = hVar.f10125e;
            if (i3 <= 0 && i6 <= 0) {
                return;
            }
        } else {
            int i7 = hVar.f10123c;
            if (i7 == 0) {
                int i8 = hVar.f10126f;
                int i9 = hVar.f10127g;
                if (i8 <= 0 && i9 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i7 <= 0 || hVar.f10121a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = hVar.f10145y;
        arrayList.size();
        ArrayList arrayList2 = hVar.z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            io.flutter.embedding.engine.renderer.b bVar = (io.flutter.embedding.engine.renderer.b) arrayList.get(i10);
            int i11 = i10 * 4;
            Rect rect = bVar.f10108a;
            iArr[i11] = rect.left;
            iArr[i11 + 1] = rect.top;
            iArr[i11 + 2] = rect.right;
            iArr[i11 + 3] = rect.bottom;
            iArr2[i10] = O.j.b(bVar.f10109b);
            iArr3[i10] = O.j.b(bVar.f10110c);
        }
        int size2 = arrayList.size() * 4;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            io.flutter.embedding.engine.renderer.b bVar2 = (io.flutter.embedding.engine.renderer.b) arrayList2.get(i12);
            int i13 = (i12 * 4) + size2;
            Rect rect2 = bVar2.f10108a;
            iArr[i13] = rect2.left;
            iArr[i13 + 1] = rect2.top;
            iArr[i13 + 2] = rect2.right;
            iArr[i13 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i12] = O.j.b(bVar2.f10109b);
            iArr3[arrayList.size() + i12] = O.j.b(bVar2.f10110c);
        }
        iVar.f10146a.setViewportMetrics(hVar.f10121a, hVar.f10122b, hVar.f10123c, hVar.f10128h, hVar.f10129i, hVar.f10130j, hVar.f10131k, hVar.f10132l, hVar.f10133m, hVar.f10134n, hVar.f10135o, hVar.f10136p, hVar.f10137q, hVar.f10138r, hVar.f10139s, hVar.f10140t, iArr, iArr2, iArr3, hVar.f10124d, hVar.f10125e, hVar.f10126f, hVar.f10127g, hVar.f10141u, hVar.f10142v, hVar.f10143w, hVar.f10144x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.g gVar = this.f12186q;
        if (gVar == null || !gVar.f10359c.isEnabled()) {
            return null;
        }
        return this.f12186q;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.f12178i;
    }

    public H2.f getBinaryMessenger() {
        return this.f12178i.f10084c;
    }

    public C1518f getCurrentImageSurface() {
        return this.f12173d;
    }

    public io.flutter.embedding.engine.renderer.h getViewportMetrics() {
        return this.f12189t;
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
        int i6;
        int i7;
        int i8;
        int i9;
        int ime;
        Insets insets2;
        int i10;
        int i11;
        int i12;
        int i13;
        int systemGestures;
        Insets insets3;
        int i14;
        int i15;
        int i16;
        int i17;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i18;
        int safeInsetTop;
        int i19;
        int safeInsetRight;
        int i20;
        int safeInsetBottom;
        int i21;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i22;
        int i23;
        int i24;
        int i25;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i26 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.h hVar = this.f12189t;
        if (i26 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i22 = systemGestureInsets.top;
            hVar.f10136p = i22;
            i23 = systemGestureInsets.right;
            hVar.f10137q = i23;
            i24 = systemGestureInsets.bottom;
            hVar.f10138r = i24;
            i25 = systemGestureInsets.left;
            hVar.f10139s = i25;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z5 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i26 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i6 = insets.top;
            hVar.f10128h = i6;
            i7 = insets.right;
            hVar.f10129i = i7;
            i8 = insets.bottom;
            hVar.f10130j = i8;
            i9 = insets.left;
            hVar.f10131k = i9;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i10 = insets2.top;
            hVar.f10132l = i10;
            i11 = insets2.right;
            hVar.f10133m = i11;
            i12 = insets2.bottom;
            hVar.f10134n = i12;
            i13 = insets2.left;
            hVar.f10135o = i13;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i14 = insets3.top;
            hVar.f10136p = i14;
            i15 = insets3.right;
            hVar.f10137q = i15;
            i16 = insets3.bottom;
            hVar.f10138r = i16;
            i17 = insets3.left;
            hVar.f10139s = i17;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i27 = hVar.f10128h;
                i18 = waterfallInsets.top;
                int max = Math.max(i27, i18);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                hVar.f10128h = Math.max(max, safeInsetTop);
                int i28 = hVar.f10129i;
                i19 = waterfallInsets.right;
                int max2 = Math.max(i28, i19);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                hVar.f10129i = Math.max(max2, safeInsetRight);
                int i29 = hVar.f10130j;
                i20 = waterfallInsets.bottom;
                int max3 = Math.max(i29, i20);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                hVar.f10130j = Math.max(max3, safeInsetBottom);
                int i30 = hVar.f10131k;
                i21 = waterfallInsets.left;
                int max4 = Math.max(i30, i21);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                hVar.f10131k = Math.max(max4, safeInsetLeft);
            }
            i3 = 0;
        } else {
            if (!z5) {
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
                    hVar.f10128h = !z ? windowInsets.getSystemWindowInsetTop() : 0;
                    hVar.f10129i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z5) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            hVar.f10130j = i2;
                            hVar.f10131k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            hVar.f10132l = 0;
                            hVar.f10133m = 0;
                            hVar.f10134n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            hVar.f10135o = 0;
                        }
                    }
                    i2 = 0;
                    hVar.f10130j = i2;
                    hVar.f10131k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    hVar.f10132l = 0;
                    hVar.f10133m = 0;
                    hVar.f10134n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    hVar.f10135o = 0;
                }
            }
            c2 = 1;
            hVar.f10128h = !z ? windowInsets.getSystemWindowInsetTop() : 0;
            hVar.f10129i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z5) {
            }
            i2 = 0;
            hVar.f10130j = i2;
            hVar.f10131k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            hVar.f10132l = 0;
            hVar.f10133m = 0;
            hVar.f10134n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            hVar.f10135o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i26 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.b(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = hVar.z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            n nVar = this.f12169B;
            Context context2 = getContext();
            nVar.getClass();
            Activity t5 = B0.f.t(context2);
            WindowInsets windowInsets2 = null;
            if (t5 != null && (window = t5.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i31 = hVar.f10128h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i31 = Math.max(i31, ((Rect) it.next()).bottom);
            }
            hVar.f10128h = i31;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            hVar.f10141u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            hVar.f10142v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            hVar.f10143w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            hVar.f10144x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [G4.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        U.e eVar;
        int i2 = 1;
        super.onAttachedToWindow();
        try {
            C1272g c1272g = InterfaceC1273h.f11110Q;
            Context context = getContext();
            c1272g.getClass();
            eVar = new U.e(new B0.l(C1272g.a(context)));
        } catch (NoClassDefFoundError unused) {
            eVar = null;
        }
        this.f12188s = eVar;
        Activity t5 = B0.f.t(getContext());
        U.e eVar2 = this.f12188s;
        if (eVar2 == null || t5 == null) {
            return;
        }
        this.f12194y = new m0.i(i2, this);
        Context context2 = getContext();
        Executor executor = Build.VERSION.SDK_INT >= 28 ? v.e.a(context2) : new A.c(0, new Handler(context2.getMainLooper()));
        m0.i consumer = this.f12194y;
        B0.l lVar = (B0.l) eVar2.f3053a;
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(consumer, "consumer");
        C1267b c1267b = (C1267b) lVar.f163b;
        c1267b.getClass();
        m0.j jVar = new m0.j(c1267b, t5, null);
        C1224j c1224j = C1224j.f10720a;
        G4.c cVar = new G4.c(jVar, c1224j, -2, 1);
        K4.d dVar = E.f459a;
        E4.e eVar3 = I4.o.f1316a;
        if (eVar3.o(C0021v.f545b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + eVar3).toString());
        }
        G4.c flow = cVar;
        if (!eVar3.equals(c1224j)) {
            flow = H4.t.a(cVar, eVar3, 0, 0, 6);
        }
        B0.l lVar2 = (B0.l) lVar.f164c;
        lVar2.getClass();
        kotlin.jvm.internal.i.e(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) lVar2.f163b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) lVar2.f164c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, AbstractC0024y.n(AbstractC0024y.b(new Q(executor)), null, 0, new C1204a(flow, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f12178i != null) {
            this.f12183n.b(configuration);
            d();
            B0.f.e(getContext(), this.f12178i);
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
        int i6;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.j jVar = this.f12181l;
        x0.c cVar = this.f12184o;
        C0042q c0042q = jVar.f10197e;
        int i7 = c0042q.f631b;
        if (i7 == 1) {
            jVar.f10202j = null;
            return null;
        }
        int i8 = 4;
        if (i7 == 4) {
            return null;
        }
        if (i7 == 3) {
            if (jVar.f10208p) {
                return jVar.f10202j;
            }
            jVar.f10203k.d(c0042q.f632c);
            throw null;
        }
        G2.m mVar = jVar.f10198f;
        G2.n nVar = mVar.f987g;
        int i9 = nVar.f994a;
        if (i9 != 2) {
            if (i9 == 5) {
                int i10 = nVar.f995b ? 4098 : 2;
                if (nVar.f996c) {
                    i2 = i10 | 8192;
                    i8 = i2;
                } else {
                    i8 = i10;
                }
            } else if (i9 == 6) {
                i8 = 3;
            } else if (i9 == 11) {
                i8 = 0;
            } else {
                i2 = i9 == 7 ? 131073 : (i9 == 8 || i9 == 13) ? 33 : (i9 == 9 || i9 == 12) ? 17 : i9 == 10 ? 145 : i9 == 3 ? 97 : i9 == 4 ? 113 : 1;
                if (!mVar.f981a) {
                    if (mVar.f982b) {
                        i2 |= 32768;
                    }
                    i6 = mVar.f983c ? 524416 : 524432;
                    i3 = mVar.f986f;
                    if (i3 != 1) {
                        i2 |= Base64Utils.IO_BUFFER_SIZE;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i8 = i2;
                }
                i2 |= i6;
                i3 = mVar.f986f;
                if (i3 != 1) {
                }
                i8 = i2;
            }
        }
        editorInfo.inputType = i8;
        editorInfo.imeOptions = 33554432;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && !mVar.f984d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = mVar.f988h.intValue();
        G2.m mVar2 = jVar.f10198f;
        String str = mVar2.f989i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (mVar2.f993m != null) {
            editorInfo.hintLocales = new LocaleList(jVar.f10198f.f993m);
        }
        String[] strArr = jVar.f10198f.f991k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i11 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.d dVar = new io.flutter.plugin.editing.d(this, jVar.f10197e.f632c, jVar.f10196d, cVar, jVar.f10200h, editorInfo);
        io.flutter.plugin.editing.g gVar = jVar.f10200h;
        gVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(gVar);
        io.flutter.plugin.editing.g gVar2 = jVar.f10200h;
        gVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(gVar2);
        jVar.f10202j = dVar;
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m0.i iVar;
        U.e eVar = this.f12188s;
        if (eVar != null && (iVar = this.f12194y) != null) {
            B0.l lVar = (B0.l) ((B0.l) eVar.f3053a).f164c;
            lVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) lVar.f163b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f164c;
            try {
                X x5 = (X) linkedHashMap.get(iVar);
                if (x5 != null) {
                    x5.b(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f12194y = null;
        this.f12188s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C1513a c1513a = this.f12185p;
            Context context = getContext();
            c1513a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z) {
                int b6 = C1513a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c1513a.a(motionEvent, motionEvent.getActionIndex(), b6, 0, C1513a.f12119f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c1513a.f12120a.f10146a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f12186q.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.z = View.MeasureSpec.getMode(i2);
        this.f12168A = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.j jVar = this.f12181l;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || jVar.f10199g == null) {
            return;
        }
        String str = (String) jVar.f10198f.f990j.f167a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < jVar.f10199g.size(); i3++) {
            int keyAt = jVar.f10199g.keyAt(i3);
            B0.n nVar = ((G2.m) jVar.f10199g.valueAt(i3)).f990j;
            if (nVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) nVar.f168b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) nVar.f170d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = jVar.f10205m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((G2.o) nVar.f169c).f997a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f10205m.height());
                    newChild.setAutofillValue(AutofillValue.forText(jVar.f10200h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i6, int i7) {
        super.onSizeChanged(i2, i3, i6, i7);
        io.flutter.embedding.engine.renderer.h hVar = this.f12189t;
        hVar.f10122b = i2;
        hVar.f10123c = i3;
        boolean z = this.f12170a;
        if (z && this.f12168A == 0) {
            hVar.f10126f = 0;
            hVar.f10127g = 8192;
        } else {
            hVar.f10126f = i3;
            hVar.f10127g = i3;
        }
        if (z && this.z == 0) {
            hVar.f10124d = 0;
            hVar.f10125e = 8192;
        } else {
            hVar.f10124d = i2;
            hVar.f10125e = i2;
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
        C1513a c1513a = this.f12185p;
        Matrix matrix = C1513a.f12119f;
        c1513a.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b6 = C1513a.b(motionEvent.getActionMasked());
        char c2 = 5;
        int i3 = 1;
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z5 = !z && (actionMasked == 1 || actionMasked == 6);
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
        int i6 = (z5 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i6) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            c1513a.a(motionEvent, motionEvent.getActionIndex(), b6, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else {
            ByteBuffer byteBuffer3 = allocateDirect;
            if (z5) {
                int i7 = 0;
                while (i7 < pointerCount) {
                    if (i7 == motionEvent.getActionIndex() || motionEvent.getToolType(i7) != i3) {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                    } else {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                        c1513a.a(motionEvent, i7, 5, 1, matrix, byteBuffer2, null);
                    }
                    i7++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c1513a.a(motionEvent, motionEvent.getActionIndex(), b6, 0, matrix, byteBuffer, null);
                if (i6 != 0) {
                    c1513a.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i8 = 0; i8 < pointerCount; i8++) {
                    c1513a.a(motionEvent, i8, b6, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c1513a.f12120a.f10146a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(n nVar) {
        this.f12169B = nVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f12174e;
        if (view instanceof C1520h) {
            ((C1520h) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(m0.k kVar) {
        ?? r8 = kVar.f11117a;
        ArrayList arrayList = new ArrayList();
        for (C1268c c1268c : r8) {
            c1268c.f11098a.c().toString();
            j0.b bVar = c1268c.f11098a;
            int b6 = bVar.b();
            C1267b c1267b = C1267b.f11091d;
            int i2 = 2;
            int i3 = ((b6 == 0 || bVar.a() == 0) ? C1267b.f11090c : c1267b) == c1267b ? 3 : 2;
            C1267b c1267b2 = C1267b.f11092e;
            C1267b c1267b3 = c1268c.f11100c;
            if (c1267b3 != c1267b2) {
                i2 = c1267b3 == C1267b.f11093f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(bVar.c(), i3, i2));
        }
        ArrayList arrayList2 = this.f12189t.f10145y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public m(AbstractActivityC1515c abstractActivityC1515c, j jVar) {
        super(abstractActivityC1515c, null);
        this.f12170a = false;
        this.f12176g = new HashSet();
        this.f12179j = new HashSet();
        this.f12189t = new io.flutter.embedding.engine.renderer.h();
        this.f12190u = new V0.j(25, this);
        this.f12191v = new J.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f12192w = new k(this);
        this.f12193x = new io.flutter.embedding.engine.renderer.a(2, this);
        this.f12169B = new n();
        this.f12172c = jVar;
        this.f12174e = jVar;
        b();
    }
}
