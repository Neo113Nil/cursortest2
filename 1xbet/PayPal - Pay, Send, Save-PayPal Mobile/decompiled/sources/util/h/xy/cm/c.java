package util.h.xy.cm;

/* loaded from: classes5.dex */
public final class c {
    private static long Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static long getInputSizeshNQ4ISI = 0;
    private static char[] getOutputFormats = null;
    private static long getOutputMinFrameDuration = 0;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration = 1;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges();
        getOutputSizeshNQ4ISI = util.h.xy.cm.c.class.getName();
        getHighSpeedVideoFpsRanges = (getOutputStallDuration + 5) % 128;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 79) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i3 = getHighSpeedVideoFpsRangesFor + 29;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes + 63;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 15) % 128;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputSizeshNQ4ISI ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25964(byte[] bArr, byte[] bArr2, java.util.Map<java.lang.String, java.lang.String> map) throws util.h.xy.cm.ma {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufddcۤ௵\u0cdbᇗ\u1af2ᾬₓ▂\u2e6b㍽㑎㥈䈾䝫䠜䴜嘔嫾忪惒斂溧玨璔秎艼蝩衏赞防鬮鰐ꄕꨆ껠돠뒒맄습잯좛춝홽\uee453\ue144\uea36", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 64271, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            if (util.h.xy.cv.ra.m26070(bArr2) || util.h.xy.cv.ra.m26070(bArr) || map == null || map.isEmpty()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(64 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16777216, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            try {
                java.security.KeyPair highSpeedVideoSizes = getHighSpeedVideoSizes(bArr2, bArr);
                javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal(getHighSpeedVideoSizes(map));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, 63 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0012\u000f\u0006\u0011\u0016ￋ￨\u0002\u0016￭\ufffe\u0006\u000f\u0007\ufffe\u0013\ufffeￋ\u0010\u0002\u0000", 21 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 14 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, false, objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\ufffb\u0005\u0002￼\u0000\ufffe\r￩\u000e", android.text.TextUtils.getOffsetAfter("", 0) + 9, 4 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.getOffsetAfter("", 0) + 283, false, objArr5);
                    java.security.PublicKey publicKey = (java.security.PublicKey) cls.getMethod((java.lang.String) objArr5[0], null).invoke(highSpeedVideoSizes, null);
                    util.h.xy.dh.ae aeVar = new util.h.xy.dh.ae();
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\u0012\u000f\u0006\u0011\u0016ￋ￨\u0002\u0016￭\ufffe\u0006\u000f\u0007\ufffe\u0013\ufffeￋ\u0010\u0002\u0000", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, (-16777203) - android.graphics.Color.rgb(0, 0, 0), 279 - android.text.TextUtils.indexOf("", "", 0), false, objArr6);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\uffe7\u000b￼\ufffe￼\u000b\ufff8\r\u0000\t", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, android.view.KeyEvent.keyCodeFromString("") + 4, 286 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, objArr7);
                        return new util.h.xy.cm.rc(intern2, x500Principal, publicKey, aeVar, (java.security.PrivateKey) cls2.getMethod((java.lang.String) objArr7[0], null).invoke(highSpeedVideoSizes, null)).mo25969();
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
            } catch (java.security.InvalidKeyException unused) {
                util.h.xy.cm.ma maVar = new util.h.xy.cm.ma(intern);
                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                throw maVar;
            } catch (java.security.NoSuchAlgorithmException unused2) {
                util.h.xy.cm.ma maVar2 = new util.h.xy.cm.ma(intern);
                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                throw maVar2;
            } catch (java.security.NoSuchProviderException unused3) {
                util.h.xy.cm.ma maVar3 = new util.h.xy.cm.ma(intern);
                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                throw maVar3;
            } catch (java.security.SignatureException unused4) {
                util.h.xy.cm.ma maVar4 = new util.h.xy.cm.ma(intern);
                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                throw maVar4;
            } catch (java.security.spec.InvalidKeySpecException unused5) {
                util.h.xy.cm.ma maVar5 = new util.h.xy.cm.ma(intern);
                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                throw maVar5;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getInputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (Camera2StreamConfigurationMap ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.cm.b m25962() throws util.h.xy.cm.ma {
        char c;
        try {
            try {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ufdea胧ߌ誸ে谬ጏ陖ᕰ", 32027 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                    java.security.spec.ECGenParameterSpec eCGenParameterSpec = new java.security.spec.ECGenParameterSpec(((java.lang.String) objArr[0]).intern());
                    try {
                        java.lang.Object[] objArr2 = {util.h.xy.cm.ra.f1119.m25970()};
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("Љꀖ띇偿繬ሺ\uea06\ud824殘ӌ\udebcႮ讟ꡤ蓑곤灩哪න꠳壃㌠鎆Ⓩ쉇㊺\u0a60﨟쥔뢛", (char) (6259 - android.view.View.MeasureSpec.getSize(0)), android.view.View.getDefaultSize(0, 0), "漚⁴玾✘", "\u0000\u0000\u0000\u0000", objArr3);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f\u0007￢", android.view.View.resolveSize(0, 0) + 11, android.text.TextUtils.getOffsetAfter("", 0) + 3, 283 - android.graphics.Color.red(0), true, objArr4);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("\ue665\ue752柳맸泫氂\uf67dᤠ\uda04颥樔м喀ኾ仧ﮙᐕ崱䠲쒏骪服⌮娸\u0cdf㚸", (char) (25214 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "奀餺绢噢", "\u0000\u0000\u0000\u0000", objArr5);
                            try {
                                java.lang.Object[] objArr6 = {eCGenParameterSpec, java.lang.Class.forName((java.lang.String) objArr5[0]).getDeclaredConstructor(null).newInstance(null)};
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("Љꀖ띇偿繬ሺ\uea06\ud824殘ӌ\udebcႮ讟ꡤ蓑곤灩哪න꠳壃㌠鎆Ⓩ쉇㊺\u0a60﨟쥔뢛", (char) (6259 - android.text.TextUtils.getTrimmedLength("")), (android.os.Process.getThreadPriority(0) + 20) >> 6, "漚⁴玾✘", "\u0000\u0000\u0000\u0000", objArr7);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("巗㩟䵫ꌱ绿붥Ꞌ墼杶ㄐ", (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.View.getDefaultSize(0, 0), "链祏\ue992颉", "\u0000\u0000\u0000\u0000", objArr8);
                                java.lang.String str = (java.lang.String) objArr8[0];
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("\ue665\ue752柳맸泫氂\uf67dᤠ\uda04颥樔м喀ኾ仧ﮙᐕ崱䠲쒏骪服⌮娸\u0cdf㚸", (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25214), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "奀餺绢噢", "\u0000\u0000\u0000\u0000", objArr9);
                                cls2.getMethod(str, java.security.spec.AlgorithmParameterSpec.class, java.lang.Class.forName((java.lang.String) objArr9[0])).invoke(invoke, objArr6);
                                try {
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("Љꀖ띇偿繬ሺ\uea06\ud824殘ӌ\udebcႮ讟ꡤ蓑곤灩哪න꠳壃㌠鎆Ⓩ쉇㊺\u0a60﨟쥔뢛", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6259), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "漚⁴玾✘", "\u0000\u0000\u0000\u0000", objArr10);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("￥\uffff\u0013￪\ufffb\u0003\f\u0001\uffff\b\uffff\f\ufffb\u000e\uffff", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, 6 - android.widget.ExpandableListView.getPackedPositionChild(0L), 281 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), false, objArr11);
                                    java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr11[0], null).invoke(invoke, null);
                                    try {
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("\u0012\u000f\u0006\u0011\u0016ￋ￨\u0002\u0016￭\ufffe\u0006\u000f\u0007\ufffe\u0013\ufffeￋ\u0010\u0002\u0000", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, 279 - (android.os.Process.myPid() >> 22), false, objArr12);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("\uffe7\u000b￼\ufffe￼\u000b\ufff8\r\u0000\t", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, 4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 285 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr13);
                                        java.lang.Object invoke3 = cls4.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null);
                                        try {
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\u000f\u0000￦\u0000\u0014\u0005￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￫\r\u0004\u0011￼", android.text.TextUtils.getOffsetBefore("", 0) + 24, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, false, objArr14);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\n\ufffe\t￠\u000f\u0000\u0002\uffff\u0000\uffff", 10 - android.view.View.MeasureSpec.getMode(0), 7 - android.view.KeyEvent.normalizeMetaState(0), 281 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), true, objArr15);
                                            byte[] bArr = (byte[]) cls5.getMethod((java.lang.String) objArr15[0], null).invoke(invoke3, null);
                                            try {
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap("\u0012\u000f\u0006\u0011\u0016ￋ￨\u0002\u0016￭\ufffe\u0006\u000f\u0007\ufffe\u0013\ufffeￋ\u0010\u0002\u0000", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 21, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, false, objArr16);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap("\ufffb\u0005\u0002￼\u0000\ufffe\r￩\u000e", 8 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 283, false, objArr17);
                                                java.lang.Object invoke4 = cls6.getMethod((java.lang.String) objArr17[0], null).invoke(invoke2, null);
                                                try {
                                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("\u0012�\u0006\u0015\u0001\uffe7\uffff\u0005\b\ufffe\u0011￬ￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�", 24 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 3 - android.view.View.getDefaultSize(0, 0), 280 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), true, objArr18);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("\n\ufffe\t￠\u000f\u0000\u0002\uffff\u0000\uffff", 11 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 7, android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, true, objArr19);
                                                    return new util.h.xy.cm.b(bArr, (byte[]) cls7.getMethod((java.lang.String) objArr19[0], null).invoke(invoke4, null));
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
                } catch (java.security.NoSuchAlgorithmException unused) {
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(30 - android.text.TextUtils.lastIndexOf("", c, 0, 0), android.view.View.MeasureSpec.getSize(0) + 78, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr20);
                    util.h.xy.cm.ma maVar = new util.h.xy.cm.ma(((java.lang.String) objArr20[0]).intern());
                    getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                    throw maVar;
                }
            } catch (java.security.NoSuchAlgorithmException unused2) {
                c = '0';
                java.lang.Object[] objArr202 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(30 - android.text.TextUtils.lastIndexOf("", c, 0, 0), android.view.View.MeasureSpec.getSize(0) + 78, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr202);
                util.h.xy.cm.ma maVar2 = new util.h.xy.cm.ma(((java.lang.String) objArr202[0]).intern());
                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                throw maVar2;
            }
        } catch (java.security.InvalidAlgorithmParameterException unused3) {
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 78 - android.text.TextUtils.indexOf("", ""), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr21);
            util.h.xy.cm.ma maVar3 = new util.h.xy.cm.ma(((java.lang.String) objArr21[0]).intern());
            getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
            throw maVar3;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25963(byte[] bArr, byte[] bArr2) throws util.h.xy.cm.ma {
        getOutputStallDuration = (getHighSpeedVideoFpsRanges + 77) % 128;
        if (!util.h.xy.cv.ra.m26070(bArr)) {
            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 17) % 128;
            if (!util.h.xy.cv.ra.m26070(bArr2)) {
                try {
                    try {
                        java.lang.Object[] objArr = {util.h.xy.cm.ra.f1119.m25970()};
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), android.graphics.Color.argb(0, 0, 0, 0), "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr2);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f\u0007￢", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, android.widget.ExpandableListView.getPackedPositionType(0L) + 3, 284 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, objArr3);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, objArr);
                        getOutputStallDuration = (getHighSpeedVideoFpsRanges + 23) % 128;
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\u0013\u0016\u0004\u0006\u0014ￏ\u0002\u0017\u0002\u000b\u0004\u0006\u0011\ufff4\u001a\u0006￬\u0005\u0006\u0005\u0010\u0004\u000f￦\uffd9\ufff4￤￬\ufff1ￏ\u0004\u0006\u0011\u0014ￏ\u001a\u0015\n", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\n', android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, true, objArr4);
                            try {
                                java.lang.Object[] objArr5 = {java.lang.Class.forName((java.lang.String) objArr4[0]).getDeclaredConstructor(byte[].class).newInstance(bArr)};
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0), "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr6);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\ufff9\u000e\u0001\n￨�\f\ufff9\n�\u0006�\uffff�\f", 15 - android.text.TextUtils.getCapsMode("", 0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, true, objArr7);
                                java.lang.String str = (java.lang.String) objArr7[0];
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("ﱣ錄␢\ud816턂侇酎휾셆绂￢쁚\ue4bfڽ\ue896쨍閞菕ܞ\ud81c䭂舑荔⒡䶳ᡰ", (char) (29373 - android.graphics.ImageFormat.getBitsPerPixel(0)), android.graphics.Color.alpha(0), "たꥍ뺌畲", "\u0000\u0000\u0000\u0000", objArr8);
                                java.lang.Object invoke2 = cls2.getMethod(str, java.lang.Class.forName((java.lang.String) objArr8[0])).invoke(invoke, objArr5);
                                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                                long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                getHighSpeedVideoFpsRanges = (getOutputStallDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                try {
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(15 - argb, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 62, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr9);
                                    try {
                                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￮\u0004\u0002\t￼\u000f\u0010\r\u0000\u0005", android.widget.ExpandableListView.getPackedPositionChild(0L) + 24, android.view.View.MeasureSpec.getMode(0) + 22, 281 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, objArr11);
                                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f\u0007￢", 11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3 - android.text.TextUtils.indexOf("", "", 0, 0), 283 - android.text.TextUtils.getOffsetBefore("", 0), true, objArr12);
                                        java.lang.Object invoke3 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.String.class).invoke(null, objArr10);
                                        try {
                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￮\u0004\u0002\t￼\u000f\u0010\r\u0000\u0005", 16777239 + android.graphics.Color.rgb(0, 0, 0), 21 - android.graphics.ImageFormat.getBitsPerPixel(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, false, objArr13);
                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("࠺蚢\u2fdd曺ퟀ┒䢆ᇒ", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "䄰㟋鴋欪", "\u0000\u0000\u0000\u0000", objArr14);
                                            java.lang.String str2 = (java.lang.String) objArr14[0];
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\u000f\u0000￦\u0000\u0014\u0005￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￫\r\u0004\u0011￼", android.text.TextUtils.indexOf("", "", 0, 0) + 24, 4 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 280 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr15);
                                            cls4.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr15[0])).invoke(invoke3, invoke2);
                                            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 121) % 128;
                                            try {
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap("￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￮\u0004\u0002\t￼\u000f\u0010\r\u0000\u0005", 23 - android.text.TextUtils.getOffsetAfter("", 0), 23 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, false, objArr16);
                                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                Camera2StreamConfigurationMap("\ufff9\u0005\n\ufffa\t\ufff6", 6 - android.text.TextUtils.getCapsMode("", 0, 0), android.text.TextUtils.indexOf("", "") + 3, 287 - android.graphics.Color.green(0), true, objArr17);
                                                cls5.getMethod((java.lang.String) objArr17[0], byte[].class).invoke(invoke3, bArr2);
                                                try {
                                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￮\u0004\u0002\t￼\u000f\u0010\r\u0000\u0005", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 23, 21 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, false, objArr18);
                                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap("\ufffb�\u0007\u0002", 5 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 3, 288 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr19);
                                                    return (byte[]) cls6.getMethod((java.lang.String) objArr19[0], null).invoke(invoke3, null);
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
                } catch (java.security.GeneralSecurityException unused) {
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ufdcc蜚ࠢ贼ᙁ魝᰷ꆖ⪞꿬ゼ뗓㻫쏵䔝츛匽푁夓\ue24b杞\ue8ac涔\uf693箌ﳯ臃ଧ豇ᅵ驩Ἂꁊ╽꺄㎐뒬㦬싂䟰죴剂", 31469 - android.text.TextUtils.getOffsetAfter("", 0), objArr20);
                    util.h.xy.cm.ma maVar = new util.h.xy.cm.ma(((java.lang.String) objArr20[0]).intern());
                    getOutputStallDuration = (getHighSpeedVideoFpsRanges + 101) % 128;
                    throw maVar;
                }
            }
        }
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 108, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54922), objArr21);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr21[0]).intern());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m25961(byte[] bArr, byte[] bArr2, util.h.xy.cm.ra raVar) throws util.h.xy.cm.ma {
        getOutputStallDuration = (getHighSpeedVideoFpsRanges + 87) % 128;
        if (!util.h.xy.cv.ra.m26070(bArr)) {
            getOutputStallDuration = (getHighSpeedVideoFpsRanges + 17) % 128;
            try {
                if (!util.h.xy.cv.ra.m26070(bArr2)) {
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\u0012\u0007\u0005\uffd0\ufffaￗￒￛ\uffe7\u0010\u0005\u0011\u0006\u0007\u0006￭\u0007\u001b\ufff5\u0012\u0007\u0005\f\u0003\u0018\u0003\uffd0\u0015\u0007\u0005\u0017\u0014\u000b\u0016\u001b\uffd0\u0015", android.graphics.Color.argb(0, 0, 0, 0) + 37, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, false, objArr);
                        java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(byte[].class).newInstance(bArr);
                        try {
                            java.lang.Object[] objArr2 = {raVar.m25970()};
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.Color.green(0), "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr3);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f\u0007￢", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, 3 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 282 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, objArr4);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
                            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 33) % 128;
                            try {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) android.text.TextUtils.getOffsetBefore("", 0), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr5);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\u000e￩\ufffe\r\ufffa\u000b\ufffe\u0007\ufffe\u0000￼\u0002\u0005\ufffb", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.KeyEvent.keyCodeFromString("") + 283, true, objArr6);
                                java.lang.String str = (java.lang.String) objArr6[0];
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("ﱣ錄␢\ud816턂侇酎휾셆绂￢쁚\ue4bfڽ\ue896쨍閞菕ܞ\ud81c䭂舑荔⒡䶳ᡰ", (char) (29375 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.view.KeyEvent.normalizeMetaState(0), "たꥍ뺌畲", "\u0000\u0000\u0000\u0000", objArr7);
                                java.lang.Object invoke2 = cls2.getMethod(str, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(invoke, newInstance);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(5 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr8);
                                java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                                getOutputStallDuration = (getHighSpeedVideoFpsRanges + 77) % 128;
                                try {
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("棺켨麂莸\uf2f1蘺솴瞵ᇶǬ⇐욞鏂詒撙\u0e76윾얇흇皫瞼랁鋋\udbac⚦甎勺뚖尴덐窇ꨣ鲕潄萊㮾龈", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (-500822746) - (android.view.ViewConfiguration.getTouchSlop() >> 8), "⛯☍\uf8e2ﯛ", "\u0000\u0000\u0000\u0000", objArr9);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f\u0007￢", 11 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, android.text.TextUtils.getTrimmedLength("") + 283, true, objArr10);
                                    java.lang.Object invoke3 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.String.class).invoke(null, intern);
                                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr2);
                                    getOutputStallDuration = (getHighSpeedVideoFpsRanges + 1) % 128;
                                    try {
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("棺켨麂莸\uf2f1蘺솴瞵ᇶǬ⇐욞鏂詒撙\u0e76윾얇흇皫瞼랁鋋\udbac⚦甎勺뚖尴덐窇ꨣ鲕潄萊㮾龈", (char) android.graphics.Color.red(0), (-500822746) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "⛯☍\uf8e2ﯛ", "\u0000\u0000\u0000\u0000", objArr11);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("洠隯彚ᨕ᭙⭺ᒉ\udae5爀回ﶆ\udfb0₉煷\ue348⨬㟱䵠ꗣ", (char) (43841 - android.graphics.ImageFormat.getBitsPerPixel(0)), (-133795103) - android.view.Gravity.getAbsoluteGravity(0, 0), "\ue1faٲ䋸疫", "\u0000\u0000\u0000\u0000", objArr12);
                                        java.lang.Object invoke4 = cls4.getMethod((java.lang.String) objArr12[0], java.io.InputStream.class).invoke(invoke3, byteArrayInputStream);
                                        try {
                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("\udad1燾첀∟建玡ꮨ㿀咂䂬\ue4f7꼎㢺῾﹚専塃岓哣\u16fc浳\u1f47䣥緩싄헫镞Ｃꖡ㺮窝䟽全뫗", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.ViewConfiguration.getTouchSlop() >> 8, "\udd41껿铲\ue709", "\u0000\u0000\u0000\u0000", objArr13);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("\uf8a7ᵱ橬雄쿹녽", (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 42945), android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\uf58f\ud894쀈ꊧ", "\u0000\u0000\u0000\u0000", objArr14);
                                            java.lang.String str2 = (java.lang.String) objArr14[0];
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("\u0012�\u0006\u0015\u0001\uffe7\uffff\u0005\b\ufffe\u0011￬ￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, 3 - android.graphics.Color.blue(0), 280 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr15);
                                            cls5.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr15[0])).invoke(invoke4, invoke2);
                                            try {
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("\udad1燾첀∟建玡ꮨ㿀咂䂬\ue4f7꼎㢺῾﹚専塃岓哣\u16fc浳\u1f47䣥緩싄헫镞Ｃꖡ㺮窝䟽全뫗", (char) android.view.Gravity.getAbsoluteGravity(0, 0), android.view.KeyEvent.getMaxKeyCode() >> 16, "\udd41껿铲\ue709", "\u0000\u0000\u0000\u0000", objArr16);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("損짼澍៛Ȟ\ue89e\ufb07攺ື嶛샆歊䳰", (char) (64166 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.graphics.Color.green(0) - 562481456, "탩礶ꗞ⧺", "\u0000\u0000\u0000\u0000", objArr17);
                                                cls6.getMethod((java.lang.String) objArr17[0], null).invoke(invoke4, null);
                                                int i = getHighSpeedVideoFpsRanges + 83;
                                                getOutputStallDuration = i % 128;
                                                if (i % 2 != 0) {
                                                    return true;
                                                }
                                                throw new java.lang.ArithmeticException();
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
                }
            } catch (java.security.GeneralSecurityException unused) {
                return false;
            }
        }
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 59, 149 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr18);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr18[0]).intern());
    }

    private static java.lang.String getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.Object obj;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(1000);
        int i = getHighSpeedVideoFpsRanges + 45;
        getOutputStallDuration = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        for (java.lang.String str : map.keySet()) {
            stringBuffer.append(str).append('=').append(map.get(str));
            if (i3 < map.size() - 1) {
                int i4 = getHighSpeedVideoFpsRanges + 45;
                getOutputStallDuration = i4 % 128;
                if (i4 % 2 == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ﶵហ", 59929 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
                    obj = objArr[0];
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ﶵហ", android.text.TextUtils.getOffsetBefore("", 0) + 59929, objArr2);
                    obj = objArr2[0];
                }
                stringBuffer.append(((java.lang.String) obj).intern());
            }
            i3++;
        }
        return stringBuffer.toString();
    }

    private static java.security.KeyPair getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0013\u0016\u0004\u0006\u0014ￏ\u0002\u0017\u0002\u000b\u0004\u0006\u0011\ufff4\u001a\u0006￬\u0005\u0006\u0005\u0010\u0004\u000f￦\uffd9\ufff4￤￬\ufff1ￏ\u0004\u0006\u0011\u0014ￏ\u001a\u0015\n", (android.os.Process.myPid() >> 22) + 38, 10 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, true, objArr);
            java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(byte[].class).newInstance(bArr);
            java.lang.String m25970 = util.h.xy.cm.ra.f1119.m25970();
            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 97) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.indexOf("", ""), "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f\u0007￢", 10 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.graphics.Color.blue(0) + 3, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 283, true, objArr3);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, m25970);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufff9\u000e\u0001\n￨�\f\ufff9\n�\u0006�\uffff�\f", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 14, 284 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr5);
            java.lang.String str = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﱣ錄␢\ud816턂侇酎휾셆绂￢쁚\ue4bfڽ\ue896쨍閞菕ܞ\ud81c䭂舑荔⒡䶳ᡰ", (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 29374), android.view.KeyEvent.normalizeMetaState(0), "たꥍ뺌畲", "\u0000\u0000\u0000\u0000", objArr6);
            java.lang.Object invoke2 = cls2.getMethod(str, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(invoke, newInstance);
            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 105) % 128;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0012\u0007\u0005\uffd0\ufffaￗￒￛ\uffe7\u0010\u0005\u0011\u0006\u0007\u0006￭\u0007\u001b\ufff5\u0012\u0007\u0005\f\u0003\u0018\u0003\uffd0\u0015\u0007\u0005\u0017\u0014\u000b\u0016\u001b\uffd0\u0015", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (android.os.Process.myTid() >> 22) + 22, 274 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr7);
            java.lang.Object[] objArr8 = {java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(byte[].class).newInstance(bArr2)};
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﻭ곙鿏塨ꌣ둩\ue64b恱缜ᣜ릔⩏傻ᱲ鹢ឋ⸉ｆ\ue97a\uee7b蟮攮賿먶", (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), android.view.KeyEvent.normalizeMetaState(0), "蘏\ua6fa誫ᙺ", "\u0000\u0000\u0000\u0000", objArr9);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000e￩\ufffe\r\ufffa\u000b\ufffe\u0007\ufffe\u0000￼\u0002\u0005\ufffb", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 14, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 10, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, true, objArr10);
            java.lang.String str2 = (java.lang.String) objArr10[0];
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﱣ錄␢\ud816턂侇酎휾셆绂￢쁚\ue4bfڽ\ue896쨍閞菕ܞ\ud81c䭂舑荔⒡䶳ᡰ", (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29375), android.widget.ExpandableListView.getPackedPositionType(0L), "たꥍ뺌畲", "\u0000\u0000\u0000\u0000", objArr11);
            java.lang.Object[] objArr12 = {cls3.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(invoke, objArr8), invoke2};
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0012\u000f\u0006\u0011\u0016ￋ￨\u0002\u0016￭\ufffe\u0006\u000f\u0007\ufffe\u0013\ufffeￋ\u0010\u0002\u0000", android.view.KeyEvent.keyCodeFromString("") + 21, android.graphics.Color.blue(0) + 13, 279 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, objArr13);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0012�\u0006\u0015\u0001\uffe7\uffff\u0005\b\ufffe\u0011￬ￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 23, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, 280 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, objArr14);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u000f\u0000￦\u0000\u0014\u0005￼\u0011￼\uffc9\u000e\u0000\ufffe\u0010\r\u0004\u000f\u0014\uffc9￫\r\u0004\u0011￼", android.graphics.Color.rgb(0, 0, 0) + 16777240, 5 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, false, objArr15);
            return (java.security.KeyPair) cls4.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr14[0]), java.lang.Class.forName((java.lang.String) objArr15[0])).newInstance(objArr12);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private c() {
    }

    static void getHighSpeedVideoSizes() {
        getInputFormats = -1231763934;
        Camera2StreamConfigurationMap = 2457411417541981002L;
        getHighSpeedVideoSizesFor = 294925130;
        getHighResolutionOutputSizeshNQ4ISI = (char) 24114;
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputFormats = new char[]{40017, 10618, 63103, 33607, 18512, 5412, 41589, 28424, 13332, 49414, 36513, 23483, 57562, 44500, 31415, 1943, 52352, 39323, 9884, 60459, 47478, 18005, 4885, 55347, 25891, 12854, 65307, 33818, 20989, 7922, 43909, 28888, 15780, 51894, 38909, 23704, 59793, 46952, 31840, 2383, 54869, 25375, 10275, 62772, 33309, 20311, 5351, 41462, 28289, 15297, 49352, 36263, 23221, 59335, 44186, 31345, 1841, 52346, 39232, 9803, 62269, 47150, 17739, 40018, 10567, 63068, 33561, 18444, 5489, 41506, 28426, 13317, 49431, 36552, 23512, 57581, 44516, 31364, 40020, 10593, 63100, 33609, 18517, 5410, 41589, 28439, 13342, 49503, 36586, 23550, 57543, 44498, 31415, 1970, 52373, 39306, 9949, 60494, 47450, 17927, 4958, 55334, 25896, 12927, 65309, 33818, 20960, 7909, 43915, 19136, 65504, 8430, 21889, 40668, 50111, 29951, 47501, 58010, 6017, 22630, 36145, 13904, 31573, 44064, 53548, 6663, 20225, 61527, 15087, 28668, 37081, 50591, 3755, 46014, 58613, 10633, 21124, 34671, 51313, 32015, 42582, 60217, 7269, 16690, 35340, 16131, 25081, 43750, 57223, 40017, 10618, 63103, 33607, 18512, 5412, 41589, 28424, 13332, 49414, 36525, 23540, 57563, 44439, 31398, 1974, 52371, 39323, 9876, 60525, 47472, 17988, 4948, 55351, 25908, 12927, 65289, 33818, 20989, 7926, 43909, 28864, 15785, 51872, 38824, 23687, 59805, 46887, 31867, 2380, 54853, 25375, 10287, 62782, 33353, 20249, 5360, 41471, 28365, 15247, 49362, 36281, 23289, 59266, 44184, 31347, 1893, 52326, 39171, 40025, 10529, 63016, 33563, 18432};
        getOutputMinFrameDuration = 7051850153385339151L;
        getInputSizeshNQ4ISI = -1098295392714764798L;
    }
}
