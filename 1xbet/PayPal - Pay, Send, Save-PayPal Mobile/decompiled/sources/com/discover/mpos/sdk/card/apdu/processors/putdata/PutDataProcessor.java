package com.discover.mpos.sdk.card.apdu.processors.putdata;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/putdata/PutDataProcessor;", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "Lcom/discover/mpos/sdk/card/apdu/putdata/PutDataResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "()V", "processContent", "content", "", "processError", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PutDataProcessor implements com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<com.discover.mpos.sdk.card.apdu.putdata.PutDataResponseContent, com.discover.mpos.sdk.card.apdu.error.ApduError> {
    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{bArr};
        return new com.discover.mpos.sdk.card.apdu.putdata.PutDataResponseContent(bArr);
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduErrorProcessor
    public final com.discover.mpos.sdk.card.apdu.error.ApduError b(byte[] bArr) {
        return new com.discover.mpos.sdk.card.apdu.error.ApduError(bArr);
    }
}
