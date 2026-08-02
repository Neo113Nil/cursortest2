package com.payair.hce;

/* loaded from: classes4.dex */
public class getCmsCFormattedDigitizedCardProfile extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getProfileVersion;
    private static boolean valueOf;
    private static boolean values;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class values {
        public static final int AlternateContactlessPaymentDataJson = 2;
        public static final int DigitizedCardProfile = 4;
        public static final int RecordsJson = 7;
        private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
        public static final int getAid = 6;
        private static int getProfileVersion = 58;
        public static final int valueOf = 5;
        public static final int values = 1;
        public static final int writeReplace = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getCmsCFormattedDigitizedCardProfile getcmscformatteddigitizedcardprofile = (com.payair.hce.getCmsCFormattedDigitizedCardProfile) objArr[0];
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 27) % 128;
        byte b = (byte) (((com.payair.hce.transactionCanBeResumed) getcmscformatteddigitizedcardprofile.writeReplace).valueOf()[0] & 63);
        if (b == 0) {
            return java.lang.Integer.valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.values);
        }
        if (b != 1) {
            if (b == 2) {
                return java.lang.Integer.valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.writeReplace);
            }
            if (b != 4) {
                return b != 63 ? b != 30 ? b != 31 ? java.lang.Integer.valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.RecordsJson) : java.lang.Integer.valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.valueOf) : java.lang.Integer.valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.DigitizedCardProfile) : java.lang.Integer.valueOf(com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.getAid);
            }
        }
        int i4 = com.payair.hce.getCmsCFormattedDigitizedCardProfile.values.AlternateContactlessPaymentDataJson;
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 19) % 128;
        return java.lang.Integer.valueOf(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b * 3);
        int i3 = s * 2;
        int i4 = (s2 * 4) + 118;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i4;
            i = 0;
            i4 = i5;
            i4 += i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i2];
            i4 += i6;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    /* synthetic */ getCmsCFormattedDigitizedCardProfile(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = getProfileVersion + 77;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(72 << android.graphics.ImageFormat.getBitsPerPixel(0), null, null, "\u0084\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(126 - android.graphics.ImageFormat.getBitsPerPixel(0), null, null, "\u0084\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 45) % 128;
        return values2;
    }

    private getCmsCFormattedDigitizedCardProfile() {
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> DigitizedCardProfile() {
        com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> setmobilepin = new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.getCmsCFormattedDigitizedCardProfile.4
            private static int DigitizedCardProfile = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                return DigitizedCardProfile(objArr);
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.getCmsCFormattedDigitizedCardProfile getcmscformatteddigitizedcardprofile = new com.payair.hce.getCmsCFormattedDigitizedCardProfile((byte) 0);
                int i = writeReplace;
                int i2 = ((i & (-6)) | ((~i) & 5)) + ((i & 5) << 1);
                DigitizedCardProfile = i2 % 128;
                if (i2 % 2 == 0) {
                    return getcmscformatteddigitizedcardprofile;
                }
                throw null;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) valueOf(new java.lang.Object[]{this}, 1906082035, -1906082035, java.lang.System.identityHashCode(this));
            }
        };
        int i = IccPrivateKeyCrtComponentsJson + 13;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return setmobilepin;
        }
        throw null;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        int i = getProfileVersion + 93;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            super.valueOf(transactioncanberesumed);
            super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
            int i2 = IccPrivateKeyCrtComponentsJson + 3;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AlternateContactlessPaymentDataJson() {
        if ((((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[0] & 63) == 31 || (((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[0] & 63) == 63) {
            if (((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[2] == 2) {
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 67) % 128;
                return true;
            }
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 109) % 128;
            if (((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[2] == 0) {
                getProfileVersion = (IccPrivateKeyCrtComponentsJson + 77) % 128;
                return true;
            }
        }
        int i = getProfileVersion + 71;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean values() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 7) % 128;
        if ((((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[0] & 63) != 1) {
            int i = IccPrivateKeyCrtComponentsJson + 53;
            getProfileVersion = i % 128;
            if (i % 2 != 0) {
            }
        }
        return ((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[2] == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean writeReplace() {
        if (((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf()[2] != 0) {
            return false;
        }
        int i = IccPrivateKeyCrtComponentsJson;
        getProfileVersion = (i + 37) % 128;
        getProfileVersion = (i + 125) % 128;
        return true;
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $11 + 35;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr4 = DigitizedCardProfile;
        long j = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.View.resolveSizeAndState(0, 0, 0), 286 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 46336))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr5[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (valueOf) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                getumdgeneration.values = bArr2.length;
                cArr2 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 1;
            } else {
                getumdgeneration.values = bArr2.length;
                cArr2 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
            }
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr2[getumdgeneration.valueOf] = (char) (cArr4[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 44, 1629 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) 0, (short) 0, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr2);
            return;
        }
        if (!values) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 15) % 128;
                cArr6[getumdgeneration.valueOf] = (char) (cArr4[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        $10 = ($11 + 105) % 128;
        getumdgeneration.values = cArr3.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr4[cArr3[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 43, 1628 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, (short) 0, (byte) 0, objArr7);
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
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        DigitizedCardProfile = new char[]{10988, 11003, 10774, 10985};
        AlternateContactlessPaymentDataJson = -143185371;
        values = true;
        valueOf = true;
    }

    static void init$0() {
        $$a = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB};
        $$b = 141;
    }

    public final int IccPrivateKeyCrtComponentsJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2101748344, -2101748344, java.lang.System.identityHashCode(this))).intValue();
    }
}
