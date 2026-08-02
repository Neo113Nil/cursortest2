package util.h.xy.e;

/* loaded from: classes5.dex */
public final class rb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 77;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.e.rb.a Camera2StreamConfigurationMap;
    private util.h.xy.e.rb.a getHighSpeedVideoSizesFor;
    private util.h.xy.e.rb.a getInputSizeshNQ4ISI;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˊ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ma {
        private static long Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;
        private static int getHighSpeedVideoSizesFor = 0;
        private static final /* synthetic */ util.h.xy.e.rb.ma[] getInputFormats;
        private static long getInputSizeshNQ4ISI = 0;
        private static int getOutputFormats = 1;
        private static int getOutputMinFrameDuration;
        private static char getOutputStallDurationlomOqCM;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.e.rb.ma f1882;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.e.rb.ma f1883;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.e.rb.ma f1884;

        private ma(java.lang.String str, int i) {
        }

        static {
            getHighSpeedVideoFpsRanges();
            getOutputMinFrameDuration = 0;
            getHighResolutionOutputSizeshNQ4ISI = 1;
            int i = (getHighSpeedVideoSizesFor + 59) % 128;
            getOutputFormats = i;
            getHighSpeedVideoFpsRangesFor = 1467183378;
            getInputSizeshNQ4ISI = 0L;
            getOutputStallDurationlomOqCM = (char) 0;
            getHighSpeedVideoSizesFor = (i + 31) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("戢戢觑쬤ᔿ\u242d\uf2f8\uf2e7", android.text.TextUtils.getTrimmedLength(""), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ꃆ׳矡\uf7b1泯뮔\ue326춻䄏쨘\u09c9", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("뱟䑹瑶푝㭗፼Xኚ", android.graphics.Color.argb(0, 0, 0, 0), objArr3);
            util.h.xy.e.rb.ma maVar = new util.h.xy.e.rb.ma(getHighSpeedVideoFpsRangesFor(intern, intern2, -640430088, ((java.lang.String) objArr3[0]).intern()).intern(), 0);
            f1882 = maVar;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("戢戢觑쬤ᔿ\u242d\uf2f8\uf2e7", android.view.View.getDefaultSize(0, 0), objArr4);
            java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\ue8b2纅⮕\udd3e콺␖뾷\uddc0Ꮗꃘﱤ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
            java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("듙榞¬\uf646噲\uf0bb蔛旀", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr6);
            util.h.xy.e.rb.ma maVar2 = new util.h.xy.e.rb.ma(getHighSpeedVideoFpsRangesFor(intern3, intern4, -2117455651, ((java.lang.String) objArr6[0]).intern()).intern(), 1);
            f1883 = maVar2;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("戢戢觑쬤ᔿ\u242d\uf2f8\uf2e7", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr7);
            java.lang.String intern5 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\uebce렝쬀穥麂鲠폤筪迯䖾ㇵ", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr8);
            java.lang.String intern6 = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("형탳\ueae7어⽱嵏䨆膋", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9);
            util.h.xy.e.rb.ma maVar3 = new util.h.xy.e.rb.ma(getHighSpeedVideoFpsRangesFor(intern5, intern6, 1851357190, ((java.lang.String) objArr9[0]).intern()).intern(), 2);
            f1884 = maVar3;
            getInputFormats = new util.h.xy.e.rb.ma[]{maVar, maVar2, maVar3};
            int i2 = getOutputFormats;
            int i3 = i2 + 9;
            getHighSpeedVideoSizesFor = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getHighResolutionOutputSizeshNQ4ISI;
            int i6 = i5 & 27;
            int i7 = (i5 ^ 27) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            getOutputMinFrameDuration = i8 % 128;
            int i9 = i8 % 2;
            getHighSpeedVideoSizesFor = (i2 + 75) % 128;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = (i2 + 27) % 128;
            getHighSpeedVideoSizes = (i2 + 93) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(Camera2StreamConfigurationMap ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 9) % 128;
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (Camera2StreamConfigurationMap ^ 7817488252581312552L)));
                aVar.f2623++;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 15) % 128;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
            char[] cArr;
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 73;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = getOutputFormats + 81;
            getHighSpeedVideoSizesFor = i3 % 128;
            char[] cArr2 = str3;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (str3 != null) {
                cArr2 = str3.toCharArray();
            }
            char[] cArr3 = cArr2;
            if (str2 != null) {
                getHighSpeedVideoSizesFor = (getOutputFormats + 7) % 128;
                getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
                cArr = str2.toCharArray();
            } else {
                getHighSpeedVideoSizesFor = (getOutputFormats + 33) % 128;
                cArr = str2;
            }
            char[] cArr4 = cArr;
            char[] cArr5 = str;
            if (str != null) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 19;
                getOutputMinFrameDuration = i4 % 128;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i5 = getOutputFormats + 77;
                getHighSpeedVideoSizesFor = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = (char[]) cArr3.clone();
            char[] cArr7 = (char[]) cArr5.clone();
            cArr6[0] = cArr6[0];
            cArr7[2] = (char) (cArr7[2] + ((char) i));
            int length = cArr4.length;
            char[] cArr8 = new char[length];
            int i6 = getOutputMinFrameDuration + 21;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                getOutputFormats = (getHighSpeedVideoSizesFor + 15) % 128;
            }
            for (int i7 = 0; i7 < length; i7++) {
                getOutputFormats = (getHighSpeedVideoSizesFor + 31) % 128;
                util.h.xy.b.c.m25287(cArr6, cArr7, i7);
                cArr8[i7] = (char) ((((cArr4[i7] ^ cArr6[(i7 + 3) % 4]) ^ getInputSizeshNQ4ISI) ^ getHighSpeedVideoFpsRangesFor) ^ getOutputStallDurationlomOqCM);
            }
            return new java.lang.String(cArr8);
        }

        static void getHighSpeedVideoFpsRanges() {
            Camera2StreamConfigurationMap = -5204147145014090554L;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static char[] Camera2StreamConfigurationMap = null;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static final /* synthetic */ util.h.xy.e.rb.b[] getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes = 0;
        private static int getHighSpeedVideoSizesFor = 1;
        private static long getOutputFormats;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.e.rb.b f1879;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.e.rb.b f1880;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.e.rb.b f1881;

        private b(java.lang.String str, int i) {
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static util.h.xy.e.rb.b[] m26477() {
            int i = ~((int) java.lang.System.currentTimeMillis());
            int i2 = ((((-570708161) ^ i) | (i & (-570708161))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1252633962;
            int i3 = ~((i ^ (-1780348371)) | (i & (-1780348371)));
            int i4 = (i3 ^ 295829517) | (i3 & 295829517);
            int i5 = ((i4 ^ 1209640210) | (i4 & 1209640210)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i6 = ~currentTimeMillis;
            int i7 = ~(((-1034550384) ^ i6) | (i6 & (-1034550384)));
            int i8 = (-1096290175) - (~(((i7 ^ 270571619) | (i7 & 270571619)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            int i9 = (~(((-270571620) ^ currentTimeMillis) | (currentTimeMillis & (-270571620)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
            int i10 = (i8 & i9) + (i9 | i8);
            int i11 = ~((i6 ^ (-309369316)) | (i6 & (-309369316)));
            int i12 = (i11 ^ 38797696) | (i11 & 38797696);
            int i13 = ~((currentTimeMillis ^ (-763978765)) | (currentTimeMillis & (-763978765)));
            int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            if ((i2 & i5) + (i5 | i2) > (i10 ^ i14) + ((i14 & i10) << 1)) {
                int i15 = 4 / 5;
            }
            int i16 = getHighSpeedVideoSizesFor;
            getHighSpeedVideoSizes = (i16 + 93) % 128;
            int i17 = ((i16 & 115) + (i16 | 115)) % 128;
            getHighSpeedVideoSizes = i17;
            getHighSpeedVideoSizesFor = (i17 + 83) % 128;
            int i18 = getHighSpeedVideoFpsRanges;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i19 = (-9186) - (~(-(-(i18 * (-167)))));
            int i20 = ~i18;
            int i21 = ~((i20 & (-56)) | (i20 ^ (-56)));
            int i22 = ~(i20 | currentTimeMillis2);
            int i23 = -(-(((i21 ^ i22) | (i21 & i22)) * 336));
            int i24 = ((i19 | i23) << 1) - (i19 ^ i23);
            int i25 = ~((i18 ^ 55) | (i18 & 55));
            int i26 = ~((currentTimeMillis2 ^ 55) | (currentTimeMillis2 & 55));
            int i27 = -(-(((i25 ^ i26) | (i25 & i26)) * (-168)));
            int i28 = ~currentTimeMillis2;
            int i29 = (i24 ^ i27) + ((i27 & i24) << 1) + (((~((i28 & 55) | (i28 ^ 55))) | i20) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            getHighResolutionOutputSizeshNQ4ISI = i29 % 128;
            if (i29 % 2 == 0) {
                getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 9) % 128;
            } else {
                getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 67) % 128;
            }
            util.h.xy.e.rb.b[] bVarArr = (util.h.xy.e.rb.b[]) getHighSpeedVideoFpsRangesFor.clone();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 49) % 128;
            int i30 = getHighResolutionOutputSizeshNQ4ISI + 84;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i31 = i30 * (-167);
            int i32 = ~i30;
            int i33 = ~((i32 ^ (-1)) | i32);
            int i34 = ~currentTimeMillis3;
            int i35 = ~((i32 ^ i34) | (i32 & i34));
            int i36 = -(-(((i33 ^ i35) | (i33 & i35)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            int i37 = ((i31 | i36) << 1) - (i31 ^ i36);
            int i38 = (~(i30 | (i30 ^ (-1)))) | (~((i34 ^ (-1)) | i34));
            int i39 = ~((currentTimeMillis3 ^ i32) | (currentTimeMillis3 & i32));
            int i40 = -(-(((i38 ^ i39) | (i38 & i39)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            int i41 = ((i37 & i40) + (i40 | i37)) - 1;
            getHighSpeedVideoFpsRanges = i41 % 128;
            int i42 = getHighSpeedVideoSizesFor;
            getHighSpeedVideoSizes = (i41 % 2 != 0 ? i42 + 125 : i42 + 53) % 128;
            return bVarArr;
        }

        static {
            int i = getHighSpeedVideoSizesFor;
            int i2 = i + 71;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                Camera2StreamConfigurationMap = new char[]{org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 57495, 49647, 41678, 33575, 25606, 17781, 9809, 1723, 59279, 51435, 43471, 52980, 11823, 3927, 27766, 19871, 43710, 35789, 59646, 51200, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 57495, 49647, 41678, 33575, 25626, 17789, 9808, 1698, 59279, 51454, 43475};
                getOutputFormats = 7315749777491288286L;
                throw null;
            }
            Camera2StreamConfigurationMap = new char[]{org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 57495, 49647, 41678, 33575, 25606, 17781, 9809, 1723, 59279, 51435, 43471, 52980, 11823, 3927, 27766, 19871, 43710, 35789, 59646, 51200, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 57495, 49647, 41678, 33575, 25626, 17789, 9808, 1698, 59279, 51454, 43475};
            getOutputFormats = 7315749777491288286L;
            int i3 = (i ^ 21) + ((i & 21) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            util.h.xy.e.rb.b bVar = new util.h.xy.e.rb.b(Camera2StreamConfigurationMap(0, 12, (char) 0).intern(), 0);
            f1879 = bVar;
            util.h.xy.e.rb.b bVar2 = new util.h.xy.e.rb.b(Camera2StreamConfigurationMap(12, 9, (char) 52920).intern(), 1);
            f1881 = bVar2;
            util.h.xy.e.rb.b bVar3 = new util.h.xy.e.rb.b(Camera2StreamConfigurationMap(21, 12, (char) 0).intern(), 2);
            f1880 = bVar3;
            getHighSpeedVideoFpsRangesFor = new util.h.xy.e.rb.b[]{bVar, bVar2, bVar3};
            int i4 = getHighSpeedVideoSizes;
            getHighSpeedVideoSizesFor = (i4 + 25) % 128;
            int i5 = getHighSpeedVideoFpsRanges;
            int i6 = i5 & 125;
            int i7 = (i5 | 125) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 & i8) + (i7 | i8);
            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = i4 + 3;
                getHighSpeedVideoSizesFor = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i4 + 13;
                getHighSpeedVideoSizesFor = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = getHighSpeedVideoSizesFor;
            int i15 = (i14 ^ 119) + ((i14 & 119) << 1);
            getHighSpeedVideoSizes = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String Camera2StreamConfigurationMap(int i, int i2, char c) {
            char[] cArr;
            int i3 = getHighSpeedVideoSizes;
            int i4 = (((i3 | 55) << 1) - (i3 ^ 55)) % 128;
            getHighSpeedVideoSizesFor = i4;
            int i5 = (i4 + 89) % 128;
            getHighSpeedVideoSizes = i5;
            int i6 = getHighResolutionOutputSizeshNQ4ISI;
            int i7 = -(-(i6 * com.visa.cbp.getCertUsage.setODAData));
            int i8 = ~i;
            int i9 = (i7 & (-20615)) + (i7 | (-20615)) + 10656 + (((~(i8 | (-32))) | (~((i6 ^ i) | (i6 & i)))) * com.visa.cbp.getCertUsage.getODAData);
            int i10 = ~(i | (-32));
            int i11 = ~((i6 ^ i8) | (i6 & i8));
            int i12 = ((i11 ^ i10) | (i11 & i10)) * com.visa.cbp.getCertUsage.getODAData;
            int i13 = (i9 ^ i12) + ((i12 & i9) << 1);
            getHighSpeedVideoFpsRanges = i13 % 128;
            int i14 = 0;
            if (i13 % 2 != 0) {
                int i15 = i5 + 59;
                getHighSpeedVideoSizesFor = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr = new char[i2];
                    int i16 = i5 + 5;
                    getHighSpeedVideoSizesFor = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 4 / 5;
                    }
                    while (i14 < i2) {
                        int i18 = (getHighSpeedVideoSizes + 29) % 128;
                        getHighSpeedVideoSizesFor = i18;
                        int i19 = (i18 + 55) % 128;
                        getHighSpeedVideoSizes = i19;
                        int i20 = getHighResolutionOutputSizeshNQ4ISI;
                        int i21 = (i20 & 1) + (i20 | 1);
                        getHighSpeedVideoFpsRanges = i21 % 128;
                        if (i21 % 2 != 0) {
                            getHighSpeedVideoSizesFor = (((i19 | 121) << 1) - (i19 ^ 121)) % 128;
                        }
                        cArr[i14] = (char) ((Camera2StreamConfigurationMap[(i - (~i14)) - 1] ^ (i14 * getOutputFormats)) ^ c);
                        i14 = ((i14 | 1) << 1) - (i14 ^ 1);
                        getHighSpeedVideoSizesFor = (i19 + 99) % 128;
                    }
                    getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 15) % 128;
                    java.lang.String str = new java.lang.String(cArr);
                    int i22 = getHighSpeedVideoSizes;
                    getHighSpeedVideoSizesFor = ((i22 & 103) + (i22 | 103)) % 128;
                    return str;
                }
            } else {
                int i23 = i5 + 75;
                getHighSpeedVideoSizesFor = i23 % 128;
                int i24 = i23 % 2;
            }
            cArr = new char[i2];
            while (i14 < i2) {
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 15) % 128;
            java.lang.String str2 = new java.lang.String(cArr);
            int i222 = getHighSpeedVideoSizes;
            getHighSpeedVideoSizesFor = ((i222 & 103) + (i222 | 103)) % 128;
            return str2;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26473(util.h.xy.e.rb.ma maVar, util.h.xy.e.rb.a aVar) {
        int i = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 & 37;
        int i4 = (i3 | ((~i3) & (i2 | 37))) << 1;
        int i5 = -((i2 & (-38)) ^ ((~i2) & 37));
        int i6 = i4 ^ i5;
        int i7 = (i4 & i5) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = ((i | 103) << 1) - (i ^ 103);
            getHighSpeedVideoSizes = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        } else {
            int i10 = ((i ^ 23) + ((i & 23) << 1)) % 128;
            getHighSpeedVideoSizes = i10;
            int i11 = ((i10 | 109) << 1) - (i10 ^ 109);
            getHighSpeedVideoFpsRangesFor = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 4 / 4;
            }
        }
        if (aVar != null) {
            int i13 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i13 ^ 53) + ((i13 & 53) << 1)) % 128;
            int i14 = ((i2 ^ 55) - (~(-(-((i2 & 55) << 1))))) - 1;
            getHighResolutionOutputSizeshNQ4ISI = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = i13 + 1;
                getHighSpeedVideoFpsRangesFor = i15 % 128;
                int i16 = i15 % 2;
                getHighSpeedVideoFpsRangesFor(maVar, aVar);
                throw null;
            }
            getHighSpeedVideoFpsRangesFor = ((i13 & 31) + (i13 | 31)) % 128;
            getHighSpeedVideoFpsRangesFor(maVar, aVar);
            int i17 = getHighSpeedVideoFpsRanges;
            int i18 = i17 & 95;
            int i19 = (i17 ^ 95) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i21 ^ 25) + ((i21 & 25) << 1)) % 128;
                int i22 = ((i21 ^ 97) + ((i21 & 97) << 1)) % 128;
                getHighSpeedVideoSizes = i22;
                int i23 = (i22 & 27) + (i22 | 27);
                getHighSpeedVideoFpsRangesFor = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 5 / 4;
                }
            }
        }
        int i25 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i25 ^ 49) + ((i25 & 49) << 1)) % 128;
        int i26 = getHighSpeedVideoFpsRanges;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i27 = -(-(i26 * (-279)));
        int i28 = (i27 & 16779) + (i27 | 16779) + (((i26 ^ identityHashCode) | (i26 & identityHashCode)) * 140);
        int i29 = ~(i26 | (-120));
        int i30 = ~identityHashCode;
        int i31 = ~((i30 & i26) | (i30 ^ i26));
        int i32 = ((i29 ^ i31) | (i29 & i31)) * (-280);
        int i33 = (i28 ^ i32) + ((i32 & i28) << 1);
        int i34 = ~((~i26) | 119);
        int i35 = ~((i30 & 119) | (i30 ^ 119));
        int i36 = (i34 ^ i35) | (i34 & i35);
        int i37 = ~((i26 ^ (-120)) | (i26 & (-120)) | identityHashCode);
        int i38 = ((i37 ^ i36) | (i37 & i36)) * 140;
        getHighResolutionOutputSizeshNQ4ISI = (((i33 | i38) << 1) - (i38 ^ i33)) % 128;
        int i39 = getHighSpeedVideoSizes;
        int i40 = (i39 ^ 43) + ((i39 & 43) << 1);
        getHighSpeedVideoFpsRangesFor = i40 % 128;
        if (i40 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.e.rb.a m26474(util.h.xy.e.rb.ma maVar) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i + 73) % 128;
        int i2 = (((i | 13) << 1) - (i ^ 13)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        int i3 = (((i2 | 101) << 1) - (i2 ^ 101)) % 128;
        getHighSpeedVideoSizes = i3;
        int i4 = getHighSpeedVideoFpsRanges + 109;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 19) + ((i3 & 19) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = (i3 + 45) % 128;
            getHighResolutionOutputSizeshNQ4ISI(maVar);
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRangesFor = ((i3 & 49) + (i3 | 49)) % 128;
        util.h.xy.e.rb.a highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(maVar);
        int i5 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i5 ^ 11) + ((i5 & 11) << 1)) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    private void getHighSpeedVideoFpsRangesFor(util.h.xy.e.rb.ma maVar, util.h.xy.e.rb.a aVar) {
        char c;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i + 41) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 95) % 128;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 & 75;
        int i4 = ~i3;
        int i5 = (i2 | 75) & i4;
        int i6 = (i5 ^ i3) | (i5 & i3);
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i7 = i6 * (-183);
        int i8 = i3 * 185;
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        int i10 = ~i6;
        int i11 = ((i3 ^ i10) | (i3 & i10)) * (-368);
        int i12 = (i4 & i6) | (i6 ^ i4);
        int i13 = ~identityHashCode;
        int i14 = (~(i4 | i10)) | (~((i13 & i6) | (i13 ^ i6)));
        int i15 = ~((i6 ^ i3) | (i6 & i3));
        int i16 = (((((i9 | i11) << 1) - (i11 ^ i9)) + (((i13 ^ i12) | (i12 & i13)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - (~(-(-(((i15 ^ i14) | (i15 & i14)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))))) - 1;
        getHighSpeedVideoFpsRanges = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = getHighSpeedVideoFpsRangesFor + 65;
            getHighSpeedVideoSizes = i17 % 128;
            if (i17 % 2 == 0) {
                if (maVar == util.h.xy.e.rb.ma.f1882) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 97) % 128;
                    this.getHighSpeedVideoSizesFor = aVar;
                    int i18 = getHighSpeedVideoFpsRanges;
                    int i19 = i18 & 53;
                    getHighResolutionOutputSizeshNQ4ISI = (i19 + ((i18 ^ 53) | i19)) % 128;
                } else {
                    int i20 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor = ((i20 ^ 65) + ((i20 & 65) << 1)) % 128;
                    if (maVar == util.h.xy.e.rb.ma.f1883) {
                        int i21 = getHighSpeedVideoFpsRangesFor;
                        int i22 = ((i21 ^ 49) + ((i21 & 49) << 1)) % 128;
                        getHighSpeedVideoSizes = i22;
                        int i23 = getHighSpeedVideoFpsRanges;
                        int i24 = i23 & 17;
                        int i25 = (i23 ^ 17) | i24;
                        int i26 = i25 << 1;
                        int i27 = -(i25 & (~i24));
                        int i28 = i26 & i27;
                        int i29 = i27 | i26;
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        int i31 = i30 % 128;
                        getHighResolutionOutputSizeshNQ4ISI = i31;
                        if (i30 % 2 == 0) {
                            getHighSpeedVideoFpsRangesFor = (i22 + 37) % 128;
                            this.getInputSizeshNQ4ISI = aVar;
                            throw new java.lang.ArithmeticException();
                        }
                        int i32 = ((i21 & 1) + (i21 | 1)) % 128;
                        getHighSpeedVideoSizes = i32;
                        this.getInputSizeshNQ4ISI = aVar;
                        int i33 = i31 & 3;
                        int i34 = -(-((i31 ^ 3) | i33));
                        int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                        getHighSpeedVideoFpsRanges = i35 % 128;
                        if (i35 % 2 != 0) {
                            getHighSpeedVideoFpsRangesFor = ((i32 ^ 39) + ((i32 & 39) << 1)) % 128;
                        } else {
                            int i36 = ((i32 & 19) + (i32 | 19)) % 128;
                            getHighSpeedVideoFpsRangesFor = i36;
                            getHighSpeedVideoSizes = ((i36 ^ 39) + ((i36 & 39) << 1)) % 128;
                        }
                    } else if (maVar == util.h.xy.e.rb.ma.f1884) {
                        int i37 = getHighSpeedVideoFpsRangesFor;
                        int i38 = ((i37 & 41) + (i37 | 41)) % 128;
                        getHighSpeedVideoSizes = i38;
                        int i39 = getHighResolutionOutputSizeshNQ4ISI;
                        int i40 = i39 & 69;
                        int i41 = (i39 | 69) & (~i40);
                        int i42 = i40 << 1;
                        int i43 = i41 & i42;
                        int i44 = ((((i41 ^ i42) | i43) << 1) - (~(-((i41 | i42) & (~i43))))) - 1;
                        getHighSpeedVideoFpsRanges = i44 % 128;
                        if (i44 % 2 != 0) {
                            int i45 = ((i38 | 21) << 1) - (i38 ^ 21);
                            getHighSpeedVideoFpsRangesFor = i45 % 128;
                            c = i45 % 2 == 0 ? (char) 22 : 'N';
                        } else {
                            int i46 = i38 + 67;
                            getHighSpeedVideoFpsRangesFor = i46 % 128;
                            c = i46 % 2 == 0 ? kotlin.text.Typography.dollar : (char) 20;
                        }
                        this.Camera2StreamConfigurationMap = aVar;
                        if (c != 20) {
                            throw null;
                        }
                    }
                }
                int i47 = (getHighSpeedVideoFpsRangesFor + 27) % 128;
                getHighSpeedVideoSizes = i47;
                int i48 = getHighSpeedVideoFpsRanges;
                int i49 = ((i48 | 17) << 1) - (i48 ^ 17);
                getHighResolutionOutputSizeshNQ4ISI = i49 % 128;
                if (i49 % 2 != 0) {
                    getHighSpeedVideoFpsRangesFor = (i47 + 47) % 128;
                    return;
                }
                int i50 = (i47 ^ 47) + ((i47 & 47) << 1);
                getHighSpeedVideoFpsRangesFor = i50 % 128;
                char c2 = i50 % 2 == 0 ? '7' : io.ktor.util.date.GMTDateParser.YEAR;
                getHighSpeedVideoFpsRangesFor = (i47 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                if (c2 != 'A') {
                    throw null;
                }
                return;
            }
        } else {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 9) % 128;
        }
        util.h.xy.e.rb.ma maVar2 = util.h.xy.e.rb.ma.f1882;
        throw null;
    }

    private util.h.xy.e.rb.a getHighResolutionOutputSizeshNQ4ISI(util.h.xy.e.rb.ma maVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 3) + (i | 3)) % 128;
        int i2 = (i + 109) % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i3 & 39;
        int i5 = i3 | 39;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getHighSpeedVideoFpsRanges = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            int i8 = i7 % 2;
            util.h.xy.e.rb.ma maVar2 = util.h.xy.e.rb.ma.f1882;
            throw null;
        }
        getHighSpeedVideoSizes = ((i ^ 9) + ((i & 9) << 1)) % 128;
        if (maVar == util.h.xy.e.rb.ma.f1882) {
            int i9 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i9 & 29) + (i9 | 29)) % 128;
        } else {
            int i10 = getHighSpeedVideoSizes;
            int i11 = ((i10 | 5) << 1) - (i10 ^ 5);
            getHighSpeedVideoFpsRangesFor = i11 % 128;
            if (i11 % 2 != 0) {
                if (maVar == util.h.xy.e.rb.ma.f1883) {
                    int i12 = getHighSpeedVideoFpsRangesFor;
                    int i13 = (i12 & 41) + (i12 | 41);
                    getHighSpeedVideoSizes = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 3 / 4;
                    }
                    int i15 = ((i12 & 15) + (i12 | 15)) % 128;
                    getHighSpeedVideoSizes = i15;
                    int i16 = getHighSpeedVideoFpsRanges;
                    int i17 = (i16 | 39) << 1;
                    int i18 = i16 & 39;
                    int i19 = -(~(-(((i16 ^ 39) | i18) & (~i18))));
                    int i20 = (((i17 | i19) << 1) - (i19 ^ i17)) - 1;
                    getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
                    if (i20 % 2 == 0) {
                        throw null;
                    }
                    getHighSpeedVideoFpsRangesFor = (i15 + 57) % 128;
                    return this.getInputSizeshNQ4ISI;
                }
                int i21 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i21 & 105) + (i21 | 105)) % 128;
                if (maVar != util.h.xy.e.rb.ma.f1884) {
                    int i22 = getHighSpeedVideoSizes;
                    int i23 = ((i22 ^ 15) + ((i22 & 15) << 1)) % 128;
                    getHighSpeedVideoFpsRangesFor = i23;
                    getHighSpeedVideoSizes = (((i23 | 23) << 1) - (i23 ^ 23)) % 128;
                    int i24 = getHighResolutionOutputSizeshNQ4ISI;
                    int i25 = i24 & 83;
                    int i26 = ((i24 ^ 83) | i25) & (~i25);
                    int i27 = -(-(i25 << 1));
                    int i28 = i26 & i27;
                    int i29 = ((i26 ^ i27) | i28) << 1;
                    int i30 = -((i26 | i27) & (~i28));
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i31 = ((i30 * (-112)) - (~(-(-(i29 * (-112)))))) - 1;
                    int i32 = ~i29;
                    int i33 = ~identityHashCode;
                    int i34 = ~((i32 & i33) | (i32 ^ i33));
                    int i35 = -(-(((i34 ^ i30) | (i34 & i30)) * 226));
                    int i36 = (i31 & i35) + (i31 | i35);
                    int i37 = ~i30;
                    int i38 = ~((i29 ^ i37) | (i37 & i29));
                    int i39 = ~(i37 | identityHashCode);
                    int i40 = (i39 ^ i38) | (i38 & i39);
                    int i41 = i33 | i32;
                    int i42 = ~((i30 ^ i41) | (i30 & i41));
                    int i43 = -(-(((i42 ^ i40) | (i42 & i40)) * (-113)));
                    int i44 = (i36 & i43) + (i43 | i36);
                    int i45 = (~((i32 ^ identityHashCode) | (identityHashCode & i32))) * 113;
                    getHighSpeedVideoFpsRanges = (((i44 | i45) << 1) - (i45 ^ i44)) % 128;
                    return null;
                }
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 87) % 128;
                int i46 = getHighResolutionOutputSizeshNQ4ISI;
                int i47 = i46 & 103;
                int i48 = (i46 ^ 103) | i47;
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i49 = ((i48 * 624) - (~(i47 * (-622)))) - 1;
                int i50 = ~i47;
                int i51 = (i50 & i48) | (i50 ^ i48);
                int i52 = (~((i51 ^ identityHashCode2) | (i51 & identityHashCode2))) * 623;
                int i53 = ~identityHashCode2;
                int i54 = ~i48;
                int i55 = ~((i47 ^ i54) | (i54 & i47));
                int i56 = (((i49 ^ i52) + ((i49 & i52) << 1)) - (~(-(-(((i55 ^ i53) | (i53 & i55)) * (-623)))))) - 1;
                int i57 = ~i51;
                int i58 = ~((i50 & identityHashCode2) | (i50 ^ identityHashCode2));
                int i59 = (i57 ^ i58) | (i58 & i57);
                int i60 = ~((i48 ^ identityHashCode2) | (i48 & identityHashCode2));
                int i61 = -(-(((i60 ^ i59) | (i60 & i59)) * 623));
                int i62 = (((i56 | i61) << 1) - (i61 ^ i56)) % 128;
                getHighSpeedVideoFpsRanges = i62;
                util.h.xy.e.rb.a aVar = this.Camera2StreamConfigurationMap;
                int i63 = (i62 & (-82)) ^ ((~i62) & 81);
                int i64 = -(-((i62 & 81) << 1));
                int i65 = ((i63 ^ i64) | (i63 & i64)) << 1;
                int i66 = -(((~i64) & i63) | ((~i63) & i64));
                int identityHashCode3 = java.lang.System.identityHashCode(this);
                int i67 = (i66 * lib.android.paypal.com.magnessdk.g.e) + (i65 * 407);
                int i68 = ~i65;
                int i69 = ~((i68 ^ identityHashCode3) | (i68 & identityHashCode3));
                int i70 = ~identityHashCode3;
                int i71 = (i70 ^ i66) | (i70 & i66);
                int i72 = ~((i71 ^ i65) | (i71 & i65));
                int i73 = ((i69 ^ i72) | (i69 & i72)) * (-406);
                int i74 = (i67 & i73) + (i67 | i73);
                int i75 = (~(i68 | i70 | i66)) * (-406);
                int i76 = ~((~i66) | identityHashCode3);
                int i77 = ~((i70 ^ i65) | (i65 & i70));
                int i78 = (i74 ^ i75) + ((i75 & i74) << 1) + (((i76 ^ i77) | (i76 & i77)) * 406);
                getHighResolutionOutputSizeshNQ4ISI = i78 % 128;
                int i79 = getHighSpeedVideoSizes;
                if (i78 % 2 != 0) {
                    getHighSpeedVideoFpsRangesFor = ((i79 ^ 47) + ((i79 & 47) << 1)) % 128;
                    return aVar;
                }
                getHighSpeedVideoFpsRangesFor = (((i79 | 97) << 1) - (i79 ^ 97)) % 128;
                throw new java.lang.ArithmeticException();
            }
        }
        int i80 = getHighResolutionOutputSizeshNQ4ISI;
        int i81 = i80 & 95;
        int i82 = (i80 | 95) & (~i81);
        int i83 = -(-(i81 << 1));
        int i84 = ((i82 ^ i83) | (i82 & i83)) << 1;
        int i85 = -((i82 & (~i83)) | ((~i82) & i83));
        int i86 = (i84 & i85) + (i85 | i84);
        getHighSpeedVideoFpsRanges = i86 % 128;
        if (i86 % 2 == 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 83) % 128;
            return this.getHighSpeedVideoSizesFor;
        }
        int i87 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i87 + 33) % 128;
        int i88 = (i87 ^ 77) + ((i87 & 77) << 1);
        getHighSpeedVideoSizes = i88 % 128;
        int i89 = i88 % 2;
        throw null;
    }

    public final class a {
        private static int Camera2StreamConfigurationMap = 6;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizesFor;
        private java.util.Map<java.lang.String, java.lang.String> getInputSizeshNQ4ISI;
        private java.util.Map<java.lang.String, java.lang.String> getOutputFormats;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0556, code lost:
        
            if (((r1 ^ r12) + ((r12 & r1) << 1)) > (((r5 | r13) << 1) - (r13 ^ r5))) goto L45;
         */
        /* renamed from: ˎ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m26475(util.h.xy.e.rb.b bVar, java.util.Map<java.lang.String, java.lang.String> map) {
            int i;
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (((i2 | 111) << 1) - (i2 ^ 111)) % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            Camera2StreamConfigurationMap = (i3 + 105) % 128;
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = i4 ^ 79;
            int i6 = (i4 & 79) << 1;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i7 = ((i6 * (-661)) - (~(-(-(i5 * (-661)))))) - 1;
            int i8 = ~identityHashCode;
            int i9 = ~i6;
            int i10 = ~i5;
            int i11 = ~((i9 & i10) | (i9 ^ i10));
            int i12 = ((i8 ^ i11) | (i8 & i11)) * 1324;
            int i13 = ~((i6 ^ identityHashCode) | (i6 & identityHashCode));
            int i14 = ~((identityHashCode ^ i5) | (identityHashCode & i5));
            int i15 = (i7 ^ i12) + ((i7 & i12) << 1) + (((i14 ^ i13) | (i14 & i13)) * (-1324)) + (((~((i6 ^ i10) | (i6 & i10))) | (~((i5 ^ i9) | (i9 & i5)))) * 662);
            getHighSpeedVideoFpsRanges = i15 % 128;
            if (i15 % 2 != 0) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                throw new java.lang.ArithmeticException();
            }
            int i16 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (i16 + 77) % 128;
            if (map != null) {
                int i17 = getHighResolutionOutputSizeshNQ4ISI;
                int i18 = i17 & 17;
                int i19 = i17 ^ 17;
                int i20 = -(-((i19 ^ i18) | (i19 & i18)));
                int i21 = i18 & i20;
                getHighSpeedVideoFpsRanges = (i21 + ((i20 ^ i18) | i21)) % 128;
                if (map.isEmpty()) {
                    int i22 = getHighSpeedVideoFpsRangesFor;
                    i = (i22 & 89) + (i22 | 89);
                } else {
                    int i23 = getHighResolutionOutputSizeshNQ4ISI;
                    int i24 = (i23 & (-39)) | ((~i23) & 38);
                    int i25 = (i23 & 38) << 1;
                    int i26 = (i24 & i25) + (i25 | i24);
                    int i27 = ~i26;
                    int i28 = (i27 | i26) << 1;
                    int i29 = -i27;
                    int identityHashCode2 = java.lang.System.identityHashCode(this);
                    int i30 = i29 * 306;
                    int i31 = ((i30 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) - (i30 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                    int i32 = -(-(i28 * 306));
                    int i33 = ~((i29 ^ i28) | (i29 & i28));
                    int i34 = ~(i29 | identityHashCode2);
                    int i35 = (((i31 & i32) + (i32 | i31)) - (~(-(-(((i33 & i34) | (i33 ^ i34)) * 305))))) - 1;
                    int i36 = ~i28;
                    int i37 = ~identityHashCode2;
                    int i38 = ~((i29 ^ i37) | (i29 & i37));
                    int i39 = ((i38 ^ i36) | (i36 & i38)) * 305;
                    int i40 = (i35 & i39) + (i39 | i35);
                    int i41 = i40 % 128;
                    getHighSpeedVideoFpsRanges = i41;
                    if (i40 % 2 == 0) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 125) % 128;
                    }
                    int i42 = getHighSpeedVideoFpsRangesFor;
                    int i43 = ((i42 ^ 105) + ((i42 & 105) << 1)) % 128;
                    Camera2StreamConfigurationMap = i43;
                    getHighSpeedVideoFpsRangesFor = ((i43 ^ 29) + ((i43 & 29) << 1)) % 128;
                    int identityHashCode3 = java.lang.System.identityHashCode(this);
                    int i44 = i41 * (-755);
                    int i45 = ((-95885) ^ i44) + ((i44 & (-95885)) << 1);
                    int i46 = ~i41;
                    int i47 = (~(i46 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 1512;
                    int i48 = (i45 ^ i47) + ((i45 & i47) << 1);
                    int i49 = (i41 ^ 127) | (i41 & 127);
                    int i50 = ((~((i46 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i46 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) | (~((i49 ^ identityHashCode3) | (i49 & identityHashCode3)))) * (-756);
                    int i51 = i41 | 127;
                    int i52 = ~identityHashCode3;
                    int i53 = (((i48 & i50) + (i50 | i48)) + (((i51 ^ i52) | (i51 & i52)) * 756)) - 1;
                    int i54 = ~i53;
                    int i55 = (i54 | i53) << 1;
                    int i56 = -i54;
                    int identityHashCode4 = java.lang.System.identityHashCode(this);
                    int i57 = i56 * 483;
                    int i58 = i55 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                    int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                    int i60 = ~i56;
                    int i61 = ~i55;
                    int i62 = ~((i60 & i61) | (i60 ^ i61));
                    int i63 = ~identityHashCode4;
                    int i64 = ~((i63 & i60) | (i60 ^ i63));
                    int i65 = ((i62 ^ i64) | (i62 & i64)) * (-241);
                    int i66 = ((((i59 | i65) << 1) - (i59 ^ i65)) - (~((i56 | i55) * (-482)))) - 1;
                    int i67 = ~((i56 ^ i61) | (i56 & i61));
                    int i68 = ~(i55 | i63 | i60);
                    int i69 = -(-(((i67 ^ i68) | (i68 & i67)) * 241));
                    int i70 = (i66 & i69) + (i69 | i66);
                    getHighResolutionOutputSizeshNQ4ISI = i70 % 128;
                    if (i70 % 2 == 0) {
                        int identityHashCode5 = java.lang.System.identityHashCode(this);
                        int i71 = ~identityHashCode5;
                        int i72 = ~(((-1202823166) & i71) | ((-1202823166) ^ i71));
                        int i73 = (i72 ^ 1038857915) | (i72 & 1038857915);
                        int i74 = ~(1202823165 | identityHashCode5);
                        int i75 = ((i73 ^ i74) | (i73 & i74)) * (-564);
                        int i76 = (((1751709909 ^ i75) + ((i75 & 1751709909) << 1)) - (~((~((identityHashCode5 ^ 2147205119) | (2147205119 & identityHashCode5))) * 1128))) - 1;
                        int i77 = ~(i71 | 1038857915);
                        int i78 = ((i77 ^ 944381954) | (944381954 & i77)) * 564;
                        int identityHashCode6 = java.lang.System.identityHashCode(this);
                        int i79 = ~((identityHashCode6 ^ 1046029001) | (identityHashCode6 & 1046029001));
                        int i80 = -(-(((i79 ^ 1084263700) | (1084263700 & i79)) * 336));
                        int i81 = ((-78330750) & i80) + (i80 | (-78330750));
                        int i82 = ~((identityHashCode6 ^ 2023795996) | (identityHashCode6 & 2023795996));
                        int i83 = ((i82 ^ 106496705) | (106496705 & i82)) * (-168);
                        int i84 = ~identityHashCode6;
                        int i85 = ~((i84 ^ 2023795996) | (i84 & 2023795996));
                        if ((i76 & i78) + (i78 | i76) <= (i81 ^ i83) + ((i83 & i81) << 1) + (((i85 ^ 1046029001) | (i85 & 1046029001)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) {
                            throw new java.lang.ArithmeticException();
                        }
                    } else {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 99) % 128;
                    }
                    if (map != null) {
                        int i86 = getHighSpeedVideoFpsRangesFor + 105;
                        int i87 = i86 % 128;
                        Camera2StreamConfigurationMap = i87;
                        if (i86 % 2 == 0) {
                            int i88 = getHighResolutionOutputSizeshNQ4ISI;
                            int i89 = i88 & 26;
                            int i90 = (i88 | 26) & (~i89);
                            int i91 = -(-(i89 << 1));
                            int i92 = (((i90 | i91) << 1) - (i90 ^ i91)) - 1;
                            getHighSpeedVideoFpsRanges = i92 % 128;
                            if (i92 % 2 == 0) {
                                int i93 = i87 + 125;
                                getHighSpeedVideoFpsRangesFor = i93 % 128;
                                int i94 = i93 % 2;
                            }
                            if (map.isEmpty()) {
                                int i95 = getHighSpeedVideoFpsRangesFor;
                                Camera2StreamConfigurationMap = (((i95 | 69) << 1) - (i95 ^ 69)) % 128;
                            } else {
                                int i96 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoFpsRangesFor = (i96 + 39) % 128;
                                int i97 = (i96 & 11) + (i96 | 11);
                                getHighSpeedVideoFpsRangesFor = i97 % 128;
                                if (i97 % 2 != 0) {
                                    int i98 = getHighSpeedVideoFpsRanges;
                                    int i99 = (i98 & (-120)) | ((~i98) & 119);
                                    int i100 = i98 & 119;
                                    int i101 = ((i100 ^ i99) | (i99 & i100)) << 1;
                                    int i102 = -i99;
                                    int i103 = i101 | i102;
                                    int i104 = i103 << 1;
                                    int i105 = -((~(i101 & i102)) & i103);
                                    int i106 = (i105 * (-51)) + (i104 * 53);
                                    int i107 = ~java.lang.System.identityHashCode(this);
                                    int i108 = (i107 & i105) | (i107 ^ i105);
                                    int i109 = (~((i108 & i104) | (i108 ^ i104))) * 52;
                                    int i110 = ~i104;
                                    int i111 = ~((i110 ^ i107) | (i110 & i107));
                                    int i112 = ~(i110 | i105);
                                    int i113 = (i112 ^ i111) | (i112 & i111);
                                    int i114 = ~i108;
                                    int i115 = (i106 & i109) + (i106 | i109) + (((i113 & i114) | (i114 ^ i113)) * (-52));
                                    int i116 = ~i105;
                                    int i117 = ((~((i116 ^ i107) | (i107 & i116))) | (~((i116 & i104) | (i104 ^ i116)))) * 52;
                                    getHighResolutionOutputSizeshNQ4ISI = ((i115 & i117) + (i117 | i115)) % 128;
                                    int i118 = util.h.xy.e.rb.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[bVar.ordinal()];
                                    if (i118 == 1) {
                                        this.getInputSizeshNQ4ISI = map;
                                        int i119 = Camera2StreamConfigurationMap;
                                        getHighSpeedVideoFpsRangesFor = (((i119 | 17) << 1) - (i119 ^ 17)) % 128;
                                        int i120 = getHighResolutionOutputSizeshNQ4ISI;
                                        int i121 = i120 & 67;
                                        int i122 = (i120 | 67) & (~i121);
                                        int i123 = (i122 ^ i121) | (i122 & i121);
                                        int i124 = i121 & i123;
                                        int i125 = -(-((i123 ^ i121) | i124));
                                        getHighSpeedVideoFpsRanges = ((i124 ^ i125) + ((i125 & i124) << 1)) % 128;
                                    } else if (i118 == 2) {
                                        this.getOutputFormats = map;
                                        int i126 = Camera2StreamConfigurationMap;
                                        getHighSpeedVideoFpsRangesFor = ((i126 ^ 77) + ((i126 & 77) << 1)) % 128;
                                        int i127 = getHighSpeedVideoFpsRanges;
                                        int i128 = (i127 & (-22)) | ((~i127) & 21);
                                        int i129 = (i127 & 21) << 1;
                                        int i130 = i128 & i129;
                                        int i131 = (i129 ^ i128) | i130;
                                        int identityHashCode7 = java.lang.System.identityHashCode(this);
                                        int i132 = i131 * 866;
                                        int i133 = i130 * (-864);
                                        int i134 = (i132 ^ i133) + ((i132 & i133) << 1);
                                        int i135 = ~i130;
                                        int i136 = ~identityHashCode7;
                                        int i137 = -(-(((~((~i131) | i136)) | i135) * (-865)));
                                        getHighResolutionOutputSizeshNQ4ISI = ((((i134 & i137) + (i137 | i134)) + ((~(identityHashCode7 | i131)) * 865)) + (((~(i131 | i136)) | (~((i135 ^ i136) | (i135 & i136)))) * 865)) % 128;
                                        int i138 = Camera2StreamConfigurationMap;
                                        int i139 = (i138 ^ 47) + ((i138 & 47) << 1);
                                        getHighSpeedVideoFpsRangesFor = i139 % 128;
                                        if (i139 % 2 == 0) {
                                            int i140 = 3 / 4;
                                        }
                                    } else if (i118 == 3) {
                                        this.getHighSpeedVideoSizesFor = map;
                                        int i141 = Camera2StreamConfigurationMap;
                                        getHighSpeedVideoFpsRangesFor = ((i141 ^ 9) + ((i141 & 9) << 1)) % 128;
                                        int i142 = getHighSpeedVideoFpsRanges;
                                        int i143 = ((i142 ^ 116) | (i142 & 116)) << 1;
                                        int i144 = -((i142 & (-117)) | ((~i142) & 116));
                                        int i145 = (i143 & i144) + (i144 | i143);
                                        int i146 = ~i145;
                                        int i147 = (i146 | i145) << 1;
                                        int i148 = -i146;
                                        int identityHashCode8 = java.lang.System.identityHashCode(this);
                                        int i149 = i148 * (-520);
                                        int i150 = -(-(i147 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL));
                                        int i151 = (i149 & i150) + (i149 | i150);
                                        int i152 = ~i148;
                                        int i153 = (i152 & i147) | (i152 ^ i147);
                                        int i154 = -(-((~((i153 ^ identityHashCode8) | (i153 & identityHashCode8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                                        int i155 = (i151 ^ i154) + ((i154 & i151) << 1);
                                        int i156 = ~i147;
                                        int i157 = (~((i156 ^ i148) | (i156 & i148))) * (-1042);
                                        int i158 = (i155 ^ i157) + ((i157 & i155) << 1);
                                        int i159 = ~(i148 | i156);
                                        int i160 = ~identityHashCode8;
                                        int i161 = (i160 ^ i152) | (i152 & i160);
                                        int i162 = ~((i147 ^ i161) | (i147 & i161));
                                        int i163 = ((i159 ^ i162) | (i162 & i159)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                        getHighResolutionOutputSizeshNQ4ISI = ((i158 ^ i163) + ((i163 & i158) << 1)) % 128;
                                    }
                                }
                            }
                        }
                    }
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 27) % 128;
                    int i164 = getHighSpeedVideoFpsRanges;
                    int i165 = i164 & 95;
                    int i166 = (i164 & (-96)) | ((~i164) & 95) | i165;
                    int identityHashCode9 = java.lang.System.identityHashCode(this);
                    int i167 = i166 * (-500);
                    int i168 = -(-(i165 * (-500)));
                    int i169 = ((i167 | i168) << 1) - (i167 ^ i168);
                    int i170 = ~i165;
                    int i171 = ~(i170 | i166);
                    int i172 = ~i166;
                    int i173 = ~(i172 | i165 | identityHashCode9);
                    int i174 = ((i171 ^ i173) | (i171 & i173)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                    int i175 = ((((i169 | i174) << 1) - (i174 ^ i169)) - (~(-(-((~(i170 | i172)) * 1002))))) - 1;
                    int i176 = ~identityHashCode9;
                    int i177 = (i172 ^ i176) | (i172 & i176);
                    int i178 = (~((i177 ^ i165) | (i177 & i165))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                    int i179 = ((i175 ^ i178) + ((i178 & i175) << 1)) % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i179;
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 77) % 128;
                    int i180 = ((i179 ^ 41) | (i179 & 41)) << 1;
                    int i181 = -((i179 & (-42)) ^ ((~i179) & 41));
                    int i182 = ((~i181) & i180) | ((~i180) & i181);
                    int i183 = (i180 & i181) << 1;
                    int identityHashCode10 = java.lang.System.identityHashCode(this);
                    int i184 = i183 * 70;
                    int i185 = -(-(i182 * (-68)));
                    int i186 = (i184 ^ i185) + ((i184 & i185) << 1);
                    int i187 = ~i183;
                    int i188 = ~i182;
                    int i189 = (i188 & i187) | (i187 ^ i188);
                    int i190 = ~((i189 ^ identityHashCode10) | (i189 & identityHashCode10));
                    int i191 = (i183 ^ i182) | (i183 & i182);
                    int i192 = ~((i191 ^ identityHashCode10) | (i191 & identityHashCode10));
                    int i193 = -(-(((i190 ^ i192) | (i190 & i192)) * 69));
                    int i194 = (i186 ^ i193) + ((i186 & i193) << 1);
                    int i195 = ~((i187 & i182) | (i187 ^ i182));
                    int i196 = ~((i187 ^ identityHashCode10) | (i187 & identityHashCode10));
                    int i197 = (i196 ^ i195) | (i196 & i195);
                    int i198 = ~((identityHashCode10 ^ i182) | (identityHashCode10 & i182));
                    int i199 = ((i198 ^ i197) | (i198 & i197)) * (-69);
                    int i200 = (i194 & i199) + (i199 | i194);
                    int i201 = (~((i183 ^ i188) | (i183 & i188))) * 69;
                    int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                    getHighSpeedVideoFpsRanges = i202 % 128;
                    if (i202 % 2 != 0) {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 9) % 128;
                    } else {
                        int identityHashCode11 = java.lang.System.identityHashCode(this);
                        int i203 = ~((identityHashCode11 ^ 2108588800) | (identityHashCode11 & 2108588800));
                        int i204 = (i203 ^ 89270) | (89270 & i203);
                        int i205 = ~(((-1948508087) & identityHashCode11) | ((-1948508087) ^ identityHashCode11));
                        int i206 = ~identityHashCode11;
                        int i207 = ~((2108588800 ^ i206) | (i206 & 2108588800));
                        int i208 = (identityHashCode11 ^ (-2108588801)) | ((-2108588801) & identityHashCode11);
                        int i209 = ~i208;
                        int i210 = (((((i204 ^ i205) | (i204 & i205)) * (-880)) + 702810853) - (~(-(-((((i207 ^ 1948508086) | (1948508086 & i207)) | i209) * (-880)))))) - 1;
                        int i211 = -(-(i209 * 880));
                        int identityHashCode12 = java.lang.System.identityHashCode(this);
                        int i212 = (~identityHashCode12) | (-2125291027);
                        int i213 = ~i212;
                        int i214 = (~((1785794250 & identityHashCode12) | (1785794250 ^ identityHashCode12))) | (-2130534107);
                        int i215 = ~((i212 ^ (-1785794251)) | (i212 & (-1785794251)));
                        int i216 = (((i213 ^ (-1785794251)) | (i213 & (-1785794251))) * 226) + 631066864 + (((i215 ^ i214) | (i214 & i215)) * (-113));
                        int i217 = (~((identityHashCode12 ^ (-2125291027)) | (identityHashCode12 & (-2125291027)))) * 113;
                    }
                    int i218 = getHighSpeedVideoFpsRangesFor;
                    i = ((i218 | 35) << 1) - (i218 ^ 35);
                }
                Camera2StreamConfigurationMap = i % 128;
            } else {
                getHighSpeedVideoFpsRangesFor = (i16 + 55) % 128;
                getHighSpeedVideoFpsRangesFor = (i16 + 81) % 128;
            }
            int i219 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i219 ^ 117) + ((i219 & 117) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = ((i219 & 87) + (i219 | 87)) % 128;
            int i220 = getHighSpeedVideoFpsRanges;
            int i221 = (i220 ^ 48) + ((i220 & 48) << 1);
            int identityHashCode13 = java.lang.System.identityHashCode(this);
            int i222 = i221 * (-103);
            int i223 = ~i221;
            int i224 = ((i222 << 1) - i222) + ((~((i223 & identityHashCode13) | (i223 ^ identityHashCode13))) * 104);
            int i225 = ~identityHashCode13;
            int i226 = (~((i221 ^ i225) | (i221 & i225))) * (-104);
            int i227 = (((i224 ^ i226) + ((i226 & i224) << 1)) - (~(identityHashCode13 * 104))) - 1;
            int i228 = i227 * 971;
            int i229 = (i228 ^ 1939) + ((i228 & 1939) << 1);
            int i230 = ~java.lang.System.identityHashCode(this);
            int i231 = ~((i230 & i227) | (i230 ^ i227));
            int i232 = -(-(i231 * (-970)));
            int i233 = (i229 & i232) + (i232 | i229);
            int i234 = ~i227;
            int i235 = -(-(i234 * 1940));
            int i236 = ((i233 | i235) << 1) - (i235 ^ i233);
            int i237 = ~i234;
            int i238 = -(-(((i231 ^ i237) | (i231 & i237)) * 970));
            int i239 = ((i236 | i238) << 1) - (i238 ^ i236);
            getHighResolutionOutputSizeshNQ4ISI = i239 % 128;
            if (i239 % 2 == 0) {
                int i240 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = (((i240 | 125) << 1) - (i240 ^ 125)) % 128;
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 97) % 128;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final java.util.Map<java.lang.String, java.lang.String> m26476(util.h.xy.e.rb.b bVar) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i ^ 91) + ((i & 91) << 1)) % 128;
            Camera2StreamConfigurationMap = i2;
            int i3 = ((i2 & 15) + (i2 | 15)) % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            int i4 = ((i3 ^ 117) + ((i3 & 117) << 1)) % 128;
            Camera2StreamConfigurationMap = i4;
            int i5 = getHighSpeedVideoFpsRanges;
            int i6 = i5 & 91;
            int i7 = (i5 | 91) & (~i6);
            int i8 = i6 + ((i7 ^ i6) | (i7 & i6));
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 == 0) {
                getHighSpeedVideoFpsRanges(bVar);
                throw new java.lang.ArithmeticException();
            }
            int i9 = i4 + 75;
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 5;
            }
            java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bVar);
            int i11 = getHighResolutionOutputSizeshNQ4ISI;
            int i12 = i11 & 109;
            int i13 = -(~(-(-((i11 ^ 109) | i12))));
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i14 = i13 * 530;
            int i15 = ((((i14 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) << 1) - (i14 ^ org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO)) - (~(i12 * 530))) - 1;
            int i16 = ~identityHashCode;
            int i17 = ~((i16 ^ i13) | (i16 & i13));
            int i18 = ~(i13 | i12);
            int i19 = ((i17 ^ i18) | (i17 & i18)) * 529;
            int i20 = ~i12;
            int i21 = ~((i13 ^ identityHashCode) | (i13 & identityHashCode));
            int i22 = (i15 & i19) + (i19 | i15) + (((i21 ^ i20) | (i21 & i20)) * 529);
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i23 = -(-(i22 * (-518)));
            int i24 = ~identityHashCode2;
            int i25 = ~i24;
            int i26 = ((((i23 ^ my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND) + ((i23 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND) << 1)) - (~(((i25 & i22) | (i25 ^ i22)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - 1) + ((~((i24 & i22) | (i24 ^ i22))) * (-519));
            int i27 = ~((identityHashCode2 ^ i22) | (identityHashCode2 & i22));
            int i28 = -(-((i27 | (i27 ^ (-1))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
            int i29 = (i26 ^ i28) + ((i28 & i26) << 1);
            getHighSpeedVideoFpsRanges = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = ((i30 ^ 25) + ((i30 & 25) << 1)) % 128;
                throw null;
            }
            int i31 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i31 | 9) << 1) - (i31 ^ 9)) % 128;
            int i32 = (((i31 | 61) << 1) - (i31 ^ 61)) % 128;
            Camera2StreamConfigurationMap = i32;
            getHighSpeedVideoFpsRangesFor = ((i32 & 65) + (i32 | 65)) % 128;
            getHighSpeedVideoFpsRangesFor = ((i32 & 41) + (i32 | 41)) % 128;
            return highSpeedVideoFpsRanges;
        }

        private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(util.h.xy.e.rb.b bVar) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i & 15) + (i | 15)) % 128;
            Camera2StreamConfigurationMap = i2;
            getHighSpeedVideoFpsRangesFor = (i2 + 73) % 128;
            int i3 = getHighSpeedVideoFpsRanges + 116;
            int i4 = ~i3;
            int i5 = i3 << 1;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i6 = ((i5 * (-375)) - (~(i4 * (-375)))) - 1;
            int i7 = ~i5;
            int i8 = ~i4;
            int i9 = ~((i8 ^ i7) | (i8 & i7));
            int i10 = (i9 ^ identityHashCode) | (i9 & identityHashCode);
            int i11 = ~(i5 | i4);
            int i12 = ((i10 ^ i11) | (i10 & i11)) * 376;
            int i13 = ((i6 | i12) << 1) - (i6 ^ i12);
            int i14 = ~identityHashCode;
            int i15 = ~((i14 ^ i5) | (i14 & i5));
            int i16 = ~((i5 ^ i4) | (i5 & i4));
            int i17 = ((i16 ^ i15) | (i16 & i15)) * (-376);
            int i18 = ((i13 | i17) << 1) - (i17 ^ i13);
            int i19 = ~((i7 ^ identityHashCode) | (identityHashCode & i7));
            int i20 = -(-(((i19 ^ i4) | (i19 & i4)) * 376));
            int i21 = (i18 ^ i20) + ((i20 & i18) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = ((i22 & 11) + (i22 | 11)) % 128;
                int i23 = util.h.xy.e.rb.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[bVar.ordinal()];
                throw null;
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            int i24 = util.h.xy.e.rb.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[bVar.ordinal()];
            if (i24 == 1) {
                java.util.Map<java.lang.String, java.lang.String> map = this.getInputSizeshNQ4ISI;
                int i25 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = (i25 + 39) % 128;
                getHighSpeedVideoFpsRangesFor = ((i25 ^ 111) + ((i25 & 111) << 1)) % 128;
                int i26 = getHighResolutionOutputSizeshNQ4ISI;
                int i27 = ((i26 | 34) << 1) - (i26 ^ 34);
                int i28 = ~i27;
                int i29 = i28 | i27;
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i30 = i29 * (-495);
                int i31 = i27 * (-495);
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                int i33 = ~i29;
                int i34 = ~((i28 ^ i33) | (i33 & i28));
                int i35 = ~((i33 & identityHashCode2) | (i33 ^ identityHashCode2));
                int i36 = (i34 ^ i35) | (i34 & i35);
                int i37 = -(-(i36 * 992));
                int i38 = ((i32 | i37) << 1) - (i37 ^ i32);
                int i39 = ~identityHashCode2;
                int i40 = (i29 ^ i39) | (i29 & i39);
                int i41 = ~((i40 ^ i27) | (i40 & i27));
                int i42 = ((i36 ^ i41) | (i41 & i36)) * (-496);
                int i43 = (((i38 & i42) + (i42 | i38)) - (~(-(-(((i27 ^ identityHashCode2) | (i27 & identityHashCode2)) * 496))))) - 1;
                getHighSpeedVideoFpsRanges = i43 % 128;
                if (i43 % 2 == 0) {
                    int i44 = Camera2StreamConfigurationMap;
                    int i45 = (i44 ^ 71) + ((i44 & 71) << 1);
                    getHighSpeedVideoFpsRangesFor = i45 % 128;
                    if (i45 % 2 != 0) {
                        return map;
                    }
                } else {
                    int i46 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = (i46 + 125) % 128;
                    Camera2StreamConfigurationMap = (i46 + 75) % 128;
                }
                throw new java.lang.ArithmeticException();
            }
            if (i24 != 2) {
                if (i24 == 3) {
                    java.util.Map<java.lang.String, java.lang.String> map2 = this.getHighSpeedVideoSizesFor;
                    int i47 = getHighSpeedVideoFpsRanges;
                    int i48 = i47 & 21;
                    getHighResolutionOutputSizeshNQ4ISI = (i48 + (((i47 | 21) & (~i48)) | i48)) % 128;
                    return map2;
                }
                int i49 = getHighResolutionOutputSizeshNQ4ISI;
                int i50 = (i49 & (-116)) | ((~i49) & 115);
                int i51 = (i49 & 115) << 1;
                int i52 = i50 & i51;
                int i53 = -(-((i51 ^ i50) | i52));
                int i54 = (i52 & i53) + (i53 | i52);
                getHighSpeedVideoFpsRanges = i54 % 128;
                if (i54 % 2 != 0) {
                    int i55 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRangesFor = ((i55 & 89) + (i55 | 89)) % 128;
                }
                return null;
            }
            java.util.Map<java.lang.String, java.lang.String> map3 = this.getOutputFormats;
            int i56 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i56 ^ 67) + ((i56 & 67) << 1)) % 128;
            int i57 = getHighResolutionOutputSizeshNQ4ISI;
            int i58 = i57 & 46;
            int i59 = (i58 - (~((i57 ^ 46) | i58))) - 1;
            int i60 = (i59 << 1) - i59;
            int identityHashCode3 = java.lang.System.identityHashCode(this);
            int i61 = -(-(i60 * 503));
            int i62 = ((i61 | (-503)) << 1) - (i61 ^ (-503));
            int i63 = ((i62 | 502) << 1) - (i62 ^ 502);
            int i64 = ~(~i60);
            int i65 = ~identityHashCode3;
            int i66 = ~i65;
            int i67 = (i64 ^ i66) | (i64 & i66);
            int i68 = ~(identityHashCode3 | (identityHashCode3 ^ (-1)));
            int i69 = -(-(((i67 ^ i68) | (i67 & i68)) * (-502)));
            int i70 = (i63 ^ i69) + ((i63 & i69) << 1);
            int i71 = ~(i60 | i65);
            int i72 = ((i71 ^ i68) | (i71 & i68)) * 502;
            int i73 = ((i70 | i72) << 1) - (i72 ^ i70);
            getHighSpeedVideoFpsRanges = i73 % 128;
            if (i73 % 2 != 0) {
                throw null;
            }
            int i74 = Camera2StreamConfigurationMap;
            int i75 = (i74 ^ 63) + ((i74 & 63) << 1);
            getHighSpeedVideoFpsRangesFor = i75 % 128;
            if (i75 % 2 != 0) {
                return map3;
            }
            throw null;
        }
    }

    /* renamed from: util.h.xy.e.rb$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int Camera2StreamConfigurationMap = 1;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
        
            if (((r6 & (-4)) + (r6 | (-4))) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00cb, code lost:
        
            util.h.xy.e.rb.AnonymousClass2.getHighSpeedVideoFpsRanges = (r4 + 89) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            util.h.xy.e.rb.AnonymousClass2.getHighSpeedVideoFpsRangesFor = ((r0 & 111) + (r0 | 111)) % 128;
            util.h.xy.e.rb.AnonymousClass2.getHighSpeedVideoFpsRangesFor = (r0 + 105) % 128;
            util.h.xy.e.rb.AnonymousClass2.getHighSpeedVideoFpsRangesFor = (r0 + 71) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        
            if ((r5 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        
            if ((r4 % 2) != 0) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
        
            if ((r0 >>> 5) == 0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0159  */
        static {
            int i;
            int[] iArr = new int[util.h.xy.e.rb.b.m26477().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[util.h.xy.e.rb.b.f1879.ordinal()] = 1;
                int i2 = getHighSpeedVideoFpsRangesFor + 115;
                int i3 = i2 % 128;
                getHighSpeedVideoFpsRanges = i3;
                if (i2 % 2 != 0) {
                    int i4 = getHighSpeedVideoSizes;
                    int i5 = i4 & 16;
                    int i6 = i4 ^ 16;
                    int i7 = -(-((i6 ^ i5) | (i6 & i5)));
                    int i8 = i5 | i7;
                    int i9 = (i8 << 1) << ((~(i7 & i5)) & i8);
                    Camera2StreamConfigurationMap = i9 - 744;
                } else {
                    int i10 = getHighSpeedVideoSizes;
                    int i11 = i10 & 113;
                    int i12 = (i10 & (-114)) | ((~i10) & 113);
                    int i13 = -(-((i12 ^ i11) | (i12 & i11)));
                    int i14 = ((i11 ^ i13) | (i11 & i13)) << 1;
                    int i15 = -(((~i13) & i11) | ((~i11) & i13));
                    int i16 = (i14 & i15) + (i15 | i14);
                    Camera2StreamConfigurationMap = i16 % 128;
                }
                int i17 = (i3 & 75) + (i3 | 75);
                getHighSpeedVideoFpsRangesFor = i17 % 128;
                int i18 = i17 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.e.rb.b.f1881.ordinal()] = 2;
                int i19 = getHighSpeedVideoFpsRanges;
                int i20 = (i19 & 17) + (i19 | 17);
                int i21 = i20 % 128;
                getHighSpeedVideoFpsRangesFor = i21;
                if (i20 % 2 == 0) {
                    int i22 = getHighSpeedVideoSizes;
                    int i23 = (i22 & (-104)) | ((~i22) & 103);
                    int i24 = -((i22 & 103) >> 1);
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    Camera2StreamConfigurationMap = i25 * 22830;
                } else {
                    int i26 = getHighSpeedVideoSizes;
                    int i27 = ((i26 & (-80)) | ((~i26) & 79)) + ((i26 & 79) << 1);
                    Camera2StreamConfigurationMap = i27 % 128;
                }
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.e.rb.b.f1880.ordinal()] = 3;
                int i28 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i28 ^ 35) + ((i28 & 35) << 1)) % 128;
                int i29 = Camera2StreamConfigurationMap;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i30 = -(-(i29 * (-667)));
                int i31 = (i30 ^ (-28035)) + ((i30 & (-28035)) << 1);
                int i32 = ~i29;
                int i33 = (currentTimeMillis ^ 21) | (currentTimeMillis & 21);
                int i34 = ((~i33) | i32) * (-668);
                getHighSpeedVideoSizes = ((((i31 ^ i34) + ((i31 & i34) << 1)) + (((~((currentTimeMillis ^ i32) | (currentTimeMillis & i32))) | 21) * 1336)) + ((i32 | i33) * 668)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int i35 = getHighSpeedVideoSizes;
            int i36 = i35 & 19;
            int i37 = (i35 & (-20)) | ((~i35) & 19);
            int i38 = (i37 ^ i36) | (i37 & i36);
            int i39 = i36 & i38;
            i = ((((i36 ^ i38) | i39) << 1) - (~(-((i38 | i36) & (~i39))))) - 1;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                int i40 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoFpsRanges = (i40 + 61) % 128;
                getHighSpeedVideoFpsRanges = (i40 + 101) % 128;
                throw null;
            }
            int i41 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i41 ^ 65) + ((i41 & 65) << 1)) % 128;
            int i42 = (i41 + 17) % 128;
            getHighSpeedVideoFpsRangesFor = i42;
            getHighSpeedVideoFpsRanges = (((i42 | 109) << 1) - (i42 ^ 109)) % 128;
            return;
            int i352 = getHighSpeedVideoSizes;
            int i362 = i352 & 19;
            int i372 = (i352 & (-20)) | ((~i352) & 19);
            int i382 = (i372 ^ i362) | (i372 & i362);
            int i392 = i362 & i382;
            i = ((((i362 ^ i382) | i392) << 1) - (~(-((i382 | i362) & (~i392))))) - 1;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
            }
        }
    }
}
