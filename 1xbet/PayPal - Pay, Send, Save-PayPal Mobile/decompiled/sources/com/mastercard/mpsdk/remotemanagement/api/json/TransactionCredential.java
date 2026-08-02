package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class TransactionCredential {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static long valueOf;
    private static char values;
    private static int writeReplace;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static int f29;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static char[] f30;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static long f31;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static int f32;

    @com.payair.hce.setSelectionFromTop(valueOf = com.visa.cbp.getTicketMetaData$6672$values.values.valueOf)
    private int atc;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessMdSessionKey")
    private byte[] contactlessMdSessionKey;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessUmdSessionKey")
    private byte[] contactlessUmdSessionKey;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessUmdSingleUseKey")
    private byte[] contactlessUmdSingleUseKey;

    @com.payair.hce.setSelectionFromTop(valueOf = "dsrpMdSessionKey")
    private byte[] dsrpMdSessionKey;

    @com.payair.hce.setSelectionFromTop(valueOf = "dsrpUmdSessionKey")
    private byte[] dsrpUmdSessionKey;

    @com.payair.hce.setSelectionFromTop(valueOf = "dsrpUmdSingleUseKey")
    private byte[] dsrpUmdSingleUseKey;

    @com.payair.hce.setSelectionFromTop(valueOf = "idn")
    private byte[] idn;

    private static void c(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2 = 119 - s2;
        int i3 = 3 - (i * 4);
        int i4 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i2);
            i3 = i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i6 = i3 + 1;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += -bArr[i6];
                i3 = i6;
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 121;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), cArr, i);
        int i3 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 17) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i3;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % i3]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1920 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.text.TextUtils.getTrimmedLength(""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(0, (short) 0, (short) 2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, 429 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31611));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(0, (short) 0, (short) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 69) % 128;
                i3 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if ((r1 / 3) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r0 + 15;
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential.RecordsJson = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getAtc() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 109;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 3;
            int i4 = f32;
            f29 = i4 + 19499;
        } else {
            int i5 = f32 + 1;
            f29 = i5 % 128;
        }
        return this.atc;
    }

    public void setAtc(int i) {
        int i2 = AlternateContactlessPaymentDataJson;
        RecordsJson = (i2 + 109) % 128;
        RecordsJson = (i2 + 35) % 128;
        int i3 = f29 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        f32 = i3 % 128;
        if (i3 % 2 != 0) {
            this.atc = i;
        } else {
            RecordsJson = (i2 + 61) % 128;
            this.atc = i;
            throw null;
        }
    }

    public byte[] getIdn() {
        int i = (RecordsJson + 11) % 128;
        AlternateContactlessPaymentDataJson = i;
        int i2 = i + 9;
        RecordsJson = i2 % 128;
        int i3 = i2 % 2;
        int i4 = f29 + 87;
        int i5 = i4 % 128;
        f32 = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.idn;
        int i6 = i5 + 119;
        f29 = i6 % 128;
        if (i6 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i7 = i + 57;
        RecordsJson = i7 % 128;
        if (i7 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public void setIdn(byte[] bArr) {
        int i = (RecordsJson + 71) % 128;
        AlternateContactlessPaymentDataJson = i;
        int i2 = f32 + 5;
        int i3 = i2 % 128;
        f29 = i3;
        if (i2 % 2 != 0) {
            RecordsJson = (i + 27) % 128;
        }
        this.idn = bArr;
        int i4 = i3 + 13;
        f32 = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i + 3;
        RecordsJson = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public byte[] getContactlessMdSessionKey() {
        int i = (RecordsJson + 59) % 128;
        AlternateContactlessPaymentDataJson = i;
        int i2 = (f29 + 19) % 128;
        f32 = i2;
        byte[] bArr = this.contactlessMdSessionKey;
        int i3 = (i + 55) % 128;
        RecordsJson = i3;
        int i4 = i2 + 43;
        f29 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        AlternateContactlessPaymentDataJson = (i3 + 81) % 128;
        return bArr;
    }

    public void setContactlessMdSessionKey(byte[] bArr) {
        int i = AlternateContactlessPaymentDataJson;
        RecordsJson = (i + 9) % 128;
        RecordsJson = (i + 61) % 128;
        int i2 = f29;
        int i3 = i2 + 13;
        f32 = i3 % 128;
        if (i3 % 2 == 0) {
            RecordsJson = (i + 99) % 128;
        }
        this.contactlessMdSessionKey = bArr;
        int i4 = i2 + 35;
        f32 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        RecordsJson = (i + 69) % 128;
        int i5 = i + 107;
        RecordsJson = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public byte[] getContactlessUmdSingleUseKey() {
        int i = RecordsJson;
        AlternateContactlessPaymentDataJson = (i + 27) % 128;
        AlternateContactlessPaymentDataJson = (i + 51) % 128;
        int i2 = (f32 + 55) % 128;
        f29 = i2;
        byte[] bArr = this.contactlessUmdSingleUseKey;
        int i3 = i2 + 21;
        f32 = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = (i + 39) % 128;
        AlternateContactlessPaymentDataJson = i4;
        int i5 = i4 + 37;
        RecordsJson = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public void setContactlessUmdSingleUseKey(byte[] bArr) {
        int i = (AlternateContactlessPaymentDataJson + 71) % 128;
        RecordsJson = i;
        int i2 = f29;
        f32 = (i2 + 7) % 128;
        this.contactlessUmdSingleUseKey = bArr;
        int i3 = (i + 77) % 128;
        AlternateContactlessPaymentDataJson = i3;
        int i4 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        f32 = i4 % 128;
        if (i4 % 2 == 0) {
            AlternateContactlessPaymentDataJson = (i + 59) % 128;
            throw null;
        }
        RecordsJson = (i3 + 21) % 128;
        RecordsJson = (i3 + 113) % 128;
    }

    public byte[] getDsrpMdSessionKey() {
        int i = f32 + 111;
        f29 = i % 128;
        if (i % 2 != 0) {
            int i2 = (RecordsJson + 37) % 128;
            AlternateContactlessPaymentDataJson = i2;
            int i3 = i2 + 39;
            int i4 = i3 % 128;
            RecordsJson = i4;
            char c = i3 % 2 == 0 ? (char) 23 : 'K';
            AlternateContactlessPaymentDataJson = (i4 + 89) % 128;
            if (c == 'K') {
                throw new java.lang.ArithmeticException();
            }
        } else {
            int i5 = RecordsJson;
            AlternateContactlessPaymentDataJson = (i5 + 109) % 128;
            AlternateContactlessPaymentDataJson = (i5 + 15) % 128;
        }
        return this.dsrpMdSessionKey;
    }

    public void setDsrpMdSessionKey(byte[] bArr) {
        int i = (AlternateContactlessPaymentDataJson + 21) % 128;
        RecordsJson = i;
        int i2 = f32 + 37;
        f29 = i2 % 128;
        if (i2 % 2 == 0) {
            this.dsrpMdSessionKey = bArr;
        } else {
            AlternateContactlessPaymentDataJson = (i + 57) % 128;
            this.dsrpMdSessionKey = bArr;
            throw null;
        }
    }

    public byte[] getDsrpUmdSingleUseKey() {
        int i = RecordsJson;
        AlternateContactlessPaymentDataJson = (i + 119) % 128;
        int i2 = f32 + 61;
        f29 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AlternateContactlessPaymentDataJson = (i + 41) % 128;
        return this.dsrpUmdSingleUseKey;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $11 = ($10 + 43) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            cArr2 = str.toCharArray();
            $10 = ($11 + 43) % 128;
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 85) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 71, android.view.View.MeasureSpec.getSize(0) + 1179, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(0, (short) 0, (short) 17, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30, android.text.TextUtils.getCapsMode("", 0, 0) + 3443, (char) (3830 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 27, 1864 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (41775 - android.graphics.Color.red(0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(0, (short) 0, (short) 14, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 28, 3133 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c(0, (short) 0, (short) 13, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (writeReplace ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((r1 * 5) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r3.dsrpUmdSingleUseKey = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential.RecordsJson = (r0 + 67) % 128;
        r3.dsrpUmdSingleUseKey = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDsrpUmdSingleUseKey(byte[] bArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 83;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = f32 >> 23;
            f29 = i3 + 17197;
        } else {
            int i4 = f32 + 27;
            f29 = i4 % 128;
        }
    }

    public byte[] getContactlessUmdSessionKey() {
        int i = AlternateContactlessPaymentDataJson;
        RecordsJson = (i + 9) % 128;
        int i2 = f29;
        int i3 = i2 + 3;
        f32 = i3 % 128;
        if (i3 % 2 == 0) {
            RecordsJson = (i + 101) % 128;
        }
        byte[] bArr = this.contactlessUmdSessionKey;
        int i4 = i2 + 87;
        f32 = i4 % 128;
        if (i4 % 2 != 0) {
            AlternateContactlessPaymentDataJson = (RecordsJson + 101) % 128;
            return bArr;
        }
        int i5 = i + 117;
        RecordsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setContactlessUmdSessionKey(byte[] bArr) {
        int i = (RecordsJson + 25) % 128;
        AlternateContactlessPaymentDataJson = i;
        int i2 = f29;
        int i3 = i2 + 19;
        f32 = i3 % 128;
        if (i3 % 2 == 0) {
            RecordsJson = (i + 43) % 128;
            RecordsJson = (i + 1) % 128;
        }
        this.contactlessUmdSessionKey = bArr;
        int i4 = RecordsJson + 47;
        int i5 = i4 % 128;
        AlternateContactlessPaymentDataJson = i5;
        if (i4 % 2 != 0) {
            int i6 = i2 % 11;
            f32 = i6 % 11356;
            if (i6 % 2 != 0) {
                return;
            }
        } else {
            int i7 = i2 + 3;
            f32 = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
        }
        RecordsJson = (i5 + 61) % 128;
        throw new java.lang.ArithmeticException();
    }

    public byte[] getDsrpUmdSessionKey() {
        int i = RecordsJson;
        int i2 = (i + 35) % 128;
        AlternateContactlessPaymentDataJson = i2;
        int i3 = f29;
        int i4 = i3 + 85;
        f32 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = i2 + 77;
            RecordsJson = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } else {
            AlternateContactlessPaymentDataJson = (i + 17) % 128;
        }
        byte[] bArr = this.dsrpUmdSessionKey;
        f32 = (i3 + 81) % 128;
        return bArr;
    }

    public void setDsrpUmdSessionKey(byte[] bArr) {
        int i = f29 + 37;
        int i2 = i % 128;
        f32 = i2;
        if (i % 2 != 0) {
            AlternateContactlessPaymentDataJson = (RecordsJson + 87) % 128;
        }
        this.dsrpUmdSessionKey = bArr;
        int i3 = i2 + 59;
        f29 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        int i4 = AlternateContactlessPaymentDataJson + 13;
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential valueOf(java.lang.String str) {
        int i = RecordsJson + 25;
        AlternateContactlessPaymentDataJson = i % 128;
        int i2 = i % 2;
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(str.getBytes()));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, new com.payair.hce.bindServiceAsUser(), new java.lang.String[]{m10866(3, (char) 33470, 0).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.payair.hce.bindServiceAsUser bindserviceasuser = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "語皝鸷㐨事\u2d9dᏙᐤ⟱᨞㧻䭳湦⎤䡚붸돀蟉㸒ᗐᐏ풞塵", "㇕ﺵ收嵳", 922662193 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.os.Process.myTid() >> 22), objArr);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener3 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, bindserviceasuser, new java.lang.String[]{((java.lang.String) objArr[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener2));
        com.payair.hce.bindServiceAsUser bindserviceasuser2 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "춆趻\udbebణ\ue5cb괇嬜\uf47b䞠쓳蒒긦爑\ueaf8ᗲضᎸ눍饙仠髟\ueaf3겥艱온ﶏ", "쪩깚뤳韯", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 61370), objArr2);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener4 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener3, bindserviceasuser2, new java.lang.String[]{((java.lang.String) objArr2[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener3));
        com.payair.hce.bindServiceAsUser bindserviceasuser3 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("㸿㹛ꮭ켨㲏燶궪㞂\uf511彤ꢆ鶻᧼䏽Ӥঙ藙\uef1d瀀땷", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr3);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener5 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener4, bindserviceasuser3, new java.lang.String[]{((java.lang.String) objArr3[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener4));
        com.payair.hce.bindServiceAsUser bindserviceasuser4 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "擭ﳼ侽ᶯ䪂䗦瀐塿\u1c89䚀㕙숲䙥늯䕖䣪\ued5d\u0c4e쏣", "憐\u038b픭⛦", android.text.TextUtils.getTrimmedLength("") + 755207161, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 59093), objArr4);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener6 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener5, bindserviceasuser4, new java.lang.String[]{((java.lang.String) objArr4[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener5));
        com.payair.hce.bindServiceAsUser bindserviceasuser5 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "㕡眡\ue446補䠩ꊤ켪䴤嫃\uf674Ꙑ㤇ᑽ嬭烒眙\ueee4", "뇀뤬\ue299簪", (-1715917647) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10978), objArr5);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener7 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener6, bindserviceasuser5, new java.lang.String[]{((java.lang.String) objArr5[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener6));
        com.payair.hce.bindServiceAsUser bindserviceasuser6 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "횠툔扣彼⎸굱\u1776\uda3f鸂藲뛗\uea22ᰉ༵䲿ﶌ씱⣤랺\udf14㿮龸瓜哶", "뢙咞\uf7a0佗", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) ((-1) - android.view.MotionEvent.axisFromString("")), objArr6);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener8 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener7, bindserviceasuser6, new java.lang.String[]{((java.lang.String) objArr6[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener7));
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential transactionCredential = (com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener8, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener8));
        int i3 = (AlternateContactlessPaymentDataJson + 41) % 128;
        RecordsJson = i3;
        int i4 = f29 + 125;
        f32 = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionCredential;
        }
        AlternateContactlessPaymentDataJson = (i3 + 49) % 128;
        throw null;
    }

    public java.lang.String toString() {
        com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "\uedf3\u0c71厁\uf883⭁纯봑뵇\u3098骄カ颣ʪ匪\uf59d揷肐㥰쀧扎娕\uf84b䀧悅勴漓", "\ue246趎坪\ue787", android.view.View.MeasureSpec.getMode(0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 34648), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(this.atc);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "\u1ad5⣾媧\uf650巆뜗", "봋펪㶶㯟", android.view.KeyEvent.normalizeMetaState(0), (char) (57148 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.idn);
        if (sb.toString() != null) {
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.idn).writeReplace();
            f32 = (f29 + 91) % 128;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("null");
            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "燧㜤ꃛꪓ莁\u0c52\u0dcb嘻썠강剢ഩぴᶥ蝙䣑暶⫰ᆽ\ufaef挫\uebe4ﷶ蹙\ue9c3\uf3f0", "뭄Ṓ阅ᣏ", maximumDrawingCacheSize >> 24, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 53142), objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            sb2.append(this.contactlessMdSessionKey);
            if (sb2.toString() != null) {
                int i = RecordsJson + 109;
                AlternateContactlessPaymentDataJson = i % 128;
                if (i % 2 != 0) {
                    com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.contactlessMdSessionKey).writeReplace();
                    throw null;
                }
                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.contactlessMdSessionKey).writeReplace();
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("null");
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("캊캦\uf550醆픋潷崼椼ᲄ䇺䄡茣\ue94eᵌ\ued7d\u171b畱놭馝꯴膹▹֦㿟ⷞ\ud9cd뇵厓맿䷋尝\ue471쑟", android.text.TextUtils.indexOf("", "", 0, 0), objArr4);
                sb3.append(((java.lang.String) objArr4[0]).intern());
                sb3.append(this.contactlessUmdSingleUseKey);
                if (sb3.toString() == null) {
                    int i2 = AlternateContactlessPaymentDataJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    RecordsJson = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("null");
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b("ኗኻ덽\ud7ab\uecc2먐脽⼕╊钁磃噟㕴孨풥쉠ꥶ\uf7baꁐ纠嶒掄㰻", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr5);
                        sb4.append(((java.lang.String) objArr5[0]).intern());
                        sb4.append(this.dsrpMdSessionKey);
                        if (sb4.toString() != null) {
                            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.dsrpMdSessionKey).writeReplace();
                        } else {
                            RecordsJson = (AlternateContactlessPaymentDataJson + 55) % 128;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("null");
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b("\uf6fb\uf6d7퓽뀫夅谬救䢕邍ꊽ촜恪턯㳞慸\uf441䴔逹ᖜ䢂맨И覊\udc9aᖺ\uf838", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr6);
                            sb5.append(((java.lang.String) objArr6[0]).intern());
                            sb5.append(this.dsrpUmdSingleUseKey);
                            if (sb5.toString() != null) {
                                f32 = (f29 + 69) % 128;
                                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.dsrpUmdSingleUseKey).writeReplace();
                            }
                        }
                    }
                }
                f32 = (f29 + 37) % 128;
                com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.contactlessUmdSingleUseKey).writeReplace();
            }
        }
        AlternateContactlessPaymentDataJson = (RecordsJson + 23) % 128;
        f32 = (f29 + 81) % 128;
        return "TransactionCredential";
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static java.lang.String m10866(int i, char c, int i2) {
        int i3 = RecordsJson;
        int i4 = (i3 + 101) % 128;
        AlternateContactlessPaymentDataJson = i4;
        int i5 = f32 + 23;
        f29 = i5 % 128;
        if (i5 % 2 != 0) {
            RecordsJson = (i4 + 17) % 128;
        } else {
            AlternateContactlessPaymentDataJson = (i3 + 5) % 128;
        }
        char[] cArr = new char[i];
        int i6 = 0;
        while (i6 < i) {
            int i7 = AlternateContactlessPaymentDataJson + 99;
            RecordsJson = i7 % 128;
            if (i7 % 2 == 0) {
                break;
            }
            cArr[i6] = (char) ((f30[i2 + i6] ^ (i6 * f31)) ^ c);
            i6++;
            f32 = (f29 + 63) % 128;
        }
        java.lang.String str = new java.lang.String(cArr);
        RecordsJson = (AlternateContactlessPaymentDataJson + 121) % 128;
        int i8 = f32 + 17;
        f29 = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static void valueOf() {
        DigitizedCardProfile = 1263759066225628708L;
        writeReplace = -1162555743;
        values = (char) 54820;
        valueOf = 9005681394752360501L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        RecordsJson = 1;
        valueOf();
        f29 = 0;
        f32 = 1;
        f30 = new char[]{33495, 61586, 26176};
        f31 = -336425862725995960L;
        AlternateContactlessPaymentDataJson = (RecordsJson + 105) % 128;
    }

    static void init$0() {
        $$a = new byte[]{59, 86, -115, -69};
        $$b = 90;
    }
}
