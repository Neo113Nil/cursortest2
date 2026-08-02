package com.facetec.sdk;

/* loaded from: classes8.dex */
final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static int f3586a;
    private static final com.facetec.sdk.mr b;
    private static char[] c;
    private static long d;
    private static long e;
    private static int f;
    private static int g;
    private static int h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, short s, short s2) {
        int i2;
        int i3;
        int i4 = s2 + 4;
        byte[] bArr = $$a;
        int i5 = s * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i3 = i4;
            int i8 = 0;
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i3];
            i4 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = 110 - i;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{45, 43, com.visa.cbp.getEncExpo.onUnminimized, 104};
        $$b = 159;
    }

    g() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        g = 0;
        h = 1;
        f3586a = 0;
        f = 1;
        a();
        android.view.MotionEvent.axisFromString("");
        java.lang.Object[] objArr = new java.lang.Object[1];
        i(31 - android.text.TextUtils.indexOf("", "", 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 55 - android.graphics.Color.alpha(0), objArr);
        b = com.facetec.sdk.mr.d(((java.lang.String) objArr[0]).intern());
        int i = h + 59;
        g = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static com.facetec.sdk.mx e(android.content.Context context, java.lang.String str, java.lang.Object obj) throws com.facetec.sdk.g.a {
        int i = f + 59;
        f3586a = i % 128;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (i % 2 == 0) {
            return d(context, str, obj, bool);
        }
        d(context, str, obj, bool);
        throw null;
    }

    static com.facetec.sdk.mx d(android.content.Context context, java.lang.String str, java.lang.Object obj, java.lang.Boolean bool) throws com.facetec.sdk.g.a {
        com.facetec.sdk.mx c2 = a(context, str, bool).a(com.facetec.sdk.my.c(b, new com.facetec.sdk.el().d().c().c(obj))).c();
        int i = f3586a + 43;
        f = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
        return c2;
    }

    static com.facetec.sdk.mx.a e(android.content.Context context, java.lang.String str) throws com.facetec.sdk.g.a {
        f = (f3586a + 73) % 128;
        com.facetec.sdk.mx.a a2 = a(context, str, java.lang.Boolean.TRUE);
        int i = f3586a + 55;
        f = i % 128;
        if (i % 2 != 0) {
            return a2;
        }
        throw null;
    }

    private static void j(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 53) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b2 = com.facetec.sdk.hu.b(d ^ 4732878740741522786L, cArr, i);
        huVar.b = 4;
        while (huVar.b < b2.length) {
            huVar.e = huVar.b - 4;
            int i2 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % 4]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(d)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-474326228);
                if (d2 == null) {
                    char windowTouchSlop = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 6935);
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                    byte b3 = (byte) ($$b & 1);
                    byte b4 = (byte) (b3 - 1);
                    d2 = com.facetec.sdk.al.c(windowTouchSlop, (keyRepeatTimeout >> 16) + 2389, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 22, 1146429908, false, $$c(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(-57140341);
                if (d3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 885, 33 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1534550387, false, $$c(b5, b6, (byte) (b6 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
                $11 = ($10 + 41) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(b2, 4, b2.length - 4);
    }

    private static void i(int i, char c2, int i2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i];
        hhVar.e = 0;
        while (hhVar.e < i) {
            int i3 = $10 + 23;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c[i2 / i4])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                    if (d2 == null) {
                        char maximumDrawingCacheSize = (char) (45150 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                        int gidForName = android.os.Process.getGidForName("");
                        byte b2 = (byte) ($$b & 5);
                        byte b3 = (byte) (b2 - 5);
                        d2 = com.facetec.sdk.al.c(maximumDrawingCacheSize, 2150 - deadChar, 23 - gidForName, 1926116241, false, $$c(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(e), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                    if (d3 == null) {
                        char c3 = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                        float minVolume = android.media.AudioTrack.getMinVolume();
                        int defaultSize = android.view.View.getDefaultSize(0, 0);
                        byte length = (byte) $$a.length;
                        byte b4 = (byte) (length - 4);
                        d3 = com.facetec.sdk.al.c(c3, 1834 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), defaultSize + 24, -1880730373, false, $$c(length, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                    if (d4 == null) {
                        byte b5 = (byte) 0;
                        d4 = com.facetec.sdk.al.c((char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.combineMeasuredStates(0, 0) + 2341, 23 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), -1839099840, false, $$c((byte) ($$b & 40), b5, (byte) (b5 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
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
                int i5 = hhVar.e;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(c[i2 + i5])};
                java.lang.Object d5 = com.facetec.sdk.al.d(-719238807);
                if (d5 == null) {
                    char absoluteGravity = (char) (45150 - android.view.Gravity.getAbsoluteGravity(0, 0));
                    float minVolume2 = android.media.AudioTrack.getMinVolume();
                    int gidForName2 = android.os.Process.getGidForName("");
                    byte b6 = (byte) ($$b & 5);
                    byte b7 = (byte) (b6 - 5);
                    d5 = com.facetec.sdk.al.c(absoluteGravity, (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)) + 2150, 23 - gidForName2, 1926116241, false, $$c(b6, b7, (byte) (b7 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(e), java.lang.Integer.valueOf(c2)};
                java.lang.Object d6 = com.facetec.sdk.al.d(671690243);
                if (d6 == null) {
                    char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                    int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                    byte length2 = (byte) $$a.length;
                    byte b8 = (byte) (length2 - 4);
                    d6 = com.facetec.sdk.al.c(rgb, (maximumDrawingCacheSize2 >> 24) + 1834, (scrollBarSize >> 8) + 24, -1880730373, false, $$c(length2, b8, (byte) (b8 - 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr6)).longValue();
                java.lang.Object[] objArr7 = {hhVar, hhVar};
                java.lang.Object d7 = com.facetec.sdk.al.d(898558648);
                if (d7 == null) {
                    byte b9 = (byte) 0;
                    d7 = com.facetec.sdk.al.c((char) android.graphics.Color.alpha(0), 2342 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, -1839099840, false, $$c((byte) ($$b & 40), b9, (byte) (b9 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d7).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        hhVar.e = 0;
        while (hhVar.e < i) {
            $11 = ($10 + 75) % 128;
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr8 = {hhVar, hhVar};
            java.lang.Object d8 = com.facetec.sdk.al.d(898558648);
            if (d8 == null) {
                byte b10 = (byte) 0;
                d8 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2341 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24, -1839099840, false, $$c((byte) ($$b & 40), b10, (byte) (b10 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d8).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static com.facetec.sdk.mx.a a(android.content.Context context, java.lang.String str, java.lang.Boolean bool) throws com.facetec.sdk.g.a {
        f = (f3586a + 35) % 128;
        java.lang.String str2 = com.facetec.sdk.bj.e;
        if (str2 == null) {
            str2 = "";
        }
        com.facetec.sdk.mx.a e2 = new com.facetec.sdk.mx.a().e(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        i(11 - android.text.TextUtils.getTrimmedLength(""), (char) ((-16743719) - android.graphics.Color.rgb(0, 0, 0)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        com.facetec.sdk.mx.a a2 = e2.a(((java.lang.String) objArr[0]).intern(), str2);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        i(10 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (31189 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 12 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        com.facetec.sdk.mx.a a3 = a2.a(((java.lang.String) objArr2[0]).intern(), com.facetec.sdk.aw.b(com.facetec.sdk.bj.e));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        i(android.graphics.Color.green(0) + 12, (char) (13659 - android.view.KeyEvent.keyCodeFromString("")), 21 - android.text.TextUtils.indexOf("", "", 0, 0), objArr3);
        com.facetec.sdk.mx.a a4 = a3.a(((java.lang.String) objArr3[0]).intern(), com.facetec.sdk.aw.b(com.facetec.sdk.bj.e));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        j("걜鄠갚㐇弡Ꝙᗪ址㧥ꩫ뿻℘螪䁟⤶볊浙\uf783匎", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        j("窱ﾮ慠媰ဌྐ媦\ufffe漯쓐\uf0e4觗텄⺖昁ᑔ㯻饍ᱵ빫궩ͯ뉲䡔ᘝ涂➄튗破ힰ\uddfb糯\ue25b䇺猕ܴ", (android.os.Process.myPid() >> 22) + 1, objArr5);
        com.facetec.sdk.mx.a a5 = a4.a(intern, ((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        j("譼愵謚쐧뫱㦣\uf074즟Ễ婯娠뾨ꂗ끚쳤≼䩨ސ뛞衸\udc3f", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(((java.lang.String) objArr6[0]).intern(), 0);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        j("冕쉢凳杰혙\uf5b6鲜֊쐭露㛈玽穾ግꀌ\uee69邁\ua4c7\uda36䑭ۖ㻯瑷눒봜偾\ue19e⢑퍰\uea3cᯚ蛶䥨簉", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr7);
        java.lang.String string = sharedPreferences.getString(((java.lang.String) objArr7[0]).intern(), "");
        if (!string.equals("")) {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            j("烬蕗炴\u2009ᄶ䵊宅뵠\ue545븚\uf1a9쬪嬙吽朡囗", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr8);
            a5.a(((java.lang.String) objArr8[0]).intern(), string);
        }
        if (!bool.booleanValue()) {
            return a5;
        }
        f3586a = (f + 61) % 128;
        if (com.facetec.sdk.aw.f3402a == null) {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            i(22 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 33, objArr9);
            throw new com.facetec.sdk.g.a(((java.lang.String) objArr9[0]).intern());
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            j("窱ﾮ慠媰ဌྐ媦\ufffe漯쓐\uf0e4觗텄⺖昁ᑔ㯻饍ᱵ빫궩ͯ뉲䡔ᘝ涂➄튗破ힰ\uddfb糯\ue25b䇺猕ܴ", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr10);
            sb.append(((java.lang.String) objArr10[0]).intern());
            sb.append(com.facetec.sdk.aw.f3402a);
            java.lang.String lowerCase = com.facetec.sdk.bn.c(sb.toString()).toLowerCase();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            j("㗒ﯲ㖊庬飌铙퉩擡ꁽ삥砛ዑḞ⪖\ueed9轍\uf4d8", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr11);
            a5.a(((java.lang.String) objArr11[0]).intern(), lowerCase);
            f = (f3586a + 107) % 128;
            return a5;
        } catch (java.lang.Exception unused) {
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            j("暪쏍曩曑핽쨴鿮㨁\uf302\uf89c㗨䱥䴒እꍬ톨Ꞿꕯ\ud943篬ㆺ㼏眛跍詶凖\ue2f0ᜊ\ue407\ueb98", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr12);
            throw new com.facetec.sdk.g.a(((java.lang.String) objArr12[0]).intern());
        }
    }

    static final class a extends java.lang.Exception {
        a(java.lang.String str) {
            super(str);
        }
    }

    static void a() {
        c = new char[]{61083, 15336, 17550, 37281, 47787, 51184, 4275, 15750, 18072, 37776, 48273, 5531, 49339, 49063, 27310, 16891, 15505, 60301, 50817, 48528, 26764, 22809, 35946, 62232, 9760, 3388, 28717, 42824, 35370, 61718, 9234, 2835, 32375, 27769, 47485, 50805, 4960, 14439, 17743, 37467, 48969, 50186, 4418, 15945, 19244, 36978, 48437, 51768, 5921, 15379, 18704, 38423, 41738, 51214, 5377, 27771, 47468, 50790, 4964, 14443, 17767, 37471, 48964, 50243, 4419, 15944, 19319, 36920, 48423, 51745, 5934, 15425, 18780, 38421, 41728, 51203, 5398, 8941, 20469, 38142, 41393, 52979, 7116, 8404, 19865, 39574};
        e = 4798776016494573852L;
        d = 9163467591977934865L;
    }
}
