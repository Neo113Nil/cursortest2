package com.payair.hce;

/* loaded from: classes4.dex */
public final class getAid extends com.payair.hce.getCiacDecline implements java.lang.Iterable<com.payair.hce.getCiacDecline> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long valueOf;
    private static int values;
    private static int writeReplace;
    public final java.util.List<com.payair.hce.getCiacDecline> DigitizedCardProfile = new java.util.ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 42 - b;
        byte[] bArr = $$a;
        int i4 = s2 + 65;
        char[] cArr = new char[s + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = -1;
            int i7 = i3;
            i3 = (i3 + (-i4)) - 2;
            i = i7;
            i5 = i6;
            i2 = i5 + 1;
            cArr[i2] = (char) i3;
            int i8 = i + 1;
            if (i2 == s) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = i8;
            i4 = bArr[i8];
            i6 = i2;
            i3 = (i3 + (-i4)) - 2;
            i = i7;
            i5 = i6;
            i2 = i5 + 1;
            cArr[i2] = (char) i3;
            int i82 = i + 1;
            if (i2 == s) {
            }
        } else {
            i = i3;
            i3 = i4;
            i2 = i5 + 1;
            cArr[i2] = (char) i3;
            int i822 = i + 1;
            if (i2 == s) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b * 3);
        int i3 = s * 4;
        byte[] bArr = $$g;
        int i4 = (b2 * 2) + 99;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i4;
            i = 0;
            i4 = i5;
            i4 += i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i2];
            i4 += i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getAid getaid = (com.payair.hce.getAid) objArr[0];
        writeReplace = (values + 101) % 128;
        if (getaid.DigitizedCardProfile.size() != 1) {
            throw new java.lang.IllegalStateException();
        }
        int i4 = writeReplace + 103;
        values = i4 % 128;
        return (i4 % 2 != 0 ? getaid.DigitizedCardProfile.get(1) : getaid.DigitizedCardProfile.get(0)).DigitizedCardProfile();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char c, java.lang.Object[] objArr) {
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        int i3 = $10 + 77;
        while (true) {
            $11 = i3 % 128;
            if (getcvmmodel.valueOf >= i2) {
                break;
            }
            $10 = ($11 + 37) % 128;
            int i4 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 48, 381 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 62389));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(valueOf), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 35, 3966 - android.view.View.MeasureSpec.getSize(0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 14, 212 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                i3 = $10 + 45;
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 55) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 34, android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.blue(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.payair.hce.getCiacDecline> iterator() {
        writeReplace = (values + 65) % 128;
        java.util.Iterator<com.payair.hce.getCiacDecline> it = this.DigitizedCardProfile.iterator();
        writeReplace = (values + 57) % 128;
        return it;
    }

    @Override // com.payair.hce.getCiacDecline
    public final java.lang.Number AlternateContactlessPaymentDataJson() {
        values = (writeReplace + 11) % 128;
        if (this.DigitizedCardProfile.size() != 1) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.Number AlternateContactlessPaymentDataJson2 = this.DigitizedCardProfile.get(0).AlternateContactlessPaymentDataJson();
        int i = values + 111;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return AlternateContactlessPaymentDataJson2;
        }
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = writeReplace + 93;
        int i2 = i % 128;
        values = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj != this) {
            int i3 = i2 + 39;
            writeReplace = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (!(obj instanceof com.payair.hce.getAid) || !((com.payair.hce.getAid) obj).DigitizedCardProfile.equals(this.DigitizedCardProfile)) {
                return false;
            }
        }
        int i4 = values + 93;
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        values = (writeReplace + 51) % 128;
        int hashCode = this.DigitizedCardProfile.hashCode();
        values = (writeReplace + 83) % 128;
        return hashCode;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = new char[]{1485, 15682, 29896, 44126, 59331, 8005, 22216, 36354, 49615, 63811, 12482, 26712, 41929, 56130, 4824, 18946, 36335, 50499, 64706, 13400, 28617, 42836, 57048, 24264, 26186, 12251, 63342, 48351, 17503, 3523, 54598, 39628, 41550, 27611, 13126, 63680, 32833, 18918, 4417, 54985, 40512, 36431, 46784, 65354, 10204, 27713, 38087, 56650, 1408, 19021, 29377, 47936, 58330, 10315, 20672, 39258, 49536, 1630, 20163, 30464, 49135, 58462, 11486, 21826, 40391, 49741, 2767, 13146, 31687, 41025, 59584, 4455, 22976, 40520, 50881, 41275, 39345, 53308, 2234, 17198, 24192, 26186, 12251, 63308, 48256, 17478, 3521, 54598, 39643, 41472, 27587, 13123, 63684, 32843, 18818, 4427, 54986, 40525, 42970, 28488, 13512, 64590, 34253, 19779, 4810, 55809, 58333, 43852, 24285, 26176, 12161, 63307, 48330, 17485, 3546, 54600, 39624, 41550, 27597, 13123, 63690, 24222};
        valueOf = -1629106801471887825L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x05a6, code lost:
    
        if (r0 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0999, code lost:
    
        if (r4 != false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v46, types: [int] */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        char c;
        ?? r15;
        byte[] bArr;
        try {
            if (context == null) {
                int i3 = writeReplace;
                values = ((i3 ^ 69) + ((i3 & 69) << 1)) % 128;
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-50423041) | i)) * 623) - 856060206) + (((~i) | 536910502) * (-623)) + (((~(i | (-259220762))) | 50423040 | (~(745708223 | i))) * 623))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                    byte[] bArr2 = $$a;
                    byte b = (byte) (bArr2[23] + 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(b, (byte) (b + 5), (short) (bArr2[14] + 1), objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            values = (writeReplace + 85) % 128;
            try {
                int i4 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i5 = i4 * 85;
                int i6 = ~i4;
                int i7 = ~((i6 ^ (-2)) | (i6 & (-2)));
                int i8 = ~i;
                int i9 = ~(i6 | i8);
                int i10 = (i7 ^ i9) | (i9 & i7);
                int i11 = ~(i8 | (-2));
                int i12 = (i4 ^ 1) | (i4 & 1);
                int i13 = (((i5 | 85) << 1) - (i5 ^ 85)) + (((i10 ^ i11) | (i10 & i11) | (~((i12 ^ i) | (i12 & i)))) * (-84));
                int i14 = i & (-2);
                int i15 = -(-(((~((i ^ (-2)) | i14)) | i4 | (~(i8 | 1))) * (-84)));
                int i16 = (i13 ^ i15) + ((i13 & i15) << 1);
                int i17 = i8 & 1;
                int i18 = ~((i8 ^ 1) | i17);
                int i19 = ~i12;
                int i20 = ((i18 & i19) | (i18 ^ i19)) * 84;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b((i16 ^ i20) + ((i20 & i16) << 1), 23 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 23299), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                int i21 = (offsetBefore * 141) - 6417;
                int i22 = -(-(((i ^ 23) | (i & 23)) * 140));
                int i23 = ~offsetBefore;
                int i24 = (((i21 & i22) + (i21 | i22)) - (~(((~((i8 ^ 23) | (i8 & 23))) | (~(i23 | 23))) * (-280)))) - 1;
                int i25 = ~((offsetBefore & (-24)) | (offsetBefore ^ (-24)));
                int i26 = ~((offsetBefore ^ i8) | (offsetBefore & i8));
                int i27 = (i25 ^ i26) | (i26 & i25);
                int i28 = ~((i23 ^ 23) | (i23 & 23) | i);
                int i29 = -(-(((i27 ^ i28) | (i27 & i28)) * 140));
                int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                int i30 = maxKeyCode * (-380);
                int i31 = i | 18;
                int i32 = ~maxKeyCode;
                int i33 = (~(i32 | (-19))) | (~(i8 | 18));
                int i34 = ~((maxKeyCode ^ 18) | (maxKeyCode & 18));
                int i35 = (((((i30 | 6876) << 1) - (i30 ^ 6876)) - (~(-(-(((i31 ^ i32) | (i31 & i32)) * (-381)))))) - 1) + (((i33 ^ i34) | (i34 & i33)) * 381);
                int i36 = (~(i32 | 18)) * 381;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((i24 ^ i29) + ((i24 & i29) << 1), (i35 ^ i36) + ((i36 & i35) << 1), (char) android.graphics.Color.blue(0), objArr6);
                java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr6[0], null).invoke(context, null);
                int i37 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i38 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i39 = ~i38;
                int i40 = ~((i8 ^ (-35)) | (i8 & (-35)));
                int i41 = ~((i38 & (-35)) | (i38 ^ (-35)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((i37 & 40) + (i37 | 40), (((((i38 * 934) - 31688) + (((~((i39 ^ i8) | (i39 & i8))) | (-35)) * (-933))) - (~(-(-(((i40 ^ i41) | (i41 & i40)) * 933))))) - 1) + ((~((i38 ^ 34) | (i38 & 34))) * 933), (char) (53376 - (~(-(android.os.Process.myTid() >> 22)))), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                int i42 = -android.text.TextUtils.indexOf("", "");
                int i43 = i42 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                int i44 = ((i43 | 18975) << 1) - (i43 ^ 18975);
                int i45 = ~i42;
                int i46 = ~((i45 ^ (-76)) | (i45 & (-76)));
                int i47 = (i8 ^ (-76)) | (i8 & (-76));
                int i48 = ~i47;
                int i49 = (i46 ^ i48) | (i46 & i48);
                int i50 = (i42 ^ 75) | (i42 & 75);
                int i51 = ~((i50 ^ i) | (i50 & i));
                int i52 = -(-(((i49 & i51) | (i49 ^ i51)) * (-252)));
                int i53 = ((i44 | i52) << 1) - (i52 ^ i44);
                int i54 = i50 * (-252);
                int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                int i56 = ~((i42 ^ i47) | (i42 & i47));
                int i57 = ((i56 ^ i51) | (i56 & i51)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                int defaultSize = android.view.View.getDefaultSize(0, 0);
                int i58 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i59 = i58 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                int i60 = (((-14349318) | i59) << 1) - (i59 ^ (-14349318));
                int i61 = ~i58;
                int i62 = i8 | i58;
                int i63 = ((~((i61 ^ (-65523)) | (i61 & (-65523)))) | (~((i62 ^ 65522) | (i62 & 65522)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                int i64 = (i60 & i63) + (i63 | i60) + (((~((i8 ^ 65522) | (i8 & 65522))) | i58) * (-440));
                int i65 = i58 | 65522;
                int i66 = -(-(((i65 ^ i) | (i65 & i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((i55 & i57) + (i57 | i55), (defaultSize & 5) + (defaultSize | 5), (char) (((i64 | i66) << 1) - (i66 ^ i64)), objArr8);
                if ((cls3.getField((java.lang.String) objArr8[0]).getInt(invoke) & 2) != 0) {
                    int i67 = (values + 43) % 128;
                    writeReplace = i67;
                    values = (i67 + 23) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i14 | i17}, null, new int[1]};
                    int i68 = 804626844 | i8;
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((i68 * 495) + 651545507 + (((~i68) | 200278044) * 495))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 2713 - android.graphics.Color.alpha(0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                        byte[] bArr3 = $$a;
                        byte b2 = (byte) (bArr3[23] + 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(b2, (byte) (b2 + 5), (short) (bArr3[14] + 1), objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    c = 0;
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((493299448 | r6) * 764) - 1094409192) + (((~(493299448 | i8)) | 35182592) * (-1528)) + (((~(511629536 | i8)) | 52035096) * 764))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) android.text.TextUtils.getOffsetBefore("", 0));
                        byte[] bArr4 = $$a;
                        byte b3 = (byte) (bArr4[23] + 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(b3, (byte) (b3 + 5), (short) (bArr4[14] + 1), objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    c = 0;
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[c] != i) {
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 33, 1738 - android.graphics.Color.red(0), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 5826));
                    byte[] bArr5 = $$a;
                    byte b4 = (byte) (bArr5[23] + 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(b4, (byte) (b4 + 5), (short) (bArr5[14] + 1), objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, 1786 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.graphics.Color.green(0) + 5826));
                byte[] bArr6 = $$a;
                byte b5 = (byte) (bArr6[23] + 1);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(b5, (byte) (b5 + 5), (short) (bArr6[14] + 1), objArr14);
                boolean contains = set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null));
                java.lang.Object[] objArr15 = objArr14;
                if (!contains) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 33, 1738 - android.view.View.resolveSize(0, 0), (char) (5826 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                    byte b6 = bArr6[20];
                    byte b7 = b6;
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(b6, b7, (short) (b7 | 48), objArr16);
                    boolean contains2 = set.contains(cls8.getField((java.lang.String) objArr16[0]).get(null));
                    r15 = objArr16;
                    objArr15 = objArr16;
                }
                r15 = objArr15;
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    writeReplace = (values + 41) % 128;
                    java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~((-33100511) | i)) | 31981786) | r5) * (-470)) - 1143500780) + (((~(i | (-1118725))) | (~(972947198 | i8))) * 470))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        byte b8 = (byte) (bArr6[23] + 1);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a(b8, (byte) (b8 + 5), (short) (bArr6[14] + 1), objArr19);
                        obj5 = cls9.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr17[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                try {
                } catch (java.lang.Exception unused) {
                    r15 = 0;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    int i69 = writeReplace;
                    values = ((i69 ^ 63) + ((i69 & 63) << 1)) % 128;
                    int i70 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int i71 = (i70 * (-109)) + 8880;
                    int i72 = ~i70;
                    int i73 = ~((i ^ 80) | (i & 80));
                    int i74 = ((i73 & i72) | (i72 ^ i73)) * (-220);
                    int i75 = ~((i70 ^ 80) | (i70 & 80));
                    int i76 = (i71 & i74) + (i71 | i74) + (((i75 & i73) | (i73 ^ i75)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                    int i77 = ~((i72 ^ 80) | (i72 & 80));
                    int i78 = ~((i70 ^ (-81)) | (i70 & (-81)));
                    int i79 = ((i78 ^ i77) | (i78 & i77)) * 110;
                    int i80 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i81 = i80 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION;
                    int i82 = ((i81 | (-25284)) << 1) - (i81 ^ (-25284));
                    int i83 = ~i80;
                    int i84 = ((~((i83 & i) | (i83 ^ i))) | (~((i8 ^ 28) | (i8 & 28)))) * (-1808);
                    int i85 = i83 | (-29);
                    int i86 = ~((i85 ^ i) | (i85 & i));
                    int i87 = (i8 ^ i80) | (i8 & i80);
                    int i88 = ~((i87 & 28) | (i87 ^ 28));
                    int i89 = (((i82 | i84) << 1) - (i82 ^ i84)) + (((i86 & i88) | (i86 ^ i88)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                    int i90 = ~(i83 | 28);
                    int i91 = ~((i & (-29)) | (i ^ (-29)));
                    int i92 = (i90 ^ i91) | (i90 & i91);
                    int i93 = ~(i80 | i8);
                    int i94 = ((i93 ^ i92) | (i93 & i92)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                    int i95 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int i96 = i95 * (-209);
                    int i97 = ~i95;
                    int i98 = (i96 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE) + (i96 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE) + ((~i97) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                    int i99 = ~i8;
                    int i100 = ~(i97 | i);
                    int i101 = ((i100 & i99) | (i99 ^ i100)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                    int i102 = i97 | i8;
                    r15 = (((i98 | i101) << 1) - (i101 ^ i98)) + (((~(i95 | i)) | (~((~i102) | i102))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b(((i76 | i79) << 1) - (i79 ^ i76), ((i89 | i94) << 1) - (i94 ^ i89), (char) r15, objArr20);
                    try {
                        java.lang.Object[] objArr21 = {(java.lang.String) objArr20[0]};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj6 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36, 3161 - android.text.TextUtils.getOffsetBefore("", 0), (char) (33099 - android.text.TextUtils.indexOf("", "", 0)));
                            byte b9 = (byte) (bArr6[14] + 1);
                            byte b10 = b9;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            a(b9, b10, (short) (b10 | 653), objArr22);
                            obj6 = cls10.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr21)).longValue();
                        long j = i;
                        bArr = bArr6;
                        long j2 = ~j;
                        r15 = 0;
                        long j3 = ((((((-215) * longValue) - 174758346000L) + ((~(j | (-805338000))) * 216)) + ((((~longValue) | (-805338000)) | j2) * (-216))) + (((~((-805338000) | j2)) | longValue) * 216)) - 532330108;
                        int i103 = ((int) (j3 >> 32)) & (((((~((-1861642394) | i)) | 138674312) * (-566)) - 1677491622) + ((~((-1722968082) | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
                        int i104 = ~(1966790215 | i);
                        int i105 = ((int) j3) & ((((-2142951136) | i104) * (-280)) + 1260528921 + ((i104 | (~((-529563806) | i))) * 140) + (((~((-176160921) | i)) | (~(2142951135 | i8)) | (~((-353402886) | i8))) * 140));
                        if (((i103 ^ i105) | (i103 & i105)) == 1) {
                            writeReplace = (values + 125) % 128;
                            int i106 = writeReplace;
                            values = ((i106 ^ 35) + ((i106 & 35) << 1)) % 128;
                            java.lang.Object[] objArr23 = {new int[]{i}, new int[]{(i & (-11)) | (i8 & 10)}, null, new int[1]};
                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-858943816) | i8)) | (~((-145985170) | i))) * (-370)) - 833501688) + ((((~(i | (-858943816))) | (~((-145985170) | i8))) | (-1001652184)) * (-370))) - 1244120624)};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj7 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                byte b11 = (byte) (bArr[23] + 1);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a(b11, (byte) (b11 + 5), (short) (bArr[14] + 1), objArr25);
                                obj7 = cls11.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                            }
                            ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr24)).intValue();
                            return objArr23;
                        }
                        java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int i107 = ~(915219648 | i8);
                        ?? r5 = {java.lang.Integer.valueOf(i2), r15, java.lang.Integer.valueOf(((89709336 | i107) * 764) + 516158872 + (((~(89709336 | i8)) | 847586496) * (-1528)) + ((i107 | 869662680) * 764))};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                            byte[] bArr7 = $$a;
                            byte b12 = (byte) (bArr7[23] + 1);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(b12, (byte) (b12 + 5), (short) (bArr7[14] + 1), objArr27);
                            obj8 = cls12.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                        }
                        ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, r5)).intValue();
                        return objArr26;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                r15 = 0;
                bArr = bArr6;
                int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                int i108 = (combineMeasuredStates * (-520)) + 6786;
                int i109 = ~combineMeasuredStates;
                int i110 = (i109 ^ 13) | (i109 & 13);
                int i111 = -(-((~((i110 ^ i) | (i110 & i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                int i112 = ((i108 | i111) << 1) - (i108 ^ i111);
                int i113 = ~((combineMeasuredStates & (-14)) | (combineMeasuredStates ^ (-14)));
                int i114 = i113 * (-1042);
                int i115 = (i109 & i8) | (i109 ^ i8);
                int i116 = ~((i115 ^ 13) | (i115 & 13));
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b(108 - (pressedStateDuration >> 16), (i112 ^ i114) + ((i114 & i112) << 1) + (((i113 ^ i116) | (i113 & i116)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr28);
                try {
                    java.lang.Object[] objArr29 = {(java.lang.String) objArr28[0]};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj9 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1921, (char) android.graphics.Color.alpha(0));
                        byte b13 = (byte) (bArr[14] + 1);
                        byte b14 = b13;
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        a(b13, b14, (short) (b14 | 653), objArr30);
                        obj9 = cls13.getMethod((java.lang.String) objArr30[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr29);
                    int i117 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i118 = (i117 * 477) - 57475;
                    int i119 = ~i117;
                    int i120 = ~((i119 ^ 121) | (i119 & 121));
                    int i121 = (i117 & (-122)) | (i117 ^ (-122));
                    int i122 = ~((i121 ^ i) | (i121 & i));
                    int i123 = -(-(((i120 ^ i122) | (i120 & i122)) * (-476)));
                    int i124 = (i118 & i123) + (i118 | i123);
                    int i125 = i117 | (-122);
                    int i126 = -(-((~((i125 ^ i) | (i125 & i))) * 952));
                    int i127 = (i124 ^ i126) + ((i126 & i124) << 1);
                    int i128 = -(-((~(i117 | (i8 & (-122)) | (i8 ^ (-122)))) * 476));
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    b((i127 ^ i128) + ((i128 & i127) << 1), -android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr31);
                    boolean equals = invoke2.equals((java.lang.String) objArr31[0]);
                    int i129 = values;
                    writeReplace = (((i129 | 23) << 1) - (i129 ^ 23)) % 128;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
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

    static void init$1() {
        $$g = new byte[]{com.google.common.base.Ascii.US, -55, -63, 6};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 78, 75, -71, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = 96;
    }

    @Override // com.payair.hce.getCiacDecline
    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -1319468996, 1319468996, java.lang.System.identityHashCode(this));
    }
}
