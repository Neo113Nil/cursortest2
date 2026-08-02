package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class e {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static long getInputFormats = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static char[] getOutputFormats = null;
    private static int getOutputMinFrameDuration = 1;
    private static byte[] getOutputSizeshNQ4ISI;
    private static int getOutputStallDurationlomOqCM;
    private final util.h.xy.cq.me getOutputSizes;

    static {
        Camera2StreamConfigurationMap();
        getInputSizeshNQ4ISI = util.h.xy.cq.e.class.getName();
        Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 115) % 128;
    }

    e(util.h.xy.cq.me meVar) {
        this.getOutputSizes = meVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.cj.mb m26003() throws util.h.xy.ck.rc {
        util.h.xy.cn.ma m25980;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(packedPositionType + 13, android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        hashMap.put(((java.lang.String) objArr[0]).intern(), highSpeedVideoSizes);
        util.h.xy.ci.ra m25931 = util.h.xy.ci.ra.m25931();
        byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1105);
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(6 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 13 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2);
            sb.append(new java.lang.String(m25933, ((java.lang.String) objArr2[0]).intern()));
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            try {
                long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(16 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), 19 - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), (char) (33711 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                java.lang.String obj = sb.toString();
                util.h.xy.cn.mb mbVar = new util.h.xy.cn.mb();
                byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1106);
                if (!util.h.xy.cv.ra.m26070(m259332)) {
                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(6 - (uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)), 13 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4);
                    java.lang.String str2 = new java.lang.String(m259332, ((java.lang.String) objArr4[0]).intern());
                    int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(4 - (keyRepeatDelay >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), objArr5);
                    m25980 = mbVar.m25980(obj, null, null, ((java.lang.String) objArr5[0]).intern(), hashMap, java.lang.Integer.parseInt(str2));
                } else {
                    int i = Camera2StreamConfigurationMap + 35;
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 != 0) {
                        int indexOf = android.text.TextUtils.indexOf("", "", 0);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(4 - indexOf, 33 - android.text.TextUtils.indexOf("", ""), (char) android.view.KeyEvent.keyCodeFromString(""), objArr6);
                        str = (java.lang.String) objArr6[0];
                    } else {
                        int indexOf2 = android.text.TextUtils.indexOf("", "", 0);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(3 - indexOf2, 85 - android.text.TextUtils.indexOf("", ""), (char) android.view.KeyEvent.keyCodeFromString(""), objArr7);
                        str = (java.lang.String) objArr7[0];
                    }
                    m25980 = mbVar.m25981(obj, null, null, str.intern(), hashMap);
                    Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 49) % 128;
                }
                return getHighSpeedVideoSizes(this.getOutputSizes, m25980);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e.getMessage(), e);
        } catch (util.h.xy.cn.b e2) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e2.getMessage(), e2);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static java.lang.String getHighSpeedVideoSizes() throws util.h.xy.ck.rc {
        try {
            util.h.xy.ci.ra m25931 = util.h.xy.ci.ra.m25931();
            byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1107);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getTrimmedLength("") + 5, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 14, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
            java.lang.String str = new java.lang.String(m25933, ((java.lang.String) objArr[0]).intern());
            byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1104);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(5 - android.text.TextUtils.getOffsetAfter("", 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, (char) android.view.View.MeasureSpec.getMode(0), objArr2);
            java.lang.String str2 = new java.lang.String(m259332, ((java.lang.String) objArr2[0]).intern());
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getCapsMode("", 0, 0) + 5, android.graphics.Color.red(0) + 37, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr3);
            hashMap.put(((java.lang.String) objArr3[0]).intern(), str);
            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
            int i = Camera2StreamConfigurationMap + 75;
            getOutputMinFrameDuration = i % 128;
            try {
                int intValue = i % 2 == 0 ? 42 >>> (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >>> 74) : (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 42;
                getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 51) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(18 - (scrollDefaultDelay >> 16), intValue, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr4);
                    hashMap.put(((java.lang.String) objArr4[0]).intern(), str2);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 13, 60 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (32664 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr5);
                    java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(1870354213 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (short) android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.MotionEvent.axisFromString("") - 88, 241104381 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr6);
                        hashMap.put(intern, ((java.lang.String) objArr6[0]).intern());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(6 - android.graphics.Color.blue(0), 73 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
                        sb.append(((java.lang.String) objArr7[0]).intern());
                        sb.append(util.h.xy.cq.b.getHighSpeedVideoFpsRanges(new java.util.HashMap(hashMap)));
                        return sb.toString();
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
        } catch (java.io.UnsupportedEncodingException e) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, e.getMessage(), e);
        }
    }

    private static util.h.xy.cj.mb getHighSpeedVideoSizes(util.h.xy.cq.me meVar, util.h.xy.cn.ma maVar) throws java.io.IOException, util.h.xy.ck.rc {
        int m25977 = maVar.m25977();
        byte[] m25976 = maVar.m25976();
        if (m25977 / 100 == 2) {
            int i = getOutputMinFrameDuration + 107;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                if (util.h.xy.cv.ra.m26070(m25976)) {
                    util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1870354216, (short) ((-1) - android.view.MotionEvent.axisFromString("")), (byte) android.view.KeyEvent.getDeadChar(0, 0), (-89) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 241104402 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
                    throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr[0]).intern());
                }
                java.util.Map<java.lang.String, java.lang.String> highResolutionOutputSizeshNQ4ISI = util.h.xy.cq.b.getHighResolutionOutputSizeshNQ4ISI(m25976);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(15 - android.graphics.Color.blue(0), 79 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 63345), objArr2);
                long parseLong = java.lang.Long.parseLong(highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr2[0]).intern()));
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.argb(0, 0, 0, 0) + 11, 94 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (4754 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr3);
                    java.lang.String str = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr3[0]).intern());
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1870354268, (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) - 89, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 241104433, objArr4);
                    java.lang.String str2 = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr4[0]).intern());
                    meVar.m26010(parseLong);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.view.View.resolveSizeAndState(0, 0, 0) + 5, 13 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.Color.green(0), objArr5);
                    meVar.m26007(str.getBytes(((java.lang.String) objArr5[0]).intern()));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(5 - android.text.TextUtils.indexOf("", "", 0), 12 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.graphics.Color.blue(0), objArr6);
                    meVar.m26017(str2.getBytes(((java.lang.String) objArr6[0]).intern()));
                    util.h.xy.cj.mb mbVar = new util.h.xy.cj.mb(m25977, null, null);
                    int i2 = getOutputMinFrameDuration + 79;
                    Camera2StreamConfigurationMap = i2 % 128;
                    if (i2 % 2 == 0) {
                        return mbVar;
                    }
                    throw null;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            util.h.xy.cv.ra.m26070(m25976);
            throw new java.lang.ArithmeticException();
        }
        return util.h.xy.cq.b.Camera2StreamConfigurationMap(m25977, m25976);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r3 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        if (r3 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        boolean z;
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
        boolean z2 = i6 == -1;
        if (z2) {
            int i7 = getHighResolutionOutputSizeshNQ4ISI + 81;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            byte[] bArr2 = getOutputSizeshNQ4ISI;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i8 = 0; i8 < length2; i8++) {
                    bArr3[i8] = (byte) (bArr2[i8] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i6 = bArr2 != null ? (byte) (((byte) (getOutputSizeshNQ4ISI[((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizesFor[((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i9 = getHighSpeedVideoFpsRangesFor + 99;
            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
            if (i9 % 2 == 0) {
                i4 = ((i >> i6) + 3) / ((int) (getOutputStallDurationlomOqCM * (-2689713159175858216L)));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputSizeshNQ4ISI;
            if (bArr4 != null) {
                int i10 = getHighSpeedVideoFpsRangesFor + 117;
                getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                if (i10 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i11 = 0; i11 < length; i11++) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                    bArr[i11] = (byte) (bArr4[i11] ^ (-2689713159175858216L));
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 69) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z) {
                    byte[] bArr5 = getOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 111) % 128;
                } else {
                    short[] sArr = getHighSpeedVideoSizesFor;
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

    static void Camera2StreamConfigurationMap() {
        getOutputFormats = new char[]{40000, 24909, 26119, 27586, 26762, 28270, 29502, 28916, 30120, 31604, 30802, 32029, 17091, 40052, 24908, 26133, 27527, 26845, 8065, 58099, 58813, 59504, 60222, 60891, 61655, 62280, 62984, 63686, 64480, 65204, 49507, 50239, 50901, 40017, 24951, 26144, 27646, 40051, 24925, 26130, 27590, 26760, 40046, 24921, 26118, 27614, 26765, 28227, 29492, 28897, 30119, 31603, 30798, 32031, 17096, 18326, 17728, 19005, 20468, 19633, 58364, 7872, 6559, 5191, 5908, 4570, 3256, 3954, 2594, 1258, 1995, 644, 15706, 40014, 24953, 26118, 27614, 26765, 28220, 27423, 38440, 37239, 40111, 40956, 39218, 33874, 34710, 33493, 35860, 36665, 35447, 46525, 45304, 45598, 36604, 29643, 29844, 31052, 31263, 31953, 25003, 25203, 26421, 27121, 27340};
        getInputFormats = -6541697918216150728L;
        getOutputStallDurationlomOqCM = 1998962435;
        getHighSpeedVideoFpsRanges = -408873088;
        getHighSpeedVideoSizes = 369106412;
        getOutputSizeshNQ4ISI = new byte[]{115, -36, 37, 3, 109, -35, -36, -37, -48, -99, 117, -46, -111, Byte.MAX_VALUE, -51, 45, -43, -102, 99, 42, -35, 39, 39, 37, -42, -53, -22, 42, 17, 41, -53, 32, 45, -45, 35, -35, -111, 107, 35, -37, -47, 44, -43, 45, -120, 105, 35, -116, 100, 39, 33, -37, -48, -61, 98, -38, 45, 39, -39, -41, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -36, -43, 42, -52, 47, 44, 39, -52, 37};
    }
}
