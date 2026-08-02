package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class RemotePaymentData {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "aip")
    private com.payair.hce.isUiContext mAip;

    @com.payair.hce.setSelectionFromTop(valueOf = "applicationExpiryDate")
    private com.payair.hce.isUiContext mApplicationExpiryDate;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    private com.payair.hce.isUiContext mCiacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    private com.payair.hce.isUiContext mCvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    private com.payair.hce.isUiContext mIssuerApplicationData;

    @com.payair.hce.setSelectionFromTop(valueOf = "pan")
    private com.payair.hce.isUiContext mPan;

    @com.payair.hce.setSelectionFromTop(valueOf = "panSequenceNumber")
    private com.payair.hce.isUiContext mPanSequenceNumber;

    @com.payair.hce.setSelectionFromTop(valueOf = "track2Equivalent")
    private com.payair.hce.isUiContext mTrack2EquivalentData;

    public final com.payair.hce.isUiContext getPan() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i ^ 111;
        int i3 = -(-((i & 111) << 1));
        writeReplace = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        com.payair.hce.isUiContext isuicontext = this.mPan;
        int i4 = ((i | 99) << 1) - (i ^ 99);
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            return isuicontext;
        }
        throw null;
    }

    public final void setPan(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (((i | 111) << 1) - (i ^ 111)) % 128;
        this.mPan = isuicontext;
        writeReplace = (((i & (-52)) | ((~i) & 51)) + ((i & 51) << 1)) % 128;
    }

    public final com.payair.hce.isUiContext getIssuerApplicationData() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & 59) + (i | 59);
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mIssuerApplicationData;
        }
        throw null;
    }

    public final void setIssuerApplicationData(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = (i2 - (~(-(-((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2))))) - 1;
        int i4 = i3 % 128;
        writeReplace = i4;
        if (i3 % 2 == 0) {
            this.mIssuerApplicationData = isuicontext;
            int i5 = i4 & 71;
            int i6 = (i4 | 71) & (~i5);
            int i7 = i5 << 1;
            AlternateContactlessPaymentDataJson = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            return;
        }
        this.mIssuerApplicationData = isuicontext;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.isUiContext getCvrMaskAnd() {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = (i + 63) % 128;
        com.payair.hce.isUiContext isuicontext = this.mCvrMaskAnd;
        AlternateContactlessPaymentDataJson = ((-2) - (~((i & 60) + (i | 60)))) % 128;
        return isuicontext;
    }

    public final void setCvrMaskAnd(com.payair.hce.isUiContext isuicontext) {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = (((i | 95) << 1) - (i ^ 95)) % 128;
        this.mCvrMaskAnd = isuicontext;
        int i2 = (i & (-2)) | ((~i) & 1);
        int i3 = -(-((i & 1) << 1));
        int i4 = (i2 & i3) + (i2 | i3);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getApplicationExpiryDate() {
        int i = writeReplace;
        int i2 = i & 111;
        int i3 = -(-((i ^ 111) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            return this.mApplicationExpiryDate;
        }
        throw null;
    }

    public final void setApplicationExpiryDate(com.payair.hce.isUiContext isuicontext) {
        int i = writeReplace;
        int i2 = i & 59;
        int i3 = -(-(i | 59));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            this.mApplicationExpiryDate = isuicontext;
        } else {
            this.mApplicationExpiryDate = isuicontext;
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getTrack2EquivalentData() {
        int i = writeReplace;
        int i2 = (i ^ 69) + ((i & 69) << 1);
        int i3 = i2 % 128;
        AlternateContactlessPaymentDataJson = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.isUiContext isuicontext = this.mTrack2EquivalentData;
        int i4 = (i3 & 89) + (i3 | 89);
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setTrack2EquivalentData(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson + 91;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            this.mTrack2EquivalentData = isuicontext;
        } else {
            this.mTrack2EquivalentData = isuicontext;
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getPanSequenceNumber() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 19;
        int i3 = -(-((i ^ 19) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        com.payair.hce.isUiContext isuicontext = this.mPanSequenceNumber;
        if (i4 % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setPanSequenceNumber(com.payair.hce.isUiContext isuicontext) {
        int i = writeReplace;
        int i2 = i & 113;
        int i3 = (~i2) & (i | 113);
        int i4 = i2 << 1;
        AlternateContactlessPaymentDataJson = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        this.mPanSequenceNumber = isuicontext;
        int i5 = i & 87;
        AlternateContactlessPaymentDataJson = ((i5 - (~(-(-((i ^ 87) | i5))))) - 1) % 128;
    }

    public final com.payair.hce.isUiContext getCiacDecline() {
        int i = writeReplace;
        int i2 = i & 21;
        int i3 = (i ^ 21) | i2;
        AlternateContactlessPaymentDataJson = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        com.payair.hce.isUiContext isuicontext = this.mCiacDecline;
        AlternateContactlessPaymentDataJson = ((-2) - (~(i + 80))) % 128;
        return isuicontext;
    }

    public final void setCiacDecline(com.payair.hce.isUiContext isuicontext) {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = ((i & 7) + (i | 7)) % 128;
        this.mCiacDecline = isuicontext;
        int i2 = i & 47;
        int i3 = (i ^ 47) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.isUiContext getAip() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 117) << 1) - (i ^ 117);
        int i3 = i2 % 128;
        writeReplace = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.payair.hce.isUiContext isuicontext = this.mAip;
        int i4 = i3 & 109;
        int i5 = ((i3 ^ 109) | i4) << 1;
        int i6 = -((i3 | 109) & (~i4));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        AlternateContactlessPaymentDataJson = i7 % 128;
        if (i7 % 2 != 0) {
            return isuicontext;
        }
        throw null;
    }

    public final void setAip(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 45;
        int i3 = ((i ^ 45) | i2) << 1;
        int i4 = -((i | 45) & (~i2));
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        writeReplace = i5;
        this.mAip = isuicontext;
        int i6 = i5 ^ 13;
        int i7 = ((i5 & 13) | i6) << 1;
        int i8 = -i6;
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        AlternateContactlessPaymentDataJson = i9 % 128;
        if (i9 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
