package x0;

/* loaded from: classes.dex */
public final class e implements C1.d, P0.B, Z.h, a1.k, a1.InterfaceC0063c, a1.InterfaceC0064d, io.flutter.plugin.platform.h {

    /* renamed from: d, reason: collision with root package name */
    public static x0.e f8405d;

    /* renamed from: e, reason: collision with root package name */
    public static x0.e f8406e;

    /* renamed from: f, reason: collision with root package name */
    public static P0.C f8407f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8408a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f8409b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f8410c;

    public /* synthetic */ e(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f8408a = i2;
        this.f8409b = obj;
        this.f8410c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0088, code lost:
    
        if (r2 != 8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int h(x0.e eVar, org.json.JSONArray jSONArray) {
        java.lang.String str;
        eVar.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            java.lang.String string = jSONArray.getString(i4);
            for (int i5 : H.j.c(4)) {
                if (i5 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i5 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i5 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i5 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    int b2 = H.j.b(i5);
                    if (b2 == 0) {
                        i2 |= 1;
                    } else if (b2 == 1) {
                        i2 |= 4;
                    } else if (b2 == 2) {
                        i2 |= 2;
                    } else if (b2 == 3) {
                        i2 |= 8;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            throw new java.lang.NoSuchFieldException(B1.a.i("No such DeviceOrientation: ", string));
        }
        if (i2 == 0) {
            return -1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i3 == 2) {
                    return 0;
                }
                if (i3 != 4) {
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static java.util.ArrayList j(x0.e eVar, org.json.JSONArray jSONArray) {
        eVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            java.lang.String string = jSONArray.getString(i2);
            for (Z0.f fVar : Z0.f.values()) {
                if (fVar.f1885a.equals(string)) {
                    int ordinal = fVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(Z0.f.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(Z0.f.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new java.lang.NoSuchFieldException(B1.a.i("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int k(x0.e eVar, java.lang.String str) {
        java.lang.String str2;
        eVar.getClass();
        for (int i2 : H.j.c(4)) {
            if (i2 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i2 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i2 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int b2 = H.j.b(i2);
                if (b2 == 0) {
                    return 1;
                }
                if (b2 != 1) {
                    return b2 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new java.lang.NoSuchFieldException(B1.a.i("No such SystemUiMode: ", str));
    }

    public static Z0.e l(x0.e eVar, org.json.JSONObject jSONObject) {
        eVar.getClass();
        return new Z0.e(!jSONObject.isNull("statusBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? B1.a.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? java.lang.Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? B1.a.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : java.lang.Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static java.util.HashMap p(java.lang.String str, int i2, int i3, int i4, int i5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", java.lang.Integer.valueOf(i2));
        hashMap.put("selectionExtent", java.lang.Integer.valueOf(i3));
        hashMap.put("composingBase", java.lang.Integer.valueOf(i4));
        hashMap.put("composingExtent", java.lang.Integer.valueOf(i5));
        return hashMap;
    }

    public static final android.content.SharedPreferences t(android.content.Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void u(android.content.Context context) {
        if (t(context).edit().putLong("app_set_id_last_used_time", java.lang.System.currentTimeMillis()).commit()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(context.getPackageName());
        android.util.Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new java.lang.String("Failed to store app set ID last used time for App "));
        throw new x0.d("Failed to store the app set ID last used time.");
    }

    @Override // io.flutter.plugin.platform.h
    public void a() {
        ((io.flutter.plugin.platform.k) this.f8409b).a();
        ((io.flutter.plugin.platform.j) this.f8410c).a();
    }

    @Override // a1.InterfaceC0064d
    public void b(java.nio.ByteBuffer byteBuffer, R0.g gVar) {
        switch (this.f8408a) {
            case 18:
                F.C0014n c0014n = (F.C0014n) this.f8410c;
                try {
                    ((a1.InterfaceC0062b) this.f8409b).g(((a1.j) c0014n.f500c).decodeMessage(byteBuffer), new x0.e(this, gVar, 17, false));
                    break;
                } catch (java.lang.RuntimeException e2) {
                    android.util.Log.e("BasicMessageChannel#" + ((java.lang.String) c0014n.f499b), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                I0.b bVar = (I0.b) this.f8410c;
                try {
                    ((a1.k) this.f8409b).i(((a1.l) bVar.f659d).b(byteBuffer), new Z0.j(1, this, gVar));
                    break;
                } catch (java.lang.RuntimeException e3) {
                    android.util.Log.e("MethodChannel#" + ((java.lang.String) bVar.f658c), "Failed to handle method call", e3);
                    gVar.a(((a1.l) bVar.f659d).d(e3.getMessage(), android.util.Log.getStackTraceString(e3)));
                }
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void c(io.flutter.view.h hVar) {
        ((io.flutter.plugin.platform.k) this.f8409b).f7773h.f7740a = hVar;
        ((io.flutter.plugin.platform.j) this.f8410c).f7757f.f7740a = hVar;
    }

    @Override // io.flutter.plugin.platform.h
    public boolean d(int i2) {
        ((io.flutter.plugin.platform.j) this.f8410c).g(i2);
        return ((io.flutter.plugin.platform.k) this.f8409b).d(i2);
    }

    @Override // P0.B
    public void e(android.view.KeyEvent keyEvent, P0.A a2) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            a2.a(false);
            return;
        }
        java.lang.Character a3 = ((G1.i) this.f8410c).a(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        E0.a aVar = new E0.a(3, a2);
        Z0.b bVar = (Z0.b) this.f8409b;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", z2 ? "keyup" : "keydown");
        hashMap.put("keymap", io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo.APP_PLATFORM);
        hashMap.put("flags", java.lang.Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", java.lang.Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", java.lang.Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", java.lang.Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a3.toString());
        hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, java.lang.Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", java.lang.Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", java.lang.Integer.valueOf(keyEvent.getRepeatCount()));
        bVar.f1867a.g(hashMap, new E0.a(4, aVar));
    }

    @Override // a1.InterfaceC0063c
    public void f(java.lang.Object obj) {
        switch (this.f8408a) {
            case 15:
                I0.b bVar = (I0.b) this.f8410c;
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) bVar.f657b;
                Z0.l lVar = (Z0.l) this.f8409b;
                concurrentLinkedQueue.remove(lVar);
                if (!((java.util.concurrent.ConcurrentLinkedQueue) bVar.f657b).isEmpty()) {
                    android.util.Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + lVar.f1917a);
                    break;
                }
                break;
            default:
                ((R0.g) this.f8409b).a(((a1.j) ((F.C0014n) ((x0.e) this.f8410c).f8410c).f500c).encodeMessage(obj));
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void g(int i2) {
        ((io.flutter.plugin.platform.j) this.f8410c).g(i2);
        ((io.flutter.plugin.platform.k) this.f8409b).g(i2);
    }

    @Override // a1.k
    public void i(x0.e eVar, Z0.j jVar) {
        C.j jVar2 = (C.j) this.f8410c;
        if (((I0.b) jVar2.f88b) == null) {
            jVar.c((java.util.Map) this.f8409b);
            return;
        }
        java.lang.String str = (java.lang.String) eVar.f8409b;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            jVar.b();
            return;
        }
        try {
            this.f8409b = java.util.Collections.unmodifiableMap(((P0.z) ((P0.B[]) ((I0.b) jVar2.f88b).f657b)[0]).f1425b);
        } catch (java.lang.IllegalStateException e2) {
            jVar.a("error", e2.getMessage(), null);
        }
        jVar.c((java.util.Map) this.f8409b);
    }

    public void m() {
        I1.h hVar;
        android.widget.ImageView imageView = (android.widget.ImageView) this.f8409b;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            android.graphics.Rect rect = h.AbstractC0165x.f3277a;
        }
        if (drawable == null || (hVar = (I1.h) this.f8410c) == null) {
            return;
        }
        h.C0157o.c(drawable, hVar, imageView.getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // C1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object o(C1.e eVar, k1.d dVar) {
        C1.j jVar;
        int i2;
        java.lang.Throwable th;
        D1.n nVar;
        x0.e eVar2;
        C1.e eVar3;
        C1.m mVar;
        int i3;
        f1.C0127n c0127n;
        switch (this.f8408a) {
            case 1:
                if (dVar instanceof C1.j) {
                    jVar = (C1.j) dVar;
                    int i4 = jVar.f138e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jVar.f138e = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj = jVar.f137d;
                        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                        i2 = jVar.f138e;
                        if (i2 != 0) {
                            a.AbstractC0059a.A(obj);
                            k1.i iVar = jVar.f8076b;
                            kotlin.jvm.internal.i.b(iVar);
                            D1.n nVar2 = new D1.n(eVar, iVar);
                            try {
                                F.C0016p c0016p = (F.C0016p) this.f8409b;
                                jVar.f140g = this;
                                jVar.f141h = eVar;
                                jVar.f142i = nVar2;
                                jVar.f138e = 1;
                                if (c0016p.invoke(nVar2, jVar) == enumC0927a) {
                                    return enumC0927a;
                                }
                                eVar2 = this;
                                eVar3 = eVar;
                                nVar = nVar2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.h();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.AbstractC0059a.A(obj);
                                return h1.C0177i.f3302a;
                            }
                            nVar = jVar.f142i;
                            eVar3 = jVar.f141h;
                            eVar2 = jVar.f140g;
                            try {
                                a.AbstractC0059a.A(obj);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                nVar.h();
                                throw th;
                            }
                        }
                        nVar.h();
                        C1.r rVar = (C1.r) eVar2.f8410c;
                        jVar.f140g = null;
                        jVar.f141h = null;
                        jVar.f142i = null;
                        jVar.f138e = 2;
                        rVar.o(eVar3, jVar);
                        return enumC0927a;
                    }
                }
                jVar = new C1.j(this, dVar);
                java.lang.Object obj2 = jVar.f137d;
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                i2 = jVar.f138e;
                if (i2 != 0) {
                }
                nVar.h();
                C1.r rVar2 = (C1.r) eVar2.f8410c;
                jVar.f140g = null;
                jVar.f141h = null;
                jVar.f142i = null;
                jVar.f138e = 2;
                rVar2.o(eVar3, jVar);
                return enumC0927a2;
            case 2:
                java.lang.Object o2 = ((x0.e) this.f8409b).o(new C1.l(new kotlin.jvm.internal.n(), eVar, (F.r) this.f8410c), dVar);
                return o2 == l1.EnumC0927a.f8017a ? o2 : h1.C0177i.f3302a;
            default:
                if (dVar instanceof C1.m) {
                    mVar = (C1.m) dVar;
                    int i5 = mVar.f153e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f153e = i5 - Integer.MIN_VALUE;
                        java.lang.Object obj3 = mVar.f152d;
                        l1.EnumC0927a enumC0927a3 = l1.EnumC0927a.f8017a;
                        i3 = mVar.f153e;
                        if (i3 != 0) {
                            a.AbstractC0059a.A(obj3);
                            x0.e eVar4 = (x0.e) this.f8409b;
                            f1.C0127n c0127n2 = new f1.C0127n((F.C0017q) this.f8410c, eVar);
                            try {
                                mVar.f155g = c0127n2;
                                mVar.f153e = 1;
                                if (eVar4.o(c0127n2, mVar) == enumC0927a3) {
                                    return enumC0927a3;
                                }
                            } catch (D1.a e2) {
                                e = e2;
                                c0127n = c0127n2;
                                if (e.f219a != c0127n) {
                                    throw e;
                                }
                                return h1.C0177i.f3302a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0127n = mVar.f155g;
                            try {
                                a.AbstractC0059a.A(obj3);
                            } catch (D1.a e3) {
                                e = e3;
                                if (e.f219a != c0127n) {
                                }
                                return h1.C0177i.f3302a;
                            }
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                mVar = new C1.m(this, dVar);
                java.lang.Object obj32 = mVar.f152d;
                l1.EnumC0927a enumC0927a32 = l1.EnumC0927a.f8017a;
                i3 = mVar.f153e;
                if (i3 != 0) {
                }
                return h1.C0177i.f3302a;
        }
    }

    public android.view.View q(int i2, int i3, int i4, int i5) {
        int s2;
        int i6;
        int t;
        android.view.View o2;
        int left;
        int i7;
        int right;
        int i8;
        P.u uVar = (P.u) this.f8409b;
        switch (uVar.f1300a) {
            case 0:
                s2 = uVar.f1301b.s();
                break;
            default:
                s2 = uVar.f1301b.u();
                break;
        }
        switch (uVar.f1300a) {
            case 0:
                P.v vVar = uVar.f1301b;
                i6 = vVar.f1307f;
                t = vVar.t();
                break;
            default:
                P.v vVar2 = uVar.f1301b;
                i6 = vVar2.f1308g;
                t = vVar2.r();
                break;
        }
        int i9 = i6 - t;
        int i10 = i3 > i2 ? 1 : -1;
        android.view.View view = null;
        while (i2 != i3) {
            switch (uVar.f1300a) {
                case 0:
                    o2 = uVar.f1301b.o(i2);
                    break;
                default:
                    o2 = uVar.f1301b.o(i2);
                    break;
            }
            switch (uVar.f1300a) {
                case 0:
                    P.w wVar = (P.w) o2.getLayoutParams();
                    uVar.f1301b.getClass();
                    left = o2.getLeft() - ((P.w) o2.getLayoutParams()).f1309a.left;
                    i7 = ((android.view.ViewGroup.MarginLayoutParams) wVar).leftMargin;
                    break;
                default:
                    P.w wVar2 = (P.w) o2.getLayoutParams();
                    uVar.f1301b.getClass();
                    left = o2.getTop() - ((P.w) o2.getLayoutParams()).f1309a.top;
                    i7 = ((android.view.ViewGroup.MarginLayoutParams) wVar2).topMargin;
                    break;
            }
            int i11 = left - i7;
            switch (uVar.f1300a) {
                case 0:
                    P.w wVar3 = (P.w) o2.getLayoutParams();
                    uVar.f1301b.getClass();
                    right = o2.getRight() + ((P.w) o2.getLayoutParams()).f1309a.right;
                    i8 = ((android.view.ViewGroup.MarginLayoutParams) wVar3).rightMargin;
                    break;
                default:
                    P.w wVar4 = (P.w) o2.getLayoutParams();
                    uVar.f1301b.getClass();
                    right = o2.getBottom() + ((P.w) o2.getLayoutParams()).f1309a.bottom;
                    i8 = ((android.view.ViewGroup.MarginLayoutParams) wVar4).bottomMargin;
                    break;
            }
            int i12 = right + i8;
            P.N n2 = (P.N) this.f8410c;
            n2.f1227b = s2;
            n2.f1228c = i9;
            n2.f1229d = i11;
            n2.f1230e = i12;
            if (i4 != 0) {
                n2.f1226a = i4;
                if (n2.a()) {
                    return o2;
                }
            }
            if (i5 != 0) {
                n2.f1226a = i5;
                if (n2.a()) {
                    view = o2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    public androidx.lifecycle.w r(java.lang.String key, java.lang.Class cls) {
        kotlin.jvm.internal.i.e(key, "key");
        throw null;
    }

    public void s(int i2) {
        int resourceId;
        android.widget.ImageView imageView = (android.widget.ImageView) this.f8409b;
        I0.b H2 = I0.b.H(imageView.getContext(), null, c.AbstractC0095a.f2536e, i2);
        try {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = d.AbstractC0106a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                android.graphics.Rect rect = h.AbstractC0165x.f3277a;
            }
            if (typedArray.hasValue(2)) {
                C.f.c(imageView, H2.z(2));
            }
            if (typedArray.hasValue(3)) {
                C.f.d(imageView, h.AbstractC0165x.c(typedArray.getInt(3, -1), null));
            }
            H2.K();
        } catch (java.lang.Throwable th) {
            H2.K();
            throw th;
        }
    }

    public /* synthetic */ e(int i2, boolean z2) {
        this.f8408a = i2;
    }

    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, int i2, boolean z2) {
        this.f8408a = i2;
        this.f8410c = obj;
        this.f8409b = obj2;
    }

    public e(android.content.Context context) {
        this.f8408a = 0;
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.f8410c = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.f8409b = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C.b(14, this), 0L, 86400L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public e(java.lang.String str, Q1.l lVar, f1.L l2) {
        this.f8408a = 28;
        this.f8410c = str;
        this.f8409b = lVar;
    }

    public e(P0.t tVar, C.j jVar) {
        this.f8408a = 22;
        this.f8409b = tVar;
        this.f8410c = jVar;
        jVar.f88b = new Z0.h(16, this);
    }

    public e(Z0.b bVar) {
        this.f8408a = 7;
        this.f8410c = new G1.i();
        this.f8409b = bVar;
    }

    public e(C.j jVar) {
        this.f8408a = 11;
        this.f8410c = jVar;
        this.f8409b = new java.util.HashMap();
    }

    public e(P0.t tVar, android.view.inputmethod.InputMethodManager inputMethodManager, Z0.h hVar) {
        this.f8408a = 26;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            tVar.setAutoHandwritingEnabled(false);
        }
        this.f8410c = tVar;
        this.f8409b = inputMethodManager;
        hVar.f1903b = this;
    }

    public e(Z.b bVar) {
        this.f8408a = 10;
        x0.e eVar = new x0.e(9);
        this.f8409b = bVar;
        this.f8410c = eVar;
    }

    public e(Q1.l store, androidx.lifecycle.x xVar, L.b defaultCreationExtras) {
        this.f8408a = 21;
        kotlin.jvm.internal.i.e(store, "store");
        kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
        this.f8409b = xVar;
        this.f8410c = defaultCreationExtras;
    }

    public e(android.widget.ImageView imageView) {
        this.f8408a = 24;
        this.f8409b = imageView;
    }

    public e(int i2) {
        this.f8408a = i2;
        switch (i2) {
            case 9:
                this.f8409b = new java.util.concurrent.locks.ReentrantLock();
                this.f8410c = new java.util.LinkedHashMap();
                break;
            default:
                this.f8409b = new android.util.LongSparseArray();
                this.f8410c = new java.util.PriorityQueue();
                break;
        }
    }

    public e(R0.b bVar, int i2) {
        this.f8408a = i2;
        switch (i2) {
            case 13:
                z.C1042i c1042i = new z.C1042i(this);
                I0.b bVar2 = new I0.b(bVar, "flutter/platform", a1.i.f1948a, 9);
                this.f8409b = bVar2;
                bVar2.M(c1042i);
                break;
            case 16:
                Z0.h hVar = new Z0.h(12, this);
                I0.b bVar3 = new I0.b(bVar, "flutter/textinput", a1.i.f1948a, 9);
                this.f8409b = bVar3;
                bVar3.M(hVar);
                break;
            default:
                C.j jVar = new C.j(26, this);
                I0.b bVar4 = new I0.b(bVar, "flutter/localization", a1.i.f1948a, 9);
                this.f8409b = bVar4;
                bVar4.M(jVar);
                break;
        }
    }

    public e(R0.b bVar, android.content.pm.PackageManager packageManager) {
        this.f8408a = 14;
        Z0.h hVar = new Z0.h(4, this);
        this.f8409b = packageManager;
        new I0.b(bVar, "flutter/processtext", a1.o.f1949b, 9).M(hVar);
    }

    public e(P.u uVar) {
        this.f8408a = 6;
        this.f8409b = uVar;
        P.N n2 = new P.N();
        n2.f1226a = 0;
        this.f8410c = n2;
    }
}
