package util.h.xy.al;

/* loaded from: classes18.dex */
public class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static java.lang.String getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 1;
    private static long getInputSizeshNQ4ISI;

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor = util.h.xy.al.mb.class.getName();
        int i = getHighSpeedVideoSizes + 101;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25011(java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䔒䕓≡䮻蟀咧䞈筭\ue331䐃︗頁", android.view.View.MeasureSpec.getMode(0) + 1, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ⶆⶥ\ued2f棲ᔐ", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.fa.mb.m26806(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        byte[] bytes = sb.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int i = getHighSpeedVideoSizes + 103;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return bytes;
        }
        throw null;
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", 1 - android.graphics.Color.alpha(0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ꆟꇞ\udd2e듴㓛\ue7bc⹕ኰ\u07bf뭈䴎", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = new java.lang.String(bArr);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ⶆⶥ\ued2f棲ᔐ", -android.graphics.ImageFormat.getBitsPerPixel(0), objArr3);
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ((java.lang.String) objArr3[0]).intern());
        java.lang.String nextToken = stringTokenizer.nextToken();
        byte[] m26807 = util.h.xy.fa.mb.m26807(stringTokenizer.nextToken());
        if (!z) {
            return nextToken.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        int i = getHighSpeedVideoSizes + 115;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return m26807;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 51;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getInputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getInputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
        int i3 = Camera2StreamConfigurationMap + 75;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25009(boolean z, byte[] bArr, byte[] bArr2) {
        byte[] highSpeedVideoFpsRanges;
        int i = getHighSpeedVideoSizes + 103;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (!z) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("廝府矫ḱ䕞阹ⱃႦ\uf8feᆍ㲋", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                return getHighResolutionOutputSizeshNQ4ISI(bArr, false);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i3 = i2 + 31;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("쒢쓣낍\u65ec3ඤ吁棤抁훫꜖该蠮潮", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25089(bArr, bArr2), false), bArr2);
        } else {
            android.view.ViewConfiguration.getKeyRepeatTimeout();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", 0, objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("쒢쓣낍\u65ec3ඤ吁棤抁훫꜖该蠮潮", (android.os.SystemClock.elapsedRealtime() > 1L ? 1 : (android.os.SystemClock.elapsedRealtime() == 1L ? 0 : -1)), objArr6);
            util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25089(bArr, bArr2), false), bArr2);
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 109) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25010(boolean z, byte[] bArr, byte[] bArr2) {
        if (!z) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int i = getHighSpeedVideoFpsRanges + 45;
            getHighSpeedVideoSizes = i % 128;
            try {
                if (i % 2 != 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("舓艒僛㤁坋萬\ufae1옄\u2430㚸⺞╢", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    return getHighResolutionOutputSizeshNQ4ISI(bArr, true);
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("舓艒僛㤁坋萬\ufae1옄\u2430㚸⺞╢", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 1L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 1L ? 0 : -1)), objArr3);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                return getHighResolutionOutputSizeshNQ4ISI(bArr, false);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i2 = getHighSpeedVideoFpsRanges + 13;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", 16777217 >> android.graphics.Color.rgb(0, 1, 1), objArr4);
            java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("릻맺扡\u0bbb⼂ﱥࣖ㐳ᾘЂ囗흕\uf55d붞゠", android.view.ViewConfiguration.getKeyRepeatDelay() >>> 72, objArr5);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
            return getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25089(bArr, bArr2), true);
        }
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", android.graphics.Color.rgb(0, 0, 0) + 16777217, objArr6);
        java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("릻맺扡\u0bbb⼂ﱥࣖ㐳ᾘЂ囗흕\uf55d붞゠", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr7);
        util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr7[0]).intern());
        return getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ar.b.m25089(bArr, bArr2), true);
    }

    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 117) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("븃빏۬漥㴫\uee50饩ꗡ", 1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("\udc9a\udcdb隣ｹზ쎱遦것窻\uf0cd椃", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        byte[] bArr3 = new byte[bArr.length];
        int i = 0;
        for (byte b : bArr) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 71) % 128;
            bArr3[i] = (byte) (b ^ bArr2[i % bArr2.length]);
            i++;
        }
        return bArr3;
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = 8863015324416184753L;
    }
}
