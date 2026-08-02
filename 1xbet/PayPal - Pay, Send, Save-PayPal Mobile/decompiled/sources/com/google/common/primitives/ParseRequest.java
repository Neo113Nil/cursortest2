package com.google.common.primitives;

/* loaded from: classes9.dex */
final class ParseRequest {
    final int radix;
    final java.lang.String rawValue;

    private ParseRequest(java.lang.String str, int i) {
        this.rawValue = str;
        this.radix = i;
    }

    static com.google.common.primitives.ParseRequest fromString(java.lang.String str) {
        if (str.length() == 0) {
            throw new java.lang.NumberFormatException("empty string");
        }
        char charAt = str.charAt(0);
        int i = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (charAt == '#') {
            str = str.substring(1);
        } else if (charAt != '0' || str.length() <= 1) {
            i = 10;
        } else {
            str = str.substring(1);
            i = 8;
        }
        return new com.google.common.primitives.ParseRequest(str, i);
    }
}
