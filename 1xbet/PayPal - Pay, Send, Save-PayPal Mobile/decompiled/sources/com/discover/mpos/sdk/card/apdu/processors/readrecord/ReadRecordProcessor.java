package com.discover.mpos.sdk.card.apdu.processors.readrecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/processors/readrecord/ReadRecordProcessor;", "Lcom/discover/mpos/sdk/card/apdu/processors/ApduProcessor;", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadApduResponse;", "Lcom/discover/mpos/sdk/card/apdu/error/ReadRecordError;", "()V", "readRecordTag", "", "statusWordSize", "", "contentWithoutStatusWord", "", "content", "processContent", "processError", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.d.d.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ReadRecordProcessor implements com.discover.mpos.sdk.card.apdu.processors.ApduProcessor<com.discover.mpos.sdk.card.apdu.readrecord.ReadApduResponse, com.discover.mpos.sdk.card.apdu.error.ReadRecordError> {

    /* renamed from: a, reason: collision with root package name */
    private final int f2951a = 2;
    private final byte b = com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduContentProcessor
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        new java.lang.Object[]{bArr};
        if (bArr.length != 0 && kotlin.collections.ArraysKt.first(bArr) == this.b) {
            byte[] dataRegion = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.dataRegion(bArr, com.discover.mpos.sdk.core.emv.tlv.Tag.READ_RECORD_RESPONSE_MESSAGE_TEMPLATE.getTag());
            if (dataRegion == null) {
                dataRegion = new byte[0];
            }
            return new com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponseContent(dataRegion);
        }
        int length = bArr.length;
        int i = this.f2951a;
        if (length > i) {
            bArr = kotlin.collections.ArraysKt.copyOfRange(bArr, 0, bArr.length - i);
        }
        return new com.discover.mpos.sdk.card.apdu.readrecord.ReadDataResponseContent(bArr);
    }

    @Override // com.discover.mpos.sdk.card.apdu.processors.ApduErrorProcessor
    public final /* synthetic */ com.discover.mpos.sdk.card.apdu.error.ApduError b(byte[] bArr) {
        return new com.discover.mpos.sdk.card.apdu.error.ReadRecordError(bArr);
    }
}
