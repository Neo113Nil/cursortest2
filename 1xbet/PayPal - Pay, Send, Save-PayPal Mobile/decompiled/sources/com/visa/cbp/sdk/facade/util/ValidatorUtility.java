package com.visa.cbp.sdk.facade.util;

/* loaded from: classes16.dex */
public class ValidatorUtility {
    public static final java.lang.String deviceIdRegExAlphaNumeric = "[a-zA-Z0-9_-]{24}";
    public static final java.lang.String regExAlphaJWE = "[a-zA-Z0-9\\-_]+\\.[a-zA-Z0-9\\-_]+\\.[a-zA-Z0-9\\-_]+\\.[a-zA-Z0-9\\-_]+\\.[a-zA-Z0-9\\-_]+";
    public static final java.lang.String vServerNonceRegExAlphaNumeric = "[a-zA-Z0-9\\-]{36}";
    public static final java.lang.String walletAccountIdRegExAlphaNumeric = "[a-zA-Z0-9_-]{1,24}";

    public static void validateDeviceID(java.lang.String str) {
        if (str == null || str.equals("")) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.setAid);
        }
        if (!validateText(deviceIdRegExAlphaNumeric, str)) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.setIssuerApplicationDiscretionaryData);
        }
    }

    public static void validateWalletAccountID(java.lang.String str) {
        if (str == null || str.equals("")) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.setPriority);
        }
        if (!validateText(walletAccountIdRegExAlphaNumeric, str)) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getCVMrequired);
        }
    }

    public static void validateIssuerCerts(com.visa.cbp.external.common.IssuerCerts issuerCerts) {
        if (issuerCerts == null) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the field IssuerCerts can't be NULL.");
        }
        com.visa.cbp.external.common.NullAndEmptyValueValidator.processAnnotations(issuerCerts);
        try {
            validateDeviceID(new java.lang.String(issuerCerts.getDeviceID(), java.nio.charset.StandardCharsets.UTF_8));
        } catch (java.lang.Exception unused) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the field deviceID cannot have invalid format.");
        }
    }

    public static void validateEnrollDeviceResponse(com.visa.cbp.external.enp.EnrollDeviceResponse enrollDeviceResponse) {
        if (enrollDeviceResponse != null) {
            try {
                com.visa.cbp.external.common.NullValueValidator.processAnnotations(enrollDeviceResponse);
                if (!validateText(vServerNonceRegExAlphaNumeric, enrollDeviceResponse.getVServerNonce())) {
                    throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the field vServerNonce cannot have invalid format.");
                }
                return;
            } catch (java.lang.NullPointerException e) {
                throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, e.getMessage());
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the object EnrollDeviceDasResponse can't be NULL.");
    }

    public static boolean validateText(java.lang.String str, java.lang.String str2) {
        return java.util.regex.Pattern.compile(str, 34).matcher(str2).matches();
    }

    public static void validateDSK(byte[] bArr) {
        if (bArr == null) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the field DSK can't be NULL.");
        }
        if (bArr.length == 0) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the field DSK cannot have invalid format.");
        }
        if (!validateText(regExAlphaJWE, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8))) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.getEncryptionMetaData, "The value of the field DSK cannot have invalid format.");
        }
    }
}
