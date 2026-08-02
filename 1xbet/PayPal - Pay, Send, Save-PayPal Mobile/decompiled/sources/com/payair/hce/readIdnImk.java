package com.payair.hce;

/* loaded from: classes4.dex */
public class readIdnImk extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static long getProfileVersion;
    private static char[] valueOf;
    private static boolean values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 2) + 1;
        int i5 = 37 - (s * 34);
        int i6 = 718 - i;
        byte[] bArr = $$a;
        char[] cArr = new char[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 = (i7 + i6) - 2;
            i2 = i3;
            int i8 = i5;
            int i9 = i6;
            int i10 = i8 + 1;
            i3 = i2 + 1;
            cArr[i2] = (char) i9;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i5 = i10;
            i6 = bArr[i10];
            i7 = i9;
            i6 = (i7 + i6) - 2;
            i2 = i3;
            int i82 = i5;
            int i92 = i6;
            int i102 = i82 + 1;
            i3 = i2 + 1;
            cArr[i2] = (char) i92;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5;
            int i922 = i6;
            int i1022 = i822 + 1;
            i3 = i2 + 1;
            cArr[i2] = (char) i922;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 2;
        int i4 = 119 - i;
        int i5 = 4 - (s2 * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            int i7 = i5;
            int i8 = i7 + 1;
            i4 = i5 + i6;
            i5 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            int i9 = i4;
            i7 = i5;
            i5 = i9;
            int i82 = i7 + 1;
            i4 = i5 + i6;
            i5 = i82;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    /* synthetic */ readIdnImk(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 115;
        getAid = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(117 / (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 22), null, null, "\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, "\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 23) % 128;
        return values2;
    }

    private readIdnImk() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(3);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(writeReplace);
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11;
        int i3 = i2 + 13;
        $10 = i3 % 128;
        char[] cArr = str;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i2 + 29;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getProfileVersion ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        $10 = ($11 + 77) % 128;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i5 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1921, (char) (android.os.Process.getGidForName("") + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, (short) 0, 2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 429 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.View.MeasureSpec.getMode(0) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, (short) 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str2 = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
        int i6 = $10 + 87;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> AlternateContactlessPaymentDataJson() {
        com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> setmobilepin = new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.readIdnImk.3
            private static int valueOf = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
                return writeReplace(objArr);
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.readIdnImk readidnimk = new com.payair.hce.readIdnImk((byte) 0);
                int i = valueOf;
                int i2 = i & 103;
                int i3 = ((i ^ 103) | i2) << 1;
                int i4 = -((i | 103) & (~i2));
                int i5 = (i3 & i4) + (i4 | i3);
                writeReplace = i5 % 128;
                if (i5 % 2 == 0) {
                    return readidnimk;
                }
                throw null;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) writeReplace(new java.lang.Object[]{this}, -982507481, 982507481, java.lang.System.identityHashCode(this));
            }
        };
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 29) % 128;
        return setmobilepin;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 105) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10;
        int i3 = i2 + 119;
        $11 = i3 % 128;
        byte[] bArr = str3;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str3 != null) {
            $11 = (i2 + 79) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = valueOf;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 46, 286 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (46337 - android.view.KeyEvent.getDeadChar(0, 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 46, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.text.TextUtils.getOffsetAfter("", 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (values) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 43, android.view.View.resolveSize(0, 0) + 1629, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, (short) 0, 1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!AlternateContactlessPaymentDataJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 43, 1629 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.text.TextUtils.indexOf("", "", 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((short) 0, (short) 0, 1, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i5 = $10 + 47;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str4;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        valueOf = new char[]{10940, 10932, 11114, 11106, 11105, 11113, 11115, 11116, 11110, 11117, 11111, 10915, 11109, 11128, 10902, 11129, 11104, 10900, 11107, 11112, 11132, 10903, 10916, 11131, 10912, 10918, 11130, 11118, 11135, 10939, 10914, 11133, 10898, 10910, 10917, 10896, 10926, 11119, 10905};
        DigitizedCardProfile = -143185163;
        AlternateContactlessPaymentDataJson = true;
        values = true;
        getProfileVersion = -3140217421727061682L;
    }

    static void init$1() {
        $$d = new byte[]{97, -8, 44, 77};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:479:0x24ea, code lost:
    
        if (r8 == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0951, code lost:
    
        com.payair.hce.readIdnImk.SdkCoreAlternateContactlessPaymentDataImpl = (com.payair.hce.readIdnImk.getAid + 7) % 128;
        r4 = new java.lang.Object[]{new int[]{r63}, new int[]{r63 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, null, new int[1]};
        r2 = ~(553469410 | r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0978, code lost:
    
        r7 = new java.lang.Object[]{1916120371, 16, java.lang.Integer.valueOf(((((151136269 | r2) * (-712)) + 1076496743) + (((~(r63 | 704605679)) | (~((-151136270) | r9))) * (-712))) + (((-155856110) | r2) * 712))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x09c0, code lost:
    
        if (r1 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x09c2, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
        r8 = new java.lang.Object[1];
        b(653, (byte) (-com.payair.hce.readIdnImk.$$a[16]), r2[14], r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0a25, code lost:
    
        ((int[]) r4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0a2d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x094f, code lost:
    
        if (r4.equals(((java.lang.String) r8[0]).intern()) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x05ac, code lost:
    
        if (((((int) (r10 >> 32)) & ((((((~(826567132 | r63)) | 2031173752) * (-948)) + 943001434) + ((~(2035640828 | r9)) * (-948))) + 554403276)) | (((int) r10) & ((((((~(1787086423 | r9)) | 349860013) * (-235)) + 729707819) + (((~(1787086423 | r63)) | 349860013) * (-470))) + (((~(2128541439 | r63)) | 8404997) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)))) != 477111747) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x06b4, code lost:
    
        if (((((int) r5) & ((((((~(729669319 | r9)) | (-707557091)) * (-90)) - 1687905466) + (((~(729669319 | r63)) | 707548866) * (-45))) + ((((~(707557090 | r63)) | 729669319) | (~((-707557091) | r9))) * 45))) | (((int) (r5 >> 32)) & ((((((~r10) | 1489789104) * (-828)) + 1754752898) + (r10 * (-828))) + 572236844))) != (-1032769152)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x08ba, code lost:
    
        if (((((int) r3) & (((((1435840415 | r9) * (-490)) - 312202829) + (((~(9776798 | r63)) | 1426063617) * 490)) - 629359858)) | (((int) (r3 >> 32)) & (((((~(166520217 | r9)) | (~((-1603746629) | r63))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1415865346) + (((~((-159654145) | r9)) | (~(1610612701 | r63))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) == 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x07ab, code lost:
    
        if (((((int) (r12 >> 32)) & (((((~((-131284190) | r63)) | 33563664) * (-566)) - 1040576246) + ((~((-97720526) | r63)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) r12) & (((((~((-159458582) | r63)) * 623) + 1105233914) + (((-1608220608) | r9) * (-623))) + ((((~((-165226390) | r63)) | 159458581) | (~((-1602452800) | r63))) * 623)))) == 542074309) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x1070, code lost:
    
        if (((((int) (r10 >> 32)) & (((((~((-1247423270) | r63)) * (-301)) - 409304904) + (((~(1610300199 | r63)) | (~((-1247440686) | r9))) * (-301))) + (((~(1247440685 | r63)) | 1610300199) * 301))) | (((int) r10) & ((((~((-1207964694) | r9)) * 130) - 1810213589) + (((~((-1207964694) | r63)) | 17318208) * 130)))) == 477111747) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x12c2 A[Catch: all -> 0x3ac7, TryCatch #4 {all -> 0x3ac7, blocks: (B:3:0x000c, B:5:0x0022, B:6:0x005e, B:10:0x013a, B:12:0x0178, B:13:0x01c9, B:18:0x01f5, B:21:0x020c, B:22:0x0254, B:32:0x02ba, B:34:0x02ca, B:35:0x030e, B:37:0x032b, B:39:0x033b, B:40:0x0382, B:42:0x038b, B:44:0x03a8, B:45:0x03f8, B:51:0x07c9, B:53:0x07dc, B:54:0x0826, B:59:0x0ccb, B:61:0x0cdb, B:62:0x0d21, B:72:0x0d88, B:74:0x0d98, B:75:0x0ddc, B:77:0x0dfc, B:79:0x0e0c, B:80:0x0e54, B:82:0x0e5d, B:84:0x0e7b, B:85:0x0ec6, B:89:0x0f72, B:91:0x0f90, B:92:0x0fe3, B:99:0x109b, B:101:0x10ae, B:102:0x10fb, B:114:0x11cd, B:116:0x1221, B:117:0x1276, B:123:0x12af, B:125:0x12c2, B:126:0x130b, B:128:0x13c9, B:130:0x13dc, B:131:0x1426, B:139:0x14e4, B:141:0x1536, B:142:0x158c, B:146:0x15ba, B:148:0x15cd, B:149:0x1611, B:151:0x16cf, B:153:0x16e2, B:154:0x1730, B:162:0x17ea, B:164:0x1833, B:165:0x1889, B:172:0x1952, B:174:0x1965, B:175:0x19b0, B:183:0x1a69, B:185:0x1abc, B:186:0x1b11, B:213:0x1d4b, B:215:0x1d90, B:216:0x1de8, B:220:0x1e14, B:222:0x1e24, B:223:0x1e69, B:236:0x1fde, B:238:0x1ff1, B:239:0x203f, B:247:0x2106, B:249:0x214c, B:250:0x21a5, B:254:0x21d9, B:256:0x2202, B:257:0x225a, B:263:0x22fc, B:265:0x2342, B:266:0x2398, B:290:0x241a, B:292:0x246e, B:293:0x24c2, B:296:0x24ef, B:298:0x24fe, B:299:0x2543, B:303:0x25ed, B:305:0x2645, B:306:0x269e, B:310:0x26b5, B:312:0x26ce, B:313:0x271b, B:317:0x27b2, B:319:0x2807, B:320:0x285b, B:323:0x2871, B:325:0x2880, B:326:0x28c0, B:330:0x2981, B:332:0x29c7, B:333:0x2a1f, B:336:0x2a35, B:338:0x2a44, B:339:0x2a88, B:343:0x2b3d, B:345:0x2b81, B:346:0x2bdb, B:349:0x2bf1, B:351:0x2c00, B:352:0x2c41, B:356:0x2cf5, B:358:0x2d4d, B:359:0x2da4, B:363:0x2ddc, B:365:0x2e06, B:366:0x2e5f, B:370:0x2f2a, B:372:0x2f82, B:373:0x2fdf, B:377:0x300d, B:379:0x3020, B:380:0x306c, B:384:0x3122, B:386:0x3175, B:387:0x31cb, B:390:0x31e1, B:392:0x31f0, B:393:0x3237, B:397:0x32db, B:399:0x331d, B:400:0x3373, B:403:0x3389, B:405:0x3398, B:406:0x33da, B:410:0x3499, B:412:0x34da, B:413:0x352e, B:416:0x3544, B:418:0x3553, B:419:0x359c, B:423:0x3650, B:425:0x369f, B:426:0x36f5, B:429:0x370b, B:431:0x371a, B:432:0x375c, B:438:0x3804, B:440:0x3848, B:441:0x38a0, B:443:0x38b5, B:446:0x3913, B:448:0x38c9, B:449:0x391b, B:451:0x394b, B:452:0x39aa, B:457:0x3a01, B:459:0x3a4c, B:460:0x3aa7, B:541:0x0978, B:543:0x09c2, B:544:0x0a18, B:548:0x08d9, B:550:0x08e9, B:551:0x092b, B:555:0x04a5, B:557:0x04c3, B:558:0x050f, B:561:0x05b0, B:563:0x05ce, B:564:0x061c, B:567:0x06b8, B:569:0x06d6, B:570:0x071f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x13dc A[Catch: all -> 0x3ac7, TryCatch #4 {all -> 0x3ac7, blocks: (B:3:0x000c, B:5:0x0022, B:6:0x005e, B:10:0x013a, B:12:0x0178, B:13:0x01c9, B:18:0x01f5, B:21:0x020c, B:22:0x0254, B:32:0x02ba, B:34:0x02ca, B:35:0x030e, B:37:0x032b, B:39:0x033b, B:40:0x0382, B:42:0x038b, B:44:0x03a8, B:45:0x03f8, B:51:0x07c9, B:53:0x07dc, B:54:0x0826, B:59:0x0ccb, B:61:0x0cdb, B:62:0x0d21, B:72:0x0d88, B:74:0x0d98, B:75:0x0ddc, B:77:0x0dfc, B:79:0x0e0c, B:80:0x0e54, B:82:0x0e5d, B:84:0x0e7b, B:85:0x0ec6, B:89:0x0f72, B:91:0x0f90, B:92:0x0fe3, B:99:0x109b, B:101:0x10ae, B:102:0x10fb, B:114:0x11cd, B:116:0x1221, B:117:0x1276, B:123:0x12af, B:125:0x12c2, B:126:0x130b, B:128:0x13c9, B:130:0x13dc, B:131:0x1426, B:139:0x14e4, B:141:0x1536, B:142:0x158c, B:146:0x15ba, B:148:0x15cd, B:149:0x1611, B:151:0x16cf, B:153:0x16e2, B:154:0x1730, B:162:0x17ea, B:164:0x1833, B:165:0x1889, B:172:0x1952, B:174:0x1965, B:175:0x19b0, B:183:0x1a69, B:185:0x1abc, B:186:0x1b11, B:213:0x1d4b, B:215:0x1d90, B:216:0x1de8, B:220:0x1e14, B:222:0x1e24, B:223:0x1e69, B:236:0x1fde, B:238:0x1ff1, B:239:0x203f, B:247:0x2106, B:249:0x214c, B:250:0x21a5, B:254:0x21d9, B:256:0x2202, B:257:0x225a, B:263:0x22fc, B:265:0x2342, B:266:0x2398, B:290:0x241a, B:292:0x246e, B:293:0x24c2, B:296:0x24ef, B:298:0x24fe, B:299:0x2543, B:303:0x25ed, B:305:0x2645, B:306:0x269e, B:310:0x26b5, B:312:0x26ce, B:313:0x271b, B:317:0x27b2, B:319:0x2807, B:320:0x285b, B:323:0x2871, B:325:0x2880, B:326:0x28c0, B:330:0x2981, B:332:0x29c7, B:333:0x2a1f, B:336:0x2a35, B:338:0x2a44, B:339:0x2a88, B:343:0x2b3d, B:345:0x2b81, B:346:0x2bdb, B:349:0x2bf1, B:351:0x2c00, B:352:0x2c41, B:356:0x2cf5, B:358:0x2d4d, B:359:0x2da4, B:363:0x2ddc, B:365:0x2e06, B:366:0x2e5f, B:370:0x2f2a, B:372:0x2f82, B:373:0x2fdf, B:377:0x300d, B:379:0x3020, B:380:0x306c, B:384:0x3122, B:386:0x3175, B:387:0x31cb, B:390:0x31e1, B:392:0x31f0, B:393:0x3237, B:397:0x32db, B:399:0x331d, B:400:0x3373, B:403:0x3389, B:405:0x3398, B:406:0x33da, B:410:0x3499, B:412:0x34da, B:413:0x352e, B:416:0x3544, B:418:0x3553, B:419:0x359c, B:423:0x3650, B:425:0x369f, B:426:0x36f5, B:429:0x370b, B:431:0x371a, B:432:0x375c, B:438:0x3804, B:440:0x3848, B:441:0x38a0, B:443:0x38b5, B:446:0x3913, B:448:0x38c9, B:449:0x391b, B:451:0x394b, B:452:0x39aa, B:457:0x3a01, B:459:0x3a4c, B:460:0x3aa7, B:541:0x0978, B:543:0x09c2, B:544:0x0a18, B:548:0x08d9, B:550:0x08e9, B:551:0x092b, B:555:0x04a5, B:557:0x04c3, B:558:0x050f, B:561:0x05b0, B:563:0x05ce, B:564:0x061c, B:567:0x06b8, B:569:0x06d6, B:570:0x071f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x14b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x15cd A[Catch: all -> 0x3ac7, TryCatch #4 {all -> 0x3ac7, blocks: (B:3:0x000c, B:5:0x0022, B:6:0x005e, B:10:0x013a, B:12:0x0178, B:13:0x01c9, B:18:0x01f5, B:21:0x020c, B:22:0x0254, B:32:0x02ba, B:34:0x02ca, B:35:0x030e, B:37:0x032b, B:39:0x033b, B:40:0x0382, B:42:0x038b, B:44:0x03a8, B:45:0x03f8, B:51:0x07c9, B:53:0x07dc, B:54:0x0826, B:59:0x0ccb, B:61:0x0cdb, B:62:0x0d21, B:72:0x0d88, B:74:0x0d98, B:75:0x0ddc, B:77:0x0dfc, B:79:0x0e0c, B:80:0x0e54, B:82:0x0e5d, B:84:0x0e7b, B:85:0x0ec6, B:89:0x0f72, B:91:0x0f90, B:92:0x0fe3, B:99:0x109b, B:101:0x10ae, B:102:0x10fb, B:114:0x11cd, B:116:0x1221, B:117:0x1276, B:123:0x12af, B:125:0x12c2, B:126:0x130b, B:128:0x13c9, B:130:0x13dc, B:131:0x1426, B:139:0x14e4, B:141:0x1536, B:142:0x158c, B:146:0x15ba, B:148:0x15cd, B:149:0x1611, B:151:0x16cf, B:153:0x16e2, B:154:0x1730, B:162:0x17ea, B:164:0x1833, B:165:0x1889, B:172:0x1952, B:174:0x1965, B:175:0x19b0, B:183:0x1a69, B:185:0x1abc, B:186:0x1b11, B:213:0x1d4b, B:215:0x1d90, B:216:0x1de8, B:220:0x1e14, B:222:0x1e24, B:223:0x1e69, B:236:0x1fde, B:238:0x1ff1, B:239:0x203f, B:247:0x2106, B:249:0x214c, B:250:0x21a5, B:254:0x21d9, B:256:0x2202, B:257:0x225a, B:263:0x22fc, B:265:0x2342, B:266:0x2398, B:290:0x241a, B:292:0x246e, B:293:0x24c2, B:296:0x24ef, B:298:0x24fe, B:299:0x2543, B:303:0x25ed, B:305:0x2645, B:306:0x269e, B:310:0x26b5, B:312:0x26ce, B:313:0x271b, B:317:0x27b2, B:319:0x2807, B:320:0x285b, B:323:0x2871, B:325:0x2880, B:326:0x28c0, B:330:0x2981, B:332:0x29c7, B:333:0x2a1f, B:336:0x2a35, B:338:0x2a44, B:339:0x2a88, B:343:0x2b3d, B:345:0x2b81, B:346:0x2bdb, B:349:0x2bf1, B:351:0x2c00, B:352:0x2c41, B:356:0x2cf5, B:358:0x2d4d, B:359:0x2da4, B:363:0x2ddc, B:365:0x2e06, B:366:0x2e5f, B:370:0x2f2a, B:372:0x2f82, B:373:0x2fdf, B:377:0x300d, B:379:0x3020, B:380:0x306c, B:384:0x3122, B:386:0x3175, B:387:0x31cb, B:390:0x31e1, B:392:0x31f0, B:393:0x3237, B:397:0x32db, B:399:0x331d, B:400:0x3373, B:403:0x3389, B:405:0x3398, B:406:0x33da, B:410:0x3499, B:412:0x34da, B:413:0x352e, B:416:0x3544, B:418:0x3553, B:419:0x359c, B:423:0x3650, B:425:0x369f, B:426:0x36f5, B:429:0x370b, B:431:0x371a, B:432:0x375c, B:438:0x3804, B:440:0x3848, B:441:0x38a0, B:443:0x38b5, B:446:0x3913, B:448:0x38c9, B:449:0x391b, B:451:0x394b, B:452:0x39aa, B:457:0x3a01, B:459:0x3a4c, B:460:0x3aa7, B:541:0x0978, B:543:0x09c2, B:544:0x0a18, B:548:0x08d9, B:550:0x08e9, B:551:0x092b, B:555:0x04a5, B:557:0x04c3, B:558:0x050f, B:561:0x05b0, B:563:0x05ce, B:564:0x061c, B:567:0x06b8, B:569:0x06d6, B:570:0x071f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x16e2 A[Catch: all -> 0x3ac7, TryCatch #4 {all -> 0x3ac7, blocks: (B:3:0x000c, B:5:0x0022, B:6:0x005e, B:10:0x013a, B:12:0x0178, B:13:0x01c9, B:18:0x01f5, B:21:0x020c, B:22:0x0254, B:32:0x02ba, B:34:0x02ca, B:35:0x030e, B:37:0x032b, B:39:0x033b, B:40:0x0382, B:42:0x038b, B:44:0x03a8, B:45:0x03f8, B:51:0x07c9, B:53:0x07dc, B:54:0x0826, B:59:0x0ccb, B:61:0x0cdb, B:62:0x0d21, B:72:0x0d88, B:74:0x0d98, B:75:0x0ddc, B:77:0x0dfc, B:79:0x0e0c, B:80:0x0e54, B:82:0x0e5d, B:84:0x0e7b, B:85:0x0ec6, B:89:0x0f72, B:91:0x0f90, B:92:0x0fe3, B:99:0x109b, B:101:0x10ae, B:102:0x10fb, B:114:0x11cd, B:116:0x1221, B:117:0x1276, B:123:0x12af, B:125:0x12c2, B:126:0x130b, B:128:0x13c9, B:130:0x13dc, B:131:0x1426, B:139:0x14e4, B:141:0x1536, B:142:0x158c, B:146:0x15ba, B:148:0x15cd, B:149:0x1611, B:151:0x16cf, B:153:0x16e2, B:154:0x1730, B:162:0x17ea, B:164:0x1833, B:165:0x1889, B:172:0x1952, B:174:0x1965, B:175:0x19b0, B:183:0x1a69, B:185:0x1abc, B:186:0x1b11, B:213:0x1d4b, B:215:0x1d90, B:216:0x1de8, B:220:0x1e14, B:222:0x1e24, B:223:0x1e69, B:236:0x1fde, B:238:0x1ff1, B:239:0x203f, B:247:0x2106, B:249:0x214c, B:250:0x21a5, B:254:0x21d9, B:256:0x2202, B:257:0x225a, B:263:0x22fc, B:265:0x2342, B:266:0x2398, B:290:0x241a, B:292:0x246e, B:293:0x24c2, B:296:0x24ef, B:298:0x24fe, B:299:0x2543, B:303:0x25ed, B:305:0x2645, B:306:0x269e, B:310:0x26b5, B:312:0x26ce, B:313:0x271b, B:317:0x27b2, B:319:0x2807, B:320:0x285b, B:323:0x2871, B:325:0x2880, B:326:0x28c0, B:330:0x2981, B:332:0x29c7, B:333:0x2a1f, B:336:0x2a35, B:338:0x2a44, B:339:0x2a88, B:343:0x2b3d, B:345:0x2b81, B:346:0x2bdb, B:349:0x2bf1, B:351:0x2c00, B:352:0x2c41, B:356:0x2cf5, B:358:0x2d4d, B:359:0x2da4, B:363:0x2ddc, B:365:0x2e06, B:366:0x2e5f, B:370:0x2f2a, B:372:0x2f82, B:373:0x2fdf, B:377:0x300d, B:379:0x3020, B:380:0x306c, B:384:0x3122, B:386:0x3175, B:387:0x31cb, B:390:0x31e1, B:392:0x31f0, B:393:0x3237, B:397:0x32db, B:399:0x331d, B:400:0x3373, B:403:0x3389, B:405:0x3398, B:406:0x33da, B:410:0x3499, B:412:0x34da, B:413:0x352e, B:416:0x3544, B:418:0x3553, B:419:0x359c, B:423:0x3650, B:425:0x369f, B:426:0x36f5, B:429:0x370b, B:431:0x371a, B:432:0x375c, B:438:0x3804, B:440:0x3848, B:441:0x38a0, B:443:0x38b5, B:446:0x3913, B:448:0x38c9, B:449:0x391b, B:451:0x394b, B:452:0x39aa, B:457:0x3a01, B:459:0x3a4c, B:460:0x3aa7, B:541:0x0978, B:543:0x09c2, B:544:0x0a18, B:548:0x08d9, B:550:0x08e9, B:551:0x092b, B:555:0x04a5, B:557:0x04c3, B:558:0x050f, B:561:0x05b0, B:563:0x05ce, B:564:0x061c, B:567:0x06b8, B:569:0x06d6, B:570:0x071f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x17c5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1950  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1a50  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x1b27  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1d32  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1dfe  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1a4d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0cdb A[Catch: all -> 0x3ac7, TryCatch #4 {all -> 0x3ac7, blocks: (B:3:0x000c, B:5:0x0022, B:6:0x005e, B:10:0x013a, B:12:0x0178, B:13:0x01c9, B:18:0x01f5, B:21:0x020c, B:22:0x0254, B:32:0x02ba, B:34:0x02ca, B:35:0x030e, B:37:0x032b, B:39:0x033b, B:40:0x0382, B:42:0x038b, B:44:0x03a8, B:45:0x03f8, B:51:0x07c9, B:53:0x07dc, B:54:0x0826, B:59:0x0ccb, B:61:0x0cdb, B:62:0x0d21, B:72:0x0d88, B:74:0x0d98, B:75:0x0ddc, B:77:0x0dfc, B:79:0x0e0c, B:80:0x0e54, B:82:0x0e5d, B:84:0x0e7b, B:85:0x0ec6, B:89:0x0f72, B:91:0x0f90, B:92:0x0fe3, B:99:0x109b, B:101:0x10ae, B:102:0x10fb, B:114:0x11cd, B:116:0x1221, B:117:0x1276, B:123:0x12af, B:125:0x12c2, B:126:0x130b, B:128:0x13c9, B:130:0x13dc, B:131:0x1426, B:139:0x14e4, B:141:0x1536, B:142:0x158c, B:146:0x15ba, B:148:0x15cd, B:149:0x1611, B:151:0x16cf, B:153:0x16e2, B:154:0x1730, B:162:0x17ea, B:164:0x1833, B:165:0x1889, B:172:0x1952, B:174:0x1965, B:175:0x19b0, B:183:0x1a69, B:185:0x1abc, B:186:0x1b11, B:213:0x1d4b, B:215:0x1d90, B:216:0x1de8, B:220:0x1e14, B:222:0x1e24, B:223:0x1e69, B:236:0x1fde, B:238:0x1ff1, B:239:0x203f, B:247:0x2106, B:249:0x214c, B:250:0x21a5, B:254:0x21d9, B:256:0x2202, B:257:0x225a, B:263:0x22fc, B:265:0x2342, B:266:0x2398, B:290:0x241a, B:292:0x246e, B:293:0x24c2, B:296:0x24ef, B:298:0x24fe, B:299:0x2543, B:303:0x25ed, B:305:0x2645, B:306:0x269e, B:310:0x26b5, B:312:0x26ce, B:313:0x271b, B:317:0x27b2, B:319:0x2807, B:320:0x285b, B:323:0x2871, B:325:0x2880, B:326:0x28c0, B:330:0x2981, B:332:0x29c7, B:333:0x2a1f, B:336:0x2a35, B:338:0x2a44, B:339:0x2a88, B:343:0x2b3d, B:345:0x2b81, B:346:0x2bdb, B:349:0x2bf1, B:351:0x2c00, B:352:0x2c41, B:356:0x2cf5, B:358:0x2d4d, B:359:0x2da4, B:363:0x2ddc, B:365:0x2e06, B:366:0x2e5f, B:370:0x2f2a, B:372:0x2f82, B:373:0x2fdf, B:377:0x300d, B:379:0x3020, B:380:0x306c, B:384:0x3122, B:386:0x3175, B:387:0x31cb, B:390:0x31e1, B:392:0x31f0, B:393:0x3237, B:397:0x32db, B:399:0x331d, B:400:0x3373, B:403:0x3389, B:405:0x3398, B:406:0x33da, B:410:0x3499, B:412:0x34da, B:413:0x352e, B:416:0x3544, B:418:0x3553, B:419:0x359c, B:423:0x3650, B:425:0x369f, B:426:0x36f5, B:429:0x370b, B:431:0x371a, B:432:0x375c, B:438:0x3804, B:440:0x3848, B:441:0x38a0, B:443:0x38b5, B:446:0x3913, B:448:0x38c9, B:449:0x391b, B:451:0x394b, B:452:0x39aa, B:457:0x3a01, B:459:0x3a4c, B:460:0x3aa7, B:541:0x0978, B:543:0x09c2, B:544:0x0a18, B:548:0x08d9, B:550:0x08e9, B:551:0x092b, B:555:0x04a5, B:557:0x04c3, B:558:0x050f, B:561:0x05b0, B:563:0x05ce, B:564:0x061c, B:567:0x06b8, B:569:0x06d6, B:570:0x071f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0d2c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values$4956fc2a(int i, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        long j;
        int i2;
        char c;
        java.lang.Object obj2;
        java.lang.String str3;
        java.lang.Object obj3;
        long j2;
        java.lang.Object obj4;
        java.lang.Object obj5;
        long j3;
        java.lang.Object obj6;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        long j4;
        java.lang.String str4;
        java.lang.Object[] objArr;
        int parseInt;
        java.lang.String[] strArr;
        java.lang.Object obj7;
        java.lang.Object obj8;
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 35) % 128;
        try {
            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            int i7 = 0;
            if (obj9 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.Color.alpha(0), 1838 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                byte b = $$a[14];
                short s = (short) (b - 1);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(s, (byte) s, b, objArr2);
                obj9 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj9);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, null)).longValue();
            long j5 = ~longValue;
            long j6 = i;
            long j7 = ~j6;
            long j8 = ~(j7 | (-1258471564) | longValue);
            long j9 = ((471 * longValue) - 592740106644L) + ((longValue | (-1258471564)) * (-470)) + (((~(j5 | j6)) | (~(1258471563 | j5)) | j8) * (-470)) + ((j8 | (~((-1258471564) | j5 | j6))) * 470) + 2098550509;
            int i8 = ~i;
            int i9 = ~((-359742356) | i8);
            if (((((int) j9) & ((((-1077484055) | i9) * 764) + 20682221 + (((~((-1077484055) | i8)) | 1074266116) * (-1528)) + ((i9 | 1430790533) * 764))) | (((int) (j9 >> 32)) & ((((~((-1129812509) | i8)) | (~((-307413903) | i8)) | 38961676) * (-1136)) + 1738041050 + (((~((-307413903) | i)) | (~((-1129812509) | i)) | (~(1398264734 | i8))) * (-568)) + (((~(307413902 | i8)) | (~(1129812508 | i8)) | (~((-38961677) | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) != 0) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr4 = {1916120371, 16, java.lang.Integer.valueOf(((((~(i | 241385507)) | (-535261872)) * 305) - 1989722672) + (((~(241385507 | i8)) | (-467940013)) * 305))};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj10 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(653, (byte) (-$$a[16]), r6[14], objArr5);
                    obj10 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            c("龂鿰山\ue343Ɠ塷貌鑃\ue9d7迂퉩\u1aef王ᗶ䒤", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1, objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj11 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, 1921 - android.graphics.Color.green(0), (char) (android.view.MotionEvent.axisFromString("") + 1));
                byte b2 = $$a[14];
                short s2 = (short) (b2 - 1);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(s2, (byte) s2, b2, objArr8);
                java.lang.reflect.Method method = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, method);
                str = "";
                obj11 = method;
            } else {
                str = "";
            }
            java.lang.String str5 = (java.lang.String) ((java.lang.reflect.Method) obj11).invoke(null, objArr7);
            float f = 0.0f;
            if (str5 != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                c("䨫䩙䵐劂Ⴜ\ue9f6뀳ꣷ㱷黤", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, null, "\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083", objArr10);
                java.lang.String[] strArr2 = {intern, ((java.lang.String) objArr10[0]).intern()};
                int i10 = 0;
                for (int i11 = 2; i10 < i11; i11 = 2) {
                    if (str5.contains(strArr2[i10])) {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        a(android.view.KeyEvent.keyCodeFromString(str) + 127, null, null, "\u008b\u0094\u008b\u008e\u0090\u008f\u0092\u0087\u008e\u0093\u0092\u0091\u008c\u0090\u008f\u008e\u0086\u0084\u008b\u008d\u008c\u0084\u008b", objArr11);
                        java.lang.Object[] objArr12 = {((java.lang.String) objArr11[i7]).intern()};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj12 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.Gravity.getAbsoluteGravity(i7, i7), 1922 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.graphics.PointF.length(f, f) > f ? 1 : (android.graphics.PointF.length(f, f) == f ? 0 : -1)));
                            byte b3 = $$a[14];
                            short s3 = (short) (b3 - 1);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(s3, (byte) s3, b3, objArr13);
                            java.lang.String str6 = (java.lang.String) objArr13[i7];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i7] = java.lang.String.class;
                            obj12 = cls4.getMethod(str6, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                        }
                        java.lang.Object invoke = ((java.lang.reflect.Method) obj12).invoke(null, objArr12);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(127 - android.view.View.getDefaultSize(i7, i7), null, null, "\u008b\u0094\u008b\u008e\u0090\u008f\u0092\u0087\u008e\u0093\u0092\u0091\u008c\u0091\u0094\u0090\u0089\u0095\u0089\u008c\u0090\u008f\u008e\u0086\u0084\u008b\u008d\u008c\u0084\u008b", objArr14);
                        java.lang.Object[] objArr15 = {((java.lang.String) objArr14[i7]).intern()};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj13 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter(str, i7), (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)) + 1920, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1))));
                            byte b4 = $$a[14];
                            short s4 = (short) (b4 - 1);
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            b(s4, (byte) s4, b4, objArr16);
                            java.lang.String str7 = (java.lang.String) objArr16[i7];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                            clsArr2[i7] = java.lang.String.class;
                            obj13 = cls5.getMethod(str7, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj13).invoke(null, objArr15);
                        if (invoke != null) {
                            java.lang.Object[] objArr17 = new java.lang.Object[2];
                            objArr17[1] = 42;
                            objArr17[i7] = invoke;
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj14 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.getDefaultSize(i7, i7), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2594, (char) (android.os.Process.myPid() >> 22));
                                byte b5 = $$a[14];
                                short s5 = (short) (b5 - 1);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                b(s5, (byte) s5, b5, objArr18);
                                obj14 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr17)).longValue();
                            obj8 = invoke;
                            long j10 = ~longValue2;
                            long j11 = ~(j7 | longValue2);
                            j = j6;
                            long j12 = ((971 * longValue2) - 230385998185L) + (((~(j10 | 118816915)) | j11) * (-970)) + ((~(longValue2 | (-118816916))) * 1940) + ((j11 | (~(j10 | (-118816916)))) * 970) + 1138283609;
                            if (((((int) j12) & (((((~((-1158398218) | i)) | (~(1699473741 | i8))) * (-406)) - 2017341421) + ((~((-131074) | i8)) * (-406)) + (((~((-1699342669) | i)) | (~(1158398217 | i8))) * 406))) | (((int) (j12 >> 32)) & (((((~((-337913091) | i)) | r6) * 590) - 489527490) + (((~(1048323991 | i8)) | 1099005992 | (~((-1809416894) | i8))) * (-1180)) + (((~(1809416893 | i8)) | (~((-1048323992) | i8))) * 590)))) == 477111747) {
                                if (android.os.Build.VERSION.SDK_INT > 33) {
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    c("\u001f0켛넇鋳੩\ue8f8\uf03c瘄Ჳ耧纎\uec03蛁ᛩ\uf55f拨བ겜講\ud8aa襤⊘Ĭ佼揫뭻韻앂\uedf0ㄧⶀ", android.graphics.Color.blue(0) + 1, objArr19);
                                    java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj15 == null) {
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.os.Process.getGidForName(str), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3161, (char) (android.os.Process.getGidForName(str) + 33100));
                                        byte b6 = $$a[14];
                                        short s6 = (short) (b6 - 1);
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        b(s6, (byte) s6, b6, objArr21);
                                        obj15 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj15);
                                    }
                                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr20)).longValue();
                                    long j13 = ~longValue3;
                                    long j14 = ~(j | 722497039);
                                    str2 = str;
                                    long j15 = (((((521 * longValue3) - 374975963241L) + (((~((j13 | (-722497040)) | j7)) | (~(longValue3 | j))) * 520)) + (((~(j13 | j7)) | j14) * (-1040))) + ((((~(j7 | (-722497040))) | (~(722497039 | j13))) | j14) * 520)) - 2060165147;
                                } else {
                                    str2 = str;
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a(126 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), null, null, "\u0094\u0085\u0096\u0092\u0083\u0083\u008e\u0096\u0094\u0086\u008c\u0084\u008b", objArr22);
                                    java.lang.Object[] objArr23 = {((java.lang.String) objArr22[0]).intern()};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj16 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 40, android.view.View.MeasureSpec.getSize(0) + 1921, (char) android.graphics.Color.alpha(0));
                                        byte b7 = $$a[14];
                                        short s7 = (short) (b7 - 1);
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        b(s7, (byte) s7, b7, objArr24);
                                        obj16 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
                                    }
                                    java.lang.Object invoke3 = ((java.lang.reflect.Method) obj16).invoke(null, objArr23);
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    a(175 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), null, null, "\u0097", objArr25);
                                }
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                c("ﺪﻋ\u6951c蒌晤힟콧裵ુ\uec2b䇏", -android.text.TextUtils.lastIndexOf(str2, c, i2), objArr26);
                                java.lang.String intern2 = ((java.lang.String) objArr26[i2]).intern();
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u0083\u0093\u0088\u008d\u008b\u0092", objArr27);
                                java.lang.String intern3 = ((java.lang.String) objArr27[i2]).intern();
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0086\u008b\u0094\u0089\u008e\u0091\u0086", objArr28);
                                java.lang.String intern4 = ((java.lang.String) objArr28[i2]).intern();
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                a(127 - android.view.Gravity.getAbsoluteGravity(i2, i2), null, null, "\u008b\u0094\u0098\u008b\u0094\u0089\u0096\u0086\u0083", objArr29);
                                java.lang.String intern5 = ((java.lang.String) objArr29[i2]).intern();
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c("砚硳\ued07쐀냮罶쑨\udcacโ㺯", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr30);
                                java.lang.String intern6 = ((java.lang.String) objArr30[i2]).intern();
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u008f\u008b\u008c\u0083\u008e\u0096\u0094\u0086\u0099\u0090\u0088\u0093\u0088", objArr31);
                                java.lang.String intern7 = ((java.lang.String) objArr31[i2]).intern();
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                c("\ud8ee\ud887\uf7d0\ue1ccꨲ媢紎旆꺪", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr32);
                                java.lang.String intern8 = ((java.lang.String) objArr32[i2]).intern();
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                a(127 - android.view.View.MeasureSpec.getMode(i2), null, null, "\u009a\u0087\u008b\u0094\u008d\u0088", objArr33);
                                java.lang.String intern9 = ((java.lang.String) objArr33[i2]).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                a((android.os.Process.myPid() >> 22) + 127, null, null, "\u009b\u0088", objArr34);
                                java.lang.String intern10 = ((java.lang.String) objArr34[i2]).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c("㭻㬗⤪\udd59瓈昤\uef88\uf75f䴪滋\uec64秭흠悫竵\uf223妓\ue962삝豨", 1 - android.graphics.Color.red(i2), objArr35);
                                java.lang.String intern11 = ((java.lang.String) objArr35[i2]).intern();
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                c("悿惓뛩諣\ueb0b㆞홦캵ᛪ敏믉䁀貥ｿ", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr36);
                                java.lang.String intern12 = ((java.lang.String) objArr36[i2]).intern();
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                a(android.view.MotionEvent.axisFromString(str2) + 128, null, null, "\u009c\u0093\u0092\u008b\u008f\u0084\u008b\u008d", objArr37);
                                java.lang.String intern13 = ((java.lang.String) objArr37[i2]).intern();
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                c("쯣쮓Ք櫣墫톖혬컭붴훺寁䁚⟮䳂촕쮆", android.view.View.MeasureSpec.getSize(i2) + 1, objArr38);
                                java.lang.String intern14 = ((java.lang.String) objArr38[i2]).intern();
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c("\udca6\udcd6鸏凥쏰\uea90棏瀎꫱䶡惇ﺹカ힙\uf613畢빎幊", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr39);
                                java.lang.String intern15 = ((java.lang.String) objArr39[i2]).intern();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, null, "\u0090\u0093\u008e\u0084\u0091\u0094\u008b", objArr40);
                                java.lang.String intern16 = ((java.lang.String) objArr40[0]).intern();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                c("鮭鯞Ꮱ﨣丄䅖簈擘\uedf4쁁쬝", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr41);
                                java.lang.String intern17 = ((java.lang.String) objArr41[0]).intern();
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                c("萧葔ⷢᰎ瀞ꝸ伷培\uf267﹆\u2d73", android.text.TextUtils.indexOf(str2, str2, 0, 0) + 1, objArr42);
                                java.lang.String intern18 = ((java.lang.String) objArr42[0]).intern();
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                c("窥竖퐏ꍅ觱ퟘ", 1 - android.view.KeyEvent.normalizeMetaState(0), objArr43);
                                java.lang.String intern19 = ((java.lang.String) objArr43[0]).intern();
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                c("颀飳繷䲣⎎\uf7d8弝䟈\ueec0귩続쥺璜㟪\ueb7e䊫侀븽兾㳪䀷䡏\udf27뛋", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr44);
                                java.lang.String intern20 = ((java.lang.String) objArr44[0]).intern();
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                c("灛瀨淮᳅〗Ɬ봣ꗥ،빊", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr45);
                                java.lang.String intern21 = ((java.lang.String) objArr45[0]).intern();
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                c("䧗䦤뗻㿨\ue803⯸", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr46);
                                java.lang.String intern22 = ((java.lang.String) objArr46[0]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                a(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0089\u008e\u0090\u0092\u0090\u0089\u0099\u008b\u0094\u009d\u0088\u0090\u0088\u0093\u0092\u0089", objArr47);
                                java.lang.String intern23 = ((java.lang.String) objArr47[0]).intern();
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c("籿簋緄\u2028※魓䦵共ਮ깵ᄇ\udfde避", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr48);
                                java.lang.String intern24 = ((java.lang.String) objArr48[0]).intern();
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, "\u009e\u008a\u0090\u0092\u008d\u0094\u008f\u0092\u008b\u0090", objArr49);
                                java.lang.String intern25 = ((java.lang.String) objArr49[0]).intern();
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                a(android.graphics.Color.blue(0) + 127, null, null, "\u009e\u0094\u0090\u008e\u0084\u008b\u0094\u008f\u0092\u008b\u0090", objArr50);
                                java.lang.String intern26 = ((java.lang.String) objArr50[0]).intern();
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                c("\ue0ad\ue0d8ﮗ䅋ꙴ都嘰仾雷⠲灚쁌ಫ누\ue6a6", 1 - android.graphics.Color.argb(0, 0, 0, 0), objArr51);
                                java.lang.String intern27 = ((java.lang.String) objArr51[0]).intern();
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                c("ۆڳ﹪꺻ꎉᗖ柝缓炜\u2dcf龪\uf1ba\ueacb럸०穵搴㸥덢", android.view.View.MeasureSpec.getMode(0) + 1, objArr52);
                                java.lang.String intern28 = ((java.lang.String) objArr52[0]).intern();
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                c("垓埦\ud99a熇葹쫪麺虴⇉ਿ䂖ࣜ뮂适홧茔㕣ᧀ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr53);
                                java.lang.String[] strArr3 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr53[0]).intern()};
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                c("龂鿰山\ue343Ɠ塷貌鑃\ue9d7迂퉩\u1aef王ᗶ䒤", android.view.View.resolveSizeAndState(0, 0, 0) + 1, objArr54);
                                java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1921 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    byte b8 = $$a[14];
                                    short s8 = (short) (b8 - 1);
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    b(s8, (byte) s8, b8, objArr56);
                                    obj2 = cls9.getMethod((java.lang.String) objArr56[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                str3 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr55);
                                if (str3 != null) {
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    c("䨫䩙䵐劂Ⴜ\ue9f6뀳ꣷ㱷黤", 1 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr57);
                                    java.lang.String intern29 = ((java.lang.String) objArr57[0]).intern();
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, null, null, "\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083", objArr58);
                                    java.lang.String[] strArr4 = {intern29, ((java.lang.String) objArr58[0]).intern()};
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= 2) {
                                            break;
                                        }
                                        if (str3.contains(strArr4[i12])) {
                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                            a(128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, null, "\u008b\u0094\u008b\u008e\u0090\u008f\u0092\u0087\u008e\u0093\u0092\u0091\u008c\u0090\u008f\u008e\u0086\u0084\u008b\u008d\u008c\u0084\u008b", objArr59);
                                            java.lang.Object[] objArr60 = {((java.lang.String) objArr59[0]).intern()};
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj17 == null) {
                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1921, (char) android.text.TextUtils.indexOf(str2, str2));
                                                byte b9 = $$a[14];
                                                short s9 = (short) (b9 - 1);
                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                b(s9, (byte) s9, b9, objArr61);
                                                obj17 = cls10.getMethod((java.lang.String) objArr61[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                            }
                                            java.lang.Object invoke4 = ((java.lang.reflect.Method) obj17).invoke(null, objArr60);
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            a((android.os.Process.myPid() >> 22) + 127, null, null, "\u008b\u0094\u008b\u008e\u0090\u008f\u0092\u0087\u008e\u0093\u0092\u0091\u008c\u0091\u0094\u0090\u0089\u0095\u0089\u008c\u0090\u008f\u008e\u0086\u0084\u008b\u008d\u008c\u0084\u008b", objArr62);
                                            java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).intern()};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj18 == null) {
                                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1920, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                byte b10 = $$a[14];
                                                short s10 = (short) (b10 - 1);
                                                java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                b(s10, (byte) s10, b10, objArr64);
                                                obj18 = cls11.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                            }
                                            java.lang.Object invoke5 = ((java.lang.reflect.Method) obj18).invoke(null, objArr63);
                                            if (invoke4 != null) {
                                                java.lang.Object[] objArr65 = {invoke4, 42};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj19 == null) {
                                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 28, 2594 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.view.View.resolveSize(0, 0));
                                                    byte b11 = $$a[14];
                                                    short s11 = (short) (b11 - 1);
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    b(s11, (byte) s11, b11, objArr66);
                                                    obj19 = cls12.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                }
                                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).longValue();
                                                long j16 = ~longValue4;
                                                long j17 = ~(j16 | (-66207158));
                                                obj7 = invoke5;
                                                long j18 = (((-575) * longValue4) - 38069115275L) + (((~(j16 | j)) | j17) * 576) + (((~((-66207158) | longValue4)) | (~(j16 | j7 | 66207157))) * 576) + (j17 * 576) + 1190893367;
                                                if (((((int) j18) & (((((~(1710368581 | i)) | (-273142172)) * (-318)) - 833453353) + (((~((-273142172) | i)) | (~((-1706042949) | i8))) * 318) + (((~((-4325634) | i8)) | (~((-1706042949) | i))) * 318))) | (((int) (j18 >> 32)) & ((((~((-676487189) | i8)) | (~(760739222 | i))) * (-272)) + 550416330 + (((~((-693297559) | i)) | 16810370) * (-272)) + (((~(693297558 | i)) | 743928852) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)))) != 477111747) {
                                                }
                                                int i13 = 0;
                                                int i14 = 0;
                                                while (i13 < 28) {
                                                    java.lang.String str8 = strArr3[i13];
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    c("뜌뜣㞚⇋橤骨蒴鱠셌\ue43eშኔ嬆縆蘧饀", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr67);
                                                    java.lang.Object[] objArr68 = {((java.lang.String) objArr67[0]).intern().concat(java.lang.String.valueOf(str8))};
                                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                    if (obj20 == null) {
                                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3161, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33099));
                                                        byte b12 = (byte) ($$a[14] - 1);
                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                        b(618, b12, b12, objArr69);
                                                        obj20 = cls13.getMethod((java.lang.String) objArr69[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj20);
                                                    }
                                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).longValue();
                                                    long j19 = ~longValue5;
                                                    int i15 = i13;
                                                    long j20 = j7 | 734449135;
                                                    int i16 = i14;
                                                    java.lang.String[] strArr5 = strArr3;
                                                    long j21 = ((242 * longValue5) - 354738932688L) + (((~(j19 | 734449135)) | (~j20)) * (-241)) + (((-734449136) | longValue5) * (-482)) + (((~(j20 | longValue5)) | (~((-734449136) | j19))) * 241) + 1641919874;
                                                    i14 = i16 + (((((int) j21) & ((((((~((-1426953875) | i8)) | (~(1431148499 | i))) * (-831)) + (-327595962)) + ((~((-361489) | i)) * (-1662))) + ((((~((-1430787012) | i8)) | (~(1430787011 | i))) | (~(1426953874 | i))) * 831))) | (((int) (j21 >> 32)) & ((((((~(826906527 | i8)) | (-2035128256)) * 446) + 384374654) + (((~((-1208221729) | i)) | 4293898) * 446)) - 1429102720))) == 0 ? 0 : 1);
                                                    i13 = i15 + 1;
                                                    strArr3 = strArr5;
                                                }
                                                if (i14 >= 25.2d) {
                                                    java.lang.Object[] objArr70 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr71 = {1916120371, 16, java.lang.Integer.valueOf((((~(i | 662625511)) | (~((-38311137) | i8)) | (-671014384)) * (-68)) + 1776064275 + ((~((-8388873) | i8)) * (-68)) + (((~((-662625512) | i8)) | (-46700009)) * 68))};
                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj21 == null) {
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str2, 0) + 50, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                        b(653, (byte) (-$$a[16]), r2[14], objArr72);
                                                        obj21 = cls14.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                    }
                                                    ((int[]) objArr70[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr71)).intValue();
                                                    return objArr70;
                                                }
                                            } else {
                                                obj7 = invoke5;
                                            }
                                            if (obj7 != null) {
                                                java.lang.Object[] objArr73 = {obj7, 42};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj22 == null) {
                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2594, (char) (android.os.Process.myPid() >> 22));
                                                    byte b13 = $$a[14];
                                                    short s12 = (short) (b13 - 1);
                                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                    b(s12, (byte) s12, b13, objArr74);
                                                    obj22 = cls15.getMethod((java.lang.String) objArr74[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj22);
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr73)).longValue();
                                                long j22 = ~longValue6;
                                                long j23 = ((984 * longValue6) - 2161129153410L) + ((j22 | 1099811274) * 983) + (((~(j22 | j7)) | (-1099811275)) * (-983)) + (((~(longValue6 | (-1099811275))) | (~(j7 | (-1099811275)))) * 983) + 157289250;
                                            }
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0094\u008f\u008b\u0084\u0087\u0093\u0094\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr75);
                                java.lang.Object[] objArr76 = {((java.lang.String) objArr75[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, 2807 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte b14 = $$a[14];
                                    short s13 = (short) (b14 - 1);
                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                    b(s13, (byte) s13, b14, objArr77);
                                    obj3 = cls16.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr76)).longValue();
                                long j24 = ~((~longValue7) | j);
                                long j25 = (((-574) * longValue7) - 542360086226L) + (((~(j7 | (-944878200))) | j24) * 1150) + (((~(j7 | longValue7)) | j24) * (-575)) + (((~(j7 | 944878199)) | (~(j | (-944878200)))) * 575) + 345661868;
                                int i17 = (~((-358603417) | i8)) | 353730696 | (~(1078622994 | i8));
                                j2 = (((int) (j25 >> 32)) & ((((~((-1073750275) | i)) | i17) * 590) + 1827437694 + (i17 * (-1180)) + (((~((-1078622995) | i8)) | (~(358603416 | i8))) * 590))) | (((((((~(947041633 | i)) | (~((-490184777) | i8))) | r7) * (-516)) - 952163343) + (((~(1031255401 | i)) | (~((-541070626) | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~((-947041634) | i8)) | 541070625) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) & ((int) j25));
                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                c("產甍㮩⋷晔馟꣒뀚͵\ue847Ꮚ㺤餦爺蕚땦៊ﯡ㼵쬬궁", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr78);
                                java.lang.Object[] objArr79 = {((java.lang.String) objArr78[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, android.view.View.resolveSize(0, 0) + 2807, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                    byte b15 = $$a[14];
                                    short s14 = (short) (b15 - 1);
                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                    b(s14, (byte) s14, b15, objArr80);
                                    obj4 = cls17.getMethod((java.lang.String) objArr80[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr79)).longValue();
                                long j26 = ~longValue8;
                                long j27 = (((-932) * longValue8) - 792476116066L) + (((~(j7 | 848475498)) | j26) * (-933)) + (((~(j26 | j7)) | (~(j26 | (-848475499)))) * 933) + ((~((-848475499) | longValue8)) * 933) + 2139015566;
                                long j28 = (((int) j27) & ((((~(1621867840 | i8)) | 151011349) * (-108)) + 1807340995 + (((~((-1235873046) | i)) | 537006144 | (~(1235873045 | i8))) * 54) + ((537006144 | i) * 54))) | (((int) (j27 >> 32)) & (((~(1601566655 | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 777667856 + (((~(1601566655 | i8)) | 85991946) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)));
                                if (j2 > 0) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 13) % 128;
                                    if (j28 > 0 && j28 - 3 < j2) {
                                        java.lang.Object[] objArr81 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                        java.lang.Object[] objArr82 = {1916120371, 16, java.lang.Integer.valueOf((((((~((-20981896) | i8)) | (~((-475721) | i8))) * (-184)) - 957551097) + ((((~((-364915848) | i8)) | 343933952) | (~((-344409673) | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 1487428408)};
                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj23 == null) {
                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, str2, 0, 0) + 50, (android.os.Process.myPid() >> 22) + 2713, (char) ((-1) - android.os.Process.getGidForName(str2)));
                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                            b(653, (byte) (-$$a[16]), r2[14], objArr83);
                                            obj23 = cls18.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                        }
                                        ((int[]) objArr81[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr82)).intValue();
                                        return objArr81;
                                    }
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                a(android.graphics.Color.alpha(0) + 127, null, null, "\u0094\u008f\u008b\u0084\u0087\u0093\u0094\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str2) + 29, 2806 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.resolveSize(0, 0));
                                    byte b16 = $$a[14];
                                    short s15 = (short) (b16 - 1);
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    b(s15, (byte) s15, b16, objArr86);
                                    obj5 = cls19.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr85)).longValue();
                                long j29 = ~longValue9;
                                long j30 = 565166883 | j29;
                                long j31 = ((-622) * longValue9) + 352664134992L + ((~(j30 | j)) * 623) + ((j7 | (~((-565166884) | longValue9))) * (-623)) + (((~j30) | (~(j29 | j)) | (~(j | 565166883))) * 623) + 725373184;
                                j3 = (((int) j31) & (((((~((-333308726) | i)) | (~((-1744836811) | i8))) * (-406)) - 1975110749) + ((~((-25698326) | i8)) * (-406)) + (((~(1770535135 | i)) | (~(333308725 | i8))) * 406))) | (((int) (j31 >> 32)) & ((((18939904 | i8) * (-192)) - 1788177110) + (((~(1371214946 | i8)) | (-1505465843)) * (-384)) + (((~(1505465842 | i)) | (~((-134250897) | i8)) | (~((-1352275043) | i))) * 192)));
                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                a(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, null, "\u0098\u0094\u0086\u009f", objArr87);
                                java.lang.Object[] objArr88 = {((java.lang.String) objArr87[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2807, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                    byte b17 = $$a[14];
                                    short s16 = (short) (b17 - 1);
                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                    b(s16, (byte) s16, b17, objArr89);
                                    obj6 = cls20.getMethod((java.lang.String) objArr89[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr88)).longValue();
                                long j32 = ~longValue10;
                                long j33 = j7 | (-382751621);
                                long j34 = (((-885) * longValue10) - 678618624033L) + (((~(j32 | 382751620)) | (~(j32 | j)) | (~(j33 | longValue10))) * 886) + (((~(j7 | longValue10)) | (-382751621)) * (-1772)) + ((~j33) * 886) + 1673291688;
                                long j35 = (((int) j34) & (((((~(2074071120 | i)) | (-783669766)) * (-465)) - 1217272672) + (((~((-783669766) | i)) | 2074071120) * 930) + (((-69208582) | i) * 465))) | (((int) (j34 >> 32)) & ((((~((-1881739426) | i8)) | 444513014) * (-983)) + 1925261964 + (((~(444513014 | i8)) | (-2055191288)) * 983)));
                                if (j3 <= 0 && j35 > 0 && j35 + 100 < j3) {
                                    java.lang.Object[] objArr90 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                    java.lang.Object[] objArr91 = {1916120371, 16, java.lang.Integer.valueOf(((~(i | 167086495)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1280757879 + (((-536895521) | i8) * (-216)) + (((~(167086495 | i8)) | 542239024) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj24 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), 2713 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                        b(653, (byte) (-$$a[16]), r2[14], objArr92);
                                        obj24 = cls21.getMethod((java.lang.String) objArr92[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                    }
                                    ((int[]) objArr90[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr91)).intValue();
                                    return objArr90;
                                }
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                a(127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr93);
                                java.lang.String intern30 = ((java.lang.String) objArr93[0]).intern();
                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                a(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u0093\u0088\u0096\u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr94);
                                java.lang.String intern31 = ((java.lang.String) objArr94[0]).intern();
                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                c("돇돨䘋₡\u1bf5鯂鮉荝얇閯ᆂඩ応ྜ蝊蘼", 1 - android.view.View.combineMeasuredStates(0, 0), objArr95);
                                java.lang.String intern32 = ((java.lang.String) objArr95[0]).intern();
                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                a(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0093\u0088\u0096 \u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr96);
                                java.lang.String intern33 = ((java.lang.String) objArr96[0]).intern();
                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                c("鍄鍫킔鬌赯\u2073泈琁\ue514̺ꨰ\ufaf5罎餈㳠", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr97);
                                java.lang.String intern34 = ((java.lang.String) objArr97[0]).intern();
                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u0093\u0088\u0096\u0089\u009f", objArr98);
                                java.lang.String intern35 = ((java.lang.String) objArr98[0]).intern();
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, null, null, "\u008f\u0090\u0094\u009f", objArr99);
                                java.lang.String[] strArr6 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr99[0]).intern()};
                                i3 = 0;
                                while (true) {
                                    if (i3 >= 7) {
                                        i4 = 0;
                                        break;
                                    }
                                    java.lang.Object[] objArr100 = {strArr6[i3]};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                    if (obj25 == null) {
                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 1672, (char) (47940 - android.view.View.getDefaultSize(0, 0)));
                                        byte b18 = $$a[14];
                                        short s17 = (short) (b18 - 1);
                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                        b(s17, (byte) s17, b18, objArr101);
                                        obj25 = cls22.getMethod((java.lang.String) objArr101[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj25);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr100)).longValue();
                                    long j36 = (((((434 * longValue11) + 270977889888L) + ((~((j7 | 627263633) | longValue11)) * 433)) + (((~((~longValue11) | j)) | 627263633) * (-433))) + (((~(longValue11 | (-627263634))) | (~(j | 627263633))) * 433)) - 998266548;
                                    int i18 = ~((-848674858) | i8);
                                    if (((((int) (j36 >> 32)) & ((((~(918405161 | i)) | (-2009066028) | i18) * (-470)) + 2068998370 + ((i18 | (~((-1090660867) | i))) * 470))) | (((int) j36) & (((~((-436274861) | i8)) * 52) + 409410145 + (((~((-447284989) | i8)) | (~(989941421 | i8)) | 11010128) * (-52)) + (((~(447284988 | i8)) | 553666561) * 52)))) != 0) {
                                        i4 = i3 + 90;
                                        break;
                                    }
                                    i3++;
                                }
                                if (i4 != 0) {
                                    java.lang.Object[] objArr102 = {new int[]{i}, new int[]{i4 ^ i}, null, new int[1]};
                                    java.lang.Object[] objArr103 = {1916120371, 16, java.lang.Integer.valueOf(((((~(462970188 | i8)) | 69664899) * (-108)) - 1628528543) + (((~((-246355332) | i)) | 286279756 | (~(i8 | 246355331))) * 54) + ((i | 286279756) * 54))};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj26 == null) {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) android.view.KeyEvent.keyCodeFromString(str2));
                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                        b(653, (byte) (-$$a[16]), r2[14], objArr104);
                                        obj26 = cls23.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                                    }
                                    ((int[]) objArr102[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr103)).intValue();
                                    return objArr102;
                                }
                                try {
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    c("朾杌茪\udc75\udec8杁잌\udf49ᅿ傂\ued57凶譸쪷箘\uda35ז", 1 - android.text.TextUtils.getOffsetAfter(str2, 0), objArr105);
                                    try {
                                        java.lang.Object[] objArr106 = {((java.lang.String) objArr105[0]).intern()};
                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj27 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1921, (char) android.view.View.combineMeasuredStates(0, 0));
                                            byte b19 = $$a[14];
                                            short s18 = (short) (b19 - 1);
                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                            b(s18, (byte) s18, b19, objArr107);
                                            obj27 = cls24.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj27);
                                        }
                                        str4 = (java.lang.String) ((java.lang.reflect.Method) obj27).invoke(null, objArr106);
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    if (str4 != null) {
                                        int i19 = getAid + 61;
                                        SdkCoreAlternateContactlessPaymentDataImpl = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            strArr = new java.lang.String[0];
                                            android.view.ViewConfiguration.getMinimumFlingVelocity();
                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                            c("ູ\u0eda얝楂顩툹\uf547\ued8e磢ᘻ塩挻\ue2bc谇캤", 0, objArr108);
                                            strArr[1] = ((java.lang.String) objArr108[0]).intern();
                                        } else {
                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                            c("ູ\u0eda얝楂顩툹\uf547\ued8e磢ᘻ塩挻\ue2bc谇캤", 1 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr109);
                                            strArr = new java.lang.String[]{((java.lang.String) objArr109[0]).intern()};
                                        }
                                        for (int i20 = 0; i20 <= 0; i20++) {
                                            if (str4.contains(strArr[i20])) {
                                                getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 105) % 128;
                                            }
                                        }
                                        i5 = 0;
                                        if (i5 != 0) {
                                            java.lang.Object[] objArr110 = {new int[]{i}, new int[]{i5 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr111 = {1916120371, 16, java.lang.Integer.valueOf((((((-743014433) | i8) * (-490)) - 1888651131) + (((~(i | 37122015)) | (-780136448)) * 490)) - 687072480)};
                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj28 == null) {
                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r4[14], objArr112);
                                                obj28 = cls25.getMethod((java.lang.String) objArr112[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                            }
                                            ((int[]) objArr110[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr111)).intValue();
                                            return objArr110;
                                        }
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        c("朾杌茪\udc75\udec8杁잌\udf49ᅿ傂\ued57凶譸쪷箘\uda35ז", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr113);
                                        java.lang.Object[] objArr114 = {((java.lang.String) objArr113[0]).intern()};
                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj29 == null) {
                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf(str2, str2), 1920 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                            byte b20 = $$a[14];
                                            short s19 = (short) (b20 - 1);
                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                            b(s19, (byte) s19, b20, objArr115);
                                            obj29 = cls26.getMethod((java.lang.String) objArr115[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                        }
                                        java.lang.String str9 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr114);
                                        if (str9 != null) {
                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                            c("ູ\u0eda얝楂顩툹\uf547\ued8e磢ᘻ塩挻\ue2bc谇캤", android.text.TextUtils.getCapsMode(str2, 0, 0) + 1, objArr116);
                                            java.lang.String[] strArr7 = {((java.lang.String) objArr116[0]).intern()};
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 > 0) {
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, null, null, "\u009f\u0085\u0092\u008f\u0084\u0085\u009f\u0092\u0090\u0092\u0086\u009f", objArr117);
                                                    java.lang.String intern36 = ((java.lang.String) objArr117[0]).intern();
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    a(127 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), null, null, "\u009f\u0093\u0088\u0096\u009f\u0085\u0092\u008f\u0084\u0085\u009f\u0092\u0090\u0092\u0086\u009f", objArr118);
                                                    java.lang.String intern37 = ((java.lang.String) objArr118[0]).intern();
                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                    c("倲倝ው㪂伤臹䦂兑♧섣\u0ba0\udfe5밹孙鵬呱㋖튆❝⩼裍", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr119);
                                                    java.lang.String intern38 = ((java.lang.String) objArr119[0]).intern();
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    a(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u009f\u0093\u0088\u0096\u0089\u009f", objArr120);
                                                    java.lang.String intern39 = ((java.lang.String) objArr120[0]).intern();
                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                    c("뜌뜣㞚⇋橤骨蒴鱠셌\ue43eშኔ嬆縆蘧饀", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr121);
                                                    java.lang.String intern40 = ((java.lang.String) objArr121[0]).intern();
                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                    a(android.view.KeyEvent.normalizeMetaState(0) + 127, null, null, "\u009f\u0090 \u0094\u008c\u009f\u0093\u0088\u0096\u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr122);
                                                    java.lang.String intern41 = ((java.lang.String) objArr122[0]).intern();
                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                    a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, null, "\u009f\u0094\u0087\u0092\u0089\u0085\u0088\u0092\u0087\u009f\u0093\u0088\u0096\u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr123);
                                                    java.lang.String intern42 = ((java.lang.String) objArr123[0]).intern();
                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                    c("\udf5b\udf74\u0ccfؙ儱뵺葫鲿ꤛ\udf6b㜺ቋ㍀䕞ꆴ駈붥첏ᯁ\ue7d3", (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr124);
                                                    java.lang.String intern43 = ((java.lang.String) objArr124[0]).intern();
                                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, null, null, "\u009f\u0090\u0084\u0084\u008b\u0099\u0086\u0094\u0094\u0093\u0099\u0094\u009b\u009f\u008b\u0089\u008e\u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr125);
                                                    java.lang.String intern44 = ((java.lang.String) objArr125[0]).intern();
                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                    c("ꪎꪡṔ摗䎪\udf34涟畋\udcce췰啴﮿䚞埃쎼瀪젽", (android.os.Process.myTid() >> 22) + 1, objArr126);
                                                    java.lang.String intern45 = ((java.lang.String) objArr126[0]).intern();
                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                    c("珿珐귕뛾\uf02d\u0d97\uda24싱פ繶蟙䱄龸", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr127);
                                                    java.lang.String intern46 = ((java.lang.String) objArr127[0]).intern();
                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                    c("在圇ⱥ㢒熛菽ꄻ릳ⅾￍল㝇", android.text.TextUtils.getCapsMode(str2, 0, 0) + 1, objArr128);
                                                    java.lang.String[] strArr8 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr128[0]).intern()};
                                                    for (int i22 = 0; i22 < 12; i22++) {
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        sb.append(strArr8[i22]);
                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                        c("䧗䦤뗻㿨\ue803⯸", 1 - android.text.TextUtils.getOffsetAfter(str2, 0), objArr129);
                                                        sb.append(((java.lang.String) objArr129[0]).intern());
                                                        java.lang.Object[] objArr130 = {sb.toString()};
                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                        if (obj30 == null) {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, android.view.View.combineMeasuredStates(0, 0) + 3161, (char) (33098 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                            byte b21 = $$a[14];
                                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                            b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, b21, (byte) (b21 - 1), objArr131);
                                                            obj30 = cls27.getMethod((java.lang.String) objArr131[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                                        }
                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr130)).longValue();
                                                        long j37 = (434 * longValue12) + 456155569440L + ((~(j7 | 1055915669 | longValue12)) * 433) + (((~((~longValue12) | j)) | 1055915669) * (-433)) + (((~(longValue12 | (-1055915670))) | (~(j | 1055915669))) * 433) + 2051350573;
                                                        if (((((int) (j37 >> 32)) & ((((~(2118123518 | i8)) | (~((-739617367) | i))) * (-272)) + 228783146 + (((~(2117970806 | i)) | 152712) * (-272)) + (((~((-2117970807) | i)) | (-739770079)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j37) & ((((2753600 | r10) * (-712)) - 217974291) + (((~((-2753601) | i8)) | (~((-1509957675) | i))) * (-712)) + (((~((-1512711275) | i8)) | (-75484865)) * 712)))) != 0) {
                                                            i6 = i22 + 110;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    if (str9.contains(strArr7[i21])) {
                                                        break;
                                                    }
                                                    i21++;
                                                }
                                            }
                                        }
                                        i6 = 0;
                                        if (i6 != 0) {
                                            getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 103) % 128;
                                            java.lang.Object[] objArr132 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr133 = {1916120371, 16, java.lang.Integer.valueOf(((((~(i | 505495442)) | 203830077) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1802131719) + (((~(505495442 | i8)) | 393261) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj31 == null) {
                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr134);
                                                obj31 = cls28.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                            }
                                            ((int[]) objArr132[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr133)).intValue();
                                            return objArr132;
                                        }
                                        long[] jArr = {472001035};
                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                        c("䉲䉝⽘丮犥\uf546⼠㟨㐥ﲶ缓륖깶曋\ue983㊊₁\uef04叶䳟髑", android.view.KeyEvent.normalizeMetaState(0) + 1, objArr135);
                                        java.lang.Object[] objArr136 = {((java.lang.String) objArr135[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                        if (obj32 == null) {
                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(38 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 3097 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                            byte b22 = $$a[14];
                                            short s20 = (short) (b22 - 1);
                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                            b(s20, (byte) s20, b22, objArr137);
                                            obj32 = cls29.getMethod((java.lang.String) objArr137[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj32);
                                        }
                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr136)).longValue();
                                        long j38 = j7 | 1468843612;
                                        long j39 = (((((370 * longValue13) - 543472136810L) + (((longValue13 | (-1468843613)) | j7) * (-369))) + (((~j38) | longValue13) * (-369))) + (((~(j38 | longValue13)) | ((~((~longValue13) | (-1468843613))) | (~(j | (-1468843613))))) * 369)) - 441804297;
                                        int i23 = (-5909089) | i8;
                                        int i24 = ((((int) (j39 >> 32)) & ((((((~i23) | 1443135499) * (-828)) + 1754752898) + (i23 * (-828))) + 597757568)) | (((int) j39) & (((((~(26182212 | i)) | 1435848993) * 398) - 1400369075) + (((~(26182212 | i8)) | 1435848993) * 398)))) != 0 ? 240 : 0;
                                        if (i24 != 0) {
                                            java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i24 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr139 = {1916120371, 16, java.lang.Integer.valueOf((((((~(i | (-353208767))) | (-356116754)) * (-948)) - 2047446157) + ((~((-352946449) | i8)) * (-948))) - 248678412)};
                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj33 == null) {
                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 2713 - android.text.TextUtils.getTrimmedLength(str2), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr140);
                                                obj33 = cls30.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                            }
                                            ((int[]) objArr138[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr139)).intValue();
                                            return objArr138;
                                        }
                                        long[] jArr2 = {472001035};
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        a(android.graphics.Color.red(0) + 127, null, null, "\u0095\u008f\u0088\u0085\u0084\u008d\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr141);
                                        try {
                                            bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr141[0]).intern()));
                                            j4 = 0;
                                        } catch (java.io.IOException unused2) {
                                            bufferedInputStream2 = null;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            bufferedInputStream = null;
                                        }
                                        while (true) {
                                            try {
                                                int read = bufferedInputStream2.read();
                                                if (read != -1) {
                                                    j4 = ((j4 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                    for (int i25 = 0; i25 <= 0; i25++) {
                                                        if (j4 == jArr2[i25]) {
                                                            int i26 = i25 + 1;
                                                            try {
                                                                bufferedInputStream2.close();
                                                            } catch (java.lang.Exception unused3) {
                                                            }
                                                            if (i26 != 0) {
                                                                SdkCoreAlternateContactlessPaymentDataImpl = (getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                                java.lang.Object[] objArr142 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr143 = {1916120371, 16, java.lang.Integer.valueOf(((((~(i | (-138259783))) | ((~((-847249425) | i8)) | 137923904)) * (-68)) - 972685437) + ((~((-335879) | i8)) * (-68)) + (((~(138259782 | i8)) | (-847585303)) * 68))};
                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj34 == null) {
                                                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                                    b(653, (byte) (-$$a[16]), r2[14], objArr144);
                                                                    obj34 = cls31.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                }
                                                                ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr143)).intValue();
                                                                return objArr142;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (java.io.IOException unused4) {
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                bufferedInputStream = bufferedInputStream2;
                                                if (bufferedInputStream == null) {
                                                    throw th;
                                                }
                                                try {
                                                    bufferedInputStream.close();
                                                    throw th;
                                                } catch (java.lang.Exception unused5) {
                                                    throw th;
                                                }
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                break;
                                            } catch (java.lang.Exception unused6) {
                                            }
                                        }
                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                        if (obj35 == null) {
                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('O' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1890, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3552));
                                            byte b23 = $$a[14];
                                            short s21 = (short) (b23 - 1);
                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                            b(s21, (byte) s21, b23, objArr145);
                                            obj35 = cls32.getMethod((java.lang.String) objArr145[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj35);
                                        }
                                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, null)).longValue();
                                        long j40 = ~longValue14;
                                        long j41 = j40 | j7;
                                        int i27 = i24;
                                        long j42 = ((((((-112) * longValue14) + 192972908576L) + (((~j41) | (-1722972398)) * 226)) + ((((~(1722972397 | longValue14)) | (~(j | 1722972397))) | (~((-1722972398) | j41))) * (-113))) + ((~(j40 | j)) * 113)) - 156275982;
                                        int i28 = ~(1302328170 | i);
                                        if (((((int) j42) & (((((~((-1327548786) | i8)) | 100698160) * 529) - 1520785380) + (((~((-1327548786) | i)) | 109677624) * 529))) | (((int) (j42 >> 32)) & ((((~((-1301242697) | i8)) | 134898240 | i28) * (-252)) + 1071844522 + ((i28 | (~((-1166344457) | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)))) != 0) {
                                            java.lang.Object[] objArr146 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i27}, null, new int[1]};
                                            java.lang.Object[] objArr147 = {1916120371, 16, java.lang.Integer.valueOf(((((~((-560069359) | i8)) | (~(702939119 | i))) * (-831)) - 1502291454) + ((~((-553682959) | i)) * (-1662)) + (((~(i | 560069358)) | (~((-149256162) | i8)) | (~(149256161 | i))) * 831))};
                                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj36 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r3[14], objArr148);
                                                obj36 = cls33.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                            }
                                            ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr147)).intValue();
                                            return objArr146;
                                        }
                                        java.lang.Object[] objArr149 = {2};
                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                        if (obj37 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2364, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            byte b24 = $$a[14];
                                            short s22 = (short) (b24 - 1);
                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                            b(s22, (byte) s22, b24, objArr150);
                                            obj37 = cls34.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj37);
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr149)).longValue();
                                        long j43 = ((334 * longValue15) - 395437664595L) + (((~(longValue15 | j)) | (~(j7 | (-1191077305)))) * 333) + (((~(j7 | longValue15)) | (~(j | (-1191077305)))) * 333) + 216832895;
                                        if (((((int) (j43 >> 32)) & ((((~((-1151489029) | i)) | 16777296) * 449) + 1928585734 + (((~((-1151489029) | i8)) | 16777296) * 449))) | (((int) j43) & ((((~((-137132251) | i)) | 1300094159) * (-465)) + 495111099 + (((~(1300094159 | i)) | (-137132251)) * 930) + ((i | (-8209)) * 465)))) == 2) {
                                            java.lang.Object[] objArr151 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                            java.lang.Object[] objArr152 = {1916120371, 16, java.lang.Integer.valueOf((((~((-129372086) | i)) | 86379685 | (~(579953434 | i))) * (-754)) + 273404757 + (((~(i | (-86379686))) | (~(666333119 | i8))) * (-754)) + (((-129372086) | i8) * 754))};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj38 == null) {
                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str2, 0, 0) + 50, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr153);
                                                obj38 = cls35.getMethod((java.lang.String) objArr153[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                            }
                                            ((int[]) objArr151[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr152)).intValue();
                                            return objArr151;
                                        }
                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                        if (obj39 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter(str2, 0), android.view.View.resolveSize(0, 0) + 3197, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                            byte b25 = $$a[14];
                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                            b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, b25, (byte) (b25 - 1), objArr154);
                                            obj39 = cls36.getMethod((java.lang.String) objArr154[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj39);
                                        }
                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, null)).longValue();
                                        long j44 = ~longValue16;
                                        long j45 = ~(longValue16 | j);
                                        long j46 = (((-195) * longValue16) - 23995718093L) + (((~(j44 | 61370123)) | j45) * (-196)) + ((61370123 | longValue16) * 392) + (((~((-61370124) | j44)) | j45) * 196) + 34875238;
                                        if (((((int) j46) & ((((~((-713174059) | i)) | (~(2144566827 | i8))) * (-318)) + 1870236951 + (((~(802385451 | i)) | 1342181376) * (-318)) + (((~((-802385452) | i)) | (-2055355435)) * 318))) | (((int) (j46 >> 32)) & ((((~((-1613506060) | i)) | (~((-286261653) | i8))) * 920) + 2038856378 + (((~(462541300 | i8)) | 1613506059) * 920) + (((~((-1613506060) | i8)) | (~(2076047359 | i)) | (~((-286261653) | i))) * 920)))) != 0) {
                                            java.lang.Object[] objArr155 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr156 = {1916120371, 16, java.lang.Integer.valueOf(((((~(i | 755829538)) | 46174288) * 305) - 1989722672) + (((~(755829538 | i8)) | 46504018) * 305))};
                                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj40 == null) {
                                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2712 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr157);
                                                obj40 = cls37.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                            }
                                            ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr156)).intValue();
                                            return objArr155;
                                        }
                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                        if (obj41 == null) {
                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3197, (char) android.view.View.combineMeasuredStates(0, 0));
                                            byte b26 = $$a[14];
                                            short s23 = (short) (b26 - 1);
                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                            b(s23, (byte) s23, b26, objArr158);
                                            obj41 = cls38.getMethod((java.lang.String) objArr158[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj41);
                                        }
                                        long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, null)).longValue();
                                        long j47 = (((-949) * longValue17) - 74013624126L) + (((~(j | (-77991175))) | (~((~longValue17) | j7))) * 1900) + (((~(j7 | 77991174)) | (~(longValue17 | j))) * (-950)) + (((~(j7 | longValue17)) | (~(j | 77991174))) * 950) + 874878716;
                                        int i29 = (int) (j47 >> 32);
                                        int i30 = (int) j47;
                                        int i31 = ~(2035482549 | i);
                                        if (((i29 & ((((-584757016) | i) * 140) + 1570271746 + (((~((-584757016) | i8)) | 545260546) * (-280)) + (((~(2021983426 | i8)) | (-2061479896) | (~((-545260547) | i))) * 140))) | (i30 & ((((((~((-1900211109) | i8)) | 822258336) | i31) * (-252)) - 386555947) + ((i31 | (~((-1077952773) | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)))) != 0) {
                                            java.lang.Object[] objArr159 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr160 = {1916120371, 16, java.lang.Integer.valueOf((((((~((-860448424) | i8)) | 843580448) | r1) * (-502)) - 1015051889) + (((~(i | (-134254929))) | (~((-16867976) | i8))) * 502))};
                                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj42 == null) {
                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r3[14], objArr161);
                                                obj42 = cls39.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                            }
                                            ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr160)).intValue();
                                            return objArr159;
                                        }
                                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                        if (obj43 == null) {
                                            java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 44, android.view.KeyEvent.getDeadChar(0, 0) + 2836, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            byte b27 = $$a[14];
                                            short s24 = (short) (b27 - 1);
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            b(s24, (byte) s24, b27, objArr162);
                                            obj43 = cls40.getMethod((java.lang.String) objArr162[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj43);
                                        }
                                        long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                                        long j48 = ~longValue18;
                                        long j49 = ~(j48 | j);
                                        long j50 = (((((longValue18 * 246) + 68605316764L) + (((~(j48 | j7)) | (~(j48 | (-281169331)))) * (-245))) + ((-245) * j49)) + (((-281169331) | j49) * 245)) - 525125424;
                                        if (((((int) (j50 >> 32)) & ((((~((-1342011823) | i8)) | 95181228) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106 + ((~((-95181229) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~((-95214589) | i8)) | 33360 | (~((-1246830595) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) j50) & ((((((~(197601342 | i)) | (~((-1239625068) | i8))) | r6) * (-516)) - 623896311) + (((~(1273441663 | i)) | (~((-33816597) | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~((-197601343) | i8)) | 33816596) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) != 0) {
                                            java.lang.Object[] objArr163 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr164 = {1916120371, 16, java.lang.Integer.valueOf(((((~((-462643256) | i8)) | (~(532116159 | i))) * (-831)) - 215717392) + ((~((-285433896) | i)) * (-1662)) + (((~(i | 246682264)) | (~((-246682265) | i8)) | (~(462643255 | i))) * 831))};
                                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj44 == null) {
                                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, android.view.KeyEvent.keyCodeFromString(str2) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr165);
                                                obj44 = cls41.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                            }
                                            ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr164)).intValue();
                                            return objArr163;
                                        }
                                        long[] jArr3 = {624887784092251L};
                                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                                        c("䉲䉝⽘丮犥\uf546⼠㟨㐥ﲶ缓륖깶曋\ue983㊊₁\uef04叶䳟髑", -android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr166);
                                        java.lang.Object[] objArr167 = {((java.lang.String) objArr166[0]).intern(), 3, 2251799813685247L, jArr3};
                                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                        if (obj45 == null) {
                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3096, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            byte b28 = $$a[14];
                                            short s25 = (short) (b28 - 1);
                                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                                            b(s25, (byte) s25, b28, objArr168);
                                            obj45 = cls42.getMethod((java.lang.String) objArr168[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj45);
                                        }
                                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, objArr167)).longValue();
                                        long j51 = ~longValue19;
                                        long j52 = j51 | j7;
                                        long j53 = longValue19 | (-309359755);
                                        long j54 = ~(j53 | j);
                                        long j55 = (((((longValue19 * 253) - 78268018015L) + ((((~j52) | (~(j51 | 309359754))) | j54) * (-252))) + (j53 * (-252))) + ((j54 | (~((-309359755) | j52))) * 252)) - 1601288155;
                                        if (((((int) (j55 >> 32)) & (((((-290092029) | i) * (-50)) - 649049182) + (((~((-4211109) | i8)) | (~((-1723107332) | i))) * 50) + (((~((-1727318440) | i8)) | 4211108 | (~((-290092029) | i8))) * 50))) | (((int) j55) & (((((~(1444831926 | i8)) | (-1451126719)) * 98) - 1204948049) + (((~((-7605517) | i8)) | 1444831926 | (~(7605516 | i))) * (-49)) + (((~(1444831926 | i)) | 1443521202) * 49)))) != 0) {
                                            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 99) % 128;
                                            java.lang.Object[] objArr169 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr170 = {1916120371, 16, java.lang.Integer.valueOf((((~(104637711 | i8)) | (~((-813963232) | i))) * 1900) + 1159947941 + (((~(813963231 | i8)) | (~((-104637712) | i))) * (-950)) + (((~(i | 813963231)) | (~((-104637712) | i8))) * 950))};
                                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj46 == null) {
                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, (android.os.Process.myPid() >> 22) + 2713, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr171);
                                                obj46 = cls43.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                            }
                                            ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr170)).intValue();
                                            return objArr169;
                                        }
                                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                                        c("䬡䬎썦ی麏붳⠃ヒ㴺ო㟻빮꜠諠ꄥ", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr172);
                                        java.lang.Object[] objArr173 = {((java.lang.String) objArr172[0]).intern()};
                                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj47 == null) {
                                            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.getCapsMode(str2, 0, 0) + 3161, (char) (android.text.TextUtils.indexOf(str2, str2, 0, 0) + 33099));
                                            byte b29 = $$a[14];
                                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                                            b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, b29, (byte) (b29 - 1), objArr174);
                                            obj47 = cls44.getMethod((java.lang.String) objArr174[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj47);
                                        }
                                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr173)).longValue();
                                        long j56 = ~longValue20;
                                        long j57 = (407 * longValue20) + 466135009605L + (((~(j56 | j)) | (~(j7 | (-1150950641) | longValue20))) * (-406)) + ((~(j56 | j7 | (-1150950641))) * (-406)) + (((~(j | 1150950640)) | (~(j7 | longValue20))) * 406) + 2146385544;
                                        if (((((int) (j57 >> 32)) & ((((~((-821047007) | i8)) | (-616179405) | (~(821047006 | i))) * (-564)) + 1018436946 + ((~((-67764225) | i)) * 1128) + (((~((-616179405) | i8)) | (-888811231)) * 564))) | (((int) j57) & ((((~(667535010 | i8)) | 769691399) * (-983)) + 34846678 + (((~(769691399 | i8)) | 34160800) * 983)))) != 0) {
                                            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 87) % 128;
                                            java.lang.Object[] objArr175 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr176 = {1916120371, 16, java.lang.Integer.valueOf(((636788639 | i) * 140) + 67394343 + (((~(636788639 | i8)) | 147488) * (-280)) + (((~(i | (-147489))) | (~(72536880 | i8)) | 564399247) * 140))};
                                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj48 == null) {
                                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                                                java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr177);
                                                obj48 = cls45.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                            }
                                            ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr176)).intValue();
                                            return objArr175;
                                        }
                                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                        if (obj49 == null) {
                                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 28, 2184 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (59514 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                            byte b30 = $$a[14];
                                            short s26 = (short) (b30 - 1);
                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                            b(s26, (byte) s26, b30, objArr178);
                                            obj49 = cls46.getMethod((java.lang.String) objArr178[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj49);
                                        }
                                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, null)).longValue();
                                        long j58 = ~longValue21;
                                        long j59 = ~(j58 | j);
                                        long j60 = (((((longValue21 * 246) + 111267736860L) + (((~(j58 | j7)) | (~(j58 | (-456015315)))) * (-245))) + ((-245) * j59)) + (((-456015315) | j59) * 245)) - 416075271;
                                        if (((((int) (j60 >> 32)) & ((((~(1684024824 | i)) | (-246798414)) * 56) + 1201805154 + (((~((-246798414) | i8)) | 1684024824) * 56))) | (((int) j60) & ((((((~(14708483 | i)) | 1409908900) | (~((-1422517927) | i))) * (-754)) - 805828501) + (((~((-1409908901) | i)) | (~((-12609027) | i8))) * (-754)) + ((14708483 | i8) * 754)))) != 0) {
                                            java.lang.Object[] objArr179 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr180 = {1916120371, 16, java.lang.Integer.valueOf(((((~((-684675575) | i)) | 679956774) * (-283)) - 136435759) + ((~(i | (-4718801))) * 283))};
                                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj50 == null) {
                                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r3[14], objArr181);
                                                obj50 = cls47.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                            }
                                            ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr180)).intValue();
                                            return objArr179;
                                        }
                                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                        if (obj51 == null) {
                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.MotionEvent.axisFromString(str2), android.text.TextUtils.indexOf(str2, str2, 0) + 2972, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            byte b31 = $$a[14];
                                            short s27 = (short) (b31 - 1);
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            b(s27, (byte) s27, b31, objArr182);
                                            obj51 = cls48.getMethod((java.lang.String) objArr182[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj51);
                                        }
                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                                        long j61 = ~(j7 | (-284677265));
                                        long j62 = (((((339 * longValue22) - 95936237968L) + ((((~((~longValue22) | 284677264)) | j61) | (~(j | 284677264))) * (-338))) + ((~(longValue22 | (-284677265))) * 338)) + (((~((longValue22 | 284677264) | j)) | j61) * 338)) - 2137379028;
                                        if (((((int) (j62 >> 32)) & (((((~((-1352698650) | i8)) | 84527761) * 226) - 2055567968) + (((~((-84527762) | i)) | 84492416 | (~((-1352663305) | i8))) * (-113)) + ((~((-1352698650) | i)) * 113))) | (((int) j62) & (((((~((-77599367) | i8)) | (~((-1514825777) | i))) * (-272)) - 1374151227) + (((~(1515908465 | i)) | (-1593507832)) * (-272)) + (((~((-1515908466) | i)) | 78682055) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)))) != 0) {
                                            java.lang.Object[] objArr183 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr184 = {1916120371, 16, java.lang.Integer.valueOf((((~((-42992465) | i8)) | (-666333056)) * (-591)) + 1682223694 + ((i | (-42992465)) * 591))};
                                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj52 == null) {
                                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), android.view.View.combineMeasuredStates(0, 0) + 2713, (char) (android.os.Process.myPid() >> 22));
                                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r3[14], objArr185);
                                                obj52 = cls49.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                            }
                                            ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr184)).intValue();
                                            return objArr183;
                                        }
                                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                        if (obj53 == null) {
                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 26, 2158 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 56400));
                                            byte b32 = $$a[14];
                                            short s28 = (short) (b32 - 1);
                                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                                            b(s28, (byte) s28, b32, objArr186);
                                            obj53 = cls50.getMethod((java.lang.String) objArr186[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj53);
                                        }
                                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                                        long j63 = longValue23 | j;
                                        long j64 = ((((((-929) * longValue23) + 41965147856L) + (((~j63) | 90442128) * (-465))) + (((~(j | 90442128)) | longValue23) * 930)) + ((90442128 | j63) * 465)) - 475375891;
                                        if (((((int) (j64 >> 32)) & (((((~((-9994232) | i8)) | 1427232179) * 226) - 2055567968) + (((~((-1427232180) | i)) | 1426161664 | (~((-8923717) | i8))) * (-113)) + ((~((-9994232) | i)) * 113))) | (((int) j64) & ((((~((-62166698) | i)) | 1499393107) * (-318)) + 1217552539 + (((~(1499393107 | i)) | (~((-1481271379) | i8))) * 318) + (((~(1543438075 | i8)) | (~((-1481271379) | i))) * 318)))) != 0) {
                                            java.lang.Object[] objArr187 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr188 = {1916120371, 16, java.lang.Integer.valueOf(((((-69231146) | i) * (-627)) - 1220172852) + (((~((-320278679) | i)) | 389046841) * (-627)) + (((~(i | 389046841)) | (~(320278678 | i8))) * 627))};
                                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj54 == null) {
                                                java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r3[14], objArr189);
                                                obj54 = cls51.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                            }
                                            ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr188)).intValue();
                                            return objArr187;
                                        }
                                        java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                        if (obj55 == null) {
                                            java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 35, 838 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                            byte b33 = $$a[14];
                                            short s29 = (short) (b33 - 1);
                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                            b(s29, (byte) s29, b33, objArr190);
                                            obj55 = cls52.getMethod((java.lang.String) objArr190[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj55);
                                        }
                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                        long j65 = (530 * longValue24) + 227641509988L + (((~(longValue24 | 429512281)) | (~(j7 | 429512281))) * 529) + (((~longValue24) | (~(j | 429512281))) * 529) + 1531240621;
                                        int i32 = ((((int) (j65 >> 32)) & (((((~((-1006067744) | i8)) * (-560)) + 344606090) + ((~((-295772171) | i)) * (-560))) + (((~((-1851673142) | i8)) | 1141377568) * 560))) | (((int) j65) & (((((812347868 | i) * (-859)) + 233912710) + (((~(812347868 | i8)) | (~((-812265561) | i))) * 859)) + (((~((-2045393018) | i8)) | 1233127457) * 859)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                        if (i32 != i) {
                                            java.lang.Object[] objArr191 = {new int[]{i}, new int[]{i32}, null, new int[1]};
                                            int i33 = ~(i | (-265729));
                                            java.lang.Object[] objArr192 = {1916120371, 16, java.lang.Integer.valueOf((((((~(336866860 | i8)) | 709591248) | i33) * (-252)) - 862306417) + ((i33 | (~(1046458108 | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj56 == null) {
                                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r3[14], objArr193);
                                                obj56 = cls53.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                            }
                                            ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr192)).intValue();
                                            java.lang.Object[] objArr194 = {objArr191};
                                            java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                            if (obj57 == null) {
                                                java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52, 3236 - android.view.MotionEvent.axisFromString(str2), (char) android.text.TextUtils.getTrimmedLength(str2));
                                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r5[14], objArr195);
                                                obj57 = cls54.getMethod((java.lang.String) objArr195[0], java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj57);
                                            }
                                            ((java.lang.reflect.Method) obj57).invoke(obj, objArr194);
                                            return objArr191;
                                        }
                                        java.lang.Object[] objArr196 = {java.lang.Integer.valueOf(i), obj, 1916120371, 0};
                                        java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                        if (obj58 == null) {
                                            obj58 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3289, (char) android.graphics.Color.alpha(0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3237, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj58);
                                        }
                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj58).newInstance(objArr196);
                                        try {
                                            java.lang.Object[] objArr197 = new java.lang.Object[1];
                                            a(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u0086\u0092\u0094\u008b\u008a§\u008c\u0083\u0093\u0092\u0085\u008c\u0092\u0098\u0092¦", objArr197);
                                            java.lang.Class<?> cls55 = java.lang.Class.forName(((java.lang.String) objArr197[0]).intern());
                                            java.lang.Object[] objArr198 = new java.lang.Object[1];
                                            c("榳槀嶚瘝c쵦ﮧ\ue372ῳ", 1 - android.graphics.Color.argb(0, 0, 0, 0), objArr198);
                                            cls55.getMethod(((java.lang.String) objArr198[0]).intern(), null).invoke(newInstance, null);
                                            java.lang.Object[] objArr199 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                            java.lang.Object[] objArr200 = {1916120371, 0, java.lang.Integer.valueOf((((~((-94176388) | i8)) | (-615149133)) * (-865)) + 1039467174 + ((~(i | 94176387)) * 865) + (((~((-615149133) | i8)) | (~(94176387 | i8))) * 865))};
                                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj59 == null) {
                                                java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) ((-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                b(653, (byte) (-$$a[16]), r2[14], objArr201);
                                                obj59 = cls56.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj59);
                                            }
                                            ((int[]) objArr199[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj59).invoke(null, objArr200)).intValue();
                                            return objArr199;
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause2 = th5.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th5;
                                        }
                                    }
                                    java.lang.Object[] objArr202 = {((java.lang.String) objArr[0]).intern()};
                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj60 == null) {
                                        java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 1921, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        byte b34 = $$a[14];
                                        short s30 = (short) (b34 - 1);
                                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                                        b(s30, (byte) s30, b34, objArr203);
                                        obj60 = cls57.getMethod((java.lang.String) objArr203[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj60);
                                    }
                                    java.lang.Object invoke6 = ((java.lang.reflect.Method) obj60).invoke(null, objArr202);
                                    if (invoke6 != null) {
                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                        a(android.view.View.combineMeasuredStates(0, 0) + 127, null, null, "\u0083\u0093\u0088\u0093\u0093\u008e\u008b", objArr204);
                                        if (invoke6.equals(((java.lang.String) objArr204[0]).intern())) {
                                            java.lang.Object[] objArr205 = new java.lang.Object[1];
                                            c("\uf51c\uf56c╉賩碡㞁\uf60f\ueedb荁\uf6fb뷓怮ᤇ泅⬘\uebfa韲\ue50f鄰闬ⶓ፵ὠ῏멽覫蚄", 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr205);
                                            try {
                                                java.lang.Object[] objArr206 = {((java.lang.String) objArr205[0]).intern()};
                                                java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj61 == null) {
                                                    java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.blue(0) + 1921, (char) android.text.TextUtils.getOffsetAfter(str2, 0));
                                                    byte b35 = $$a[14];
                                                    short s31 = (short) (b35 - 1);
                                                    java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                    b(s31, (byte) s31, b35, objArr207);
                                                    obj61 = cls58.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                                }
                                                java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj61).invoke(null, objArr206);
                                                if (str10 != null && (parseInt = java.lang.Integer.parseInt(str10)) != 0) {
                                                    i5 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                    if (i5 != 0) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th6) {
                                                java.lang.Throwable cause3 = th6.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th6;
                                            }
                                        }
                                    }
                                    i5 = 0;
                                    if (i5 != 0) {
                                    }
                                } catch (java.lang.Throwable th7) {
                                    java.lang.Throwable cause4 = th7.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th7;
                                }
                                objArr = new java.lang.Object[1];
                                a(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "\u0093\u0084\u0091\u0094\u0092\u0086¡\u008e\u0089\u008c\u008f\u0098\u0089\u008c\u0090\u0088\u0093\u0088", objArr);
                            }
                        } else {
                            obj8 = invoke;
                            j = j6;
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr208 = {invoke2, 42};
                            java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj62 == null) {
                                java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str) + 29, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2594, (char) android.view.View.MeasureSpec.getSize(0));
                                byte b36 = $$a[14];
                                short s32 = (short) (b36 - 1);
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                b(s32, (byte) s32, b36, objArr209);
                                obj62 = cls59.getMethod((java.lang.String) objArr209[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj62);
                            }
                            long j66 = ~((java.lang.Long) ((java.lang.reflect.Method) obj62).invoke(null, objArr208)).longValue();
                            long j67 = j66 | j7;
                            long j68 = ((r10 * (-49)) - 39670495401L) + ((j | (-777852851)) * (-50)) + (((~(j67 | (-777852851))) | (~(j66 | 777852850 | j))) * 50) + (((~j67) | (~((-777852851) | j66)) | (~(j7 | (-777852851)))) * 50) + 2034953375;
                        }
                        if (obj8 != null) {
                            java.lang.Object[] objArr210 = {obj8, 42};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj63 == null) {
                                java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 28, 2594 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                byte b37 = $$a[14];
                                short s33 = (short) (b37 - 1);
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                b(s33, (byte) s33, b37, objArr211);
                                obj63 = cls60.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                            }
                            long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr210)).longValue();
                            long j69 = ~((~longValue25) | j);
                            long j70 = ((-574) * longValue25) + 407952258854L + (((~(j7 | 710718220)) | j69) * 1150) + (((~(j7 | longValue25)) | j69) * (-575)) + (((~(j7 | (-710718221))) | (~(j | 710718220))) * 575) + 1967818745;
                            int i34 = (-52562694) | i8;
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr212 = {invoke2, 42};
                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj64 == null) {
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 28, android.text.TextUtils.indexOf(str, str, 0) + 2594, (char) android.text.TextUtils.indexOf(str, str, 0, 0));
                                byte b38 = $$a[14];
                                short s34 = (short) (b38 - 1);
                                java.lang.Object[] objArr213 = new java.lang.Object[1];
                                b(s34, (byte) s34, b38, objArr213);
                                obj64 = cls61.getMethod((java.lang.String) objArr213[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                            }
                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr212)).longValue();
                            long j71 = ~longValue26;
                            long j72 = ((984 * longValue26) - 589807844760L) + ((j71 | 300156664) * 983) + (((~(j71 | j7)) | (-300156665)) * (-983)) + (((~(longValue26 | (-300156665))) | (~(j7 | (-300156665)))) * 983) + 956943860;
                        }
                        str2 = str;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                        i2 = 0;
                        java.lang.Object[] objArr262 = new java.lang.Object[1];
                        c("ﺪﻋ\u6951c蒌晤힟콧裵ુ\uec2b䇏", -android.text.TextUtils.lastIndexOf(str2, c, i2), objArr262);
                        java.lang.String intern210 = ((java.lang.String) objArr262[i2]).intern();
                        java.lang.Object[] objArr272 = new java.lang.Object[1];
                        a(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u0083\u0093\u0088\u008d\u008b\u0092", objArr272);
                        java.lang.String intern310 = ((java.lang.String) objArr272[i2]).intern();
                        java.lang.Object[] objArr282 = new java.lang.Object[1];
                        a(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0086\u008b\u0094\u0089\u008e\u0091\u0086", objArr282);
                        java.lang.String intern47 = ((java.lang.String) objArr282[i2]).intern();
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        a(127 - android.view.Gravity.getAbsoluteGravity(i2, i2), null, null, "\u008b\u0094\u0098\u008b\u0094\u0089\u0096\u0086\u0083", objArr292);
                        java.lang.String intern52 = ((java.lang.String) objArr292[i2]).intern();
                        java.lang.Object[] objArr302 = new java.lang.Object[1];
                        c("砚硳\ued07쐀냮罶쑨\udcacโ㺯", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr302);
                        java.lang.String intern62 = ((java.lang.String) objArr302[i2]).intern();
                        java.lang.Object[] objArr312 = new java.lang.Object[1];
                        a(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u008f\u008b\u008c\u0083\u008e\u0096\u0094\u0086\u0099\u0090\u0088\u0093\u0088", objArr312);
                        java.lang.String intern72 = ((java.lang.String) objArr312[i2]).intern();
                        java.lang.Object[] objArr322 = new java.lang.Object[1];
                        c("\ud8ee\ud887\uf7d0\ue1ccꨲ媢紎旆꺪", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr322);
                        java.lang.String intern82 = ((java.lang.String) objArr322[i2]).intern();
                        java.lang.Object[] objArr332 = new java.lang.Object[1];
                        a(127 - android.view.View.MeasureSpec.getMode(i2), null, null, "\u009a\u0087\u008b\u0094\u008d\u0088", objArr332);
                        java.lang.String intern92 = ((java.lang.String) objArr332[i2]).intern();
                        java.lang.Object[] objArr342 = new java.lang.Object[1];
                        a((android.os.Process.myPid() >> 22) + 127, null, null, "\u009b\u0088", objArr342);
                        java.lang.String intern102 = ((java.lang.String) objArr342[i2]).intern();
                        java.lang.Object[] objArr352 = new java.lang.Object[1];
                        c("㭻㬗⤪\udd59瓈昤\uef88\uf75f䴪滋\uec64秭흠悫竵\uf223妓\ue962삝豨", 1 - android.graphics.Color.red(i2), objArr352);
                        java.lang.String intern112 = ((java.lang.String) objArr352[i2]).intern();
                        java.lang.Object[] objArr362 = new java.lang.Object[1];
                        c("悿惓뛩諣\ueb0b㆞홦캵ᛪ敏믉䁀貥ｿ", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr362);
                        java.lang.String intern122 = ((java.lang.String) objArr362[i2]).intern();
                        java.lang.Object[] objArr372 = new java.lang.Object[1];
                        a(android.view.MotionEvent.axisFromString(str2) + 128, null, null, "\u009c\u0093\u0092\u008b\u008f\u0084\u008b\u008d", objArr372);
                        java.lang.String intern132 = ((java.lang.String) objArr372[i2]).intern();
                        java.lang.Object[] objArr382 = new java.lang.Object[1];
                        c("쯣쮓Ք櫣墫톖혬컭붴훺寁䁚⟮䳂촕쮆", android.view.View.MeasureSpec.getSize(i2) + 1, objArr382);
                        java.lang.String intern142 = ((java.lang.String) objArr382[i2]).intern();
                        java.lang.Object[] objArr392 = new java.lang.Object[1];
                        c("\udca6\udcd6鸏凥쏰\uea90棏瀎꫱䶡惇ﺹカ힙\uf613畢빎幊", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr392);
                        java.lang.String intern152 = ((java.lang.String) objArr392[i2]).intern();
                        java.lang.Object[] objArr402 = new java.lang.Object[1];
                        a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, null, "\u0090\u0093\u008e\u0084\u0091\u0094\u008b", objArr402);
                        java.lang.String intern162 = ((java.lang.String) objArr402[0]).intern();
                        java.lang.Object[] objArr412 = new java.lang.Object[1];
                        c("鮭鯞Ꮱ﨣丄䅖簈擘\uedf4쁁쬝", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr412);
                        java.lang.String intern172 = ((java.lang.String) objArr412[0]).intern();
                        java.lang.Object[] objArr422 = new java.lang.Object[1];
                        c("萧葔ⷢᰎ瀞ꝸ伷培\uf267﹆\u2d73", android.text.TextUtils.indexOf(str2, str2, 0, 0) + 1, objArr422);
                        java.lang.String intern182 = ((java.lang.String) objArr422[0]).intern();
                        java.lang.Object[] objArr432 = new java.lang.Object[1];
                        c("窥竖퐏ꍅ觱ퟘ", 1 - android.view.KeyEvent.normalizeMetaState(0), objArr432);
                        java.lang.String intern192 = ((java.lang.String) objArr432[0]).intern();
                        java.lang.Object[] objArr442 = new java.lang.Object[1];
                        c("颀飳繷䲣⎎\uf7d8弝䟈\ueec0귩続쥺璜㟪\ueb7e䊫侀븽兾㳪䀷䡏\udf27뛋", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr442);
                        java.lang.String intern202 = ((java.lang.String) objArr442[0]).intern();
                        java.lang.Object[] objArr452 = new java.lang.Object[1];
                        c("灛瀨淮᳅〗Ɬ봣ꗥ،빊", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr452);
                        java.lang.String intern212 = ((java.lang.String) objArr452[0]).intern();
                        java.lang.Object[] objArr462 = new java.lang.Object[1];
                        c("䧗䦤뗻㿨\ue803⯸", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr462);
                        java.lang.String intern222 = ((java.lang.String) objArr462[0]).intern();
                        java.lang.Object[] objArr472 = new java.lang.Object[1];
                        a(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0089\u008e\u0090\u0092\u0090\u0089\u0099\u008b\u0094\u009d\u0088\u0090\u0088\u0093\u0092\u0089", objArr472);
                        java.lang.String intern232 = ((java.lang.String) objArr472[0]).intern();
                        java.lang.Object[] objArr482 = new java.lang.Object[1];
                        c("籿簋緄\u2028※魓䦵共ਮ깵ᄇ\udfde避", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr482);
                        java.lang.String intern242 = ((java.lang.String) objArr482[0]).intern();
                        java.lang.Object[] objArr492 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, "\u009e\u008a\u0090\u0092\u008d\u0094\u008f\u0092\u008b\u0090", objArr492);
                        java.lang.String intern252 = ((java.lang.String) objArr492[0]).intern();
                        java.lang.Object[] objArr502 = new java.lang.Object[1];
                        a(android.graphics.Color.blue(0) + 127, null, null, "\u009e\u0094\u0090\u008e\u0084\u008b\u0094\u008f\u0092\u008b\u0090", objArr502);
                        java.lang.String intern262 = ((java.lang.String) objArr502[0]).intern();
                        java.lang.Object[] objArr512 = new java.lang.Object[1];
                        c("\ue0ad\ue0d8ﮗ䅋ꙴ都嘰仾雷⠲灚쁌ಫ누\ue6a6", 1 - android.graphics.Color.argb(0, 0, 0, 0), objArr512);
                        java.lang.String intern272 = ((java.lang.String) objArr512[0]).intern();
                        java.lang.Object[] objArr522 = new java.lang.Object[1];
                        c("ۆڳ﹪꺻ꎉᗖ柝缓炜\u2dcf龪\uf1ba\ueacb럸०穵搴㸥덢", android.view.View.MeasureSpec.getMode(0) + 1, objArr522);
                        java.lang.String intern282 = ((java.lang.String) objArr522[0]).intern();
                        java.lang.Object[] objArr532 = new java.lang.Object[1];
                        c("垓埦\ud99a熇葹쫪麺虴⇉ਿ䂖ࣜ뮂适홧茔㕣ᧀ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr532);
                        java.lang.String[] strArr32 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr532[0]).intern()};
                        java.lang.Object[] objArr542 = new java.lang.Object[1];
                        c("龂鿰山\ue343Ɠ塷貌鑃\ue9d7迂퉩\u1aef王ᗶ䒤", android.view.View.resolveSizeAndState(0, 0, 0) + 1, objArr542);
                        java.lang.Object[] objArr552 = {((java.lang.String) objArr542[0]).intern()};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        str3 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr552);
                        if (str3 != null) {
                        }
                        java.lang.Object[] objArr752 = new java.lang.Object[1];
                        a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0094\u008f\u008b\u0084\u0087\u0093\u0094\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr752);
                        java.lang.Object[] objArr762 = {((java.lang.String) objArr752[0]).intern()};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr762)).longValue();
                        long j242 = ~((~longValue72) | j);
                        long j252 = (((-574) * longValue72) - 542360086226L) + (((~(j7 | (-944878200))) | j242) * 1150) + (((~(j7 | longValue72)) | j242) * (-575)) + (((~(j7 | 944878199)) | (~(j | (-944878200)))) * 575) + 345661868;
                        int i172 = (~((-358603417) | i8)) | 353730696 | (~(1078622994 | i8));
                        j2 = (((int) (j252 >> 32)) & ((((~((-1073750275) | i)) | i172) * 590) + 1827437694 + (i172 * (-1180)) + (((~((-1078622995) | i8)) | (~(358603416 | i8))) * 590))) | (((((((~(947041633 | i)) | (~((-490184777) | i8))) | r7) * (-516)) - 952163343) + (((~(1031255401 | i)) | (~((-541070626) | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~((-947041634) | i8)) | 541070625) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) & ((int) j252));
                        java.lang.Object[] objArr782 = new java.lang.Object[1];
                        c("產甍㮩⋷晔馟꣒뀚͵\ue847Ꮚ㺤餦爺蕚땦៊ﯡ㼵쬬궁", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr782);
                        java.lang.Object[] objArr792 = {((java.lang.String) objArr782[0]).intern()};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr792)).longValue();
                        long j262 = ~longValue82;
                        long j272 = (((-932) * longValue82) - 792476116066L) + (((~(j7 | 848475498)) | j262) * (-933)) + (((~(j262 | j7)) | (~(j262 | (-848475499)))) * 933) + ((~((-848475499) | longValue82)) * 933) + 2139015566;
                        long j282 = (((int) j272) & ((((~(1621867840 | i8)) | 151011349) * (-108)) + 1807340995 + (((~((-1235873046) | i)) | 537006144 | (~(1235873045 | i8))) * 54) + ((537006144 | i) * 54))) | (((int) (j272 >> 32)) & (((~(1601566655 | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 777667856 + (((~(1601566655 | i8)) | 85991946) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)));
                        if (j2 > 0) {
                        }
                        java.lang.Object[] objArr842 = new java.lang.Object[1];
                        a(android.graphics.Color.alpha(0) + 127, null, null, "\u0094\u008f\u008b\u0084\u0087\u0093\u0094\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr842);
                        java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr852)).longValue();
                        long j292 = ~longValue92;
                        long j302 = 565166883 | j292;
                        long j312 = ((-622) * longValue92) + 352664134992L + ((~(j302 | j)) * 623) + ((j7 | (~((-565166884) | longValue92))) * (-623)) + (((~j302) | (~(j292 | j)) | (~(j | 565166883))) * 623) + 725373184;
                        j3 = (((int) j312) & (((((~((-333308726) | i)) | (~((-1744836811) | i8))) * (-406)) - 1975110749) + ((~((-25698326) | i8)) * (-406)) + (((~(1770535135 | i)) | (~(333308725 | i8))) * 406))) | (((int) (j312 >> 32)) & ((((18939904 | i8) * (-192)) - 1788177110) + (((~(1371214946 | i8)) | (-1505465843)) * (-384)) + (((~(1505465842 | i)) | (~((-134250897) | i8)) | (~((-1352275043) | i))) * 192)));
                        java.lang.Object[] objArr872 = new java.lang.Object[1];
                        a(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, null, "\u0098\u0094\u0086\u009f", objArr872);
                        java.lang.Object[] objArr882 = {((java.lang.String) objArr872[0]).intern()};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr882)).longValue();
                        long j322 = ~longValue102;
                        long j332 = j7 | (-382751621);
                        long j342 = (((-885) * longValue102) - 678618624033L) + (((~(j322 | 382751620)) | (~(j322 | j)) | (~(j332 | longValue102))) * 886) + (((~(j7 | longValue102)) | (-382751621)) * (-1772)) + ((~j332) * 886) + 1673291688;
                        long j352 = (((int) j342) & (((((~(2074071120 | i)) | (-783669766)) * (-465)) - 1217272672) + (((~((-783669766) | i)) | 2074071120) * 930) + (((-69208582) | i) * 465))) | (((int) (j342 >> 32)) & ((((~((-1881739426) | i8)) | 444513014) * (-983)) + 1925261964 + (((~(444513014 | i8)) | (-2055191288)) * 983)));
                        if (j3 <= 0) {
                        }
                        java.lang.Object[] objArr932 = new java.lang.Object[1];
                        a(127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr932);
                        java.lang.String intern302 = ((java.lang.String) objArr932[0]).intern();
                        java.lang.Object[] objArr942 = new java.lang.Object[1];
                        a(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u0093\u0088\u0096\u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr942);
                        java.lang.String intern312 = ((java.lang.String) objArr942[0]).intern();
                        java.lang.Object[] objArr952 = new java.lang.Object[1];
                        c("돇돨䘋₡\u1bf5鯂鮉荝얇閯ᆂඩ応ྜ蝊蘼", 1 - android.view.View.combineMeasuredStates(0, 0), objArr952);
                        java.lang.String intern322 = ((java.lang.String) objArr952[0]).intern();
                        java.lang.Object[] objArr962 = new java.lang.Object[1];
                        a(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0093\u0088\u0096 \u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr962);
                        java.lang.String intern332 = ((java.lang.String) objArr962[0]).intern();
                        java.lang.Object[] objArr972 = new java.lang.Object[1];
                        c("鍄鍫킔鬌赯\u2073泈琁\ue514̺ꨰ\ufaf5罎餈㳠", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr972);
                        java.lang.String intern342 = ((java.lang.String) objArr972[0]).intern();
                        java.lang.Object[] objArr982 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u0093\u0088\u0096\u0089\u009f", objArr982);
                        java.lang.String intern352 = ((java.lang.String) objArr982[0]).intern();
                        java.lang.Object[] objArr992 = new java.lang.Object[1];
                        a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, null, null, "\u008f\u0090\u0094\u009f", objArr992);
                        java.lang.String[] strArr62 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr992[0]).intern()};
                        i3 = 0;
                        while (true) {
                            if (i3 >= 7) {
                            }
                            i3++;
                        }
                        if (i4 != 0) {
                        }
                    } else {
                        i10++;
                        i7 = 0;
                        f = 0.0f;
                    }
                }
            }
            str2 = str;
            j = j6;
            i2 = i7;
            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            java.lang.Object[] objArr2622 = new java.lang.Object[1];
            c("ﺪﻋ\u6951c蒌晤힟콧裵ુ\uec2b䇏", -android.text.TextUtils.lastIndexOf(str2, c, i2), objArr2622);
            java.lang.String intern2102 = ((java.lang.String) objArr2622[i2]).intern();
            java.lang.Object[] objArr2722 = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), null, null, "\u0083\u0093\u0088\u008d\u008b\u0092", objArr2722);
            java.lang.String intern3102 = ((java.lang.String) objArr2722[i2]).intern();
            java.lang.Object[] objArr2822 = new java.lang.Object[1];
            a(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0086\u008b\u0094\u0089\u008e\u0091\u0086", objArr2822);
            java.lang.String intern472 = ((java.lang.String) objArr2822[i2]).intern();
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            a(127 - android.view.Gravity.getAbsoluteGravity(i2, i2), null, null, "\u008b\u0094\u0098\u008b\u0094\u0089\u0096\u0086\u0083", objArr2922);
            java.lang.String intern522 = ((java.lang.String) objArr2922[i2]).intern();
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            c("砚硳\ued07쐀냮罶쑨\udcacโ㺯", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr3022);
            java.lang.String intern622 = ((java.lang.String) objArr3022[i2]).intern();
            java.lang.Object[] objArr3122 = new java.lang.Object[1];
            a(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u008f\u008b\u008c\u0083\u008e\u0096\u0094\u0086\u0099\u0090\u0088\u0093\u0088", objArr3122);
            java.lang.String intern722 = ((java.lang.String) objArr3122[i2]).intern();
            java.lang.Object[] objArr3222 = new java.lang.Object[1];
            c("\ud8ee\ud887\uf7d0\ue1ccꨲ媢紎旆꺪", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr3222);
            java.lang.String intern822 = ((java.lang.String) objArr3222[i2]).intern();
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            a(127 - android.view.View.MeasureSpec.getMode(i2), null, null, "\u009a\u0087\u008b\u0094\u008d\u0088", objArr3322);
            java.lang.String intern922 = ((java.lang.String) objArr3322[i2]).intern();
            java.lang.Object[] objArr3422 = new java.lang.Object[1];
            a((android.os.Process.myPid() >> 22) + 127, null, null, "\u009b\u0088", objArr3422);
            java.lang.String intern1022 = ((java.lang.String) objArr3422[i2]).intern();
            java.lang.Object[] objArr3522 = new java.lang.Object[1];
            c("㭻㬗⤪\udd59瓈昤\uef88\uf75f䴪滋\uec64秭흠悫竵\uf223妓\ue962삝豨", 1 - android.graphics.Color.red(i2), objArr3522);
            java.lang.String intern1122 = ((java.lang.String) objArr3522[i2]).intern();
            java.lang.Object[] objArr3622 = new java.lang.Object[1];
            c("悿惓뛩諣\ueb0b㆞홦캵ᛪ敏믉䁀貥ｿ", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3622);
            java.lang.String intern1222 = ((java.lang.String) objArr3622[i2]).intern();
            java.lang.Object[] objArr3722 = new java.lang.Object[1];
            a(android.view.MotionEvent.axisFromString(str2) + 128, null, null, "\u009c\u0093\u0092\u008b\u008f\u0084\u008b\u008d", objArr3722);
            java.lang.String intern1322 = ((java.lang.String) objArr3722[i2]).intern();
            java.lang.Object[] objArr3822 = new java.lang.Object[1];
            c("쯣쮓Ք櫣墫톖혬컭붴훺寁䁚⟮䳂촕쮆", android.view.View.MeasureSpec.getSize(i2) + 1, objArr3822);
            java.lang.String intern1422 = ((java.lang.String) objArr3822[i2]).intern();
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            c("\udca6\udcd6鸏凥쏰\uea90棏瀎꫱䶡惇ﺹカ힙\uf613畢빎幊", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr3922);
            java.lang.String intern1522 = ((java.lang.String) objArr3922[i2]).intern();
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, null, "\u0090\u0093\u008e\u0084\u0091\u0094\u008b", objArr4022);
            java.lang.String intern1622 = ((java.lang.String) objArr4022[0]).intern();
            java.lang.Object[] objArr4122 = new java.lang.Object[1];
            c("鮭鯞Ꮱ﨣丄䅖簈擘\uedf4쁁쬝", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4122);
            java.lang.String intern1722 = ((java.lang.String) objArr4122[0]).intern();
            java.lang.Object[] objArr4222 = new java.lang.Object[1];
            c("萧葔ⷢᰎ瀞ꝸ伷培\uf267﹆\u2d73", android.text.TextUtils.indexOf(str2, str2, 0, 0) + 1, objArr4222);
            java.lang.String intern1822 = ((java.lang.String) objArr4222[0]).intern();
            java.lang.Object[] objArr4322 = new java.lang.Object[1];
            c("窥竖퐏ꍅ觱ퟘ", 1 - android.view.KeyEvent.normalizeMetaState(0), objArr4322);
            java.lang.String intern1922 = ((java.lang.String) objArr4322[0]).intern();
            java.lang.Object[] objArr4422 = new java.lang.Object[1];
            c("颀飳繷䲣⎎\uf7d8弝䟈\ueec0귩続쥺璜㟪\ueb7e䊫侀븽兾㳪䀷䡏\udf27뛋", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr4422);
            java.lang.String intern2022 = ((java.lang.String) objArr4422[0]).intern();
            java.lang.Object[] objArr4522 = new java.lang.Object[1];
            c("灛瀨淮᳅〗Ɬ봣ꗥ،빊", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr4522);
            java.lang.String intern2122 = ((java.lang.String) objArr4522[0]).intern();
            java.lang.Object[] objArr4622 = new java.lang.Object[1];
            c("䧗䦤뗻㿨\ue803⯸", -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr4622);
            java.lang.String intern2222 = ((java.lang.String) objArr4622[0]).intern();
            java.lang.Object[] objArr4722 = new java.lang.Object[1];
            a(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0089\u008e\u0090\u0092\u0090\u0089\u0099\u008b\u0094\u009d\u0088\u0090\u0088\u0093\u0092\u0089", objArr4722);
            java.lang.String intern2322 = ((java.lang.String) objArr4722[0]).intern();
            java.lang.Object[] objArr4822 = new java.lang.Object[1];
            c("籿簋緄\u2028※魓䦵共ਮ깵ᄇ\udfde避", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4822);
            java.lang.String intern2422 = ((java.lang.String) objArr4822[0]).intern();
            java.lang.Object[] objArr4922 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, "\u009e\u008a\u0090\u0092\u008d\u0094\u008f\u0092\u008b\u0090", objArr4922);
            java.lang.String intern2522 = ((java.lang.String) objArr4922[0]).intern();
            java.lang.Object[] objArr5022 = new java.lang.Object[1];
            a(android.graphics.Color.blue(0) + 127, null, null, "\u009e\u0094\u0090\u008e\u0084\u008b\u0094\u008f\u0092\u008b\u0090", objArr5022);
            java.lang.String intern2622 = ((java.lang.String) objArr5022[0]).intern();
            java.lang.Object[] objArr5122 = new java.lang.Object[1];
            c("\ue0ad\ue0d8ﮗ䅋ꙴ都嘰仾雷⠲灚쁌ಫ누\ue6a6", 1 - android.graphics.Color.argb(0, 0, 0, 0), objArr5122);
            java.lang.String intern2722 = ((java.lang.String) objArr5122[0]).intern();
            java.lang.Object[] objArr5222 = new java.lang.Object[1];
            c("ۆڳ﹪꺻ꎉᗖ柝缓炜\u2dcf龪\uf1ba\ueacb럸०穵搴㸥덢", android.view.View.MeasureSpec.getMode(0) + 1, objArr5222);
            java.lang.String intern2822 = ((java.lang.String) objArr5222[0]).intern();
            java.lang.Object[] objArr5322 = new java.lang.Object[1];
            c("垓埦\ud99a熇葹쫪麺虴⇉ਿ䂖ࣜ뮂适홧茔㕣ᧀ", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr5322);
            java.lang.String[] strArr322 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5322[0]).intern()};
            java.lang.Object[] objArr5422 = new java.lang.Object[1];
            c("龂鿰山\ue343Ɠ塷貌鑃\ue9d7迂퉩\u1aef王ᗶ䒤", android.view.View.resolveSizeAndState(0, 0, 0) + 1, objArr5422);
            java.lang.Object[] objArr5522 = {((java.lang.String) objArr5422[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            str3 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5522);
            if (str3 != null) {
            }
            java.lang.Object[] objArr7522 = new java.lang.Object[1];
            a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0094\u008f\u008b\u0084\u0087\u0093\u0094\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr7522);
            java.lang.Object[] objArr7622 = {((java.lang.String) objArr7522[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7622)).longValue();
            long j2422 = ~((~longValue722) | j);
            long j2522 = (((-574) * longValue722) - 542360086226L) + (((~(j7 | (-944878200))) | j2422) * 1150) + (((~(j7 | longValue722)) | j2422) * (-575)) + (((~(j7 | 944878199)) | (~(j | (-944878200)))) * 575) + 345661868;
            int i1722 = (~((-358603417) | i8)) | 353730696 | (~(1078622994 | i8));
            j2 = (((int) (j2522 >> 32)) & ((((~((-1073750275) | i)) | i1722) * 590) + 1827437694 + (i1722 * (-1180)) + (((~((-1078622995) | i8)) | (~(358603416 | i8))) * 590))) | (((((((~(947041633 | i)) | (~((-490184777) | i8))) | r7) * (-516)) - 952163343) + (((~(1031255401 | i)) | (~((-541070626) | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~((-947041634) | i8)) | 541070625) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) & ((int) j2522));
            java.lang.Object[] objArr7822 = new java.lang.Object[1];
            c("產甍㮩⋷晔馟꣒뀚͵\ue847Ꮚ㺤餦爺蕚땦៊ﯡ㼵쬬궁", -android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr7822);
            java.lang.Object[] objArr7922 = {((java.lang.String) objArr7822[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7922)).longValue();
            long j2622 = ~longValue822;
            long j2722 = (((-932) * longValue822) - 792476116066L) + (((~(j7 | 848475498)) | j2622) * (-933)) + (((~(j2622 | j7)) | (~(j2622 | (-848475499)))) * 933) + ((~((-848475499) | longValue822)) * 933) + 2139015566;
            long j2822 = (((int) j2722) & ((((~(1621867840 | i8)) | 151011349) * (-108)) + 1807340995 + (((~((-1235873046) | i)) | 537006144 | (~(1235873045 | i8))) * 54) + ((537006144 | i) * 54))) | (((int) (j2722 >> 32)) & (((~(1601566655 | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 777667856 + (((~(1601566655 | i8)) | 85991946) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)));
            if (j2 > 0) {
            }
            java.lang.Object[] objArr8422 = new java.lang.Object[1];
            a(android.graphics.Color.alpha(0) + 127, null, null, "\u0094\u008f\u008b\u0084\u0087\u0093\u0094\u009f \u008e\u0093\u0088\u0085\u0094\u0089\u009f\u0089\u0087\u009f\u0089\u0095\u0089\u009f", objArr8422);
            java.lang.Object[] objArr8522 = {((java.lang.String) objArr8422[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8522)).longValue();
            long j2922 = ~longValue922;
            long j3022 = 565166883 | j2922;
            long j3122 = ((-622) * longValue922) + 352664134992L + ((~(j3022 | j)) * 623) + ((j7 | (~((-565166884) | longValue922))) * (-623)) + (((~j3022) | (~(j2922 | j)) | (~(j | 565166883))) * 623) + 725373184;
            j3 = (((int) j3122) & (((((~((-333308726) | i)) | (~((-1744836811) | i8))) * (-406)) - 1975110749) + ((~((-25698326) | i8)) * (-406)) + (((~(1770535135 | i)) | (~(333308725 | i8))) * 406))) | (((int) (j3122 >> 32)) & ((((18939904 | i8) * (-192)) - 1788177110) + (((~(1371214946 | i8)) | (-1505465843)) * (-384)) + (((~(1505465842 | i)) | (~((-134250897) | i8)) | (~((-1352275043) | i))) * 192)));
            java.lang.Object[] objArr8722 = new java.lang.Object[1];
            a(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, null, "\u0098\u0094\u0086\u009f", objArr8722);
            java.lang.Object[] objArr8822 = {((java.lang.String) objArr8722[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8822)).longValue();
            long j3222 = ~longValue1022;
            long j3322 = j7 | (-382751621);
            long j3422 = (((-885) * longValue1022) - 678618624033L) + (((~(j3222 | 382751620)) | (~(j3222 | j)) | (~(j3322 | longValue1022))) * 886) + (((~(j7 | longValue1022)) | (-382751621)) * (-1772)) + ((~j3322) * 886) + 1673291688;
            long j3522 = (((int) j3422) & (((((~(2074071120 | i)) | (-783669766)) * (-465)) - 1217272672) + (((~((-783669766) | i)) | 2074071120) * 930) + (((-69208582) | i) * 465))) | (((int) (j3422 >> 32)) & ((((~((-1881739426) | i8)) | 444513014) * (-983)) + 1925261964 + (((~(444513014 | i8)) | (-2055191288)) * 983)));
            if (j3 <= 0) {
            }
            java.lang.Object[] objArr9322 = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr9322);
            java.lang.String intern3022 = ((java.lang.String) objArr9322[0]).intern();
            java.lang.Object[] objArr9422 = new java.lang.Object[1];
            a(127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "\u0093\u0088\u0096\u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr9422);
            java.lang.String intern3122 = ((java.lang.String) objArr9422[0]).intern();
            java.lang.Object[] objArr9522 = new java.lang.Object[1];
            c("돇돨䘋₡\u1bf5鯂鮉荝얇閯ᆂඩ応ྜ蝊蘼", 1 - android.view.View.combineMeasuredStates(0, 0), objArr9522);
            java.lang.String intern3222 = ((java.lang.String) objArr9522[0]).intern();
            java.lang.Object[] objArr9622 = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0093\u0088\u0096 \u009f\u0091\u0094\u0090\u0089\u0095\u0089\u009f", objArr9622);
            java.lang.String intern3322 = ((java.lang.String) objArr9622[0]).intern();
            java.lang.Object[] objArr9722 = new java.lang.Object[1];
            c("鍄鍫킔鬌赯\u2073泈琁\ue514̺ꨰ\ufaf5罎餈㳠", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr9722);
            java.lang.String intern3422 = ((java.lang.String) objArr9722[0]).intern();
            java.lang.Object[] objArr9822 = new java.lang.Object[1];
            a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, "\u0093\u0088\u0096\u0089\u009f", objArr9822);
            java.lang.String intern3522 = ((java.lang.String) objArr9822[0]).intern();
            java.lang.Object[] objArr9922 = new java.lang.Object[1];
            a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, null, null, "\u008f\u0090\u0094\u009f", objArr9922);
            java.lang.String[] strArr622 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9922[0]).intern()};
            i3 = 0;
            while (true) {
                if (i3 >= 7) {
                }
                i3++;
            }
            if (i4 != 0) {
            }
        } catch (java.lang.Throwable th8) {
            java.lang.Throwable cause5 = th8.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th8;
        }
    }
}
