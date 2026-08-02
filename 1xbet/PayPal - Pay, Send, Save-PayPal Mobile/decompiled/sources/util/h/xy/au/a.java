package util.h.xy.au;

/* loaded from: classes5.dex */
class a implements com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService {
    public static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static long getHighSpeedVideoSizesFor;
    private static int getInputSizeshNQ4ISI;
    private static int[] getOutputMinFrameDuration;
    private byte[] getInputFormats;
    private java.util.Map<java.lang.String, java.lang.String> getOutputFormats;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes18.dex */
    static final class mb {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        public static final util.h.xy.au.a.mb getHighSpeedVideoFpsRanges;
        public static final util.h.xy.au.a.mb getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes = 1;
        private static final /* synthetic */ util.h.xy.au.a.mb[] getHighSpeedVideoSizesFor;
        private static int getInputFormats;
        private static long getOutputFormats;

        private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (i2 + 69) % 128;
            getHighSpeedVideoSizes = (i2 + 57) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
                aVar.f2623++;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        static {
            util.h.xy.au.a.mb[] mbVarArr;
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("節\ued44ꖑΆ度緲萻괎맥㧪쀿\ue91d緹\uf5f2ఫ│\u31e7뇣䠼愋\uf5e5䷨鐰\udd03꧴৻퀤ᤖ淿엷ᰶ", android.graphics.Color.red(0) + 1, objArr);
            util.h.xy.au.a.mb mbVar = new util.h.xy.au.a.mb(((java.lang.String) objArr[0]).intern(), 0);
            getHighSpeedVideoFpsRangesFor = mbVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("뷓蟯Ӕ柖분\u1759╾핣ﹰ千慯酣㩧齝굶嵼癦\udb5f\ue965ᥨ뉶❎㕮ꕤ\uee7b捅煪慾", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr2);
            util.h.xy.au.a.mb mbVar2 = new util.h.xy.au.a.mb(((java.lang.String) objArr2[0]).intern(), 1);
            getHighSpeedVideoFpsRanges = mbVar2;
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = i + 119;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                mbVarArr = new util.h.xy.au.a.mb[4];
                mbVarArr[0] = mbVar;
                mbVarArr[1] = mbVar2;
            } else {
                mbVarArr = new util.h.xy.au.a.mb[]{mbVar, mbVar2};
            }
            int i3 = i + 29;
            getInputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                getHighSpeedVideoSizesFor = mbVarArr;
                getInputFormats = (i + 91) % 128;
                return;
            }
            throw null;
        }

        private mb(java.lang.String str, int i) {
        }

        public static util.h.xy.au.a.mb valueOf(java.lang.String str) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 3;
            getInputFormats = i % 128;
            util.h.xy.au.a.mb mbVar = (util.h.xy.au.a.mb) java.lang.Enum.valueOf(util.h.xy.au.a.mb.class, str);
            if (i % 2 != 0) {
                throw null;
            }
            int i2 = getInputFormats + 97;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return mbVar;
            }
            throw new java.lang.ArithmeticException();
        }

        public static util.h.xy.au.a.mb[] values() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 97;
            getInputFormats = i % 128;
            util.h.xy.au.a.mb[] mbVarArr = getHighSpeedVideoSizesFor;
            if (i % 2 == 0) {
                return (util.h.xy.au.a.mb[]) mbVarArr.clone();
            }
            throw null;
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getOutputFormats = 5574617334237194455L;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoSizes + 31;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i4 = getHighSpeedVideoSizes + 121;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 % 1;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    a() {
    }

    static /* synthetic */ util.h.xy.az.b Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 93;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI(str, str2, str3);
            throw null;
        }
        util.h.xy.az.b highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, str2, str3);
        int i2 = getInputSizeshNQ4ISI + 37;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.au.a aVar, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 51;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, mobileGatewayError));
        int i2 = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        getInputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 117) % 128;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.ProductListener productListener, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        int i = getInputSizeshNQ4ISI + 27;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.13
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoSizes = 0;
            private static int getInputSizeshNQ4ISI = 1;
            private static char[] getOutputFormats = {42363, 42266, 42267, 42257, 42367, 42263, 42339, 42269, 42257, 42260, 42259, 42262, 42343, 42269, 42257, 42265, 42261, 42261};
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoSizes(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                int length;
                char[] cArr;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
                byte[] bytes = str.getBytes("ISO-8859-1");
                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr2 = getOutputFormats;
                if (cArr2 != null) {
                    int i6 = getHighResolutionOutputSizeshNQ4ISI + 27;
                    getHighSpeedVideoSizes = i6 % 128;
                    if (i6 % 2 != 0) {
                        length = cArr2.length;
                        cArr = new char[length];
                    } else {
                        length = cArr2.length;
                        cArr = new char[length];
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        cArr[i7] = (char) (cArr2[i7] ^ (-8125198844289309347L));
                    }
                    cArr2 = cArr;
                }
                char[] cArr3 = new char[i3];
                java.lang.System.arraycopy(cArr2, i2, cArr3, 0, i3);
                if (bytes != null) {
                    char[] cArr4 = new char[i3];
                    maVar.f2631 = 0;
                    char c = 0;
                    while (maVar.f2631 < i3) {
                        int i8 = getHighResolutionOutputSizeshNQ4ISI + 75;
                        getHighSpeedVideoSizes = i8 % 128;
                        if (i8 % 2 == 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 0) {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                        } else {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        }
                        c = cArr4[maVar.f2631];
                        maVar.f2631++;
                    }
                    cArr3 = cArr4;
                }
                if (i5 > 0) {
                    char[] cArr5 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                    int i9 = i3 - i5;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i5);
                    java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i9);
                }
                char[] cArr6 = new char[i3];
                maVar.f2631 = 0;
                while (maVar.f2631 < i3) {
                    cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                    maVar.f2631++;
                }
                if (i4 > 0) {
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i3) {
                        cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                        maVar.f2631++;
                    }
                }
                objArr[0] = new java.lang.String(cArr6);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = getOutputMinFrameDuration + 11;
                getInputSizeshNQ4ISI = i2 % 128;
                int i3 = i2 % 2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{0, 4, 0, 1}, "\u0000\u0001\u0000\u0001", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{4, 14, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001", objArr2);
                util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                productListener.onError(mobileGatewayError);
                getOutputMinFrameDuration = (getInputSizeshNQ4ISI + 15) % 128;
            }
        });
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 7;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getInputSizeshNQ4ISI = (i2 + 7) % 128;
    }

    static /* synthetic */ java.util.Map getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.a aVar) {
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 45;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        java.util.Map<java.lang.String, java.lang.String> map = aVar.getOutputFormats;
        if (i2 % 2 == 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i + 57) % 128;
        return map;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener, int i) {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        final util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.DEVICE_SUSPICIOUS, util.h.xy.ar.b.m25093(i));
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.4
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getInputFormats = 1;
            private static int getOutputFormats;
            private static int[] getOutputMinFrameDuration = {153179814, -1293797128, -35655741, -1862372445, 991649843, -170942384, -1641674819, -544363659, 1616585880, 1416208332, 1008664243, 91782102, 839974643, -1364900558, -267517053, -606952785, -809333505, -551196838};

            private static void getHighSpeedVideoSizes(int[] iArr, int i2, java.lang.Object[] objArr) {
                int i3;
                int length;
                int[] iArr2;
                int i4;
                int length2;
                int[] iArr3;
                int i5;
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr4 = getOutputMinFrameDuration;
                if (iArr4 != null) {
                    int i6 = Camera2StreamConfigurationMap + 103;
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        length2 = iArr4.length;
                        iArr3 = new int[length2];
                        i5 = 1;
                    } else {
                        length2 = iArr4.length;
                        iArr3 = new int[length2];
                        i5 = 0;
                    }
                    while (i5 < length2) {
                        int i7 = Camera2StreamConfigurationMap + 115;
                        getHighSpeedVideoFpsRangesFor = i7 % 128;
                        if (i7 % 2 != 0) {
                            iArr3[i5] = (int) (iArr4[i5] + 5569649899877129369L);
                        } else {
                            iArr3[i5] = (int) (iArr4[i5] ^ (-5569649899877129369L));
                            i5++;
                        }
                    }
                    iArr4 = iArr3;
                }
                int length3 = iArr4.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = getOutputMinFrameDuration;
                if (iArr6 != null) {
                    int i8 = getHighSpeedVideoFpsRangesFor;
                    int i9 = i8 + 37;
                    Camera2StreamConfigurationMap = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i4 = 1;
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i4 = 0;
                    }
                    Camera2StreamConfigurationMap = (i8 + 81) % 128;
                    while (i4 < length) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 23) % 128;
                        iArr2[i4] = (int) (iArr6[i4] ^ (-5569649899877129369L));
                        i4++;
                        length3 = length3;
                    }
                    i3 = length3;
                    iArr6 = iArr2;
                } else {
                    i3 = length3;
                }
                java.lang.System.arraycopy(iArr6, 0, iArr5, 0, i3);
                cVar.f2626 = 0;
                while (cVar.f2626 < iArr.length) {
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr5);
                    int i10 = 0;
                    while (i10 < 16) {
                        cVar.f2627 ^= iArr5[i10];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i11 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i11;
                        i10++;
                        int i12 = getHighSpeedVideoFpsRangesFor + 125;
                        Camera2StreamConfigurationMap = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    int i14 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i14;
                    cVar.f2625 ^= iArr5[16];
                    cVar.f2627 ^= iArr5[17];
                    int i15 = cVar.f2627;
                    int i16 = cVar.f2625;
                    cArr[0] = (char) (cVar.f2627 >>> 16);
                    cArr[1] = (char) cVar.f2627;
                    cArr[2] = (char) (cVar.f2625 >>> 16);
                    cArr[3] = (char) cVar.f2625;
                    util.h.xz.b.c.m27723(iArr5);
                    cArr2[cVar.f2626 * 2] = cArr[0];
                    cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
                    cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
                    cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
                    cVar.f2626 += 2;
                }
                objArr[0] = new java.lang.String(cArr2, 0, i2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputFormats = (getInputFormats + 59) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-752599106, 1850759104}, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{543908556, -2105460870, -181774882, -645289257, 284108210, -795173453}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, objArr2);
                util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                mGDigitizationListener.onError(null, mbVar);
                getInputFormats = (getOutputFormats + 73) % 128;
            }
        });
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 33;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 39;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x02b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.au.a aVar, util.h.xy.az.ra raVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener) {
        byte[] bArr;
        byte[] bArr2;
        java.util.Map<java.lang.String, java.lang.String> m25158;
        util.h.xy.az.ra m25276;
        java.lang.String m25142;
        int i = getHighResolutionOutputSizeshNQ4ISI + 17;
        getInputSizeshNQ4ISI = i % 128;
        byte[] bArr3 = null;
        try {
            try {
                bArr2 = ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25206();
                try {
                    bArr = util.h.xy.bh.mb.m25469();
                    try {
                        try {
                            m25158 = util.h.xy.au.g.m25127().m25158(raVar);
                            java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
                            java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("롯嵔爺ᜪ⳺쇍\ue6b2ﮉ酡뙑䬴怹׳", 58658 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                            m25276 = util.h.xy.az.mb.m25275().m25276(getHighResolutionOutputSizeshNQ4ISI(str, str2, m25158.get(((java.lang.String) objArr[0]).intern())));
                            new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                            m25142 = util.h.xy.au.g.m25127().m25142(m25276);
                        } catch (java.lang.Exception e) {
                            e = e;
                            util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e.getMessage())));
                            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                            util.h.xy.bh.mb.m25483(bArr2, bArr);
                            if (i % 2 != 0) {
                            }
                        }
                    } catch (org.json.JSONException e2) {
                        e = e2;
                        util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage())));
                        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                        util.h.xy.bh.mb.m25483(bArr2, bArr);
                        if (i % 2 != 0) {
                        }
                    } catch (util.h.xy.az.ma e3) {
                        e = e3;
                        util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, util.h.xy.bh.mb.m25478(e)));
                        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                        util.h.xy.bh.mb.m25483(bArr2, bArr);
                        if (i % 2 != 0) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr3 = bArr;
                        bArr = bArr3;
                        bArr3 = bArr2;
                        util.h.xy.bh.mb.m25483(bArr3, bArr);
                        throw th;
                    }
                } catch (org.json.JSONException e4) {
                    e = e4;
                    bArr = null;
                } catch (util.h.xy.az.ma e5) {
                    e = e5;
                    bArr = null;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    bArr = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (org.json.JSONException e7) {
            e = e7;
            bArr2 = null;
            bArr = null;
        } catch (util.h.xy.az.ma e8) {
            e = e8;
            bArr2 = null;
            bArr = null;
        } catch (java.lang.Exception e9) {
            e = e9;
            bArr2 = null;
            bArr = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = null;
            util.h.xy.bh.mb.m25483(bArr3, bArr);
            throw th;
        }
        if (util.h.xy.az.ra.m25277(m25142)) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 73) % 128;
            java.util.List<util.h.xy.au.mg> m25156 = util.h.xy.au.g.m25127().m25156(m25276.m25280());
            if (m25156.isEmpty()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{-1178657841, -1993673956, -784846186, 769351488, 233593309, -601709137, 1593574345, 391750953, -683978912, 1716219156, -651095927, 1506522347, 1075007835, 1378756982, -466097705, 1682464254, 1319680736, -1224835365, 1296595688, -750300179}, 38 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INVALID_TNC_DATA_TYPE, ((java.lang.String) objArr2[0]).intern())));
                getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                util.h.xy.bh.mb.m25483(bArr2, bArr);
            } else {
                final util.h.xy.bb.md mdVar = new util.h.xy.bb.md();
                mdVar.m25328(aVar.getInputFormats);
                try {
                    java.lang.String str3 = new java.lang.String(m25156.get(0).m25195());
                    getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 45) % 128;
                    mdVar.m25327(str3.getBytes());
                    mdVar.m25325(m25156.get(0).m25192());
                    mdVar.m25326(m25156.get(0).m25196());
                    mdVar.m25329(m25156.get(0).m25189());
                    util.h.xy.au.g m25127 = util.h.xy.au.g.m25127();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("롲\ueb93ᾞ䎟\uf792ᮎ侽\uf3a7➷䮩", 21499 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                    final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData m25157 = m25127.m25157(m25158.get(((java.lang.String) objArr3[0]).intern()));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 13) % 128;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("롖ףּ㸅焕됣\uf7cb⪁涶ꂑ\ue465❊娩鴊탺Ꮐ嚤覌촴v䌷蘅㧴糴뾾\uf29a㙻楔갼\uef16⋴旐颮\udb82Ẩ剬镕젳ଅ仯臇쒱ߌ뭢﹀ㄜ琝럪\ueac9ⶮ悇ꑦ\ue716ᨴ崑都폞ᚱ䦝赾쁕ͱ䙘栗㳕義늶\uf580⥪汆꼴\ue208◭壍鮅\ude89ሴ唏", 17183 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
                        sb.append(((java.lang.String) objArr4[0]).intern());
                        sb.append(aVar.getInputFormats);
                        if (sb.toString() != null) {
                            new java.lang.String(aVar.getInputFormats, java.nio.charset.StandardCharsets.UTF_8);
                            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                        }
                        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.2
                            private static int Camera2StreamConfigurationMap = 0;
                            private static int getHighSpeedVideoSizesFor = 0;
                            private static int getInputSizeshNQ4ISI = 1;
                            private static long getOutputFormats = -8845282478902135293L;
                            private static int getOutputMinFrameDuration = 1;

                            private static void getHighSpeedVideoFpsRanges(java.lang.String str4, int i2, java.lang.Object[] objArr5) {
                                int i3 = getInputSizeshNQ4ISI + 117;
                                Camera2StreamConfigurationMap = i3 % 128;
                                if (i3 % 2 != 0) {
                                    throw new java.lang.ArithmeticException();
                                }
                                char[] charArray = str4.toCharArray();
                                util.h.xz.b.a aVar2 = new util.h.xz.b.a();
                                char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i2);
                                aVar2.f2623 = 4;
                                while (aVar2.f2623 < m27721.length) {
                                    aVar2.f2624 = aVar2.f2623 - 4;
                                    m27721[aVar2.f2623] = (char) ((m27721[aVar2.f2623] ^ m27721[aVar2.f2623 % 4]) ^ (aVar2.f2624 * (getOutputFormats ^ 7817488252581312552L)));
                                    aVar2.f2623++;
                                    Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 67) % 128;
                                }
                                objArr5[0] = new java.lang.String(m27721, 4, m27721.length - 4);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 37) % 128;
                                java.lang.String str4 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("ᱝ뭧ᰑջ甜\ue4c8饤踊", 1 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                                java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges("≎吁∊턊驧촘䴟\ua7dc᪱勸ю湡単毁\udce2ᚒ衤ⱡ霃", android.text.TextUtils.indexOf("", "", 0, 0) + 1, objArr6);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr6[0]).intern());
                                cardEligibilityListener.onSuccess(mdVar, m25157);
                                getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 105) % 128;
                            }
                        });
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause = th5.getCause();
                        if (cause == null) {
                            throw th5;
                        }
                        throw cause;
                    }
                } catch (java.lang.Exception e10) {
                    util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INVALID_TNC_DATA_TYPE, e10.getMessage())));
                    getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
                    util.h.xy.bh.mb.m25483(bArr2, bArr);
                }
            }
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        util.h.xy.bh.ra.m25484().m25487(aVar.new AnonymousClass11(cardEligibilityListener, new util.h.xy.au.mb(m25142, util.h.xy.au.g.m25127().m25134(m25276))));
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        util.h.xy.bh.mb.m25483(bArr2, bArr);
        if (i % 2 != 0) {
        }
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getInputSizeshNQ4ISI = i % 128;
        boolean highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getInputSizeshNQ4ISI + 29;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoSizes;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 13;
        getInputSizeshNQ4ISI = i % 128;
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(str);
        if (i % 2 == 0) {
            return highSpeedVideoSizes;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) throws util.h.xy.az.ma, org.json.JSONException {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 29) % 128;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 26171, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 48312, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str3);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, 8 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str2);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롼伱囱嶵敆波玥筢ȑ\u09b3ᅩ᠋⿌㝬㸅엓처푐", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63310, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f912);
        bVar.m25258(util.h.xy.au.g.m25127().m25154(str4, str5, str6, str7));
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 1;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i + 61) % 128;
        return bVar;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoFpsRangesFor(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws util.h.xy.az.ma, org.json.JSONException {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        util.h.xy.az.b highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, eligibilityData, instrumentData, str, str2, str3, str4);
        int i = getInputSizeshNQ4ISI + 39;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, int i) {
        int i2 = getInputSizeshNQ4ISI + 111;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        final util.h.xy.au.mb mbVar = new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.DEVICE_SUSPICIOUS, util.h.xy.ar.b.m25093(i));
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.1
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getInputFormats = 1;
            private static int getInputSizeshNQ4ISI = 0;
            private static long getOutputFormats = 3640087422259544550L;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i3, java.lang.Object[] objArr) {
                int i4 = getHighSpeedVideoFpsRangesFor + 57;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                char[] charArray = str.toCharArray();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 53) % 128;
                char[] cArr = charArray;
                util.h.xz.b.d dVar = new util.h.xz.b.d();
                dVar.f2628 = i3;
                int length = cArr.length;
                long[] jArr = new long[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < cArr.length) {
                    jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputFormats ^ (-7508379876853140581L));
                    dVar.f2629++;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 73) % 128;
                }
                char[] cArr2 = new char[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < cArr.length) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 45) % 128;
                    cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                    dVar.f2629++;
                }
                objArr[0] = new java.lang.String(cArr2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputSizeshNQ4ISI = (getInputFormats + 69) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\uf231鹈⫾뜑", android.view.KeyEvent.normalizeMetaState(0) + 27749, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\uf239鴽Ⱔ뼟业\ud912档ﭥ詐ᕍꓑ㞽욤", 28429 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
                util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                cardEligibilityListener.onError(mbVar);
                int i3 = getInputSizeshNQ4ISI + 51;
                getInputFormats = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i3 = getInputSizeshNQ4ISI + 117;
        int i4 = i3 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i2 % 2 == 0) {
            throw null;
        }
        getInputSizeshNQ4ISI = (i4 + 105) % 128;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 93) % 128;
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.19
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static long getInputFormats = -780159548339392171L;
            private static int getOutputFormats = 1;
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
                char[] charArray = str.toCharArray();
                util.h.xz.b.d dVar = new util.h.xz.b.d();
                dVar.f2628 = i;
                int length = charArray.length;
                long[] jArr = new long[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 51) % 128;
                    jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputFormats ^ (-7508379876853140581L));
                    dVar.f2629++;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 35) % 128;
                }
                char[] cArr = new char[length];
                dVar.f2629 = 0;
                while (dVar.f2629 < charArray.length) {
                    cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                    dVar.f2629++;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputFormats = (getOutputMinFrameDuration + 37) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("슂䳽\ude41榤", 36451 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("슊婞\uf337ࠜꇩ㺱垰\uec86ѣ鵎㩂叾\ue8d7", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 39134, objArr2);
                util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                cardEligibilityListener.onError(mobileGatewayError);
                getOutputMinFrameDuration = (getOutputFormats + 9) % 128;
            }
        });
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 33;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 77;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode, java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 27) % 128;
        final util.h.xy.au.mb mbVar = new util.h.xy.au.mb(mGErrorCode, str);
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.8
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoSizes = 1;
            private static long getHighSpeedVideoSizesFor = -9161506880810788563L;
            private static int getOutputFormats = 0;
            private static int getOutputMinFrameDuration = 1;

            private static void getHighSpeedVideoSizes(java.lang.String str2, int i, java.lang.Object[] objArr) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 89) % 128;
                char[] charArray = str2.toCharArray();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 111) % 128;
                util.h.xz.b.a aVar2 = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizesFor ^ 7817488252581312552L, charArray, i);
                aVar2.f2623 = 4;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 3) % 128;
                while (aVar2.f2623 < m27721.length) {
                    aVar2.f2624 = aVar2.f2623 - 4;
                    m27721[aVar2.f2623] = (char) ((m27721[aVar2.f2623] ^ m27721[aVar2.f2623 % 4]) ^ (aVar2.f2624 * (getHighSpeedVideoSizesFor ^ 7817488252581312552L)));
                    aVar2.f2623++;
                }
                objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (getOutputFormats + 65) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("㍢㌮儐灅뉂컡\uf001궭", 1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes("撢擦챸\ued30⦳肀\ue0e5楏毺궧Ҥ泎\ue57b\ue3caↇ袸", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                cardMetaDataFetchListener.onError(mbVar);
                int i = getOutputFormats + 45;
                getOutputMinFrameDuration = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
        });
        int i = getInputSizeshNQ4ISI + 71;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            throw null;
        }
        getInputSizeshNQ4ISI = (i2 + 117) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(util.h.xy.au.rg rgVar, byte[] bArr) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] bArr2;
        byte[] m25226;
        int i;
        int i2 = getInputSizeshNQ4ISI + 45;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        byte[] bArr3 = null;
        try {
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            m25226 = rgVar.m25226();
        } catch (org.json.JSONException e) {
            e = e;
            bArr2 = null;
        } catch (java.lang.Throwable th) {
            th = th;
            bArr2 = null;
        }
        try {
            if (m25226 != null) {
                try {
                    if (m25226.length <= 0) {
                    }
                    bArr2 = util.h.xy.au.g.m25127().m25155(m25226, bArr);
                    rgVar.m25224(bArr2);
                    if (m25226 != null) {
                        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
                        java.util.Arrays.fill(m25226, (byte) 0);
                        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
                    }
                    if (bArr2 != null) {
                        java.util.Arrays.fill(bArr2, (byte) 0);
                    }
                    i = getInputSizeshNQ4ISI + 61;
                    getHighResolutionOutputSizeshNQ4ISI = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    return;
                } catch (org.json.JSONException e2) {
                    e = e2;
                    bArr2 = null;
                    bArr3 = m25226;
                    try {
                        e.getMessage();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{-1880968069, 612953611, 1851350952, 6407265, 1420660046, -1874071685, 513566477, 1520845622, -608019619, -366137246, 1573295190, 161475797, -1699100840, -1894454696, 681293053, -421597285, 534907362, -395093206, 836079351, 1696680471}, 37 - android.text.TextUtils.getTrimmedLength(""), objArr);
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(((java.lang.String) objArr[0]).intern());
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (bArr3 != null) {
                            java.util.Arrays.fill(bArr3, (byte) 0);
                        }
                        if (bArr2 != null) {
                            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 91) % 128;
                            java.util.Arrays.fill(bArr2, (byte) 0);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr2 = null;
                    bArr3 = m25226;
                    if (bArr3 != null) {
                    }
                    if (bArr2 != null) {
                    }
                    throw th;
                }
            }
            rgVar.m25224(bArr2);
            if (m25226 != null) {
            }
            if (bArr2 != null) {
            }
            i = getInputSizeshNQ4ISI + 61;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
            }
        } catch (org.json.JSONException e3) {
            e = e3;
            bArr3 = m25226;
            e.getMessage();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1880968069, 612953611, 1851350952, 6407265, 1420660046, -1874071685, 513566477, 1520845622, -608019619, -366137246, 1573295190, 161475797, -1699100840, -1894454696, 681293053, -421597285, 534907362, -395093206, 836079351, 1696680471}, 37 - android.text.TextUtils.getTrimmedLength(""), objArr2);
            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(((java.lang.String) objArr2[0]).intern());
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr3 = m25226;
            if (bArr3 != null) {
            }
            if (bArr2 != null) {
            }
            throw th;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-1004196378, 728892427, 1579426843, -711568721, 1492115873, 2036523938, -665433626, 532640496, 587029828, -542082700, 1890492922, -927494851, -1574219948, 1324084954, -1429667250, 949883956}, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33, objArr3);
        m25226 = ((java.lang.String) objArr3[0]).intern().getBytes();
        bArr2 = util.h.xy.au.g.m25127().m25155(m25226, bArr);
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(util.h.xy.au.mg mgVar) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 57;
        getInputSizeshNQ4ISI = i % 128;
        java.lang.String str = new java.lang.String(mgVar.m25195());
        int i2 = getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 45) % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i2 + 63;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ java.util.Map getHighSpeedVideoSizes(util.h.xy.au.a aVar, java.util.Map map) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (i + 93) % 128;
        aVar.getOutputFormats = map;
        getInputSizeshNQ4ISI = (i + 121) % 128;
        return map;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, byte[] bArr, byte[] bArr2, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) throws util.h.xy.az.ma, org.json.JSONException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 97;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRangesFor(str, str2, str3, str4, str5, str6, bArr, bArr2, str7, str8, str9, str10, str11);
        }
        getHighSpeedVideoFpsRangesFor(str, str2, str3, str4, str5, str6, bArr, bArr2, str7, str8, str9, str10, str11);
        throw null;
    }

    static /* synthetic */ util.h.xy.az.b getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData, java.lang.String str6) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.String obj;
        int i = getHighResolutionOutputSizeshNQ4ISI + 109;
        int i2 = i % 128;
        getInputSizeshNQ4ISI = i2;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 17) % 128;
        if (android.text.TextUtils.isEmpty(str5)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26170, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", 48311 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str4);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str3);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1077519476, 1364344961, 796301681, -80924914, 510935431, 956036905, -467963292, -441621702, -789688718, 518716427}, 21 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            obj = sb.toString();
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 15) % 128;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", 26171 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(1);
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(1);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 48311, objArr6);
            sb2.append(((java.lang.String) objArr6[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str4);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{193789867, -2063319409}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3, objArr7);
            sb2.append(((java.lang.String) objArr7[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str5);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, 6 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr8);
            sb2.append(((java.lang.String) objArr8[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str3);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1077519476, 1364344961, 796301681, -80924914, 510935431, 956036905, -467963292, -441621702, -789688718, 518716427}, android.view.View.resolveSize(0, 0) + 20, objArr9);
            sb2.append(((java.lang.String) objArr9[0]).intern());
            obj = sb2.toString();
        }
        util.h.xy.az.b bVar = new util.h.xy.az.b(obj, util.h.xy.az.b.EnumC0259b.f912);
        bVar.m25258(util.h.xy.au.g.m25127().m25161(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), bArr2, inputMethod, str, walletAccountData, str6));
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener, final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        int i = getInputSizeshNQ4ISI + 35;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = (i2 + 77) % 128;
        getInputSizeshNQ4ISI = i3;
        if (str != null) {
            int i4 = i3 + 77;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                aVar.getHighSpeedVideoSizes(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                throw null;
            }
            aVar.getHighSpeedVideoSizes(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.5
            private static int getHighSpeedVideoSizes = 0;
            private static int getHighSpeedVideoSizesFor = 294925130;
            private static int getInputFormats = 1;
            private static long getInputSizeshNQ4ISI = -6820253089688926574L;
            private static char getOutputFormats = 13130;
            private static int getOutputMinFrameDuration = 0;
            private static int getOutputStallDuration = 1;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str2, char c, int i5, java.lang.String str3, java.lang.String str4, java.lang.Object[] objArr) {
                char[] charArray = str4.toCharArray();
                getInputFormats = (getHighSpeedVideoSizes + 109) % 128;
                char[] cArr = charArray;
                char[] charArray2 = str3.toCharArray();
                int i6 = (getHighSpeedVideoSizes + 121) % 128;
                getInputFormats = i6;
                char[] cArr2 = charArray2;
                getHighSpeedVideoSizes = (i6 + 75) % 128;
                char[] charArray3 = str2.toCharArray();
                util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int length2 = cArr.length;
                char[] cArr4 = new char[length2];
                java.lang.System.arraycopy(cArr2, 0, cArr3, 0, length);
                java.lang.System.arraycopy(cArr, 0, cArr4, 0, length2);
                cArr3[0] = (char) (cArr3[0] ^ c);
                cArr4[2] = (char) (cArr4[2] + ((char) i5));
                int length3 = charArray3.length;
                char[] cArr5 = new char[length3];
                rcVar.f2652 = 0;
                int i7 = getHighSpeedVideoSizes + 7;
                getInputFormats = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 5;
                }
                while (rcVar.f2652 < length3) {
                    int i9 = (rcVar.f2652 + 2) % 4;
                    int i10 = (rcVar.f2652 + 3) % 4;
                    rcVar.f2653 = (char) (((cArr3[rcVar.f2652 % 4] * 32718) + cArr4[i9]) % 65535);
                    cArr4[i10] = (char) (((cArr3[i10] * 32718) + cArr4[i9]) / 65535);
                    cArr3[i10] = rcVar.f2653;
                    cArr5[rcVar.f2652] = (char) ((((cArr3[i10] ^ charArray3[rcVar.f2652]) ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizesFor ^ 2457411417541981002L))) ^ ((char) (getOutputFormats ^ 2457411417541981002L)));
                    rcVar.f2652++;
                }
                objArr[0] = new java.lang.String(cArr5);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputStallDuration = (getOutputMinFrameDuration + 33) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("㈑Ὼ媑쿶", (char) (29819 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf("", "", 0, 0), "\uf81c鷔稀\ude74", "\uf5d8⽀\ued59荃", objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("⚎∁ᇟ剪䝛돸蒵⬀㷮ٴ扈", (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 2112918725 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "앹\uf094쑽뤊", "\uf5d8⽀\ued59荃", objArr2);
                util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
                mGDigitizationListener.onError(str, mobileGatewayError);
                getOutputStallDuration = (getOutputMinFrameDuration + 19) % 128;
            }
        });
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.au.a aVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.TermsAndConditionsListener termsAndConditionsListener, final com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.14
            private static int Camera2StreamConfigurationMap = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizesFor = 0;
            private static long getInputSizeshNQ4ISI = 896456647001583936L;
            private static int getOutputMinFrameDuration = 1;

            private static void Camera2StreamConfigurationMap(java.lang.String str, int i2, java.lang.Object[] objArr) {
                int i3 = getHighSpeedVideoFpsRangesFor + 5;
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.a aVar2 = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getInputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i2);
                aVar2.f2623 = 4;
                while (aVar2.f2623 < m27721.length) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 87) % 128;
                    aVar2.f2624 = aVar2.f2623 - 4;
                    m27721[aVar2.f2623] = (char) ((m27721[aVar2.f2623] ^ m27721[aVar2.f2623 % 4]) ^ (aVar2.f2624 * (getInputSizeshNQ4ISI ^ 7817488252581312552L)));
                    aVar2.f2623++;
                }
                objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String intern;
                java.lang.Object obj;
                int i2 = getHighSpeedVideoSizesFor + 77;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ᩯ湁쳭ᨣ䃬Ꝺ年Თ", android.text.TextUtils.lastIndexOf("", (char) 24), objArr);
                    intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("㕏莼踢㔋欿䪙Ჱ㝂Ⴜ沚㘔\ueab3繁靗倜찈䗪", android.view.View.combineMeasuredStates(1, 1), objArr2);
                    obj = objArr2[0];
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ᩯ湁쳭ᨣ䃬Ꝺ年Თ", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr3);
                    intern = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("㕏莼踢㔋欿䪙Ჱ㝂Ⴜ沚㘔\ueab3繁靗倜찈䗪", android.view.View.combineMeasuredStates(0, 0), objArr4);
                    obj = objArr4[0];
                }
                util.h.xy.am.ma.m25029(intern, ((java.lang.String) obj).intern());
                termsAndConditionsListener.onError(mobileGatewayError);
            }
        });
        int i2 = getInputSizeshNQ4ISI;
        int i3 = i2 + 73;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i % 2 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 97) % 128;
    }

    static /* synthetic */ byte[] getHighSpeedVideoSizes(util.h.xy.au.a aVar) {
        int i = getInputSizeshNQ4ISI;
        int i2 = i + 69;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        byte[] bArr = aVar.getInputFormats;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 103;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighSpeedVideoSizes(util.h.xy.au.a aVar, byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (i + 1) % 128;
        aVar.getInputFormats = bArr;
        getInputSizeshNQ4ISI = (i + 7) % 128;
        return bArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = "a";
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 63) % 128;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoFpsRanges ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        char[] cArr3 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
            raVar.f2649++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getOutputMinFrameDuration;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                i2++;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 27) % 128;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputMinFrameDuration;
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
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 89) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 43) % 128;
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

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void checkCardEligibility(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, java.lang.String str2) {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 109) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롟\uecd9ᅂ䗵\uea62Ỿ䌂\uf7b1ᰦ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21647, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRanges(bArr, inputMethod, str, (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData) null, util.h.xy.au.a.mb.getHighSpeedVideoFpsRangesFor, cardEligibilityListener, str2);
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void checkCardEligibility(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData, com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, java.lang.String str2) {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 5 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롟\uecd9ᅂ䗵\uea62Ỿ䌂\uf7b1ᰦ", 21647 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRanges(bArr, inputMethod, str, walletAccountData, util.h.xy.au.a.mb.getHighSpeedVideoFpsRanges, cardEligibilityListener, str2);
        int i = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: util.h.xy.au.a$11, reason: invalid class name */
    final class AnonymousClass11 implements java.lang.Runnable {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getInputFormats = -1231763749;
        private static int getOutputFormats = 0;
        private static int getOutputMinFrameDuration = 1;
        final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError getHighSpeedVideoFpsRanges;

        private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
            char[] charArray = str.toCharArray();
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 61) % 128;
            char[] cArr = charArray;
            util.h.xz.b.ra raVar = new util.h.xz.b.ra();
            char[] cArr2 = new char[i];
            raVar.f2649 = 0;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 77) % 128;
            while (raVar.f2649 < i) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 47) % 128;
                raVar.f2650 = cArr[raVar.f2649];
                cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
                int i4 = raVar.f2649;
                cArr2[i4] = (char) (cArr2[i4] - ((int) (getInputFormats ^ (-4839292868003314026L))));
                raVar.f2649++;
            }
            if (i2 > 0) {
                raVar.f2648 = i2;
                char[] cArr3 = new char[i];
                java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
                java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
                java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
            }
            if (z) {
                char[] cArr4 = new char[i];
                raVar.f2649 = 0;
                while (raVar.f2649 < i) {
                    cArr4[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                    raVar.f2649++;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new java.lang.String(cArr2);
        }

        AnonymousClass11(com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
            this.getHighResolutionOutputSizeshNQ4ISI = cardEligibilityListener;
            this.getHighSpeedVideoFpsRanges = mobileGatewayError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            getOutputMinFrameDuration = (getOutputFormats + 13) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0006\u0002\ufff9\uffff", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4, 3 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 150, true, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0007�\uffff\r￨\u0000\u000e\b�\u0000\r￨\t\uffff\ufffe", 15 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 14 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.KeyEvent.getDeadChar(0, 0) + 147, false, objArr2);
            util.h.xy.am.ma.m25029(intern, ((java.lang.String) objArr2[0]).intern());
            this.getHighResolutionOutputSizeshNQ4ISI.onError(this.getHighSpeedVideoFpsRanges);
            getOutputFormats = (getOutputMinFrameDuration + 125) % 128;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void checkEligibility(final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener) {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 53) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 - android.view.View.getDefaultSize(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롟\uecd9ᅂ䗵\uea62Ỿ䌂\uf7b1ᰦ", 21647 - android.view.KeyEvent.keyCodeFromString(""), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        int i = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (eligibilityData == null) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1754055071, -334918119, 398023256, 891907829, 459271106, -704247892, -89555363, 1882906205, 798210894, -1242026733, 385199054, -253716404}, 24 - android.view.KeyEvent.normalizeMetaState(0), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (instrumentData == null) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒딀ꋧ龥贃\ufafb\uf7a1\ue568틺쾨㴚⫨➵ᔟ˰羥洅嫪埁䔐닾꾶鴔", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3412, objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        if (cardEligibilityListener == null) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒議\ude07ℵ瓃䟫誁\ude38ⅰ琗䜻諈\udd87₿瑑䝹訌\udd27\u20c3班䚳詛\udd61‑獃䛊覐\udcaf⁃獯䘃褥\udce9", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13093, objArr5);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.a.12
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getInputFormats;

            /*  JADX ERROR: Types fix failed
                java.lang.NullPointerException
                */
            /* JADX WARN: Failed to calculate best type for var: r0v10 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v12 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v14 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v16 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v17 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v18 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v4 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v5 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v6 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r0v9 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r1v1 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r1v10 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r1v12 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r1v23 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r1v24 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r1v9 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Not initialized variable reg: 1, insn: 0x01e1: MOVE (r13 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:62:0x01e1 */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: util.h.xy.au.a.AnonymousClass12.run():void");
            }
        }).start();
        int i2 = getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 25) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 75) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void getTermsAndConditions(final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.listener.TermsAndConditionsListener termsAndConditionsListener) {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getInputSizeshNQ4ISI + 67;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 5 << (android.view.ViewConfiguration.getFadingEdgeLength() - 41), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, 1904355994, -1412302523, 1427991462, -1364529773}, android.view.MotionEvent.axisFromString("") + 106, objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, 1904355994, -1412302523, 1427991462, -1364529773}, 9 - android.view.MotionEvent.axisFromString(""), objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 17;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            android.text.TextUtils.isEmpty(str);
            throw null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롋ｆ㘪淲ꓒ\udb93፵䨛脇㢜羮띿\uee41┖峦鎮쫋ɦ뤰\uf046㟒溭ꙡ\udd56ᐊ", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18222, objArr5);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
        }
        if (termsAndConditionsListener == null) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롏宻翣ጹ㝼쪃\ueeeb舜꙰릙巇焈ᕎ⥮체\ue0ff营顽뮍忭猌ᝆ⪐컆\ue206虔騹붿凶甤ॣⲯ샏\ue45e\uf853鮑뾏匌睐୴⺿", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 58309, objArr6);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.a.9
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizesFor = 1;
            private static char[] getInputFormats = {40002, 16485, 9337, 2154, 60469, 53352, 46189, 38989, 31821, 8281, 1104, 59458, 52253, 45092, 37928, 30767, 23586, 't', 58421, 51249, 44049, 36936, 29708, 22557, 15383, 57359, 50410, 43253, 36089, 28848, 21731, 14591, 7379, 49353, 42200, 34958, 27860, 20694, 13531, 6370, 64682, 41123, 33981, 26802, 19636, 12436, 5262, 63621, 56479, 32903, 65269, 8903, 18142, 27335, 36550, 45772, 55002, 64225, 7855, 17124, 26362, 35556, 44731, 53888, 63118, 6809, 16025, 25238, 34525, 43665, 52909, 62190, 5818, 15025, 24237, 33452, 42560, 51794, 60939, 4676, 13908, 23119, 32375, 41581, 50787, 60027, 3702};
            private static long getInputSizeshNQ4ISI = -6205971871184306172L;
            private static int getOutputFormats;

            private static void getHighResolutionOutputSizeshNQ4ISI(int i3, int i4, char c, java.lang.Object[] objArr7) {
                util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                long[] jArr = new long[i3];
                rbVar.f2651 = 0;
                int i5 = getHighResolutionOutputSizeshNQ4ISI + 19;
                Camera2StreamConfigurationMap = i5 % 128;
                int i6 = i5 % 2;
                while (rbVar.f2651 < i3) {
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 71) % 128;
                    jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i4] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
                    rbVar.f2651++;
                }
                char[] cArr = new char[i3];
                rbVar.f2651 = 0;
                while (rbVar.f2651 < i3) {
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    rbVar.f2651++;
                }
                objArr7[0] = new java.lang.String(cArr);
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr;
                java.lang.Throwable th;
                byte[] bArr2;
                java.lang.Throwable th2;
                java.lang.Exception e;
                util.h.xy.az.ma e2;
                org.json.JSONException e3;
                getOutputFormats = (getHighSpeedVideoSizesFor + 75) % 128;
                byte[] bArr3 = null;
                try {
                    try {
                        java.lang.String str2 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                        bArr2 = ((util.h.xy.au.re) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f876)).m25206();
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        bArr2 = null;
                    }
                } catch (org.json.JSONException e4) {
                    e = e4;
                    bArr = null;
                } catch (util.h.xy.az.ma e5) {
                    e = e5;
                    bArr = null;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    bArr = null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bArr = null;
                    util.h.xy.bh.mb.m25483(bArr3, bArr);
                    throw th;
                }
                try {
                    bArr = util.h.xy.bh.mb.m25469();
                    try {
                        try {
                            java.lang.String str3 = (java.lang.String) util.h.xy.au.a.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.au.a.this).get(str);
                            if (android.text.TextUtils.isEmpty(str3)) {
                                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_TNC_RESOURCE_ID;
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetBefore("", 0) + 50, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) android.graphics.Color.red(0), objArr7);
                                util.h.xy.au.mb mbVar = new util.h.xy.au.mb(mGErrorCode, ((java.lang.String) objArr7[0]).intern());
                                java.lang.String str4 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                                util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, mbVar);
                                util.h.xy.bh.mb.m25483(bArr2, bArr);
                                return;
                            }
                            util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(util.h.xy.au.a.Camera2StreamConfigurationMap(new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), str3));
                            java.lang.String str5 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                            new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                            java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25276);
                            if (util.h.xy.az.ra.m25277(m25142)) {
                                getOutputFormats = (getHighSpeedVideoSizesFor + 19) % 128;
                                java.util.List<util.h.xy.au.mg> m25156 = util.h.xy.au.g.m25127().m25156(m25276.m25280());
                                if (m25156.isEmpty()) {
                                    java.lang.String str6 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                                    try {
                                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(36 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.text.TextUtils.getOffsetAfter("", 0) + 50, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25254), objArr8);
                                        util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, ((java.lang.String) objArr8[0]).intern()));
                                        util.h.xy.bh.mb.m25483(bArr2, bArr);
                                        return;
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause = th5.getCause();
                                        if (cause == null) {
                                            throw th5;
                                        }
                                        throw cause;
                                    }
                                }
                                final util.h.xy.bb.md mdVar = new util.h.xy.bb.md();
                                try {
                                    mdVar.m25327(util.h.xy.au.a.getHighSpeedVideoSizes(m25156.get(0)).getBytes());
                                    mdVar.m25325(m25156.get(0).m25192());
                                    mdVar.m25326(m25156.get(0).m25196());
                                    mdVar.m25329(m25156.get(0).m25189());
                                    util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.9.5
                                        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                                        private static int getHighSpeedVideoFpsRangesFor = 0;
                                        private static int getInputFormats = 1;
                                        private static int getOutputMinFrameDuration;
                                        private static char[] getOutputFormats = {64401, 64413, 64404, 64430, 64425, 64400, 64424, 64414, 64435, 64427, 64409, 64403, 64402};
                                        private static int getHighSpeedVideoSizesFor = -1074856979;
                                        private static boolean getInputSizeshNQ4ISI = true;
                                        private static boolean Camera2StreamConfigurationMap = true;

                                        private static void getHighSpeedVideoFpsRangesFor(int i3, java.lang.String str7, java.lang.Object[] objArr9) {
                                            char[] cArr;
                                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
                                            byte[] bytes = str7.getBytes("ISO-8859-1");
                                            util.h.xz.b.md mdVar2 = new util.h.xz.b.md();
                                            char[] cArr2 = getOutputFormats;
                                            if (cArr2 != null) {
                                                int length = cArr2.length;
                                                char[] cArr3 = new char[length];
                                                for (int i4 = 0; i4 < length; i4++) {
                                                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
                                                    cArr3[i4] = (char) (cArr2[i4] ^ (-3299939579226817547L));
                                                }
                                                cArr2 = cArr3;
                                            }
                                            int i5 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
                                            if (!Camera2StreamConfigurationMap) {
                                                if (!getInputSizeshNQ4ISI) {
                                                    throw null;
                                                }
                                                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
                                                throw null;
                                            }
                                            int i6 = getHighSpeedVideoFpsRangesFor + 39;
                                            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                                            if (i6 % 2 == 0) {
                                                mdVar2.f2642 = bytes.length;
                                                cArr = new char[mdVar2.f2642];
                                                mdVar2.f2643 = 1;
                                            } else {
                                                mdVar2.f2642 = bytes.length;
                                                cArr = new char[mdVar2.f2642];
                                                mdVar2.f2643 = 0;
                                            }
                                            while (mdVar2.f2643 < mdVar2.f2642) {
                                                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
                                                cArr[mdVar2.f2643] = (char) (cArr2[bytes[(mdVar2.f2642 - 1) - mdVar2.f2643] + i3] - i5);
                                                mdVar2.f2643++;
                                            }
                                            objArr9[0] = new java.lang.String(cArr);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            getInputFormats = (getOutputMinFrameDuration + 1) % 128;
                                            java.lang.String str7 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0084\u0083\u0082\u0081", objArr9);
                                            java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u0088\u008d\u0089\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085", objArr10);
                                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr10[0]).intern());
                                            termsAndConditionsListener.onSuccess(str, mdVar);
                                            getOutputMinFrameDuration = (getInputFormats + 73) % 128;
                                        }
                                    });
                                } catch (java.lang.Exception e7) {
                                    util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INVALID_TNC_DATA_TYPE, e7.getMessage()));
                                    util.h.xy.bh.mb.m25483(bArr2, bArr);
                                    return;
                                }
                            } else {
                                util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, new util.h.xy.au.mb(m25142, util.h.xy.au.g.m25127().m25134(m25276)));
                                getHighSpeedVideoSizesFor = (getOutputFormats + 61) % 128;
                            }
                            java.lang.String str7 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                            util.h.xy.bh.mb.m25483(bArr2, bArr);
                            getOutputFormats = (getHighSpeedVideoSizesFor + 115) % 128;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            e = e;
                            bArr3 = bArr2;
                            util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e.getMessage()));
                            util.h.xy.bh.mb.m25483(bArr3, bArr);
                        }
                    } catch (org.json.JSONException e9) {
                        e3 = e9;
                        e = e3;
                        bArr3 = bArr2;
                        util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage()));
                        util.h.xy.bh.mb.m25483(bArr3, bArr);
                    } catch (util.h.xy.az.ma e10) {
                        e2 = e10;
                        e = e2;
                        bArr3 = bArr2;
                        util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, termsAndConditionsListener, util.h.xy.bh.mb.m25478(e));
                        util.h.xy.bh.mb.m25483(bArr3, bArr);
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                        byte[] bArr4 = bArr2;
                        th = th2;
                        bArr3 = bArr4;
                        util.h.xy.bh.mb.m25483(bArr3, bArr);
                        throw th;
                    }
                } catch (org.json.JSONException e11) {
                    bArr = null;
                    e3 = e11;
                } catch (util.h.xy.az.ma e12) {
                    bArr = null;
                    e2 = e12;
                } catch (java.lang.Exception e13) {
                    bArr = null;
                    e = e13;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bArr = null;
                    th2 = th;
                    byte[] bArr42 = bArr2;
                    th = th2;
                    bArr3 = bArr42;
                    util.h.xy.bh.mb.m25483(bArr3, bArr);
                    throw th;
                }
            }
        }).start();
        int i3 = getInputSizeshNQ4ISI + 49;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void digitizeCard(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession termsAndConditionSession, byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 3 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, -144198201, -652570140}, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, -144198201, -652570140}, android.view.KeyEvent.keyCodeFromString("") + 8, objArr4);
        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
        if (termsAndConditionSession == null) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1589658616, -1065297459, 942299309, 1961917910, 887868982, 451299719, 1156379462, 1888818450, 922817815, -701410643, 1025998467, 1538723185, -1410103734, 2118468075, 1238934068, -441353039}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32, objArr5);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
        }
        util.h.xy.bb.rd rdVar = (util.h.xy.bb.rd) termsAndConditionSession;
        try {
            if (rdVar.m25365() == null || rdVar.m25365().length == 0) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롒㮠뿇㌅뜣⭛꺁⋨꛰ᨉ鸻\u124e閂দ跜Ĕ蔢祑ﲏ炝\uf4db", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 33749, objArr6);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr6[0]).intern());
            }
            if (android.text.TextUtils.isEmpty(rdVar.m25364())) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롒綶㏫\ue933꽻撽\u1aed큮陗䮩Ǩ윟﵌늈棐⸛\ue45b", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 50627, objArr7);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr7[0]).intern());
            }
            getHighSpeedVideoFpsRanges(null, null, null, null, termsAndConditionSession, null, bArr, mGDigitizationListener);
            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public java.lang.String digitizeCard(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession termsAndConditionSession, byte[] bArr, byte[] bArr2, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 - android.graphics.Color.green(0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, -144198201, -652570140}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롘\uf457″峸裦쒞焵굃\ud912ᗠ䆷ﶛ⩳晲鈏컝竫뚃\ue35cἼ䯫蟓", 19501 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒烟⤆\ue24b骢叺ఘ앾ﶃ똗潜➨탡褿䉭窂㌉\uec59ꓥ巫ᘺ콨蟕뀓", 51383 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롋ｆ㘪淲ꓒ\udb93፵䨛脇㢜羮띿\uee41┖峦鎮쫋ɦ뤰\uf046㟒溭ꙡ\udd56ᐊ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18222, objArr5);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr5[0]).intern());
        }
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, str2, str3, str4, termsAndConditionSession, bArr, bArr2, mGDigitizationListener);
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
        return highSpeedVideoFpsRanges;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public boolean isCardActivationPending(java.lang.String str) {
        java.lang.String intern;
        int[] iArr;
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 77;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 >>> android.graphics.Color.argb(0, 1, 1, 1), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            iArr = new int[]{971395742, -1762164389, -1260703932, 1134585788, -63373088, -232848406};
            i = 14;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, android.graphics.Color.argb(0, 0, 0, 0) + 4, objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            iArr = new int[]{971395742, -1762164389, -1260703932, 1134585788, -63373088, -232848406};
            i = 9;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 83) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(iArr, i + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            return Camera2StreamConfigurationMap(str);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getPendingCardActivation(java.lang.String str) {
        java.lang.String intern;
        int[] iArr;
        int i;
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 119;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 3 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", 'T'), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            iArr = new int[]{971395742, -1762164389, 1539641715, -866583734, -1034804598, 801107190};
            i = 12;
            i2 = 1;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            iArr = new int[]{971395742, -1762164389, 1539641715, -866583734, -1034804598, 801107190};
            i = 10;
            i2 = 0;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 21) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(iArr, i - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(i2))).intValue() + 20) >> 6), objArr3);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
            return getHighSpeedVideoFpsRanges(str);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public java.lang.String getWalletId() {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롟뒑ꇒ鸍譂蟖\uf4f6\ue13d\ude6a쪠", 3272 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        try {
            java.lang.String m25474 = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485());
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 21) % 128;
            return m25474;
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
            e.getMessage();
            return null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void getProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.listener.ProductListener productListener) {
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롟讗\udfde⌛睚뫰軚툌", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 13249, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (android.text.TextUtils.isEmpty(str4)) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롫\uee02ᒢ묾\ue1c2\u086f뻭\ue4bfଧ뇸\ud856\u0ee3땱\udb1aƮ꠪\ude8bբ꯸퇊砢꺱학篲ꉪ", android.view.KeyEvent.getDeadChar(0, 0) + 22123, objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            getHighSpeedVideoSizes(str, str2, str3, str4, productListener);
            int i = getInputSizeshNQ4ISI + 115;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void getProductList(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.mobilegateway.listener.ProductListener productListener) {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getHighResolutionOutputSizeshNQ4ISI + 81;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 >> android.text.TextUtils.getOffsetBefore("", 0), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, 1539641715, -866583734, 294491485, -1553070791}, 126 >>> android.view.MotionEvent.axisFromString(""), objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-207481353, -988719761}, 4 - android.text.TextUtils.getOffsetBefore("", 0), objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{971395742, -1762164389, 1539641715, -866583734, 294491485, -1553070791}, android.view.MotionEvent.axisFromString("") + 10, objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        getHighSpeedVideoSizes(str, str2, str3, null, productListener);
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService
    public void getCardMetaData(final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener) {
        int[] iArr;
        int i;
        int i2 = getInputSizeshNQ4ISI;
        int i3 = i2 + 47;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            iArr = new int[]{-207481353, -988719761};
            i = 5;
        } else {
            iArr = new int[]{-207481353, -988719761};
            i = 4;
        }
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 31) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(iArr, i + (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롟₯覮犳\udbba䓨ⶊ隗羞\ud89e", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 39161, objArr2);
            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롿庹痪ఓ⍃㦍킵\uf7d5踢ꕊ뮑勫槻t❢㶟퓅\ueb0e舲饾뿧回洌І᭶ㆥ죵\uef06虖", android.graphics.Color.blue(0) + 59083, objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            if (cardMetaDataFetchListener == null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롗鍡\uee4e㥖ᐲ漪먌闬\ue0a3㯓ᛄ憤벑鞃\ue365㸦ॉ搽뽭訜\ue512ヸ\u0bd5", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.DC4, objArr4);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
            }
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.a.3
                private static int Camera2StreamConfigurationMap = 0;
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static int getInputFormats = 0;
                private static int getOutputMinFrameDurationlomOqCM = 1084265848;
                private static int getOutputSizes = 1;
                private static int getOutputSizeshNQ4ISI = 924953957;
                private static int getOutputStallDuration = -408873027;
                private static short[] isOutputSupportedForhNQ4ISI;
                private static byte[] getOutputMinFrameDuration = {33, 36, -47, -44, -111, 104, -46, -34, -45, 40, -54, -4, -1, 103, 45, -52, -39, -98, 108, -4, Byte.MIN_VALUE, 75, 85, 72, 101, 109, -111, 81, 77, 84, 83, 75, 97, 110, -70, 87, 84, 65, 98, -28, 77, 72, 117, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 101, Byte.MAX_VALUE, 117, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 97, com.google.common.base.Ascii.SUB, 75, 68, 99, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -79, Byte.MAX_VALUE, 70, 118, 45, -116, 105, 40, -66, 76, 98, 124, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -66, 76, 110, 103, com.google.common.base.Ascii.FF, -69, 65, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.GS, -23, -76, -66, -79, 78, 86, -6, -70, -74, -121, -78, -94, -94, 65, -29, -80, -67, -86, 75, com.visa.cbp.getEncExpo.onUnminimized, -114, -92, 94, -108, -114, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 89, -118, -125, -94, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -40, -40, -40, -40, -40};
                private static char[] getOutputFormats = {64359, 64326, 64401, 64338, 64336, 64323, 64349, 64381, 64333, 64351, 64332, 64327, 64391, 64348, 64344, 64325, 64322, 64370, 64379, 64354, 64358, 64383, 64324, 64350, 64380, 64395, 64356, 64329};
                private static int getInputSizeshNQ4ISI = -1074857039;
                private static boolean getOutputStallDurationlomOqCM = true;
                private static boolean getHighSpeedVideoSizesFor = true;

                /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
                
                    if (r3 != false) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
                
                    r3 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
                
                    r3 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
                
                    if (r3 != false) goto L24;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void getHighSpeedVideoFpsRanges(int i4, short s, byte b, int i5, int i6, java.lang.Object[] objArr5) {
                    boolean z;
                    int i7;
                    int i8;
                    boolean z2;
                    util.h.xz.b.me meVar = new util.h.xz.b.me();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int i9 = i5 + ((int) (getOutputStallDuration ^ (-2689713159175858216L)));
                    if (i9 == -1) {
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
                        z = true;
                    } else {
                        int i10 = Camera2StreamConfigurationMap + 83;
                        getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                        int i11 = i10 % 2;
                        z = false;
                    }
                    if (z) {
                        byte[] bArr = getOutputMinFrameDuration;
                        if (bArr != null) {
                            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 93) % 128;
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                bArr2[i12] = (byte) (bArr[i12] ^ (-2689713159175858216L));
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
                            i9 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
                        } else {
                            i9 = (short) (((short) (isOutputSupportedForhNQ4ISI[((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
                        }
                    }
                    if (i9 > 0) {
                        int i13 = Camera2StreamConfigurationMap + 49;
                        getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
                        if (i13 % 2 == 0) {
                            i7 = ((i4 >>> i9) >>> 4) << ((int) (getOutputMinFrameDurationlomOqCM * (-2689713159175858216L)));
                        } else {
                            i7 = ((i4 + i9) - 2) + ((int) (getOutputMinFrameDurationlomOqCM ^ (-2689713159175858216L)));
                        }
                        meVar.f2647 = i7 + i8;
                        meVar.f2644 = (char) (i6 + ((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        byte[] bArr3 = getOutputMinFrameDuration;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i14 = 0; i14 < length2; i14++) {
                                bArr4[i14] = (byte) (bArr3[i14] ^ (-2689713159175858216L));
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        meVar.f2645 = 1;
                        while (meVar.f2645 < i9) {
                            if (z2) {
                                byte[] bArr5 = getOutputMinFrameDuration;
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
                    objArr5[0] = sb.toString();
                }

                private static void getHighResolutionOutputSizeshNQ4ISI(int i4, java.lang.String str2, java.lang.Object[] objArr5) {
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    byte[] bytes = str2.getBytes("ISO-8859-1");
                    util.h.xz.b.md mdVar = new util.h.xz.b.md();
                    char[] cArr = getOutputFormats;
                    if (cArr != null) {
                        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i5 = 0;
                        while (i5 < length) {
                            int i6 = Camera2StreamConfigurationMap + 51;
                            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                            if (i6 % 2 == 0) {
                                cArr2[i5] = (char) (cArr[i5] ^ (-3299939579226817547L));
                            } else {
                                cArr2[i5] = (char) (cArr[i5] ^ (-3299939579226817547L));
                                i5++;
                            }
                        }
                        cArr = cArr2;
                    }
                    int i7 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
                    if (!getHighSpeedVideoSizesFor) {
                        if (!getOutputStallDurationlomOqCM) {
                            throw null;
                        }
                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 79) % 128;
                        throw null;
                    }
                    mdVar.f2642 = bytes.length;
                    char[] cArr3 = new char[mdVar.f2642];
                    mdVar.f2643 = 0;
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 31) % 128;
                    while (mdVar.f2643 < mdVar.f2642) {
                        cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i4] - i7);
                        mdVar.f2643++;
                    }
                    objArr5[0] = new java.lang.String(cArr3);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    org.json.JSONObject jSONObject;
                    try {
                        byte[] m25217 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25217(str, true);
                        java.lang.String str2 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                        if (m25217 == null) {
                            util.h.xy.au.a aVar = util.h.xy.au.a.this;
                            com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener2 = cardMetaDataFetchListener;
                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_CARD_DATA;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(1493073247 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (short) ((-3) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 80, 796870034 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr5);
                            util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar, cardMetaDataFetchListener2, mGErrorCode, ((java.lang.String) objArr5[0]).intern());
                            return;
                        }
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(new java.lang.String(m25217, java.nio.charset.StandardCharsets.UTF_8));
                            java.lang.String str3 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                            getOutputSizes = (getInputFormats + 49) % 128;
                            try {
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0091\u0090\u008f\u0085\u0089\u008e\u0088\u0087\u0086\u0085\u0084", objArr6);
                                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(((java.lang.String) objArr6[0]).intern());
                                int i4 = getInputFormats + 29;
                                getOutputSizes = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i5 = 3 / 2;
                                }
                                if (jSONObject3 == null) {
                                    util.h.xy.au.a aVar2 = util.h.xy.au.a.this;
                                    com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener3 = cardMetaDataFetchListener;
                                    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_CARD_DATA;
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u008d\u0087\u008c\u008b\u0082\u008a\u0083\u0085\u0089\u0085\u0088\u0083\u0091\u0090\u008f\u0085\u0089\u008e\u0088\u0083\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                                    util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar2, cardMetaDataFetchListener3, mGErrorCode2, ((java.lang.String) objArr7[0]).intern());
                                    return;
                                }
                                try {
                                    java.lang.String str4 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(1493073291 + (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (86 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.widget.ExpandableListView.getPackedPositionChild(0L) - 88, 796870054 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
                                    org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject(((java.lang.String) objArr8[0]).intern());
                                    if (jSONObject4 == null) {
                                        util.h.xy.au.a aVar3 = util.h.xy.au.a.this;
                                        com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener4 = cardMetaDataFetchListener;
                                        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode3 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_CARD_META_DATA;
                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u008d\u0087\u008c\u008b\u0082\u008a\u0083\u0085\u0089\u0085\u0088\u0083\u0085\u0089\u008e\u009b\u0083\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr9);
                                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar3, cardMetaDataFetchListener4, mGErrorCode3, ((java.lang.String) objArr9[0]).intern());
                                        return;
                                    }
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0085\u0089\u0085\u0087\u0085\u0089\u008e\u009b\u0087\u0086\u0085\u0092\u009c\u008b\u0085", objArr10);
                                    if (jSONObject3.has(((java.lang.String) objArr10[0]).intern())) {
                                        try {
                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0085\u0089\u0085\u0087\u0085\u0089\u008e\u009b\u0087\u0086\u0085\u0092\u009c\u008b\u0085", objArr11);
                                            jSONObject = jSONObject3.getJSONObject(((java.lang.String) objArr11[0]).intern());
                                            getOutputSizes = (getInputFormats + 39) % 128;
                                        } catch (org.json.JSONException e) {
                                            util.h.xy.au.a aVar4 = util.h.xy.au.a.this;
                                            com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener5 = cardMetaDataFetchListener;
                                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode4 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_META_DATA_JSON_ERROR;
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0, 0) + 127, "\u009a\u0086\u0082\u0086\u0086\u008e\u0083\u008c\u0082\u008f\u0089\u0085\u0097\u0086\u0082\u008a\u0083\u0081\u0095\u0094\u0093\u0083\u0085\u0089\u0085\u0088\u0085\u0089\u008e\u009b\u0087\u0086\u0085\u0092\u009c\u008b\u0085", objArr12);
                                            sb.append(((java.lang.String) objArr12[0]).intern());
                                            sb.append(e.getMessage());
                                            util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar4, cardMetaDataFetchListener5, mGErrorCode4, sb.toString());
                                            return;
                                        }
                                    } else {
                                        jSONObject = null;
                                    }
                                    try {
                                        final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData m25140 = util.h.xy.au.g.m25127().m25140(jSONObject4, jSONObject);
                                        if (m25140 != null) {
                                            util.h.xy.bh.ra.m25484().m25487(new java.lang.Runnable() { // from class: util.h.xy.au.a.3.5
                                                private static int Camera2StreamConfigurationMap = 0;
                                                private static long getHighSpeedVideoFpsRanges = 6006783383116036152L;
                                                private static int getHighSpeedVideoFpsRangesFor = 1;
                                                private static int getInputFormats = 1;
                                                private static int getInputSizeshNQ4ISI;

                                                private static void getHighSpeedVideoFpsRangesFor(java.lang.String str5, int i6, java.lang.Object[] objArr13) {
                                                    int i7;
                                                    int i8 = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                                                    Camera2StreamConfigurationMap = i8;
                                                    getHighSpeedVideoFpsRangesFor = (i8 + 73) % 128;
                                                    char[] charArray = str5.toCharArray();
                                                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                                                    dVar.f2628 = i6;
                                                    int length = charArray.length;
                                                    long[] jArr = new long[length];
                                                    dVar.f2629 = 0;
                                                    while (dVar.f2629 < charArray.length) {
                                                        int i9 = getHighSpeedVideoFpsRangesFor + 13;
                                                        Camera2StreamConfigurationMap = i9 % 128;
                                                        if (i9 % 2 != 0) {
                                                            jArr[dVar.f2629] = (charArray[dVar.f2629] + (dVar.f2629 & dVar.f2628)) / ((-7508379876853140581L) & getHighSpeedVideoFpsRanges);
                                                            i7 = dVar.f2629 % 1;
                                                        } else {
                                                            jArr[dVar.f2629] = ((-7508379876853140581L) ^ getHighSpeedVideoFpsRanges) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                                                            i7 = dVar.f2629 + 1;
                                                        }
                                                        dVar.f2629 = i7;
                                                    }
                                                    char[] cArr = new char[length];
                                                    dVar.f2629 = 0;
                                                    while (dVar.f2629 < charArray.length) {
                                                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                                                        cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                                                        dVar.f2629++;
                                                    }
                                                    objArr13[0] = new java.lang.String(cArr);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    getInputSizeshNQ4ISI = (getInputFormats + 67) % 128;
                                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor("误ﮤ歄\udae5", 28759 - android.text.TextUtils.indexOf("", ""), objArr13);
                                                    java.lang.String intern2 = ((java.lang.String) objArr13[0]).intern();
                                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor("诧嘉〮ቓﱬ\ude0e뢊骿擟䚒⃪̝", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56808, objArr14);
                                                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr14[0]).intern());
                                                    cardMetaDataFetchListener.onSuccess(m25140);
                                                    getInputSizeshNQ4ISI = (getInputFormats + 23) % 128;
                                                }
                                            });
                                            return;
                                        }
                                        util.h.xy.au.a aVar5 = util.h.xy.au.a.this;
                                        com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener6 = cardMetaDataFetchListener;
                                        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode5 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_CARD_META_DATA;
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(android.view.View.resolveSizeAndState(0, 0, 0) + 1493073302, (short) (89 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (-78) - android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 796870022, objArr13);
                                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar5, cardMetaDataFetchListener6, mGErrorCode5, ((java.lang.String) objArr13[0]).intern());
                                    } catch (org.json.JSONException e2) {
                                        util.h.xy.au.a aVar6 = util.h.xy.au.a.this;
                                        com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener7 = cardMetaDataFetchListener;
                                        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode6 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_META_DATA_JSON_ERROR;
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(1493073324 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) ((-106) - android.view.MotionEvent.axisFromString("")), (byte) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-69) - android.text.TextUtils.indexOf("", "", 0), 796870054 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr14);
                                        sb2.append(((java.lang.String) objArr14[0]).intern());
                                        sb2.append(e2.getMessage());
                                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar6, cardMetaDataFetchListener7, mGErrorCode6, sb2.toString());
                                    }
                                } catch (org.json.JSONException e3) {
                                    util.h.xy.au.a aVar7 = util.h.xy.au.a.this;
                                    com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener8 = cardMetaDataFetchListener;
                                    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode7 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_META_DATA_JSON_ERROR;
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(127 - android.view.View.getDefaultSize(0, 0), "\u009a\u0086\u0082\u0086\u0086\u008e\u0083\u008c\u0082\u008f\u0089\u0085\u0097\u0086\u0082\u008a\u0083\u0081\u0095\u0094\u0093\u0083\u0085\u0089\u0085\u0088\u0085\u0089\u008e\u009b\u0087\u0086\u0085\u0084", objArr15);
                                    sb3.append(((java.lang.String) objArr15[0]).intern());
                                    sb3.append(e3.getMessage());
                                    util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar7, cardMetaDataFetchListener8, mGErrorCode7, sb3.toString());
                                }
                            } catch (org.json.JSONException e4) {
                                util.h.xy.au.a aVar8 = util.h.xy.au.a.this;
                                com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener9 = cardMetaDataFetchListener;
                                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode8 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_META_DATA_JSON_ERROR;
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u009a\u0086\u0082\u0086\u0086\u0099\u0083\u0098\u008c\u008f\u0097\u0086\u0082\u0096\u0083\u0081\u0095\u0094\u0093\u0083\u0091\u0090\u008f\u0085\u0089\u008e\u0088\u0083\u0087\u0086\u0085\u0092", objArr16);
                                sb4.append(((java.lang.String) objArr16[0]).intern());
                                sb4.append(e4.getMessage());
                                util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar8, cardMetaDataFetchListener9, mGErrorCode8, sb4.toString());
                            }
                        } catch (org.json.JSONException e5) {
                            util.h.xy.au.a aVar9 = util.h.xy.au.a.this;
                            com.gemalto.mfs.mwsdk.mobilegateway.listener.CardMetaDataFetchListener cardMetaDataFetchListener10 = cardMetaDataFetchListener;
                            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode9 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CARD_META_DATA_JSON_ERROR;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(1493073268 - android.text.TextUtils.getOffsetBefore("", 0), (short) (android.view.KeyEvent.normalizeMetaState(0) + 112), (byte) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 77, android.text.TextUtils.indexOf("", "", 0, 0) + 796870037, objArr17);
                            sb5.append(((java.lang.String) objArr17[0]).intern());
                            sb5.append(e5.getMessage());
                            util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(aVar9, cardMetaDataFetchListener10, mGErrorCode9, sb5.toString());
                        }
                    } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e6) {
                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardMetaDataFetchListener, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e6.getMessage());
                    }
                }
            }).start();
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 43;
            getInputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void getHighSpeedVideoSizes(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final com.gemalto.mfs.mwsdk.mobilegateway.listener.ProductListener productListener) {
        if (android.text.TextUtils.isEmpty(str)) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롲殡Ὼ쌵\uf75a骄令爀♳쩩ﶠꇖ唙祁ⲑ탼蓩ꠧ尙ྕ㏂\ue716謩뽭", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 54217, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1254674954, 1173475119, -800389378, 1786242319, -188015181, 292941943, -253712000, 2146206881, -525294301, 1245040183, 1752343712, 892561907}, 24 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{1646141275, -415559066, -1074004869, 984425453, -188015181, 292941943, -253712000, 2146206881, -525294301, 1245040183, 1752343712, 892561907}, 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (productListener == null) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롫霨\ue6f6㖼ժ吽ꏩ\uf290쉺ᄡ惥뾵轹\ude33ⷧ糴䱨鬫\ueae7㦦ॠ堺랭蚮홦╢瓯䎵鍫\ue22a", 12096 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.a.7
            private static int getInputSizeshNQ4ISI = 1;
            private static int getOutputFormats = 0;
            private static long getOutputMinFrameDuration = -8567632728849724748L;

            /*  JADX ERROR: Types fix failed
                java.lang.NullPointerException
                */
            /* JADX WARN: Failed to calculate best type for var: r0v27 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v0 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v1 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v10 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v11 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v12 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v13 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v14 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v15 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v16 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v2 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v3 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v6 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v7 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v8 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Failed to calculate best type for var: r4v9 ??
            java.lang.NullPointerException
             */
            /* JADX WARN: Not initialized variable reg: 4, insn: 0x0210: MOVE (r16 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:85:0x0210 */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: util.h.xy.au.a.AnonymousClass7.run():void");
            }
        }).start();
    }

    private static util.h.xy.az.b getHighSpeedVideoFpsRanges(byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.String obj;
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 15) % 128;
        if (android.text.TextUtils.isEmpty(str4)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26171, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", 48311 - android.text.TextUtils.getCapsMode("", 0, 0), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str3);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, android.graphics.Color.blue(0) + 7, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str2);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롸뽬뙀괥ꐌ鯅鋍覫肄\uf865ｏ\uf627\ued03\ue4e1\udbdd튳", 1822 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            obj = sb.toString();
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", 26171 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(1);
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(1);
            sb2.append(util.h.xy.al.ra.f320);
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 48311, objArr6);
                sb2.append(((java.lang.String) objArr6[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(str3);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{193789867, -2063319409}, android.view.Gravity.getAbsoluteGravity(0, 0) + 3, objArr7);
                sb2.append(((java.lang.String) objArr7[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(str4);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, android.view.View.resolveSizeAndState(0, 0, 0) + 7, objArr8);
                sb2.append(((java.lang.String) objArr8[0]).intern());
                sb2.append(util.h.xy.al.ra.f320);
                sb2.append(str2);
                sb2.append(util.h.xy.al.ra.f320);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("롸뽬뙀괥ꐌ鯅鋍覫肄\uf865ｏ\uf627\ued03\ue4e1\udbdd튳", 1824 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr9);
                sb2.append(((java.lang.String) objArr9[0]).intern());
                obj = sb2.toString();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        util.h.xy.az.b bVar = new util.h.xy.az.b(obj, util.h.xy.az.b.EnumC0259b.f912);
        bVar.m25258(util.h.xy.au.g.m25127().m25145(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), eligibilityData, instrumentData));
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 103) % 128;
        return bVar;
    }

    private static util.h.xy.az.b getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26172, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        sb.append(1);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48311, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str2);
        sb.append(util.h.xy.al.ra.f320);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롩\ueeabᗂ밋\ue33aੀ낆\ue7adເ", 22229 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(util.h.xy.al.ra.f320);
        sb.append(str3);
        util.h.xy.az.b bVar = new util.h.xy.az.b(sb.toString(), util.h.xy.az.b.EnumC0259b.f913);
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private static util.h.xy.az.b getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, byte[] bArr, byte[] bArr2, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) throws util.h.xy.az.ma, org.json.JSONException {
        java.lang.String obj;
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 61) % 128;
        if (android.text.TextUtils.isEmpty(str11)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str8);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 26172, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            sb.append(1);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", 48311 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str9);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, android.graphics.Color.blue(0) + 7, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(util.h.xy.al.ra.f320);
            sb.append(str10);
            sb.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1276718584, -2007049344, -1755799814, -1750977051, 2146500693, -1896747059, 1357359960, -1080221357}, 13 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            obj = sb.toString();
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str8);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬\ude41琁諆ₒ䝈\udd18珶親", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26171, objArr5);
            sb2.append(((java.lang.String) objArr5[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(1);
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(1);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롬Ӎ섙蹒䪢\u17fc푼酪巑ᨛ\ue74bꎯ惫ⴵ\uea6b뛑", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 48310, objArr6);
            sb2.append(((java.lang.String) objArr6[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str9);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{193789867, -2063319409}, 3 - android.view.View.resolveSize(0, 0), objArr7);
            sb2.append(((java.lang.String) objArr7[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str11);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1917649303, 1192255368, 670673023, 898331672}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 7, objArr8);
            sb2.append(((java.lang.String) objArr8[0]).intern());
            sb2.append(util.h.xy.al.ra.f320);
            sb2.append(str10);
            sb2.append(util.h.xy.al.ra.f320);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1276718584, -2007049344, -1755799814, -1750977051, 2146500693, -1896747059, 1357359960, -1080221357}, '=' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9);
            sb2.append(((java.lang.String) objArr9[0]).intern());
            obj = sb2.toString();
        }
        util.h.xy.az.b bVar = new util.h.xy.az.b(obj, util.h.xy.az.b.EnumC0259b.f912);
        bVar.m25258(util.h.xy.au.g.m25127().m25146(str, str2, str3, str4, str5, str6, bArr, bArr2, str7));
        int i = getHighResolutionOutputSizeshNQ4ISI + 107;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoFpsRanges(final byte[] bArr, final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, final java.lang.String str, final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData, util.h.xy.au.a.mb mbVar, final com.gemalto.mfs.mwsdk.mobilegateway.listener.CardEligibilityListener cardEligibilityListener, final java.lang.String str2) {
        if (bArr == null || bArr.length == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒胚쥓ᇷ婫ꊙ\ueb05㏒簠䕝跟홺ẏ朑꾇\ue83cイ", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 14479, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (inputMethod == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒揸༗⭝훣\uf233鹑릀攺ŀⲉ젡\uf453鿲묠杽ʟ⸮쩾\uf588", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 56237, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{-1754055071, -334918119, 398023256, 891907829, -1814107730, -1524982202, 1827879530, -1686262885}, android.graphics.Color.green(0) + 16, objArr3);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
        }
        if (cardEligibilityListener != null) {
            if (util.h.xy.au.a.mb.getHighSpeedVideoFpsRanges == mbVar) {
                if (walletAccountData == null) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f883);
                }
                if (walletAccountData.getAccountId() == null || walletAccountData.getAccountId().length() == 0) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f900);
                }
            }
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.a.15
                private static int getHighSpeedVideoSizesFor = 1;
                private static int getOutputMinFrameDuration;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0227 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0228  */
                /* JADX WARN: Type inference failed for: r0v64, types: [byte[][]] */
                /* JADX WARN: Type inference failed for: r2v10, types: [byte[]] */
                /* JADX WARN: Type inference failed for: r2v11, types: [byte[]] */
                /* JADX WARN: Type inference failed for: r2v19, types: [byte[]] */
                /* JADX WARN: Type inference failed for: r2v3, types: [int] */
                /* JADX WARN: Type inference failed for: r2v4 */
                /* JADX WARN: Type inference failed for: r2v5 */
                /* JADX WARN: Type inference failed for: r2v6 */
                /* JADX WARN: Type inference failed for: r2v8 */
                /* JADX WARN: Type inference failed for: r2v9, types: [byte[]] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    byte[] bArr2;
                    byte[] bArr3;
                    int i;
                    java.lang.String str3;
                    util.h.xy.az.b highSpeedVideoSizes;
                    int m25293;
                    int i2 = getHighSpeedVideoSizesFor;
                    int i3 = ((i2 | 45) << 1) - (i2 ^ 45);
                    getOutputMinFrameDuration = i3 % 128;
                    ?? r2 = i3 % 2;
                    byte[] bArr4 = null;
                    try {
                        try {
                        } catch (java.lang.Throwable th) {
                            th = th;
                        }
                    } catch (org.json.JSONException e) {
                        e = e;
                        r2 = 0;
                        bArr3 = null;
                    } catch (util.h.xy.az.ma e2) {
                        e = e2;
                        r2 = 0;
                        bArr3 = null;
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        r2 = 0;
                        bArr3 = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr2 = null;
                        util.h.xy.bh.mb.m25483(bArr4, bArr2);
                        throw th;
                    }
                    if (r2 != 0) {
                        util.h.xy.bh.ra.m25484().m25485();
                        throw new java.lang.ArithmeticException();
                    }
                    android.content.Context m25485 = util.h.xy.bh.ra.m25484().m25485();
                    if (m25485 == null) {
                        java.lang.String str4 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                        java.lang.String str5 = util.h.xy.ay.ma.f906;
                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CONTEXT_MISSING_ERROR, util.h.xy.ay.ma.f906));
                        util.h.xy.bh.mb.m25483(null, null);
                        int i4 = getOutputMinFrameDuration;
                        getHighSpeedVideoSizesFor = ((i4 ^ 1) + ((i4 & 1) << 1)) % 128;
                        return;
                    }
                    if (!util.h.xy.av.ra.m25233(m25485)) {
                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.BLOCKED_SECURE_WALLET_ENROLLMENT_REQUIRED, util.h.xy.ay.ma.f905));
                        util.h.xy.bh.mb.m25483(null, null);
                        return;
                    }
                    util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this, util.h.xy.bh.mb.m25476());
                    java.lang.String str6 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                    util.h.xy.au.mf m25169 = util.h.xy.au.mf.m25169();
                    java.lang.String str7 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                    util.h.xy.au.re reVar = (util.h.xy.au.re) m25169.m25176(util.h.xy.au.mf.f876);
                    java.lang.String str8 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                    r2 = reVar.m25206();
                    try {
                        byte[] bytes = util.h.xy.bh.mb.m25474(util.h.xy.bh.ra.m25484().m25485()).getBytes();
                        bArr3 = util.h.xy.bh.mb.m25469();
                        try {
                            if (util.h.xy.bh.mb.m25479() == null) {
                                str3 = "";
                            } else {
                                str3 = new java.lang.String(util.h.xy.bh.mb.m25479(), java.nio.charset.StandardCharsets.UTF_8);
                                int i5 = getHighSpeedVideoSizesFor;
                                getOutputMinFrameDuration = (((i5 | 17) << 1) - (i5 ^ 17)) % 128;
                            }
                            java.lang.String str9 = str3;
                            java.lang.String str10 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                            highSpeedVideoSizes = util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.getHighSpeedVideoSizes(util.h.xy.au.a.this), bArr, inputMethod, str, new java.lang.String((byte[]) r2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), str9, walletAccountData, str2);
                            m25293 = util.h.xy.ba.ma.m25292().m25293();
                        } catch (org.json.JSONException e4) {
                            e = e4;
                            util.h.xy.au.a.Camera2StreamConfigurationMap(util.h.xy.au.a.this, cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.SERVER_RESPONSE_JSON_ERROR, e.getMessage()));
                            util.h.xy.bh.mb.m25483(r2, bArr3);
                            int i6 = getHighSpeedVideoSizesFor;
                            i = (i6 ^ 55) + ((i6 & 55) << 1);
                            getOutputMinFrameDuration = i % 128;
                            if (i % 2 == 0) {
                            }
                        } catch (util.h.xy.az.ma e5) {
                            e = e5;
                            util.h.xy.au.a.Camera2StreamConfigurationMap(util.h.xy.au.a.this, cardEligibilityListener, util.h.xy.bh.mb.m25478(e));
                            util.h.xy.bh.mb.m25483(r2, bArr3);
                            int i62 = getHighSpeedVideoSizesFor;
                            i = (i62 ^ 55) + ((i62 & 55) << 1);
                            getOutputMinFrameDuration = i % 128;
                            if (i % 2 == 0) {
                            }
                        } catch (java.lang.Exception e6) {
                            e = e6;
                            util.h.xy.au.a.Camera2StreamConfigurationMap(util.h.xy.au.a.this, cardEligibilityListener, new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, e.getMessage()));
                            util.h.xy.bh.mb.m25483(r2, bArr3);
                            int i622 = getHighSpeedVideoSizesFor;
                            i = (i622 ^ 55) + ((i622 & 55) << 1);
                            getOutputMinFrameDuration = i % 128;
                            if (i % 2 == 0) {
                            }
                        }
                    } catch (org.json.JSONException e7) {
                        e = e7;
                        bArr3 = null;
                    } catch (util.h.xy.az.ma e8) {
                        e = e8;
                        bArr3 = null;
                    } catch (java.lang.Exception e9) {
                        e = e9;
                        bArr3 = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        bArr2 = null;
                        bArr4 = r2;
                        util.h.xy.bh.mb.m25483(bArr4, bArr2);
                        throw th;
                    }
                    if (m25293 != -91) {
                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardEligibilityListener, m25293);
                        util.h.xy.bh.mb.m25483(r2, bArr3);
                        return;
                    }
                    if (util.h.xy.au.a.getHighSpeedVideoFpsRanges()) {
                        int i7 = getOutputMinFrameDuration + 23;
                        getHighSpeedVideoSizesFor = i7 % 128;
                        if (i7 % 2 != 0) {
                            util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardEligibilityListener, 803);
                            util.h.xy.bh.mb.m25483(r2, bArr3);
                            return;
                        }
                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardEligibilityListener, 18534);
                        ?? r0 = new byte[5][];
                        r0[0] = r2;
                        r0[1] = bArr3;
                        util.h.xy.bh.mb.m25483((byte[][]) r0);
                        return;
                    }
                    util.h.xy.az.ra m25276 = util.h.xy.az.mb.m25275().m25276(highSpeedVideoSizes);
                    java.lang.String str11 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                    new java.lang.String(m25276.m25280(), java.nio.charset.StandardCharsets.UTF_8);
                    java.lang.String m25142 = util.h.xy.au.g.m25127().m25142(m25276);
                    if (util.h.xy.az.ra.m25277(m25142)) {
                        int i8 = getHighSpeedVideoSizesFor;
                        getOutputMinFrameDuration = ((i8 ^ 51) + ((i8 & 51) << 1)) % 128;
                        java.lang.String str12 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                        util.h.xy.au.a.getHighSpeedVideoFpsRanges(util.h.xy.au.a.this, m25276, cardEligibilityListener);
                        int i9 = getOutputMinFrameDuration;
                        getHighSpeedVideoSizesFor = ((i9 ^ 33) + ((i9 & 33) << 1)) % 128;
                    } else {
                        util.h.xy.au.a.getHighSpeedVideoFpsRangesFor(util.h.xy.au.a.this, cardEligibilityListener, new util.h.xy.au.mb(m25142, util.h.xy.au.g.m25127().m25134(m25276)));
                    }
                    java.lang.String str13 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                    util.h.xy.bh.mb.m25483(r2, bArr3);
                    int i6222 = getHighSpeedVideoSizesFor;
                    i = (i6222 ^ 55) + ((i6222 & 55) << 1);
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            }).start();
            return;
        }
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒議\ude07ℵ瓃䟫誁\ude38ⅰ琗䜻諈\udd87₿瑑䝹訌\udd27\u20c3班䚳詛\udd61‑獃䛊覐\udcaf⁃獯䘃褥\udce9", 13093 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static boolean getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getInputSizeshNQ4ISI = (i + 97) % 128;
        getInputSizeshNQ4ISI = (i + 59) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0002\u0005￤ￎ\u0013\u000fￎ\u0004\t\u000f\u0012\u0004\u000e\u0001\u0007\u0015", android.graphics.Color.green(0) + 16, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, 174 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("￼\uffff\uffde\r\u0003\ufffe\uffff\u000e�\uffff\b\b\t\uffdd\f\uffff\u0001\u0001\u000f", 19 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, objArr2);
            if (((java.lang.Boolean) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).booleanValue()) {
                return true;
            }
            int i2 = getInputSizeshNQ4ISI + 1;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 5;
            }
            return false;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private java.lang.String getHighSpeedVideoFpsRanges(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession termsAndConditionSession, final byte[] bArr, final byte[] bArr2, final com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        byte[] m25476;
        final java.lang.String m25364;
        byte[] bArr3;
        if (mGDigitizationListener == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("롒阚\ue4b3㌷ǋ偙껥ﴲ쬧ᦕ株䚷镛\ue3d1㉳û废괭﮺쩈ᢗ睌䗸鎑\ue207ォ༳巋걍", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11887, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (termsAndConditionSession == null) {
            bArr3 = util.h.xy.bh.mb.m25476();
            new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 25) % 128;
            m25364 = null;
        } else {
            util.h.xy.bb.rd rdVar = (util.h.xy.bb.rd) termsAndConditionSession;
            if (rdVar.m25365() == null || rdVar.m25365().length == 0) {
                m25476 = util.h.xy.bh.mb.m25476();
                new java.lang.String(m25476, java.nio.charset.StandardCharsets.UTF_8);
            } else {
                m25476 = rdVar.m25365();
                new java.lang.String(m25476, java.nio.charset.StandardCharsets.UTF_8);
            }
            m25364 = rdVar.m25364();
            bArr3 = m25476;
        }
        final java.lang.String str5 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        if (bArr3 != null) {
            java.util.Arrays.fill(bArr3, (byte) 0);
        }
        new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.au.a.10
            private static int getOutputMinFrameDurationlomOqCM = 0;
            private static int getOutputSizes = 1;
            private static int getOutputStallDurationlomOqCM = 1;
            private static int unwrapAs;
            private static char[] getOutputStallDuration = {42054, 42053, 42063, 42110, 42342, 42286, 42288, 42289, 42293, 42242, 42245, 42477, 42472, 42488, 42489, 42471, 42469, 42471, 42475, 42474, 42470, 42471, 42474, 42483, 42351, 42299, 42293, 42293, 42291, 42295, 42299, 42250, 42255, 42292, 42294, 42251, 42251, 42363, 42244, 42289, 42295, 42303, 42303, 42295, 42295, 42300, 42294, 42283, 42240, 42255, 42292, 42294, 42314, 42252, 42286, 42287, 42288, 42298, 42270, 42271, 42297, 42289, 42287, 42295, 42297, 42302, 42303, 42269, 42271, 42302, 42268, 42263, 42286, 42281, 42284, 42267, 42260, 42285, 42291, 42289, 42291, 42291, 42299, 42292, 42291, 42292, 42268, 42271, 42292, 42298, 42269, 42260, 42285, 42290, 42294, 42241, 42343, 42352, 42245, 42286, 42288, 42292, 42270, 42271, 42299, 42295, 42299, 42294, 42287, 42246};
            private static long getOutputSizeshNQ4ISI = 5385085585384252437L;

            private static void getHighSpeedVideoFpsRangesFor(java.lang.String str6, int i, java.lang.Object[] objArr2) {
                getOutputMinFrameDurationlomOqCM = (getOutputStallDurationlomOqCM + 103) % 128;
                char[] charArray = str6.toCharArray();
                util.h.xz.b.a aVar = new util.h.xz.b.a();
                char[] m27721 = util.h.xz.b.a.m27721(getOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
                aVar.f2623 = 4;
                while (aVar.f2623 < m27721.length) {
                    getOutputMinFrameDurationlomOqCM = (getOutputStallDurationlomOqCM + 105) % 128;
                    aVar.f2624 = aVar.f2623 - 4;
                    m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputSizeshNQ4ISI ^ 7817488252581312552L)));
                    aVar.f2623++;
                }
                objArr2[0] = new java.lang.String(m27721, 4, m27721.length - 4);
            }

            private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str6, java.lang.Object[] objArr2) {
                int i;
                java.lang.String str7 = str6;
                byte[] bArr4 = str7;
                if (str7 != null) {
                    int i2 = getOutputMinFrameDurationlomOqCM + 95;
                    getOutputStallDurationlomOqCM = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    bArr4 = str7.getBytes("ISO-8859-1");
                }
                byte[] bArr5 = bArr4;
                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr = getOutputStallDuration;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        cArr2[i7] = (char) (cArr[i7] ^ (-8125198844289309347L));
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i4];
                java.lang.System.arraycopy(cArr, i3, cArr3, 0, i4);
                if (bArr5 != null) {
                    char[] cArr4 = new char[i4];
                    maVar.f2631 = 0;
                    char c = 0;
                    while (maVar.f2631 < i4) {
                        if (bArr5[maVar.f2631] == 1) {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        } else {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                        }
                        c = cArr4[maVar.f2631];
                        maVar.f2631++;
                        getOutputStallDurationlomOqCM = (getOutputMinFrameDurationlomOqCM + 51) % 128;
                    }
                    cArr3 = cArr4;
                }
                if (i6 > 0) {
                    char[] cArr5 = new char[i4];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    int i8 = i4 - i6;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i6);
                    java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i8);
                    getOutputMinFrameDurationlomOqCM = (getOutputStallDurationlomOqCM + 43) % 128;
                }
                if (z) {
                    getOutputStallDurationlomOqCM = (getOutputMinFrameDurationlomOqCM + 99) % 128;
                    char[] cArr6 = new char[i4];
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i4) {
                        int i9 = getOutputMinFrameDurationlomOqCM + 97;
                        getOutputStallDurationlomOqCM = i9 % 128;
                        if (i9 % 2 == 0) {
                            cArr6[maVar.f2631] = cArr3[i4 / maVar.f2631];
                            i = maVar.f2631 >>> 1;
                        } else {
                            cArr6[maVar.f2631] = cArr3[(i4 - maVar.f2631) - 1];
                            i = maVar.f2631 + 1;
                        }
                        maVar.f2631 = i;
                    }
                    cArr3 = cArr6;
                }
                if (i5 > 0) {
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i4) {
                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                        maVar.f2631++;
                    }
                }
                objArr2[0] = new java.lang.String(cArr3);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1581
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: util.h.xy.au.a.AnonymousClass10.run():void");
            }
        }).start();
        int i = getInputSizeshNQ4ISI + 53;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return str5;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String substring;
        int i = getInputSizeshNQ4ISI + 59;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        java.lang.String str2 = "";
        try {
            if (i % 2 == 0) {
                java.lang.String m25471 = util.h.xy.bh.mb.m25471(util.h.xy.fa.mb.m26807(str), "");
                substring = m25471.substring(2, 3 >>> java.lang.Integer.parseInt(java.lang.Character.toString(m25471.charAt(0)), 37));
            } else {
                java.lang.String m254712 = util.h.xy.bh.mb.m25471(util.h.xy.fa.mb.m26807(str), "");
                substring = m254712.substring(2, java.lang.Integer.parseInt(java.lang.Character.toString(m254712.charAt(1)), 16) + 2);
            }
            int i2 = getInputSizeshNQ4ISI + 27;
            str2 = i2 % 128;
            getHighResolutionOutputSizeshNQ4ISI = str2;
            if (i2 % 2 != 0) {
                return substring;
            }
            throw null;
        } catch (java.lang.NumberFormatException e) {
            e.getMessage();
            return str2;
        }
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 27;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{-1959597566, -2077560724, 1906086728, 138543444, -33948917, -1669662277, -1337882137, -1274074251, 2007201360, -260057036, -1287639595, 1269888090, 1374438417, -1978156162, 291399706, 117832935}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            try {
                boolean m25132 = util.h.xy.au.g.m25127().m25132(util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25226(), str);
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 27;
                getInputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return m25132;
                }
                throw null;
            } catch (java.lang.Exception e) {
                e.getMessage();
                return false;
            }
        }
        android.text.TextUtils.isEmpty(str);
        throw new java.lang.ArithmeticException();
    }

    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 91;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{-1589658616, -1065297459, 942299309, 1961917910, -1959597566, -2077560724, 1906086728, 138543444, -33948917, -1669662277, 1357359960, -1080221357}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 21, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            try {
                if (isCardActivationPending(str)) {
                    util.h.xy.bb.e eVar = new util.h.xy.bb.e();
                    eVar.m25305(str);
                    return eVar;
                }
                int i2 = getInputSizeshNQ4ISI + 47;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            } catch (java.lang.Exception e) {
                e.getMessage();
                return null;
            }
        }
        android.text.TextUtils.isEmpty(str);
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoSizes(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("롗\uf816㣨祏", 16477 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-47878907, 480837626, -1490617076, 65628837}, 8 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager cardLifeCycleManager = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        cardLifeCycleManager.deleteCard(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: util.h.xy.au.a.6
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoSizes = 1;
            private static char getHighSpeedVideoSizesFor = 56287;
            private static char getInputFormats = 31895;
            private static int getInputSizeshNQ4ISI = 1;
            private static char getOutputFormats = 34947;
            private static char getOutputMinFrameDuration = 63981;

            private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr3) {
                int i2 = getHighSpeedVideoFpsRanges + 89;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                char[] charArray = str.toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                while (eVar.f2630 < charArray.length) {
                    cArr2[0] = charArray[eVar.f2630];
                    cArr2[1] = charArray[eVar.f2630 + 1];
                    int i3 = 58224;
                    int i4 = 0;
                    while (i4 < 16) {
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                        i3 -= 40503;
                        i4++;
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 5) % 128;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 79) % 128;
                }
                objArr3[0] = new java.lang.String(cArr, 0, i);
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onSuccess(java.lang.String str) {
                java.lang.String intern2;
                java.lang.Object obj;
                int i = getHighResolutionOutputSizeshNQ4ISI + 71;
                getInputSizeshNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("坸졞櫥犎", 5 / (android.view.ViewConfiguration.getEdgeSlop() / 74), objArr3);
                    intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue30dԚ\ue67fꌂ\udeae\ue0e7Ⱊⷪ빺㢆", 6 % (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                    obj = objArr4[0];
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("坸졞櫥犎", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 4, objArr5);
                    intern2 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue30dԚ\ue67fꌂ\udeae\ue0e7Ⱊⷪ빺㢆", 11 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
                    obj = objArr6[0];
                }
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) obj).intern());
                java.lang.String str2 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                countDownLatch.countDown();
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
            public final void onError(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError) {
                getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 105) % 128;
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("坸졞櫥犎", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 5, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue30dԚ\ue67fꌂ\udeae\ue0e7Ⱊⷪᗿ휁", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 10, objArr4);
                    util.h.xy.am.ma.m25029(intern2, ((java.lang.String) objArr4[0]).intern());
                    java.lang.String str2 = util.h.xy.au.a.Camera2StreamConfigurationMap;
                    countDownLatch.countDown();
                    getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        });
        try {
            countDownLatch.await(30L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
        }
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = -1231763752;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = new int[]{940870514, 1746867025, 1945472295, -558451328, 1654318130, 1867100522, 1404346423, -536792337, -37180058, -1814505055, 421678542, 1459181766, 738965785, 1469258235, 763926659, 426965008, -1574178496, 928555094};
        getHighSpeedVideoSizesFor = -4756482401561703552L;
    }
}
