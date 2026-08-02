package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class CardholderValidators {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardholderValidators")
    private java.lang.String cardholderValidators;

    public final java.lang.String getCardholderValidators() {
        int i = DigitizedCardProfile;
        writeReplace = ((((i | 84) << 1) - (i ^ 84)) - 1) % 128;
        java.lang.String str = this.cardholderValidators;
        int i2 = (((i | 2) << 1) - (i ^ 2)) - 1;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setCardholderValidators(java.lang.String str) {
        int i = DigitizedCardProfile;
        int i2 = i & 77;
        int i3 = -(-(i | 77));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        writeReplace = i5;
        if (i4 % 2 == 0) {
            this.cardholderValidators = str;
            int i6 = i5 + 53;
            DigitizedCardProfile = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.cardholderValidators = str;
        throw new java.lang.ArithmeticException();
    }
}
