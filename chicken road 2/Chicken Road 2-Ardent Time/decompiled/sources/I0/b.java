package I0;

/* loaded from: classes.dex */
public final class b implements a1.k, f1.InterfaceC0120g, C1.d {

    /* renamed from: e, reason: collision with root package name */
    public static I0.b f655e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f656a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f657b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f658c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f659d;

    public /* synthetic */ b(int i2, boolean z2) {
        this.f656a = i2;
    }

    public static I0.b F() {
        if (f655e == null) {
            m0.j jVar = new m0.j(18, false);
            O0.a aVar = new O0.a();
            aVar.f1164a = 0;
            java.util.concurrent.ExecutorService newCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool(aVar);
            io.flutter.embedding.engine.FlutterJNI flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
            U0.c cVar = new U0.c();
            cVar.f1732a = false;
            cVar.f1733b = false;
            cVar.f1737f = flutterJNI;
            cVar.f1738g = newCachedThreadPool;
            I0.b bVar = new I0.b(3, false);
            bVar.f657b = cVar;
            bVar.f658c = jVar;
            bVar.f659d = newCachedThreadPool;
            f655e = bVar;
        }
        return f655e;
    }

    public static I0.b H(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i2) {
        return new I0.b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public android.graphics.drawable.Drawable A(int i2) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.f658c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : d.AbstractC0106a.a((android.content.Context) this.f657b, resourceId);
    }

    public android.graphics.Typeface B(int i2, int i3, P1.B b2) {
        int i4 = 9;
        int resourceId = ((android.content.res.TypedArray) this.f658c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((android.util.TypedValue) this.f659d) == null) {
            this.f659d = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = (android.util.TypedValue) this.f659d;
        java.lang.Object obj = q.f.f8323a;
        android.content.Context context = (android.content.Context) this.f657b;
        if (context.isRestricted()) {
            return null;
        }
        android.content.res.Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + java.lang.Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            b2.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        l.f fVar = r.d.f8331b;
        android.graphics.Typeface typeface = (android.graphics.Typeface) fVar.a(r.d.b(resources, resourceId, charSequence2, i5, i3));
        if (typeface != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new F0.c(i4, b2, typeface));
            return typeface;
        }
        try {
            if (charSequence2.toLowerCase().endsWith(".xml")) {
                q.InterfaceC0977b u2 = u0.AbstractC0995a.u(resources.getXml(resourceId), resources);
                if (u2 != null) {
                    return r.d.a(context, u2, resources, resourceId, charSequence2, typedValue.assetCookie, i3, b2);
                }
                android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                b2.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            android.graphics.Typeface m2 = r.d.f8330a.m(context, resources, resourceId, charSequence2, i3);
            if (m2 != null) {
                fVar.b(r.d.b(resources, resourceId, charSequence2, i6, i3), m2);
            }
            if (m2 != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new F0.c(i4, b2, m2));
            } else {
                b2.a();
            }
            return m2;
        } catch (java.io.IOException e2) {
            android.util.Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
            b2.a();
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e3) {
            android.util.Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
            b2.a();
            return null;
        }
    }

    public android.view.View C(int i2) {
        return ((androidx.recyclerview.widget.RecyclerView) ((C.j) this.f657b).f88b).getChildAt(i2);
    }

    public int D() {
        return ((androidx.recyclerview.widget.RecyclerView) ((C.j) this.f657b).f88b).getChildCount();
    }

    public boolean E(android.view.KeyEvent keyEvent) {
        if (((java.util.HashSet) this.f658c).remove(keyEvent)) {
            return false;
        }
        P0.B[] bArr = (P0.B[]) this.f657b;
        if (bArr.length <= 0) {
            I(keyEvent);
            return true;
        }
        K.a aVar = new K.a(this, keyEvent);
        for (P0.B b2 : bArr) {
            b2.e(keyEvent, new P0.A(aVar));
        }
        return true;
    }

