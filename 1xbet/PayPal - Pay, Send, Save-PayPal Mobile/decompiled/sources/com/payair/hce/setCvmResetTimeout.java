package com.payair.hce;

/* loaded from: classes10.dex */
final class setCvmResetTimeout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private java.lang.String AlternateContactlessPaymentDataJson = "";
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$a;
        int i4 = s * 2;
        int i5 = 73 - (i * 8);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            i5 = i6;
            int i8 = 0;
            i5 += i7;
            i2 = i8;
            i3++;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i5 += i7;
            i2 = i8;
            i3++;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    setCvmResetTimeout() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\t\u0001", 1 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (117 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr);
        this.DigitizedCardProfile = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\u0007\u0006\u000e\u0005\r\u0001", 7 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 69), objArr2);
        this.values = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\f\u0006\u000e\t\u0007\u0006\b\n\u0001\r\u0003\u0002\r\u0001\r\f\u0000\u000b\u0002\r\n\f\u0004\t\u0006\u000f\u0000\u0004\u0003\u000b\n\u0002", 32 - android.graphics.Color.green(0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 103), objArr3);
        this.valueOf = ((java.lang.String) objArr3[0]).intern();
        this.writeReplace = null;
    }

    public final com.payair.hce.setCvmResetTimeout writeReplace(java.lang.String str) {
        int i = RecordsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 19) % 128;
        this.AlternateContactlessPaymentDataJson = str;
        int i2 = i + 121;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setCvmResetTimeout setcvmresettimeout = (com.payair.hce.setCvmResetTimeout) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson + 37;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            setcvmresettimeout.values = str;
            return setcvmresettimeout;
        }
        setcvmresettimeout.values = str;
        throw null;
    }

    public final com.payair.hce.setCvmResetTimeout DigitizedCardProfile(java.lang.String str) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 75;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            this.DigitizedCardProfile = str;
            return this;
        }
        this.DigitizedCardProfile = str;
        throw null;
    }

    public final com.payair.hce.setCvmResetTimeout values(java.lang.String str) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        RecordsJson = (i + 89) % 128;
        this.writeReplace = str;
        int i2 = i + 107;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.setCvmResetTimeout AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = RecordsJson + 93;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            this.valueOf = str;
            return this;
        }
        this.valueOf = str;
        throw null;
    }

    public final java.lang.String DigitizedCardProfile() {
        if (this.writeReplace == null) {
            com.payair.hce.setCrmCountryCode setcrmcountrycode = new com.payair.hce.setCrmCountryCode();
            setcrmcountrycode.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson).AlternateContactlessPaymentDataJson(this.values);
            this.writeReplace = setcrmcountrycode.AlternateContactlessPaymentDataJson();
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 31) % 128;
        }
        try {
            byte[] DigitizedCardProfile = com.payair.hce.getPendingAction.writeReplace().DigitizedCardProfile(org.apache.commons.codec.binary.Hex.decodeHex(this.writeReplace.toCharArray()), org.apache.commons.codec.binary.Hex.decodeHex(values().toCharArray()));
            java.lang.String upperCase = new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(new byte[]{(byte) (DigitizedCardProfile[DigitizedCardProfile.length - 2] ^ 149), (byte) (DigitizedCardProfile[DigitizedCardProfile.length - 1] ^ 89)})).toUpperCase();
            int i = RecordsJson + 3;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                return upperCase;
            }
            throw null;
        } catch (com.payair.hce.setVersion | org.apache.commons.codec.DecoderException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private java.lang.String values() {
        com.payair.hce.setSessionCode setsessioncode = new com.payair.hce.setSessionCode();
        ((com.payair.hce.setSessionCode) com.payair.hce.setSessionCode.values(new java.lang.Object[]{setsessioncode, this.AlternateContactlessPaymentDataJson}, -1103722595, 1103722595, java.lang.System.identityHashCode(setsessioncode))).values(this.DigitizedCardProfile).valueOf(this.valueOf);
        java.lang.String DigitizedCardProfile = setsessioncode.DigitizedCardProfile();
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 43) % 128;
        return DigitizedCardProfile;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        if (r4.valueOf == r4.writeReplace) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0163, code lost:
    
        r10 = new java.lang.Object[]{r4, r4, java.lang.Integer.valueOf(r2), r4, r4, java.lang.Integer.valueOf(r2), r4, r4, java.lang.Integer.valueOf(r2), r4, r4, java.lang.Integer.valueOf(r2), r4};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b2, code lost:
    
        if (r7 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b4, code lost:
    
        r7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3596, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0229, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r10)).intValue() != r4.SdkCoreAlternateContactlessPaymentDataImpl) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022b, code lost:
    
        com.payair.hce.setCvmResetTimeout.$10 = (com.payair.hce.setCvmResetTimeout.$11 + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0233, code lost:
    
        r7 = new java.lang.Object[]{r4, r4, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r2), r4, r4, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r2), r4, java.lang.Integer.valueOf(r2), r4};
        r8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026d, code lost:
    
        if (r8 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x026f, code lost:
    
        r26 = 0;
        r8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 48, android.view.View.resolveSizeAndState(0, 0, 0) + 2665, (char) (18889 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
        r10 = new java.lang.Object[1];
        b((byte) -1, 0, 0, r10);
        r8 = r8.getMethod((java.lang.String) r10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02df, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r8).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ec, code lost:
    
        r8 = r4.AlternateContactlessPaymentDataJson;
        r10 = r4.SdkCoreAlternateContactlessPaymentDataImpl;
        r3[r4.values] = r5[r7];
        r3[r4.values + 1] = r5[(r8 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x034c, code lost:
    
        r4.values += 2;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02da, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0300, code lost:
    
        r26 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0309, code lost:
    
        if (r4.DigitizedCardProfile != r4.AlternateContactlessPaymentDataJson) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x030b, code lost:
    
        r4.RecordsJson = ((r4.RecordsJson + r2) - 1) % r2;
        r4.SdkCoreAlternateContactlessPaymentDataImpl = ((r4.SdkCoreAlternateContactlessPaymentDataImpl + r2) - 1) % r2;
        r7 = r4.DigitizedCardProfile;
        r8 = r4.RecordsJson;
        r10 = r4.AlternateContactlessPaymentDataJson;
        r14 = r4.SdkCoreAlternateContactlessPaymentDataImpl;
        r3[r4.values] = r5[(r7 * r2) + r8];
        r3[r4.values + 1] = r5[(r10 * r2) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0333, code lost:
    
        r7 = r4.DigitizedCardProfile;
        r8 = r4.SdkCoreAlternateContactlessPaymentDataImpl;
        r10 = r4.AlternateContactlessPaymentDataJson;
        r14 = r4.RecordsJson;
        r3[r4.values] = r5[(r7 * r2) + r8];
        r3[r4.values + 1] = r5[(r10 * r2) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        r3[r4.values] = (char) (r4.valueOf - r30);
        r3[r4.values + 1] = (char) (r4.writeReplace - r30);
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        if (r4.valueOf == r4.writeReplace) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = $11 + 65;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = IccPrivateKeyCrtComponentsJson;
        long j = 0;
        int i4 = 48;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + i4, 2508 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6803));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) -1, 1, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 48;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.Gravity.getAbsoluteGravity(0, 0) + 2508, (char) (6801 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((byte) -1, 1, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 99) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values >> 1];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        int i7 = 0;
        while (i7 < i) {
            cArr3[i7] = (char) (cArr3[i7] ^ 13722);
            i7++;
            $10 = ($11 + 73) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        IccPrivateKeyCrtComponentsJson = new char[]{12412, 12413, 12300, 12297, 12303, 12410, 12408, 12302, 12296, 12409, 12415, 12414, 12402, 12411, 12403, 12299};
        getAid = (char) 1492;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
    }

    public final com.payair.hce.setCvmResetTimeout valueOf(java.lang.String str) {
        return (com.payair.hce.setCvmResetTimeout) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1737404, 1737404, java.lang.System.identityHashCode(this));
    }
}
