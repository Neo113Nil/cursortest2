package util.h.xy.cw;

/* loaded from: classes5.dex */
final class rc {
    private static byte[] ArtificialStackFrames = null;
    static final byte[] Camera2StreamConfigurationMap;
    private static final byte[] accessartificialFrame;
    private static int coroutineBoundary = 0;
    private static char[] coroutineCreation = null;
    static final byte[] getHighResolutionOutputSizeshNQ4ISI;
    static final byte[] getHighSpeedVideoFpsRanges;
    static final byte[] getHighSpeedVideoFpsRangesFor;
    static final byte[] getHighSpeedVideoSizes;
    static int getHighSpeedVideoSizesFor = 0;
    static int getInputSizeshNQ4ISI = 1;
    private static int getOutputMinFrameDurationlomOqCM = 1;
    private static int getOutputSizes;
    private static final byte[] getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;
    private static final byte[] getOutputStallDurationlomOqCM;
    private static final byte[] getValidOutputFormatsForInputhNQ4ISI;
    private static long isOutputSupportedFor;
    private static short[] isOutputSupportedForhNQ4ISI;
    private static int toString;
    private static final byte[] unwrapAs;
    private byte[] CoroutineDebuggingKt;
    private util.h.xy.cw.ma _BOUNDARY;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f7077a;
    private byte[] b;
    private byte[] getARTIFICIAL_FRAME_PACKAGE_NAME;
    byte[] getInputFormats;
    byte[] getOutputFormats;
    byte[] getOutputMinFrameDuration;

