package com.google.thirdparty.publicsuffix;

/* loaded from: classes9.dex */
final class TrieParser {
    private static final com.google.common.base.Joiner DIRECT_JOINER = com.google.common.base.Joiner.on("");

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseTrie(java.lang.CharSequence... charSequenceArr) {
        return parseFullString(DIRECT_JOINER.join(charSequenceArr));
    }

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseFullString(java.lang.String str) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            i += doParseTrieToBuilder(new java.util.ArrayDeque(), str, i, builder);
        }
        return builder.buildOrThrow();
    }

    private static int doParseTrieToBuilder(java.util.Deque<java.lang.CharSequence> deque, java.lang.CharSequence charSequence, int i, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> builder) {
        int length = charSequence.length();
        char c = 0;
        int i2 = i;
        while (i2 < length && (c = charSequence.charAt(i2)) != '&' && c != '?' && c != '!' && c != ':' && c != ',') {
            i2++;
        }
        deque.push(reverse(charSequence.subSequence(i, i2)));
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            java.lang.String join = DIRECT_JOINER.join(deque);
            if (join.length() > 0) {
                builder.put(join, com.google.thirdparty.publicsuffix.PublicSuffixType.fromCode(c));
            }
        }
        int i3 = i2 + 1;
        if (c != '?' && c != ',') {
            while (i3 < length) {
                i3 += doParseTrieToBuilder(deque, charSequence, i3, builder);
                if (charSequence.charAt(i3) == '?' || charSequence.charAt(i3) == ',') {
                    i3++;
                    break;
                }
            }
        }
        deque.pop();
        return i3 - i;
    }

    private static java.lang.CharSequence reverse(java.lang.CharSequence charSequence) {
        return new java.lang.StringBuilder(charSequence).reverse();
    }

    private TrieParser() {
    }
}
