package com.payair.hce;

/* loaded from: classes4.dex */
final class cancelPendingRequests {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static long DigitizedCardProfile = 3852173159515727951L;
    private static int writeReplace;
    private com.payair.hce.setPinIvCvc3Track2 values = com.payair.hce.setMaximumPinTry.valueOf();
    private int valueOf = 0;

    cancelPendingRequests() {
    }

    final void writeReplace() {
        int i = (writeReplace + 121) % 128;
        AlternateContactlessPaymentDataJson = i;
        this.valueOf = 0;
        int i2 = i + 37;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    final void DigitizedCardProfile() {
        writeReplace = (AlternateContactlessPaymentDataJson + 5) % 128;
        this.valueOf++;
        android.view.ViewConfiguration.getPressedStateDuration();
        new java.lang.Object[]{java.lang.Integer.valueOf(this.valueOf)};
        int i = AlternateContactlessPaymentDataJson + 109;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    final int AlternateContactlessPaymentDataJson() {
        int i = AlternateContactlessPaymentDataJson + 71;
        int i2 = i % 128;
        writeReplace = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = this.valueOf;
        int i4 = i2 + 97;
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }
}
