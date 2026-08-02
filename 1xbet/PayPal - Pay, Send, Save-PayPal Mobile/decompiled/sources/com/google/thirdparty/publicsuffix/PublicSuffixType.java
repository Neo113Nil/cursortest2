package com.google.thirdparty.publicsuffix;

/* loaded from: classes9.dex */
public enum PublicSuffixType {
    PRIVATE(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    final char getLeafNodeCode() {
        return this.leafNodeCode;
    }

    final char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    static com.google.thirdparty.publicsuffix.PublicSuffixType fromCode(char c) {
        for (com.google.thirdparty.publicsuffix.PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == c || publicSuffixType.getLeafNodeCode() == c) {
                return publicSuffixType;
            }
        }
        throw new java.lang.IllegalArgumentException("No enum corresponding to given code: ".concat(java.lang.String.valueOf(c)));
    }
}
