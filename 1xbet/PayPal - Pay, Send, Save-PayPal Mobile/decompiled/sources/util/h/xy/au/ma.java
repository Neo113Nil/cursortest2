package util.h.xy.au;

/* loaded from: classes5.dex */
final class ma implements com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager {
    private static boolean Camera2StreamConfigurationMap = false;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    public static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static boolean getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int[] getOutputMinFrameDuration;

    ma() {
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.ma maVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        int i = getHighSpeedVideoFpsRanges + 89;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.ma.3
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static char getInputFormats = 56045;
            private static char getInputSizeshNQ4ISI = 24096;
            private static char getOutputFormats = 50606;
            private static int getOutputMinFrameDuration = 0;
            private static int getOutputMinFrameDurationlomOqCM = 1;
            private static char getOutputSizeshNQ4ISI = 40537;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str2, int i2, java.lang.Object[] objArr) {
                char[] charArray = str2.toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 71) % 128;
                while (eVar.f2630 < charArray.length) {
                    int i3 = Camera2StreamConfigurationMap + 85;
                    getHighSpeedVideoSizesFor = i3 % 128;
                    if (i3 % 2 == 0) {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[0] = charArray[eVar.f2630];
                    } else {
                        cArr2[0] = charArray[eVar.f2630];
                        cArr2[1] = charArray[eVar.f2630 + 1];
                    }
                    int i4 = 58224;
                    int i5 = 0;
                    while (i5 < 16) {
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getInputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                        i4 -= 40503;
                        i5++;
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 1) % 128;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                }
                objArr[0] = new java.lang.String(cArr, 0, i2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (getOutputMinFrameDurationlomOqCM + 109) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("存\udd50Ḋ㟋", 4 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("韬䟻湏픠ڮ\udd2f靭ᬞ띉ߥ稯⻒", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                mGCardLifecycleEventListener.onError(str, mobileGatewayError);
                int i2 = getOutputMinFrameDurationlomOqCM + 63;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = getInputSizeshNQ4ISI;
        int i3 = i2 + 37;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = (i2 + 1) % 128;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, byte[] bArr, java.util.List list, java.lang.String str8) throws util.h.xy.az.ma, org.json.JSONException {
        int i = getHighSpeedVideoFpsRanges + 35;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoSizes(str, str2, str3, str4, str5, str6, str7, bArr, list, str8);
            throw null;
        }
        util.h.xy.az.b highSpeedVideoSizes = getHighSpeedVideoSizes(str, str2, str3, str4, str5, str6, str7, bArr, list, str8);
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
        return highSpeedVideoSizes;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRangesFor = "a";
        int i = getInputSizeshNQ4ISI + 101;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final void suspendCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 89) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0088\u0084\u0089\u0086\u0081\u0088\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.rgb(0, 0, 0) + 16777343, "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        int[] iArr = {1673931764, -1105145700, 1224237244, 1838908194};
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(iArr, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 8, objArr4);
            Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr4[0]).intern(), null, null, null, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b2, code lost:
    
        r11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00cc, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0079, code lost:
    
