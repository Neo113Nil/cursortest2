package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;", "Data", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "Lcom/discover/mpos/sdk/card/apdu/base/RequestHeader;", "commandHeader", "Lcom/discover/mpos/sdk/card/apdu/base/RequestData;", "requestData", "", "expectedResponseLength", "<init>", "(Lcom/discover/mpos/sdk/card/apdu/base/RequestHeader;Lcom/discover/mpos/sdk/card/apdu/base/RequestData;Ljava/lang/Integer;)V", "", "toByteArray", "()[B", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/card/apdu/base/RequestHeader;", "Ljava/lang/Integer;", "Lcom/discover/mpos/sdk/card/apdu/base/RequestData;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class ApduRequest<Data> implements com.discover.mpos.sdk.core.emv.EmvData {
    private final com.discover.mpos.sdk.card.apdu.base.RequestHeader commandHeader;
    private final java.lang.Integer expectedResponseLength;
    private final com.discover.mpos.sdk.card.apdu.base.RequestData<Data> requestData;

    public ApduRequest(com.discover.mpos.sdk.card.apdu.base.RequestHeader requestHeader, com.discover.mpos.sdk.card.apdu.base.RequestData<Data> requestData, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestHeader, "");
        this.commandHeader = requestHeader;
        this.requestData = requestData;
        this.expectedResponseLength = num;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    public /* synthetic */ ApduRequest(com.discover.mpos.sdk.card.apdu.base.RequestHeader requestHeader, com.discover.mpos.sdk.card.apdu.base.RequestData requestData, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(requestHeader, (i & 2) != 0 ? null : requestData, (i & 4) != 0 ? null : num);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public byte[] getK() {
        com.discover.mpos.sdk.card.apdu.base.RequestData<Data> requestData = this.requestData;
        byte[] byteArray = requestData != null ? requestData.getK() : null;
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(this.commandHeader.getK()).append(byteArray != null ? java.lang.Byte.valueOf((byte) byteArray.length) : null).append(byteArray);
        java.lang.Integer num = this.expectedResponseLength;
        return append.append(num != null ? com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexByteArray(num.intValue()) : null).build();
    }

    public java.lang.String toString() {
        return toHexString();
    }
}
