package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDataDir extends com.payair.hce.deleteFile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static short[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int getAid;
    private static int valueOf;
    private static byte[] writeReplace;
    private com.payair.hce.getErrors values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = 37 - (b * 34);
        byte[] bArr = $$a;
        int i4 = i * 34;
        int i5 = (s * 653) + 65;
        char[] cArr = new char[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = (i3 + i6) - 2;
            i3 = i7;
            i5 = i8;
            int i9 = i3 + 1;
            cArr[i2] = (char) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i2++;
            i6 = bArr[i9];
            i3 = i5;
            i7 = i9;
            int i82 = (i3 + i6) - 2;
            i3 = i7;
            i5 = i82;
            int i92 = i3 + 1;
            cArr[i2] = (char) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i922 = i3 + 1;
            cArr[i2] = (char) i5;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 4 - (i2 * 3);
        int i6 = i3 * 3;
        byte[] bArr = $$d;
        int i7 = 104 - (i * 4);
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            int i9 = i7;
            i7 = i8;
            int i10 = 0;
            i5++;
            i7 += i9;
            i4 = i10;
            bArr2[i4] = (byte) i7;
            i10 = i4 + 1;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i9 = bArr[i5];
            i5++;
            i7 += i9;
            i4 = i10;
            bArr2[i4] = (byte) i7;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    public final com.payair.hce.getErrors DigitizedCardProfile() {
        int i = RecordsJson + 115;
        getAid = i % 128;
        if (i % 2 == 0) {
            return this.values;
        }
        throw null;
    }

    public final java.lang.String toString() {
        getAid = (RecordsJson + 73) % 128;
        java.lang.String simpleName = getClass().getSimpleName();
        int i = getAid + 53;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return simpleName;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        int length;
        byte[] bArr;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getMode(0) + 29, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr2 = writeReplace;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i5 = 0; i5 < length2; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.getDefaultSize(0, 0), (android.os.Process.myPid() >> 22) + 5088, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr3[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))));
                    $11 = ($10 + 31) % 128;
                }
            }
            if (intValue > 0) {
                int i6 = (int) (valueOf ^ (-4897270311952305750L));
                if (z) {
                    $11 = ($10 + 51) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i6 + i4;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(DigitizedCardProfile), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, android.view.KeyEvent.keyCodeFromString("") + 2364, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(0, 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = writeReplace;
                if (bArr5 != null) {
                    int i7 = $10 + 31;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 57;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            bArr[i8] = (byte) (bArr5[i8] - 4897270311952305750L);
                        } else {
                            bArr[i8] = (byte) (bArr5[i8] ^ (-4897270311952305750L));
                            i8++;
                        }
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        byte[] bArr6 = writeReplace;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = IccPrivateKeyCrtComponentsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
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
        getAid = 0;
        RecordsJson = 1;
        valueOf = 279186304;
        AlternateContactlessPaymentDataJson = 520368523;
        DigitizedCardProfile = -2133229205;
        writeReplace = new byte[]{38, 40, -56, 39, 46, -39, 38, -11, 8, -44, 39, -39, 43, -54, 36, -8, 8, -45, -25, com.google.common.base.Ascii.DC4, -22, com.google.common.base.Ascii.CAN, -7, com.google.common.base.Ascii.ETB, -53, 56, -23, -61, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 19, -17, com.google.common.base.Ascii.US, -31, -30, 0, -75, 84, -70, 102, 81, -4, 67, 6, -115, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -67, -70, 73, -79, 74, com.visa.cbp.getEncExpo.registerForActivityResult, -106, -106, 123, 106, -127, Byte.MAX_VALUE, -110, -99, 103, -108, 105, -122, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 92, 109, -111, -110, -106, 123, 106, -47, 92, 102, -121, 105, -107, -95, 87, -109, 99, 104, com.visa.cbp.getEncExpo.registerForActivityResult, 110, -88, 40, 110, -110, -48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -60, -62, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 58, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, kotlin.io.encoding.Base64.padSymbol, -63, 57, 57, -44, -59, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.FF, -8, 60, -52, -57, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -63, 7, -121, -63, kotlin.io.encoding.Base64.padSymbol, Byte.MAX_VALUE, -9, com.visa.cbp.getEncExpo.kernelVersion, -58, 57, 122, -62, 45, -59, -60, 56, 59, 63, -46, -61, 120, -11, -60, 56, 59, 63, -46, -61, 120, -11, com.visa.cbp.getEncExpo.kernelVersion, 46, com.visa.cbp.getEncExpo.startTransaction, 60, 8, -2, 58, -54, -63, 48, -57, 1, -127, -57, 59, 121, -86, -86, -86, -86, -86, -86, -86, -86};
    }

    static void init$1() {
        $$d = new byte[]{18, 126, 13, 102};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:45|46)|(1:48)(4:92|93|94|(11:96|97|50|51|(1:53)(5:61|62|63|64|(2:66|(1:68)(5:69|70|71|72|(2:74|(6:76|77|(1:79)|80|81|82)))))|54|55|(1:57)|58|59|60)(1:98))|49|50|51|(0)(0)|54|55|(0)|58|59|60) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0371 A[Catch: all -> 0x09b1, TRY_ENTER, TryCatch #0 {all -> 0x09b1, blocks: (B:26:0x0371, B:28:0x0380, B:29:0x03c0, B:33:0x047a, B:35:0x04bf, B:36:0x0511, B:77:0x0841, B:79:0x087f, B:80:0x08d1, B:55:0x0913, B:57:0x094d, B:58:0x099b, B:105:0x0544, B:107:0x0582, B:108:0x05d4, B:138:0x02c7, B:140:0x0300, B:141:0x034c, B:3:0x0010, B:7:0x00a0, B:12:0x00fe, B:20:0x01c7, B:112:0x01d0, B:114:0x01d6, B:115:0x01d7, B:9:0x01d8, B:117:0x01dc, B:125:0x029e, B:128:0x02a7, B:130:0x02ad, B:131:0x02ae), top: B:2:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x094d A[Catch: all -> 0x09b1, TryCatch #0 {all -> 0x09b1, blocks: (B:26:0x0371, B:28:0x0380, B:29:0x03c0, B:33:0x047a, B:35:0x04bf, B:36:0x0511, B:77:0x0841, B:79:0x087f, B:80:0x08d1, B:55:0x0913, B:57:0x094d, B:58:0x099b, B:105:0x0544, B:107:0x0582, B:108:0x05d4, B:138:0x02c7, B:140:0x0300, B:141:0x034c, B:3:0x0010, B:7:0x00a0, B:12:0x00fe, B:20:0x01c7, B:112:0x01d0, B:114:0x01d6, B:115:0x01d7, B:9:0x01d8, B:117:0x01dc, B:125:0x029e, B:128:0x02a7, B:130:0x02ad, B:131:0x02ae), top: B:2:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0714 A[Catch: Exception -> 0x08f7, TRY_LEAVE, TryCatch #4 {Exception -> 0x08f7, blocks: (B:51:0x06c4, B:61:0x0714, B:64:0x076b, B:66:0x0773, B:69:0x07c2, B:72:0x0817, B:85:0x08e8, B:86:0x08ee, B:89:0x08f0, B:90:0x08f6, B:71:0x07cc, B:63:0x071e), top: B:50:0x06c4, inners: #3, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        int i4;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1612861352, (-262158890) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 14, (byte) (115 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (short) (android.os.Process.getGidForName("") + 1), objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(1612861366 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 262158872, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 15, (byte) (63 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (short) android.text.TextUtils.getCapsMode("", 0, 0), objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i | (-96913))) | 855934212) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1630065460 + ((~((-96913) | (~i))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    byte b = $$a[14];
                    byte b2 = (byte) (b - 1);
                    byte b3 = b;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b2, b3, b3, objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                for (i3 = 0; i3 < 2; i3++) {
                    RecordsJson = (getAid + 115) % 128;
                    java.lang.String str2 = strArr[i3];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(1612861344 - android.graphics.Color.alpha(0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 262158856, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 16, (byte) ((-19) - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        getAid = (RecordsJson + 111) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        int i5 = ~i;
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-208308712) | i)) | (~(796620273 | i5))) | r5) * (-516)) - 1916126288) + (((~(i5 | (-588346385))) | (~((-208273890) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((588346384 | (~(208308711 | i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                byte b4 = $$a[14];
                                byte b5 = (byte) (b4 - 1);
                                byte b6 = b4;
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b5, b6, b6, objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                getAid = (RecordsJson + 119) % 128;
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2391 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (29421 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                byte b7 = $$a[14];
                                byte b8 = (byte) (b7 - 1);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b7, b8, b8, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~longValue;
                            long j2 = i;
                            long j3 = (((-590) * longValue) - 875634531920L) + ((~(longValue | 1479112384)) * (-1182)) + ((((longValue | (-1479112385)) ^ (-1)) | (~(j | 1479112384 | (~j2)))) * (-591)) + ((j2 | 1479112384 | j) * 591) + 1761196481;
                            int i6 = (int) (j3 >> 32);
                            int i7 = ~i;
                            if (((i6 & (((((~((-201209988) | i)) | (~(1236016423 | i7))) * (-1808)) - 2019888502) + (((~((-162273284) | i)) | (~(1274953127 | i7))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-1236016424) | i)) | 38936704 | (~(201209987 | i7))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) j3) & (((((~((-1077412557) | i7)) | (~((-1780328330) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 2084436949) + (((~((-705012994) | i7)) | (~((-2097221) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-342532533) | i)) | 74055716) * 104) - 428470248) + ((~(930873268 | i7)) * (-104)) + ((662396452 | i) * 104))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, android.graphics.Color.green(0) + 2713, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                    byte b9 = $$a[14];
                                    byte b10 = (byte) (b9 - 1);
                                    byte b11 = b9;
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b10, b11, b11, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                int i8 = ~((-826445274) | i);
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-826445274) | i7)) | 826313728) * (-245)) + 841721722 + (i8 * (-245)) + ((i8 | 178483711) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0));
                                    byte b12 = $$a[14];
                                    byte b13 = (byte) (b12 - 1);
                                    byte b14 = b12;
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b13, b14, b14, objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                c = 0;
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                            }
                            if (i != ((int[]) objArr2[1])[c]) {
                                int i9 = getAid + 115;
                                RecordsJson = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return objArr2;
                                }
                                throw null;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(1612861294 - android.graphics.Color.argb(0, 0, 0, 0), android.view.View.getDefaultSize(0, 0) - 262158840, 7 - android.view.View.resolveSize(0, 0), (byte) (android.view.MotionEvent.axisFromString("") + 63), (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a(1612861357 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 262158801, (-30) - android.text.TextUtils.getCapsMode("", 0, 0), (byte) ((-97) - android.text.TextUtils.indexOf("", "")), (short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        RecordsJson = (getAid + 117) % 128;
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a(1612861293 - android.graphics.ImageFormat.getBitsPerPixel(0), (-262158799) - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.KeyEvent.getDeadChar(0, 0) - 2, (byte) ((-112) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1612861296, (-262158769) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (-32) - android.graphics.Color.blue(0), (byte) (96 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) android.view.View.MeasureSpec.getSize(0), objArr18);
                                                if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1612861294, (-262158770) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3 - android.text.TextUtils.indexOf("", "", 0, 0), (byte) ((-105) - android.text.TextUtils.indexOf("", "")), (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a(1612861295 - android.os.Process.getGidForName(""), (-262158769) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 32, (byte) (android.text.TextUtils.getTrimmedLength("") + 96), (short) (android.graphics.Color.rgb(0, 0, 0) + 16777216), objArr20);
                                                            if (readLine2.equals(((java.lang.String) objArr20[0]).intern())) {
                                                                getAid = (RecordsJson + 73) % 128;
                                                                if (str != null) {
                                                                    java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~(i | 793873362)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 326066876 + (((~(793873362 | i7)) | 202375170) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj7 == null) {
                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                        byte b15 = $$a[14];
                                                                        byte b16 = (byte) (b15 - 1);
                                                                        byte b17 = b15;
                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                        b(b16, b17, b17, objArr23);
                                                                        obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                    }
                                                                    ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                    return objArr21;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        int i10 = ~(i | 187839396);
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((-817089589) | i10) * (-220)) + 506884600) + ((i10 | (-1001652149)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1847865376)};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                            byte b18 = $$a[14];
                                            byte b19 = (byte) (b18 - 1);
                                            byte b20 = b18;
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(b19, b20, b20, objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        return objArr24;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                int i11 = RecordsJson + 121;
                                getAid = i11 % 128;
                                int i12 = i11 % 2;
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a(1612861293 - android.graphics.ImageFormat.getBitsPerPixel(0), (-262158799) - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.KeyEvent.getDeadChar(0, 0) - 2, (byte) ((-112) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            int i102 = ~(i | 187839396);
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((-817089589) | i102) * (-220)) + 506884600) + ((i102 | (-1001652149)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1847865376)};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                            return objArr242;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((34905986 | i) * 988) + 581316636 + (((~(1056743307 | i4)) | (-1073651644)) * (-1976)) + (((~(i4 | (-51814323))) | (~(51814322 | i)) | 34905986) * 988))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                    byte b21 = $$a[14];
                    byte b22 = (byte) (b21 - 1);
                    byte b23 = b21;
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b22, b23, b23, objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
            i4 = ~i;
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -77, -89, 4, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 50;
    }
}
