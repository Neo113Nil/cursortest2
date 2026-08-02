package com.payair.hce;

/* loaded from: classes4.dex */
public class getCmsDFormattedDigitizedCardProfile extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static char[] valueOf;
    private boolean values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b2 * 3;
        byte[] bArr = $$a;
        int i5 = (b * 3) + 4;
        int i6 = 73 - (i * 8);
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 += i6;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i3;
            i6 = bArr[i3];
            i5 += i6;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == 0 - i4) {
            }
        } else {
            i2 = 0;
            i5 = i6;
            i3 = i5;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == 0 - i4) {
            }
        }
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = DigitizedCardProfile + 15;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0002\u0001", 2 >> (android.media.AudioTrack.getMaxVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), (byte) (android.view.View.MeasureSpec.getSize(1) + 74), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0002\u0001", 3 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (android.view.View.MeasureSpec.getSize(0) + 73), objArr2);
            obj = objArr2[0];
        }
        com.payair.hce.transactionCanBeResumed values = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
        int i2 = RecordsJson + 41;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return values;
        }
        throw null;
    }

    public getCmsDFormattedDigitizedCardProfile() {
        this((byte) 0);
    }

    private getCmsDFormattedDigitizedCardProfile(byte b) {
        try {
            this.values = false;
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(5);
            com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{writeReplace, 3, 0, java.lang.Boolean.valueOf(this.values)}, 334804465, -334804462, 3);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(writeReplace);
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> writeReplace() {
        com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> setmobilepin = new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.getCmsDFormattedDigitizedCardProfile.5
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int DigitizedCardProfile;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                return writeReplace(objArr);
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.getCmsDFormattedDigitizedCardProfile getcmsdformatteddigitizedcardprofile = new com.payair.hce.getCmsDFormattedDigitizedCardProfile();
                int i = DigitizedCardProfile;
                int i2 = (((i | 52) << 1) - (i ^ 52)) - 1;
                AlternateContactlessPaymentDataJson = i2 % 128;
                if (i2 % 2 != 0) {
                    return getcmsdformatteddigitizedcardprofile;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1935506446, -1935506446, java.lang.System.identityHashCode(this));
            }
        };
        int i = DigitizedCardProfile + 31;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return setmobilepin;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        int i = DigitizedCardProfile + 19;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{transactioncanberesumed, 5, 1, java.lang.Boolean.valueOf(this.values)}, 334804465, -334804462, 5);
        } else {
            com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{transactioncanberesumed, 3, 0, java.lang.Boolean.valueOf(this.values)}, 334804465, -334804462, 3);
        }
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i3 = 3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf("", c, 0) + 2509, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 6802));
                        byte b2 = (byte) ($$b & i3);
                        byte b3 = (byte) (b2 - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i3 = 3;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2508, (char) (6802 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
            byte b4 = (byte) ($$b & 3);
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b4, b5, b5, objArr5);
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
            $10 = ($11 + 73) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, android.view.View.resolveSize(0, 0) + 3596, (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $11 = ($10 + 117) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.combineMeasuredStates(0, 0), 2665 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (18889 - android.view.KeyEvent.normalizeMetaState(0)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(0, (byte) 0, (byte) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i7 = digitizedCardJson12.DigitizedCardProfile;
                        int i8 = digitizedCardJson12.RecordsJson;
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i7 * charValue) + i8];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i9 * charValue) + i10];
                    } else {
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i11 * charValue) + i12];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i13 * charValue) + i14];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        RecordsJson = 1;
        valueOf = new char[]{12415, 12385, 12384, 12403};
        AlternateContactlessPaymentDataJson = (char) 1490;
    }

    static void init$0() {
        $$a = new byte[]{5, -77, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -4};
        $$b = 69;
    }
}
