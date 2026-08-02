package com.facetec.sdk;

/* loaded from: classes8.dex */
final class t {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    static int f3763a;
    static java.lang.String b;
    static boolean c;
    static boolean d;
    static java.lang.String e;
    private static com.facetec.sdk.de f;
    static int g;
    private static /* synthetic */ boolean h;
    private static long i;
    static boolean j;
    private static char[] k;
    private static char[] l;
    private static int m;
    private static long n;

    /* renamed from: o, reason: collision with root package name */
    private static long f3764o;
    private static int p;
    private static int s;
    private static int t;

    enum b {
        USER_CANCELLED,
        USER_FAILED,
        USER_WAS_SUCCESSFUL,
        PRE_SESSION_PHASE_1_TIMEOUT,
        PRE_SESSION_PHASE_2_TIMEOUT,
        SESSION_TIMEOUT,
        SESSION_CONTEXT_SWITCH,
        WAYPOINT_UPLOAD
    }

    private static java.lang.String $$c(int i2, int i3, byte b2) {
        int i4 = 4 - (b2 * 3);
        int i5 = i3 * 2;
        byte[] bArr = $$a;
        int i6 = i2 + 102;
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6 += -i4;
            i4++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i6;
            if (i8 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i9 = i4;
            i6 += -bArr[i4];
            i4 = i9 + 1;
            i7 = i8;
        }
    }

