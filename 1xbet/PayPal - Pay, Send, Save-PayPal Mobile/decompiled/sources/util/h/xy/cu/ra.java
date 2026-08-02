package util.h.xy.cu;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1738421843;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static byte[] getHighSpeedVideoSizes = {82, -91, 85, com.google.common.base.Ascii.FS, -4, 81, com.google.common.base.Ascii.GS, -11, 87, 86, 81, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.ETB, -1, 88, com.google.common.base.Ascii.ESC, -1, 83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -93, 93, -86, 94, -67, 67, -93, 2, -4, -81, 84, -92, com.google.common.base.Ascii.VT, -24, -91, com.google.common.base.Ascii.GS, -23, -91, -83, com.google.common.base.Ascii.GS, -4, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -81, -90, 89, 118, 94, 92, -82, -90, -86, -81, 93, -85, 122, -112, -80, 78, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.google.common.base.Ascii.EM, -73, 92, 94, -84, -92, -88, 110, -26, -84, 78, -78, 80, -86, 84, -93, com.google.common.base.Ascii.SUB, -20, -90, 9, -26, -92, 87, 92, -82, 68, -81, -83, -85, 66, 87, 91, -40, -40, -40, -40};
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI = -174284277;
    private static short[] getOutputFormats = null;
    private static int getOutputMinFrameDuration = -408873027;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26057(byte[] bArr, byte[] bArr2, int i, int i2) throws util.h.xy.da.b {
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 3) % 128;
        if (!util.h.xy.cy.ma.m26119(bArr)) {
            int i3 = getHighSpeedVideoFpsRangesFor + 75;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                if (!util.h.xy.cy.ma.m26119(bArr2)) {
                    util.h.xy.el.a aVar = new util.h.xy.el.a(new util.h.xy.eh.mc());
                    aVar.m26568(bArr, bArr2, i);
                    byte[] m26663 = ((util.h.xy.ep.mc) aVar.m26610(i2)).m26663();
                    int i4 = (getHighSpeedVideoFpsRangesFor + 51) % 128;
                    getInputFormats = i4;
                    int i5 = i4 + 17;
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 == 0) {
                        return m26663;
                    }
                    throw new java.lang.ArithmeticException();
                }
            } else {
                util.h.xy.cy.ma.m26119(bArr2);
                throw null;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(2143346294 + android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) android.view.View.combineMeasuredStates(0, 0), (byte) (android.view.View.MeasureSpec.getSize(0) - 118), (-55) - android.graphics.Color.blue(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 306034061, objArr);
        throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10302);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26058(byte[] bArr, int i, int i2, byte[] bArr2) throws util.h.xy.da.b {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2143346338, (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) ((-121) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 91, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 306034059, objArr);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, i, i2, ((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.getDeadChar(0, 0) + 2143346338, (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (byte) (android.view.KeyEvent.getDeadChar(0, 0) - 121), (-91) - android.view.View.combineMeasuredStates(0, 0), android.view.View.MeasureSpec.getSize(0) - 306034059, objArr2);
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(((java.lang.String) objArr2[0]).intern());
            mac.init(secretKeySpec);
            byte[] doFinal = mac.doFinal(bArr2);
            int i3 = getHighSpeedVideoFpsRangesFor + 47;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                return doFinal;
            }
            throw null;
        } catch (java.lang.Exception unused) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(2143346347 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 123), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 70, (-306034046) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
            throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10701);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26056(byte[] bArr) throws util.h.xy.da.b {
        try {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2143346378, (short) android.text.TextUtils.indexOf("", ""), (byte) (118 - android.view.View.MeasureSpec.getSize(0)), (-95) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) - 306034048, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                int i = getInputFormats;
                getHighSpeedVideoFpsRangesFor = (i + 101) % 128;
                if (bArr != null && bArr.length > 0) {
                    int i2 = i + 37;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (intern != null && intern.length() > 0) {
                        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(intern);
                        messageDigest.update(bArr);
                        byte[] digest = messageDigest.digest();
                        getInputFormats = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                        return digest;
                    }
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(2143346293 + android.text.TextUtils.getTrimmedLength(""), (short) android.graphics.Color.argb(0, 0, 0, 0), (byte) ((-118) - android.graphics.Color.red(0)), (-56) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 306034062, objArr2);
                throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10303);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.security.NoSuchAlgorithmException unused) {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(2143346347 + android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 123), (-70) - android.view.KeyEvent.normalizeMetaState(0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 306034046, objArr3);
                throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10702);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
        if (i5 == -1) {
            int i6 = Camera2StreamConfigurationMap + 21;
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 == 0) {
                z = true;
                if (z) {
                    byte[] bArr = getHighSpeedVideoSizes;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i7 = 0; i7 < length; i7++) {
                            bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                        }
                        bArr = bArr2;
                    }
                    i5 = bArr != null ? (byte) (((byte) (getHighSpeedVideoSizes[((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)))) : (short) (((short) (getOutputFormats[((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                }
                if (i5 > 0) {
                    int i8 = (int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L));
                    if (z) {
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 23) % 128;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    meVar.f2647 = ((i + i5) - 2) + i8 + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = getHighSpeedVideoSizes;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 27) % 128;
                        for (int i9 = 0; i9 < length2; i9++) {
                            bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                        }
                        bArr3 = bArr4;
                    }
                    boolean z2 = bArr3 != null;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        if (z2) {
                            byte[] bArr5 = getHighSpeedVideoSizes;
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
        }
        z = false;
        if (z) {
        }
        if (i5 > 0) {
        }
        objArr[0] = sb.toString();
    }
}
