package com.payair.hce;

/* loaded from: classes4.dex */
public final class onReplenishFailed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int[] writeReplace;
    private com.payair.hce.readContactlessImk DigitizedCardProfile;
    private boolean valueOf;
    private com.payair.hce.provisionFromLocalStorage values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = 66 - (b * 4);
        byte[] bArr = $$a;
        int i4 = i * 2;
        int i5 = 4 - (s * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i3 = i4;
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public onReplenishFailed(com.payair.hce.provisionFromLocalStorage provisionfromlocalstorage, com.payair.hce.readContactlessImk readcontactlessimk, boolean z) {
        this.values = provisionfromlocalstorage;
        this.DigitizedCardProfile = readcontactlessimk;
        this.valueOf = z;
    }

    public final com.payair.hce.provisionFromLocalStorage DigitizedCardProfile() {
        int i = RecordsJson + 65;
        AlternateContactlessPaymentDataJson = i % 128;
        com.payair.hce.provisionFromLocalStorage provisionfromlocalstorage = this.values;
        if (i % 2 == 0) {
            return provisionfromlocalstorage;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.readContactlessImk writeReplace() {
        int i = RecordsJson;
        int i2 = i + 31;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.payair.hce.readContactlessImk readcontactlessimk = this.DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (i + 109) % 128;
        return readcontactlessimk;
    }

    public final boolean values() {
        int i = AlternateContactlessPaymentDataJson + 41;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.valueOf;
        AlternateContactlessPaymentDataJson = (i2 + 93) % 128;
        return z;
    }

    public final java.lang.String toString() {
        AlternateContactlessPaymentDataJson = (RecordsJson + 1) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1040586984, 1565957584, 908075940, -1866809908, -916294863, 1050250008, -1640839032, -682225155, -1844474266, 521278092}, android.graphics.Color.rgb(0, 0, 0) + 16777234, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        AlternateContactlessPaymentDataJson = (RecordsJson + 115) % 128;
        return intern;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        java.lang.String str;
        int length;
        int[] iArr2;
        int i2;
        java.lang.String str2 = "";
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = writeReplace;
        long j = 0;
        int i3 = 1;
        char c = 0;
        if (iArr3 != null) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(iArr3[i2]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(j) + 28, 29 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.os.Process.myTid() >> 22))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i2++;
                    j = 0;
                    c = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = writeReplace;
        if (iArr5 != null) {
            $10 = ($11 + 85) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[0] = java.lang.Integer.valueOf(iArr5[i5]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    str = str2;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, android.text.TextUtils.getCapsMode(str2, 0, 0) + 29, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    str = str2;
                }
                iArr6[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                str2 = str;
                i3 = 1;
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 71) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            $11 = ($10 + 111) % 128;
            for (int i6 = 0; i6 < 16; i6++) {
                istransitsupported.DigitizedCardProfile ^= iArr4[i6];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 31, android.view.View.MeasureSpec.getSize(0) + 5088, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i7 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i7;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i8 = istransitsupported.DigitizedCardProfile;
            int i9 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2923, (char) (android.graphics.Color.green(0) + 3037));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(0, (short) 0, (byte) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        RecordsJson = 1;
        writeReplace = new int[]{-1558828568, -1550667361, -529282657, -1771634067, -814715538, -1206071019, -2069126673, 1558345658, -505600788, 322959738, -882080500, -1362544721, 295225649, -1832233269, 1688779817, 909747796, 175132335, -508140046};
    }

    static void init$0() {
        $$a = new byte[]{7, -117, -88, 7};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
    }
}
