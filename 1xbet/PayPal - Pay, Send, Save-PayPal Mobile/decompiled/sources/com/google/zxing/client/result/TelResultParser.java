package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class TelResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public final com.google.zxing.client.result.TelParsedResult parse(com.google.zxing.Result result) {
        java.lang.String str;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("tel:") && !massagedText.startsWith("TEL:")) {
            return null;
        }
        if (massagedText.startsWith("TEL:")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("tel:");
            sb.append(massagedText.substring(4));
            str = sb.toString();
        } else {
            str = massagedText;
        }
        int indexOf = massagedText.indexOf(63, 4);
        return new com.google.zxing.client.result.TelParsedResult(indexOf < 0 ? massagedText.substring(4) : massagedText.substring(4, indexOf), str, null);
    }
}
