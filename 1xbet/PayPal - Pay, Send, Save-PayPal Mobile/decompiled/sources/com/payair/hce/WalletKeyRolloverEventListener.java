package com.payair.hce;

/* loaded from: classes4.dex */
public class WalletKeyRolloverEventListener implements com.payair.hce.getClassLoader {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;
    private java.util.List<com.payair.hce.getClassLoader> writeReplace = new java.util.ArrayList();

    public void addAppListener(com.payair.hce.getClassLoader getclassloader) {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (((i ^ 84) + ((i & 84) << 1)) - 1) % 128;
        this.writeReplace.add(getclassloader);
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = (-2) - (~((i2 ^ 80) + ((i2 & 80) << 1)));
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public void removeAppListener(com.payair.hce.getClassLoader getclassloader) {
        int i = AlternateContactlessPaymentDataJson + 85;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            this.writeReplace.remove(getclassloader);
        } else {
            this.writeReplace.remove(getclassloader);
            throw null;
        }
    }
}
