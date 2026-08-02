package com.payair.hce;

/* loaded from: classes4.dex */
public class setScroller extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static final int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int[] valueOf;
    private static int values;
    private static final byte[] writeReplace = null;
    private final byte[] AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 118 - (b * 19);
        int i3 = (b2 * 33) + 4;
        int i4 = s * 27;
        byte[] bArr2 = new byte[34 - i4];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i2 += i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == 33 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i3;
            i3 = bArr[i3];
            i2 += i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == 33 - i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == 33 - i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 66 - (s * 3);
        int i4 = s2 * 2;
        byte[] bArr = $$d;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            int i8 = 0;
            int i9 = (-i5) + i7;
            i2 = i8;
            int i10 = i6;
            i3 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i3;
            i6 = i11;
            i5 = bArr[i11];
            i7 = i12;
            int i92 = (-i5) + i7;
            i2 = i8;
            int i102 = i6;
            i3 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = valueOf;
        int i2 = 1;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[0] = java.lang.Integer.valueOf(iArr3[i3]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.os.Process.getGidForName(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i3] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i3++;
                    i2 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = valueOf;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i4])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 29 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.Color.red(0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i4++;
                int i5 = $11 + 1;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 2;
                }
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        $11 = ($10 + 7) % 128;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 29) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            for (int i7 = 0; i7 < 16; i7++) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i7];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, android.widget.ExpandableListView.getPackedPositionChild(0L) + 5089, (char) android.graphics.Color.blue(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i8 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i8;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i9 = istransitsupported.DigitizedCardProfile;
            int i10 = istransitsupported.values;
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
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.resolveSizeAndState(0, 0, 0), 2923 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((-16774179) - android.graphics.Color.rgb(0, 0, 0)));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                i(-1, (short) 0, (short) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    setScroller(byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = bArr;
    }

    private java.lang.String valueOf() {
        int i = values + 111;
        DigitizedCardProfile = i % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (i % 2 != 0) {
            return com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(bArr);
        }
        com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(bArr);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = values;
        DigitizedCardProfile = (i + 65) % 128;
        int i2 = i + 85;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setScroller setscroller = (com.payair.hce.setScroller) objArr[0];
        DigitizedCardProfile = (values + 109) % 128;
        int length = setscroller.AlternateContactlessPaymentDataJson.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int length2 = setscroller.AlternateContactlessPaymentDataJson.length;
        int i = values + 85;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return java.lang.Integer.valueOf(intValue + 1 + length2);
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i = values + 57;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            setmaxlines.AlternateContactlessPaymentDataJson(55, this.AlternateContactlessPaymentDataJson);
        } else {
            setmaxlines.AlternateContactlessPaymentDataJson(19, this.AlternateContactlessPaymentDataJson);
        }
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = values + 59;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson);
            throw null;
        }
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson);
        int i2 = DigitizedCardProfile + 107;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        int i = values + 43;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!(setems instanceof com.payair.hce.setScroller)) {
            return false;
        }
        boolean AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson, ((com.payair.hce.setScroller) setems).AlternateContactlessPaymentDataJson);
        values = (DigitizedCardProfile + 39) % 128;
        return AlternateContactlessPaymentDataJson;
    }

    public java.lang.String toString() {
        int i = values + 53;
        DigitizedCardProfile = i % 128;
        java.lang.String valueOf2 = valueOf();
        if (i % 2 != 0) {
            return valueOf2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0489 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void DigitizedCardProfile(long j, long j2) {
        java.lang.Class<?>[] clsArr;
        java.lang.Object obj;
        java.lang.Object cls;
        java.lang.Object obj2;
        com.payair.hce.setOnMenuItemClickListener setonmenuitemclicklistener = new com.payair.hce.setOnMenuItemClickListener(j, j2);
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        byte[] bArr = writeReplace;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) (i | 145), bArr[112], bArr[45], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        short s = bArr[42];
        byte b = (byte) s;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(s, b, (short) (b | 246), objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = 289;
            short s2 = (short) (i | 144);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[289], (byte) 62, s2, objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(bArr[5], bArr[0], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[289], (byte) 62, s2, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (true) {
                clsArr = null;
                if (i2 >= objArr7.length) {
                    break;
                }
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = writeReplace;
                short s3 = (short) (-bArr2[317]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(s3, (byte) (s3 | 46), com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, objArr9);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(bArr2[13], (byte) 74, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(bArr2[c], (byte) 62, (short) (SdkCoreAlternateContactlessPaymentDataImpl | 144), objArr11);
                java.lang.Object invoke = cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                short s4 = (short) (-bArr2[317]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(s4, (byte) (s4 | 46), com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, objArr12);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(bArr2[15], kotlin.io.encoding.Base64.padSymbol, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, objArr13);
                iArr[i2] = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c = 289;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (setonmenuitemclicklistener.values(iArr[i3])) {
                    case -32:
                        i3 = 1;
                    case -31:
                        i3 = 75;
                        clsArr = null;
                    case -30:
                        setonmenuitemclicklistener.values(28);
                        if (setonmenuitemclicklistener.DigitizedCardProfile == 0) {
                            i3 = 74;
                            clsArr = null;
                        }
                        i3 = i4;
                        clsArr = null;
                    case -29:
                        i3 = 20;
                    case -28:
                        i3 = 65;
                        clsArr = null;
                    case -27:
                        setonmenuitemclicklistener.values(28);
                        if (setonmenuitemclicklistener.DigitizedCardProfile == 0) {
                            i3 = 64;
                            clsArr = null;
                        }
                        i3 = i4;
                        clsArr = null;
                    case -26:
                        setonmenuitemclicklistener.values = 1;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(8);
                        DigitizedCardProfile = setonmenuitemclicklistener.DigitizedCardProfile;
                        i3 = i4;
                        clsArr = null;
                    case -25:
                        setonmenuitemclicklistener.values = values;
                        setonmenuitemclicklistener.values(24);
                        i3 = i4;
                        clsArr = null;
                    case -24:
                        i3 = 55;
                        clsArr = null;
                    case -23:
                        i3 = 66;
                        clsArr = null;
                    case -22:
                        return;
                    case -21:
                        byte b2 = $$a[34];
                        byte b3 = (byte) (b2 - 1);
                        byte b4 = b2;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        h(b3, b4, b4, objArr14);
                        obj = objArr14[0];
                        cls = (java.lang.String) obj;
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -20:
                        setonmenuitemclicklistener.values = 1;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(7);
                        cls = java.lang.Class.forName((java.lang.String) setonmenuitemclicklistener.getAid);
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            byte b5 = $$a[34];
                            byte b6 = (byte) (b5 - 1);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            h(b5, b6, b6, objArr15);
                            obj = objArr15[0];
                            cls = (java.lang.String) obj;
                            setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                            setonmenuitemclicklistener.values(1);
                            i3 = i4;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i4 >= 20) {
                            }
                            throw th;
                        }
                        clsArr = null;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        setonmenuitemclicklistener.values = 3;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(7);
                        java.lang.Object obj3 = setonmenuitemclicklistener.getAid;
                        setonmenuitemclicklistener.values(7);
                        java.lang.Object obj4 = setonmenuitemclicklistener.getAid;
                        setonmenuitemclicklistener.values(7);
                        try {
                            java.lang.Object[] objArr16 = {obj4, setonmenuitemclicklistener.getAid};
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a((short) 23, (byte) 62, 372, objArr17);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            byte[] bArr3 = writeReplace;
                            short s5 = bArr3[8];
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(s5, (byte) (s5 | 56), 395, objArr18);
                            java.lang.String str4 = (java.lang.String) objArr18[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[2];
                            try {
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a(bArr3[289], (byte) 62, 357, objArr19);
                                clsArr2[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                a((short) (-bArr3[376]), (byte) (bArr3[357] - 1), 400, objArr20);
                                clsArr2[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                cls = cls5.getMethod(str4, clsArr2).invoke(obj3, objArr16);
                                setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                                setonmenuitemclicklistener.values(1);
                                i3 = i4;
                                clsArr = null;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                        }
                    case -17:
                        setonmenuitemclicklistener.values = 3;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(7);
                        java.lang.Class cls6 = (java.lang.Class) setonmenuitemclicklistener.getAid;
                        setonmenuitemclicklistener.values(7);
                        java.lang.String str5 = (java.lang.String) setonmenuitemclicklistener.getAid;
                        setonmenuitemclicklistener.values(7);
                        cls = cls6.getMethod(str5, (java.lang.Class[]) setonmenuitemclicklistener.getAid);
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -16:
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(writeReplace[289], (byte) 62, (short) (SdkCoreAlternateContactlessPaymentDataImpl | 144), objArr21);
                        cls = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -15:
                        setonmenuitemclicklistener.values = 1;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(8);
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = new java.lang.Class[setonmenuitemclicklistener.DigitizedCardProfile];
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -14:
                        cls = "writeReplace";
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -13:
                        cls = com.payair.hce.setLongClickable.class;
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -12:
                        setonmenuitemclicklistener.values = 1;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(8);
                        int i5 = setonmenuitemclicklistener.DigitizedCardProfile;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(writeReplace[289], (byte) 62, 357, objArr22);
                        cls = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i5);
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -11:
                        setonmenuitemclicklistener.values(12);
                        throw ((java.lang.Throwable) setonmenuitemclicklistener.getAid);
                    case -10:
                        i3 = 18;
                    case -9:
                        i3 = 15;
                    case -8:
                        try {
                            setonmenuitemclicklistener.values(10);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (i4 >= 20) {
                            }
                            throw th;
                        }
                        if (setonmenuitemclicklistener.DigitizedCardProfile == 0) {
                            i3 = 14;
                        } else {
                            i3 = i4;
                            clsArr = null;
                        }
                        break;
                    case -7:
                        try {
                            setonmenuitemclicklistener.values = 1;
                            setonmenuitemclicklistener.values(6);
                            setonmenuitemclicklistener.values(7);
                            obj2 = setonmenuitemclicklistener.getAid;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if ((i4 >= 20 || i4 > 39) && (i4 < 39 || i4 > 48)) {
                                throw th;
                            }
                            setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = th;
                            setonmenuitemclicklistener.values(31);
                            i3 = 9;
                            clsArr = null;
                        }
                        try {
                            short s6 = (short) (-writeReplace[376]);
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(s6, (byte) (s6 | 44), com.visa.cbp.getCertUsage.getAppPrgrmIDAID, objArr23);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            try {
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(r5[15], (byte) 59, 350, objArr24);
                                cls = cls7.getMethod((java.lang.String) objArr24[0], clsArr).invoke(obj2, clsArr);
                                setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                                setonmenuitemclicklistener.values(1);
                                i3 = i4;
                                clsArr = null;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                java.lang.Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    throw th;
                                }
                                throw cause2;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                    case -6:
                        i3 = 51;
                    case -5:
                        setonmenuitemclicklistener.values = 1;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(7);
                        java.lang.Object obj5 = setonmenuitemclicklistener.getAid;
                        try {
                            byte[] bArr4 = writeReplace;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(bArr4[289], (byte) 62, (short) (SdkCoreAlternateContactlessPaymentDataImpl | 144), objArr25);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            short s7 = bArr4[8];
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(s7, (byte) (s7 | 56), 327, objArr26);
                            cls = cls8.getMethod((java.lang.String) objArr26[0], clsArr).invoke(obj5, clsArr);
                            setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                            setonmenuitemclicklistener.values(1);
                            i3 = i4;
                            clsArr = null;
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause3 = th9.getCause();
                            if (cause3 == null) {
                                throw th9;
                            }
                            throw cause3;
                        }
                    case -4:
                        setonmenuitemclicklistener.values = 2;
                        setonmenuitemclicklistener.values(6);
                        setonmenuitemclicklistener.values(7);
                        int[] iArr2 = (int[]) setonmenuitemclicklistener.getAid;
                        setonmenuitemclicklistener.values(8);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(iArr2, setonmenuitemclicklistener.DigitizedCardProfile, objArr27);
                        cls = (java.lang.String) objArr27[0];
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -3:
                        try {
                            byte[] bArr5 = writeReplace;
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a((short) 17, bArr5[305], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, objArr28);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                            try {
                                short s8 = (short) (-bArr5[317]);
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                a(s8, (byte) (s8 | 43), 311, objArr29);
                                try {
                                    setonmenuitemclicklistener.writeReplace = ((java.lang.Long) cls9.getMethod((java.lang.String) objArr29[0], clsArr).invoke(clsArr, clsArr)).longValue();
                                    setonmenuitemclicklistener.values(3);
                                    i3 = i4;
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    if (i4 >= 20) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                java.lang.Throwable cause4 = th.getCause();
                                if (cause4 == null) {
                                    throw th;
                                }
                                throw cause4;
                            }
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                        }
                        break;
                    case -2:
                        cls = new int[]{1646013488, 1968636443};
                        setonmenuitemclicklistener.IccPrivateKeyCrtComponentsJson = cls;
                        setonmenuitemclicklistener.values(1);
                        i3 = i4;
                        clsArr = null;
                    case -1:
                        i3 = 48;
                    default:
                        i3 = i4;
                        clsArr = null;
                }
            }
            throw th;
        } catch (java.lang.Throwable th13) {
            java.lang.Throwable cause5 = th13.getCause();
            if (cause5 == null) {
                throw th13;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + 44;
        int i4 = i + 4;
        byte[] bArr = writeReplace;
        byte[] bArr2 = new byte[s + 1];
        if (bArr == null) {
            int i5 = s;
            int i6 = i4;
            i2 = 0;
            int i7 = (i4 + (-i5)) - 1;
            i4 = i6;
            i3 = i7;
            int i8 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == s) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i5 = bArr[i8];
            i4 = i3;
            i6 = i8;
            int i72 = (i4 + (-i5)) - 1;
            i4 = i6;
            i3 = i72;
            int i82 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == s) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == s) {
            }
        }
    }

    static void values() {
        writeReplace = new byte[]{71, -67, -2, -10, -5, 4, -2, -6, 5, -7, 5, -2, -7, 6, -9, 7, -10, 8, -2, -8, 7, -2, -9, 8, -2, -10, 9, -14, com.google.common.base.Ascii.FF, -2, -11, 10, -14, com.google.common.base.Ascii.FF, -2, -12, com.google.common.base.Ascii.VT, -2, -13, com.google.common.base.Ascii.FF, -2, -5, 0, 3, -6, -1, 4, -6, -3, 6, -2, -5, -1, 4, -6, -3, 6, -2, -5, -1, 4, -6, -4, 7, -2, -5, -2, 5, -6, -5, 8, -6, -6, 9, -6, -7, 10, -2, -5, -3, 6, -2, -5, -4, 7, -6, -4, 7, -2, -5, -5, 8, -14, com.google.common.base.Ascii.FF, -6, -8, com.google.common.base.Ascii.VT, -2, -5, -6, 9, -6, -9, com.google.common.base.Ascii.FF, -2, -5, -7, 10, -6, -1, 4, -7, 1, 3, -6, -1, 4, -2, -5, -8, com.google.common.base.Ascii.VT, -6, -3, 6, -2, -5, -9, com.google.common.base.Ascii.FF, -2, -6, 1, 3, -2, -6, 0, 4, -7, 1, 3, -2, -5, -7, 10, -7, 0, 4, -2, -5, -8, com.google.common.base.Ascii.VT, -6, -3, 6, -2, -6, -1, 5, -7, -1, 5, -6, -3, 6, -2, -6, -2, 6, -7, 5, -7, -2, 6, -6, -3, 6, -2, -6, -3, 7, -2, -6, -4, 8, -7, -4, 8, -7, -5, 9, -7, -6, 10, -2, -6, -5, 9, -7, 5, -7, -6, 10, -2, -6, -6, 10, -2, -6, -7, com.google.common.base.Ascii.VT, -2, -6, -8, com.google.common.base.Ascii.FF, -2, -6, -8, com.google.common.base.Ascii.FF, -2, -6, -4, 8, -7, -8, com.google.common.base.Ascii.FF, -10, 8, -8, 2, 3, -2, -6, -5, 9, -7, -2, 6, -2, -7, 2, 3, -2, -7, 1, 4, -2, -7, 0, 5, -2, -7, 0, 8, -22, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, 10, -14, 6, 56, -38, -34, 1, 8, -6, 6, 2, 3, 2, -12, 8, -22, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, 10, -14, 6, 56, -28, -38, -7, 14, -3, 1, -14, com.google.common.base.Ascii.DC4, -12, -10, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, -24, -6, -7, com.google.common.base.Ascii.GS, -12, -12, -10, com.google.common.base.Ascii.SI, -14, 9, -15, 2, 5, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -66, -5, 68, -35, -35, 2, com.google.common.base.Ascii.VT, -3, -15, -1, 1, com.visa.cbp.getEncExpo.onUnminimized, 46, -40, 10, com.visa.cbp.getEncExpo.onUnminimized, -4, 13, 0, 32, -46, -6, 32, -22, -5, 7, -6, -7, 14, -14, 3, 8, -22, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, 10, -14, 6, 56, -39, -21, -11, 2, -9, com.google.common.base.Ascii.NAK, -2, -11, 6, 1, com.visa.cbp.getEncExpo.onUnminimized, 48, -31, -21, 1, 13, 8, -22, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 8, -22, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, 10, -14, 6, 56, -69, com.google.common.base.Ascii.FF, -2, -7, 6, 1, -18, 69, -32, -25, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.VT, -8, 10, -6, -9, 6, 3, 5, 14, -31, 8, -22, com.google.common.base.Ascii.DC4, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 56};
        SdkCoreAlternateContactlessPaymentDataImpl = 102;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values();
        values = 0;
        DigitizedCardProfile = 1;
        valueOf = new int[]{-631819435, 1472197381, -1051367779, -151056394, -471279894, 753014845, 2000725752, 1166294675, -202976726, -1414296576, 1334759366, -619053506, -1740249687, -208632369, 347450442, 692246921, 315850931, 926651641};
    }

    static void init$1() {
        $$d = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{124, -43, -124, -86, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
        $$b = 43;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, 1569470345, -1569470345, java.lang.System.identityHashCode(this))).intValue();
    }
}
