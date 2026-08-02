package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class MppLiteModule {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardRiskManagementData")
    private com.mastercard.upgrade.profile.CardRiskManagementData cardRiskManagementData;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessPaymentData")
    private com.mastercard.upgrade.profile.ContactlessPaymentData contactlessPaymentData;

    @com.payair.hce.setSelectionFromTop(valueOf = "remotePaymentData")
    private com.mastercard.upgrade.profile.RemotePaymentData remotePaymentData;

    public final com.mastercard.upgrade.profile.ContactlessPaymentData getContactlessPaymentData() {
        int i = (values + 105) % 128;
        AlternateContactlessPaymentDataJson = i;
        com.mastercard.upgrade.profile.ContactlessPaymentData contactlessPaymentData = this.contactlessPaymentData;
        values = (((i | 51) << 1) - (i ^ 51)) % 128;
        return contactlessPaymentData;
    }

    public final void setContactlessPaymentData(com.mastercard.upgrade.profile.ContactlessPaymentData contactlessPaymentData) {
        int i = values;
        int i2 = i & 115;
        int i3 = -(-((i ^ 115) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            this.contactlessPaymentData = contactlessPaymentData;
            int i5 = i & 59;
            int i6 = (i ^ 59) | i5;
            AlternateContactlessPaymentDataJson = ((i5 & i6) + (i5 | i6)) % 128;
            return;
        }
        this.contactlessPaymentData = contactlessPaymentData;
        throw null;
    }

    public final com.mastercard.upgrade.profile.RemotePaymentData getRemotePaymentData() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-38)) | ((~i) & 37);
        int i3 = (i & 37) << 1;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        values = i4;
        com.mastercard.upgrade.profile.RemotePaymentData remotePaymentData = this.remotePaymentData;
        int i5 = (((i4 & (-62)) | ((~i4) & 61)) - (~((i4 & 61) << 1))) - 1;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return remotePaymentData;
        }
        throw null;
    }

    public final void setRemotePaymentData(com.mastercard.upgrade.profile.RemotePaymentData remotePaymentData) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 97;
        int i3 = i | 97;
        int i4 = (i2 & i3) + (i2 | i3);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            this.remotePaymentData = remotePaymentData;
            int i5 = i & 107;
            int i6 = (i ^ 107) | i5;
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            values = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.remotePaymentData = remotePaymentData;
        throw null;
    }

    public final com.mastercard.upgrade.profile.CardRiskManagementData getCardRiskManagementData() {
        int i = values;
        int i2 = i ^ 31;
        int i3 = -(-((i & 31) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        com.mastercard.upgrade.profile.CardRiskManagementData cardRiskManagementData = this.cardRiskManagementData;
        if (i4 % 2 == 0) {
            return cardRiskManagementData;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setCardRiskManagementData(com.mastercard.upgrade.profile.CardRiskManagementData cardRiskManagementData) {
        int i = values + 1;
        int i2 = i % 128;
        AlternateContactlessPaymentDataJson = i2;
        if (i % 2 == 0) {
            this.cardRiskManagementData = cardRiskManagementData;
            int i3 = (i2 & 33) + (i2 | 33);
            values = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.cardRiskManagementData = cardRiskManagementData;
        throw new java.lang.ArithmeticException();
    }
}
