package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public final class NumberParsing {
    public static long decodeLongFromHex(java.lang.String str) {
        return (str.charAt(1) == 'x' || str.charAt(1) == 'X') ? java.lang.Long.parseLong(str.substring(2), 16) : java.lang.Long.parseLong(str, 16);
    }

    public static int decodeIntFromHex(java.lang.String str) {
        return (str.charAt(1) == 'x' || str.charAt(1) == 'X') ? java.lang.Integer.parseInt(str.substring(2), 16) : java.lang.Integer.parseInt(str, 16);
    }

    private NumberParsing() {
    }
}
