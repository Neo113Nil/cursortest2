package P0;

/* loaded from: classes.dex */
public final class t extends android.widget.FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f1384A;

    /* renamed from: B, reason: collision with root package name */
    public P0.v f1385B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1386a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.l f1387b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.n f1388c;

    /* renamed from: d, reason: collision with root package name */
    public P0.C0052j f1389d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f1390e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f1391f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f1392g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1393h;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngine f1394i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f1395j;

    /* renamed from: k, reason: collision with root package name */
    public x0.e f1396k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.j f1397l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.g f1398m;

    /* renamed from: n, reason: collision with root package name */
    public b1.C0094a f1399n;

    /* renamed from: o, reason: collision with root package name */
    public I0.b f1400o;

    /* renamed from: p, reason: collision with root package name */
    public P0.C0044b f1401p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.view.h f1402q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.textservice.TextServicesManager f1403r;

    /* renamed from: s, reason: collision with root package name */
    public C.j f1404s;
    public final io.flutter.embedding.engine.renderer.g t;

    /* renamed from: u, reason: collision with root package name */
    public final C.j f1405u;

    /* renamed from: v, reason: collision with root package name */
    public final D.a f1406v;

    /* renamed from: w, reason: collision with root package name */
    public final P0.r f1407w;

    /* renamed from: x, reason: collision with root package name */
    public final P0.C0048f f1408x;

    /* renamed from: y, reason: collision with root package name */
    public P0.q f1409y;

    /* renamed from: z, reason: collision with root package name */
    public int f1410z;

    public t(P0.AbstractActivityC0047e abstractActivityC0047e, P0.l lVar) {
        super(abstractActivityC0047e, null);
        this.f1386a = false;
        this.f1392g = new java.util.HashSet();
        this.f1395j = new java.util.HashSet();
        this.t = new io.flutter.embedding.engine.renderer.g();
        this.f1405u = new C.j(17, this);
        this.f1406v = new D.a(this, new android.os.Handler(android.os.Looper.getMainLooper()), 1);
        this.f1407w = new P0.r(this);
        this.f1408x = new P0.C0048f(1, this);
        this.f1385B = new P0.v();
        this.f1387b = lVar;
        this.f1390e = lVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        android.util.SparseArray sparseArray;
        java.util.Objects.toString(this.f1394i);
        if (!c()) {
            return;
        }
        java.util.Iterator it = this.f1395j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f1406v);
        io.flutter.plugin.platform.k kVar = this.f1394i.f7633s;
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray2 = kVar.f7779n;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            kVar.f7768c.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            android.util.SparseArray sparseArray3 = kVar.f7777l;
            if (i3 >= sparseArray3.size()) {
                kVar.e();
                if (kVar.f7768c == null) {
                    android.util.Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = kVar.f7778m;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        kVar.f7768c.removeView((android.view.View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                kVar.f7768c = null;
                kVar.f7781p = false;
                android.util.SparseArray sparseArray4 = kVar.f7776k;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new java.lang.ClassCastException();
                }
                io.flutter.plugin.platform.j jVar = this.f1394i.t;
                int i5 = 0;
                while (true) {
                    android.util.SparseArray sparseArray5 = jVar.f7759h;
                    if (i5 >= sparseArray5.size()) {
                        android.view.Surface surface = jVar.f7762k;
                        if (surface != null) {
                            surface.release();
                            jVar.f7762k = null;
                            jVar.f7763l = null;
                        }
                        jVar.f7754c = null;
                        android.util.SparseArray sparseArray6 = jVar.f7758g;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new java.lang.ClassCastException();
                        }
                        this.f1394i.f7633s.a();
                        this.f1394i.t.a();
                        io.flutter.view.h hVar = this.f1402q;
                        hVar.t = true;
                        hVar.f7888e.a();
                        hVar.f7901r = null;
                        android.view.accessibility.AccessibilityManager accessibilityManager = hVar.f7886c;
                        accessibilityManager.removeAccessibilityStateChangeListener(hVar.f7903u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f7904v);
                        hVar.f7889f.unregisterContentObserver(hVar.f7905w);
                        I0.b bVar = hVar.f7885b;
                        bVar.f659d = null;
                        ((io.flutter.embedding.engine.FlutterJNI) bVar.f658c).setAccessibilityDelegate(null);
                        this.f1402q = null;
                        this.f1397l.f7725b.restartInput(this);
                        this.f1397l.b();
                        int size = ((java.util.HashSet) this.f1400o.f658c).size();
                        if (size > 0) {
                            android.util.Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.g gVar = this.f1398m;
                        if (gVar != null) {
                            gVar.f7711a.f1903b = null;
                            android.view.textservice.SpellCheckerSession spellCheckerSession = gVar.f7713c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        x0.e eVar = this.f1396k;
                        if (eVar != null) {
                            ((C.j) eVar.f8410c).f88b = null;
                        }
                        io.flutter.embedding.engine.renderer.h hVar2 = this.f1394i.f7616b;
                        this.f1393h = false;
                        hVar2.c(this.f1408x);
                        boolean z2 = this.f1386a;
                        io.flutter.embedding.engine.FlutterJNI flutterJNI = hVar2.f7676a;
                        if (z2) {
                            flutterJNI.removeResizingFlutterUiListener(this.f1407w);
                        }
                        hVar2.e();
                        flutterJNI.setSemanticsEnabled(false);
                        android.view.View view = this.f1391f;
                        if (view != null && this.f1390e == this.f1389d) {
                            this.f1390e = view;
                        }
                        this.f1390e.c();
                        P0.C0052j c0052j = this.f1389d;
                        if (c0052j != null) {
                            c0052j.f1359a.close();
                            removeView(this.f1389d);
                            this.f1389d = null;
                        }
                        this.f1391f = null;
                        this.f1394i = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    jVar.f7754c.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new java.lang.ClassCastException();
                }
                kVar.f7768c.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(android.util.SparseArray sparseArray) {
        Z0.n nVar;
        F.C0014n c0014n;
        F.C0014n c0014n2;
        java.lang.CharSequence textValue;
        io.flutter.plugin.editing.j jVar = this.f1397l;
        if (jVar == null || android.os.Build.VERSION.SDK_INT < 26 || (nVar = jVar.f7729f) == null || jVar.f7730g == null || (c0014n = nVar.f1930j) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            Z0.n nVar2 = (Z0.n) jVar.f7730g.get(sparseArray.keyAt(i2));
            if (nVar2 != null && (c0014n2 = nVar2.f1930j) != null) {
                textValue = P0.AbstractC0043a.f(sparseArray.valueAt(i2)).getTextValue();
                java.lang.String charSequence = textValue.toString();
                Z0.p pVar = new Z0.p(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                java.lang.String str = (java.lang.String) c0014n2.f498a;
                if (str.equals((java.lang.String) c0014n.f498a)) {
                    jVar.f7731h.f(pVar);
                } else {
                    hashMap.put(str, pVar);
                }
            }
        }
        int i3 = jVar.f7728e.f1286c;
        x0.e eVar = jVar.f7727d;
        eVar.getClass();
        hashMap.size();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            Z0.p pVar2 = (Z0.p) entry.getValue();
            hashMap2.put((java.lang.String) entry.getKey(), x0.e.p(pVar2.f1937a, pVar2.f1938b, pVar2.f1939c, -1, -1));
        }
        ((I0.b) eVar.f8409b).G("TextInputClient.updateEditingStateWithTag", java.util.Arrays.asList(java.lang.Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        P0.l lVar = this.f1387b;
        if (lVar != null) {
            addView(lVar);
        } else {
            P0.n nVar = this.f1388c;
            if (nVar != null) {
                addView(nVar);
            } else {
                addView(this.f1389d);
            }
        }
        this.f1386a = Q1.d.q(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f1394i;
        if (flutterEngine != null) {
            if (flutterEngine.f7616b == this.f1390e.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(android.view.View view) {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f1394i;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.k kVar = flutterEngine.f7633s;
        if (view == null) {
            kVar.getClass();
            return false;
        }
        java.util.HashMap hashMap = kVar.f7775j;
        if (!hashMap.containsKey(view.getContext())) {
            return false;
        }
        android.view.View view2 = (android.view.View) hashMap.get(view.getContext());
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
        java.util.HashMap hashMap;
        java.lang.String str;
        boolean z3;
        F.C0014n c0014n;
        java.util.List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        android.view.textservice.TextServicesManager textServicesManager = this.f1403r;
        if (textServicesManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                java.util.Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((android.view.textservice.SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z4 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f1403r.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            Z0.m mVar = this.f1394i.f7629o;
            mVar.getClass();
            hashMap = new java.util.HashMap();
            hashMap.put("textScaleFactor", java.lang.Float.valueOf(getResources().getConfiguration().fontScale));
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", java.lang.Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", java.lang.Boolean.valueOf(android.provider.Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
            hashMap.put("alwaysUse24HourFormat", java.lang.Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(getContext())));
            if (c2 != 1) {
                str = "light";
            } else {
                if (c2 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            java.util.Objects.toString(hashMap.get("textScaleFactor"));
            java.util.Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            java.util.Objects.toString(hashMap.get("platformBrightness"));
            z3 = android.os.Build.VERSION.SDK_INT >= 34;
            c0014n = mVar.f1920b;
            if (z3 || displayMetrics == null) {
                c0014n.g(hashMap, null);
            }
            Z0.l lVar = new Z0.l(displayMetrics);
            I0.b bVar = mVar.f1919a;
            ((java.util.concurrent.ConcurrentLinkedQueue) bVar.f657b).add(lVar);
            Z0.l lVar2 = (Z0.l) bVar.f659d;
            bVar.f659d = lVar;
            x0.e eVar = lVar2 != null ? new x0.e(bVar, lVar2, 15, false) : null;
            hashMap.put("configurationId", java.lang.Integer.valueOf(lVar.f1917a));
            c0014n.g(hashMap, eVar);
            return;
        }
        z2 = false;
        Z0.m mVar2 = this.f1394i.f7629o;
        mVar2.getClass();
        hashMap = new java.util.HashMap();
        hashMap.put("textScaleFactor", java.lang.Float.valueOf(getResources().getConfiguration().fontScale));
        android.util.DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", java.lang.Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", java.lang.Boolean.valueOf(android.provider.Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", java.lang.Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        java.util.Objects.toString(hashMap.get("textScaleFactor"));
        java.util.Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        java.util.Objects.toString(hashMap.get("platformBrightness"));
        if (android.os.Build.VERSION.SDK_INT >= 34) {
        }
        c0014n = mVar2.f1920b;
        if (z3) {
        }
        c0014n.g(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f1400o.E(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            android.util.Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.t;
        gVar.f7651a = f2;
        gVar.t = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f1394i.f7616b;
        hVar.getClass();
        int i2 = gVar.f7652b;
        if (i2 == 0) {
            int i3 = gVar.f7654d;
            int i4 = gVar.f7655e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f7653c;
            if (i5 == 0) {
                int i6 = gVar.f7656f;
                int i7 = gVar.f7657g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f7651a <= 0.0f) {
                return;
            }
        }
        java.util.ArrayList arrayList = gVar.f7674y;
        arrayList.size();
        java.util.ArrayList arrayList2 = gVar.f7675z;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i8);
            int i9 = i8 * 4;
            android.graphics.Rect rect = aVar.f7638a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = H.j.b(aVar.f7639b);
            iArr3[i8] = H.j.b(aVar.f7640c);
        }
        int size2 = arrayList.size() * 4;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i10);
            int i11 = (i10 * 4) + size2;
            android.graphics.Rect rect2 = aVar2.f7638a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i10] = H.j.b(aVar2.f7639b);
            iArr3[arrayList.size() + i10] = H.j.b(aVar2.f7640c);
        }
        hVar.f7676a.setViewportMetrics(gVar.f7651a, gVar.f7652b, gVar.f7653c, gVar.f7658h, gVar.f7659i, gVar.f7660j, gVar.f7661k, gVar.f7662l, gVar.f7663m, gVar.f7664n, gVar.f7665o, gVar.f7666p, gVar.f7667q, gVar.f7668r, gVar.f7669s, gVar.t, iArr, iArr2, iArr3, gVar.f7654d, gVar.f7655e, gVar.f7656f, gVar.f7657g, gVar.f7670u, gVar.f7671v, gVar.f7672w, gVar.f7673x);
    }

    @Override // android.view.View
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f1402q;
        if (hVar == null || !hVar.f7886c.isEnabled()) {
            return null;
        }
        return this.f1402q;
    }

    public io.flutter.embedding.engine.FlutterEngine getAttachedFlutterEngine() {
        return this.f1394i;
    }

    public a1.f getBinaryMessenger() {
        return this.f1394i.f7617c;
    }

    public P0.C0052j getCurrentImageSurface() {
        return this.f1389d;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.t;
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
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        char c2;
        int i2;
        int i3;
        android.view.RoundedCorner roundedCorner;
        android.view.RoundedCorner roundedCorner2;
        android.view.RoundedCorner roundedCorner3;
        android.view.RoundedCorner roundedCorner4;
        int captionBar;
        java.util.List boundingRects;
        android.view.Window window;
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects2;
        int systemBars;
        android.graphics.Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        int ime;
        android.graphics.Insets insets2;
        int i8;
        int i9;
        int i10;
        int i11;
        int systemGestures;
        android.graphics.Insets insets3;
        int i12;
        int i13;
        int i14;
        int i15;
        android.view.DisplayCutout displayCutout2;
        android.graphics.Insets waterfallInsets;
        int i16;
        int safeInsetTop;
        int i17;
        int safeInsetRight;
        int i18;
        int safeInsetBottom;
        int i19;
        int safeInsetLeft;
        android.graphics.Insets systemGestureInsets;
        int i20;
        int i21;
        int i22;
        int i23;
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i24 = android.os.Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.g gVar = this.t;
        if (i24 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i20 = systemGestureInsets.top;
            gVar.f7666p = i20;
            i21 = systemGestureInsets.right;
            gVar.f7667q = i21;
            i22 = systemGestureInsets.bottom;
            gVar.f7668r = i22;
            i23 = systemGestureInsets.left;
            gVar.f7669s = i23;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i24 >= 30) {
            systemBars = android.view.WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i4 = insets.top;
            gVar.f7658h = i4;
            i5 = insets.right;
            gVar.f7659i = i5;
            i6 = insets.bottom;
            gVar.f7660j = i6;
            i7 = insets.left;
            gVar.f7661k = i7;
            ime = android.view.WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i8 = insets2.top;
            gVar.f7662l = i8;
            i9 = insets2.right;
            gVar.f7663m = i9;
            i10 = insets2.bottom;
            gVar.f7664n = i10;
            i11 = insets2.left;
            gVar.f7665o = i11;
            systemGestures = android.view.WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i12 = insets3.top;
            gVar.f7666p = i12;
            i13 = insets3.right;
            gVar.f7667q = i13;
            i14 = insets3.bottom;
            gVar.f7668r = i14;
            i15 = insets3.left;
            gVar.f7669s = i15;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i25 = gVar.f7658h;
                i16 = waterfallInsets.top;
                int max = java.lang.Math.max(i25, i16);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f7658h = java.lang.Math.max(max, safeInsetTop);
                int i26 = gVar.f7659i;
                i17 = waterfallInsets.right;
                int max2 = java.lang.Math.max(i26, i17);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f7659i = java.lang.Math.max(max2, safeInsetRight);
                int i27 = gVar.f7660j;
                i18 = waterfallInsets.bottom;
                int max3 = java.lang.Math.max(i27, i18);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f7660j = java.lang.Math.max(max3, safeInsetBottom);
                int i28 = gVar.f7661k;
                i19 = waterfallInsets.left;
                int max4 = java.lang.Math.max(i28, i19);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f7661k = java.lang.Math.max(max4, safeInsetLeft);
            }
            i3 = 0;
        } else {
            if (!z3) {
                android.content.Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((android.hardware.display.DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c2 = 3;
                    } else if (rotation == 3) {
                        c2 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c2 = 4;
                    }
                    gVar.f7658h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f7659i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f7660j = i2;
                            gVar.f7661k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f7662l = 0;
                            gVar.f7663m = 0;
                            gVar.f7664n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            i3 = 0;
                            gVar.f7665o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f7660j = i2;
                    gVar.f7661k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f7662l = 0;
                    gVar.f7663m = 0;
                    gVar.f7664n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    i3 = 0;
                    gVar.f7665o = 0;
                }
            }
            c2 = 1;
            gVar.f7658h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f7659i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f7660j = i2;
            gVar.f7661k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f7662l = 0;
            gVar.f7663m = 0;
            gVar.f7664n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            i3 = 0;
            gVar.f7665o = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i24 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (android.graphics.Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        java.util.ArrayList arrayList2 = gVar.f7675z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            P0.v vVar = this.f1385B;
            android.content.Context context2 = getContext();
            vVar.getClass();
            android.app.Activity q2 = a.AbstractC0059a.q(context2);
            android.view.WindowInsets windowInsets2 = null;
            if (q2 != null && (window = q2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = java.util.Collections.emptyList();
            } else {
                captionBar = android.view.WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i29 = gVar.f7658h;
            java.util.Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i29 = java.lang.Math.max(i29, ((android.graphics.Rect) it.next()).bottom);
            }
            gVar.f7658h = i29;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(2);
            roundedCorner4 = windowInsets.getRoundedCorner(3);
            gVar.f7670u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            gVar.f7671v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            gVar.f7672w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            gVar.f7673x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [C1.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C.j jVar;
        k1.j jVar2 = k1.j.f7951a;
        int i2 = 0;
        super.onAttachedToWindow();
        try {
            Z.g gVar = Z.h.f1856O;
            android.content.Context context = getContext();
            gVar.getClass();
            jVar = new C.j(18, new x0.e(Z.g.a(context)));
        } catch (java.lang.NoClassDefFoundError unused) {
            jVar = null;
        }
        this.f1404s = jVar;
        android.app.Activity q2 = a.AbstractC0059a.q(getContext());
        C.j jVar3 = this.f1404s;
        if (jVar3 == null || q2 == null) {
            return;
        }
        this.f1409y = new P0.q(i2, this);
        android.content.Context context2 = getContext();
        java.util.concurrent.Executor executor = android.os.Build.VERSION.SDK_INT >= 28 ? p.AbstractC0945b.a(context2) : new D0.l(new android.os.Handler(context2.getMainLooper()), 2);
        P0.q consumer = this.f1409y;
        x0.e eVar = (x0.e) jVar3.f88b;
        kotlin.jvm.internal.i.e(executor, "executor");
        kotlin.jvm.internal.i.e(consumer, "consumer");
        Z.b bVar = (Z.b) eVar.f8409b;
        bVar.getClass();
        C1.c cVar = new C1.c(new Z.i(bVar, q2, null), jVar2, -2, 1);
        G1.d dVar = z1.B.f8521a;
        A1.c cVar2 = E1.o.f296a;
        if (cVar2.m(z1.C1066t.f8592b) != null) {
            throw new java.lang.IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        C1.c flow = cVar;
        if (!cVar2.equals(jVar2)) {
            flow = D1.l.a(cVar, cVar2, 0, 0, 6);
        }
        x0.e eVar2 = (x0.e) eVar.f8410c;
        eVar2.getClass();
        kotlin.jvm.internal.i.e(flow, "flow");
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) eVar2.f8409b;
        reentrantLock.lock();
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) eVar2.f8410c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                k1.i j2 = new z1.J(executor);
                if (j2.m(z1.C1066t.f8592b) == null) {
                    j2 = j2.g(new z1.T(null));
                }
                X.a aVar = new X.a(flow, consumer, null);
                k1.i a2 = z1.AbstractC1068v.a(j2, jVar2, true);
                G1.d dVar2 = z1.B.f8521a;
                if (a2 != dVar2 && a2.m(k1.e.f7950a) == null) {
                    a2 = a2.g(dVar2);
                }
                z1.AbstractC1048a e0Var = new z1.e0(a2, true);
                e0Var.V(1, e0Var, aVar);
                linkedHashMap.put(consumer, e0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1394i != null) {
            this.f1399n.b(configuration);
            d();
            a.AbstractC0059a.d(getContext(), this.f1394i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.j jVar = this.f1397l;
        I0.b bVar = this.f1400o;
        P.C0039l c0039l = jVar.f7728e;
        int i5 = c0039l.f1285b;
        if (i5 == 1) {
            jVar.f7733j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (jVar.f7739p) {
                return jVar.f7733j;
            }
            jVar.f7734k.g(c0039l.f1286c);
            throw null;
        }
        Z0.n nVar = jVar.f7729f;
        Z0.o oVar = nVar.f1927g;
        int i7 = oVar.f1934a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = oVar.f1935b ? 4098 : 2;
                if (oVar.f1936c) {
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
                if (!nVar.f1921a) {
                    if (nVar.f1922b) {
                        i2 |= 32768;
                    }
                    i4 = nVar.f1923c ? 524416 : 524432;
                    i3 = nVar.f1926f;
                    if (i3 != 1) {
                        i2 |= io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i6 = i2;
                }
                i2 |= i4;
                i3 = nVar.f1926f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = android.os.Build.VERSION.SDK_INT;
        if (i9 >= 26 && !nVar.f1924d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = nVar.f1928h.intValue();
        Z0.n nVar2 = jVar.f7729f;
        java.lang.String str = nVar2.f1929i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (nVar2.f1933m != null) {
            editorInfo.hintLocales = new android.os.LocaleList(jVar.f7729f.f1933m);
        }
        java.lang.String[] strArr = jVar.f7729f.f1931k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new android.os.Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, jVar.f7728e.f1286c, jVar.f7727d, bVar, jVar.f7731h, editorInfo);
        io.flutter.plugin.editing.f fVar = jVar.f7731h;
        fVar.getClass();
        editorInfo.initialSelStart = android.text.Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = jVar.f7731h;
        fVar2.getClass();
        editorInfo.initialSelEnd = android.text.Selection.getSelectionEnd(fVar2);
        jVar.f7733j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        P0.q qVar;
        C.j jVar = this.f1404s;
        if (jVar != null && (qVar = this.f1409y) != null) {
            x0.e eVar = (x0.e) ((x0.e) jVar.f88b).f8410c;
            eVar.getClass();
            java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) eVar.f8409b;
            reentrantLock.lock();
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) eVar.f8410c;
            try {
                z1.P p2 = (z1.P) linkedHashMap.get(qVar);
                if (p2 != null) {
                    p2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f1409y = null;
        this.f1404s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (c()) {
            P0.C0044b c0044b = this.f1401p;
            android.content.Context context = getContext();
            c0044b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = P0.C0044b.b(motionEvent.getActionMasked());
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                c0044b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, P0.C0044b.f1330f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new java.lang.AssertionError("Packet position is not on field boundary.");
                }
                c0044b.f1331a.f7676a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f1402q.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.f1410z = android.view.View.MeasureSpec.getMode(i2);
        this.f1384A = android.view.View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i2) {
        android.graphics.Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.j jVar = this.f1397l;
        if (jVar == null || android.os.Build.VERSION.SDK_INT < 26 || jVar.f7730g == null) {
            return;
        }
        java.lang.String str = (java.lang.String) jVar.f7729f.f1930j.f498a;
        android.view.autofill.AutofillId autofillId = viewStructure.getAutofillId();
        for (int i3 = 0; i3 < jVar.f7730g.size(); i3++) {
            int keyAt = jVar.f7730g.keyAt(i3);
            F.C0014n c0014n = ((Z0.n) jVar.f7730g.valueAt(i3)).f1930j;
            if (c0014n != null) {
                viewStructure.addChildCount(1);
                android.view.ViewStructure newChild = viewStructure.newChild(i3);
                newChild.setAutofillId(autofillId, keyAt);
                java.lang.String[] strArr = (java.lang.String[]) c0014n.f499b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                java.lang.String str2 = (java.lang.String) c0014n.f501d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = jVar.f7736m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(((Z0.p) c0014n.f500c).f1937a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f7736m.height());
                    newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(jVar.f7731h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.t;
        gVar.f7652b = i2;
        gVar.f7653c = i3;
        boolean z2 = this.f1386a;
        if (z2 && this.f1384A == 0) {
            gVar.f7656f = 0;
            gVar.f7657g = 8192;
        } else {
            gVar.f7656f = i3;
            gVar.f7657g = i3;
        }
        if (z2 && this.f1410z == 0) {
            gVar.f7654d = 0;
            gVar.f7655e = 8192;
        } else {
            gVar.f7654d = i2;
            gVar.f7655e = i2;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.nio.ByteBuffer byteBuffer;
        java.nio.ByteBuffer byteBuffer2;
        int i2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        P0.C0044b c0044b = this.f1401p;
        android.graphics.Matrix matrix = P0.C0044b.f1330f;
        c0044b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = P0.C0044b.b(motionEvent.getActionMasked());
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
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            c0044b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else {
            java.nio.ByteBuffer byteBuffer3 = allocateDirect;
            if (z3) {
                int i5 = 0;
                while (i5 < pointerCount) {
                    if (i5 == motionEvent.getActionIndex() || motionEvent.getToolType(i5) != i3) {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                    } else {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                        c0044b.a(motionEvent, i5, 5, 1, matrix, byteBuffer2, null);
                    }
                    i5++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c0044b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i4 != 0) {
                    c0044b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    c0044b.a(motionEvent, i6, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new java.lang.AssertionError("Packet position is not on field boundary");
        }
        c0044b.f1331a.f7676a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(P0.v vVar) {
        this.f1385B = vVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        android.view.View view = this.f1390e;
        if (view instanceof P0.l) {
            ((P0.l) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(Z.j jVar) {
        ?? r8 = jVar.f1861a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Z.c cVar : r8) {
            cVar.f1844a.c().toString();
            W.b bVar = cVar.f1844a;
            int b2 = bVar.b();
            Z.b bVar2 = Z.b.f1837d;
            int i2 = 2;
            int i3 = ((b2 == 0 || bVar.a() == 0) ? Z.b.f1836c : bVar2) == bVar2 ? 3 : 2;
            Z.b bVar3 = Z.b.f1838e;
            Z.b bVar4 = cVar.f1846c;
            if (bVar4 != bVar3) {
                i2 = bVar4 == Z.b.f1839f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(bVar.c(), i3, i2));
        }
        java.util.ArrayList arrayList2 = this.t.f7674y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public t(P0.AbstractActivityC0047e abstractActivityC0047e, P0.n nVar) {
        super(abstractActivityC0047e, null);
        this.f1386a = false;
        this.f1392g = new java.util.HashSet();
        this.f1395j = new java.util.HashSet();
        this.t = new io.flutter.embedding.engine.renderer.g();
        this.f1405u = new C.j(17, this);
        this.f1406v = new D.a(this, new android.os.Handler(android.os.Looper.getMainLooper()), 1);
        this.f1407w = new P0.r(this);
        this.f1408x = new P0.C0048f(1, this);
        this.f1385B = new P0.v();
        this.f1388c = nVar;
        this.f1390e = nVar;
        b();
    }
}
