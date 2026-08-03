package com.google.thirdparty.publicsuffix;

/* loaded from: classes4.dex */
final class TrieParser {
    private static final com.google.common.base.Joiner DIRECT_JOINER = com.google.common.base.Joiner.on("");

    TrieParser() {
    }

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseTrie(java.lang.CharSequence... encodedChunks) {
        return parseFullString(DIRECT_JOINER.join(encodedChunks));
    }

    static com.google.common.collect.ImmutableMap<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> parseFullString(java.lang.String encoded) {
        com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
        int length = encoded.length();
        int i = 0;
        while (i < length) {
            i += doParseTrieToBuilder(com.google.common.collect.Queues.newArrayDeque(), encoded, i, builder);
        }
        return builder.buildOrThrow();
    }

    private static int doParseTrieToBuilder(java.util.Deque<java.lang.CharSequence> stack, java.lang.CharSequence encoded, int start, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> builder) {
        int length = encoded.length();
        char c = 0;
        int i = start;
        while (i < length && (c = encoded.charAt(i)) != '&' && c != '?' && c != '!' && c != ':' && c != ',') {
            i++;
        }
        stack.push(reverse(encoded.subSequence(start, i)));
        if (c == '!' || c == '?' || c == ':' || c == ',') {
            java.lang.String join = DIRECT_JOINER.join(stack);
            if (join.length() > 0) {
                builder.put(join, com.google.thirdparty.publicsuffix.PublicSuffixType.fromCode(c));
            }
        }
        int i2 = i + 1;
        if (c != '?' && c != ',') {
            while (i2 < length) {
                i2 += doParseTrieToBuilder(stack, encoded, i2, builder);
                if (encoded.charAt(i2) == '?' || encoded.charAt(i2) == ',') {
                    i2++;
                    break;
                }
            }
        }
        stack.pop();
        return i2 - start;
    }

    private static java.lang.CharSequence reverse(java.lang.CharSequence s) {
        return new java.lang.StringBuilder(s).reverse();
    }
}
