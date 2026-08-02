package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TokenType {
    private static int valueOf = 1;
    private static int values;
    private final java.lang.String tokenType;
    public static final com.payair.hce.TokenType PAYAIR = new com.payair.hce.TokenType("PAYAIR", 0, "PAYAIR");
    public static final com.payair.hce.TokenType MDES = new com.payair.hce.TokenType("MDES", 1, "MDES");
    private static final /* synthetic */ com.payair.hce.TokenType[] $VALUES = $values();

    private static /* synthetic */ com.payair.hce.TokenType[] $values() {
        int i = values;
        int i2 = i ^ 85;
        int i3 = ((i & 85) | i2) << 1;
        int i4 = -i2;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        valueOf = i5;
        com.payair.hce.TokenType[] tokenTypeArr = {PAYAIR, MDES};
        values = (((i5 | 15) << 1) - (i5 ^ 15)) % 128;
        return tokenTypeArr;
    }

    public static com.payair.hce.TokenType valueOf(java.lang.String str) {
        int i = valueOf;
        values = ((i ^ 29) + ((i & 29) << 1)) % 128;
        com.payair.hce.TokenType tokenType = (com.payair.hce.TokenType) java.lang.Enum.valueOf(com.payair.hce.TokenType.class, str);
        int i2 = valueOf;
        values = (((i2 ^ 32) + ((i2 & 32) << 1)) - 1) % 128;
        return tokenType;
    }

    public static com.payair.hce.TokenType[] values() {
        int i = valueOf;
        int i2 = (i ^ 69) + ((i & 69) << 1);
        values = i2 % 128;
        int i3 = i2 % 2;
        com.payair.hce.TokenType[] tokenTypeArr = (com.payair.hce.TokenType[]) $VALUES.clone();
        if (i3 == 0) {
            return tokenTypeArr;
        }
        throw null;
    }

    static {
        int i = valueOf;
        int i2 = i & 47;
        int i3 = ((i ^ 47) | i2) << 1;
        int i4 = -((i | 47) & (~i2));
        values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
    }

    private TokenType(java.lang.String str, int i, java.lang.String str2) {
        this.tokenType = str2;
    }

    public final java.lang.String getTokenType() {
        int i = values;
        int i2 = (i | 37) << 1;
        int i3 = -((i & (-38)) | ((~i) & 37));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        valueOf = i4;
        java.lang.String str = this.tokenType;
        int i5 = (i4 | 67) << 1;
        int i6 = -((i4 & (-68)) | ((~i4) & 67));
        int i7 = (i5 & i6) + (i5 | i6);
        values = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = valueOf;
        int i2 = i & 103;
        int i3 = (i ^ 103) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return this.tokenType;
        }
        throw null;
    }
}
