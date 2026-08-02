package com.gemalto.mfs.mwsdk.mobilegateway.utils;

/* loaded from: classes8.dex */
public class MGCardInfoEncryptor {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 0;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static int getInputFormats = 0;
    private static boolean getInputSizeshNQ4ISI = false;
    private static int getOutputFormats = 1;
    private static char[] getOutputMinFrameDuration;
    private static int getOutputMinFrameDurationlomOqCM;
    private static final java.lang.String getOutputSizes;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputSizes = "MGCardInfoEncryptor";
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 33) % 128;
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 57) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0087\u0088\u0087\u0083\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (bArr == null || bArr.length == 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("䧩ъ\udab7觜\u0b11ꋲ蓽\uea76ꋞ낞\ue1a8鬨鞛\udbdb芊䅪Ȟ쮽ـꀈ撊麚몝䲳挎", (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 78222011 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "뮭ꦒ阄鹑", "\u0000\u0000\u0000\u0000", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (bArr2 == null || bArr2.length == 0) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes("鼿쒲蹿\u2433ｔ∂ꠓꕸ㠋멱\ud957㣠⡲샜㯪頻꧀뿕퐟瓎ᱯ货ꄋ丱ᯢ蒛絀ㅌ㿼腀牪⑺", (char) (56830 - android.text.TextUtils.getTrimmedLength("")), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, "氱٭ﻦߝ", "\u0000\u0000\u0000\u0000", objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        byte[] encryptCardInfo = encryptCardInfo(bArr, bArr2, bArr3, bArr4, bArr5);
        int i = getHighResolutionOutputSizeshNQ4ISI + 107;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return encryptCardInfo;
        }
        throw null;
    }

    public static byte[] parseHex(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 23) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0089\u0082\u0088\u0087\u0083\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        byte[] m25468 = util.h.xy.bh.ma.m25468(str);
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 33) % 128;
        return m25468;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] encryptCardInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.combineMeasuredStates(0, 0), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        byte[] bArr6 = "\u0000\u0000\u0000\u0000";
        getHighSpeedVideoSizes("ヮ\udba0狀犹\uf8da샷ﺆ\ue5d6", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.resolveSize(0, 0), "쎅騢\u197f兇", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (bArr3 != null) {
            int i = (getOutputFormats + 65) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i;
            if (bArr3.length != 0) {
                if (bArr4 == null || bArr4.length == 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ꋟ핕퉨➽깷ĉ\ue694鍚簷࢈봜㘦帑儰向睛鈕⢄䶶❕Ⅹ炸ꑧ\uf548ྍ鮧荒炆", (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 11243), android.view.View.MeasureSpec.getMode(0), "韠\u1f16\ueb87긫", "\u0000\u0000\u0000\u0000", objArr3);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                }
                if (bArr5 != null) {
                    int i2 = (i + 33) % 128;
                    getOutputFormats = i2;
                    if (bArr5.length != 0) {
                        if (bArr != null) {
                            int i3 = (i2 + 47) % 128;
                            getHighResolutionOutputSizeshNQ4ISI = i3;
                            if (bArr.length != 0) {
                                if (bArr2 != null) {
                                    int i4 = i3 + 61;
                                    getOutputFormats = i4 % 128;
                                    if (i4 % 2 != 0 ? bArr2.length != 0 : bArr2.length != 0) {
                                        byte[] bArr7 = {123, 34, 102, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 97, 110, 34, 58, 34};
                                        byte[] bArr8 = {34, 44, 34, 101, 120, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 34, 58, 34};
                                        byte[] bArr9 = {34, 44, 34, 99, 118, 118, 34, 58, 34};
                                        byte[] bArr10 = {34, 125};
                                        try {
                                            try {
                                                byte[] bArr11 = new byte[bArr3.length + 29 + bArr4.length + bArr5.length];
                                                try {
                                                    java.lang.System.arraycopy(bArr7, 0, bArr11, 0, 9);
                                                    java.lang.System.arraycopy(bArr3, 0, bArr11, 9, bArr3.length);
                                                    java.lang.System.arraycopy(bArr8, 0, bArr11, bArr3.length + 9, 9);
                                                    java.lang.System.arraycopy(bArr4, 0, bArr11, bArr3.length + 18, bArr4.length);
                                                    java.lang.System.arraycopy(bArr9, 0, bArr11, bArr3.length + 18 + bArr4.length, 9);
                                                    java.lang.System.arraycopy(bArr5, 0, bArr11, bArr3.length + 18 + bArr4.length + 9, bArr5.length);
                                                    java.lang.System.arraycopy(bArr10, 0, bArr11, bArr3.length + 18 + bArr4.length + 9 + bArr5.length, 2);
                                                    byte[] m26810 = util.h.xy.fa.mb.m26810(encryptPKCS7(bArr2, bArr, bArr11));
                                                    java.util.Arrays.fill(bArr11, (byte) 0);
                                                    java.util.Arrays.fill(bArr7, (byte) 0);
                                                    java.util.Arrays.fill(bArr8, (byte) 0);
                                                    java.util.Arrays.fill(bArr9, (byte) 0);
                                                    java.util.Arrays.fill(bArr10, (byte) 0);
                                                    return m26810;
                                                } catch (java.io.IOException e) {
                                                    e = e;
                                                    e.getMessage();
                                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes("邘殦鐉巆뷁惯䯠켫䗀獉쾍\udfa3행ⅾ돌뫲㪽\udcc6켙쯹ﾯ늫슐▋\u206c⧵듗糶㱗\uec28㼑蘆틻\u0b50\uf19d㟁聓탉榮糿鄩\u09b5ῌ䲍跮噘焜\udfc1䧵蟌鉡ㅧ控㕄拾껈ɋ갱ₕ\udf0fퟕ\uf034埸諄䥞⳱", (char) (52554 - android.text.TextUtils.getTrimmedLength("")), android.text.TextUtils.indexOf("", "", 0, 0), "ⷑꆪ䨼嫍", "\u0000\u0000\u0000\u0000", objArr4);
                                                    throw new java.lang.RuntimeException(((java.lang.String) objArr4[0]).intern());
                                                } catch (util.h.xy.ea.d e2) {
                                                    e = e2;
                                                    e.getMessage();
                                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes("邘殦鐉巆뷁惯䯠켫䗀獉쾍\udfa3행ⅾ돌뫲㪽\udcc6켙쯹ﾯ늫슐▋\u206c⧵듗糶㱗\uec28㼑蘆틻\u0b50\uf19d㟁聓탉榮糿鄩\u09b5ῌ䲍跮噘焜\udfc1䧵蟌鉡ㅧ控㕄拾껈ɋ갱ₕ\udf0fퟕ\uf034埸諄䥞⳱", (char) (52554 - android.text.TextUtils.getTrimmedLength("")), android.text.TextUtils.indexOf("", "", 0, 0), "ⷑꆪ䨼嫍", "\u0000\u0000\u0000\u0000", objArr42);
                                                    throw new java.lang.RuntimeException(((java.lang.String) objArr42[0]).intern());
                                                }
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                if (bArr6 != 0) {
                                                    java.util.Arrays.fill(bArr6, (byte) 0);
                                                }
                                                java.util.Arrays.fill(bArr7, (byte) 0);
                                                java.util.Arrays.fill(bArr8, (byte) 0);
                                                java.util.Arrays.fill(bArr9, (byte) 0);
                                                java.util.Arrays.fill(bArr10, (byte) 0);
                                                throw th;
                                            }
                                        } catch (java.io.IOException e3) {
                                            e = e3;
                                            e.getMessage();
                                            java.lang.Object[] objArr422 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("邘殦鐉巆뷁惯䯠켫䗀獉쾍\udfa3행ⅾ돌뫲㪽\udcc6켙쯹ﾯ늫슐▋\u206c⧵듗糶㱗\uec28㼑蘆틻\u0b50\uf19d㟁聓탉榮糿鄩\u09b5ῌ䲍跮噘焜\udfc1䧵蟌鉡ㅧ控㕄拾껈ɋ갱ₕ\udf0fퟕ\uf034埸諄䥞⳱", (char) (52554 - android.text.TextUtils.getTrimmedLength("")), android.text.TextUtils.indexOf("", "", 0, 0), "ⷑꆪ䨼嫍", "\u0000\u0000\u0000\u0000", objArr422);
                                            throw new java.lang.RuntimeException(((java.lang.String) objArr422[0]).intern());
                                        } catch (util.h.xy.ea.d e4) {
                                            e = e4;
                                            e.getMessage();
                                            java.lang.Object[] objArr4222 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("邘殦鐉巆뷁惯䯠켫䗀獉쾍\udfa3행ⅾ돌뫲㪽\udcc6켙쯹ﾯ늫슐▋\u206c⧵듗糶㱗\uec28㼑蘆틻\u0b50\uf19d㟁聓탉榮糿鄩\u09b5ῌ䲍跮噘焜\udfc1䧵蟌鉡ㅧ控㕄拾껈ɋ갱ₕ\udf0fퟕ\uf034埸諄䥞⳱", (char) (52554 - android.text.TextUtils.getTrimmedLength("")), android.text.TextUtils.indexOf("", "", 0, 0), "ⷑꆪ䨼嫍", "\u0000\u0000\u0000\u0000", objArr4222);
                                            throw new java.lang.RuntimeException(((java.lang.String) objArr4222[0]).intern());
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            bArr6 = 0;
                                            if (bArr6 != 0) {
                                            }
                                            java.util.Arrays.fill(bArr7, (byte) 0);
                                            java.util.Arrays.fill(bArr8, (byte) 0);
                                            java.util.Arrays.fill(bArr9, (byte) 0);
                                            java.util.Arrays.fill(bArr10, (byte) 0);
                                            throw th;
                                        }
                                    }
                                }
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(127 - android.view.KeyEvent.keyCodeFromString(""), "\u0092\u008f\u009d\u009c\u008d\u0090\u008d\u008b\u0090\u008f\u009b\u0094\u0094\u0099\u008e\u0090\u008d\u008a\u009a\u0099\u0098\u0090\u0097\u008d\u0095\u0096\u0095\u008f\u0094\u008d\u0093\u0083\u0090\u0092\u008d\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008a\u0084", objArr5);
                                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
                            }
                        }
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("䧩ъ\udab7觜\u0b11ꋲ蓽\uea76ꋞ낞\ue1a8鬨鞛\udbdb芊䅪Ȟ쮽ـꀈ撊麚몝䲳挎", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 78222010 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "뮭ꦒ阄鹑", "\u0000\u0000\u0000\u0000", objArr6);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
                    }
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoSizes("㛫頦ꖗ诖䆔쇪\uec83윺\u0bd9龓ॷ扚닇\uf476鸞잟찤蓿Ռ⨊賘᧱\ue8aa᭨펃", (char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 1474520174, "鋓Მ墨䋸", "\u0000\u0000\u0000\u0000", objArr7);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr7[0]).intern());
            }
        }
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoSizes("猯搅꼜\udf24ᡦ芛䔁罌梂큂墕Ꚋ썘丶\uf1b5鹗ﴮ俼\ue30f㩸ᫀ㝇ⰼ馻╬", (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2139313826 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "ꉘ荖\udc7f锺", "\u0000\u0000\u0000\u0000", objArr8);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr8[0]).intern());
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 19) % 128;
        char[] charArray = str3.toCharArray();
        int i2 = Camera2StreamConfigurationMap + 113;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        int i4 = i2 % 2;
        char[] cArr = charArray;
        Camera2StreamConfigurationMap = (i3 + 113) % 128;
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 43) % 128;
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr2, 0, length);
        java.lang.System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 19) % 128;
            int i5 = (rcVar.f2652 + 2) % 4;
            int i6 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i5]) % 65535);
            cArr3[i6] = (char) (((cArr2[i6] * 32718) + cArr3[i5]) / 65535);
            cArr2[i6] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i6] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizes ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDurationlomOqCM ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRangesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 75) % 128;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 67) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (!getHighSpeedVideoSizesFor) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 107) % 128;
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 27) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public static byte[] encryptCardInfo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        byte[] bArr7;
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 1) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("ヮ\udba0狀犹\uf8da샷ﺆ\ue5d6", (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, "쎅騢\u197f兇", "\u0000\u0000\u0000\u0000", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (bArr3 == null || bArr3.length == 0) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("猯搅꼜\udf24ᡦ芛䔁罌梂큂墕Ꚋ썘丶\uf1b5鹗ﴮ俼\ue30f㩸ᫀ㝇ⰼ馻╬", (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 2139313826 - android.text.TextUtils.indexOf("", ""), "ꉘ荖\udc7f锺", "\u0000\u0000\u0000\u0000", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (bArr4 == null || bArr4.length == 0) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ꋟ핕퉨➽깷ĉ\ue694鍚簷࢈봜㘦帑儰向睛鈕⢄䶶❕Ⅹ炸ꑧ\uf548ྍ鮧荒炆", (char) (11244 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), android.view.ViewConfiguration.getJumpTapTimeout() >> 16, "韠\u1f16\ueb87긫", "\u0000\u0000\u0000\u0000", objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        if (bArr5 == null || bArr5.length == 0) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes("㛫頦ꖗ诖䆔쇪\uec83윺\u0bd9龓ॷ扚닇\uf476鸞잟찤蓿Ռ⨊賘᧱\ue8aa᭨펃", (char) (android.view.MotionEvent.axisFromString("") + 1), android.view.Gravity.getAbsoluteGravity(0, 0) - 1474520174, "鋓Მ墨䋸", "\u0000\u0000\u0000\u0000", objArr5);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
        }
        if (bArr == null || bArr.length == 0) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes("䧩ъ\udab7觜\u0b11ꋲ蓽\uea76ꋞ낞\ue1a8鬨鞛\udbdb芊䅪Ȟ쮽ـꀈ撊麚몝䲳挎", (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 78222011 - android.text.TextUtils.indexOf("", "", 0), "뮭ꦒ阄鹑", "\u0000\u0000\u0000\u0000", objArr6);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
        }
        if (bArr2 == null || bArr2.length == 0) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0092\u008f\u009d\u009c\u008d\u0090\u008d\u008b\u0090\u008f\u009b\u0094\u0094\u0099\u008e\u0090\u008d\u008a\u009a\u0099\u0098\u0090\u0097\u008d\u0095\u0096\u0095\u008f\u0094\u008d\u0093\u0083\u0090\u0092\u008d\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008a\u0084", objArr7);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr7[0]).intern());
        }
        byte[] bArr8 = {123, 34, 102, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 97, 110, 34, 58, 34};
        byte[] bArr9 = {34, 44, 34, 101, 120, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 34, 58, 34};
        byte[] bArr10 = {34, 44, 34, 99, 118, 118, 34, 58, 34};
        byte[] bArr11 = {34, 44, 34, 110, 111, 110, 99, 101, 34, 58, 34};
        byte[] bArr12 = {34, 125};
        byte[] bArr13 = null;
        try {
            try {
                if (bArr6 == null) {
                    int i = getOutputFormats + 21;
                    getHighResolutionOutputSizeshNQ4ISI = i % 128;
                    if (i % 2 != 0) {
                        int length = bArr3.length;
                        int length2 = bArr4.length;
                        int length3 = bArr5.length;
                        bArr7 = new byte[0];
                    } else {
                        bArr7 = new byte[bArr3.length + 38 + bArr4.length + bArr5.length];
                    }
                } else {
                    bArr7 = new byte[bArr3.length + 40 + bArr4.length + bArr5.length + bArr6.length];
                }
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.io.IOException e) {
            e = e;
        } catch (util.h.xy.ea.d e2) {
            e = e2;
        }
        try {
            java.lang.System.arraycopy(bArr8, 0, bArr7, 0, 9);
            java.lang.System.arraycopy(bArr3, 0, bArr7, 9, bArr3.length);
            int length4 = bArr3.length;
            java.lang.System.arraycopy(bArr9, 0, bArr7, length4 + 9, 9);
            int i2 = length4 + 18;
            java.lang.System.arraycopy(bArr4, 0, bArr7, i2, bArr4.length);
            int length5 = i2 + bArr4.length;
            java.lang.System.arraycopy(bArr10, 0, bArr7, length5, 9);
            int i3 = length5 + 9;
            java.lang.System.arraycopy(bArr5, 0, bArr7, i3, bArr5.length);
            int length6 = i3 + bArr5.length;
            if (bArr6 != null) {
                java.lang.System.arraycopy(bArr11, 0, bArr7, length6, 11);
                int i4 = length6 + 11;
                java.lang.System.arraycopy(bArr6, 0, bArr7, i4, bArr6.length);
                length6 = i4 + bArr6.length;
            }
            java.lang.System.arraycopy(bArr12, 0, bArr7, length6, 2);
            byte[] m26810 = util.h.xy.fa.mb.m26810(encryptPKCS7(bArr2, bArr, bArr7));
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            java.util.Arrays.fill(bArr7, (byte) 0);
            java.util.Arrays.fill(bArr8, (byte) 0);
            java.util.Arrays.fill(bArr9, (byte) 0);
            java.util.Arrays.fill(bArr10, (byte) 0);
            java.util.Arrays.fill(bArr11, (byte) 0);
            java.util.Arrays.fill(bArr12, (byte) 0);
            return m26810;
        } catch (java.io.IOException e3) {
            e = e3;
            e.getMessage();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.alpha(0), "\u0088\u0099\u008f\u0099\u0093\u0090 \u0094\u0095\u008f\u009d\u0092\u0097\u008e\u0094\u008d\u0090\u008d\u009a\u0095\u009f\u009e\u0090\u0097\u009b\u0097\u0097\u0087", objArr8);
            throw new java.lang.RuntimeException(((java.lang.String) objArr8[0]).intern());
        } catch (util.h.xy.ea.d e4) {
            e = e4;
            e.getMessage();
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.alpha(0), "\u0088\u0099\u008f\u0099\u0093\u0090 \u0094\u0095\u008f\u009d\u0092\u0097\u008e\u0094\u008d\u0090\u008d\u009a\u0095\u009f\u009e\u0090\u0097\u009b\u0097\u0097\u0087", objArr82);
            throw new java.lang.RuntimeException(((java.lang.String) objArr82[0]).intern());
        } catch (java.lang.Throwable th2) {
            th = th2;
            bArr13 = bArr7;
            byte[] bArr14 = bArr13;
            if (bArr14 != null) {
                java.util.Arrays.fill(bArr14, (byte) 0);
                getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 5) % 128;
            }
            java.util.Arrays.fill(bArr8, (byte) 0);
            java.util.Arrays.fill(bArr9, (byte) 0);
            java.util.Arrays.fill(bArr10, (byte) 0);
            java.util.Arrays.fill(bArr11, (byte) 0);
            java.util.Arrays.fill(bArr12, (byte) 0);
            throw th;
        }
    }

    public static byte[] encryptPKCS7(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.ea.d, java.io.IOException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.getDefaultSize(0, 0), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - android.view.KeyEvent.normalizeMetaState(0), "¡\u0091\u0082\u0087\u0088\u0087\u0083\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.ed.mc m26512 = util.h.xy.ed.mc.m26512(bArr2);
        util.h.xy.du.rc m26421 = util.h.xy.du.rc.m26421(m26512.m26514().mo25969());
        util.h.xy.ea.rb rbVar = new util.h.xy.ea.rb();
        rbVar.m26481(new util.h.xy.eg.mb(bArr, m26512.m26513(), new util.h.xy.ep.md(false, m26421.m26423(), m26421.m26422())));
        byte[] m26480 = rbVar.m26487(new util.h.xy.ea.md(bArr3), new util.h.xy.eg.ma(util.h.xy.ea.mb.f1912).m26571()).m26480();
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
        return m26480;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = new char[]{64195, 64207, 64198, 64200, 64194, 64216, 64218, 64237, 64199, 64170, 64185, 64161, 64186, 64184, 64171, 64255, 64192, 64150, 64187, 64173, 64166, 64165, 64169, 64149, 64190, 64163, 64172, 64162, 64175, 64148, 64167, 64164, 64212};
        getInputFormats = -1074857185;
        getInputSizeshNQ4ISI = true;
        getHighSpeedVideoSizesFor = true;
        getHighSpeedVideoSizes = 2457411417541981002L;
        getOutputMinFrameDurationlomOqCM = 294925130;
        getHighSpeedVideoFpsRangesFor = (char) 45643;
    }
}
