package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class c implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector {
    private static boolean Camera2StreamConfigurationMap = false;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char[] getHighSpeedVideoSizes = null;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static char[] getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static int getOutputMinFrameDuration;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.lang.String f918;
    private final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] getOutputSizes;
    private final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener getOutputSizeshNQ4ISI;
    private final java.lang.String getOutputStallDuration;

    static /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] Camera2StreamConfigurationMap(util.h.xy.bb.c cVar) {
        int i = getInputSizeshNQ4ISI;
        getOutputFormats = (i + 49) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] iDVMethodArr = cVar.getOutputSizes;
        getOutputFormats = (i + 31) % 128;
        return iDVMethodArr;
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c cVar) {
        int i = getOutputFormats + 113;
        getInputSizeshNQ4ISI = i % 128;
        java.lang.String str = cVar.getOutputStallDuration;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.lang.Runnable runnable) {
        int i = getInputSizeshNQ4ISI + 31;
        getOutputFormats = i % 128;
        Camera2StreamConfigurationMap(runnable);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c cVar, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        getOutputFormats = (getInputSizeshNQ4ISI + 39) % 128;
        util.h.xy.bh.ra.m25484().m25487(cVar.new AnonymousClass1(mobileGatewayError));
        int i = (getInputSizeshNQ4ISI + 83) % 128;
        getOutputFormats = i;
        getInputSizeshNQ4ISI = (i + 125) % 128;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c cVar, util.h.xy.az.ra raVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        int i = getInputSizeshNQ4ISI + 57;
        getOutputFormats = i % 128;
        try {
            java.lang.String str = new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8);
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData m25128 = util.h.xy.au.g.m25127().m25128(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u008d\u008e\u008b\u008e\u0096", objArr);
            jSONObject2.put(((java.lang.String) objArr[0]).intern(), com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED.toString());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (46 - android.view.View.resolveSizeAndState(0, 0, 0)), "\u0007\u0006\t\u0000\u0007\u0006\t\n\u0015\u000b\b\u0007", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, objArr2);
            jSONObject2.put(((java.lang.String) objArr2[0]).intern(), str);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0096\u008c\u0094\u008b\u008e\u008d\u0085\u0095\u0091\u008b\u0098", objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), jSONObject2);
            util.h.xy.au.mc.m25164(cVar.getOutputStallDuration, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.APP2APP_SELECTED, jSONObject.toString().getBytes());
            final util.h.xy.bb.e eVar = new util.h.xy.bb.e();
            eVar.m25305(cVar.getOutputStallDuration);
            eVar.m25307(m25128);
            m25128.getPayLoad();
            m25128.getScheme();
            m25128.getSource();
            Camera2StreamConfigurationMap(new java.lang.Runnable() { // from class: util.h.xy.bb.c.5
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoFpsRanges = 0;
                private static int getHighSpeedVideoSizes = 1;
                private static char getHighSpeedVideoSizesFor = 12315;
                private static long getInputSizeshNQ4ISI = 2457411417541981002L;
                private static int getOutputFormats = 0;
                private static int getOutputMinFrameDuration = 294925130;

                private static void getHighSpeedVideoSizes(java.lang.String str2, char c, int i2, java.lang.String str3, java.lang.String str4, java.lang.Object[] objArr4) {
                    int i3 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRanges = (i3 + 7) % 128;
                    int i4 = i3 + 31;
                    getHighSpeedVideoFpsRanges = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    char[] charArray = str4.toCharArray();
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 1) % 128;
                    char[] charArray2 = str3.toCharArray();
                    char[] charArray3 = str2.toCharArray();
                    util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                    int length = charArray2.length;
                    char[] cArr = new char[length];
                    int length2 = charArray.length;
                    char[] cArr2 = new char[length2];
                    java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
                    java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
                    cArr[0] = (char) (cArr[0] ^ c);
                    cArr2[2] = (char) (cArr2[2] + ((char) i2));
                    int length3 = charArray3.length;
                    char[] cArr3 = new char[length3];
                    rcVar.f2652 = 0;
                    while (rcVar.f2652 < length3) {
                        int i5 = (rcVar.f2652 + 2) % 4;
                        int i6 = (rcVar.f2652 + 3) % 4;
                        rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i5]) % 65535);
                        cArr2[i6] = (char) (((cArr[i6] * 32718) + cArr2[i5]) / 65535);
                        cArr[i6] = rcVar.f2653;
                        cArr3[rcVar.f2652] = (char) ((((cArr[i6] ^ charArray3[rcVar.f2652]) ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 2457411417541981002L)));
                        rcVar.f2652++;
                    }
                    java.lang.String str5 = new java.lang.String(cArr3);
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 17) % 128;
                    objArr4[0] = str5;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getOutputFormats = (Camera2StreamConfigurationMap + 125) % 128;
                    java.lang.String str2 = util.h.xy.bb.c.f918;
                    eVar.getState();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("닅指맂죳", (char) (22392 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionGroup(0L), "\uecb5庵瞧恗", "\u0000\u0000\u0000\u0000", objArr4);
                    java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("儮喞瓠갩龼\uf6a3켯漖傋䳯ធ롱䊂黦", (char) ((-16730705) - android.graphics.Color.rgb(0, 0, 0)), android.view.View.MeasureSpec.getMode(0), "势⭙꾾炵", "\u0000\u0000\u0000\u0000", objArr5);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                    util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onActivationRequired(eVar);
                    int i2 = getOutputFormats + 7;
                    Camera2StreamConfigurationMap = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                }
            });
            int i2 = getInputSizeshNQ4ISI + 15;
            getOutputFormats = i2 % 128;
            int i3 = i2 % 2;
        } catch (org.json.JSONException e) {
            e.getMessage();
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.APP_TO_APP_DATA_ERROR;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 72), "\u0017\u0012\u0014\u0015\u0002\u0017\u0000\u0007\u0006\u0000\u0016\u0004㘲㘲\u0015\u0011\u0007\b㙃", 19 - android.view.View.MeasureSpec.getSize(0), objArr4);
            util.h.xy.bh.ra.m25484().m25487(cVar.new AnonymousClass1(new util.h.xy.au.mb(mGErrorCode, ((java.lang.String) objArr4[0]).intern())));
            getOutputFormats = (getInputSizeshNQ4ISI + 83) % 128;
        }
        getInputSizeshNQ4ISI = (getOutputFormats + 63) % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener getHighSpeedVideoFpsRanges(util.h.xy.bb.c cVar) {
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 121;
        getOutputFormats = i2 % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener = cVar.getOutputSizeshNQ4ISI;
        if (i2 % 2 == 0) {
            throw null;
        }
        getOutputFormats = (i + 33) % 128;
        return mGDigitizationListener;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(util.h.xy.bb.c cVar) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        int i = getOutputFormats + 121;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return cVar.getHighSpeedVideoFpsRangesFor();
        }
        cVar.getHighSpeedVideoFpsRangesFor();
        throw null;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) throws util.h.xy.az.ma, org.json.JSONException {
        int i = getOutputFormats + 37;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRanges(str, str2, str3, str4, str5, str6);
        }
        getHighSpeedVideoFpsRanges(str, str2, str3, str4, str5, str6);
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.bb.c cVar, util.h.xy.au.rg rgVar) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        byte[] bArr;
        int i = getInputSizeshNQ4ISI + 75;
        int i2 = i % 128;
        getOutputFormats = i2;
        int i3 = i2 + 35;
        getInputSizeshNQ4ISI = i3 % 128;
        byte[] bArr2 = null;
        try {
            if (i3 % 2 == 0) {
                byte[] m25226 = rgVar.m25226();
                try {
                    bArr2 = util.h.xy.au.g.m25127().m25162(m25226, cVar.getOutputStallDuration);
                    rgVar.m25224(bArr2);
                    if (m25226 != null) {
                        getInputSizeshNQ4ISI = (getOutputFormats + 91) % 128;
                        java.util.Arrays.fill(m25226, (byte) 0);
                    }
                    if (bArr2 != null) {
                        int i4 = getOutputFormats + 81;
                        getInputSizeshNQ4ISI = i4 % 128;
                        int i5 = i4 % 2;
                        java.util.Arrays.fill(bArr2, (byte) 0);
                    }
                    if (i % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr = bArr2;
                    bArr2 = m25226;
                }
            } else {
                byte[] m252262 = rgVar.m25226();
                try {
                    byte[] m25162 = util.h.xy.au.g.m25127().m25162(m252262, cVar.getOutputStallDuration);
                    try {
                        rgVar.m25224(m25162);
                        throw null;
                    } catch (java.lang.Throwable th2) {
                        bArr2 = m252262;
                        bArr = m25162;
                        th = th2;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr = null;
                    bArr2 = m252262;
                }
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = bArr2;
        }
        if (bArr2 != null) {
            java.util.Arrays.fill(bArr2, (byte) 0);
        }
        if (bArr != null) {
            java.util.Arrays.fill(bArr, (byte) 0);
        }
        throw th;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        f918 = "c";
        int i = getInputSizeshNQ4ISI + 87;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public c(byte[] bArr, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) throws org.json.JSONException {
        this.getOutputSizes = util.h.xy.au.g.m25127().m25163(bArr);
        this.getOutputStallDuration = str;
        this.getOutputSizeshNQ4ISI = mGDigitizationListener;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector
    public final void select(final java.lang.String str) {
        getInputSizeshNQ4ISI = (getOutputFormats + 21) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 128, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getCapsMode("", 0, 0) + 127, "\u0084\u0088\u0084\u0087\u0086\u0085\u0083\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        int i = getInputSizeshNQ4ISI + 5;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            android.text.TextUtils.isEmpty(str);
            throw null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u009d\u008e\u0090\u009c\u008d\u0099\u008d\u009b\u0099\u008e\u0092\u009a\u009a\u008b\u0098\u0099\u0095\u0094\u0099\u0093\u0095\u0094", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bb.c.4
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoSizes = 1;
            private static long getInputSizeshNQ4ISI = 4510726714345857579L;
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoSizes(java.lang.String str2, int i2, java.lang.Object[] objArr4) {
                int i3;
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 61) % 128;
                char[] charArray = str2.toCharArray();
                util.h.xz.b.d dVar = new util.h.xz.b.d();
                dVar.f2628 = i2;
                int length = charArray.length;
                long[] jArr = new long[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    int i4 = Camera2StreamConfigurationMap + 65;
                    getHighSpeedVideoSizes = i4 % 128;
                    if (i4 % 2 == 0) {
                        jArr[dVar.f2629] = (charArray[dVar.f2629] - (dVar.f2629 & dVar.f2628)) * (getInputSizeshNQ4ISI / (-7508379876853140581L));
                        i3 = dVar.f2629 % 1;
                    } else {
                        jArr[dVar.f2629] = ((-7508379876853140581L) ^ getInputSizeshNQ4ISI) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                        i3 = dVar.f2629 + 1;
                    }
                    dVar.f2629 = i3;
                }
                char[] cArr = new char[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 9) % 128;
                    cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                    dVar.f2629++;
                }
                objArr4[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Throwable th;
                byte[] bArr;
                java.lang.Exception exc;
                util.h.xy.az.ma maVar;
                org.json.JSONException jSONException;
                byte[] bArr2;
                byte[] bArr3;
                util.h.xy.au.rg m25213;
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod iDVMethod;
                boolean z;
                try {
                    try {
                        m25213 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
                        bArr = ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25206();
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    try {
                        bArr2 = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes();
                        try {
                            byte[] m25469 = util.h.xy.bh.mb.m25469();
                            try {
                                try {
                                    util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(util.h.xy.bb.c.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.c.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.c.this), str, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(m25469, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this)));
                                    java.lang.String str2 = util.h.xy.bb.c.f918;
                                    new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                                    java.lang.String str3 = util.h.xy.bb.c.f918;
                                    new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                                    java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25276);
                                    if (util.h.xy.az.ra.m25277(m25142)) {
                                        byte[] m25216 = m25213.m25216(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this));
                                        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25216, java.nio.charset.StandardCharsets.UTF_8));
                                        java.lang.String str4 = util.h.xy.bb.c.f918;
                                        new java.lang.String(m25216, java.nio.charset.StandardCharsets.UTF_8);
                                        int i2 = 0;
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes("ᇓ壒菄쫝㗸糚Ꟗ\ueec4姁胇쯝", android.view.Gravity.getAbsoluteGravity(0, 0) + 18691, objArr4);
                                        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr4[0]).intern());
                                        if (jSONObject2 != null) {
                                            java.lang.String str5 = util.h.xy.bb.c.f918;
                                            java.lang.String str6 = util.h.xy.bb.c.f918;
                                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] Camera2StreamConfigurationMap2 = util.h.xy.bb.c.Camera2StreamConfigurationMap(util.h.xy.bb.c.this);
                                            int length = Camera2StreamConfigurationMap2.length;
                                            while (true) {
                                                if (i2 >= length) {
                                                    iDVMethod = null;
                                                    z = false;
                                                    break;
                                                }
                                                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod iDVMethod2 = Camera2StreamConfigurationMap2[i2];
                                                java.lang.String str7 = util.h.xy.bb.c.f918;
                                                iDVMethod2.getType();
                                                iDVMethod2.getValue();
                                                if (str.equalsIgnoreCase(iDVMethod2.getId())) {
                                                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 99) % 128;
                                                    z = iDVMethod2.isOtpRequired();
                                                    iDVMethod = iDVMethod2;
                                                    break;
                                                }
                                                i2++;
                                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 45) % 128;
                                            }
                                            if (z) {
                                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("ᇃ\ue9c1\ue1db溜\uf1c1", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63493, objArr5);
                                                jSONObject2.put(((java.lang.String) objArr5[0]).intern(), com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.OTP_NEEDED.toString());
                                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes("ᇓ壒菄쫝㗸糚Ꟗ\ueec4姁胇쯝", (-16758525) - android.graphics.Color.rgb(0, 0, 0), objArr6);
                                                jSONObject.put(((java.lang.String) objArr6[0]).intern(), jSONObject2);
                                                util.h.xy.au.mc.m25164(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.OTP_NEEDED, jSONObject.toString().getBytes());
                                                final util.h.xy.bb.e eVar = new util.h.xy.bb.e();
                                                eVar.m25305(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this));
                                                util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(new java.lang.Runnable() { // from class: util.h.xy.bb.c.4.3
                                                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                                    private static int getHighSpeedVideoFpsRangesFor = 0;
                                                    private static int getHighSpeedVideoSizesFor = 1;
                                                    private static int getInputSizeshNQ4ISI;
                                                    private static char[] Camera2StreamConfigurationMap = {41873, 41885, 41868, 41882, 41877, 41870, 41875, 41871, 41887, 41970, 41881, 41883, 41880, 41884, 41886, 41872};
                                                    private static char getOutputMinFrameDuration = 38466;

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 67) % 128;
                                                        java.lang.String str8 = util.h.xy.bb.c.f918;
                                                        eVar.getState();
                                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 65), "\u000e\u0003\b\f", 4 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                                                        java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
                                                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor((byte) (android.graphics.Color.alpha(0) + 89), "\u0000\b\u0003\u0004\u000b\u0005\b\u0004\n\u0005\u0005\t", 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr8[0]).intern());
                                                        util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onActivationRequired(eVar);
                                                        int i3 = getInputSizeshNQ4ISI + 75;
                                                        getHighSpeedVideoSizesFor = i3 % 128;
                                                        if (i3 % 2 == 0) {
                                                            throw null;
                                                        }
                                                    }

                                                    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str8, int i3, java.lang.Object[] objArr7) {
                                                        int i4;
                                                        int i5 = getHighSpeedVideoFpsRangesFor + 103;
                                                        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                                                        if (i5 % 2 == 0) {
                                                            throw null;
                                                        }
                                                        char[] charArray = str8.toCharArray();
                                                        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
                                                        char[] cArr = Camera2StreamConfigurationMap;
                                                        if (cArr != null) {
                                                            int length2 = cArr.length;
                                                            char[] cArr2 = new char[length2];
                                                            for (int i6 = 0; i6 < length2; i6++) {
                                                                cArr2[i6] = (char) (cArr[i6] ^ 4042185467053315654L);
                                                            }
                                                            cArr = cArr2;
                                                        }
                                                        char c = (char) (4042185467053315654L ^ getOutputMinFrameDuration);
                                                        char[] cArr3 = new char[i3];
                                                        if (i3 % 2 != 0) {
                                                            i4 = i3 - 1;
                                                            cArr3[i4] = (char) (charArray[i4] - b);
                                                        } else {
                                                            i4 = i3;
                                                        }
                                                        if (i4 > 1) {
                                                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                                                            mcVar.f2638 = 0;
                                                            while (mcVar.f2638 < i4) {
                                                                mcVar.f2641 = charArray[mcVar.f2638];
                                                                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                                                                if (mcVar.f2641 == mcVar.f2636) {
                                                                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                                                                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                                                                } else {
                                                                    mcVar.f2639 = mcVar.f2641 / c;
                                                                    mcVar.f2640 = mcVar.f2641 % c;
                                                                    mcVar.f2637 = mcVar.f2636 / c;
                                                                    mcVar.f2635 = mcVar.f2636 % c;
                                                                    if (mcVar.f2640 == mcVar.f2635) {
                                                                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                                                                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                                                                        int i7 = mcVar.f2639;
                                                                        int i8 = mcVar.f2640;
                                                                        int i9 = mcVar.f2637;
                                                                        int i10 = mcVar.f2635;
                                                                        cArr3[mcVar.f2638] = cArr[(i7 * c) + i8];
                                                                        cArr3[mcVar.f2638 + 1] = cArr[(i9 * c) + i10];
                                                                    } else if (mcVar.f2639 == mcVar.f2637) {
                                                                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 35) % 128;
                                                                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                                                                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                                                                        int i11 = mcVar.f2639;
                                                                        int i12 = mcVar.f2640;
                                                                        int i13 = mcVar.f2637;
                                                                        int i14 = mcVar.f2635;
                                                                        cArr3[mcVar.f2638] = cArr[(i11 * c) + i12];
                                                                        cArr3[mcVar.f2638 + 1] = cArr[(i13 * c) + i14];
                                                                    } else {
                                                                        int i15 = mcVar.f2639;
                                                                        int i16 = mcVar.f2635;
                                                                        int i17 = mcVar.f2637;
                                                                        int i18 = mcVar.f2640;
                                                                        cArr3[mcVar.f2638] = cArr[(i15 * c) + i16];
                                                                        cArr3[mcVar.f2638 + 1] = cArr[(i17 * c) + i18];
                                                                    }
                                                                }
                                                                mcVar.f2638 += 2;
                                                            }
                                                        }
                                                        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
                                                        int i19 = 0;
                                                        while (i19 < i3) {
                                                            int i20 = getHighSpeedVideoFpsRangesFor + 113;
                                                            getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
                                                            if (i20 % 2 == 0) {
                                                                cArr3[i19] = (char) (cArr3[i19] ^ 13241);
                                                                i19 += 69;
                                                            } else {
                                                                cArr3[i19] = (char) (cArr3[i19] ^ 13722);
                                                                i19++;
                                                            }
                                                        }
                                                        objArr7[0] = new java.lang.String(cArr3);
                                                    }
                                                });
                                                java.lang.String str8 = util.h.xy.bb.c.f918;
                                                util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this);
                                            } else {
                                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 103) % 128;
                                                java.lang.String str9 = util.h.xy.bb.c.f918;
                                                if (iDVMethod != null) {
                                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes("ᆃ蛑㾥풬䵁\ue26a鬛㏁ꣽ", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38692, objArr7);
                                                    if (((java.lang.String) objArr7[0]).intern().equalsIgnoreCase(iDVMethod.getType())) {
                                                        java.lang.String str10 = util.h.xy.bb.c.f918;
                                                        try {
                                                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure m25141 = util.h.xy.au.g.m25127().m25141(new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8));
                                                            java.lang.String str11 = util.h.xy.bb.c.f918;
                                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes("ᇃ\ue9c1\ue1db溜\uf1c1", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 63493, objArr8);
                                                            jSONObject2.put(((java.lang.String) objArr8[0]).intern(), com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED.toString());
                                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes("ᇓ壒菄쫝㗸糚Ꟗ\ueec4姁胇쯝", android.view.KeyEvent.getDeadChar(0, 0) + 18691, objArr9);
                                                            jSONObject.put(((java.lang.String) objArr9[0]).intern(), jSONObject2);
                                                            util.h.xy.au.mc.m25164(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.WEB3DS_NEEDED, jSONObject.toString().getBytes());
                                                            final util.h.xy.bb.e eVar2 = new util.h.xy.bb.e();
                                                            eVar2.m25305(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this));
                                                            eVar2.m25308(m25141);
                                                            util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.c.4.2
                                                                private static int Camera2StreamConfigurationMap = 1;
                                                                private static int getHighSpeedVideoFpsRanges = 1;
                                                                private static int getHighSpeedVideoFpsRangesFor = 0;
                                                                private static int getHighSpeedVideoSizesFor = 294925130;
                                                                private static long getInputFormats = 2457411417541981002L;
                                                                private static int getInputSizeshNQ4ISI = 0;
                                                                private static char getOutputFormats = 47014;

                                                                private static void Camera2StreamConfigurationMap(java.lang.String str12, char c, int i3, java.lang.String str13, java.lang.String str14, java.lang.Object[] objArr10) {
                                                                    char[] charArray = str14.toCharArray();
                                                                    int i4 = Camera2StreamConfigurationMap + 21;
                                                                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                                                                    if (i4 % 2 != 0) {
                                                                        throw null;
                                                                    }
                                                                    char[] charArray2 = str13.toCharArray();
                                                                    int i5 = getHighSpeedVideoFpsRangesFor + 7;
                                                                    Camera2StreamConfigurationMap = i5 % 128;
                                                                    if (i5 % 2 == 0) {
                                                                        throw new java.lang.ArithmeticException();
                                                                    }
                                                                    char[] charArray3 = str12.toCharArray();
                                                                    util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                                                                    int length2 = charArray2.length;
                                                                    char[] cArr = new char[length2];
                                                                    int length3 = charArray.length;
                                                                    char[] cArr2 = new char[length3];
                                                                    java.lang.System.arraycopy(charArray2, 0, cArr, 0, length2);
                                                                    java.lang.System.arraycopy(charArray, 0, cArr2, 0, length3);
                                                                    cArr[0] = (char) (cArr[0] ^ c);
                                                                    cArr2[2] = (char) (cArr2[2] + ((char) i3));
                                                                    int length4 = charArray3.length;
                                                                    char[] cArr3 = new char[length4];
                                                                    rcVar.f2652 = 0;
                                                                    while (rcVar.f2652 < length4) {
                                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                                                                        int i6 = (rcVar.f2652 + 2) % 4;
                                                                        int i7 = (rcVar.f2652 + 3) % 4;
                                                                        rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i6]) % 65535);
                                                                        cArr2[i7] = (char) (((cArr[i7] * 32718) + cArr2[i6]) / 65535);
                                                                        cArr[i7] = rcVar.f2653;
                                                                        cArr3[rcVar.f2652] = (char) ((((cArr[i7] ^ charArray3[rcVar.f2652]) ^ (getInputFormats ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getOutputFormats ^ 2457411417541981002L)));
                                                                        rcVar.f2652++;
                                                                    }
                                                                    objArr10[0] = new java.lang.String(cArr3);
                                                                }

                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 119) % 128;
                                                                    java.lang.String str12 = util.h.xy.bb.c.f918;
                                                                    eVar2.getState();
                                                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                                    Camera2StreamConfigurationMap("\uf015鼉ᘯ먤", (char) (58664 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.text.TextUtils.getTrimmedLength(""), "쓱龁⥗\ue6e5", "\u0000\u0000\u0000\u0000", objArr10);
                                                                    java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
                                                                    char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                    int i3 = getHighSpeedVideoFpsRanges;
                                                                    getInputSizeshNQ4ISI = (i3 + 75) % 128;
                                                                    getInputSizeshNQ4ISI = (i3 + 55) % 128;
                                                                    try {
                                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                                        Camera2StreamConfigurationMap("躖ꒂ⼵철ᘣ卢᪥\uebab扙㢖短댂", scrollBarFadeDuration, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22, "ɡ虰锟㷫", "\u0000\u0000\u0000\u0000", objArr11);
                                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr11[0]).intern());
                                                                        util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onActivationRequired(eVar2);
                                                                    } catch (java.lang.Throwable th3) {
                                                                        java.lang.Throwable cause = th3.getCause();
                                                                        if (cause == null) {
                                                                            throw th3;
                                                                        }
                                                                        throw cause;
                                                                    }
                                                                }
                                                            });
                                                            java.lang.String str12 = util.h.xy.bb.c.f918;
                                                            java.lang.String str13 = util.h.xy.bb.c.f918;
                                                            m25141.getAcsMethod();
                                                            m25141.getAcsUrl();
                                                            m25141.getAcsQuery();
                                                        } catch (org.json.JSONException e) {
                                                            java.lang.String str14 = util.h.xy.bb.c.f918;
                                                            e.getMessage();
                                                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.WEB_3DS_DATA_ERROR;
                                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                            getHighSpeedVideoSizes("ᇧ\uef37\uec35\ued01\uea03\ueb59\ue83d\ue947\ue64b\ue748\ue441\ue542\ue2be\ue3a4\ue0f6\ue18fﺁﾁﳫ", 65268 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr10);
                                                            util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this, new util.h.xy.au.mb(mGErrorCode, ((java.lang.String) objArr10[0]).intern()));
                                                        }
                                                    }
                                                }
                                                if (iDVMethod != null) {
                                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes("ᇑ⇍燚臈퇰\ue19eㆡ䆊醨ꆵ", 12301 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr11);
                                                    if (((java.lang.String) objArr11[0]).intern().equalsIgnoreCase(iDVMethod.getType())) {
                                                        util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this, m25276, jSONObject, jSONObject2);
                                                    }
                                                }
                                                util.h.xy.au.mc.m25164(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.ACTIVE, util.h.xy.au.g.m25127().m25149(jSONObject2));
                                                util.h.xy.bb.c.getHighSpeedVideoFpsRangesFor(util.h.xy.bb.c.this, m25213);
                                                m25213.m25221();
                                                java.lang.String str15 = util.h.xy.bb.c.f918;
                                                util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this);
                                                util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.bb.c.4.4
                                                    private static int Camera2StreamConfigurationMap = 0;
                                                    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                                    private static short[] getHighSpeedVideoFpsRangesFor = null;
                                                    private static int getHighSpeedVideoSizes = 1;
                                                    private static byte[] getHighSpeedVideoSizesFor = {34, 33, -36, 44, -7, 57, -36, 46, -3, 3, -34, -36, -35, -40, -40};
                                                    private static int getInputFormats = -408873061;
                                                    private static int getInputSizeshNQ4ISI = -476071290;
                                                    private static int getOutputFormats = 1635943642;
                                                    private static int getOutputMinFrameDuration;

                                                    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
                                                    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    private static void getHighResolutionOutputSizeshNQ4ISI(int i3, short s, byte b, int i4, int i5, java.lang.Object[] objArr12) {
                                                        int i6;
                                                        boolean z2;
                                                        util.h.xz.b.me meVar = new util.h.xz.b.me();
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        int i7 = i4 + ((int) (getInputFormats ^ (-2689713159175858216L)));
                                                        if (i7 == -1) {
                                                            int i8 = Camera2StreamConfigurationMap + 111;
                                                            getHighSpeedVideoSizes = i8 % 128;
                                                            if (i8 % 2 != 0) {
                                                                i6 = 1;
                                                                if (i6 != 0) {
                                                                    byte[] bArr4 = getHighSpeedVideoSizesFor;
                                                                    if (bArr4 != null) {
                                                                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 115) % 128;
                                                                        int length2 = bArr4.length;
                                                                        byte[] bArr5 = new byte[length2];
                                                                        for (int i9 = 0; i9 < length2; i9++) {
                                                                            bArr5[i9] = (byte) (bArr4[i9] ^ (-2689713159175858216L));
                                                                        }
                                                                        bArr4 = bArr5;
                                                                    }
                                                                    i7 = bArr4 != null ? (byte) (((byte) (getHighSpeedVideoSizesFor[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i3] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoFpsRangesFor[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i3] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
                                                                }
                                                                if (i7 > 0) {
                                                                    meVar.f2647 = ((i3 + i7) - 2) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i6;
                                                                    meVar.f2644 = (char) (i5 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
                                                                    sb.append(meVar.f2644);
                                                                    meVar.f2646 = meVar.f2644;
                                                                    byte[] bArr6 = getHighSpeedVideoSizesFor;
                                                                    if (bArr6 != null) {
                                                                        int length3 = bArr6.length;
                                                                        byte[] bArr7 = new byte[length3];
                                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 85) % 128;
                                                                        for (int i10 = 0; i10 < length3; i10++) {
                                                                            bArr7[i10] = (byte) (bArr6[i10] ^ (-2689713159175858216L));
                                                                        }
                                                                        bArr6 = bArr7;
                                                                    }
                                                                    if (bArr6 != null) {
                                                                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 49) % 128;
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    meVar.f2645 = 1;
                                                                    while (meVar.f2645 < i7) {
                                                                        if (z2) {
                                                                            byte[] bArr8 = getHighSpeedVideoSizesFor;
                                                                            meVar.f2647 = meVar.f2647 - 1;
                                                                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr8[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                                                                        } else {
                                                                            short[] sArr = getHighSpeedVideoFpsRangesFor;
                                                                            meVar.f2647 = meVar.f2647 - 1;
                                                                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                                                                        }
                                                                        sb.append(meVar.f2644);
                                                                        meVar.f2646 = meVar.f2644;
                                                                        meVar.f2645++;
                                                                    }
                                                                }
                                                                objArr12[0] = sb.toString();
                                                            }
                                                        }
                                                        i6 = 0;
                                                        if (i6 != 0) {
                                                        }
                                                        if (i7 > 0) {
                                                        }
                                                        objArr12[0] = sb.toString();
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 93) % 128;
                                                        java.lang.String str16 = util.h.xy.bb.c.f918;
                                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI((-71216479) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) android.view.View.MeasureSpec.getSize(0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 63, android.graphics.Color.red(0) + 2044489034, objArr12);
                                                        java.lang.String intern2 = ((java.lang.String) objArr12[0]).intern();
                                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI((android.view.KeyEvent.getMaxKeyCode() >> 16) - 71216475, (short) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 55, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2044489025, objArr13);
                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr13[0]).intern());
                                                        util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onComplete(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this));
                                                        int i3 = getHighResolutionOutputSizeshNQ4ISI + 23;
                                                        getOutputMinFrameDuration = i3 % 128;
                                                        if (i3 % 2 != 0) {
                                                            throw null;
                                                        }
                                                    }
                                                });
                                            }
                                        } else {
                                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR;
                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("ᇽ昞﹂癘칐䙶\udee6嚟꺝⛯뻎㛚輲܂齍\u1776潒\ue7ad羓\uf798俰쟄忀퐾Ⱌꐘ㱵둍ಆ蒦Ბ铩\uecb0擐ﴱ畋촁䕱\udd4a", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30696, objArr12);
                                            util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this, new util.h.xy.au.mb(mGErrorCode2, ((java.lang.String) objArr12[0]).intern()));
                                        }
                                    } else {
                                        util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this, new util.h.xy.au.mb(m25142, util.h.xy.au.g.m25127().m25134(m25276)));
                                    }
                                    java.lang.String str16 = util.h.xy.bb.c.f918;
                                    util.h.xy.bh.mb.m25483(bArr, bArr2, m25469);
                                } catch (org.json.JSONException e2) {
                                    jSONException = e2;
                                    bArr3 = m25469;
                                    util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, jSONException.getMessage()));
                                    util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                                }
                            } catch (util.h.xy.az.ma e3) {
                                maVar = e3;
                                bArr3 = m25469;
                                util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), util.h.xy.bh.mb.m25478(maVar));
                                util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                            } catch (java.lang.Exception e4) {
                                exc = e4;
                                bArr3 = m25469;
                                util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, exc.getMessage()));
                                util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                bArr3 = m25469;
                                util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                                throw th;
                            }
                        } catch (org.json.JSONException e5) {
                            jSONException = e5;
                            bArr3 = null;
                            util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, jSONException.getMessage()));
                            util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                        } catch (util.h.xy.az.ma e6) {
                            maVar = e6;
                            bArr3 = null;
                            util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), util.h.xy.bh.mb.m25478(maVar));
                            util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                        } catch (java.lang.Exception e7) {
                            exc = e7;
                            bArr3 = null;
                            util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, exc.getMessage()));
                            util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            bArr3 = null;
                            util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                            throw th;
                        }
                    } catch (org.json.JSONException e8) {
                        jSONException = e8;
                        bArr2 = null;
                        bArr3 = null;
                        util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, jSONException.getMessage()));
                        util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                    } catch (util.h.xy.az.ma e9) {
                        maVar = e9;
                        bArr2 = null;
                        bArr3 = null;
                        util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), util.h.xy.bh.mb.m25478(maVar));
                        util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                    } catch (java.lang.Exception e10) {
                        exc = e10;
                        bArr2 = null;
                        bArr3 = null;
                        util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, exc.getMessage()));
                        util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        bArr2 = null;
                        bArr3 = null;
                        util.h.xy.bh.mb.m25483(bArr, bArr2, bArr3);
                        throw th;
                    }
                } catch (org.json.JSONException e11) {
                    jSONException = e11;
                    bArr = null;
                } catch (util.h.xy.az.ma e12) {
                    maVar = e12;
                    bArr = null;
                } catch (java.lang.Exception e13) {
                    exc = e13;
                    bArr = null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bArr = null;
                }
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 35) % 128;
            }
        }).start();
        int i2 = getOutputFormats + 67;
        int i3 = i2 % 128;
        getInputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getOutputFormats = (i3 + 103) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] getIdvMethodList() {
        java.lang.String intern;
        int i;
        int i2 = getOutputFormats + 59;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11469 - (android.os.SystemClock.uptimeMillis() > 1L ? 1 : (android.os.SystemClock.uptimeMillis() == 1L ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            i = 114;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            i = 127;
        }
        getInputSizeshNQ4ISI = (getOutputFormats + 29) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(i - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "\u0081\u0087\u0083\u0089\u0088\u0084\u0087\u0086\u0085\u0083\u0085", objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] iDVMethodArr = this.getOutputSizes;
            return (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[]) java.util.Arrays.copyOf(iDVMethodArr, iDVMethodArr.length);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static util.h.xy.az.b getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((byte) (50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), "\u000b\u0005㘨㘨\u0011\u0005\u0007\u0006㘥", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0096\u0091\u008d\u0095\u0094\u0093\u0092\u0091\u0090\u008f\u008e\u008d\u008c\u008c\u008b\u008a", objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str4);
        sb.append(util.h.xy.al.ra.f320);
        getInputSizeshNQ4ISI = (getOutputFormats + 113) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (30 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), "\u000b\u0005㘔㘔\u0011\u0005㘇", 7 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str5);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0096\u0095\u0091\u008b\u0098\u008f\u008c\u008b\u008e\u0094\u0097\u0094\u0095", objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str6);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((byte) (41 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0005\u0014\n\u0011\u0005\b\u0001\u0015\u0012\t\u0011\u0005\u000e\u0015㘧", 15 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
            bVar.m25258(util.h.xy.au.g.m25127().m25137(str, str2));
            return bVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private java.lang.String getHighSpeedVideoFpsRangesFor() throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        getInputSizeshNQ4ISI = (getOutputFormats + 61) % 128;
        byte[] bArr = null;
        try {
            bArr = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25216(this.getOutputStallDuration);
            java.lang.String m25129 = util.h.xy.au.g.m25127().m25129(bArr);
            if (bArr != null) {
                int i = getInputSizeshNQ4ISI + 7;
                getOutputFormats = i % 128;
                java.util.Arrays.fill(bArr, i % 2 == 0 ? (byte) 1 : (byte) 0);
            }
            return m25129;
        } catch (java.lang.Throwable th) {
            if (bArr != null) {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
            throw th;
        }
    }

    /* renamed from: util.h.xy.bb.c$1, reason: invalid class name */
    final class AnonymousClass1 implements java.lang.Runnable {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoSizes = 1;
        private static int getOutputFormats = 1;
        private static char[] getOutputMinFrameDuration = {42363, 42259, 42257, 42267, 42361, 42262, 42336, 42339, 42263, 42265, 42267, 42262, 42253, 42269, 42269};
        final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError getHighSpeedVideoFpsRangesFor;

        private static void getHighSpeedVideoSizes(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
            byte[] bytes = str.getBytes("ISO-8859-1");
            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = getOutputMinFrameDuration;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = Camera2StreamConfigurationMap + 117;
                    getHighSpeedVideoSizes = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr2[i5] = (char) (cArr[i5] + 8125198844289309347L);
                        throw new java.lang.ArithmeticException();
                    }
                    cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i2];
            java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
            if (bytes != null) {
                char[] cArr4 = new char[i2];
                maVar.f2631 = 0;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 91) % 128;
                char c = 0;
                while (maVar.f2631 < i2) {
                    if (bytes[maVar.f2631] == 1) {
                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    } else {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    }
                    c = cArr4[maVar.f2631];
                    maVar.f2631++;
                }
                cArr3 = cArr4;
            }
            if (i4 > 0) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 77) % 128;
                char[] cArr5 = new char[i2];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
                int i7 = i2 - i4;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i4);
                java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i7);
            }
            if (i3 > 0) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i2) {
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 27) % 128;
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                    maVar.f2631++;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        AnonymousClass1(com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
            this.getHighSpeedVideoFpsRangesFor = mobileGatewayError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.String intern;
            java.lang.Object obj;
            int i = getHighSpeedVideoFpsRanges + 117;
            getOutputFormats = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{0, 4, 0, 0}, "\u0000\u0000\u0001\u0000", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{4, 11, 0, 5}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", objArr2);
                obj = objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{0, 4, 0, 0}, "\u0000\u0000\u0001\u0000", objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{4, 11, 0, 5}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", objArr4);
                obj = objArr4[0];
            }
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
            util.h.xy.bb.c.getHighSpeedVideoFpsRanges(util.h.xy.bb.c.this).onError(util.h.xy.bb.c.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bb.c.this), this.getHighSpeedVideoFpsRangesFor);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getInputFormats;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 79) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 67) % 128;
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputMinFrameDuration);
        if (!Camera2StreamConfigurationMap) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 73) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        int i5 = getHighSpeedVideoFpsRangesFor + 41;
        getHighSpeedVideoFpsRanges = i5 % 128;
        int i6 = i5 % 2;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        int i4 = getHighSpeedVideoFpsRangesFor + 33;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr2 = getHighSpeedVideoSizes;
        if (cArr2 != null) {
            int i5 = getHighSpeedVideoFpsRangesFor + 35;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                cArr[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
                i3++;
            }
            cArr2 = cArr;
        }
        char c = (char) (4042185467053315654L ^ getHighResolutionOutputSizeshNQ4ISI);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            int i6 = getHighSpeedVideoFpsRanges + 125;
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            int i7 = i6 % 2;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 63) % 128;
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr2[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr2[(i10 * c) + i11];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2640;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr2[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr2[(i14 * c) + i15];
                    } else {
                        int i16 = mcVar.f2639;
                        int i17 = mcVar.f2635;
                        int i18 = mcVar.f2637;
                        int i19 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr2[(i16 * c) + i17];
                        cArr3[mcVar.f2638 + 1] = cArr2[(i18 * c) + i19];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = getHighSpeedVideoFpsRangesFor + 5;
            getHighSpeedVideoFpsRanges = i21 % 128;
            if (i21 % 2 == 0) {
                cArr3[i20] = (char) (cArr3[i20] ^ 29177);
                i20 += 32;
            } else {
                cArr3[i20] = (char) (cArr3[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void Camera2StreamConfigurationMap(java.lang.Runnable runnable) {
        getOutputFormats = (getInputSizeshNQ4ISI + 3) % 128;
        util.h.xy.bh.ra.m25484().m25487(runnable);
        getOutputFormats = (getInputSizeshNQ4ISI + 27) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = new char[]{64401, 64413, 64404, 64414, 64425, 64411, 64400, 64435, 64426, 64378, 64396, 64369, 64392, 64377, 64432, 64381, 64383, 64370, 64379, 64372, 64393, 64382, 64394, 64398, 64461, 64371, 64399, 64368, 64356};
        getOutputMinFrameDuration = -1074856979;
        getHighSpeedVideoSizesFor = true;
        Camera2StreamConfigurationMap = true;
        getHighSpeedVideoSizes = new char[]{41903, 41864, 41885, 41915, 41966, 41900, 41917, 41896, 41873, 41919, 41899, 41908, 41904, 41902, 41859, 41913, 41912, 41901, 41867, 41898, 41906, 41877, 41980, 41909, 41907};
        getHighResolutionOutputSizeshNQ4ISI = (char) 38467;
    }
}
