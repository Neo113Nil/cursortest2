package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\bB1\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0011\u0010\u0012R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0012R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u000f\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0013\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0015\u0010\u0012"}, d2 = {"Lcom/payair/hce/setOnCapturedPointerListener;", "", "<init>", "()V", "", "p0", "p1", "p2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "p3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "IccPrivateKeyCrtComponentsJson", "toString", "()Ljava/lang/String;", "valueOf", "Ljava/lang/String;", "AlternateContactlessPaymentDataJson", "(Ljava/lang/String;)V", "values", "writeReplace", "DigitizedCardProfile", "RecordsJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setOnCapturedPointerListener {

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    public static final com.payair.hce.setOnCapturedPointerListener.Companion INSTANCE = new com.payair.hce.setOnCapturedPointerListener.Companion(null);
    private static java.lang.String IccPrivateKeyCrtComponentsJson = "CRYPTO_KEY";
    private static java.lang.String SdkCoreAlternateContactlessPaymentDataImpl = "98752315";
    private static java.lang.String SdkCoreBusinessLogicModuleImpl = "CRYPTO_SHARED_PREFERENCES";
    private static java.lang.String getAid = "CRYPTO_KEK";
    private static int getCiacDecline = 1;
    private static java.lang.String getCvrMaskAnd = "KD";
    private static java.lang.String getGpoResponse = "CRYPTO_JWT";
    private static int getPaymentFci = 0;
    private static java.lang.String getProfileVersion = "CRYPTO_SIGN";

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    private java.lang.String writeReplace;

    /* renamed from: RecordsJson, reason: from kotlin metadata */
    private java.lang.String DigitizedCardProfile;

    /* renamed from: valueOf, reason: from kotlin metadata */
    private java.lang.String values;

    /* renamed from: values, reason: from kotlin metadata */
    private java.lang.String AlternateContactlessPaymentDataJson;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    private java.lang.String valueOf;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = i4 | i2;
        int i6 = ~i3;
        switch ((i * 755) + (i2 * (-753)) + (((~i5) | (~(i4 | i3)) | (~(i2 | i3))) * (-754)) + (((~(i | i6 | i2)) | (~(i5 | i3))) * (-754)) + ((i4 | i6) * 754)) {
            case 1:
                ((com.payair.hce.setOnCapturedPointerListener) objArr[0]).values = (java.lang.String) objArr[1];
                getCiacDecline = (getPaymentFci + 125) % 128;
                return null;
            case 2:
                return valueOf(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                return values(objArr);
            case 5:
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
                int i7 = getCiacDecline;
                int i8 = (((i7 ^ 125) - (~((i7 & 125) << 1))) - 1) % 128;
                getPaymentFci = i8;
                java.lang.String str = setoncapturedpointerlistener.DigitizedCardProfile;
                int i9 = i8 & 89;
                int i10 = (i8 | 89) & (~i9);
                int i11 = i9 << 1;
                getCiacDecline = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                return str;
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            case 7:
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2 = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
                int i12 = getCiacDecline;
                getPaymentFci = ((i12 & 81) + (i12 | 81)) % 128;
                java.lang.String str2 = setoncapturedpointerlistener2.writeReplace;
                int i13 = (i12 & (-60)) | ((~i12) & 59);
                int i14 = (i12 & 59) << 1;
                getPaymentFci = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                return str2;
            case 8:
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener3 = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
                java.lang.String str3 = (java.lang.String) objArr[1];
                int i15 = getCiacDecline;
                int i16 = i15 ^ 115;
                int i17 = ((i15 & 115) | i16) << 1;
                int i18 = -i16;
                int i19 = ((i17 & i18) + (i17 | i18)) % 128;
                getPaymentFci = i19;
                setoncapturedpointerlistener3.writeReplace = str3;
                int i20 = i19 & 113;
                int i21 = ((i19 ^ 113) | i20) << 1;
                int i22 = -((~i20) & (i19 | 113));
                getCiacDecline = ((i21 & i22) + (i22 | i21)) % 128;
                return null;
            case 9:
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener4 = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
                int i23 = getCiacDecline;
                int i24 = i23 & 83;
                int i25 = -(-((i23 ^ 83) | i24));
                getPaymentFci = ((i24 ^ i25) + ((i24 & i25) << 1)) % 128;
                setoncapturedpointerlistener4.AlternateContactlessPaymentDataJson = null;
                setoncapturedpointerlistener4.writeReplace = null;
                setoncapturedpointerlistener4.values = null;
                setoncapturedpointerlistener4.valueOf = null;
                setoncapturedpointerlistener4.DigitizedCardProfile = null;
                getPaymentFci = ((-2) - (~(i23 + 16))) % 128;
                return null;
            case 10:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 11:
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener5 = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
                int i26 = getCiacDecline;
                getPaymentFci = ((i26 & 77) + (i26 | 77)) % 128;
                java.lang.String str4 = setoncapturedpointerlistener5.values;
                getPaymentFci = (((i26 | 107) << 1) - ((i26 & (-108)) | ((~i26) & 107))) % 128;
                return str4;
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPaymentFci;
        int i2 = i & 117;
        int i3 = ((i | 117) & (~i2)) + (i2 << 1);
        getCiacDecline = i3 % 128;
        setoncapturedpointerlistener.AlternateContactlessPaymentDataJson = str;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
        int i = getPaymentFci;
        int i2 = i & 43;
        int i3 = i | 43;
        int i4 = (i2 & i3) + (i3 | i2);
        getCiacDecline = i4 % 128;
        java.lang.String str = setoncapturedpointerlistener.AlternateContactlessPaymentDataJson;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
        int i = getPaymentFci;
        int i2 = ((i & 42) + (i | 42)) - 1;
        getCiacDecline = i2 % 128;
        java.lang.String str = setoncapturedpointerlistener.valueOf;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPaymentFci;
        int i2 = i ^ 5;
        int i3 = -(-((i & 5) << 1));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getCiacDecline = i4;
        setoncapturedpointerlistener.valueOf = str;
        int i5 = i4 + 95;
        getPaymentFci = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getCiacDecline;
        int i2 = i & 31;
        int i3 = (i2 - (~((i ^ 31) | i2))) - 1;
        getPaymentFci = i3 % 128;
        setoncapturedpointerlistener.DigitizedCardProfile = str;
        if (i3 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public setOnCapturedPointerListener() {
    }

    public setOnCapturedPointerListener(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.AlternateContactlessPaymentDataJson = str;
        this.writeReplace = str2;
        this.values = str3;
    }

    public setOnCapturedPointerListener(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.AlternateContactlessPaymentDataJson = str;
        this.writeReplace = str2;
        this.values = str3;
        this.valueOf = str4;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[0];
        int i = getCiacDecline;
        int i2 = ((((i ^ 91) | (i & 91)) << 1) - (~(-((i & (-92)) | ((~i) & 91))))) - 1;
        getPaymentFci = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.String str = setoncapturedpointerlistener.AlternateContactlessPaymentDataJson;
            java.lang.String str2 = setoncapturedpointerlistener.writeReplace;
            java.lang.String str3 = setoncapturedpointerlistener.values;
            java.lang.String str4 = setoncapturedpointerlistener.valueOf;
            java.lang.String str5 = setoncapturedpointerlistener.DigitizedCardProfile;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoKey{keyId='");
            sb.append(str);
            sb.append("', type='");
            sb.append(str2);
            sb.append("', encryptedKey='");
            sb.append(str3);
            sb.append("', IV='");
            sb.append(str4);
            sb.append("', wbcKeyVersion='");
            sb.append(str5);
            sb.append("'}");
            java.lang.String obj = sb.toString();
            int i3 = getPaymentFci;
            getCiacDecline = ((-2) - (~(((i3 | 18) << 1) - (i3 ^ 18)))) % 128;
            return obj;
        }
        java.lang.String str6 = setoncapturedpointerlistener.AlternateContactlessPaymentDataJson;
        java.lang.String str7 = setoncapturedpointerlistener.writeReplace;
        java.lang.String str8 = setoncapturedpointerlistener.values;
        java.lang.String str9 = setoncapturedpointerlistener.valueOf;
        java.lang.String str10 = setoncapturedpointerlistener.DigitizedCardProfile;
        throw null;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setOnCapturedPointerListener$AlternateContactlessPaymentDataJson;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setOnCapturedPointerListener$AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ void values(com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        gettrack2equivalent.writeReplace(getremotepaymentdata, 82);
        getremotepaymentdata.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 56);
        getremotepaymentdata.DigitizedCardProfile(this.writeReplace);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 71);
        getremotepaymentdata.DigitizedCardProfile(this.values);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 10);
        getremotepaymentdata.DigitizedCardProfile(this.valueOf);
        gettrack2equivalent.writeReplace(getremotepaymentdata, 68);
        getremotepaymentdata.DigitizedCardProfile(this.DigitizedCardProfile);
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void values(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 23) {
                if (AlternateContactlessPaymentDataJson != 26) {
                    if (AlternateContactlessPaymentDataJson != 43) {
                        if (AlternateContactlessPaymentDataJson != 67) {
                            if (AlternateContactlessPaymentDataJson != 76) {
                                getackautomaticallyresetbyapplication.getCvrMaskAnd();
                            } else if (z) {
                                this.DigitizedCardProfile = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                            } else {
                                this.DigitizedCardProfile = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            this.writeReplace = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            this.writeReplace = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        this.valueOf = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        this.valueOf = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    this.values = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    this.values = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                this.AlternateContactlessPaymentDataJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
            } else {
                this.AlternateContactlessPaymentDataJson = null;
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    static {
        int i = getPaymentFci + 11;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final void IccPrivateKeyCrtComponentsJson() {
        writeReplace(new java.lang.Object[]{this}, -808754747, 808754756, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String toString() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -83955156, 83955166, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, 1349837615, -1349837613, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -78188493, 78188498, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, -1680271665, 1680271669, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 2121132154, -2121132154, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, 1863235497, -1863235496, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1049511775, 1049511786, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, -497714482, 497714490, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1343611449, -1343611442, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, 1763937367, -1763937361, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 835337865, -835337862, java.lang.System.identityHashCode(this));
    }
}
