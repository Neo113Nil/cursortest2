package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class URIParsedResult extends com.google.zxing.client.result.ParsedResult {
    private final java.lang.String title;
    private final java.lang.String uri;

    public URIParsedResult(java.lang.String str, java.lang.String str2) {
        super(com.google.zxing.client.result.ParsedResultType.URI);
        this.uri = massageURI(str);
        this.title = str2;
    }

    public final java.lang.String getURI() {
        return this.uri;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    @java.lang.Deprecated
    public final boolean isPossiblyMaliciousURI() {
        return com.google.zxing.client.result.URIResultParser.isPossiblyMaliciousURI(this.uri);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final java.lang.String getDisplayResult() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        maybeAppend(this.title, sb);
        maybeAppend(this.uri, sb);
        return sb.toString();
    }

    private static java.lang.String massageURI(java.lang.String str) {
        java.lang.String trim = str.trim();
        int indexOf = trim.indexOf(58);
        return (indexOf < 0 || isColonFollowedByPortNumber(trim, indexOf)) ? "http://".concat(java.lang.String.valueOf(trim)) : trim;
    }

    private static boolean isColonFollowedByPortNumber(java.lang.String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return com.google.zxing.client.result.ResultParser.isSubstringOfDigits(str, i2, indexOf - i2);
    }
}
