package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class AddressBookAUResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public final com.google.zxing.client.result.AddressBookParsedResult parse(com.google.zxing.Result result) {
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.contains("MEMORY") || !massagedText.contains(io.ktor.sse.ServerSentEventKt.END_OF_LINE)) {
            return null;
        }
        java.lang.String matchSinglePrefixedField = matchSinglePrefixedField("NAME1:", massagedText, '\r', true);
        java.lang.String matchSinglePrefixedField2 = matchSinglePrefixedField("NAME2:", massagedText, '\r', true);
        java.lang.String[] matchMultipleValuePrefix = matchMultipleValuePrefix("TEL", massagedText);
        java.lang.String[] matchMultipleValuePrefix2 = matchMultipleValuePrefix("MAIL", massagedText);
        java.lang.String matchSinglePrefixedField3 = matchSinglePrefixedField("MEMORY:", massagedText, '\r', false);
        java.lang.String matchSinglePrefixedField4 = matchSinglePrefixedField("ADD:", massagedText, '\r', true);
        return new com.google.zxing.client.result.AddressBookParsedResult(maybeWrap(matchSinglePrefixedField), null, matchSinglePrefixedField2, matchMultipleValuePrefix, null, matchMultipleValuePrefix2, null, null, matchSinglePrefixedField3, matchSinglePrefixedField4 != null ? new java.lang.String[]{matchSinglePrefixedField4} : null, null, null, null, null, null, null);
    }

    private static java.lang.String[] matchMultipleValuePrefix(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = null;
        for (int i = 1; i <= 3; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(i);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            java.lang.String matchSinglePrefixedField = matchSinglePrefixedField(sb.toString(), str2, '\r', true);
            if (matchSinglePrefixedField == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(3);
            }
            arrayList.add(matchSinglePrefixedField);
        }
        if (arrayList == null) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(EMPTY_STR_ARRAY);
    }
}
