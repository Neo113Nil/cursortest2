package Z0;

/* loaded from: classes.dex */
public final class h implements a1.k, C1.d, h.InterfaceC0141J, g.o, h.InterfaceC0154l, o0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1902a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f1903b;

    public /* synthetic */ h() {
        this.f1902a = 27;
    }

    public static boolean p(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    private final void r(x0.e eVar, Z0.j jVar) {
        java.lang.Object obj;
        Z0.h hVar = (Z0.h) this.f1903b;
        if (((Z0.h) hVar.f1903b) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) eVar.f8409b;
        str.getClass();
        obj = eVar.f8410c;
        switch (str) {
            case "create":
                java.util.Map map = (java.util.Map) obj;
                if (map.containsKey("params")) {
                    java.nio.ByteBuffer.wrap((byte[]) map.get("params"));
                }
                try {
                    ((java.lang.Integer) map.get("id")).intValue();
                    java.lang.String str2 = (java.lang.String) map.get("viewType");
                    ((java.lang.Integer) map.get("direction")).intValue();
                    if (((io.flutter.plugin.platform.j) ((Z0.h) hVar.f1903b).f1903b).f7752a.f1611a.get(str2) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (java.lang.IllegalStateException e2) {
                    jVar.a("error", android.util.Log.getStackTraceString(e2), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((java.lang.Integer) obj).intValue();
                try {
                    B1.a.m(((io.flutter.plugin.platform.j) ((Z0.h) hVar.f1903b).f1903b).f7758g.get(intValue));
                    android.util.Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    jVar.c(null);
                    return;
                } catch (java.lang.IllegalStateException e3) {
                    jVar.a("error", android.util.Log.getStackTraceString(e3), null);
                    return;
                }
            case "touch":
                java.util.List list = (java.util.List) obj;
                int intValue2 = ((java.lang.Integer) list.get(0)).intValue();
                ((java.lang.Integer) list.get(3)).getClass();
                ((java.lang.Integer) list.get(4)).getClass();
                list.get(5);
                list.get(6);
                ((java.lang.Integer) list.get(7)).getClass();
                ((java.lang.Integer) list.get(8)).getClass();
                ((java.lang.Double) list.get(9)).getClass();
                ((java.lang.Double) list.get(10)).getClass();
                ((java.lang.Integer) list.get(11)).getClass();
                ((java.lang.Integer) list.get(12)).getClass();
                ((java.lang.Integer) list.get(13)).getClass();
                ((java.lang.Integer) list.get(14)).getClass();
                ((java.lang.Number) list.get(15)).longValue();
                try {
                    Z0.h hVar2 = (Z0.h) hVar.f1903b;
                    hVar2.getClass();
                    io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) hVar2.f1903b;
                    float f2 = jVar2.f7753b.getResources().getDisplayMetrics().density;
                    if (jVar2.f7758g.get(intValue2) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    android.util.Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    jVar.c(null);
                    return;
                } catch (java.lang.IllegalStateException e4) {
                    jVar.a("error", android.util.Log.getStackTraceString(e4), null);
                    return;
                }
            case "setDirection":
                java.util.Map map2 = (java.util.Map) obj;
                int intValue3 = ((java.lang.Integer) map2.get("id")).intValue();
                ((java.lang.Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.j) ((Z0.h) hVar.f1903b).f1903b).f7758g.get(intValue3) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    android.util.Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    jVar.c(null);
                    return;
                } catch (java.lang.IllegalStateException e5) {
                    jVar.a("error", android.util.Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                io.flutter.embedding.engine.FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((Z0.h) hVar.f1903b).f1903b).f7755d;
                jVar.c(java.lang.Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((Z0.h) hVar.f1903b).k(((java.lang.Integer) ((java.util.Map) obj).get("id")).intValue());
                    jVar.c(null);
                    return;
                } catch (java.lang.IllegalStateException e6) {
                    jVar.a("error", android.util.Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                jVar.b();
                return;
        }
    }

    private final void s(x0.e eVar, Z0.j jVar) {
        int i2 = 2;
        Z0.h hVar = (Z0.h) this.f1903b;
        if (((N1.h) hVar.f1903b) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) eVar.f8409b;
        str.getClass();
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a2 = ((N1.h) hVar.f1903b).a();
                    if (a2 == 0) {
                        i2 = 0;
                    } else if (a2 == 1) {
                        i2 = 1;
                    } else if (a2 != 2) {
                        i2 = 3;
                    }
                    jVar.c(java.lang.Integer.valueOf(i2));
                    return;
                } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e2) {
                    jVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                int intValue = ((java.lang.Integer) eVar.f8410c).intValue();
                try {
                    N1.h hVar2 = (N1.h) hVar.f1903b;
                    hVar.getClass();
                    if (intValue == 0) {
                        i2 = 0;
                    } else if (intValue == 1) {
                        i2 = 1;
                    } else if (intValue != 2) {
                        throw new java.lang.IllegalArgumentException(B1.a.g(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                    }
                    hVar2.b(i2);
                    return;
                } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e3) {
                    jVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((N1.h) hVar.f1903b).getClass();
                jVar.c(java.lang.Boolean.valueOf(android.os.Build.VERSION.SDK_INT >= 35));
                return;
            default:
                jVar.b();
                return;
        }
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
        if (jVar instanceof g.t) {
            ((g.t) jVar).f3037v.j().c(false);
        }
        g.o oVar = ((h.C0151i) this.f1903b).f3165e;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // h.InterfaceC0141J
    public void b(g.j jVar, g.k kVar) {
        ((g.g) this.f1903b).f2933f.removeCallbacksAndMessages(jVar);
    }

    @Override // o0.h
    public void c(java.lang.Object obj, java.lang.Object obj2) {
        D0.d dVar = (D0.d) obj2;
        r0.C0985a c0985a = (r0.C0985a) ((r0.C0987c) obj).q();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(c0985a.f8481b);
        int i2 = y0.b.f8482a;
        p0.C0957i c0957i = (p0.C0957i) this.f1903b;
        if (c0957i == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c0957i.writeToParcel(obtain, 0);
        }
        try {
            c0985a.f8480a.transact(1, obtain, null, 1);
            obtain.recycle();
            dVar.f194a.f(null);
        } catch (java.lang.Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // h.InterfaceC0141J
    public void d(g.j jVar, g.k kVar) {
        g.g gVar = (g.g) this.f1903b;
        gVar.f2933f.removeCallbacksAndMessages(null);
        java.util.ArrayList arrayList = gVar.f2935h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((g.f) arrayList.get(i2)).f2927b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        gVar.f2933f.postAtTime(new g.e(this, i3 < arrayList.size() ? (g.f) arrayList.get(i3) : null, kVar, jVar), jVar, android.os.SystemClock.uptimeMillis() + 200);
    }

    @Override // g.o
    public boolean e(g.t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f3038w.getClass();
        h.C0151i c0151i = (h.C0151i) this.f1903b;
        c0151i.getClass();
        g.o oVar = c0151i.f3165e;
        if (oVar != null) {
            return oVar.e(tVar);
        }
        return false;
    }

    public void f(java.lang.String str) {
        x0.e eVar = (x0.e) this.f1903b;
        P0.t tVar = (P0.t) eVar.f8409b;
        P0.C c2 = x0.e.f8407f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        if (c2 == null) {
            P0.C c3 = new P0.C();
            c3.put("alias", 1010);
            c3.put("allScroll", 1013);
            c3.put("basic", valueOf);
            c3.put("cell", 1006);
            c3.put("click", 1002);
            c3.put("contextMenu", 1001);
            c3.put("copy", 1011);
            c3.put("forbidden", 1012);
            c3.put("grab", 1020);
            c3.put("grabbing", 1021);
            c3.put("help", 1003);
            c3.put("move", 1013);
            c3.put("none", 0);
            c3.put("noDrop", 1012);
            c3.put("precise", 1007);
            c3.put("text", 1008);
            c3.put("resizeColumn", 1014);
            c3.put("resizeDown", 1015);
            c3.put("resizeUpLeft", 1016);
            c3.put("resizeDownRight", 1017);
            c3.put("resizeLeft", 1014);
            c3.put("resizeLeftRight", 1014);
            c3.put("resizeRight", 1014);
            c3.put("resizeRow", 1015);
            c3.put("resizeUp", 1015);
            c3.put("resizeUpDown", 1015);
            c3.put("resizeUpLeft", 1017);
            c3.put("resizeUpRight", 1016);
            c3.put("resizeUpLeftDownRight", 1017);
            c3.put("resizeUpRightDownLeft", 1016);
            c3.put("verticalText", 1009);
            c3.put("wait", 1004);
            c3.put("zoomIn", 1018);
            c3.put("zoomOut", 1019);
            x0.e.f8407f = c3;
        }
        tVar.setPointerIcon(android.view.PointerIcon.getSystemIcon(((P0.t) eVar.f8409b).getContext(), ((java.lang.Integer) x0.e.f8407f.getOrDefault(str, valueOf)).intValue()));
    }

    public void g(int i2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        if (kVar.d(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f7774i.get(java.lang.Integer.valueOf(i2))).getClass();
            android.util.Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f7776k.get(i2) != null) {
            throw new java.lang.ClassCastException();
        }
        android.util.Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void h(P1.B b2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        io.flutter.plugin.platform.k.b(kVar, b2);
        if (kVar.f7769d.IsSurfaceControlEnabled()) {
            throw new java.lang.IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        java.util.HashMap hashMap = kVar.f7766a.f1611a;
        java.lang.String str = (java.lang.String) b2.f1436c;
        if (hashMap.get(str) != null) {
            throw new java.lang.ClassCastException();
        }
        throw new java.lang.IllegalStateException(B1.a.i("Trying to create a platform view of unregistered type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // a1.k
    public void i(x0.e eVar, Z0.j jVar) {
        char c2;
        char c3;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c4;
        android.os.Bundle bundle;
        boolean z2 = false;
        z2 = false;
        switch (this.f1902a) {
            case 0:
                Z0.h hVar = (Z0.h) this.f1903b;
                if (((x0.e) hVar.f1903b) == null) {
                    return;
                }
                java.lang.String str = (java.lang.String) eVar.f8409b;
                str.getClass();
                java.lang.Object obj = eVar.f8410c;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        java.util.Map map = (java.util.Map) obj;
                        boolean z3 = map.containsKey("hybrid") && ((java.lang.Boolean) map.get("hybrid")).booleanValue();
                        java.nio.ByteBuffer wrap = map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            io.flutter.embedding.engine.FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((x0.e) hVar.f1903b).f8410c).f7755d;
                            if (!(flutterJNI == null ? false : flutterJNI.IsSurfaceControlEnabled())) {
                                if (z3) {
                                    ((io.flutter.plugin.platform.k) ((x0.e) hVar.f1903b).f8409b).f7785u.h(new P1.B(((java.lang.Integer) map.get("id")).intValue(), (java.lang.String) map.get("viewType"), com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE, com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE, com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE, com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE, ((java.lang.Integer) map.get("direction")).intValue(), 3, wrap));
                                    throw null;
                                }
                                ((io.flutter.plugin.platform.k) ((x0.e) hVar.f1903b).f8409b).f7785u.j(new P1.B(((java.lang.Integer) map.get("id")).intValue(), (java.lang.String) map.get("viewType"), map.containsKey("top") ? ((java.lang.Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((java.lang.Double) map.get("left")).doubleValue() : 0.0d, ((java.lang.Double) map.get("width")).doubleValue(), ((java.lang.Double) map.get("height")).doubleValue(), ((java.lang.Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((java.lang.Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                                throw null;
                            }
                            ((java.lang.Integer) map.get("id")).getClass();
                            java.lang.String str2 = (java.lang.String) map.get("viewType");
                            ((java.lang.Integer) map.get("direction")).getClass();
                            if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) ((x0.e) hVar.f1903b).f8410c).f7765n.f1903b).f7752a.f1611a.get(str2) != null) {
                                throw new java.lang.ClassCastException();
                            }
                            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                        } catch (java.lang.IllegalStateException e2) {
                            jVar.a("error", android.util.Log.getStackTraceString(e2), null);
                            return;
                        }
                    case 1:
                        java.util.Map map2 = (java.util.Map) obj;
                        try {
                            x0.e eVar2 = (x0.e) hVar.f1903b;
                            int intValue = ((java.lang.Integer) map2.get("id")).intValue();
                            double doubleValue = ((java.lang.Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((java.lang.Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.j) eVar2.f8410c).g(intValue);
                            ((io.flutter.plugin.platform.k) eVar2.f8409b).f7785u.q(intValue, doubleValue, doubleValue2);
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e3) {
                            jVar.a("error", android.util.Log.getStackTraceString(e3), null);
                            return;
                        }
                    case 2:
                        java.util.Map map3 = (java.util.Map) obj;
                        int intValue2 = ((java.lang.Integer) map3.get("id")).intValue();
                        Z0.i iVar = new Z0.i(intValue2, ((java.lang.Double) map3.get("width")).doubleValue(), ((java.lang.Double) map3.get("height")).doubleValue());
                        try {
                            x0.e eVar3 = (x0.e) hVar.f1903b;
                            H0.b bVar = new H0.b(11, jVar);
                            eVar3.getClass();
                            ((io.flutter.plugin.platform.j) eVar3.f8410c).g(intValue2);
                            ((io.flutter.plugin.platform.k) eVar3.f8409b).f7785u.u(iVar, bVar);
                            return;
                        } catch (java.lang.IllegalStateException e4) {
                            jVar.a("error", android.util.Log.getStackTraceString(e4), null);
                            return;
                        }
                    case 3:
                        int intValue3 = ((java.lang.Integer) obj).intValue();
                        try {
                            x0.e eVar4 = (x0.e) hVar.f1903b;
                            ((io.flutter.plugin.platform.j) eVar4.f8410c).g(intValue3);
                            ((io.flutter.plugin.platform.k) eVar4.f8409b).f7785u.g(intValue3);
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e5) {
                            jVar.a("error", android.util.Log.getStackTraceString(e5), null);
                            return;
                        }
                    case 4:
                        try {
                            ((io.flutter.plugin.platform.k) ((io.flutter.plugin.platform.k) ((x0.e) hVar.f1903b).f8409b).f7785u.f1903b).f7782q = ((java.lang.Boolean) obj).booleanValue();
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e6) {
                            jVar.a("error", android.util.Log.getStackTraceString(e6), null);
                            return;
                        }
                    case 5:
                        java.util.List list = (java.util.List) obj;
                        int intValue4 = ((java.lang.Integer) list.get(0)).intValue();
                        Z0.g gVar = new Z0.g(intValue4, (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue());
                        try {
                            x0.e eVar5 = (x0.e) hVar.f1903b;
                            eVar5.getClass();
                            ((io.flutter.plugin.platform.j) eVar5.f8410c).g(intValue4);
                            ((io.flutter.plugin.platform.k) eVar5.f8409b).f7785u.t(gVar);
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e7) {
                            jVar.a("error", android.util.Log.getStackTraceString(e7), null);
                            return;
                        }
                    case 6:
                        java.util.Map map4 = (java.util.Map) obj;
                        int intValue5 = ((java.lang.Integer) map4.get("id")).intValue();
                        int intValue6 = ((java.lang.Integer) map4.get("direction")).intValue();
                        try {
                            x0.e eVar6 = (x0.e) hVar.f1903b;
                            ((io.flutter.plugin.platform.j) eVar6.f8410c).g(intValue5);
                            ((io.flutter.plugin.platform.k) eVar6.f8409b).f7785u.v(intValue5, intValue6);
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e8) {
                            jVar.a("error", android.util.Log.getStackTraceString(e8), null);
                            return;
                        }
                    case 7:
                        int intValue7 = ((java.lang.Integer) ((java.util.Map) obj).get("id")).intValue();
                        try {
                            x0.e eVar7 = (x0.e) hVar.f1903b;
                            ((io.flutter.plugin.platform.j) eVar7.f8410c).g(intValue7);
                            ((io.flutter.plugin.platform.k) eVar7.f8409b).f7785u.k(intValue7);
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e9) {
                            jVar.a("error", android.util.Log.getStackTraceString(e9), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 1:
                r(eVar, jVar);
                return;
            case 2:
            case 3:
            case 7:
            case 9:
            default:
                x0.e eVar8 = (x0.e) this.f1903b;
                if (((io.flutter.plugin.editing.i) eVar8.f8410c) == null) {
                    return;
                }
                java.lang.String str3 = (java.lang.String) eVar.f8409b;
                str3.getClass();
                java.lang.Object obj2 = eVar.f8410c;
                switch (str3.hashCode()) {
                    case -1779068172:
                        if (str3.equals("TextInput.setPlatformViewClient")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1015421462:
                        if (str3.equals("TextInput.setEditingState")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -37561188:
                        if (str3.equals("TextInput.setClient")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 270476819:
                        if (str3.equals("TextInput.hide")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 270803918:
                        if (str3.equals("TextInput.show")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 649192816:
                        if (str3.equals("TextInput.sendAppPrivateCommand")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1204752139:
                        if (str3.equals("TextInput.setEditableSizeAndTransform")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1727570905:
                        if (str3.equals("TextInput.finishAutofillContext")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1904427655:
                        if (str3.equals("TextInput.clearClient")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2113369584:
                        if (str3.equals("TextInput.requestAutofill")) {
                            c4 = '\t';
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        try {
                            org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                            int i2 = jSONObject.getInt("platformViewId");
                            boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.j jVar2 = ((io.flutter.plugin.editing.i) eVar8.f8410c).f7723a;
                            if (optBoolean) {
                                P0.t tVar = jVar2.f7724a;
                                tVar.requestFocus();
                                jVar2.f7728e = new P.C0039l(3, i2);
                                jVar2.f7725b.restartInput(tVar);
                                jVar2.f7732i = false;
                            } else {
                                jVar2.getClass();
                                jVar2.f7728e = new P.C0039l(4, i2);
                                jVar2.f7733j = null;
                            }
                            jVar.c(null);
                            return;
                        } catch (org.json.JSONException e10) {
                            jVar.a("error", e10.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.i) eVar8.f8410c).c(Z0.p.a((org.json.JSONObject) obj2));
                            jVar.c(null);
                            return;
                        } catch (org.json.JSONException e11) {
                            jVar.a("error", e11.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) obj2;
                            ((io.flutter.plugin.editing.i) eVar8.f8410c).a(jSONArray.getInt(0), Z0.n.a(jSONArray.getJSONObject(1)));
                            jVar.c(null);
                            return;
                        } catch (java.lang.NoSuchFieldException | org.json.JSONException e12) {
                            jVar.a("error", e12.getMessage(), null);
                            return;
                        }
                    case 3:
                        io.flutter.plugin.editing.j jVar3 = ((io.flutter.plugin.editing.i) eVar8.f8410c).f7723a;
                        if (jVar3.f7728e.f1285b == 4) {
                            jVar3.c();
                        } else {
                            jVar3.c();
                            jVar3.f7725b.hideSoftInputFromWindow(jVar3.f7724a.getApplicationWindowToken(), 0);
                        }
                        jVar.c(null);
                        return;
                    case 4:
                        io.flutter.plugin.editing.j jVar4 = ((io.flutter.plugin.editing.i) eVar8.f8410c).f7723a;
                        P0.t tVar2 = jVar4.f7724a;
                        Z0.n nVar = jVar4.f7729f;
                        android.view.inputmethod.InputMethodManager inputMethodManager = jVar4.f7725b;
                        if (nVar == null || nVar.f1927g.f1934a != 11) {
                            tVar2.requestFocus();
                            inputMethodManager.showSoftInput(tVar2, 0);
                        } else {
                            jVar4.c();
                            inputMethodManager.hideSoftInputFromWindow(tVar2.getApplicationWindowToken(), 0);
                        }
                        jVar.c(null);
                        return;
                    case 5:
                        try {
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
                            java.lang.String string = jSONObject2.getString("action");
                            java.lang.String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new android.os.Bundle();
                                bundle.putString("data", string2);
                            }
                            io.flutter.plugin.editing.j jVar5 = ((io.flutter.plugin.editing.i) eVar8.f8410c).f7723a;
                            jVar5.f7725b.sendAppPrivateCommand(jVar5.f7724a, string, bundle);
                            jVar.c(null);
                            return;
                        } catch (org.json.JSONException e13) {
                            jVar.a("error", e13.getMessage(), null);
                            return;
                        }
                    case 6:
                        try {
                            org.json.JSONObject jSONObject3 = (org.json.JSONObject) obj2;
                            double d2 = jSONObject3.getDouble("width");
                            double d3 = jSONObject3.getDouble("height");
                            org.json.JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i3 = 0; i3 < 16; i3++) {
                                dArr[i3] = jSONArray2.getDouble(i3);
                            }
                            ((io.flutter.plugin.editing.i) eVar8.f8410c).b(d2, d3, dArr);
                            jVar.c(null);
                            return;
                        } catch (org.json.JSONException e14) {
                            jVar.a("error", e14.getMessage(), null);
                            return;
                        }
                    case 7:
                        io.flutter.plugin.editing.i iVar2 = (io.flutter.plugin.editing.i) eVar8.f8410c;
                        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                        if (android.os.Build.VERSION.SDK_INT >= 26) {
                            android.view.autofill.AutofillManager autofillManager = iVar2.f7723a.f7726c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            iVar2.getClass();
                        }
                        jVar.c(null);
                        return;
                    case '\b':
                        io.flutter.plugin.editing.j jVar6 = ((io.flutter.plugin.editing.i) eVar8.f8410c).f7723a;
                        if (jVar6.f7728e.f1285b != 3) {
                            jVar6.f7731h.e(jVar6);
                            jVar6.c();
                            jVar6.f7729f = null;
                            jVar6.d(null);
                            jVar6.f7728e = new P.C0039l(1, 0);
                            jVar6.f7736m = null;
                            java.lang.reflect.Field field = y.x.f8478a;
                            P0.t tVar3 = jVar6.f7724a;
                            y.Q a2 = y.AbstractC1029q.a(tVar3);
                            if (a2 != null && !a2.f8448a.m(8)) {
                                jVar6.f7725b.restartInput(tVar3);
                            }
                        }
                        jVar.c(null);
                        return;
                    case '\t':
                        io.flutter.plugin.editing.i iVar3 = (io.flutter.plugin.editing.i) eVar8.f8410c;
                        int i4 = android.os.Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.j jVar7 = iVar3.f7723a;
                        if (i4 < 26) {
                            jVar7.getClass();
                        } else if (jVar7.f7726c != null && jVar7.f7730g != null) {
                            java.lang.String str4 = (java.lang.String) jVar7.f7729f.f1930j.f498a;
                            int[] iArr = new int[2];
                            P0.t tVar4 = jVar7.f7724a;
                            tVar4.getLocationOnScreen(iArr);
                            android.graphics.Rect rect = new android.graphics.Rect(jVar7.f7736m);
                            rect.offset(iArr[0], iArr[1]);
                            jVar7.f7726c.notifyViewEntered(tVar4, str4.hashCode(), rect);
                        }
                        jVar.c(null);
                        return;
                    default:
                        jVar.b();
                        return;
                }
            case 4:
                x0.e eVar9 = (x0.e) this.f1903b;
                if (((d1.C0108a) eVar9.f8410c) == null) {
                    return;
                }
                java.lang.String str5 = (java.lang.String) eVar.f8409b;
                java.lang.Object obj3 = eVar.f8410c;
                str5.getClass();
                if (str5.equals("ProcessText.processTextAction")) {
                    try {
                        java.util.ArrayList arrayList = (java.util.ArrayList) obj3;
                        ((d1.C0108a) eVar9.f8410c).a((java.lang.String) arrayList.get(0), (java.lang.String) arrayList.get(1), ((java.lang.Boolean) arrayList.get(2)).booleanValue(), jVar);
                        return;
                    } catch (java.lang.IllegalStateException e15) {
                        jVar.a("error", e15.getMessage(), null);
                        return;
                    }
                }
                if (!str5.equals("ProcessText.queryTextActions")) {
                    jVar.b();
                    return;
                }
                try {
                    jVar.c(((d1.C0108a) eVar9.f8410c).b());
                    return;
                } catch (java.lang.IllegalStateException e16) {
                    jVar.a("error", e16.getMessage(), null);
                    return;
                }
            case 5:
                java.lang.String str6 = (java.lang.String) eVar.f8409b;
                str6.getClass();
                Z0.k kVar = (Z0.k) this.f1903b;
                if (!str6.equals("get")) {
                    if (!str6.equals("put")) {
                        jVar.b();
                        return;
                    } else {
                        kVar.f1911b = (byte[]) eVar.f8410c;
                        jVar.c(null);
                        return;
                    }
                }
                kVar.f1915f = true;
                if (kVar.f1914e || !kVar.f1910a) {
                    jVar.c(Z0.k.a(kVar.f1911b));
                    return;
                } else {
                    kVar.f1913d = jVar;
                    return;
                }
            case 6:
                Z0.h hVar2 = (Z0.h) this.f1903b;
                if (((x0.e) hVar2.f1903b) == null) {
                    return;
                }
                java.lang.String str7 = (java.lang.String) eVar.f8409b;
                str7.getClass();
                switch (str7.hashCode()) {
                    case -705821951:
                        if (str7.equals("Scribe.isFeatureAvailable")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1759284829:
                        if (str7.equals("Scribe.startStylusHandwriting")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2119738044:
                        if (str7.equals("Scribe.isStylusHandwritingAvailable")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        try {
                            x0.e eVar10 = (x0.e) hVar2.f1903b;
                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((android.view.inputmethod.InputMethodManager) eVar10.f8409b).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    z2 = true;
                                }
                            } else {
                                eVar10.getClass();
                            }
                            jVar.c(java.lang.Boolean.valueOf(z2));
                            return;
                        } catch (java.lang.IllegalStateException e17) {
                            jVar.a("error", e17.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (android.os.Build.VERSION.SDK_INT < 33) {
                            jVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            x0.e eVar11 = (x0.e) hVar2.f1903b;
                            ((android.view.inputmethod.InputMethodManager) eVar11.f8409b).startStylusHandwriting((P0.t) eVar11.f8410c);
                            jVar.c(null);
                            return;
                        } catch (java.lang.IllegalStateException e18) {
                            jVar.a("error", e18.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (android.os.Build.VERSION.SDK_INT < 34) {
                            jVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((android.view.inputmethod.InputMethodManager) ((x0.e) hVar2.f1903b).f8409b).isStylusHandwritingAvailable();
                            jVar.c(java.lang.Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (java.lang.IllegalStateException e19) {
                            jVar.a("error", e19.getMessage(), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 8:
                s(eVar, jVar);
                return;
            case 10:
                Z0.h hVar3 = (Z0.h) this.f1903b;
                if (((io.flutter.plugin.editing.g) hVar3.f1903b) == null) {
                    return;
                }
                java.lang.String str8 = (java.lang.String) eVar.f8409b;
                java.lang.Object obj4 = eVar.f8410c;
                str8.getClass();
                if (!str8.equals("SpellCheck.initiateSpellCheck")) {
                    jVar.b();
                    return;
                }
                try {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) obj4;
                    ((io.flutter.plugin.editing.g) hVar3.f1903b).a((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1), jVar);
                    return;
                } catch (java.lang.IllegalStateException e20) {
                    jVar.a("error", e20.getMessage(), null);
                    return;
                }
        }
    }

    public long j(P1.B b2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        io.flutter.plugin.platform.k.b(kVar, b2);
        android.util.SparseArray sparseArray = kVar.f7779n;
        int i2 = b2.f1434a;
        if (sparseArray.get(i2) != null) {
            throw new java.lang.IllegalStateException(B1.a.f(i2, "Trying to create an already created platform view, view id: "));
        }
        if (kVar.f7770e == null) {
            throw new java.lang.IllegalStateException(B1.a.f(i2, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (kVar.f7768c == null) {
            throw new java.lang.IllegalStateException(B1.a.f(i2, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        java.util.HashMap hashMap = kVar.f7766a.f1611a;
        java.lang.String str = (java.lang.String) b2.f1436c;
        if (hashMap.get(str) == null) {
            throw new java.lang.IllegalStateException(B1.a.i("Trying to create a platform view of unregistered type: ", str));
        }
        throw new java.lang.ClassCastException();
    }

    public void k(int i2) {
        switch (this.f1902a) {
            case 24:
                B1.a.m(((io.flutter.plugin.platform.k) this.f1903b).f7776k.get(i2));
                android.util.Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f1903b;
                jVar.f7764m.remove(java.lang.Integer.valueOf(i2));
                B1.a.m(jVar.f7758g.get(i2));
                android.util.Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public java.lang.CharSequence l(Z0.d dVar) {
        P0.AbstractActivityC0047e abstractActivityC0047e = ((io.flutter.plugin.platform.e) this.f1903b).f7746a;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) abstractActivityC0047e.getSystemService("clipboard");
        java.lang.CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (dVar != null && dVar != Z0.d.f1872b) {
                    return null;
                }
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                java.lang.CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    android.net.Uri uri = itemAt.getUri();
                    if (uri == null) {
                        android.util.Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        java.lang.String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0047e.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            java.lang.CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0047e);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (java.io.IOException e2) {
                                    charSequence = coerceToText;
                                    e = e2;
                                    android.util.Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            android.util.Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (java.io.IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (java.io.IOException e4) {
                e = e4;
            }
        } catch (java.io.FileNotFoundException unused) {
            android.util.Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (java.lang.SecurityException e5) {
            android.util.Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public java.lang.String m(java.lang.String str, java.lang.String str2) {
        b1.C0094a c0094a = (b1.C0094a) this.f1903b;
        android.content.Context context = c0094a.f2531b;
        P0.AbstractActivityC0047e abstractActivityC0047e = c0094a.f2531b;
        if (str2 != null) {
            java.util.Locale a2 = b1.C0094a.a(str2);
            android.content.res.Configuration configuration = new android.content.res.Configuration(abstractActivityC0047e.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = abstractActivityC0047e.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0047e.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // C1.d
    public java.lang.Object o(C1.e eVar, k1.d dVar) {
        java.lang.Object o2 = ((C1.d) this.f1903b).o(new F.C0020u(eVar, 1), dVar);
        return o2 == l1.EnumC0927a.f8017a ? o2 : h1.C0177i.f3302a;
    }

    public void q(int i2, double d2, double d3) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        if (kVar.d(i2)) {
            return;
        }
        android.util.Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void t(Z0.g gVar) {
        java.util.PriorityQueue priorityQueue;
        android.util.LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        float f2 = kVar.f7767b.getResources().getDisplayMetrics().density;
        int i2 = gVar.f1886a;
        if (!kVar.d(i2)) {
            if (kVar.f7776k.get(i2) != null) {
                throw new java.lang.ClassCastException();
            }
            android.util.Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f7774i.get(java.lang.Integer.valueOf(i2));
        P0.G g2 = new P0.G(gVar.f1901p);
        while (true) {
            x0.e eVar = kVar.t;
            priorityQueue = (java.util.PriorityQueue) eVar.f8410c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (android.util.LongSparseArray) eVar.f8409b;
            j2 = g2.f1320a;
            if (isEmpty || ((java.lang.Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((java.lang.Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((java.lang.Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        java.util.List<java.util.List> list = (java.util.List) gVar.f1892g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List list2 : list) {
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((java.lang.Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((java.lang.Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((java.lang.Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((java.lang.Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((java.lang.Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((java.lang.Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((java.lang.Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((java.lang.Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((java.lang.Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i3 = gVar.f1890e;
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = (android.view.MotionEvent.PointerCoords[]) arrayList.toArray(new android.view.MotionEvent.PointerCoords[i3]);
        java.util.List<java.util.List> list3 = (java.util.List) gVar.f1891f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.List list4 : list3) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerProperties.id = ((java.lang.Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((java.lang.Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        android.view.MotionEvent.obtain(gVar.f1887b.longValue(), gVar.f1888c.longValue(), gVar.f1889d, gVar.f1890e, (android.view.MotionEvent.PointerProperties[]) arrayList2.toArray(new android.view.MotionEvent.PointerProperties[i3]), pointerCoordsArr, gVar.f1893h, gVar.f1894i, gVar.f1895j, gVar.f1896k, gVar.f1897l, gVar.f1898m, gVar.f1899n, gVar.f1900o);
        qVar.getClass();
    }

    public void u(Z0.i iVar, H0.b bVar) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        int i2 = kVar.i(iVar.f1905b);
        int i3 = kVar.i(iVar.f1906c);
        int i4 = iVar.f1904a;
        if (!kVar.d(i4)) {
            if (kVar.f7776k.get(i4) != null) {
                throw new java.lang.ClassCastException();
            }
            android.util.Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = kVar.f7767b.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f7774i.get(java.lang.Integer.valueOf(i4));
        io.flutter.plugin.editing.j jVar = kVar.f7771f;
        if (jVar != null) {
            if (jVar.f7728e.f1285b == 3) {
                jVar.f7739p = true;
            }
            qVar.getClass();
        }
        qVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void v(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new java.lang.IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1903b;
        if (kVar.d(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f7774i.get(java.lang.Integer.valueOf(i2))).getClass();
            android.util.Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f7776k.get(i2) != null) {
            throw new java.lang.ClassCastException();
        }
        android.util.Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void w(java.util.ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f1903b;
        if (eVar.f7751f) {
            eVar.f7751f = false;
            Q1.l.v(eVar.f7746a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((Z0.f) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f7750e = i2;
        eVar.b();
    }

    public void x(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f1903b;
        eVar.getClass();
        P0.AbstractActivityC0047e abstractActivityC0047e = eVar.f7746a;
        if (i2 != 4 && eVar.f7751f) {
            eVar.f7751f = false;
            Q1.l.v(abstractActivityC0047e.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || android.os.Build.VERSION.SDK_INT < 29) {
                    return;
                }
                eVar.f7751f = true;
                Q1.l.v(abstractActivityC0047e.getWindow(), false);
                Z0.e eVar2 = eVar.f7749d;
                if (eVar2 != null) {
                    eVar.a(eVar2);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f7750e = i3;
        eVar.b();
    }

    public com.google.android.gms.tasks.Task y(com.google.android.gms.tasks.Task task) {
        o0.i iVar = (o0.i) this.f1903b;
        if (!task.d() && !((D0.m) task).f216d) {
            java.lang.Exception b2 = task.b();
            if (b2 instanceof n0.d) {
                int i2 = ((n0.d) b2).f8084a.f2594a;
                if (i2 == 43001 || i2 == 43002 || i2 == 43003 || i2 == 17) {
                    x0.e eVar = (x0.e) iVar.f8149c;
                    eVar.getClass();
                    D0.d dVar = new D0.d();
                    ((java.util.concurrent.ExecutorService) eVar.f8410c).execute(new D0.f(eVar, dVar, 10, false));
                    task = dVar.f194a;
                } else if (i2 == 43000) {
                    java.lang.Exception exc = new java.lang.Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    D0.m mVar = new D0.m();
                    mVar.e(exc);
                    task = mVar;
                } else if (i2 == 15) {
                    java.lang.Exception exc2 = new java.lang.Exception("The operation to get app set ID timed out. Please try again later.");
                    D0.m mVar2 = new D0.m();
                    mVar2.e(exc2);
                    return mVar2;
                }
            }
        }
        return task;
    }

    public void z(int i2) {
        android.view.View decorView = ((io.flutter.plugin.platform.e) this.f1903b).f7746a.getWindow().getDecorView();
        switch (H.j.b(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(int i2, java.lang.Object obj) {
        this.f1902a = i2;
        this.f1903b = obj;
    }

    public h(R0.b bVar, int i2) {
        this.f1902a = i2;
        switch (i2) {
            case 3:
                new I0.b(bVar, "flutter/platform_views", a1.o.f1949b, 9).M(new Z0.h(0, this));
                break;
            case 7:
                new I0.b(bVar, "flutter/scribe", a1.i.f1948a, 9).M(new Z0.h(6, this));
                break;
            case 9:
                new I0.b(bVar, "flutter/sensitivecontent", a1.o.f1949b, 9).M(new Z0.h(8, this));
                break;
            case 11:
                new I0.b(bVar, "flutter/spellcheck", a1.o.f1949b, 9).M(new Z0.h(10, this));
                break;
            default:
                new I0.b(bVar, "flutter/platform_views_2", a1.o.f1949b, 9).M(new Z0.h(1, this));
                break;
        }
    }
}
