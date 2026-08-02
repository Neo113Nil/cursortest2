package util.h.xy.ca;

/* loaded from: classes5.dex */
public class ra implements com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final byte[] getHighSpeedVideoFpsRanges = null;
    private static long getHighSpeedVideoFpsRangesFor = 0;
    private static final int getHighSpeedVideoSizes = 0;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 0;
    private static byte[] getOutputMinFrameDuration = null;
    private static int getOutputMinFrameDurationlomOqCM = 0;
    private static int getOutputSizes = 0;
    private static short[] getOutputSizeshNQ4ISI = null;
    private static int getOutputStallDuration = 1;
    private static long getOutputStallDurationlomOqCM;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.ca.ra f1090;
    private java.lang.String CoroutineDebuggingKt;
    private com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener accessartificialFrame;
    private util.h.xy.ah.a b;
    private java.lang.String coroutineBoundary;
    private boolean isOutputSupportedForhNQ4ISI = false;
    private byte[] _BOUNDARY = null;
    private byte[] getValidOutputFormatsForInputhNQ4ISI = null;
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType unwrapAs = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE;
    private com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType toString = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.ACTIVATION_CODE;
    private util.h.xy.bv.h isOutputSupportedFor = null;
    private final com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier coroutineCreation = new util.h.xy.ap.ma(new util.h.xy.at.mb() { // from class: util.h.xy.ca.ra.10
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int[] getHighSpeedVideoSizes = {-1591899793, -1530061965, -1344422341, 379345140, 1884294358, -1883996936, -651708978, 1407035772, 1931260458, -364935371, -1481346452, 1863416693, 1644009254, -2043523266, 1789970098, -12282518, 2137352705, -2082106376};
        private static int getOutputFormats = 1;

        private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
            util.h.xz.b.c cVar = new util.h.xz.b.c();
            char[] cArr = new char[4];
            int length = iArr.length;
            char[] cArr2 = new char[28];
            int[] iArr2 = getHighSpeedVideoSizes;
            if (iArr2 != null) {
                int length2 = iArr2.length;
                int[] iArr3 = new int[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                }
                iArr2 = iArr3;
            }
            int length3 = iArr2.length;
            int[] iArr4 = new int[length3];
            int[] iArr5 = getHighSpeedVideoSizes;
            if (iArr5 != null) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
                int length4 = iArr5.length;
                int[] iArr6 = new int[length4];
                for (int i3 = 0; i3 < length4; i3++) {
                    iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                }
                iArr5 = iArr6;
            }
            java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length3);
            cVar.f2626 = 0;
            while (cVar.f2626 < iArr.length) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 9) % 128;
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

        @Override // util.h.xy.at.mb
        /* renamed from: ᐝ */
        public final void mo25118(byte[] bArr) {
            if (bArr != null) {
                int i = getHighSpeedVideoFpsRangesFor + 37;
                getOutputFormats = i % 128;
                if (i % 2 != 0) {
                    if (util.h.xy.cg.a.m25903(bArr)) {
                        byte[] m25117 = util.h.xy.at.ma.m25117();
                        util.h.xy.ca.ra raVar = util.h.xy.ca.ra.this;
                        util.h.xy.ca.ra.Camera2StreamConfigurationMap(raVar, util.h.xy.ca.ra.getOutputFormats(raVar), util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this), bArr, m25117);
                    } else {
                        util.h.xy.ar.b.m25100(util.h.xy.ca.ra.getOutputFormats(util.h.xy.ca.ra.this), util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this));
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_ACTIVATION_MOBILE_PIN_INVALID_LENGTH;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1444443023, -1106237938, -437430429, 1387181345, -1319028961, 1142008137, 1520747522, -1059543187, -1892728033, 845734824, -617407525, -1015132727, -61878346, 67438079}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 26, objArr);
                        util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr[0]).intern(), null));
                    }
                } else {
                    util.h.xy.cg.a.m25903(bArr);
                    throw new java.lang.ArithmeticException();
                }
            }
            getHighSpeedVideoFpsRangesFor = (getOutputFormats + 81) % 128;
        }
    });
    private final com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier ArtificialStackFrames = new util.h.xy.ap.ma(new util.h.xy.at.mb() { // from class: util.h.xy.ca.ra.7
        @Override // util.h.xy.at.mb
        /* renamed from: ᐝ */
        public final void mo25118(byte[] bArr) {
            if (bArr != null) {
                synchronized (util.h.xy.ca.ra.class) {
                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                    util.h.xy.ar.b.m25074(bArr);
                    byte[] m25117 = util.h.xy.at.ma.m25117();
                    if (util.h.xy.ca.ra.getInputSizeshNQ4ISI(util.h.xy.ca.ra.this) == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.MOBILE_PIN) {
                        util.h.xy.ca.ra.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ra.this, new byte[bArr.length]);
                        java.lang.System.arraycopy(bArr, 0, util.h.xy.ca.ra.getOutputFormats(util.h.xy.ca.ra.this), 0, bArr.length);
                        util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this, new byte[m25117.length]);
                        java.lang.System.arraycopy(m25117, 0, util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this), 0, m25117.length);
                        util.h.xy.ca.ra.getOutputMinFrameDuration(util.h.xy.ca.ra.this);
                    } else {
                        util.h.xy.ca.ra.Camera2StreamConfigurationMap(util.h.xy.ca.ra.this, bArr, m25117, null, null);
                    }
                    util.h.xy.at.ma.m25116();
                }
            }
        }
    });

    private static void Camera2StreamConfigurationMap(java.lang.Object[] objArr) {
        int i;
        int i2 = getInputSizeshNQ4ISI + 125;
        int i3 = i2 % 128;
        getOutputStallDuration = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] cArr = new char[1];
        if (getHighSpeedVideoFpsRanges == null) {
            getInputSizeshNQ4ISI = (i3 + 79) % 128;
            i = -712;
        } else {
            i = 715;
        }
        cArr[0] = (char) i;
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputStallDurationlomOqCM ^ (-7508379876853140581L));
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

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 37;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRangesFor ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 117) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getInputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            int i6 = Camera2StreamConfigurationMap + 83;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            int i7 = i6 % 2;
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 27) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 31;
                Camera2StreamConfigurationMap = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr3[raVar.f2649] = cArr[(i % raVar.f2649) >>> 1];
                    i4 = raVar.f2649 >>> 1;
                } else {
                    cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                    i4 = raVar.f2649 + 1;
                }
                raVar.f2649 = i4;
            }
            cArr = cArr3;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 33) % 128;
        objArr[0] = str2;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier Camera2StreamConfigurationMap(util.h.xy.ca.ra raVar) {
        int i = (getInputSizeshNQ4ISI + 85) % 128;
        getOutputStallDuration = i;
        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier = raVar.coroutineCreation;
        int i2 = i + 115;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return cHCodeVerifier;
        }
        throw null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.ca.ra raVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = getOutputStallDuration + 91;
        getInputSizeshNQ4ISI = i % 128;
        raVar.getHighSpeedVideoSizes(bArr, bArr2, bArr3, bArr4);
        if (i % 2 != 0) {
            throw null;
        }
        getOutputStallDuration = (getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getInputSizeshNQ4ISI + 55) % 128;
        getOutputStallDuration = i;
        java.lang.String str = getHighSpeedVideoSizesFor;
        getInputSizeshNQ4ISI = (i + 11) % 128;
        return str;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra raVar, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        getOutputStallDuration = (getInputSizeshNQ4ISI + 113) % 128;
        raVar.getHighSpeedVideoFpsRangesFor(provisioningServiceError);
        int i = getOutputStallDuration + 101;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra raVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        getOutputStallDuration = (getInputSizeshNQ4ISI + 27) % 128;
        raVar.Camera2StreamConfigurationMap(bArr, bArr3);
        int i = getInputSizeshNQ4ISI + 69;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra raVar) {
        int i = getInputSizeshNQ4ISI + 53;
        getOutputStallDuration = i % 128;
        byte[] bArr = raVar.getValidOutputFormatsForInputhNQ4ISI;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra raVar, byte[] bArr) {
        int i = getInputSizeshNQ4ISI + 47;
        int i2 = i % 128;
        getOutputStallDuration = i2;
        raVar.getValidOutputFormatsForInputhNQ4ISI = bArr;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = i2 + 101;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener getHighSpeedVideoFpsRanges(util.h.xy.ca.ra raVar) {
        int i = getInputSizeshNQ4ISI + 125;
        getOutputStallDuration = i % 128;
        com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener = raVar.accessartificialFrame;
        if (i % 2 != 0) {
            return enrollingServiceListener;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ra raVar) {
        int i = getInputSizeshNQ4ISI + 125;
        int i2 = i % 128;
        getOutputStallDuration = i2;
        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier cHCodeVerifier = raVar.ArtificialStackFrames;
        int i3 = i % 2;
        if (i3 == 0) {
            throw null;
        }
        getOutputStallDuration = i2;
        if (i3 != 0) {
            return cHCodeVerifier;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ra raVar, byte[] bArr) {
        int i = getOutputStallDuration + 55;
        getInputSizeshNQ4ISI = i % 128;
        raVar._BOUNDARY = bArr;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.ca.ra raVar) {
        int i = getOutputStallDuration + 113;
        getInputSizeshNQ4ISI = i % 128;
        raVar.toString = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.ACTIVATION_CODE;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.6
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static long getHighSpeedVideoSizes = 4159743956709151670L;
            private static int getInputSizeshNQ4ISI;

            private static void getHighSpeedVideoSizes(java.lang.String str, int i2, java.lang.Object[] objArr) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 25) % 128;
                char[] charArray = str.toCharArray();
                util.h.xz.b.d dVar = new util.h.xz.b.d();
                dVar.f2628 = i2;
                int length = charArray.length;
                long[] jArr = new long[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
                    dVar.f2629++;
                }
                char[] cArr = new char[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 29) % 128;
                    cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                    dVar.f2629++;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u2061跼筦⣭", 44416 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u2068ꮺ㟔荼༼魅暀\uf2b3纫쨟嘼≘", android.widget.ExpandableListView.getPackedPositionChild(0L) + 35798, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.ca.ra.getHighSpeedVideoFpsRanges(util.h.xy.ca.ra.this).onCodeRequired(util.h.xy.ca.ra.getHighSpeedVideoFpsRangesFor(util.h.xy.ca.ra.this));
                int i2 = getInputSizeshNQ4ISI + 75;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            }
        });
        int i2 = getOutputStallDuration;
        int i3 = i2 + 47;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 73;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.ca.ra raVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = getInputSizeshNQ4ISI + 33;
        getOutputStallDuration = i % 128;
        try {
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.4
                private static char[] Camera2StreamConfigurationMap = {42265, 42454, 42452, 42462, 42356, 42269, 42340, 42270, 42263, 42253, 42336, 42339, 42252, 42257, 42270};
                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                private static int getHighSpeedVideoFpsRanges = 0;
                private static int getHighSpeedVideoSizes = 1;
                private static int getOutputFormats = 1;

                private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 65) % 128;
                    byte[] bytes = str.getBytes("ISO-8859-1");
                    util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = Camera2StreamConfigurationMap;
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
                        }
                        cArr = cArr2;
                    }
                    char[] cArr3 = new char[i3];
                    java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
                    if (bytes != null) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 75) % 128;
                        char[] cArr4 = new char[i3];
                        maVar.f2631 = 0;
                        char c = 0;
                        while (maVar.f2631 < i3) {
                            if (bytes[maVar.f2631] == 1) {
                                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 117) % 128;
                                cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                            } else {
                                cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                            }
                            c = cArr4[maVar.f2631];
                            maVar.f2631++;
                        }
                        cArr3 = cArr4;
                    }
                    if (i5 > 0) {
                        int i7 = getHighSpeedVideoFpsRanges + 17;
                        getHighSpeedVideoSizes = i7 % 128;
                        if (i7 % 2 == 0) {
                            char[] cArr5 = new char[i3];
                            java.lang.System.arraycopy(cArr3, 0, cArr5, 1, i3);
                            java.lang.System.arraycopy(cArr5, 0, cArr3, i3 - i5, i5);
                            java.lang.System.arraycopy(cArr5, i5, cArr3, 1, i3 % i5);
                        } else {
                            char[] cArr6 = new char[i3];
                            java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i3);
                            int i8 = i3 - i5;
                            java.lang.System.arraycopy(cArr6, 0, cArr3, i8, i5);
                            java.lang.System.arraycopy(cArr6, i5, cArr3, 0, i8);
                        }
                    }
                    if (z) {
                        char[] cArr7 = new char[i3];
                        maVar.f2631 = 0;
                        while (maVar.f2631 < i3) {
                            cArr7[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                            maVar.f2631++;
                        }
                        cArr3 = cArr7;
                    }
                    if (i4 > 0) {
                        maVar.f2631 = 0;
                        while (maVar.f2631 < i3) {
                            cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                            maVar.f2631++;
                        }
                    }
                    objArr[0] = new java.lang.String(cArr3);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String intern;
                    java.lang.Object obj;
                    int i2 = getHighResolutionOutputSizeshNQ4ISI + 97;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 61, 0}, "\u0001\u0000\u0001\u0000", objArr);
                        intern = ((java.lang.String) objArr[0]).intern();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(true, new int[]{4, 11, 0, 9}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", objArr2);
                        obj = objArr2[0];
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(false, new int[]{0, 4, 61, 0}, "\u0001\u0000\u0001\u0000", objArr3);
                        intern = ((java.lang.String) objArr3[0]).intern();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(false, new int[]{4, 11, 0, 9}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", objArr4);
                        obj = objArr4[0];
                    }
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
                    util.h.xy.ca.ra.getHighSpeedVideoFpsRanges(util.h.xy.ca.ra.this).onStarted();
                }
            });
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25615 = util.h.xy.bs.b.m25615(util.h.xy.bs.ma.m25617(raVar.coroutineBoundary.getBytes(), bArr));
            if (m25615 == null) {
                getInputSizeshNQ4ISI = (getOutputStallDuration + 61) % 128;
                raVar.Camera2StreamConfigurationMap(bArr, bArr3);
            } else {
                raVar.getHighResolutionOutputSizeshNQ4ISI(m25615, bArr3);
                util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1056);
            }
            getOutputStallDuration = (getInputSizeshNQ4ISI + 45) % 128;
        } catch (util.h.xy.ck.rc e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbcfข။\u1a9c⳨", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 62922, objArr);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
            raVar.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bs.b.m25616(e), bArr3);
        }
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType getInputSizeshNQ4ISI(util.h.xy.ca.ra raVar) {
        int i = (getInputSizeshNQ4ISI + 87) % 128;
        getOutputStallDuration = i;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType = raVar.unwrapAs;
        int i2 = i + 25;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return provisioningServicePinType;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ byte[] getOutputFormats(util.h.xy.ca.ra raVar) {
        int i = (getOutputStallDuration + 71) % 128;
        getInputSizeshNQ4ISI = i;
        byte[] bArr = raVar._BOUNDARY;
        int i2 = i + 51;
        getOutputStallDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ void getOutputMinFrameDuration(util.h.xy.ca.ra raVar) {
        int i = getInputSizeshNQ4ISI + 105;
        getOutputStallDuration = i % 128;
        raVar.toString = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.MOBILE_PIN;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.8
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizes = 1;
            private static long getHighSpeedVideoSizesFor = 1760318977057963558L;

            private static void getHighSpeedVideoSizes(java.lang.String str, int i2, java.lang.Object[] objArr) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 105) % 128;
                char[] charArray = str.toCharArray();
                util.h.xz.b.a aVar = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i2);
                aVar.f2623 = 4;
                while (aVar.f2623 < m27721.length) {
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 17) % 128;
                    aVar.f2624 = aVar.f2623 - 4;
                    m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
                    aVar.f2623++;
                }
                objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String intern;
                java.lang.Object obj;
                int i2 = getHighSpeedVideoFpsRangesFor + 53;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("佺伶낒\ue61b盌橎啠܉", android.view.ViewConfiguration.getFadingEdgeLength() * 54, objArr);
                    intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("䍱䌴樀쾕걌䏚㛶擲嬌牋\ue7dd峙猯婽５됾ஔꊪ", android.text.TextUtils.getTrimmedLength(""), objArr2);
                    obj = objArr2[0];
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("佺伶낒\ue61b盌橎啠܉", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr3);
                    intern = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("䍱䌴樀쾕걌䏚㛶擲嬌牋\ue7dd峙猯婽５됾ஔꊪ", android.text.TextUtils.getTrimmedLength(""), objArr4);
                    obj = objArr4[0];
                }
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
                util.h.xy.ca.ra.getHighSpeedVideoFpsRanges(util.h.xy.ca.ra.this).onCodeRequired(util.h.xy.ca.ra.Camera2StreamConfigurationMap(util.h.xy.ca.ra.this));
                int i3 = getHighSpeedVideoFpsRangesFor + 53;
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = (getOutputStallDuration + 25) % 128;
        getInputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            throw null;
        }
        getOutputStallDuration = (i2 + 11) % 128;
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizesFor = util.h.xy.ca.ra.class.getName();
        f1090 = null;
        int i = getOutputStallDuration + 89;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ca.ra m25842(android.content.Context context) {
        util.h.xy.ca.ra raVar;
        synchronized (util.h.xy.ca.ra.class) {
            int i = getOutputStallDuration + 33;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (f1090 == null) {
                f1090 = new util.h.xy.ca.ra(context, new util.h.xy.ah.ra());
            }
            raVar = f1090;
            getOutputStallDuration = (getInputSizeshNQ4ISI + 111) % 128;
        }
        return raVar;
    }

    public ra(android.content.Context context, util.h.xy.ah.a aVar) {
        this.b = aVar;
    }

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void initialize() {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getOutputStallDuration + 57;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbc6筿憎稶", 32934 - android.text.TextUtils.lastIndexOf("", 'w', 0, 0), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbcfἽ㈳唜桰茊", android.text.TextUtils.getOffsetBefore("", 1) + 58613, objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbc6筿憎稶", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32934, objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbcfἽ㈳唜桰茊", android.text.TextUtils.getOffsetBefore("", 0) + 58613, objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
    }

    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getOutputSizeshNQ4ISI[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getOutputFormats ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputSizeshNQ4ISI;
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

    @Override // com.gemalto.mfs.mwsdk.sdkconfig.BusinessService
    public void reset() {
        getInputSizeshNQ4ISI = (getOutputStallDuration + 45) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", 32933 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbcf\uf0e1\ued8b\udab8휀찕", android.text.TextUtils.indexOf("", "", 0) + 2857, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        this.isOutputSupportedForhNQ4ISI = false;
        this.unwrapAs = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE;
        this.toString = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType.ACTIVATION_CODE;
        java.lang.String str = this.coroutineBoundary;
        if (str != null) {
            util.h.xy.ar.b.m25095(str.getBytes());
        }
        java.lang.String str2 = this.CoroutineDebuggingKt;
        if (str2 != null) {
            util.h.xy.ar.b.m25095(str2.getBytes());
        }
        byte[] bArr = this._BOUNDARY;
        if (bArr != null) {
            getOutputStallDuration = (getInputSizeshNQ4ISI + 61) % 128;
            util.h.xy.ar.b.m25095(bArr);
        }
        byte[] bArr2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (bArr2 != null) {
            util.h.xy.ar.b.m25095(bArr2);
            getOutputStallDuration = (getInputSizeshNQ4ISI + 69) % 128;
        }
        this.accessartificialFrame = null;
        if (f1090 == null) {
            int i = getOutputStallDuration;
            int i2 = i + 13;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.b != null) {
                getInputSizeshNQ4ISI = (i + 39) % 128;
                this.b = null;
            }
        }
        this.isOutputSupportedForhNQ4ISI = false;
        try {
            util.h.xy.by.ma.f1067.m25807();
            util.h.xy.by.ma.f1067.m25795();
            getInputSizeshNQ4ISI = (getOutputStallDuration + 87) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getLocalizedMessage();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService
    public com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus isEnrolled() {
        getOutputStallDuration = (getInputSizeshNQ4ISI + 61) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", 32933 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbcf멿碷㻦ﵸ덐熅", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 16823, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus inputFormats = getInputFormats();
        getInputSizeshNQ4ISI = (getOutputStallDuration + 15) % 128;
        return inputFormats;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService
    public com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType getCodeType() {
        getInputSizeshNQ4ISI = (getOutputStallDuration + 97) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", android.view.View.MeasureSpec.getMode(0) + 32933, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbcf豥ᒃ鳄┐궬㗇빥", android.view.View.resolveSize(0, 0) + 30637, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceCodeType provisioningServiceCodeType = this.toString;
        int i = getOutputStallDuration + 77;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return provisioningServiceCodeType;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService
    public void enroll(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener) {
        getOutputStallDuration = (getInputSizeshNQ4ISI + 13) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", 32934 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbcf\uebe3\udb8f쭂묈\uab18", 4139 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRanges(str, str2, str3, enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE);
        getOutputStallDuration = (getInputSizeshNQ4ISI + 53) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService
    public void enroll(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        getOutputStallDuration = (getInputSizeshNQ4ISI + 125) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 32933, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufff1\u0004￭\b\u0012\u0001\u0004", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7, android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, true, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRanges(str, str2, str3, enrollingServiceListener, provisioningServicePinType);
        int i = getInputSizeshNQ4ISI + 71;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService
    public void continueEnrollment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener) {
        getInputSizeshNQ4ISI = (getOutputStallDuration + 35) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", android.graphics.Color.argb(0, 0, 0, 0) + 32933, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0010\u0006￫\u0000\u0002\u0002\uffff", android.view.KeyEvent.getDeadChar(0, 0) + 7, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, 254 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        Camera2StreamConfigurationMap(str, enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.NONE);
        getOutputStallDuration = (getInputSizeshNQ4ISI + 69) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService
    public void continueEnrollment(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        getInputSizeshNQ4ISI = (getOutputStallDuration + 101) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc6筿憎稶", 32933 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbcf鏟⯷쎆寸\uf3ba譅⌙", 26647 - android.view.View.resolveSize(0, 0), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        Camera2StreamConfigurationMap(str, enrollingServiceListener, provisioningServicePinType);
        int i = getInputSizeshNQ4ISI + 17;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m25844() {
        int i = (getOutputStallDuration + 115) % 128;
        getInputSizeshNQ4ISI = i;
        boolean z = this.isOutputSupportedForhNQ4ISI;
        getOutputStallDuration = (i + 97) % 128;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus getInputFormats() {
        boolean z;
        util.h.xy.by.ma maVar;
        com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus enrollmentStatus = com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED;
        try {
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | util.h.xy.ci.ma | util.h.xy.ck.rc unused) {
            enrollmentStatus = com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED;
        }
        if (util.h.xy.ag.a.m24556().m24560()) {
            boolean m25806 = util.h.xy.by.ma.f1067.m25806();
            util.h.xy.bs.ra.f1036.m25620();
            boolean m25946 = util.h.xy.ck.ra.f1116.m25946();
            if (m25806) {
                if (m25946) {
                    enrollmentStatus = com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_COMPLETE;
                }
                z = true;
                if (z) {
                    return enrollmentStatus;
                }
                int i = getInputSizeshNQ4ISI + 119;
                getOutputStallDuration = i % 128;
                try {
                    if (i % 2 == 0) {
                        util.h.xy.by.ma.f1067.m25809(true);
                        maVar = util.h.xy.by.ma.f1067;
                    } else {
                        util.h.xy.by.ma.f1067.m25809(false);
                        maVar = util.h.xy.by.ma.f1067;
                    }
                    maVar.m25818();
                    util.h.xy.by.ma.f1067.m25798();
                    util.h.xy.cg.d.m25913();
                    return enrollmentStatus;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
                    util.h.xy.bs.ra.f1036.m25621();
                    return com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED;
                }
            }
            if (m25946) {
                enrollmentStatus = com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_IN_PROGRESS;
            }
            z = false;
            if (z) {
            }
        } else {
            int i2 = getOutputStallDuration + 49;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus enrollmentStatus2 = com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED;
                int i3 = getInputSizeshNQ4ISI + 47;
                getOutputStallDuration = i3 % 128;
                if (i3 % 2 != 0) {
                    return enrollmentStatus2;
                }
                throw null;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus enrollmentStatus3 = com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED;
            throw new java.lang.NullPointerException();
        }
    }

    private void Camera2StreamConfigurationMap(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        if (enrollingServiceListener == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufbc7\uddda랔襽挱䓧Ẕ\uf089쩃갥藹徠㆓\u0b4f\ued09웣颩爯呓⸄߀\ud9bd덫锽潒䃅\u1a8dﰽ혨꿾臐宍", 9782 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (str == null || str.isEmpty()) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbc7\uddda랔襽挱䓧Ẕ\uf089쩃갥藹徠㆓\u0b4f\ued09웣颩爯呓⸄߀\ud9bd덫锽潒䃅\u1a8dﰽ혨꿾臐宍", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9733, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1058);
        this.CoroutineDebuggingKt = str;
        this.accessartificialFrame = enrollingServiceListener;
        this.unwrapAs = provisioningServicePinType;
        if (getInputSizeshNQ4ISI() && getHighSpeedVideoSizesFor()) {
            if (getInputFormats() != com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_IN_PROGRESS) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0015\u0014ￆ\u0019\u000fￆ\ufff1￪\ufff9ￆ\u000b\u000e\ufffa\u001a\u0019\u0018\u000f\fￆￏￎ\n\u000b\u0012\u0012\u0015\u0018\u0014￫\u0019\u000fￆ\u0011\t\u000b\u000e\tￆ\u0015\u001aￆ\u000b\u0018\u001b\u0019ￆ\u000b\u0011\u0007\ufff3ￆￔ\u001a\u0019\u000b\u001b\u0017\u000b\u0018ￆ\u0019\u000f\u000e\u001aￆ\u0018\u0015\fￆ\u000b\u001a\u0007\u001a\u0019ￆ\u001a\u000e\r\u000f\u0018ￆ\u000b\u000e\u001aￆ\u0014\u000fￆ\u001a", 90 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 - android.view.KeyEvent.normalizeMetaState(0), 277 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, objArr3);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
            }
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.5
                private static int Camera2StreamConfigurationMap = 0;
                private static int[] getHighSpeedVideoFpsRanges = {-1692968133, 968837664, -1213412178, 1023106621, 16302173, -891554299, 738753335, 182519240, -626497387, 1117910561, 1914251952, 614470265, -799217514, -1764519532, -2112298860, -877387996, 959886168, -1082805669};
                private static int getHighSpeedVideoFpsRangesFor = 1;

                private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr4) {
                    util.h.xz.b.c cVar = new util.h.xz.b.c();
                    char[] cArr = new char[4];
                    int length = iArr.length;
                    char[] cArr2 = new char[48];
                    int[] iArr2 = getHighSpeedVideoFpsRanges;
                    if (iArr2 != null) {
                        int length2 = iArr2.length;
                        int[] iArr3 = new int[length2];
                        int i2 = 0;
                        while (i2 < length2) {
                            int i3 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRangesFor = (i3 + 61) % 128;
                            iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                            i2++;
                            getHighSpeedVideoFpsRangesFor = (i3 + 23) % 128;
                        }
                        iArr2 = iArr3;
                    }
                    int length3 = iArr2.length;
                    int[] iArr4 = new int[length3];
                    int[] iArr5 = getHighSpeedVideoFpsRanges;
                    if (iArr5 != null) {
                        int length4 = iArr5.length;
                        int[] iArr6 = new int[length4];
                        for (int i4 = 0; i4 < length4; i4++) {
                            iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
                        }
                        iArr5 = iArr6;
                    }
                    java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length3);
                    cVar.f2626 = 0;
                    while (cVar.f2626 < iArr.length) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 49) % 128;
                        cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                        cArr[1] = (char) iArr[cVar.f2626];
                        cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                        cArr[3] = (char) iArr[cVar.f2626 + 1];
                        cVar.f2627 = (cArr[0] << 16) + cArr[1];
                        cVar.f2625 = (cArr[2] << 16) + cArr[3];
                        util.h.xz.b.c.m27723(iArr4);
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                        for (int i5 = 0; i5 < 16; i5++) {
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
                    objArr4[0] = new java.lang.String(cArr2, 0, i);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    java.lang.Throwable th2;
                    byte[] bArr;
                    byte[] bArr2;
                    byte[] bArr3 = null;
                    try {
                        bArr2 = util.h.xy.by.ma.f1067.m25813();
                        try {
                            bArr = util.h.xy.by.ma.f1067.m25796();
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                            bArr = null;
                            if (bArr2 != null) {
                            }
                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                            util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this);
                            util.h.xy.ar.b.m25100(bArr2, bArr);
                        } catch (java.lang.Throwable th3) {
                            bArr = null;
                            bArr3 = bArr2;
                            th2 = th3;
                            util.h.xy.ar.b.m25100(bArr3, bArr);
                            throw th2;
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
                        bArr2 = null;
                    } catch (java.lang.Throwable th4) {
                        th2 = th4;
                        bArr = null;
                    }
                    if (bArr2 != null) {
                        try {
                            if (bArr2.length != 0) {
                                if ((bArr == null || bArr.length == 0) && util.h.xy.ca.ra.getInputSizeshNQ4ISI(util.h.xy.ca.ra.this) == com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType.MOBILE_PIN) {
                                    util.h.xy.ar.b.m25095(bArr2);
                                    try {
                                        util.h.xy.by.ma.f1067.m25807();
                                        util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this);
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                        util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                        e.getLocalizedMessage();
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        try {
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{-966034885, -1132184137, 1619556084, -417454498, -827591089, 1558059860, -323146578, 1810548793, -889557678, 957249247, -1024340937, 246470062, 128755153, 1934477662, 1176783849, -1169141640, 132506887, -2117382856, -490237834, -781650833, 1150570934, 866429046, 1378800694, 167016626}, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 48, objArr4);
                                            sb.append(((java.lang.String) objArr4[0]).intern());
                                            sb.append(e.getMessage());
                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, sb.toString(), null));
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause2 = th5.getCause();
                                            if (cause2 == null) {
                                                throw th5;
                                            }
                                            throw cause2;
                                        }
                                    }
                                } else {
                                    byte[] m25117 = util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this) == null ? util.h.xy.at.ma.m25117() : util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this);
                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this, util.h.xy.al.mb.m25009(false, bArr2, m25117), bArr, util.h.xy.al.mb.m25010(false, bArr2, m25117));
                                }
                                util.h.xy.ar.b.m25100(bArr2, bArr);
                            }
                        } catch (java.lang.Throwable th6) {
                            byte[] bArr4 = bArr2;
                            th2 = th6;
                            bArr3 = bArr4;
                            util.h.xy.ar.b.m25100(bArr3, bArr);
                            throw th2;
                        }
                    }
                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                    util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this);
                    util.h.xy.ar.b.m25100(bArr2, bArr);
                }
            }).start();
        }
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str, final java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener enrollingServiceListener, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServicePinType provisioningServicePinType) {
        int i = getOutputStallDuration;
        int i2 = i + 85;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null && str3 != null) {
            getInputSizeshNQ4ISI = (i + 25) % 128;
            if (enrollingServiceListener != null) {
                int i3 = (i + 51) % 128;
                getInputSizeshNQ4ISI = i3;
                if (str2 != null) {
                    int i4 = i3 + 1;
                    getOutputStallDuration = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    if (!str2.isEmpty()) {
                        int i5 = getInputSizeshNQ4ISI + 63;
                        getOutputStallDuration = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        if (!str.isEmpty()) {
                            int i6 = getOutputStallDuration + 53;
                            getInputSizeshNQ4ISI = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            if (!str3.isEmpty()) {
                                new java.lang.Object[]{str, str2, str3};
                                util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1058);
                                this.coroutineBoundary = str.toLowerCase();
                                this.CoroutineDebuggingKt = str3;
                                this.accessartificialFrame = enrollingServiceListener;
                                this.unwrapAs = provisioningServicePinType;
                                if (getInputSizeshNQ4ISI() && getHighSpeedVideoSizesFor()) {
                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25906 = util.h.xy.cg.a.m25906();
                                    if (m25906 != null) {
                                        getHighSpeedVideoFpsRangesFor(m25906);
                                        return;
                                    }
                                    java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.1
                                        private static int Camera2StreamConfigurationMap = 1;
                                        private static int getHighSpeedVideoFpsRanges;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i7 = Camera2StreamConfigurationMap;
                                            int i8 = (i7 ^ 17) + ((i7 & 17) << 1);
                                            getHighSpeedVideoFpsRanges = i8 % 128;
                                            try {
                                                if (i8 % 2 == 0) {
                                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                    util.h.xy.by.ma.f1067.m25811(str2);
                                                    util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this);
                                                    int i9 = getHighSpeedVideoFpsRanges;
                                                    Camera2StreamConfigurationMap = ((i9 & 67) + (i9 | 67)) % 128;
                                                    return;
                                                }
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                util.h.xy.by.ma.f1067.m25811(str2);
                                                util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this);
                                                throw new java.lang.NullPointerException();
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                e.getMessage();
                                            }
                                        }
                                    });
                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("\u0015\u0013\uffc0\u0007\u000e\t\f\f\u000f\u0012\u000e￥\u0004\u0001\u0005\u0012\b\ufff4\uffc0\u0002", 20 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, true, objArr);
                                    thread.setName(((java.lang.String) objArr[0]).intern());
                                    thread.start();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc7\uddda랔襽挱䓧Ẕ\uf089쩃갥藹徠㆓\u0b4f\ued09웣颩爯呓⸄߀\ud9bd덫锽潒䃅\u1a8dﰽ혨꿾臐宍", 9781 - android.graphics.Color.alpha(0), objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) {
        m25843();
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25906 = util.h.xy.cg.a.m25906();
        if (m25906 == null) {
            if (Camera2StreamConfigurationMap(bArr2)) {
                util.h.xy.bv.h highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, bArr2);
                this.isOutputSupportedFor = highSpeedVideoSizes;
                if (highSpeedVideoSizes == null || highSpeedVideoSizes.m25745() != util.h.xy.bv.rb.ra.f1062) {
                    return;
                }
                int i = getOutputStallDuration + 55;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    if (highSpeedVideoSizes.m25694() != null) {
                        try {
                            util.h.xy.cg.b.m25907().m25912(new java.lang.String(bArr2), highSpeedVideoSizes.m25694(), highSpeedVideoSizes.m25696());
                            if (highSpeedVideoSizes.m25696() != null) {
                                util.h.xy.cg.b.m25907().m25912(util.h.xy.cg.b.m25907().m25908(bArr2), highSpeedVideoSizes.m25694(), highSpeedVideoSizes.m25696());
                            }
                            int i2 = getInputSizeshNQ4ISI + 63;
                            getOutputStallDuration = i2 % 128;
                            if (i2 % 2 != 0) {
                                getHighSpeedVideoFpsRanges(highSpeedVideoSizes.m25695(), highSpeedVideoSizes.m25694(), highSpeedVideoSizes.m25696());
                                util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1057);
                                return;
                            } else {
                                getHighSpeedVideoFpsRanges(highSpeedVideoSizes.m25695(), highSpeedVideoSizes.m25694(), highSpeedVideoSizes.m25696());
                                util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1057);
                                throw new java.lang.ArithmeticException();
                            }
                        } catch (java.lang.Exception unused) {
                            util.h.xy.cg.b.m25907().m25911(new java.lang.String(bArr2));
                            getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(highSpeedVideoSizes.m25694()), bArr2);
                            util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1057);
                            return;
                        }
                    }
                    Camera2StreamConfigurationMap();
                    return;
                }
                highSpeedVideoSizes.m25694();
                throw null;
            }
            util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1056);
            return;
        }
        getInputSizeshNQ4ISI = (getOutputStallDuration + 59) % 128;
        getHighSpeedVideoFpsRangesFor(m25906);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25843() {
        int i = getOutputStallDuration;
        int i2 = i + 89;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.isOutputSupportedFor = null;
            int i3 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getInputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.isOutputSupportedFor = null;
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, java.lang.String str, java.lang.String str2) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25706;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufff9\uffff\u0006\u0002", 4 - android.text.TextUtils.getCapsMode("", 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 4, android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\t\ufffe\ufffb\f\uffe7\f", android.view.View.getDefaultSize(0, 0) + 6, android.view.View.getDefaultSize(0, 0) + 1, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        util.h.xy.bv.ma maVar = new util.h.xy.bv.ma(util.h.xy.ag.a.m24556().m24558());
        if (str2 != null) {
            int i = getInputSizeshNQ4ISI + 49;
            getOutputStallDuration = i % 128;
            if (i % 2 == 0) {
                maVar.m25705(bArr, str, str2);
                throw null;
            }
            m25706 = maVar.m25705(bArr, str, str2);
            getOutputStallDuration = (getInputSizeshNQ4ISI + 63) % 128;
        } else {
            m25706 = maVar.m25706(bArr, str);
        }
        if (m25706 != null) {
            getInputSizeshNQ4ISI = (getOutputStallDuration + 57) % 128;
            getHighSpeedVideoFpsRangesFor(m25706);
            return;
        }
        Camera2StreamConfigurationMap();
        getHighSpeedVideoSizes(false);
        int i2 = getInputSizeshNQ4ISI + 73;
        getOutputStallDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @util.h.xy.a.a
    private boolean Camera2StreamConfigurationMap(byte[] bArr) {
        boolean z;
        try {
            java.lang.String m25815 = util.h.xy.by.ma.f1067.m25815();
            if (m25815 == null || m25815.length() == 0) {
                return true;
            }
            try {
                byte[] mo24566 = this.b.mo24566();
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709 = new util.h.xy.bv.mc(m25815, this.CoroutineDebuggingKt, mo24566, this.b.mo24565()).m25709();
                if (m25709 != null && m25709.isSuccessful()) {
                    util.h.xy.bv.d dVar = (util.h.xy.bv.d) m25709.getResult();
                    if (dVar == null) {
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ufbc9憑콏㕋鋴\uf898昻쏷⦽靇ﴗ嫖쀮⸬诣\uf1cf彔씄⊠衷", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39498, objArr);
                        getHighSpeedVideoFpsRangesFor(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr[0]).intern(), null));
                        return false;
                    }
                    if (dVar.m25745() == util.h.xy.bv.rb.ra.f1061) {
                        getHighResolutionOutputSizeshNQ4ISI(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, dVar.m25751(), dVar.m25749(), null, dVar.m25742() == null ? com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR.toString() : dVar.m25742(), dVar.m25750()), bArr);
                        util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1056);
                        return false;
                    }
                    try {
                        util.h.xy.m.mb m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
                        byte[] m25684 = dVar.m25684();
                        byte[] m25686 = dVar.m25686();
                        m26975.mo26165(m25684);
                        m26975.mo26152(m25686);
                        util.h.xy.ar.b.m25100(m25684, m25686);
                        dVar.m25685();
                        util.h.xy.by.ma.f1067.m25802();
                        util.h.xy.by.ma.f1067.m25816(util.h.xy.ad.a.m24548(mo24566));
                        util.h.xy.cb.b.m25849(m25815);
                        return true;
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        e = e;
                        z = true;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ufbcc냈淈\u1ad2ퟐ", 19207 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr2[0]).intern(), util.h.xy.al.rc.m25022(e));
                        util.h.xy.cg.ra.m25918(e);
                        return z;
                    }
                }
                getHighSpeedVideoFpsRangesFor(util.h.xy.cg.ra.m25922(m25709));
                return false;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                getHighResolutionOutputSizeshNQ4ISI(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, 0, null, e2.getMessage(), null), bArr);
                return false;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
            e = e3;
            z = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (r13.getSdkErrorCode() != com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR) goto L46;
     */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private util.h.xy.bv.h getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25700;
        try {
            java.lang.String m25815 = util.h.xy.by.ma.f1067.m25815();
            if (m25815 != null && m25815.length() != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufbcc닔榊⁆\udf25闱䲅ﭥ뉀椊⟀\udebb镳䰤\ufae6뇇棚❚\ude35铬䏦逸녟栏⚂\udda6鑹䌩狀낑澌♌\udd4a诮䊡諒끀漜◒\udcc5謲䈖\uf8c8럼滙╒\udc48諶䆨\uf87f띛渍⒇", 18743 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u000e\ufff9\ufffb\ufffe", android.view.KeyEvent.getDeadChar(0, 0) + 4, 5 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, false, objArr2);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr2[0]).intern(), util.h.xy.al.rc.m25022(e));
                util.h.xy.cg.ra.m25918(e);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (!getHighSpeedVideoSizes(true)) {
            int i = getInputSizeshNQ4ISI + 29;
            getOutputStallDuration = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ar.b.m25074(bArr);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbcf\ue6c1쇋곖迯櫤", 7433 - android.view.KeyEvent.normalizeMetaState(0), objArr3);
        util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), bArr);
        byte[] m27415 = util.h.xy.t.mb.f2417.m27415();
        if (util.h.xy.ar.b.m25070(m27415)) {
            m27415 = util.h.xy.u.re.m27550();
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709 = new util.h.xy.bv.mh(bArr, m27415).m25709();
        if (m25709 == null) {
            int i2 = getInputSizeshNQ4ISI + 69;
            getOutputStallDuration = i2 % 128;
            if (i2 % 2 == 0) {
                getHighSpeedVideoFpsRangesFor(util.h.xy.cg.ra.m25922(m25709));
                throw new java.lang.NullPointerException();
            }
            getHighSpeedVideoFpsRangesFor(util.h.xy.cg.ra.m25922(m25709));
        } else if (m25709.isSuccessful()) {
            util.h.xy.bv.rb result = m25709.getResult();
            if (result == null) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufbc9憑콏㕋鋴\uf898昻쏷⦽靇ﴗ嫖쀮⸬诣\uf1cf彔씄⊠衷", android.text.TextUtils.getTrimmedLength("") + 39499, objArr4);
                getHighResolutionOutputSizeshNQ4ISI(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr4[0]).intern(), null), bArr2);
            } else if (result.m25745() == util.h.xy.bv.rb.ra.f1061) {
                int i3 = getInputSizeshNQ4ISI + 95;
                getOutputStallDuration = i3 % 128;
                if (i3 % 2 == 0) {
                    util.h.xy.by.ma.f1067.m25809(false);
                    result.m25749();
                    m25700 = util.h.xy.bv.i.m25700(result);
                    if (m25700.getSdkErrorCode() != com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR) {
                        util.h.xy.by.ma.f1067.m25807();
                        util.h.xy.by.ma.f1067.m25795();
                    }
                    getHighResolutionOutputSizeshNQ4ISI(m25700, bArr2);
                    util.h.xy.v.c.m27646().m27664(util.h.xy.bv.b.ma.EnumC0265b.f1056);
                } else {
                    util.h.xy.by.ma.f1067.m25809(false);
                    result.m25749();
                    m25700 = util.h.xy.bv.i.m25700(result);
                }
            } else {
                if (result instanceof util.h.xy.bv.h) {
                    util.h.xy.t.mb.f2417.m27481(m27415);
                    util.h.xy.by.ma.f1067.m25807();
                    util.h.xy.by.ma.f1067.m25795();
                    util.h.xy.by.ma.f1067.m25809(true);
                    ((util.h.xy.bv.h) result).m25699(bArr2);
                    util.h.xy.bv.h hVar = (util.h.xy.bv.h) result;
                    int i4 = getOutputStallDuration + 89;
                    getInputSizeshNQ4ISI = i4 % 128;
                    if (i4 % 2 == 0) {
                        return hVar;
                    }
                    throw null;
                }
                getHighResolutionOutputSizeshNQ4ISI(util.h.xy.cg.ra.m25922(m25709), bArr2);
            }
        } else {
            getHighResolutionOutputSizeshNQ4ISI(util.h.xy.cg.ra.m25922(m25709), bArr2);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(190:9|10|11|(3:12|13|14)|(5:15|16|17|18|19)|20|21|23|24|25|26|27|(2:29|30)|(5:31|32|33|34|35)|(2:36|37)|(2:39|40)|41|42|43|44|46|47|48|49|51|52|53|54|(2:56|57)|(2:58|59)|(2:61|62)|(2:63|64)|(2:65|66)|(2:68|69)|70|71|72|73|(5:75|76|77|78|79)|80|81|82|83|84|86|87|88|89|(2:91|92)|(2:94|95)|(2:96|97)|(2:98|99)|(2:101|102)|103|(2:104|105)|106|107|109|110|111|112|113|(2:115|116)|117|(2:118|119)|120|121|122|123|124|125|126|128|129|131|132|133|134|(2:136|137)|(2:138|139)|140|(3:141|(1:143)(1:580)|144)|(2:145|146)|(2:148|149)|(2:150|151)|152|153|155|156|157|158|159|160|162|163|(2:165|166)|(2:167|168)|(2:170|171)|(2:172|173)|(2:174|175)|(2:177|178)|179|180|(1:182)|(2:184|185)|186|187|188|189|191|192|193|194|(2:196|197)|(2:199|200)|(2:201|202)|(2:204|205)|(2:206|207)|(2:209|210)|211|212|213|214|216|217|218|219|220|221|222|223|225|226|227|228|(2:230|231)|(2:233|234)|(2:235|236)|(2:237|238)|(2:239|240)|(2:242|243)|244|245|246|247|248|249|(2:251|252)|(2:254|255)|(2:256|257)|(2:258|259)|(2:261|262)|263|264|265|266|268|269|270|271|273|274|(2:276|277)|278|279|280|281|(2:283|284)|285|286|287|289|290|(2:292|293)|(2:294|295)|(2:296|297)|(2:299|300)|301|302|303|304|(2:306|307)|308|309|310|311|313|314|(22:315|316|317|318|319|320|321|322|(2:324|(9:328|329|330|331|332|333|(1:335)|336|(5:338|(2:340|341)(1:345)|342|343|344)(1:346))(2:326|327))(1:459)|347|(1:349)|350|351|(1:353)|354|355|(2:358|356)|359|360|(2:362|363)|364|365)|(6:366|367|(3:369|370|(1:372))|(2:377|(2:380|(3:382|383|(2:387|(2:389|(2:399|(3:401|402|403)(1:(11:407|408|409|410|411|412|(3:414|415|(3:417|418|(3:420|421|422))(1:424))(1:427)|425|426|418|(0)))))))))|374|375)) */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0f7b, code lost:
    
        if (r25[2] == 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x104a, code lost:
    
        if (r1 != null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0f25, code lost:
    
        if (r1 == (-91)) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x04f0, code lost:
    
        r39 = byte[].class;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0742 A[Catch: Exception -> 0x0765, TRY_ENTER, TryCatch #84 {Exception -> 0x0765, blocks: (B:143:0x0742, B:144:0x0762, B:580:0x0752), top: B:141:0x0740 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0894 A[Catch: Exception -> 0x08a2, TRY_LEAVE, TryCatch #48 {Exception -> 0x08a2, blocks: (B:180:0x088e, B:182:0x0894), top: B:179:0x088e }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0f2e A[Catch: InternalComponentException -> 0x1137, UnsupportedEncodingException -> 0x1167, LOOP:0: B:348:0x0f2c->B:349:0x0f2e, LOOP_END, TryCatch #4 {UnsupportedEncodingException -> 0x1167, blocks: (B:343:0x0efa, B:347:0x0f27, B:349:0x0f2e, B:353:0x0f3b, B:358:0x0f51, B:362:0x0f5c, B:367:0x0f66, B:370:0x0f74, B:372:0x0f78, B:380:0x0f93, B:383:0x0f9f, B:387:0x0fa7, B:402:0x0fd3, B:410:0x0ff7, B:421:0x10e1, B:430:0x10ea, B:432:0x10f0, B:433:0x10f1, B:436:0x10f3, B:438:0x10f9, B:439:0x10fa, B:441:0x0f8f, B:449:0x0f02, B:451:0x0f0a, B:452:0x0f0b, B:326:0x0f17, B:455:0x0f0d, B:457:0x0f15, B:458:0x0f16), top: B:322:0x0e14 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0f3b A[Catch: InternalComponentException -> 0x1137, UnsupportedEncodingException -> 0x1167, LOOP:1: B:352:0x0f39->B:353:0x0f3b, LOOP_END, TryCatch #4 {UnsupportedEncodingException -> 0x1167, blocks: (B:343:0x0efa, B:347:0x0f27, B:349:0x0f2e, B:353:0x0f3b, B:358:0x0f51, B:362:0x0f5c, B:367:0x0f66, B:370:0x0f74, B:372:0x0f78, B:380:0x0f93, B:383:0x0f9f, B:387:0x0fa7, B:402:0x0fd3, B:410:0x0ff7, B:421:0x10e1, B:430:0x10ea, B:432:0x10f0, B:433:0x10f1, B:436:0x10f3, B:438:0x10f9, B:439:0x10fa, B:441:0x0f8f, B:449:0x0f02, B:451:0x0f0a, B:452:0x0f0b, B:326:0x0f17, B:455:0x0f0d, B:457:0x0f15, B:458:0x0f16), top: B:322:0x0e14 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f51 A[Catch: InternalComponentException -> 0x1137, UnsupportedEncodingException -> 0x1167, LOOP:2: B:356:0x0f4d->B:358:0x0f51, LOOP_END, TryCatch #4 {UnsupportedEncodingException -> 0x1167, blocks: (B:343:0x0efa, B:347:0x0f27, B:349:0x0f2e, B:353:0x0f3b, B:358:0x0f51, B:362:0x0f5c, B:367:0x0f66, B:370:0x0f74, B:372:0x0f78, B:380:0x0f93, B:383:0x0f9f, B:387:0x0fa7, B:402:0x0fd3, B:410:0x0ff7, B:421:0x10e1, B:430:0x10ea, B:432:0x10f0, B:433:0x10f1, B:436:0x10f3, B:438:0x10f9, B:439:0x10fa, B:441:0x0f8f, B:449:0x0f02, B:451:0x0f0a, B:452:0x0f0b, B:326:0x0f17, B:455:0x0f0d, B:457:0x0f15, B:458:0x0f16), top: B:322:0x0e14 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0f5c A[Catch: InternalComponentException -> 0x1137, UnsupportedEncodingException -> 0x1167, TRY_LEAVE, TryCatch #4 {UnsupportedEncodingException -> 0x1167, blocks: (B:343:0x0efa, B:347:0x0f27, B:349:0x0f2e, B:353:0x0f3b, B:358:0x0f51, B:362:0x0f5c, B:367:0x0f66, B:370:0x0f74, B:372:0x0f78, B:380:0x0f93, B:383:0x0f9f, B:387:0x0fa7, B:402:0x0fd3, B:410:0x0ff7, B:421:0x10e1, B:430:0x10ea, B:432:0x10f0, B:433:0x10f1, B:436:0x10f3, B:438:0x10f9, B:439:0x10fa, B:441:0x0f8f, B:449:0x0f02, B:451:0x0f0a, B:452:0x0f0b, B:326:0x0f17, B:455:0x0f0d, B:457:0x0f15, B:458:0x0f16), top: B:322:0x0e14 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0f6a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0f7f  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x10df  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0752 A[Catch: Exception -> 0x0765, TryCatch #84 {Exception -> 0x0765, blocks: (B:143:0x0742, B:144:0x0762, B:580:0x0752), top: B:141:0x0740 }] */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoSizes(final byte[] bArr, final byte[] bArr2, final byte[] bArr3, final byte[] bArr4) {
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        java.lang.String str;
        java.lang.String str2;
        int i;
        int i2;
        int m24553;
        util.h.xy.ca.ra raVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b;
        java.lang.Object[] objArr;
        int i8;
        java.lang.Object obj;
        java.lang.Object[] objArr2;
        java.lang.reflect.Method method;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((-1980503350) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 89), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (-14) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-358848163) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        java.lang.String str3 = (java.lang.String) objArr3[0];
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.view.MotionEvent.axisFromString("") - 1980503240, (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 17), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 14, android.view.View.combineMeasuredStates(0, 0) - 358848163, objArr4);
        java.lang.String str4 = (java.lang.String) objArr4[0];
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1980503223, (short) (40 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) android.text.TextUtils.getTrimmedLength(""), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 14, (-358848162) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        java.lang.String str5 = (java.lang.String) objArr5[0];
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("䉻㫥덍⯏ꁫᢋ鄊\u0e61蛌罞\uf7aa氂\ue494嶮\uda64勃쬦䎚㠊녪⧀ꙚẺ", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 30869, objArr6);
        java.lang.String str6 = (java.lang.String) objArr6[0];
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("䉻鹉凞훛㋛ཿ欢䟽ꎬﱢ\ud842㐖Ⴤ泚䥜ꔣ臢\uddad㹡ᩏ瘷勝꺙譪\ue726쏭", 56377 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr7);
        java.lang.String str7 = (java.lang.String) objArr7[0];
        try {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉰륰둫덎깂ꔳꀯ齖騆釥販诰蛀ﶰ\uf8b6\uf797", android.text.TextUtils.indexOf("", "") + 64271, objArr8);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉸绵㭻\uf7b1뀯沗⧼\uea57ꛌ挬ᾴ\ud803镫凔ሶ캫謕䑳ë", android.text.TextUtils.getTrimmedLength("") + 15511, objArr9);
            if (((java.lang.Boolean) cls.getMethod((java.lang.String) objArr9[0], null).invoke(null, null)).booleanValue()) {
                getInputSizeshNQ4ISI = (getOutputStallDuration + 63) % 128;
                this.accessartificialFrame.onError(util.h.xy.u.d.m27519(803));
                return;
            }
            byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
            byte[] bArr9 = new byte[131];
            ((java.security.SecureRandom) java.lang.Class.forName(str7).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr9);
            byte[] bArr10 = new byte[128];
            byte[] bArr11 = new byte[3];
            util.h.xy.a.ra raVar2 = new util.h.xy.a.ra();
            raVar2.m24514(util.h.xy.bv.rj.class);
            raVar2.m24514(util.h.xy.bv.ri.class);
            raVar2.m24514(util.h.xy.ca.a.class);
            raVar2.m24514(util.h.xy.bv.md.class);
            raVar2.m24514(util.h.xy.bv.e.class);
            raVar2.m24514(util.h.xy.bv.mc.class);
            raVar2.m24514(util.h.xy.bv.d.class);
            raVar2.m24514(util.h.xy.ca.ra.class);
            raVar2.m24514(util.h.xy.by.ma.class);
            raVar2.m24514(util.h.xy.ce.mb.class);
            raVar2.m24514(util.h.xy.ce.a.class);
            raVar2.m24514(util.h.xy.ce.ra.class);
            raVar2.m24514(util.h.xy.ah.ra.class);
            raVar2.m24514(util.h.xy.bv.rc.class);
            raVar2.m24514(util.h.xy.bv.c.class);
            raVar2.m24514(util.h.xy.ad.a.class);
            raVar2.m24514(util.h.xy.bv.mh.class);
            raVar2.m24514(util.h.xy.bv.h.class);
            try {
                bArr6 = bArr11;
            } catch (java.lang.Exception unused) {
                bArr5 = m25017;
                bArr6 = bArr11;
            }
            try {
                bArr5 = m25017;
                bArr7 = bArr10;
                try {
                    raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f143, new java.lang.Class[0]));
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Exception unused3) {
                bArr5 = m25017;
                bArr7 = bArr10;
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f191, java.lang.String.class));
                java.lang.Class<?> cls2 = java.lang.Class.forName(str3);
                java.lang.String str8 = util.h.xy.al.b.f128;
                java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                bArr8 = bArr9;
                try {
                    getHighResolutionOutputSizeshNQ4ISI("䉻骅\uf38d좯⇫纫埊곁藌\ue2fe㯪ტ椔䙎鼔\uf42f촳⨠̅塽념蹺\ue76b㱻ᒏ涕䪐ꎧ\uf8a9통", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55540, objArr10);
                    clsArr[0] = java.lang.Class.forName((java.lang.String) objArr10[0]);
                    raVar2.m24514(cls2.getMethod(str8, clsArr));
                } catch (java.lang.Exception unused4) {
                }
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
                java.lang.Class<?> cls3 = java.lang.Class.forName(str3);
                java.lang.String str9 = util.h.xy.al.b.f193;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉻骅\uf38d좯⇫纫埊곁藌\ue2fe㯪ტ椔䙎鼔\uf42f촳⨠̅塽념蹺\ue76b㱻ᒏ涕䪐ꎧ\uf8a9통", android.graphics.Color.red(0) + 55541, objArr11);
                raVar2.m24514(cls3.getMethod(str9, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr11[0])));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
                java.lang.Class<?> cls4 = java.lang.Class.forName(str3);
                java.lang.String str10 = util.h.xy.al.b.f108;
                java.lang.Class<?>[] clsArr2 = new java.lang.Class[3];
                clsArr2[0] = java.lang.String.class;
                clsArr2[1] = byte[].class;
                str = str5;
                str2 = str6;
                try {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-1980503328) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) ((-116) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (-14) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 358848178, objArr12);
                    clsArr2[2] = java.lang.Class.forName((java.lang.String) objArr12[0]);
                    raVar2.m24514(cls4.getMethod(str10, clsArr2));
                } catch (java.lang.Exception unused5) {
                }
                java.lang.Class<?> cls5 = java.lang.Class.forName(str3);
                java.lang.String str11 = util.h.xy.al.b.f108;
                java.lang.Class<?>[] clsArr3 = new java.lang.Class[4];
                clsArr3[0] = java.lang.String.class;
                java.lang.Class<?> cls6 = byte[].class;
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 1980503295, (short) ((-56) - android.graphics.Color.green(0)), (byte) android.text.TextUtils.getOffsetBefore("", 0), (-14) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-358848163) - android.text.TextUtils.getOffsetBefore("", 0), objArr13);
                clsArr3[1] = java.lang.Class.forName((java.lang.String) objArr13[0]);
                clsArr3[2] = char[].class;
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503327) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 116), (byte) android.view.KeyEvent.keyCodeFromString(""), (-14) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 358848178, objArr14);
                clsArr3[3] = java.lang.Class.forName((java.lang.String) objArr14[0]);
                raVar2.m24514(cls5.getMethod(str11, clsArr3));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
                raVar2.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
                raVar2.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f147, new java.lang.Class[0]));
                raVar2.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f131, new java.lang.Class[0]));
                raVar2.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f188, new java.lang.Class[0]));
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", 25931 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr15);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr15[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", 25931 - (android.os.Process.myTid() >> 22), objArr16);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr16[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25931, objArr17);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr17[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", 25931 - android.view.View.combineMeasuredStates(0, 0), objArr18);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr18[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503278) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((-37) - android.view.View.MeasureSpec.getSize(0)), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.widget.ExpandableListView.getPackedPositionChild(0L) - 13, (-358848163) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr19);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr19[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503278) - android.graphics.Color.blue(0), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 36), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-14) - android.graphics.Color.red(0), android.view.View.resolveSize(0, 0) - 358848163, objArr20);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr20[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503278) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ((-37) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.graphics.ImageFormat.getBitsPerPixel(0) - 13, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 358848163, objArr21);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr21[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                raVar2.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
                raVar2.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
                raVar2.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f153, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f139, new java.lang.Class[0]));
                i = getOutputStallDuration + 85;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                }
                raVar2.m24514(method);
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f167, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f154, new java.lang.Class[0]));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f168, java.lang.Object.class, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f92, java.util.Map.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f91, java.util.function.BiFunction.class));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f176, new java.lang.Class[0]));
                raVar2.m24514(java.lang.Class.forName(util.h.xy.al.b.f117).getMethod(util.h.xy.al.b.f132, java.lang.String.class, java.lang.Integer.TYPE));
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉰륰둫덎깂ꔳꀯ齖騆釥販诰蛀ﶰ\uf8b6\uf797", android.view.MotionEvent.axisFromString("") + 64272, objArr22);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr22[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                }
                raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f121, javax.net.ssl.KeyManager[].class, javax.net.ssl.TrustManager[].class, java.lang.Class.forName(str7)));
                raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Object.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Integer.TYPE, java.lang.Object.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.util.Collection.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.lang.Integer.TYPE, java.util.Collection.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f148, java.lang.Object.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f167, java.lang.Integer.TYPE));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f149, java.lang.Object.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f162, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, java.lang.Integer.TYPE));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Integer.TYPE));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f178, java.util.Collection.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f177, java.lang.Integer.TYPE, java.lang.Object.class));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, new java.lang.Class[0]));
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, java.lang.Object[].class));
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                java.lang.Class<?> cls7 = java.lang.Class.forName(str4);
                java.lang.String str12 = util.h.xy.al.b.f121;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503295) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 57), (byte) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 14, (-358848164) - android.view.MotionEvent.axisFromString(""), objArr23);
                raVar2.m24514(cls7.getMethod(str12, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr23[0])));
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f192, cls6));
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f192, cls6, java.lang.Integer.TYPE));
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str7)));
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
                raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                java.lang.Class<?> cls8 = java.lang.Class.forName(str2);
                java.lang.String str13 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) - 1980503197, (short) ((-55) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 13, (-358848164) - android.os.Process.getGidForName(""), objArr24);
                raVar2.m24514(cls8.getMethod(str13, java.lang.Class.forName((java.lang.String) objArr24[0])));
                java.lang.Class<?> cls9 = java.lang.Class.forName(str2);
                java.lang.String str14 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 1980503197, (short) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 54), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-14) - android.graphics.Color.blue(0), android.graphics.Color.argb(0, 0, 0, 0) - 358848163, objArr25);
                raVar2.m24514(cls9.getMethod(str14, java.lang.Class.forName((java.lang.String) objArr25[0]), java.lang.Class.forName(str7)));
                raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f196, cls6));
                raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉰屔縣ᣢ㫒풯\uf777鄒댺䷷濜ঽ⡧쩗\ue43f蛭ꂏ䊡嵲罙\u193e㯢헌\uf7be陼뀌刄泽ໜ⢞쭩\ue54b蜅ꇿ䏄嶄籴ṉ㠝\udab8\uf4eb隇녶卄洑\u0ffb⧙", android.graphics.Color.argb(0, 0, 0, 0) + 7723, objArr26);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr26[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉰屔縣ᣢ㫒풯\uf777鄒댺䷷濜ঽ⡧쩗\ue43f蛭ꂏ䊡嵲罙\u193e㯢헌\uf7be陼뀌刄泽ໜ⢞쭩\ue54b蜅ꇿ䏄嶄籴ṉ㠝\udab8\uf4eb隇녶卄洑\u0ffb⧙", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 7723, objArr27);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr27[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
                java.lang.String str15 = util.h.xy.al.b.f105;
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉊ᇶ\ue52d륱ೋ\ue027됽\u0bcf\udf2c덱ۊ\uda3a깼緊턲ꔺ磂찯ꁥ矔쭣齎犖왼騠槡㴪酪擑㠧豽揍㜒譻廓㈕蘦", (android.os.Process.myPid() >> 22) + androidx.media3.muxer.WebmConstants.MkvEbmlElement.SEEK_ID, objArr28);
                raVar2.m24514(util.h.xy.df.a.class.getMethod(str15, java.lang.Class.forName((java.lang.String) objArr28[0]), java.lang.String.class));
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f121, java.lang.Class.forName(str3)));
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f93, new java.lang.Class[0]));
                raVar2.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
                raVar2.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f133, cls6));
                raVar2.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
                raVar2.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
                try {
                    byte[] bArr12 = bArr8;
                    byte[] m27594 = util.h.xy.v.b.f2439.m27594(bArr12, util.h.xy.a.ma.m24504(raVar2));
                    try {
                        m24553 = util.h.xy.af.mb.m24551().m24553(m27594[0]);
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused6) {
                        i2 = 0;
                    }
                    try {
                        try {
                            if (m24553 != -91) {
                            }
                            i3 = 131;
                            byte[] bArr13 = new byte[131];
                            i4 = 0;
                            while (i4 < i3) {
                            }
                            while (i5 < i3) {
                            }
                            while (i6 < 128) {
                            }
                            while (i7 < 3) {
                            }
                            i2 = 0;
                            b = bArr6[0];
                            if (b == 0) {
                            }
                            if (b >= 0) {
                            }
                            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.9
                                private static int getHighSpeedVideoSizesFor = 0;
                                private static char getInputFormats = 11495;
                                private static int getInputSizeshNQ4ISI = 1;
                                private static char getOutputFormats = 51618;
                                private static int getOutputMinFrameDuration = 0;
                                private static int getOutputSizes = 1;
                                private static char getOutputSizeshNQ4ISI = 11213;
                                private static char getOutputStallDuration = 59625;

                                private static void getHighSpeedVideoFpsRanges(java.lang.String str16, int i9, java.lang.Object[] objArr29) {
                                    int i10 = (getOutputMinFrameDuration + 109) % 128;
                                    getInputSizeshNQ4ISI = i10;
                                    getOutputMinFrameDuration = (i10 + 61) % 128;
                                    char[] charArray = str16.toCharArray();
                                    util.h.xz.b.e eVar = new util.h.xz.b.e();
                                    char[] cArr = new char[charArray.length];
                                    eVar.f2630 = 0;
                                    char[] cArr2 = new char[2];
                                    while (eVar.f2630 < charArray.length) {
                                        cArr2[0] = charArray[eVar.f2630];
                                        cArr2[1] = charArray[eVar.f2630 + 1];
                                        int i11 = 58224;
                                        for (int i12 = 0; i12 < 16; i12++) {
                                            char c = cArr2[1];
                                            char c2 = cArr2[0];
                                            char c3 = (char) (c - (((c2 + i11) ^ ((c2 << 4) + ((char) (getOutputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                                            cArr2[1] = c3;
                                            cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputStallDuration ^ 3155153533016530592L))) ^ (c3 + i11)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                                            i11 -= 40503;
                                        }
                                        cArr[eVar.f2630] = cArr2[0];
                                        cArr[eVar.f2630 + 1] = cArr2[1];
                                        eVar.f2630 += 2;
                                    }
                                    objArr29[0] = new java.lang.String(cArr, 0, i9);
                                }

                                /* JADX WARN: Not initialized variable reg: 6, insn: 0x01c5: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:62:0x01c4 */
                                /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
                                /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: all -> 0x00b8, ma -> 0x00bb, rc -> 0x00be, InternalComponentException -> 0x00c1, TRY_LEAVE, TryCatch #7 {InternalComponentException -> 0x00c1, ma -> 0x00bb, rc -> 0x00be, all -> 0x00b8, blocks: (B:13:0x0053, B:14:0x0060, B:18:0x008b, B:22:0x0097, B:23:0x00a2, B:24:0x00a3), top: B:12:0x0053 }] */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    byte[] bArr14;
                                    byte[] bArr15;
                                    byte[] bArr16;
                                    byte[] bArr17;
                                    byte[] bArr18;
                                    byte[] bArr19;
                                    byte[] bArr20;
                                    byte[] bArr21;
                                    boolean m25946;
                                    getOutputSizes = (getHighSpeedVideoSizesFor + 51) % 128;
                                    byte[] bArr22 = null;
                                    try {
                                        try {
                                            byte[] m25089 = util.h.xy.ar.b.m25089(bArr, bArr2);
                                            try {
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                util.h.xy.ar.b.m25074(m25089);
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("搭\udd84睒㎗蛲⦼", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 6, objArr29);
                                                util.h.xy.am.ma.m25030(((java.lang.String) objArr29[0]).intern(), m25089);
                                                util.h.xy.by.ma.f1067.m25810(m25089);
                                                byte[] bArr23 = bArr3;
                                                if (bArr23 != null) {
                                                    int i9 = getOutputSizes + 37;
                                                    getHighSpeedVideoSizesFor = i9 % 128;
                                                    if (i9 % 2 != 0) {
                                                        throw new java.lang.NullPointerException();
                                                    }
                                                    byte[] bArr24 = bArr4;
                                                    if (bArr24 != null) {
                                                        bArr21 = util.h.xy.ar.b.m25089(bArr23, bArr24);
                                                        try {
                                                            util.h.xy.by.ma.f1067.m25812(bArr21);
                                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                            util.h.xy.bs.ra.f1036.m25620();
                                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                            m25946 = util.h.xy.ck.ra.f1116.m25946();
                                                            byte[] m25009 = util.h.xy.al.mb.m25009(false, m25089, bArr2);
                                                            byte[] m25010 = util.h.xy.al.mb.m25010(false, m25089, bArr2);
                                                            if (m25946) {
                                                                int i10 = getOutputSizes + 119;
                                                                getHighSpeedVideoSizesFor = i10 % 128;
                                                                if (i10 % 2 != 0) {
                                                                    util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this, m25009, bArr21, m25010);
                                                                    util.h.xy.ar.b.m25095(m25009);
                                                                    util.h.xy.ar.b.m25095(m25089);
                                                                    throw null;
                                                                }
                                                                util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this, m25009, bArr21, m25010);
                                                                util.h.xy.ar.b.m25095(m25009);
                                                                util.h.xy.ar.b.m25095(m25089);
                                                            } else {
                                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this, m25009, bArr21, m25010);
                                                            }
                                                            util.h.xy.ar.b.m25100(m25089, bArr21);
                                                            getOutputSizes = (getHighSpeedVideoSizesFor + 121) % 128;
                                                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                                            e = e;
                                                            bArr22 = bArr21;
                                                            bArr17 = bArr22;
                                                            bArr22 = m25089;
                                                            try {
                                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                                e.getLocalizedMessage();
                                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRanges("넶킶늜셂", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4, objArr30);
                                                                util.h.xy.am.ma.m25029(((java.lang.String) objArr30[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                                util.h.xy.bs.ra.f1036.m25621();
                                                                util.h.xy.ca.ra raVar3 = util.h.xy.ca.ra.this;
                                                                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRanges("鈸ﻦ뷄䦄奷埾ꟼ瘤\udc3f颼줼瓲\udaedǵᮊ\ue5b0藞ꝑǾ컄㐂欮솘㺦\udaedǵ䨙媲跕襌澩ⵉ檭ⶰ솘㺦棲飥\ue524\ue706椿ꍐ䭍겑\uf8d1䀘\uf277\ue67bⓧѼ\ue2b8靖蟉\udb5b嶿攮㬾龓", 57 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr31);
                                                                sb.append(((java.lang.String) objArr31[0]).intern());
                                                                sb.append(e.getMessage());
                                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(raVar3, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, sb.toString(), null));
                                                                util.h.xy.ar.b.m25100(bArr22, bArr17);
                                                                return;
                                                            } catch (java.lang.Throwable th) {
                                                                th = th;
                                                                byte[] bArr25 = bArr22;
                                                                bArr20 = bArr17;
                                                                bArr18 = bArr25;
                                                                byte[] bArr26 = bArr20;
                                                                bArr22 = bArr18;
                                                                bArr14 = bArr26;
                                                                util.h.xy.ar.b.m25100(bArr22, bArr14);
                                                                throw th;
                                                            }
                                                        } catch (util.h.xy.ci.ma e2) {
                                                            e = e2;
                                                            bArr22 = bArr21;
                                                            bArr16 = bArr22;
                                                            bArr22 = m25089;
                                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                            e.getLocalizedMessage();
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRanges("쓗\udef7촬\ueaf7", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, objArr32);
                                                            util.h.xy.am.ma.m25029(((java.lang.String) objArr32[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                            util.h.xy.bs.ra.f1036.m25621();
                                                            util.h.xy.ca.ra raVar4 = util.h.xy.ca.ra.this;
                                                            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR;
                                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRanges("鈸ﻦꦛқѴ\uf4cc\uf8d1䀘㉡樓奷埾丮묶ㆪ⅜ߩ䩛鬈㝆凍축\udfe9冤", 23 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr33);
                                                            sb2.append(((java.lang.String) objArr33[0]).intern());
                                                            sb2.append(e.getMessage());
                                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(raVar4, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, -102, null, sb2.toString(), null));
                                                            util.h.xy.ar.b.m25100(bArr22, bArr16);
                                                            return;
                                                        } catch (util.h.xy.ck.rc e3) {
                                                            e = e3;
                                                            bArr22 = bArr21;
                                                            bArr15 = bArr22;
                                                            bArr22 = m25089;
                                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                            e.getLocalizedMessage();
                                                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRanges("쬲⒏凍축雌\u08e2", android.text.TextUtils.getOffsetAfter("", 0) + 5, objArr34);
                                                            util.h.xy.am.ma.m25029(((java.lang.String) objArr34[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                            util.h.xy.bs.ra.f1036.m25621();
                                                            util.h.xy.ca.ra raVar5 = util.h.xy.ca.ra.this;
                                                            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR;
                                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                            getHighSpeedVideoFpsRanges("鈸ﻦꦛқѴ\uf4cc\uf8d1䀘㉡樓瞝䊣높䚈霎㠦稫⩻\udaedǵ\uef48扲藞ꝑ뼜\ueafb\uef48扲䧟뀑౧䊋稪祝縬\uddd0\udfe9冤", 38 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr35);
                                                            sb3.append(((java.lang.String) objArr35[0]).intern());
                                                            sb3.append(e.getMessage());
                                                            util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(raVar5, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, -102, null, sb3.toString(), null));
                                                            util.h.xy.ar.b.m25100(bArr22, bArr15);
                                                            return;
                                                        } catch (java.lang.Throwable th2) {
                                                            th = th2;
                                                            bArr22 = bArr21;
                                                            bArr14 = bArr22;
                                                            bArr22 = m25089;
                                                            util.h.xy.ar.b.m25100(bArr22, bArr14);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                bArr21 = null;
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                util.h.xy.bs.ra.f1036.m25620();
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                m25946 = util.h.xy.ck.ra.f1116.m25946();
                                                byte[] m250092 = util.h.xy.al.mb.m25009(false, m25089, bArr2);
                                                byte[] m250102 = util.h.xy.al.mb.m25010(false, m25089, bArr2);
                                                if (m25946) {
                                                }
                                                util.h.xy.ar.b.m25100(m25089, bArr21);
                                                getOutputSizes = (getHighSpeedVideoSizesFor + 121) % 128;
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e4) {
                                                e = e4;
                                            } catch (util.h.xy.ci.ma e5) {
                                                e = e5;
                                            } catch (util.h.xy.ck.rc e6) {
                                                e = e6;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            bArr18 = null;
                                            bArr20 = bArr19;
                                            byte[] bArr262 = bArr20;
                                            bArr22 = bArr18;
                                            bArr14 = bArr262;
                                            util.h.xy.ar.b.m25100(bArr22, bArr14);
                                            throw th;
                                        }
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e7) {
                                        e = e7;
                                        bArr17 = null;
                                    } catch (util.h.xy.ci.ma e8) {
                                        e = e8;
                                        bArr16 = null;
                                    } catch (util.h.xy.ck.rc e9) {
                                        e = e9;
                                        bArr15 = null;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        bArr14 = null;
                                    }
                                }
                            });
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\ufbcbꈴ䠝\uf66d鱻㩅\ue076躞㒎튳碥⛀쳸櫷ᅜ뼽攲ͅꥅ坼ﵪ", 23022 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr29);
                            thread.setName(((java.lang.String) objArr29[0]).intern());
                            thread.start();
                        } catch (java.io.UnsupportedEncodingException unused7) {
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("ﯟ\u1cfb㗇亢枆硡酟ꨡ쌆\udbf8ﳘᗿ⺻䝷塛焴訞ꋬ믊\udca0", 59167 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr30);
                            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr30[0]).intern());
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused8) {
                        i2 = 0;
                        int red = android.graphics.Color.red(i2);
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2);
                        int alpha = android.graphics.Color.alpha(i2);
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("\u0006\tﾽ\u0011\u0012\r\u000b￦\u000f\f\u000f\u000f\u0002ﾽ\u0011\u0010", red + 16, lastIndexOf + 9, alpha + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, true, objArr31);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr31[0]).intern());
                    }
                } catch (java.io.UnsupportedEncodingException unused9) {
                }
            }
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f118, java.lang.String.class));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f99, java.lang.String.class, java.lang.Class.class));
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f191, java.lang.String.class));
            } catch (java.lang.Exception unused10) {
            }
            try {
                java.lang.Class<?> cls22 = java.lang.Class.forName(str3);
                java.lang.String str82 = util.h.xy.al.b.f128;
                java.lang.Class<?>[] clsArr4 = new java.lang.Class[1];
                java.lang.Object[] objArr102 = new java.lang.Object[1];
                bArr8 = bArr9;
                getHighResolutionOutputSizeshNQ4ISI("䉻骅\uf38d좯⇫纫埊곁藌\ue2fe㯪ტ椔䙎鼔\uf42f촳⨠̅塽념蹺\ue76b㱻ᒏ涕䪐ꎧ\uf8a9통", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55540, objArr102);
                clsArr4[0] = java.lang.Class.forName((java.lang.String) objArr102[0]);
                raVar2.m24514(cls22.getMethod(str82, clsArr4));
            } catch (java.lang.Exception unused11) {
                bArr8 = bArr9;
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f198, java.lang.String.class));
            } catch (java.lang.Exception unused12) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f126, java.lang.String.class));
            } catch (java.lang.Exception unused13) {
            }
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f180, java.lang.String.class, java.security.KeyStore.ProtectionParameter.class));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f174, java.lang.String.class, char[].class));
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f130, new java.lang.Class[0]));
            } catch (java.lang.Exception unused14) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f195, new java.lang.Class[0]));
            } catch (java.lang.Exception unused15) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f95, java.lang.String.class));
            } catch (java.lang.Exception unused16) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f185, java.lang.String.class));
            } catch (java.lang.Exception unused17) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
            } catch (java.lang.Exception unused18) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
            } catch (java.lang.Exception unused19) {
            }
            java.lang.Class<?> cls32 = java.lang.Class.forName(str3);
            java.lang.String str92 = util.h.xy.al.b.f193;
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉻骅\uf38d좯⇫纫埊곁藌\ue2fe㯪ტ椔䙎鼔\uf42f촳⨠̅塽념蹺\ue76b㱻ᒏ涕䪐ꎧ\uf8a9통", android.graphics.Color.red(0) + 55541, objArr112);
            raVar2.m24514(cls32.getMethod(str92, java.lang.String.class, java.lang.Class.forName((java.lang.String) objArr112[0])));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f119, java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class));
            try {
                java.lang.Class<?> cls42 = java.lang.Class.forName(str3);
                java.lang.String str102 = util.h.xy.al.b.f108;
                java.lang.Class<?>[] clsArr22 = new java.lang.Class[3];
                clsArr22[0] = java.lang.String.class;
                clsArr22[1] = byte[].class;
                str = str5;
                str2 = str6;
                java.lang.Object[] objArr122 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503328) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) ((-116) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (-14) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 358848178, objArr122);
                clsArr22[2] = java.lang.Class.forName((java.lang.String) objArr122[0]);
                raVar2.m24514(cls42.getMethod(str102, clsArr22));
            } catch (java.lang.Exception unused20) {
                str = str5;
                str2 = str6;
            }
            java.lang.Class<?> cls52 = java.lang.Class.forName(str3);
            java.lang.String str112 = util.h.xy.al.b.f108;
            java.lang.Class<?>[] clsArr32 = new java.lang.Class[4];
            clsArr32[0] = java.lang.String.class;
            java.lang.Class<?> cls62 = byte[].class;
            java.lang.Object[] objArr132 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 1980503295, (short) ((-56) - android.graphics.Color.green(0)), (byte) android.text.TextUtils.getOffsetBefore("", 0), (-14) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-358848163) - android.text.TextUtils.getOffsetBefore("", 0), objArr132);
            clsArr32[1] = java.lang.Class.forName((java.lang.String) objArr132[0]);
            clsArr32[2] = char[].class;
            java.lang.Object[] objArr142 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((-1980503327) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 116), (byte) android.view.KeyEvent.keyCodeFromString(""), (-14) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 358848178, objArr142);
            clsArr32[3] = java.lang.Class.forName((java.lang.String) objArr142[0]);
            raVar2.m24514(cls52.getMethod(str112, clsArr32));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f107, java.security.KeyStore.LoadStoreParameter.class));
            try {
                raVar2.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f107, java.io.OutputStream.class, char[].class));
            } catch (java.lang.Exception unused21) {
            }
            try {
                raVar2.m24514(java.security.KeyStore.CallbackHandlerProtection.class.getMethod(util.h.xy.al.b.f145, new java.lang.Class[0]));
            } catch (java.lang.Exception unused22) {
            }
            try {
                raVar2.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f147, new java.lang.Class[0]));
            } catch (java.lang.Exception unused23) {
            }
            try {
                raVar2.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f131, new java.lang.Class[0]));
            } catch (java.lang.Exception unused24) {
            }
            try {
                raVar2.m24514(java.security.KeyStore.PasswordProtection.class.getMethod(util.h.xy.al.b.f188, new java.lang.Class[0]));
            } catch (java.lang.Exception unused25) {
            }
            try {
                java.lang.Object[] objArr152 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", 25931 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr152);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr152[0]).getMethod(util.h.xy.al.b.f191, new java.lang.Class[0]));
            } catch (java.lang.Exception unused26) {
            }
            java.lang.Object[] objArr162 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", 25931 - (android.os.Process.myTid() >> 22), objArr162);
            raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr162[0]).getMethod(util.h.xy.al.b.f198, new java.lang.Class[0]));
            java.lang.Object[] objArr172 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25931, objArr172);
            raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr172[0]).getMethod(util.h.xy.al.b.f181, new java.lang.Class[0]));
            java.lang.Object[] objArr182 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉻✻裱涑휓렕ᶶ蝿格췀뚖ᡜ\ufdec曰졀광ᛘ﮹崣웯ꮿ\u0d53\uf647导㵫ꘫ௹\uec99噑㬋鲐١\ueb08䳿ㆉ鬤糯\ue1bf", 25931 - android.view.View.combineMeasuredStates(0, 0), objArr182);
            raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr182[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            try {
                java.lang.Object[] objArr192 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503278) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) ((-37) - android.view.View.MeasureSpec.getSize(0)), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.widget.ExpandableListView.getPackedPositionChild(0L) - 13, (-358848163) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr192);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr192[0]).getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            } catch (java.lang.Exception unused27) {
            }
            try {
                java.lang.Object[] objArr202 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((-1980503278) - android.graphics.Color.blue(0), (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 36), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-14) - android.graphics.Color.red(0), android.view.View.resolveSize(0, 0) - 358848163, objArr202);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr202[0]).getMethod(util.h.xy.al.b.f158, new java.lang.Class[0]));
            } catch (java.lang.Exception unused28) {
            }
            java.lang.Object[] objArr212 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((-1980503278) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ((-37) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.graphics.ImageFormat.getBitsPerPixel(0) - 13, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 358848163, objArr212);
            raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr212[0]).getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            raVar2.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            raVar2.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
            raVar2.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f153, java.lang.Object.class));
            } catch (java.lang.Exception unused29) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f139, new java.lang.Class[0]));
            } catch (java.lang.Exception unused30) {
            }
            i = getOutputStallDuration + 85;
            getInputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    java.lang.String str16 = util.h.xy.al.b.f166;
                    java.lang.Class[] clsArr5 = new java.lang.Class[1];
                    clsArr5[1] = java.util.function.BiConsumer.class;
                    method = java.util.HashMap.class.getMethod(str16, clsArr5);
                } else {
                    method = java.util.HashMap.class.getMethod(util.h.xy.al.b.f166, java.util.function.BiConsumer.class);
                }
                raVar2.m24514(method);
            } catch (java.lang.Exception unused31) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f167, java.lang.Object.class));
            } catch (java.lang.Exception unused32) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
            } catch (java.lang.Exception unused33) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f154, new java.lang.Class[0]));
            } catch (java.lang.Exception unused34) {
            }
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f168, java.lang.Object.class, java.lang.Object.class));
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f92, java.util.Map.class));
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class, java.lang.Object.class));
            raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class));
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f199, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class));
            } catch (java.lang.Exception unused35) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f91, java.util.function.BiFunction.class));
            } catch (java.lang.Exception unused36) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused37) {
            }
            try {
                raVar2.m24514(java.util.HashMap.class.getMethod(util.h.xy.al.b.f176, new java.lang.Class[0]));
            } catch (java.lang.Exception unused38) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(util.h.xy.al.b.f117).getMethod(util.h.xy.al.b.f132, java.lang.String.class, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused39) {
            }
            try {
                java.lang.Object[] objArr222 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉰륰둫덎깂ꔳꀯ齖騆釥販诰蛀ﶰ\uf8b6\uf797", android.view.MotionEvent.axisFromString("") + 64272, objArr222);
                raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr222[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
            } catch (java.lang.Exception unused40) {
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                raVar2.m24514(android.content.pm.SigningInfo.class.getMethod(util.h.xy.al.b.f127, new java.lang.Class[0]));
            }
            try {
                raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f121, javax.net.ssl.KeyManager[].class, javax.net.ssl.TrustManager[].class, java.lang.Class.forName(str7)));
            } catch (java.lang.Exception unused41) {
            }
            raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            raVar2.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Object.class));
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f134, java.lang.Integer.TYPE, java.lang.Object.class));
            } catch (java.lang.Exception unused42) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.util.Collection.class));
            } catch (java.lang.Exception unused43) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f135, java.lang.Integer.TYPE, java.util.Collection.class));
            } catch (java.lang.Exception unused44) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f137, new java.lang.Class[0]));
            } catch (java.lang.Exception unused45) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f151, new java.lang.Class[0]));
            } catch (java.lang.Exception unused46) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f148, java.lang.Object.class));
            } catch (java.lang.Exception unused47) {
            }
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f167, java.lang.Integer.TYPE));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f149, java.lang.Object.class));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f163, new java.lang.Class[0]));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f162, new java.lang.Class[0]));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, new java.lang.Class[0]));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f173, java.lang.Integer.TYPE));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Integer.TYPE));
            raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f170, java.lang.Object.class));
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f178, java.util.Collection.class));
            } catch (java.lang.Exception unused48) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f177, java.lang.Integer.TYPE, java.lang.Object.class));
            } catch (java.lang.Exception unused49) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f96, new java.lang.Class[0]));
            } catch (java.lang.Exception unused50) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, new java.lang.Class[0]));
            } catch (java.lang.Exception unused51) {
            }
            try {
                raVar2.m24514(java.util.ArrayList.class.getMethod(util.h.xy.al.b.f171, java.lang.Object[].class));
            } catch (java.lang.Exception unused52) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused53) {
            }
            raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            java.lang.Class<?> cls72 = java.lang.Class.forName(str4);
            java.lang.String str122 = util.h.xy.al.b.f121;
            java.lang.Object[] objArr232 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((-1980503295) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 57), (byte) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 14, (-358848164) - android.view.MotionEvent.axisFromString(""), objArr232);
            raVar2.m24514(cls72.getMethod(str122, java.lang.Integer.TYPE, java.lang.Class.forName((java.lang.String) objArr232[0])));
            try {
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f192, cls62));
            } catch (java.lang.Exception unused54) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str4).getMethod(util.h.xy.al.b.f192, cls62, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused55) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused56) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused57) {
            }
            try {
                raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused58) {
            }
            raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f121, java.lang.Integer.TYPE, java.lang.Class.forName(str7)));
            raVar2.m24514(java.lang.Class.forName(str).getMethod(util.h.xy.al.b.f182, new java.lang.Class[0]));
            raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            try {
                java.lang.Class<?> cls82 = java.lang.Class.forName(str2);
                java.lang.String str132 = util.h.xy.al.b.f190;
                java.lang.Object[] objArr242 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) - 1980503197, (short) ((-55) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 13, (-358848164) - android.os.Process.getGidForName(""), objArr242);
                raVar2.m24514(cls82.getMethod(str132, java.lang.Class.forName((java.lang.String) objArr242[0])));
            } catch (java.lang.Exception unused59) {
            }
            java.lang.Class<?> cls92 = java.lang.Class.forName(str2);
            java.lang.String str142 = util.h.xy.al.b.f190;
            java.lang.Object[] objArr252 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 1980503197, (short) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 54), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-14) - android.graphics.Color.blue(0), android.graphics.Color.argb(0, 0, 0, 0) - 358848163, objArr252);
            raVar2.m24514(cls92.getMethod(str142, java.lang.Class.forName((java.lang.String) objArr252[0]), java.lang.Class.forName(str7)));
            raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f196, cls62));
            try {
                raVar2.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f194, new java.lang.Class[0]));
            } catch (java.lang.Exception unused60) {
            }
            java.lang.Object[] objArr262 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉰屔縣ᣢ㫒풯\uf777鄒댺䷷濜ঽ⡧쩗\ue43f蛭ꂏ䊡嵲罙\u193e㯢헌\uf7be陼뀌刄泽ໜ⢞쭩\ue54b蜅ꇿ䏄嶄籴ṉ㠝\udab8\uf4eb隇녶卄洑\u0ffb⧙", android.graphics.Color.argb(0, 0, 0, 0) + 7723, objArr262);
            raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr262[0]).getMethod(util.h.xy.al.b.f97, java.lang.Boolean.TYPE));
            java.lang.Object[] objArr272 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("䉰屔縣ᣢ㫒풯\uf777鄒댺䷷濜ঽ⡧쩗\ue43f蛭ꂏ䊡嵲罙\u193e㯢헌\uf7be陼뀌刄泽ໜ⢞쭩\ue54b蜅ꇿ䏄嶄籴ṉ㠝\udab8\uf4eb隇녶卄洑\u0ffb⧙", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 7723, objArr272);
            raVar2.m24514(java.lang.Class.forName((java.lang.String) objArr272[0]).getMethod(util.h.xy.al.b.f98, java.lang.Integer.TYPE));
            try {
                java.lang.String str152 = util.h.xy.al.b.f105;
                java.lang.Object[] objArr282 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("䉊ᇶ\ue52d륱ೋ\ue027됽\u0bcf\udf2c덱ۊ\uda3a깼緊턲ꔺ磂찯ꁥ矔쭣齎犖왼騠槡㴪酪擑㠧豽揍㜒譻廓㈕蘦", (android.os.Process.myPid() >> 22) + androidx.media3.muxer.WebmConstants.MkvEbmlElement.SEEK_ID, objArr282);
                raVar2.m24514(util.h.xy.df.a.class.getMethod(str152, java.lang.Class.forName((java.lang.String) objArr282[0]), java.lang.String.class));
            } catch (java.lang.Exception unused61) {
            }
            try {
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused62) {
            }
            try {
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused63) {
            }
            try {
                raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused64) {
            }
            raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f121, java.lang.Class.forName(str3)));
            raVar2.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f93, new java.lang.Class[0]));
            try {
                raVar2.m24514(android.provider.Settings.Secure.class.getMethod(util.h.xy.al.b.f106, android.content.ContentResolver.class, java.lang.String.class));
            } catch (java.lang.Exception unused65) {
            }
            raVar2.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f133, cls62));
            raVar2.m24514(java.lang.Class.forName(str7).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
            raVar2.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
            try {
                byte[] bArr122 = bArr8;
                byte[] m275942 = util.h.xy.v.b.f2439.m27594(bArr122, util.h.xy.a.ma.m24504(raVar2));
                m24553 = util.h.xy.af.mb.m24551().m24553(m275942[0]);
                if (m24553 != -91) {
                    raVar = this;
                } else {
                    if (m24553 != 111) {
                        getHighSpeedVideoFpsRangesFor(util.h.xy.u.d.m27519(m24553));
                        return;
                    }
                    try {
                        int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str7).getDeclaredConstructor(null).newInstance(null)).nextInt();
                        try {
                            java.lang.Object[] objArr32 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt)};
                            java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                            if (obj2 == null) {
                                java.lang.Class cls10 = (java.lang.Class) util.h.xy.dd.b.m26271(123 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47455), 21 - android.text.TextUtils.indexOf("", "", 0, 0));
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(objArr33);
                                java.lang.String str17 = (java.lang.String) objArr33[0];
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(android.text.TextUtils.indexOf("", "") - 1980503173, (short) (android.view.Gravity.getAbsoluteGravity(0, 0) - 108), (byte) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.getTrimmedLength("") - 14, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 358848172, objArr34);
                                obj2 = cls10.getMethod(str17, java.lang.Class.forName((java.lang.String) objArr34[0]), java.lang.Integer.TYPE);
                                util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr32)).intValue() != nextInt) {
                                int i9 = getInputSizeshNQ4ISI + 15;
                                getOutputStallDuration = i9 % 128;
                                getHighSpeedVideoFpsRangesFor(i9 % 2 == 0 ? util.h.xy.u.d.m27519(14580) : util.h.xy.u.d.m27519(com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED));
                                return;
                            }
                            raVar = this;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 131;
                byte[] bArr132 = new byte[131];
                i4 = 0;
                while (i4 < i3) {
                    int i10 = i4 + 1;
                    bArr132[i4] = m275942[i10];
                    i4 = i10;
                    i3 = 131;
                }
                for (i5 = 0; i5 < i3; i5++) {
                    byte b2 = (byte) (bArr132[i5] ^ bArr5[i5]);
                    bArr132[i5] = b2;
                    bArr132[i5] = (byte) (b2 ^ bArr122[i5]);
                }
                for (i6 = 0; i6 < 128; i6++) {
                    bArr7[i6] = bArr132[i6];
                }
                for (i7 = 0; i7 < 3; i7++) {
                    bArr6[i7] = bArr132[i7 + 128];
                }
                i2 = 0;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused66) {
            }
            try {
                b = bArr6[0];
                if (b == 0) {
                    getOutputStallDuration = (getInputSizeshNQ4ISI + 77) % 128;
                    if (bArr6[1] == 0) {
                    }
                }
                if (b >= 0) {
                    int i11 = getOutputStallDuration;
                    int i12 = i11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getInputSizeshNQ4ISI = i12 % 128;
                    if (i12 % 2 == 0 ? bArr6[1] >= 0 : b >= 0) {
                        byte b3 = bArr6[2];
                        if (b3 >= 0) {
                            int i13 = (i11 + 29) % 128;
                            getInputSizeshNQ4ISI = i13;
                            byte b4 = bArr6[1];
                            if (b != b4 && b4 != b3 && b != b3) {
                                byte b5 = bArr7[b];
                                byte b6 = bArr7[b4];
                                byte b7 = bArr7[b3];
                                if (b5 < b6) {
                                    int i14 = (i13 + 37) % 128;
                                    getOutputStallDuration = i14;
                                    if (b5 >= 0 && b5 <= 100 && b6 >= 0 && b6 <= 100 && b7 >= 0 && b7 <= 100) {
                                        int i15 = (i14 + 59) % 128;
                                        getInputSizeshNQ4ISI = i15;
                                        if (b7 < b5) {
                                            raVar.getHighSpeedVideoFpsRangesFor(util.h.xy.u.d.m27519(801));
                                            return;
                                        }
                                        if (b7 < b6 && b7 >= b5 && b7 < b6) {
                                            getOutputStallDuration = (i15 + 55) % 128;
                                            try {
                                                int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str7).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                                android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                                                int i16 = getOutputStallDuration + 107;
                                                getInputSizeshNQ4ISI = i16 % 128;
                                                try {
                                                    if (i16 % 2 != 0) {
                                                        objArr2 = new java.lang.Object[5];
                                                        objArr2[0] = java.lang.Integer.valueOf(nextInt2);
                                                        objArr2[1] = m24558;
                                                        obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                                        if (obj == null) {
                                                            objArr = objArr2;
                                                            i8 = 0;
                                                        } else if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue() != nextInt2) {
                                                            raVar.getHighSpeedVideoFpsRangesFor(util.h.xy.u.d.m27519(com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED));
                                                            return;
                                                        }
                                                    } else {
                                                        objArr = new java.lang.Object[]{m24558, java.lang.Integer.valueOf(nextInt2)};
                                                        i8 = 0;
                                                        obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                                    }
                                                    java.lang.Class cls11 = (java.lang.Class) util.h.xy.dd.b.m26271(123 - android.view.View.resolveSizeAndState(i8, i8, i8), (char) (47455 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i8) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i8) == 0.0d ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(i8, i8) + 21);
                                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                    Camera2StreamConfigurationMap(objArr35);
                                                    java.lang.String str18 = (java.lang.String) objArr35[0];
                                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 1980503173, (short) ((-108) - android.graphics.Color.red(0)), (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 15, (android.view.ViewConfiguration.getTouchSlop() >> 8) - 358848172, objArr36);
                                                    obj = cls11.getMethod(str18, java.lang.Class.forName((java.lang.String) objArr36[0]), java.lang.Integer.TYPE);
                                                    util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                                    objArr2 = objArr;
                                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue() != nextInt2) {
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 == null) {
                                                        throw th3;
                                                    }
                                                    throw cause3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 == null) {
                                                    throw th4;
                                                }
                                                throw cause4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                java.lang.Thread thread2 = new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.9
                    private static int getHighSpeedVideoSizesFor = 0;
                    private static char getInputFormats = 11495;
                    private static int getInputSizeshNQ4ISI = 1;
                    private static char getOutputFormats = 51618;
                    private static int getOutputMinFrameDuration = 0;
                    private static int getOutputSizes = 1;
                    private static char getOutputSizeshNQ4ISI = 11213;
                    private static char getOutputStallDuration = 59625;

                    private static void getHighSpeedVideoFpsRanges(java.lang.String str162, int i92, java.lang.Object[] objArr292) {
                        int i102 = (getOutputMinFrameDuration + 109) % 128;
                        getInputSizeshNQ4ISI = i102;
                        getOutputMinFrameDuration = (i102 + 61) % 128;
                        char[] charArray = str162.toCharArray();
                        util.h.xz.b.e eVar = new util.h.xz.b.e();
                        char[] cArr = new char[charArray.length];
                        eVar.f2630 = 0;
                        char[] cArr2 = new char[2];
                        while (eVar.f2630 < charArray.length) {
                            cArr2[0] = charArray[eVar.f2630];
                            cArr2[1] = charArray[eVar.f2630 + 1];
                            int i112 = 58224;
                            for (int i122 = 0; i122 < 16; i122++) {
                                char c = cArr2[1];
                                char c2 = cArr2[0];
                                char c3 = (char) (c - (((c2 + i112) ^ ((c2 << 4) + ((char) (getOutputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                                cArr2[1] = c3;
                                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputStallDuration ^ 3155153533016530592L))) ^ (c3 + i112)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                                i112 -= 40503;
                            }
                            cArr[eVar.f2630] = cArr2[0];
                            cArr[eVar.f2630 + 1] = cArr2[1];
                            eVar.f2630 += 2;
                        }
                        objArr292[0] = new java.lang.String(cArr, 0, i92);
                    }

                    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01c5: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:62:0x01c4 */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: all -> 0x00b8, ma -> 0x00bb, rc -> 0x00be, InternalComponentException -> 0x00c1, TRY_LEAVE, TryCatch #7 {InternalComponentException -> 0x00c1, ma -> 0x00bb, rc -> 0x00be, all -> 0x00b8, blocks: (B:13:0x0053, B:14:0x0060, B:18:0x008b, B:22:0x0097, B:23:0x00a2, B:24:0x00a3), top: B:12:0x0053 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        byte[] bArr14;
                        byte[] bArr15;
                        byte[] bArr16;
                        byte[] bArr17;
                        byte[] bArr18;
                        byte[] bArr19;
                        byte[] bArr20;
                        byte[] bArr21;
                        boolean m25946;
                        getOutputSizes = (getHighSpeedVideoSizesFor + 51) % 128;
                        byte[] bArr22 = null;
                        try {
                            try {
                                byte[] m25089 = util.h.xy.ar.b.m25089(bArr, bArr2);
                                try {
                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                    util.h.xy.ar.b.m25074(m25089);
                                    java.lang.Object[] objArr292 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges("搭\udd84睒㎗蛲⦼", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 6, objArr292);
                                    util.h.xy.am.ma.m25030(((java.lang.String) objArr292[0]).intern(), m25089);
                                    util.h.xy.by.ma.f1067.m25810(m25089);
                                    byte[] bArr23 = bArr3;
                                    if (bArr23 != null) {
                                        int i92 = getOutputSizes + 37;
                                        getHighSpeedVideoSizesFor = i92 % 128;
                                        if (i92 % 2 != 0) {
                                            throw new java.lang.NullPointerException();
                                        }
                                        byte[] bArr24 = bArr4;
                                        if (bArr24 != null) {
                                            bArr21 = util.h.xy.ar.b.m25089(bArr23, bArr24);
                                            try {
                                                util.h.xy.by.ma.f1067.m25812(bArr21);
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                util.h.xy.bs.ra.f1036.m25620();
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                m25946 = util.h.xy.ck.ra.f1116.m25946();
                                                byte[] m250092 = util.h.xy.al.mb.m25009(false, m25089, bArr2);
                                                byte[] m250102 = util.h.xy.al.mb.m25010(false, m25089, bArr2);
                                                if (m25946) {
                                                    int i102 = getOutputSizes + 119;
                                                    getHighSpeedVideoSizesFor = i102 % 128;
                                                    if (i102 % 2 != 0) {
                                                        util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this, m250092, bArr21, m250102);
                                                        util.h.xy.ar.b.m25095(m250092);
                                                        util.h.xy.ar.b.m25095(m25089);
                                                        throw null;
                                                    }
                                                    util.h.xy.ca.ra.getHighSpeedVideoSizes(util.h.xy.ca.ra.this, m250092, bArr21, m250102);
                                                    util.h.xy.ar.b.m25095(m250092);
                                                    util.h.xy.ar.b.m25095(m25089);
                                                } else {
                                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ca.ra.this, m250092, bArr21, m250102);
                                                }
                                                util.h.xy.ar.b.m25100(m25089, bArr21);
                                                getOutputSizes = (getHighSpeedVideoSizesFor + 121) % 128;
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                                e = e;
                                                bArr22 = bArr21;
                                                bArr17 = bArr22;
                                                bArr22 = m25089;
                                                try {
                                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                    e.getLocalizedMessage();
                                                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRanges("넶킶늜셂", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4, objArr302);
                                                    util.h.xy.am.ma.m25029(((java.lang.String) objArr302[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                    util.h.xy.bs.ra.f1036.m25621();
                                                    util.h.xy.ca.ra raVar3 = util.h.xy.ca.ra.this;
                                                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRanges("鈸ﻦ뷄䦄奷埾ꟼ瘤\udc3f颼줼瓲\udaedǵᮊ\ue5b0藞ꝑǾ컄㐂欮솘㺦\udaedǵ䨙媲跕襌澩ⵉ檭ⶰ솘㺦棲飥\ue524\ue706椿ꍐ䭍겑\uf8d1䀘\uf277\ue67bⓧѼ\ue2b8靖蟉\udb5b嶿攮㬾龓", 57 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr312);
                                                    sb.append(((java.lang.String) objArr312[0]).intern());
                                                    sb.append(e.getMessage());
                                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(raVar3, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, sb.toString(), null));
                                                    util.h.xy.ar.b.m25100(bArr22, bArr17);
                                                    return;
                                                } catch (java.lang.Throwable th5) {
                                                    th = th5;
                                                    byte[] bArr25 = bArr22;
                                                    bArr20 = bArr17;
                                                    bArr18 = bArr25;
                                                    byte[] bArr262 = bArr20;
                                                    bArr22 = bArr18;
                                                    bArr14 = bArr262;
                                                    util.h.xy.ar.b.m25100(bArr22, bArr14);
                                                    throw th;
                                                }
                                            } catch (util.h.xy.ci.ma e2) {
                                                e = e2;
                                                bArr22 = bArr21;
                                                bArr16 = bArr22;
                                                bArr22 = m25089;
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                e.getLocalizedMessage();
                                                java.lang.Object[] objArr322 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("쓗\udef7촬\ueaf7", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, objArr322);
                                                util.h.xy.am.ma.m25029(((java.lang.String) objArr322[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                util.h.xy.bs.ra.f1036.m25621();
                                                util.h.xy.ca.ra raVar4 = util.h.xy.ca.ra.this;
                                                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR;
                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                java.lang.Object[] objArr332 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("鈸ﻦꦛқѴ\uf4cc\uf8d1䀘㉡樓奷埾丮묶ㆪ⅜ߩ䩛鬈㝆凍축\udfe9冤", 23 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr332);
                                                sb2.append(((java.lang.String) objArr332[0]).intern());
                                                sb2.append(e.getMessage());
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(raVar4, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 0, -102, null, sb2.toString(), null));
                                                util.h.xy.ar.b.m25100(bArr22, bArr16);
                                                return;
                                            } catch (util.h.xy.ck.rc e3) {
                                                e = e3;
                                                bArr22 = bArr21;
                                                bArr15 = bArr22;
                                                bArr22 = m25089;
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                                e.getLocalizedMessage();
                                                java.lang.Object[] objArr342 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("쬲⒏凍축雌\u08e2", android.text.TextUtils.getOffsetAfter("", 0) + 5, objArr342);
                                                util.h.xy.am.ma.m25029(((java.lang.String) objArr342[0]).intern(), util.h.xy.al.rc.m25022(e));
                                                util.h.xy.bs.ra.f1036.m25621();
                                                util.h.xy.ca.ra raVar5 = util.h.xy.ca.ra.this;
                                                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ASM_ERROR;
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                java.lang.Object[] objArr352 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges("鈸ﻦꦛқѴ\uf4cc\uf8d1䀘㉡樓瞝䊣높䚈霎㠦稫⩻\udaedǵ\uef48扲藞ꝑ뼜\ueafb\uef48扲䧟뀑౧䊋稪祝縬\uddd0\udfe9冤", 38 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr352);
                                                sb3.append(((java.lang.String) objArr352[0]).intern());
                                                sb3.append(e.getMessage());
                                                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI(raVar5, new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, -102, null, sb3.toString(), null));
                                                util.h.xy.ar.b.m25100(bArr22, bArr15);
                                                return;
                                            } catch (java.lang.Throwable th22) {
                                                th = th22;
                                                bArr22 = bArr21;
                                                bArr14 = bArr22;
                                                bArr22 = m25089;
                                                util.h.xy.ar.b.m25100(bArr22, bArr14);
                                                throw th;
                                            }
                                        }
                                    }
                                    bArr21 = null;
                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                    util.h.xy.bs.ra.f1036.m25620();
                                    util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                                    m25946 = util.h.xy.ck.ra.f1116.m25946();
                                    byte[] m2500922 = util.h.xy.al.mb.m25009(false, m25089, bArr2);
                                    byte[] m2501022 = util.h.xy.al.mb.m25010(false, m25089, bArr2);
                                    if (m25946) {
                                    }
                                    util.h.xy.ar.b.m25100(m25089, bArr21);
                                    getOutputSizes = (getHighSpeedVideoSizesFor + 121) % 128;
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e4) {
                                    e = e4;
                                } catch (util.h.xy.ci.ma e5) {
                                    e = e5;
                                } catch (util.h.xy.ck.rc e6) {
                                    e = e6;
                                } catch (java.lang.Throwable th32) {
                                    th = th32;
                                }
                            } catch (java.lang.Throwable th42) {
                                th = th42;
                                bArr18 = null;
                                bArr20 = bArr19;
                                byte[] bArr2622 = bArr20;
                                bArr22 = bArr18;
                                bArr14 = bArr2622;
                                util.h.xy.ar.b.m25100(bArr22, bArr14);
                                throw th;
                            }
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e7) {
                            e = e7;
                            bArr17 = null;
                        } catch (util.h.xy.ci.ma e8) {
                            e = e8;
                            bArr16 = null;
                        } catch (util.h.xy.ck.rc e9) {
                            e = e9;
                            bArr15 = null;
                        } catch (java.lang.Throwable th52) {
                            th = th52;
                            bArr14 = null;
                        }
                    }
                });
                java.lang.Object[] objArr292 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufbcbꈴ䠝\uf66d鱻㩅\ue076躞㒎튳碥⛀쳸櫷ᅜ뼽攲ͅꥅ坼ﵪ", 23022 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr292);
                thread2.setName(((java.lang.String) objArr292[0]).intern());
                thread2.start();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused67) {
                int red2 = android.graphics.Color.red(i2);
                int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2);
                int alpha2 = android.graphics.Color.alpha(i2);
                java.lang.Object[] objArr312 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u0006\tﾽ\u0011\u0012\r\u000b￦\u000f\f\u000f\u000f\u0002ﾽ\u0011\u0010", red2 + 16, lastIndexOf2 + 9, alpha2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, true, objArr312);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr312[0]).intern());
            }
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause5 = th5.getCause();
            if (cause5 == null) {
                throw th5;
            }
            throw cause5;
        }
    }

    private boolean getHighSpeedVideoSizes(boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufff9\uffff\u0006\u0002", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 262 - android.view.KeyEvent.normalizeMetaState(0), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("￩\ufffe￼\u000e\u0000\u000b\u0000�\u000e", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, 5 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 257, false, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        synchronized (this) {
            if (this.isOutputSupportedForhNQ4ISI == z && z) {
                com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufbcb瞣\ue36b弫쫾䚌뉒⹛駗ᖛ脾ﳨ梲\ue47d倅쏆㾔ꭉ❔銿\u0e74稶\uf5f3憎\udd51䤖쒜ゞ갽ᾡ讷ݽ獇\ueeca媋홖䈘붮⤮ꕻჁ貽\uf843琒\ue7d2厕콨㫠뚻≱鸸এ薒\uf151洙\ud8b8吢쀣㏩꾹\u1b4d霕ˑ纜\uea24断톫䵱뤵㓌ꃀᱚ蠜\ufbd1眬\ue330廿쪸䙜뉃ⷜ馒ᕆ肯ﲲ桱\ue435型쎎㽌\uab0f⛃鉫ฯ秽\uf5a1愊\udd19䣋쓟さꏦᾭ譫ܾ狰\uee98婂", 35911 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                getHighSpeedVideoFpsRangesFor(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, 0, null, ((java.lang.String) objArr3[0]).intern(), null));
                return false;
            }
            this.isOutputSupportedForhNQ4ISI = z;
            return true;
        }
    }

    private boolean getInputSizeshNQ4ISI() {
        int i;
        if (!util.h.xy.ag.a.m24556().m24560()) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.NULL_CONTEXT;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufbc9㋘榞ꁉ\udf1bᗃ䲐笁눋\ue8dc⟈幻锣쏿練ㄵ桺꛷\uddacᑨ䌯秸냑\uefd1♟崞诓슀句【滙ꖛ\udc4f୷䇳碲띰\uee2fⓡ厹詶셯￡㛆淖ꑀ팙্䃚罓똏\uec8dᮚ剃褱잱ﺁ㕛氓", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51516, objArr);
            getHighSpeedVideoFpsRangesFor(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -1, -1, null, ((java.lang.String) objArr[0]).intern(), null));
            i = getOutputStallDuration + 117;
        } else {
            if (util.h.xy.v.c.m27646().m27647()) {
                int i2 = getOutputStallDuration + 117;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_NOT_INITIALIZED;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﯙ汿풣㲹ꔠඐ痘\ude7d䙫껝ᜉ罥\ue7af䠖끈ᢼ胠\ue92e农", 38832 - android.view.MotionEvent.axisFromString(""), objArr2);
            getHighSpeedVideoFpsRangesFor(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, -1, -1, null, ((java.lang.String) objArr2[0]).intern(), null));
            i = getOutputStallDuration + 107;
        }
        getInputSizeshNQ4ISI = i % 128;
        return false;
    }

    private boolean getHighSpeedVideoSizesFor() {
        try {
            boolean m27700 = util.h.xy.y.mb.m27700(util.h.xy.ag.a.m24556().m24558());
            int i = (getOutputStallDuration + 59) % 128;
            getInputSizeshNQ4ISI = i;
            int i2 = i + 57;
            getOutputStallDuration = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (m27700) {
                return true;
            }
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_BLOCKED_SECURE_WALLET_ENROLLMENT_REQUIRED;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﮪ㮷笼모著㧘祡륑\uf881㠾群뽉ﺶ㹰縙붊ﴯ㳅籅뎽\uf379㌚犸눭\uf1d7ㅛ炸낐\uf008㞡眣뛕\uf646㗪疕딃\uf4aa㑫毂ꭽ\ueaed⪈橈ꦧ\ue953⣅桳꿻\uef9f⽷溥깓\ueddc\u2d74洘겍\uec3b⎡损ꊵ\ue272∛憉ꅹ\ue0bd⁆柼ꝡ\ue71b⚟晤ꖐ", 49261 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            getHighSpeedVideoFpsRangesFor(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, null, ((java.lang.String) objArr[0]).intern(), null));
            int i3 = getInputSizeshNQ4ISI + 125;
            getOutputStallDuration = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            getHighSpeedVideoFpsRangesFor(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, 0, -1, null, e.getMessage(), null));
            return false;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError, byte[] bArr) {
        getInputSizeshNQ4ISI = (getOutputStallDuration + 55) % 128;
        provisioningServiceError.getErrorMessage();
        getHighSpeedVideoSizes(false);
        getHighSpeedVideoFpsRanges(bArr);
        getHighSpeedVideoFpsRangesFor(provisioningServiceError);
        getOutputStallDuration = (getInputSizeshNQ4ISI + 49) % 128;
    }

    private void getHighSpeedVideoFpsRangesFor(final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        provisioningServiceError.getErrorMessage();
        getHighSpeedVideoSizes(false);
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.15
            private static int Camera2StreamConfigurationMap = 0;
            private static int[] getHighSpeedVideoFpsRanges = {1929791617, 780585651, 327922905, -1596626073, -1334726303, -814131781, -1433391275, 831234154, 121382568, 1915961631, 1716987470, -672144063, 173734569, 251704925, 2129866854, -1194010388, -1763391239, -1252611041};
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getInputFormats = 1;
            private static int getOutputMinFrameDuration;

            private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = getHighSpeedVideoFpsRanges;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 5) % 128;
                    for (int i2 = 0; i2 < length; i2++) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                        iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = getHighSpeedVideoFpsRanges;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                        iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                cVar.f2626 = 0;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                while (cVar.f2626 < iArr.length) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 87) % 128;
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

            @Override // java.lang.Runnable
            public final void run() {
                getInputFormats = (getOutputMinFrameDuration + 65) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{204398201, 1247707083}, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-2039075053, -465297815, 2078062958, -513487394, 645655062, 1473379739}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.ca.ra.getHighSpeedVideoFpsRanges(util.h.xy.ca.ra.this).onError(provisioningServiceError);
                int i = getInputFormats + 3;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        });
        getOutputStallDuration = (getInputSizeshNQ4ISI + 55) % 128;
    }

    private void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes(false);
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.ca.ra.2
            private static int Camera2StreamConfigurationMap = 294925130;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static long getHighSpeedVideoSizesFor = -2010138285946672498L;
            private static int getInputFormats = 0;
            private static char getOutputMinFrameDuration = 13130;

            private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
                int i2 = getHighSpeedVideoFpsRanges + 57;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                char[] charArray = str3.toCharArray();
                char[] charArray2 = str2.toCharArray();
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 91) % 128;
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
                    int i3 = (rcVar.f2652 + 2) % 4;
                    int i4 = (rcVar.f2652 + 3) % 4;
                    rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
                    cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
                    cArr[i4] = rcVar.f2653;
                    cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (Camera2StreamConfigurationMap ^ 2457411417541981002L))) ^ ((char) (getOutputMinFrameDuration ^ 2457411417541981002L)));
                    rcVar.f2652++;
                }
                java.lang.String str4 = new java.lang.String(cArr3);
                int i5 = getHighSpeedVideoSizes + 83;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 45) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uf3a1㏣롓䴾", (char) (40347 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), "摗\uf7ee鮱뚝", "姄ᴨ\uf74b였", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("蝶\u0c3b誱㼩瓣싋閒ﭧ牱稂闣", (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 805791074 + android.view.Gravity.getAbsoluteGravity(0, 0), "户ݥ茰蟀", "姄ᴨ\uf74b였", objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                util.h.xy.ca.ra.getHighSpeedVideoFpsRanges(util.h.xy.ca.ra.this).onComplete();
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 115) % 128;
            }
        });
        int i = getInputSizeshNQ4ISI + 27;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufff9\uffff\u0006\u0002", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, 262 - android.text.TextUtils.getOffsetBefore("", 0), true, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0001\u0001\u0000\r￫\ufffe\u0000\r", 8 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.KeyEvent.getDeadChar(0, 0) + 255, true, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager cardLifeCycleManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        cardLifeCycleManager.deleteCard(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: util.h.xy.ca.ra.3
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static short[] getHighSpeedVideoSizesFor = null;
            private static int getInputFormats = -609881261;
            private static int getInputSizeshNQ4ISI = -408873006;
            private static int getOutputFormats = 310079948;
            private static int getOutputMinFrameDuration = 1;
            private static byte[] getOutputStallDuration = {34, 87, 84, -87, -40, -6, -33, com.google.common.base.Ascii.FS, -10, -24, 19, 0, 13, -14, -40, 66, -107, 86, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -94, 89, 74, 71, -72};

            /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void Camera2StreamConfigurationMap(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr3) {
                int i4;
                boolean z;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i5 = i2 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
                if (i5 == -1) {
                    int i6 = getHighSpeedVideoFpsRangesFor + 11;
                    Camera2StreamConfigurationMap = i6 % 128;
                    if (i6 % 2 != 0) {
                        i4 = 1;
                        if (i4 != 0) {
                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 9) % 128;
                            byte[] bArr2 = getOutputStallDuration;
                            if (bArr2 != null) {
                                int length = bArr2.length;
                                byte[] bArr3 = new byte[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                                }
                                bArr2 = bArr3;
                            }
                            if (bArr2 != null) {
                                int i8 = Camera2StreamConfigurationMap;
                                int i9 = i8 + 83;
                                getHighSpeedVideoFpsRangesFor = i9 % 128;
                                int i10 = i9 % 2 != 0 ? ((byte) (getOutputStallDuration[((int) (getOutputFormats / (-2689713159175858216L))) * i] + 2689713159175858216L)) >> ((int) (getInputSizeshNQ4ISI * (-2689713159175858216L))) : ((byte) (getOutputStallDuration[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
                                getHighSpeedVideoFpsRangesFor = (i8 + 95) % 128;
                                i5 = (byte) i10;
                            } else {
                                i5 = (short) (((short) (getHighSpeedVideoSizesFor[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                            }
                        }
                        if (i5 > 0) {
                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
                            meVar.f2647 = ((i + i5) - 2) + ((int) (getOutputFormats ^ (-2689713159175858216L))) + i4;
                            meVar.f2644 = (char) (i3 + ((int) (getInputFormats ^ (-2689713159175858216L))));
                            sb.append(meVar.f2644);
                            meVar.f2646 = meVar.f2644;
                            byte[] bArr4 = getOutputStallDuration;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                for (int i11 = 0; i11 < length2; i11++) {
                                    bArr5[i11] = (byte) (bArr4[i11] ^ (-2689713159175858216L));
                                }
                                bArr4 = bArr5;
                            }
                            if (bArr4 != null) {
                                z = true;
                            } else {
                                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
                                z = false;
                            }
                            meVar.f2645 = 1;
                            while (meVar.f2645 < i5) {
                                int i12 = getHighSpeedVideoFpsRangesFor;
                                Camera2StreamConfigurationMap = (i12 + 75) % 128;
                                if (z) {
                                    Camera2StreamConfigurationMap = (i12 + 111) % 128;
                                    byte[] bArr6 = getOutputStallDuration;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr6[r9] ^ (-2689713159175858216L))) + s)) ^ b));
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
                        objArr3[0] = sb.toString();
                    }
                }
                i4 = 0;
                if (i4 != 0) {
                }
                if (i5 > 0) {
                }
                objArr3[0] = sb.toString();
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onSuccess(java.lang.String str) {
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 115) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 170236395, (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 116), android.text.TextUtils.indexOf("", "", 0, 0) - 11, (-1006953535) - android.view.View.MeasureSpec.getSize(0), objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 170236400, (short) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 38), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 12, (-1006953544) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr4);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                countDownLatch.countDown();
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 9) % 128;
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 69) % 128;
                long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 170236395, (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 116), (-11) - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.getOffsetAfter("", 0) - 1006953535, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap((maxKeyCode >> 16) + 170236410, (short) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (byte) (108 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), (-11) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-1006953542) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
                util.h.xy.am.ma.m25029(intern2, ((java.lang.String) objArr4[0]).intern());
                util.h.xy.ca.ra.getHighResolutionOutputSizeshNQ4ISI();
                countDownLatch.countDown();
                int i = getHighSpeedVideoFpsRanges + 23;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
        });
        try {
            countDownLatch.await(30L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
        }
        getInputSizeshNQ4ISI = (getOutputStallDuration + 97) % 128;
    }

    private static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufbc9䜩舿쵳ࠥ䭚陕텂ᱧ彯骗\ue59aₚ掴꺯\ue9d9㒚矌닮ﷱ㤙萗을ɿ䴒衝쭁ᙊ六鱨\udfd0᪓斘ꂠ\ue3ec⻒槁듴\uf7f1㋡繒뤍е䜯舫쵏", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48371, objArr);
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 0, -1, str, ((java.lang.String) objArr[0]).intern(), hashMap);
        int i = getOutputStallDuration + 21;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return provisioningServiceError;
        }
        throw null;
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputStallDurationlomOqCM = 7288098672405016970L;
        getOutputFormats = -1850932498;
        getOutputMinFrameDurationlomOqCM = -408873003;
        getOutputSizes = -222134059;
        getOutputMinFrameDuration = new byte[]{-47, -107, -123, -115, -93, -20, -74, -84, -81, -41, -121, -67, -119, -113, -76, Byte.MIN_VALUE, -108, 71, -1, -99, -73, -119, -52, -110, -67, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -86, -74, -81, -87, -79, -82, 89, 78, 81, -10, -82, 89, -82, 113, -15, -95, -89, -77, -87, 94, -86, -66, 97, com.visa.cbp.getEncExpo.registerForActivityResult, -121, 81, -77, 74, -67, -36, -108, -118, -115, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -27, -101, -9, -19, -110, -18, -14, -91, -35, -5, -107, -9, com.visa.cbp.getEncExpo.startTransaction, -12, -5, -13, -106, 41, -31, -25, 36, -20, com.visa.cbp.getEncExpo.startTransaction, -20, -5, -17, -116, 60, com.visa.cbp.getEncExpo.startTransaction, com.visa.cbp.getEncExpo.onUnminimized, -8, -98, 39, -31, -25, -102, 2, -14, -24, -60, -6, -17, -5, com.visa.cbp.getEncExpo.kernelVersion, -78, 42, -56, -30, -60, -34, -58, -42, -47, com.visa.cbp.getEncExpo.startTransaction, -17, -2, 8, -44, -51, -48, com.visa.cbp.getEncExpo.startTransaction, -8, -98, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.onUnminimized, 36, -2, -48, -44, 3, com.google.common.base.Ascii.VT, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.US, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.ETB, 57, 46, 126, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 42, 45, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, com.google.common.base.Ascii.VT, 4, com.google.common.base.Ascii.ETB, 7, 63, -43, 86, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.ETB, -45, -110, -120, -60, -1, -111, -7, -101, -11, Byte.MIN_VALUE, Byte.MIN_VALUE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -29, com.visa.cbp.getEncExpo.registerForActivityResult, -11, -21, -112, -20, com.visa.cbp.getEncExpo.onUnminimized, -93, -37, -7, -109, -11, -46, -80, -89, -123, -86, -77, 64, 89, -2, -86, -83, -123, -86, -77, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 121, -18, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -66, -79, -94, -70, -95};
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRangesFor = 1715214966616934417L;
        getInputFormats = -1231763926;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        int i = getInputSizeshNQ4ISI;
        getOutputStallDuration = (i + 99) % 128;
        getHighSpeedVideoFpsRanges = new byte[]{9, 80, com.google.common.base.Ascii.SYN, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE};
        getHighSpeedVideoSizes = 28;
        int i2 = i + 97;
        getOutputStallDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
