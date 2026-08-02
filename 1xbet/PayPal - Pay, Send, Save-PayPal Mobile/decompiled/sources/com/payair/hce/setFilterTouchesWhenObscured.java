package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFilterTouchesWhenObscured {
    private static int getCvrMaskAnd = 1;
    private static int getPaymentFci;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private com.payair.hce.AuthenticationEnum DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String RecordsJson;
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;
    private boolean getAid;
    private java.lang.String getProfileVersion;
    private java.lang.String valueOf;
    private java.lang.String values;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        switch ((i * (-380)) + (i2 * 382) + ((i2 | i3 | i4) * (-381)) + (((~(i | i2)) | (~((~i3) | i2)) | (~((~i2) | i4))) * 381) + ((~(i4 | i2)) * 381)) {
            case 1:
                return values(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
                int i5 = (getPaymentFci + 43) % 128;
                getCvrMaskAnd = i5;
                java.lang.String str = setfiltertoucheswhenobscured.getProfileVersion;
                int i6 = i5 & 59;
                getPaymentFci = ((i6 - (~(-(-((i5 ^ 59) | i6))))) - 1) % 128;
                return str;
            case 7:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 8:
                return getProfileVersion(objArr);
            case 9:
                com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured2 = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
                int i7 = getPaymentFci;
                int i8 = (i7 & (-30)) | ((~i7) & 29);
                int i9 = (i7 & 29) << 1;
                getCvrMaskAnd = ((i8 ^ i9) + ((i8 & i9) << 1)) % 128;
                java.lang.String str2 = setfiltertoucheswhenobscured2.IccPrivateKeyCrtComponentsJson;
                int i10 = i7 & 63;
                int i11 = (i7 | 63) & (~i10);
                int i12 = -(-(i10 << 1));
                getCvrMaskAnd = ((i11 ^ i12) + ((i11 & i12) << 1)) % 128;
                return str2;
            case 10:
                return RecordsJson(objArr);
            default:
                com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured3 = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
                int i13 = getPaymentFci;
                int i14 = ((i13 & 95) + (i13 | 95)) % 128;
                getCvrMaskAnd = i14;
                java.lang.String str3 = setfiltertoucheswhenobscured3.valueOf;
                int i15 = i14 & 71;
                getPaymentFci = (((((i14 ^ 71) | i15) << 1) - (~(-((~i15) & (i14 | 71))))) - 1) % 128;
                return str3;
        }
    }

    public setFilterTouchesWhenObscured(java.lang.String str, java.lang.String str2, com.payair.hce.AuthenticationEnum authenticationEnum, int i, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.valueOf = str;
        this.values = str2;
        this.DigitizedCardProfile = authenticationEnum;
        this.writeReplace = i;
        this.AlternateContactlessPaymentDataJson = str3;
        this.IccPrivateKeyCrtComponentsJson = str4;
        this.getAid = z;
        this.RecordsJson = str5;
        this.SdkCoreAlternateContactlessPaymentDataImpl = str6;
        this.getProfileVersion = str7;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = -(-((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getPaymentFci = i5;
        java.lang.String str = setfiltertoucheswhenobscured.values;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i6 = i5 & 51;
        getCvrMaskAnd = ((i6 - (~(-(-((i5 ^ 51) | i6))))) - 1) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i & 107;
        int i3 = -(-(i | 107));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        getPaymentFci = i5;
        com.payair.hce.AuthenticationEnum authenticationEnum = setfiltertoucheswhenobscured.DigitizedCardProfile;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = i5 + 32;
        int i7 = (~i6) + (i6 << 1);
        getCvrMaskAnd = i7 % 128;
        if (i7 % 2 != 0) {
            return authenticationEnum;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getPaymentFci;
        getCvrMaskAnd = (i + 75) % 128;
        int i2 = setfiltertoucheswhenobscured.writeReplace;
        int i3 = i & 57;
        int i4 = (i ^ 57) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Integer.valueOf(i2);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getPaymentFci;
        int i2 = i & 69;
        int i3 = (((i ^ 69) | i2) << 1) - ((i | 69) & (~i2));
        getCvrMaskAnd = i3 % 128;
        java.lang.String str = setfiltertoucheswhenobscured.AlternateContactlessPaymentDataJson;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = (i & 39) + (i | 39);
        getPaymentFci = i2 % 128;
        boolean z = setfiltertoucheswhenobscured.getAid;
        if (i2 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getPaymentFci = i2 % 128;
        java.lang.String str = setfiltertoucheswhenobscured.RecordsJson;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = (i & (-48)) | ((~i) & 47);
        int i4 = (i & 47) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getPaymentFci = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getPaymentFci;
        getCvrMaskAnd = (i + 97) % 128;
        java.lang.String str = setfiltertoucheswhenobscured.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (-2) - (~(i + 126));
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setFilterTouchesWhenObscured setfiltertoucheswhenobscured = (com.payair.hce.setFilterTouchesWhenObscured) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = (i | 13) << 1;
        int i3 = -((i & (-14)) | ((~i) & 13));
        getPaymentFci = ((i2 & i3) + (i3 | i2)) % 128;
        java.lang.String str = setfiltertoucheswhenobscured.valueOf;
        java.lang.String str2 = setfiltertoucheswhenobscured.values;
        com.payair.hce.AuthenticationEnum authenticationEnum = setfiltertoucheswhenobscured.DigitizedCardProfile;
        int i4 = setfiltertoucheswhenobscured.writeReplace;
        java.lang.String str3 = setfiltertoucheswhenobscured.AlternateContactlessPaymentDataJson;
        java.lang.String str4 = setfiltertoucheswhenobscured.IccPrivateKeyCrtComponentsJson;
        boolean z = setfiltertoucheswhenobscured.getAid;
        java.lang.String str5 = setfiltertoucheswhenobscured.RecordsJson;
        java.lang.String str6 = setfiltertoucheswhenobscured.SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.String str7 = setfiltertoucheswhenobscured.getProfileVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitialisationObject{schemeAndDomain='");
        sb.append(str);
        sb.append("', basePath='");
        sb.append(str2);
        sb.append("', authenticationEnum=");
        sb.append(authenticationEnum);
        sb.append(", flavourId=");
        sb.append(i4);
        sb.append(", packageName='");
        sb.append(str3);
        sb.append("', gcmId='");
        sb.append(str4);
        sb.append("', isContactless=");
        sb.append(z);
        sb.append(", paymentAppProviderId='");
        sb.append(str5);
        sb.append("', intentURI='");
        sb.append(str6);
        sb.append("', intentURI='");
        sb.append(str7);
        sb.append("'}");
        java.lang.String obj = sb.toString();
        int i5 = getPaymentFci;
        int i6 = i5 ^ 71;
        int i7 = (i5 & 71) << 1;
        int i8 = (i6 & i7) + (i7 | i6);
        getCvrMaskAnd = i8 % 128;
        if (i8 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    public final /* synthetic */ void AlternateContactlessPaymentDataJson(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        gettrack2equivalent.writeReplace(getremotepaymentdata, 64);
        getremotepaymentdata.DigitizedCardProfile(this.valueOf);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 58);
        getremotepaymentdata.DigitizedCardProfile(this.values);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 52);
        com.payair.hce.AuthenticationEnum authenticationEnum = this.DigitizedCardProfile;
        com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.payair.hce.AuthenticationEnum.class, authenticationEnum).writeReplace(getremotepaymentdata, authenticationEnum);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 12);
        getremotepaymentdata.writeReplace(java.lang.Integer.valueOf(this.writeReplace));
        gettrack2equivalent.writeReplace(getremotepaymentdata, 25);
        getremotepaymentdata.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 39);
        getremotepaymentdata.DigitizedCardProfile(this.IccPrivateKeyCrtComponentsJson);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 21);
        getremotepaymentdata.valueOf(this.getAid);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 50);
        getremotepaymentdata.DigitizedCardProfile(this.RecordsJson);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 87);
        getremotepaymentdata.DigitizedCardProfile(this.SdkCoreAlternateContactlessPaymentDataImpl);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 15);
        getremotepaymentdata.DigitizedCardProfile(this.getProfileVersion);
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void AlternateContactlessPaymentDataJson(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 6) {
                if (AlternateContactlessPaymentDataJson != 13) {
                    if (AlternateContactlessPaymentDataJson != 28) {
                        if (AlternateContactlessPaymentDataJson != 41) {
                            if (AlternateContactlessPaymentDataJson != 57) {
                                if (AlternateContactlessPaymentDataJson != 61) {
                                    if (AlternateContactlessPaymentDataJson != 75) {
                                        if (AlternateContactlessPaymentDataJson != 77) {
                                            if (AlternateContactlessPaymentDataJson != 82) {
                                                if (AlternateContactlessPaymentDataJson != 84) {
                                                    getackautomaticallyresetbyapplication.getCvrMaskAnd();
                                                } else if (z) {
                                                    this.AlternateContactlessPaymentDataJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                                } else {
                                                    this.AlternateContactlessPaymentDataJson = null;
                                                    getackautomaticallyresetbyapplication.RecordsJson();
                                                }
                                            } else if (z) {
                                                this.getProfileVersion = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                            } else {
                                                this.getProfileVersion = null;
                                                getackautomaticallyresetbyapplication.RecordsJson();
                                            }
                                        } else if (z) {
                                            this.values = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                        } else {
                                            this.values = null;
                                            getackautomaticallyresetbyapplication.RecordsJson();
                                        }
                                    } else if (z) {
                                        try {
                                            this.writeReplace = getackautomaticallyresetbyapplication.getCiacDecline();
                                        } catch (java.lang.NumberFormatException e) {
                                            throw new com.payair.hce.getDualTapResetTimeout(e);
                                        }
                                    } else {
                                        getackautomaticallyresetbyapplication.RecordsJson();
                                    }
                                } else if (z) {
                                    this.RecordsJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                } else {
                                    this.RecordsJson = null;
                                    getackautomaticallyresetbyapplication.RecordsJson();
                                }
                            } else if (z) {
                                this.DigitizedCardProfile = (com.payair.hce.AuthenticationEnum) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.payair.hce.AuthenticationEnum.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                            } else {
                                this.DigitizedCardProfile = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            this.IccPrivateKeyCrtComponentsJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            this.IccPrivateKeyCrtComponentsJson = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        this.valueOf = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        this.valueOf = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    this.SdkCoreAlternateContactlessPaymentDataImpl = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    this.SdkCoreAlternateContactlessPaymentDataImpl = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                this.getAid = ((java.lang.Boolean) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(java.lang.Boolean.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication)).booleanValue();
            } else {
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    public /* synthetic */ setFilterTouchesWhenObscured() {
    }

    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1820521649, -1820521648, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 758756574, -758756568, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2102605827, 2102605830, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1059012793, 1059012801, java.lang.System.identityHashCode(this));
    }

    public final boolean RecordsJson() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1287038477, -1287038473, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2107836179, -2107836170, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1389129118, 1389129125, java.lang.System.identityHashCode(this));
    }

    public final int valueOf() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1732164557, -1732164547, java.lang.System.identityHashCode(this))).intValue();
    }

    public final com.payair.hce.AuthenticationEnum AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.AuthenticationEnum) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1004472773, -1004472768, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1029034562, 1029034564, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 759441492, -759441492, java.lang.System.identityHashCode(this));
    }
}
