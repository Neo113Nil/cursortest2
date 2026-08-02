package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum TokenType {
    HCE(0),
    ODA(1);

    private static final android.util.SparseArray<com.visa.cbp.sdk.facade.data.TokenType> mapping = new android.util.SparseArray<>();
    private int type;

    static {
        for (com.visa.cbp.sdk.facade.data.TokenType tokenType : values()) {
            mapping.put(tokenType.getValue(), tokenType);
        }
    }

    TokenType(int i) {
        this.type = i;
    }

    public static com.visa.cbp.sdk.facade.data.TokenType getTokenType(int i) {
        return mapping.get(i);
    }

    public final int getValue() {
        return this.type;
    }
}
