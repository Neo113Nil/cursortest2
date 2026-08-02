package com.payair.hce;

/* loaded from: classes4.dex */
public class getSecurityWord extends java.lang.RuntimeException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static short[] DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int valueOf;
    private static int values;
    private static byte[] writeReplace;

    private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = s2 * 34;
        int i3 = s + 4;
        int i4 = (i * 653) + 65;
        char[] cArr = new char[35 - i2];
        int i5 = 34 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + i5) - 2;
        }
        while (true) {
            i3++;
            i6++;
            cArr[i6] = (char) i4;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i4 = (i4 + bArr[i3]) - 2;
        }
    }

    private static void c(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i = (b * 4) + 104;
        byte[] bArr = $$d;
        int i2 = b2 * 3;
        int i3 = s + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i2 + (-i3);
            i3 = i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i += -bArr[i6];
                i3 = i6;
                i4 = i5;
            }
        }
    }

    public getSecurityWord(java.lang.String str) {
        super(str);
    }

    public getSecurityWord(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public getSecurityWord(java.lang.Throwable th) {
        super(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x025b A[Catch: all -> 0x034d, TryCatch #0 {all -> 0x034d, blocks: (B:3:0x000d, B:6:0x002e, B:7:0x0060, B:18:0x008c, B:20:0x00a3, B:21:0x00cf, B:29:0x00fc, B:31:0x0119, B:32:0x0154, B:36:0x017c, B:38:0x0199, B:39:0x01d0, B:49:0x0238, B:51:0x025b, B:52:0x02a5), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
        int i4;
        int i5;
        java.lang.Object obj;
        byte[] bArr;
        int length;
        byte[] bArr2;
        int i6;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 19, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            long j = 0;
            if (z) {
                byte[] bArr3 = writeReplace;
                if (bArr3 != null) {
                    $11 = ($10 + 3) % 128;
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr3[i7])};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.widget.ExpandableListView.getPackedPositionType(j) + 5088, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                        }
                        bArr4[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = 0;
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    int i8 = $11 + 101;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        byte[] bArr5 = writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        i6 = ((byte) (bArr5[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).intValue()] + 4897270311952305750L)) * ((int) (AlternateContactlessPaymentDataJson * (-4897270311952305750L)));
                    } else {
                        byte[] bArr6 = writeReplace;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj5 == null) {
                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 29, (char) (android.os.Process.getGidForName("") + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                        }
                        i6 = ((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)));
                    }
                    intValue = (byte) i6;
                } else {
                    intValue = (short) (((short) (DigitizedCardProfile[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i9 = $10;
                $11 = (i9 + 47) % 128;
                int i10 = (int) (valueOf ^ (-4897270311952305750L));
                if (z) {
                    int i11 = i9 + 71;
                    $11 = i11 % 128;
                    i4 = 2;
                    if (i11 % 2 != 0) {
                        i5 = 1;
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - i4) + i10 + i5;
                        java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values), sb};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27, 2365 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            c((byte) 0, (short) -1, (byte) 0, objArr7);
                            obj = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        bArr = writeReplace;
                        if (bArr != null) {
                            int i12 = $11 + 47;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                length = bArr.length;
                                bArr2 = new byte[length];
                            } else {
                                length = bArr.length;
                                bArr2 = new byte[length];
                            }
                            for (int i13 = 0; i13 < length; i13++) {
                                $11 = ($10 + 1) % 128;
                                bArr2[i13] = (byte) (bArr[i13] ^ (-4897270311952305750L));
                            }
                            bArr = bArr2;
                        }
                        boolean z2 = bArr == null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z2) {
                                byte[] bArr7 = writeReplace;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = DigitizedCardProfile;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                } else {
                    i4 = 2;
                }
                i5 = 0;
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - i4) + i10 + i5;
                java.lang.Object[] objArr62 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values), sb};
                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj == null) {
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr62)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                bArr = writeReplace;
                if (bArr != null) {
                }
                if (bArr == null) {
                }
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        valueOf = -348265817;
        AlternateContactlessPaymentDataJson = 520368606;
        values = -634490447;
        writeReplace = new byte[]{-98, -116, -20, com.visa.cbp.getEncExpo.registerForActivityResult, -122, -97, -98, -53, -84, -24, com.visa.cbp.getEncExpo.registerForActivityResult, -97, -115, -30, -104, -4, -84, -107, -69, -88, -82, 92, -67, -85, -113, 124, -83, -121, 73, 87, -93, 83, -91, -90, 68, 93, -78, -88, -116, -79, 106, -93, -20, 101, -86, 85, -88, -71, 81, -72, 1, 10, 10, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.EM, 35, 14, 13, 59, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.SUB, 120, -52, kotlin.io.encoding.Base64.padSymbol, 9, 14, 10, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 73, -52, 58, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 121, -53, com.google.common.base.Ascii.SI, 63, 48, 1, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.visa.cbp.getEncExpo.onUnminimized, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 14, 72, 45, 45, -31, -17, -4, -25, -107, -1, -8, -20, -28, -28, -111, -32, com.visa.cbp.getEncExpo.onUnminimized, 41, -91, -7, -23, -30, -13, -20, 34, -94, -20, -8, 58, -78, -22, -29, -28, 39, 86, -89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 92, -88, -87, 85, 70, 81, -24, 111, 92, -88, -87, 85, 70, 81, -24, 111, 69, -70, 80, 84, -104, 106, -82, 94, 83, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 93, -109, 19, 93, -87, -21, -86, -86, -86, -86, -86, -86, -86, -86};
    }

    static void init$1() {
        $$d = new byte[]{34, -19, 77, -23};
        $$e = 53;
    }

    static void init$0() {
        $$a = new byte[]{69, -73, 121, 3, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 54;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:45|46|47|48|49|50|51|52|53|(1:55)(9:102|103|104|105|106|107|108|109|(10:111|57|58|(1:60)(5:68|69|70|71|(2:73|(1:75)(5:76|77|78|79|(2:81|(1:(6:84|85|(1:87)|88|89|90))(2:91|92)))))|61|62|(1:64)|65|66|67)(1:112))|56|57|58|(0)(0)|61|62|(0)|65|66|67) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0560 A[Catch: all -> 0x1120, TRY_ENTER, TryCatch #0 {all -> 0x1120, blocks: (B:26:0x0560, B:28:0x056f, B:29:0x05b7, B:33:0x066a, B:35:0x06bb, B:36:0x070e, B:85:0x0f73, B:87:0x0fc4, B:88:0x101c, B:62:0x105c, B:64:0x10b3, B:65:0x110a, B:126:0x073d, B:128:0x0783, B:129:0x07d2, B:160:0x049e, B:162:0x04ea, B:163:0x053a, B:3:0x000b, B:6:0x020d, B:11:0x02c3, B:19:0x0387, B:133:0x0391, B:135:0x0397, B:136:0x0398, B:139:0x03a7, B:147:0x0471, B:150:0x047c, B:152:0x0482, B:153:0x0483), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x10b3 A[Catch: all -> 0x1120, TryCatch #0 {all -> 0x1120, blocks: (B:26:0x0560, B:28:0x056f, B:29:0x05b7, B:33:0x066a, B:35:0x06bb, B:36:0x070e, B:85:0x0f73, B:87:0x0fc4, B:88:0x101c, B:62:0x105c, B:64:0x10b3, B:65:0x110a, B:126:0x073d, B:128:0x0783, B:129:0x07d2, B:160:0x049e, B:162:0x04ea, B:163:0x053a, B:3:0x000b, B:6:0x020d, B:11:0x02c3, B:19:0x0387, B:133:0x0391, B:135:0x0397, B:136:0x0398, B:139:0x03a7, B:147:0x0471, B:150:0x047c, B:152:0x0482, B:153:0x0483), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0c27 A[Catch: Exception -> 0x1044, TRY_LEAVE, TryCatch #9 {Exception -> 0x1044, blocks: (B:58:0x0aaf, B:68:0x0c27, B:71:0x0d08, B:73:0x0d10, B:76:0x0e06, B:79:0x0f3f, B:95:0x1035, B:96:0x103b, B:99:0x103d, B:100:0x1043, B:78:0x0e10, B:70:0x0c31), top: B:57:0x0aaf, inners: #3, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(int i, int i2) {
        java.lang.Object[] objArr;
        char c;
        java.lang.Object[] objArr2;
        char c2;
        java.lang.CharSequence charSequence;
        int i3;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i4;
        int i5;
        int i6;
        try {
            try {
                int i7 = -android.view.KeyEvent.getDeadChar(0, 0);
                int i8 = (i7 ^ 96) | (i7 & 96);
                i4 = ~i;
                int i9 = ~(i7 | i4);
                int i10 = -(-(((i9 ^ (-97)) | (i9 & (-97))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                short s = (short) ((lastIndexOf ^ (-52)) + ((lastIndexOf & (-52)) << 1));
                int i11 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i12 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i13 = i12 * 367;
                int i14 = (i13 & 1483648978) + (i13 | 1483648978);
                int i15 = ((987086926 ^ i12) | (i12 & 987086926)) * (-366);
                int i16 = ~i12;
                int i17 = ~((i16 ^ 987086926) | (i16 & 987086926));
                int i18 = (i12 ^ (-987086927)) | (i12 & (-987086927));
                int i19 = ~((i18 ^ i) | (i18 & i));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(((((((i7 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + 20855) - (~((~((i7 ^ i) | (i7 & i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) - 1) + (((i8 ^ i4) | (i8 & i4)) * (-216))) - (~i10)) - 1, s, (i11 & 197537010) + (i11 | 197537010), (((((i14 ^ i15) + ((i14 & i15) << 1)) - (~(((~((-987086927) | i)) | i12) * (-366)))) - 1) - (~(-(-(((i17 ^ i19) | (i19 & i17)) * 366))))) - 1, (byte) android.view.View.resolveSize(0, 0), objArr3);
                int i20 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                int i21 = combineMeasuredStates * 319;
                int i22 = ((i21 | 1268) << 1) - (i21 ^ 1268);
                int i23 = ~combineMeasuredStates;
                int i24 = -(-(((~((i23 & i) | (i23 ^ i))) | 3) * (-318)));
                int i25 = (i4 ^ combineMeasuredStates) | (i4 & combineMeasuredStates);
                int i26 = -(-(((~((i25 & (-4)) | (i25 ^ (-4)))) | (~((i ^ 3) | (i & 3)))) * 318));
                int i27 = (i4 ^ 3) | (i4 & 3);
                int i28 = ~((i27 ^ combineMeasuredStates) | (i27 & combineMeasuredStates));
                int i29 = ~((combineMeasuredStates ^ (-4)) | (combineMeasuredStates & (-4)) | i);
                short s2 = (short) (((((((i22 | i24) << 1) - (i24 ^ i22)) - (~i26)) - 1) - (~(((i29 ^ i28) | (i29 & i28)) * 318))) - 1);
                int i30 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                int i31 = i30 * (-167);
                int i32 = ~i30;
                int i33 = ~((i32 & (-197537030)) | ((-197537030) ^ i32));
                int i34 = ~(((-197537030) ^ i) | ((-197537030) & i));
                int i35 = ~((197537029 & i30) | (197537029 ^ i30));
                int i36 = ~(i30 | i);
                int i37 = (((((1371054525 ^ i31) + ((i31 & 1371054525) << 1)) - (~(((i33 ^ i34) | (i33 & i34)) * 336))) - 1) - (~(((i35 ^ i36) | (i35 & i36)) * (-168)))) - 1;
                int i38 = ((~((i30 & i4) | (i4 ^ i30))) | (-197537030)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                int i39 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i40 = i39 * 465;
                int i41 = ((-1754719381) ^ i40) + ((i40 & (-1754719381)) << 1);
                int i42 = (~((i39 ^ (-987086940)) | (i39 & (-987086940)))) | (~((i4 ^ (-987086940)) | (i4 & (-987086940))));
                int i43 = ~((i4 ^ i39) | (i4 & i39));
                int i44 = -(-(((i42 & i43) | (i42 ^ i43)) * 464));
                int i45 = ~i39;
                int i46 = (i45 & i) | (i ^ i45);
                int i47 = (i41 & i44) + (i41 | i44) + (((i46 ^ (-987086940)) | (i46 & (-987086940))) * (-464));
                int i48 = ~((-987086940) | i39);
                int i49 = ~((i39 & i) | (i39 ^ i));
                int i50 = -(-(((i49 & i48) | (i48 ^ i49)) * 464));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a((-99) - (~i20), s2, (i37 ^ i38) + ((i38 & i37) << 1), (i47 & i50) + (i50 | i47), (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr4);
                strArr = new java.lang.String[]{(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                int i51 = getAid;
                SdkCoreAlternateContactlessPaymentDataImpl = (((i51 | 23) << 1) - (i51 ^ 23)) % 128;
                i5 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.lang.Exception unused) {
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
            int i52 = ~i;
            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i52 | (-497180564))) | 27287442 | (~(507748421 | i52))) * 464) + 1613447800 + (((-469893122) | i) * (-464)) + (((~(507748421 | i)) | 27287442) * 464))};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                byte b = (byte) (-$$a[14]);
                byte b2 = (byte) (b + 1);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(b, b2, b2, objArr6);
                obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
            }
            c = 0;
            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
        }
        try {
            for (i6 = 2; i5 < i6; i6 = 2) {
                java.lang.String str2 = strArr[i5];
                int i53 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int i54 = i53 * (-183);
                int i55 = ((i54 | (-18685)) << 1) - (i54 ^ (-18685));
                int i56 = ~i53;
                int i57 = ((i56 ^ (-101)) | (i56 & (-101))) * (-368);
                int i58 = (i53 ^ 100) | (i53 & 100);
                int i59 = ~((i56 & 100) | (i56 ^ 100));
                int i60 = ~((i4 ^ i53) | (i4 & i53));
                int i61 = (i59 ^ i60) | (i59 & i60);
                int i62 = ~((i53 ^ (-101)) | (i53 & (-101)));
                int i63 = -(-(((i62 ^ i61) | (i61 & i62)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                short s3 = (short) ((-5) - (~(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                int i64 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i65 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(((((i55 ^ i57) + ((i55 & i57) << 1)) + (((i58 & i4) | (i58 ^ i4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - (~i63)) - 1, s3, 197537045 - (~i64), ((987086918 | i65) << 1) - (987086918 ^ i65), (byte) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                    int i66 = SdkCoreAlternateContactlessPaymentDataImpl;
                    getAid = ((i66 & 71) + (i66 | 71)) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-2)) | (i4 & 1)}, null, new int[1]};
                    try {
                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-105591177) | i)) | 67764224) * 576) + 1986419160 + (((~((-37826953) | i4)) | 831573584) * 576) + 377487360)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) android.text.TextUtils.indexOf("", ""));
                            byte b3 = (byte) (-$$a[14]);
                            byte b4 = (byte) (b3 + 1);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(b3, b4, b4, objArr9);
                            obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                        }
                        ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                        c = 0;
                        if (i == ((int[]) objArr[1])[c]) {
                            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 57) % 128;
                            return objArr;
                        }
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.KeyEvent.normalizeMetaState(0) + 2391, (char) (29420 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                            byte[] bArr = $$a;
                            byte b5 = (byte) (-bArr[23]);
                            byte b6 = bArr[14];
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b5, b6, b6, objArr10);
                            obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                        long j = i;
                        long j2 = 1198920145 | longValue;
                        long j3 = ~j;
                        long j4 = (((-279) * longValue) - 169047740586L) + ((longValue | j) * 140) + (((~j2) | (~(j3 | longValue))) * (-280)) + (((~((~longValue) | (-1198920146))) | (~(j3 | (-1198920146))) | (~(j | j2))) * 140) + 1481004242;
                        int i67 = ~((-2061927808) | i);
                        int i68 = ~i;
                        int i69 = ((int) (j4 >> 32)) & ((((1350598954 | i67) * (-814)) - 1259126160) + ((i67 | (~(795813077 | i68)) | 84484224) * 407) + (((~(2061927807 | i)) | 84484224 | (~((-795813078) | i))) * 407));
                        int i70 = (-1352460962) | i68;
                        int i71 = ((int) j4) & ((i70 * 495) + 917527034 + (((~i70) | (-1436412842)) * 495));
                        if (((i69 ^ i71) | (i69 & i71)) == 1) {
                            objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-11)) | (i68 & 10)}, null, new int[1]};
                            java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-549220008) | i68)) | 455708977) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 862170896) + (((~((-546598535) | i68)) | (~(1002307511 | i))) * (-519)) + (((~(455708977 | i)) | 549220007) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj5 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.text.TextUtils.indexOf("", "", 0));
                                byte b7 = (byte) (-$$a[14]);
                                byte b8 = (byte) (b7 + 1);
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                b(b7, b8, b8, objArr12);
                                obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                            }
                            ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                            c2 = 1;
                        } else {
                            objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((-602275777) | i68) * 1444) + 1295675560 + (((~(797310028 | i)) | (-803602381) | (~(207618956 | i))) * (-1444)) + 1051413376)};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj6 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), 2713 - android.graphics.Color.alpha(0), (char) android.view.KeyEvent.keyCodeFromString(""));
                                byte b9 = (byte) (-$$a[14]);
                                byte b10 = (byte) (b9 + 1);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b(b9, b10, b10, objArr14);
                                obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                            }
                            ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                            int i72 = SdkCoreAlternateContactlessPaymentDataImpl;
                            c2 = 1;
                            getAid = (((i72 | 121) << 1) - (i72 ^ 121)) % 128;
                        }
                        if (i != ((int[]) objArr2[c2])[0]) {
                            int i73 = SdkCoreAlternateContactlessPaymentDataImpl + 93;
                            getAid = i73 % 128;
                            if (i73 % 2 != 0) {
                                return objArr2;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        try {
                            int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int i74 = (lastIndexOf2 * (-344)) + 25800;
                            int i75 = ~lastIndexOf2;
                            int i76 = (i75 ^ 74) | (i75 & 74);
                            int i77 = -(-(((~i76) | (~(i75 | i))) * 345));
                            int i78 = (i74 & i77) + (i74 | i77);
                            int i79 = ~((i75 ^ i68) | (i75 & i68));
                            int i80 = ~((lastIndexOf2 ^ 74) | (lastIndexOf2 & 74));
                            int i81 = -(-(((i79 ^ i80) | (i79 & i80)) * 345));
                            int i82 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i83 = ~i82;
                            int i84 = ~((i83 & i68) | (i83 ^ i68));
                            int i85 = (i82 * 236) + 46629 + (((i84 ^ 99) | (i84 & 99)) * (-235)) + (((~((i83 ^ i) | (i83 & i))) | 99) * (-470));
                            int i86 = ~((i82 ^ (-100)) | (i82 & (-100)));
                            int i87 = (i83 ^ 99) | (i83 & 99);
                            int i88 = ~((i87 ^ i) | (i87 & i));
                            int i89 = -(-(((i86 ^ i88) | (i86 & i88)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                            short s4 = (short) ((i85 ^ i89) + ((i89 & i85) << 1));
                            int i90 = -android.view.KeyEvent.getDeadChar(0, 0);
                            int i91 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i92 = i91 * 165;
                            int i93 = ~((987086869 ^ i68) | (987086869 & i68));
                            int i94 = -(-((i91 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                            int i95 = ~i91;
                            int i96 = (~((i ^ (-987086870)) | (i & (-987086870)))) | (~(((-987086870) ^ i95) | (i95 & (-987086870))));
                            int i97 = (i68 ^ i91) | (i91 & i68);
                            int i98 = ~((i97 ^ 987086869) | (987086869 & i97));
                            i3 = i68;
                            try {
                                charSequence = "";
                                try {
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    a((((i78 | i81) << 1) - (i81 ^ i78)) + ((~(i76 | i)) * 345), s4, (197537061 ^ i90) + ((i90 & 197537061) << 1), ((((((((-1981369695) | i92) << 1) - ((-1981369695) ^ i92)) + (((i91 ^ i93) | (i93 & i91)) * (-328))) - (~i94)) - 1) - (~(((i96 ^ i98) | (i96 & i98)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) - 1, (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
                                    file2 = new java.io.File((java.lang.String) objArr15[0]);
                                } catch (java.lang.Exception unused2) {
                                }
                            } catch (java.lang.Exception unused3) {
                                charSequence = "";
                            }
                        } catch (java.lang.Exception unused4) {
                            charSequence = "";
                            i3 = i68;
                        }
                        if (file2.canRead()) {
                            java.io.FileReader fileReader = new java.io.FileReader(file2);
                            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                            try {
                                str = bufferedReader.readLine();
                                try {
                                    int i99 = -(-android.text.TextUtils.indexOf(charSequence, charSequence, 0, 0));
                                    int i100 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int i101 = i100 * (-716);
                                    int i102 = ~i100;
                                    int i103 = ((((173635 | i101) << 1) - (i101 ^ 173635)) - (~(((i102 ^ 121) | (i102 & 121)) * (-1434)))) - 1;
                                    int i104 = ~((i3 ^ 121) | (i3 & 121));
                                    int i105 = ~((i100 ^ 121) | (i100 & 121));
                                    int i106 = i102 | (-122);
                                    int i107 = -(-(((i104 & i105) | (i104 ^ i105) | (~((i106 ^ i) | (i106 & i)))) * 717));
                                    int i108 = (i102 ^ (-122)) | (i102 & (-122));
                                    int i109 = ~((i108 ^ i3) | (i108 & i3));
                                    int i110 = ~(i100 | 121);
                                    int i111 = (i110 ^ i109) | (i110 & i109);
                                    int i112 = ~((i ^ 121) | (i & 121));
                                    short s5 = (short) ((i103 & i107) + (i107 | i103) + (((i111 ^ i112) | (i111 & i112)) * 717));
                                    int size = android.view.View.MeasureSpec.getSize(0);
                                    int i113 = size * 46;
                                    int i114 = (496772008 ^ i113) + ((i113 & 496772008) << 1);
                                    int i115 = -(-(((~((i3 & (-197537101)) | (i3 ^ (-197537101)))) | size) * (-90)));
                                    int i116 = (i114 ^ i115) + ((i114 & i115) << 1);
                                    int i117 = ~((i & (-197537101)) | (i ^ (-197537101)));
                                    int i118 = ~((197537100 ^ size) | (197537100 & size));
                                    int i119 = -(-(((i117 & i118) | (i117 ^ i118)) * (-45)));
                                    int i120 = ~size;
                                    int i121 = ~((i120 ^ i) | (i120 & i));
                                    int i122 = ((-197537101) & i121) | (i121 ^ (-197537101));
                                    int i123 = ~(size | i3);
                                    int i124 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i125 = i124 * 567;
                                    int i126 = ~i124;
                                    int i127 = ((-987086933) ^ i126) | (i126 & (-987086933));
                                    charSequence = charSequence;
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a((i99 ^ (-113)) + ((i99 & (-113)) << 1), s5, (((i116 & i119) + (i119 | i116)) - (~(((i122 ^ i123) | (i123 & i122)) * 45))) - 1, (((((641631900 & i125) + (641631900 | i125)) + (((~((987086932 & i126) | (987086932 ^ i126))) | (~((i126 ^ i) | (i126 & i)))) * (-566))) + ((~(((-987086933) & i124) | ((-987086933) ^ i124))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST)) - (~(-(-((~((i127 & i) | (i127 ^ i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))))) - 1, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr16);
                                    if (!str.equals((java.lang.String) objArr16[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i128 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i129 = i128 * (-947);
                                        int i130 = ~i128;
                                        int i131 = i130 | 85;
                                        int i132 = (((((((-81614) | i129) << 1) - (i129 ^ (-81614))) - (~(((~(i | 85)) | i130) * (-948)))) - 1) - (~((~((i131 & i3) | (i131 ^ i3))) * (-948)))) - 1;
                                        int i133 = -(-(((i128 ^ 85) | (i128 & 85)) * 948));
                                        java.lang.CharSequence charSequence2 = charSequence;
                                        int i134 = -(-android.text.TextUtils.getOffsetBefore(charSequence2, 0));
                                        int i135 = -(android.os.Process.myTid() >> 22);
                                        int i136 = i135 * (-494);
                                        int i137 = (((1200919420 & i136) + (i136 | 1200919420)) - (~(-(-((~((197537102 & i135) | (197537102 ^ i135))) * (-495)))))) - 1;
                                        int i138 = ((i135 ^ i3) | (i135 & i3)) * 495;
                                        int i139 = (i137 ^ i138) + ((i137 & i138) << 1);
                                        int i140 = ~i135;
                                        int i141 = ~((i140 ^ (-197537103)) | ((-197537103) & i140));
                                        int i142 = ~(i135 | i3);
                                        int i143 = ((i142 ^ i141) | (i142 & i141)) * 495;
                                        int i144 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                        int i145 = (i144 * 85) - 1996962140;
                                        int i146 = ~i144;
                                        int i147 = (~((i146 & (-987086869)) | ((-987086869) ^ i146))) | (~((i146 ^ i3) | (i146 & i3)));
                                        int i148 = ~(i3 | (-987086869));
                                        int i149 = (i144 ^ 987086868) | (i144 & 987086868);
                                        int i150 = -(-(((i147 & i148) | (i147 ^ i148) | (~((i149 ^ i) | (i149 & i)))) * (-84)));
                                        int i151 = ~(((-987086869) & i) | (i ^ (-987086869)));
                                        int i152 = (i144 & i151) | (i144 ^ i151);
                                        int i153 = ~(i3 | 987086868);
                                        int i154 = (((i145 | i150) << 1) - (i145 ^ i150)) + (((i152 ^ i153) | (i152 & i153)) * (-84));
                                        int i155 = ((~((i3 ^ 987086868) | (i3 & 987086868))) | (~i149)) * 84;
                                        int i156 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i157 = ~i156;
                                        int i158 = (i157 ^ 1) | (i157 & 1);
                                        int i159 = (~i158) | (~((i157 ^ i) | (i157 & i)));
                                        int i160 = ~((i ^ 1) | (i & 1));
                                        int i161 = ~((i158 & i) | (i158 ^ i));
                                        int i162 = ~((i156 & i3) | (i3 ^ i156) | 1);
                                        int i163 = ((((i156 * 755) - 753) - (~(((i159 & i160) | (i159 ^ i160)) * (-754)))) - 1) + (((i161 ^ i162) | (i162 & i161)) * (-754));
                                        int i164 = (i157 | i3) * 754;
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a(((i132 | i133) << 1) - (i133 ^ i132), (short) ((i134 & (-76)) + (i134 | (-76))), ((i139 | i143) << 1) - (i143 ^ i139), ((i154 | i155) << 1) - (i155 ^ i154), (byte) (((i163 | i164) << 1) - (i164 ^ i163)), objArr17);
                                        file = new java.io.File((java.lang.String) objArr17[0]);
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                int i165 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                                                char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int i166 = mirror * 64875;
                                                int i167 = (68744 ^ i166) + ((i166 & 68744) << 1);
                                                int i168 = ~mirror;
                                                int i169 = ~((i168 & 103) | (i168 ^ 103));
                                                int i170 = -(-(((i3 ^ i169) | (i169 & i3)) * 1324));
                                                int i171 = (((i167 | i170) << 1) - (i167 ^ i170)) + (((~((mirror ^ i) | (mirror & i))) | (~((i ^ (-104)) | (i & (-104))))) * (-1324));
                                                int i172 = ~((i168 ^ (-104)) | (i168 & (-104)));
                                                int i173 = ~(mirror | 'g');
                                                int i174 = -(-(((i172 ^ i173) | (i173 & i172)) * 662));
                                                int i175 = -android.text.TextUtils.indexOf(charSequence2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                int i176 = -android.graphics.Color.blue(0);
                                                int i177 = ~i176;
                                                int i178 = ~((i3 & i177) | (i177 ^ i3));
                                                int i179 = ~(i177 | 987086870);
                                                int i180 = (i178 & i179) | (i178 ^ i179);
                                                int i181 = ~((i3 ^ 987086870) | (i3 & 987086870));
                                                int i182 = ((i176 * 398) - 44376584) + (((i180 & i181) | (i180 ^ i181)) * (-397));
                                                int i183 = (~((i177 & 987086870) | (i177 ^ 987086870))) * (-397);
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a((i165 & (-116)) + (i165 | (-116)), (short) ((i171 & i174) + (i174 | i171)), ((197537131 | i175) << 1) - (i175 ^ 197537131), ((((i182 | i183) << 1) - (i182 ^ i183)) - (~(-(-(((~((i176 ^ (-987086871)) | (i176 & (-987086871)))) | (r9 | i)) * 397))))) - 1, (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr18);
                                                if (readLine.equals((java.lang.String) objArr18[0])) {
                                                    int i184 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i185 = -(-(i184 * (-963)));
                                                    int i186 = ~i184;
                                                    int i187 = ~((i & 78) | (i ^ 78));
                                                    int i188 = (((i185 & (-964)) + (i185 | (-964))) - 76235) + (((i186 & i187) | (i186 ^ i187)) * (-964));
                                                    int i189 = ((~((i184 ^ 78) | (i184 & 78))) | (~((i3 & 78) | (i3 ^ 78)))) * (-964);
                                                    short s6 = (short) (2 - (~android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                                                    int i190 = edgeSlop * (-589);
                                                    int i191 = ~((i3 ^ (-197537133)) | (i3 & (-197537133)));
                                                    int i192 = ~(((-197537133) & edgeSlop) | ((-197537133) ^ edgeSlop));
                                                    int i193 = (i191 ^ i192) | (i192 & i191);
                                                    int i194 = ~((i3 ^ edgeSlop) | (i3 & edgeSlop));
                                                    int i195 = (i193 & i194) | (i193 ^ i194);
                                                    int i196 = ~edgeSlop;
                                                    int i197 = 197537132 | i196;
                                                    int i198 = ~((i197 ^ i) | (i197 & i));
                                                    int i199 = ((((780328020 | i190) << 1) - (i190 ^ 780328020)) - (~(((i195 & i198) | (i195 ^ i198)) * 590))) - 1;
                                                    int i200 = -(-((i193 | i194) * (-1180)));
                                                    int i201 = (i199 ^ i200) + ((i200 & i199) << 1);
                                                    int i202 = ~((i196 ^ i3) | (i196 & i3));
                                                    int i203 = ~(i3 | 197537132);
                                                    int i204 = ((i202 ^ i203) | (i202 & i203)) * 590;
                                                    int i205 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a((i188 & i189) + (i189 | i188), s6, (i201 ^ i204) + ((i204 & i201) << 1), (i205 & 987086868) + (987086868 | i205), (byte) android.graphics.Color.argb(0, 0, 0, 0), objArr19);
                                                    java.io.File file3 = new java.io.File((java.lang.String) objArr19[0]);
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                            int i206 = resolveOpacity * 491;
                                                            int i207 = ~resolveOpacity;
                                                            int i208 = (i207 ^ 114) | (i207 & 114);
                                                            int i209 = (56235 & i206) + (i206 | 56235) + (((i208 & i3) | (i208 ^ i3)) * (-490));
                                                            int i210 = ~(resolveOpacity | 114);
                                                            int i211 = ~((i & 114) | (i ^ 114));
                                                            int i212 = ((i210 ^ i211) | (i210 & i211)) * 490;
                                                            int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                                            int i213 = ~touchSlop;
                                                            int i214 = ~((i213 & 55) | (i213 ^ 55));
                                                            int i215 = ~((i3 ^ touchSlop) | (i3 & touchSlop));
                                                            int i216 = ~((touchSlop ^ (-56)) | (touchSlop & (-56)));
                                                            int i217 = ((((touchSlop * (-375)) + 21000) + (((~(touchSlop | (-56))) | ((i214 & i) | (i214 ^ i))) * 376)) - (~(-(-(((i215 & i216) | (i215 ^ i216)) * (-376)))))) - 1;
                                                            int i218 = ~((i213 & i) | (i213 ^ i));
                                                            int i219 = ((i218 ^ (-56)) | (i218 & (-56))) * 376;
                                                            short s7 = (short) (((i217 | i219) << 1) - (i219 ^ i217));
                                                            int i220 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                            int i221 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i222 = i221 * (-813);
                                                            int i223 = ((-995482864) ^ i222) + ((i222 & (-995482864)) << 1);
                                                            int i224 = ~((i221 & (-987086871)) | (i221 ^ (-987086871)));
                                                            int i225 = ~(i221 | i);
                                                            int i226 = -(-(((i224 & i225) | (i224 ^ i225)) * (-814)));
                                                            int i227 = ~((i3 & (-987086871)) | (i3 ^ (-987086871)));
                                                            int i228 = ~i221;
                                                            int i229 = ~(i228 | 987086870);
                                                            int i230 = ~((i228 ^ 987086870) | (i228 & 987086870));
                                                            int i231 = ~((i228 & i) | (i228 ^ i));
                                                            int i232 = (i231 & i230) | (i231 ^ i230);
                                                            int i233 = ~((i ^ 987086870) | (987086870 & i));
                                                            java.lang.String str3 = str;
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a((((i209 ^ i212) + ((i212 & i209) << 1)) - (~(i207 * 490))) - 1, s7, ((197537132 | i220) << 1) - (i220 ^ 197537132), (((((i223 | i226) << 1) - (i226 ^ i223)) + ((i225 | ((i229 ^ i227) | (i227 & i229))) * 407)) - (~(((i232 & i233) | (i232 ^ i233)) * 407))) - 1, (byte) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr20);
                                                            if (readLine2.equals((java.lang.String) objArr20[0])) {
                                                                int i234 = SdkCoreAlternateContactlessPaymentDataImpl + 55;
                                                                getAid = i234 % 128;
                                                                if (i234 % 2 == 0) {
                                                                    throw null;
                                                                }
                                                                if (str3 != null) {
                                                                    java.lang.Object[] objArr21 = {new int[]{i}, new int[]{(i & (-21)) | (i3 & 20)}, str3, new int[1]};
                                                                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(i3 | (-463416329))) | (-541512657)) * (-865)) - 2123885296) + ((~(i | 463416328)) * 865) + (((~(i3 | 463416328)) | (~(i3 | (-541512657)))) * 865))};
                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj7 == null) {
                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                                        byte b11 = (byte) (-$$a[14]);
                                                                        byte b12 = (byte) (b11 + 1);
                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                        b(b11, b12, b12, objArr23);
                                                                        obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                    }
                                                                    ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                    return objArr21;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    } else {
                                                        int i235 = getAid;
                                                        SdkCoreAlternateContactlessPaymentDataImpl = (i235 + 81) % 128;
                                                        SdkCoreAlternateContactlessPaymentDataImpl = (((i235 | 53) << 1) - (i235 ^ 53)) % 128;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i3 | (-417384183))) | (~(i | (-587544803))) | (~(i3 | 587544802))) * 959) + 1004713209 + (((~(i | 587544802)) | (~(i | (-417384183))) | (~(i3 | (-587544803)))) * 959))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                            byte b13 = (byte) (-$$a[14]);
                                            byte b14 = (byte) (b13 + 1);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(b13, b14, b14, objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        return objArr24;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        } else {
                            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 61) % 128;
                        }
                        str = null;
                        int i1282 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i1292 = i1282 * (-947);
                        int i1302 = ~i1282;
                        int i1312 = i1302 | 85;
                        int i1322 = (((((((-81614) | i1292) << 1) - (i1292 ^ (-81614))) - (~(((~(i | 85)) | i1302) * (-948)))) - 1) - (~((~((i1312 & i3) | (i1312 ^ i3))) * (-948)))) - 1;
                        int i1332 = -(-(((i1282 ^ 85) | (i1282 & 85)) * 948));
                        java.lang.CharSequence charSequence22 = charSequence;
                        int i1342 = -(-android.text.TextUtils.getOffsetBefore(charSequence22, 0));
                        int i1352 = -(android.os.Process.myTid() >> 22);
                        int i1362 = i1352 * (-494);
                        int i1372 = (((1200919420 & i1362) + (i1362 | 1200919420)) - (~(-(-((~((197537102 & i1352) | (197537102 ^ i1352))) * (-495)))))) - 1;
                        int i1382 = ((i1352 ^ i3) | (i1352 & i3)) * 495;
                        int i1392 = (i1372 ^ i1382) + ((i1372 & i1382) << 1);
                        int i1402 = ~i1352;
                        int i1412 = ~((i1402 ^ (-197537103)) | ((-197537103) & i1402));
                        int i1422 = ~(i1352 | i3);
                        int i1432 = ((i1422 ^ i1412) | (i1422 & i1412)) * 495;
                        int i1442 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                        int i1452 = (i1442 * 85) - 1996962140;
                        int i1462 = ~i1442;
                        int i1472 = (~((i1462 & (-987086869)) | ((-987086869) ^ i1462))) | (~((i1462 ^ i3) | (i1462 & i3)));
                        int i1482 = ~(i3 | (-987086869));
                        int i1492 = (i1442 ^ 987086868) | (i1442 & 987086868);
                        int i1502 = -(-(((i1472 & i1482) | (i1472 ^ i1482) | (~((i1492 ^ i) | (i1492 & i)))) * (-84)));
                        int i1512 = ~(((-987086869) & i) | (i ^ (-987086869)));
                        int i1522 = (i1442 & i1512) | (i1442 ^ i1512);
                        int i1532 = ~(i3 | 987086868);
                        int i1542 = (((i1452 | i1502) << 1) - (i1452 ^ i1502)) + (((i1522 ^ i1532) | (i1522 & i1532)) * (-84));
                        int i1552 = ((~((i3 ^ 987086868) | (i3 & 987086868))) | (~i1492)) * 84;
                        int i1562 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i1572 = ~i1562;
                        int i1582 = (i1572 ^ 1) | (i1572 & 1);
                        int i1592 = (~i1582) | (~((i1572 ^ i) | (i1572 & i)));
                        int i1602 = ~((i ^ 1) | (i & 1));
                        int i1612 = ~((i1582 & i) | (i1582 ^ i));
                        int i1622 = ~((i1562 & i3) | (i3 ^ i1562) | 1);
                        int i1632 = ((((i1562 * 755) - 753) - (~(((i1592 & i1602) | (i1592 ^ i1602)) * (-754)))) - 1) + (((i1612 ^ i1622) | (i1622 & i1612)) * (-754));
                        int i1642 = (i1572 | i3) * 754;
                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                        a(((i1322 | i1332) << 1) - (i1332 ^ i1322), (short) ((i1342 & (-76)) + (i1342 | (-76))), ((i1392 | i1432) << 1) - (i1432 ^ i1392), ((i1542 | i1552) << 1) - (i1552 ^ i1542), (byte) (((i1632 | i1642) << 1) - (i1642 ^ i1632)), objArr172);
                        file = new java.io.File((java.lang.String) objArr172[0]);
                        if (!file.canRead()) {
                        }
                        java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i3 | (-417384183))) | (~(i | (-587544803))) | (~(i3 | 587544802))) * 959) + 1004713209 + (((~(i | 587544802)) | (~(i | (-417384183))) | (~(i3 | (-587544803)))) * 959))};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj == null) {
                        }
                        ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                        return objArr242;
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause2 = th4.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th4;
                    }
                }
                i5++;
                SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 1) % 128;
            }
            java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(178180908 | i4)) | 826748076) * (-1042)) - 393992872) + ((178180908 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-826748077) | i)) | 393260 | (~(1004535724 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) android.text.TextUtils.indexOf("", ""));
                byte b15 = (byte) (-$$a[14]);
                byte b16 = (byte) (b15 + 1);
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b(b15, b16, b16, objArr28);
                obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
            c = 0;
            if (i == ((int[]) objArr[1])[c]) {
            }
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
    }
}
