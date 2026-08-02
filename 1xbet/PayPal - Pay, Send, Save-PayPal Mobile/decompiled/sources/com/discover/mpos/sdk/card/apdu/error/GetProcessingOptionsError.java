package com.discover.mpos.sdk.card.apdu.error;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/error/GetProcessingOptionsError;", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "", "errorData", "<init>", "([B)V", "statusWord", "[B", "getStatusWord", "()[B", "", "statusWordSize", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class GetProcessingOptionsError extends com.discover.mpos.sdk.card.apdu.error.ApduError {
    private final byte[] statusWord;
    private final int statusWordSize;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetProcessingOptionsError(byte[] bArr) {
        super(bArr);
        this.statusWordSize = 2;
        if (bArr != null) {
            bArr = bArr.length > 2 ? kotlin.collections.ArraysKt.copyOfRange(bArr, bArr.length - 2, bArr.length) : bArr;
        }
        bArr = new byte[0];
        this.statusWord = bArr;
    }

    public final byte[] getStatusWord() {
        return this.statusWord;
    }
}
