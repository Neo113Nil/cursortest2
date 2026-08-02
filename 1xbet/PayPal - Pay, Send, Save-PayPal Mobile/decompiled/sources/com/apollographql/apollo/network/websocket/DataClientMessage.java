package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/network/websocket/DataClientMessage;", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "([B)V", "[B", "getData", "()[B"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataClientMessage implements com.apollographql.apollo.network.websocket.ClientMessage {
    private final byte[] data;

    public DataClientMessage(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
    }

    public final byte[] getData() {
        return this.data;
    }
}
