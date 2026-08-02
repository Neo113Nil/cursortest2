package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class EmailDoCoMoResultParser extends com.google.zxing.client.result.AbstractDoCoMoResultParser {
    private static final java.util.regex.Pattern EMAIL = java.util.regex.Pattern.compile("^[^:]+@([0-9a-zA-Z]+[0-9a-zA-Z\\-]+[0-9a-zA-Z]+\\.)+[a-zA-Z]{2,}$");
    private static final java.lang.String EMAIL_DOMAIN = "([0-9a-zA-Z]+[0-9a-zA-Z\\-]+[0-9a-zA-Z]+\\.)+[a-zA-Z]{2,}";
    private static final java.lang.String EMAIL_LOCAL = "[^:]+";

    @Override // com.google.zxing.client.result.ResultParser
    public final com.google.zxing.client.result.EmailAddressParsedResult parse(com.google.zxing.Result result) {
        java.lang.String[] matchDoCoMoPrefixedField;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("MATMSG:") || (matchDoCoMoPrefixedField = matchDoCoMoPrefixedField("TO:", massagedText)) == null) {
            return null;
        }
        for (java.lang.String str : matchDoCoMoPrefixedField) {
            if (!isBasicallyValidEmailAddress(str)) {
                return null;
            }
        }
        return new com.google.zxing.client.result.EmailAddressParsedResult(matchDoCoMoPrefixedField, null, null, matchSingleDoCoMoPrefixedField("SUB:", massagedText, false), matchSingleDoCoMoPrefixedField("BODY:", massagedText, false));
    }

    static boolean isBasicallyValidEmailAddress(java.lang.String str) {
        return str != null && EMAIL.matcher(str).matches();
    }
}
