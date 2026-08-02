package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubscribableWebSocketKt {
    public static final /* synthetic */ void access$send(com.apollographql.apollo.network.websocket.WebSocket webSocket, com.apollographql.apollo.network.websocket.ClientMessage clientMessage) {
        if (clientMessage instanceof com.apollographql.apollo.network.websocket.TextClientMessage) {
            webSocket.send(((com.apollographql.apollo.network.websocket.TextClientMessage) clientMessage).getText());
        } else {
            if (!(clientMessage instanceof com.apollographql.apollo.network.websocket.DataClientMessage)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            webSocket.send(((com.apollographql.apollo.network.websocket.DataClientMessage) clientMessage).getData());
        }
    }
}
