package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class WifiResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public final com.google.zxing.client.result.WifiParsedResult parse(com.google.zxing.Result result) {
        java.lang.String substring;
        java.lang.String matchSinglePrefixedField;
        java.lang.String str;
        boolean z;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (matchSinglePrefixedField = matchSinglePrefixedField("S:", (substring = massagedText.substring(5)), ';', false)) == null || matchSinglePrefixedField.isEmpty()) {
            return null;
        }
        java.lang.String matchSinglePrefixedField2 = matchSinglePrefixedField("P:", substring, ';', false);
        java.lang.String matchSinglePrefixedField3 = matchSinglePrefixedField("T:", substring, ';', false);
        if (matchSinglePrefixedField3 == null) {
            matchSinglePrefixedField3 = "nopass";
        }
        java.lang.String str2 = matchSinglePrefixedField3;
        java.lang.String matchSinglePrefixedField4 = matchSinglePrefixedField("PH2:", substring, ';', false);
        java.lang.String matchSinglePrefixedField5 = matchSinglePrefixedField("H:", substring, ';', false);
        if (matchSinglePrefixedField5 != null) {
            if (matchSinglePrefixedField4 != null || "true".equalsIgnoreCase(matchSinglePrefixedField5) || "false".equalsIgnoreCase(matchSinglePrefixedField5)) {
                str = matchSinglePrefixedField4;
                z = java.lang.Boolean.parseBoolean(matchSinglePrefixedField5);
                return new com.google.zxing.client.result.WifiParsedResult(str2, matchSinglePrefixedField, matchSinglePrefixedField2, z, matchSinglePrefixedField("I:", substring, ';', false), matchSinglePrefixedField("A:", substring, ';', false), matchSinglePrefixedField("E:", substring, ';', false), str);
            }
            matchSinglePrefixedField4 = matchSinglePrefixedField5;
        }
        str = matchSinglePrefixedField4;
        z = false;
        return new com.google.zxing.client.result.WifiParsedResult(str2, matchSinglePrefixedField, matchSinglePrefixedField2, z, matchSinglePrefixedField("I:", substring, ';', false), matchSinglePrefixedField("A:", substring, ';', false), matchSinglePrefixedField("E:", substring, ';', false), str);
    }
}
