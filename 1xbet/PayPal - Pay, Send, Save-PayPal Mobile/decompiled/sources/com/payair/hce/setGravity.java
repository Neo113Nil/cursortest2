package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setGravity implements com.payair.hce.setShadowLayer {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int RecordsJson;
    private static char[] valueOf;
    private static int values;
    private static boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 118 - (s * 4);
        int i5 = 1 - (b * 4);
        byte[] bArr = $$g;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            i4 = (-i4) + i8;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            int i9 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            i8 = i4;
            i4 = b2;
            i7 = i9;
            i4 = (-i4) + i8;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            int i92 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i922 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    @Override // com.payair.hce.setShadowLayer
    public abstract com.payair.hce.setEms getAid();

    public final byte[] getProfileVersion() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        new com.payair.hce.setMaxLines(byteArrayOutputStream).DigitizedCardProfile(this);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = RecordsJson + 113;
        values = i % 128;
        if (i % 2 == 0) {
            return byteArray;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] values(java.lang.String str) throws java.io.IOException {
        values = (RecordsJson + 79) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(null, null, 127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0083\u0082\u0081", objArr);
        if (str.equals(((java.lang.String) objArr[0]).intern())) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            new com.payair.hce.setAllCaps(byteArrayOutputStream).DigitizedCardProfile(this);
            return byteArrayOutputStream.toByteArray();
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(null, null, 127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0084\u0081", objArr2);
        if (!str.equals(((java.lang.String) objArr2[0]).intern())) {
            return getProfileVersion();
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        new com.payair.hce.setLogoDescription(byteArrayOutputStream2).DigitizedCardProfile(this);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        values = (RecordsJson + 27) % 128;
        return byteArray;
    }

    public int hashCode() {
        RecordsJson = (values + 77) % 128;
        int hashCode = getAid().hashCode();
        values = (RecordsJson + 9) % 128;
        return hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        int i = RecordsJson;
        values = (i + 61) % 128;
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.payair.hce.setShadowLayer) {
            return getAid().equals(((com.payair.hce.setShadowLayer) obj).getAid());
        }
        values = (i + 41) % 128;
        int i2 = i + 95;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static void c(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        int length;
        char[] cArr2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            $10 = ($11 + 45) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 13) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr4 = valueOf;
        long j = 0;
        int i2 = 1;
        if (cArr4 != null) {
            int i3 = $10 + 77;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[0] = java.lang.Integer.valueOf(cArr4[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 46, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.widget.ExpandableListView.getPackedPositionGroup(j) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    $10 = ($11 + 63) % 128;
                    j = 0;
                    i2 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46, 285 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (46336 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (writeReplace) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr4[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.combineMeasuredStates(0, 0), android.view.View.resolveSize(0, 0) + 1629, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, -1, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!DigitizedCardProfile) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr4[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        $10 = ($11 + 35) % 128;
        getumdgeneration.values = cArr3.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        $11 = ($10 + 11) % 128;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $11 = ($10 + 23) % 128;
            cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 1629, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((short) 0, -1, (byte) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        RecordsJson = 1;
        valueOf = new char[]{10800, 10803, 10766, 10760};
        AlternateContactlessPaymentDataJson = -143185284;
        DigitizedCardProfile = true;
        writeReplace = true;
    }

    static void init$0() {
        $$g = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 78, 75, -71};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
    }
}
