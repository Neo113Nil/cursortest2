package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class ISBNParsedResult extends com.google.zxing.client.result.ParsedResult {
    private final java.lang.String isbn;

    ISBNParsedResult(java.lang.String str) {
        super(com.google.zxing.client.result.ParsedResultType.ISBN);
        this.isbn = str;
    }

    public final java.lang.String getISBN() {
        return this.isbn;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final java.lang.String getDisplayResult() {
        return this.isbn;
    }
}
