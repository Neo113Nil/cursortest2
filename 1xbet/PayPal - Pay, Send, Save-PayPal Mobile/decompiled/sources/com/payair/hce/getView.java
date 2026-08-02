package com.payair.hce;

/* loaded from: classes4.dex */
public final class getView {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int valueOf;
    private static int values;
    private static int writeReplace;
    private java.security.SecureRandom AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (s2 * 4);
        byte[] bArr = $$a;
        int i3 = b * 2;
        int i4 = (s * 4) + 115;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i4 += -i2;
            i2 = i5;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i2 + 1;
            int i8 = i + 1;
            i5 = i7;
            i2 = bArr[i7];
            i6 = i8;
            i4 += -i2;
            i2 = i5;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~((~i2) | i3);
        return ((((i * (-574)) + (i2 * (-574))) + (((~(i4 | i5)) | i6) * 1150)) + (((~(i2 | i5)) | i6) * (-575))) + (((~(i | i5)) | (~(i4 | i3))) * 575) != 1 ? valueOf(objArr) : DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getView getview = (com.payair.hce.getView) objArr[0];
        com.payair.hce.getTypeConverter gettypeconverter = (com.payair.hce.getTypeConverter) objArr[1];
        int i = values;
        valueOf = ((i & 43) + (i | 43)) % 128;
        getview.AlternateContactlessPaymentDataJson = gettypeconverter.values();
        int valueOf2 = gettypeconverter.valueOf();
        int identityHashCode = java.lang.System.identityHashCode(getview);
        int i2 = -(-(valueOf2 * (-565)));
        int i3 = i2 & 3969;
        int i4 = (i2 | 3969) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = valueOf2 & (-8);
        int i8 = (~i7) & (valueOf2 | (-8));
        int i9 = ~valueOf2;
        int i10 = (i7 ^ i8) | (i7 & i8);
        int i11 = ~i10;
        int i12 = (i10 | i11) & i11;
        int i13 = identityHashCode ^ (-8);
        int i14 = identityHashCode & (-8);
        int i15 = ~((i13 ^ i14) | (i13 & i14));
        int i16 = -(-(((i12 ^ i15) | (i12 & i15)) * (-566)));
        int i17 = i6 & i16;
        int i18 = ((i6 ^ i16) | i17) << 1;
        int i19 = -((i16 | i6) & (~i17));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        int i21 = i9 & (-8);
        int i22 = ((~i9) & 7) | i21;
        int i23 = i9 & 7;
        int i24 = (~((i22 ^ i23) | (i22 & i23))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
        int i25 = ((i20 ^ i24) | (i20 & i24)) << 1;
        int i26 = -((i20 & (~i24)) | ((~i20) & i24));
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        int i28 = (i9 ^ (-8)) | i21;
        int i29 = i28 & identityHashCode;
        int i30 = (i28 | identityHashCode) & (~i29);
        int i31 = (~((i30 ^ i29) | (i30 & i29))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
        getview.DigitizedCardProfile = ((((i27 ^ i31) | (i27 & i31)) << 1) - (((~i31) & i27) | ((~i27) & i31))) / 8;
        int i32 = valueOf;
        int i33 = i32 ^ 71;
        int i34 = -(-((i32 & 71) << 1));
        int i35 = (i33 & i34) + (i34 | i33);
        values = i35 % 128;
        if (i35 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getView getview = (com.payair.hce.getView) objArr[0];
        int i = valueOf;
        int i2 = i & 73;
        int i3 = (~i2) & (i | 73);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            byte[] bArr = new byte[getview.DigitizedCardProfile];
            java.security.SecureRandom secureRandom = getview.AlternateContactlessPaymentDataJson;
            int i6 = ((i ^ 65) | (i & 65)) << 1;
            int i7 = -((i & (-66)) | ((~i) & 65));
            values = ((i6 & i7) + (i7 | i6)) % 128;
            try {
                int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                int i8 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int identityHashCode = java.lang.System.identityHashCode(getview);
                int i9 = (i8 * 236) + 3768;
                int i10 = ~i8;
                int i11 = ~identityHashCode;
                int i12 = i10 ^ i11;
                int i13 = i10 & i11;
                int i14 = (i12 & i13) | (i12 ^ i13);
                int i15 = ~i14;
                int i16 = (i14 | i15) & i15;
                int i17 = ((~i16) & 8) | (i16 & (-9));
                int i18 = i16 & 8;
                int i19 = ((i18 & i17) | (i18 ^ i17)) * (-235);
                int i20 = ((((~i9) & i19) | ((~i19) & i9)) - (~((i9 & i19) << 1))) - 1;
                int i21 = ~((i10 & identityHashCode) | ((~i10) & identityHashCode) | i13);
                int i22 = ((i21 ^ 8) | (i21 & 8)) * (-470);
                int i23 = i20 & i22;
                int i24 = (i20 | i22) & (~i23);
                int i25 = i23 << 1;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                int i27 = (i10 & (-9)) | (i8 & 8);
                int i28 = i8 & (-9);
                int i29 = ~((i27 ^ i28) | (i28 & i27));
                int i30 = i10 & 8;
                int i31 = (~i30) & (i10 | 8);
                int i32 = (i30 ^ i31) | (i30 & i31);
                int i33 = (i32 & i11) | ((~i32) & identityHashCode);
                int i34 = i32 & identityHashCode;
                int i35 = (i34 ^ i33) | (i34 & i33);
                int i36 = ~i35;
                int i37 = (i35 | i36) & i36;
                int i38 = (((~i29) & i37) | ((~i37) & i29) | (i29 & i37)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b((((trimmedLength ^ 116) | (trimmedLength & 116)) << 1) - (((~trimmedLength) & 116) | (trimmedLength & (-117))), (((~i38) & i26) | ((~i26) & i38)) + ((i38 & i26) << 1), "\tￗ\u000e\t\ufffa\b\u0003\ufffa\r", false, 3 - (~(-(~(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))))), objArr2);
                java.util.Random.class.getMethod((java.lang.String) objArr2[0], byte[].class).invoke(secureRandom, bArr);
                int identityHashCode2 = java.lang.System.identityHashCode(getview);
                int i39 = identityHashCode2 & 1073624953;
                int i40 = ~(((1073624953 | identityHashCode2) & (~i39)) | i39);
                int i41 = -(-(((i40 & (-112202865)) | (112202864 & (~i40)) | (i40 & 112202864)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                int i42 = i41 ^ 464813152;
                int i43 = (((i41 & 464813152) | i42) << 1) - i42;
                int i44 = ((i43 & 58718011) + (i43 | 58718011)) - 1;
                int i45 = ~identityHashCode2;
                int i46 = (identityHashCode2 | i45) & i45;
                int i47 = ((~i46) & 649213296) | ((-649213297) & i46);
                int i48 = i46 & 649213296;
                int i49 = (i48 ^ i47) | (i48 & i47);
                int i50 = i49 & 536614521;
                int i51 = (i49 | 536614521) & (~i50);
                int i52 = -(-((~((i51 ^ i50) | (i51 & i50))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING));
                int i53 = ((i44 ^ i52) | (i44 & i52)) << 1;
                int i54 = -(((~i52) & i44) | ((~i44) & i52));
                int identityHashCode3 = java.lang.System.identityHashCode(getview);
                int i55 = ~(((-2100041900) ^ identityHashCode3) | (identityHashCode3 & (-2100041900)));
                int i56 = i55 & 891289603;
                int i57 = (i55 | 891289603) & (~i56);
                int i58 = (i57 ^ i56) | (i57 & i56);
                int i59 = ~identityHashCode3;
                int i60 = (i59 | identityHashCode3) & i59;
                int i61 = (1217396204 & i60) | ((~i60) & (-1217396205));
                int i62 = i60 & (-1217396205);
                int i63 = (i62 ^ i61) | (i62 & i61);
                int i64 = ~((i63 ^ 2100041899) | (i63 & 2100041899));
                int i65 = -(~(((i58 ^ i64) | (i58 & i64)) * (-470)));
                int i66 = (((i65 | (-1118035904)) << 1) - (i65 ^ (-1118035904))) - 1;
                int i67 = ((-1208752297) & i59) | (1208752296 & identityHashCode3);
                int i68 = identityHashCode3 & (-1208752297);
                int i69 = ~((i68 ^ i67) | (i68 & i67));
                int i70 = i59 | (-1217396205);
                int i71 = i70 ^ 2100041899;
                int i72 = i70 & 2100041899;
                int i73 = (i72 ^ i71) | (i72 & i71);
                int i74 = ~i73;
                int i75 = (i73 | i74) & i74;
                int i76 = i69 ^ i75;
                int i77 = i69 & i75;
                int i78 = -(~(((i77 ^ i76) | (i77 & i76)) * 470));
                if (((i53 | i54) << 1) - (i54 ^ i53) <= ((i66 & i78) + (i78 | i66)) - 1) {
                    return bArr;
                }
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        byte[] bArr2 = new byte[getview.DigitizedCardProfile];
        java.security.SecureRandom secureRandom2 = getview.AlternateContactlessPaymentDataJson;
        throw null;
    }

    private static void b(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 43, android.text.TextUtils.indexOf("", "", 0) + 2073, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((short) 0, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 53, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3543, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i3;
            char[] cArr2 = new char[i2];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
            java.lang.System.arraycopy(cArr2, 0, cArr, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i2 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i2) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 53, 3543 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$0();
        values = 0;
        valueOf = 1;
        writeReplace = 1889207144;
    }

    public final byte[] writeReplace() {
        return (byte[]) valueOf(new java.lang.Object[]{this}, 118662620, -118662620, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 78, 75, -71};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE;
    }

    public final void writeReplace(com.payair.hce.getTypeConverter gettypeconverter) {
        valueOf(new java.lang.Object[]{this, gettypeconverter}, 69188918, -69188917, java.lang.System.identityHashCode(this));
    }
}
