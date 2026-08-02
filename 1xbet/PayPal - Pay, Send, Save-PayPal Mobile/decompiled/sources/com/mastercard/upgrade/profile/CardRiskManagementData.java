package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class CardRiskManagementData {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "additionalCheckTable")
    private com.payair.hce.isUiContext mAdditionalCheckTable;

    @com.payair.hce.setSelectionFromTop(valueOf = "crmCountryCode")
    private com.payair.hce.isUiContext mCrmCountryCode;

    public final com.payair.hce.isUiContext getAdditionalCheckTable() {
        int i = DigitizedCardProfile;
        int i2 = (((i | 7) << 1) - (i ^ 7)) % 128;
        valueOf = i2;
        com.payair.hce.isUiContext isuicontext = this.mAdditionalCheckTable;
        int i3 = ((i2 | 104) << 1) - (i2 ^ 104);
        int i4 = (~i3) + (i3 << 1);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            return isuicontext;
        }
        throw null;
    }

    public final void setAdditionalCheckTable(com.payair.hce.isUiContext isuicontext) {
        int i = valueOf + 87;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            this.mAdditionalCheckTable = isuicontext;
        } else {
            this.mAdditionalCheckTable = isuicontext;
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.isUiContext getCrmCountryCode() {
        int i = DigitizedCardProfile;
        int i2 = (((i & 16) + (i | 16)) - 1) % 128;
        valueOf = i2;
        com.payair.hce.isUiContext isuicontext = this.mCrmCountryCode;
        int i3 = (i2 & 66) + (i2 | 66);
        DigitizedCardProfile = ((~i3) + (i3 << 1)) % 128;
        return isuicontext;
    }

    public final void setCrmCountryCode(com.payair.hce.isUiContext isuicontext) {
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 73) + ((i & 73) << 1)) % 128;
        valueOf = i2;
        this.mCrmCountryCode = isuicontext;
        int i3 = ((i2 ^ 83) | (i2 & 83)) << 1;
        int i4 = -(((~i2) & 83) | (i2 & (-84)));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
