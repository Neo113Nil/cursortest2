package io.flutter.view;

/* loaded from: classes.dex */
public final class h extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f7883x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final P0.t f7884a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.b f7885b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f7886c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.view.AccessibilityViewEmbedder f7887d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f7888e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.ContentResolver f7889f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f7890g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f7891h;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.view.g f7892i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Integer f7893j;

    /* renamed from: k, reason: collision with root package name */
    public int f7894k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f7895l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.view.g f7896m;

    /* renamed from: n, reason: collision with root package name */
    public io.flutter.view.g f7897n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.view.g f7898o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f7899p;

    /* renamed from: q, reason: collision with root package name */
    public int f7900q;

    /* renamed from: r, reason: collision with root package name */
    public C.j f7901r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7902s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final io.flutter.view.c f7903u;

    /* renamed from: v, reason: collision with root package name */
    public final io.flutter.view.d f7904v;

    /* renamed from: w, reason: collision with root package name */
    public final D.a f7905w;

    public h(P0.t tVar, I0.b bVar, android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        int i2;
        io.flutter.view.AccessibilityViewEmbedder accessibilityViewEmbedder = new io.flutter.view.AccessibilityViewEmbedder(tVar, 65536);
        this.f7890g = new java.util.HashMap();
        this.f7891h = new java.util.HashMap();
        this.f7894k = 0;
        this.f7899p = new java.util.ArrayList();
        this.f7900q = 0;
        this.f7902s = false;
        this.t = false;
        io.flutter.view.b bVar2 = new io.flutter.view.b(this);
        io.flutter.view.c cVar = new io.flutter.view.c(this);
        this.f7903u = cVar;
        D.a aVar = new D.a(this, new android.os.Handler(), 2);
        this.f7905w = aVar;
        this.f7884a = tVar;
        this.f7885b = bVar;
        this.f7886c = accessibilityManager;
        this.f7889f = contentResolver;
        this.f7887d = accessibilityViewEmbedder;
        this.f7888e = hVar;
        bVar.f659d = bVar2;
        ((io.flutter.embedding.engine.FlutterJNI) bVar.f658c).setAccessibilityDelegate(bVar2);
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        io.flutter.view.d dVar = new io.flutter.view.d(this, accessibilityManager);
        this.f7904v = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.f7894k |= 128;
        aVar.onChange(false, null);
        contentResolver.registerContentObserver(android.provider.Settings.Global.getUriFor("transition_animation_scale"), false, aVar);
        if (android.os.Build.VERSION.SDK_INT >= 31 && tVar != null && tVar.getResources() != null) {
            i2 = tVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f7894k &= -9;
            } else {
                this.f7894k |= 8;
            }
            ((io.flutter.embedding.engine.FlutterJNI) bVar.f658c).setAccessibilityFeatures(this.f7894k);
        }
        hVar.c(this);
    }

    public static java.lang.String c(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final io.flutter.view.f a(int i2) {
        java.util.HashMap hashMap = this.f7891h;
        io.flutter.view.f fVar = (io.flutter.view.f) hashMap.get(java.lang.Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        io.flutter.view.f fVar2 = new io.flutter.view.f();
        fVar2.f7827c = -1;
        fVar2.f7826b = i2;
        fVar2.f7825a = 267386881 + i2;
        hashMap.put(java.lang.Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    public final io.flutter.view.g b(int i2) {
        java.util.HashMap hashMap = this.f7890g;
        io.flutter.view.g gVar = (io.flutter.view.g) hashMap.get(java.lang.Integer.valueOf(i2));
        if (gVar != null) {
            return gVar;
        }
        io.flutter.view.g gVar2 = new io.flutter.view.g(this);
        gVar2.f7856b = i2;
        hashMap.put(java.lang.Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02dd  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        java.lang.String str;
        boolean K2;
        boolean I2;
        boolean I3;
        int i4;
        io.flutter.view.g gVar;
        int i5;
        io.flutter.view.g gVar2;
        boolean I4;
        boolean z2;
        boolean I5;
        io.flutter.view.e eVar;
        boolean k2;
        io.flutter.view.e eVar2;
        boolean I6;
        io.flutter.view.g gVar3;
        io.flutter.view.e eVar3;
        boolean k3;
        io.flutter.view.e eVar4;
        boolean I7;
        boolean I8;
        boolean I9;
        java.lang.String str2;
        java.lang.String str3;
        int i6;
        boolean I10;
        boolean I11;
        int i7;
        int i8;
        boolean I12;
        boolean I13;
        boolean I14;
        io.flutter.view.g gVar4;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        boolean I15;
        int i9;
        int i10;
        int i11;
        int i12;
        java.util.ArrayList arrayList3;
        int i13;
        java.lang.String str4;
        int i14;
        int i15;
        boolean I16;
        boolean I17;
        boolean I18;
        boolean I19;
        boolean I20;
        boolean I21;
        int i16;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        io.flutter.view.g gVar5;
        java.util.ArrayList arrayList4;
        java.lang.Object[] objArr;
        boolean I22;
        boolean I23;
        boolean I24;
        boolean I25;
        int i17;
        int i18;
        int i19;
        int i20;
        io.flutter.view.f fVar;
        io.flutter.view.f fVar2;
        java.lang.String str8;
        io.flutter.view.f fVar3;
        io.flutter.view.f fVar4;
        java.lang.String str9;
        boolean I26;
        io.flutter.view.g gVar6;
        int i21;
        io.flutter.view.g gVar7;
        int i22;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        float parseFloat;
        java.lang.String str13;
        java.lang.String str14;
        float parseFloat2;
        java.lang.String str15;
        boolean I27;
        boolean I28;
        boolean I29;
        int i23;
        int i24;
        int i25;
        java.lang.String str16;
        java.lang.String str17;
        int length;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        java.lang.String str18;
        int i34;
        int i35;
        i(true);
        if (i2 >= 65536) {
            return this.f7887d.createAccessibilityNodeInfo(i2);
        }
        java.util.HashMap hashMap = this.f7890g;
        android.view.View view = this.f7884a;
        if (i2 == -1) {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        io.flutter.view.g gVar8 = (io.flutter.view.g) hashMap.get(java.lang.Integer.valueOf(i2));
        if (gVar8 == null) {
            return null;
        }
        i3 = gVar8.f7866i;
        io.flutter.plugin.platform.h hVar = this.f7888e;
        if (i3 != -1) {
            i34 = gVar8.f7866i;
            if (hVar.d(i34)) {
                i35 = gVar8.f7866i;
                hVar.g(i35);
                return null;
            }
        }
        android.view.accessibility.AccessibilityNodeInfo obtain2 = android.view.accessibility.AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((gVar8.I(12) || (io.flutter.view.g.y(gVar8) == null && gVar8.f7860d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        str = gVar8.f7872o;
        if (str != null) {
            str18 = gVar8.f7872o;
            obtain2.setViewIdResourceName(str18);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        K2 = gVar8.K();
        obtain2.setFocusable(K2);
        io.flutter.view.g gVar9 = this.f7896m;
        if (gVar9 != null) {
            i33 = gVar9.f7856b;
            obtain2.setFocused(i33 == i2);
        }
        io.flutter.view.g gVar10 = this.f7892i;
        if (gVar10 != null) {
            i32 = gVar10.f7856b;
            obtain2.setAccessibilityFocused(i32 == i2);
        }
        I2 = gVar8.I(5);
        if (I2) {
            I27 = gVar8.I(11);
            obtain2.setPassword(I27);
            I28 = gVar8.I(21);
            if (!I28) {
                obtain2.setClassName("android.widget.EditText");
            }
            I29 = gVar8.I(21);
            obtain2.setEditable(!I29);
            i23 = gVar8.f7864g;
            if (i23 != -1) {
                i29 = gVar8.f7865h;
                if (i29 != -1) {
                    i30 = gVar8.f7864g;
                    i31 = gVar8.f7865h;
                    obtain2.setTextSelection(i30, i31);
                }
            }
            io.flutter.view.g gVar11 = this.f7892i;
            if (gVar11 != null) {
                i28 = gVar11.f7856b;
                if (i28 == i2) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (io.flutter.view.g.k(gVar8, io.flutter.view.e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i24 = 1;
            } else {
                i24 = 0;
            }
            if (io.flutter.view.g.k(gVar8, io.flutter.view.e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i24 = 1;
            }
            if (io.flutter.view.g.k(gVar8, io.flutter.view.e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i24 |= 2;
            }
            if (io.flutter.view.g.k(gVar8, io.flutter.view.e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i24 |= 2;
            }
            obtain2.setMovementGranularities(i24);
            i25 = gVar8.f7862e;
            if (i25 >= 0) {
                str16 = gVar8.f7875r;
                if (str16 == null) {
                    length = 0;
                } else {
                    str17 = gVar8.f7875r;
                    length = str17.length();
                }
                i26 = gVar8.f7863f;
                int i36 = length - i26;
                i27 = gVar8.f7862e;
                obtain2.setMaxTextLength(i27 + i36);
            }
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.COPY)) {
            obtain2.addAction(16384);
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.CUT)) {
            obtain2.addAction(65536);
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.PASTE)) {
            obtain2.addAction(32768);
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (io.flutter.view.g.o(gVar8)) {
            obtain2.setClassName("android.widget.Button");
        }
        I3 = gVar8.I(15);
        if (I3) {
            obtain2.setClassName("android.widget.ImageView");
        }
        int[] _values = B1.a._values();
        i4 = gVar8.f7834E;
        if (H.j.b(_values[i4]) == 23) {
            obtain2.setClassName("android.widget.ProgressBar");
            str10 = gVar8.f7875r;
            if (str10 != null) {
                str11 = gVar8.f7832C;
                try {
                    if (str11 != null) {
                        try {
                            str12 = gVar8.f7832C;
                            parseFloat = java.lang.Float.parseFloat(str12);
                        } catch (java.lang.NumberFormatException unused) {
                        }
                        str13 = gVar8.f7833D;
                        if (str13 != null) {
                            try {
                                str14 = gVar8.f7833D;
                                parseFloat2 = java.lang.Float.parseFloat(str14);
                            } catch (java.lang.NumberFormatException unused2) {
                            }
                            str15 = gVar8.f7875r;
                            obtain2.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, java.lang.Float.parseFloat(str15)));
                        }
                        parseFloat2 = Float.POSITIVE_INFINITY;
                        str15 = gVar8.f7875r;
                        obtain2.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, java.lang.Float.parseFloat(str15)));
                    }
                    str15 = gVar8.f7875r;
                    obtain2.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, parseFloat, parseFloat2, java.lang.Float.parseFloat(str15)));
                } catch (java.lang.NumberFormatException unused3) {
                    if (android.os.Build.VERSION.SDK_INT >= 36) {
                        obtain2.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(3, 0.0f, 0.0f, 0.0f));
                    } else {
                        obtain2.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                    }
                }
                parseFloat = Float.NEGATIVE_INFINITY;
                str13 = gVar8.f7833D;
                if (str13 != null) {
                }
                parseFloat2 = Float.POSITIVE_INFINITY;
            }
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        gVar = gVar8.f7850V;
        if (gVar != null) {
            gVar7 = gVar8.f7850V;
            i22 = gVar7.f7856b;
            obtain2.setParent(view, i22);
        } else {
            obtain2.setParent(view);
        }
        i5 = gVar8.G;
        if (i5 != -1) {
            i21 = gVar8.G;
            obtain2.setTraversalAfter(view, i21);
        }
        android.graphics.Rect f2 = io.flutter.view.g.f(gVar8);
        gVar2 = gVar8.f7850V;
        if (gVar2 != null) {
            gVar6 = gVar8.f7850V;
            android.graphics.Rect f3 = io.flutter.view.g.f(gVar6);
            android.graphics.Rect rect = new android.graphics.Rect(f2);
            rect.offset(-f3.left, -f3.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(f2);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(f2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        I4 = gVar8.I(7);
        if (I4) {
            I26 = gVar8.I(8);
            if (!I26) {
                z2 = false;
                obtain2.setEnabled(z2);
                if (io.flutter.view.g.k(gVar8, io.flutter.view.e.TAP)) {
                    I5 = gVar8.I(24);
                    if (I5) {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else {
                    fVar3 = gVar8.f7853Z;
                    if (fVar3 != null) {
                        fVar4 = gVar8.f7853Z;
                        str9 = fVar4.f7829e;
                        obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, str9));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                }
                if (io.flutter.view.g.k(gVar8, io.flutter.view.e.LONG_PRESS)) {
                    fVar = gVar8.f7855a0;
                    if (fVar != null) {
                        fVar2 = gVar8.f7855a0;
                        str8 = fVar2.f7829e;
                        obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, str8));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                eVar = io.flutter.view.e.SCROLL_LEFT;
                k2 = io.flutter.view.g.k(gVar8, eVar);
                eVar2 = io.flutter.view.e.SCROLL_RIGHT;
                io.flutter.view.e eVar5 = io.flutter.view.e.SCROLL_DOWN;
                io.flutter.view.e eVar6 = io.flutter.view.e.SCROLL_UP;
                if (!k2 || io.flutter.view.g.k(gVar8, eVar6) || io.flutter.view.g.k(gVar8, eVar2) || io.flutter.view.g.k(gVar8, eVar5)) {
                    obtain2.setScrollable(true);
                    I6 = gVar8.I(19);
                    if (I6) {
                        if (io.flutter.view.g.k(gVar8, eVar) || io.flutter.view.g.k(gVar8, eVar2)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (j(gVar8)) {
                    if (io.flutter.view.g.k(gVar8, eVar) || io.flutter.view.g.k(gVar8, eVar2)) {
                        if (android.os.Build.VERSION.SDK_INT < 33) {
                            i18 = gVar8.f7867j;
                            obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(1, i18, false));
                        } else {
                            B1.a.k();
                            i17 = gVar8.f7867j;
                            obtain2.setCollectionInfo(P0.o.v(i17));
                        }
                    } else if (android.os.Build.VERSION.SDK_INT < 33) {
                        i20 = gVar8.f7867j;
                        obtain2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i20, 1, false));
                    } else {
                        B1.a.k();
                        i19 = gVar8.f7867j;
                        obtain2.setCollectionInfo(P0.o.l(i19));
                    }
                }
                gVar3 = gVar8.f7850V;
                if (gVar3 != null && j(gVar3) && gVar8.f7850V.I(19)) {
                    gVar5 = gVar8.f7850V;
                    arrayList4 = gVar5.f7851W;
                    objArr = io.flutter.view.g.k(gVar5, eVar) && !io.flutter.view.g.k(gVar5, eVar2);
                    int indexOf = arrayList4.indexOf(gVar8);
                    if (objArr == true) {
                        if (android.os.Build.VERSION.SDK_INT < 33) {
                            I23 = gVar8.I(10);
                            obtain2.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, I23));
                        } else {
                            B1.a.n();
                            I22 = gVar8.I(10);
                            obtain2.setCollectionItemInfo(P0.o.w(indexOf, I22));
                        }
                    } else if (android.os.Build.VERSION.SDK_INT < 33) {
                        I25 = gVar8.I(10);
                        obtain2.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, I25));
                    } else {
                        B1.a.n();
                        I24 = gVar8.I(10);
                        obtain2.setCollectionItemInfo(P0.o.m(indexOf, I24));
                    }
                }
                if (!io.flutter.view.g.k(gVar8, eVar) || io.flutter.view.g.k(gVar8, eVar6)) {
                    obtain2.addAction(io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
                }
                if (!io.flutter.view.g.k(gVar8, eVar2) || io.flutter.view.g.k(gVar8, eVar5)) {
                    obtain2.addAction(8192);
                }
                eVar3 = io.flutter.view.e.INCREASE;
                k3 = io.flutter.view.g.k(gVar8, eVar3);
                eVar4 = io.flutter.view.e.DECREASE;
                if (!k3 || io.flutter.view.g.k(gVar8, eVar4)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (io.flutter.view.g.k(gVar8, eVar3)) {
                        obtain2.addAction(io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
                    }
                    if (io.flutter.view.g.k(gVar8, eVar4)) {
                        obtain2.addAction(8192);
                    }
                }
                I7 = gVar8.I(16);
                if (I7) {
                    obtain2.setLiveRegion(1);
                }
                I8 = gVar8.I(5);
                if (I8) {
                    I9 = gVar8.I(12);
                    if (!I9) {
                        java.lang.CharSequence y2 = io.flutter.view.g.y(gVar8);
                        if (android.os.Build.VERSION.SDK_INT < 28) {
                            str2 = gVar8.f7882z;
                            if (str2 != null) {
                                java.lang.CharSequence charSequence = y2 != null ? y2 : "";
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append((java.lang.Object) charSequence);
                                sb.append("\n");
                                str3 = gVar8.f7882z;
                                sb.append(str3);
                                y2 = sb.toString();
                            }
                        }
                        if (y2 != null) {
                            obtain2.setContentDescription(y2);
                        }
                    }
                } else {
                    obtain2.setText(io.flutter.view.g.w(gVar8));
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        obtain2.setHintText(io.flutter.view.g.x(gVar8));
                    }
                }
                i6 = android.os.Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    str5 = gVar8.f7882z;
                    if (str5 != null) {
                        str6 = gVar8.f7882z;
                        obtain2.setTooltipText(str6);
                        if (io.flutter.view.g.y(gVar8) == null) {
                            str7 = gVar8.f7882z;
                            obtain2.setContentDescription(str7);
                        }
                    }
                }
                I10 = gVar8.I(1);
                I11 = gVar8.I(17);
                obtain2.setCheckable(!I10 || I11);
                if (I10) {
                    if (I11) {
                        obtain2.setClassName("android.widget.Switch");
                        i7 = 36;
                        if (i6 >= 36) {
                            I13 = gVar8.I(18);
                            obtain2.setChecked(I13 ? 1 : 0);
                        } else {
                            I12 = gVar8.I(18);
                            obtain2.setChecked(I12);
                        }
                    } else {
                        i7 = 36;
                    }
                    i8 = 3;
                } else {
                    I18 = gVar8.I(9);
                    if (I18) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                    if (i6 >= 36) {
                        I20 = gVar8.I(26);
                        if (I20) {
                            i16 = 2;
                        } else {
                            I21 = gVar8.I(2);
                            i16 = I21 ? 1 : 0;
                        }
                        obtain2.setChecked(i16);
                    } else {
                        I19 = gVar8.I(2);
                        obtain2.setChecked(I19);
                    }
                    i8 = 3;
                    i7 = 36;
                }
                I14 = gVar8.I(i8);
                obtain2.setSelected(I14);
                if (i6 >= i7) {
                    I16 = gVar8.I(27);
                    if (I16) {
                        I17 = gVar8.I(28);
                        if (!I17) {
                            i8 = 1;
                        }
                        obtain2.setExpandedState(i8);
                        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                }
                if (i6 >= 28) {
                    i15 = gVar8.f7835F;
                    obtain2.setHeading(i15 > 0);
                }
                gVar4 = this.f7892i;
                if (gVar4 != null) {
                    i14 = gVar4.f7856b;
                    if (i14 == i2) {
                        obtain2.addAction(128);
                        arrayList = gVar8.Y;
                        if (arrayList != null) {
                            arrayList3 = gVar8.Y;
                            java.util.Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                io.flutter.view.f fVar5 = (io.flutter.view.f) it2.next();
                                i13 = fVar5.f7825a;
                                str4 = fVar5.f7828d;
                                obtain2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i13, str4));
                            }
                        }
                        arrayList2 = gVar8.f7851W;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            io.flutter.view.g gVar12 = (io.flutter.view.g) it.next();
                            I15 = gVar12.I(14);
                            if (!I15) {
                                i9 = gVar12.f7866i;
                                if (i9 != -1) {
                                    i11 = gVar12.f7866i;
                                    hVar.g(i11);
                                    i12 = gVar12.f7866i;
                                    hVar.d(i12);
                                }
                                i10 = gVar12.f7856b;
                                obtain2.addChild(view, i10);
                            }
                        }
                        return obtain2;
                    }
                }
                obtain2.addAction(64);
                arrayList = gVar8.Y;
                if (arrayList != null) {
                }
                arrayList2 = gVar8.f7851W;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                return obtain2;
            }
        }
        z2 = true;
        obtain2.setEnabled(z2);
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.TAP)) {
        }
        if (io.flutter.view.g.k(gVar8, io.flutter.view.e.LONG_PRESS)) {
        }
        eVar = io.flutter.view.e.SCROLL_LEFT;
        k2 = io.flutter.view.g.k(gVar8, eVar);
        eVar2 = io.flutter.view.e.SCROLL_RIGHT;
        io.flutter.view.e eVar52 = io.flutter.view.e.SCROLL_DOWN;
        io.flutter.view.e eVar62 = io.flutter.view.e.SCROLL_UP;
        if (!k2) {
        }
        obtain2.setScrollable(true);
        I6 = gVar8.I(19);
        if (I6) {
        }
        if (j(gVar8)) {
        }
        gVar3 = gVar8.f7850V;
        if (gVar3 != null) {
            gVar5 = gVar8.f7850V;
            arrayList4 = gVar5.f7851W;
            if (io.flutter.view.g.k(gVar5, eVar)) {
            }
            int indexOf2 = arrayList4.indexOf(gVar8);
            if (objArr == true) {
            }
        }
        if (!io.flutter.view.g.k(gVar8, eVar)) {
        }
        obtain2.addAction(io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
        if (!io.flutter.view.g.k(gVar8, eVar2)) {
        }
        obtain2.addAction(8192);
        eVar3 = io.flutter.view.e.INCREASE;
        k3 = io.flutter.view.g.k(gVar8, eVar3);
        eVar4 = io.flutter.view.e.DECREASE;
        if (!k3) {
        }
        obtain2.setClassName("android.widget.SeekBar");
        if (io.flutter.view.g.k(gVar8, eVar3)) {
        }
        if (io.flutter.view.g.k(gVar8, eVar4)) {
        }
        I7 = gVar8.I(16);
        if (I7) {
        }
        I8 = gVar8.I(5);
        if (I8) {
        }
        i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 28) {
        }
        I10 = gVar8.I(1);
        I11 = gVar8.I(17);
        obtain2.setCheckable(!I10 || I11);
        if (I10) {
        }
        I14 = gVar8.I(i8);
        obtain2.setSelected(I14);
        if (i6 >= i7) {
        }
        if (i6 >= 28) {
        }
        gVar4 = this.f7892i;
        if (gVar4 != null) {
        }
        obtain2.addAction(64);
        arrayList = gVar8.Y;
        if (arrayList != null) {
        }
        arrayList2 = gVar8.f7851W;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return obtain2;
    }

    public final android.view.accessibility.AccessibilityEvent d(int i2, int i3) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i3);
        P0.t tVar = this.f7884a;
        obtain.setPackageName(tVar.getContext().getPackageName());
        obtain.setSource(tVar, i2);
        return obtain;
    }

    public final boolean e(android.view.MotionEvent motionEvent, boolean z2) {
        io.flutter.view.g J2;
        if (!this.f7886c.isTouchExplorationEnabled()) {
            return false;
        }
        java.util.HashMap hashMap = this.f7890g;
        if (hashMap.isEmpty()) {
            return false;
        }
        io.flutter.view.g J3 = ((io.flutter.view.g) hashMap.get(0)).J(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (J3 != null && J3.f7866i != -1) {
            if (z2) {
                return false;
            }
            return this.f7887d.onAccessibilityHoverEvent(J3.f7856b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (J2 = ((io.flutter.view.g) hashMap.get(0)).J(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f7898o) {
                if (J2 != null) {
                    g(J2.f7856b, 128);
                }
                io.flutter.view.g gVar = this.f7898o;
                if (gVar != null) {
                    g(gVar.f7856b, 256);
                }
                this.f7898o = J2;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            io.flutter.view.g gVar2 = this.f7898o;
            if (gVar2 != null) {
                g(gVar2.f7856b, 256);
                this.f7898o = null;
            }
        }
        return true;
    }

    public final boolean f(io.flutter.view.g gVar, int i2, android.os.Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = gVar.f7864g;
        int i6 = gVar.f7865h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                gVar.f7865h = gVar.f7875r.length();
                            } else {
                                gVar.f7865h = 0;
                            }
                        }
                    } else if (z2 && i6 < gVar.f7875r.length()) {
                        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?!^)(\\n)").matcher(gVar.f7875r.substring(gVar.f7865h));
                        if (matcher.find()) {
                            gVar.f7865h += matcher.start(1);
                        } else {
                            gVar.f7865h = gVar.f7875r.length();
                        }
                    } else if (!z2 && gVar.f7865h > 0) {
                        java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f7875r.substring(0, gVar.f7865h));
                        if (matcher2.find()) {
                            gVar.f7865h = matcher2.start(1);
                        } else {
                            gVar.f7865h = 0;
                        }
                    }
                } else if (z2 && i6 < gVar.f7875r.length()) {
                    java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile("\\p{L}(\\b)").matcher(gVar.f7875r.substring(gVar.f7865h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f7865h += matcher3.start(1);
                    } else {
                        gVar.f7865h = gVar.f7875r.length();
                    }
                } else if (!z2 && gVar.f7865h > 0) {
                    java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f7875r.substring(0, gVar.f7865h));
                    if (matcher4.find()) {
                        gVar.f7865h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < gVar.f7875r.length()) {
                gVar.f7865h++;
            } else if (!z2 && (i3 = gVar.f7865h) > 0) {
                gVar.f7865h = i3 - 1;
            }
            if (!z3) {
                gVar.f7864g = gVar.f7865h;
            }
        }
        if (i5 != gVar.f7864g || i6 != gVar.f7865h) {
            java.lang.String str = gVar.f7875r;
            if (str == null) {
                str = "";
            }
            android.view.accessibility.AccessibilityEvent d2 = d(gVar.f7856b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(gVar.f7864g);
            d2.setToIndex(gVar.f7865h);
            d2.setItemCount(str.length());
            h(d2);
        }
        I0.b bVar = this.f7885b;
        if (i4 == 1) {
            if (z2) {
                io.flutter.view.e eVar = io.flutter.view.e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (io.flutter.view.g.k(gVar, eVar)) {
                    bVar.x(i2, eVar, java.lang.Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                io.flutter.view.e eVar2 = io.flutter.view.e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (io.flutter.view.g.k(gVar, eVar2)) {
                    bVar.x(i2, eVar2, java.lang.Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                io.flutter.view.e eVar3 = io.flutter.view.e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (io.flutter.view.g.k(gVar, eVar3)) {
                    bVar.x(i2, eVar3, java.lang.Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                io.flutter.view.e eVar4 = io.flutter.view.e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (io.flutter.view.g.k(gVar, eVar4)) {
                    bVar.x(i2, eVar4, java.lang.Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 4 || i4 == 8 || i4 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            io.flutter.view.g gVar = this.f7896m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f7856b);
            }
        } else if (i2 != 2) {
            return null;
        }
        io.flutter.view.g gVar2 = this.f7892i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f7856b);
        }
        java.lang.Integer num = this.f7893j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f7886c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.f7886c.isEnabled()) {
            android.view.View view = this.f7884a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f7902s == z2) {
            return;
        }
        this.f7902s = z2;
        if (z2) {
            this.f7894k |= 1;
        } else {
            this.f7894k &= -2;
        }
        ((io.flutter.embedding.engine.FlutterJNI) this.f7885b.f658c).setAccessibilityFeatures(this.f7894k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(io.flutter.view.g gVar) {
        if (gVar.f7867j <= 1) {
            return false;
        }
        io.flutter.view.g gVar2 = this.f7892i;
        io.flutter.view.g gVar3 = null;
        if (gVar2 != null) {
            io.flutter.view.g gVar4 = gVar2.f7850V;
            while (true) {
                if (gVar4 == null) {
                    gVar4 = null;
                    break;
                }
                if (gVar4 == gVar) {
                    break;
                }
                gVar4 = gVar4.f7850V;
            }
        }
        io.flutter.view.g gVar5 = this.f7892i;
        io.flutter.view.a aVar = new io.flutter.view.a();
        if (gVar5 != null) {
            io.flutter.view.g gVar6 = gVar5.f7850V;
            while (true) {
                if (gVar6 == null) {
                    break;
                }
                if (aVar.test(gVar6)) {
                    gVar3 = gVar6;
                    break;
                }
                gVar6 = gVar6.f7850V;
            }
            if (gVar3 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, android.os.Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f7887d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f7893j = null;
            }
            return performAction;
        }
        java.util.HashMap hashMap = this.f7890g;
        io.flutter.view.g gVar = (io.flutter.view.g) hashMap.get(java.lang.Integer.valueOf(i2));
        if (gVar == null) {
            return false;
        }
        io.flutter.view.e eVar = io.flutter.view.e.INCREASE;
        io.flutter.view.e eVar2 = io.flutter.view.e.DECREASE;
        I0.b bVar = this.f7885b;
        switch (i3) {
            case 16:
                bVar.w(i2, io.flutter.view.e.TAP);
                return true;
            case 32:
                bVar.w(i2, io.flutter.view.e.LONG_PRESS);
                return true;
            case 64:
                if (this.f7892i == null) {
                    this.f7884a.invalidate();
                }
                this.f7892i = gVar;
                bVar.w(i2, io.flutter.view.e.DID_GAIN_ACCESSIBILITY_FOCUS);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", java.lang.Integer.valueOf(gVar.f7856b));
                ((F.C0014n) bVar.f657b).g(hashMap2, null);
                g(i2, 32768);
                if (io.flutter.view.g.k(gVar, eVar) || io.flutter.view.g.k(gVar, eVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                io.flutter.view.g gVar2 = this.f7892i;
                if (gVar2 != null && gVar2.f7856b == i2) {
                    this.f7892i = null;
                }
                java.lang.Integer num = this.f7893j;
                if (num != null && num.intValue() == i2) {
                    this.f7893j = null;
                }
                bVar.w(i2, io.flutter.view.e.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i2, 65536);
                return true;
            case 256:
                return f(gVar, i2, bundle, true);
            case 512:
                return f(gVar, i2, bundle, false);
            case io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE /* 4096 */:
                io.flutter.view.e eVar3 = io.flutter.view.e.SCROLL_UP;
                if (io.flutter.view.g.k(gVar, eVar3)) {
                    bVar.w(i2, eVar3);
                } else {
                    io.flutter.view.e eVar4 = io.flutter.view.e.SCROLL_LEFT;
                    if (io.flutter.view.g.k(gVar, eVar4)) {
                        bVar.w(i2, eVar4);
                    } else {
                        if (!io.flutter.view.g.k(gVar, eVar)) {
                            return false;
                        }
                        gVar.f7875r = gVar.t;
                        gVar.f7876s = gVar.f7877u;
                        g(i2, 4);
                        bVar.w(i2, eVar);
                    }
                }
                return true;
            case 8192:
                io.flutter.view.e eVar5 = io.flutter.view.e.SCROLL_DOWN;
                if (io.flutter.view.g.k(gVar, eVar5)) {
                    bVar.w(i2, eVar5);
                } else {
                    io.flutter.view.e eVar6 = io.flutter.view.e.SCROLL_RIGHT;
                    if (io.flutter.view.g.k(gVar, eVar6)) {
                        bVar.w(i2, eVar6);
                    } else {
                        if (!io.flutter.view.g.k(gVar, eVar2)) {
                            return false;
                        }
                        gVar.f7875r = gVar.f7878v;
                        gVar.f7876s = gVar.f7879w;
                        g(i2, 4);
                        bVar.w(i2, eVar2);
                    }
                }
                return true;
            case 16384:
                bVar.w(i2, io.flutter.view.e.COPY);
                return true;
            case 32768:
                bVar.w(i2, io.flutter.view.e.PASTE);
                return true;
            case 65536:
                bVar.w(i2, io.flutter.view.e.CUT);
                return true;
            case 131072:
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", java.lang.Integer.valueOf(gVar.f7865h));
                    hashMap3.put("extent", java.lang.Integer.valueOf(gVar.f7865h));
                }
                bVar.x(i2, io.flutter.view.e.SET_SELECTION, hashMap3);
                io.flutter.view.g gVar3 = (io.flutter.view.g) hashMap.get(java.lang.Integer.valueOf(i2));
                gVar3.f7864g = ((java.lang.Integer) hashMap3.get("base")).intValue();
                gVar3.f7865h = ((java.lang.Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                bVar.w(i2, io.flutter.view.e.EXPAND);
                return true;
            case 524288:
                bVar.w(i2, io.flutter.view.e.COLLAPSE);
                return true;
            case 1048576:
                bVar.w(i2, io.flutter.view.e.DISMISS);
                return true;
            case 2097152:
                java.lang.String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                bVar.x(i2, io.flutter.view.e.SET_TEXT, string);
                gVar.f7875r = string;
                gVar.f7876s = null;
                return true;
            case android.R.id.accessibilityActionShowOnScreen:
                bVar.w(i2, io.flutter.view.e.SHOW_ON_SCREEN);
                return true;
            default:
                io.flutter.view.f fVar = (io.flutter.view.f) this.f7891h.get(java.lang.Integer.valueOf(i3 - 267386881));
                if (fVar == null) {
                    return false;
                }
                bVar.x(i2, io.flutter.view.e.CUSTOM_ACTION, java.lang.Integer.valueOf(fVar.f7826b));
                return true;
        }
    }
}
