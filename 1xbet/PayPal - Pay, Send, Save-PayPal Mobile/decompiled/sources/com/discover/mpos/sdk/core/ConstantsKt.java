package com.discover.mpos.sdk.core;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u00008\u0001X\u0080D¢\u0006\f\n\u0004\b\u0004\u0010\u0002\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\f\u001a\u00020\u00078\u0001X\u0081D¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"", "BALANCE_OUTCOME_QUALIFIER", "Ljava/lang/String;", "EMPTY_STRING", "HEX_CHARS", "getHEX_CHARS", "()Ljava/lang/String;", "", "HEX_DIGIT_SIZE", com.visa.cbp.getEncExpo.warmup, "getHEX_DIGIT_SIZE", "()I", "HEX_RADIX", "getHEX_RADIX", "", "TIMEOUT_IN_SECONDS", "J"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ConstantsKt {
    public static final java.lang.String BALANCE_OUTCOME_QUALIFIER = "Balance";
    public static final java.lang.String EMPTY_STRING = "";
    private static final java.lang.String HEX_CHARS = "0123456789ABCDEF";
    private static final int HEX_DIGIT_SIZE = 4;
    private static final int HEX_RADIX = 16;
    public static final long TIMEOUT_IN_SECONDS = 30000;

    public static final int getHEX_RADIX() {
        return HEX_RADIX;
    }

    public static final int getHEX_DIGIT_SIZE() {
        return HEX_DIGIT_SIZE;
    }

    public static final java.lang.String getHEX_CHARS() {
        return HEX_CHARS;
    }
}
