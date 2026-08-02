package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/ByteCommandData;", "Lcom/discover/mpos/sdk/card/apdu/base/RequestData;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "([B)V", "toByteArray", "()[B"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class ByteCommandData extends com.discover.mpos.sdk.card.apdu.base.RequestData<byte[]> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteCommandData(byte[] bArr) {
        super(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public byte[] getB() {
        return getData();
    }
}