    public static /* synthetic */ java.lang.Object e(int i2, int i3, int i4, int i5, int i6, java.lang.Object[] objArr, int i7) {
        int i8 = (~(i6 | i4)) | i2;
        int i9 = ~i6;
        int i10 = ~((~i2) | i9 | i4);
        int i11 = (~((~i4) | i9)) | (~(i4 | i2));
        int i12 = i6 + i2 + i5 + (1616745821 * i7) + (2077170981 * i3);
        int i13 = i12 * i12;
        int i14 = ((-1558553916) * i6) + 318941677 + ((-1558553002) * i2) + (i8 * (-457)) + (i10 * 457) + (i11 * 457) + ((-1558553459) * i5) + (397062201 * i7) + (609114465 * i3) + ((-138936320) * i13);
        int i15 = (i6 * (-162656556)) + 1587019776 + (i2 * 806482222) + (i8 * (-484569389)) + (i10 * 484569389) + (i11 * 484569389) + (i5 * 321912832) + (i7 * (-395313152)) + (i3 * 904921088) + (i13 * 345505792) + (i14 * i14 * 1630011392);
        if (i15 == 1) {
            java.lang.String a2 = com.facetec.sdk.ay.a(22, 22);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            q(15 - android.graphics.Color.blue(0), (char) (android.view.KeyEvent.keyCodeFromString("") + 26206), 501 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(a2);
            java.lang.String obj = sb.toString();
            s = (m + 51) % 128;
            return obj;
        }
        if (i15 == 2) {
            return b(objArr);
        }
        if (i15 == 3) {
            return c(objArr);
        }
        if (i15 != 4) {
            return i15 != 5 ? d(objArr) : e(objArr);
        }
        android.content.Context context = (android.content.Context) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        byte[] c2 = com.facetec.sdk.d.c(context);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        q(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 516 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        sb2.append(((java.lang.String) objArr3[0]).intern());
        sb2.append(str);
        byte[] d2 = com.facetec.sdk.bn.d(c2, sb2.toString());
        s = (m + 87) % 128;
        return d2;
    }

    static void init$0() {
        $$a = new byte[]{37, 92, 86, -118};
        $$b = 48;
    }

    t() {
    }

    static /* synthetic */ void b(android.content.Context context, boolean z, com.facetec.sdk.o oVar) {
        int i2 = s + 31;
        m = i2 % 128;
        c(context, z, oVar);
        if (i2 % 2 != 0) {
            throw null;
        }
        s = (m + 51) % 128;
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        com.facetec.sdk.o oVar = (com.facetec.sdk.o) objArr[1];
        m = (s + 9) % 128;
        a(context, oVar);
        int i2 = s + 79;
        m = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        t = 0;
        p = 1;
        m = 0;
        s = 1;
        e();
        d();
        android.os.Process.myPid();
        android.text.TextUtils.getOffsetAfter("", 0);
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i2 = t + 95;
        int i3 = i2 % 128;
        p = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + 21;
        t = i4 % 128;
        int i5 = i4 % 2;
        h = z;
        f = com.facetec.sdk.de.CAMERA_PERMISSION;
        i = 0L;
        b = "";
        e = com.facetec.sdk.as.t;
        d = false;
        f3763a = 0;
        c = true;
        g = 0;
        j = true;
    }

    private static void q(int i2, char c2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        $11 = ($10 + 7) % 128;
        while (hhVar.e < i2) {
            int i4 = $10 + 55;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(k[i3 >> i5])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                    if (d2 == null) {
                        byte b2 = (byte) 3;
                        byte b3 = (byte) (b2 - 3);
                        d2 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 45150), android.view.View.getDefaultSize(0, 0) + 2150, android.text.TextUtils.indexOf("", "", 0) + 24, 1926116241, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(n), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                    if (d3 == null) {
                        char indexOf = (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                        byte length = (byte) $$a.length;
                        byte b4 = (byte) (length - 4);
                        d3 = com.facetec.sdk.al.c(indexOf, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 1833, 24 - (edgeSlop >> 16), -1880730373, false, $$c(length, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                    if (d4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        d4 = com.facetec.sdk.al.c((char) android.text.TextUtils.getCapsMode("", 0, 0), 2341 - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24, -1839099840, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = hhVar.e;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(k[i3 + i6])};
                java.lang.Object d5 = com.facetec.sdk.al.d(-719238807);
                if (d5 == null) {
                    byte b7 = (byte) 3;
                    byte b8 = (byte) (b7 - 3);
                    d5 = com.facetec.sdk.al.c((char) (android.text.TextUtils.getTrimmedLength("") + 45150), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2151, 25 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1926116241, false, $$c(b7, b8, b8), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(n), java.lang.Integer.valueOf(c2)};
                java.lang.Object d6 = com.facetec.sdk.al.d(671690243);
                if (d6 == null) {
                    char c3 = (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte length2 = (byte) $$a.length;
                    byte b9 = (byte) (length2 - 4);
                    d6 = com.facetec.sdk.al.c(c3, (keyRepeatTimeout >> 16) + 1834, 24 - makeMeasureSpec, -1880730373, false, $$c(length2, b9, b9), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr6)).longValue();
                java.lang.Object[] objArr7 = {hhVar, hhVar};
                java.lang.Object d7 = com.facetec.sdk.al.d(898558648);
                if (d7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    d7 = com.facetec.sdk.al.c((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2340 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.os.Process.getGidForName("") + 25, -1839099840, false, $$c(b10, b11, b11), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d7).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr8 = {hhVar, hhVar};
            java.lang.Object d8 = com.facetec.sdk.al.d(898558648);
            if (d8 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                d8 = com.facetec.sdk.al.c((char) android.view.Gravity.getAbsoluteGravity(0, 0), 2340 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, -1839099840, false, $$c(b12, b13, b13), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d8).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void r(char c2, int i2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i3];
        hhVar.e = 0;
        while (hhVar.e < i3) {
            int i4 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(l[i2 + i4])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    byte b2 = (byte) 3;
                    byte b3 = (byte) (b2 - 3);
                    d2 = com.facetec.sdk.al.c((char) (45151 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2150, 24 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 1926116241, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(f3764o), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    char c3 = (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int blue = android.graphics.Color.blue(0);
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    byte length = (byte) $$a.length;
                    byte b4 = (byte) (length - 4);
                    d3 = com.facetec.sdk.al.c(c3, 1834 - blue, 23 - indexOf, -1880730373, false, $$c(length, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    d4 = com.facetec.sdk.al.c((char) android.view.View.resolveSizeAndState(0, 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2341, 24 - (android.view.ViewConfiguration.getTouchSlop() >> 8), -1839099840, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
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
        char[] cArr = new char[i3];
        hhVar.e = 0;
        while (hhVar.e < i3) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.View.combineMeasuredStates(0, 0) + 2341, 24 - android.widget.ExpandableListView.getPackedPositionType(0L), -1839099840, false, $$c(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static java.lang.String a(com.facetec.sdk.c cVar) {
        int i2 = m + 109;
        s = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = com.facetec.sdk.t.AnonymousClass2.f3765a[cVar.ordinal()];
            if (i3 == 1) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                q(21 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.Color.blue(0), android.view.KeyEvent.normalizeMetaState(0), objArr);
                return ((java.lang.String) objArr[0]).intern();
            }
            if (i3 == 2) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                q(android.text.TextUtils.indexOf("", "") + 19, (char) (6888 - android.view.MotionEvent.axisFromString("")), 21 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                return ((java.lang.String) objArr2[0]).intern();
            }
            if (i3 == 3) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                q(16 - android.view.View.resolveSize(0, 0), (char) (android.os.Process.myPid() >> 22), 40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
                return ((java.lang.String) objArr3[0]).intern();
            }
            if (i3 == 4) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                q(android.view.KeyEvent.keyCodeFromString("") + 14, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 56 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
                return ((java.lang.String) objArr4[0]).intern();
            }
            if (i3 == 5) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                q(13 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0), 70 - android.text.TextUtils.indexOf("", ""), objArr5);
                java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                s = (m + 39) % 128;
                return intern;
            }
            java.lang.String b2 = b(cVar);
            s = (m + 75) % 128;
            return b2;
        }
        int i4 = com.facetec.sdk.t.AnonymousClass2.f3765a[cVar.ordinal()];
        throw null;
    }

    static void c(android.content.Context context, com.facetec.sdk.eb.c cVar) {
        m = (s + 57) % 128;
        if (com.facetec.sdk.bj.c()) {
            com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
            java.lang.Object[] objArr = new java.lang.Object[1];
            q(android.graphics.Color.red(0) + 14, (char) (8110 - android.view.KeyEvent.getDeadChar(0, 0)), android.view.KeyEvent.keyCodeFromString("") + 82, objArr);
            epVar.a(((java.lang.String) objArr[0]).intern(), cVar.p);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            q((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 11, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55022), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 96, objArr2);
            epVar.a(((java.lang.String) objArr2[0]).intern(), com.facetec.sdk.FaceTecSDK.f3366a.vocalGuidanceCustomization.mode.toString());
            a(context, com.facetec.sdk.c.VOCAL_GUIDANCE_STARTED, epVar);
            m = (s + 67) % 128;
        }
    }

    static void a(android.content.Context context, com.facetec.sdk.eh ehVar, java.lang.String str) {
        com.facetec.sdk.c cVar;
        int i2 = m + 65;
        s = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
            if (!com.facetec.sdk.bj.c()) {
                return;
            }
        } else if (!com.facetec.sdk.bj.c()) {
            return;
        }
        if (ehVar == com.facetec.sdk.eh.ConnectionError) {
            int i4 = m + 27;
            s = i4 % 128;
            if (i4 % 2 == 0) {
                cVar = com.facetec.sdk.c.NFC_USER_MOVED_DEVICE;
                int i5 = 33 / 0;
            } else {
                cVar = com.facetec.sdk.c.NFC_USER_MOVED_DEVICE;
            }
        } else {
            cVar = com.facetec.sdk.c.NFC_ERROR;
        }
        com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
        epVar.a(a(cVar), d(ehVar));
        java.lang.Object[] objArr = new java.lang.Object[1];
        q(android.widget.ExpandableListView.getPackedPositionType(0L) + 5, (char) (29333 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 107 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        epVar.a(((java.lang.String) objArr[0]).intern(), str);
        a(context, cVar, epVar);
    }

    private static java.lang.String d(com.facetec.sdk.eh ehVar) {
        int i2 = m + 17;
        s = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = com.facetec.sdk.t.AnonymousClass2.d[ehVar.ordinal()];
            obj.hashCode();
            throw null;
        }
        switch (com.facetec.sdk.t.AnonymousClass2.d[ehVar.ordinal()]) {
            case 1:
                java.lang.Object[] objArr = new java.lang.Object[1];
                q((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, (char) (57406 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 111 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
                return ((java.lang.String) objArr[0]).intern();
            case 2:
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                q(android.text.TextUtils.getOffsetAfter("", 0) + 13, (char) android.text.TextUtils.getOffsetBefore("", 0), 119 - android.view.KeyEvent.normalizeMetaState(0), objArr2);
                java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                s = (m + 79) % 128;
                return intern;
            case 3:
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                q(android.widget.ExpandableListView.getPackedPositionType(0L) + 13, (char) (63548 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 132 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
                return ((java.lang.String) objArr3[0]).intern();
            case 4:
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                q(android.graphics.ImageFormat.getBitsPerPixel(0) + 16, (char) (18777 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 145 - android.graphics.Color.green(0), objArr4);
                return ((java.lang.String) objArr4[0]).intern();
            case 5:
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                q(12 - android.graphics.Color.green(0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.view.View.MeasureSpec.getMode(0) + 160, objArr5);
                java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                int i4 = s + 61;
                m = i4 % 128;
                if (i4 % 2 == 0) {
                    return intern2;
                }
                throw null;
            case 6:
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                q(16 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (7615 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 172 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr6);
                return ((java.lang.String) objArr6[0]).intern();
            default:
                java.lang.String valueOf = java.lang.String.valueOf(ehVar);
                m = (s + 1) % 128;
                return valueOf;
        }
    }

    static void b(android.content.Context context, com.facetec.sdk.ao aoVar, boolean z, com.facetec.sdk.bw.c cVar, java.lang.String str) {
        java.lang.String intern;
        byte[][] r;
        boolean z2;
        if (context == null || !a()) {
            return;
        }
        s = (m + 11) % 128;
        if (aoVar == null) {
            return;
        }
        int i2 = aoVar.c;
        int i3 = aoVar.b;
        com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
        if (z) {
            m = (s + 35) % 128;
            try {
                z2 = com.facetec.sdk.ai.a(context).booleanValue();
            } catch (com.facetec.sdk.ak e2) {
                e2.printStackTrace();
                com.facetec.sdk.c cVar2 = com.facetec.sdk.c.CAMERA_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getTouchSlop() >> 8) + 38, (char) (57232 - android.view.MotionEvent.axisFromString("")), 187 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e2);
                c(context, cVar2, sb.toString(), e2);
                z2 = true;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            q(5 - android.text.TextUtils.getTrimmedLength(""), (char) android.graphics.Color.blue(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + kotlin.text.Typography.plusMinus, objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            r = com.facetec.sdk.cq.X(z2, i2, i3);
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            q((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, (char) (34091 - android.widget.ExpandableListView.getPackedPositionType(0L)), 230 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            if (cVar == com.facetec.sdk.bw.c.FRONT) {
                r = com.facetec.sdk.cq.t();
                m = (s + 119) % 128;
            } else {
                r = com.facetec.sdk.cq.r();
            }
        }
        if (r.length == 0) {
            return;
        }
        j = false;
        if (!h) {
            int i4 = m + 43;
            s = i4 % 128;
            if (i4 % 2 != 0 ? r[0].length != ((i2 * i3) << 2) : r[0].length != ((i2 >> i3) >>> 2)) {
                throw new java.lang.AssertionError();
            }
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        q(1 - android.view.MotionEvent.axisFromString(""), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 241, objArr4);
        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        q((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, (char) (17808 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-16776973) - android.graphics.Color.rgb(0, 0, 0), objArr5);
        epVar.a(intern2, ((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        q((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, (char) (118 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 245 - android.graphics.Color.argb(0, 0, 0, 0), objArr6);
        epVar.a(((java.lang.String) objArr6[0]).intern(), intern);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        q((android.view.ViewConfiguration.getTouchSlop() >> 8) + 14, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 50205), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, objArr7);
        epVar.a(((java.lang.String) objArr7[0]).intern(), com.facetec.sdk.bj.d(context, false));
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        q(11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, objArr8);
        epVar.a(((java.lang.String) objArr8[0]).intern(), str);
        com.facetec.sdk.ep epVar2 = new com.facetec.sdk.ep();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        q((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, (char) android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, objArr9);
        epVar2.d(((java.lang.String) objArr9[0]).intern(), java.lang.Integer.valueOf(i2));
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        q(android.widget.ExpandableListView.getPackedPositionType(0L) + 1, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 281 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
        epVar2.d(((java.lang.String) objArr10[0]).intern(), java.lang.Integer.valueOf(i3));
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        q(1 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (56322 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 281 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
        epVar.b(((java.lang.String) objArr11[0]).intern(), epVar2);
        com.facetec.sdk.mt.d dVar = new com.facetec.sdk.mt.d();
        com.facetec.sdk.mr mrVar = com.facetec.sdk.mt.d;
        if (mrVar == null) {
            throw new java.lang.NullPointerException("type == null");
        }
        if (!mrVar.e.equals(io.ktor.http.ContentType.MultiPart.TYPE)) {
            throw new java.lang.IllegalArgumentException("multipart != ".concat(java.lang.String.valueOf(mrVar)));
        }
        dVar.b = mrVar;
        java.lang.String b2 = new com.facetec.sdk.el().d().c().b(epVar);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        q(11 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 284 - android.text.TextUtils.getOffsetBefore("", 0), objArr12);
        dVar.d(com.facetec.sdk.mt.c.d(((java.lang.String) objArr12[0]).intern(), null, com.facetec.sdk.my.c(null, b2)));
        for (int i5 = 1; i5 <= r.length; i5++) {
            byte[] bArr = r[i5 - 1];
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i2, i3, android.graphics.Bitmap.Config.ARGB_8888);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
            createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(i5);
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            q(4 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.graphics.Color.blue(0) + 41323), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, objArr13);
            sb2.append(((java.lang.String) objArr13[0]).intern());
            java.lang.String obj = sb2.toString();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            q(9 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 298 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr14);
            dVar.d(com.facetec.sdk.mt.c.d(intern, obj, com.facetec.sdk.my.b(com.facetec.sdk.mr.d(((java.lang.String) objArr14[0]).intern()), byteArray)));
        }
        com.facetec.sdk.ms msVar = (com.facetec.sdk.ms) com.facetec.sdk.aw.b(new java.lang.Object[]{context}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), -1657118186, 1657118187, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b());
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.view.MotionEvent.axisFromString("");
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        java.util.Arrays.fill(r, (java.lang.Object) null);
        try {
            if (dVar.c.isEmpty()) {
                throw new java.lang.IllegalStateException("Multipart body must have at least one part.");
            }
            com.facetec.sdk.mt mtVar = new com.facetec.sdk.mt(dVar.f3662a, dVar.b, dVar.c);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            q(android.view.View.resolveSize(0, 0) + 52, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17551), android.text.TextUtils.getOffsetAfter("", 0) + 307, objArr15);
            msVar.d(com.facetec.sdk.g.a(context, ((java.lang.String) objArr15[0]).intern(), java.lang.Boolean.TRUE).a(mtVar).c()).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.t.4
                @Override // com.facetec.sdk.mg
                public final void c(java.io.IOException iOException) {
                }

                @Override // com.facetec.sdk.mg
                public final void d(com.facetec.sdk.mw mwVar) throws java.io.IOException {
                    com.facetec.sdk.t.j = true;
                    mwVar.a();
                }
            });
        } catch (com.facetec.sdk.g.a e3) {
            e3.printStackTrace();
        }
    }

    static void a(android.content.Context context, com.facetec.sdk.t.b bVar) {
        int i2 = m + 69;
        s = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            if (com.facetec.sdk.bj.c() && bVar != com.facetec.sdk.t.b.USER_WAS_SUCCESSFUL) {
                s = (m + 115) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    r((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 16, objArr);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                    r((char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 11752), 17 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - android.view.View.MeasureSpec.getSize(0), new java.lang.Object[1]);
                    double longValue = (((java.lang.Long) cls.getMethod((java.lang.String) r5[0], null).invoke(null, null)).longValue() - i) / 1000.0d;
                    c(context, com.facetec.sdk.c.EXIT_SCREEN_TYPE, (java.lang.String) e(-663325080, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), 663325085, new java.lang.Object[]{f}, com.facetec.sdk.el.e()), (java.lang.Throwable) null);
                    c(context, com.facetec.sdk.c.EXIT_SCREEN_ELAPSED_TIME, java.lang.String.valueOf(longValue), (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            return;
        }
        com.facetec.sdk.bj.c();
        obj.hashCode();
        throw null;
    }

    static void a(android.content.Context context, java.lang.Throwable th, com.facetec.sdk.c cVar, java.lang.String str, boolean z, int i2) {
        com.facetec.sdk.c cVar2;
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        if (th != null) {
            com.facetec.sdk.n.b(th);
        }
        if (com.facetec.sdk.bj.c()) {
            if (z) {
                s = (m + 73) % 128;
                cVar2 = com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_FACESCAN;
            } else {
                cVar2 = com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_IDSCAN;
                s = (m + 27) % 128;
            }
            if (cVar != cVar2) {
                c(context, cVar, str, th);
            }
            java.lang.String str2 = "";
            try {
                if (z) {
                    sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    q('E' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 359 - android.graphics.Color.red(0), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    obj = com.facetec.sdk.FaceTecSessionStatus.values()[i2];
                } else {
                    sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    q(android.os.Process.getGidForName("") + 21, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 12745), android.graphics.Color.alpha(0) + 380, objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    obj = com.facetec.sdk.FaceTecIDScanStatus.values()[i2];
                }
                sb.append(obj.toString());
                str2 = sb.toString();
            } catch (java.lang.Exception unused) {
                if (!h) {
                    throw new java.lang.AssertionError();
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            q((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 400, objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            sb2.append(com.facetec.sdk.ai.g());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            q(3 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 400 - android.view.View.MeasureSpec.getSize(0), objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            sb2.append(str2);
            c(context, cVar2, sb2.toString(), th);
            return;
        }
        int i3 = m + 111;
        s = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        java.lang.Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static void b(android.content.Context context, java.lang.String str, int i2) {
        int i3 = m + 121;
        s = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            if (!com.facetec.sdk.bj.c()) {
                int i4 = m + 57;
                s = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
            java.lang.Object[] objArr = new java.lang.Object[1];
            q((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 404, objArr);
            epVar.a(((java.lang.String) objArr[0]).intern(), str);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            q('=' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (15716 - android.graphics.Color.red(0)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 404, objArr2);
            epVar.d(((java.lang.String) objArr2[0]).intern(), 300);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            q((android.os.Process.myTid() >> 22) + 13, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, objArr3);
            epVar.d(((java.lang.String) objArr3[0]).intern(), java.lang.Integer.valueOf(i2));
            a(context, com.facetec.sdk.c.DIAGNOSTIC_WAIT_TIME, epVar);
            return;
        }
        com.facetec.sdk.bj.c();
        obj.hashCode();
        throw null;
    }

    static void a(android.content.Context context, com.facetec.sdk.c cVar, com.facetec.sdk.da.c cVar2) {
        s = (m + 17) % 128;
        if (com.facetec.sdk.bj.c()) {
            c(context, cVar, java.lang.String.valueOf(cVar2), (java.lang.Throwable) null);
            int i2 = m + 83;
            s = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
        }
    }

    static void c(android.content.Context context, com.facetec.sdk.c cVar, java.lang.String str, java.lang.Throwable th) {
        java.lang.Object obj;
        if (context == null || !com.facetec.sdk.bj.c()) {
            return;
        }
        com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
        if (context instanceof android.app.Activity) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            q((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 19, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 430, objArr);
            epVar.a(((java.lang.String) objArr[0]).intern(), e((android.app.Activity) context));
        }
        if (str != null) {
            int i2 = s + 13;
            m = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                q(android.graphics.Color.red(1) + 62, (char) ((android.util.TypedValue.complexToFraction(1, 2.0f, 1.0f) > 2.0f ? 1 : (android.util.TypedValue.complexToFraction(1, 2.0f, 1.0f) == 2.0f ? 0 : -1)) + 29132), 15006 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                obj = objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                q(android.graphics.Color.red(0) + 15, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18562), 450 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                obj = objArr3[0];
            }
            epVar.a(((java.lang.String) obj).intern(), str);
        }
        if (th != null) {
            java.lang.String e2 = com.facetec.sdk.C0304r.e(th);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            q(android.graphics.Color.blue(0) + 11, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 464, objArr4);
            epVar.a(((java.lang.String) objArr4[0]).intern(), e2);
        }
        if (cVar == com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_FACESCAN || cVar == com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_IDSCAN) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            q((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, (char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 475, objArr5);
            epVar.a(((java.lang.String) objArr5[0]).intern(), a(context));
        }
        a(context, cVar, epVar);
        int i3 = m + 33;
        s = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 80 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.facetec.sdk.c cVar, com.facetec.sdk.es esVar, android.content.Context context) {
        com.facetec.sdk.ep epVar = new com.facetec.sdk.ep();
        java.lang.Object[] objArr = new java.lang.Object[1];
        q(android.view.View.MeasureSpec.getSize(0) + 2, (char) android.view.View.resolveSize(0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        q(2 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 54574), 2570 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        epVar.a(intern, ((java.lang.String) objArr2[0]).intern());
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        q(9 - (windowTouchSlop >> 8), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27257), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2573, objArr3);
        epVar.a(((java.lang.String) objArr3[0]).intern(), b);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        q(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8, (char) (44252 - android.text.TextUtils.indexOf("", "")), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2581, objArr4);
        epVar.a(((java.lang.String) objArr4[0]).intern(), java.util.UUID.randomUUID().toString());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        q(android.text.TextUtils.getOffsetBefore("", 0) + 19, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 35727), android.text.TextUtils.getCapsMode("", 0, 0) + 2588, objArr5);
        epVar.a(((java.lang.String) objArr5[0]).intern(), com.facetec.sdk.cn.e);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        q((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 10023), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2606, objArr6);
        epVar.a(((java.lang.String) objArr6[0]).intern(), b(cVar));
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        q(9 - android.graphics.Color.alpha(0), (char) android.view.KeyEvent.keyCodeFromString(""), android.graphics.Color.blue(0) + 2608, objArr7);
        java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
        s = (m + 37) % 128;
        try {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            r((char) android.text.TextUtils.indexOf("", "", 0, 0), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 16, objArr8);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            r((char) (android.text.TextUtils.getOffsetAfter("", 0) + 11752), (android.os.Process.myTid() >> 22) + 16, android.graphics.ImageFormat.getBitsPerPixel(0) + 18, objArr9);
            epVar.d(intern2, java.lang.Integer.valueOf((int) (((java.lang.Long) cls.getMethod((java.lang.String) objArr9[0], null).invoke(null, null)).longValue() / 1000)));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            q(8 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (10021 - android.graphics.Color.red(0)), android.os.Process.getGidForName("") + 2618, objArr10);
            java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            r((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + 1, 16 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr11);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            r((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 11752), 16 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 16 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr12);
            epVar.d(intern3, java.lang.Long.valueOf(((java.lang.Long) cls2.getMethod((java.lang.String) objArr12[0], null).invoke(null, null)).longValue()));
            if (esVar != null) {
                m = (s + 15) % 128;
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                q(android.view.MotionEvent.axisFromString("") + 5, (char) (17606 - android.view.Gravity.getAbsoluteGravity(0, 0)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2626, objArr13);
                epVar.b(((java.lang.String) objArr13[0]).intern(), esVar);
            }
            com.facetec.sdk.ms msVar = (com.facetec.sdk.ms) com.facetec.sdk.aw.b(new java.lang.Object[]{context}, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b(), -1657118186, 1657118187, com.facetec.sdk.aw.a.b(), com.facetec.sdk.aw.a.b());
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            q(46 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2630 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr14);
            try {
                msVar.d(com.facetec.sdk.g.d(context, ((java.lang.String) objArr14[0]).intern(), epVar, java.lang.Boolean.FALSE)).a(new com.facetec.sdk.mg() { // from class: com.facetec.sdk.t.1
                    @Override // com.facetec.sdk.mg
                    public final void c(java.io.IOException iOException) {
                    }

                    @Override // com.facetec.sdk.mg
                    public final void d(com.facetec.sdk.mw mwVar) throws java.io.IOException {
                        mwVar.a();
                    }
                });
            } catch (com.facetec.sdk.g.a e2) {
                e2.printStackTrace();
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        com.facetec.sdk.dk.e(new com.facetec.sdk.t$$ExternalSyntheticLambda3(r3, r4, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0012, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (com.facetec.sdk.bj.c() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(final android.content.Context context, final com.facetec.sdk.c cVar, final com.facetec.sdk.es esVar) {
        int i2 = s + 43;
        m = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        s = (m + 53) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r20 == com.facetec.sdk.p.FACE_SCAN) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        r0 = com.facetec.sdk.t.s + 79;
        com.facetec.sdk.t.m = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if ((r0 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r0 = 43 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r20 == com.facetec.sdk.p.FACE_SCAN) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(android.content.Context context, java.util.ArrayList<java.lang.String> arrayList, java.lang.String str, com.facetec.sdk.p pVar, java.lang.String str2, java.lang.String str3, boolean z) {
        if (a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            q(15 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 486 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
            com.facetec.sdk.cq.H(((java.lang.String) objArr[0]).intern(), 2);
            java.lang.String v = com.facetec.sdk.cq.v(com.facetec.sdk.d.d());
            if (v.equals("") && str.equals("")) {
                int i2 = m + 7;
                s = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 7 / 0;
                }
            }
            java.lang.String str4 = pVar == com.facetec.sdk.p.ID_SCAN_ONLY ? str3 : str2;
            c = false;
            c(context.getApplicationContext(), false, new com.facetec.sdk.o(v, pVar, (java.util.ArrayList) e(2064534533, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), -2064534531, new java.lang.Object[]{arrayList}, com.facetec.sdk.el.e()), str, com.facetec.sdk.cn.e, str4, str3, z));
            return;
        }
        s = (m + 111) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.content.Context context) {
        int i2 = s;
        m = (i2 + 57) % 128;
        if (!h) {
            m = (i2 + 101) % 128;
            if (context == null) {
                throw new java.lang.AssertionError();
            }
        }
        android.content.Context applicationContext = context.getApplicationContext();
        com.facetec.sdk.o c2 = c(applicationContext);
        if (c2 != null) {
            c(applicationContext, true, c2);
        }
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        final android.content.Context context = (android.content.Context) objArr[0];
        int i2 = s + 11;
        m = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            com.facetec.sdk.bj.c();
            obj.hashCode();
            throw null;
        }
        if (com.facetec.sdk.bj.c()) {
            com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.t$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.t.b(context);
                }
            });
            s = (m + 17) % 128;
        } else {
            m = (s + 53) % 128;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(android.content.Context context, android.content.Context context2, com.facetec.sdk.o oVar, boolean z) {
        com.facetec.sdk.aw.c(context).c(context2, oVar, z, new com.facetec.sdk.t.c(context, oVar));
        int i2 = s + 43;
        m = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(final android.content.Context context, final boolean z, final com.facetec.sdk.o oVar) {
        s = (m + 111) % 128;
        if (com.facetec.sdk.bj.c()) {
            final android.content.Context applicationContext = context.getApplicationContext();
            c(new java.lang.Runnable() { // from class: com.facetec.sdk.t$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.t.c(applicationContext, context, oVar, z);
                }
            });
            s = (m + 79) % 128;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.content.Context context, com.facetec.sdk.o oVar) {
        int i2 = (m + 25) % 128;
        s = i2;
        if (!h) {
            m = (i2 + 29) % 128;
            if (context == null) {
                throw new java.lang.AssertionError();
            }
        }
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        java.lang.String str = (java.lang.String) e(-388936151, com.facetec.sdk.el.e(), e2, e3, 388936152, new java.lang.Object[0], e4);
        java.io.File file = new java.io.File(context.getCacheDir(), str);
        try {
            byte[] bytes = new com.facetec.sdk.el().d().c().c(oVar).getBytes(java.nio.charset.StandardCharsets.UTF_8);
            int e5 = com.facetec.sdk.el.e();
            int e6 = com.facetec.sdk.el.e();
            int e7 = com.facetec.sdk.el.e();
            com.facetec.sdk.bm.b(file, (byte[]) e(-1919888229, com.facetec.sdk.el.e(), e5, e6, 1919888233, new java.lang.Object[]{context, str}, e7), bytes);
            int i3 = m + 77;
            s = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 27 / 0;
            }
        } catch (java.lang.Exception e8) {
            e8.printStackTrace();
        }
    }

    private static void a(final android.content.Context context, final com.facetec.sdk.o oVar) {
        int i2 = m + 13;
        s = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            com.facetec.sdk.bj.c();
            obj.hashCode();
            throw null;
        }
        if (com.facetec.sdk.bj.c()) {
            com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.t$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.t.b(context, oVar);
                }
            });
            int i3 = m + 11;
            s = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.facetec.sdk.o c(android.content.Context context) {
        com.facetec.sdk.o oVar;
        java.io.File file;
        int length;
        int i2;
        synchronized (com.facetec.sdk.t.class) {
            s = (m + 109) % 128;
            java.io.File[] listFiles = context.getCacheDir().listFiles();
            oVar = null;
            try {
                if (listFiles != null) {
                    int i3 = s + 29;
                    m = i3 % 128;
                    if (i3 % 2 != 0) {
                        length = listFiles.length;
                        i2 = 1;
                    } else {
                        length = listFiles.length;
                        i2 = 0;
                    }
                    while (i2 < length) {
                        file = listFiles[i2];
                        java.lang.String name2 = file.getName();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        q((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 26206), 501 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
                        if (name2.startsWith(((java.lang.String) objArr[0]).intern())) {
                            int i4 = m + 29;
                            s = i4 % 128;
                            if (i4 % 2 == 0) {
                                throw null;
                            }
                            if (file != null) {
                                try {
                                    oVar = com.facetec.sdk.o.e((byte[]) com.facetec.sdk.bm.c(new java.lang.Object[]{file, (byte[]) e(-1919888229, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), 1919888233, new java.lang.Object[]{context, file.getName()}, com.facetec.sdk.el.e())}, com.facetec.sdk.gh.b.d(), -1300678471, com.facetec.sdk.gh.b.d(), 1300678472, com.facetec.sdk.gh.b.d(), com.facetec.sdk.gh.b.d()));
                                    file.delete();
                                    m = (s + 13) % 128;
                                } catch (java.lang.Exception e2) {
                                    e2.printStackTrace();
                                    file.delete();
                                }
                            }
                        } else {
                            i2++;
                            int i5 = s + 65;
                            m = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    }
                }
                if (file != null) {
                }
            } catch (java.lang.Throwable th) {
                file.delete();
                throw th;
            }
            file = null;
        }
        return oVar;
    }

    private static void c(final java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread() { // from class: com.facetec.sdk.t.3
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                setPriority(1);
                android.os.Process.setThreadPriority(19);
                runnable.run();
            }
        };
        thread.setPriority(1);
        thread.start();
        m = (s + 41) % 128;
    }

    static boolean a() {
        m = (s + 109) % 128;
        boolean a2 = com.facetec.sdk.d.a();
        s = (m + 111) % 128;
        return a2;
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = (java.util.ArrayList) objArr[0];
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        int i2 = m + 49;
        while (true) {
            s = i2 % 128;
            if (!it.hasNext()) {
                return arrayList2;
            }
            int i3 = m + 51;
            s = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList2.add(com.facetec.sdk.cd.c((java.lang.String) it.next()));
                i2 = m + 41;
            } else {
                arrayList2.add(com.facetec.sdk.cd.c((java.lang.String) it.next()));
                throw null;
            }
        }
    }

    static final class c extends com.facetec.sdk.aw.c {
        private final com.facetec.sdk.o d;
        private final android.content.Context e;

        c(android.content.Context context, com.facetec.sdk.o oVar) {
            this.e = context.getApplicationContext();
            this.d = oVar;
        }

        @Override // com.facetec.sdk.aw.c
        public final void b() {
            java.lang.Object[] objArr = {this.e};
            com.facetec.sdk.t.e(-700200062, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), 700200065, objArr, com.facetec.sdk.el.e());
        }

        @Override // com.facetec.sdk.aw.c
        public final void d(boolean z) {
            this.d.f++;
            if (this.d.f < 3) {
                com.facetec.sdk.t.b(this.e, z, this.d);
                return;
            }
            if (z) {
                return;
            }
            com.facetec.sdk.t.e(1218796339, com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), com.facetec.sdk.el.e(), -1218796339, new java.lang.Object[]{this.e, this.d}, com.facetec.sdk.el.e());
        }
    }

    static void c(com.facetec.sdk.de deVar) {
        f = deVar;
        int i2 = m;
        s = (i2 + 1) % 128;
        s = (i2 + 111) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            r((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 16, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r((char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 11752), (-16777200) - android.graphics.Color.rgb(0, 0, 0), android.graphics.Color.blue(0) + 17, objArr2);
            i = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: com.facetec.sdk.t$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3765a;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[com.facetec.sdk.de.values().length];
            e = iArr;
            try {
                iArr[com.facetec.sdk.de.CAMERA_PERMISSION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                e[com.facetec.sdk.de.INITIAL_FACE_SCAN_GET_READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                e[com.facetec.sdk.de.FACE_SCAN_ZOOMED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                e[com.facetec.sdk.de.FACE_SCAN_UNZOOMED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                e[com.facetec.sdk.de.RETRY_SIDE_BY_SIDE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                e[com.facetec.sdk.de.RETRY_GET_READY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                e[com.facetec.sdk.de.RESULT_UPLOAD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                e[com.facetec.sdk.de.ID_SCAN_START.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                e[com.facetec.sdk.de.NFC_START.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                e[com.facetec.sdk.de.RESULT_OCR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                e[com.facetec.sdk.de.SECURING_CAMERA.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                e[com.facetec.sdk.de.RESULT_ID_FEEDBACK.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                e[com.facetec.sdk.de.RESULT_ADDITIONAL_REVIEW.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            int[] iArr2 = new int[com.facetec.sdk.eh.values().length];
            d = iArr2;
            try {
                iArr2[com.facetec.sdk.eh.Unknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                d[com.facetec.sdk.eh.InvalidMrzKey.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                d[com.facetec.sdk.eh.ResponseError.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                d[com.facetec.sdk.eh.ConnectionError.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                d[com.facetec.sdk.eh.UnknownRetry.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                d[com.facetec.sdk.eh.IncompatibleDoc.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            int[] iArr3 = new int[com.facetec.sdk.c.values().length];
            f3765a = iArr3;
            try {
                iArr3[com.facetec.sdk.c.FACESCAN_CALLBACK_CALLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                f3765a[com.facetec.sdk.c.ID_SCAN_CALLBACK_CALLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                f3765a[com.facetec.sdk.c.DEVELOPER_USED_FACESCAN_CALLBACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                f3765a[com.facetec.sdk.c.DEVELOPER_USED_ID_SCAN_CALLBACK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                f3765a[com.facetec.sdk.c.DOCUMENT_TYPE_PRESSED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                f3765a[com.facetec.sdk.c.FULL_SESSION_START.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                f3765a[com.facetec.sdk.c.GET_READY_IM_READY_SHOWN_AND_READY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                f3765a[com.facetec.sdk.c.GET_READY_IM_READY_PRESSED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                f3765a[com.facetec.sdk.c.GET_READY_IM_READY_SHOWN_AND_READY_RETRY.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                f3765a[com.facetec.sdk.c.GET_READY_IM_READY_PRESSED_RETRY.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA2_ERROR.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                f3765a[com.facetec.sdk.c.NON_FATAL_ERROR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                f3765a[com.facetec.sdk.c.SEVERE_ERROR.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                f3765a[com.facetec.sdk.c.VOCAL_GUIDANCE_STARTED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_LEGACY_ERROR.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_ERROR.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                f3765a[com.facetec.sdk.c.NFC_ERROR.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                f3765a[com.facetec.sdk.c.NFC_USER_MOVED_DEVICE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                f3765a[com.facetec.sdk.c.DEFINITELY_BUG_IF_SEEN.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                f3765a[com.facetec.sdk.c.STARTPREVIEW_EXCEPTION.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                f3765a[com.facetec.sdk.c.UNEXPECTED_NULL.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                f3765a[com.facetec.sdk.c.EXIT_SCREEN_TYPE.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                f3765a[com.facetec.sdk.c.EXIT_SCREEN_ELAPSED_TIME.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                f3765a[com.facetec.sdk.c.SESSION_RESULT_UNEXPECTED_NULL.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                f3765a[com.facetec.sdk.c.PHOENIX_HANDLER_UNEXPECTED_NULL.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                f3765a[com.facetec.sdk.c.ROOT_DEVICE_DETECTED.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                f3765a[com.facetec.sdk.c.DEVICE_SYSTEM_PROPERTY_ANNOTATION_ERROR.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                f3765a[com.facetec.sdk.c.CANCEL_BUTTON_RESOURCE_ID_ERROR.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                f3765a[com.facetec.sdk.c.LOW_MEMORY_ERROR.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                f3765a[com.facetec.sdk.c.LOW_MEMORY_WARNING.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_ALREADY_CLOSED.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                f3765a[com.facetec.sdk.c.F2F_ERROR.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                f3765a[com.facetec.sdk.c.IMAGE_DATA_UNEXPECTED_NULL.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                f3765a[com.facetec.sdk.c.DIAGNOSTIC_WAIT_TIME.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                f3765a[com.facetec.sdk.c.DIAGNOSTIC_UPLOAD_ERROR.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                f3765a[com.facetec.sdk.c.ON_RESUME_ERROR.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                f3765a[com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_FACESCAN.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                f3765a[com.facetec.sdk.c.UNEXPECTED_EARLY_EXIT_IDSCAN.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_DEFAULT.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_CONFIGURE_FAILED_DEFAULT.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_CAPTURE_FAILED_ATTEMPT_FALLBACK.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_START.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_SKIPPED_APP_VALIDATED.ordinal()] = 43;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_FAIL_PUBLIC_KEY.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_FAIL_DEVICE_NOT_SUPPORTED.ordinal()] = 45;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_FAIL_VERSION_DEPRECATED.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused65) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_FAIL_DEVICE_KEY_REJECTED.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused66) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_FAIL_NETWORK_ERROR.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused67) {
            }
            try {
                f3765a[com.facetec.sdk.c.INIT_FINISH.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused68) {
            }
            try {
                f3765a[com.facetec.sdk.c.ID_FEEDBACK_SHOWN.ordinal()] = 50;
            } catch (java.lang.NoSuchFieldError unused69) {
            }
            try {
                f3765a[com.facetec.sdk.c.ADDITIONAL_REVIEW_BUTTON_PRESSED.ordinal()] = 51;
            } catch (java.lang.NoSuchFieldError unused70) {
            }
            try {
                f3765a[com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_RESUME.ordinal()] = 52;
            } catch (java.lang.NoSuchFieldError unused71) {
            }
            try {
                f3765a[com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_PAUSE.ordinal()] = 53;
            } catch (java.lang.NoSuchFieldError unused72) {
            }
            try {
                f3765a[com.facetec.sdk.c.FACETEC_SESSION_ACTIVITY_ON_WINDOW_FOCUS_CHANGED.ordinal()] = 54;
            } catch (java.lang.NoSuchFieldError unused73) {
            }
            try {
                f3765a[com.facetec.sdk.c.FACETEC_SDK_ACTIVITY_CONTEXT_SWITCH_TRIGGERED.ordinal()] = 55;
            } catch (java.lang.NoSuchFieldError unused74) {
            }
            try {
                f3765a[com.facetec.sdk.c.OPEN_FRONT_CAMERA2.ordinal()] = 56;
            } catch (java.lang.NoSuchFieldError unused75) {
            }
            try {
                f3765a[com.facetec.sdk.c.OPEN_FRONT_CAMERA1.ordinal()] = 57;
            } catch (java.lang.NoSuchFieldError unused76) {
            }
            try {
                f3765a[com.facetec.sdk.c.CALCULATE_FRONT_CAMERA_SIZE_START.ordinal()] = 58;
            } catch (java.lang.NoSuchFieldError unused77) {
            }
            try {
                f3765a[com.facetec.sdk.c.CALCULATE_FRONT_CAMERA_SIZE_EXCEPTION.ordinal()] = 59;
            } catch (java.lang.NoSuchFieldError unused78) {
            }
            try {
                f3765a[com.facetec.sdk.c.SELECTED_FRONT_CAMERA_SIZE.ordinal()] = 60;
            } catch (java.lang.NoSuchFieldError unused79) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_PERMISSION_SHOWN.ordinal()] = 61;
            } catch (java.lang.NoSuchFieldError unused80) {
            }
            try {
                f3765a[com.facetec.sdk.c.PRE_SESSION_PHASE_2_START.ordinal()] = 62;
            } catch (java.lang.NoSuchFieldError unused81) {
            }
            try {
                f3765a[com.facetec.sdk.c.PRE_SESSION_START_ERROR.ordinal()] = 63;
            } catch (java.lang.NoSuchFieldError unused82) {
            }
            try {
                f3765a[com.facetec.sdk.c.RESULT_SCREEN_SHOWN.ordinal()] = 64;
            } catch (java.lang.NoSuchFieldError unused83) {
            }
            try {
                f3765a[com.facetec.sdk.c.CAMERA_EVICTED_CONTEXT_SWITCH.ordinal()] = 65;
            } catch (java.lang.NoSuchFieldError unused84) {
            }
            try {
                f3765a[com.facetec.sdk.c.FACESCAN_CAMERA_CREATED.ordinal()] = 66;
            } catch (java.lang.NoSuchFieldError unused85) {
            }
            try {
                f3765a[com.facetec.sdk.c.SESSION_CAMERA_CLEANUP_CALLED.ordinal()] = 67;
            } catch (java.lang.NoSuchFieldError unused86) {
            }
            try {
                f3765a[com.facetec.sdk.c.NATIVE_AUDIT_TRAIL_METHOD_RETURNS_NULL.ordinal()] = 68;
            } catch (java.lang.NoSuchFieldError unused87) {
            }
            try {
                f3765a[com.facetec.sdk.c.SCAN_RESULT_BLOB_DECODE_ERROR.ordinal()] = 69;
            } catch (java.lang.NoSuchFieldError unused88) {
            }
            try {
                f3765a[com.facetec.sdk.c.UNEXPECTED_ACTIVITY_WINDOW_SIZE.ordinal()] = 70;
            } catch (java.lang.NoSuchFieldError unused89) {
            }
            try {
                f3765a[com.facetec.sdk.c.ASYNC_FACE_SCAN_SUCCESS_TASK_ERROR.ordinal()] = 71;
            } catch (java.lang.NoSuchFieldError unused90) {
            }
            try {
                f3765a[com.facetec.sdk.c.LOG_SUCCESSFUL_ENROLLMENT_ERROR.ordinal()] = 72;
            } catch (java.lang.NoSuchFieldError unused91) {
            }
            try {
                f3765a[com.facetec.sdk.c.VG_PLAY_SOUND_ERROR.ordinal()] = 73;
            } catch (java.lang.NoSuchFieldError unused92) {
            }
            try {
                f3765a[com.facetec.sdk.c.VG_TEXT_TO_SPEECH_ERROR.ordinal()] = 74;
            } catch (java.lang.NoSuchFieldError unused93) {
            }
            try {
                f3765a[com.facetec.sdk.c.POWER_BUTTON_PRESSED.ordinal()] = 75;
            } catch (java.lang.NoSuchFieldError unused94) {
            }
            try {
                f3765a[com.facetec.sdk.c.UNEXPECTED_HOOK_CHECK_ERROR.ordinal()] = 76;
            } catch (java.lang.NoSuchFieldError unused95) {
            }
            try {
                f3765a[com.facetec.sdk.c.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_RESOLUTION.ordinal()] = 77;
            } catch (java.lang.NoSuchFieldError unused96) {
            }
            try {
                f3765a[com.facetec.sdk.c.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_ELAPSED_TIME.ordinal()] = 78;
            } catch (java.lang.NoSuchFieldError unused97) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        com.facetec.sdk.de deVar = (com.facetec.sdk.de) objArr[0];
        int i2 = s + 97;
        m = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
            switch (com.facetec.sdk.t.AnonymousClass2.e[deVar.ordinal()]) {
                case 1:
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    q(16 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.graphics.Color.red(0) + 6031), 538 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
                    return ((java.lang.String) objArr2[0]).intern();
                case 2:
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    q((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 59475), 555 - android.graphics.Color.red(0), objArr3);
                    return ((java.lang.String) objArr3[0]).intern();
                case 3:
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    q(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 14, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 578, objArr4);
                    return ((java.lang.String) objArr4[0]).intern();
                case 4:
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    q(android.view.View.combineMeasuredStates(0, 0) + 16, (char) (android.view.KeyEvent.keyCodeFromString("") + 11956), 640 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
                    return ((java.lang.String) objArr5[0]).intern();
                case 5:
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    q('?' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 608 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr6);
                    return ((java.lang.String) objArr6[0]).intern();
                case 6:
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    q((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 623 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr7);
                    return ((java.lang.String) objArr7[0]).intern();
                case 7:
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    q(12 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0), 637 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                    return ((java.lang.String) objArr8[0]).intern();
                case 8:
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    q(11 - android.view.KeyEvent.normalizeMetaState(0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 648 - (android.os.Process.myTid() >> 22), objArr9);
                    java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                    int i4 = m + 93;
                    s = i4 % 128;
                    if (i4 % 2 != 0) {
                        return intern;
                    }
                    throw null;
                case 9:
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    q(android.graphics.Color.argb(0, 0, 0, 0) + 8, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 659, objArr10);
                    return ((java.lang.String) objArr10[0]).intern();
                case 10:
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    q((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getSize(0) + 667, objArr11);
                    return ((java.lang.String) objArr11[0]).intern();
                case 11:
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    q((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, (char) android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.indexOf("", "", 0, 0) + 676, objArr12);
                    return ((java.lang.String) objArr12[0]).intern();
                case 12:
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    q(15 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (40701 - android.view.KeyEvent.keyCodeFromString("")), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 690, objArr13);
                    return ((java.lang.String) objArr13[0]).intern();
                case 13:
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    q(android.view.KeyEvent.getDeadChar(0, 0) + 22, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18239), 754 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr14);
                    return ((java.lang.String) objArr14[0]).intern();
                default:
                    return java.lang.String.valueOf(deVar);
            }
        }
        switch (com.facetec.sdk.t.AnonymousClass2.e[deVar.ordinal()]) {
        }
    }

    private static java.lang.String b(com.facetec.sdk.c cVar) {
        switch (com.facetec.sdk.t.AnonymousClass2.f3765a[cVar.ordinal()]) {
            case 1:
                java.lang.Object[] objArr = new java.lang.Object[1];
                q(22 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 795, objArr);
                return ((java.lang.String) objArr[0]).intern();
            case 2:
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                q(20 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.getMode(0) + 924, objArr2);
                return ((java.lang.String) objArr2[0]).intern();
            case 3:
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                q(29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11449), 877 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
                return ((java.lang.String) objArr3[0]).intern();
            case 4:
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                q((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26, (char) (40332 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), android.view.MotionEvent.axisFromString("") + 945, objArr4);
                return ((java.lang.String) objArr4[0]).intern();
            case 5:
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 39558), 905 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                return ((java.lang.String) objArr5[0]).intern();
            case 6:
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                q(16 - android.graphics.Color.red(0), (char) (60919 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 728 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr6);
                return ((java.lang.String) objArr6[0]).intern();
            case 7:
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                q((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, (char) (53650 - android.view.View.resolveSize(0, 0)), 744 - android.graphics.Color.red(0), objArr7);
                return ((java.lang.String) objArr7[0]).intern();
            case 8:
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                q(22 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (26588 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 772, objArr8);
                return ((java.lang.String) objArr8[0]).intern();
            case 9:
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                q(32 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), android.os.Process.getGidForName("") + 817, objArr9);
                return ((java.lang.String) objArr9[0]).intern();
            case 10:
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                q(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", ""), 849 - android.view.View.MeasureSpec.getMode(0), objArr10);
                return ((java.lang.String) objArr10[0]).intern();
            case 11:
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                q(12 - android.text.TextUtils.getOffsetBefore("", 0), (char) android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 971, objArr11);
                return ((java.lang.String) objArr11[0]).intern();
            case 12:
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                q(13 - android.view.View.resolveSize(0, 0), (char) (android.graphics.Color.alpha(0) + 33512), 983 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr12);
                return ((java.lang.String) objArr12[0]).intern();
            case 13:
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                q(11 - (android.os.Process.myTid() >> 22), (char) (34822 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 996, objArr13);
                return ((java.lang.String) objArr13[0]).intern();
            case 14:
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                q(20 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1007, objArr14);
                return ((java.lang.String) objArr14[0]).intern();
            case 15:
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                q(17 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (47698 - android.view.View.getDefaultSize(0, 0)), android.text.TextUtils.getOffsetBefore("", 0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3, objArr15);
                return ((java.lang.String) objArr15[0]).intern();
            case 16:
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                q(11 - android.view.View.resolveSize(0, 0), (char) (25103 - android.graphics.Color.blue(0)), android.graphics.Color.blue(0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IDS_BASE_VALUE, objArr16);
                return ((java.lang.String) objArr16[0]).intern();
            case 17:
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                q(8 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1056 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr17);
                return ((java.lang.String) objArr17[0]).intern();
            case 18:
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                q(18 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (7970 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 1063 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr18);
                return ((java.lang.String) objArr18[0]).intern();
            case 19:
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                q(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 20, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 1081 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr19);
                return ((java.lang.String) objArr19[0]).intern();
            case 20:
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                q((android.view.KeyEvent.getMaxKeyCode() >> 16) + 21, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1101, objArr20);
                return ((java.lang.String) objArr20[0]).intern();
            case 21:
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                q(android.view.View.MeasureSpec.getSize(0) + 14, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1121, objArr21);
                return ((java.lang.String) objArr21[0]).intern();
            case 22:
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                q(android.graphics.Color.blue(0) + 14, (char) android.view.View.resolveSize(0, 0), 1135 - (android.os.Process.myPid() >> 22), objArr22);
                return ((java.lang.String) objArr22[0]).intern();
            case 23:
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, (char) (46681 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1149, objArr23);
                return ((java.lang.String) objArr23[0]).intern();
            case 24:
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                q(26 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1170 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr24);
                return ((java.lang.String) objArr24[0]).intern();
            case 25:
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                q(28 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 46562), 1197 - android.view.KeyEvent.getDeadChar(0, 0), objArr25);
                return ((java.lang.String) objArr25[0]).intern();
            case 26:
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, (char) (13596 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 1224 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr26);
                return ((java.lang.String) objArr26[0]).intern();
            case 27:
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                q(2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1229, objArr27);
                return ((java.lang.String) objArr27[0]).intern();
            case 28:
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                q(android.view.View.resolveSize(0, 0) + 5, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1232, objArr28);
                return ((java.lang.String) objArr28[0]).intern();
            case 29:
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                q(3 - android.graphics.Color.blue(0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 61732), 1237 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr29);
                java.lang.String intern = ((java.lang.String) objArr29[0]).intern();
                m = (s + 85) % 128;
                return intern;
            case 30:
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 38523), 1240 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr30);
                return ((java.lang.String) objArr30[0]).intern();
            case 31:
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                q(4 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0), 1243 - (android.os.Process.myTid() >> 22), objArr31);
                return ((java.lang.String) objArr31[0]).intern();
            case 32:
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                q(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, (char) (30467 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1245, objArr32);
                return ((java.lang.String) objArr32[0]).intern();
            case 33:
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                q(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22, (char) (38 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1253, objArr33);
                return ((java.lang.String) objArr33[0]).intern();
            case 34:
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                q(android.text.TextUtils.getTrimmedLength("") + 3, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1274 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr34);
                return ((java.lang.String) objArr34[0]).intern();
            case 35:
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                q((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 62616), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1277, objArr35);
                return ((java.lang.String) objArr35[0]).intern();
            case 36:
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                q(3 - android.view.View.combineMeasuredStates(0, 0), (char) (15105 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1281, objArr36);
                return ((java.lang.String) objArr36[0]).intern();
            case 37:
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                q((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, (char) (15366 - android.graphics.Color.argb(0, 0, 0, 0)), 1285 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr37);
                return ((java.lang.String) objArr37[0]).intern();
            case 38:
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                q(android.view.View.MeasureSpec.getSize(0) + 32, (char) (20697 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.graphics.Color.alpha(0) + 1318, objArr38);
                return ((java.lang.String) objArr38[0]).intern();
            case 39:
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                q(26 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.text.TextUtils.getOffsetAfter("", 0), 1350 - android.view.View.resolveSize(0, 0), objArr39);
                return ((java.lang.String) objArr39[0]).intern();
            case 40:
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                q(28 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (45236 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1376 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr40);
                return ((java.lang.String) objArr40[0]).intern();
            case 41:
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                q((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (char) android.text.TextUtils.indexOf("", ""), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1404, objArr41);
                return ((java.lang.String) objArr41[0]).intern();
            case 42:
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                q(android.view.KeyEvent.keyCodeFromString("") + 16, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4822), 1438 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr42);
                return ((java.lang.String) objArr42[0]).intern();
            case 43:
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                q(android.graphics.Color.red(0) + 30, (char) android.view.KeyEvent.keyCodeFromString(""), android.widget.ExpandableListView.getPackedPositionType(0L) + 1454, objArr43);
                return ((java.lang.String) objArr43[0]).intern();
            case 44:
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                q(24 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44356), android.view.View.combineMeasuredStates(0, 0) + 1484, objArr44);
                return ((java.lang.String) objArr44[0]).intern();
            case 45:
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 33, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50505), 1509 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr45);
                return ((java.lang.String) objArr45[0]).intern();
            case 46:
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                q(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 16, (char) (25578 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), android.view.KeyEvent.getDeadChar(0, 0) + 1541, objArr46);
                return ((java.lang.String) objArr46[0]).intern();
            case 47:
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                q(31 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 1572 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr47);
                return ((java.lang.String) objArr47[0]).intern();
            case 48:
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                q(27 - android.graphics.Color.blue(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56965), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1605, objArr48);
                return ((java.lang.String) objArr48[0]).intern();
            case 49:
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                q(17 - android.graphics.Color.green(0), (char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1631, objArr49);
                return ((java.lang.String) objArr49[0]).intern();
            case 50:
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                q(15 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.Color.alpha(0) + 49405), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1650, objArr50);
                return ((java.lang.String) objArr50[0]).intern();
            case 51:
                java.lang.Object[] objArr51 = new java.lang.Object[1];
                q(28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 47458), android.graphics.ImageFormat.getBitsPerPixel(0) + 1665, objArr51);
                return ((java.lang.String) objArr51[0]).intern();
            case 52:
                java.lang.Object[] objArr52 = new java.lang.Object[1];
                q((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.view.KeyEvent.keyCodeFromString("") + 1691, objArr52);
                return ((java.lang.String) objArr52[0]).intern();
            case 53:
                java.lang.Object[] objArr53 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 29, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1769 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr53);
                return ((java.lang.String) objArr53[0]).intern();
            case 54:
                java.lang.Object[] objArr54 = new java.lang.Object[1];
                q(39 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 61531), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1749, objArr54);
                return ((java.lang.String) objArr54[0]).intern();
            case 55:
                java.lang.Object[] objArr55 = new java.lang.Object[1];
                q(49 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-16758716) - android.graphics.Color.rgb(0, 0, 0)), 1789 - android.graphics.Color.alpha(0), objArr55);
                return ((java.lang.String) objArr55[0]).intern();
            case 56:
                java.lang.Object[] objArr56 = new java.lang.Object[1];
                q((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 1837 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr56);
                return ((java.lang.String) objArr56[0]).intern();
            case 57:
                java.lang.Object[] objArr57 = new java.lang.Object[1];
                q((-16777200) - android.graphics.Color.rgb(0, 0, 0), (char) (30113 - android.view.KeyEvent.normalizeMetaState(0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1853, objArr57);
                return ((java.lang.String) objArr57[0]).intern();
            case 58:
                java.lang.Object[] objArr58 = new java.lang.Object[1];
                q(29 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1868, objArr58);
                return ((java.lang.String) objArr58[0]).intern();
            case 59:
                java.lang.Object[] objArr59 = new java.lang.Object[1];
                q(34 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1898, objArr59);
                return ((java.lang.String) objArr59[0]).intern();
            case 60:
                java.lang.Object[] objArr60 = new java.lang.Object[1];
                q(android.view.View.MeasureSpec.getSize(0) + 23, (char) (23813 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1931 - android.view.View.resolveSize(0, 0), objArr60);
                return ((java.lang.String) objArr60[0]).intern();
            case 61:
                java.lang.Object[] objArr61 = new java.lang.Object[1];
                q(21 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1955, objArr61);
                return ((java.lang.String) objArr61[0]).intern();
            case 62:
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                q(21 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1975 - android.graphics.Color.argb(0, 0, 0, 0), objArr62);
                return ((java.lang.String) objArr62[0]).intern();
            case 63:
                java.lang.Object[] objArr63 = new java.lang.Object[1];
                q(27 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (52975 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1995, objArr63);
                return ((java.lang.String) objArr63[0]).intern();
            case 64:
                java.lang.Object[] objArr64 = new java.lang.Object[1];
                q(android.view.View.MeasureSpec.getMode(0) + 24, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3456), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2022, objArr64);
                return ((java.lang.String) objArr64[0]).intern();
            case 65:
                java.lang.Object[] objArr65 = new java.lang.Object[1];
                q(26 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2047, objArr65);
                java.lang.String intern2 = ((java.lang.String) objArr65[0]).intern();
                m = (s + 87) % 128;
                return intern2;
            case 66:
                java.lang.Object[] objArr66 = new java.lang.Object[1];
                q(21 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.getOffsetAfter("", 0), 2073 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr66);
                return ((java.lang.String) objArr66[0]).intern();
            case 67:
                java.lang.Object[] objArr67 = new java.lang.Object[1];
                q(android.view.View.resolveSize(0, 0) + 26, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2095, objArr67);
                return ((java.lang.String) objArr67[0]).intern();
            case 68:
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                q(33 - android.text.TextUtils.indexOf("", ""), (char) (android.text.TextUtils.indexOf("", "", 0) + 8791), 2121 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr68);
                return ((java.lang.String) objArr68[0]).intern();
            case 69:
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                q(24 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2152 - android.os.Process.getGidForName(""), objArr69);
                return ((java.lang.String) objArr69[0]).intern();
            case 70:
                java.lang.Object[] objArr70 = new java.lang.Object[1];
                q(android.text.TextUtils.indexOf("", "", 0) + 28, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 42387), 2179 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr70);
                return ((java.lang.String) objArr70[0]).intern();
            case 71:
                java.lang.Object[] objArr71 = new java.lang.Object[1];
                q(android.view.MotionEvent.axisFromString("") + 30, (char) android.text.TextUtils.indexOf("", ""), 2206 - android.graphics.Color.blue(0), objArr71);
                return ((java.lang.String) objArr71[0]).intern();
            case 72:
                java.lang.Object[] objArr72 = new java.lang.Object[1];
                q((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27, (char) (27571 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2235, objArr72);
                return ((java.lang.String) objArr72[0]).intern();
            case 73:
                java.lang.Object[] objArr73 = new java.lang.Object[1];
                q(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 16, (char) (1702 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2263, objArr73);
                return ((java.lang.String) objArr73[0]).intern();
            case 74:
                java.lang.Object[] objArr74 = new java.lang.Object[1];
                q(android.text.TextUtils.getOffsetBefore("", 0) + 19, (char) android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.alpha(0) + 2279, objArr74);
                return ((java.lang.String) objArr74[0]).intern();
            case 75:
                java.lang.Object[] objArr75 = new java.lang.Object[1];
                q((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, (char) (android.graphics.Color.rgb(0, 0, 0) + 16819971), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2297, objArr75);
                return ((java.lang.String) objArr75[0]).intern();
            case 76:
                java.lang.Object[] objArr76 = new java.lang.Object[1];
                q((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 31, (char) (50871 - android.text.TextUtils.getOffsetBefore("", 0)), 2315 - android.os.Process.getGidForName(""), objArr76);
                return ((java.lang.String) objArr76[0]).intern();
            case 77:
                java.lang.Object[] objArr77 = new java.lang.Object[1];
                q(38 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.graphics.Color.argb(0, 0, 0, 0), 2347 - android.text.TextUtils.indexOf("", ""), objArr77);
                return ((java.lang.String) objArr77[0]).intern();
            case 78:
                java.lang.Object[] objArr78 = new java.lang.Object[1];
                q(39 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (63678 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 2384 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr78);
                return ((java.lang.String) objArr78[0]).intern();
            default:
                return java.lang.String.valueOf(cVar);
        }
    }

    private static java.lang.String a(android.content.Context context) {
        int i2 = s + 67;
        m = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = context instanceof com.facetec.sdk.FaceTecSessionActivity;
            throw null;
        }
        if (!(context instanceof com.facetec.sdk.FaceTecSessionActivity)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        q(android.view.View.MeasureSpec.getSize(0) + 39, (char) (34859 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2425, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(((java.lang.Boolean) com.facetec.sdk.bl.d(new java.lang.Object[]{(com.facetec.sdk.bl) context}, com.facetec.sdk.oh.a.c(), 57224317, -57224293, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        q(android.view.View.getDefaultSize(0, 0) + 18, (char) (49077 - android.text.TextUtils.getOffsetBefore("", 0)), 2463 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(com.facetec.sdk.ax.a() - 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        q(3 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 51762), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2481, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.String obj = sb.toString();
        s = (m + 75) % 128;
        return obj;
    }

    private static java.lang.String e(android.app.Activity activity) {
        java.lang.String intern;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (activity == null) {
            return "";
        }
        android.app.Fragment a2 = com.facetec.sdk.ay.a(activity);
        if (a2 != null) {
            int i2 = m + 101;
            s = i2 % 128;
            if (i2 % 2 == 0) {
                a2.getTag();
                java.lang.Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            intern = a2.getTag();
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            q((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4736), android.os.Process.getGidForName("") + 2485, objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            int i3 = m + 39;
            s = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 2;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        q(38 - android.os.Process.getGidForName(""), (char) (62115 - android.view.KeyEvent.normalizeMetaState(0)), android.graphics.Color.green(0) + 2488, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        if (activity.isFinishing()) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            q(4 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 7916), 2527 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
            obj = objArr3[0];
        } else {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            q(5 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.os.Process.getGidForName("") + 2532, objArr4);
            obj = objArr4[0];
        }
        sb.append(((java.lang.String) obj).intern());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        q(21 - android.view.View.getDefaultSize(0, 0), (char) android.view.View.MeasureSpec.getMode(0), 2537 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        if (activity.hasWindowFocus()) {
            m = (s + 11) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            q(android.graphics.Color.argb(0, 0, 0, 0) + 4, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7916), 2526 - android.view.MotionEvent.axisFromString(""), objArr6);
            obj2 = objArr6[0];
        } else {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            q((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2531 - android.text.TextUtils.indexOf("", ""), objArr7);
            obj2 = objArr7[0];
        }
        sb.append(((java.lang.String) obj2).intern());
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        q(14 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 2557 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr8);
        sb.append(((java.lang.String) objArr8[0]).intern());
        sb.append(intern);
        int mode = android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        q(mode + 3, (char) (51762 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), android.text.TextUtils.getTrimmedLength("") + 2481, objArr9);
        sb.append(((java.lang.String) objArr9[0]).intern());
        return sb.toString();
    }

    static void e() {
        l = new char[]{27760, 6201, 34024, 12477, 48444, 10556, 54775, 16826, 52845, 31334, 59101, 37557, 8049, 35636, 14307, 41897, 16785, 13765, 43268, 7494, 37023, 1238, 63498, 27752, 58251, 22477, 51971, 49001, 12931, 42692, 6658, 36421, 1441};
        f3764o = 1209274949551462488L;
    }

    static void d() {
        char[] cArr = new char[2676];
        java.nio.ByteBuffer.wrap("l|Ð]\u00145X\r\u009cÑÀÇ\u0004\u009fI~\u008diñ-5\u0016yÌ½§á\u0086&kjr®\u001f\u0012ïVÃ\u009a¤Þ\u0096v\u009aÊ±\u000eìBâ\u0086\nÚ#\u001eTS\u0098\u0097³ëÑ/úc#§^ûO<\u0082pº´æ\b\u0019L+l|Ð]\u00145X\r\u009cÑÀÇ\u0004\u009fI~\u008diñ-5\nyÔ½°á\u0095&mjKlsÐX\u0014\u0005X\u000b\u009cãÀÊ\u0004½Iq\u008dFñ 5\u0004yÙ½±á\u009fl~ÐS\u00145X\u001d\u009cïÀÁ\u0004\u0090Id\u008d~ñ55\u0016yÝsÇÏý\u000b\u008dG¨\u0083HßK\u001b>VÚ\u0092Åî\u0081*¼f\u007f¢\u0013þ4º\u0097\u0006§ÂÊ\u008eôJ\t\u0016$Òd\u009f³[«'Æãí\u001eë¢Ìf¡*\u0088îp\u008cp0mô\u0002¸9|Ò ìä¯lSÐR\u0014 X\t\u009cîÀÍ\u0004\u009aI]\u008dXñ65-yÝ½«\u0094t(eì\u0019 $dÑ8öü±±IuS\t\u0002Í(\u0081ëE\u009c%\u0003\u0099\t]b\u0011\\Õ½\u0089\u009dMÐ\u0000#Ä\u001f¸x|y0\u0090ôú¨Áo&lOÐR\u0014=X\u0006\u009cíÀÓ\u0004\u0090IB\u008dOñ85\u0014yÁqìÍí\t\u008aE¸\u0081PÝk\u0019 TÛ\u0090üì\u0091(µdb )ü$;Ò³Î\u000fßËµ\u0087\u0096Ca\u001f\u0015Û\b\u0096äRÏ.©ê\u009e¦Gb$>EùÜµÐq\u0086Íh\u0089UE8\u0001AÜµ\u0098¼T\u0094\u0010kìM¨8kû'×ãå¿\u008c{e7*ó\u0019Nò\nÊÆé\u0082Õl|ÐO\u0014&X\u0006\u009cåéWUd\u00914Ý\u0007\u0019úEì\u0081´ÌU\bqt\t°*lhÐH)ü\u0095Ðl\u0004Ð&\u0014@Xx\u009c\u0090À\u0087\u0004ðI\u0017\u008d8¨o\u0014NÐ9\u009c\u0000Xÿ\u0004ÔÀ\u008e\u008dmIB59ñ\u0015½Êy\u0087%\u008cl~ÐU\u00147X\u000f\u009cìÀË\u0004\u008dId\u008dCñ/5/yÜlmlr°h\fGljÐ]\u0014$X\t\u009cïÀÁ\u0004\u008aIu\u008dXñ?Í_q'µSùdlsÐQ\u00147X\u000f\u009cçÀ\u008b\u0004\u008eI~\u008dM(â\u0094ØP²\u001c\u0088Øa\u0084\u000e@A\r¯ÉÛµ¬q\u009f=\u0006ù8¥\u000bbñ.Ýê\u008bVy\u0012RÞ0\u009a\\G÷\u0003¡Ï\u008d\u008b5w]3&ðá¼\u008dx²$Ïà>¬{hCÕü\u0091×]½\u0019\u0099Å\u0001\u0081-M\u000f\nðöÂ²\u0081~R:Eæ,¢\u0004o\u0087+¼\u0097\u0088S\u007fl\\Ð]\u00145X\r\u009cÖÀÁ\u0004\u009dIC\u008dOñ?5\u0015yÑ½½á\u009a&]jT®\u001b\u0012èVÃ\u009a»ÞÂ]\u0095á\u0094%üiÄ\u00ad\u001fñ\b5Tx\u0090¼§ÀÖ\u0004ÌH\u0010\u008cuÐn\u0017³[\u0088\u009fÇ# g\f«!l:Ð@\u0014vlnQ\tí9)[ex¡²ý©9÷t\u0011°\u0002ÌA\boDµ\u0080ÂlmÐ]\u0014?X\u001c\u009cÖÀÍ\u0004\u0093Iu\u008d~ñ#5\u0012yÙ½¾l[Ð_\u0014\"X\u0001\u009côÀÍ\u0004\u008aIi\u008d\nñ\u001f5\u0012yÙ½¦á\u0091&.ji®\u0014\u0012úVÙ$Ù\u0098Ú\\°\u0010\u0083Ôt\u0088OL\u0013\u0001üÅÉ¹¢}Ä1sõ>©\u0010nãlIÐH\u00147X\u000b\u009céÀ\u0084\u0004ªIb\u008dKñ/5\u0003lIÐY\u0014%X\u001b\u009cëÀË\u0004\u0090I0\u008dcñ\"5\u0000y×ljÐ]\u0014/X\u0004\u009cíÀÅ\u0004\u009aIF\u008dOñ>5\u0015yÑ½½á\u009a\n0¶\u0007re>Fú\u0083¦\u0097bÉ/ ë\u0006\u0097+SP\u001fÒÛµ\u0087\u0099@&lYÐ]\u00145X\u0000\u009cçÀÀ\u0004ÞIv\u008dCñ 5\u0003y\u0098½¡á\u0091&mjR®\u001f\u0012èV\u0096\u009a®Þ\u008d\u0003vG~{öÇÒ\u0003´O\u0082\u008b\u007f×J\u0013!^ú\u009a×æ®\"\u0080nDª.ö\u00121î}Á\u0084'8\u0006ük°Ht¿(\u0091ìÆ¡\u0002e\u001f\u0019{ÝW\u0091¿Uå\tÁÎ4\u00823FKú¼¾°rù6×ë4¯sl|Ð]\u00145X\r\u009cÑÀÇ\u0004\u009fI~\u008dpñ#5\tyÕ½·á\u0090BÈþé:\u0081v¹²eîs*+gÊ£Ëß\u0096\u001b¨Wc\u0093\tÏ-\bßDðlhÐY\u0014\"X\u001a\u009cûÀ÷\u0004\u0097It\u008dOñ\u000e5\u001fyë½»á\u0090&klhÐY\u0014\"X\u001a\u009cûÀã\u0004\u009bId\u008dxñ)5\u0007yÜ½«lhÐY\u0014%X\u001d\u009cîÀÐ\u0004«I`\u008dFñ#5\u0007yÜlsÐX\u0014\u0005X\u000b\u009cãÀÊ\u0004\u00adId\u008dKñ>5\u0012ltÐZ\u00145X;\u009cöÀÅ\u0004\u008cIdlhÐY\u0014%X\u001d\u009cîÀÐ\u0004±IS\u008dxliÐY\u00145X\u001d\u009cðÀÍ\u0004\u0090Iw\u008diñ-5\u000byÝ½ á\u0095ò\u0095N¤\u008aØÆà\u0002\u0013^-\u009aJ×\u0089\u0013\u0091oÔ«þç!#M\u007fh¸\u0090ô¶+V\u0097gS\u001b\u001f#ÛÐ\u0087îC\u0081\u000eJÊp¶\u001br,>ïú\u0083¦¤aQ-ré\u0016UÇ\u0011þÝ\u009f\u0099¹DM\u0081\u008b=¾ùÍµóq&-6éz¤\u0094`´\u001cÔØÿ\u0094\u001cPQ\fbË\u008b\u0087£½ï\u0001ËÅ°\u0089¨Mu\u0011WÕ\b\u0098û\\ñ ³ä¦¨Ol!0\u0002÷å»á\u007f\u0080Ãa\u0087SK4\u000f1Òø\u0096¨Z°\u001e}â_¦0eó\u000b¡·\u0085sþ?æû;§\u0019cF.µê¿\u0096ýRè\u001e\u0001Úo\u0086LA«\r¬ÉÔu%1\u0019ýg¹[d¼l|Ð]\u00145X\r\u009cÑÀÇ\u0004\u009fI~\u008diñ-5\nyÔ½°á\u0095&mjK®9\u0012ýVÚ\u009a¤Þ\u0087\u0003`l}ÐY\u0014\"X:\u009cçÀÅ\u0004\u009aIi\u008dcñ!54yÝ½³á\u0090&wjs®\u0012\u0012óVÁ\u009a¦Þ£\u0003jG:\u008b\"Ïï3Íw¢´aø`<1`\u001a¤òè£l}ÐY\u0014\"X:\u009cçÀÅ\u0004\u009aIi\u008dcñ!54yÝ½³á\u0090&wjp®\b\u0012ùVÅ\u009a»Þ\u0087\u0003`G\f\u008b\u0015Ïþ3Þw¿@Äüã8\u009at·°Tìq(4eÏ¡âÝ£\u0019¯Ug\u0091\fÍ\b\nÕFù\u0082¥>uzo¶\u0013ò6/ýk\u0085§¦ã\\\u001ft[\u001d\u0098ÁÔãöøJÕ\u008e³Â\u009b\u0006iZG\u009e\u0016Óâ\u0017øk³¯\u0090ã['\u0004{\u0000¼íðÕ4\u008f\u0088\u007fÌTlsÐX\u0014\u0005X\u000b\u009cãÀÊ\u0004½Iq\u008dFñ 5\u0004yÙ½±á\u009f&MjA®\u0016\u0012ðVÓ\u009a¬ñòMÕ\u0089¬Å\u0081\u0001b]G\u0099\u0002Ôù\u0010Ôl\u0095¨\u0099äQ :|1»Æ÷ÿ3\u0095\u008fqËT\u0007\u0007C\u000f\u009eäÚ¾\u0016\u009eRg®Cê!lyÐ]\u0014;X\r\u009cðÀÅ\u0004ÌIU\u008dXñ>5\tyÊî\u009cR»\u0096ÐÚÆ\u001e\u000bB8\u0086wË\u0094\u000f\u0087sÖ·üû??HäoX_\u009c&Ð\u000b\u0014öHÇ\u008c½Ád\u0005^y%½\u0012llÐS\u00145X\t\u009cîÀã\u0004\u008bIy\u008dNñ-5\byÛ½·á§&zjA®\b\u0012èVÓ\u009a¬Ö+j\u000f®iâ_&¢z\u0097¾àó'7\u001fK\u007f\u008fWÃ\u0093\u0007Å[Ô\u009c.Ð\u001d\u0014Z\u000ev²Rv4:\u0002þÿ¢Êf´+mïW\u0093,W\u001bltÐZ\u00145X-\u009cðÀÖ\u0004\u0091IbsVÏx\u000b\u0017G\u001f\u0083Óßã\u001b®V\u007f\u0092gî\u0018*!fþ¢´þ³9Zuk±;\rÛl~ÐY\u00140X\u0001\u009cìÀÍ\u0004\u008aIu\u008dFñ55$yÍ½µá½&hjs®\u001f\u0012ùVØliÐH\u00147X\u001a\u009cöÀô\u0004\u008cIu\u008d\\ñ%5\u0003yÏ½\u0097á\u008c&mjE®\n\u0012èVß\u009a§Þ\u008cloÐR\u00143X\u0010\u009còÀÁ\u0004\u009dId\u008dOñ(5(yÍ½¾á\u0098l\u007fÐD\u0014?X\u001c\u009cÑÀÇ\u0004\u008cIu\u008dOñ\"52yÁ½¢á\u0091Ú'f\u001c¢gîD*\u0089v\u009f²Ôÿ-;\u0017Gz\u0083{Ï\u008c\u000bëWÜ\u0090%Ü\u001d\u0018F¤\u0090à\u0087,ýhßliÐY\u0014%X\u001b\u009cëÀË\u0004\u0090IB\u008dOñ?5\u0013yÔ½¦á¡&`jE®\u0002\u0012ìVÓ\u009a«Þ\u0096\u0003aG:\u008b>Ïÿ3ÀwªÙ\u008beµ¡Øíì)\ru,±gü¹8ªDÃ\u0080ãÌ5\bVTg\u0093ºß¯\u001bþ§\u0005ã'/Lk`¶\u0091òÚ>õz%\u00868ÂK\u0001\u0095YgåH!8m\u0010l~ÐL\u00143lyÐ^\u0014$X\u0001\u009cç\u009dR!uå\u0017ú\fF+\u0082[lyÐ]\u00145\u001b\u007f§\rc3/.ëó·Õs\u0092>alUÐw\u0014\u0017X\n\u009cÅÀö\u0004¹Ic\u008dbñ\u000f58yî½\u0091á±&\\jc®8\u0012ôVå\u009a\u0082Þ¨l~ÐK\u0014\"\u0098æ$Áà¯WtëO/2PIìT(5d\u0016 ôüÇ8\u009bub±IÍ.\t%Eß\u0081¦Ý\u009e\u001aqVc\u0092\u0004.ójÄ¦\u0088â\u0085?a{=·%óï\u000fËK®\u0088_ÄZ\u00006\\\u001a\u0098éÔµ\u0010\u009e<\u0097\u0080\u008aDë\bÈÌ*\u0090\u0019TE\u0019¼Ý\u0097¡ðeû)\u0001íx±@v¯:½þÚB-\u0006\u001aÊY\u008e~S\u008f\u0017åÛÉ\u009f<c5'pä¤¨\u0098lã0ßô<lyÐ]\u0014;X\r\u009cðÀÅ\u0004½Iq\u008dZñ85\u0013yÊ½·á²&ojI®\u0016\u0012ùVÒ\u009a\u008cÞ\u0087\u0003bG?\u008b\u0005Ïæ3ØÜÍ`é¤\u008fè¹,Dpq´\tùË=ðA\u009e\u0085»Ék\r\u0013Q2\u0096ßÚÒ\u001e¯¢Aæn*\u0019n2³ô÷\u008f;¢\u007f_\u0083mÇ\u001e\u0004ØlyÐ]\u0014;X\r\u009cðÀÅ\u0004½Iq\u008dZñ85\u0013yÊ½·á²&ojI®\u0016\u0012ùVÒ\u009a\u0089Þ\u0096\u0003pG;\u008b\u001dÏú3Øw\u0080´yø^<8`\f¤áè¹,\u0097~¥Â\u0084\u0006éJÊ\u008e\u0007Ò\u0006\u0016I[´\u009f\u0088ãÛ'Þk\n¯vóM4±x\u0092lsÐR\u0014?X\u001c\u009cÑÀÏ\u0004\u0097I`\u008dZñ)5\u0002yù½¢á\u0084&XjA®\u0016\u0012õVÒ\u009a©Þ\u0096\u0003aG:\u008b1Ïä3Èw´´wø[<0Á6}\u0017¹zõY1\u0081m\u0080©Òä9 ?\\|\u0098AÔ\u0091\u0010þLÒ\u008b\u0000Ç\u0000\u0003F¿\u0098û\u009d7ésÕ®.êr&Q©9\u0015\u0018Ñu\u009dVY\u008e\u0005\u008fÁÝ\u008c6H$4cðZ¼\u009bxû$Ûã\n¯\u0005kD×\u0085\u0093\u0089_ò\u001bØÆ!\u0082fNN\n¥ö\u0082²Íq<=\u001cùl¥Ka£-ô\u000f\u0099³¸wÕ;öÿ.£/g}*\u0096î\u0096\u0092ÃVþ\u001a!ÞQ\u0082qE\u008a\t\u008eÍõq\u00065.ùG½k`\u008f$Àèÿ¬\u0004P\u0007\u0014B×\u0096\u009bª_Ñ\u0003íÇ\u000elsÐR\u0014?X\u001c\u009cÄÀÅ\u0004\u0097I|\u008dnñ)5\u0010yÑ½±á\u0091&EjE®\u0003\u0012ÎVÓ\u009a¢Þ\u0087\u0003gG*\u008b\u0015Ïî3íw¨´|ø@<;`\u0007¤ä²÷\u000eÖÊ»\u0086\u0098B@\u001eAÚ\u0013\u0097øSà/\u00adë\u0096§Kc9?\u0002øá´áp\u008cÌj\u0088]D>\u0000'Ýî\u0099¾U\u0086\u0011aíA©&lsÐR\u0014?X\u001c\u009cÄÀÍ\u0004\u0090Iy\u008dYñ$5'yÖ½¶á\u0086&ajI®\u001e¬\u008e\u0010¥Ôí\u0098ð\\\u001a\u0000=Äa\u0089\u008cM´1ÚõÈ¹-}@!~æ\u009dÕ\u0019i:\u00adPác%\u0094y¯½óð\u001c4)HB\u008cVÀ¿\u0004ÆXÿ\u009f\tÓ5\u0017Z«\u008bï #Þgïº\bþl2`v\u008d\u008a½Î×l\\Ð]\u00145X\r\u009cÖÀÁ\u0004\u009dIC\u008dOñ?5\u0015yÑ½½á\u009a&OjC®\u000e\u0012õVÀ\u009a¡Þ\u0096\u0003}G\u0011\u008b\u001eÏØ3Éwµ´mø_<1l\\Ð]\u00145X\r\u009cÖÀÁ\u0004\u009dIC\u008dOñ?5\u0015yÑ½½á\u009a&OjC®\u000e\u0012õVÀ\u009a¡Þ\u0096\u0003}G\u0011\u008b\u001eÏÚ3Íw³´køW\u009c\u0007 \u0006än¨Vl\u008d0\u009aôÆ¹\u0018}\u0014\u0001dÅN\u0089\u008aMæ\u0011ÁÖ\u0014\u009a\u0018^Uâ®¦\u009bjú.Íó&·R{B?¿Ã\u0093\u0087òD4\b/Ì`\u0090VT®\u0018òÜäa%%\u0012éw\u00adXq\u0080$\u0018\u0098\u0019\\q\u0010IÔ\u0092\u0088\u0085LÙ\u0001\u0007Å*¹C}c1\u009fõâ©Ùn<\"\ræJZ¡\u001e±Òã\u0096ÈK4\u000f\u007fÃL\u0087º{»?õü5°\u0002ts(Bì\u0090 ìdÑÙ5\u009d\u000bQc\u0015RÉ»\u008dòAÚ\u0006-ú\u0010¾xr³6\u009cêë®ÝluÐL\u00143X\u0006\u009cÄÀÖ\u0004\u0091I~\u008d^ñ\u000f5\u0007yÕ½·á\u0086&oj\u0012\u0019Ô¥ía\u0092-§éeµwq0<ßøÿ\u0084®@¦\ftÈ\u0016\u0094'SÎ\u001f°lyÐ]\u0014:X\u000b\u009c÷ÀÈ\u0004\u009fId\u008dOñ\n5\u0014y×½¼á\u0080&MjA®\u0017\u0012ùVÄ\u009a©Þ±\u0003mG$\u008b\u0015ÏÙ3Øw§´jøFlyÐ]\u0014:X\u000b\u009c÷ÀÈ\u0004\u009fId\u008dOñ\n5\u0014y×½¼á\u0080&MjA®\u0017\u0012ùVÄ\u009a©Þ±\u0003mG$\u008b\u0015ÏÏ3Ôw¥´}øB< `\u0007¤ïè´1l\u008d\\I?\u0005\bÁä\u009dÕY\u009e\u0014qÐi¬;h\f$Óà£¼²{j7Hó\u001aOë\u000bÒÇ\u009e\u0083\u008e^{\u001a>lyÐ]\u0014;X\r\u009cðÀÅ\u0004®Iu\u008dXñ!5\u000fyË½¡á\u009d&ajN®)\u0012ôVÙ\u009a¿Þ\u008clJÐN\u00143X;\u009cçÀ×\u0004\u008dIy\u008dEñ\"56yÐ½³á\u0087&kj\u0012®)\u0012èV×\u009aºÞ\u0096¢¤\u001e ÚÝ\u0096ÕR\t\u000e9Êc\u0087\u0097C«?ÌûÛ·\"s]/hè\u0094¤\u008b`æÜ\u0000\u00987TT\u0010MÍ\u0084\u0089ÔEì\u0001\u000bý+¹LaÈÝÙ\u0019¥U\u009d\u0091nÍP\t-Dó\u0080Øü©8\u0083tV°\u0001ì\u001c+ág×£\u0094\u001f][X\u0097,Ó\u0010\u000eëJ·\u0086\u0094lYÐ]\u0014;X\r\u009cðÀÅ\u0004»If\u008dCñ/5\u0012yÝ½¶á·&ajN®\u000e\u0012ùVÎ\u009a¼Þ±\u0003sG7\u008b\u0004Ïé3Äl\\Ð]\u00145X\r\u009cÑÀÇ\u0004\u009fI~\u008diñ-5\u000byÝ½ á\u0095&MjR®\u001f\u0012ýVÂ\u009a\u00adÞ\u0086lIÐY\u0014%X\u001b\u009cëÀË\u0004\u0090IS\u008dKñ!5\u0003yÊ½³á·&bjE®\u001b\u0012òVÃ\u009a¸Þ¡\u0003eG2\u008b\u001cÏï3ÈN\u0003ò\n6uzV¾£â\u0096&èk2¯\u0019Ór\u0017E[»\u009f÷ÃÂ\u00040H\u001b\u008c`0®t\u0095¸÷üÚ!7e[©Bí©\u0011\u008eUã\u0096!Ú\u0016\u001eMBL\u0086»ÊálIÐ_\u00147X\u0006\u009cÐÀÁ\u0004\u008dIe\u008dFñ85$yÔ½½á\u0096&JjE®\u0019\u0012óVÒ\u009a\u00adÞ§\u0003vG,\u008b\u001fÏøÉÜuÁ± ý\u00839aeR¡\u000eì÷(ÜT»\u0090´ÜH\u00185D\u000e\u0083ëÏÚ\u000b\u009d·vór?2{\u001f¦óâ¢.\u0094jJ\u0096VÒ/\u0011îl[ÐO\u0014/X\u0006\u009cáÀâ\u0004\u009fIs\u008dOñ\u001f5\u0005yÙ½¼á§&{jC®\u0019\u0012ùVÅ\u009a»Þ¶\u0003eG-\u008b\u001bÏÏ3Þw´´wø@\u0007å»à\u007f\u00823\u0088÷D«to.\"Ææê\u009a\u008c^³\u0012~Ö\r\u008a\u0002MÓ\u0001áÅ¦yC=iñ\u0016µ4hÙ,\u0099à\u0086¤KXm\u001c\u001aßÙjêÖÝ\u0012 ^¢\u009aEÆ{\u0002\u000bOÙ\u008bù÷\u00843¤\u007f[»\u0006ç  ÇlôlLÐ{\u0014\u0002X\r\u009cúÀÐ\u0004ªI\u007f\u008dyñ<5\u0003yÝ½±á\u009c&KjR®\b\u0012óVÄËIwP³\"ÿ\u000e;ógå£\u0088îg*]V \u0092\u000bÞë\u001a£F\u0092\u0081~ÍP\t\u001cµûªì\u0016åÒ\u0085\u009e\u00adZZ\u0006zÂ-\u008fòKó7\u009eó©¿\u007f{\u0000' àÍ¬òh©Ôc\u0090n\\\u0010\u0018>Åð\u0081\u0081M¢\t^õp±4rÝ>÷ú\u008c¦«lSÐx\u0014\u0005X\u000b\u009cãÀÊ\u0004¼Iq\u008dIñ'5%yÙ½¿á\u0091&|jA®.\u0012ýVÝ\u009a\u00adÞ²\u0003lG1\u008b\u0004Ïå3íw\u0096´Qø`<1`\u001d¤ïè¶,\u0089\u0091bÕA\u0019-]\n\u0094í(Æì» µd]8tü\u0002±Ïu÷\t\u0099Í\u009b\u0081gE\u0001\u0019/ÞÂ\u0092ÿV\u0090êC®cb\u0013&\fûÒ¿\u008fsº7[ËS\u008f(Lï\u0000ÉÄ\u0086\u0098±\\N\u0010\u0017Ô'iÌ-Âá\u0095¥·yeäJX7\u009c]Ð\u0010\u0014ÌHü\u008c¦ÁR\u0005ny\t½mñÚ5\u0097i¹®Jâ+&|\u009a\u009aÞ½\u0012«V¨\u008b\\Ï6\u00034GÏ»óÿ\u0088<Kpm´,è2,Â`\u0085¤´\u0019U]f\u0091\rÕu\tµÓ\u008foõ«Ãç\u009b#V\u007fr».öö2üN\u0098\u008a½ÆN\u0002\b^4\u0099ÕÕá\u0011õ\u00ad\t¦\b\u001a.Þ\u0019~ÄÂù\u0006\u008aJ´\u009eÂ\"¿æÕª\u008anB2sö4»Å\u007fà\u0003\u009bÇ¼\u008b;O\"\u0013#ÔÌ\u0098÷\\¼à\u001f¤\\h\u0005,'ñÈµÝyþ=\u0004Á/\u0085\fFÈ\n×Î\u009e\u0092£VJ\u001a\nÞ7cÜ'åë\u0086¯ýs=r\u0082Î¢\nÏFál|Ð]\u0014:X\u001b\u009cçl:Ð\u001c\u0014*XH\u009c¢ÀÌ\u0004\u009fIc\u008d}ñ%5\byÜ½½á\u0083&HjO®\u0019\u0012éVÅ\u009aòÞÂl:Ð@\u0014vX\u000e\u009cðÀÅ\u0004\u0099I}\u008dOñ\"5\u0012y\u0082½ò¹2\u0005P\u0006\u0010º#~^2^ö\u0097ª¿nà##ç\u0014À£|\u0096¸ïôÚ0*l1¨fçå[Ö\u009f«Ó¡\u0017lKH\u008f\u0014ÂË\u0006Àz ¾ºòR6.j\b\u00adèáÀ%\u009b\u0099ZÝ}KXlnÐU\u0014;X\r\u009cñÀÐ\u0004\u009fI}\u008dZKZ÷o3\u0016\u007f#»ÓçÅ#ºnAªj(¸\u0094\u009bPä\u001cÏlrÐH\u0014\"X\u0018\u009cñÀ\u009e\u0004ÑI?\u008dKñ<5\u000fy\u0096½¨á\u009b&ajM®\u001b\u0012éVÂ\u009a ÞÌ\u0003gG1\u008b\u001dÏ¥3Íw¶´qø\u001d<\"`_¤®èë,Ó\u0091lÕG\u0019-]\t\u0081\u0091Å£\t\u008fN\u007f²Uö\u0011:ý~Ú".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2676);
        k = cArr;
        n = 8891048852335546428L;
    }

    static /* synthetic */ void c(android.content.Context context, com.facetec.sdk.o oVar) {
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        e(1218796339, com.facetec.sdk.el.e(), e2, e3, -1218796339, new java.lang.Object[]{context, oVar}, e4);
    }

    private static java.lang.String a(com.facetec.sdk.de deVar) {
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        return (java.lang.String) e(-663325080, com.facetec.sdk.el.e(), e2, e3, 663325085, new java.lang.Object[]{deVar}, e4);
    }

    private static byte[] a(android.content.Context context, java.lang.String str) throws java.lang.Exception {
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        return (byte[]) e(-1919888229, com.facetec.sdk.el.e(), e2, e3, 1919888233, new java.lang.Object[]{context, str}, e4);
    }

    private static java.lang.String c() {
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        return (java.lang.String) e(-388936151, com.facetec.sdk.el.e(), e2, e3, 388936152, new java.lang.Object[0], e4);
    }

    private static java.util.ArrayList<java.lang.String> d(java.util.ArrayList<java.lang.String> arrayList) {
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        return (java.util.ArrayList) e(2064534533, com.facetec.sdk.el.e(), e2, e3, -2064534531, new java.lang.Object[]{arrayList}, e4);
    }

    static void e(android.content.Context context) {
        int e2 = com.facetec.sdk.el.e();
        int e3 = com.facetec.sdk.el.e();
        int e4 = com.facetec.sdk.el.e();
        e(-700200062, com.facetec.sdk.el.e(), e2, e3, 700200065, new java.lang.Object[]{context}, e4);
    }
}
