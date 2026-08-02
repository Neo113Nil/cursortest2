package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/payair/hce/setAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "valueOf", "AlternateContactlessPaymentDataJson", "values", "DigitizedCardProfile", "writeReplace"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class setAnimation {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    public static final com.payair.hce.setAnimation valueOf = new com.payair.hce.setAnimation(com.visa.cbp.sdk.facade.data.Constants.CONFIDENTIALITY, 0);
    public static final com.payair.hce.setAnimation AlternateContactlessPaymentDataJson = new com.payair.hce.setAnimation(com.visa.cbp.sdk.facade.data.Constants.INTEGRITY, 1);
    public static final com.payair.hce.setAnimation values = new com.payair.hce.setAnimation(com.visa.cbp.sdk.facade.data.Constants.DEVICE_ROOT, 2);
    public static final com.payair.hce.setAnimation DigitizedCardProfile = new com.payair.hce.setAnimation("KEY_AGREEMENT", 3);
    public static final com.payair.hce.setAnimation writeReplace = new com.payair.hce.setAnimation("AUTHENTICITY", 4);
    private static final /* synthetic */ com.payair.hce.setAnimation[] getAid = valueOf();

    private setAnimation(java.lang.String str, int i) {
    }

    static {
        int i = IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = ((((i | 102) << 1) - (i ^ 102)) - 1) % 128;
    }

    private static final /* synthetic */ com.payair.hce.setAnimation[] valueOf() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ 49) | (i & 49)) << 1;
        int i3 = -((i & (-50)) | ((~i) & 49));
        IccPrivateKeyCrtComponentsJson = ((i2 & i3) + (i2 | i3)) % 128;
        com.payair.hce.setAnimation[] setanimationArr = {valueOf, AlternateContactlessPaymentDataJson, values, DigitizedCardProfile, writeReplace};
        int i4 = i + 119;
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return setanimationArr;
        }
        throw null;
    }

    public static com.payair.hce.setAnimation valueOf(java.lang.String str) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        com.payair.hce.setAnimation setanimation = (com.payair.hce.setAnimation) java.lang.Enum.valueOf(com.payair.hce.setAnimation.class, str);
        if (i2 % 2 != 0) {
            throw null;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 19) % 128;
        return setanimation;
    }

    public static com.payair.hce.setAnimation[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 117;
        int i3 = (i ^ 117) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        int i5 = i4 % 2;
        com.payair.hce.setAnimation[] setanimationArr = (com.payair.hce.setAnimation[]) getAid.clone();
        if (i5 == 0) {
            return setanimationArr;
        }
        throw null;
    }
}
