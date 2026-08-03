package com.helpshift.util;

/* loaded from: classes5.dex */
public class SchemaUtil {
    private static final java.util.regex.Pattern platformPattern = java.util.regex.Pattern.compile("^[\\p{L}\\p{N}-]+_platform_\\d{17}-[0-9a-z]{15}$");

    private SchemaUtil() {
    }

    private static boolean validatePlatformId(java.lang.String str) {
        return com.helpshift.util.Utils.isNotEmpty(str) && platformPattern.matcher(str.trim()).matches();
    }

    private static boolean validateDomainName(java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return false;
        }
        java.util.List asList = java.util.Arrays.asList(str.trim().split("\\."));
        return asList.size() >= 3 && !asList.contains("");
    }

    public static boolean validateInstallCredentials(java.lang.String str, java.lang.String str2) throws com.helpshift.HelpshiftInstallException {
        if (!validateDomainName(str)) {
            throw new com.helpshift.HelpshiftInstallException("The domain name used in the Helpshift.install() is not valid!");
        }
        if (validatePlatformId(str2)) {
            return true;
        }
        throw new com.helpshift.HelpshiftInstallException("The platform id used in the Helpshift.install() is not valid!");
    }
}
