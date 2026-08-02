package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'writeReplace' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class replenishToken {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.replenishToken[] AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.replenishToken DigitizedCardProfile;
    private static int RecordsJson;
    private static int getAid;
    public static final com.payair.hce.replenishToken valueOf;
    private static int[] values;
    public static final com.payair.hce.replenishToken writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = s + 4;
        byte[] bArr = $$a;
        int i3 = b * 3;
        int i4 = (b2 * 3) + 66;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i2;
            int i7 = i5;
            i = 0;
            int i8 = i6;
            i4 = i2 + (-i7);
            i2 = i8;
            int i9 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i7 = bArr[i9];
            int i10 = i4;
            i6 = i9;
            i2 = i10;
            int i82 = i6;
            i4 = i2 + (-i7);
            i2 = i82;
            int i92 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i922 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    private replenishToken(java.lang.String str, int i) {
    }

    public static com.payair.hce.replenishToken valueOf(java.lang.String str) {
        getAid = (RecordsJson + 113) % 128;
        com.payair.hce.replenishToken replenishtoken = (com.payair.hce.replenishToken) java.lang.Enum.valueOf(com.payair.hce.replenishToken.class, str);
        int i = getAid + 81;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return replenishtoken;
        }
        throw null;
    }

    public static com.payair.hce.replenishToken[] values() {
        int i = RecordsJson + 107;
        getAid = i % 128;
        com.payair.hce.replenishToken[] replenishtokenArr = AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return (com.payair.hce.replenishToken[]) replenishtokenArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        RecordsJson = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1381435155, -282413293, 426032762, 2147203050, -2071601417, 1837661434, -519794130, 416323659, -411665644, 2108299175, -1148876376, -1312188901}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 21, objArr);
        com.payair.hce.replenishToken replenishtoken = new com.payair.hce.replenishToken(((java.lang.String) objArr[0]).intern(), 0);
        writeReplace = replenishtoken;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{-544713067, -1484474712, -672311727, -1174867096, -473311343, 2046961986}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 10, objArr2);
        com.payair.hce.replenishToken replenishtoken2 = new com.payair.hce.replenishToken(((java.lang.String) objArr2[0]).intern(), 1);
        DigitizedCardProfile = replenishtoken2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{828702638, 1798953505, 861424943, -1921728521, -672311727, -1174867096, -473311343, 2046961986}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 14, objArr3);
        com.payair.hce.replenishToken replenishtoken3 = new com.payair.hce.replenishToken(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = replenishtoken3;
        AlternateContactlessPaymentDataJson = new com.payair.hce.replenishToken[]{replenishtoken, replenishtoken2, replenishtoken3};
        RecordsJson = (getAid + 51) % 128;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = values;
        long j = 0;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            $11 = ($10 + 5) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[0] = java.lang.Integer.valueOf(iArr3[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(j) + 27, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 111) % 128;
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = values;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            $11 = ($10 + 111) % 128;
            int i6 = 0;
            while (i6 < length3) {
                $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i6])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i6++;
                iArr6 = iArr2;
                length3 = i2;
                i4 = 0;
            }
            iArr6 = iArr7;
        }
        int i7 = i4;
        java.lang.System.arraycopy(iArr6, i7, iArr5, i7, length2);
        istransitsupported.valueOf = i7;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i7] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            for (int i8 = 0; i8 < 16; i8++) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 5088, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i9 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i9;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i10 = istransitsupported.DigitizedCardProfile;
            int i11 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2923 - android.graphics.Color.alpha(0), (char) (3037 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((short) -1, (byte) 0, (byte) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            i7 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
        $$b = 192;
    }

    static void writeReplace() {
        values = new int[]{2064600247, 174828200, -158788962, 1180695610, -939779118, 2033905941, 479541810, 1963487760, -44590371, 1491909028, -584010333, 1537641823, -1390584237, 766106653, -1959667143, 788834915, 1200444798, 48568525};
    }
}
