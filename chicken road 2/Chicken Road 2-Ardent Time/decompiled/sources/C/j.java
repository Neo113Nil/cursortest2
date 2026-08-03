package C;

/* loaded from: classes.dex */
public class j implements C1.d, com.yandex.varioqub.config.OnFetchCompleteListener, F.InterfaceC0009i, N.d, a1.InterfaceC0064d, a1.f, a1.InterfaceC0062b, a1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f88b;

    public /* synthetic */ j(int i2, java.lang.Object obj) {
        this.f87a = i2;
        this.f88b = obj;
    }

    public static int m(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    @Override // N.d
    public void a(int i2, java.io.Serializable serializable) {
        java.lang.String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            android.util.Log.e("ProfileInstaller", str, (java.lang.Throwable) serializable);
        } else {
            android.util.Log.d("ProfileInstaller", str);
        }
        ((androidx.profileinstaller.ProfileInstallReceiver) this.f88b).setResultCode(i2);
    }

    @Override // a1.InterfaceC0064d
    public void b(java.nio.ByteBuffer byteBuffer, R0.g gVar) {
        a1.p.f1952b.getClass();
        a1.p.a(byteBuffer);
        ((R0.b) this.f88b).getClass();
    }

    @Override // a1.f
    public void c(java.lang.String str, java.nio.ByteBuffer byteBuffer, a1.e eVar) {
        ((R0.i) this.f88b).c(str, byteBuffer, eVar);
    }

    @Override // N.d
    public void d() {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // F.InterfaceC0009i
    public java.lang.Object e(s1.p pVar, m1.AbstractC0935f abstractC0935f) {
        return ((F.InterfaceC0009i) this.f88b).e(new I.c(pVar, null), abstractC0935f);
    }

    @Override // a1.f
    public m0.j f(a1.i iVar) {
        return ((R0.i) this.f88b).f(iVar);
    }

    @Override // a1.InterfaceC0062b
    public void g(java.lang.Object obj, x0.e eVar) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        I0.b bVar = (I0.b) this.f88b;
        if (((io.flutter.view.b) bVar.f659d) == null) {
            eVar.f(null);
            return;
        }
        hashMap = (java.util.HashMap) obj;
        java.lang.String str = (java.lang.String) hashMap.get("type");
        hashMap2 = (java.util.HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                java.lang.String str2 = (java.lang.String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) bVar.f659d;
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.h hVar = (io.flutter.view.h) bVar2.f7796a;
                        android.view.accessibility.AccessibilityEvent d2 = hVar.d(0, 32);
                        d2.getText().add(str2);
                        hVar.h(d2);
                        break;
                    } else {
                        bVar2.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                java.lang.String str3 = (java.lang.String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) bVar.f659d;
                    if (android.os.Build.VERSION.SDK_INT >= 36) {
                        bVar3.getClass();
                        android.util.Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar3.f7796a).f7884a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                java.lang.Integer num = (java.lang.Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) bVar.f659d;
                    ((io.flutter.view.h) bVar4.f7796a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                java.lang.Integer num2 = (java.lang.Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) bVar.f659d;
                    ((io.flutter.view.h) bVar5.f7796a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                java.lang.Integer num3 = (java.lang.Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar6 = (io.flutter.view.b) bVar.f659d;
                    ((io.flutter.view.h) bVar6.f7796a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.f(null);
    }

    @Override // F.InterfaceC0009i
    public C1.d getData() {
        return ((F.InterfaceC0009i) this.f88b).getData();
    }

    @Override // a1.f
    public void h(java.lang.String str, a1.InterfaceC0064d interfaceC0064d) {
        ((R0.i) this.f88b).j(str, interfaceC0064d, null);
    }

    @Override // a1.k
    public void i(x0.e eVar, Z0.j jVar) {
        switch (this.f87a) {
            case 24:
                ((m0.j) this.f88b).getClass();
                break;
            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
            default:
                C.j jVar2 = (C.j) this.f88b;
                if (((Z0.h) jVar2.f88b) != null) {
                    java.lang.String str = (java.lang.String) eVar.f8409b;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((Z0.h) jVar2.f88b).f((java.lang.String) ((java.util.HashMap) eVar.f8410c).get("kind"));
                                jVar.c(java.lang.Boolean.TRUE);
                            } catch (java.lang.Exception e2) {
                                jVar.a("error", "Error when setting cursors: " + e2.getMessage(), null);
                            }
                        }
                    } catch (java.lang.Exception e3) {
                        jVar.a("error", "Unhandled error: " + e3.getMessage(), null);
                        return;
                    }
                }
                break;
            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                x0.e eVar2 = (x0.e) this.f88b;
                if (((Z0.h) eVar2.f8410c) != null) {
                    java.lang.String str2 = (java.lang.String) eVar.f8409b;
                    str2.getClass();
                    if (!str2.equals("Localization.getStringResource")) {
                        jVar.b();
                        break;
                    } else {
                        org.json.JSONObject jSONObject = (org.json.JSONObject) eVar.f8410c;
                        try {
                            jVar.c(((Z0.h) eVar2.f8410c).m(jSONObject.getString("key"), jSONObject.has(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LOCALE) ? jSONObject.getString(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LOCALE) : null));
                            break;
                        } catch (org.json.JSONException e4) {
                            jVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // a1.f
    public void j(java.lang.String str, a1.InterfaceC0064d interfaceC0064d, m0.j jVar) {
        ((R0.i) this.f88b).j(str, interfaceC0064d, jVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T0.a] */
    public android.graphics.Bitmap k(java.nio.ByteBuffer byteBuffer, T0.d dVar) {
        android.graphics.ImageDecoder.Source createSource;
        android.graphics.Bitmap decodeBitmap;
        createSource = android.graphics.ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = android.graphics.ImageDecoder.decodeBitmap(createSource, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: T0.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                    android.graphics.ColorSpace.Named named;
                    android.graphics.ColorSpace colorSpace;
                    android.util.Size size;
                    C.j jVar = C.j.this;
                    jVar.getClass();
                    named = android.graphics.ColorSpace.Named.SRGB;
                    colorSpace = android.graphics.ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    Q0.i iVar = (Q0.i) jVar.f88b;
                    if (iVar != null) {
                        size = imageInfo.getSize();
                        io.flutter.embedding.engine.FlutterJNI.nativeImageHeaderCallback(iVar.f1612a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (java.io.IOException e2) {
            android.util.Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public F.k0 l() {
        C1.r rVar = (C1.r) this.f88b;
        rVar.getClass();
        C.j jVar = D1.l.f240a;
        java.lang.Object obj = C1.r.f175e.get(rVar);
        if (obj == jVar) {
            obj = null;
        }
        return (F.k0) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Type inference failed for: r7v4, types: [m1.f, s1.p] */
    @Override // C1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object o(C1.e eVar, k1.d dVar) {
        C1.a aVar;
        int i2;
        java.lang.Throwable th;
        D1.n nVar;
        switch (this.f87a) {
            case 1:
                if (dVar instanceof C1.a) {
                    aVar = (C1.a) dVar;
                    int i3 = aVar.f114g;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f114g = i3 - Integer.MIN_VALUE;
                        java.lang.Object obj = aVar.f112e;
                        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                        i2 = aVar.f114g;
                        h1.C0177i c0177i = h1.C0177i.f3302a;
                        if (i2 != 0) {
                            a.AbstractC0059a.A(obj);
                            k1.i iVar = aVar.f8076b;
                            kotlin.jvm.internal.i.b(iVar);
                            D1.n nVar2 = new D1.n(eVar, iVar);
                            try {
                                aVar.f111d = nVar2;
                                aVar.f114g = 1;
                                java.lang.Object invoke = ((m1.AbstractC0935f) this.f88b).invoke(nVar2, aVar);
                                if (invoke != enumC0927a) {
                                    invoke = c0177i;
                                }
                                if (invoke == enumC0927a) {
                                    return enumC0927a;
                                }
                                nVar = nVar2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.h();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar = aVar.f111d;
                            try {
                                a.AbstractC0059a.A(obj);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                nVar.h();
                                throw th;
                            }
                        }
                        nVar.h();
                        return c0177i;
                    }
                }
                aVar = new C1.a(this, dVar);
                java.lang.Object obj2 = aVar.f112e;
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                i2 = aVar.f114g;
                h1.C0177i c0177i2 = h1.C0177i.f3302a;
                if (i2 != 0) {
                }
                nVar.h();
                return c0177i2;
            default:
                java.lang.Object o2 = ((x0.e) this.f88b).o(new F.C0020u(eVar, 0), dVar);
                return o2 == l1.EnumC0927a.f8017a ? o2 : h1.C0177i.f3302a;
        }
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onError(java.lang.String str, com.yandex.varioqub.config.FetchError fetchError) {
        long j2;
        switch (G0.a.f555a[fetchError.ordinal()]) {
            case 1:
                j2 = 1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j2 = 2;
                break;
            default:
                android.util.Log.e("VarioqubFlutter", "Unknown fetch error: " + fetchError);
                j2 = -1;
                break;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j2);
        java.lang.String name = fetchError.name();
        H0.a aVar = new H0.a();
        aVar.f610a = name;
        aVar.f611b = valueOf;
        x0.e eVar = (x0.e) this.f88b;
        java.util.ArrayList arrayList = (java.util.ArrayList) eVar.f8409b;
        arrayList.add(0, aVar);
        ((x0.e) eVar.f8410c).f(arrayList);
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onSuccess() {
        H0.a aVar = new H0.a();
        aVar.f610a = null;
        aVar.f611b = 0L;
        x0.e eVar = (x0.e) this.f88b;
        java.util.ArrayList arrayList = (java.util.ArrayList) eVar.f8409b;
        arrayList.add(0, aVar);
        ((x0.e) eVar.f8410c).f(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f482a > r3.f482a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(F.k0 newState) {
        C1.r rVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.i.e(newState, "newState");
        do {
            rVar = (C1.r) this.f88b;
            rVar.getClass();
            obj = D1.l.f240a;
            java.lang.Object obj3 = C1.r.f175e.get(rVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            F.k0 k0Var = (F.k0) obj2;
            if (!(k0Var instanceof F.d0 ? true : kotlin.jvm.internal.i.a(k0Var, F.l0.f487b))) {
                if (!(k0Var instanceof F.C0004d)) {
                    if (!(k0Var instanceof F.b0)) {
                        throw new E1.A();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (k0Var != null) {
                    obj = k0Var;
                }
            }
            k0Var = newState;
            if (obj2 == null) {
            }
            if (k0Var != null) {
            }
        } while (!rVar.b(obj2, obj));
    }

    public java.lang.String toString() {
        switch (this.f87a) {
            case 3:
                return "<" + ((java.lang.String) this.f88b) + '>';
            default:
                return super.toString();
        }
    }

    public j(com.watchfacestudio.huasi_urx110.MainActivity activity) {
        this.f87a = 2;
        kotlin.jvm.internal.i.e(activity, "activity");
        this.f88b = activity;
    }

    public j(R0.b bVar) {
        this.f87a = 28;
        new I0.b(bVar, "flutter/mousecursor", a1.o.f1949b, 9).M(new C.j(27, this));
    }

    public j(int i2) {
        this.f87a = i2;
        switch (i2) {
            case 6:
                this.f88b = new C1.r(F.l0.f487b);
                break;
            case 10:
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
                this.f88b = new M1.l(L1.d.f997h, timeUnit);
                break;
            case 13:
                this.f88b = new java.util.LinkedHashSet();
                break;
            case 15:
                this.f88b = new android.util.SparseIntArray();
                break;
            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                break;
            default:
                this.f88b = new java.util.concurrent.atomic.AtomicInteger(0);
                break;
        }
    }

    public j(boolean z2) {
        this.f87a = 8;
        this.f88b = new java.util.concurrent.atomic.AtomicBoolean(z2);
    }

    public j(a1.f fVar) {
        this.f87a = 25;
        new I0.b(fVar, "flutter/keyboard", a1.o.f1949b, 9).M(new x0.e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(s1.p pVar) {
        this.f87a = 1;
        this.f88b = (m1.AbstractC0935f) pVar;
    }

    public j(J1.a aVar) {
        this.f87a = 12;
        this.f88b = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), aVar);
    }
}
