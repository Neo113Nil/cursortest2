package com.payair.hce;

/* loaded from: classes4.dex */
public class setPreferKeepClearRects {
    private static int DigitizedCardProfile = 1;
    private static int values;
    private java.lang.String valueOf;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i2 * (-215)) + ((~(i3 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((~i2) | i | i4) * (-216)) + (((~(i | i4)) | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        if (i5 == 1) {
            return valueOf(objArr);
        }
        if (i5 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i5 == 3) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 != 4) {
            return values(objArr);
        }
        com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects = (com.payair.hce.setPreferKeepClearRects) objArr[0];
        int i6 = (DigitizedCardProfile + 35) % 128;
        values = i6;
        java.lang.String str = setpreferkeepclearrects.valueOf;
        DigitizedCardProfile = (((i6 | 81) << 1) - (i6 ^ 81)) % 128;
        return str;
    }

    public setPreferKeepClearRects() {
    }

    setPreferKeepClearRects(int i, java.lang.String str) {
        this.writeReplace = i;
        this.valueOf = str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.String values2 = new com.payair.hce.IccPrivateKeyCrtComponentsJson().values((com.payair.hce.setPreferKeepClearRects) objArr[0]);
        int i = DigitizedCardProfile + 77;
        values = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i;
        try {
            com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects = (com.payair.hce.setPreferKeepClearRects) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace((java.lang.String) objArr[0], com.payair.hce.setPreferKeepClearRects.class);
            i = ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclearrects}, -123204059, 123204061, java.lang.System.identityHashCode(setpreferkeepclearrects))).intValue();
            int i2 = DigitizedCardProfile;
            values = ((i2 ^ 31) + ((i2 & 31) << 1)) % 128;
        } catch (java.lang.Exception unused) {
            i = -1;
        }
        int i3 = values;
        DigitizedCardProfile = (((i3 & (-16)) | ((~i3) & 15)) + ((i3 & 15) << 1)) % 128;
        return java.lang.Integer.valueOf(i);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str;
        try {
            com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects = (com.payair.hce.setPreferKeepClearRects) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace((java.lang.String) objArr[0], com.payair.hce.setPreferKeepClearRects.class);
            str = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclearrects}, -501263857, 501263861, java.lang.System.identityHashCode(setpreferkeepclearrects));
            int i = DigitizedCardProfile & 13;
            values = ((i - (~((r0 ^ 13) | i))) - 1) % 128;
        } catch (java.lang.Exception unused) {
            str = "";
        }
        int i2 = values;
        int i3 = (i2 & (-78)) | ((~i2) & 77);
        int i4 = (i2 & 77) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setPreferKeepClearRects setpreferkeepclearrects = (com.payair.hce.setPreferKeepClearRects) objArr[0];
        int i = DigitizedCardProfile + 24;
        int i2 = (~i) + (i << 1);
        values = i2 % 128;
        int i3 = setpreferkeepclearrects.writeReplace;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw null;
    }

    public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        gettrack2equivalent.writeReplace(getremotepaymentdata, 8);
        getremotepaymentdata.writeReplace(java.lang.Integer.valueOf(this.writeReplace));
        if (this != this.valueOf) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 72);
            getremotepaymentdata.DigitizedCardProfile(this.valueOf);
        }
        getremotepaymentdata.values();
    }

    public final /* synthetic */ void AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            int AlternateContactlessPaymentDataJson = getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
            if (AlternateContactlessPaymentDataJson != 49) {
                if (AlternateContactlessPaymentDataJson != 66) {
                    getackautomaticallyresetbyapplication.getCvrMaskAnd();
                } else if (z) {
                    this.valueOf = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN ? getackautomaticallyresetbyapplication.getAid() : java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
                } else {
                    this.valueOf = null;
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
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
    }

    private java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -501263857, 501263861, java.lang.System.identityHashCode(this));
    }

    private int values() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -123204059, 123204061, java.lang.System.identityHashCode(this))).intValue();
    }

    static java.lang.String valueOf(java.lang.String str) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{str}, -1044720111, 1044720111, (int) java.lang.System.currentTimeMillis());
    }

    static int AlternateContactlessPaymentDataJson(java.lang.String str) {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{str}, -135600210, 135600213, (int) java.lang.System.currentTimeMillis())).intValue();
    }

    final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 408851357, -408851356, java.lang.System.identityHashCode(this));
    }
}
