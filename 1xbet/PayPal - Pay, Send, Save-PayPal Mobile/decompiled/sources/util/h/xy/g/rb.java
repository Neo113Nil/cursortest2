package util.h.xy.g;

/* loaded from: classes5.dex */
final class rb {
    public static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static int getInputFormats = 0;
    private static char[] getInputSizeshNQ4ISI = null;
    private static char[] getOutputFormats = null;
    private static long getOutputMinFrameDuration = 0;
    private static int getOutputStallDuration = 1;

    rb() {
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = "rb";
        int i = getHighSpeedVideoFpsRangesFor + 111;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static util.h.xy.g.b Camera2StreamConfigurationMap(java.lang.String str) {
        int intValue;
        int i;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.view.View.resolveSize(0, 0), android.view.ViewConfiguration.getTouchSlop() >> 8, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14998), objArr);
            util.h.xy.s.a.b m25007 = util.h.xy.al.ma.m25007(jSONObject.getString(((java.lang.String) objArr[0]).intern()));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            boolean optBoolean = jSONObject.optBoolean(((java.lang.String) objArr2[0]).intern(), false);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u0082\u008e\u008d\u0089\u008c\u008b\u008b", objArr3);
            java.lang.String string = jSONObject.getString(((java.lang.String) objArr3[0]).intern());
            getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 97) % 128;
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 127, "\u008c\u0090\u008d\u0085\u008f\u008a\u0082\u0086", objArr4);
                util.h.xy.g.a highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(jSONObject.getJSONArray(((java.lang.String) objArr4[0]).intern()));
                if (util.h.xy.s.a.b.f2298 != m25007) {
                    if (util.h.xy.s.a.b.f2296 == m25007) {
                        return new util.h.xy.g.mc(string, highSpeedVideoFpsRangesFor);
                    }
                    if (util.h.xy.s.a.b.f2297 != m25007) {
                        return null;
                    }
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u008c\u008a\u0083\u0090\u008e\u0089\u0083", objArr5);
                    util.h.xy.s.f[] highSpeedVideoSizes = getHighSpeedVideoSizes(jSONObject.getJSONArray(((java.lang.String) objArr5[0]).intern()));
                    int i2 = getHighSpeedVideoFpsRangesFor + 101;
                    getOutputStallDuration = i2 % 128;
                    try {
                        if (i2 % 2 == 0) {
                            java.lang.Object[] objArr6 = new java.lang.Object[0];
                            objArr6[1] = "";
                            java.lang.Class<?> cls = java.lang.Class.forName("android.os.Process");
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[1] = java.lang.String.class;
                            intValue = ((java.lang.Integer) cls.getMethod("getGidForName", clsArr).invoke(null, objArr6)).intValue() + 4;
                            i = 120;
                        } else {
                            intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 4;
                            i = 7;
                        }
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(intValue, i + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr7);
                            byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr7[0]).intern()));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0085\u0090\u0082\u008c\u0083\u0089\u0095", objArr8);
                            return new util.h.xy.g.ma(string, highSpeedVideoFpsRangesFor, m25076, highSpeedVideoSizes, jSONObject.optString(((java.lang.String) objArr8[0]).intern()));
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
                }
                getOutputStallDuration = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u008c\u008a\u0083\u0090\u008e\u0089\u0083", objArr9);
                util.h.xy.s.f[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(jSONObject.getJSONArray(((java.lang.String) objArr9[0]).intern()));
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.graphics.Color.argb(0, 0, 0, 0) + 3, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
                byte[] m250762 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr10[0]).intern()));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, android.view.View.MeasureSpec.getSize(0) + 9, (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr11);
                byte[] m250763 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr11[0]).intern()));
                if (optBoolean) {
                    return new util.h.xy.g.mb(string, highSpeedVideoFpsRangesFor, m250762, highSpeedVideoSizes2, m250763);
                }
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.indexOf("", ""), "\u0088\u008d\u0086", objArr12);
                byte[] m250764 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr12[0]).intern()));
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 43) % 128;
                try {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(indexOf + 4, 26 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 49176), objArr13);
                    byte[] m250765 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr13[0]).intern()));
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, "\u0092\u0091\u0088\u008d\u0086", objArr14);
                    byte[] m250766 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr14[0]).intern()));
                    try {
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(5 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 30 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr15);
                        byte[] m250767 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr15[0]).intern()));
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0082\u008b\u0093\u0093\u008a", objArr16);
                        byte[] m250768 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr16[0]).intern()));
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(8 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 26057), objArr17);
                        byte[] m250769 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr17[0]).intern()));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.indexOf("", "", 0, 0), "\u0096\u0081\u0095\u008e\u0094\u008e\u0086\u0082\u008e", objArr18);
                        return new util.h.xy.g.rc(string, highSpeedVideoFpsRangesFor, m250762, highSpeedVideoSizes2, m250765, m250764, m250767, m250766, m250763, m250768, m250769, util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr18[0]).intern())));
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
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
        e.getMessage();
        return null;
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static util.h.xy.g.a getHighSpeedVideoFpsRangesFor(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.lang.String str;
        util.h.xy.g.a.ma highSpeedVideoFpsRangesFor = util.h.xy.g.a.getHighSpeedVideoFpsRangesFor();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "\u0083\u0095\u008e", objArr);
            java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
            byte[] bArr = new byte[0];
            try {
                bArr = util.h.xy.ar.b.m25076(string);
                getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 61) % 128;
            } catch (java.lang.Exception unused) {
            }
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(13 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 44, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr2);
                str = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
                getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 79) % 128;
            } catch (org.json.JSONException unused2) {
                str = null;
            }
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(13 - android.graphics.Color.argb(0, 0, 0, 0), android.graphics.Color.blue(0) + 57, (char) (android.view.View.getDefaultSize(0, 0) + 12402), objArr3);
            if (jSONObject.has(((java.lang.String) objArr3[0]).intern())) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(13 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57, (char) (12402 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr4);
                java.lang.String string2 = jSONObject.getString(((java.lang.String) objArr4[0]).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes(2 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 70, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9497), objArr5);
                if (string2.equals(((java.lang.String) objArr5[0]).intern())) {
                    int i2 = getHighSpeedVideoFpsRangesFor + 5;
                    getOutputStallDuration = i2 % 128;
                    if (i2 % 2 != 0) {
                        lockStatus = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED;
                    } else {
                        com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus2 = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED;
                        throw null;
                    }
                }
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(13 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 57 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 12402), objArr6);
                jSONObject.getString(((java.lang.String) objArr6[0]).intern());
            }
            util.h.xy.g.ra.ma m26873 = util.h.xy.g.ra.m26873();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - android.text.TextUtils.indexOf("", "", 0, 0), 72 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
            util.h.xy.g.ra.ma m26882 = m26873.m26882(util.h.xy.al.ma.m25008(jSONObject.getString(((java.lang.String) objArr7[0]).intern())));
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.KeyEvent.normalizeMetaState(0) + 3, 80 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58457), objArr8);
            util.h.xy.g.ra.ma m26883 = m26882.m26884(jSONObject.getString(((java.lang.String) objArr8[0]).intern())).m26883(lockStatus);
            try {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 127, "\u0082\u008e\u0098\u0093\u0085\u0089\u0081\u0097\u0086\u008b", objArr9);
                util.h.xy.g.ra.ma m26881 = m26883.m26886(jSONObject.getString(((java.lang.String) objArr9[0]).intern())).m26881(str);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0089\u008c\u0085\u0090\u008b\u008c\u0089\u009a\u0090\u008b\u0099", objArr10);
                highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(m26881.m26887(jSONObject.getString(((java.lang.String) objArr10[0]).intern())).m26885(bArr).getHighSpeedVideoSizes());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 25;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (!getHighSpeedVideoSizesFor) {
            if (!getHighSpeedVideoFpsRanges) {
                throw null;
            }
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 59;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
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

    static java.lang.String getHighSpeedVideoFpsRanges(util.h.xy.g.b bVar) {
        bVar.mo26866();
        bVar.mo26865();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = null;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - android.text.TextUtils.indexOf("", "", 0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14999), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), bVar.mo26865().toString());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), bVar instanceof util.h.xy.g.mb);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0082\u008e\u008d\u0089\u008c\u008b\u008b", objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), bVar.mo26866());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u008c\u0090\u008d\u0085\u008f\u008a\u0082\u0086", objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), Camera2StreamConfigurationMap(bVar.mo26864()));
            if (util.h.xy.s.a.b.f2297 != bVar.mo26865() || !(bVar instanceof util.h.xy.g.ma)) {
                if (util.h.xy.s.a.b.f2298 == bVar.mo26865() && (bVar instanceof util.h.xy.g.rc)) {
                    util.h.xy.g.rc rcVar = (util.h.xy.g.rc) bVar;
                    java.lang.String m25074 = util.h.xy.ar.b.m25074(rcVar.m26894());
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(3 - android.graphics.Color.red(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr5);
                    jSONObject.put(((java.lang.String) objArr5[0]).intern(), m25074);
                    jSONObject.put(util.h.xy.s.ma.f2373, Camera2StreamConfigurationMap(rcVar.m26896()));
                    byte[] m26888 = rcVar.m26888();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0088\u008d\u0086", objArr6);
                    jSONObject.put(((java.lang.String) objArr6[0]).intern(), util.h.xy.ar.b.m25074(m26888));
                    byte[] m26895 = rcVar.m26895();
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 3, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, (char) (49177 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr7);
                    jSONObject.put(((java.lang.String) objArr7[0]).intern(), util.h.xy.ar.b.m25074(m26895));
                    byte[] m26889 = rcVar.m26889();
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0092\u0091\u0088\u008d\u0086", objArr8);
                    jSONObject.put(((java.lang.String) objArr8[0]).intern(), util.h.xy.ar.b.m25074(m26889));
                    byte[] m26890 = rcVar.m26890();
                    try {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(5 - android.widget.ExpandableListView.getPackedPositionType(0L), 29 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr9);
                        jSONObject.put(((java.lang.String) objArr9[0]).intern(), util.h.xy.ar.b.m25074(m26890));
                        byte[] m26897 = rcVar.m26897();
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 18, android.widget.ExpandableListView.getPackedPositionChild(0L) + 10, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr10);
                        jSONObject.put(((java.lang.String) objArr10[0]).intern(), util.h.xy.ar.b.m25074(m26897));
                        byte[] m26893 = rcVar.m26893();
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.normalizeMetaState(0) + 127, "\u0082\u008b\u0093\u0093\u008a", objArr11);
                        jSONObject.put(((java.lang.String) objArr11[0]).intern(), util.h.xy.ar.b.m25074(m26893));
                        byte[] m26891 = rcVar.m26891();
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.graphics.Color.rgb(0, 0, 0) + 16777225, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 35, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26056), objArr12);
                        jSONObject.put(((java.lang.String) objArr12[0]).intern(), util.h.xy.ar.b.m25074(m26891));
                        byte[] m26892 = rcVar.m26892();
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.argb(0, 0, 0, 0), "\u0096\u0081\u0095\u008e\u0094\u008e\u0086\u0082\u008e", objArr13);
                        jSONObject.put(((java.lang.String) objArr13[0]).intern(), util.h.xy.ar.b.m25074(m26892));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            } else {
                getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 17) % 128;
                util.h.xy.g.ma maVar = (util.h.xy.g.ma) bVar;
                java.lang.String m250742 = util.h.xy.ar.b.m25074(maVar.m26872());
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0, 0) + 3, 5 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr14);
                jSONObject.put(((java.lang.String) objArr14[0]).intern(), m250742);
                jSONObject.put(util.h.xy.s.ma.f2373, Camera2StreamConfigurationMap(maVar.m26871()));
                java.lang.String m26870 = maVar.m26870();
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u0085\u0090\u0082\u008c\u0083\u0089\u0095", objArr15);
                jSONObject.put(((java.lang.String) objArr15[0]).intern(), m26870);
            }
            str = jSONObject.toString();
        } catch (org.json.JSONException e) {
            e.getMessage();
        }
        int i = getHighSpeedVideoFpsRangesFor + 29;
        getOutputStallDuration = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static org.json.JSONArray Camera2StreamConfigurationMap(util.h.xy.s.f[] fVarArr) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int length = fVarArr.length;
        int i = 0;
        while (i < length) {
            util.h.xy.s.f fVar = fVarArr[i];
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            byte[] bArr = {fVar.m27207()};
            byte[] bArr2 = {(byte) (((fVar.m27208() << 3) | 4) & 255)};
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(12 - android.graphics.Color.argb(0, 0, 0, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 82, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), util.h.xy.ar.b.m25074(bArr));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0082\u008d\u008c", objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), util.h.xy.ar.b.m25074(bArr2));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 94 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), util.h.xy.ar.b.m25074(fVar.m27210()));
            jSONArray.put(jSONObject);
            i++;
            int i2 = getHighSpeedVideoFpsRangesFor + 15;
            getOutputStallDuration = i2 % 128;
            int i3 = i2 % 2;
        }
        jSONArray.length();
        return jSONArray;
    }

    private static org.json.JSONArray Camera2StreamConfigurationMap(util.h.xy.g.a aVar) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.ArrayList<util.h.xy.g.ra> arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = aVar.getHighResolutionOutputSizeshNQ4ISI.keySet().iterator();
        while (it.hasNext()) {
            util.h.xy.g.a.getHighSpeedVideoFpsRangesFor = (util.h.xy.g.a.getHighSpeedVideoSizes + 47) % 128;
            arrayList.add(aVar.getHighResolutionOutputSizeshNQ4ISI.get(it.next()));
        }
        util.h.xy.g.a.getHighSpeedVideoSizes = (util.h.xy.g.a.getHighSpeedVideoFpsRangesFor + 103) % 128;
        for (util.h.xy.g.ra raVar : arrayList) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, android.graphics.Color.blue(0) + 79, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58457), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), raVar.m26877());
            if (raVar.m26879() != com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, android.view.Gravity.getAbsoluteGravity(0, 0) + 57, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 12402), objArr2);
                jSONObject.put(((java.lang.String) objArr2[0]).intern(), util.h.xy.ar.b.m25074(new byte[]{1}));
                getOutputStallDuration = (getHighSpeedVideoFpsRangesFor + 11) % 128;
            } else {
                getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 117) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(13 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 57 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12402), objArr3);
                jSONObject.put(((java.lang.String) objArr3[0]).intern(), util.h.xy.ar.b.m25074(new byte[]{0}));
            }
            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            getOutputStallDuration = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(7 - trimmedLength, packedPositionGroup + 72, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr4);
                jSONObject.put(((java.lang.String) objArr4[0]).intern(), raVar.m26875().toString());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u0082\u008e\u0098\u0093\u0085\u0089\u0081\u0097\u0086\u008b", objArr5);
                jSONObject.put(((java.lang.String) objArr5[0]).intern(), raVar.m26876());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoSizes(13 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr6);
                jSONObject.put(((java.lang.String) objArr6[0]).intern(), raVar.m26880());
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.blue(0), "\u0089\u008c\u0085\u0090\u008b\u008c\u0089\u009a\u0090\u008b\u0099", objArr7);
                jSONObject.put(((java.lang.String) objArr7[0]).intern(), raVar.m26874());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u0083\u0095\u008e", objArr8);
                jSONObject.put(((java.lang.String) objArr8[0]).intern(), util.h.xy.ar.b.m25074(raVar.m26878()));
                jSONArray.put(jSONObject);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return jSONArray;
    }

    static util.h.xy.g.b getHighSpeedVideoFpsRanges(util.h.xy.s.re reVar) {
        int i = getOutputStallDuration + 113;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            reVar.m27376().m27066();
            util.h.xy.s.c m27371 = reVar.m27371();
            java.lang.String m25074 = util.h.xy.ar.b.m25074(m27371.m27097());
            util.h.xy.g.a highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(reVar);
            if (util.h.xy.s.a.b.f2298 != reVar.m27376().m27066()) {
                if (util.h.xy.s.a.b.f2296 == reVar.m27376().m27066()) {
                    return new util.h.xy.g.mc(m25074, highSpeedVideoFpsRangesFor);
                }
                if (util.h.xy.s.a.b.f2297 != reVar.m27376().m27066()) {
                    return null;
                }
                return new util.h.xy.g.ma(m25074, highSpeedVideoFpsRangesFor, reVar.m27371().m27147(), reVar.m27371().m27133(), reVar.m27383());
            }
            getOutputStallDuration = (getHighSpeedVideoFpsRangesFor + 117) % 128;
            if (reVar.m27375()) {
                return new util.h.xy.g.mb(m25074, highSpeedVideoFpsRangesFor, m27371.m27147(), m27371.m27133(), m27371.m27119());
            }
            return new util.h.xy.g.rc(m25074, highSpeedVideoFpsRangesFor, m27371.m27147(), m27371.m27133(), m27371.m27126(), m27371.m27129(), m27371.m27165(), m27371.m27081(), m27371.m27119(), m27371.m27177(), m27371.m27182(), m27371.m27131());
        }
        reVar.m27376().m27066();
        util.h.xy.ar.b.m25074(reVar.m27371().m27097());
        getHighSpeedVideoFpsRangesFor(reVar);
        util.h.xy.s.a.b bVar = util.h.xy.s.a.b.f2298;
        reVar.m27376().m27066();
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [util.h.xy.g.a$ma] */
    private static util.h.xy.g.a getHighSpeedVideoFpsRangesFor(util.h.xy.s.re reVar) {
        java.util.Map<java.lang.String, com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus> map;
        com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus;
        java.lang.String str;
        util.h.xy.s.ra raVar;
        int i = getOutputStallDuration + 17;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.g.a.ma maVar = i % 2;
        try {
            if (maVar == 0) {
                maVar = util.h.xy.g.a.getHighSpeedVideoFpsRangesFor();
                util.h.xy.s.c m27371 = reVar.m27371();
                raVar = m27371.m27113();
                Camera2StreamConfigurationMap(raVar);
                str = util.h.xy.ar.b.m25074(raVar.m27274());
                lockStatus = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
                map = util.h.xy.d.mb.m26184(m27371.m27145());
            } else {
                maVar = util.h.xy.g.a.getHighSpeedVideoFpsRangesFor();
                util.h.xy.s.c m273712 = reVar.m27371();
                raVar = m273712.m27113();
                Camera2StreamConfigurationMap(raVar);
                str = util.h.xy.ar.b.m25074(raVar.m27274());
                lockStatus = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
                map = util.h.xy.d.mb.m26184(m273712.m27145());
                try {
                    throw null;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            map = null;
        }
        if (map != null && !map.isEmpty()) {
            lockStatus = map.get(str);
            for (java.util.Map.Entry<java.lang.String, com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus> entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
        util.h.xy.g.ra.ma m26881 = util.h.xy.g.ra.m26873().m26882(util.h.xy.g.ra.EnumC0269ra.f2220).m26885(raVar.m27281()).m26884(str).m26883(lockStatus).m26886(util.h.xy.ar.b.m25074(raVar.m27284())).m26881(util.h.xy.ar.b.m25074(raVar.m27276()));
        if (util.h.xy.s.a.b.f2296 == reVar.m27376().m27066()) {
            m26881.m26887("");
        } else {
            m26881.m26887(util.h.xy.ar.b.m25074(raVar.m27278()));
        }
        util.h.xy.ar.b.m25074(raVar.m27278());
        util.h.xy.g.ra highSpeedVideoSizes = m26881.getHighSpeedVideoSizes();
        maVar.Camera2StreamConfigurationMap(highSpeedVideoSizes);
        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
        util.h.xy.ar.b.m25074(raVar.m27274());
        util.h.xy.s.ra m27168 = reVar.m27371().m27168();
        if (m27168 != null && m27168.m27284().length > 0 && m27168.m27274().length > 0) {
            Camera2StreamConfigurationMap(m27168);
            java.lang.String m25074 = util.h.xy.ar.b.m25074(m27168.m27274());
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus2 = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
            if (map != null && !map.isEmpty()) {
                getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 115) % 128;
                lockStatus2 = map.get(m25074);
            }
            util.h.xy.g.ra.ma m268812 = util.h.xy.g.ra.m26873().m26882(util.h.xy.g.ra.EnumC0269ra.f2219).m26885(m27168.m27281()).m26884(m25074).m26883(lockStatus2).m26886(util.h.xy.ar.b.m25074(m27168.m27284())).m26881(util.h.xy.ar.b.m25074(m27168.m27276()));
            if (util.h.xy.s.a.b.f2296 == reVar.m27376().m27066()) {
                m268812.m26887("");
            } else {
                m268812.m26887(util.h.xy.ar.b.m25074(m27168.m27278()));
            }
            util.h.xy.g.ra highSpeedVideoSizes2 = m268812.getHighSpeedVideoSizes();
            maVar.Camera2StreamConfigurationMap(highSpeedVideoSizes2);
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes2);
            util.h.xy.ar.b.m25074(m27168.m27274());
        }
        if (reVar.m27371().m27157() != null) {
            int i2 = getOutputStallDuration + 43;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                int length = reVar.m27371().m27157().length;
                throw null;
            }
            if (reVar.m27371().m27157().length > 0) {
                for (util.h.xy.s.ra raVar2 : reVar.m27371().m27157()) {
                    util.h.xy.ar.b.m25074(raVar2.m27274());
                    Camera2StreamConfigurationMap(raVar2);
                    java.lang.String m250742 = util.h.xy.ar.b.m25074(raVar2.m27274());
                    com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus3 = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
                    if (map != null && !map.isEmpty()) {
                        lockStatus3 = map.get(m250742);
                    }
                    util.h.xy.g.ra.ma m268813 = util.h.xy.g.ra.m26873().m26882(util.h.xy.g.ra.EnumC0269ra.f2218).m26885(raVar2.m27281()).m26884(util.h.xy.ar.b.m25074(raVar2.m27274())).m26883(lockStatus3).m26886(util.h.xy.ar.b.m25074(raVar2.m27284())).m26881(util.h.xy.ar.b.m25074(raVar2.m27276()));
                    if (util.h.xy.s.a.b.f2296 == reVar.m27376().m27066()) {
                        getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 117) % 128;
                        m268813.m26887("");
                    } else {
                        m268813.m26887(util.h.xy.ar.b.m25074(raVar2.m27278()));
                    }
                    util.h.xy.g.ra highSpeedVideoSizes3 = m268813.getHighSpeedVideoSizes();
                    getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes3);
                    maVar.Camera2StreamConfigurationMap(highSpeedVideoSizes3);
                }
            }
        }
        return maVar.getHighSpeedVideoFpsRangesFor();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.g.ra raVar) {
        if (raVar.m26878() != null) {
            util.h.xy.ar.b.m25074(raVar.m26878());
            int i = getOutputStallDuration + 97;
            getHighSpeedVideoFpsRangesFor = i % 128;
            int i2 = i % 2;
        }
        if (raVar.m26877() != null) {
            raVar.m26877();
        }
        if (raVar.m26879() != null) {
            getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 95) % 128;
            raVar.m26879();
        }
        if (raVar.m26876() != null) {
            raVar.m26876();
            getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 11) % 128;
        }
        if (raVar.m26880() != null) {
            raVar.m26880();
        }
        if (raVar.m26874() != null) {
            raVar.m26874();
        }
        if (raVar.m26875() != null) {
            raVar.m26875();
        }
    }

    private static void Camera2StreamConfigurationMap(util.h.xy.s.ra raVar) {
        int i = getHighSpeedVideoFpsRangesFor + 45;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            raVar.m27281();
            throw null;
        }
        if (raVar.m27281() != null) {
            getHighSpeedVideoFpsRangesFor = (getOutputStallDuration + 91) % 128;
            util.h.xy.ar.b.m25074(raVar.m27281());
        }
        if (raVar.m27274() != null) {
            util.h.xy.ar.b.m25074(raVar.m27274());
        }
        if (raVar.m27284() != null) {
            util.h.xy.ar.b.m25074(raVar.m27284());
        }
        if (raVar.m27278() != null) {
            int i2 = getHighSpeedVideoFpsRangesFor + 77;
            getOutputStallDuration = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.ar.b.m25074(raVar.m27278());
            } else {
                util.h.xy.ar.b.m25074(raVar.m27278());
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static util.h.xy.s.f[] getHighSpeedVideoSizes(org.json.JSONArray jSONArray) throws org.json.JSONException {
        jSONArray.length();
        try {
            try {
                util.h.xy.s.f[] fVarArr = new util.h.xy.s.f[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    fVarArr[i] = new util.h.xy.s.f();
                    org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 83, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
                    byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr[0]).intern()));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0082\u008d\u008c", objArr2);
                    byte[] m250762 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 94, (char) android.view.View.combineMeasuredStates(0, 0), objArr3);
                        byte[] m250763 = util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr3[0]).intern()));
                        fVarArr[i].m27209(m25076);
                        fVarArr[i].m27212(m250762);
                        fVarArr[i].m27213(m250763);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                return fVarArr;
            } catch (org.json.JSONException unused) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 15, 105 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 22168), objArr4);
                throw new org.json.JSONException(((java.lang.String) objArr4[0]).intern());
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputSizeshNQ4ISI = new char[]{42725, 47820, 40588, 62040, 54815, 11246, 40040, 32857, 42007, 40032, 32840, 41987, 51398, 60556, 4479, 13622, 23034, 32160, 25199, 34389, 43569, 52930, 62090, 5995, 15140, 24574, 17316, 23672, 16457, 25627, 40032, 32849, 41987, 51429, 60580, 63915, 58776, 49627, 44288, 35187, 29878, 20712, 15402, 6194, 40044, 32849, 41985, 51450, 60548, 4453, 13626, 23019, 32167, 25204, 34429, 43537, 52932, 44050, 45091, 37989, 63636, 56568, 8461, 1358, 27055, 19919, 21011, 46653, 39541, 65196, 47400, 42257, 40032, 32849, 42007, 51454, 60572, 4460, 13618, 30778, 25611, 16461, 40051, 32861, 42000, 51397, 60567, 4472, 13593, 23035, 32164, 25186, 34398, 43520, 40051, 32861, 42000, 51397, 60567, 4472, 13569, 23023, 32165, 25205, 34398, 51916, 54990, 62094, 40522, 47629, 18401, 25516, 3938, 11060, 13564, 53379, 64654, 38996, 41992, 16870};
        getOutputMinFrameDuration = -1682572107767513032L;
        getOutputFormats = new char[]{64259, 64263, 64270, 64315, 64258, 64287, 64286, 64256, 64283, 64280, 64268, 64265, 64282, 64281, 64295, 64269, 64301, 64319, 64264, 64285, 64266, 64335, 64247, 64314, 64261, 64302};
        getInputFormats = -1074857092;
        getHighSpeedVideoFpsRanges = true;
        getHighSpeedVideoSizesFor = true;
    }
}
