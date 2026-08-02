package util.h.xy.z;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 0;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static short[] getOutputFormats = null;
    private static int getOutputMinFrameDuration = 0;
    private static boolean getOutputMinFrameDurationlomOqCM = false;
    private static util.h.xy.z.b getOutputSizes = null;
    private static byte[] getOutputSizeshNQ4ISI = null;
    private static int getOutputStallDuration = 1;
    private static int getOutputStallDurationlomOqCM;
    private static char[] unwrapAs;
    private android.content.Context getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedForhNQ4ISI = null;

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap();
        getOutputSizes = null;
        int i = getInputFormats + 87;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.z.b m27708(android.content.Context context) {
        util.h.xy.z.b bVar;
        synchronized (util.h.xy.z.b.class) {
            getOutputStallDuration = (getInputFormats + 97) % 128;
            if (getOutputSizes == null) {
                getOutputSizes = new util.h.xy.z.b(context);
                getOutputStallDuration = (getInputFormats + 89) % 128;
            }
            bVar = getOutputSizes;
        }
        return bVar;
    }

    private b(android.content.Context context) {
        try {
            this.getValidOutputFormatsForInputhNQ4ISI = context;
            getHighResolutionOutputSizeshNQ4ISI();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            e.getCause().getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01cc, code lost:
    
        if ((r5 % 2) != 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighResolutionOutputSizeshNQ4ISI() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("붡\ue7c7퍫氜뷀ꃖ己먓ꀲ苕翵顋蘪擕᧾縜\ue427䛝㯭尔쩿壃헠∈⠾㫘\uf7ee\u0007ฬ\u1c8e釆\ue61c氼ﻣ돬쐓刑탹귇ꨠ뀐당俅蠠阋铃槍測\uf416皰\u0bfb䰸\uda18䣤◁刴㠟", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.graphics.Color.red(0), "\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                try {
                    java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-408892069) - android.os.Process.getGidForName(""), (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) android.view.View.MeasureSpec.getSize(0), (-60) - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1657572534 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr5);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', objArr6);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((-408892057) - android.view.KeyEvent.getDeadChar(0, 0), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) android.view.View.MeasureSpec.getSize(0), (-60) - android.widget.ExpandableListView.getPackedPositionGroup(0L), 1657572540 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr7);
                        cls2.getMethod((java.lang.String) objArr7[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                        try {
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(android.text.TextUtils.getCapsMode("", 0, 0) + 127, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr8);
                            try {
                                java.lang.Object[] objArr9 = {((java.lang.String) objArr8[0]).intern()};
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", 1 - android.text.TextUtils.getOffsetAfter("", 0), objArr10);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("䚐恹\ue927\ue6dd䛳❩枷ピ嬍ի䖳\u12d7紩\ue362⎸\uf4c9\u1f17", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
                                if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr11[0], java.lang.String.class).invoke(invoke, objArr9)).booleanValue()) {
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0088\u008d\u008f\u008e\u008d\u008c", objArr12);
                                    try {
                                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern(), null};
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", android.text.TextUtils.getOffsetAfter("", 0) + 1, objArr14);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 408892053, (short) android.view.View.resolveSize(0, 0), (byte) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-60) - android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.getCapsMode("", 0, 0) + 1657572535, objArr15);
                                        if (cls4.getMethod((java.lang.String) objArr15[0], java.lang.String.class, char[].class).invoke(invoke, objArr13) != null) {
                                            int i = getOutputStallDuration + 13;
                                            getInputFormats = i % 128;
                                        }
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
                        } catch (java.lang.Exception unused) {
                        }
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(false, new int[]{0, 3, 0, 1}, "\u0001\u0000\u0000", objArr16);
                        java.lang.String intern = ((java.lang.String) objArr16[0]).intern();
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getMode(0) + 127, "\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr17);
                        try {
                            java.lang.Object[] objArr18 = {intern, ((java.lang.String) objArr17[0]).intern()};
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("䍄뢍Ⲫᾑ䌮ﾓꈢ즍廀\uddd8耳\ueb9a磅㮊\ue628උ\u1a9eᦵ쐽⾙㓳އ⨪写훚文࠴玗\uf0de", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr19);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((-408892067) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (byte) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-60) - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1657572536, objArr20);
                            java.lang.Object invoke2 = cls5.getMethod((java.lang.String) objArr20[0], java.lang.String.class, java.lang.String.class).invoke(null, objArr18);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr21);
                            try {
                                java.lang.Object newInstance = java.lang.Class.forName(str).getDeclaredConstructor(java.lang.String.class, java.lang.Integer.TYPE).newInstance(((java.lang.String) objArr21[0]).intern(), 3);
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{3, 3, 0, 3}, "\u0001\u0000\u0000", objArr22);
                                try {
                                    java.lang.Object[] objArr23 = {new java.lang.String[]{((java.lang.String) objArr22[0]).intern()}};
                                    java.lang.Class<?> cls6 = java.lang.Class.forName(str);
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("贛៵蕳䵈赨僯௹魷邋狡⧪륚뚮铭信彘풜", 1 - android.view.KeyEvent.keyCodeFromString(""), objArr24);
                                    java.lang.Object invoke3 = cls6.getMethod((java.lang.String) objArr24[0], java.lang.String[].class).invoke(newInstance, objArr23);
                                    int i2 = getOutputStallDuration + 81;
                                    getInputFormats = i2 % 128;
                                    int i3 = i2 % 2;
                                    try {
                                        java.lang.Object[] objArr25 = {java.lang.Boolean.FALSE};
                                        java.lang.Class<?> cls7 = java.lang.Class.forName(str);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("姠ᮿ뉦뚖妓岥㳬悾䑯纡Ữ䊮扭颼磸ꒆz몸嫽蚄\u2e71꒤듡\uf894챢욆雩\uda8e\uea7d\ue0b1\uf0f2㲖衠", android.text.TextUtils.indexOf("", "") + 1, objArr26);
                                        java.lang.Object invoke4 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.Boolean.TYPE).invoke(invoke3, objArr25);
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u0092\u0082\u0086\u0083\u0083\u008c\u0091\u0085\u0090", objArr27);
                                        java.lang.String[] strArr = {((java.lang.String) objArr27[0]).intern()};
                                        getInputFormats = (getOutputStallDuration + 121) % 128;
                                        try {
                                            java.lang.Class<?> cls8 = java.lang.Class.forName(str);
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("醶椞禖齋釅⸄\uf71c䥳谤ఆ픞歋\uaa3e\uea1d댉赑젬젽鄅꽞\ue622혘编텁Щ", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr28);
                                            java.lang.Object invoke5 = cls8.getMethod((java.lang.String) objArr28[0], java.lang.String[].class).invoke(invoke4, strArr);
                                            try {
                                                java.lang.Class<?> cls9 = java.lang.Class.forName(str);
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("ﺳ샫襐\uda71ﻑ蟡߇ౠ\ue32b", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr29);
                                                java.lang.Object invoke6 = cls9.getMethod((java.lang.String) objArr29[0], null).invoke(invoke5, null);
                                                getInputFormats = (getOutputStallDuration + 115) % 128;
                                                try {
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor("䍄뢍Ⲫᾑ䌮ﾓꈢ즍廀\uddd8耳\ueb9a磅㮊\ue628උ\u1a9eᦵ쐽⾙㓳އ⨪写훚文࠴玗\uf0de", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr30);
                                                    java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor("⛺烘䙰ഹ⚓㟉죧\udb30", 1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr31);
                                                    cls10.getMethod((java.lang.String) objArr31[0], java.security.spec.AlgorithmParameterSpec.class).invoke(invoke2, invoke6);
                                                    getOutputStallDuration = (getInputFormats + 109) % 128;
                                                    try {
                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor("䍄뢍Ⲫᾑ䌮ﾓꈢ즍廀\uddd8耳\ueb9a磅㮊\ue628උ\u1a9eᦵ쐽⾙㓳އ⨪写훚文࠴玗\uf0de", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr32);
                                                        java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor("珁靽餈\uda09玦큧ម\u0c11湏\uf267㖆⸕䡲ᑯ厇", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr33);
                                                        cls11.getMethod((java.lang.String) objArr33[0], null).invoke(invoke2, null);
                                                        int i4 = getInputFormats + 21;
                                                        getOutputStallDuration = i4 % 128;
                                                        int i5 = i4 % 2;
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
                                            } catch (java.lang.Throwable th5) {
                                                java.lang.Throwable cause5 = th5.getCause();
                                                if (cause5 == null) {
                                                    throw th5;
                                                }
                                                throw cause5;
                                            }
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause6 = th6.getCause();
                                            if (cause6 == null) {
                                                throw th6;
                                            }
                                            throw cause6;
                                        }
                                    } catch (java.lang.Throwable th7) {
                                        java.lang.Throwable cause7 = th7.getCause();
                                        if (cause7 == null) {
                                            throw th7;
                                        }
                                        throw cause7;
                                    }
                                } catch (java.lang.Throwable th8) {
                                    java.lang.Throwable cause8 = th8.getCause();
                                    if (cause8 == null) {
                                        throw th8;
                                    }
                                    throw cause8;
                                }
                            } catch (java.lang.Throwable th9) {
                                java.lang.Throwable cause9 = th9.getCause();
                                if (cause9 == null) {
                                    throw th9;
                                }
                                throw cause9;
                            }
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause10 = th10.getCause();
                            if (cause10 == null) {
                                throw th10;
                            }
                            throw cause10;
                        }
                    } catch (java.lang.Throwable th11) {
                        java.lang.Throwable cause11 = th11.getCause();
                        if (cause11 == null) {
                            throw th11;
                        }
                        throw cause11;
                    }
                } catch (java.lang.Throwable th12) {
                    java.lang.Throwable cause12 = th12.getCause();
                    if (cause12 == null) {
                        throw th12;
                    }
                    throw cause12;
                }
            } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.cert.CertificateException e) {
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0084\u0085\u0084\u0084\u0088\u0093\u0082\u0085\u0086\u008b\u008c\u0096\u0086\u0095\u008c\u0086\u008b\u0086\u0082\u0094\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr34);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr34[0]).intern(), e);
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27711() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr;
        synchronized (this) {
            getOutputStallDuration = (getInputFormats + 87) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.argb(0, 0, 0, 0) - 408892047, (short) android.view.View.combineMeasuredStates(0, 0), (byte) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (-60) - android.text.TextUtils.indexOf("", ""), 1657572538 - android.view.View.combineMeasuredStates(0, 0), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            byte[] bArr2 = this.isOutputSupportedForhNQ4ISI;
            if (bArr2 != null) {
                int i = (getOutputStallDuration + 49) % 128;
                getInputFormats = i;
                int i2 = i + 11;
                getOutputStallDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    return Camera2StreamConfigurationMap(bArr2);
                }
                Camera2StreamConfigurationMap(bArr2);
                throw null;
            }
            getOutputStallDuration = (getInputFormats + 73) % 128;
            try {
                boolean z = !util.h.xy.z.a.m27702(this.getValidOutputFormatsForInputhNQ4ISI).m27704() ? true : 2;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(false, new int[]{6, 17, 0, 7}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001", objArr2);
                try {
                    java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Class<?> cls = java.lang.Class.forName(str);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-408892068) - android.graphics.Color.green(0), (short) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 61, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1657572535, objArr4);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr3);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                    try {
                        java.lang.Object[] objArr6 = {((java.lang.String) objArr5[0]).intern()};
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", 1 - android.view.KeyEvent.getDeadChar(0, 0), objArr7);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(((android.os.Process.getThreadPriority(0) + 20) >> 6) - 408892068, (short) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.blue(0) - 60, android.view.View.MeasureSpec.getSize(0) + 1657572535, objArr8);
                        java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.String.class).invoke(null, objArr6);
                        getInputFormats = (getOutputStallDuration + 27) % 128;
                        try {
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '/', objArr9);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(((android.os.Process.getThreadPriority(0) + 20) >> 6) - 408892057, (short) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.argb(0, 0, 0, 0) - 60, 1657572540 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr10);
                            cls3.getMethod((java.lang.String) objArr10[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke2, null);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0088\u008d\u008f\u008e\u008d\u008c", objArr11);
                            try {
                                java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).intern(), null};
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", 1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTapTimeout() >> 16) - 408892053, (short) android.text.TextUtils.getTrimmedLength(""), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 60, 1657572536 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr14);
                                javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) cls4.getMethod((java.lang.String) objArr14[0], java.lang.String.class, char[].class).invoke(invoke2, objArr12);
                                if (z) {
                                    bArr = new byte[16];
                                    try {
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("伷ꗯﵴ铄佝\ue2f1珼䋘勥샧凫惞璺⛪㟫蛅ᚺҲᗕꓐ㢤\u1af5ﯨ\udacc\uda89磥\ud9f0\uf8c9ﲰ廥", 1 - android.text.TextUtils.indexOf("", "", 0), objArr15);
                                        ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr15[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
                                        getInputFormats = (getOutputStallDuration + 77) % 128;
                                        try {
                                            java.lang.Object[] objArr16 = {1, secretKey};
                                            java.lang.Class<?> cls5 = java.lang.Class.forName(str);
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("⛺烘䙰ഹ⚓㟉죧\udb30", 1 - android.text.TextUtils.indexOf("", "", 0), objArr17);
                                            java.lang.String str2 = (java.lang.String) objArr17[0];
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 408892028, (short) android.graphics.Color.alpha(0), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.graphics.Color.rgb(0, 0, 0) + 16777156, 1657572538 - android.view.View.resolveSize(0, 0), objArr18);
                                            cls5.getMethod(str2, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr18[0])).invoke(invoke, objArr16);
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
                                } else {
                                    byte[] m27703 = util.h.xy.z.a.m27702(this.getValidOutputFormatsForInputhNQ4ISI).m27703();
                                    int i3 = m27703[0];
                                    if (i3 == 0 && m27703[1] == 0) {
                                        byte[] bArr3 = new byte[0];
                                        this.isOutputSupportedForhNQ4ISI = bArr3;
                                        return bArr3;
                                    }
                                    byte[] bArr4 = new byte[i3];
                                    for (int i4 = 0; i4 < m27703[0]; i4++) {
                                        getInputFormats = (getOutputStallDuration + 61) % 128;
                                        bArr4[i4] = m27703[i4 + 2];
                                    }
                                    byte[] bArr5 = new byte[m27703[1]];
                                    for (int i5 = 0; i5 < m27703[1]; i5++) {
                                        bArr5[i5] = m27703[m27703[0] + 2 + i5];
                                    }
                                    try {
                                        java.lang.Object[] objArr19 = {128, bArr4};
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("ꩯ\ud82c폻ڻꨅ鼲嵳킧럫뵹罢\uf2b0釮嬫\u1979ᒡ\uf3b5礬㭹㚯\uddfc杭핒䢕㿎ԗ\uf770檠᧦⌦酸貪篮섽덊꺪䗪\uef10", 1 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr20);
                                        try {
                                            java.lang.Object[] objArr21 = {2, secretKey, java.lang.Class.forName((java.lang.String) objArr20[0]).getDeclaredConstructor(java.lang.Integer.TYPE, byte[].class).newInstance(objArr19)};
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(str);
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("⛺烘䙰ഹ⚓㟉죧\udb30", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr22);
                                            java.lang.String str3 = (java.lang.String) objArr22[0];
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRanges(android.graphics.ImageFormat.getBitsPerPixel(0) - 408892027, (short) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-60) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1657572538 - android.text.TextUtils.getCapsMode("", 0, 0), objArr23);
                                            cls6.getMethod(str3, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr23[0]), java.security.spec.AlgorithmParameterSpec.class).invoke(invoke, objArr21);
                                            bArr = bArr5;
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
                                }
                                getInputFormats = (getOutputStallDuration + 57) % 128;
                                try {
                                    java.lang.Class<?> cls7 = java.lang.Class.forName(str);
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("橐ߐ꾝⢀樴䃀℥ﺔ矂拊̋", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr24);
                                    byte[] bArr6 = (byte[]) cls7.getMethod((java.lang.String) objArr24[0], byte[].class).invoke(invoke, bArr);
                                    if (!z) {
                                        this.isOutputSupportedForhNQ4ISI = Camera2StreamConfigurationMap((byte[]) bArr6.clone());
                                        return bArr6;
                                    }
                                    try {
                                        java.lang.Class<?> cls8 = java.lang.Class.forName(str);
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("ᎄ鹗뛍밵Ꮳ\ud94d㡇樁ฮ", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr25);
                                        byte[] bArr7 = (byte[]) cls8.getMethod((java.lang.String) objArr25[0], null).invoke(invoke, null);
                                        byte[] bArr8 = new byte[bArr6.length + bArr7.length + 2];
                                        bArr8[0] = (byte) bArr7.length;
                                        bArr8[1] = (byte) bArr6.length;
                                        int i6 = 0;
                                        while (i6 < bArr7.length) {
                                            bArr8[i6 + 2] = bArr7[i6];
                                            i6++;
                                            getInputFormats = (getOutputStallDuration + 107) % 128;
                                        }
                                        int i7 = 0;
                                        while (i7 < bArr6.length) {
                                            int i8 = getOutputStallDuration + 7;
                                            getInputFormats = i8 % 128;
                                            if (i8 % 2 != 0) {
                                                bArr8[(bArr7.length + i7) << 4] = bArr6[i7];
                                                i7 += 3;
                                            } else {
                                                bArr8[bArr7.length + i7 + 2] = bArr6[i7];
                                                i7++;
                                            }
                                        }
                                        util.h.xy.z.a.m27702(this.getValidOutputFormatsForInputhNQ4ISI).m27707(bArr8);
                                        util.h.xy.al.rb.m25016(bArr8);
                                        this.isOutputSupportedForhNQ4ISI = Camera2StreamConfigurationMap((byte[]) bArr.clone());
                                        return bArr;
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
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (android.security.keystore.KeyPermanentlyInvalidatedException e) {
                try {
                    m27710();
                } catch (java.lang.Exception unused) {
                }
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(true, new int[]{23, 55, 0, 10}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr26);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr26[0]).intern(), e);
            } catch (java.io.IOException e2) {
                e = e2;
                java.lang.Throwable th11 = e;
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr27);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr27[0]).intern(), th11);
            } catch (java.security.InvalidAlgorithmParameterException e3) {
                e = e3;
                java.lang.Throwable th112 = e;
                java.lang.Object[] objArr272 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr272);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr272[0]).intern(), th112);
            } catch (java.security.InvalidKeyException e4) {
                e = e4;
                java.lang.Throwable th1122 = e;
                java.lang.Object[] objArr2722 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr2722);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2722[0]).intern(), th1122);
            } catch (java.security.KeyStoreException e5) {
                e = e5;
                java.lang.Throwable th11222 = e;
                java.lang.Object[] objArr27222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr27222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr27222[0]).intern(), th11222);
            } catch (java.security.NoSuchAlgorithmException e6) {
                e = e6;
                java.lang.Throwable th112222 = e;
                java.lang.Object[] objArr272222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr272222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr272222[0]).intern(), th112222);
            } catch (java.security.UnrecoverableKeyException e7) {
                e = e7;
                java.lang.Throwable th1122222 = e;
                java.lang.Object[] objArr2722222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr2722222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2722222[0]).intern(), th1122222);
            } catch (java.security.cert.CertificateException e8) {
                e = e8;
                java.lang.Throwable th11222222 = e;
                java.lang.Object[] objArr27222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr27222222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr27222222[0]).intern(), th11222222);
            } catch (javax.crypto.BadPaddingException e9) {
                e = e9;
                java.lang.Throwable th112222222 = e;
                java.lang.Object[] objArr272222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr272222222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr272222222[0]).intern(), th112222222);
            } catch (javax.crypto.IllegalBlockSizeException e10) {
                e = e10;
                java.lang.Throwable th1122222222 = e;
                java.lang.Object[] objArr2722222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr2722222222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2722222222[0]).intern(), th1122222222);
            } catch (javax.crypto.NoSuchPaddingException e11) {
                e = e11;
                java.lang.Throwable th11222222222 = e;
                java.lang.Object[] objArr27222222222 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0084\u0085\u0084\u0084\u0088\u0093\u0084\u0088\u0099\u0098\u0086\u0097\u0093\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087", objArr27222222222);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr27222222222[0]).intern(), th11222222222);
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = unwrapAs;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr3[i6] = (char) (cArr2[i6] ^ (-8125198844289309347L));
            }
            int i7 = getHighSpeedVideoSizes + 51;
            Camera2StreamConfigurationMap = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        java.lang.System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bytes != null) {
            int i9 = Camera2StreamConfigurationMap + 21;
            getHighSpeedVideoSizes = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i3];
                maVar.f2631 = 1;
            } else {
                cArr = new char[i3];
                maVar.f2631 = 0;
            }
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    int i10 = Camera2StreamConfigurationMap + 41;
                    getHighSpeedVideoSizes = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 4) - 1) - c);
                    } else {
                        cArr[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 2) + 1) - c);
                    }
                } else {
                    cArr[maVar.f2631] = (char) ((cArr4[maVar.f2631] * 2) - c);
                }
                c = cArr[maVar.f2631];
                maVar.f2631++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i11 = getHighSpeedVideoSizes + 81;
            Camera2StreamConfigurationMap = i11 % 128;
            if (i11 % 2 == 0) {
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr4, 0, cArr5, 1, i3);
                java.lang.System.arraycopy(cArr5, 1, cArr4, i3 * i5, i5);
                java.lang.System.arraycopy(cArr5, i5, cArr4, 0, i3 % i5);
            } else {
                char[] cArr6 = new char[i3];
                java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i12 = i3 - i5;
                java.lang.System.arraycopy(cArr6, 0, cArr4, i12, i5);
                java.lang.System.arraycopy(cArr6, i5, cArr4, 0, i12);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                int i13 = Camera2StreamConfigurationMap + 93;
                getHighSpeedVideoSizes = i13 % 128;
                if (i13 % 2 != 0) {
                    cArr7[maVar.f2631] = cArr4[(i3 - maVar.f2631) >>> 1];
                    i = maVar.f2631;
                } else {
                    cArr7[maVar.f2631] = cArr4[(i3 - maVar.f2631) - 1];
                    i = maVar.f2631 + 1;
                }
                maVar.f2631 = i;
            }
            cArr4 = cArr7;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr4[maVar.f2631] = (char) (cArr4[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getOutputSizeshNQ4ISI;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getOutputSizeshNQ4ISI[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getOutputFormats[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputSizeshNQ4ISI;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 115;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 101) % 128;
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputStallDurationlomOqCM);
        if (!getOutputMinFrameDurationlomOqCM) {
            if (!getHighSpeedVideoFpsRangesFor) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27710() {
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.String intern;
        synchronized (this) {
            int i = getInputFormats + 113;
            getOutputStallDuration = i % 128;
            try {
                if (i % 2 == 0) {
                    this.isOutputSupportedForhNQ4ISI = null;
                    util.h.xy.z.a.m27702(this.getValidOutputFormatsForInputhNQ4ISI).m27706();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(6 % android.widget.ExpandableListView.getPackedPositionChild(1L), "\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                    obj = objArr[0];
                } else {
                    this.isOutputSupportedForhNQ4ISI = null;
                    util.h.xy.z.a.m27702(this.getValidOutputFormatsForInputhNQ4ISI).m27706();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                    obj = objArr2[0];
                }
                java.lang.String intern2 = ((java.lang.String) obj).intern();
                getInputFormats = (getOutputStallDuration + 73) % 128;
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr3);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-408892068) - android.graphics.Color.argb(0, 0, 0, 0), (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (-59) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1657572535 - android.view.KeyEvent.keyCodeFromString(""), objArr4);
                    invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, intern2);
                    getInputFormats = (getOutputStallDuration + 89) % 128;
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((-408892058) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 60, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1657572540, objArr6);
                        cls2.getMethod((java.lang.String) objArr6[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr7);
                        intern = ((java.lang.String) objArr7[0]).intern();
                        getInputFormats = (getOutputStallDuration + 75) % 128;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            }
            try {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1, objArr8);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("䚐恹\ue927\ue6dd䛳❩枷ピ嬍ի䖳\u12d7紩\ue362⎸\uf4c9\u1f17", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr9);
                if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr9[0], java.lang.String.class).invoke(invoke, intern)).booleanValue()) {
                    getOutputStallDuration = (getInputFormats + 99) % 128;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr10);
                    java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
                    getOutputStallDuration = (getInputFormats + 93) % 128;
                    try {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr11);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("᭭䵭\uf2dd\ue765ᬉ\u0a77籏ㅽۥ⡳幢፲⃡침㡒", 1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr12);
                        cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class).invoke(invoke, intern3);
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                getOutputSizes = null;
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        byte[] bArr2;
        byte[] m25017;
        int i = getInputFormats + 111;
        getOutputStallDuration = i % 128;
        int i2 = 0;
        if (i % 2 == 0) {
            bArr2 = new byte[bArr.length];
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{78, 32, 0, 29}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr);
            m25017 = util.h.xy.al.rb.m25017(((java.lang.String) objArr[0]).intern());
            i2 = 1;
        } else {
            bArr2 = new byte[bArr.length];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(false, new int[]{78, 32, 0, 29}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", objArr2);
            m25017 = util.h.xy.al.rb.m25017(((java.lang.String) objArr2[0]).intern());
        }
        getOutputStallDuration = (getInputFormats + 49) % 128;
        while (i2 < bArr2.length) {
            int i3 = getOutputStallDuration + 41;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                bArr2[i2] = (byte) (bArr[i2] ^ m25017[i2]);
                i2 += 68;
            } else {
                bArr2[i2] = (byte) (bArr[i2] ^ m25017[i2]);
                i2++;
            }
        }
        return bArr2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m27709() {
        java.lang.Object obj;
        boolean z = false;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0088\u0084\u0085\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            try {
                java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr3);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.view.KeyEvent.getMaxKeyCode() >> 16) - 408892068, (short) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (byte) android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 61, 1657572535 - android.view.View.combineMeasuredStates(0, 0), objArr4);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr5);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 408892057, (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-60) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1657572540 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
                    cls2.getMethod((java.lang.String) objArr6[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr7);
                    try {
                        java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", android.view.View.getDefaultSize(0, 0) + 1, objArr9);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("䚐恹\ue927\ue6dd䛳❩枷ピ嬍ի䖳\u12d7紩\ue362⎸\uf4c9\u1f17", android.view.View.resolveSize(0, 0) + 1, objArr10);
                        if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr10[0], java.lang.String.class).invoke(invoke, objArr8)).booleanValue()) {
                            int i = getOutputStallDuration + 93;
                            getInputFormats = i % 128;
                            if (i % 2 != 0) {
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(android.graphics.Color.green(0) + 107, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr11);
                                obj = objArr11[0];
                            } else {
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(android.graphics.Color.green(0) + 127, "\u0088\u008d\u008f\u008e\u008d\u008c", objArr12);
                                obj = objArr12[0];
                            }
                            try {
                                java.lang.Object[] objArr13 = {((java.lang.String) obj).intern(), null};
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\udcbcుჅ뺥\udcd6䭟鹍梹셮楉뱚䪿\ue731轄\uda5a겤蔱괜\uf87c躱ꬵ덽ᙟ\uf0a7䤢텏", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr14);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 408892053, (short) android.view.View.combineMeasuredStates(0, 0), (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 60, 1657572535 - android.view.View.resolveSize(0, 0), objArr15);
                                if (cls4.getMethod((java.lang.String) objArr15[0], java.lang.String.class, char[].class).invoke(invoke, objArr13) != null) {
                                    z = true;
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        int i2 = getInputFormats + 97;
                        getOutputStallDuration = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 4 / 5;
                        }
                        return z;
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
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = 817401661804232535L;
        getHighSpeedVideoFpsRanges = -121476;
        getOutputMinFrameDuration = -408872989;
        getInputSizeshNQ4ISI = 2056414312;
        getOutputSizeshNQ4ISI = new byte[]{8, -38, 45, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -39, -35, -3, 13, -41, 38, 17, -37, 42, -37, 19, -52, -62, com.google.common.base.Ascii.SI, -41, 38, 0, -43, 37, 32, -33, -2, -51, 103, 35, -36, 47, -33, -41, -19, 110, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -51, 47, 14, -52, -62, -59, 109, -35, -45, 47, 37, -54, 38, 42, -99, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -51, 47};
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizesFor = new char[]{64261, 64232, 64230, 64212, 64235, 64237, 64271, 64225, 64221, 64247, 64214, 64229, 64215, 64224, 64239, 64264, 64266, 64227, 64314, 64269, 64238, 64220, 64263, 64234, 64226};
        getOutputStallDurationlomOqCM = -1074857126;
        getHighSpeedVideoFpsRangesFor = true;
        getOutputMinFrameDurationlomOqCM = true;
        unwrapAs = new char[]{42356, 42263, 42270, 42363, 42261, 42264, 42357, 42245, 42303, 42297, 42299, 42294, 42295, 42249, 42270, 42257, 42268, 42342, 42264, 42261, 42339, 42339, 42243, 42361, 42345, 42271, 42294, 42285, 42284, 42302, 42299, 42290, 42245, 42250, 42297, 42299, 42295, 42298, 42297, 42296, 42268, 42271, 42302, 42268, 42267, 42289, 42295, 42285, 42262, 42263, 42284, 42294, 42288, 42284, 42284, 42294, 42299, 42295, 42294, 42250, 42248, 42297, 42299, 42290, 42288, 42249, 42351, 42363, 42261, 42297, 42289, 42295, 42303, 42299, 42295, 42299, 42294, 42287, 42367, 42343, 42349, 42350, 42339, 42336, 42344, 42347, 42346, 42336, 42337, 42344, 42345, 42351, 42348, 42351, 42342, 42265, 42264, 42264, 42337, 42342, 42343, 42343, 42339, 42338, 42339, 42345, 42342, 42264, 42339, 42344};
    }
}
