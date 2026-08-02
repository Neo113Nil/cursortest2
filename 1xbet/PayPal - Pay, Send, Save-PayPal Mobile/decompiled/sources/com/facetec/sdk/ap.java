package com.facetec.sdk;

/* loaded from: classes8.dex */
class ap {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static /* synthetic */ boolean f3392a;
    private static volatile boolean b;
    private static int c;
    private static char[] d;
    private static final java.util.concurrent.Semaphore e;
    private static int f;
    private static char[] g;
    private static long h;
    private static boolean i;
    private static boolean j;
    private static int l;
    private static int m;
    private static int n;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i2, short s, short s2) {
        int i3;
        int i4 = i2 * 2;
        int i5 = s + 65;
        int i6 = 3 - (s2 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i4;
            i5 = (-i5) + i9;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            int i10 = i6 + 1;
            int i11 = bArr[i10];
            i9 = i5;
            i5 = i11;
            i8 = i3 + 1;
            i7 = i10;
            i5 = (-i5) + i9;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object e(int i2, java.lang.Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~((~i7) | i4);
        int i9 = ~((~i4) | i2);
        int i10 = i9 | i8;
        int i11 = i9 | (~((~i2) | i4));
        int i12 = i4 + i2 + i3 + (762724209 * i5) + (1201824936 * i6);
        int i13 = i12 * i12;
        int i14 = ((162561953 * i4) - 555857873) + (162559997 * i2) + (i8 * 1956) + (i10 * (-1956)) + (i11 * 978) + (162560975 * i3) + (701011807 * i5) + (237771736 * i6) + ((-223608832) * i13);
        int i15 = (i4 * (-126223985)) + 43253760 + (i2 * 1339426419) + (i8 * (-1465650404)) + (i10 * 1465650404) + (i11 * 1414658446) + (i3 * (-1540882432)) + (i5 * 1302855680) + (i6 * 1514143744) + (i13 * 1905524736) + (i14 * i14 * 703332352);
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 != 2) {
            return c(objArr);
        }
        android.content.Context context = (android.content.Context) objArr[0];
        n = (f + 93) % 128;
        final android.content.Context applicationContext = context.getApplicationContext();
        com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ap$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ap.a(applicationContext);
            }
        });
        f = (n + 97) % 128;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{117, 43, 38, 84};
        $$b = 2;
    }

    ap() {
    }

    static /* synthetic */ void b(android.content.Context context, java.lang.String str, long j2, java.lang.String str2, java.lang.String str3) {
        int i2 = f + 69;
        n = i2 % 128;
        e(context, str, j2, str2, str3);
        if (i2 % 2 != 0) {
            n = (f + 117) % 128;
        } else {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static /* synthetic */ boolean d() {
        int i2 = f + 11;
        n = i2 % 128;
        if (i2 % 2 != 0) {
            return b;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        l = 0;
        m = 1;
        f = 0;
        n = 1;
        b();
        l = (m + 59) % 128;
        f3392a = true;
        e = new java.util.concurrent.Semaphore(1);
        b = false;
        int i2 = l + 15;
        m = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
    }

    static void e(android.content.Context context, com.facetec.sdk.ar arVar) {
        f = (n + 57) % 128;
        a(context, arVar, true, null);
        f = (n + 115) % 128;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        java.lang.String str;
        java.lang.Object obj;
        final android.content.Context context = (android.content.Context) objArr[0];
        final java.lang.String str2 = (java.lang.String) objArr[1];
        final java.lang.String str3 = (java.lang.String) objArr[2];
        final java.lang.String str4 = (java.lang.String) objArr[3];
        final boolean booleanValue = ((java.lang.Boolean) objArr[4]).booleanValue();
        final long longValue = ((java.lang.Number) objArr[5]).longValue();
        final java.lang.Runnable runnable = (java.lang.Runnable) objArr[6];
        com.facetec.sdk.ms msVar = (com.facetec.sdk.ms) com.facetec.sdk.aw.b(new java.lang.Object[]{context}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), -1657118186, 1657118187, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        o(45 - (android.os.Process.myPid() >> 22), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56021), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 10, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(com.facetec.sdk.bj.f3423a);
        java.lang.String obj2 = sb.toString();
        com.facetec.sdk.mp.a aVar = new com.facetec.sdk.mp.a();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        o(android.view.KeyEvent.getDeadChar(0, 0) + 1, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 54 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
        com.facetec.sdk.mp.a a2 = aVar.a(((java.lang.String) objArr3[0]).intern(), str2);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        o(19 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 42982), android.graphics.Color.green(0) + 55, objArr4);
        a2.a(((java.lang.String) objArr4[0]).intern(), str3);
        if (str4 != null) {
            int i2 = f + 31;
            n = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                o((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 84, (char) (53948 % android.view.KeyEvent.keyCodeFromString("")), 25 >>> (android.view.ViewConfiguration.getJumpTapTimeout() * 58), objArr5);
                obj = objArr5[0];
            } else {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                o((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, (char) (android.view.KeyEvent.keyCodeFromString("") + 53948), 74 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
                obj = objArr6[0];
            }
            a2.a(((java.lang.String) obj).intern(), str4);
        }
        try {
            str = str4;
            try {
                msVar.d(com.facetec.sdk.g.e(context, obj2).a(a2.c()).c()).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.ap.4
                    @Override // com.facetec.sdk.mg
                    public final void c(java.io.IOException iOException) {
                        if (booleanValue) {
                            com.facetec.sdk.ap.b(context, str2, longValue, str3, str4);
                        }
                        java.lang.Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override // com.facetec.sdk.mg
                    public final void d(com.facetec.sdk.mw mwVar) throws java.io.IOException {
                        if (com.facetec.sdk.ap.d()) {
                            com.facetec.sdk.ap.c(context);
                        }
                    }
                });
                f = (n + 63) % 128;
                return null;
            } catch (com.facetec.sdk.g.a unused) {
                e(context, str2, longValue, str3, str);
                return null;
            }
        } catch (com.facetec.sdk.g.a unused2) {
            str = str4;
        }
    }

    private static void o(int i2, char c2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        $10 = ($11 + 21) % 128;
        while (hhVar.e < i2) {
            $10 = ($11 + 45) % 128;
            int i4 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(g[i3 + i4])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    char myTid = (char) ((android.os.Process.myTid() >> 22) + 45150);
                    int myPid = android.os.Process.myPid();
                    int myPid2 = android.os.Process.myPid();
                    byte b2 = (byte) ($$b - 2);
                    d2 = com.facetec.sdk.al.c(myTid, 2150 - (myPid >> 22), (myPid2 >> 22) + 24, 1926116241, false, $$c(b2, (byte) (b2 | 40), b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(h), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                    int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                    byte b3 = (byte) ($$b - 2);
                    d3 = com.facetec.sdk.al.c(scrollBarSize, bitsPerPixel + 1835, 24 - (minimumFlingVelocity >> 16), -1880730373, false, $$c(b3, (byte) (b3 | 41), b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    char c3 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                    byte b4 = (byte) ($$b - 2);
                    d4 = com.facetec.sdk.al.c(c3, deadChar + 2341, argb + 24, -1839099840, false, $$c(b4, (byte) (b4 | 37), b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                char lastIndexOf = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                int myTid2 = android.os.Process.myTid();
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                byte b5 = (byte) ($$b - 2);
                d5 = com.facetec.sdk.al.c(lastIndexOf, 2341 - (myTid2 >> 22), 24 - offsetBefore, -1839099840, false, $$c(b5, (byte) (b5 | 37), b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void a(final android.content.Context context, com.facetec.sdk.ar arVar, boolean z, final java.lang.Runnable runnable) {
        int i2 = f + 87;
        n = i2 % 128;
        java.lang.String str = null;
        if (i2 % 2 != 0) {
            if (com.facetec.sdk.bj.c()) {
                final java.lang.String e2 = com.facetec.sdk.cd.e(a(arVar));
                final long time = new java.util.Date().getTime();
                if (arVar.b()) {
                    f = (n + 57) % 128;
                    str = com.facetec.sdk.cn.b;
                }
                final java.lang.String str2 = com.facetec.sdk.cn.e;
                if (com.facetec.sdk.bj.f3423a == null) {
                    e(context, e2, time, str2, str);
                }
                final boolean z2 = true;
                final java.lang.String str3 = str;
                com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.ap$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.ap.d(context, e2, str2, str3, z2, time, runnable);
                    }
                });
                return;
            }
            return;
        }
        com.facetec.sdk.bj.c();
        str.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(android.content.Context context) {
        java.util.List<com.facetec.sdk.ap.d> list;
        try {
            try {
                java.util.concurrent.Semaphore semaphore = e;
                semaphore.acquire();
                list = c(context, java.lang.Boolean.TRUE);
                semaphore.release();
                n = (f + 91) % 128;
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                e.release();
                list = null;
            }
            if (list != null) {
                n = (f + 85) % 128;
                if (list.isEmpty()) {
                    return;
                }
                int i2 = f + 43;
                n = i2 % 128;
                if (i2 % 2 != 0) {
                    e(context, list);
                } else {
                    e(context, list);
                    throw null;
                }
            }
        } catch (java.lang.Throwable th) {
            e.release();
            throw th;
        }
    }

    private static void e(android.content.Context context, java.util.List<com.facetec.sdk.ap.d> list) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(null, null, 128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0091\u0092\u0088\u0094\u0093\u0093\u008b\u0086\u0092\u008b\u0088\u0084\u0084\u0091\u0084\u0086\u008c\u008b\u008b\u008a\u0086\u0090\u008f\u0086\u0088\u0083\u0087\u0086\u008c\u008b\u008e\u0089\u0081\u0082\u008d\u0087\u008c\u008b\u008b\u008a\u0089\u0088\u0083\u0087\u0086\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            ((com.facetec.sdk.ms) com.facetec.sdk.aw.b(new java.lang.Object[]{context}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), -1657118186, 1657118187, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b())).d(com.facetec.sdk.g.e(context, intern, list)).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.ap.2
                @Override // com.facetec.sdk.mg
                public final void c(java.io.IOException iOException) {
                }

                @Override // com.facetec.sdk.mg
                public final void d(com.facetec.sdk.mw mwVar) throws java.io.IOException {
                }
            });
            f = (n + 53) % 128;
        } catch (com.facetec.sdk.g.a e2) {
            android.view.ViewConfiguration.getWindowTouchSlop();
            e2.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0019, code lost:
    
        r1 = r1.getBytes("ISO-8859-1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0017, code lost:
    
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(java.lang.String str, int[] iArr, int i2, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i3 = $10 + 33;
        $11 = i3 % 128;
        byte[] bArr = str3;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
            bArr = str3;
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 65) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
        char[] cArr3 = d;
        float f2 = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                    if (d2 == null) {
                        byte b2 = (byte) ($$b - 2);
                        byte b3 = b2;
                        d2 = com.facetec.sdk.al.c((char) (android.media.AudioTrack.getMinVolume() > f2 ? 1 : (android.media.AudioTrack.getMinVolume() == f2 ? 0 : -1)), 1810 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1157014744, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    i5++;
                    f2 = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(c)};
        java.lang.Object d3 = com.facetec.sdk.al.d(-1796435875);
        if (d3 == null) {
            char alpha = (char) android.graphics.Color.alpha(0);
            int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
            byte b4 = (byte) ($$b - 2);
            byte b5 = (byte) (b4 + 1);
            d3 = com.facetec.sdk.al.c(alpha, keyCodeFromString + 662, 23 - absoluteGravity, 855894693, false, $$c(b4, b5, (byte) (b5 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
        if (!i) {
            if (!j) {
                hnVar.c = iArr.length;
                char[] cArr5 = new char[hnVar.c];
                hnVar.f3629a = 0;
                $10 = ($11 + 77) % 128;
                while (hnVar.f3629a < hnVar.c) {
                    cArr5[hnVar.f3629a] = (char) (cArr3[iArr[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
                    hnVar.f3629a++;
                }
                objArr[0] = new java.lang.String(cArr5);
                return;
            }
            int i6 = $10 + 75;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            hnVar.c = cArr2.length;
            char[] cArr6 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr6[hnVar.f3629a] = (char) (cArr3[cArr2[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
                java.lang.Object[] objArr4 = {hnVar, hnVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(870267758);
                if (d4 == null) {
                    char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                    int resolveSize = android.view.View.resolveSize(0, 0);
                    byte b6 = (byte) ($$b - 2);
                    d4 = com.facetec.sdk.al.c(windowTouchSlop, 1235 - packedPositionChild, resolveSize + 24, -1808776810, false, $$c(b6, (byte) (b6 | 57), b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        hnVar.c = bArr2.length;
        char[] cArr7 = new char[hnVar.c];
        hnVar.f3629a = 0;
        int i8 = $10 + 13;
        $11 = i8 % 128;
        int i9 = 2;
        int i10 = i8 % 2;
        while (hnVar.f3629a < hnVar.c) {
            int i11 = $11 + 75;
            $10 = i11 % 128;
            if (i11 % i9 != 0) {
                int i12 = hnVar.f3629a;
                int i13 = hnVar.c;
                cArr7[i12] = (char) (cArr3[bArr2[0 % hnVar.f3629a] % i2] >>> intValue);
                java.lang.Object[] objArr5 = {hnVar, hnVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                if (d5 == null) {
                    char c2 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int blue = android.graphics.Color.blue(0);
                    int myPid = android.os.Process.myPid();
                    byte b7 = (byte) ($$b - 2);
                    d5 = com.facetec.sdk.al.c(c2, 1236 - blue, (myPid >> 22) + 24, -1808776810, false, $$c(b7, (byte) (b7 | 57), b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
            } else {
                cArr7[hnVar.f3629a] = (char) (cArr3[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i2] - intValue);
                java.lang.Object[] objArr6 = {hnVar, hnVar};
                java.lang.Object d6 = com.facetec.sdk.al.d(870267758);
                if (d6 == null) {
                    char packedPositionGroup = (char) android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int myTid = android.os.Process.myTid();
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                    byte b8 = (byte) ($$b - 2);
                    d6 = com.facetec.sdk.al.c(packedPositionGroup, (myTid >> 22) + 1236, offsetBefore + 24, -1808776810, false, $$c(b8, (byte) (b8 | 57), b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d6).invoke(null, objArr6);
            }
            i9 = 2;
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private static void e(android.content.Context context, java.lang.String str, long j2, java.lang.String str2, java.lang.String str3) {
        a(context, java.util.Collections.singletonList(new com.facetec.sdk.ap.d(str, j2, str2, str3)));
        f = (n + 119) % 128;
    }

    private static void a(android.content.Context context, java.util.List<com.facetec.sdk.ap.d> list) {
        int i2 = n + 15;
        f = i2 % 128;
        try {
            try {
                if (i2 % 2 != 0) {
                    java.util.concurrent.Semaphore semaphore = e;
                    semaphore.acquire();
                    java.util.List<com.facetec.sdk.ap.d> c2 = c(context, java.lang.Boolean.FALSE);
                    c2.addAll(list);
                    c(context, c2);
                    b = true;
                    semaphore.release();
                    return;
                }
                java.util.concurrent.Semaphore semaphore2 = e;
                semaphore2.acquire();
                java.util.List<com.facetec.sdk.ap.d> c3 = c(context, java.lang.Boolean.FALSE);
                c3.addAll(list);
                c(context, c3);
                b = true;
                semaphore2.release();
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
                e.release();
            }
        } catch (java.lang.Throwable th) {
            e.release();
            throw th;
        }
    }

    private static void c(android.content.Context context, java.util.List<com.facetec.sdk.ap.d> list) throws java.lang.Exception {
        java.lang.String c2 = new com.facetec.sdk.eo().c(list);
        com.facetec.sdk.bm.b(new java.io.File(context.getCacheDir(), e()), b(context), c2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        n = (f + 13) % 128;
    }

    private static java.util.List<com.facetec.sdk.ap.d> c(android.content.Context context, java.lang.Boolean bool) throws java.lang.Exception {
        java.io.File file = new java.io.File(context.getCacheDir(), e());
        if (!file.exists()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            f = (n + 115) % 128;
            return arrayList;
        }
        java.lang.Object[] objArr = {file, b(context)};
        int d2 = com.facetec.sdk.gh.b.d();
        int d3 = com.facetec.sdk.gh.b.d();
        com.facetec.sdk.ap.d[] dVarArr = (com.facetec.sdk.ap.d[]) new com.facetec.sdk.eo().e(new java.lang.String((byte[]) com.facetec.sdk.bm.c(objArr, com.facetec.sdk.gh.b.d(), -1300678471, com.facetec.sdk.gh.b.d(), 1300678472, d2, d3), java.nio.charset.StandardCharsets.UTF_8), com.facetec.sdk.ap.d[].class);
        if (bool.booleanValue()) {
            file.delete();
            b = false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(dVarArr));
        int i2 = n + 17;
        f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return arrayList2;
    }

    private static java.lang.String e() {
        f = (n + 19) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(null, null, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u009b£\u008d\u009f¢¡ \u009f\u008e\u008a\u009e\u009d\u009c\u0093\u0090\u009b\u009a\u0082\u0093", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i2 = f + 3;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return intern;
    }

    private static byte[] b(android.content.Context context) throws java.lang.Exception {
        n = (f + 75) % 128;
        byte[] c2 = com.facetec.sdk.d.c(context);
        java.lang.Object[] objArr = new java.lang.Object[1];
        k(null, null, 127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0082\u0091\u0098\u008e\u0091\u0084\u0097\u0091\u0081\u008e\u0087\u008e\u0097\u0082\u0092\u0091\u008f¤", objArr);
        byte[] d2 = com.facetec.sdk.bn.d(c2, ((java.lang.String) objArr[0]).intern());
        f = (n + 27) % 128;
        return d2;
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        @com.facetec.sdk.fg(e = "event")
        private java.lang.String f3395a;

        @com.facetec.sdk.fg(e = "time")
        private long c;

        @com.facetec.sdk.fg(e = "diagnosticSessionId")
        private java.lang.String d;

        @com.facetec.sdk.fg(e = "diagnosticId")
        private java.lang.String e;

        d(java.lang.String str, long j, java.lang.String str2, java.lang.String str3) {
            this.f3395a = str;
            this.c = j;
            this.d = str2;
            this.e = str3;
        }
    }

    private static java.lang.String a(com.facetec.sdk.ar arVar) {
        switch (com.facetec.sdk.ap.AnonymousClass3.f3393a[arVar.ordinal()]) {
            case 1:
                java.lang.Object[] objArr = new java.lang.Object[1];
                o(1 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (132 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), android.view.View.MeasureSpec.getMode(0), objArr);
                return ((java.lang.String) objArr[0]).intern();
            case 2:
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                o(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                return ((java.lang.String) objArr2[0]).intern();
            case 3:
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                o(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 3 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
                return ((java.lang.String) objArr3[0]).intern();
            case 4:
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                o((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 49113), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr4);
                return ((java.lang.String) objArr4[0]).intern();
            case 5:
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                o(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (25441 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 3 - android.view.MotionEvent.axisFromString(""), objArr5);
                return ((java.lang.String) objArr5[0]).intern();
            case 6:
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                o(1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.graphics.Color.argb(0, 0, 0, 0), 5 - android.text.TextUtils.getOffsetBefore("", 0), objArr6);
                return ((java.lang.String) objArr6[0]).intern();
            case 7:
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                k(null, null, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u0082", objArr7);
                return ((java.lang.String) objArr7[0]).intern();
            case 8:
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                k(null, null, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, "\u008d", objArr8);
                java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                int i2 = f + 79;
                n = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 70 / 0;
                }
                return intern;
            case 9:
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                k(null, null, 127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u008f", objArr9);
                return ((java.lang.String) objArr9[0]).intern();
            case 10:
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                o(1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.View.getDefaultSize(0, 0) + 31190), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6, objArr10);
                return ((java.lang.String) objArr10[0]).intern();
            case 11:
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                k(null, null, android.graphics.Color.red(0) + 127, "\u009b", objArr11);
                return ((java.lang.String) objArr11[0]).intern();
            case 12:
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                o(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), android.graphics.Color.green(0) + 7, objArr12);
                return ((java.lang.String) objArr12[0]).intern();
            case 13:
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                o((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 63388), 8 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr13);
                java.lang.String intern2 = ((java.lang.String) objArr13[0]).intern();
                int i4 = f + 25;
                n = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 98 / 0;
                }
                return intern2;
            case 14:
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                k(null, null, android.text.TextUtils.indexOf("", "", 0) + 127, "¥", objArr14);
                return ((java.lang.String) objArr14[0]).intern();
            case 15:
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                k(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "¦", objArr15);
                return ((java.lang.String) objArr15[0]).intern();
            case 16:
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                k(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0098", objArr16);
                return ((java.lang.String) objArr16[0]).intern();
            case 17:
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                k(null, null, 127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u008a", objArr17);
                return ((java.lang.String) objArr17[0]).intern();
            default:
                if (!f3392a) {
                    throw new java.lang.AssertionError();
                }
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                k(null, null, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0087\u0092", objArr18);
                return ((java.lang.String) objArr18[0]).intern();
        }
    }

    /* renamed from: com.facetec.sdk.ap$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3393a;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.facetec.sdk.FaceTecSessionStatus.values().length];
            d = iArr;
            try {
                iArr[com.facetec.sdk.FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.TIMEOUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                d[com.facetec.sdk.FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[com.facetec.sdk.ar.values().length];
            f3393a = iArr2;
            try {
                iArr2[com.facetec.sdk.ar.FT_EVENT_ENROLL_SESSION_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_MID_ENROLL_SESSION_GLASSES_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_ENROLL_SESSION_SUCCESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_ENROLL_SESSION_FAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_ENROLL_SESSION_CANCEL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_START.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_SUCCESS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_FAIL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_CANCEL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_AUTH_SESSION_START.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_AUTH_SESSION_SUCCESS.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_AUTH_SESSION_FAIL.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_AUTH_SESSION_CANCEL.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_DIAGNOSTIC_UPLOAD_FAIL.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_SUCCESS.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_PHOENIX_SESSION_FAIL.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                f3393a[com.facetec.sdk.ar.FT_EVENT_FACESCAN_SESSION_FAIL.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus = (com.facetec.sdk.FaceTecSessionStatus) objArr[1];
        int i2 = f + 63;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            com.facetec.sdk.ax.e(faceTecSessionStatus, context);
            int i3 = 13 / 0;
            switch (com.facetec.sdk.ap.AnonymousClass3.d[faceTecSessionStatus.ordinal()]) {
                case 1:
                    e(context, com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_SUCCESS);
                    return null;
                case 2:
                case 3:
                case 4:
                case 5:
                    e(context, com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_FAIL);
                    return null;
                case 6:
                    f = (n + 97) % 128;
                    return null;
                case 7:
                case 8:
                case 9:
                    e(context, com.facetec.sdk.ar.FT_EVENT_VERIFY_SESSION_CANCEL);
                    return null;
                default:
                    return null;
            }
        }
        com.facetec.sdk.ax.e(faceTecSessionStatus, context);
        switch (com.facetec.sdk.ap.AnonymousClass3.d[faceTecSessionStatus.ordinal()]) {
        }
    }

    static void b() {
        d = new char[]{5876, 5832, 5836, 5835, 5890, 5903, 5885, 5877, 5902, 5826, 5839, 5873, 5833, 5883, 5830, 5901, 5881, 5838, 5878, 5872, 5915, 5880, 5948, 5834, 5837, 5887, 5882, 5900, 5910, 5905, 5870, 5914, 5892, 5895, 5875, 5913, 5829, 5828};
        c = -1919674532;
        j = true;
        i = true;
        g = new char[]{27892, 27767, 27764, 54189, 3851, 27753, 5549, 27769, 39906, 46759, 3287, 49763, 39419, 24332, 4841, 59496, 44564, 26062, 15219, 65182, 46149, 2981, 49628, 34632, 23286, 4206, 55190, 44323, 24739, 9873, 64624, 46056, 2326, 52416, 33314, 22599, 8130, 54576, 43141, 28246, 9716, 64309, 45388, 29944, 51814, 33232, 18208, 6818, 53448, 38492, 28138, 8984, 59013, 48240, 27775, 50280, 32265, 45237, 60207, 11730, 24703, 39671, 56460, 5893, 18851, 35943, 50893, 31087, 45827, 62861, 10295, 25250, 42345, 57328, 48834, 1187, 51743, 37253, 22392, 6869, 57437, 42534, 28079, 13065, 63191, 48230};
        h = 3461156838066083446L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, long j2, java.lang.Runnable runnable) {
        e(1217377022, new java.lang.Object[]{context, str, str2, str3, java.lang.Boolean.valueOf(z), java.lang.Long.valueOf(j2), runnable}, com.facetec.sdk.nv.b(), -1217377021, com.facetec.sdk.nv.b(), com.facetec.sdk.nv.b(), com.facetec.sdk.nv.b());
    }

    static void b(android.content.Context context, com.facetec.sdk.FaceTecSessionStatus faceTecSessionStatus) {
        e(1713950705, new java.lang.Object[]{context, faceTecSessionStatus}, com.facetec.sdk.nv.b(), -1713950705, com.facetec.sdk.nv.b(), com.facetec.sdk.nv.b(), com.facetec.sdk.nv.b());
    }

    static void c(android.content.Context context) {
        e(-1087530494, new java.lang.Object[]{context}, com.facetec.sdk.nv.b(), 1087530496, com.facetec.sdk.nv.b(), com.facetec.sdk.nv.b(), com.facetec.sdk.nv.b());
    }
}
