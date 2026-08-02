package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSessionCode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int[] valueOf;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String values;
    private java.lang.String writeReplace = "";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 66 - (b * 3);
        byte[] bArr = $$a;
        int i6 = 1 - (i * 3);
        int i7 = i2 + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            int i9 = i7;
            i4 = 0;
            int i10 = i7 + (-i8);
            i3 = i4;
            int i11 = i9;
            i5 = i10;
            i7 = i11;
            int i12 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i12];
            int i13 = i5;
            i9 = i12;
            i7 = i13;
            int i102 = i7 + (-i8);
            i3 = i4;
            int i112 = i9;
            i5 = i102;
            i7 = i112;
            int i122 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            int i1222 = i7 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setSessionCode setsessioncode = (com.payair.hce.setSessionCode) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i4 = RecordsJson;
        AlternateContactlessPaymentDataJson = (i4 + 3) % 128;
        setsessioncode.writeReplace = str;
        AlternateContactlessPaymentDataJson = (i4 + 65) % 128;
        return setsessioncode;
    }

    public setSessionCode() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1624647719, 548185529}, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, objArr);
        this.DigitizedCardProfile = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{791740080, -360137231, 890681145, -145068558, 529239160, -98885672, 329019055, -1862157985, -129403370, -1564567182, 1070877695, -511387678, 617690578, -2118656619, -1840638622, -1400330708}, 32 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
        this.values = ((java.lang.String) objArr2[0]).intern();
    }

    public final com.payair.hce.setSessionCode values(java.lang.String str) {
        int i = RecordsJson + 117;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile = str;
            return this;
        }
        this.DigitizedCardProfile = str;
        throw new java.lang.ArithmeticException();
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        int length;
        int[] iArr2;
        int i3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr3 = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 29;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                $10 = ($11 + 95) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i5] = java.lang.Integer.valueOf(iArr3[i3]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(i5, i5, i5) + 29, (char) (android.text.TextUtils.lastIndexOf("", c) + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr2[i3] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i3++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i5 = 0;
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
        int[] iArr5 = valueOf;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[i4];
                    objArr3[0] = java.lang.Integer.valueOf(iArr5[i7]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        cArr2 = cArr4;
                        i2 = length3;
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 28, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    } else {
                        cArr2 = cArr4;
                        i2 = length3;
                    }
                    iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                } else {
                    cArr2 = cArr4;
                    i2 = length3;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr5[i7])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    }
                    iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    i7++;
                }
                cArr4 = cArr2;
                length3 = i2;
                i4 = 1;
            }
            cArr = cArr4;
            iArr5 = iArr6;
        } else {
            cArr = cArr4;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr3[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr3[1] = (char) iArr[istransitsupported.valueOf];
            cArr3[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr3[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr3[0] << 16) + cArr3[1];
            istransitsupported.values = (cArr3[2] << 16) + cArr3[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr4[i9];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, 5089 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i9++;
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr3[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr3[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr3[2] = (char) (istransitsupported.values >>> 16);
            cArr3[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr[istransitsupported.valueOf * 2] = cArr3[0];
            cArr[(istransitsupported.valueOf * 2) + 1] = cArr3[1];
            cArr[(istransitsupported.valueOf * 2) + 2] = cArr3[2];
            cArr[(istransitsupported.valueOf * 2) + 3] = cArr3[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2923, (char) (android.view.View.combineMeasuredStates(0, 0) + 3037));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, -1, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    public final com.payair.hce.setSessionCode valueOf(java.lang.String str) {
        int i = (RecordsJson + 97) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.values = str;
        RecordsJson = (i + 41) % 128;
        return this;
    }

    public final java.lang.String DigitizedCardProfile() {
        com.payair.hce.setPendingAction writeReplace = com.payair.hce.getPendingAction.writeReplace();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1876411783, 234295696, -1876411783, 234295696, -1876411783, 234295696, -1876411783, 234295696}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.writeReplace);
        sb.append(this.DigitizedCardProfile);
        java.lang.String substring = sb.toString().substring(r1.length() - 16);
        try {
            try {
                byte[] decodeHex = org.apache.commons.codec.binary.Hex.decodeHex(this.values.toCharArray());
                byte[] decodeHex2 = org.apache.commons.codec.binary.Hex.decodeHex(substring.toCharArray());
                int i = RecordsJson;
                AlternateContactlessPaymentDataJson = (i + 95) % 128;
                int i2 = i + 115;
                AlternateContactlessPaymentDataJson = i2 % 128;
                try {
                    byte[] DigitizedCardProfile = i2 % 2 != 0 ? writeReplace.DigitizedCardProfile(decodeHex2, decodeHex, false) : writeReplace.DigitizedCardProfile(decodeHex2, decodeHex, true);
                    int i3 = AlternateContactlessPaymentDataJson;
                    RecordsJson = (i3 + 79) % 128;
                    RecordsJson = (i3 + 31) % 128;
                    int length = decodeHex2.length;
                    byte[] bArr = new byte[length];
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = RecordsJson + 87;
                        AlternateContactlessPaymentDataJson = i5 % 128;
                        if (i5 % 2 != 0) {
                            bArr[i4] = (byte) (~decodeHex2[i4]);
                            i4 += 115;
                        } else {
                            bArr[i4] = (byte) (~decodeHex2[i4]);
                            i4++;
                        }
                    }
                    try {
                        byte[] DigitizedCardProfile2 = writeReplace.DigitizedCardProfile(bArr, decodeHex, true);
                        valueOf(DigitizedCardProfile);
                        valueOf(DigitizedCardProfile2);
                        return new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(DigitizedCardProfile)).concat(new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(DigitizedCardProfile2))).toUpperCase();
                    } catch (com.payair.hce.setVersion e) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
                    }
                } catch (com.payair.hce.setVersion e2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e2.getMessage()));
                }
            } catch (org.apache.commons.codec.DecoderException e3) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e3.getMessage()));
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void valueOf(byte[] bArr) {
        int i;
        int i2;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            int i4 = RecordsJson + 115;
            AlternateContactlessPaymentDataJson = i4 % 128;
            if (i4 % 2 != 0) {
                i2 = 0;
                i = 1;
            } else {
                i = 0;
                i2 = 0;
            }
            while (i < 8) {
                int i5 = RecordsJson + 7;
                AlternateContactlessPaymentDataJson = i5 % 128;
                if (i5 % 2 != 0) {
                    if (((1 - i) & bArr[i3]) == 0) {
                        i++;
                    }
                    i2++;
                    i++;
                } else {
                    if (((1 << i) & bArr[i3]) == 0) {
                        i++;
                    }
                    i2++;
                    i++;
                }
            }
            if (i2 % 2 == 0) {
                bArr[i3] = (byte) (bArr[i3] ^ 1);
            }
        }
    }

    static void valueOf() {
        valueOf = new int[]{30959978, -63480515, 1090671446, 1609732729, 103360762, 215175527, 1654220495, -1930176341, -677728745, 1268574269, -2028525107, 2109022535, 1860120031, 1578322114, -1758980099, -297851182, 290231147, -1880708030};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        RecordsJson = 1;
        valueOf();
        android.view.ViewConfiguration.getTapTimeout();
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        AlternateContactlessPaymentDataJson = (RecordsJson + 99) % 128;
    }

    static void init$0() {
        $$a = new byte[]{64, 104, -78, -117};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
    }

    public final com.payair.hce.setSessionCode AlternateContactlessPaymentDataJson(java.lang.String str) {
        return (com.payair.hce.setSessionCode) values(new java.lang.Object[]{this, str}, -1103722595, 1103722595, java.lang.System.identityHashCode(this));
    }
}
