package util.h.xy.cu;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 433385368;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = -408872975;
    private static int getInputFormats = -1256412666;
    private static short[] getOutputFormats;
    private static byte[] getOutputMinFrameDuration = {-35, 99, -106, 102, 45, -51, 98, 46, -58, com.google.common.base.Ascii.CAN, 103, 98, 107, -40, com.visa.cbp.getEncExpo.startTransaction, 105, 44, com.visa.cbp.getEncExpo.startTransaction, 100, com.visa.cbp.getEncExpo.IResultReceiver2, -108, 110, -101, 111, -114, 116, -108, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -51, -112, 101, -107, 60, -39, -106, 46, -38, -106, -98, 46, -51, com.visa.cbp.getEncExpo.IResultReceiver2, -112, -105, 106, 71, 41, -101, 44, -98, 32, -127, 43, -97, 82, 105, 43, 34, 66, 105, kotlin.io.encoding.Base64.padSymbol, -107, -112, -26, 33, 64, 105, 32, Byte.MIN_VALUE, 42, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -118, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 19, -100, 13, -98, -17, -104, com.google.common.base.Ascii.SI, -9, 93, 123, -18, 16, -81, 86, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, com.google.common.base.Ascii.SI, -30, -3, 48, -80, 41, -67, 45, -35, -56, 74, 41, 109, 120, -69, -71, 43, -117, 44, -63, -39, 5, -63, 16, -5, com.google.common.base.Ascii.US, -61, -4, com.google.common.base.Ascii.VT, -5, -123, 77, 13, -63, -63, -60, -61, -11, -24, com.google.common.base.Ascii.DC4, -58, -63, 13, -59, com.google.common.base.Ascii.FS, 8, -6, -50, -59, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC4, -58, com.visa.cbp.getEncExpo.startTransaction, 37, 82, -63, -67, -90, -61, 9, -60, -39};

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m26049(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.da.b {
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            if (util.h.xy.cy.ma.m26119(bArr)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-1404943838) - android.graphics.Color.rgb(0, 0, 0), (short) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 1), (byte) (android.view.View.MeasureSpec.getMode(0) - 70), (-43) - android.graphics.ImageFormat.getBitsPerPixel(0), 25823237 - android.view.KeyEvent.normalizeMetaState(0), objArr);
                throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10304);
            }
            byte[] m26052 = m26052(bArr, 0, bArr.length, bArr2, bArr3);
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 7;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                return m26052;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.cy.ma.m26119(bArr);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26052(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3) throws util.h.xy.da.b {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        if (util.h.xy.cy.ma.m26119(bArr)) {
            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) - 1388166623, (short) (android.view.Gravity.getAbsoluteGravity(0, 0) - 1), (byte) ((-71) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-43) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25823236, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10304);
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, i, i2, bArr3, bArr2, true);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 61) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26053(byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.da.b {
        if (util.h.xy.cy.ma.m26119(bArr)) {
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-1388166622) - (jumpTapTimeout >> 16), (short) (-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) ((-70) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 42, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 25823237, objArr);
                throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10304);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return m26054(bArr, 0, bArr.length, bArr2, bArr3);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26054(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3) throws util.h.xy.da.b {
        int i3 = getHighSpeedVideoSizes + 63;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            if (util.h.xy.cy.ma.m26119(bArr)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) - 1388166622, (short) (android.view.Gravity.getAbsoluteGravity(0, 0) - 1), (byte) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 70), (-42) - android.widget.ExpandableListView.getPackedPositionType(0L), 25823236 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10304);
            }
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, i, i2, bArr3, bArr2, false);
            int i4 = getHighSpeedVideoSizes + 117;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                return Camera2StreamConfigurationMap2;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.cy.ma.m26119(bArr);
        throw new java.lang.ArithmeticException();
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3, boolean z) throws util.h.xy.da.b {
        if (util.h.xy.cy.ra.m26123()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) - 1388166576, (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 29), (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40), (-42) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 25823249 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        if (bArr2 == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.ImageFormat.getBitsPerPixel(0) - 1388166621, (short) (-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) ((-70) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 42, 25823237 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10305);
        }
        if (util.h.xy.cy.ma.m26119(bArr) || util.h.xy.cy.ma.m26119(bArr3) || i2 == 0 || i + i2 > bArr.length) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(0, 0) - 1388166622, (short) ((-1) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 70), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 41, 25823237 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10306);
        }
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1388166550, (short) (121 - android.view.View.MeasureSpec.getMode(0)), (byte) ((-69) - android.graphics.Color.blue(0)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 42, 25823241 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
            throw new util.h.xy.da.b(((java.lang.String) objArr4[0]).intern());
        }
        try {
            if (bArr2.length != 16) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-1388166529) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (short) (82 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (android.text.TextUtils.indexOf("", "") + 78), (-41) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 25823241, objArr5);
                throw new util.h.xy.da.b(((java.lang.String) objArr5[0]).intern());
            }
            util.h.xy.et.a aVar = new util.h.xy.et.a(new util.h.xy.eo.a(new util.h.xy.ej.ma()), new util.h.xy.et.mb());
            aVar.mo26537(z, new util.h.xy.ep.e(new util.h.xy.ep.mc(bArr, i, i2), bArr2));
            byte[] bArr4 = new byte[aVar.mo26535(bArr3.length)];
            int mo26536 = aVar.mo26536(bArr3, 0, bArr3.length, bArr4, 0);
            try {
                try {
                    return util.h.xy.fb.a.m26824(bArr4, 0, mo26536 + aVar.mo26539(bArr4, mo26536));
                } catch (java.lang.IllegalStateException unused) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) - 1388166512, (short) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 10), (byte) (38 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (-42) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 25823237, objArr6);
                    throw new util.h.xy.da.b(((java.lang.String) objArr6[0]).intern(), 10202);
                }
            } catch (util.h.xy.ef.mc unused2) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1388166513, (short) (9 - android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 38), (-42) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 25823237 + android.view.View.resolveSizeAndState(0, 0, 0), objArr7);
                throw new util.h.xy.da.b(((java.lang.String) objArr7[0]).intern(), 10201);
            } catch (util.h.xy.ef.md unused3) {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-1388166512) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (short) (10 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (byte) (38 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 43, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 25823237, objArr8);
                throw new util.h.xy.da.b(((java.lang.String) objArr8[0]).intern(), 10203);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r3 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i7 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        if (i7 == -1) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 117) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr2 = getOutputMinFrameDuration;
            if (bArr2 != null) {
                int i8 = getHighSpeedVideoFpsRanges + 91;
                Camera2StreamConfigurationMap = i8 % 128;
                if (i8 % 2 != 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i6 = 1;
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i6 = 0;
                }
                while (i6 < length) {
                    bArr[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                    i6++;
                }
                bArr2 = bArr;
            }
            if (bArr2 == null) {
                i7 = (short) (((short) (getOutputFormats[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            } else {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 83) % 128;
                i7 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
            }
        }
        if (i7 > 0) {
            int i9 = Camera2StreamConfigurationMap + 19;
            getHighSpeedVideoFpsRanges = i9 % 128;
            if (i9 % 2 == 0) {
                i4 = ((i - i7) >> 4) >>> ((int) (getInputFormats | (-2689713159175858216L)));
            } else {
                i4 = ((i + i7) - 2) + ((int) (getInputFormats ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i7) {
                int i11 = Camera2StreamConfigurationMap + 41;
                getHighSpeedVideoFpsRanges = i11 % 128;
                if (i11 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (z2) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    int i12 = Camera2StreamConfigurationMap + 31;
                    getHighSpeedVideoFpsRanges = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 3 / 2;
                    }
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

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26055() throws util.h.xy.da.b {
        byte[] bArr;
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 73) % 128;
        int i2 = i + 9;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            bArr = new byte[10];
            util.h.xy.cw.c.m26082().mo26126(bArr);
        } else {
            bArr = new byte[16];
            util.h.xy.cw.c.m26082().mo26126(bArr);
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26050() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        getHighSpeedVideoSizes = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 91) % 128;
        byte[] bArr = new byte[16];
        getHighResolutionOutputSizeshNQ4ISI = (i + 83) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i + 9) % 128;
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26051(int i) throws util.h.xy.da.b {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 109;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            Camera2StreamConfigurationMap(i);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 55) % 128;
        return Camera2StreamConfigurationMap2;
    }

    private static byte[] Camera2StreamConfigurationMap(int i) throws util.h.xy.da.b {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 79) % 128;
        byte[] bArr = new byte[i];
        util.h.xy.cw.c.m26082().mo26126(bArr);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 43;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }
}
