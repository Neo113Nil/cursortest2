package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class BlinkCardUtils {
    public static com.microblink.blinkid.entities.recognizers.blinkcard.Issuer determineIssuerFromCardNumberPrefix(java.lang.String str) {
        return com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.values()[determineIssuerFromCardNumberPrefixNative(str)];
    }

    private static native int determineIssuerFromCardNumberPrefixNative(java.lang.String str);

    public static boolean isValidCardNumber(java.lang.String str) {
        return isValidCardNumberNative(str);
    }

    private static native boolean isValidCardNumberNative(java.lang.String str);

    public static boolean isValidIban(java.lang.String str) {
        return isValidIbanNative(str);
    }

    private static native boolean isValidIbanNative(java.lang.String str);
}
