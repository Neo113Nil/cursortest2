package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00028\u00008\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/RequestData;", "Data", "Lcom/discover/mpos/sdk/core/emv/EmvData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public abstract class RequestData<Data> implements com.discover.mpos.sdk.core.emv.EmvData {
    private final Data data;

    public RequestData(Data data) {
        this.data = data;
    }

    protected final Data getData() {
        return this.data;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }
}
