package util.h.xy.bv;

/* loaded from: classes5.dex */
public final class rh {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int[] getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static byte[] getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static short[] getOutputMinFrameDurationlomOqCM;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor();
        getInputFormats = util.h.xy.bv.rh.class.getName();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 21) % 128;
    }

    private rh() {
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoSizesFor;
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
        int[] iArr5 = getHighSpeedVideoSizesFor;
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
    public static java.util.Map<java.lang.String, java.lang.String> m25762(util.h.xy.bv.mh mhVar, byte[] bArr, byte[] bArr2, java.util.Map<java.lang.String, java.lang.String> map) throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5 = null;
        try {
            byte[] m25788 = util.h.xy.bx.ra.f1063.m25788(128);
            try {
                bArr4 = util.h.xy.bx.ra.f1063.m25790(m25788, bArr);
                try {
                    bArr5 = util.h.xy.ck.ra.f1116.m25945().mo25944(m25788);
                    java.lang.String str = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(bArr4));
                    java.lang.String str2 = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(bArr5));
                    map.put(util.h.xy.al.b.f112, str);
                    map.put(util.h.xy.al.b.f136, str2);
                    map.put(util.h.xy.al.b.f111, getHighSpeedVideoSizes());
                    if (bArr2 != null) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 69) % 128;
                        if (bArr2.length > 0) {
                            byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr2);
                            java.lang.String str3 = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(util.h.xy.ck.ra.f1116.m25945().mo25944(highSpeedVideoFpsRangesFor)));
                            util.h.xy.ar.b.m25095(highSpeedVideoFpsRangesFor);
                            map.put(util.h.xy.al.b.f110, str3);
                            map.put(util.h.xy.al.b.f104, util.h.xy.al.b.f109);
                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
                        }
                    }
                    java.lang.String str4 = util.h.xy.al.b.f113;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(12927123 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) android.view.View.getDefaultSize(0, 0), android.view.View.MeasureSpec.getMode(0) - 5, android.view.KeyEvent.getDeadChar(0, 0) - 346668882, objArr);
                    map.put(str4, ((java.lang.String) objArr[0]).intern());
                    util.h.xy.ar.b.m25100(m25788, bArr5, bArr4);
                    return map;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e = e;
                    bArr3 = bArr5;
                    bArr5 = m25788;
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(android.text.TextUtils.getTrimmedLength("") + 12927127, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (-5) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-346668913) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern(), e);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        util.h.xy.ar.b.m25100(bArr5, bArr3, bArr4);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bArr3 = bArr5;
                    bArr5 = bArr4;
                    bArr4 = bArr5;
                    bArr5 = m25788;
                    util.h.xy.ar.b.m25100(bArr5, bArr3, bArr4);
                    throw th;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                e = e2;
                bArr4 = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr3 = null;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
            e = e3;
            bArr3 = null;
            bArr4 = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr3 = null;
            bArr4 = null;
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        byte b;
        util.h.xy.ar.b.m25074(bArr);
        int length = bArr.length;
        int i = 0;
        if (!util.h.xy.cg.a.m25903(bArr)) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(12927156 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (short) android.graphics.Color.argb(0, 0, 0, 0), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (-6) - android.view.MotionEvent.axisFromString(""), android.view.View.MeasureSpec.getSize(0) - 346668925, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] m25788 = util.h.xy.bx.ra.f1063.m25788(64);
        m25788[0] = (byte) (length + 16);
        util.h.xy.ar.b.m25074(m25788);
        int i2 = 1;
        while (i < length) {
            int i3 = i + 1;
            byte b2 = (byte) (bArr[i] - 48);
            if (i3 < length) {
                i += 2;
                b = (byte) ((bArr[i3] - 48) & 15);
            } else {
                b = (byte) (m25788[i3] & com.google.common.base.Ascii.SI);
                i = i3;
            }
            m25788[i2] = (byte) ((b2 << 4) + b);
            i2++;
        }
        util.h.xy.ar.b.m25074(m25788);
        return m25788;
    }

    private static java.lang.String getHighSpeedVideoSizes() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String str;
        android.content.Context m24558;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1025067324, -2080225294, 532016915, 1440428752, 1309554826, 337763377, -1118842743, 912431112}, 16 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        java.lang.String str2 = (java.lang.String) objArr[0];
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            try {
                m24558 = util.h.xy.ag.a.m24556().m24558();
            } catch (org.json.JSONException e) {
                e.getMessage();
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "";
        }
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{1025067324, -2080225294, 532016915, 1440428752, -1446167561, 918056324, 1646908431, -2054718579, 1999607897, -22222647, 1606443176, 1619135069}, 23 - android.text.TextUtils.getTrimmedLength(""), objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{-1729299619, 1901859918, 1542695781, -1999182528, -185711623, -324450433, -1305813174, 87406840, 346117813, -39505068}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr3);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], null).invoke(m24558, null);
            try {
                java.lang.Object[] objArr4 = {util.h.xy.ag.a.m24556().m24558().getPackageName(), 0};
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{1025067324, -2080225294, 532016915, 1440428752, -1446167561, 918056324, 1646908431, -2054718579, -232669636, 1758991985, 1542695781, -1999182528, -185711623, -324450433, -1305813174, 87406840, 346117813, -39505068}, 33 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1729299619, 1901859918, 1542695781, -1999182528, 189975958, -746690591, 224421774, -319887714}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, objArr6);
                android.content.pm.PackageInfo packageInfo = (android.content.pm.PackageInfo) cls2.getMethod((java.lang.String) objArr6[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr4);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(packageInfo.versionCode);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(12927181 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (short) android.view.View.combineMeasuredStates(0, 0), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 5, (-346668939) - android.widget.ExpandableListView.getPackedPositionType(0L), objArr7);
                sb.append(((java.lang.String) objArr7[0]).intern());
                sb.append(packageInfo.versionName);
                str = sb.toString();
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 9) % 128;
                jSONObject.put(util.h.xy.al.b.f116, util.h.xy.al.b.f184);
                java.lang.String str3 = util.h.xy.al.b.f115;
                java.lang.Class<?> cls3 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1014796318, 625003711, 2104540883, 1403974051, -196208697, -1574793027}, 11 - android.view.View.combineMeasuredStates(0, 0), objArr8);
                jSONObject.put(str3, cls3.getField((java.lang.String) objArr8[0]).get(null));
                jSONObject.put(util.h.xy.al.b.f102, android.os.Build.VERSION.SDK_INT);
                java.lang.String str4 = util.h.xy.al.b.f100;
                java.lang.Class<?> cls4 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-163712938, 63353679, -1424322387, 405657330}, 5 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
                jSONObject.put(str4, cls4.getField((java.lang.String) objArr9[0]).get(null));
                java.lang.String str5 = util.h.xy.al.b.f101;
                java.lang.Class<?> cls5 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-310108621, -817109037, 1507118388, 1949905345, 1066063879, -2131506858}, 13 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr10);
                jSONObject.put(str5, cls5.getField((java.lang.String) objArr10[0]).get(null));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 12927184, (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 5, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 346668880, objArr11);
                jSONObject.put(((java.lang.String) objArr11[0]).intern(), str);
                java.lang.Class<?> cls6 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-163712938, 63353679, -1424322387, 405657330}, 5 - android.view.View.combineMeasuredStates(0, 0), objArr12);
                java.lang.Object obj = cls6.getField((java.lang.String) objArr12[0]).get(null);
                java.lang.Class<?> cls7 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-163712938, 63353679, -1424322387, 405657330}, android.os.Process.getGidForName("") + 6, objArr13);
                java.lang.String str6 = (java.lang.String) cls7.getField((java.lang.String) objArr13[0]).get(null);
                java.lang.Class<?> cls8 = java.lang.Class.forName(str2);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-310108621, -817109037, 1507118388, 1949905345, 1066063879, -2131506858}, android.view.View.resolveSize(0, 0) + 12, objArr14);
                if (!str6.contains((java.lang.CharSequence) cls8.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Class<?> cls9 = java.lang.Class.forName(str2);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{-310108621, -817109037, 1507118388, 1949905345, 1066063879, -2131506858}, android.graphics.Color.alpha(0) + 12, objArr15);
                    sb2.append(((java.lang.String) cls9.getField((java.lang.String) objArr15[0]).get(null)).toUpperCase());
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 97) % 128;
                    try {
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(12927199 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.view.Gravity.getAbsoluteGravity(0, 0) - 5, (-346668966) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
                        sb2.append(((java.lang.String) objArr16[0]).intern());
                        java.lang.Class<?> cls10 = java.lang.Class.forName(str2);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{-163712938, 63353679, -1424322387, 405657330}, 6 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr17);
                        sb2.append(((java.lang.String) cls10.getField((java.lang.String) objArr17[0]).get(null)).toUpperCase());
                        obj = sb2.toString();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                jSONObject.put(util.h.xy.al.b.f124, obj);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(12927201 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (-5) - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 346668899, objArr18);
                java.lang.String intern = ((java.lang.String) objArr18[0]).intern();
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12927214, (short) android.text.TextUtils.getOffsetBefore("", 0), (byte) android.text.TextUtils.indexOf("", "", 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 5, (-346668944) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr19);
                jSONObject.put(intern, ((java.lang.String) objArr19[0]).intern());
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12927226, (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 5, (-346668898) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr20);
                jSONObject.put(((java.lang.String) objArr20[0]).intern(), util.h.xy.cg.a.m25904());
                return jSONObject.toString();
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
    }

    private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int length;
        byte[] bArr;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L)));
        if (i6 == -1) {
            i4 = 1;
        } else {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 29) % 128;
            i4 = 0;
        }
        if (i4 != 0) {
            byte[] bArr2 = getOutputFormats;
            if (bArr2 != null) {
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            i6 = bArr2 != null ? (byte) (((byte) (getOutputFormats[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L)))) : (short) (((short) (getOutputMinFrameDurationlomOqCM[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            meVar.f2647 = ((i + i6) - 2) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i4;
            meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = getOutputFormats;
            if (bArr4 != null) {
                int i8 = getHighSpeedVideoFpsRanges + 59;
                getHighSpeedVideoSizes = i8 % 128;
                if (i8 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    int i9 = getHighSpeedVideoFpsRanges + 3;
                    getHighSpeedVideoSizes = i9 % 128;
                    if (i9 % 2 == 0) {
                        bArr[i5] = (byte) (bArr4[i5] - 2689713159175858216L);
                        i5 >>>= 1;
                    } else {
                        bArr[i5] = (byte) (bArr4[i5] ^ (-2689713159175858216L));
                        i5++;
                    }
                }
                bArr4 = bArr;
            }
            boolean z = bArr4 != null;
            meVar.f2645 = 1;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 125) % 128;
            while (meVar.f2645 < i6) {
                if (z) {
                    byte[] bArr5 = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputMinFrameDurationlomOqCM;
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

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = new int[]{-160625477, -1765776525, -1170211264, -1670894380, -1330214747, 1007597074, -1044029653, 543773127, -1127944617, -1975947592, -710524648, 243161034, 1826401987, -1788155533, 1149558611, 1677752466, 813627660, -2099022880};
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = 412854453;
        getHighResolutionOutputSizeshNQ4ISI = -408872996;
        getInputSizeshNQ4ISI = -217536482;
        getOutputFormats = new byte[]{-40, 40, -37, 38, -63, -36, 47, -33, -41, 45, -47, -99, com.google.common.base.Ascii.VT, 34, -54, -7, 107, 35, -37, -47, 44, -43, 45, -120, 105, 35, -116, 99, 33, -46, -39, 43, -63, -50, com.google.common.base.Ascii.RS, 44, -43, 33, -47, 33, -108, 106, -35, 33, -120, 99, 33, -37, -33, 43, -38, -107, 100, 35, 37, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, -3, 38, kotlin.io.encoding.Base64.padSymbol, -44, 39, -34, 46, -39, -43, -41, 62, -40, -9, com.google.common.base.Ascii.NAK, -41, 33, -40, -45, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 37, -47, 39, -34, 46, -39, -43, -41, -45, -33, 41, 56, -37, -43, -33, -39, com.google.common.base.Ascii.NAK, 41, -100, 38, -38, 36, -39, -37, 32, -44, -44, -34, 45, -2, 57, 41, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -7, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -38, 34, 43, -55, -39};
    }
}
