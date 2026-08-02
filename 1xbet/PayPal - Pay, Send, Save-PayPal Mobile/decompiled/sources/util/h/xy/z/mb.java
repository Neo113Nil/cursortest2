package util.h.xy.z;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;

    private mb() {
    }

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor = util.h.xy.z.mb.class.getName();
        int i = Camera2StreamConfigurationMap + 99;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27716() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 85) + ((i & 85) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        byte[] m27713 = m27713("");
        if (i2 % 2 != 0) {
            return m27713;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighResolutionOutputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m27713(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (((i | 121) << 1) - (i ^ 121)) % 128;
        byte[] m24548 = util.h.xy.ad.a.m24548(m27718());
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return m24548;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m27712() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.DataOutputStream dataOutputStream;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        int length = util.h.xy.v.ra.f2618.length();
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i2 = 301 - (~(-(-(length * 603))));
        int i3 = ~currentTimeMillis;
        int i4 = ~((i3 ^ (-2)) | (i3 & (-2)));
        int i5 = -(-(((i4 ^ length) | (i4 & length)) * (-602)));
        int i6 = (i2 & i5) + (i2 | i5);
        int i7 = ~length;
        int i8 = -(-(((~(currentTimeMillis | (-2))) | (~((i7 ^ (-2)) | (i7 & (-2)))) | (~((i3 & 1) | (i3 ^ 1) | length))) * (-301)));
        int i9 = 1;
        int i10 = ((((i6 | i8) << 1) - (i8 ^ i6)) + ((~(length | i3)) * 301)) / 2;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (true) {
            i = 16;
            if (i11 >= i10) {
                break;
            }
            int i12 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i12 ^ 89) + ((i12 & 89) << 1)) % 128;
            int i13 = i11 * 2;
            bArr[i11] = (byte) java.lang.Integer.parseInt(util.h.xy.v.ra.f2618.substring(i13, (i13 ^ 2) + ((i13 & 2) << 1)), 16);
            int i14 = i11 + 43;
            i11 = (i14 & (-42)) + (i14 | (-42));
        }
        int length2 = (util.h.xy.v.ra.f2621.length() + 1) / 2;
        byte[] bArr2 = new byte[length2];
        int i15 = 0;
        while (i15 < length2) {
            java.lang.String str = util.h.xy.v.ra.f2621;
            int i16 = i15 * 2;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i17 = -(-(i15 * (-418)));
            int i18 = ~i16;
            int i19 = ~currentTimeMillis2;
            int i20 = (i17 ^ (-418)) + ((i17 & (-418)) << i9) + ((~((i18 ^ (-3)) | (i18 & (-3)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~((currentTimeMillis2 ^ (-3)) | (currentTimeMillis2 & (-3)))) | (~((i18 ^ i19) | (i18 & i19)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            int i21 = (i19 & (-3)) | (i19 ^ (-3));
            int i22 = ~((i21 ^ i16) | (i21 & i16));
            int i23 = ~(currentTimeMillis2 | i18 | 2);
            int i24 = -(-(((i22 ^ i23) | (i23 & i22)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
            bArr2[i15] = (byte) java.lang.Integer.parseInt(str.substring(i16, (i20 & i24) + (i20 | i24)), 16);
            i15 = (((i15 | 30) << 1) - (i15 ^ 30)) - 29;
            int i25 = Camera2StreamConfigurationMap;
            int i26 = (i25 ^ 11) + ((i25 & 11) << 1);
            getHighSpeedVideoSizes = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 4 / 3;
            }
            i9 = 1;
        }
        byte[] bArr3 = new byte[i10];
        int i28 = 0;
        for (int i29 = 0; i29 < i10; i29 = ((i29 | 1) << 1) - (i29 ^ 1)) {
            int i30 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (((i30 | 19) << 1) - (i30 ^ 19)) % 128;
            byte b = bArr[i29];
            byte b2 = bArr2[i28 % length2];
            bArr3[i28] = (byte) ((b & (~b2)) | ((~b) & b2));
            int i31 = (i28 & 79) + (i28 | 79);
            i28 = (i31 ^ (-78)) + ((i31 & (-78)) << 1);
        }
        java.lang.String string = android.provider.Settings.Secure.getString(m24558.getContentResolver(), util.h.xy.al.ra.f425);
        int i32 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i32 & 27) + (i32 | 27)) % 128;
        try {
            int i33 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i34 = (i33 * 569) + 12518;
            int i35 = ~i33;
            int i36 = ~((i35 ^ (-23)) | (i35 & (-23)));
            int i37 = ~currentTimeMillis3;
            int i38 = ~((i35 ^ i37) | (i35 & i37));
            int i39 = (i36 & i38) | (i36 ^ i38);
            int i40 = ~(i37 | (-23));
            int i41 = ((i39 & i40) | (i39 ^ i40)) * (-1136);
            int i42 = ~((i35 ^ currentTimeMillis3) | (i35 & currentTimeMillis3));
            int i43 = ~((currentTimeMillis3 ^ (-23)) | (currentTimeMillis3 & (-23)));
            int i44 = (i37 ^ i33) | (i37 & i33);
            int i45 = (i34 ^ i41) + ((i34 & i41) << 1) + (((i42 & i43) | (i42 ^ i43) | (~((i44 & 22) | (i44 ^ 22)))) * (-568));
            int i46 = (~(i33 | i37)) | (~((i37 ^ 22) | (i37 & 22)));
            int i47 = i35 | (-23);
            int i48 = ~((currentTimeMillis3 ^ i47) | (currentTimeMillis3 & i47));
            int i49 = ((i46 ^ i48) | (i46 & i48)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((i45 ^ i49) + ((i49 & i45) << 1), android.view.View.resolveSizeAndState(0, 0, 0), (char) (44303 - android.view.View.resolveSize(0, 0)), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            int i50 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            int i51 = -android.view.KeyEvent.keyCodeFromString("");
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((maximumDrawingCacheSize >> 24) + 17, (i50 & 23) + (i50 | 23), (char) (((i51 | 14324) << 1) - (i51 ^ 14324)), objArr2);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(m24558, null);
            java.lang.String[] strArr = util.h.xy.v.ra.f2619;
            int length3 = strArr.length;
            long j = 0;
            int i52 = 0;
            while (i52 < length3) {
                int i53 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i53 ^ 113) + ((i53 & 113) << 1)) % 128;
                java.lang.String str2 = strArr[i52];
                j <<= 1;
                getHighSpeedVideoSizes = ((i53 & 59) + (i53 | 59)) % 128;
                int i54 = -android.graphics.Color.blue(0);
                java.lang.String[] strArr2 = strArr;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes((i54 & 33) + (i54 | 33), 39 - (~(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> i), objArr3);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                int i55 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                int i56 = -android.os.Process.getGidForName("");
                int i57 = length3;
                int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                int i58 = i56 * 491;
                int i59 = ((i58 | (-35208)) << 1) - (i58 ^ (-35208));
                int i60 = ~i56;
                int i61 = (i60 | (-73) | (~currentTimeMillis4)) * (-490);
                int i62 = ((i59 | i61) << 1) - (i59 ^ i61);
                int i63 = ~((i56 & (-73)) | (i56 ^ (-73)));
                int i64 = ~((currentTimeMillis4 & (-73)) | (currentTimeMillis4 ^ (-73)));
                int i65 = -(-(((i63 ^ i64) | (i63 & i64)) * 490));
                byte[] bArr4 = bArr3;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((i55 & 17) + (i55 | 17), (((i62 | i65) << 1) - (i62 ^ i65)) + (i60 * 490), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
                if (((java.lang.Boolean) cls2.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(invoke, str2)).booleanValue()) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 69) % 128;
                    j = 1 | j;
                } else {
                    int i66 = Camera2StreamConfigurationMap + 65;
                    getHighSpeedVideoSizes = i66 % 128;
                    int i67 = i66 % 2;
                }
                i52++;
                strArr = strArr2;
                length3 = i57;
                bArr3 = bArr4;
                i = 16;
            }
            byte[] bArr5 = bArr3;
            try {
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(byteArrayOutputStream);
                        try {
                            dataOutputStream2.writeLong(j);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            int i68 = getHighSpeedVideoSizes + 119;
                            Camera2StreamConfigurationMap = i68 % 128;
                            if (i68 % 2 != 0) {
                                dataOutputStream2.close();
                                throw null;
                            }
                            dataOutputStream2.close();
                            int i69 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoSizes = (((i69 | 51) << 1) - (i69 ^ 51)) % 128;
                            byteArrayOutputStream.close();
                            int i70 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                            int i71 = i70 * (-1939);
                            int i72 = ((i71 | 15536) << 1) - (i71 ^ 15536);
                            int i73 = ~((i70 ^ (-17)) | (i70 & (-17)));
                            int i74 = ~currentTimeMillis5;
                            int i75 = ~((i74 ^ 16) | (i74 & 16));
                            int i76 = -(-(((i73 ^ i75) | (i73 & i75)) * (-970)));
                            int i77 = ~i70;
                            int i78 = ~(i77 | (-17));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(((((i72 & i76) + (i76 | i72)) - (~((~(i77 | 16)) * 1940))) - 1) + (((i78 & i75) | (i75 ^ i78)) * 970), android.view.View.MeasureSpec.getMode(0) + 89, (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr5);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                            int i79 = -android.text.TextUtils.getOffsetBefore("", 0);
                            int i80 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int rgb = android.graphics.Color.rgb(0, 0, 0);
                            char c = (char) ((16825621 ^ rgb) + ((rgb & 16825621) << 1));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(11 - (~i79), ((i80 | 153) << 1) - (i80 ^ 153), c, objArr6);
                            byte[] bytes = ((java.lang.String) cls3.getField((java.lang.String) objArr6[0]).get(null)).getBytes();
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, android.graphics.Color.alpha(0) + 89, (char) android.view.View.combineMeasuredStates(0, 0), objArr7);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                            int i81 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                            int i82 = (i81 * (-751)) - 88618;
                            int i83 = ~i81;
                            int i84 = ~((i83 ^ (-119)) | (i83 & (-119)));
                            int i85 = ~((i83 ^ currentTimeMillis6) | (i83 & currentTimeMillis6));
                            int i86 = ((i84 & i85) | (i84 ^ i85)) * 1504;
                            int i87 = ((i82 | i86) << 1) - (i82 ^ i86);
                            int i88 = (i83 ^ 118) | (i83 & 118);
                            int i89 = (~((currentTimeMillis6 ^ i88) | (i88 & currentTimeMillis6))) * (-1504);
                            int i90 = ((i87 | i89) << 1) - (i89 ^ i87);
                            int i91 = ((~((i81 ^ (-119)) | (i81 & (-119)))) | (~(i83 | 118))) * 752;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((offsetAfter & 5) + (offsetAfter | 5), (i90 ^ i91) + ((i91 & i90) << 1), (char) ((-2) - (~(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), objArr8);
                            byte[] bytes2 = ((java.lang.String) cls4.getField((java.lang.String) objArr8[0]).get(null)).getBytes();
                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                            int threadPriority = android.os.Process.getThreadPriority(0);
                            int i92 = threadPriority * (-1527);
                            int i93 = ~((int) java.lang.System.currentTimeMillis());
                            int i94 = ~((i93 ^ 20) | (i93 & 20));
                            int i95 = (i92 & 15300) + (i92 | 15300) + (((i94 & threadPriority) | (threadPriority ^ i94)) * 764);
                            int i96 = ~((threadPriority & (-21)) | (threadPriority ^ (-21)));
                            int i97 = ~(i93 | threadPriority);
                            int i98 = ((i97 ^ i96) | (i97 & i96)) * (-1528);
                            int i99 = ~threadPriority;
                            int i100 = (~((i99 ^ 20) | (i99 & 20))) | i96;
                            int i101 = -((((((i95 | i98) << 1) - (i98 ^ i95)) - (~(((i100 & i94) | (i100 ^ i94)) * 764))) - 1) >> 6);
                            int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                            int i102 = (i101 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) - 25098;
                            int i103 = ~i101;
                            int i104 = ~((i103 & 89) | (i103 ^ 89));
                            int i105 = ~((i103 ^ currentTimeMillis7) | (i103 & currentTimeMillis7));
                            int i106 = -(-(((i104 ^ i105) | (i104 & i105)) * (-283)));
                            int i107 = (i103 & (-90)) | (i103 ^ (-90));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(offsetAfter2 + 16, ((((i102 & i106) + (i102 | i106)) - (~((~((i101 ^ (-90)) | (i101 & (-90)))) * 283))) - 1) + ((~((i107 & currentTimeMillis7) | (currentTimeMillis7 ^ i107))) * 283), (char) android.graphics.Color.green(0), objArr9);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            int mode = android.view.View.MeasureSpec.getMode(0);
                            int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                            int i108 = mode * 615;
                            int i109 = (i108 ^ (-4904)) + ((i108 & (-4904)) << 1);
                            int i110 = ~mode;
                            int i111 = ~((i110 ^ 8) | (i110 & 8));
                            int i112 = (i111 & currentTimeMillis8) | (currentTimeMillis8 ^ i111);
                            int i113 = ~((mode & (-9)) | (mode ^ (-9)));
                            int i114 = ((i112 ^ i113) | (i112 & i113)) * 614;
                            int i115 = ~currentTimeMillis8;
                            int i116 = i111 | (~((i110 & i115) | (i110 ^ i115)));
                            int i117 = ~(i115 | 8);
                            int i118 = (i109 & i114) + (i109 | i114) + (((i117 & i116) | (i116 ^ i117)) * (-1228));
                            int i119 = ~(i110 | (-9) | i115);
                            int i120 = ~((i115 ^ mode) | (mode & i115) | 8);
                            int i121 = ((i120 ^ i119) | (i120 & i119)) * 614;
                            int i122 = -android.graphics.Color.alpha(0);
                            int i123 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                            int i124 = ~i123;
                            int i125 = ~currentTimeMillis9;
                            int i126 = (~((i125 ^ (-2)) | (i125 & (-2)))) | i124;
                            int i127 = ~((currentTimeMillis9 ^ 1) | (currentTimeMillis9 & 1));
                            int i128 = -(-(((i126 ^ i127) | (i126 & i127)) * (-564)));
                            int i129 = (i124 ^ 1) | (i124 & 1);
                            int i130 = ((((i123 * (-563)) + 565) - (~i128)) - 1) + ((~((i129 ^ currentTimeMillis9) | (currentTimeMillis9 & i129))) * 1128);
                            int i131 = -(-(((~((i123 ^ 1) | (i123 & 1))) | (~((i124 ^ i125) | (i124 & i125)))) * 564));
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((i118 ^ i121) + ((i121 & i118) << 1), ((i122 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i122 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE), (char) ((i130 & i131) + (i130 | i131)), objArr10);
                            byte[] bytes3 = ((java.lang.String) cls5.getField((java.lang.String) objArr10[0]).get(null)).getBytes();
                            byte[] bytes4 = java.lang.String.valueOf(util.h.xy.v.b.f2439.m27596(m24558, new byte[]{0})).getBytes();
                            int length4 = string.getBytes().length;
                            int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                            int i132 = length4 * (-518);
                            int i133 = i10 * (-518);
                            int i134 = (i132 ^ i133) + ((i132 & i133) << 1);
                            int i135 = ~length4;
                            int i136 = ~currentTimeMillis10;
                            int i137 = (i135 ^ i136) | (i135 & i136);
                            int i138 = ~i137;
                            int i139 = -(-(((i138 ^ i10) | (i138 & i10)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                            int i140 = ~((i137 ^ i10) | (i137 & i10));
                            int i141 = ~((length4 ^ i10) | (length4 & i10) | currentTimeMillis10);
                            int i142 = (i134 & i139) + (i139 | i134) + (((i140 ^ i141) | (i140 & i141)) * (-519)) + ((length4 | (~((i10 ^ currentTimeMillis10) | (i10 & currentTimeMillis10)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE);
                            int i143 = -(-byteArray.length);
                            int i144 = ((((i142 | i143) << 1) - (i143 ^ i142)) - (~bytes.length)) - 1;
                            int i145 = -(-bytes2.length);
                            int i146 = (i144 ^ i145) + ((i144 & i145) << 1);
                            int length5 = bytes3.length;
                            int i147 = ((i146 | length5) << 1) - (length5 ^ i146);
                            int length6 = bytes4.length;
                            byte[][] bArr6 = {bArr5, string.getBytes(), byteArray, bytes, bytes2, bytes3, bytes4};
                            byte[] bArr7 = new byte[(i147 & length6) + (length6 | i147)];
                            int i148 = 0;
                            for (int i149 = 0; i149 < 7; i149 = (i149 & 1) + (i149 | 1)) {
                                int i150 = (getHighSpeedVideoSizes + 1) % 128;
                                Camera2StreamConfigurationMap = i150;
                                byte[] bArr8 = bArr6[i149];
                                if (bArr8 != null) {
                                    int i151 = (i150 & 107) + (i150 | 107);
                                    getHighSpeedVideoSizes = i151 % 128;
                                    if (i151 % 2 == 0) {
                                        java.lang.System.arraycopy(bArr8, 0, bArr7, i148, bArr8.length);
                                        i148 >>= bArr8.length;
                                    } else {
                                        java.lang.System.arraycopy(bArr8, 0, bArr7, i148, bArr8.length);
                                        int length7 = bArr8.length;
                                        i148 = (i148 & length7) + (i148 | length7);
                                    }
                                }
                            }
                            util.h.xy.ar.b.m25074(bArr5);
                            util.h.xy.ar.b.m25098(string.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                            util.h.xy.ar.b.m25074(byteArray);
                            util.h.xy.ar.b.m25074(bytes);
                            util.h.xy.ar.b.m25074(bytes2);
                            util.h.xy.ar.b.m25074(bytes3);
                            util.h.xy.ar.b.m25074(bytes4);
                            util.h.xy.ar.b.m25098(bArr7);
                            int i152 = getHighSpeedVideoSizes + 15;
                            Camera2StreamConfigurationMap = i152 % 128;
                            if (i152 % 2 == 0) {
                                return bArr7;
                            }
                            throw new java.lang.ArithmeticException();
                        } catch (java.lang.Throwable th) {
                            th = th;
                            dataOutputStream = dataOutputStream2;
                            if (dataOutputStream != null) {
                                dataOutputStream.close();
                                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 5) % 128;
                            }
                            if (byteArrayOutputStream != null) {
                                int i153 = Camera2StreamConfigurationMap;
                                int i154 = ((i153 | 79) << 1) - (i153 ^ 79);
                                getHighSpeedVideoSizes = i154 % 128;
                                if (i154 % 2 == 0) {
                                    byteArrayOutputStream.close();
                                    throw new java.lang.ArithmeticException();
                                }
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                } catch (java.io.IOException unused) {
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f715);
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                dataOutputStream = null;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m27718() {
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        int length = util.h.xy.v.ra.f2618.length();
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = length * (-139);
        int i2 = ~(length | (-2));
        int i3 = ~((currentTimeMillis ^ (-2)) | (currentTimeMillis & (-2)));
        int i4 = ~length;
        int i5 = ~((i4 ^ currentTimeMillis) | (i4 & currentTimeMillis));
        int i6 = (i4 & (-2)) | (i4 ^ (-2));
        int i7 = ~((i6 ^ currentTimeMillis) | (i6 & currentTimeMillis));
        int i8 = ~currentTimeMillis;
        int i9 = (i8 & (-2)) | (i8 ^ (-2));
        int i10 = ~((length ^ i9) | (length & i9));
        int i11 = (i10 ^ i7) | (i10 & i7);
        int i12 = (i8 ^ i4) | (i8 & i4);
        int i13 = ~((i12 ^ 1) | (i12 & 1));
        int i14 = ((((((i | 141) << 1) - (i ^ 141)) + (((i2 & i3) | (i2 ^ i3)) * (-280))) + (((i3 & i5) | (i3 ^ i5)) * 140)) + (((i11 ^ i13) | (i11 & i13)) * 140)) / 2;
        byte[] bArr = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 39) % 128;
            java.lang.String str = util.h.xy.v.ra.f2618;
            int i16 = i15 * 2;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i17 = i15 * 814;
            int i18 = ~i16;
            int i19 = ~currentTimeMillis2;
            int i20 = (i19 ^ 2) | (i19 & 2);
            int i21 = (i18 & i19) | (i18 ^ i19);
            int i22 = (((((i17 & (-810)) + (i17 | (-810))) - (~(((~((i18 & currentTimeMillis2) | (i18 ^ currentTimeMillis2))) | (~((i20 & i16) | (i20 ^ i16)))) * (-406)))) - 1) - (~((~((i21 & 2) | (i21 ^ 2))) * (-406)))) - 1;
            int i23 = ((~((currentTimeMillis2 ^ (-3)) | (currentTimeMillis2 & (-3)))) | (~((i19 ^ i16) | (i19 & i16)))) * 406;
            bArr[i15] = (byte) java.lang.Integer.parseInt(str.substring(i16, (i22 & i23) + (i23 | i22)), 16);
        }
        int length2 = util.h.xy.v.ra.f2621.length();
        int i24 = ((length2 & 1) + (length2 | 1)) / 2;
        byte[] bArr2 = new byte[i24];
        int i25 = 0;
        while (i25 < i24) {
            int i26 = Camera2StreamConfigurationMap + 37;
            getHighSpeedVideoSizes = i26 % 128;
            if (i26 % 2 == 0) {
                bArr2[i25] = (byte) java.lang.Integer.parseInt(util.h.xy.v.ra.f2621.substring(5 >> i25, (4 % i25) / 4), 69);
                i25 += 118;
            } else {
                int i27 = i25 * 2;
                bArr2[i25] = (byte) java.lang.Integer.parseInt(util.h.xy.v.ra.f2621.substring(i27, i27 + 2), 16);
                i25 = (i25 ^ (-40)) + ((i25 & (-40)) << 1) + 41;
            }
            int i28 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i28 | 25) << 1) - (i28 ^ 25)) % 128;
        }
        byte[] bArr3 = new byte[i14];
        int i29 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i29 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i29 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        int i30 = 0;
        int i31 = 0;
        while (i30 < i14) {
            byte b = bArr[i30];
            byte b2 = bArr2[i31 % i24];
            bArr3[i31] = (byte) ((~(b & b2)) & (b | b2));
            i31 = ((i31 | 1) << 1) - (i31 ^ 1);
            int i32 = (i30 & (-11)) + (i30 | (-11));
            i30 = (i32 & 12) + (i32 | 12);
        }
        java.lang.String string = android.provider.Settings.Secure.getString(m24558.getContentResolver(), util.h.xy.al.ra.f425);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 115) % 128;
        try {
            byte[] m25088 = util.h.xy.ar.b.m25088(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null)).intValue());
            int length3 = string.getBytes().length;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i33 = length3 * 1773;
            int i34 = i14 * (-885);
            int i35 = ~length3;
            int i36 = ~i14;
            int i37 = ~((i35 ^ i36) | (i35 & i36));
            int i38 = ~((i36 ^ currentTimeMillis3) | (i36 & currentTimeMillis3));
            int i39 = (i37 ^ i38) | (i37 & i38);
            int i40 = ~currentTimeMillis3;
            int i41 = (i40 ^ length3) | (i40 & length3);
            int i42 = ~((i41 & i14) | (i41 ^ i14));
            int i43 = ~(i40 | i14);
            int i44 = ((((((i33 & i34) + (i33 | i34)) - (~(((i39 & i42) | (i39 ^ i42)) * 886))) - 1) - (~(-(-(((length3 ^ i43) | (i43 & length3)) * (-1772)))))) - 1) + ((~i41) * 886);
            int length4 = m25088.length;
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i45 = length4 * 236;
            int i46 = -(-(i44 * 471));
            int i47 = ~length4;
            int i48 = ~((~currentTimeMillis4) | i47);
            int i49 = ~((i47 ^ currentTimeMillis4) | (i47 & currentTimeMillis4));
            int i50 = -(-(((i49 ^ i44) | (i49 & i44)) * (-470)));
            int i51 = ~i44;
            int i52 = ~((length4 ^ i51) | (length4 & i51));
            int i53 = (i47 ^ i44) | (i47 & i44);
            int i54 = ~((currentTimeMillis4 ^ i53) | (currentTimeMillis4 & i53));
            byte[][] bArr4 = {bArr3, string.getBytes(), m25088};
            byte[] bArr5 = new byte[((((((i45 & i46) + (i45 | i46)) + (((i44 ^ i48) | (i48 & i44)) * (-235))) - (~i50)) - 1) - (~(((i52 ^ i54) | (i52 & i54)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) - 1];
            int i55 = 0;
            int i56 = 0;
            while (i55 < 3) {
                int i57 = (Camera2StreamConfigurationMap + 11) % 128;
                getHighSpeedVideoSizes = i57;
                byte[] bArr6 = bArr4[i55];
                if (bArr6 != null) {
                    Camera2StreamConfigurationMap = (((i57 | 29) << 1) - (i57 ^ 29)) % 128;
                    java.lang.System.arraycopy(bArr6, 0, bArr5, i56, bArr6.length);
                    int length5 = bArr6.length;
                    int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                    int i58 = ((length5 * (-1529)) - (~(i56 * (-764)))) - 1;
                    int i59 = ~length5;
                    int i60 = ~i56;
                    int i61 = (i60 & i59) | (i59 ^ i60);
                    int i62 = ~currentTimeMillis5;
                    int i63 = ~((i61 & i62) | (i61 ^ i62));
                    int i64 = (i59 ^ i56) | (i56 & i59);
                    int i65 = ~((i64 ^ currentTimeMillis5) | (i64 & currentTimeMillis5));
                    int i66 = (i63 ^ i65) | (i65 & i63);
                    int i67 = (i60 ^ length5) | (i60 & length5);
                    int i68 = ~((i67 ^ currentTimeMillis5) | (i67 & currentTimeMillis5));
                    int i69 = ((i66 ^ i68) | (i66 & i68)) * 765;
                    int i70 = (i58 ^ i69) + ((i69 & i58) << 1);
                    int i71 = ~i61;
                    int i72 = ~((i59 ^ i62) | (i62 & i59));
                    int i73 = ((i71 & i72) | (i71 ^ i72)) * 1530;
                    int i74 = ~((currentTimeMillis5 ^ i59) | (currentTimeMillis5 & i59));
                    int i75 = (i60 & i62) | (i60 ^ i62);
                    int i76 = ~((length5 ^ i75) | (i75 & length5));
                    i56 = ((((i70 | i73) << 1) - (i73 ^ i70)) - (~(((i76 & i74) | (i76 ^ i74)) * 765))) - 1;
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 27) % 128;
                }
                int i77 = ((i55 | 128) << 1) - (i55 ^ 128);
                i55 = (i77 & androidx.compose.runtime.ComposerKt.defaultsKey) + (i77 | androidx.compose.runtime.ComposerKt.defaultsKey);
            }
            util.h.xy.ar.b.m25074(bArr3);
            util.h.xy.ar.b.m25098(string.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            util.h.xy.ar.b.m25098(m25088);
            util.h.xy.ar.b.m25098(bArr5);
            return bArr5;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m27715() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        int length = util.h.xy.v.ra.f2618.length();
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = -(-(length * 965));
        int i2 = (i ^ (-1927)) + ((i & (-1927)) << 1);
        int i3 = ~length;
        int i4 = ~((i3 ^ currentTimeMillis) | (i3 & currentTimeMillis));
        int i5 = ((i4 ^ (-2)) | (i4 & (-2))) * (-964);
        int i6 = (i2 ^ i5) + ((i5 & i2) << 1);
        int i7 = ~currentTimeMillis;
        int i8 = -(-(((~((i3 ^ i7) | (i7 & i3))) | (~((i3 & 1) | (i3 ^ 1)))) * (-964)));
        int i9 = ((i6 & i8) + (i8 | i6)) / 2;
        byte[] bArr = new byte[i9];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i9) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            java.lang.String str = util.h.xy.v.ra.f2618;
            int i12 = i11 * 2;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i13 = ((-865) - (~(-(-(i11 * 868))))) + ((~((~currentTimeMillis2) | (-3) | i12)) * 433);
            int i14 = ~i12;
            int i15 = ~((i14 ^ currentTimeMillis2) | (i14 & currentTimeMillis2));
            int i16 = -(-(((i15 ^ (-3)) | (i15 & (-3))) * (-433)));
            int i17 = ~((currentTimeMillis2 ^ (-3)) | (currentTimeMillis2 & (-3)));
            int i18 = ~((i12 ^ 2) | (i12 & 2));
            bArr[i11] = (byte) java.lang.Integer.parseInt(str.substring(i12, (((i13 | i16) << 1) - (i13 ^ i16)) + (((i17 ^ i18) | (i17 & i18)) * 433)), 16);
            int i19 = (i11 & 77) + (i11 | 77);
            i11 = (i19 ^ (-76)) + ((i19 & (-76)) << 1);
            int i20 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i20 & 71) + (i20 | 71)) % 128;
        }
        int length2 = util.h.xy.v.ra.f2621.length();
        int i21 = (((length2 | 1) << 1) - (length2 ^ 1)) / 2;
        byte[] bArr2 = new byte[i21];
        int i22 = 0;
        while (i22 < i21) {
            int i23 = i22 * 2;
            bArr2[i22] = (byte) java.lang.Integer.parseInt(util.h.xy.v.ra.f2621.substring(i23, i23 + 2), 16);
            i22 = (i22 ^ (-36)) + ((i22 & (-36)) << 1) + 37;
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 113) % 128;
        }
        byte[] bArr3 = new byte[i9];
        int i24 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i24 | 63) << 1) - (i24 ^ 63)) % 128;
        int i25 = 0;
        int i26 = 0;
        while (i25 < i9) {
            int i27 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = ((i27 ^ 77) + ((i27 & 77) << 1)) % 128;
            byte b = bArr[i25];
            byte b2 = bArr2[i26 % i21];
            bArr3[i26] = (byte) ((b & (~b2)) | ((~b) & b2));
            i26++;
            int i28 = (i25 ^ (-87)) + ((i25 & (-87)) << 1);
            i25 = (i28 & 88) + (i28 | 88);
            int i29 = i27 + 39;
            Camera2StreamConfigurationMap = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 4 / 2;
            }
        }
        java.lang.String string = android.provider.Settings.Secure.getString(m24558.getContentResolver(), util.h.xy.al.ra.f425);
        byte[] m27717 = m27717(m24558);
        byte[] bArr4 = new byte[0];
        if (m27714(m24558)) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 19) % 128;
            bArr4 = util.h.xy.z.b.m27708(m24558).m27711();
        }
        int length3 = string.getBytes().length;
        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
        int i31 = length3 * 471;
        int i32 = -(-(i9 * 471));
        int i33 = ~length3;
        int i34 = ~i9;
        int i35 = ~((i33 ^ i34) | (i33 & i34));
        int i36 = ~((i34 ^ currentTimeMillis3) | (i34 & currentTimeMillis3));
        int i37 = ~currentTimeMillis3;
        int i38 = (i37 ^ length3) | (i37 & length3);
        int i39 = i34 | length3;
        int i40 = (((((((i31 | i32) << 1) - (i31 ^ i32)) - (~(((length3 & i9) | (length3 ^ i9)) * (-470)))) - 1) + ((((i35 & i36) | (i35 ^ i36)) | (~(i38 | i9))) * (-470))) - (~(-(-(((~((i39 & currentTimeMillis3) | (currentTimeMillis3 ^ i39))) | (~((i9 ^ i38) | (i9 & i38)))) * 470))))) - 1;
        int i41 = -(-m27717.length);
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        int length4 = bArr4.length;
        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
        int i43 = length4 * (-661);
        int i44 = i42 * (-661);
        int i45 = ~currentTimeMillis4;
        int i46 = ~length4;
        int i47 = ~i42;
        int i48 = ~((i46 ^ i47) | (i46 & i47));
        int i49 = (i43 & i44) + (i43 | i44) + (((i45 & i48) | (i45 ^ i48)) * 1324) + (((~((currentTimeMillis4 & length4) | (length4 ^ currentTimeMillis4))) | (~((currentTimeMillis4 & i42) | (i42 ^ currentTimeMillis4)))) * (-1324));
        int i50 = ((~(length4 | i47)) | (~(i42 | i46))) * 662;
        byte[][] bArr5 = {bArr3, string.getBytes(), m27717, bArr4};
        byte[] bArr6 = new byte[(i49 & i50) + (i50 | i49)];
        int i51 = 0;
        int i52 = 0;
        while (i51 < 4) {
            int i53 = getHighSpeedVideoSizes;
            int i54 = (((i53 | 87) << 1) - (i53 ^ 87)) % 128;
            Camera2StreamConfigurationMap = i54;
            byte[] bArr7 = bArr5[i51];
            if (bArr7 != null) {
                getHighSpeedVideoSizes = (i54 + 19) % 128;
                java.lang.System.arraycopy(bArr7, i10, bArr6, i52, bArr7.length);
                int length5 = bArr7.length;
                int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                int i55 = length5 * (-721);
                int i56 = i52 * (-721);
                int i57 = ~currentTimeMillis5;
                int i58 = ~length5;
                int i59 = ~i52;
                int i60 = ~((i58 ^ i59) | (i58 & i59));
                int i61 = (i57 ^ i60) | (i60 & i57);
                int i62 = ~((length5 ^ i52) | (length5 & i52));
                int i63 = (i55 & i56) + (i55 | i56) + (((i61 & i62) | (i61 ^ i62)) * 1444);
                int i64 = ~(length5 | i52);
                int i65 = ~((length5 ^ currentTimeMillis5) | (length5 & currentTimeMillis5));
                int i66 = (i64 & i65) | (i64 ^ i65);
                int i67 = ~((currentTimeMillis5 ^ i52) | (currentTimeMillis5 & i52));
                int i68 = -(-(((i66 ^ i67) | (i66 & i67)) * (-1444)));
                int i69 = (i63 & i68) + (i68 | i63);
                int i70 = ~((i58 ^ i52) | (i52 & i58));
                int i71 = ~((i59 ^ length5) | (length5 & i59));
                int i72 = -(-(((i70 ^ i71) | (i70 & i71)) * 722));
                i52 = ((i69 | i72) << 1) - (i72 ^ i69);
            }
            int i73 = i51 + 19;
            i51 = (i73 ^ (-18)) + ((i73 & (-18)) << 1);
            i10 = 0;
        }
        util.h.xy.ar.b.m25074(bArr3);
        util.h.xy.ar.b.m25098(string.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        util.h.xy.ar.b.m25074(m27717);
        util.h.xy.ar.b.m25074(bArr4);
        util.h.xy.ar.b.m25098(bArr6);
        return bArr6;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m27714(android.content.Context context) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 5) % 128;
        boolean m25237 = util.h.xy.av.ra.m25237(context);
        boolean m25236 = util.h.xy.av.ra.m25236(context);
        boolean m27709 = util.h.xy.z.b.m27709();
        if (!m25237) {
            return false;
        }
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 29) << 1) - (i ^ 29)) % 128;
        getHighSpeedVideoSizes = i2;
        if (!m25236) {
            return false;
        }
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        Camera2StreamConfigurationMap = i4;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!m27709) {
            return false;
        }
        int i5 = i4 + 1;
        getHighSpeedVideoSizes = i5 % 128;
        return i5 % 2 != 0;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27717(android.content.Context context) {
        byte[] bArr;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        try {
            if (i2 % 2 == 0 ? !m27714(context) : !m27714(context)) {
                int i3 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i3 & 71) + (i3 | 71)) % 128;
                bArr = util.h.xy.ar.b.m25088(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null)).intValue());
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 21) % 128;
            } else {
                byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.av.ra.m25228(context));
                int i4 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = ((i4 & 83) + (i4 | 83)) % 128;
                Camera2StreamConfigurationMap = ((i4 & 85) + (i4 | 85)) % 128;
                byte[] m25088 = util.h.xy.ar.b.m25088(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null)).intValue());
                bArr = new byte[m25017.length + m25088.length];
                java.lang.System.arraycopy(m25017, 0, bArr, 0, m25017.length);
                java.lang.System.arraycopy(m25088, 0, bArr, m25017.length, 4);
                int i5 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = (((i5 | 103) << 1) - (i5 ^ 103)) % 128;
            }
            int i6 = getHighSpeedVideoSizes + 107;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                return bArr;
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

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRanges = new char[]{12655, 47188, 8962, 43744, 5553, 40803, 1618, 61772, 30925, 58293, 28008, 54342, 24347, 50884, 45474, 15148, 41485, 11541, 38088, 8102, 35195, 28722, 64258, 43922, 8868, 47593, 12345, 36676, 1426, 40102, 27640, 57906, 31044, 63408, 20136, 50667, 23600, 11082, 41372, 14535, 40032, 5467, 36365, 2031, 47294, 12908, 43869, 23619, 54722, 20154, 49255, 31049, 61972, 27595, 7341, 38435, 3889, 32792, 14727, 45709, 9328, 56614, 22034, 53196, 16518, 64112, 29444, 58396, 40415, 5764, 34942, 296, 47859, 40041, 5460, 36378, 1998, 47272, 12918, 43853, 23560, 54732, 20115, 49260, 31068, 61957, 27600, 7339, 38504, 40032, 5467, 36365, 2031, 47294, 12908, 43869, 23619, 54734, 20134, 49191, 31103, 61956, 27596, 7349, 38505, 8537, 43105, 13106, 47837, 1410, 36689, 5743, 57644, 26849, 62354, 32089, 50298, 40012, 5498, 36397, 2008, 47261, 40009, 5492, 36411, 2009, 47238, 12868, 43883, 23592};
        getHighResolutionOutputSizeshNQ4ISI = -7239693726937836235L;
    }
}
