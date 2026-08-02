package util.h.xy.bq;

/* loaded from: classes18.dex */
public class rc extends com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats;
    private static long getOutputFormats;
    private static int getOutputMinFrameDuration;
    private char CoroutineDebuggingKt;
    private byte[] accessartificialFrame;
    private byte[] coroutineCreation;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private com.gemalto.mfs.mwsdk.payment.engine.MerchantIdentifier getOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private long getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private char toString;
    private com.gemalto.mfs.mwsdk.dcm.PaymentType unwrapAs;

    /* synthetic */ rc(byte b) {
        this();
    }

    static /* synthetic */ byte[] Camera2StreamConfigurationMap(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (i + 43) % 128;
        rcVar.getInputSizeshNQ4ISI = bArr;
        int i2 = i + 11;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ char getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.rc rcVar, char c) {
        int i = (getHighSpeedVideoSizesFor + 63) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        rcVar.toString = c;
        int i2 = i + 9;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return c;
        }
        throw null;
    }

    static /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.rc rcVar, long j) {
        int i = getHighSpeedVideoSizesFor + 31;
        getHighSpeedVideoFpsRangesFor = i % 128;
        rcVar.getValidOutputFormatsForInputhNQ4ISI = j;
        if (i % 2 == 0) {
            return j;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.dcm.PaymentType getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.rc rcVar, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        int i = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        getHighSpeedVideoSizesFor = i;
        rcVar.unwrapAs = paymentType;
        int i2 = i + 1;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return paymentType;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizesFor = (i + 45) % 128;
        rcVar.getOutputSizes = bArr;
        int i2 = i + 115;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighSpeedVideoFpsRanges(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizesFor = (i + 97) % 128;
        rcVar.getOutputMinFrameDurationlomOqCM = bArr;
        getHighSpeedVideoSizesFor = (i + 85) % 128;
        return bArr;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType getHighSpeedVideoFpsRangesFor(util.h.xy.bq.rc rcVar, com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType) {
        int i = getHighSpeedVideoSizesFor + 41;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        rcVar.getOutputStallDuration = cryptogramDataType;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 83;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return cryptogramDataType;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.bq.rc rcVar) {
        int i = getHighSpeedVideoSizesFor + 71;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] bArr = rcVar.isOutputSupportedFor;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = (getHighSpeedVideoSizesFor + 115) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        rcVar.isOutputSupportedFor = bArr;
        getHighSpeedVideoSizesFor = (i + 25) % 128;
        return bArr;
    }

    static /* synthetic */ char getHighSpeedVideoSizes(util.h.xy.bq.rc rcVar, char c) {
        int i = getHighSpeedVideoSizesFor + 79;
        getHighSpeedVideoFpsRangesFor = i % 128;
        rcVar.CoroutineDebuggingKt = c;
        if (i % 2 == 0) {
            return c;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoSizes(util.h.xy.bq.rc rcVar, java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 91;
        getHighSpeedVideoSizesFor = i % 128;
        rcVar.isOutputSupportedForhNQ4ISI = str;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ byte[] getHighSpeedVideoSizes(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (i + 67) % 128;
        rcVar.accessartificialFrame = bArr;
        getHighSpeedVideoFpsRangesFor = (i + 109) % 128;
        return bArr;
    }

    static /* synthetic */ byte[] getInputFormats(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 19;
        getHighSpeedVideoSizesFor = i % 128;
        rcVar.coroutineCreation = bArr;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ byte[] getInputSizeshNQ4ISI(util.h.xy.bq.rc rcVar, byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 81;
        getHighSpeedVideoSizesFor = i2 % 128;
        rcVar.getOutputStallDurationlomOqCM = bArr;
        if (i2 % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoSizesFor = (i + 47) % 128;
        return bArr;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = "rc";
        int i = getHighSpeedVideoFpsRangesFor + 97;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private rc() {
        this.isOutputSupportedFor = new byte[0];
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public long m25578() {
        int i = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        getHighSpeedVideoSizesFor = i;
        long j = this.getValidOutputFormatsForInputhNQ4ISI;
        int i2 = i + 117;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return j;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public char m25581() {
        int i = getHighSpeedVideoSizesFor + 117;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.toString;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public char m25583() {
        int i = getHighSpeedVideoSizesFor + 119;
        getHighSpeedVideoFpsRangesFor = i % 128;
        char c = this.CoroutineDebuggingKt;
        if (i % 2 == 0) {
            return c;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m25577() {
        int i = getHighSpeedVideoFpsRangesFor + 13;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return this.coroutineCreation;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m25580() {
        int i = getHighSpeedVideoSizesFor + 101;
        getHighSpeedVideoFpsRangesFor = i % 128;
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m25572() {
        int i = (getHighSpeedVideoFpsRangesFor + 27) % 128;
        getHighSpeedVideoSizesFor = i;
        byte[] bArr = this.isOutputSupportedFor;
        getHighSpeedVideoFpsRangesFor = (i + 23) % 128;
        return bArr;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] m25582() {
        int i = getHighSpeedVideoSizesFor + 23;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.getInputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m25574() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 87;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getOutputStallDurationlomOqCM;
        getHighSpeedVideoSizesFor = (i + 93) % 128;
        return bArr;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] m25584() {
        int i = (getHighSpeedVideoFpsRangesFor + 69) % 128;
        getHighSpeedVideoSizesFor = i;
        byte[] bArr = this.getOutputSizes;
        int i2 = i + 37;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public java.lang.String m25573() {
        int i = getHighSpeedVideoSizesFor + 55;
        getHighSpeedVideoFpsRangesFor = i % 128;
        java.lang.String str = this.isOutputSupportedForhNQ4ISI;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public static final class a {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static char[] getHighSpeedVideoSizes;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static java.lang.String f1028;
        private byte[] getHighSpeedVideoSizesFor;
        private byte[] getInputFormats;
        private byte[] getInputSizeshNQ4ISI;
        private java.util.ArrayList<util.h.xy.bq.rc.a.ra> getOutputFormats;
        private byte[] getOutputMinFrameDuration;
        private com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType getOutputMinFrameDurationlomOqCM;
        private com.gemalto.mfs.mwsdk.dcm.PaymentType getOutputSizes;
        private char getOutputSizeshNQ4ISI;
        private java.lang.String getOutputStallDuration;
        private char getOutputStallDurationlomOqCM;
        private byte[] getValidOutputFormatsForInputhNQ4ISI;
        private long toString;
        private byte[] unwrapAs;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        static final class ra {
            public static final util.h.xy.bq.rc.a.ra Camera2StreamConfigurationMap;
            public static final util.h.xy.bq.rc.a.ra getHighResolutionOutputSizeshNQ4ISI;
            public static final util.h.xy.bq.rc.a.ra getHighSpeedVideoFpsRanges;
            public static final util.h.xy.bq.rc.a.ra getHighSpeedVideoFpsRangesFor;
            public static final util.h.xy.bq.rc.a.ra getHighSpeedVideoSizes;
            private static int getHighSpeedVideoSizesFor = 1;
            public static final util.h.xy.bq.rc.a.ra getInputFormats;
            private static int getInputSizeshNQ4ISI = 0;
            private static int[] getOutputFormats = null;
            public static final util.h.xy.bq.rc.a.ra getOutputMinFrameDuration;
            private static int getOutputSizeshNQ4ISI = 1;
            private static final /* synthetic */ util.h.xy.bq.rc.a.ra[] getOutputStallDuration;
            private static int getOutputStallDurationlomOqCM;

            private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
                int i2;
                int length;
                int[] iArr2;
                int i3;
                int i4;
                util.h.xz.b.c cVar = new util.h.xz.b.c();
                char[] cArr = new char[4];
                int i5 = 2;
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = getOutputFormats;
                if (iArr3 != null) {
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        iArr4[i6] = (int) (iArr3[i6] ^ (-5569649899877129369L));
                    }
                    iArr3 = iArr4;
                }
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int[] iArr6 = getOutputFormats;
                if (iArr6 != null) {
                    int i7 = getHighSpeedVideoSizesFor + 47;
                    getInputSizeshNQ4ISI = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i3 = 1;
                    } else {
                        length = iArr6.length;
                        iArr2 = new int[length];
                        i3 = 0;
                    }
                    while (i3 < length) {
                        int i8 = getInputSizeshNQ4ISI + 53;
                        int i9 = i8 % 128;
                        getHighSpeedVideoSizesFor = i9;
                        if (i8 % i5 == 0) {
                            i4 = length3;
                            iArr2[i3] = (int) (iArr6[i3] ^ (-5569649899877129369L));
                            i3 >>>= 1;
                        } else {
                            i4 = length3;
                            iArr2[i3] = (int) (iArr6[i3] ^ (-5569649899877129369L));
                            i3++;
                        }
                        getInputSizeshNQ4ISI = (i9 + 27) % 128;
                        length3 = i4;
                        i5 = 2;
                    }
                    i2 = length3;
                    iArr6 = iArr2;
                } else {
                    i2 = length3;
                }
                java.lang.System.arraycopy(iArr6, 0, iArr5, 0, i2);
                cVar.f2626 = 0;
                while (cVar.f2626 < iArr.length) {
                    cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                    cArr[1] = (char) iArr[cVar.f2626];
                    cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                    cArr[3] = (char) iArr[cVar.f2626 + 1];
                    cVar.f2627 = (cArr[0] << 16) + cArr[1];
                    cVar.f2625 = (cArr[2] << 16) + cArr[3];
                    util.h.xz.b.c.m27723(iArr5);
                    for (int i10 = 0; i10 < 16; i10++) {
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 85) % 128;
                        cVar.f2627 ^= iArr5[i10];
                        cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                        int i11 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i11;
                    }
                    int i12 = cVar.f2627;
                    cVar.f2627 = cVar.f2625;
                    cVar.f2625 = i12;
                    cVar.f2625 ^= iArr5[16];
                    cVar.f2627 ^= iArr5[17];
                    int i13 = cVar.f2627;
                    int i14 = cVar.f2625;
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
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            private ra(java.lang.String str, int i) {
            }

            public static util.h.xy.bq.rc.a.ra valueOf(java.lang.String str) {
                int i = getOutputStallDurationlomOqCM + 73;
                getOutputSizeshNQ4ISI = i % 128;
                util.h.xy.bq.rc.a.ra raVar = (util.h.xy.bq.rc.a.ra) java.lang.Enum.valueOf(util.h.xy.bq.rc.a.ra.class, str);
                if (i % 2 != 0) {
                    return raVar;
                }
                throw new java.lang.ArithmeticException();
            }

            public static util.h.xy.bq.rc.a.ra[] values() {
                getOutputSizeshNQ4ISI = (getOutputStallDurationlomOqCM + 103) % 128;
                util.h.xy.bq.rc.a.ra[] raVarArr = (util.h.xy.bq.rc.a.ra[]) getOutputStallDuration.clone();
                getOutputSizeshNQ4ISI = (getOutputStallDurationlomOqCM + 17) % 128;
                return raVarArr;
            }

            static {
                util.h.xy.bq.rc.a.ra[] raVarArr;
                getHighSpeedVideoFpsRangesFor();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{479187969, -1515504156, -1063731560, -1762552036, -184545395, -891519489, -1335173838, -1529953834, -303261983, 669951019}, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, objArr);
                util.h.xy.bq.rc.a.ra raVar = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr[0]).intern(), 0);
                getInputFormats = raVar;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{956880553, 340507862, 804109480, -1265872146, 1825471535, 1180100857, 838827215, -69492671, -457050605, -261003823, 1413993137, -474694880, -182147939, 207922676, 474383831, 418963982}, android.view.View.getDefaultSize(0, 0) + 32, objArr2);
                util.h.xy.bq.rc.a.ra raVar2 = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr2[0]).intern(), 1);
                getHighSpeedVideoFpsRanges = raVar2;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-177935571, -444989727, -2026523330, 905262814, -1557888289, 1011707092, -567168607, -812793318, 1428451103, -1459361934, 882227585, 886843568, 1604879007, 1300697418, -980608147, -1443599500, 2025481373, -1313619802}, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 35, objArr3);
                util.h.xy.bq.rc.a.ra raVar3 = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr3[0]).intern(), 2);
                getOutputMinFrameDuration = raVar3;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{14052580, -88588116, -463747922, -1609906089, -837295576, -2094967222, 488937689, -317191515, -971890979, -455475904, -1652161011, -943591811, 1230462429, 361004288, 1628803519, -1380442987, 1279372961, 2008385252, 1836091803, 461797714}, android.graphics.Color.red(0) + 37, objArr4);
                util.h.xy.bq.rc.a.ra raVar4 = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr4[0]).intern(), 3);
                getHighSpeedVideoSizes = raVar4;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1273008388, 610812849, -463747922, -1609906089, -837295576, -2094967222, 488937689, -317191515, -971890979, -455475904, -1652161011, -943591811, 1230462429, 361004288, 1628803519, -1380442987, 1279372961, 2008385252, 1836091803, 461797714}, 38 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
                util.h.xy.bq.rc.a.ra raVar5 = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr5[0]).intern(), 4);
                getHighSpeedVideoFpsRangesFor = raVar5;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-262258738, -1229680303, 1825471535, 1180100857, 838827215, -69492671, -457050605, -261003823, 1413993137, -474694880, -182147939, 207922676, 474383831, 418963982}, 28 - android.graphics.Color.alpha(0), objArr6);
                util.h.xy.bq.rc.a.ra raVar6 = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr6[0]).intern(), 5);
                Camera2StreamConfigurationMap = raVar6;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-1273008388, 610812849, -1515937808, -1753740180, 488937689, -317191515, -971890979, -455475904, -1652161011, -943591811, 1230462429, 361004288, 1628803519, -1380442987, 1279372961, 2008385252, 1836091803, 461797714}, 34 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
                util.h.xy.bq.rc.a.ra raVar7 = new util.h.xy.bq.rc.a.ra(((java.lang.String) objArr7[0]).intern(), 6);
                getHighResolutionOutputSizeshNQ4ISI = raVar7;
                int i = getOutputStallDurationlomOqCM + 83;
                int i2 = i % 128;
                getOutputSizeshNQ4ISI = i2;
                if (i % 2 == 0) {
                    raVarArr = new util.h.xy.bq.rc.a.ra[58];
                    raVarArr[0] = raVar;
                    raVarArr[1] = raVar2;
                    raVarArr[5] = raVar3;
                    raVarArr[2] = raVar4;
                    raVarArr[5] = raVar5;
                    raVarArr[3] = raVar6;
                    raVarArr[116] = raVar7;
                } else {
                    raVarArr = new util.h.xy.bq.rc.a.ra[]{raVar, raVar2, raVar3, raVar4, raVar5, raVar6, raVar7};
                }
                getOutputStallDuration = raVarArr;
                getOutputStallDurationlomOqCM = (i2 + 113) % 128;
            }

            static void getHighSpeedVideoFpsRangesFor() {
                getOutputFormats = new int[]{1689469707, 1266380324, -1648029462, -1854051584, 2016843594, 342300056, -727709335, 2140704159, 825045357, -1756783415, 783954566, -579557873, 935894177, 2029691029, -576869659, 494370879, 94867809, -271884219};
            }
        }

        static {
            Camera2StreamConfigurationMap();
            f1028 = com.gemalto.mfs.mwsdk.payment.engine.PaymentInputData.PaymentInputBuilder.class.getName();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 93) % 128;
        }

        public a(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
            this.getOutputFormats = new java.util.ArrayList<>();
            util.h.xy.bq.mc mcVar = util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.bq.mc.Camera2StreamConfigurationMap(paymentType);
            this.getOutputSizes = paymentType;
            java.util.ArrayList<util.h.xy.bq.rc.a.ra> arrayList = new java.util.ArrayList<>();
            this.getOutputFormats = arrayList;
            arrayList.add(util.h.xy.bq.rc.a.ra.getInputFormats);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.bq.rc.a m25587(long j, char c) {
            int i = getHighSpeedVideoFpsRanges + 67;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                util.h.xy.bq.mc mcVar = util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI;
                util.h.xy.bq.mc.Camera2StreamConfigurationMap(j, c);
                this.toString = j;
                this.getOutputStallDurationlomOqCM = c;
                this.getOutputFormats.add(util.h.xy.bq.rc.a.ra.getHighSpeedVideoFpsRanges);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 37) % 128;
                return this;
            }
            util.h.xy.bq.mc mcVar2 = util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.bq.mc.Camera2StreamConfigurationMap(j, c);
            this.toString = j;
            this.getOutputStallDurationlomOqCM = c;
            this.getOutputFormats.add(util.h.xy.bq.rc.a.ra.getHighSpeedVideoFpsRanges);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
        
            r1 = new java.lang.Object[1];
            util.h.xy.bq.mc.Camera2StreamConfigurationMap("餃饖\uf28e蜪藵뛇渱ퟫ乎븘䜠踢㜧훵ᱳ뤅ᰞ৬\uf497偤엎₆춤ୋꫫ孰髀⎌鎚牀獑\udaec筣ꔏ䠼\uf5d4‧\udde1ⅅ걸", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22, r1);
            util.h.xy.bq.mc.getHighSpeedVideoSizes(((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
        
            r6 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
        
            r7 = r6.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
        
            if (r7 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
        
            throw r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        
            throw r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
        
            r1 = new java.lang.Object[1];
            util.h.xy.bq.mc.Camera2StreamConfigurationMap("㋇㊎闅\ue061粑呑靳㕮\ue583\ud95e빉泷鳢놱\ue505宍럚滣෴다渓䟎㓇\ue9c3Ū㱷掣섂㡚ᔝ詰㡭", android.graphics.drawable.Drawable.resolveOpacity(0, 0), r1);
            util.h.xy.bq.mc.getHighSpeedVideoSizes(((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
        
            if (r9 <= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
        
            if (r9 <= 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
        
            if (r9 < 4294967295L) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
        
            util.h.xy.bq.mc.getHighSpeedVideoSizes = (util.h.xy.bq.mc.getHighSpeedVideoFpsRangesFor + 95) % 128;
         */
        /* renamed from: ˏ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final util.h.xy.bq.rc.a m25589(char c, com.gemalto.mfs.mwsdk.payment.engine.TransactionType transactionType, com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType, long j) {
            util.h.xy.bq.mc mcVar = util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI;
            int i = util.h.xy.bq.mc.getHighSpeedVideoSizes + 91;
            util.h.xy.bq.mc.getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                util.h.xy.bq.mc.getHighSpeedVideoFpsRangesFor(c, transactionType, cryptogramDataType);
            } else {
                util.h.xy.bq.mc.getHighSpeedVideoFpsRangesFor(c, transactionType, cryptogramDataType);
            }
            this.getOutputSizeshNQ4ISI = c;
            this.getOutputMinFrameDuration = transactionType.getCode();
            this.getOutputMinFrameDurationlomOqCM = cryptogramDataType;
            byte[] m25076 = util.h.xy.ar.b.m25076(util.h.xy.ar.b.m25105(new java.lang.String("".concat(java.lang.String.valueOf(j)))));
            util.h.xy.ar.b.m25074(m25076);
            this.getInputSizeshNQ4ISI = m25076;
            this.getOutputFormats.add(util.h.xy.bq.rc.a.ra.getOutputMinFrameDuration);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 41) % 128;
            return this;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final util.h.xy.bq.rc.a m25585(java.lang.String str, char c, char c2) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
            this.getOutputStallDuration = str;
            this.getOutputStallDurationlomOqCM = c;
            this.getOutputSizeshNQ4ISI = c2;
            this.getOutputFormats.add(util.h.xy.bq.rc.a.ra.Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
            return this;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final util.h.xy.bq.rc.a m25586(byte[] bArr, byte[] bArr2) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
            this.getInputFormats = bArr;
            this.getHighSpeedVideoSizesFor = bArr2;
            this.getOutputFormats.add(util.h.xy.bq.rc.a.ra.getHighResolutionOutputSizeshNQ4ISI);
            int i = getHighSpeedVideoFpsRanges + 67;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }

        private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
            util.h.xz.b.ma maVar;
            util.h.xz.b.ma maVar2;
            int length;
            char[] cArr;
            int i;
            util.h.xz.b.ma maVar3;
            int i2 = getHighSpeedVideoFpsRangesFor + 15;
            Camera2StreamConfigurationMap = i2 % 128;
            int i3 = 2;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            byte[] bytes = str.getBytes("ISO-8859-1");
            util.h.xz.b.ma maVar4 = new util.h.xz.b.ma();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = getHighSpeedVideoSizes;
            if (cArr2 != null) {
                int i8 = Camera2StreamConfigurationMap + 105;
                getHighSpeedVideoFpsRangesFor = i8 % 128;
                if (i8 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 0;
                }
                while (i < length) {
                    int i9 = Camera2StreamConfigurationMap + 53;
                    getHighSpeedVideoFpsRangesFor = i9 % 128;
                    if (i9 % i3 == 0) {
                        maVar3 = maVar4;
                        cArr[i] = (char) (cArr2[i] ^ (-8125198844289309347L));
                        i %= 1;
                    } else {
                        maVar3 = maVar4;
                        cArr[i] = (char) (cArr2[i] ^ (-8125198844289309347L));
                        i++;
                    }
                    maVar4 = maVar3;
                    i3 = 2;
                }
                maVar = maVar4;
                cArr2 = cArr;
            } else {
                maVar = maVar4;
            }
            char[] cArr3 = new char[i5];
            java.lang.System.arraycopy(cArr2, i4, cArr3, 0, i5);
            if (bytes != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                char[] cArr4 = new char[i5];
                maVar2 = maVar;
                maVar2.f2631 = 0;
                char c = 0;
                while (maVar2.f2631 < i5) {
                    if (bytes[maVar2.f2631] == 1) {
                        cArr4[maVar2.f2631] = (char) (((cArr3[maVar2.f2631] * 2) + 1) - c);
                    } else {
                        cArr4[maVar2.f2631] = (char) ((cArr3[maVar2.f2631] * 2) - c);
                    }
                    c = cArr4[maVar2.f2631];
                    maVar2.f2631++;
                }
                cArr3 = cArr4;
            } else {
                maVar2 = maVar;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i10 = i5 - i7;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i7);
                java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i10);
            }
            if (z) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 61) % 128;
                char[] cArr6 = new char[i5];
                maVar2.f2631 = 0;
                while (maVar2.f2631 < i5) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 85) % 128;
                    cArr6[maVar2.f2631] = cArr3[(i5 - maVar2.f2631) - 1];
                    maVar2.f2631++;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                maVar2.f2631 = 0;
                while (maVar2.f2631 < i5) {
                    cArr3[maVar2.f2631] = (char) (cArr3[maVar2.f2631] - iArr[2]);
                    maVar2.f2631++;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.bq.rc m25588() {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
            byte b = 0;
            if (this.getOutputFormats.size() < 3) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{0, 59, 188, 21}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000", objArr);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
            }
            if (this.getOutputFormats.size() > 3) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{59, 19, 66, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr2);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
            }
            if (!this.getOutputFormats.contains(util.h.xy.bq.rc.a.ra.getInputFormats)) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{78, 42, 79, 42}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", objArr3);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr3[0]).intern());
            }
            if (this.getOutputSizes == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 49;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 != 0) {
                    this.getOutputFormats.contains(util.h.xy.bq.rc.a.ra.getHighSpeedVideoFpsRanges);
                    throw null;
                }
                if (!this.getOutputFormats.contains(util.h.xy.bq.rc.a.ra.getHighSpeedVideoFpsRanges)) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(false, new int[]{120, 53, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", objArr4);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr4[0]).intern());
                }
                if (!this.getOutputFormats.contains(util.h.xy.bq.rc.a.ra.getOutputMinFrameDuration)) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 59, 109, 43}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", objArr5);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr5[0]).intern());
                }
            } else if (this.getOutputSizes == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                if (!this.getOutputFormats.contains(util.h.xy.bq.rc.a.ra.Camera2StreamConfigurationMap)) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 49, 0, 28}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000", objArr6);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr6[0]).intern());
                }
                if (!this.getOutputFormats.contains(util.h.xy.bq.rc.a.ra.getHighResolutionOutputSizeshNQ4ISI)) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 57, 0, 11}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", objArr7);
                    throw new java.lang.IllegalStateException(((java.lang.String) objArr7[0]).intern());
                }
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 27;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            util.h.xy.bq.rc rcVar = new util.h.xy.bq.rc(b);
            util.h.xy.bq.rc.getHighResolutionOutputSizeshNQ4ISI(rcVar, this.getOutputSizes);
            util.h.xy.bq.rc.getHighResolutionOutputSizeshNQ4ISI(rcVar, this.toString);
            util.h.xy.bq.rc.getHighSpeedVideoSizes(rcVar, this.getOutputStallDuration);
            util.h.xy.bq.rc.getHighSpeedVideoSizes(rcVar, this.getOutputSizeshNQ4ISI);
            util.h.xy.bq.rc.getHighResolutionOutputSizeshNQ4ISI(rcVar, this.getOutputStallDurationlomOqCM);
            util.h.xy.bq.rc.getHighSpeedVideoFpsRangesFor(rcVar, this.getOutputMinFrameDurationlomOqCM);
            util.h.xy.bq.rc.getInputFormats(rcVar, this.getOutputMinFrameDuration);
            util.h.xy.bq.rc.getHighSpeedVideoFpsRanges(rcVar, util.h.xy.ar.b.m25102(util.h.xy.ar.b.m25086()));
            util.h.xy.bq.rc.Camera2StreamConfigurationMap(rcVar, this.getInputFormats);
            util.h.xy.bq.rc.getInputSizeshNQ4ISI(rcVar, this.getHighSpeedVideoSizesFor);
            util.h.xy.bq.rc.getHighSpeedVideoSizes(rcVar, this.getValidOutputFormatsForInputhNQ4ISI);
            util.h.xy.bq.rc.getHighResolutionOutputSizeshNQ4ISI(rcVar, this.unwrapAs);
            util.h.xy.bq.rc.getHighSpeedVideoFpsRangesFor(rcVar, this.getInputSizeshNQ4ISI);
            if (util.h.xy.bq.rc.getHighSpeedVideoFpsRangesFor(rcVar) != null) {
                int i3 = getHighSpeedVideoFpsRanges + 47;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    util.h.xy.bq.rc.getHighSpeedVideoFpsRangesFor(rcVar);
                    throw null;
                }
                util.h.xy.bq.rc.getHighSpeedVideoFpsRangesFor(rcVar);
            }
            util.h.xy.bq.mc mcVar = util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.bq.mc.Camera2StreamConfigurationMap(this.getOutputSizes);
            if (com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP == this.getOutputSizes) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 73;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 != 0) {
                    util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(rcVar);
                    throw null;
                }
                util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(rcVar);
            } else if (com.gemalto.mfs.mwsdk.dcm.PaymentType.QR == this.getOutputSizes) {
                util.h.xy.bq.mc mcVar2 = util.h.xy.bq.mc.getHighResolutionOutputSizeshNQ4ISI;
                util.h.xy.bq.mc.getHighSpeedVideoFpsRangesFor(rcVar);
            }
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            return rcVar;
        }

        static void Camera2StreamConfigurationMap() {
            getHighSpeedVideoSizes = new char[]{42443, 42105, 42104, 42104, 42110, 42104, 42101, 42101, 42106, 42099, 42072, 42401, 42104, 42106, 42403, 42072, 42101, 42101, 42093, 42099, 42070, 42403, 42109, 42097, 42103, 42107, 42402, 42075, 42093, 42107, 42109, 42111, 42403, 42078, 42107, 42402, 42417, 42073, 42069, 42410, 42430, 42409, 42055, 42105, 42050, 42107, 42101, 42403, 42403, 42104, 42097, 42093, 42098, 42106, 42403, 42401, 42111, 42101, 42079, 42341, 42272, 42451, 42455, 42287, 42456, 42481, 42452, 42457, 42485, 42491, 42481, 42475, 42449, 42456, 42481, 42477, 42479, 42491, 42254, 42478, 42466, 42464, 42468, 42447, 42436, 42398, 42468, 42478, 42472, 42444, 42443, 42468, 42447, 42274, 42442, 42438, 42455, 42283, 42461, 42485, 42464, 42466, 42399, 42399, 42399, 42470, 42471, 42397, 42466, 42437, 42443, 42464, 42397, 42436, 42445, 42476, 42472, 42470, 42474, 42478, 42358, 42297, 42285, 42291, 42295, 42270, 42263, 42281, 42295, 42297, 42299, 42271, 42266, 42295, 42270, 42349, 42261, 42257, 42342, 42362, 42340, 42246, 42292, 42291, 42284, 42289, 42271, 42261, 42293, 42288, 42286, 42292, 42292, 42284, 42263, 42261, 42293, 42292, 42292, 42298, 42292, 42289, 42289, 42294, 42287, 42260, 42266, 42291, 42284, 42263, 42260, 42289, 42289, 42243, 42468, 42485, 42441, 42494, 42472, 42435, 42491, 42389, 42379, 42374, 42371, 42372, 42482, 42472, 42376, 42375, 42429, 42379, 42379, 42371, 42474, 42472, 42376, 42379, 42379, 42377, 42379, 42372, 42372, 42373, 42370, 42475, 42473, 42374, 42371, 42474, 42483, 42386, 42382, 42372, 42376, 42380, 42391, 42380, 42368, 42374, 42378, 42477, 42474, 42428, 42378, 42380, 42382, 42482, 42473, 42378, 42477, 42432, 42351, 42292, 42286, 42288, 42293, 42261, 42340, 42252, 42341, 42362, 42342, 42257, 42261, 42349, 42270, 42295, 42266, 42271, 42299, 42297, 42295, 42281, 42263, 42270, 42295, 42291, 42285, 42297, 42296, 42289, 42289, 42260, 42263, 42284, 42291, 42266, 42260, 42287, 42294, 42289, 42289, 42292, 42298, 42292, 42292, 42293, 42261, 42263, 42284, 42351, 42299, 42297, 42295, 42281, 42263, 42270, 42295, 42291, 42285, 42297, 42240, 42297, 42293, 42289, 42299, 42303, 42268, 42263, 42284, 42291, 42266, 42260, 42287, 42294, 42289, 42289, 42292, 42298, 42292, 42292, 42293, 42261, 42263, 42284, 42292, 42292, 42286, 42288, 42293, 42261, 42340, 42252, 42341, 42351, 42262, 42254, 42255, 42341, 42362, 42342, 42257, 42261, 42349, 42270, 42295, 42266};
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType m25576() {
        int i = getHighSpeedVideoSizesFor;
        int i2 = i + 51;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.gemalto.mfs.mwsdk.payment.engine.CryptogramDataType cryptogramDataType = this.getOutputStallDuration;
        int i3 = i + 19;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return cryptogramDataType;
        }
        throw null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.engine.MerchantIdentifier m25575() {
        int i = (getHighSpeedVideoFpsRangesFor + 57) % 128;
        getHighSpeedVideoSizesFor = i;
        com.gemalto.mfs.mwsdk.payment.engine.MerchantIdentifier merchantIdentifier = this.getOutputSizeshNQ4ISI;
        int i2 = i + 103;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return merchantIdentifier;
        }
        throw null;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.dcm.PaymentType m25579() {
        int i = (getHighSpeedVideoSizesFor + 57) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType = this.unwrapAs;
        getHighSpeedVideoSizesFor = (i + 47) % 128;
        return paymentType;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 31) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ￖ\r\u0007\u000e\b\u0006\ufffa\u0014\ufffa\r\ufffa\uffdd\r\u000e\t\u0007￢\r\u0007\ufffe\u0006\u0012\ufffa￩", 24 - (pressedStateDuration >> 16), (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 23, 118 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), true, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(java.lang.Long.toString(this.getValidOutputFormatsForInputhNQ4ISI));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\n\bￜ\r\f\uffd8\u000f\t\u0010", android.graphics.Color.blue(0) + 9, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 5, 117 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.isOutputSupportedForhNQ4ISI);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\b\u0013\uffe7\u001d\u0007\u0012\t\u0016\u0016\u0019\u0007ￄ\uffd0￡\t", android.view.MotionEvent.axisFromString("") + 16, android.view.KeyEvent.getDeadChar(0, 0) + 13, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 107, true, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(java.lang.Integer.toString(this.toString));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes("䲣읅炻䑰﯁᳦裋寰뇹꿾寲蛞⛯꿢", (char) (7803 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "ᰃ䒿竺댞", "\u0000\u0000\u0000\u0000", objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            sb.append(java.lang.Integer.toString(this.CoroutineDebuggingKt));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0014\u0012\u0001\u000e\u0013\u0001\u0003\u0014\t\u000f\u000e\ufff4\u0019\u0010\u0005\uffddￌ\uffc0", 18 - android.widget.ExpandableListView.getPackedPositionType(0L), 16 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 110 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            sb.append(this.coroutineCreation);
            char indexOf = (char) (android.text.TextUtils.indexOf("", "") + 24655);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 57) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes("暣놔ᬶ琨\udd43\ue29b栨䤩ꯟ逃誯\uf5bc뻫嫧ꕭ쩝쟹ᶽ", indexOf, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22, "⒔\ue397伱\uf560", "\u0000\u0000\u0000\u0000", objArr6);
            sb.append(((java.lang.String) objArr6[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputMinFrameDurationlomOqCM));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("&\ufff5￤\uffd8-", 5 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 87, false, objArr7);
            sb.append(((java.lang.String) objArr7[0]).intern());
            sb.append(java.util.Arrays.toString(this.isOutputSupportedFor));
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue631汶魢⏥ﯧ省㧃鏃棽䓨", (char) android.graphics.Color.red(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, "锇藸캵\u19ac", "\u0000\u0000\u0000\u0000", objArr8);
            sb.append(((java.lang.String) objArr8[0]).intern());
            sb.append(java.util.Arrays.toString(this.getInputSizeshNQ4ISI));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes("㘙\udc59\ue03d\ue9f4᰷뒠", (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 57459), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "쮉欌珸郠", "\u0000\u0000\u0000\u0000", objArr9);
            sb.append(((java.lang.String) objArr9[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputStallDurationlomOqCM));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\t\r\u0005\u000e\u0014\u0001\u0012\u0019￤\u0001\u0014\u0001\uffddￌ\uffc0\u0003\u000f\r\u0010\f", android.view.Gravity.getAbsoluteGravity(0, 0) + 20, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 13, android.view.View.MeasureSpec.getMode(0) + 111, false, objArr10);
            sb.append(((java.lang.String) objArr10[0]).intern());
            sb.append(java.util.Arrays.toString(this.accessartificialFrame));
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("￦\u000e\u0016\u0012�\u0011\u0018\u0019\u000e\uffc9ￕ", 11 - android.view.View.MeasureSpec.getSize(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, 103 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, objArr11);
            sb.append(((java.lang.String) objArr11[0]).intern());
            sb.append(java.util.Arrays.toString(this.getOutputSizes));
            char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 77) % 128;
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u009e脧悄\u1add㺙䄗稺⮀컍蒧ꦸ።⇰蕓돾ﱰ程眡⳦\udb36蝇", scrollBarFadeDuration, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 1310929919, "ﾏ⌳低⳽", "\u0000\u0000\u0000\u0000", objArr12);
            sb.append(((java.lang.String) objArr12[0]).intern());
            sb.append(this.getOutputStallDuration);
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoSizes("圄﹀ඦ佻丣\uf76b龜\uf3ce褸\u2dbf\u0a92\ue38f镈ૡ歼얧\u0a79ᰳⰼ叫๓", (char) android.text.TextUtils.getOffsetAfter("", 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 247333619, "\uf284븂Ď\uea56", "\u0000\u0000\u0000\u0000", objArr13);
            sb.append(((java.lang.String) objArr13[0]).intern());
            sb.append(this.getOutputSizeshNQ4ISI);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes("㝻㉨\uf35c햽ꍱ\uf5a6◪텔聕㱄㡺ߦ戜쾴", (char) (48521 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), android.graphics.Color.blue(0), "\u173a\u0d50覘Ჽ", "\u0000\u0000\u0000\u0000", objArr14);
            sb.append(((java.lang.String) objArr14[0]).intern());
            sb.append(this.unwrapAs);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        int i2 = getHighSpeedVideoSizes + 87;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
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
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 77) % 128;
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getOutputFormats ^ 2457411417541981002L)) ^ ((int) (getInputFormats ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 83) % 128;
        }
        java.lang.String str4 = new java.lang.String(cArr3);
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 99;
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 61) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = -1231763815;
        getOutputFormats = 2457411417541981002L;
        getInputFormats = 294925130;
        getHighSpeedVideoFpsRanges = (char) 31327;
    }
}
