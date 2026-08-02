package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class getPinAutomaticallyResetByApplication {
    private static final com.payair.hce.getPinAutomaticallyResetByApplication DigitizedCardProfile;

    public abstract void writeReplace(java.lang.reflect.AccessibleObject accessibleObject);

    static {
        DigitizedCardProfile = com.payair.hce.getIccPrivateKeyCrtComponents.writeReplace() < 9 ? new com.payair.hce.getPinAlwaysRequiredIfCurrencyNotProvided() : new com.payair.hce.getAckAlwaysRequiredIfCurrencyNotProvided();
    }

    public static com.payair.hce.getPinAutomaticallyResetByApplication AlternateContactlessPaymentDataJson() {
        return DigitizedCardProfile;
    }
}
