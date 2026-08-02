package util.h.xy.u;

/* loaded from: classes5.dex */
public class mb {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 0;
    private static char[] getInputSizeshNQ4ISI = null;
    private static int getOutputFormats = 1;

    static {
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap = util.h.xy.u.mb.class.getName();
        int i = getOutputFormats + 77;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d4, code lost:
    
        if (r21.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        if (r22.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m27537(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) throws util.h.xy.d.g {
        int i;
        java.lang.String str6;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            i = getOutputFormats + 91;
            getHighSpeedVideoFpsRanges = i % 128;
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        try {
            if (str2 != null && !str2.isEmpty()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 14, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                java.lang.String optString = jSONObject.optString(((java.lang.String) objArr[0]).intern());
                if (optString != null && !optString.isEmpty()) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(15 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9863), objArr2);
                    str6 = util.h.xy.u.d.m27517(optString, ((java.lang.String) objArr2[0]).intern());
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 47) % 128;
                    if (str6 != null && !str6.isEmpty()) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(14 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.green(0), (char) (9862 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr3);
                        hashMap.put(((java.lang.String) objArr3[0]).intern(), str6);
                    }
                    if (str3 != null) {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 1) % 128;
                    }
                    if (str4 != null) {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 107) % 128;
                    }
                    if (str5 != null || str5.isEmpty()) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getSize(0) + 14, (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr4);
                        ((java.lang.String) objArr4[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.CONTACTLESS_DATA_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CONTACTLESS_DATA_MISSING, hashMap);
                    }
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                        m27534(str, jSONObject2, hashMap);
                        if (str3 != null && !str3.isEmpty()) {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str3);
                            m27536(str, jSONObject2, jSONObject3, hashMap);
                            m27540(str, jSONObject2, jSONObject3, hashMap);
                            m27538(str, jSONObject2, jSONObject3, hashMap);
                            m27535(str, jSONObject2, jSONObject3, hashMap);
                            m27539(str, jSONObject2, jSONObject3, hashMap);
                        }
                        if (str4 != null && !str4.isEmpty()) {
                            m27533(str, jSONObject2, new org.json.JSONObject(str4), hashMap);
                        }
                        if (str5 != null) {
                            getHighSpeedVideoFpsRanges = (getOutputFormats + 101) % 128;
                            if (str5.isEmpty()) {
                                return;
                            }
                            m27532(str, jSONObject2, new org.json.JSONObject(str5), hashMap);
                            getOutputFormats = (getHighSpeedVideoFpsRanges + 69) % 128;
                            return;
                        }
                        return;
                    } catch (org.json.JSONException e2) {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 26, 36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (36612 - android.view.View.getDefaultSize(0, 0)), objArr5);
                        ((java.lang.String) objArr5[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, e2.getMessage(), hashMap);
                    }
                }
            }
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getSize(0) + 14, (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr42);
            ((java.lang.String) objArr42[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.CONTACTLESS_DATA_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CONTACTLESS_DATA_MISSING, hashMap);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        str6 = null;
        if (str6 != null) {
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(14 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.Color.green(0), (char) (9862 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr32);
            hashMap.put(((java.lang.String) objArr32[0]).intern(), str6);
        }
        if (str3 != null) {
        }
        if (str4 != null) {
        }
        if (str5 != null) {
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 91) % 128;
            jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 9;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                int i4 = rbVar.f2651;
                throw new java.lang.ArithmeticException();
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27534(java.lang.String str, org.json.JSONObject jSONObject, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        java.lang.Object obj;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 99;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            getOutputFormats = (i + 1) % 128;
            if (!str.isEmpty()) {
                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                getHighSpeedVideoFpsRanges = (getOutputFormats + 41) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(lastIndexOf + 8, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 87, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject, ((java.lang.String) objArr[0]).intern())) {
                        int i3 = getOutputFormats + 51;
                        getHighSpeedVideoFpsRanges = i3 % 128;
                        if (i3 % 2 != 0) {
                            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(1L);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(28 % (scrollBarSize << 2), 125 % packedPositionChild, (char) (1 >> (android.os.SystemClock.elapsedRealtime() > 1L ? 1 : (android.os.SystemClock.elapsedRealtime() == 1L ? 0 : -1))), objArr2);
                            obj = objArr2[0];
                        } else {
                            int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((scrollBarSize2 >> 8) + 22, 93 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
                            obj = objArr3[0];
                        }
                        ((java.lang.String) obj).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.DC_TOKENID_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_TOKENID_MISSING, hashMap);
                    }
                    int indexOf = android.text.TextUtils.indexOf("", "");
                    int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(indexOf + 6, 116 - (keyRepeatDelay >> 16), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr4);
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject, ((java.lang.String) objArr4[0]).intern())) {
                        int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(indexOf2 + 18, 122 - android.text.TextUtils.getOffsetAfter("", 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18436), objArr5);
                        ((java.lang.String) objArr5[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.DC_SCHEME_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_DC_SCHEME_MISSING, hashMap);
                    }
                    int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay();
                    int indexOf3 = android.text.TextUtils.indexOf("", "", 0);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(14 - (keyRepeatDelay2 >> 16), indexOf3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr6);
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject, ((java.lang.String) objArr6[0]).intern())) {
                        int green = android.graphics.Color.green(0);
                        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(green + 26, capsMode + 153, (char) (54539 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr7);
                        ((java.lang.String) objArr7[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ADDITIONAL_DATA_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ADDITIONAL_DATA_MISSING, hashMap);
                    }
                    int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(14 - offsetAfter, (edgeSlop >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr8);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString(((java.lang.String) objArr8[0]).intern()));
                    int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(trimmedLength + 14, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9861), objArr9);
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, ((java.lang.String) objArr9[0]).intern())) {
                        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((windowTouchSlop >> 8) + 29, 179 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 32953), objArr10);
                        ((java.lang.String) objArr10[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PAN_LAST4DIGITS_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_PAN_LAST4DIGITS_MISSING, hashMap);
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 25, 62 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24446), objArr11);
        ((java.lang.String) objArr11[0]).intern();
        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.BOTH_TOKENID_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_BOTH_TOKENID_MISSING, hashMap);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m27536(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(6 - android.text.TextUtils.getCapsMode("", 0, 0), 116 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(7 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(2 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 215, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46786), objArr3);
        java.lang.String optString = jSONObject.optString(intern, ((java.lang.String) objArr3[0]).intern());
        if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.ma.f2342)) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(19 - android.text.TextUtils.getOffsetAfter("", 0), 219 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
            ((java.lang.String) objArr4[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PPSE_FCI_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_PPSE_FCI_MISSING, hashMap);
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(10 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 237 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 22199), objArr5);
        try {
            if (string.equalsIgnoreCase(((java.lang.String) objArr5[0]).intern())) {
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2385)) {
                    int i = getHighSpeedVideoFpsRanges + 115;
                    getOutputFormats = i % 128;
                    if (i % 2 == 0) {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(117 << (android.view.ViewConfiguration.getTouchSlop() / 81), 9635 - android.view.KeyEvent.getDeadChar(0, 0), (char) (2142 >> android.text.TextUtils.indexOf((java.lang.CharSequence) "", '`', 0, 0)), objArr6);
                        obj5 = objArr6[0];
                    } else {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 23, 247 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 9577), objArr7);
                        obj5 = objArr7[0];
                    }
                    ((java.lang.String) obj5).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CDOL_LEN_MISSING, hashMap);
                }
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(3 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 215 - android.text.TextUtils.indexOf("", "", 0), (char) (android.graphics.Color.green(0) + 46787), objArr8);
                if (optString.equalsIgnoreCase(((java.lang.String) objArr8[0]).intern())) {
                    int i2 = getHighSpeedVideoFpsRanges + 83;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2382);
                        throw null;
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2382)) {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(33 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 269 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((-1) - android.view.MotionEvent.axisFromString("")), objArr9);
                        ((java.lang.String) objArr9[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CIAC_DECLINE_PPMS_MISSING, hashMap);
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2383)) {
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40, 303 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr10);
                        ((java.lang.String) objArr10[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_ADDITIONAL_CHECKTABLE_MISSING, hashMap);
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2378)) {
                        int i3 = getHighSpeedVideoFpsRanges + 5;
                        getOutputFormats = i3 % 128;
                        if (i3 % 2 == 0) {
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(87 % (android.view.ViewConfiguration.getPressedStateDuration() / 18), 27233 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() % 67), objArr11);
                            obj4 = objArr11[0];
                        } else {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(31 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.visa.cbp.getCertUsage.isReperso, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr12);
                            obj4 = objArr12[0];
                        }
                        ((java.lang.String) obj4).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CRM_COUNTRY_CODE_MISSING, hashMap);
                    }
                } else {
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2394)) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 20, 373 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) android.view.View.MeasureSpec.getMode(0), objArr13);
                        ((java.lang.String) objArr13[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CVM_MODEL_MISSING, hashMap);
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2393)) {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(38 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 394, (char) (10041 - android.view.View.MeasureSpec.getMode(0)), objArr14);
                        ((java.lang.String) objArr14[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_US_AIP_MASK_MISSING, hashMap);
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2391)) {
                        int i4 = getOutputFormats + 9;
                        getHighSpeedVideoFpsRanges = i4 % 128;
                        if (i4 % 2 != 0) {
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(34 % android.widget.ExpandableListView.getPackedPositionType(0L), 4707 % (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (29827 % android.view.View.combineMeasuredStates(1, 1)), objArr15);
                            obj3 = objArr15[0];
                        } else {
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(31 - android.widget.ExpandableListView.getPackedPositionType(0L), 433 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (20738 - android.view.View.combineMeasuredStates(0, 0)), objArr16);
                            obj3 = objArr16[0];
                        }
                        ((java.lang.String) obj3).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_IS_TRANSIT_SUPPORT_MISSING, hashMap);
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2395)) {
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 111) % 128;
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 25, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 463, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr17);
                        ((java.lang.String) objArr17[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_UMD_GENERATION_MISSING, hashMap);
                    }
                }
            }
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 4, 488 - android.graphics.Color.blue(0), (char) (33324 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr18);
            if (string.equalsIgnoreCase(((java.lang.String) objArr18[0]).intern())) {
                getOutputFormats = (getHighSpeedVideoFpsRanges + 101) % 128;
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2306)) {
                    int i5 = getOutputFormats + 55;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    if (i5 % 2 != 0) {
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSize(0, 1) * 44, 3453 >>> android.text.TextUtils.getOffsetBefore("", 1), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 36519), objArr19);
                        obj2 = objArr19[0];
                    } else {
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(27 - android.view.View.resolveSize(0, 0), android.text.TextUtils.getOffsetBefore("", 0) + 492, (char) (36519 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr20);
                        obj2 = objArr20[0];
                    }
                    ((java.lang.String) obj2).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CRM_COUNTRY_CODE_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2308)) {
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 28, (-16776697) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr21);
                    ((java.lang.String) objArr21[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CRM_CURRENCY_CODE_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2307)) {
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 547, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr22);
                    ((java.lang.String) objArr22[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_DTTPI_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2304)) {
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(14 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777779, (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr23);
                    ((java.lang.String) objArr23[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_DKI_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2303)) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 47) % 128;
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(34 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 577, (char) (19620 - android.view.View.getDefaultSize(0, 0)), objArr24);
                    ((java.lang.String) objArr24[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_MAX_TRANSACTION_NO_CVM_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2311)) {
                    int i6 = getOutputFormats + 19;
                    getHighSpeedVideoFpsRanges = i6 % 128;
                    if (i6 % 2 != 0) {
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)) * 100, 20113 >>> (android.view.ViewConfiguration.getScrollBarSize() >> 26), (char) (10731 >> android.text.TextUtils.indexOf("", "", 0, 1)), objArr25);
                        obj = objArr25[0];
                    } else {
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40, 610 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (17672 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr26);
                        obj = objArr26[0];
                    }
                    ((java.lang.String) obj).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_MAX_TRANSACTION_AMOUNT_NO_CVM_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2302)) {
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(15 - android.text.TextUtils.getOffsetBefore("", 0), 650 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (10102 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr27);
                    ((java.lang.String) objArr27[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_MUTA_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2336)) {
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(19 - android.text.TextUtils.getTrimmedLength(""), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 664, (char) (38004 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr28);
                    ((java.lang.String) objArr28[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CIAC_CVM_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2337)) {
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 20, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 684, (char) (22343 - android.view.View.combineMeasuredStates(0, 0)), objArr29);
                    ((java.lang.String) objArr29[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CIAC_CVM2_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2332)) {
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(27 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 704 - android.view.KeyEvent.normalizeMetaState(0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr30);
                    ((java.lang.String) objArr30[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_ISSUER_CVM_LIMIT_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2317)) {
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(28 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 731, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + androidx.media3.muxer.WebmConstants.MkvEbmlElement.WHITE_POINT_CHROMATICITY_X), objArr31);
                    ((java.lang.String) objArr31[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_ISSUER_CVM_LIMIT2_MISSING, hashMap);
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m27540(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        java.lang.Object obj;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 4, 911 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (53629 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(6 - android.view.KeyEvent.keyCodeFromString(""), 116 - android.graphics.Color.blue(0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 3, 215 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46787), objArr4);
        jSONObject.optString(intern2, ((java.lang.String) objArr4[0]).intern());
        if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.ma.f2350)) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(19 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 759, (char) (53213 - android.view.View.MeasureSpec.getSize(0)), objArr5);
            ((java.lang.String) objArr5[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.AIDINFO_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_MISSING, hashMap);
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject2.optString(util.h.xy.s.ma.f2350));
        if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2360)) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, android.graphics.Color.blue(0) + 778, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr6);
            ((java.lang.String) objArr6[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.AIDINFO_AID_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_AID_MISSING, hashMap);
        }
        if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2361)) {
            getHighSpeedVideoFpsRanges = (getOutputFormats + 119) % 128;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23, 791 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr7);
            ((java.lang.String) objArr7[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.AIDINFO_PAYMENT_FCI_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_PAYMENT_FCI_MISSING, hashMap);
        }
        try {
            if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2353)) {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 59) % 128;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(24 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 814, (char) android.graphics.Color.alpha(0), objArr8);
                ((java.lang.String) objArr8[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.AIDINFO_GPORESPONSE_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_GPORESPONSE_MISSING, hashMap);
            }
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 837 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            if (string.equalsIgnoreCase(((java.lang.String) objArr9[0]).intern()) && getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2414)) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SI, android.text.TextUtils.getOffsetAfter("", 0) + 841, (char) (35518 - android.text.TextUtils.indexOf("", "", 0)), objArr10);
                ((java.lang.String) objArr10[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.AIDINFO_CAP_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_CAP_MISSING, hashMap);
            }
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 4, 487 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 33326), objArr11);
            if (string.equalsIgnoreCase(((java.lang.String) objArr11[0]).intern())) {
                java.lang.String optString = jSONObject.optString(util.h.xy.s.g.f2312);
                java.lang.String optString2 = jSONObject.optString(util.h.xy.s.g.f2335);
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.g.f2316)) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21, android.view.View.MeasureSpec.getSize(0) + 855, (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr12);
                    ((java.lang.String) objArr12[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_APPLICATION_CONTROL_MISSING, hashMap);
                }
                byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.g.f2316));
                if (util.h.xy.ar.b.m25083(m25076[0], 1) == 1 && getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.g.f2305)) {
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 75) % 128;
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 62993), objArr13);
                    ((java.lang.String) objArr13[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_GPORESPONSE_OFFLINE_MISSING, hashMap);
                }
                if (util.h.xy.ar.b.m25083(m25076[1], 6) == 0) {
                    int i = getHighSpeedVideoFpsRanges + 47;
                    getOutputFormats = i % 128;
                    if (i % 2 == 0) {
                        getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2323);
                        throw new java.lang.ArithmeticException();
                    }
                    if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.g.f2323)) {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.keyCodeFromString("") + 14, 898 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.indexOf("", "", 0) + 36431), objArr14);
                        ((java.lang.String) objArr14[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_PCI_MISSING, hashMap);
                    }
                }
                java.lang.String optString3 = jSONObject3.optString(util.h.xy.s.g.f2348);
                if (!optString3.isEmpty() && optString3.equalsIgnoreCase(intern) && getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.g.f2354)) {
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 23) % 128;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 26, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 916, (char) android.graphics.Color.red(0), objArr15);
                    ((java.lang.String) objArr15[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_MIR_PAYMENT_FCI_MISSING, hashMap);
                }
                Camera2StreamConfigurationMap(util.h.xy.ar.a.m25052(util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.ma.f2361)), new byte[]{-91}), hashMap, (!optString.isEmpty() && optString.equalsIgnoreCase(intern)) || (!optString2.isEmpty() && optString2.equalsIgnoreCase(intern)));
                if (!optString.isEmpty() && optString.equalsIgnoreCase(intern) && util.h.xy.ar.b.m25083(m25076[0], 5) == 1) {
                    org.json.JSONObject optJSONObject = jSONObject3.optJSONObject(util.h.xy.s.g.f2313);
                    if (optJSONObject == null) {
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(34 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 941 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41948), objArr16);
                        ((java.lang.String) objArr16[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_MISSING, hashMap);
                    }
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 3) % 128;
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(util.h.xy.s.g.f2309);
                    if (optJSONObject2 != null && getHighResolutionOutputSizeshNQ4ISI(optJSONObject2, util.h.xy.s.g.f2301)) {
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(34 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 941 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (41948 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr17);
                        ((java.lang.String) objArr17[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CDCVM_REQUIRED_MISSING, hashMap);
                    }
                    if (optJSONObject2 != null && getHighResolutionOutputSizeshNQ4ISI(optJSONObject2, util.h.xy.s.g.f2322)) {
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 17) % 128;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 974 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 65188), objArr18);
                        ((java.lang.String) objArr18[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CDCVM_ALREADY_ENTERED_MISSING, hashMap);
                    }
                    if (optJSONObject2 == null) {
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1013, (char) (23340 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr19);
                        ((java.lang.String) objArr19[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_GPORESPONSE_MISSING, hashMap);
                    }
                }
                if (!optString.isEmpty() && optString.equalsIgnoreCase(intern)) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 43) % 128;
                    if (util.h.xy.ar.b.m25083(m25076[0], 2) == 1) {
                        org.json.JSONObject optJSONObject3 = jSONObject3.optJSONObject(util.h.xy.s.g.f2313);
                        if (optJSONObject3 == null) {
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 33, android.graphics.Color.argb(0, 0, 0, 0) + 941, (char) (41948 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr20);
                            ((java.lang.String) objArr20[0]).intern();
                            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_MISSING, hashMap);
                        }
                        org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject(util.h.xy.s.g.f2309);
                        if (optJSONObject4 != null && getHighResolutionOutputSizeshNQ4ISI(optJSONObject4, util.h.xy.s.g.f2314)) {
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(39 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_IDS_BASE_VALUE, (char) android.view.View.MeasureSpec.getSize(0), objArr21);
                            ((java.lang.String) objArr21[0]).intern();
                            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_ONLINE_PIN_REQUIRED_MISSING, hashMap);
                        }
                        if (optJSONObject4 == null) {
                            int i2 = getOutputFormats + 35;
                            getHighSpeedVideoFpsRanges = i2 % 128;
                            if (i2 % 2 != 0) {
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(94 % android.view.MotionEvent.axisFromString(""), 4020 % (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), (char) (13729 % (android.media.AudioTrack.getMinVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 2.0f ? 0 : -1))), objArr22);
                                obj = objArr22[0];
                            } else {
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(30 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1013, (char) (23340 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr23);
                                obj = objArr23[0];
                            }
                            ((java.lang.String) obj).intern();
                            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_GPORESPONSE_MISSING, hashMap);
                        }
                    }
                }
                if (!optString2.isEmpty() && optString2.equalsIgnoreCase(intern) && util.h.xy.ar.b.m25083(m25076[0], 5) == 1) {
                    org.json.JSONObject optJSONObject5 = jSONObject3.optJSONObject(util.h.xy.s.g.f2310);
                    if (optJSONObject5 == null) {
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(32 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1082, (char) (31821 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr24);
                        ((java.lang.String) objArr24[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_CPACE_MISSING, hashMap);
                    }
                    org.json.JSONObject optJSONObject6 = optJSONObject5.optJSONObject(util.h.xy.s.g.f2309);
                    if (optJSONObject6 != null && getHighResolutionOutputSizeshNQ4ISI(optJSONObject6, util.h.xy.s.g.f2301)) {
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(31 - android.view.View.MeasureSpec.getMode(0), 1083 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (31820 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr25);
                        ((java.lang.String) objArr25[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_CPACE_CDCVM_REQUIRED_MISSING, hashMap);
                    }
                    if (optJSONObject6 != null && getHighResolutionOutputSizeshNQ4ISI(optJSONObject6, util.h.xy.s.g.f2322)) {
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(39 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1114 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.graphics.Color.alpha(0) + 60450), objArr26);
                        ((java.lang.String) objArr26[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_CPACE_CDCVM_ALREADY_ENTERED_MISSING, hashMap);
                    }
                    if (optJSONObject6 != null) {
                        return;
                    }
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 31, (-16776133) - android.graphics.Color.rgb(0, 0, 0), (char) (31821 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr27);
                    ((java.lang.String) objArr27[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_CPACE_GPORESPONSE_MISSING, hashMap);
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m27538(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(5 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 116 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 215 - android.text.TextUtils.indexOf("", "", 0), (char) (46787 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
        jSONObject.optString(intern, ((java.lang.String) objArr3[0]).intern());
        java.lang.String optString = jSONObject2.optString(util.h.xy.s.ma.f2349);
        if (optString != null) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 49) % 128;
            if (optString.isEmpty()) {
                return;
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, android.text.TextUtils.indexOf("", "", 0, 0) + 837, (char) (android.view.MotionEvent.axisFromString("") + 1), objArr4);
            if (!string.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 10, 237 - android.text.TextUtils.getTrimmedLength(""), (char) (22200 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr5);
                if (!string.equalsIgnoreCase(((java.lang.String) objArr5[0]).intern())) {
                    return;
                }
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject2.optString(util.h.xy.s.ma.f2349));
            if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2360)) {
                int i = getHighSpeedVideoFpsRanges + 51;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor('D' - android.text.AndroidCharacter.getMirror('r'), (android.media.AudioTrack.getMaxVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)) + 12219, (char) (41168 % (android.util.TypedValue.complexToFraction(1, 1.0f, 0.0f) > 2.0f ? 1 : (android.util.TypedValue.complexToFraction(1, 1.0f, 0.0f) == 2.0f ? 0 : -1))), objArr6);
                    obj2 = objArr6[0];
                } else {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 24, 1153 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41168), objArr7);
                    obj2 = objArr7[0];
                }
                ((java.lang.String) obj2).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ALTERNATE_AIDINFO_AID_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ALTERNATE_AIDINFO_AID_MISSING, hashMap);
            }
            if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2361)) {
                int i2 = getOutputFormats + 75;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(6 >>> android.view.MotionEvent.axisFromString(""), 16740 << android.text.TextUtils.getOffsetAfter("", 0), (char) (29322 >> (android.view.ViewConfiguration.getLongPressTimeout() - 2)), objArr8);
                    obj = objArr8[0];
                } else {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 32, 1176 - android.text.TextUtils.getOffsetAfter("", 0), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 8915), objArr9);
                    obj = objArr9[0];
                }
                ((java.lang.String) obj).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ALTERNATE_AIDINFO_PAYMENT_FCI_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ALTERNATE_AIDINFO_PAYMENT_FCI_MISSING, hashMap);
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(5 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 837 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr10);
            if (string.equalsIgnoreCase(((java.lang.String) objArr10[0]).intern())) {
                int i3 = getOutputFormats + 55;
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 != 0) {
                    getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2353);
                    throw null;
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2353)) {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 33, 1207 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr11);
                    ((java.lang.String) objArr11[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ALTERNATE_AIDINFO_GPORESPONSE_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ALTERNATE_AIDINFO_GPORESPONSE_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.rh.f2414)) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(24 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1240, (char) (59091 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr12);
                    ((java.lang.String) objArr12[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ALTERNATE_AIDINFO_CAP_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ALTERNATE_AIDINFO_CAP_MISSING, hashMap);
                }
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27535(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 45) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(6 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.Color.green(0) + 116, (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
        jSONObject.getString(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 7, 208 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        getOutputFormats = (getHighSpeedVideoFpsRanges + 93) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 4, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 215, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 46787), objArr3);
            jSONObject.optString(intern, ((java.lang.String) objArr3[0]).intern());
            if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.ma.f2373)) {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 121) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(18 - android.view.View.resolveSizeAndState(0, 0, 0), 1263 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38036), objArr4);
                ((java.lang.String) objArr4[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.RECORDS_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_RECORDS_MISSING, hashMap);
            }
            org.json.JSONArray jSONArray = jSONObject2.getJSONArray(util.h.xy.s.ma.f2373);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONArray.get(i).toString());
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.ma.f2375)) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(21 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1281, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr5);
                    ((java.lang.String) objArr5[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.RECORDS_SFI_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_RECORDS_SFI_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.ma.f2339)) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32, android.text.TextUtils.getTrimmedLength("") + 1303, (char) (29688 - android.view.View.combineMeasuredStates(0, 0)), objArr6);
                    ((java.lang.String) objArr6[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.RECORDS_RECORDNUMBER_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_RECORDS_RECORDNUMBER_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject3, util.h.xy.s.ma.f2370)) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.keyCodeFromString("") + 31, 1383 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
                    ((java.lang.String) objArr7[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.RECORDS_RECORDVALUE_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_RECORDS_RECORDVALUE_MISSING, hashMap);
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0389, code lost:
    
        if (r0.length == 4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x03b0, code lost:
    
        if ((r0[r16] & r15) != r15) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03b2, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03ab, code lost:
    
        if (r0.length == 2) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x059b  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m27539(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        int i;
        int i2;
        char c;
        byte[] bArr;
        boolean z;
        java.lang.Object[] objArr;
        int i3;
        byte[] m25052;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(6 - android.text.TextUtils.getCapsMode("", 0, 0), 116 - android.graphics.Color.blue(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr2);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 7, android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 215 - android.graphics.Color.green(0), (char) (46788 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr4);
        java.lang.String optString = jSONObject.optString(intern, ((java.lang.String) objArr4[0]).intern());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject2.optString(util.h.xy.s.ma.f2350));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, 836 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0), objArr5);
        try {
            if (string.equalsIgnoreCase(((java.lang.String) objArr5[0]).intern())) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(13 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr6);
                org.json.JSONObject jSONObject4 = new org.json.JSONObject(jSONObject.getString(((java.lang.String) objArr6[0]).intern()));
                java.lang.String optString2 = jSONObject2.optString(util.h.xy.s.ma.f2349);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(jSONObject3);
                if (optString2 == null || optString2.isEmpty()) {
                    z2 = false;
                } else {
                    jSONObject5 = new org.json.JSONObject(optString2);
                    z2 = getHighResolutionOutputSizeshNQ4ISI(jSONObject5);
                }
                if (highResolutionOutputSizeshNQ4ISI || z2) {
                    java.lang.String optString3 = jSONObject4.optString(util.h.xy.s.rh.f2416);
                    java.lang.String optString4 = jSONObject2.optString(util.h.xy.s.rh.f2413);
                    java.lang.String optString5 = jSONObject3.optString(util.h.xy.s.rh.f2415);
                    if (optString3 == null || optString3.isEmpty()) {
                        z3 = false;
                    } else {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 63) % 128;
                        z3 = true;
                    }
                    if (optString4 == null || optString4.isEmpty()) {
                        z4 = false;
                    } else {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 11) % 128;
                        z4 = true;
                    }
                    if (optString5 == null || optString5.isEmpty()) {
                        z5 = false;
                    } else {
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 49) % 128;
                        z5 = true;
                    }
                    if (!z5) {
                        java.lang.String optString6 = jSONObject5.optString(util.h.xy.s.rh.f2415);
                        z5 = (optString6 == null || optString6.isEmpty()) ? false : true;
                    }
                    if (!z3) {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(62 - android.graphics.Color.alpha(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1366, (char) (android.text.TextUtils.getTrimmedLength("") + 12217), objArr7);
                        ((java.lang.String) objArr7[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ADDITIONAL_DATA_ODA_CERTIFICATE_EXPIRY_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ADDITIONAL_DATA_ODA_CERTIFICATE_EXPIRY_MISSING, hashMap);
                    }
                    if (!z4) {
                        int alpha = android.graphics.Color.alpha(0);
                        float complexToFloat = android.util.TypedValue.complexToFloat(0);
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 91) % 128;
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(50 - alpha, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 1428, (char) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 49744), objArr8);
                        ((java.lang.String) objArr8[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ODA_PRIVATE_KEY_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ODA_PRIVATE_KEY_MISSING, hashMap);
                    }
                    if (!z5) {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(48 - android.graphics.ImageFormat.getBitsPerPixel(0), 1478 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), objArr9);
                        ((java.lang.String) objArr9[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.ODA_GPORESPONSEODA_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ODA_GPORESPONSEODA_MISSING, hashMap);
                    }
                }
                byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject2.optString(util.h.xy.s.ma.f2342));
                if (!highResolutionOutputSizeshNQ4ISI || !z2) {
                    new java.util.ArrayList();
                    try {
                        java.util.List<byte[]> m26183 = util.h.xy.d.mb.m26183(m25076);
                        if (m26183.size() == 0) {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, android.view.KeyEvent.normalizeMetaState(0) + 1527, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
                            ((java.lang.String) objArr10[0]).intern();
                            com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes dCMErrorCodes = com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PPSE_FCI_MISSING;
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 25, 1550 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (35432 - android.view.View.combineMeasuredStates(0, 0)), objArr11);
                            throw new util.h.xy.d.g(dCMErrorCodes, ((java.lang.String) objArr11[0]).intern(), hashMap);
                        }
                        java.lang.String optString7 = !highResolutionOutputSizeshNQ4ISI ? jSONObject3.optString(util.h.xy.s.rh.f2360) : "";
                        java.lang.String optString8 = !z2 ? jSONObject5.optString(util.h.xy.s.rh.f2360) : "";
                        byte[] bArr2 = {com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
                        for (byte[] bArr3 : m26183) {
                            java.lang.String m25106 = util.h.xy.ar.b.m25106(util.h.xy.ar.a.m25052(bArr3, bArr2));
                            if (optString7 != null && optString7.equalsIgnoreCase(m25106)) {
                                getHighResolutionOutputSizeshNQ4ISI(bArr3, hashMap);
                            } else if (optString8 != null && optString8.equalsIgnoreCase(m25106)) {
                                getHighResolutionOutputSizeshNQ4ISI(bArr3, hashMap);
                            }
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(19 - android.graphics.Color.alpha(0), 218 - android.graphics.Color.alpha(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr12);
                        ((java.lang.String) objArr12[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PPSE_FCI_MISSING, e.getMessage(), hashMap);
                    }
                }
                i = 0;
            } else {
                i = 0;
            }
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 5, 488 - android.graphics.drawable.Drawable.resolveOpacity(i, i), (char) (33325 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr13);
            if (string.equalsIgnoreCase(((java.lang.String) objArr13[0]).intern())) {
                byte[] m250762 = util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.g.f2316));
                byte[] m250763 = util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.g.f2353));
                int i4 = 1;
                if (util.h.xy.ar.b.m25083(m250762[0], 1) == 1) {
                    int i5 = getOutputFormats + 67;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    if (i5 % 2 != 0) {
                        i4 = 1;
                        i3 = 0;
                        m25052 = util.h.xy.ar.a.m25052(util.h.xy.ar.a.m25052(util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.g.f2305)), new byte[]{com.visa.cbp.getEncExpo.IResultReceiver}), new byte[]{-126});
                    } else {
                        i4 = 1;
                        i3 = 0;
                        m25052 = util.h.xy.ar.a.m25052(util.h.xy.ar.a.m25052(util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.g.f2305)), new byte[]{com.visa.cbp.getEncExpo.IResultReceiver}), new byte[]{-126});
                    }
                } else {
                    i3 = 0;
                }
                int i6 = i3;
                byte[] bArr4 = new byte[i4];
                bArr4[i3] = com.visa.cbp.getEncExpo.IResultReceiver;
                byte[] m250522 = util.h.xy.ar.a.m25052(m250763, bArr4);
                byte[] bArr5 = new byte[i4];
                bArr5[i3] = -126;
                byte[] m250523 = util.h.xy.ar.a.m25052(m250522, bArr5);
                if ((m250523.length == 2 && (m250523[i3] & i4) == i4) || i6 != 0) {
                    int i7 = getOutputFormats + 59;
                    getHighSpeedVideoFpsRanges = i7 % 128;
                    if (i7 % 2 != 0) {
                        jSONObject3.optString(util.h.xy.s.g.f2376);
                        throw null;
                    }
                    if (jSONObject3.optString(util.h.xy.s.g.f2376).isEmpty() || jSONObject3.optString(util.h.xy.s.g.f2372).isEmpty() || jSONObject3.optString(util.h.xy.s.g.f2365).isEmpty() || jSONObject3.optString(util.h.xy.s.g.f2366).isEmpty() || jSONObject3.optString(util.h.xy.s.g.f2368).isEmpty()) {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(53 - android.text.TextUtils.indexOf("", ""), 1575 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5980), objArr14);
                        ((java.lang.String) objArr14[0]).intern();
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CDA_PRIVKEY_COMPONENT_MISSING, hashMap);
                    }
                }
            }
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, 237 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (22199 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr15);
            if (!string.equalsIgnoreCase(((java.lang.String) objArr15[0]).intern())) {
                return;
            }
            int i8 = getOutputFormats + 101;
            getHighSpeedVideoFpsRanges = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = 1;
                c = 0;
                byte[] m250524 = util.h.xy.ar.a.m25052(util.h.xy.ar.a.m25052(util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.md.f2353)), new byte[]{com.visa.cbp.getEncExpo.IResultReceiver}), new byte[]{-126});
                if (m250524.length == 5) {
                    bArr = m250524;
                    z = true;
                }
                long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                java.lang.Object[] objArr16 = new java.lang.Object[i2];
                objArr16[c] = "";
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.Process");
                java.lang.Class<?>[] clsArr = new java.lang.Class[i2];
                clsArr[c] = java.lang.String.class;
                objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 2, ((java.lang.Integer) cls.getMethod("getGidForName", clsArr).invoke(null, objArr16)).intValue() + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, (char) (46787 - android.graphics.Color.green(0)), objArr);
                if (!optString.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    if (!jSONObject3.optString(util.h.xy.s.g.f2376).isEmpty() && !jSONObject3.optString(util.h.xy.s.g.f2372).isEmpty() && !jSONObject3.optString(util.h.xy.s.g.f2365).isEmpty()) {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 29) % 128;
                        if (!jSONObject3.optString(util.h.xy.s.g.f2366).isEmpty() && !jSONObject3.optString(util.h.xy.s.g.f2368).isEmpty()) {
                            return;
                        }
                    }
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(53 - android.text.TextUtils.indexOf("", "", 0, 0), 1628 - android.graphics.Color.alpha(0), (char) (android.graphics.Color.red(0) + 51136), objArr17);
                    ((java.lang.String) objArr17[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CDA_PRIVKEY_COMPONENT_MISSING, hashMap);
                }
                if (getHighResolutionOutputSizeshNQ4ISI(jSONObject2, util.h.xy.s.md.f2341)) {
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 43, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1681, (char) (android.graphics.Color.rgb(0, 0, 0) + 16790095), objArr18);
                    ((java.lang.String) objArr18[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CDA_PRIVKEY_COMPONENT_MISSING, hashMap);
                }
                org.json.JSONObject jSONObject6 = jSONObject2.getJSONObject(util.h.xy.s.md.f2341);
                if (!jSONObject6.optString(util.h.xy.s.g.f2376).isEmpty()) {
                    int i9 = getOutputFormats + 35;
                    getHighSpeedVideoFpsRanges = i9 % 128;
                    if (i9 % 2 != 0) {
                        jSONObject6.optString(util.h.xy.s.g.f2372);
                        throw null;
                    }
                    if (!jSONObject6.optString(util.h.xy.s.g.f2372).isEmpty()) {
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 27) % 128;
                        if (!jSONObject6.optString(util.h.xy.s.g.f2365).isEmpty() && !jSONObject6.optString(util.h.xy.s.g.f2366).isEmpty() && !jSONObject6.optString(util.h.xy.s.g.f2368).isEmpty()) {
                            return;
                        }
                    }
                }
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 53, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1724, (char) android.view.View.getDefaultSize(0, 0), objArr19);
                ((java.lang.String) objArr19[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CL_CDA_PRIVKEY_COMPONENT_MISSING, hashMap);
            }
            i2 = 1;
            c = 0;
            byte[] m250525 = util.h.xy.ar.a.m25052(util.h.xy.ar.a.m25052(util.h.xy.ar.b.m25076(jSONObject3.getString(util.h.xy.s.md.f2353)), new byte[]{com.visa.cbp.getEncExpo.IResultReceiver}), new byte[]{-126});
            if (m250525.length != 2) {
                return;
            }
            bArr = m250525;
            z = false;
            if ((bArr[c] & i2) != i2 && !z) {
                return;
            }
            long zoomControlsTimeout2 = android.view.ViewConfiguration.getZoomControlsTimeout();
            java.lang.Object[] objArr162 = new java.lang.Object[i2];
            objArr162[c] = "";
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.os.Process");
            java.lang.Class<?>[] clsArr2 = new java.lang.Class[i2];
            clsArr2[c] = java.lang.String.class;
            objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((zoomControlsTimeout2 > 0L ? 1 : (zoomControlsTimeout2 == 0L ? 0 : -1)) + 2, ((java.lang.Integer) cls2.getMethod("getGidForName", clsArr2).invoke(null, objArr162)).intValue() + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, (char) (46787 - android.graphics.Color.green(0)), objArr);
            if (!optString.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m27533(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(packedPositionGroup + 6, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 116, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(6 - indexOf, makeMeasureSpec + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
        int green = android.graphics.Color.green(0);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(resolveSizeAndState + 3, 215 - green, (char) (46786 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr3);
        jSONObject.optString(intern, ((java.lang.String) objArr3[0]).intern());
        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - packedPositionType, 487 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.View.resolveSize(0, 0) + 33325), objArr4);
        if (string.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
            if (!jSONObject2.optString(util.h.xy.s.g.f2302).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2304).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2300).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2337).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2338).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2317).isEmpty()) {
                int i = getOutputFormats + 99;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 != 0) {
                    jSONObject2.optString(util.h.xy.s.g.f2325);
                    throw null;
                }
                if (!jSONObject2.optString(util.h.xy.s.g.f2325).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2327).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2330).isEmpty() && !jSONObject2.optString(util.h.xy.s.g.f2308).isEmpty()) {
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(util.h.xy.s.g.f2350);
                    if (!jSONObject3.optString(util.h.xy.s.g.f2360).isEmpty()) {
                        int i2 = getHighSpeedVideoFpsRanges + 1;
                        getOutputFormats = i2 % 128;
                        if (i2 % 2 == 0) {
                            jSONObject3.optString(util.h.xy.s.g.f2326);
                            throw new java.lang.ArithmeticException();
                        }
                        if (!jSONObject3.optString(util.h.xy.s.g.f2326).isEmpty()) {
                            return;
                        }
                    }
                    long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(39 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1806, (char) (android.view.MotionEvent.axisFromString("") + 1), objArr5);
                    ((java.lang.String) objArr5[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_QR_PROFILE_FIELD_MISSING, hashMap);
                }
            }
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(absoluteGravity + 30, lastIndexOf + 1778, (char) (42105 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr6);
            ((java.lang.String) objArr6[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_QR_PROFILE_FIELD_MISSING, hashMap);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m27532(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g, org.json.JSONException {
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.Object obj2;
        int keyRepeatDelay;
        int i;
        int i2;
        int i3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 6, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 116, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(7 - android.view.View.resolveSizeAndState(0, 0, 0), 207 - android.view.MotionEvent.axisFromString(""), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - android.text.TextUtils.getOffsetBefore("", 0), 215 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (46786 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr3);
        java.lang.String optString = jSONObject.optString(intern, ((java.lang.String) objArr3[0]).intern());
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 10, 237 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (22199 - android.view.View.getDefaultSize(0, 0)), objArr4);
            if (string.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                int i4 = getOutputFormats + 101;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 != 0) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(1, 1) + 2, 31154 / ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (46788 >> (android.view.ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1))), objArr5);
                    if (optString.equalsIgnoreCase(((java.lang.String) objArr5[0]).intern())) {
                        return;
                    }
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(3 - android.view.View.combineMeasuredStates(0, 0), 214 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (46788 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr6);
                    if (optString.equalsIgnoreCase(((java.lang.String) objArr6[0]).intern())) {
                        return;
                    }
                }
                if (!jSONObject2.has(util.h.xy.s.ma.f2351)) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1845 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (31671 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr7);
                    str2 = ((java.lang.String) objArr7[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2351) == null) {
                    getHighSpeedVideoFpsRanges = (getOutputFormats + 79) % 128;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 30, 1880 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (10219 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr8);
                    str2 = ((java.lang.String) objArr8[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2351).isEmpty()) {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 30, 1910 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24722), objArr9);
                    str2 = ((java.lang.String) objArr9[0]).intern();
                } else if (!jSONObject2.has(util.h.xy.s.ma.f2340)) {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(35 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.view.KeyEvent.keyCodeFromString("") + 1940, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr10);
                    str2 = ((java.lang.String) objArr10[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2340) == null) {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1976, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 62297), objArr11);
                    str2 = ((java.lang.String) objArr11[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2340).isEmpty()) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(31 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                    str2 = ((java.lang.String) objArr12[0]).intern();
                } else if (!jSONObject2.has(util.h.xy.s.ma.f2345)) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 39, android.view.View.combineMeasuredStates(0, 0) + 2035, (char) (30620 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr13);
                    str2 = ((java.lang.String) objArr13[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2345) == null) {
                    int i5 = getHighSpeedVideoFpsRanges + 73;
                    getOutputFormats = i5 % 128;
                    if (i5 % 2 == 0) {
                        keyRepeatDelay = 101 >> (android.view.ViewConfiguration.getKeyRepeatDelay() + 35);
                        i = 26985;
                    } else {
                        keyRepeatDelay = 32 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                        i = 2074;
                    }
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(keyRepeatDelay, i + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (char) (android.view.KeyEvent.normalizeMetaState(0) + 4765), objArr14);
                    str2 = ((java.lang.String) objArr14[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2345).isEmpty()) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 11) % 128;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) + 33, 2106 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7973), objArr15);
                    str2 = ((java.lang.String) objArr15[0]).intern();
                } else if (!jSONObject2.has(util.h.xy.s.ma.f2344)) {
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(18 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.getOffsetAfter("", 0) + 2139, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 6068), objArr16);
                    str2 = ((java.lang.String) objArr16[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2344) == null) {
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 2158 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (11480 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr17);
                    str2 = ((java.lang.String) objArr17[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2344).isEmpty()) {
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 12, 2168 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")), objArr18);
                    str2 = ((java.lang.String) objArr18[0]).intern();
                } else if (!jSONObject2.has(util.h.xy.s.ma.f2362)) {
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 18, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2181, (char) (22143 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr19);
                    str2 = ((java.lang.String) objArr19[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2362) == null) {
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12, android.text.TextUtils.getCapsMode("", 0, 0) + 2198, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49573), objArr20);
                    str2 = ((java.lang.String) objArr20[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2362).isEmpty()) {
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(12 - android.graphics.Color.red(0), 2209 - android.graphics.Color.alpha(0), (char) (android.graphics.Color.blue(0) + 8597), objArr21);
                    str2 = ((java.lang.String) objArr21[0]).intern();
                } else if (!jSONObject2.has(util.h.xy.s.ma.f2358)) {
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 29, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2221, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr22);
                    str2 = ((java.lang.String) objArr22[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2358) == null) {
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(23 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + 2250, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr23);
                    str2 = ((java.lang.String) objArr23[0]).intern();
                } else if (jSONObject2.optString(util.h.xy.s.ma.f2358).isEmpty()) {
                    int i6 = getHighSpeedVideoFpsRanges + 13;
                    getOutputFormats = i6 % 128;
                    if (i6 % 2 == 0) {
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(9 << android.text.TextUtils.indexOf("", ""), 30356 - android.view.View.getDefaultSize(0, 1), (char) (16877 >>> (android.view.ViewConfiguration.getLongPressTimeout() / 12)), objArr24);
                        obj2 = objArr24[0];
                    } else {
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(23 - android.text.TextUtils.indexOf("", ""), android.view.View.getDefaultSize(0, 0) + 2272, (char) (1253 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr25);
                        obj2 = objArr25[0];
                    }
                    str2 = ((java.lang.String) obj2).intern();
                } else {
                    java.lang.String optString2 = jSONObject2.optString(util.h.xy.s.ma.f2358);
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.graphics.Color.rgb(0, 0, 0) + 16777243, 2295 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr26);
                    if (!optString2.equalsIgnoreCase(((java.lang.String) objArr26[0]).intern())) {
                        java.lang.String optString3 = jSONObject2.optString(util.h.xy.s.ma.f2358);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(25 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2321 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (47273 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr27);
                        if (!optString3.equalsIgnoreCase(((java.lang.String) objArr27[0]).intern())) {
                            java.lang.String optString4 = jSONObject2.optString(util.h.xy.s.ma.f2358);
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, android.view.Gravity.getAbsoluteGravity(0, 0) + 2347, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr28);
                            if (!optString4.equalsIgnoreCase(((java.lang.String) objArr28[0]).intern())) {
                                int i7 = getOutputFormats + 9;
                                getHighSpeedVideoFpsRanges = i7 % 128;
                                if (i7 % 2 != 0) {
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(16 >> android.graphics.Color.alpha(1), 30307 - android.text.TextUtils.indexOf("", "", 0), (char) (9766 % android.view.KeyEvent.keyCodeFromString("")), objArr29);
                                    obj = objArr29[0];
                                } else {
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 27, android.text.TextUtils.indexOf("", "", 0) + 2373, (char) (android.view.KeyEvent.keyCodeFromString("") + 27663), objArr30);
                                    obj = objArr30[0];
                                }
                                str2 = ((java.lang.String) obj).intern();
                            }
                        }
                    }
                    if (!jSONObject2.has(util.h.xy.s.ma.f2359)) {
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2400, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50212), objArr31);
                        str2 = ((java.lang.String) objArr31[0]).intern();
                    } else if (jSONObject2.optString(util.h.xy.s.ma.f2359) == null) {
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 18, android.text.TextUtils.indexOf("", "") + 2424, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr32);
                        str2 = ((java.lang.String) objArr32[0]).intern();
                    } else if (jSONObject2.optString(util.h.xy.s.ma.f2359).isEmpty()) {
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 19, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2441, (char) android.view.View.combineMeasuredStates(0, 0), objArr33);
                        str2 = ((java.lang.String) objArr33[0]).intern();
                    } else if (!jSONObject2.has(util.h.xy.s.ma.f2363)) {
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 91) % 128;
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, android.text.TextUtils.getOffsetAfter("", 0) + 2459, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 58901), objArr34);
                        str2 = ((java.lang.String) objArr34[0]).intern();
                    } else if (jSONObject2.optString(util.h.xy.s.ma.f2363) == null) {
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 20, 2486 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 10504), objArr35);
                        str2 = ((java.lang.String) objArr35[0]).intern();
                    } else if (jSONObject2.optString(util.h.xy.s.ma.f2363).isEmpty()) {
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 21, 2506 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr36);
                        str2 = ((java.lang.String) objArr36[0]).intern();
                    } else if (!jSONObject2.has(util.h.xy.s.ma.f2357)) {
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(25 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2528 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 2928), objArr37);
                        str2 = ((java.lang.String) objArr37[0]).intern();
                    } else if (jSONObject2.optString(util.h.xy.s.ma.f2357) == null) {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 105) % 128;
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(18 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2553 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 56118), objArr38);
                        str2 = ((java.lang.String) objArr38[0]).intern();
                    } else if (jSONObject2.optString(util.h.xy.s.ma.f2357).isEmpty()) {
                        getOutputFormats = (getHighSpeedVideoFpsRanges + 63) % 128;
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20, 2572 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (14604 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr39);
                        str2 = ((java.lang.String) objArr39[0]).intern();
                    } else {
                        str2 = null;
                    }
                }
                if (str2 == null || str2.trim().isEmpty()) {
                    return;
                }
                int i8 = getHighSpeedVideoFpsRanges + 63;
                getOutputFormats = i8 % 128;
                if (i8 % 2 == 0) {
                    i2 = 53;
                    i3 = 1;
                } else {
                    i2 = 26;
                    i3 = 0;
                }
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(i2 + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(i3))).intValue() + 20) >> 6), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2591, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr40);
                ((java.lang.String) objArr40[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, str2, hashMap);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 107) % 128;
        if (jSONObject.has(str) && jSONObject.getString(str) != null) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 1) % 128;
            if (!jSONObject.getString(str).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, java.util.HashMap<java.lang.String, java.lang.Object> hashMap) throws util.h.xy.d.g {
        byte[] bArr2 = {-33, 32};
        if (util.h.xy.ar.a.m25052(bArr, new byte[]{com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 99}).length != 0) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 3) % 128;
            byte[] m25052 = util.h.xy.ar.a.m25052(bArr, bArr2);
            if (m25052.length > 0) {
                int i = getOutputFormats;
                int i2 = i + 19;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 != 0) {
                    if ((m25052[0] & com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION) != 22011) {
                        return;
                    }
                } else if ((m25052[0] & 128) != 128) {
                    return;
                }
                getHighSpeedVideoFpsRanges = (i + 107) % 128;
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(70 - combineMeasuredStates, 2617 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.getTrimmedLength("") + 41496), objArr);
                ((java.lang.String) objArr[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.CAP_NOT_SUPPORT_ODA, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_ODA_CAP_NOT_SUPPORT, hashMap);
            }
        }
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, java.util.HashMap<java.lang.String, java.lang.Object> hashMap, boolean z) throws util.h.xy.d.g {
        java.lang.Object obj;
        byte[] m25052 = util.h.xy.ar.a.m25052(bArr, new byte[]{-97, 56});
        if (!z) {
            if (m25052.length != 0) {
                int i = getHighSpeedVideoFpsRanges + 11;
                getOutputFormats = i % 128;
                if (i % 2 == 0) {
                    getHighSpeedVideoSizes(m25052, new byte[]{-97, 89, 3});
                    throw null;
                }
                if (getHighSpeedVideoSizes(m25052, new byte[]{-97, 89, 3})) {
                    int i2 = getOutputFormats + 9;
                    getHighSpeedVideoFpsRanges = i2 % 128;
                    if (i2 % 2 != 0) {
                        int normalizeMetaState = 29 / android.view.KeyEvent.normalizeMetaState(0);
                        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(normalizeMetaState, 6394 - (scrollDefaultDelay % 30), (char) (32071 % android.text.TextUtils.getTrimmedLength("")), objArr);
                        obj = objArr[0];
                    } else {
                        int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(normalizeMetaState2 + 25, 2813 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.getTrimmedLength("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE), objArr2);
                        obj = objArr2[0];
                    }
                    ((java.lang.String) obj).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_PURE_TTI_PRESENT, hashMap);
                }
                if (getHighSpeedVideoSizes(m25052, new byte[]{-97, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 1})) {
                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((doubleTapTimeout >> 16) + 24, android.graphics.Color.red(0) + 2838, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
                    ((java.lang.String) objArr3[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_PURE_TTT_PRESENT, hashMap);
                }
                if (getHighSpeedVideoSizes(m25052, new byte[]{-97, 88, 1})) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 35) % 128;
                    long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(26 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2861, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr4);
                    ((java.lang.String) objArr4[0]).intern();
                    throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_PURE_MTI_PRESENT, hashMap);
                }
                return;
            }
            return;
        }
        int i3 = (getHighSpeedVideoFpsRanges + 7) % 128;
        getOutputFormats = i3;
        if (m25052.length != 0) {
            int i4 = i3 + 31;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                getHighSpeedVideoSizes(m25052, new byte[]{-57, 5});
                throw new java.lang.ArithmeticException();
            }
            if (!getHighSpeedVideoSizes(m25052, new byte[]{-57, 5})) {
                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((pressedStateDuration >> 16) + 32, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2688, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
                ((java.lang.String) objArr5[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CPACE_TTPI_MISSING, hashMap);
            }
            if (!getHighSpeedVideoSizes(m25052, new byte[]{-97, 89, 3})) {
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(argb + 31, android.text.TextUtils.indexOf("", "", 0, 0) + 2720, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
                ((java.lang.String) objArr6[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CPACE_TTI_MISSING, hashMap);
            }
            if (!getHighSpeedVideoSizes(m25052, new byte[]{-97, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 1})) {
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(31 - packedPositionType, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2751, (char) android.graphics.Color.green(0), objArr7);
                ((java.lang.String) objArr7[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CPACE_TTT_MISSING, hashMap);
            }
            if (getHighSpeedVideoSizes(m25052, new byte[]{-97, 88, 1})) {
                return;
            }
            int i5 = getHighSpeedVideoFpsRanges + 1;
            getOutputFormats = i5 % 128;
            if (i5 % 2 == 0) {
                int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((maximumDrawingCacheSize >> 19) + 7, 11400 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 22, 1, 0), (char) android.graphics.drawable.Drawable.resolveOpacity(1, 1), objArr8);
                ((java.lang.String) objArr8[0]).intern();
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CPACE_MTI_MISSING, hashMap);
            }
            int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((maximumDrawingCacheSize2 >> 24) + 31, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2783, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr9);
            ((java.lang.String) objArr9[0]).intern();
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_AIDINFO_INTERAC_CPACE_MTI_MISSING, hashMap);
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(org.json.JSONObject jSONObject) throws org.json.JSONException {
        byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.s.rh.f2414));
        util.h.xy.ar.b.m25074(m25076);
        if (util.h.xy.ar.b.m25083(m25076[1], 5) != 0) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 39) % 128;
            return false;
        }
        int i = getHighSpeedVideoFpsRanges + 19;
        getOutputFormats = i % 128;
        return i % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        util.h.xy.u.mb.getHighSpeedVideoFpsRanges = (r3 + 57) % 128;
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        int i = 0;
        while (i <= bArr.length - bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                int i3 = (getHighSpeedVideoFpsRanges + 99) % 128;
                getOutputFormats = i3;
                if (bArr[i + i2] != bArr2[i2]) {
                    break;
                }
            }
            getHighSpeedVideoFpsRanges = (getOutputFormats + 61) % 128;
            return true;
        }
        return false;
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[2887];
        java.nio.ByteBuffer.wrap("º÷÷ï û]ð\u008eÂ;ÙtÅ¡\u008cÒ«\u000f¿¸ºõ\u008d&\u009fS\u0081\u009c@Ñd\u0006\u007f{:¨F\u001dDRV\u0087Pô')5\u009e7Ó\u0011\u0000Mu\u0015ª\r\u001fãL±\u0081ýöÎ+Ú\u0098ÁÍÅ\u0013`^t\u0089tô{'Q\u0092\\ÝZ\bU{#¦t\u0011(\\\u000e\u008f\u0000ú\u001c%\u001e\u0090¢Ãã\u000eýyË¤Ç\u0017ÕBÙ\u008d·ø£+³\u0096\u0083Ã>\u008e\u001aY\u001a$\u000f÷xB%\r%Ø(«QvCÁo\u008c[_c*)õc@\u0089\u0013\u0089ÞÅ©³t¾Ç»\u0092²]Ó(ÝûÃ\u009cuÑg\u0006x{\u007f¨K\u001deRs\u009cEÑK\u0006L{N¨j\u001dgRr\u0087pô\u0016)\u0019\u009e\u001fÓB\u0000\u0004u\u0007ª_\u001fëLø\u0081ëöÐ+Ã\u0098ÛÍÛ\u009crÑk\u0006{{\u007f¨H\u001dIÔV\u0099ON_3[àlUm\u001a\u0013ÏS¼>atÖ2\u009b\u000fH\u001a=\u0003â\u0012Wì\u0004ò\u009c`Ñl\u0006w{s¨Q\u001dERX\u0087Pô()<\u009e\u001fÓ\u0003\u0000\u0019u\u0015IK\u0004GÓ\\®X}zÈn\u0087sR{!\u0003ü\u0017K\u000f\u0006-Õ' +\u007f5Ê\u00ad\u0099óTà#\u0088þÌM×\u0018Ä×¿¢¬q¼Ì\u008c\u001cèQÐ\u0086Äû\u0083(ð\u009dôÒý\u0007ótÐ©Ý\u001eÂS¿\u0080½õª*¯\u009fKÌ[\u0001\u0001v{«a\u0018iM%\u0082\u0013÷\u001e$\u0013\u0099*Î;\u0003%p#\u009cwÑm\u0006a{i¨L\u001dCRY*ógå°à\u009cQÑX\u0006@{_¨z\u001djRt\u0087wôi)9\u009e(ÓB\u0000\u0000u\u001dª\f\u001fõLø\u0081ööÄÊû\u0087þP÷-ùþ×KÉ\u0004ÃÑÈ¢¬\u007f£¹*ô$#4^>\u008d|8dw3¢3ÑO\f_»Göb%%Pu\u008fd:Îi\u0094¤\u0099Ó¸\u000e±½´èº'È\u009cBÑA\u0006R{Y¨z\u001dhRr\u0087}ô\u0005)\u0019\u009e\u0015Ó'\u00002u$ª/\u001fËLÂ\u0081Çöè+ï\u0098ìÍ\u009c\u0002®w½¤ù\u0019\u008dN\u0082\u0083\u0081ð\u008e&m\u009baÈq\u009cBÑZ\u0006^{E¨d\u001dhRs\u0087wô\u001d)\u0019\u009e\u0014Ó,\u0000,u8ª \u001fÅLÙ\u0081Ýöà+á\u0098êÍè\u0002\u0086w\u008c¤\u0095\u0019¥N´\u0083¹ð¸&]\u009b/È\u007f=Rr\b§^\u0014SI6¾?ó> 0\u0095\u000e\u009cBÑZ\u0006^{E¨f\u001dcRb\u0087pô\u001d)\u0002\u009e\u0002Ó=\u0000.u;ª;\u001fÃLÎ\u0081Óöæ+ó\u0098\u0095ÍÕ\u0002´wî¤´\u0019\u0089N\u0098\u0083\u0081ð\u0094&j\u009bh\u009cBÑ^\u0006^{E¨h\u001dcRs\u0087{ô\u0005)p\u009e2Ó\u0011\u0000Mu\u0019ª\u0016\u001fõLâ\u0081ñöÍ+Í»qöb!u\\v\u008fO:JuO NÓ \u000e6¹/ô\u001a'\u0007R\u0006\u008d\u000f8ñkï¦þÑÉ\fÆ¿ÜêÕ%±P¥\u0083´>\u009ci\u0096¤ë×\u00ad\u0001N¼\u0016ïB\u001aqUb\u0080y3jn\u0012\u0099\u0012ÍJ\u0080YWN*LùuLo\u0003{Öo¥\u0002x\u0006Ï\u0006\u00823Q:$&û-NË\u001dÁÐÎ§äzìÉ\u0097\u009c×S¶&ìõ¶H\u008b\u001f\u009aÒ\u0083¡\u0096whÊj\u009cTÑE\u0006W{E¨b\u001diRy\u0087{ô\u001b)\u0011\u009e\u000fÓ+\u0000\"u:ª_\u001fïLâ\u0081¸öÎ+Ã\u0098ÆÍÏ\u0002®w ¤¾\u001e|Sp\u0084lùr\u0012å_ý\u0088ùõâ&Á\u0093ÄÜÅ\t×zº§¥\u0010¥]\u009a\u008e\u0089û\u009c$\u009c\u0091dÂ\u0016\u000fVxw¥-\u0016\u007fCr\u008c\u0013ù\u001a*\u0017\u0097)À+\u009cBÑZ\u0006^{E¨f\u001dyRe\u0087lô\f)\u001e\u009e\u0018Ó;\u00002u7ª0\u001fÂLÔ\u0081¸öÊ+Ù\u0098\u0095ÍÑ\u0002®w½¤ª\u0019\u0089N\u0085\u0083\u0095\u009cEÑ\\\u0006G{J¨l\u001d\fR^\u0087Môi)=\u009e2Ó\u0011\u0000\u001eu\u001dª\u0011\u001fá\u009cEÑC\u0006Z{:¨L\u001d_R\u0017\u0087Sô )#\u009e(Ó\u000b\u0000\u0003u\u0013Ðè\u009díJï7áäÕQÚ\u001eÒËÔ¸¾eµÒ¼\u009f\u0092L\u00809\u009fæ\u0095S}\u0000{ÍsºXgMÔG\u0081UNC;\u0003è\u000eUd\u0002\"Ï?¼*jÓ×Â\u0084ÜqâÙD\u0094ACC>MíyXv\u0017~Âx±\u0012l\u0019Û\u0010\u0096>E,03ï9ZÑ\tØÄÝ³än÷Ýó\u0088àG\u00902\u0088á\u009e\\·\u000b Æ¬µ¸c,Þn\u008dmx\t7MâRQA\f>û-¶1e1»9ö(!2\\.\u008fp:0u1 kÓQ\u000eL¹]ôd'qRo\u008dm\b1E2\u0092!ï*<\t\u0089\u001cÆ\u0012\u0013\u0000`\u001a½J\n[G1\u0094sán>\u007f\u008b\u0086Ø\u008b\u0015\u0085b·Ë\u0005\u0086\u0006Q\u0015,\u001eÿ=J(\u0005&Ð4£<~7Éu\u0084VW\n\"^ýQH²\u001b¥Ö¶¡\u008a|\u008a\u009cHÑ[\u0006@{O¨`\u001d~Rh\u0087}ô\u001f)\u001d\u009e\u0004Ó.\u0000$u9ª6\u001fÒL±\u0081ñöÐ+\u008a\u0098ØÍÕ\u0002´w½¤°\u0019\u008eN\u008cÉ\u009f\u0084\u008cS\u0097.\u0098ý·H©\u0007¿Òª¡È|ÊËÓ\u0086ùUó îÿáJ\u0005\u0019tÔo£\u001d~\u000eÍB\u0098\u0006Wy\"jñ}L^\u001bRÖBS\u009d\u001e\u009cÉ\u008a´\u0098g±Ò¿\u009d¬H¬;´æäQõ\u001c\u009fÏÝºÀeÑÐ(\u0083%N+9\u0019\u009c@ÑA\u0006W{:¨L\u001d_R\u0017\u0087Sô )#\u009e(Ó\u000b\u0000\u0003u\u0013\u009cQÑI\u0006J{W¨`\u001dbRc\u0087aô\u000f)\u0013\u009e\u0012ÓB\u0000\u0004u\u0007ª_\u001fëLø\u0081ëöÐ+Ã\u0098ÛÍÛ\u009cFÑX\u0006\\{E¨w\u001diRd\u0087nô\u0006)\u001e\u009e\bÓ'\u0000Mu\u001dª\f\u001f¦Lü\u0081ñöÐ+Ù\u0098ÜÍÒ\u0002 \u009cWÑA\u0006@{[\u0016ü[÷\u008cýñ\u0084\"ò\u0097áØ©\rí~\u009e£\u009d\u0014\u0096Yµ\u008a½ÿ\u00ad\u009c@Ñx\u0006c{Y¨J\u001dBRC\u0087Lô&)<\u009e{Ó\u000b\u0000\u001euTª\u0012\u001fïLâ\u0081ëöÊ+Ä\u0098Òj_'\u007fðd\u008dg^]ëS¤Cq\u000f\u0002\u001fß\u0011h\u0005%Sö\u0015\u0083\u0016\\Néúºéwú\u0000ÁÝÒnÊ;Ê\u0012\u001e_\u0004\u0088\u0015õu&\u0003\u0093\u0010ÜX\t\u001czo§l\u0010g]D\u008eLû\\M\t\u0000\u0006×\u001aª\u0003\u009cLÑA\u0006A{:¨U\u001dMRN\u0087Sô,)>\u009e/Ó$\u0000.u=ª_\u001fïLâ\u0081¸öÎ+Ã\u0098ÆÍÏ\u0002®w ¤¾?\u0094r\u009a¥\u009bØ\u0083\u000b«¾±ñ¨$ÂWö\u008aè=äpÈ£ÜÖ\u0088\tÑ¼?ï<\"1U\u0016\u0088\u0004;\fn\u0004¡;Ô{\u0007vº\u001cíZ GSR\u0085«8ºk¤\u009e\u009abí/ãøâ\u0085úVÒãÈ¬Ñy»\n\u008f×\u0091`\u009d-±þ¥\u008bñT»áO²F\u007fX\bgÕkfi39ü\u0007\u0089\u0005Z\bç °<}2\u000e<Ø\u0081eÃ6ÀÃ¤\u008càYÿêì·\u0093@\u0080\r\u009cÞ\u009cÇd\u008aj]k só[FA\tXÜ2¯\"r,Å8\u0088n[\u0013.=ñ DÚ\u0017ÒÚÚ\u00adüpãÃ¹\u0096ùY\u0098,Âÿ\u0098B¥\u0015´Ø\u00ad«¸}FÀD\u009cHÑF\u0006G{_¨w\u001dmRt\u0087\u001eô\u0006)>\u009e7Ó\u000b\u0000\u0003u\u0011ª_\u001fÖLø\u0081öö\u0083+Ø\u0098ÐÍÍ\u0002²w§¤«\u0019\u0085N\u008f\u0083Òð\u0094&w\u009b/È{=Hr[§@\u0014SI+¾+à\u000f\u00ad\u0015z\u001f\u0007\u0014Ô-aA.\u0019û\u0017\u0088gUkâ{¯\u000f|R\t\\ÖCc¾0µý§\u008a\u008bW\u0083äØ±\u0098~ù\u000b£ØùeÄ2ÕÿÌ\u008cÙZ'ç%p`=zêp\u0097{DBñ.¾vkx\u0018\bÅ\u0004r\u0014?`ì.\u0099:F/óÁ ÒmÞ\u001aøÇ¨tò!ðî\u0091\u009b\u0089H\u0089õ§¢\u00adoð\u001c¶ÊUw\r$YÑj\u009eyKbøq¥\tR\t<\u0090q\u0094¦\u0097Û\u008f\b§½²ò¦'ºTÜ\u0089ß>Êsû ùÕ\u0084\nÆ¿%ìa!%V\u001a\u008b\t8\u0016m\u0005¢y×y¾\u0093ó·$´Y¬\u008a\u0084?\u0091p\u0085¥\u0099Öÿ\u000b£¼ØñÐ\"ÇWÊ\u0088É=;n6£\rÔ3\t0ºFï\u0006 gU=\u0086g;ZlK¡RÒG\u0004¹¹»\u009c@Ñd\u0006g{\u007f¨W\u001dBRV\u0087Jô,)p\u009e\u001cÓ2\u0000\"u&ª\u001a\u001fõLá\u0081÷öÍ+Ù\u0098ÐÍ\u009c\u0002®w½¤ù\u0019\u008dN\u0082\u0083\u0081ð\u008e&m\u009baÈqz\u00937\u0097à\u0094\u009d\u008cN¤û±´¥a¹\u0012ßÏÜxË5ðæî\u0093\u0087LÅù&ªbg&\u0010\u0019Í\n~\u0015+\u0006äz\u0091z\bÇEÙ\u0092ÄïÁ<ã\u0089üÆð\u0013\u008a`´½·\nïG\u009b\u0094\u0090á\u0093>\u0098\u008b{Øk\u0015k\u009cSÑM\u0006P{U¨w\u001dhRd\u0087aô\u001a)\u0016\u009e\u0012ÓB\u0000\u0004u\u0007ª_\u001fëLø\u0081ëöÐ+Ã\u0098ÛÍÛï«¢µu¨\b\u00adÛ\u008fn\u0090!\u009cô\u0099\u0087ãZííà ÕsÇ\u0006ÈÙØl0?<ò-\u0085\u0019X\u0017ë\u001f¾dqV\u0004E×\u0001ju=zðy\u0083vU\u0095è\u0099»\u0089\u009cSÑM\u0006P{U¨w\u001dhRd\u0087aô\u001b)\u0015\u009e\u0018Ó-\u0000?u0ª \u001fÐLÐ\u0081Ôöö+ï\u0098\u0095ÍÕ\u0002´wî¤´\u0019\u0089N\u0098\u0083\u0081ð\u0094&j\u009bh³îþØ)ÙTÂ\u0087¼2Ú}Ê¨ÆÛÐ\u0006º±\u0097ü«/¤Z¢\u0085´0KcM®EÙ:\u0004r·bâa-^X8\u008b$6\u0018ar¬\bß!\tÏ´ÂçÆ\u0012þ]ø\u0088é;âf\u0088\u0091\u0090ÜÎ\u000f¢º¨å¹\u0010«CI\u008eM9\rdb\u0097~Â|\rd¸Zë\u001a\u0016\u001fAE\u008c3?>j3\u0094ÊÇÛrÅ½Ãè³^\u0007\u00131Ä0¹+jUß3\u0090#E/69ëS\\~\u0011BÂM·Kh]Ý¢\u008e¤C¬4Óé\u009bZ\u008b\u000f\u0088À·µÑfÍÛñ\u008c\u009bAò2ßä=Y)\n'ÿ\u0005°\u001deCÖ!\u008bp|e1'âgWJ\b\u0000ýF®»c®Ô·\u0089¦z\u0098/\u0086àÆ\u009cWÑa\u0006`{{¨\u0005\u001dcRs\u0087\u007fôi)\u0003\u009e.Ó\u0012\u0000\u001du\u001bª\r\u001fòLô\u0081üö\u0083+Ë\u0098ÛÍØ\u0002çw\u0089¤\u0089\u0019¯N¹\u0083\u0097ð\u008e&t\u009b`Èx=RrM§|\u0014~I\u0004¾ló> -\u0095IÊ\u001d?\u0012lñ¡þ\u0016ýKñ¸Áí\u009f\u009cQÑX\u0006@{_¨z\u001djRt\u0087wôi)9\u009e(ÓB\u0000\u0000u\u001dª\f\u001fõLø\u0081ööÄ+\u008a\u0098ôÍõ\u0002\u0083\u0016,[\u0012\u008c\tñ\u001d\"?\u0097~Ø\u007f\r\u0006~q£k\u0014vY*\u008aCÿ_ ^\u0095ÎÆ\u0091\u000b\u0091|¸¡â\u0012íGô\u0088îýï.õ\u008b\rÆ\u0001\u0011\u001dl\u0003¿Y\n3E/\u0090#ã5>_\u0089rÄN\u0017AbG½Q\b®[¨\u0096 áß<\u0097\u008f\u0087Ú\u0084\u0015»`Ñ³Á\u000eýY\u0097\u0094ÞçÓ11\u008c%ß\u0001*\u0018e\r°O\u0003\u0005^v©}ä{7m\u0082[ÝI(I{ª¶ñ\u0001¥\\ª¯\u0089ú\u009e5\u008d\u0080ñÓñ.§[\u008c\u0016\u008bÁâ¼êoÅÚ¯\u0095³@¿3©îÃYî\u0014ÒÇÝ²ÛmÍØ2\u008b4F<1Cì\u000b_\u001b\n\u0018Å'°Mc]Þa\u0089\u000bDB7Oá\u00ad\\¹\u000f\u009dú\u0084µ\u0091`ÓÓ\u0099\u008eêyá4ççñRÇ\rÕøÕ«6fmÑ9\u008c6\u007f\u0015*\u0002å\u0011Pm\u0003mþ;®\u0003ã\u00044nId\u009aJ/ `<µ0Æ&\u001bL¬aá]2RGT\u0098B-½~»³³ÄÌ\u0019\u0084ª\u0094ÿ\u00970¨EÂ\u0096Ò+î|\u0084±ÍÂÀ\u0014\"©6ú\u0012\u000f\u000b@\u001e\u0095\\&\u0018{c\u008cpÁk\u0012x§HøX\r\u001a\u009cLÑK\u0006!{+¨\u0005\u001doRs\u0087\u007fôi)\u0003\u009e.Ó\u0012\u0000\u001du\u001bª\r\u001fòLô\u0081üö\u0083+Ë\u0098ÛÍØ\u0002çw\u008d¤\u009d\u0019¡NË\u0083\u0082ð\u008f&m\u009byÈ]=DrQ§\u0013\u0014YI*¾!ó' 1\u0095\u0007Ê\u0015?\u0015lö¡\u00ad\u0016ùKö¸ÕíÂ\"Ñ\u0097\u00adÄ\u00ad9û8*u ¢*ß\u000f\f;¹3öm#)PR\u008dD:Ewy¤cÑa\u000ew»\u0085èË%\u0086R¸\u008f¤<®iæ¦ÐÓÝ\u0000Ð½éêø'æTà\u0082P\u009cPÑZ\u0006P{u¨A\u001dIR\u0017\u0087\u007fô )4\u009e\u0012Ó\f\u0000\u000bu\u001bª_\u001fëLð\u0081ööÇ+Ë\u0098ÁÍÓ\u0002µw·¤ù\u0019\u0084N\u008a\u0083\u0086ð\u009c&$\u009bbÈ\u007f=Rr[§Z\u0014TI\"¾bçòªÌ}Ö\u0000ÝÓ²fË)òüæ\u008f\u0098R\u008eå\u0080¨°{ú\u000e\u0087Ñ©dE7Gú\u000f\u008dUPTãR¶+y\u0019\f\nßNb953ø1\u008bj]ÃàÊ³ÄFå\túÜêoù»®ö\u0090!\u008a\\\u0081\u008fî:\u0097u® ºÓÄ\u000eÒ¹Üôì'¦RÛ\u008dõ8\u0019k\u001b¦SÑ\t\f\b¿\u000eêw%EPV\u0083\u0012>eiu¤u×züÔ±êfð\u001bûÈ\u0094}í2ÔçÀ\u0094¾I¨þ¦³\u0096`Ü\u0015¡Ê\u008f\u007fc,aá)\u0096sKrøt\u00ad\rb?\u0017,Ähy\u0014.\u0017ã\u0013\u0090\u0018Fì\u009cUÑz\u0006r{y¨N\u001d\u001eRr\u0087Oô<)9\u009e-Ó\u0003\u0000\u0001u\u0011ª\u0011\u001fòL±\u0081ÜöÂ+Þ\u0098ÔÍ\u009c\u0002®w½¤ù\u0019\u008eN\u0084\u0083\u0086ðÝ&t\u009b}Ès=RrM§]\u0014No\f\"#õ+\u0088 [\u0017îG¡+t\u0016\u0007eÚ`mt ZóX\u0086HYHì«¿èr\u0085\u0005\u009bØ\u0087k\u008d>Åñ÷\u0084äW ê×½ÇpÇ\u0003È\u009cUÑz\u0006r{y¨N\u001d\u001eRr\u0087Oô<)9\u009e-Ó\u0003\u0000\u0001u\u0011ª\u0011\u001fòL±\u0081ÜöÂ+Þ\u0098ÔÍ\u009c\u0002®w½¤ù\u0019\u0085N\u0086\u0083\u0082ð\u0089&}ëÙ¦çqý\föß\u0099jà%ÊðÌ\u0083õ^\u009fé¢¤\u008fw\u0084\u0002\u008dÝ\u008dhy;hö$\u0081q\\CïDºBu>\u0000 Óen\u00159\u0004ôN\u0087\u000fQ÷ìç¿ªJÍ\u0005ÆÐÊcÕ>¼É¾\u0084¿\u008eØÃæ\u0014üi÷º\u0098\u000fá@Ë\u0095Íæô;\u009e\u008c£Á\u008e\u0012\u0085g\u008c¸\u008c\rx^i\u0093%äp9B\u008aEßC\u0010?e!¶d\u000b\u0014\\\u0005\u0091Oâ\u000e4ì\u0089þÚç\u0083`Î^\u0019DdO· \u0002YMs\u0098uëL6&\u0081\u001bÌ6\u001f=j4µ4\u0000ÀSÑ\u009e\u009déÈ4ú\u0087ýÒû\u001d\u0087h\u0099»Ü\u0006¬Q½\u009c÷ï½9L\u0084Z×G\"}\u008bôÆõ\u0011ãl\u008e¿ø\nëE£\u0090äã\u0092>\u0090\u0089ÏÄ¦\u0017«b¥½¸\bW[K\u0096X°\u0098ý\u0099*\u008fWâ\u0084\u00941\u0087~Ï«\u0088Øä\u0005ä²ï\u009c@ÑA\u0006W{:¨L\u001d_R\u0017\u0087[ô$) \u009e/Ó\u001bÊ.\u00876P>-Eþ3K \u0004hÑ/¢Y\u007f[È\u0004\u0085mV`#nüsI\u009c\u001a\u0080×\u0093]ô\u0010ìÇäº\u009fiéÜú\u0093²Fõ5\u0099è\u0099_\u0092½ÄðÜ'ÔZ¯\u0089Ù<Ês\u0082¦ÎÕ±\bµ¿ºò\u008e\u009cTÑE\u0006W{:¨b\u001dIRY\u0087[ô;)1\u009e/Ó\u000b\u0000\u0002u\u001aª_\u001fïLâ\u0081¸öÍ+Å\u0098ÁÍ\u009c\u0002·w¼¤¼\u0019\u0093N\u008e\u0083\u009cð\u0089\u009cTÑE\u0006W{:¨b\u001dIRY\u0087[ô;)1\u009e/Ó\u000b\u0000\u0002u\u001aª_\u001fïLâ\u0081¸öÍ+ß\u0098ÙÍÐ\u0098±Õ \u0002²\u007fß¬\u0087\u0019¬V¼\u0083¾ðÞ-Ô\u009aÊ×î\u0004çqÿ®º\u001b\nH\u0007\u0085]ò#/\"\u009c É-\u0006[\u009cFÑM\u0006]{_¨w\u001dmRc\u0087{ô\u0016)\u0006\u009e\u001aÓ.\u0000$u0ª \u001fÓLÜ\u0081Üöü+å\u0098ûÍã\u0002\u0084w\u008a¤\u009a\u0019¶N¦$éií¾íÃò\u0010Õ¥ÖêÁ?ÐL¥\u0091·&·k\u0099¸\u0085Í\u0089\u0012\u0093§pôn9pNF\u0093J XuJº;Ï*\u001c4\u009c@ÑD\u0006D{[¨|\u001d\u007fRh\u0087yô\f)\u001e\u009e\u001eÓ0\u0000,u ª:\u001fÙLÃ\u0081Ùöí+î\u0098úÍñ\u0002\u0098w\u009b¤\u0094\u0019¤ðG½ijj\u0017tÄFqJ>\\ë\u0011\u0098\u0002E,ò&¿\u001dlB\u0019.Æ=sÍ ¾íÐ\u009aÉGËôß¡Án©\u001bµÈ¿u\u0080\"\u008aXf\u0015zÂz¿\u001elLÙg\u0096wC\u007f0\u0001íTZ\u0016\u00175Äi±>n4ÛÖ\u0088\u0095EÌ2õïë\\â\týÆ\u008d³\u009e\u009cBÑ^\u0006^{:¨h\u001dCRS\u0087[ô%)p\u009e2Ó\u0011\u0000Mu\u001aª\n\u001fêLý\u009cBÑ^\u0006^{:¨h\u001dCRS\u0087[ô%)p\u009e2Ó\u0011\u0000Mu\u0011ª\u0012\u001föLå\u0081ázB7]àD\u009dJN\u0013ûL´DaZ\u0012,Ï/x\"5\u001aæ[\u0093\u000bL\u001aù°ªégá\u0010ÁÍ\u009c~Ó+Øä´\u0091«Bªÿ\u0098¨\u0089µSøL/UR[\u0081\u00024]{U®KÝ=\u0000>·3ú\u000b)J\\\u001a\u0083\u000b6¡eø¨êßÈ\u0002Á\u009cTÑK\u0006R{\\¨\u0005\u001dZRR\u0087Lô:)9\u009e4Ó\f\u0000Mu\u001dª\f\u001f¦Lô\u0081õöÓ+Þ\u0098Ì\u00974Ú\u0000\r\u0013p\u0003£'\u0016%Yg\u008c\nÿX\"T\u0095NØ2\u000bt~w¡/\u0014\u0098G\u008e\u008a\u009cýó ª\u0093·Æ©\tÄ|Û¯Ç\u0012äGr\nFÝU EsaÆc\u0089!\\L/\u001eò\u0012E\b\btÛ2®1qiÄÞ\u0097ÒZÂ-ù¤\u0098é¬>¿C¯\u0090\u008b%\u0089jË¿¦Ìô\u0011ø¦âë\u009e8ØMÛ\u0092\u0083'?t ¹4Î\u000b\u0013\u000f\u009cEÑ[\u0006A{J¨\u0005\u001d\\RE\u0087Qô/)9\u009e7Ó\u0007\u0000Mu\u0010ª\u001e\u001fòLð\u0081¸öÊ+Ä\u0098ÃÍÝ\u0002«w§¤½\u0019Î>Osy¤xÙc\n\u001d¿{ðk%gVq\u008b&<,q\u000e¢U×?\b\u0012½îîù#ïTÉ\u0089Æ:ÈoÀ ÿÕ·\u0006¯»\u009cìÓ!ºRµ\u0084O9Rj.\u009f\u007fÐs\u0005b¶\u0002ë.\u001c<Q \u008237\u001dh\f\u009dCÎô\u0003ú´øé§\u001aÍOÜ\u0080Ð5«f½\u009b¿Ì°\u0001ß²¹ç¥\u0019YJ3ÿc0ve\u001c\u0096ZËG|*±#â\"\u0017,H\u001aýZ\u009cUÑ\\\u0006C{S¨\u0005\u001dAR^\u0087Mô:)9\u009e5Ó\u0005\u0000Mu=ª\u0011\u001fòLô\u0081êöÂ+É\u0098\u009aÍÿ\u0002\u0097w\u008f¤\u009a\u0019¥NË\u0083¢ð\u0099&k\u009bcÈ8\u009cUÑ\\\u0006Z{:¨H\u001dERD\u0087Mô )>\u009e<ÓB\u0000$u\u001aª\u000b\u001fãLã\u0081ùöÀ+\u0085\u0098öÍì\u0002\u0086w\u008d¤\u009c\u0019ÀN»\u0083\u0096ð\u0092&h\u009b!\u009cUÑ\\\u0006G{:¨H\u001dERD\u0087Mô )>\u009e<ÓB\u0000$u\u001aª\u000b\u001fãLã\u0081ùöÀ+\u0085\u0098öÍì\u0002\u0086w\u008d¤\u009c\u0019ÀN»\u0083\u0096ð\u0092&h\u009b!\u009cLÑ\\\u0006Z{:¨H\u001dERD\u0087Mô )>\u009e<ÓB\u0000$u\u001aª\u000b\u001fãLã\u0081ùöÀ+\u0085\u0098öÍì\u0002\u0086w\u008d¤\u009c\u0019ÀN»\u0083\u0096ð\u0092&h\u009b!\u009dDÐM\u0007Kz+©D\u001cOSC\u0086\\õ=(/\u009f>ÒS\u0001\u0015t\u000b«N\u001eÇMõ\u0080û÷×*\u009b\u0099ôÌÉ\u0003¹v³¥æ\u009cUÑ\\\u0006G{:¨U\u001d^RR\u0087Mô,)>\u009e/ÓB\u0000\u0004u\u001aª_\u001fÖLä\u0081êöÆ+ú\u0098ÑÍÓ\u0002«wà\u009cLÑ\\\u0006Z{:¨U\u001d^RR\u0087Mô,)>\u009e/ÓB\u0000\u0004u\u001aª_\u001fÖLä\u0081êöÆ+\u008a\u0098åÍØ\u0002¨w¢¤÷".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2887);
        getInputSizeshNQ4ISI = cArr;
        getHighSpeedVideoSizes = 4104711044385329416L;
    }
}