        r2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1673931764, -1105145700, 1224237244, 1838908194}, 7 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), r2);
        r10 = Camera2StreamConfigurationMap(r10, r11, ((java.lang.String) r2[0]).intern(), r12, null, r13, null);
        util.h.xy.au.ma.getHighSpeedVideoFpsRanges = (util.h.xy.au.ma.getInputSizeshNQ4ISI + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b1, code lost:
    
        return r10;
     */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String suspendCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list) {
        int i = getInputSizeshNQ4ISI + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(21389 << android.text.TextUtils.indexOf((java.lang.CharSequence) "", '|', 1), "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.makeMeasureSpec(1, 1) + 29, "\u0088\u0084\u0089\u0086\u0081\u0088\u0087\u0086\u0085", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0084\u0083\u0082\u0081", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0088\u0084\u0089\u0086\u0081\u0088\u0087\u0086\u0085", objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        }
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getOutputMinFrameDuration;
        if (iArr3 != null) {
            int i2 = getHighSpeedVideoSizes + 55;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputMinFrameDuration;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 33) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i5 = 0; i5 < 16; i5++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
                cVar.f2627 ^= iArr4[i5];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
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
        java.lang.String str = new java.lang.String(cArr2, 0, i);
        int i10 = getHighResolutionOutputSizeshNQ4ISI + 117;
        getHighSpeedVideoSizes = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final java.lang.String suspendCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 55) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "\u0088\u0084\u0089\u0086\u0081\u0088\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0099\u008c\u0098\u0097\u0096\u008f\u0090\u0094\u008f\u008e\u008e\u009e\u0093\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0093\u0096\u009d\u0094\u009c\u008f\u009b\u009b\u0096\u0092\u0092\u009a", objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1673931764, -1105145700, 1224237244, 1838908194}, 6 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr5);
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr5[0]).intern(), str2, null, list, str3);
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 7) % 128;
        return Camera2StreamConfigurationMap2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final void resumeCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 71) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.view.View.resolveSize(0, 0), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1080300572, -1926305865}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{205678729, -282230906, -386267912, -157617397}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, objArr4);
        Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr4[0]).intern(), null, null, null, null);
        int i = getHighSpeedVideoFpsRanges + 43;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final java.lang.String resumeCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 77) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetAfter("", 0) + 127, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1080300572, -1926305865}, 8 - android.graphics.Color.red(0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{205678729, -282230906, -386267912, -157617397}, 6 - android.text.TextUtils.indexOf("", "", 0, 0), objArr3);
            java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr3[0]).intern(), str2, null, list, null);
            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 109) % 128;
            return Camera2StreamConfigurationMap2;
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(126 - android.view.MotionEvent.axisFromString(""), "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr4);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 69) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getHighSpeedVideoSizesFor;
        if (cArr2 != null) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 107;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
                cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                i2++;
            }
            cArr2 = cArr;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getOutputFormats);
        if (!Camera2StreamConfigurationMap) {
            if (!getInputFormats) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 9) % 128;
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final java.lang.String resumeCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 51) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1080300572, -1926305865}, 8 - android.text.TextUtils.indexOf("", ""), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0099\u008c\u0098\u0097\u0096\u008f\u0090\u0094\u008f\u008e\u008e\u009e\u0093\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0093\u0096\u009d\u0094\u009c\u008f\u009b\u009b\u0096\u0092\u0092\u009a", objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{205678729, -282230906, -386267912, -157617397}, android.view.KeyEvent.getDeadChar(0, 0) + 6, objArr5);
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr5[0]).intern(), str2, null, list, str3);
        int i = getInputSizeshNQ4ISI + 47;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final void deleteCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 65) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.view.KeyEvent.keyCodeFromString(""), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0088\u0085\u0089\u0086\u0081\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.view.MotionEvent.axisFromString(""), "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0096\u008c\u0096\u008e\u0096\u0091", objArr4);
        Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr4[0]).intern(), null, null, null, null);
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 41) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00a5, code lost:
    
        r12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00c3, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r12[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.getTrimmedLength(""), "\u0096\u008c\u0096\u008e\u0096\u0091", r1);
        r10 = Camera2StreamConfigurationMap(r10, r11, ((java.lang.String) r1[0]).intern(), r12, null, r13, null);
        util.h.xy.au.ma.getInputSizeshNQ4ISI = (util.h.xy.au.ma.getHighSpeedVideoFpsRanges + 5) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a4, code lost:
    
        return r10;
     */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String deleteCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list) {
        int i = getHighSpeedVideoFpsRanges + 77;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(58 >>> (android.util.TypedValue.complexToFloat(0) > 1.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 1.0f ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(5 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0088\u0085\u0089\u0086\u0081\u0087\u0086\u0085", objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u0084\u0083\u0082\u0081", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0088\u0085\u0089\u0086\u0081\u0087\u0086\u0085", objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    public final java.lang.String deleteCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 73) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0088\u0085\u0089\u0086\u0081\u0087\u0086\u0085", objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", ""), "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{1148887147, -813308139, -1683449349, 1901669267, 1692453004, -41535123, 942640330, -757456391, -1587555821, -2062149872, -1848101882, 1002660035, 191365357, 1344377605}, 28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0096\u008c\u0096\u008e\u0096\u0091", objArr5);
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, mGCardLifecycleEventListener, ((java.lang.String) objArr5[0]).intern(), str2, null, list, str3);
        int i = getInputSizeshNQ4ISI + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b6, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bc, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0051, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00bd, code lost:
    
        r11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.graphics.Color.red(0) + 127, "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00d7, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r11[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0089, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 128, "\u0096\u008c\u008d\u0091\u0098\u009e", r1);
        r10 = Camera2StreamConfigurationMap(r10, r11, ((java.lang.String) r1[0]).intern(), r12, r13, r14, null);
        r11 = util.h.xy.au.ma.getHighSpeedVideoFpsRanges + 73;
        util.h.xy.au.ma.getInputSizeshNQ4ISI = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b4, code lost:
    
        if ((r11 % 2) != 0) goto L12;
     */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String updateCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, byte[] bArr, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list) {
        int i = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(125 - android.view.View.resolveSizeAndState(1, 0, 1), "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1173010994, -1460180197}, 108 << (android.view.ViewConfiguration.getKeyRepeatTimeout() - 87), objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0084\u0083\u0082\u0081", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1173010994, -1460180197}, 8 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0092, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0096\u008c\u008d\u0091\u0098\u009e", r1);
        r0 = Camera2StreamConfigurationMap(r11, r12, ((java.lang.String) r1[0]).intern(), r13, r14, r15, r16);
        r1 = util.h.xy.au.ma.getHighSpeedVideoFpsRanges + 3;
        util.h.xy.au.ma.getInputSizeshNQ4ISI = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bf, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        r3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1148887147, -813308139, -1683449349, 1901669267, 1692453004, -41535123, 942640330, -757456391, -1587555821, -2062149872, -1848101882, 1002660035, 191365357, 1344377605}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 28, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r3[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0054, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00e8, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0099\u008c\u0098\u0097\u0096\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0085\u0083\u008f\u0091\u0090\u008d\u0088\u008f\u008e\u008d\u008c\u008a\u008b\u008a\u0085", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0104, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        if (android.text.TextUtils.isEmpty(r16) != false) goto L16;
     */
    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String updateCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, byte[] bArr, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3) {
        int i = getInputSizeshNQ4ISI + 67;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(12916 % android.text.TextUtils.lastIndexOf("", io.ktor.util.date.GMTDateParser.MONTH, 0), "\u0084\u0083\u0082\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1173010994, -1460180197}, android.text.AndroidCharacter.getMirror('E') + 21, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0084\u0083\u0082\u0081", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1964113542, -549971522, 1173010994, -1460180197}, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '(', objArr4);
            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        }
    }

    private java.lang.String Camera2StreamConfigurationMap(final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, final java.lang.String str2, final java.lang.String str3, final byte[] bArr, final java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, final java.lang.String str4) {
        if (android.text.TextUtils.isEmpty(str2)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1688042824, 1870849351, 1150495330, -1125743607, 222034692, -1333124803, 307907169, 1160769286, 864278861, -354054019, 17236544, 749989451}, android.graphics.ImageFormat.getBitsPerPixel(0) + 23, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (mGCardLifecycleEventListener == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getOffsetBefore("", 0) + 127, "\u008e\u008e\u009e\u0093\u008f\u0096\u0095\u008f\u008c\u0094\u0093\u0093\u008d\u0092\u008f\u0090\u0096\u0093\u0096\u008c\u009b\u008a\u0081\u008c\u0093\u0096¡ \u0096\u008e\u0092\u0099\u0092\u0096\u009f\u008a\u0081\u0091\u0090\u008d\u0088\u0087\u0086", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        byte[] m25476 = util.h.xy.bh.mb.m25476();
        final java.lang.String str5 = new java.lang.String(m25476, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.ma.2
            private static int getInputSizeshNQ4ISI = 0;
            private static int getOutputSizeshNQ4ISI = 1;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        java.lang.String str6 = new java.lang.String(((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25206(), java.nio.charset.StandardCharsets.UTF_8);
                        java.lang.String m25474 = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485());
                        util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor(str5, str2, str6, new java.lang.String(util.h.xy.bh.mb.m25469(), java.nio.charset.StandardCharsets.UTF_8), m25474, str, str3, bArr, list, str4));
                        java.lang.String str7 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                        new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                        util.h.xy.au.g m25127 = util.h.xy.au.g.m25127();
                        java.lang.String m25142 = m25127.m25142(m25276);
                        if (m25142 != null) {
                            int i = getInputSizeshNQ4ISI;
                            getOutputSizeshNQ4ISI = ((i ^ 99) + ((i & 99) << 1)) % 128;
                            if (util.h.xy.az.ra.m25277(m25142)) {
                                util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.ma.2.2
                                    private static int Camera2StreamConfigurationMap = 1;
                                    private static int getHighResolutionOutputSizeshNQ4ISI = -1231763804;
                                    private static int getHighSpeedVideoFpsRanges = 0;
                                    private static int getHighSpeedVideoSizes = 0;
                                    private static int getOutputFormats = 1;

                                    private static void getHighSpeedVideoSizes(java.lang.String str8, int i2, int i3, int i4, java.lang.Object[] objArr3) {
                                        int i5 = Camera2StreamConfigurationMap;
                                        int i6 = i5 + 89;
                                        getHighSpeedVideoFpsRanges = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            throw null;
                                        }
                                        getHighSpeedVideoFpsRanges = (i5 + 65) % 128;
                                        char[] charArray = str8.toCharArray();
                                        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                                        char[] cArr = new char[i2];
                                        raVar.f2649 = 0;
                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 39) % 128;
                                        while (raVar.f2649 < i2) {
                                            raVar.f2650 = charArray[raVar.f2649];
                                            cArr[raVar.f2649] = (char) (raVar.f2650 + i4);
                                            int i7 = raVar.f2649;
                                            cArr[i7] = (char) (cArr[i7] - ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-4839292868003314026L))));
                                            raVar.f2649++;
                                        }
                                        if (i3 > 0) {
                                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 77) % 128;
                                            raVar.f2648 = i3;
                                            char[] cArr2 = new char[i2];
                                            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
                                            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - raVar.f2648, raVar.f2648);
                                            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i2 - raVar.f2648);
                                            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 17) % 128;
                                        }
                                        objArr3[0] = new java.lang.String(cArr);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int defaultSize = android.view.View.getDefaultSize(0, 0);
                                        float complexToFloat = android.util.TypedValue.complexToFloat(0);
                                        getOutputFormats = (getHighSpeedVideoSizes + 35) % 128;
                                        try {
                                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("\ufff9\u0002\u0006\uffff", 4 - defaultSize, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 1, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, objArr3);
                                            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("\ufffe\u0007\ufffe\b￩\b\ufffe￩\n\u000e\uffff\b", android.view.View.MeasureSpec.getMode(0) + 12, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, 120 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
                                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                                            mGCardLifecycleEventListener.onSuccess(str);
                                            getHighSpeedVideoSizes = (getOutputFormats + 125) % 128;
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                });
                                java.lang.String str8 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                java.lang.String str9 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                util.h.xy.bh.mb.m25483(null, null, null);
                            }
                        }
                        if (m25142 != null) {
                            int i2 = getInputSizeshNQ4ISI + 111;
                            getOutputSizeshNQ4ISI = i2 % 128;
                            if (i2 % 2 == 0) {
                                util.h.xy.az.ra.m25278(m25142);
                                throw new java.lang.ArithmeticException();
                            }
                            if (util.h.xy.az.ra.m25278(m25142)) {
                                java.lang.String str10 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                util.h.xy.au.mc.m25166(str);
                                java.lang.String str11 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                if (util.h.xy.au.g.m25127().m25132(util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25226(), str)) {
                                    int i3 = getInputSizeshNQ4ISI + 5;
                                    getOutputSizeshNQ4ISI = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        java.lang.String str12 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                        util.h.xy.au.g.m25127().m25162(util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25226(), str);
                                        throw null;
                                    }
                                    java.lang.String str13 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                    util.h.xy.au.g.m25127().m25162(util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25226(), str);
                                }
                                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26175 = util.h.xy.k.ma.m26925().mo26175(str);
                                if (mo26175.isSuccessful()) {
                                    int i4 = getOutputSizeshNQ4ISI;
                                    int i5 = (i4 & 115) + (i4 | 115);
                                    getInputSizeshNQ4ISI = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        mo26175.getResult();
                                        throw null;
                                    }
                                    if (mo26175.getResult() != null && mo26175.getResult().m26180() != null) {
                                        getInputSizeshNQ4ISI = (getOutputSizeshNQ4ISI + 77) % 128;
                                        util.h.xy.k.ma.m26925().mo26174(mo26175.getResult().m26180());
                                    }
                                }
                                util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.ma.2.1
                                    private static int Camera2StreamConfigurationMap = 1;
                                    private static int getHighSpeedVideoFpsRanges = 0;
                                    private static int getHighSpeedVideoFpsRangesFor = 1;
                                    private static int getHighSpeedVideoSizes = 0;
                                    private static long getHighSpeedVideoSizesFor = 2457411417541981002L;
                                    private static char getInputSizeshNQ4ISI = 11445;
                                    private static int getOutputFormats = 294925130;

                                    private static void Camera2StreamConfigurationMap(java.lang.String str14, char c, int i6, java.lang.String str15, java.lang.String str16, java.lang.Object[] objArr3) {
                                        int i7 = getHighSpeedVideoFpsRanges + 55;
                                        Camera2StreamConfigurationMap = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            throw new java.lang.ArithmeticException();
                                        }
                                        char[] charArray = str16.toCharArray();
                                        char[] charArray2 = str15.toCharArray();
                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 5) % 128;
                                        char[] cArr = charArray2;
                                        char[] charArray3 = str14.toCharArray();
                                        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                                        int length = cArr.length;
                                        char[] cArr2 = new char[length];
                                        int length2 = charArray.length;
                                        char[] cArr3 = new char[length2];
                                        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
                                        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
                                        cArr2[0] = (char) (cArr2[0] ^ c);
                                        cArr3[2] = (char) (cArr3[2] + ((char) i6));
                                        int length3 = charArray3.length;
                                        char[] cArr4 = new char[length3];
                                        rcVar.f2652 = 0;
                                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
                                        while (rcVar.f2652 < length3) {
                                            int i8 = (rcVar.f2652 + 2) % 4;
                                            int i9 = (rcVar.f2652 + 3) % 4;
                                            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i8]) % 65535);
                                            cArr3[i9] = (char) (((cArr2[i9] * 32718) + cArr3[i8]) / 65535);
                                            cArr2[i9] = rcVar.f2653;
                                            cArr4[rcVar.f2652] = (char) ((((cArr2[i9] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getInputSizeshNQ4ISI ^ 2457411417541981002L)));
                                            rcVar.f2652++;
                                        }
                                        objArr3[0] = new java.lang.String(cArr4);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 11) % 128;
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("ᶾ봗큯ß", (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 5863), android.view.View.MeasureSpec.getSize(0), "㝴\u09d3\ue773ሖ", "\u0000\u0000\u0000\u0000", objArr3);
                                        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("\ueddf涍䯗坱淡맰㢩銡\ue1d7裶鐅纺ᶼ\ue574頜绊", (char) (android.text.TextUtils.getOffsetBefore("", 0) + 42259), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "멝亭ፌ冥", "\u0000\u0000\u0000\u0000", objArr4);
                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                                        mGCardLifecycleEventListener.onSuccess(str);
                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 101) % 128;
                                    }
                                });
                                java.lang.String str92 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                                util.h.xy.bh.mb.m25483(null, null, null);
                            }
                        }
                        util.h.xy.au.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.ma.this, mGCardLifecycleEventListener, str, new util.h.xy.au.mb(m25142, m25127.m25134(m25276)));
                        int i6 = getOutputSizeshNQ4ISI;
                        getInputSizeshNQ4ISI = ((i6 & 13) + (i6 | 13)) % 128;
                        java.lang.String str922 = util.h.xy.au.ma.getHighSpeedVideoFpsRangesFor;
                        util.h.xy.bh.mb.m25483(null, null, null);
                    } catch (org.json.JSONException e) {
                        util.h.xy.au.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.ma.this, mGCardLifecycleEventListener, str, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage()));
                        util.h.xy.bh.mb.m25483(null, null, null);
                    } catch (util.h.xy.az.ma e2) {
                        util.h.xy.au.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.ma.this, mGCardLifecycleEventListener, str, util.h.xy.bh.mb.m25478(e2));
                        util.h.xy.bh.mb.m25483(null, null, null);
                    } catch (java.lang.Exception e3) {
                        util.h.xy.au.ma.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.ma.this, mGCardLifecycleEventListener, str, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e3.getMessage()));
                        util.h.xy.bh.mb.m25483(null, null, null);
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.bh.mb.m25483(null, null, null);
                    throw th;
                }
            }
        }).start();
        if (m25476 != null) {
            int i = getHighSpeedVideoFpsRanges + 83;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                int length = m25476.length;
                throw null;
            }
            if (m25476.length > 0) {
                java.lang.String str6 = new java.lang.String(m25476, java.nio.charset.StandardCharsets.UTF_8);
                int i2 = getHighSpeedVideoFpsRanges + 125;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return str6;
                }
                throw null;
            }
        }
        return null;
    }

    private static util.h.xy.az.b getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, byte[] bArr, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str8) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u008a\u0098\u008d\u008c\u0096\u008e\u008e\u008d¢", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u009b\u0090\u0096\u0091\u008a¡\u0094\u0090\u0098£\u008c\u0096\u008e\u008e\u008d¢", objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str4);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{426025847, -1333508113, 1805346884, -580549789}, android.view.View.resolveSize(0, 0) + 7, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str5);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1712955767, 1055279665, 1161610794, 24956867, 1138359737, -720355009, 1152100516, -985244406}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str6);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-559287323, -1898767808, -1348266659, -1246203714, -615883511, -352999269}, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
        org.json.JSONObject m25159 = util.h.xy.au.g.m25127().m25159(str, str2, str7, bArr, list);
        if (str8 != null) {
            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 29) % 128;
            if (!android.text.TextUtils.isEmpty(str8)) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{-332013547, -1622263308, 103372044, 1544067627, -1162351844, 1932978657, 1930954229, -1149502173}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, objArr6);
                java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u008f\u0090\u0096\u0090\u008d\u0096¤", objArr7);
                sb2.append(((java.lang.String) objArr7[0]).intern());
                sb2.append(str8.trim());
                bVar.m25264(intern, sb2.toString(), "");
                getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 51) % 128;
            }
        }
        bVar.m25258(m25159);
        return bVar;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = new char[]{64130, 64142, 64129, 64139, 64154, 64141, 64135, 64155, 64172, 64097, 64103, 64106, 64121, 64098, 64190, 64104, 64122, 64123, 64108, 64111, 64120, 64101, 64109, 64110, 64081, 64153, 64107, 64138, 64099, 64085, 64100, 64133, 64084, 64087, 64173, 64152};
        getOutputFormats = -1074857250;
        getInputFormats = true;
        Camera2StreamConfigurationMap = true;
        getOutputMinFrameDuration = new int[]{1077420427, 1418509786, -1101653433, 1343793856, -711143746, -333354987, -352329812, 2044782395, 1332651809, -304800667, -1940305188, 1265527054, -1866615752, 567333623, 405966337, -614964313, -1911142971, -2067053463};
    }
}
