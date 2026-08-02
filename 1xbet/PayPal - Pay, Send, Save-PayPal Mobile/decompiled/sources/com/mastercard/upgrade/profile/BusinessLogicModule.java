package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class BusinessLogicModule {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "applicationLifeCycleData")
    private com.payair.hce.isUiContext mApplicationLifeCycleData;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardLayoutDescription")
    @java.lang.Deprecated
    private com.payair.hce.isUiContext mCardLayoutDescription;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardholderValidators")
    private com.mastercard.upgrade.profile.CardholderValidators mCardholderValidators;

    @com.payair.hce.setSelectionFromTop(valueOf = "mChipCvmIssuerOptions")
    private com.mastercard.upgrade.profile.CvmIssuerOptions mChipCvmIssuerOptions;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvmResetTimeout")
    private int mCvmResetTimeout;

    @com.payair.hce.setSelectionFromTop(valueOf = "dualTapResetTimeout")
    private int mDualTapResetTimeout;

    @com.payair.hce.setSelectionFromTop(valueOf = "magstripeCvmIssuerOptions")
    private com.mastercard.upgrade.profile.CvmIssuerOptions mMagstripeCvmIssuerOptions;

    @com.payair.hce.setSelectionFromTop(valueOf = "securityWord")
    private com.payair.hce.isUiContext mSecurityWord;

    public final com.payair.hce.isUiContext getSecurityWord() {
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 42) + ((i & 42) << 1)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.isUiContext isuicontext = this.mSecurityWord;
        AlternateContactlessPaymentDataJson = (((i | 23) << 1) - (i ^ 23)) % 128;
        return isuicontext;
    }

    public final void setSecurityWord(com.payair.hce.isUiContext isuicontext) {
        int i = DigitizedCardProfile;
        int i2 = i ^ 121;
        int i3 = (((i & 121) | i2) << 1) - i2;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            this.mSecurityWord = isuicontext;
            int i4 = i & 39;
            int i5 = (i4 - (~((i ^ 39) | i4))) - 1;
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.mSecurityWord = isuicontext;
        throw new java.lang.ArithmeticException();
    }

    public final int getDualTapResetTimeout() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 90) << 1) - (i ^ 90);
        int i3 = (~i2) + (i2 << 1);
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.mDualTapResetTimeout;
        int i5 = i & 109;
        int i6 = (i ^ 109) | i5;
        DigitizedCardProfile = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return i4;
    }

    public final void setDualTapResetTimeout(int i) {
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 69;
        int i4 = (i2 ^ 69) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            this.mDualTapResetTimeout = i;
        } else {
            this.mDualTapResetTimeout = i;
            throw null;
        }
    }

    public final com.mastercard.upgrade.profile.CvmIssuerOptions getMagstripeCvmIssuerOptions() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i | 5) << 1;
        int i3 = -((i & (-6)) | ((~i) & 5));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        DigitizedCardProfile = i4 % 128;
        com.mastercard.upgrade.profile.CvmIssuerOptions cvmIssuerOptions = this.mMagstripeCvmIssuerOptions;
        if (i4 % 2 == 0) {
            return cvmIssuerOptions;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setMagstripeCvmIssuerOptions(com.mastercard.upgrade.profile.CvmIssuerOptions cvmIssuerOptions) {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (i + 91) % 128;
        this.mMagstripeCvmIssuerOptions = cvmIssuerOptions;
        int i2 = ((i ^ 16) + ((i & 16) << 1)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.mastercard.upgrade.profile.CvmIssuerOptions getMChipCvmIssuerOptions() {
        int i = DigitizedCardProfile + 95;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return this.mChipCvmIssuerOptions;
        }
        throw null;
    }

    public final void setMChipCvmIssuerOptions(com.mastercard.upgrade.profile.CvmIssuerOptions cvmIssuerOptions) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 71;
        int i3 = -(-((i ^ 71) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            this.mChipCvmIssuerOptions = cvmIssuerOptions;
            int i5 = i | 53;
            DigitizedCardProfile = ((i5 << 1) - (i5 & (~(i & 53)))) % 128;
            return;
        }
        this.mChipCvmIssuerOptions = cvmIssuerOptions;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.isUiContext getApplicationLifeCycleData() {
        int i = AlternateContactlessPaymentDataJson + 119;
        DigitizedCardProfile = i % 128;
        com.payair.hce.isUiContext isuicontext = this.mApplicationLifeCycleData;
        if (i % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setApplicationLifeCycleData(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (((i ^ 79) - (~((i & 79) << 1))) - 1) % 128;
        this.mApplicationLifeCycleData = isuicontext;
        int i2 = (i & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i) & 109);
        int i3 = (i & 109) << 1;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
    }

    public final com.mastercard.upgrade.profile.CardholderValidators getCardholderValidators() {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((-2) - (~(i + 104))) % 128;
        com.mastercard.upgrade.profile.CardholderValidators cardholderValidators = this.mCardholderValidators;
        int i2 = i | 79;
        int i3 = i2 << 1;
        int i4 = -((~(i & 79)) & i2);
        DigitizedCardProfile = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return cardholderValidators;
    }

    public final void setCardholderValidators(com.mastercard.upgrade.profile.CardholderValidators cardholderValidators) {
        int i = DigitizedCardProfile;
        int i2 = i ^ 37;
        int i3 = ((((i & 37) | i2) << 1) - (~(-i2))) - 1;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            this.mCardholderValidators = cardholderValidators;
        } else {
            this.mCardholderValidators = cardholderValidators;
            throw null;
        }
    }

    public final int getCvmResetTimeout() {
        int i = DigitizedCardProfile;
        int i2 = i & 85;
        int i3 = (i2 + ((i ^ 85) | i2)) % 128;
        AlternateContactlessPaymentDataJson = i3;
        int i4 = this.mCvmResetTimeout;
        int i5 = (i3 | 113) << 1;
        int i6 = -((i3 & (-114)) | ((~i3) & 113));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        DigitizedCardProfile = i7 % 128;
        if (i7 % 2 == 0) {
            return i4;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setCvmResetTimeout(int i) {
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            this.mCvmResetTimeout = i;
        } else {
            this.mCvmResetTimeout = i;
            throw new java.lang.ArithmeticException();
        }
    }

    @java.lang.Deprecated
    public final com.payair.hce.isUiContext getCardLayoutDescription() {
        int i = DigitizedCardProfile;
        int i2 = i ^ 67;
        int i3 = ((i & 67) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        com.payair.hce.isUiContext isuicontext = this.mCardLayoutDescription;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i6 = ((i ^ 106) + ((i & 106) << 1)) - 1;
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 != 0) {
            return isuicontext;
        }
        throw null;
    }

    @java.lang.Deprecated
    public final void setCardLayoutDescription(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        if (i2 % 2 == 0) {
            this.mCardLayoutDescription = isuicontext;
            int i4 = i3 & 117;
            int i5 = ((i3 ^ 117) | i4) << 1;
            int i6 = -((~i4) & (i3 | 117));
            int i7 = (i5 & i6) + (i6 | i5);
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.mCardLayoutDescription = isuicontext;
        throw null;
    }
}
