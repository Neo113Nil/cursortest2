package com.payair.hce;

/* loaded from: classes4.dex */
public class getDigitizedCardProfile extends com.payair.hce.getReasonCode<java.lang.Long> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static boolean valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 3 - (s3 * 2);
        byte[] bArr = $$a;
        int i5 = 1 - (s2 * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = i4;
            i3 = 0;
            i4 += i6;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            i2++;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i4 += i6;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            i2++;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i4 = 118 - (s * 2);
            i2 = i4;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            i2++;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getDigitizedCardProfile getdigitizedcardprofile = (com.payair.hce.getDigitizedCardProfile) objArr[0];
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) objArr[1];
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 105) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(transactioncanberesumed.valueOf())));
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 7) % 128;
        return null;
    }

    /* synthetic */ getDigitizedCardProfile(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 45;
        getAid = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(android.text.TextUtils.getTrimmedLength("") + 72, null, null, "\u0084\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(127 - android.text.TextUtils.getTrimmedLength(""), null, null, "\u0084\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 119;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private getDigitizedCardProfile() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(2);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(writeReplace.valueOf())));
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<java.lang.Long> writeReplace() {
        com.payair.hce.setMobilePin<java.lang.Long> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Long>() { // from class: com.payair.hce.getDigitizedCardProfile.5
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int DigitizedCardProfile;

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.getDigitizedCardProfile getdigitizedcardprofile = new com.payair.hce.getDigitizedCardProfile((byte) 0);
                int i4 = AlternateContactlessPaymentDataJson;
                int i5 = i4 & 69;
                int i6 = (i4 ^ 69) | i5;
                DigitizedCardProfile = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                return getdigitizedcardprofile;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Long> valueOf() {
                return (com.payair.hce.getReasonCode) writeReplace(new java.lang.Object[]{this}, 838425065, -838425065, java.lang.System.identityHashCode(this));
            }
        };
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 57) % 128;
        return setmobilepin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean values() {
        int i = getAid + 95;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (((java.lang.Long) this.writeReplace).longValue() == 840) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 43) % 128;
            return true;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 87) % 128;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DigitizedCardProfile() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 3;
        getAid = i % 128;
        if (i % 2 == 0 ? ((java.lang.Long) this.writeReplace).longValue() != 0 : ((java.lang.Long) this.writeReplace).longValue() != 0) {
            getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 67) % 128;
            return false;
        }
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 55) % 128;
        return true;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 33) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = AlternateContactlessPaymentDataJson;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                $10 = ($11 + 37) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.graphics.Color.blue(0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(values)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46, 287 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (46337 - (android.view.ViewConfiguration.getTouchSlop() >> 8)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (valueOf) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 5, android.text.TextUtils.getCapsMode("", 0, 0) + 1629, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (short) 0, (short) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                $11 = ($10 + 45) % 128;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!DigitizedCardProfile) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 1) % 128;
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        $10 = ($11 + 9) % 128;
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1630, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, (short) 0, (short) 0, objArr7);
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
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson = new char[]{10763, 10758, 10803, 10755};
        values = -143185344;
        DigitizedCardProfile = true;
        valueOf = true;
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = 110;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        valueOf(new java.lang.Object[]{this, transactioncanberesumed}, 1873083099, -1873083099, java.lang.System.identityHashCode(this));
    }
}
