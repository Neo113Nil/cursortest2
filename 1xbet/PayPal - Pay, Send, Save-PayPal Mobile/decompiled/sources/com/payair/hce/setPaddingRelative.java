package com.payair.hce;

/* loaded from: classes10.dex */
public class setPaddingRelative {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int values;
    private static int writeReplace;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "bodyHash")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "signType")
    private java.lang.String valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 718 - i3;
        int i6 = 43 - i2;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i];
        int i7 = 34 - i;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i6++;
            i5 = (i8 + (-i5)) - 2;
            i4 = i9;
            cArr[i4] = (char) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i10 = i4 + 1;
            i8 = i5;
            i5 = bArr[i6];
            i9 = i10;
            i6++;
            i5 = (i8 + (-i5)) - 2;
            i4 = i9;
            cArr[i4] = (char) i5;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            cArr[i4] = (char) i5;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (i * 3);
        byte[] bArr = $$d;
        int i5 = 115 - (s * 3);
        int i6 = b * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += -i5;
            i3 = i7;
            i2 = i8;
            int i9 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            i7 = i9;
            i5 = bArr[i9];
            i8 = i10;
            i4 += -i5;
            i3 = i7;
            i2 = i8;
            int i92 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i5;
            int i922 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignRequest{signType='");
        sb.append(this.valueOf);
        sb.append("', bodyHash='");
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i = DigitizedCardProfile;
        int i2 = i ^ 15;
        int i3 = (i & 15) << 1;
        writeReplace = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return obj;
    }

    private static void b(int i, int i2, java.lang.String str, boolean z, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i2];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i2) {
            $11 = ($10 + 91) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2073 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (60037 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.red(0), (android.os.Process.myTid() >> 22) + 3543, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $11 = ($10 + 85) % 128;
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
                $10 = ($11 + 103) % 128;
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i2 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 3542 - android.view.MotionEvent.axisFromString(""), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        DigitizedCardProfile = 0;
        writeReplace = 1;
        values = 1889207144;
    }

    static void init$1() {
        $$d = new byte[]{16, 120, -82, 58};
        $$e = 98;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0687, code lost:
    
        if (r0.contains(r2.getField((java.lang.String) r10[0]).get(null)) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0ac6, code lost:
    
        if (r0.equals((java.lang.String) r8[0]) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2) {
        java.lang.Integer num;
        java.lang.Object[] objArr;
        java.lang.CharSequence charSequence;
        char c;
        java.lang.Integer num2;
        byte[] bArr;
        int i3 = DigitizedCardProfile;
        writeReplace = (((i3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-573447) | i)) | 990978048) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1841130470) + ((~((~i) | (-573447))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    byte b = (byte) ($$a[14] + 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(b, (byte) (b | 39), 653, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            writeReplace = (i3 + 69) % 128;
            try {
                int i4 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i5 = ~i4;
                int i6 = ~((i5 ^ i) | (i5 & i));
                int i7 = (((i4 * 319) - 35187) - (~(-(-(((i6 ^ (-112)) | (i6 & (-112))) * (-318)))))) - 1;
                int i8 = ~((i ^ (-112)) | (i & (-112)));
                int i9 = ~i;
                int i10 = ~((i9 ^ i4) | (i9 & i4) | 111);
                int i11 = -(-(((i8 ^ i10) | (i10 & i8)) * 318));
                int i12 = (i7 ^ i11) + ((i7 & i11) << 1);
                int i13 = ~((i9 ^ (-112)) | (i9 & (-112)) | i4);
                int i14 = (i4 & 111) | (i4 ^ 111);
                int i15 = ~((i14 & i) | (i14 ^ i));
                int i16 = ((i15 & i13) | (i13 ^ i15)) * 318;
                int i17 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i18 = i17 * (-129);
                int i19 = (i18 & 3144) + (i18 | 3144) + ((~((i9 ^ (-25)) | (i9 & (-25)) | i17)) * 130);
                int i20 = (i17 ^ (-25)) | (i17 & (-25));
                int i21 = (~i20) * (-260);
                int i22 = ~i17;
                int i23 = ~((i22 & 24) | (i22 ^ 24));
                int i24 = ~(i20 | i);
                int i25 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i26 = i25 * (-716);
                int i27 = ~i25;
                int i28 = -(-((i27 | 8) * (-1434)));
                int i29 = ~((i9 ^ 8) | (i9 & 8));
                int i30 = ~((i25 ^ 8) | (i25 & 8));
                int i31 = i29 | i30;
                int i32 = (i27 & (-9)) | (i27 ^ (-9));
                java.lang.Integer num3 = -1347122530;
                int i33 = ~((i32 & i) | (i32 ^ i));
                int i34 = (((((i26 | 11480) << 1) - (i26 ^ 11480)) - (~i28)) - 1) + (((i33 ^ i31) | (i33 & i31)) * 717);
                int i35 = ~((i32 & i9) | (i32 ^ i9));
                int i36 = (i35 ^ i30) | (i35 & i30);
                int i37 = ~((i ^ 8) | (i & 8));
                int i38 = ((i36 ^ i37) | (i36 & i37)) * 717;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(((i12 | i16) << 1) - (i16 ^ i12), (i19 & i21) + (i21 | i19) + (((i24 & i23) | (i23 ^ i24)) * 130), "\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t", false, (i34 & i38) + (i38 | i34), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
                int i39 = ~((i9 ^ scrollBarFadeDuration) | (i9 & scrollBarFadeDuration));
                int i40 = (((scrollBarFadeDuration * 765) - 171024) - (~(-(-(((i39 & 112) | (i39 ^ 112)) * 764))))) - 1;
                int i41 = ~scrollBarFadeDuration;
                int i42 = ~(i41 | 112);
                int i43 = ~((i9 ^ 112) | (i9 & 112));
                int i44 = -(-(((i42 & i43) | (i42 ^ i43)) * (-1528)));
                int i45 = ((i40 | i44) << 1) - (i40 ^ i44);
                int i46 = ~((i41 ^ 112) | (i41 & 112));
                int i47 = ~((scrollBarFadeDuration ^ (-113)) | (scrollBarFadeDuration & (-113)));
                int i48 = ((i47 ^ i46) | (i46 & i47) | i39) * 764;
                int i49 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i50 = i49 * 465;
                int i51 = (i50 & (-8334)) + (i50 | (-8334));
                int i52 = ~((i9 ^ (-19)) | (i9 & (-19)));
                int i53 = ~((i49 & (-19)) | (i49 ^ (-19)));
                int i54 = (i52 ^ i53) | (i52 & i53);
                int i55 = ~(i9 | i49);
                int i56 = ((i54 & i55) | (i54 ^ i55)) * 464;
                int i57 = ((i51 | i56) << 1) - (i56 ^ i51);
                int i58 = ~i49;
                int i59 = (i58 ^ i) | (i58 & i);
                int i60 = -(-(((i59 ^ (-19)) | (i59 & (-19))) * (-464)));
                int i61 = ~((i49 ^ i) | (i49 & i));
                int i62 = -(-(((i61 ^ i53) | (i61 & i53)) * 464));
                int i63 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i64 = i63 * 50;
                int i65 = ~((i9 ^ (-18)) | (i9 & (-18)));
                int i66 = ~((i63 ^ (-18)) | (i63 & (-18)));
                int i67 = (i64 ^ (-1649)) + ((i64 & (-1649)) << 1) + (((i65 ^ i66) | (i65 & i66)) * 98);
                int i68 = ~i63;
                int i69 = ~((i68 ^ i9) | (i68 & i9));
                int i70 = -(-(((i69 & (-18)) | (i69 ^ (-18)) | (~((i63 ^ i) | (i63 & i)))) * (-49)));
                int i71 = ~((i & (-18)) | (i ^ (-18)));
                int i72 = ~((i63 ^ 17) | (i63 & 17));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((i45 ^ i48) + ((i48 & i45) << 1), ((((i57 | i60) << 1) - (i60 ^ i57)) - (~i62)) - 1, "\uffff\u0007￢\u0007\b\u0002\r\ufffa￼\u0002\u0005\t\tￚ\r\ufffe\u0000\b", true, ((((i67 | i70) << 1) - (i67 ^ i70)) - (~(((i72 & i71) | (i71 ^ i72)) * 49))) - 1, objArr6);
                java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr6[0], null).invoke(context, null);
                int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                int i73 = trimmedLength * (-432);
                int i74 = ~trimmedLength;
                int i75 = ~((i & (-35)) | (i ^ (-35)));
                int i76 = (i73 ^ 14756) + ((i73 & 14756) << 1) + ((~(i74 | i9 | 34)) * 433) + (((i74 & i75) | (i75 ^ i74)) * (-433));
                int i77 = ~((i74 & i) | (i74 ^ i));
                int i78 = ~((trimmedLength ^ 34) | (trimmedLength & 34));
                int i79 = -(-(((i78 ^ i77) | (i78 & i77)) * 433));
                int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                int i80 = ~bitsPerPixel;
                int i81 = ~((i80 ^ (-24)) | (i80 & (-24)));
                int i82 = ~((i9 ^ (-24)) | (i9 & (-24)));
                int i83 = -(-(((i81 & i82) | (i81 ^ i82)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                int i84 = i80 | (-24);
                int i85 = ((((bitsPerPixel * (-167)) - 3841) - (~i83)) - 1) + ((~((i84 & i) | (i84 ^ i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                int i86 = ~((i80 & i9) | (i80 ^ i9));
                int i87 = ~((i80 ^ 23) | (i80 & 23));
                int i88 = (i87 ^ i86) | (i87 & i86);
                int i89 = ~((bitsPerPixel ^ (-24)) | (bitsPerPixel & (-24)) | i);
                int i90 = ((i88 ^ i89) | (i89 & i88)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(((deadChar | 108) << 1) - (deadChar ^ 108), (i76 & i79) + (i79 | i76), "\r\r\uffdeￋ\n\rￋ\u0011\u000b\u0002\u0011\u000b\f\u0000ￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\f\u0003\u000b￦\u000b\f\u0006\u0011\ufffe\u0000\u0006\t", true, (i85 ^ i90) + ((i90 & i85) << 1), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                int i91 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i92 = -android.graphics.Color.rgb(0, 0, 0);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((i91 & 114) + (i91 | 114), (((-16777211) | i92) << 1) - (i92 ^ (-16777211)), "\n�\u0003\ufff8\ufffe", false, -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr8);
                if ((cls3.getField((java.lang.String) objArr8[0]).getInt(invoke) & 2) != 0) {
                    int i93 = writeReplace;
                    int i94 = ((i93 ^ 21) + ((i93 & 21) << 1)) % 128;
                    DigitizedCardProfile = i94;
                    writeReplace = (i94 + 39) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-2)) | (i9 & 1)}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((1075538 | r2) * (-814)) - 1713973273) + (((~(787453573 | i)) | (~((-217475412) | i9)) | 571053700) * 407) + (((~((-787453574) | i)) | 571053700 | (~(217475411 | i))) * 407))};
                    num = -1347122530;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                        byte b2 = (byte) ($$a[14] + 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(b2, (byte) (b2 | 39), 653, objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                    c = 0;
                    ((int[]) objArr[3])[0] = intValue;
                    charSequence = "";
                } else {
                    num = -1347122530;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(21451827 | i9)) | (~((-4325428) | i))) * (-831)) + 2134366232 + ((~(1030706239 | i)) * (-1662)) + (((~((-1026380813) | i9)) | (~(1026380812 | i)) | (~((-21451828) | i))) * 831))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        charSequence = "";
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) (android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        byte b3 = (byte) ($$a[14] + 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(b3, (byte) (b3 | 39), 653, objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    } else {
                        charSequence = "";
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                    c = 0;
                    ((int[]) objArr[3])[0] = intValue2;
                }
                if (((int[]) objArr[1])[c] != i) {
                    DigitizedCardProfile = (writeReplace + 7) % 128;
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.View.resolveSizeAndState(0, 0, 0) + 1738, (char) (android.graphics.Color.rgb(0, 0, 0) + 16783042));
                    byte b4 = (byte) ($$a[14] + 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(b4, (byte) (b4 | 39), 653, objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(charSequence, 0) + 33, 1738 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (5826 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                byte[] bArr2 = $$a;
                byte b5 = (byte) (bArr2[14] + 1);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(b5, (byte) (b5 | 39), 653, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1738, (char) (android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5827));
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(29, bArr2[20], 600, objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    int i95 = DigitizedCardProfile;
                    writeReplace = ((i95 & 19) + (i95 | 19)) % 128;
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((538559524 | r2) * (-280)) - 908281464) + (((~((-771736639) | i)) | (~((-233192347) | i))) * 140) + (((~(i | (-233177115))) | (~((-538559525) | i9)) | (~(i9 | (-15233)))) * 140))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                    if (obj5 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b6 = (byte) (bArr2[14] + 1);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(b6, (byte) (b6 | 39), 653, objArr18);
                        obj5 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj5);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                    int i96 = writeReplace;
                    int i97 = (i96 ^ 5) + ((i96 & 5) << 1);
                    DigitizedCardProfile = i97 % 128;
                    if (i97 % 2 == 0) {
                        return objArr16;
                    }
                    throw null;
                }
                try {
                } catch (java.lang.Exception unused) {
                    num2 = num;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    int i98 = DigitizedCardProfile;
                    writeReplace = (((i98 | 23) << 1) - (i98 ^ 23)) % 128;
                    int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
                    int i99 = (keyRepeatTimeout * (-381)) + 19776;
                    int i100 = ~keyRepeatTimeout;
                    int i101 = i100 * (-191);
                    int i102 = (i99 & i101) + (i99 | i101);
                    int i103 = ~(i | 103);
                    int i104 = ((keyRepeatTimeout ^ i103) | (keyRepeatTimeout & i103)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                    int i105 = ~((i100 ^ 103) | (i100 & 103));
                    int i106 = ~(i9 | 103);
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    int i107 = ~combineMeasuredStates;
                    int i108 = ~((i107 ^ 28) | (i107 & 28));
                    int i109 = (combineMeasuredStates & (-29)) | (combineMeasuredStates ^ (-29));
                    int i110 = ~((i109 ^ i) | (i109 & i));
                    int i111 = -(-(i110 * 952));
                    int i112 = (i9 & (-29)) | (i9 ^ (-29));
                    int indexOf = android.text.TextUtils.indexOf(charSequence, charSequence, 0);
                    int i113 = (indexOf * (-711)) + 8556;
                    num3 = num;
                    int i114 = ~((indexOf ^ (-13)) | (indexOf & (-13)));
                    bArr = bArr2;
                    int i115 = ~(i9 | indexOf);
                    int i116 = ((i115 & i114) | (i114 ^ i115)) * (-712);
                    int i117 = (i113 ^ i116) + ((i116 & i113) << 1);
                    int i118 = (i9 ^ (-13)) | (i9 & (-13));
                    int i119 = ~((i118 ^ indexOf) | (i118 & indexOf));
                    int i120 = (indexOf & 12) | (indexOf ^ 12);
                    int i121 = ~((i120 ^ i) | (i120 & i));
                    int i122 = -(-(((i119 ^ i121) | (i119 & i121)) * (-712)));
                    int i123 = (i117 & i122) + (i122 | i117);
                    int i124 = -(-(((i115 & (-13)) | (i115 ^ (-13))) * 712));
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    b((i102 ^ i104) + ((i104 & i102) << 1) + (((i105 & i106) | (i105 ^ i106)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE), ((((((combineMeasuredStates * 477) - 13300) - (~(((i108 & i110) | (i108 ^ i110)) * (-476)))) - 1) - (~i111)) - 1) + ((~((combineMeasuredStates & i112) | (i112 ^ combineMeasuredStates))) * 476), "\u0007\u0004\u0017\t\t\u0003\u0004\u000e\u0007\uffd0\u0014\u0005\uffd1\u0007\u0016\u0005\uffd1\u000b\u0010\u000b\u0016\uffd1\u000e\u000e\r\u0006ￏ\u0006", false, (i123 & i124) + (i124 | i123), objArr19);
                    try {
                        java.lang.Object[] objArr20 = {(java.lang.String) objArr19[0]};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj6 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, 3161 - android.graphics.Color.green(0), (char) (33099 - android.text.TextUtils.getCapsMode(charSequence, 0, 0)));
                            byte b7 = (byte) (bArr[23] + 1);
                            byte b8 = (byte) (bArr[14] + 1);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(b7, b8, b8, objArr21);
                            obj6 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr20)).longValue();
                        long j = i;
                        long j2 = ~((~longValue) | (-392931283));
                        long j3 = (((((522 * longValue) + 204324267160L) + ((~((392931282 | longValue) | j)) * 521)) + ((-1042) * j2)) + (((~(longValue | ((~j) | 392931282))) | j2) * 521)) - 944736825;
                        int i125 = ((int) (j3 >> 32)) & ((((~((-591396450) | i9)) | 845829961) * (-90)) + 1687905420 + (((~((-591396450) | i)) | (-864026474)) * (-45)) + (((~((-845829962) | i)) | (-591396450) | (~(845829961 | i9))) * 45));
                        int i126 = ((int) j3) & ((((((~(148875505 | i)) | (-1289727226)) * 1504) + 1320243365) + ((~((-1140851721) | i)) * (-1504))) - 37972368);
                        if (((i125 ^ i126) | (i125 & i126)) != 1) {
                            DigitizedCardProfile = (writeReplace + 21) % 128;
                            num2 = num3;
                            java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((~(i | (-315719425))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1832707016 + (((~((-315719425) | i9)) | 688423056) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                            if (obj7 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.view.View.getDefaultSize(0, 0));
                                byte b9 = (byte) ($$a[14] + 1);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(b9, (byte) (b9 | 39), 653, objArr24);
                                obj7 = cls11.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj7);
                            }
                            ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr23)).intValue();
                            return objArr22;
                        }
                        int i127 = DigitizedCardProfile;
                        writeReplace = (i127 + 13) % 128;
                        writeReplace = ((i127 & 111) + (i127 | 111)) % 128;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    num3 = num;
                    bArr = bArr2;
                    int i128 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i129 = i128 * 881;
                    int i130 = ~i128;
                    int i131 = ~((i130 ^ (-109)) | (i130 & (-109)));
                    int i132 = ~((i130 & i) | (i130 ^ i));
                    int i133 = (i131 ^ i132) | (i131 & i132);
                    int i134 = ~((i & (-109)) | (i ^ (-109)));
                    int i135 = ~((i130 ^ i9) | (i130 & i9));
                    int i136 = (i135 ^ 108) | (i135 & 108);
                    int i137 = ~((i128 ^ i) | (i128 & i));
                    int i138 = -(-android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    int i139 = -android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    b((((((95148 ^ i129) + ((i129 & 95148) << 1)) + (((i133 & i134) | (i133 ^ i134)) * (-880))) + (((i136 & i137) | (i136 ^ i137)) * (-880))) - (~((~(i128 | i)) * 880))) - 1, (i138 ^ (-35)) + ((i138 & (-35)) << 1), "\uffff\t\u0002\u000f\fￋ\u0001\u0002\uffff\u0012\u0004\u0004\ufffe", false, ((i139 | 2) << 1) - (i139 ^ 2), objArr25);
                    try {
                        java.lang.Object[] objArr26 = {(java.lang.String) objArr25[0]};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj8 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1921, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                            byte b10 = (byte) (bArr[23] + 1);
                            byte b11 = (byte) (bArr[14] + 1);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(b10, b11, b11, objArr27);
                            obj8 = cls12.getMethod((java.lang.String) objArr27[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj8);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj8).invoke(null, objArr26);
                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                        int i140 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i141 = i140 * 69;
                        int i142 = (i141 ^ (-67)) + ((i141 & (-67)) << 1);
                        int i143 = ~i140;
                        int i144 = ~((i143 ^ (-2)) | (i143 & (-2)) | i9);
                        int i145 = ~((i140 ^ 1) | (i140 & 1));
                        int i146 = ((i145 ^ i144) | (i145 & i144) | (~((i ^ 1) | (i & 1)))) * (-68);
                        int i147 = (i142 ^ i146) + ((i146 & i142) << 1);
                        int i148 = (i143 ^ i9) | (i143 & i9);
                        int i149 = (~((i148 ^ 1) | (i148 & 1))) * (-68);
                        int i150 = ~(i9 | (-2));
                        int green = android.graphics.Color.green(0);
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        b((keyRepeatDelay >> 16) + 58, ((((i147 | i149) << 1) - (i149 ^ i147)) - (~(((i150 & i143) | (i143 ^ i150)) * 68))) - 1, "\u0000", false, ((green | 1) << 1) - (green ^ 1), objArr28);
                    } catch (java.lang.Throwable th2) {
                        num2 = num3;
                        try {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
                DigitizedCardProfile = (writeReplace + 125) % 128;
                java.lang.Object[] objArr29 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-205672327) | i9)) | (~(799256658 | i))) * 959) - 978346037) + (((~(i | (-205672327))) | (~(799256658 | i9))) * 959))};
                java.lang.Integer num4 = num3;
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                if (obj9 == null) {
                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    byte b12 = (byte) (bArr[14] + 1);
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    a(b12, (byte) (b12 | 39), 653, objArr31);
                    obj9 = cls13.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj9);
                }
                ((int[]) objArr29[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr30)).intValue();
                return objArr29;
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    static void init$0() {
        $$a = new byte[]{70, -35, 111, 66, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = 193;
    }
}
