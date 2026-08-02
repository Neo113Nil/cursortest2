package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContentInsetsAbsolute extends com.payair.hce.setGravity {
    private static int getCiacDecline = 0;
    private static int getCvrMaskAnd = 1;
    private java.math.BigInteger AlternateContactlessPaymentDataJson;
    private java.math.BigInteger DigitizedCardProfile;
    private java.math.BigInteger IccPrivateKeyCrtComponentsJson;
    private java.math.BigInteger RecordsJson;
    private java.math.BigInteger SdkCoreAlternateContactlessPaymentDataImpl;
    private java.math.BigInteger getAid;
    private java.math.BigInteger valueOf;
    private java.math.BigInteger values;
    private com.payair.hce.setMaxEms getProfileVersion = null;
    private java.math.BigInteger writeReplace = java.math.BigInteger.valueOf(0);

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        switch ((i * (-344)) + (i2 * (-344)) + (((~i6) | (~(i4 | i3))) * 345) + (((~(i | i5)) | (~((~i3) | i4))) * 345) + ((~(i6 | i3)) * 345)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                return values(objArr);
            case 5:
                return RecordsJson(objArr);
            case 6:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 7:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 8:
                return getAid(objArr);
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    public setContentInsetsAbsolute(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.math.BigInteger bigInteger6, java.math.BigInteger bigInteger7, java.math.BigInteger bigInteger8) {
        this.values = bigInteger;
        this.AlternateContactlessPaymentDataJson = bigInteger2;
        this.valueOf = bigInteger3;
        this.DigitizedCardProfile = bigInteger4;
        this.getAid = bigInteger5;
        this.RecordsJson = bigInteger6;
        this.IccPrivateKeyCrtComponentsJson = bigInteger7;
        this.SdkCoreAlternateContactlessPaymentDataImpl = bigInteger8;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = ((i & (-74)) | ((~i) & 73)) + ((i & 73) << 1);
        int i3 = i2 % 128;
        getCiacDecline = i3;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.values;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = (i3 ^ 113) + ((i3 & 113) << 1);
        getCvrMaskAnd = i4 % 128;
        if (i4 % 2 != 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd | 113;
        int i2 = (((i << 1) - (~(-((~(r0 & 113)) & i)))) - 1) % 128;
        getCiacDecline = i2;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.AlternateContactlessPaymentDataJson;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = ((-2) - (~(((i | 46) << 1) - (i ^ 46)))) % 128;
        getCiacDecline = i2;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.valueOf;
        int i3 = i2 + 51;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = ((i & 116) + (i | 116)) - 1;
        int i3 = i2 % 128;
        getCiacDecline = i3;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.DigitizedCardProfile;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 ^ 111;
        int i5 = ((i3 & 111) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        getCvrMaskAnd = i7 % 128;
        if (i7 % 2 != 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCiacDecline;
        int i2 = i & 83;
        int i3 = ((((i ^ 83) | i2) << 1) - (~(-((~i2) & (i | 83))))) - 1;
        getCvrMaskAnd = i3 % 128;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.getAid;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i + 39;
        getCvrMaskAnd = i4 % 128;
        if (i4 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = ((i ^ 90) + ((i & 90) << 1)) - 1;
        getCiacDecline = i2 % 128;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.RecordsJson;
        if (i2 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i & 7;
        int i3 = (i ^ 7) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getCiacDecline = i4 % 128;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.IccPrivateKeyCrtComponentsJson;
        if (i4 % 2 == 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = ((i & (-72)) | ((~i) & 71)) + ((i & 71) << 1);
        int i3 = i2 % 128;
        getCiacDecline = i3;
        java.math.BigInteger bigInteger = setcontentinsetsabsolute.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i2 % 2 != 0) {
            throw null;
        }
        getCvrMaskAnd = (((i3 & (-12)) | ((~i3) & 11)) + ((i3 & 11) << 1)) % 128;
        return bigInteger;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setContentInsetsAbsolute setcontentinsetsabsolute = (com.payair.hce.setContentInsetsAbsolute) objArr[0];
        com.payair.hce.setHintTextColor sethinttextcolor = new com.payair.hce.setHintTextColor();
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling(setcontentinsetsabsolute.writeReplace)}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, -1663938761, 1663938761, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, 227865608, -227865602, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, 651586728, -651586720, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, -694591890, 694591897, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, 905357736, -905357734, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, 2041779908, -2041779903, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, -517638437, 517638441, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, new com.payair.hce.setHorizontallyScrolling((java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcontentinsetsabsolute}, -814634869, 814634870, java.lang.System.identityHashCode(setcontentinsetsabsolute)))}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setMaxEms setmaxems = setcontentinsetsabsolute.getProfileVersion;
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = new com.payair.hce.setCustomInsertionActionModeCallback(sethinttextcolor);
        int i = getCvrMaskAnd + 61;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            return setcustominsertionactionmodecallback;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setGravity, com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        return (com.payair.hce.setEms) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 477128641, -477128638, java.lang.System.identityHashCode(this));
    }

    private java.math.BigInteger SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -814634869, 814634870, java.lang.System.identityHashCode(this));
    }

    private java.math.BigInteger IccPrivateKeyCrtComponentsJson() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -517638437, 517638441, java.lang.System.identityHashCode(this));
    }

    private java.math.BigInteger RecordsJson() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2041779908, -2041779903, java.lang.System.identityHashCode(this));
    }

    private java.math.BigInteger values() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 905357736, -905357734, java.lang.System.identityHashCode(this));
    }

    private java.math.BigInteger DigitizedCardProfile() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -694591890, 694591897, java.lang.System.identityHashCode(this));
    }

    public final java.math.BigInteger AlternateContactlessPaymentDataJson() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 651586728, -651586720, java.lang.System.identityHashCode(this));
    }

    private java.math.BigInteger writeReplace() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 227865608, -227865602, java.lang.System.identityHashCode(this));
    }

    public final java.math.BigInteger valueOf() {
        return (java.math.BigInteger) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1663938761, 1663938761, java.lang.System.identityHashCode(this));
    }
}
