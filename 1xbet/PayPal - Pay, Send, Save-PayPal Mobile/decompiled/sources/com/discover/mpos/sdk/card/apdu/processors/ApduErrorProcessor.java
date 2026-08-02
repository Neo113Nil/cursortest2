package com.discover.mpos.sdk.card.apdu.processors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/ApduErrorProcessor;", "E", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "", "processError", "content", "", "([B)Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ApduErrorProcessor<E extends com.discover.mpos.sdk.card.apdu.error.ApduError> {
    E b(byte[] bArr);
}
