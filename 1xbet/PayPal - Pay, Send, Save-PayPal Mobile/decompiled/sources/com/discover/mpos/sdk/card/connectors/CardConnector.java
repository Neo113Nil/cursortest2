package com.discover.mpos.sdk.card.connectors;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ+\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010"}, d2 = {"Lcom/discover/mpos/sdk/card/connectors/CardConnector;", "", "Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;", "request", "Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "execute", "(Lcom/discover/mpos/sdk/card/apdu/base/ApduRequest;)Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "Lcom/discover/mpos/sdk/card/connectors/CardConnector$OnConnectionEstablishedCallback;", "onConnectionEstablishedCallback", "", "setOnConnectionEstablishedCallback", "(Lcom/discover/mpos/sdk/card/connectors/CardConnector$OnConnectionEstablishedCallback;)V", "", "getConnectionTime", "()J", "connectionTime", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "getExecutionTime", "executionTime", "OnConnectionEstablishedCallback"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface CardConnector {

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/discover/mpos/sdk/card/connectors/CardConnector$OnConnectionEstablishedCallback;", "", "", "onConnectionSet", "()V"}, k = 1, mv = {1, 4, 1})
    public interface OnConnectionEstablishedCallback {
        void onConnectionSet();
    }

    com.discover.mpos.sdk.card.apdu.base.ApduResponse<byte[], ? extends com.discover.mpos.sdk.card.apdu.error.ApduError> execute(com.discover.mpos.sdk.card.apdu.base.ApduRequest<?> request);

    long getConnectionTime();

    boolean getEnabled();

    long getExecutionTime();

    void setEnabled(boolean z);

    void setOnConnectionEstablishedCallback(com.discover.mpos.sdk.card.connectors.CardConnector.OnConnectionEstablishedCallback onConnectionEstablishedCallback);
}
