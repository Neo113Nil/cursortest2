package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuthenticationEnum {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;
    public static final com.payair.hce.AuthenticationEnum BANKID = new com.payair.hce.AuthenticationEnum("BANKID", 0);
    public static final com.payair.hce.AuthenticationEnum REDIRECT = new com.payair.hce.AuthenticationEnum("REDIRECT", 1);
    public static final com.payair.hce.AuthenticationEnum JWT = new com.payair.hce.AuthenticationEnum("JWT", 2);
    private static final /* synthetic */ com.payair.hce.AuthenticationEnum[] $VALUES = $values();

    private static /* synthetic */ com.payair.hce.AuthenticationEnum[] $values() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i | 81;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 81)));
        DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        com.payair.hce.AuthenticationEnum[] authenticationEnumArr = {BANKID, REDIRECT, JWT};
        int i5 = i & 27;
        int i6 = ((i | 27) & (~i5)) + (i5 << 1);
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 == 0) {
            return authenticationEnumArr;
        }
        throw null;
    }

    private AuthenticationEnum(java.lang.String str, int i) {
    }

    public static com.payair.hce.AuthenticationEnum valueOf(java.lang.String str) {
        int i = DigitizedCardProfile;
        int i2 = (i & 16) + (i | 16);
        AlternateContactlessPaymentDataJson = ((~i2) + (i2 << 1)) % 128;
        com.payair.hce.AuthenticationEnum authenticationEnum = (com.payair.hce.AuthenticationEnum) java.lang.Enum.valueOf(com.payair.hce.AuthenticationEnum.class, str);
        int i3 = DigitizedCardProfile;
        int i4 = ((i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1)) - 1;
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            return authenticationEnum;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.AuthenticationEnum[] values() {
        int i = DigitizedCardProfile;
        int i2 = i ^ 57;
        int i3 = -(-((i & 57) << 1));
        AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        com.payair.hce.AuthenticationEnum[] authenticationEnumArr = (com.payair.hce.AuthenticationEnum[]) $VALUES.clone();
        int i4 = AlternateContactlessPaymentDataJson;
        int i5 = i4 & 115;
        int i6 = (i4 ^ 115) | i5;
        DigitizedCardProfile = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return authenticationEnumArr;
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (-2) - (~(((i | 92) << 1) - (i ^ 92)));
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
