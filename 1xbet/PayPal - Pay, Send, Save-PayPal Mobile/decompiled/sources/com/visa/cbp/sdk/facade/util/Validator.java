package com.visa.cbp.sdk.facade.util;

/* loaded from: classes16.dex */
public class Validator {
    public static final java.lang.String DEVICE_ID_INVALID = "Device id is invalid. Should be an alpha-numeric string with 64 characters.";
    public static int LCM_REASON_CODE_MAX_LENGTH = 20;
    public static int LCM_REASON_DESCRIPTION_MAX_LENGTH = 254;
    private static java.lang.String PATTERN_ALPHANUMERIC = "[a-zA-Z0-9]{%1$s,%2$s}";
    private static java.lang.String PATTERN_INTEGER = "[0-9]{%1$s,%2$s}";
    private static final java.lang.String TAG = "com.visa.cbp.sdk.facade.util.Validator";

    public static boolean validateInteger(java.lang.String str) {
        return validateNumberLength(str, 1, -1);
    }

    public static boolean validateNumberLength(java.lang.String str, int i) {
        return validateNumberLength(str, i, -1);
    }

    public static boolean validateNumberLength(java.lang.String str, int i, int i2) {
        return validatePattern(PATTERN_INTEGER, str, i, i2);
    }

    public static boolean validateAlphanumeric(java.lang.String str) {
        return validateAlphanumeric(str, 1);
    }

    public static boolean validateAlphanumeric(java.lang.String str, int i) {
        return validateAlphanumeric(str, i, -1);
    }

    public static boolean validateAlphanumeric(java.lang.String str, int i, int i2) {
        return validatePattern(PATTERN_ALPHANUMERIC, str, i, i2);
    }

    private static boolean validatePattern(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (str2 != null) {
            try {
                if (str2.length() > 0 && i > 0) {
                    return java.util.regex.Pattern.compile(java.lang.String.format(str, java.lang.Integer.valueOf(i), i2 <= 0 ? "" : java.lang.String.valueOf(i2))).matcher(str2).matches();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static com.visa.cbp.sdk.facade.error.CbpError validateProvisionTokenParams(com.visa.cbp.sdk.facade.request.ProvisionTokenParams provisionTokenParams) {
        if (provisionTokenParams == null) {
            return com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.getEncryptionMetaData.BuildConfig(), "The value of the provisionTokenParams can't be NULL.", com.visa.cbp.sdk.facade.error.ReasonCode.INVALID_INPUT_ERROR);
        }
        return null;
    }

    public static boolean isTokenKeyValid(android.content.Context context, com.visa.cbp.getSc getsc, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return (tokenKey == null || tokenKey.getTokenId() == 0 || getsc.getTvls(tokenKey) == null) ? false : true;
    }

    public static com.visa.cbp.sdk.facade.error.TokenStatusError validateLcmParams(android.content.Context context, com.visa.cbp.getSc getsc, com.visa.cbp.sdk.facade.data.LcmParams lcmParams) {
        com.visa.cbp.sdk.facade.error.TokenStatusError tokenStatusError;
        if (lcmParams == null) {
            tokenStatusError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.tokenError(com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.sdk.facade.error.ReasonCode.INVALID_INPUT_ERROR));
        } else {
            tokenStatusError = !isTokenKeyValid(context, getsc, lcmParams.getTokenKey()) ? com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.tokenError(com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.getCap, com.visa.cbp.sdk.facade.error.ReasonCode.INVALID_INPUT_ERROR)) : null;
        }
        if (tokenStatusError != null) {
            tokenStatusError.setLcmParams(lcmParams);
        }
        return tokenStatusError;
    }
}