    static {
        getHighSpeedVideoSizes();
        unwrapAs = new byte[]{-82, -35, -97, -57, 114, -66, 85, -101, -124, 48, 4, -73, -51, 65, 123, -8, 9, -35, -44, -110, 72, -102, -54, 107, com.visa.cbp.getEncExpo.IResultReceiver2, -97, -74, -21, 97, -42, 38, -98};
        getValidOutputFormatsForInputhNQ4ISI = new byte[]{100, 108, com.google.common.base.Ascii.RS, -110, 83, 13, 104, com.google.common.base.Ascii.RS, com.visa.cbp.getEncExpo.kernelVersion, -14, 125, -52, 8, -94, -4, 86, -53, -118, 57, -92, -63, -86, 63, 85, 83, -77, -58, 16, -82, 93, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy};
        getHighSpeedVideoFpsRangesFor = new byte[]{-82, -35, -97, -57, 114, -66, 85, -101, -124, 48, 4, -73, -51, 65, 123, -8, 9, -35, -44, -110, 72, -102, -54, 107, com.visa.cbp.getEncExpo.IResultReceiver2, -97, -74, -21, 97, -42, 38, -98};
        Camera2StreamConfigurationMap = new byte[]{100, 108, com.google.common.base.Ascii.RS, -110, 83, 13, 104, com.google.common.base.Ascii.RS, com.visa.cbp.getEncExpo.kernelVersion, -14, 125, -52, 8, -94, -4, 86, -53, -118, 57, -92, -63, -86, 63, 85, 83, -77, -58, 16, -82, 93, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy};
        getOutputSizeshNQ4ISI = new byte[]{-82, -35, -97, -57, 114, -66, 85, -101, -124, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 35, 69, -51, 65, 123, -8, 9, -35, -44, -110, 72, -102, -54, 107, com.visa.cbp.getEncExpo.IResultReceiver2, -97, -74, -21, 97, -42, 38, -98};
        getOutputStallDurationlomOqCM = new byte[]{101, 109, com.google.common.base.Ascii.RS, -109, 84, 13, 104, com.google.common.base.Ascii.RS, com.visa.cbp.getEncExpo.kernelVersion, -14, 125, -52, 8, -94, -4, 86, -53, -118, 57, -92, -63, -86, 63, 85, 83, -77, -58, 16, -82, 93, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy};
        accessartificialFrame = new byte[]{72, 97, 122, 101, 108, 71, 114, 111, 117, 115, 101};
        getHighSpeedVideoSizes = util.h.xy.cw.mc.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.cw.mc.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRanges = util.h.xy.cw.mc.getHighSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoSizesFor + 81;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getOutputMinFrameDurationlomOqCM = (getOutputStallDuration + 57) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (coroutineCreation[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ isOutputSupportedFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getOutputStallDuration + 23;
            getOutputMinFrameDurationlomOqCM = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    rc(java.lang.String str) throws util.h.xy.da.b {
        this._BOUNDARY = new util.h.xy.cw.ma(str);
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, util.h.xy.da.a aVar) throws util.h.xy.da.b {
        int i;
        byte[] bArr3 = new byte[16];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, 16);
        if (aVar != null) {
            int i2 = util.h.xy.cw.rc.AnonymousClass4.getHighSpeedVideoFpsRangesFor[aVar.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 83) % 128;
                        i = 5000;
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getEdgeSlop() >> 16) - 396328468, (short) (android.text.TextUtils.indexOf("", "", 0, 0) + 4), (byte) ((-73) - android.text.TextUtils.indexOf("", "", 0, 0)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 55, 2006206967 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
                        throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10902);
                    }
                }
                i = 500;
            } else {
                i = 1;
            }
        } else {
            int i3 = getInputSizeshNQ4ISI + 125;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 != 0) {
                i = 14912;
            }
            i = 500;
        }
        return util.h.xy.cu.ra.m26057(bArr, bArr3, i, 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (coroutineBoundary ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            byte[] bArr = ArtificialStackFrames;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i5 = bArr != null ? (byte) (((byte) (ArtificialStackFrames[((int) (toString ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (coroutineBoundary ^ (-2689713159175858216L)))) : (short) (((short) (isOutputSupportedForhNQ4ISI[((int) (toString ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (coroutineBoundary ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i7 = (int) (toString ^ (-2689713159175858216L));
            if (z2) {
                int i8 = (getOutputMinFrameDurationlomOqCM + 41) % 128;
                getOutputStallDuration = i8;
                getOutputMinFrameDurationlomOqCM = (i8 + 91) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = ArtificialStackFrames;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i10 = getOutputMinFrameDurationlomOqCM + 69;
                getOutputStallDuration = i10 % 128;
                if (i10 % 2 == 0) {
                    z = true;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        int i11 = getOutputStallDuration + 49;
                        getOutputMinFrameDurationlomOqCM = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr5 = ArtificialStackFrames;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = isOutputSupportedForhNQ4ISI;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
            }
            z = false;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
            }
        }
        objArr[0] = sb.toString();
    }

    /* renamed from: util.h.xy.cw.rc$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[util.h.xy.da.a.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[util.h.xy.da.a.f1151.ordinal()] = 1;
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 103) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[util.h.xy.da.a.f1153.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[util.h.xy.da.a.f1152.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i & 85) + (i | 85)) % 128;
        }
    }

    void Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) throws util.h.xy.da.b {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 125) % 128;
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        byte[] bArr4 = new byte[16];
        java.lang.System.arraycopy(this.getOutputFormats, 16, bArr4, 0, 16);
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr4, bArr2, unwrapAs, getValidOutputFormatsForInputhNQ4ISI);
        try {
            this.CoroutineDebuggingKt = util.h.xy.cu.ra.m26057(bArr3, highSpeedVideoSizes, 1, 256);
            util.h.xy.cy.ma.m26116(bArr4, bArr3, highSpeedVideoSizes);
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 39) % 128;
            byte[] m26051 = util.h.xy.cu.ma.m26051(this.CoroutineDebuggingKt.length);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = m26051;
            this.CoroutineDebuggingKt = util.h.xy.cy.ma.m26117(this.CoroutineDebuggingKt, m26051);
        } catch (java.lang.Throwable th) {
            util.h.xy.cy.ma.m26116(bArr4, bArr3, highSpeedVideoSizes);
            throw th;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, util.h.xy.db.ma maVar) throws util.h.xy.da.b {
        byte[] mo26128;
        java.lang.Throwable th;
        byte[] bArr2;
        byte[] highSpeedVideoSizes;
        byte[] bArr3;
        byte[] bArr4 = null;
        try {
            if (maVar != null) {
                mo26128 = maVar.mo26128();
                if (util.h.xy.cy.ma.m26119(mo26128)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-396328365) - android.widget.ExpandableListView.getPackedPositionType(0L), (short) (((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) - 91), (byte) ((-56) - android.view.KeyEvent.normalizeMetaState(0)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 55, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2006206967, objArr);
                    throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
                }
            } else {
                mo26128 = util.h.xy.cz.ra.m26127().mo26128();
            }
            if (util.h.xy.cy.ma.m26119(mo26128)) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(40 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 144 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 2825), objArr2);
                throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern());
            }
            byte[] bArr5 = new byte[16];
            try {
                java.lang.System.arraycopy(this.getOutputFormats, 48, bArr5, 0, 16);
                highSpeedVideoSizes = getHighSpeedVideoSizes(bArr5, bArr, getOutputSizeshNQ4ISI, getOutputStallDurationlomOqCM);
                try {
                    bArr3 = new byte[highSpeedVideoSizes.length + mo26128.length];
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr2 = null;
            }
            try {
                java.lang.System.arraycopy(highSpeedVideoSizes, 0, bArr3, 0, highSpeedVideoSizes.length);
                java.lang.System.arraycopy(mo26128, 0, bArr3, highSpeedVideoSizes.length, mo26128.length);
                this.f7077a = util.h.xy.cu.ra.m26056(bArr3);
                util.h.xy.cy.ma.m26116(highSpeedVideoSizes, bArr3, bArr5, mo26128);
                byte[] m26112 = util.h.xy.cy.ma.m26112(util.h.xy.cy.ma.m26121(new byte[this.f7077a.length]));
                this.b = m26112;
                this.f7077a = util.h.xy.cy.ma.m26120(this.f7077a, m26112);
            } catch (java.lang.Throwable th4) {
                th = th4;
                bArr4 = bArr3;
                byte[] bArr6 = bArr4;
                bArr4 = highSpeedVideoSizes;
                bArr2 = bArr6;
                util.h.xy.cy.ma.m26116(bArr4, bArr2, bArr5, mo26128);
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause = th5.getCause();
            if (cause == null) {
                throw th5;
            }
            throw cause;
        }
    }

    static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[bArr2.length + bArr3.length + bArr.length];
        int length = bArr3.length;
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 17) % 128;
        int i = 0;
        while (i < length) {
            int i2 = getHighSpeedVideoSizesFor + 39;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                bArr5[i] = (byte) (bArr3[i] ^ bArr4[i]);
                i += 115;
            } else {
                bArr5[i] = (byte) (bArr3[i] ^ bArr4[i]);
                i++;
            }
        }
        java.lang.System.arraycopy(bArr, 0, bArr5, bArr3.length, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr5, bArr3.length + bArr.length, bArr2.length);
        return bArr5;
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, util.h.xy.da.mb mbVar) throws util.h.xy.da.b {
        java.io.File fileStreamPath;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] m26088 = ((util.h.xy.cw.mb) mbVar).m26088();
        if (m26088 != null) {
            int i = getHighSpeedVideoSizesFor + 55;
            getInputSizeshNQ4ISI = i % 128;
            byte[] bArr4 = null;
            if (i % 2 == 0) {
                int length = m26088.length;
                throw null;
            }
            if (m26088.length != 0) {
                java.lang.String str2 = new java.lang.String(accessartificialFrame);
                android.content.Context m26264 = util.h.xy.da.mc.m26262().m26264();
                if (m26264 == null || (fileStreamPath = m26264.getFileStreamPath(str)) == null) {
                    return new byte[0];
                }
                int i2 = getInputSizeshNQ4ISI + 87;
                getHighSpeedVideoSizesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    fileStreamPath.exists();
                    throw null;
                }
                if (fileStreamPath.exists()) {
                    byte[] m26084 = this._BOUNDARY.m26084(str2);
                    if (m26084.length < 80) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 25, 229 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr);
                        throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10401);
                    }
                    byte[] bArr5 = new byte[64];
                    this.getOutputFormats = bArr5;
                    java.lang.System.arraycopy(m26084, 0, bArr5, 0, 64);
                    try {
                        bArr4 = Camera2StreamConfigurationMap(m26088, this.getOutputFormats, ((util.h.xy.cw.mb) mbVar).m26089());
                        int length2 = m26084.length - 64;
                        byte[] bArr6 = new byte[length2];
                        java.lang.System.arraycopy(m26084, 64, bArr6, 0, length2);
                        try {
                            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr4, bArr6, false);
                            int i3 = getInputSizeshNQ4ISI + 77;
                            getHighSpeedVideoSizesFor = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            if (highSpeedVideoSizes != null) {
                                util.h.xy.cy.ma.m26116(bArr4, m26084);
                                return highSpeedVideoSizes;
                            }
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(33435 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (android.view.KeyEvent.keyCodeFromString("") + 69), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 58), android.view.Gravity.getAbsoluteGravity(0, 0) - 55, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2006206967, objArr2);
                            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10502);
                        } catch (java.lang.Exception unused) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((-396328341) - android.view.KeyEvent.getDeadChar(0, 0), (short) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 69), (byte) ((-57) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), android.text.TextUtils.getOffsetAfter("", 0) - 55, 2006206968 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
                            throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern(), 10501);
                        }
                    } catch (java.lang.Throwable th) {
                        util.h.xy.cy.ma.m26116(bArr4, m26084);
                        throw th;
                    }
                }
                try {
                    byte[] m26051 = util.h.xy.cu.ma.m26051(64);
                    this.getOutputFormats = m26051;
                    byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m26088, m26051, ((util.h.xy.cw.mb) mbVar).m26089());
                    try {
                        byte[] bArr7 = new byte[16];
                        bArr2 = util.h.xy.cu.ma.m26051(16);
                        try {
                            java.lang.System.arraycopy(bArr2, 0, bArr7, 0, bArr2.length);
                            bArr3 = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2, bArr2, false);
                            try {
                                int length3 = bArr3.length;
                                byte[] bArr8 = this.getOutputFormats;
                                byte[] bArr9 = new byte[length3 + bArr8.length];
                                try {
                                    java.lang.System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                                    java.lang.System.arraycopy(bArr3, 0, bArr9, this.getOutputFormats.length, bArr3.length);
                                    this._BOUNDARY.m26083(str2, bArr9);
                                    util.h.xy.cy.ma.m26116(Camera2StreamConfigurationMap2, bArr2, bArr3, bArr9);
                                    int i4 = getHighSpeedVideoSizesFor + 51;
                                    getInputSizeshNQ4ISI = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        return bArr7;
                                    }
                                    throw null;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    bArr4 = bArr9;
                                    byte[] bArr10 = bArr4;
                                    bArr4 = Camera2StreamConfigurationMap2;
                                    bArr = bArr10;
                                    util.h.xy.cy.ma.m26116(bArr4, bArr2, bArr3, bArr);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            bArr3 = null;
                            byte[] bArr102 = bArr4;
                            bArr4 = Camera2StreamConfigurationMap2;
                            bArr = bArr102;
                            util.h.xy.cy.ma.m26116(bArr4, bArr2, bArr3, bArr);
                            throw th;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        bArr2 = null;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bArr = null;
                    bArr2 = null;
                    bArr3 = null;
                }
            }
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, (char) (49565 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr4);
        throw new util.h.xy.da.b(((java.lang.String) objArr4[0]).intern(), 10311);
    }

    private byte[] getInputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizesFor + 71;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return getOutputMinFrameDuration();
        }
        getOutputMinFrameDuration();
        throw null;
    }

    private byte[] getOutputMinFrameDuration() {
        byte[] bArr;
        int i = getInputSizeshNQ4ISI + 15;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            byte[] bArr2 = this.CoroutineDebuggingKt;
            bArr = new byte[bArr2.length];
            java.lang.System.arraycopy(bArr2, 0, bArr, 1, bArr2.length);
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
                return bArr;
            }
        } else {
            byte[] bArr3 = this.CoroutineDebuggingKt;
            bArr = new byte[bArr3.length];
            java.lang.System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
                return bArr;
            }
        }
        byte[] m26117 = util.h.xy.cy.ma.m26117(bArr, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 43) % 128;
        return m26117;
    }

    private byte[] getHighSpeedVideoFpsRanges() {
        int i = getInputSizeshNQ4ISI + 121;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return getOutputFormats();
        }
        getOutputFormats();
        throw null;
    }

    private byte[] getOutputFormats() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 17) % 128;
        byte[] bArr = this.getInputFormats;
        java.lang.System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
        byte[] m26122 = util.h.xy.cy.ma.m26122(this.getInputFormats, this.getOutputMinFrameDuration);
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 39) % 128;
        return m26122;
    }

    private byte[] getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 41) % 128;
        byte[] bArr = this.f7077a;
        java.lang.System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
        byte[] m26122 = util.h.xy.cy.ma.m26122(this.f7077a, this.b);
        int i = getInputSizeshNQ4ISI + 17;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return m26122;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], int] */
    final byte[] getHighSpeedVideoFpsRanges(byte[] bArr, boolean z) throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizesFor + 89;
        getInputSizeshNQ4ISI = i % 128;
        ?? r0 = i % 2;
        try {
            if (r0 == 0) {
                byte[] inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
                getHighSpeedVideoFpsRangesFor(inputSizeshNQ4ISI, bArr, z);
                util.h.xy.cy.ma.m26113(inputSizeshNQ4ISI);
                throw null;
            }
            byte[] inputSizeshNQ4ISI2 = getInputSizeshNQ4ISI();
            byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(inputSizeshNQ4ISI2, bArr, z);
            util.h.xy.cy.ma.m26113(inputSizeshNQ4ISI2);
            int i2 = getInputSizeshNQ4ISI + 13;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return highSpeedVideoFpsRangesFor;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.cy.ma.m26113((byte[]) r0);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, boolean z) throws util.h.xy.da.b {
        byte[] m26052;
        if (util.h.xy.cy.ma.m26119(bArr) || util.h.xy.cy.ma.m26119(bArr2)) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(46 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 183 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 49565), objArr);
                throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10312);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] m26050 = util.h.xy.cu.ma.m26050();
        try {
            if (z) {
                m26052 = util.h.xy.cu.ma.m26052(bArr, 0, bArr.length / 2, bArr2, m26050);
            } else {
                m26052 = util.h.xy.cu.ma.m26052(bArr, 0, bArr.length, bArr2, m26050);
            }
            util.h.xy.cy.ma.m26113((byte[]) m26050);
            m26050 = m26052.length;
            if (m26050 <= 0) {
                return null;
            }
            if (!z) {
                return m26052;
            }
            byte[] m26058 = util.h.xy.cu.ra.m26058(bArr, bArr.length / 2, bArr.length / 2, m26052);
            byte[] bArr3 = new byte[m26052.length + m26058.length];
            java.lang.System.arraycopy(m26052, 0, bArr3, 0, m26052.length);
            java.lang.System.arraycopy(m26058, 0, bArr3, m26052.length, m26058.length);
            util.h.xy.cy.ma.m26113(m26058);
            return bArr3;
        } catch (java.lang.Throwable th2) {
            util.h.xy.cy.ma.m26113(m26050);
            throw th2;
        }
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) throws util.h.xy.da.b {
        int i = getInputSizeshNQ4ISI + 69;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr2, bArr3, z);
            if (highSpeedVideoFpsRangesFor == null || highSpeedVideoFpsRangesFor.length == 0) {
                return null;
            }
            byte[] m26050 = util.h.xy.cu.ma.m26050();
            try {
                byte[] m26049 = util.h.xy.cu.ma.m26049(bArr, highSpeedVideoFpsRangesFor, m26050);
                util.h.xy.cy.ma.m26113(m26050);
                int i2 = getInputSizeshNQ4ISI + 35;
                getHighSpeedVideoSizesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    return m26049;
                }
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th) {
                util.h.xy.cy.ma.m26113(m26050);
                throw th;
            }
        }
        getHighSpeedVideoFpsRangesFor(bArr2, bArr3, z);
        throw null;
    }

    final byte[] Camera2StreamConfigurationMap(byte[] bArr, boolean z, boolean z2) throws util.h.xy.da.b {
        int i = (getInputSizeshNQ4ISI + 51) % 128;
        getHighSpeedVideoSizesFor = i;
        getInputSizeshNQ4ISI = (i + 31) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 1) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        byte[] inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
        try {
            byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, inputSizeshNQ4ISI, bArr, z, z2);
            util.h.xy.cy.ma.m26116(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, inputSizeshNQ4ISI);
            int i2 = getInputSizeshNQ4ISI + 27;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.cy.ma.m26116(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, inputSizeshNQ4ISI);
            throw th;
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, boolean z2) throws util.h.xy.da.b {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 105) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr2, bArr3, bArr4, z);
        if (Camera2StreamConfigurationMap2 != null) {
            int i = getInputSizeshNQ4ISI + 31;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                int length = Camera2StreamConfigurationMap2.length;
                throw null;
            }
            if (Camera2StreamConfigurationMap2.length != 0) {
                if (z2) {
                    byte[] m26055 = util.h.xy.cu.ma.m26055();
                    try {
                        byte[] m26049 = util.h.xy.cu.ma.m26049(bArr, Camera2StreamConfigurationMap2, m26055);
                        byte[] bArr5 = new byte[m26055.length + m26049.length];
                        java.lang.System.arraycopy(m26055, 0, bArr5, 0, 16);
                        java.lang.System.arraycopy(m26049, 0, bArr5, 16, m26049.length);
                        return bArr5;
                    } finally {
                        util.h.xy.cy.ma.m26113(m26055);
                    }
                }
                byte[] m26050 = util.h.xy.cu.ma.m26050();
                try {
                    return util.h.xy.cu.ma.m26049(bArr, Camera2StreamConfigurationMap2, m26050);
                } finally {
                    util.h.xy.cy.ma.m26113(m26050);
                }
            }
        }
        int i2 = getInputSizeshNQ4ISI + 29;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws util.h.xy.da.b {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 71) % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, true);
        int i = getInputSizeshNQ4ISI + 19;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    final byte[] getHighSpeedVideoSizes(byte[] bArr) throws util.h.xy.da.b {
        int i = getInputSizeshNQ4ISI + 41;
        getHighSpeedVideoSizesFor = i % 128;
        return i % 2 != 0 ? getHighResolutionOutputSizeshNQ4ISI(bArr, true, false) : getHighResolutionOutputSizeshNQ4ISI(bArr, false, false);
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, boolean z) throws util.h.xy.da.b {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 41) % 128;
        byte[] inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
        try {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(inputSizeshNQ4ISI, bArr, z);
            util.h.xy.cy.ma.m26113(inputSizeshNQ4ISI);
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 1) % 128;
            return highSpeedVideoSizes;
        } catch (java.lang.Throwable th) {
            util.h.xy.cy.ma.m26113(inputSizeshNQ4ISI);
            throw th;
        }
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, boolean z, boolean z2) throws util.h.xy.da.b {
        int i = getHighSpeedVideoSizesFor;
        getInputSizeshNQ4ISI = (i + 103) % 128;
        getInputSizeshNQ4ISI = (i + 31) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 1) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        byte[] inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
        try {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, inputSizeshNQ4ISI, bArr, z, z2);
            util.h.xy.cy.ma.m26116(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, inputSizeshNQ4ISI);
            int i2 = getHighSpeedVideoSizesFor + 117;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return highSpeedVideoSizes;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.cy.ma.m26116(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges, inputSizeshNQ4ISI);
            throw th;
        }
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, boolean z) throws util.h.xy.da.b {
        if (bArr2 == null || bArr2.length == 0 || bArr == null || bArr.length == 0) {
            return null;
        }
        if (bArr2.length < 32 && z) {
            return null;
        }
        if (z) {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 115) % 128;
            int length = bArr2.length - 32;
            byte[] bArr3 = new byte[length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, length);
            byte[] bArr4 = new byte[32];
            java.lang.System.arraycopy(bArr2, length, bArr4, 0, 32);
            byte[] m26050 = util.h.xy.cu.ma.m26050();
            try {
                byte[] m26054 = util.h.xy.cu.ma.m26054(bArr, 0, bArr.length / 2, bArr3, m26050);
                util.h.xy.cy.ma.m26113(m26050);
                int i = getHighSpeedVideoSizesFor + 29;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0 ? java.util.Arrays.equals(bArr4, util.h.xy.cu.ra.m26058(bArr, bArr.length / 2, bArr.length / 2, bArr3)) : java.util.Arrays.equals(bArr4, util.h.xy.cu.ra.m26058(bArr, bArr.length >> 5, bArr.length - 3, bArr3))) {
                    return m26054;
                }
                int i2 = getInputSizeshNQ4ISI + 43;
                getHighSpeedVideoSizesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            } finally {
            }
        }
        try {
            return util.h.xy.cu.ma.m26053(bArr, bArr2, util.h.xy.cu.ma.m26050());
        } finally {
        }
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) throws util.h.xy.da.b {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 53) % 128;
        byte[] m26050 = util.h.xy.cu.ma.m26050();
        try {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(bArr2, util.h.xy.cu.ma.m26053(bArr, bArr3, m26050), z);
            util.h.xy.cy.ma.m26113(m26050);
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 93) % 128;
            return highSpeedVideoSizes;
        } catch (java.lang.Throwable th) {
            util.h.xy.cy.ma.m26113(m26050);
            throw th;
        }
    }

    private byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, boolean z2) throws util.h.xy.da.b {
        byte[] m26050;
        byte[] bArr5;
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 47;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr4 == null || bArr4.length == 0) {
            return null;
        }
        if (z2) {
            getInputSizeshNQ4ISI = (i + 27) % 128;
            m26050 = new byte[16];
        } else {
            m26050 = util.h.xy.cu.ma.m26050();
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 35) % 128;
        }
        if (z2) {
            int i3 = getHighSpeedVideoSizesFor + 111;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.System.arraycopy(bArr4, 0, m26050, 1, 61);
                bArr5 = new byte[bArr4.length + 85];
                java.lang.System.arraycopy(bArr4, 82, bArr5, 1, bArr4.length >> 98);
            } else {
                java.lang.System.arraycopy(bArr4, 0, m26050, 0, 16);
                bArr5 = new byte[bArr4.length - 16];
                java.lang.System.arraycopy(bArr4, 16, bArr5, 0, bArr4.length - 16);
            }
            bArr4 = bArr5;
        }
        try {
            return getHighSpeedVideoSizes(bArr2, bArr3, util.h.xy.cu.ma.m26053(bArr, bArr4, m26050), z);
        } finally {
            util.h.xy.cy.ma.m26113(m26050);
        }
    }

    final void Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            this._BOUNDARY.m26085();
        } catch (java.lang.Exception unused) {
            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap((pressedStateDuration >> 16) + 79, (intValue >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (char) android.view.KeyEvent.keyCodeFromString(""), objArr);
                throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern(), 10608);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 99) % 128;
        byte[] bArr = this.f7077a;
        util.h.xy.cy.ma.m26116(bArr, this.CoroutineDebuggingKt, bArr, this.getOutputFormats, this.b, this.getOutputMinFrameDuration, this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        this.f7077a = null;
        this.CoroutineDebuggingKt = null;
        this.b = null;
        this.getOutputMinFrameDuration = null;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
        int i = getHighSpeedVideoSizesFor + 109;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoSizes() {
        toString = -264345140;
        coroutineBoundary = -408872978;
        getOutputSizes = 1875550602;
        ArtificialStackFrames = new byte[]{-54, -50, com.visa.cbp.getEncExpo.IResultReceiver2, 34, -33, -109, 104, -25, 120, 41, -38, -112, 7, -51, 110, 106, -109, 104, -25, 88, 71, -48, 111, -110, 118, -26, 107, 108, 121, -105, -112, com.visa.cbp.getEncExpo.IResultReceiver, -28, 116, 76, 72, -48, com.visa.cbp.getEncExpo.registerForActivityResult, 125, -90, com.visa.cbp.getEncExpo.registerForActivityResult, -48, 111, -110, 118, -26, 107, 108, com.visa.cbp.getEncExpo.registerForActivityResult, 56, -38, -112, com.visa.cbp.getEncExpo.IResultReceiver, -28, 116, 108, 40, 39, 107, -28, 116, 45, -51, 104, 44, -33, -112, -98, com.visa.cbp.getEncExpo.IResultReceiver2, Byte.MIN_VALUE, 99, 86, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 71, 37, 87, -112, -72, -46, -33, 65, -42, 74, 39, 74, 75, -33, -43, -110, -115, -42, 78, 69, 35, -45, -112, -120, 77, 87, -35, 125, -36, 63, 58, 88, -18, 72, 63, com.google.common.base.Ascii.ETB, 74, -5, 77, 46, 103, -6, 78, -6, 73, 77, 46, com.google.common.base.Ascii.ETB, 86, 72, -58, -90, -61, -112, 2, 89, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 94, 42, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 72, 41, -118, -18, 47, 45, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 63, 82, 69};
        coroutineCreation = new char[]{40017, 24413, 6660, 54768, 37042, 21396, 3841, 51747, 34276, 16604, 910, 65383, 47652, 30033, 12501, 62393, 44900, 27153, 9477, 57588, 41891, 40580, 23110, 5430, 53476, 37827, 40017, 24387, 6670, 54753, 37028, 21379, 3925, 51752, 34258, 16581, 910, 65379, 47648, 29974, 12484, 62463, 44869, 27220, 9495, 57592, 41890, 40596, 23143, 5432, 53487, 37846, 20100, 2659, 50449, 32771, 17352, 16063, 64117, 46460, 28672, 13311, 61088, 43414, 25924, 8227, 40017, 24387, 6670, 54753, 37028, 21379, 3925, 51752, 34258, 16581, 910, 65379, 47648, 29974, 12484, 62463, 44882, 27220, 9474, 57572, 41907, 40596, 23154, 5428, 53474, 37827, 20100, 2661, 50450, 32788, 17348, 16053, 64076, 46416, 28687, 13296, 61094, 43412, 25939, 40005, 24404, 6679, 54776, 37026, 21396, 3841, 51767, 34280, 16607, 902, 65396, 47667, 29953, 12499, 62392, 44911, 27205, 9537, 57589, 41888, 40581, 23104, 5489, 53474, 37840, 20111, 2687, 50478, 32773, 17281, 16051, 64100, 46353, 28687, 13284, 61101, 43421, 25871, 38747, 21597, 4363, 57069, 39866, 22685, 1032, 49451, 36589, 19419, 2202, 62589, 45372, 32344, 15323, 63677, 42093, 24924, 11848, 60412, 43177, 38284, 20809, 7800, 56299, 39129, 17798, 374, 52775, 35596, 18568, 13754, 61805, 48664, 31494, 14573, 58788, 41620, 28166, 24025, 40645, 56200, 5220, 20793, 37406, 52892, 2979, 17522, 33097, 49756, 16099, 31674, 46284, 61765, 12835, 28393, 43998, 58588, 8572, 25149, 24350, 39901, 54433, 4473, 21080, 36633, 52222, 1199, 16844, 33365, 65343, 15292, 29897, 45457, 62076, 12072, 26645, 42140, 57763, 8814, 7948, 22546, 38137, 53680, 4736, 40008, 24415, 6677, 54772, 37043, 21407, 3904, 51773, 34209, 16596, 915, 65379, 47662, 29955, 12417, 62398, 44898, 27218, 9492, 57571, 41907, 40596, 23109, 5503, 40004, 24387, 6675, 54782, 37043, 21457, 3918, 51775, 34209, 16579, 900, 65392, 47653, 29976, 12495, 62390, 44846, 27218, 9491, 57588, 41888, 40581, 23112, 5439, 53478, 37790, 20101, 2676, 50477, 32788, 17365, 16056, 64111, 46422, 28737, 13285, 61097, 43412, 25857, 8250, 58340, 57032, 39314, 21861, 4142, 54019, 36548, 18928, 1313, 49271, 33544, 32509, 14756, 62673, 45122, 29488, 12015, 59871, 42126, 24677, 9057, 7699, 55748, 38129, 20578, 4931, 52740, 35312, 17589, 1940, 49989, 48753, 31214, 13507, 63425, 45923, 28196, 10512, 58565};
        isOutputSupportedFor = -2599233737676988623L;
    }
}
