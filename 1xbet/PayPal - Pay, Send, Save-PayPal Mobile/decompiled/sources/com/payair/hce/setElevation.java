package com.payair.hce;

/* loaded from: classes4.dex */
public class setElevation {
    private static int getAid = 1;
    private static int getProfileVersion;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String RecordsJson;
    private java.lang.String valueOf;
    private int values;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        int i8 = (i * (-1529)) + (i2 * (-764)) + (((~(i2 | i4 | i3)) | (~(i6 | i7)) | (~(i5 | i | i3))) * 765) + (((~i6) | (~(i4 | i7))) * 1530) + (((~(i | i5 | i7)) | (~(i4 | i3))) * 765);
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? values(objArr) : getAid(objArr) : writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setElevation setelevation = (com.payair.hce.setElevation) objArr[0];
        int i = getProfileVersion;
        int i2 = i & 99;
        getAid = ((i2 - (~((i ^ 99) | i2))) - 1) % 128;
        int i3 = setelevation.values;
        int i4 = i & 63;
        int i5 = -(-((i ^ 63) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setElevation setelevation = (com.payair.hce.setElevation) objArr[0];
        int i = getAid;
        int i2 = i & 93;
        int i3 = (((i | 93) & (~i2)) + (i2 << 1)) % 128;
        getProfileVersion = i3;
        java.lang.String str = setelevation.writeReplace;
        int i4 = (i3 | 85) << 1;
        int i5 = -((i3 & (-86)) | ((~i3) & 85));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setElevation setelevation = (com.payair.hce.setElevation) objArr[0];
        int i = getAid;
        int i2 = (((i | 31) << 1) - (i ^ 31)) % 128;
        getProfileVersion = i2;
        java.lang.String str = setelevation.DigitizedCardProfile;
        int i3 = i2 ^ 57;
        int i4 = ((((i2 & 57) | i3) << 1) - (~(-i3))) - 1;
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setElevation setelevation = (com.payair.hce.setElevation) objArr[0];
        int i = getProfileVersion;
        int i2 = i & 111;
        int i3 = (i | 111) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getAid = i5 % 128;
        java.lang.String str = setelevation.AlternateContactlessPaymentDataJson;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setElevation setelevation = (com.payair.hce.setElevation) objArr[0];
        int i = getProfileVersion;
        int i2 = i & 41;
        int i3 = (i ^ 41) | i2;
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        getAid = i4 % 128;
        java.lang.String str = setelevation.valueOf;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = i & 9;
        getAid = ((i5 - (~((i ^ 9) | i5))) - 1) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setElevation setelevation = (com.payair.hce.setElevation) objArr[0];
        int i = (getAid + 7) % 128;
        getProfileVersion = i;
        java.lang.String str = setelevation.RecordsJson;
        int i2 = i & 31;
        int i3 = ((i ^ 31) | i2) << 1;
        int i4 = -((i | 31) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        gettrack2equivalent.writeReplace(getremotepaymentdata, 45);
        getremotepaymentdata.writeReplace(java.lang.Integer.valueOf(this.values));
        if (this != this.writeReplace) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 23);
            getremotepaymentdata.DigitizedCardProfile(this.writeReplace);
        }
        if (this != this.DigitizedCardProfile) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 55);
            getremotepaymentdata.DigitizedCardProfile(this.DigitizedCardProfile);
        }
        if (this != this.AlternateContactlessPaymentDataJson) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 44);
            getremotepaymentdata.DigitizedCardProfile(this.AlternateContactlessPaymentDataJson);
        }
        if (this != this.valueOf) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 75);
            getremotepaymentdata.DigitizedCardProfile(this.valueOf);
        }
        if (this != this.RecordsJson) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 22);
            getremotepaymentdata.DigitizedCardProfile(this.RecordsJson);
        }
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void values(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 40) {
                if (AlternateContactlessPaymentDataJson != 48) {
                    if (AlternateContactlessPaymentDataJson != 50) {
                        if (AlternateContactlessPaymentDataJson != 54) {
                            if (AlternateContactlessPaymentDataJson != 81) {
                                if (AlternateContactlessPaymentDataJson != 83) {
                                    getackautomaticallyresetbyapplication.getCvrMaskAnd();
                                } else if (z) {
                                    this.writeReplace = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                                } else {
                                    this.writeReplace = null;
                                    getackautomaticallyresetbyapplication.RecordsJson();
                                }
                            } else if (z) {
                                this.DigitizedCardProfile = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                            } else {
                                this.DigitizedCardProfile = null;
                                getackautomaticallyresetbyapplication.RecordsJson();
                            }
                        } else if (z) {
                            this.valueOf = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                        } else {
                            this.valueOf = null;
                            getackautomaticallyresetbyapplication.RecordsJson();
                        }
                    } else if (z) {
                        this.RecordsJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                    } else {
                        this.RecordsJson = null;
                        getackautomaticallyresetbyapplication.RecordsJson();
                    }
                } else if (z) {
                    this.AlternateContactlessPaymentDataJson = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    this.AlternateContactlessPaymentDataJson = null;
                    getackautomaticallyresetbyapplication.RecordsJson();
                }
            } else if (z) {
                try {
                    this.values = getackautomaticallyresetbyapplication.getCiacDecline();
                } catch (java.lang.NumberFormatException e) {
                    throw new com.payair.hce.getDualTapResetTimeout(e);
                }
            } else {
                getackautomaticallyresetbyapplication.RecordsJson();
            }
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -2072818063, 2072818064, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1547533570, -1547533565, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1997861224, 1997861228, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -829104869, 829104869, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 854617093, -854617091, java.lang.System.identityHashCode(this));
    }

    public final int values() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 373630701, -373630698, java.lang.System.identityHashCode(this))).intValue();
    }
}
