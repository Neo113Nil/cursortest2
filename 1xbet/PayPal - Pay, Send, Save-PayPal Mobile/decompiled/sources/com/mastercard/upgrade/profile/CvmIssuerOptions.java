package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class CvmIssuerOptions {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackAlwaysRequiredIfCurrencyNotProvided")
    private boolean ackAlwaysRequiredIfCurrencyNotProvided;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackAlwaysRequiredIfCurrencyProvided")
    private boolean ackAlwaysRequiredIfCurrencyProvided;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackAutomaticallyResetByApplication")
    private boolean ackAutomaticallyResetByApplication;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackPreEntryAllowed")
    private boolean ackPreEntryAllowed;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinAlwaysRequiredIfCurrencyNotProvided")
    private boolean pinAlwaysRequiredIfCurrencyNotProvided;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinAlwaysRequiredIfCurrencyProvided")
    private boolean pinAlwaysRequiredIfCurrencyProvided;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinAutomaticallyResetByApplication")
    private boolean pinAutomaticallyResetByApplication;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinPreEntryAllowed")
    private boolean pinPreEntryAllowed;

    public final boolean getPinPreEntryAllowed() {
        int i = values;
        int i2 = i & 115;
        int i3 = ((i ^ 115) | i2) << 1;
        int i4 = -((~i2) & (i | 115));
        int i5 = (i3 & i4) + (i4 | i3);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        boolean z = this.pinPreEntryAllowed;
        int i6 = (i & (-104)) | ((~i) & 103);
        int i7 = (i & 103) << 1;
        DigitizedCardProfile = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return z;
    }

    public final void setPinPreEntryAllowed(boolean z) {
        int i = DigitizedCardProfile;
        int i2 = (-2) - (~(((i | 90) << 1) - (i ^ 90)));
        values = i2 % 128;
        if (i2 % 2 != 0) {
            this.pinPreEntryAllowed = z;
        } else {
            this.pinPreEntryAllowed = z;
            throw null;
        }
    }

    public final boolean getAckPreEntryAllowed() {
        int i = DigitizedCardProfile;
        values = ((i ^ 5) + ((i & 5) << 1)) % 128;
        boolean z = this.ackPreEntryAllowed;
        int i2 = ((i ^ 90) + ((i & 90) << 1)) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void setAckPreEntryAllowed(boolean z) {
        int i = values;
        int i2 = i & 117;
        int i3 = (((i ^ 117) | i2) << 1) - ((~i2) & (i | 117));
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            this.ackPreEntryAllowed = z;
            int i4 = i + 125;
            DigitizedCardProfile = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.ackPreEntryAllowed = z;
        throw null;
    }

    public final boolean getAckAutomaticallyResetByApplication() {
        int i = values;
        int i2 = i & 89;
        int i3 = (~i2) & (i | 89);
        int i4 = -(-(i2 << 1));
        DigitizedCardProfile = ((i3 & i4) + (i4 | i3)) % 128;
        boolean z = this.ackAutomaticallyResetByApplication;
        int i5 = (i ^ 103) + ((i & 103) << 1);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void setAckAutomaticallyResetByApplication(boolean z) {
        int i = DigitizedCardProfile;
        int i2 = i & 125;
        values = ((i2 - (~((i ^ 125) | i2))) - 1) % 128;
        this.ackAutomaticallyResetByApplication = z;
        int i3 = ((i & 14) + (i | 14)) - 1;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final boolean getPinAutomaticallyResetByApplication() {
        int i = values;
        int i2 = ((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        DigitizedCardProfile = i2 % 128;
        boolean z = this.pinAutomaticallyResetByApplication;
        if (i2 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setPinAutomaticallyResetByApplication(boolean z) {
        int i = values;
        DigitizedCardProfile = (i + 9) % 128;
        this.pinAutomaticallyResetByApplication = z;
        int i2 = i & 69;
        int i3 = (i ^ 69) | i2;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    public final com.payair.hce.isUiContext getMpaObject() {
        byte b;
        int i = values;
        int i2 = i ^ 81;
        int i3 = (i & 81) << 1;
        DigitizedCardProfile = ((i2 & i3) + (i3 | i2)) % 128;
        if (getAckAlwaysRequiredIfCurrencyProvided()) {
            int i4 = DigitizedCardProfile;
            int i5 = (i4 | 97) << 1;
            int i6 = -(i4 ^ 97);
            values = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            b = setBit((byte) 0, 7);
            int i7 = values;
            DigitizedCardProfile = ((i7 ^ 71) + ((i7 & 71) << 1)) % 128;
        } else {
            b = 0;
        }
        if (getAckAlwaysRequiredIfCurrencyNotProvided()) {
            int i8 = DigitizedCardProfile;
            int i9 = i8 ^ 41;
            int i10 = -(-((i8 & 41) << 1));
            values = ((i9 & i10) + (i10 | i9)) % 128;
            b = setBit(b, 6);
            int i11 = DigitizedCardProfile;
            values = (((i11 | 9) << 1) - (i11 ^ 9)) % 128;
        }
        if (getPinAlwaysRequiredIfCurrencyProvided()) {
            int i12 = values;
            DigitizedCardProfile = (((i12 | 107) << 1) - (i12 ^ 107)) % 128;
            b = setBit(b, 4);
            DigitizedCardProfile = (values + 99) % 128;
        }
        if (getPinAlwaysRequiredIfCurrencyNotProvided()) {
            values = (DigitizedCardProfile + 93) % 128;
            b = setBit(b, 3);
            int i13 = DigitizedCardProfile;
            int i14 = i13 & 29;
            int i15 = (i13 | 29) & (~i14);
            int i16 = -(-(i14 << 1));
            values = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
        }
        com.payair.hce.isUiContext isuicontext = (com.payair.hce.isUiContext) com.payair.hce.isUiContext.DigitizedCardProfile(new java.lang.Object[]{new byte[]{b}}, -1034745021, 1034745025, (int) java.lang.System.currentTimeMillis());
        int i17 = DigitizedCardProfile;
        int i18 = (((i17 | 10) << 1) - (i17 ^ 10)) - 1;
        values = i18 % 128;
        if (i18 % 2 != 0) {
            return isuicontext;
        }
        throw null;
    }

    public final boolean getAckAlwaysRequiredIfCurrencyProvided() {
        int i = values;
        DigitizedCardProfile = ((i & 45) + (i | 45)) % 128;
        boolean z = this.ackAlwaysRequiredIfCurrencyProvided;
        int i2 = ((i ^ 59) | (i & 59)) << 1;
        int i3 = -((i & (-60)) | ((~i) & 59));
        int i4 = (i2 & i3) + (i3 | i2);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    public static byte setBit(byte b, int i) {
        int i2 = DigitizedCardProfile;
        int i3 = i2 | 9;
        int i4 = ((i3 << 1) - (~(-(i3 & (~(i2 & 9)))))) - 1;
        values = i4 % 128;
        int i5 = b;
        if (i4 % 2 != 0) {
            int i6 = 1 << i;
            int i7 = ((~i6) & b) | ((~b) & i6);
            int i8 = b & i6;
            i5 = (i8 ^ i7) | (i8 & i7);
        }
        byte b2 = (byte) i5;
        values = (i2 + 119) % 128;
        return b2;
    }

    public final boolean getAckAlwaysRequiredIfCurrencyNotProvided() {
        values = (DigitizedCardProfile + 39) % 128;
        return this.ackAlwaysRequiredIfCurrencyNotProvided;
    }

    public final void setAckAlwaysRequiredIfCurrencyNotProvided(boolean z) {
        int i = DigitizedCardProfile;
        int i2 = i & 21;
        int i3 = -(-((i ^ 21) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        values = i4;
        this.ackAlwaysRequiredIfCurrencyNotProvided = z;
        int i5 = i4 & 53;
        int i6 = (i5 - (~((i4 ^ 53) | i5))) - 1;
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final boolean getPinAlwaysRequiredIfCurrencyProvided() {
        int i = DigitizedCardProfile;
        int i2 = i & 57;
        int i3 = (i ^ 57) | i2;
        values = ((i2 & i3) + (i2 | i3)) % 128;
        boolean z = this.pinAlwaysRequiredIfCurrencyProvided;
        int i4 = i & 69;
        int i5 = -(-((i ^ 69) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean getPinAlwaysRequiredIfCurrencyNotProvided() {
        int i = (values + 87) % 128;
        DigitizedCardProfile = i;
        boolean z = this.pinAlwaysRequiredIfCurrencyNotProvided;
        int i2 = i & 19;
        int i3 = -(-(i | 19));
        values = ((i2 & i3) + (i3 | i2)) % 128;
        return z;
    }

    public final void setPinAlwaysRequiredIfCurrencyNotProvided(boolean z) {
        int i = values;
        int i2 = i & 15;
        int i3 = (~i2) & (i | 15);
        int i4 = i2 << 1;
        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        this.pinAlwaysRequiredIfCurrencyNotProvided = z;
        int i5 = i & 81;
        DigitizedCardProfile = ((i5 - (~((i ^ 81) | i5))) - 1) % 128;
    }

    public final void setPinAlwaysRequiredIfCurrencyProvided(boolean z) {
        int i = DigitizedCardProfile + 1;
        values = i % 128;
        if (i % 2 != 0) {
            this.pinAlwaysRequiredIfCurrencyProvided = z;
        } else {
            this.pinAlwaysRequiredIfCurrencyProvided = z;
            throw null;
        }
    }

    public final void setAckAlwaysRequiredIfCurrencyProvided(boolean z) {
        int i = values;
        int i2 = i & 15;
        int i3 = ((i ^ 15) | i2) << 1;
        int i4 = -((i | 15) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            this.ackAlwaysRequiredIfCurrencyProvided = z;
        } else {
            this.ackAlwaysRequiredIfCurrencyProvided = z;
            throw null;
        }
    }
}
