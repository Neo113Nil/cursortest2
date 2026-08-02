package util.h.xy.bv;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.bv.a {
    private static int Camera2StreamConfigurationMap = 1;
    private static int[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static int getOutputFormats;
    private static int[] getOutputMinFrameDuration;
    private int CoroutineDebuggingKt;
    private java.util.List<util.h.xy.d.b> getHighSpeedVideoSizesFor;
    private final com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener getOutputMinFrameDurationlomOqCM;
    private final android.content.Intent getOutputStallDurationlomOqCM;
    private java.lang.String isOutputSupportedFor;
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private java.lang.String unwrapAs;
    private int getOutputSizeshNQ4ISI = 0;
    private util.h.xy.bv.me getInputSizeshNQ4ISI = null;
    private util.h.xy.bv.ra.b accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
    private boolean getValidOutputFormatsForInputhNQ4ISI = false;
    private boolean getOutputStallDuration = false;
    private int getOutputSizes = 0;
    private final util.h.xy.bv.rd toString = new util.h.xy.bv.rd();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {
        public static final util.h.xy.bv.ra.b Camera2StreamConfigurationMap;
        private static long getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        public static final util.h.xy.bv.ra.b getHighSpeedVideoSizes;
        private static char[] getHighSpeedVideoSizesFor = null;
        private static final /* synthetic */ util.h.xy.bv.ra.b[] getInputSizeshNQ4ISI;
        private static int getOutputFormats = 0;
        private static int getOutputMinFrameDuration = 1;
        private java.lang.String getInputFormats;

        private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 29) % 128;
                jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
                rbVar.f2651++;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            }
            java.lang.String str = new java.lang.String(cArr);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            objArr[0] = str;
        }

        public static util.h.xy.bv.ra.b valueOf(java.lang.String str) {
            getOutputMinFrameDuration = (getOutputFormats + 13) % 128;
            util.h.xy.bv.ra.b bVar = (util.h.xy.bv.ra.b) java.lang.Enum.valueOf(util.h.xy.bv.ra.b.class, str);
            int i = getOutputFormats + 3;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        public static util.h.xy.bv.ra.b[] values() {
            getOutputMinFrameDuration = (getOutputFormats + 49) % 128;
            util.h.xy.bv.ra.b[] bVarArr = (util.h.xy.bv.ra.b[]) getInputSizeshNQ4ISI.clone();
            getOutputMinFrameDuration = (getOutputFormats + 91) % 128;
            return bVarArr;
        }

        static {
            util.h.xy.bv.ra.b[] bVarArr;
            getHighSpeedVideoSizes();
            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(resolveSizeAndState + 7, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (char) (58279 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - packedPositionGroup, 1 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), (char) (58280 - android.graphics.Color.green(0)), objArr2);
            util.h.xy.bv.ra.b bVar = new util.h.xy.bv.ra.b(intern, 0, ((java.lang.String) objArr2[0]).intern());
            Camera2StreamConfigurationMap = bVar;
            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(combineMeasuredStates + 6, 7 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 33141), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(6 - packedPositionType, 7 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 33142), objArr4);
            util.h.xy.bv.ra.b bVar2 = new util.h.xy.bv.ra.b(intern2, 1, ((java.lang.String) objArr4[0]).intern());
            getHighSpeedVideoSizes = bVar2;
            int i = getOutputMinFrameDuration + 73;
            int i2 = i % 128;
            getOutputFormats = i2;
            if (i % 2 != 0) {
                bVarArr = new util.h.xy.bv.ra.b[3];
                bVarArr[0] = bVar;
                bVarArr[1] = bVar2;
            } else {
                bVarArr = new util.h.xy.bv.ra.b[]{bVar, bVar2};
            }
            getInputSizeshNQ4ISI = bVarArr;
            int i3 = i2 + 39;
            getOutputMinFrameDuration = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        private b(java.lang.String str, int i, java.lang.String str2) {
            this.getInputFormats = str2;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int i = getOutputMinFrameDuration;
            int i2 = i + 69;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            java.lang.String str = this.getInputFormats;
            int i3 = i + 3;
            getOutputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static void getHighSpeedVideoSizes() {
            getHighSpeedVideoSizesFor = new char[]{32762, 22226, 11702, 1120, 56148, 45596, 35054, 7474, 13339, 20321, 26290, 47497, 53462};
            getHighResolutionOutputSizeshNQ4ISI = -688821235467897553L;
        }
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap() {
        int i = getOutputFormats + 87;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return getHighSpeedVideoSizesFor();
        }
        getHighSpeedVideoSizesFor();
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra raVar) {
        int i = (getOutputFormats + 49) % 128;
        getHighSpeedVideoFpsRanges = i;
        com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener = raVar.getOutputMinFrameDurationlomOqCM;
        int i2 = i + 3;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return pushServiceListener;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoFpsRanges;
        getOutputFormats = (i + 115) % 128;
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        getOutputFormats = (i + 9) % 128;
        return str;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor = util.h.xy.bv.ra.class.getName();
        int i = getOutputFormats + 39;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighResolutionOutputSizeshNQ4ISI;
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
        int[] iArr5 = getHighResolutionOutputSizeshNQ4ISI;
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

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getOutputMinFrameDuration;
        if (iArr3 != null) {
            int i2 = getHighSpeedVideoSizes + 81;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
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
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i5 = 0; i5 < 16; i5++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 43) % 128;
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
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 27) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (getInputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 51) % 128;
        }
        if (i2 > 0) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 43) % 128;
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        if (z) {
            int i5 = getHighSpeedVideoSizes + 23;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                cArr = new char[i];
                raVar.f2649 = 1;
            } else {
                cArr = new char[i];
                raVar.f2649 = 0;
            }
            while (raVar.f2649 < i) {
                cArr[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr2 = cArr;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    public ra(com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener pushServiceListener, android.content.Intent intent) {
        this.getOutputMinFrameDurationlomOqCM = pushServiceListener;
        this.getOutputStallDurationlomOqCM = intent;
    }

    @Override // util.h.xy.bv.a
    /* renamed from: ᐝ */
    public final void mo25679(java.lang.String str, java.lang.String str2) {
        util.h.xy.ca.b bVar;
        boolean z;
        int i = getHighSpeedVideoFpsRanges + 111;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            this.isOutputSupportedFor = str;
            this.isOutputSupportedForhNQ4ISI = str2;
            bVar = (util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
            z = false;
        } else {
            this.isOutputSupportedFor = str;
            this.isOutputSupportedForhNQ4ISI = str2;
            bVar = (util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
            z = true;
        }
        bVar.m25839(z);
        getOutputFormats = (getHighSpeedVideoFpsRanges + 53) % 128;
        getHighSpeedVideoFpsRanges((com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError) null);
        int i2 = getOutputFormats + 115;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25741(java.lang.String str, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 69) % 128;
        this.isOutputSupportedFor = str;
        ((util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService()).m25839(true);
        getHighSpeedVideoFpsRanges(provisioningServiceError);
        int i = getHighSpeedVideoFpsRanges + 3;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a A[EDGE_INSN: B:83:0x013a->B:64:0x013a BREAK  A[LOOP:0: B:18:0x0079->B:82:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        java.lang.String str;
        boolean z;
        char c;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> m25709;
        int i;
        getOutputFormats = (getHighSpeedVideoFpsRanges + 53) % 128;
        java.lang.String inputSizeshNQ4ISI = getInputSizeshNQ4ISI();
        util.h.xy.bv.rd rdVar = this.toString;
        java.lang.String str2 = this.isOutputSupportedFor;
        if (inputSizeshNQ4ISI != null) {
            int i2 = getHighSpeedVideoFpsRanges + 115;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            str = inputSizeshNQ4ISI.toString();
        } else {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 45) % 128;
            str = null;
        }
        rdVar.m25753(str2, str, this.isOutputSupportedForhNQ4ISI);
        int i3 = getHighSpeedVideoFpsRanges + 47;
        int i4 = i3 % 128;
        getOutputFormats = i4;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str3 = this.isOutputSupportedForhNQ4ISI;
        if (str3 != null) {
            int i5 = i4 + 125;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (!str3.trim().isEmpty()) {
                getHighSpeedVideoFpsRanges = (getOutputFormats + 61) % 128;
                z = true;
                this.getOutputSizes = !z ? util.h.xy.cb.mb.m25858() : util.h.xy.cb.mb.m25852();
                c = 65535;
                do {
                    m25709 = this.toString.m25709();
                    if (m25709 != null) {
                        util.h.xy.bv.rb result = m25709.getResult();
                        char c2 = m25709.isSuccessful() ? (char) 1 : (char) 65535;
                        if (result != null) {
                            int m25749 = result.m25749();
                            if (z) {
                                int i6 = (getHighSpeedVideoFpsRanges + 75) % 128;
                                getOutputFormats = i6;
                                if (m25749 != 672) {
                                    int i7 = i6 + 53;
                                    getHighSpeedVideoFpsRanges = i7 % 128;
                                    if (i7 % 2 != 0) {
                                    }
                                }
                                util.h.xy.cg.a.m25905(util.h.xy.cb.mb.m25853(this.getOutputSizes));
                                c2 = 0;
                            }
                            if (result.m25749() >= 670) {
                                getHighSpeedVideoFpsRanges = (getOutputFormats + 63) % 128;
                                if (result.m25749() <= 679) {
                                    util.h.xy.cg.a.m25905(util.h.xy.cb.mb.m25850());
                                    getOutputFormats = (getHighSpeedVideoFpsRanges + 125) % 128;
                                    c2 = 0;
                                }
                            }
                        }
                        if (c2 == 65535) {
                            getOutputFormats = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            m25709.getErrorCode();
                            if (result == null || result.m25752() != util.h.xy.bv.rb.b.f1060) {
                                if (m25709.getErrorCode() == 401) {
                                    if (!this.getValidOutputFormatsForInputhNQ4ISI) {
                                        this.getValidOutputFormatsForInputhNQ4ISI = true;
                                        c = 0;
                                    }
                                } else if (m25709.getErrorCode() == 500 || m25709.getErrorCode() == -101) {
                                    util.h.xy.cg.a.m25905(util.h.xy.cb.mb.m25850());
                                    c = 0;
                                } else {
                                    m25709.getErrorMessage();
                                }
                            }
                        }
                        c = c2;
                    }
                    i = this.getOutputSizes;
                    this.getOutputSizes = i - 1;
                    if (i > 0) {
                        break;
                    }
                } while (c == 0);
                if (c == 65535) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 35) % 128;
                    if (m25709 != null) {
                        provisioningServiceError = util.h.xy.cg.ra.m25924(util.h.xy.cg.ra.m25922(m25709), provisioningServiceError);
                    }
                }
                if (m25709 != null) {
                    int i8 = getHighSpeedVideoFpsRanges + 41;
                    getOutputFormats = i8 % 128;
                    if (i8 % 2 != 0) {
                        m25709.getResult();
                        throw null;
                    }
                    if (m25709.getResult() != null && (m25709.getResult() instanceof util.h.xy.bv.me)) {
                        getHighSpeedVideoSizes((util.h.xy.bv.me) m25709.getResult(), provisioningServiceError);
                        return;
                    }
                }
                Camera2StreamConfigurationMap(provisioningServiceError);
            }
        }
        z = false;
        this.getOutputSizes = !z ? util.h.xy.cb.mb.m25858() : util.h.xy.cb.mb.m25852();
        c = 65535;
        do {
            m25709 = this.toString.m25709();
            if (m25709 != null) {
            }
            i = this.getOutputSizes;
            this.getOutputSizes = i - 1;
            if (i > 0) {
            }
        } while (c == 0);
        if (c == 65535) {
        }
        if (m25709 != null) {
        }
        Camera2StreamConfigurationMap(provisioningServiceError);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(util.h.xy.bv.me meVar, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        java.lang.String[] m25716;
        util.h.xy.d.c m26925;
        int length;
        int i;
        util.h.xy.s.a.b bVar;
        java.lang.String m25713;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError2;
        meVar.m25745();
        meVar.m25712();
        meVar.m25711();
        if (meVar.m25745() != util.h.xy.bv.rb.ra.f1061 || !this.getOutputStallDuration) {
            if (this.getOutputStallDuration) {
                int i2 = getOutputFormats + 101;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    m25716 = this.getInputSizeshNQ4ISI.m25716();
                    m26925 = util.h.xy.k.ma.m26925();
                    length = m25716.length;
                    i = 1;
                } else {
                    m25716 = this.getInputSizeshNQ4ISI.m25716();
                    m26925 = util.h.xy.k.ma.m26925();
                    length = m25716.length;
                    i = 0;
                }
                while (i < length) {
                    java.lang.String str = m25716[i];
                    try {
                        bVar = util.h.xy.s.rb.m27288(m26925.mo26151(str, util.h.xy.d.ma.f1140).getResult());
                    } catch (org.json.JSONException unused) {
                        bVar = util.h.xy.s.a.b.f2295;
                    }
                    if (bVar != util.h.xy.s.a.b.f2296) {
                        int i3 = getOutputFormats + 39;
                        getHighSpeedVideoFpsRanges = i3 % 128;
                        int i4 = i3 % 2;
                        m26925.mo26167(str);
                        if (i4 == 0) {
                            throw null;
                        }
                    }
                    i++;
                }
            }
            util.h.xy.bv.me meVar2 = this.getInputSizeshNQ4ISI;
            m25713 = meVar2 == null ? meVar2.m25713() : null;
            this.getInputSizeshNQ4ISI = meVar;
            if (m25713 != null && !m25713.trim().isEmpty()) {
                getOutputFormats = (getHighSpeedVideoFpsRanges + 13) % 128;
                this.getInputSizeshNQ4ISI.m25714(m25713);
            }
            if (meVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
                if (meVar != null) {
                    int i5 = getHighSpeedVideoFpsRanges + 29;
                    getOutputFormats = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (this.getOutputSizes != -1 || meVar.m25749() < 670 || meVar.m25749() > 679) {
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25924 = util.h.xy.cg.ra.m25924(util.h.xy.cg.ra.m25921(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, meVar), provisioningServiceError);
                        if (meVar.m25712()) {
                            getOutputFormats = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            m25741(this.isOutputSupportedFor, m25924);
                            return;
                        }
                        provisioningServiceError2 = m25924;
                    } else {
                        provisioningServiceError2 = util.h.xy.cg.ra.m25924(util.h.xy.cg.ra.m25921(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.RETRY_EXCEEDED, meVar), provisioningServiceError);
                    }
                    Camera2StreamConfigurationMap(provisioningServiceError2);
                    return;
                }
                return;
            }
            getHighSpeedVideoFpsRanges = (getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            java.lang.String m25711 = meVar.m25711();
            if (meVar.m25712() || m25711 != null) {
                if (m25711 != null) {
                    m25740(meVar.m25716(), meVar.m25710(), m25711, provisioningServiceError);
                    return;
                }
                int i6 = getOutputFormats + 39;
                getHighSpeedVideoFpsRanges = i6 % 128;
                if (i6 % 2 != 0) {
                    getHighSpeedVideoFpsRanges(provisioningServiceError);
                    return;
                } else {
                    getHighSpeedVideoFpsRanges(provisioningServiceError);
                    throw new java.lang.ArithmeticException();
                }
            }
            if (provisioningServiceError != null) {
                Camera2StreamConfigurationMap(provisioningServiceError);
                return;
            }
            getHighSpeedVideoFpsRanges = (getOutputFormats + 125) % 128;
            getHighSpeedVideoFpsRangesFor();
            try {
                util.h.xy.by.ma.f1067.m25818();
                if (this.isOutputSupportedFor != null) {
                    util.h.xy.t.mb.f2417.m27476(this.isOutputSupportedFor.getBytes());
                    int i7 = getHighSpeedVideoFpsRanges + 19;
                    getOutputFormats = i7 % 128;
                    int i8 = i7 % 2;
                }
                this.toString.m25754();
                getHighSpeedVideoFpsRanges = (getOutputFormats + 53) % 128;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bv.ra.5
                private static int Camera2StreamConfigurationMap = 1;
                private static int getHighSpeedVideoFpsRanges = 1;
                private static int getHighSpeedVideoFpsRangesFor;
                private static int getInputFormats;
                private static char[] getHighSpeedVideoSizes = {40013, 3475, 49100, 10500, 40002, 3456, 49088, 10601, 56153, 17544, 63168, 24603, 4671, 33692, 11734};
                private static long getOutputFormats = -924024812099007037L;

                private static void getHighSpeedVideoSizes(int i9, int i10, char c, java.lang.Object[] objArr) {
                    int i11;
                    util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                    long[] jArr = new long[i9];
                    rbVar.f2651 = 0;
                    while (rbVar.f2651 < i9) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 117) % 128;
                        jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizes[rbVar.f2651 + i10] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
                        rbVar.f2651++;
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 25) % 128;
                    }
                    char[] cArr = new char[i9];
                    rbVar.f2651 = 0;
                    while (rbVar.f2651 < i9) {
                        int i12 = Camera2StreamConfigurationMap + 5;
                        getHighSpeedVideoFpsRangesFor = i12 % 128;
                        if (i12 % 2 != 0) {
                            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                            i11 = rbVar.f2651;
                        } else {
                            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                            i11 = rbVar.f2651 + 1;
                        }
                        rbVar.f2651 = i11;
                    }
                    objArr[0] = new java.lang.String(cArr);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    getInputFormats = (getHighSpeedVideoFpsRanges + 91) % 128;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes((android.view.KeyEvent.getMaxKeyCode() >> 16) + 4, android.view.View.combineMeasuredStates(0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(10 - indexOf, (-16777212) - android.graphics.Color.rgb(0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    if (util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this) != null) {
                        getInputFormats = (getHighSpeedVideoFpsRanges + 53) % 128;
                        util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onComplete();
                        getHighSpeedVideoFpsRanges = (getInputFormats + 91) % 128;
                    }
                }
            });
            int i9 = getHighSpeedVideoFpsRanges + 57;
            getOutputFormats = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputStallDuration = false;
        util.h.xy.bv.me meVar22 = this.getInputSizeshNQ4ISI;
        if (meVar22 == null) {
        }
        this.getInputSizeshNQ4ISI = meVar;
        if (m25713 != null) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 13) % 128;
            this.getInputSizeshNQ4ISI.m25714(m25713);
        }
        if (meVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:5|(5:6|7|8|(4:10|(1:12)(1:15)|13|14)|16)|(6:18|(7:20|(4:22|(1:24)|25|(2:27|28))(1:40)|30|31|(1:33)|35|36)|42|(1:44)|25|(0))(3:45|46|(2:48|49)(2:52|53))|29|30|31|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x036a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x036b, code lost:
    
        getHighSpeedVideoFpsRanges(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01bb, code lost:
    
        if (((java.lang.String) r11[0]).intern().equals(r10) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x028f, code lost:
    
        if (((java.lang.String) r4[0]).intern().equals(r10) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02c2, code lost:
    
        r3 = Camera2StreamConfigurationMap(r24.getInputSizeshNQ4ISI.m25716()[0]);
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-2100566160, -182314097, 517772783, -445865125, -99912899, 1444975141, -1914140269, -1427585399}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 14, r10);
        r5.put(((java.lang.String) r10[0]).intern(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02c0, code lost:
    
        if (((java.lang.String) r4[0]).intern().equals(r10) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021a A[Catch: InternalComponentException -> 0x01f0, rc -> 0x01f4, JSONException -> 0x01f6, TRY_LEAVE, TryCatch #4 {InternalComponentException -> 0x01f0, JSONException -> 0x01f6, rc -> 0x01f4, blocks: (B:7:0x001f, B:12:0x00c8, B:13:0x00ef, B:14:0x0118, B:15:0x00f4, B:16:0x011f, B:18:0x0125, B:22:0x0160, B:25:0x01f8, B:27:0x021a, B:29:0x02eb, B:40:0x0191, B:42:0x01bd, B:44:0x01c5, B:49:0x0277, B:51:0x02c2, B:53:0x02a9, B:56:0x030e, B:58:0x0315, B:59:0x0316), top: B:6:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0320 A[Catch: JSONException -> 0x036a, TRY_LEAVE, TryCatch #2 {JSONException -> 0x036a, blocks: (B:31:0x031a, B:33:0x0320), top: B:30:0x031a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String getInputSizeshNQ4ISI() {
        java.lang.String string;
        java.lang.Object[] objArr;
        java.lang.String str;
        util.h.xy.bv.me meVar = this.getInputSizeshNQ4ISI;
        if (meVar == null || meVar.m25711() == null) {
            this.accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
            return null;
        }
        java.lang.String m25711 = this.getInputSizeshNQ4ISI.m25711();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(m25711);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("￥\u0000\n�\t\t\u000b\uffff\u0000", android.graphics.Color.green(0) + 9, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 108, true, objArr2);
            string = jSONObject2.getString(((java.lang.String) objArr2[0]).intern());
            this.getInputSizeshNQ4ISI.m25718(string);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("￥\u0000\n�\t\t\u000b\uffff\u0000", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '(', 109 - android.text.TextUtils.getCapsMode("", 0, 0), true, objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), string);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ufff8\ufff9\n�\ufff7\ufff9\u0013�\u0002\ufffa\u0003\ufffb\ufff9\b\u0013", '?' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 11 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 85 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, objArr4);
            if (((java.lang.String) objArr4[0]).intern().equals(string)) {
                int i = getOutputFormats + 13;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u000e\u0001\ufffb�￼�", android.view.View.MeasureSpec.getSize(0) * 58, 2 << android.widget.ExpandableListView.getPackedPositionChild(1L), 54 << (android.view.ViewConfiguration.getLongPressTimeout() - 113), false, objArr5);
                    str = (java.lang.String) objArr5[0];
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u000e\u0001\ufffb�￼�", 6 - android.view.View.MeasureSpec.getSize(0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 5, 113 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), false, objArr6);
                    str = (java.lang.String) objArr6[0];
                }
                jSONObject.put(str.intern(), getOutputFormats());
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e = e;
            getHighSpeedVideoFpsRanges(e);
            if (this.accessartificialFrame == util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e2) {
            e = e2;
            getHighSpeedVideoFpsRanges(e);
            if (this.accessartificialFrame == util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
            }
            return jSONObject.toString();
        } catch (util.h.xy.ck.rc e3) {
            e = e3;
            getHighSpeedVideoFpsRanges(e);
            if (this.accessartificialFrame == util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
            }
            return jSONObject.toString();
        }
        if (this.accessartificialFrame != util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ufffa\u0002�\u0013\ufff8\u0006\ufff5\ufff7\u0013\b\ufff9\ufffb\u0003", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.blue(0) + 85, true, objArr7);
            if (!((java.lang.String) objArr7[0]).intern().equals(string)) {
                int i2 = getHighSpeedVideoFpsRanges + 15;
                getOutputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufff8\ufff9\n�\ufff7\ufff9\u0013�\u0002\ufffa\u0003\ufffb\ufff9\b\u0013", 73 / android.graphics.Color.argb(0, 0, 1, 1), 82 - android.text.TextUtils.indexOf("", ""), 106 % android.view.View.resolveSize(1, 0), true, objArr8);
                    if (((java.lang.String) objArr8[0]).intern().equals(string)) {
                    }
                    objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{1248724883, 1754220414, 1758971265, 655379032, 1502332190, 620924306}, 12 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                    if (!((java.lang.String) objArr[0]).intern().equals(string)) {
                        org.json.JSONArray Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI.m25716()[0]);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{-2100566160, -182314097, 517772783, -445865125, -99912899, 1444975141, -1914140269, -1427585399}, 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr9);
                        jSONObject.put(((java.lang.String) objArr9[0]).intern(), Camera2StreamConfigurationMap2);
                        int i3 = getOutputFormats + 51;
                        getHighSpeedVideoFpsRanges = i3 % 128;
                        int i4 = i3 % 2;
                    }
                } else {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufff8\ufff9\n�\ufff7\ufff9\u0013�\u0002\ufffa\u0003\ufffb\ufff9\b\u0013", 15 - android.graphics.Color.argb(0, 0, 0, 0), android.text.TextUtils.indexOf("", "") + 11, 85 - android.view.View.resolveSize(0, 0), false, objArr10);
                }
                if (this.accessartificialFrame == util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u0004\ufff8\u0005\ufffb￪\u000b\ufff8\u000b\f\n￩￼\ufff8\n\u0006\u0005\ufffa\u0006\u0004", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 19, android.text.TextUtils.indexOf("", "") + 16, 113 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr11);
                    jSONObject.put(((java.lang.String) objArr11[0]).intern(), this.CoroutineDebuggingKt);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{1210925842, -1731665721, 716562033, 1836769881, 626638730, 154154979, -1919908263, 1181239885}, android.text.TextUtils.getTrimmedLength("") + 16, objArr12);
                    jSONObject.put(((java.lang.String) objArr12[0]).intern(), this.unwrapAs);
                }
                return jSONObject.toString();
            }
            if (!this.getHighSpeedVideoSizesFor.isEmpty()) {
                org.json.JSONArray highSpeedVideoSizes = getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI.m25716());
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-2100566160, -182314097, 517772783, -445865125, -99912899, 1444975141, -1914140269, -1427585399}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13, objArr13);
                jSONObject.put(((java.lang.String) objArr13[0]).intern(), highSpeedVideoSizes);
            }
            objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{1248724883, 1754220414, 1758971265, 655379032, 1502332190, 620924306}, 12 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            if (!((java.lang.String) objArr[0]).intern().equals(string)) {
            }
        } else {
            int[] iArr = {1248724883, 1754220414, 1758971265, 655379032, 1502332190, 620924306};
            int i5 = getHighSpeedVideoFpsRanges + 15;
            getOutputFormats = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(iArr, 10 >>> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr14);
                } else {
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(iArr, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 10, objArr15);
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1210925842, -1731665721, 716562033, 1836769881, 626638730, 154154979, 634300179, -153685898}, android.graphics.Color.alpha(0) + 13, objArr16);
        jSONObject.put(((java.lang.String) objArr16[0]).intern(), this.accessartificialFrame.toString());
        if (this.accessartificialFrame == util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
        }
        return jSONObject.toString();
    }

    private org.json.JSONArray Camera2StreamConfigurationMap(java.lang.String str) throws util.h.xy.ck.rc {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{376141463, 244012766, 1178495775, 1968672184, -865292078, 436385809}, 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), str);
            if (this.getInputSizeshNQ4ISI.m25710() != null) {
                this.getInputSizeshNQ4ISI.m25710();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-2098967643, 728236096, 2005945663, 1335027191, 1492715493, 1700452154}, android.text.TextUtils.indexOf("", "") + 10, objArr2);
                jSONObject.put(((java.lang.String) objArr2[0]).intern(), this.getInputSizeshNQ4ISI.m25710());
                getOutputFormats = (getHighSpeedVideoFpsRanges + 41) % 128;
            }
            jSONArray.put(jSONObject);
            getHighSpeedVideoFpsRanges = (getOutputFormats + 53) % 128;
            return jSONArray;
        } catch (org.json.JSONException e) {
            e.getMessage();
            return jSONArray;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (util.h.xy.u.c.m27504(r20[r5], false) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private org.json.JSONArray getHighSpeedVideoSizes(java.lang.String[] strArr) throws util.h.xy.ck.rc {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            int i = 0;
            for (util.h.xy.d.b bVar : this.getHighSpeedVideoSizesFor) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{376141463, 244012766, 1178495775, 1968672184, -865292078, 436385809}, 10 - android.view.View.MeasureSpec.getMode(0), objArr);
                jSONObject.put(((java.lang.String) objArr[0]).intern(), strArr[i]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-2098967643, 728236096, 2005945663, 1335027191, 1492715493, 1700452154}, 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                jSONObject.put(((java.lang.String) objArr2[0]).intern(), bVar.m26136().toString());
                int m26139 = bVar.m26139();
                int m26143 = bVar.m26143();
                if (bVar.m26133() == util.h.xy.d.mg.f1145 && util.h.xy.k.ra.f2243.m26968(strArr[i])) {
                    int i2 = getHighSpeedVideoFpsRanges + 87;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (util.h.xy.u.c.m27504(strArr[i], false)) {
                            getHighSpeedVideoFpsRanges = (getOutputFormats + 105) % 128;
                            m26139++;
                            m26143 = bVar.m26142();
                        }
                    }
                }
                java.lang.String num = java.lang.Integer.toString(m26143);
                java.lang.String num2 = java.lang.Integer.toString(m26139);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{874668881, -616037037}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, objArr3);
                jSONObject.put(((java.lang.String) objArr3[0]).intern(), num);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\ufff9\u0001\u0006\u0001\u0006\uffff\b\ufff9\u0011\u0005�\u0006\fￛ\n�￼\u000b￪�\u0005", 21 - android.graphics.Color.blue(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 7, 113 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr4);
                jSONObject.put(((java.lang.String) objArr4[0]).intern(), num2);
                byte[] m25870 = util.h.xy.cd.mb.m25870(strArr[i]);
                if (!util.h.xy.ar.b.m25070(m25870)) {
                    byte[] m25619 = util.h.xy.bs.ma.m25619(m25870);
                    java.lang.String str = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(m25870));
                    java.lang.String m25074 = util.h.xy.ar.b.m25074(m25619);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u0004\ufff7\b\n\t\ufffa\b\u0005\ufff9\ufffb￨\u0004\u0005\uffff\n\ufff9\ufff7\t", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, android.text.TextUtils.indexOf("", "") + 4, 115 - android.text.TextUtils.getOffsetBefore("", 0), true, objArr5);
                    jSONObject.put(((java.lang.String) objArr5[0]).intern(), str);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 57) % 128;
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("￪\n\ufffb\t\u0006\ufffa￼￩\u0005\ufff8\t\u000b￼\t\f\u000b\ufff8\u0005\ufffe\u0000", 19 - lastIndexOf, 11 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 114 - android.view.KeyEvent.keyCodeFromString(""), true, objArr6);
                        jSONObject.put(((java.lang.String) objArr6[0]).intern(), m25074);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                jSONArray.put(jSONObject);
                i++;
                getOutputFormats = (getHighSpeedVideoFpsRanges + 119) % 128;
            }
            this.getOutputStallDuration = true;
            return jSONArray;
        } catch (org.json.JSONException e) {
            e.getMessage();
            return jSONArray;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return jSONArray;
        }
    }

    private static org.json.JSONObject getOutputFormats() throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
            getHighSpeedVideoFpsRanges = (getOutputFormats + 55) % 128;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{244368683, -1041301775, -1901404397, -307131541, -1182534224, 568129844, 1081439838, -221445383, -2124740136, 2117858483, -20462730, 574960035}, 23 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(new int[]{-1461315262, 1516289603, 1286320950, -1394216212, -1818490308, 1361610404, 1846737719, -1399012996, -491029228, 673050278}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, objArr2);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(m24558, null);
                try {
                    java.lang.Object[] objArr3 = {util.h.xy.ag.a.m24556().m24558().getPackageName(), 0};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{244368683, -1041301775, -1901404397, -307131541, -1182534224, 568129844, 1081439838, -221445383, -999106407, 72668428, 1286320950, -1394216212, -1818490308, 1361610404, 1846737719, -1399012996, -491029228, 673050278}, 33 - android.graphics.Color.alpha(0), objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{-1461315262, 1516289603, 1286320950, -1394216212, 788667384, 1394458707, -1415141343, -2141720804}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, objArr5);
                    android.content.pm.PackageInfo packageInfo = (android.content.pm.PackageInfo) cls2.getMethod((java.lang.String) objArr5[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr3);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(packageInfo.versionCode);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\ufff3\u000e", 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1, android.view.View.MeasureSpec.getMode(0) + 54, false, objArr6);
                    sb.append(((java.lang.String) objArr6[0]).intern());
                    sb.append(packageInfo.versionName);
                    str = sb.toString();
                    int i = getHighSpeedVideoFpsRanges + 35;
                    getOutputFormats = i % 128;
                    int i2 = i % 2;
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
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "";
        }
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-1282018557, 1769938458, 1540314289, -1462335730}, 7 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr7);
        java.lang.String intern = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{244368683, -1041301775, -1901404397, -307131541, -1794694777, -942469172, 719435117, -1927911131}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 16, objArr8);
        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(new int[]{-722237971, 1335602212, -1968520242, 2067830143, 2104344540, 1757942792}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12, objArr9);
        jSONObject.put(intern, cls3.getField((java.lang.String) objArr9[0]).get(null));
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-1386235283, -1416293308, 69677624, 1918964005, -2096832152, -265039642}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, objArr10);
        jSONObject.put(((java.lang.String) objArr10[0]).intern(), android.os.Build.VERSION.SDK_INT);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1673662694, -1113028988, 1345979740, 1107372694, 388180949, -1089104502, -1068681832, 1954439674}, 16 - android.graphics.Color.blue(0), objArr11);
        jSONObject.put(((java.lang.String) objArr11[0]).intern(), str);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u000f\u0002\ufff3￨￡\ufff0\u0010\r\u0000\u000b\f\u0006\u0010", 13 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.View.getDefaultSize(0, 0) + 9, 109 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, objArr12);
        java.lang.String intern2 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\ufff5\ufff6\ufffb\ufff3\ufff6\ufff7\ufff3\ufff5\ufff37(", 11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.widget.ExpandableListView.getPackedPositionType(0L) + 2, 67 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), false, objArr13);
        jSONObject.put(intern2, ((java.lang.String) objArr13[0]).intern());
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("￼\u0002\u000e\uffff\u0000\u0011\u0004\ufffe\u0000￮\u000f￼\u000f\u0000￡\u0007", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, android.view.KeyEvent.getDeadChar(0, 0) + 3, 110 - android.text.TextUtils.indexOf("", "", 0, 0), false, objArr14);
        jSONObject.put(((java.lang.String) objArr14[0]).intern(), util.h.xy.cg.a.m25904());
        return jSONObject;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int i = (getOutputFormats + 119) % 128;
        getHighSpeedVideoFpsRanges = i;
        if (strArr.length == 0) {
            return null;
        }
        java.lang.String str = strArr[0];
        int i2 = i + 15;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25740(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError2;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25924;
        org.json.JSONObject jSONObject;
        java.lang.String string;
        java.lang.Object[] objArr;
        util.h.xy.d.b bVar;
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError3 = provisioningServiceError;
        try {
            jSONObject = new org.json.JSONObject(str2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("￥\u0000\n�\t\t\u000b\uffff\u0000", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 109, true, objArr2);
            string = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
            try {
                objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\ufffa\u0002�\u0013\ufff8\u0006\ufff5\ufff7\u0013\b\ufff9\ufffb\u0003", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 11, 85 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), true, objArr);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (org.json.JSONException e) {
            e = e;
            provisioningServiceError2 = provisioningServiceError3;
        }
        if (((java.lang.String) objArr[0]).intern().equals(string)) {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1158957350, -35694274}, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 1, objArr3);
                getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr3[0]).intern(), 5);
                util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
                getHighSpeedVideoFpsRangesFor(strArr, jSONObject, false);
                java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(strArr);
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo26148 = m26925.mo26148(highSpeedVideoFpsRanges);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1146234258, 867461243}, 4 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1392847582, 1425918361, 1099366469, 18157799, 787091518, 1104272258}, 12 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr5[0]).intern());
                this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
                if (!getHighSpeedVideoFpsRanges(mo26148)) {
                    this.getHighSpeedVideoSizesFor.add(null);
                    m25924 = util.h.xy.cg.ra.m25924(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, -2, this.CoroutineDebuggingKt, highSpeedVideoFpsRanges, this.unwrapAs, null), provisioningServiceError3);
                    getHighSpeedVideoFpsRanges(m25924);
                } else {
                    util.h.xy.d.b result = mo26148.getResult();
                    this.accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoSizesFor.add(result);
                    m25924 = provisioningServiceError3;
                    getHighSpeedVideoFpsRanges(m25924);
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1248724883, 1754220414, 1758971265, 655379032, 1502332190, 620924306}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, objArr6);
        if (((java.lang.String) objArr6[0]).intern().equals(string)) {
            int i = getOutputFormats + 61;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1158957350, -35694274}, -android.view.MotionEvent.axisFromString(""), objArr7);
                getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr7[0]).intern(), 30);
                getHighSpeedVideoFpsRangesFor(strArr, jSONObject, false);
            } else {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1158957350, -35694274}, -android.view.MotionEvent.axisFromString(""), objArr8);
                getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr8[0]).intern(), 6);
                getHighSpeedVideoFpsRangesFor(strArr, jSONObject, true);
            }
            getOutputFormats = (getHighSpeedVideoFpsRanges + 29) % 128;
        } else {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ufff8\ufff9\n�\ufff7\ufff9\u0013�\u0002\ufffa\u0003\ufffb\ufff9\b\u0013", 15 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 11, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 84, false, objArr9);
            if (!((java.lang.String) objArr9[0]).intern().equals(string)) {
                com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m25916 = util.h.xy.cg.mb.m25916(str);
                if (m25916 == null) {
                    this.accessartificialFrame = util.h.xy.bv.ra.b.getHighSpeedVideoSizes;
                    com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_STATE_UNKNOWN;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{-1430248350, 574115266, -1073947184, -1585782853, -296021645, -1721404587, -1420884272, 1168680694, -1081182877, -69723582, 1492303739, 1766922155, -469566652, -610680784, -1878058342, 251506580, 1990423938, -1795698084, -889884346, -203207290, -1330816004, -1242544006, 1492303739, 1766922155, -469566652, -610680784}, android.graphics.ImageFormat.getBitsPerPixel(0) + 53, objArr10);
                    Camera2StreamConfigurationMap(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, 200, -1, null, ((java.lang.String) objArr10[0]).intern(), null));
                    return;
                }
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\ufff5\u0011\b\u0001\u0004\u0002\ufff6\u0004\ufff3", android.graphics.Color.green(0) + 9, 6 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 87, true, objArr11);
                if (((java.lang.String) objArr11[0]).intern().equals(string)) {
                    java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(strArr);
                    getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges2, 1);
                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25910 = util.h.xy.cg.b.m25907().m25910(highSpeedVideoFpsRanges2, m25916, str2);
                    m25910.isSuccessful();
                    m25910.getErrorMessage();
                    m25910.getErrorCode();
                    util.h.xy.bv.rf rfVar = new util.h.xy.bv.rf();
                    if (m25910.isSuccessful() && rfVar.m25757(jSONObject)) {
                        int i2 = getOutputFormats + 73;
                        getHighSpeedVideoFpsRanges = i2 % 128;
                        if (i2 % 2 == 0) {
                            rfVar.m25756(highSpeedVideoFpsRanges2, m25916);
                            throw null;
                        }
                        m25910 = rfVar.m25756(highSpeedVideoFpsRanges2, m25916);
                    }
                    provisioningServiceError2 = !getHighSpeedVideoSizes(m25910, highSpeedVideoFpsRanges2, jSONObject) ? util.h.xy.cg.ra.m25924(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, 200, m25910.getErrorCode(), highSpeedVideoFpsRanges2, m25910.getErrorMessage(), null), provisioningServiceError3) : provisioningServiceError3;
                    try {
                        java.lang.String highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges(strArr));
                        util.h.xy.bv.me meVar = this.getInputSizeshNQ4ISI;
                        if (meVar != null) {
                            meVar.m25714(highSpeedVideoFpsRanges3);
                        }
                        m25924 = provisioningServiceError2;
                    } catch (org.json.JSONException e2) {
                        e = e2;
                        e.getMessage();
                        this.accessartificialFrame = util.h.xy.bv.ra.b.getHighSpeedVideoSizes;
                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.INVALID_SERVER_RESPONSE;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\uffff\f\u0002ﾾ\u000e\uffff\u0017\n\r\uffff\u0002ﾾ\u0010\u0003\u0001\u0003\u0007\u0014\u0003\u0002\uffe7\f\u0001\r\u0010\u0010\u0003\u0001\u0012ﾾ\u0011\u0003\u0010\u0014\u0003\u0010ﾾ\u0001\r\u000b\u000b", android.view.KeyEvent.normalizeMetaState(0) + 41, 20 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 108, false, objArr12);
                        m25924 = util.h.xy.cg.ra.m25924(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes2, 200, -1, null, ((java.lang.String) objArr12[0]).intern(), null), provisioningServiceError2);
                        getHighSpeedVideoFpsRanges(m25924);
                    }
                } else {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u0003\u0000\u0002\uffff\u0006\u000f\u0000\ufff1\t�\u0004\u000f\ufff3\u0002\ufff5\ufff4", android.graphics.Color.green(0) + 16, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getMode(0) + 89, false, objArr13);
                    if (((java.lang.String) objArr13[0]).intern().equals(string)) {
                        java.lang.String highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(strArr);
                        getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges4, 2);
                        util.h.xy.ce.mb.a aVar = new util.h.xy.ce.mb.a();
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25876 = util.h.xy.ce.mb.m25873().m25876(highSpeedVideoFpsRanges4, m25916, str2, aVar);
                        m25876.isSuccessful();
                        if (!m25876.isSuccessful()) {
                            getOutputFormats = (getHighSpeedVideoFpsRanges + 75) % 128;
                            m25876.getErrorMessage();
                        }
                        aVar.m25878();
                        if (getHighSpeedVideoSizes(m25876, highSpeedVideoFpsRanges4, jSONObject)) {
                            util.h.xy.f.b.f2201.m26776(highSpeedVideoFpsRanges4, aVar.m25878(), util.h.xy.k.ra.f2243.m26940(highSpeedVideoFpsRanges4).booleanValue());
                            java.lang.String digitalCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId(highSpeedVideoFpsRanges4);
                            if (digitalCardId != null && digitalCardId.length() > 0 && m25916 == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                                util.h.xy.bb.e eVar = new util.h.xy.bb.e();
                                eVar.m25305(digitalCardId);
                                if (eVar.getState() == com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED) {
                                    eVar.m25309(digitalCardId, null);
                                }
                            }
                        } else {
                            m25924 = util.h.xy.cg.ra.m25924(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, 200, m25876.getErrorCode(), highSpeedVideoFpsRanges4, m25876.getErrorMessage(), null), provisioningServiceError3);
                        }
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\ufff7\u0013\ufff9\u0004�\u000b\ufff8\u0006\ufff5", 10 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 6, 85 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr14);
                        if (((java.lang.String) objArr14[0]).intern().equals(string)) {
                            getOutputFormats = (getHighSpeedVideoFpsRanges + 29) % 128;
                            java.lang.String highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(strArr);
                            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges5, 3);
                            getHighSpeedVideoSizes(util.h.xy.cg.b.m25907().m25909(highSpeedVideoFpsRanges5), highSpeedVideoFpsRanges5, jSONObject);
                        } else {
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{1146306959, 353701300, -2063083196, -2018388310, 1801063877, -304353753, -1850863984, -1533536759}, android.view.View.MeasureSpec.getSize(0) + 16, objArr15);
                            if (((java.lang.String) objArr15[0]).intern().equals(string)) {
                                java.lang.String highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(strArr);
                                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges6, 4);
                                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25874 = util.h.xy.ce.mb.m25873().m25874(highSpeedVideoFpsRanges6, m25916);
                                if (m25916 == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
                                    int i3 = getOutputFormats + 43;
                                    getHighSpeedVideoFpsRanges = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        getHighResolutionOutputSizeshNQ4ISI(m25874);
                                        throw new java.lang.ArithmeticException();
                                    }
                                    getHighResolutionOutputSizeshNQ4ISI(m25874);
                                } else {
                                    getHighSpeedVideoSizes(m25874, highSpeedVideoFpsRanges6, jSONObject);
                                }
                            } else {
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI("\u0004\t\ufff9\b\ufff5\b\u0007\u0013\ufff8\u0006\ufff5\ufff7\u0013\ufff9\b\ufff5\ufff8", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 17, 2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 85 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr16);
                                if (((java.lang.String) objArr16[0]).intern().equals(string)) {
                                    java.lang.String highSpeedVideoFpsRanges7 = getHighSpeedVideoFpsRanges(strArr);
                                    getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges7, 8);
                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = util.h.xy.k.ma.m26925().mo26170(highSpeedVideoFpsRanges7);
                                    if (util.h.xy.u.d.m27514(mo26170)) {
                                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25877 = util.h.xy.ce.mb.m25873().m25877(mo26170.getResult(), m25916);
                                        if (!m25877.isSuccessful()) {
                                            provisioningServiceError3 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR, -2, -1, null, m25877.getErrorMessage(), null);
                                        }
                                        getHighSpeedVideoSizes(m25877, highSpeedVideoFpsRanges7, jSONObject);
                                    } else {
                                        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_INTERNAL_COMPONENT_ERROR;
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI("\u0007\u0010\u0016\u000f\u0005￤\u0002\u0013\u0005\uffc1\u000e\u0002\u0011\u0011\n\u000f\b\uffc1\u000f\u0010\u0015\uffc1", 22 - android.text.TextUtils.getTrimmedLength(""), 6 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 104 - android.view.KeyEvent.keyCodeFromString(""), false, objArr17);
                                        provisioningServiceError3 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, 0, -1, null, ((java.lang.String) objArr17[0]).intern(), null);
                                    }
                                } else {
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor(new int[]{-1158957350, -35694274}, 1 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr18);
                                    getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr18[0]).intern(), 9);
                                }
                            }
                        }
                    }
                }
                getHighSpeedVideoFpsRanges(m25924);
            }
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{-1158957350, -35694274}, 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr19);
            getHighResolutionOutputSizeshNQ4ISI(((java.lang.String) objArr19[0]).intern(), 7);
            util.h.xy.m.mb m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
            this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
            this.getOutputSizeshNQ4ISI = strArr.length;
            for (java.lang.String str3 : strArr) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo261482 = m26975.mo26148(str3);
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1146234258, 867461243}, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, objArr20);
                java.lang.String intern2 = ((java.lang.String) objArr20[0]).intern();
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1392847582, 1425918361, 80702269, 1551959877, 787091518, 1104272258}, 11 - android.view.View.MeasureSpec.getMode(0), objArr21);
                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr21[0]).intern());
                if (getHighSpeedVideoFpsRanges(mo261482)) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 61) % 128;
                    bVar = mo261482.getResult();
                    if (this.accessartificialFrame == util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
                        this.accessartificialFrame = util.h.xy.bv.ra.b.getHighSpeedVideoSizes;
                    } else {
                        this.accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
                    }
                } else {
                    bVar = null;
                }
                this.getHighSpeedVideoSizesFor.add(bVar);
                if (bVar != null) {
                    bVar.m26143();
                }
                if (this.getOutputSizeshNQ4ISI > 0 && this.getHighSpeedVideoSizesFor.size() == this.getOutputSizeshNQ4ISI) {
                    if (this.accessartificialFrame != util.h.xy.bv.ra.b.getHighSpeedVideoSizes) {
                        java.util.List<util.h.xy.d.b> list = this.getHighSpeedVideoSizesFor;
                        if (list.get(list.size() - 1) != null) {
                            m25741(this.isOutputSupportedFor, provisioningServiceError3);
                            return;
                        }
                    }
                    m25924 = util.h.xy.cg.ra.m25924(new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR, 200, this.CoroutineDebuggingKt, null, this.unwrapAs, null), provisioningServiceError3);
                    getHighSpeedVideoFpsRanges(m25924);
                }
            }
        }
        m25924 = provisioningServiceError3;
        getHighSpeedVideoFpsRanges(m25924);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) throws org.json.JSONException {
        java.lang.String digitalCardId = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalCardId(str);
        if (digitalCardId == null) {
            return null;
        }
        getHighSpeedVideoFpsRanges = (getOutputFormats + 35) % 128;
        try {
            byte[] m25216 = util.h.xy.au.rg.m25213(util.h.xy.ag.a.m24556().m24558()).m25216(digitalCardId);
            if (m25216 == null) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25216));
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u000f\u0000\uffdf\uffff\r￼\ufffe\u000e\u0007\u0004￼", 12 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 7 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 111 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, objArr);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ufff8\ufffe\u0001\t", 4 - android.view.KeyEvent.getDeadChar(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 119, false, objArr2);
            if (!jSONObject2.has(((java.lang.String) objArr2[0]).intern())) {
                return null;
            }
            getOutputFormats = (getHighSpeedVideoFpsRanges + 43) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ufff8\ufffe\u0001\t", android.text.TextUtils.indexOf("", "", 0, 0) + 4, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 119, false, objArr3);
            return jSONObject2.getString(((java.lang.String) objArr3[0]).intern());
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException unused) {
            return null;
        }
    }

    private boolean getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult, java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException {
        boolean z;
        if (getHighSpeedVideoFpsRanges(asyncResult)) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 33) % 128;
            this.accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges(str, jSONObject);
            z = true;
        } else {
            z = false;
        }
        int i = getHighSpeedVideoFpsRanges + 117;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return z;
        }
        throw null;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult) throws org.json.JSONException {
        if (!getHighSpeedVideoFpsRanges(asyncResult)) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 49) % 128;
            return false;
        }
        getOutputFormats = (getHighSpeedVideoFpsRanges + 43) % 128;
        this.accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
        getOutputFormats = (getHighSpeedVideoFpsRanges + 41) % 128;
        return true;
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException {
        int i = getHighSpeedVideoFpsRanges + 51;
        getOutputFormats = i % 128;
        int i2 = i % 2;
        getHighSpeedVideoFpsRangesFor(new java.lang.String[]{str}, jSONObject, true);
        int i3 = getHighSpeedVideoFpsRanges + 71;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr, org.json.JSONObject jSONObject, boolean z) throws org.json.JSONException {
        if (this.getOutputMinFrameDurationlomOqCM != null) {
            final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage m25923 = util.h.xy.cg.ra.m25923(jSONObject);
            int i = 0;
            if (z) {
                getOutputFormats = (getHighSpeedVideoFpsRanges + 67) % 128;
                if (m25923 == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{968290360, 507665298, -795762497, -1989406090}, 8 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\u0016\b\u0015\t\b\u0015ￃ\u0007\u000f\u0018\u0012\u000b\u0016ￃ\u0011\u0012\f\u0017\u0004\u0006\f\u000f\u0013\u0013\u0004ￃ\b\u000b\u0017ￃ\u0017\u0018￥ￃￄￄ\u0015\b\u0019\u0015\b\u0016ￃ\u0010\u0012\u0015\tￃ\u0011\u0012\f\u0017\u0004\u0010\u0015\u0012\t\u0011\fￃ\n\u0011\f\u0016\u0016\f\ufff0\u0007\b\u0017\u0004\u0007\u0013\u0018ￃ\u0011\b\b\u0005ￃ\u0016\u0004\u000bￃ\b\u0016\u0004\u0005\u0004\u0017\u0004\u0007ￃ\u0007\u0015\u0004\u0006ￃ\b\u000b\u0017ￃ\u0016\u0004ￃ￬\ufff8ￃ\b\u000b\u0017ￃ\u000b", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 113, 67 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 101 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, objArr2);
                    m25923 = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage(intern, ((java.lang.String) objArr2[0]).intern(), null, com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification.INFO);
                }
            }
            if (m25923 != null) {
                if (strArr == null) {
                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bv.ra.2
                        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                        private static int getHighSpeedVideoFpsRangesFor = 0;
                        private static int getHighSpeedVideoSizes = 0;
                        private static int getHighSpeedVideoSizesFor = 1;
                        private static char[] getInputSizeshNQ4ISI = {44540, 64550, 3701, 22689, 40043, 52653, 16353, 26964, 56179, 1189, 30401, 40978, 4662, 17297, 44487, 8167};
                        private static long getOutputMinFrameDuration = 8021480104437337543L;

                        private static void Camera2StreamConfigurationMap(int i2, int i3, char c, java.lang.Object[] objArr3) {
                            int i4;
                            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
                            long[] jArr = new long[i2];
                            rbVar.f2651 = 0;
                            while (rbVar.f2651 < i2) {
                                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                                jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i3] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
                                rbVar.f2651++;
                            }
                            char[] cArr = new char[i2];
                            rbVar.f2651 = 0;
                            while (rbVar.f2651 < i2) {
                                int i5 = getHighSpeedVideoFpsRangesFor + 19;
                                getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                                if (i5 % 2 == 0) {
                                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                    i4 = rbVar.f2651 - 1;
                                } else {
                                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                                    i4 = rbVar.f2651 + 1;
                                }
                                rbVar.f2651 = i4;
                            }
                            objArr3[0] = new java.lang.String(cArr);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap(3 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (char) (12721 - android.view.View.combineMeasuredStates(0, 0)), objArr3);
                            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 111) % 128;
                            try {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 13, 4 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 41), objArr4);
                                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                                if (util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this) != null) {
                                    getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 5) % 128;
                                    util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onServerMessage(null, m25923);
                                    getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 13) % 128;
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                    });
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 71) % 128;
                } else {
                    int length = strArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        final java.lang.String str = strArr[i2];
                        java.lang.String msgCode = m25923.getMsgCode();
                        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        long globalActionKeyTimeout2 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        int defaultSize = android.view.View.getDefaultSize(i, i);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("\u0013\uffd1\u0015\u0012\u0015\u0015\b\uffd1\ufff3￥￦\u0007\b\u000e\u0006\u0012\uffef\u0011\f", 20 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (globalActionKeyTimeout2 > 0L ? 1 : (globalActionKeyTimeout2 == 0L ? 0 : -1)) + 10, 102 - defaultSize, true, objArr3);
                        if (msgCode.equals(((java.lang.String) objArr3[0]).intern())) {
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> m25926 = util.h.xy.cg.ra.m25926(str);
                            if (m25926.isSuccessful()) {
                                util.h.xy.cg.ra.m25920(str, m25926.getResult().getState());
                            }
                        }
                        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bv.ra.1
                            private static int Camera2StreamConfigurationMap = 1;
                            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                            private static int getInputFormats = 0;
                            private static int getOutputFormats = 1;
                            private static char[] getOutputMinFrameDuration = {42298, 42383, 42373, 42375, 42255, 42488, 42491, 42438, 42439, 42480, 42479, 42477, 42492, 42493, 42478, 42479};

                            private static void getHighSpeedVideoFpsRanges(boolean z2, int[] iArr, java.lang.String str2, java.lang.Object[] objArr4) {
                                char[] cArr;
                                byte[] bytes = str2.getBytes("ISO-8859-1");
                                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                                int i3 = iArr[0];
                                int i4 = iArr[1];
                                int i5 = iArr[2];
                                int i6 = iArr[3];
                                char[] cArr2 = getOutputMinFrameDuration;
                                if (cArr2 != null) {
                                    int length2 = cArr2.length;
                                    char[] cArr3 = new char[length2];
                                    for (int i7 = 0; i7 < length2; i7++) {
                                        cArr3[i7] = (char) (cArr2[i7] ^ (-8125198844289309347L));
                                    }
                                    cArr2 = cArr3;
                                }
                                char[] cArr4 = new char[i4];
                                java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i4);
                                if (bytes != null) {
                                    int i8 = Camera2StreamConfigurationMap + 61;
                                    getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        cArr = new char[i4];
                                        maVar.f2631 = 1;
                                    } else {
                                        cArr = new char[i4];
                                        maVar.f2631 = 0;
                                    }
                                    char c = 0;
                                    while (maVar.f2631 < i4) {
                                        int i9 = Camera2StreamConfigurationMap + 111;
                                        getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                                        if (i9 % 2 == 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 1) {
                                            cArr[maVar.f2631] = (char) ((cArr4[maVar.f2631] * 2) - c);
                                        } else {
                                            cArr[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 2) + 1) - c);
                                        }
                                        c = cArr[maVar.f2631];
                                        maVar.f2631++;
                                    }
                                    cArr4 = cArr;
                                }
                                if (i6 > 0) {
                                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
                                    char[] cArr5 = new char[i4];
                                    java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i4);
                                    int i10 = i4 - i6;
                                    java.lang.System.arraycopy(cArr5, 0, cArr4, i10, i6);
                                    java.lang.System.arraycopy(cArr5, i6, cArr4, 0, i10);
                                    int i11 = getHighResolutionOutputSizeshNQ4ISI + 33;
                                    Camera2StreamConfigurationMap = i11 % 128;
                                    int i12 = i11 % 2;
                                }
                                if (z2) {
                                    char[] cArr6 = new char[i4];
                                    maVar.f2631 = 0;
                                    while (maVar.f2631 < i4) {
                                        cArr6[maVar.f2631] = cArr4[(i4 - maVar.f2631) - 1];
                                        maVar.f2631++;
                                    }
                                    cArr4 = cArr6;
                                }
                                if (i5 > 0) {
                                    int i13 = Camera2StreamConfigurationMap + 101;
                                    getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        maVar.f2631 = 1;
                                    } else {
                                        maVar.f2631 = 0;
                                    }
                                    while (maVar.f2631 < i4) {
                                        cArr4[maVar.f2631] = (char) (cArr4[maVar.f2631] - iArr[2]);
                                        maVar.f2631++;
                                    }
                                }
                                objArr4[0] = new java.lang.String(cArr4);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (!util.h.xy.bv.ra.Camera2StreamConfigurationMap()) {
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 140, 0}, "\u0001\u0000\u0001\u0000", objArr4);
                                    java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(false, new int[]{4, 12, 98, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000", objArr5);
                                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                                    if (util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this) != null) {
                                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = util.h.xy.k.ma.m26925().mo26170(str);
                                        if (!mo26170.isSuccessful()) {
                                            util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onServerMessage(str, m25923);
                                            return;
                                        } else {
                                            getOutputFormats = (getInputFormats + 81) % 128;
                                            util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onServerMessage(mo26170.getResult().m26180(), m25923);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                int i3 = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                getInputFormats = i3 % 128;
                                if (i3 % 2 != 0) {
                                    util.h.xy.j.ma.f2241.m26900();
                                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN;
                                    throw new java.lang.ArithmeticException();
                                }
                                com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m26900 = util.h.xy.j.ma.f2241.m26900();
                                if ((m26900 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN || !util.h.xy.w.ra.m27672().m27675()) && m26900 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
                                    int i4 = getOutputFormats + 47;
                                    getInputFormats = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod2 = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD;
                                        throw null;
                                    }
                                    if (m26900 != com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                                        util.h.xy.bv.ra.getHighSpeedVideoFpsRanges();
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 140, 0}, "\u0001\u0000\u0001\u0000", objArr6);
                                        java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRanges(false, new int[]{4, 12, 98, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000", objArr7);
                                        util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr7[0]).intern());
                                        if (util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this) != null) {
                                            util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onServerMessage("", m25923);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(true, new int[]{0, 4, 140, 0}, "\u0001\u0000\u0001\u0000", objArr8);
                                java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges(false, new int[]{4, 12, 98, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000", objArr9);
                                util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr9[0]).intern());
                                if (util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this) != null) {
                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo261702 = util.h.xy.k.ma.m26925().mo26170(str);
                                    if (mo261702.isSuccessful()) {
                                        getInputFormats = (getOutputFormats + 115) % 128;
                                        util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onServerMessage(mo261702.getResult().m26180(), m25923);
                                    } else {
                                        util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onServerMessage(str, m25923);
                                        getInputFormats = (getOutputFormats + 79) % 128;
                                    }
                                }
                            }
                        });
                        i2++;
                        i = 0;
                    }
                }
                this.accessartificialFrame = util.h.xy.bv.ra.b.Camera2StreamConfigurationMap;
                return;
            }
            return;
        }
        getOutputFormats = (getHighSpeedVideoFpsRanges + 117) % 128;
    }

    private void Camera2StreamConfigurationMap(final com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError provisioningServiceError) {
        if (provisioningServiceError == null) {
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0004\f\u0011ￃ\u000f\u0004\u0017\b\u0015￦\ufff3\ufff6ￃ\u0006\u0012\u0010\u0010\u0018\u0011\u0006\u0004\u0017\f\u0012\u0011ￃ\b\u0015\u0015\u0012\u0015ￏￃ\ufff3\u000f\b\u0004\u0016\bￃ\u0017\u0015\u001cￃ\u0004\n", 45 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 9 - android.view.Gravity.getAbsoluteGravity(0, 0), 102 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), false, objArr);
                provisioningServiceError = new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes, -2, -2, null, ((java.lang.String) objArr[0]).intern(), null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        provisioningServiceError.getErrorMessage();
        getHighSpeedVideoFpsRangesFor();
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bv.ra.4
            private static int Camera2StreamConfigurationMap = 0;
            private static short[] getHighSpeedVideoFpsRangesFor = null;
            private static int getHighSpeedVideoSizes = 1;
            private static int getHighSpeedVideoSizesFor = -2008343613;
            private static int getInputFormats = -408873018;
            private static int getInputSizeshNQ4ISI = 265415485;
            private static byte[] getOutputFormats = {62, -46, -47, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 10, 37, 110, 59, 60, 9, 38, com.google.common.base.Ascii.GS, 6, 4};
            private static int getOutputMinFrameDuration = 0;
            private static int getOutputStallDurationlomOqCM = 1;

            private static void getHighSpeedVideoFpsRanges(int i, short s, byte b2, int i2, int i3, java.lang.Object[] objArr2) {
                boolean z;
                int i4;
                boolean z2;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i5 = i2 + ((int) (getInputFormats ^ (-2689713159175858216L)));
                if (i5 == -1) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 25) % 128;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 87) % 128;
                    byte[] bArr = getOutputFormats;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                        }
                        bArr = bArr2;
                    }
                    i5 = bArr != null ? (byte) (((byte) (getOutputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoFpsRangesFor[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
                }
                if (i5 > 0) {
                    int i7 = (int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L));
                    if (z) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 125) % 128;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    meVar.f2647 = ((i + i5) - 2) + i7 + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = getOutputFormats;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 97) % 128;
                            bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                        }
                        bArr3 = bArr4;
                    }
                    if (bArr3 != null) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 107) % 128;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        if (z2) {
                            byte[] bArr5 = getOutputFormats;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b2));
                        } else {
                            short[] sArr = getHighSpeedVideoFpsRangesFor;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b2));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
                java.lang.String obj = sb.toString();
                int i9 = Camera2StreamConfigurationMap + 73;
                getHighSpeedVideoSizes = i9 % 128;
                if (i9 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                objArr2[0] = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                getOutputMinFrameDuration = (getOutputStallDurationlomOqCM + 59) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(395248412 + android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (short) ((-16) - android.view.Gravity.getAbsoluteGravity(0, 0)), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf("", "") - 31, android.graphics.Color.alpha(0) - 1877609423, objArr2);
                java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 751, (short) (36 - android.graphics.Color.blue(0)), (byte) android.view.View.resolveSizeAndState(0, 0, 0), (-31) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (-1877609432) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                    if (util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this) != null) {
                        getOutputStallDurationlomOqCM = (getOutputMinFrameDuration + 37) % 128;
                        util.h.xy.bv.ra.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bv.ra.this).onError(provisioningServiceError);
                    }
                    getOutputStallDurationlomOqCM = (getOutputMinFrameDuration + 43) % 128;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        });
    }

    private void getHighSpeedVideoFpsRangesFor() {
        int i = getOutputFormats + 45;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ca.b bVar = (util.h.xy.ca.b) com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
            if (bVar != null) {
                bVar.m25839(false);
            }
            util.h.xy.ag.a.m24556().m24558().stopService(this.getOutputStallDurationlomOqCM);
            getHighSpeedVideoFpsRanges = (getOutputFormats + 115) % 128;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    private boolean getHighSpeedVideoFpsRanges(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<?> asyncResult) {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 43) % 128;
        if (asyncResult.isSuccessful()) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 11) % 128;
            return true;
        }
        this.accessartificialFrame = util.h.xy.bv.ra.b.getHighSpeedVideoSizes;
        int errorCode = asyncResult.getErrorCode();
        if (errorCode == 1011) {
            this.CoroutineDebuggingKt = 561;
        } else {
            if (errorCode != 551 && errorCode != 585 && errorCode != 561) {
                getOutputFormats = (getHighSpeedVideoFpsRanges + 31) % 128;
                if (errorCode != 607) {
                    this.CoroutineDebuggingKt = 583;
                }
            }
            this.CoroutineDebuggingKt = errorCode;
            getOutputFormats = (getHighSpeedVideoFpsRanges + 37) % 128;
        }
        this.unwrapAs = asyncResult.getErrorMessage();
        return false;
    }

    private void getHighSpeedVideoFpsRanges(java.lang.Exception exc) {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 45) % 128;
        this.accessartificialFrame = util.h.xy.bv.ra.b.getHighSpeedVideoSizes;
        this.CoroutineDebuggingKt = 583;
        this.unwrapAs = exc.getLocalizedMessage();
        int i = getHighSpeedVideoFpsRanges + 59;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static boolean getHighSpeedVideoSizesFor() {
        boolean z;
        int i = getOutputFormats + 67;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0 ? util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435 : util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2435) {
            if (util.h.xy.f.b.f2201.m26775() != util.h.xy.u.b.f2433) {
                z = false;
                getOutputFormats = (getHighSpeedVideoFpsRanges + 17) % 128;
                return z;
            }
        }
        z = true;
        getOutputFormats = (getHighSpeedVideoFpsRanges + 17) % 128;
        return z;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i) {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 21) % 128;
        util.h.xy.ak.ma.f84.m24975(str, util.h.xy.ak.ma.f84.m24973(str));
        util.h.xy.ak.ma.f84.m24979(str, i);
        getOutputFormats = (getHighSpeedVideoFpsRanges + 81) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighResolutionOutputSizeshNQ4ISI = new int[]{-747561447, -1193050719, 719160928, -421258230, -1505570637, 82391584, 2034742799, -1445196243, -1340771267, 510880355, 2021038470, 1871294035, -1276694003, -235255945, 1034313260, -155414115, -1388139678, -1259428470};
    }

    static void getHighSpeedVideoSizes() {
        getInputFormats = -1231763809;
        getOutputMinFrameDuration = new int[]{-427303671, -2076732297, 1990439499, -1972769106, -1183933452, 2009669743, -196431656, -1582717592, 1737701855, -1486311541, -152320197, 1010861057, 172075619, -1279468768, 2103897174, -1579452210, -2047080495, -372944456};
    }
}
