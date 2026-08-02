package util.h.xy.al;

/* loaded from: classes5.dex */
public class mc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static char[] getInputFormats;
    private static boolean getInputSizeshNQ4ISI;
    private static int[] getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static int getOutputSizes;
    private static int getOutputStallDurationlomOqCM;

    static {
        getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizesFor = "mc";
        int i = getHighSpeedVideoFpsRangesFor + 115;
        getOutputStallDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.util.HashMap<java.lang.String, byte[]> m25015(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException {
        java.lang.Object obj;
        java.util.HashMap<java.lang.String, byte[]> hashMap = new java.util.HashMap<>();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\u0004\uffff￦\u0000\u0014￮\u000f\n\r\u0000ￜ\t\uffff\r\n", 15 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 10, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 148, false, objArr);
            try {
                java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", 1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, android.view.Gravity.getAbsoluteGravity(0, 0) + 11, objArr4);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                if (invoke == null) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", "", 0), "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr5[0]).intern());
                }
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr6);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("娾﹋螥Љ婒ో挚팠", 1 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr7);
                    cls2.getMethod((java.lang.String) objArr7[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", "", 0), "\u0085\u009a\u0099\u0095\u0098\u0097\u0085\u0083\u0096\u008e\u0095\u0094\u0093\u0092\u0082\u0085\u0091\u0081\u0083\u008f\u0090\u0084\u0082\u008c\u008f\u008e\u008d", objArr8);
                    java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                    getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 71) % 128;
                    try {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr9);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("䣡ڬ\ue21a눼䢂\uf4acڪ攅脼뫮䳮ፆ\udbd8茧騥\ud898ᖦ", android.text.TextUtils.indexOf("", "") + 1, objArr10);
                        if (!((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr10[0], java.lang.String.class).invoke(invoke, intern)).booleanValue()) {
                            int i = getHighSpeedVideoFpsRangesFor + 113;
                            getOutputStallDurationlomOqCM = i % 128;
                            if (i % 2 != 0) {
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() / 73) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "\u0085\u009a\u0099\u0095\u0098\u0097\u0085\u0083\u0096\u008e\u0095\u0094\u0093\u0092\u0082\u0085\u0091\u0081\u0083\u008f\u0090\u0084\u0082\u008c\u008f\u008e\u008d", objArr11);
                                obj = objArr11[0];
                            } else {
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0085\u009a\u0099\u0095\u0098\u0097\u0085\u0083\u0096\u008e\u0095\u0094\u0093\u0092\u0082\u0085\u0091\u0081\u0083\u008f\u0090\u0084\u0082\u008c\u008f\u008e\u008d", objArr12);
                                obj = objArr12[0];
                            }
                            m25014(((java.lang.String) obj).intern());
                        }
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(127 - android.graphics.Color.alpha(0), "\u0085\u009a\u0099\u0095\u0098\u0097\u0085\u0083\u0096\u008e\u0095\u0094\u0093\u0092\u0082\u0085\u0091\u0081\u0083\u008f\u0090\u0084\u0082\u008c\u008f\u008e\u008d", objArr13);
                        java.lang.String intern2 = ((java.lang.String) objArr13[0]).intern();
                        getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 37) % 128;
                        try {
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", android.text.TextUtils.indexOf("", "", 0, 0) + 1, objArr14);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{1261288789, -127468787, -1032831751, -310861221}, android.view.KeyEvent.keyCodeFromString("") + 8, objArr15);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr15[0], java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, intern2, null);
                            if (invoke2 == null) {
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0083\u0087\u0085\u008a\u009c\u0083\u0082\u0081\u0085\u0082\u0087\u009b\u0082\u0084", objArr16);
                                throw new java.lang.IllegalStateException(((java.lang.String) objArr16[0]).intern());
                            }
                            try {
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("㬮瀧\ue4d0ﺋ㭄舩x⦧\uf2bc챿䨯忡ꠣ\uf5b2鳯鐺晣㾪ꚉ쩯ᶧ椫\uef6aÙ쯰鍙ㅾ㤡脣\udc93篤潛뽾ۿ趷ꖃ皋〆혚\udbd4ⳋ", android.text.TextUtils.indexOf("", "") + 1, objArr17);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("\ue9e3囶훼뮛\ue984ꓼ㉖沅›\ueabe研\u1af7端퍚껏턧", 1 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr18);
                                java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr18[0], null).invoke(invoke2, null);
                                if (invoke3 == null) {
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(android.view.View.combineMeasuredStates(0, 0) + 127, "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0083\u0082\u0081\u0085\u0082\u0087\u009b\u0082\u0084", objArr19);
                                    throw new java.lang.IllegalStateException(((java.lang.String) objArr19[0]).intern());
                                }
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\ufffb\uffdd￼\u001d\ufffe\u000f\u0012\u0012\u0017\u001c\u0015\uffef\ufff3\u0001\uffdd\ufff5\ufff1", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, 11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 129 - android.text.TextUtils.indexOf("", ""), false, objArr20);
                                java.lang.String intern3 = ((java.lang.String) objArr20[0]).intern();
                                getHighSpeedVideoFpsRangesFor = (getOutputStallDurationlomOqCM + 91) % 128;
                                try {
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, 18 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr21);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, (android.os.Process.myTid() >> 22) + 11, objArr22);
                                    java.lang.Object invoke4 = cls6.getMethod((java.lang.String) objArr22[0], java.lang.String.class).invoke(null, intern3);
                                    if (invoke4 == null) {
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("\b\u000f\u0007\u0004\u0011\uffbf\b\u0012\uffbf\r\u0014\u000b\u000b\u0002", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, 12 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 144 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), false, objArr23);
                                        throw new java.lang.IllegalStateException(((java.lang.String) objArr23[0]).intern());
                                    }
                                    getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 75) % 128;
                                    try {
                                        java.lang.Object[] objArr24 = {1, invoke3};
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 29, objArr25);
                                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(new int[]{1135469610, 932677915}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5, objArr26);
                                        java.lang.String str = (java.lang.String) objArr26[0];
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, 147763663, -2073463746, 494866049, -466212100, 1044028294, 1406343240, 818644412, -868022851}, 17 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
                                        cls7.getMethod(str, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr27[0])).invoke(invoke4, objArr24);
                                        getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                                        try {
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, 19 - android.graphics.Color.argb(0, 0, 0, 0), objArr28);
                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 983976479, 1693458436}, 6 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr29);
                                            java.lang.Object invoke5 = cls8.getMethod((java.lang.String) objArr29[0], null).invoke(invoke4, null);
                                            try {
                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 19, objArr30);
                                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI("\uec02ᇣ\uea00쁈\uec66\ue3e3ຘᝬ◐궩䓶", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr31);
                                                java.lang.Object invoke6 = cls9.getMethod((java.lang.String) objArr31[0], byte[].class).invoke(invoke4, bArr);
                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("\ufff8￤\u001a\u001d!￥\ufffa\uffde\u0018￤\u0006\ufff1\ufff5\ufff0\u0014(", android.text.TextUtils.indexOf("", "") + 16, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 129, true, objArr32);
                                                hashMap.put(((java.lang.String) objArr32[0]).intern(), invoke5);
                                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "¢¡ \u009f \u009f\u0090\u008d\u0099\u0087\u009e\u009d\u0096\u009d\u0099\u0089", objArr33);
                                                hashMap.put(((java.lang.String) objArr33[0]).intern(), invoke6);
                                                getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                return hashMap;
                                            } catch (java.lang.Throwable th) {
                                                java.lang.Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        java.lang.Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    java.lang.Throwable cause4 = th4.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th4;
                                }
                            } catch (java.lang.Throwable th5) {
                                java.lang.Throwable cause5 = th5.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th5;
                            }
                        } catch (java.lang.Throwable th6) {
                            java.lang.Throwable cause6 = th6.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th6;
                        }
                    } catch (java.lang.Throwable th7) {
                        java.lang.Throwable cause7 = th7.getCause();
                        if (cause7 != null) {
                            throw cause7;
                        }
                        throw th7;
                    }
                } catch (java.lang.Throwable th8) {
                    java.lang.Throwable cause8 = th8.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th8;
                }
            } catch (java.lang.Throwable th9) {
                java.lang.Throwable cause9 = th9.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th9;
            }
        } catch (java.lang.Throwable th10) {
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.View.resolveSize(0, 0), "¥\u008a\u0089\u0085\u0092\u0083\u0087\u009b\u008a\u0082\u0088\u0082\u008c\u0089\u008e¤\u0088\u008a\u0086\u0089\u0085\u0092\u0082\u009b\u0096\u009c\u0084\u0084\u0082\u009b\u009b\u0091\u0082\u0087\u0086\u0085£\u0083\u0082\u0081", objArr34);
            throw new com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException(((java.lang.String) objArr34[0]).intern(), th10);
        }
    }

    private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getOutputFormats;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputFormats;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25012(java.util.HashMap<java.lang.String, byte[]> hashMap) throws com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ufff8￤\u001a\u001d!￥\ufffa\uffde\u0018￤\u0006\ufff1\ufff5\ufff0\u0014(", android.text.TextUtils.getCapsMode("", 0, 0) + 16, 14 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 129 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), true, objArr);
            byte[] bArr = hashMap.get(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "¢¡ \u009f \u009f\u0090\u008d\u0099\u0087\u009e\u009d\u0096\u009d\u0099\u0089", objArr2);
            byte[] bArr2 = hashMap.get(((java.lang.String) objArr2[0]).intern());
            if (bArr != null) {
                int i = (getHighSpeedVideoFpsRangesFor + 47) % 128;
                getOutputStallDurationlomOqCM = i;
                if (bArr.length > 0) {
                    int i2 = i + 89;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    if (bArr2 != null && bArr2.length > 0) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\u0004\uffff￦\u0000\u0014￮\u000f\n\r\u0000ￜ\t\uffff\r\n", 15 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.blue(0) + 10, android.text.TextUtils.indexOf("", "", 0, 0) + 148, false, objArr3);
                        try {
                            java.lang.Object[] objArr4 = {((java.lang.String) objArr3[0]).intern()};
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", 1 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, 11 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr6);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr6[0], java.lang.String.class).invoke(null, objArr4);
                            if (invoke == null) {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(126 - android.view.MotionEvent.axisFromString(""), "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                                throw new java.lang.IllegalStateException(((java.lang.String) objArr7[0]).intern());
                            }
                            try {
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr8);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("娾﹋螥Љ婒ో挚팠", 1 - android.text.TextUtils.getCapsMode("", 0, 0), objArr9);
                                cls2.getMethod((java.lang.String) objArr9[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0085\u009a\u0099\u0095\u0098\u0097\u0085\u0083\u0096\u008e\u0095\u0094\u0093\u0092\u0082\u0085\u0091\u0081\u0083\u008f\u0090\u0084\u0082\u008c\u008f\u008e\u008d", objArr10);
                                java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                                getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 35) % 128;
                                try {
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr11);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(new int[]{1261288789, -127468787, -1032831751, -310861221}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9, objArr12);
                                    java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, intern, null);
                                    if (invoke2 == null) {
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0083\u0087\u0085\u008a\u009c\u0083\u0082\u0081\u0085\u0082\u0087\u009b\u0082\u0084", objArr13);
                                        throw new java.lang.IllegalStateException(((java.lang.String) objArr13[0]).intern());
                                    }
                                    try {
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("㬮瀧\ue4d0ﺋ㭄舩x⦧\uf2bc챿䨯忡ꠣ\uf5b2鳯鐺晣㾪ꚉ쩯ᶧ椫\uef6aÙ쯰鍙ㅾ㤡脣\udc93篤潛뽾ۿ趷ꖃ皋〆혚\udbd4ⳋ", android.view.View.MeasureSpec.getMode(0) + 1, objArr14);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("\ue9e3囶훼뮛\ue984ꓼ㉖沅›\ueabe研\u1af7端퍚껏턧", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr15);
                                        java.lang.Object invoke3 = cls4.getMethod((java.lang.String) objArr15[0], null).invoke(invoke2, null);
                                        if (invoke3 == null) {
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0083\u0082\u0081\u0085\u0082\u0087\u009b\u0082\u0084", objArr16);
                                            throw new java.lang.IllegalStateException(((java.lang.String) objArr16[0]).intern());
                                        }
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("\ufffb\uffdd￼\u001d\ufffe\u000f\u0012\u0012\u0017\u001c\u0015\uffef\ufff3\u0001\uffdd\ufff5\ufff1", 17 - android.view.View.resolveSizeAndState(0, 0, 0), 10 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 128, false, objArr17);
                                        java.lang.String intern2 = ((java.lang.String) objArr17[0]).intern();
                                        int i3 = getOutputStallDurationlomOqCM;
                                        getHighSpeedVideoFpsRangesFor = (i3 + 9) % 128;
                                        getHighSpeedVideoFpsRangesFor = (i3 + 95) % 128;
                                        try {
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, 18 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr18);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 11, objArr19);
                                            java.lang.Object invoke4 = cls5.getMethod((java.lang.String) objArr19[0], java.lang.String.class).invoke(null, intern2);
                                            if (invoke4 == null) {
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("\b\u000f\u0007\u0004\u0011\uffbf\b\u0012\uffbf\r\u0014\u000b\u000b\u0002", android.text.TextUtils.getOffsetBefore("", 0) + 14, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, 143 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr20);
                                                throw new java.lang.IllegalStateException(((java.lang.String) objArr20[0]).intern());
                                            }
                                            getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                                            try {
                                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI("됓ᚇ䂠껟둹\ue489ꐈ秳緗ꪂ\uee59ྤ✒錐㢂쑵\ue909套˂騻銀\u0ff6䬩傡䓲\uf5cc镋楔บ먽\udf83㼞げ恦⧱\uf5de練嚫", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr21);
                                                java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr21[0]).getDeclaredConstructor(java.lang.Integer.TYPE, byte[].class).newInstance(128, bArr);
                                                getOutputStallDurationlomOqCM = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                                                try {
                                                    java.lang.Object[] objArr22 = {2, invoke3, newInstance};
                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, objArr23);
                                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes(new int[]{1135469610, 932677915}, 4 - android.text.TextUtils.getOffsetBefore("", 0), objArr24);
                                                    java.lang.String str = (java.lang.String) objArr24[0];
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, 147763663, -2073463746, 494866049, -466212100, 1044028294, 1406343240, 818644412, -868022851}, 16 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr25);
                                                    cls6.getMethod(str, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr25[0]), java.security.spec.AlgorithmParameterSpec.class).invoke(invoke4, objArr22);
                                                    try {
                                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                        getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, 174842525, 383215930, 1631888470, -298092753}, android.graphics.Color.green(0) + 19, objArr26);
                                                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("\uec02ᇣ\uea00쁈\uec66\ue3e3ຘᝬ◐궩䓶", android.text.TextUtils.indexOf("", "") + 1, objArr27);
                                                        byte[] bArr3 = (byte[]) cls7.getMethod((java.lang.String) objArr27[0], byte[].class).invoke(invoke4, bArr2);
                                                        getHighSpeedVideoFpsRangesFor = (getOutputStallDurationlomOqCM + 35) % 128;
                                                        return bArr3;
                                                    } catch (java.lang.Throwable th) {
                                                        java.lang.Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    java.lang.Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                java.lang.Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            java.lang.Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause5 = th5.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th5;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th9) {
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\u0002\u0000\u0015￢\u0004\u000b\u0006\u0011\r\u0016\u000f\u0000\u0002\u0001ﾽ\u0002\t\u0006\u0005\ufff4ﾽ\u000b\f\u0006\u0011\r", android.view.View.MeasureSpec.getSize(0) + 26, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, 146 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), true, objArr28);
            throw new com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException(((java.lang.String) objArr28[0]).intern(), th9);
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getInputFormats;
        if (cArr2 != null) {
            int i3 = Camera2StreamConfigurationMap + 85;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
                cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                i2++;
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 103) % 128;
            cArr2 = cArr;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDuration);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 67) % 128;
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        objArr[0] = str2;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        char[] charArray = str.toCharArray();
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        char[] cArr2 = charArray;
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr3 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 41) % 128;
            raVar.f2650 = cArr2[raVar.f2649];
            cArr3[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr3[i4] = (char) (cArr3[i4] - ((int) (getOutputSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            raVar.f2648 = i2;
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr4, raVar.f2648, cArr3, 0, i - raVar.f2648);
        }
        if (z) {
            int i5 = Camera2StreamConfigurationMap + 79;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 != 0) {
                cArr = new char[i];
                raVar.f2649 = 1;
            } else {
                cArr = new char[i];
                raVar.f2649 = 0;
            }
            while (raVar.f2649 < i) {
                cArr[raVar.f2649] = cArr3[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr3 = cArr;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static javax.crypto.SecretKey m25014(java.lang.String str) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyStoreException, java.security.cert.CertificateException, java.io.IOException {
        javax.crypto.SecretKey secretKey;
        synchronized (util.h.xy.al.mc.class) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{1946346521, 967195455, -646897763, 801446981, -1980076219, -1492426025, -109035703, -1320028075, 1374557275, -622094733, 1469076550, -924674211, -1823454529, -1340288904, -1220812950, -1536864393, 1977454764, -1618604494, -1721937431, -1285570018, -1982977613, -1044405065, 2056772003, -1237724985, 1194784402, -2041915017, 857487099, 133614515}, 53 - android.view.View.getDefaultSize(0, 0), objArr);
            java.lang.String str2 = (java.lang.String) objArr[0];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-2019360033, 1252834649, -979767576, 1088949354, 1367555096, 121577257, -887139199, -242096188, -1587915668, -1753396337, 1233810172, 1337856872, 857487099, 133614515}, android.text.TextUtils.getOffsetBefore("", 0) + 25, objArr2);
            java.lang.String str3 = (java.lang.String) objArr2[0];
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\u0004\uffff￦\u0000\u0014￮\u000f\n\r\u0000ￜ\t\uffff\r\n", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '!', 10 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 148 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), false, objArr3);
            try {
                java.lang.Object[] objArr4 = {((java.lang.String) objArr3[0]).intern()};
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", -android.os.Process.getGidForName(""), objArr5);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 11, objArr6);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr6[0], java.lang.String.class).invoke(null, objArr4);
                if (invoke == null) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr7[0]).intern());
                }
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", android.graphics.Color.argb(0, 0, 0, 0) + 1, objArr8);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("娾﹋螥Љ婒ో挚팠", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr9);
                cls2.getMethod((java.lang.String) objArr9[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "£\u009c\u0091", objArr10);
                java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u0004\uffff￦\u0000\u0014￮\u000f\n\r\u0000ￜ\t\uffff\r\n", 15 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 10 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 148 - android.view.Gravity.getAbsoluteGravity(0, 0), false, objArr11);
                java.lang.Object[] objArr12 = {intern, ((java.lang.String) objArr11[0]).intern()};
                java.lang.Class<?> cls3 = java.lang.Class.forName(str3);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, 11 - android.view.View.resolveSizeAndState(0, 0, 0), objArr13);
                java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr13[0], java.lang.String.class, java.lang.String.class).invoke(null, objArr12);
                if (invoke2 == null) {
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\u000b\u0012\t\t\b\u0002\u0016￤\u0002\u000b\u0002\u000f\ufffe\u0011\f\u000fﾽ\u0006\u0010ﾽ", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 146 - android.view.View.resolveSize(0, 0), false, objArr14);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr14[0]).intern());
                }
                java.lang.Object newInstance = java.lang.Class.forName(str2).getDeclaredConstructor(java.lang.String.class, java.lang.Integer.TYPE).newInstance(str, 3);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "§\u009f¦", objArr15);
                java.lang.String[] strArr = {((java.lang.String) objArr15[0]).intern()};
                java.lang.Class<?> cls4 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-996912874, 1297938090, 1684355960, -1180513433, 1786282831, -368946590, 619157619, 576681957}, android.text.TextUtils.getOffsetAfter("", 0) + 13, objArr16);
                java.lang.Object invoke3 = cls4.getMethod((java.lang.String) objArr16[0], java.lang.String[].class).invoke(newInstance, strArr);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u0002\u0007\f\u0005￬\r￮\uffff\u0002", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, android.view.View.getDefaultSize(0, 0) + 4, 144 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr17);
                java.lang.String[] strArr2 = {((java.lang.String) objArr17[0]).intern()};
                java.lang.Class<?> cls5 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1608133455, -1404919396, -1253005894, -1037206100, 1565352987, 34590776, 228894725, -1732428829, 1990043319, -793268230, 619157619, 576681957}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 21, objArr18);
                java.lang.Object invoke4 = cls5.getMethod((java.lang.String) objArr18[0], java.lang.String[].class).invoke(invoke3, strArr2);
                java.lang.Object[] objArr19 = {java.lang.Boolean.TRUE};
                java.lang.Class<?> cls6 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{548718913, 624022612, 690482533, 1333401489, -1010274913, -1624774029, -927672042, -965137818, -213578698, 1028921202, 2009937264, 1508753583, 453318823, 1194496897, 841297135, 2003763138}, 30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr20);
                java.lang.Class<?> cls7 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-772242425, -205672637, -208467697, 1394462440, 1456788437, 1347901398}, 10 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr21);
                java.lang.Object invoke5 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE).invoke(cls6.getMethod((java.lang.String) objArr20[0], java.lang.Boolean.TYPE).invoke(invoke4, objArr19), 256);
                java.lang.Object[] objArr22 = {java.lang.Boolean.FALSE};
                java.lang.Class<?> cls8 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1821773289, 251177813, 272198186, -571411289, -872171569, 163530898, -1477086473, -249162362, 953716609, -1402488939, -245026523, -346638443, -970189088, -508104164, 1719524881, 525103598}, android.graphics.Color.argb(0, 0, 0, 0) + 29, objArr23);
                java.lang.Object invoke6 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.Boolean.TYPE).invoke(invoke5, objArr22);
                java.lang.Class<?> cls9 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("疰䛞\uf0dbꚅ痒듄ᑬ熤뱨", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr24);
                java.lang.Object[] objArr25 = {cls9.getMethod((java.lang.String) objArr24[0], null).invoke(invoke6, null)};
                java.lang.Class<?> cls10 = java.lang.Class.forName(str3);
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{1135469610, 932677915}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr26);
                cls10.getMethod((java.lang.String) objArr26[0], java.security.spec.AlgorithmParameterSpec.class).invoke(invoke2, objArr25);
                java.lang.Class<?> cls11 = java.lang.Class.forName(str3);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("욛\udc3a㯰뉣웼⸰\udf40敋ཕ恰锞ጏ喨妸䏟", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr27);
                secretKey = (javax.crypto.SecretKey) cls11.getMethod((java.lang.String) objArr27[0], null).invoke(invoke2, null);
                if (secretKey == null) {
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(126 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), "\u008c\u008c\u008b\u008a\u0088\u0084\u0089\u0088\u0083\u0082\u0081\u0085\u0082\u0087\u009b\u0082\u0084", objArr28);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr28[0]).intern());
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return secretKey;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25013(java.lang.String str) {
        java.lang.Object[] objArr;
        synchronized (util.h.xy.al.mc.class) {
            try {
                objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\u0004\uffff￦\u0000\u0014￮\u000f\n\r\u0000ￜ\t\uffff\r\n", android.graphics.ImageFormat.getBitsPerPixel(0) + 16, 10 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 148 - android.text.TextUtils.indexOf("", "", 0, 0), false, objArr);
            } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            }
            try {
                java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr3);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1496135262, 2019352643, 1264648801, -1294587399, 1259032250, 738450427}, android.graphics.Color.green(0) + 11, objArr4);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                getHighSpeedVideoFpsRangesFor = (getOutputStallDurationlomOqCM + 3) % 128;
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", (android.os.Process.myPid() >> 22) + 1, objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("娾﹋螥Љ婒ో挚팠", -android.view.MotionEvent.axisFromString(""), objArr6);
                    cls2.getMethod((java.lang.String) objArr6[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    try {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", 1 - android.view.View.resolveSize(0, 0), objArr7);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("䣡ڬ\ue21a눼䢂\uf4acڪ攅脼뫮䳮ፆ\udbd8茧騥\ud898ᖦ", android.graphics.Color.alpha(0) + 1, objArr8);
                        if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class).invoke(invoke, str)).booleanValue()) {
                            getHighSpeedVideoFpsRangesFor = (getOutputStallDurationlomOqCM + 53) % 128;
                            try {
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("怅\ue22d️쳽息ဣᪧᯑꦗ幵僰涗\uf308枸蘰Ꙍ㵈궠뱖\uf819䚌ﬡ\uf5b5㊯郛œ", 1 - android.text.TextUtils.getCapsMode("", 0, 0), objArr9);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("르赼獾뮣뤐罶韌沋炼ㄲ\udda1᫄⩸ࣩ\u0b51", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr10);
                                cls4.getMethod((java.lang.String) objArr10[0], java.lang.String.class).invoke(invoke, str);
                                getHighSpeedVideoFpsRangesFor = (getOutputStallDurationlomOqCM + 97) % 128;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizes = -4011243473359599033L;
        getOutputFormats = new int[]{1438082644, -683218521, -1350724856, 1555137054, -344583257, -1033410, 933014433, 740296075, 2091697520, 1431777147, -1023841533, -1843581276, 1613095253, 1082340202, -501885186, 1252972078, -1506841151, -288480044};
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputSizes = -1231763783;
        getInputFormats = new char[]{64251, 64221, 64201, 64195, 64194, 64199, 64192, 64278, 64217, 64196, 64205, 64218, 64226, 64222, 64209, 64230, 64241, 64198, 64197, 64220, 64200, 64206, 64210, 64204, 64216, 64207, 64211, 64253, 64256, 64271, 64243, 64259, 64242, 64248, 64227, 64239, 64223, 64255, 64229};
        getOutputMinFrameDuration = -1074857162;
        getInputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRanges = true;
    }
}
