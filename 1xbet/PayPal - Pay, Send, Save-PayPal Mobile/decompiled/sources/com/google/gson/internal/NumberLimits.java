package com.google.gson.internal;

/* loaded from: classes4.dex */
public class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
    }

    private static void checkNumberStringLength(java.lang.String str) {
        if (str.length() <= 10000) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Number string too large: ");
        sb.append(str.substring(0, 30));
        sb.append("...");
        throw new java.lang.NumberFormatException(sb.toString());
    }

    public static java.math.BigDecimal parseBigDecimal(java.lang.String str) throws java.lang.NumberFormatException {
        checkNumberStringLength(str);
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
        if (java.lang.Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new java.lang.NumberFormatException("Number has unsupported scale: ".concat(java.lang.String.valueOf(str)));
    }

    public static java.math.BigInteger parseBigInteger(java.lang.String str) throws java.lang.NumberFormatException {
        checkNumberStringLength(str);
        return new java.math.BigInteger(str);
    }
}