    public void G(java.lang.String str, java.lang.Object obj, Z0.j jVar) {
        ((a1.f) this.f657b).c((java.lang.String) this.f658c, ((a1.l) this.f659d).e(new x0.e(19, str, obj)), jVar == null ? null : new a1.C0061a(1, this, jVar));
    }

    public void I(android.view.KeyEvent keyEvent) {
        io.flutter.plugin.editing.c cVar;
        P0.t tVar = (P0.t) this.f659d;
        if (tVar != null) {
            io.flutter.plugin.editing.j jVar = tVar.f1397l;
            boolean z2 = false;
            if (jVar.f7725b.isAcceptingText() && (cVar = jVar.f7733j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z2 = cVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z2 = cVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z2 = cVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z2 = cVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        android.view.inputmethod.EditorInfo editorInfo = cVar.f7688e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f7687d;
                    int selectionStart = android.text.Selection.getSelectionStart(fVar);
                    int selectionEnd = android.text.Selection.getSelectionEnd(fVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = java.lang.Math.min(selectionStart, selectionEnd);
                        int max = java.lang.Math.max(selectionStart, selectionEnd);
                        cVar.beginBatchEdit();
                        if (min != max) {
                            fVar.delete(min, max);
                        }
                        fVar.insert(min, (java.lang.CharSequence) java.lang.String.valueOf((char) unicodeChar));
                        int i2 = min + 1;
                        cVar.setSelection(i2, i2);
                        cVar.endBatchEdit();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                return;
            }
            java.util.HashSet hashSet = (java.util.HashSet) this.f658c;
            hashSet.add(keyEvent);
            tVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                android.util.Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void J(android.app.Activity activity, Z.j jVar) {
        kotlin.jvm.internal.i.e(activity, "activity");
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) this.f658c;
        reentrantLock.lock();
        java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.f659d;
        try {
            if (jVar.equals((Z.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            java.util.Iterator it = ((c0.k) ((Z0.h) this.f657b).f1903b).f2571b.iterator();
            while (it.hasNext()) {
                c0.j jVar2 = (c0.j) it.next();
                if (jVar2.f2565a.equals(activity)) {
                    jVar2.f2567c = jVar;
                    jVar2.f2566b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void K() {
        ((android.content.res.TypedArray) this.f658c).recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = r3.f1093a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r4 >= r6.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6[r4] = r2;
        r3.f1093a = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            P.AbstractC0028a instance = (P.AbstractC0028a) arrayList.get(i2);
            instance.getClass();
            M1.n nVar = (M1.n) this.f657b;
            nVar.getClass();
            kotlin.jvm.internal.i.e(instance, "instance");
            int i3 = nVar.f1093a;
            int i4 = 0;
            while (true) {
                java.lang.Object[] objArr = (java.lang.Object[]) nVar.f1094b;
                if (i4 >= i3) {
                    break;
                } else {
                    if (objArr[i4] == instance) {
                        throw new java.lang.IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
            }
        }
        arrayList.clear();
    }

    public void M(a1.k kVar) {
        ((a1.f) this.f657b).h((java.lang.String) this.f658c, kVar == null ? null : new x0.e(this, kVar, 20, false));
    }

    @Override // f1.InterfaceC0120g
    public void a(java.lang.String str, boolean z2, f1.C0121h c0121h) {
        t(c0121h).edit().putBoolean(str, z2).apply();
    }

    @Override // f1.InterfaceC0120g
    public java.lang.Double b(java.lang.String str, f1.C0121h c0121h) {
        android.content.SharedPreferences t = t(c0121h);
        if (!t.contains(str)) {
            return null;
        }
        java.lang.Object c2 = f1.K.c(t.getString(str, ""), (m0.j) this.f659d);
        kotlin.jvm.internal.i.c(c2, "null cannot be cast to non-null type kotlin.Double");
        return (java.lang.Double) c2;
    }

    @Override // f1.InterfaceC0120g
    public java.lang.Long c(java.lang.String str, f1.C0121h c0121h) {
        long j2;
        android.content.SharedPreferences t = t(c0121h);
        if (!t.contains(str)) {
            return null;
        }
        try {
            j2 = t.getLong(str, 0L);
        } catch (java.lang.ClassCastException unused) {
            j2 = t.getInt(str, 0);
        }
        return java.lang.Long.valueOf(j2);
    }

    @Override // f1.InterfaceC0120g
    public java.util.ArrayList d(java.lang.String str, f1.C0121h c0121h) {
        java.util.List list;
        android.content.SharedPreferences t = t(c0121h);
        java.util.ArrayList arrayList = null;
        if (t.contains(str)) {
            java.lang.String string = t.getString(str, "");
            kotlin.jvm.internal.i.b(string);
            if (y1.o.K(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) && !y1.o.K(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) && (list = (java.util.List) f1.K.c(t.getString(str, ""), (m0.j) this.f659d)) != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (obj instanceof java.lang.String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // f1.InterfaceC0120g
    public void e(java.lang.String str, java.lang.String str2, f1.C0121h c0121h) {
        t(c0121h).edit().putString(str, str2).apply();
    }

    @Override // f1.InterfaceC0120g
    public void f(java.lang.String str, java.util.List list, f1.C0121h c0121h) {
        t(c0121h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((m0.j) this.f659d).h(list))).apply();
    }

    @Override // f1.InterfaceC0120g
    public void g(java.lang.String str, double d2, f1.C0121h c0121h) {
        t(c0121h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2).apply();
    }

    @Override // f1.InterfaceC0120g
    public f1.O h(java.lang.String str, f1.C0121h c0121h) {
        android.content.SharedPreferences t = t(c0121h);
        if (!t.contains(str)) {
            return null;
        }
        java.lang.String string = t.getString(str, "");
        kotlin.jvm.internal.i.b(string);
        return y1.o.K(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new f1.O(string, f1.M.JSON_ENCODED) : y1.o.K(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new f1.O(null, f1.M.PLATFORM_ENCODED) : new f1.O(null, f1.M.UNEXPECTED_STRING);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d3, code lost:
    
        if (y1.o.K(r1, "generic", false) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018f A[LOOP:1: B:21:0x0189->B:23:0x018f, LOOP_END] */
    @Override // a1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(x0.e call, Z0.j jVar) {
        boolean z2;
        java.util.Iterator it;
        kotlin.jvm.internal.i.e(call, "call");
        if (!((java.lang.String) call.f8409b).equals("getDeviceInfo")) {
            jVar.b();
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("board", android.os.Build.BOARD);
        hashMap.put("bootloader", android.os.Build.BOOTLOADER);
        java.lang.String BRAND = android.os.Build.BRAND;
        hashMap.put("brand", BRAND);
        java.lang.String DEVICE = android.os.Build.DEVICE;
        hashMap.put("device", DEVICE);
        hashMap.put("display", android.os.Build.DISPLAY);
        java.lang.String FINGERPRINT = android.os.Build.FINGERPRINT;
        hashMap.put("fingerprint", FINGERPRINT);
        java.lang.String HARDWARE = android.os.Build.HARDWARE;
        hashMap.put("hardware", HARDWARE);
        hashMap.put("host", android.os.Build.HOST);
        hashMap.put("id", android.os.Build.ID);
        java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
        hashMap.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.MANUFACTURER, MANUFACTURER);
        java.lang.String MODEL = android.os.Build.MODEL;
        hashMap.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.MODEL, MODEL);
        java.lang.String PRODUCT = android.os.Build.PRODUCT;
        hashMap.put("product", PRODUCT);
        java.lang.String string = android.provider.Settings.Global.getString((android.content.ContentResolver) this.f659d, "device_name");
        if (string == null) {
            string = "";
        }
        hashMap.put("name", string);
        java.lang.String[] strArr = android.os.Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", i1.AbstractC0191j.H(java.util.Arrays.copyOf(strArr, strArr.length)));
        java.lang.String[] strArr2 = android.os.Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", i1.AbstractC0191j.H(java.util.Arrays.copyOf(strArr2, strArr2.length)));
        java.lang.String[] strArr3 = android.os.Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", i1.AbstractC0191j.H(java.util.Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", android.os.Build.TAGS);
        hashMap.put("type", android.os.Build.TYPE);
        kotlin.jvm.internal.i.d(BRAND, "BRAND");
        if (y1.o.K(BRAND, "generic", false)) {
            kotlin.jvm.internal.i.d(DEVICE, "DEVICE");
        }
        kotlin.jvm.internal.i.d(FINGERPRINT, "FINGERPRINT");
        if (!y1.o.K(FINGERPRINT, "generic", false) && !y1.o.K(FINGERPRINT, io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE, false)) {
            kotlin.jvm.internal.i.d(HARDWARE, "HARDWARE");
            if (!y1.g.M(HARDWARE, "goldfish") && !y1.g.M(HARDWARE, "ranchu")) {
                kotlin.jvm.internal.i.d(MODEL, "MODEL");
                if (!y1.g.M(MODEL, "google_sdk") && !y1.g.M(MODEL, "Emulator") && !y1.g.M(MODEL, "Android SDK built for x86")) {
                    kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
                    if (!y1.g.M(MANUFACTURER, "Genymotion")) {
                        kotlin.jvm.internal.i.d(PRODUCT, "PRODUCT");
                        if (!y1.g.M(PRODUCT, "sdk") && !y1.g.M(PRODUCT, "vbox86p") && !y1.g.M(PRODUCT, "emulator") && !y1.g.M(PRODUCT, "simulator")) {
                            z2 = false;
                            hashMap.put("isPhysicalDevice", java.lang.Boolean.valueOf(!z2));
                            android.content.pm.FeatureInfo[] systemAvailableFeatures = ((android.content.pm.PackageManager) this.f657b).getSystemAvailableFeatures();
                            kotlin.jvm.internal.i.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (android.content.pm.FeatureInfo featureInfo : systemAvailableFeatures) {
                                if (featureInfo.name != null) {
                                    arrayList.add(featureInfo);
                                }
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((android.content.pm.FeatureInfo) it.next()).name);
                            }
                            hashMap.put("systemFeatures", arrayList2);
                            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
                            hashMap.put("freeDiskSize", java.lang.Long.valueOf(statFs.getFreeBytes()));
                            hashMap.put("totalDiskSize", java.lang.Long.valueOf(statFs.getTotalBytes()));
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            int i2 = android.os.Build.VERSION.SDK_INT;
                            hashMap2.put("baseOS", android.os.Build.VERSION.BASE_OS);
                            hashMap2.put("previewSdkInt", java.lang.Integer.valueOf(android.os.Build.VERSION.PREVIEW_SDK_INT));
                            hashMap2.put("securityPatch", android.os.Build.VERSION.SECURITY_PATCH);
                            hashMap2.put("codename", android.os.Build.VERSION.CODENAME);
                            hashMap2.put("incremental", android.os.Build.VERSION.INCREMENTAL);
                            hashMap2.put("release", android.os.Build.VERSION.RELEASE);
                            hashMap2.put("sdkInt", java.lang.Integer.valueOf(i2));
                            hashMap.put("version", hashMap2);
                            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                            ((android.app.ActivityManager) this.f658c).getMemoryInfo(memoryInfo);
                            hashMap.put("isLowRamDevice", java.lang.Boolean.valueOf(memoryInfo.lowMemory));
                            hashMap.put("physicalRamSize", java.lang.Long.valueOf(memoryInfo.totalMem / 1048576));
                            hashMap.put("availableRamSize", java.lang.Long.valueOf(memoryInfo.availMem / 1048576));
                            jVar.c(hashMap);
                        }
                    }
                }
            }
        }
        z2 = true;
        hashMap.put("isPhysicalDevice", java.lang.Boolean.valueOf(!z2));
        android.content.pm.FeatureInfo[] systemAvailableFeatures2 = ((android.content.pm.PackageManager) this.f657b).getSystemAvailableFeatures();
        kotlin.jvm.internal.i.d(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        while (r8 < r2) {
        }
        java.util.ArrayList arrayList22 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList3));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        hashMap.put("systemFeatures", arrayList22);
        android.os.StatFs statFs2 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", java.lang.Long.valueOf(statFs2.getFreeBytes()));
        hashMap.put("totalDiskSize", java.lang.Long.valueOf(statFs2.getTotalBytes()));
        java.util.HashMap hashMap22 = new java.util.HashMap();
        int i22 = android.os.Build.VERSION.SDK_INT;
        hashMap22.put("baseOS", android.os.Build.VERSION.BASE_OS);
        hashMap22.put("previewSdkInt", java.lang.Integer.valueOf(android.os.Build.VERSION.PREVIEW_SDK_INT));
        hashMap22.put("securityPatch", android.os.Build.VERSION.SECURITY_PATCH);
        hashMap22.put("codename", android.os.Build.VERSION.CODENAME);
        hashMap22.put("incremental", android.os.Build.VERSION.INCREMENTAL);
        hashMap22.put("release", android.os.Build.VERSION.RELEASE);
        hashMap22.put("sdkInt", java.lang.Integer.valueOf(i22));
        hashMap.put("version", hashMap22);
        android.app.ActivityManager.MemoryInfo memoryInfo2 = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) this.f658c).getMemoryInfo(memoryInfo2);
        hashMap.put("isLowRamDevice", java.lang.Boolean.valueOf(memoryInfo2.lowMemory));
        hashMap.put("physicalRamSize", java.lang.Long.valueOf(memoryInfo2.totalMem / 1048576));
        hashMap.put("availableRamSize", java.lang.Long.valueOf(memoryInfo2.availMem / 1048576));
        jVar.c(hashMap);
    }

    @Override // f1.InterfaceC0120g
    public void j(java.lang.String str, java.lang.String str2, f1.C0121h c0121h) {
        t(c0121h).edit().putString(str, str2).apply();
    }

    @Override // f1.InterfaceC0120g
    public void k(java.util.List list, f1.C0121h c0121h) {
        android.content.SharedPreferences t = t(c0121h);
        android.content.SharedPreferences.Editor edit = t.edit();
        kotlin.jvm.internal.i.d(edit, "edit(...)");
        java.util.Map<java.lang.String, ?> all = t.getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : all.keySet()) {
            if (f1.K.b(str, all.get(str), list != null ? i1.AbstractC0190i.b0(list) : null)) {
                arrayList.add(str);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.i.d(next, "next(...)");
            edit.remove((java.lang.String) next);
        }
        edit.apply();
    }

    @Override // f1.InterfaceC0120g
    public java.util.List l(java.util.List list, f1.C0121h c0121h) {
        java.util.Map<java.lang.String, ?> all = t(c0121h).getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            kotlin.jvm.internal.i.d(key, "<get-key>(...)");
            if (f1.K.b(key, entry.getValue(), list != null ? i1.AbstractC0190i.b0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return i1.AbstractC0190i.X(linkedHashMap.keySet());
    }

    @Override // f1.InterfaceC0120g
    public java.util.Map m(java.util.List list, f1.C0121h c0121h) {
        java.lang.Object value;
        java.util.Map<java.lang.String, ?> all = t(c0121h).getAll();
        kotlin.jvm.internal.i.d(all, "getAll(...)");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            if (f1.K.b(entry.getKey(), entry.getValue(), list != null ? i1.AbstractC0190i.b0(list) : null) && (value = entry.getValue()) != null) {
                java.lang.String key = entry.getKey();
                java.lang.Object c2 = f1.K.c(value, (m0.j) this.f659d);
                kotlin.jvm.internal.i.c(c2, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c2);
            }
        }
        return hashMap;
    }

    @Override // C1.d
    public java.lang.Object o(C1.e eVar, k1.d dVar) {
        java.lang.Object o2 = ((C1.d) this.f657b).o(new C1.l(eVar, (I.d) this.f658c, (f1.J) this.f659d), dVar);
        return o2 == l1.EnumC0927a.f8017a ? o2 : h1.C0177i.f3302a;
    }

    @Override // f1.InterfaceC0120g
    public java.lang.String p(java.lang.String str, f1.C0121h c0121h) {
        android.content.SharedPreferences t = t(c0121h);
        if (t.contains(str)) {
            return t.getString(str, "");
        }
        return null;
    }

    @Override // f1.InterfaceC0120g
    public java.lang.Boolean q(java.lang.String str, f1.C0121h c0121h) {
        android.content.SharedPreferences t = t(c0121h);
        if (t.contains(str)) {
            return java.lang.Boolean.valueOf(t.getBoolean(str, true));
        }
        return null;
    }

    @Override // f1.InterfaceC0120g
    public void r(java.lang.String str, long j2, f1.C0121h c0121h) {
        t(c0121h).edit().putLong(str, j2).apply();
    }

    public void s(android.app.Activity activity) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) this.f658c;
        reentrantLock.lock();
        try {
            ((java.util.WeakHashMap) this.f659d).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public android.content.SharedPreferences t(f1.C0121h c0121h) {
        java.lang.String str = c0121h.f2839a;
        android.content.Context context = (android.content.Context) this.f658c;
        if (str != null) {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            kotlin.jvm.internal.i.b(sharedPreferences);
            return sharedPreferences;
        }
        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        kotlin.jvm.internal.i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public java.lang.String toString() {
        switch (this.f656a) {
            case 2:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            case 5:
                return ((O1.a) this.f658c).toString() + ", hidden list:" + ((java.util.ArrayList) this.f659d).size();
            default:
                return super.toString();
        }
    }

    public void u(boolean z2) {
        for (K.e eVar : ((I1.l) this.f658c).c()) {
            if (eVar != null && z2) {
                eVar.f950c.u(true);
            }
        }
    }

    public void v(boolean z2) {
        for (K.e eVar : ((I1.l) this.f658c).c()) {
            if (eVar != null && z2) {
                eVar.f950c.v(true);
            }
        }
    }

    public void w(int i2, io.flutter.view.e eVar) {
        ((io.flutter.embedding.engine.FlutterJNI) this.f658c).dispatchSemanticsAction(i2, eVar);
    }

    public void x(int i2, io.flutter.view.e eVar, java.io.Serializable serializable) {
        ((io.flutter.embedding.engine.FlutterJNI) this.f658c).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public int y(int i2, int i3) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f659d;
        int size = arrayList.size();
        while (i3 < size) {
            ((P.AbstractC0028a) arrayList.get(i3)).getClass();
            i3++;
        }
        return i2;
    }

    public android.content.res.ColorStateList z(int i2) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.f658c;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            java.lang.Object obj = d.AbstractC0106a.f2737a;
            android.content.res.ColorStateList colorStateList = ((android.content.Context) this.f657b).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public /* synthetic */ b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i2) {
        this.f656a = i2;
        this.f657b = obj;
        this.f658c = obj2;
        this.f659d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(a1.f fVar, java.lang.String str) {
        this(fVar, str, a1.o.f1949b, 9);
        this.f656a = 9;
    }

    public b(C.j jVar) {
        this.f656a = 5;
        this.f657b = jVar;
        this.f658c = new O1.a();
        this.f659d = new java.util.ArrayList();
    }

    public b(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.f656a = 13;
        this.f657b = context;
        this.f658c = typedArray;
    }

    public b(m0.j jVar) {
        this.f656a = 4;
        this.f657b = new M1.n(30);
        this.f658c = new java.util.ArrayList();
        this.f659d = new java.util.ArrayList();
        new m0.j(13, this);
    }

    public b(R0.b bVar, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.f656a = 7;
        C.j jVar = new C.j(23, this);
        F.C0014n c0014n = new F.C0014n(bVar, "flutter/accessibility", a1.n.INSTANCE, null);
        this.f657b = c0014n;
        c0014n.h(jVar);
        this.f658c = flutterJNI;
    }

    public b(int i2) {
        this.f656a = i2;
        switch (i2) {
            case 8:
                this.f657b = new java.util.concurrent.ConcurrentLinkedQueue();
                break;
            default:
                this.f657b = new java.util.ArrayList();
                this.f658c = new I1.l(1);
                new java.util.ArrayList();
                new m0.j(this, 4);
                this.f659d = new java.util.concurrent.atomic.AtomicInteger();
                java.util.Collections.synchronizedMap(new java.util.HashMap());
                java.util.Collections.synchronizedMap(new java.util.HashMap());
                java.util.Collections.synchronizedMap(new java.util.HashMap());
                new java.util.ArrayList();
                new m0.j(this, 3);
                new java.util.concurrent.CopyOnWriteArrayList();
                final int i3 = 0;
                new x.InterfaceC1010a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f962b;

                    {
                        this.f962b = this;
                    }

                    @Override // x.InterfaceC1010a
                    public final void accept(java.lang.Object obj) {
                        switch (i3) {
                            case 0:
                                I0.b bVar = this.f962b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f962b;
                                bVar2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                        }
                    }
                };
                final int i4 = 1;
                new x.InterfaceC1010a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f962b;

                    {
                        this.f962b = this;
                    }

                    @Override // x.InterfaceC1010a
                    public final void accept(java.lang.Object obj) {
                        switch (i4) {
                            case 0:
                                I0.b bVar = this.f962b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f962b;
                                bVar2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                        }
                    }
                };
                final int i5 = 2;
                new x.InterfaceC1010a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f962b;

                    {
                        this.f962b = this;
                    }

                    @Override // x.InterfaceC1010a
                    public final void accept(java.lang.Object obj) {
                        switch (i5) {
                            case 0:
                                I0.b bVar = this.f962b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f962b;
                                bVar2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                        }
                    }
                };
                final int i6 = 3;
                new x.InterfaceC1010a(this) { // from class: K.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ I0.b f962b;

                    {
                        this.f962b = this;
                    }

                    @Override // x.InterfaceC1010a
                    public final void accept(java.lang.Object obj) {
                        switch (i6) {
                            case 0:
                                I0.b bVar = this.f962b;
                                bVar.getClass();
                                bVar.u(false);
                                return;
                            case 1:
                                I0.b bVar2 = this.f962b;
                                bVar2.getClass();
                                if (((java.lang.Integer) obj).intValue() == 80) {
                                    bVar2.v(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                            default:
                                if (obj != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                this.f962b.getClass();
                                throw null;
                        }
                    }
                };
                new java.util.ArrayDeque();
                new C.b(2, this);
                break;
        }
    }

    public b(P0.t tVar) {
        this.f656a = 6;
        this.f658c = new java.util.HashSet();
        this.f659d = tVar;
        this.f657b = new P0.B[]{new P0.z(tVar.getBinaryMessenger()), new x0.e(new Z0.b(tVar.getBinaryMessenger()))};
        new C.j(tVar.getBinaryMessenger()).f88b = this;
    }

    public b(a1.f messenger, android.content.Context context, m0.j jVar) {
        this.f656a = 11;
        kotlin.jvm.internal.i.e(messenger, "messenger");
        kotlin.jvm.internal.i.e(context, "context");
        this.f657b = messenger;
        this.f658c = context;
        this.f659d = jVar;
        try {
            f1.InterfaceC0120g.f2838P.getClass();
            f1.C0119f.b(messenger, this, "shared_preferences");
        } catch (java.lang.Exception e2) {
            android.util.Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public b(Z0.h hVar) {
        this.f656a = 10;
        this.f657b = hVar;
        this.f658c = new java.util.concurrent.locks.ReentrantLock();
        this.f659d = new java.util.WeakHashMap();
    }
}
