package com.apollographql.apollo.network.websocket.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/SocketState;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SocketState {
    public static final com.apollographql.apollo.network.websocket.internal.SocketState Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final com.apollographql.apollo.network.websocket.internal.SocketState getHighSpeedVideoFpsRanges;
    public static final com.apollographql.apollo.network.websocket.internal.SocketState getHighSpeedVideoFpsRangesFor;
    public static final com.apollographql.apollo.network.websocket.internal.SocketState getHighSpeedVideoSizes;
    private static final /* synthetic */ com.apollographql.apollo.network.websocket.internal.SocketState[] getHighSpeedVideoSizesFor;

    private SocketState(java.lang.String str, int i) {
    }

    static {
        com.apollographql.apollo.network.websocket.internal.SocketState socketState = new com.apollographql.apollo.network.websocket.internal.SocketState("AwaitOpen", 0);
        getHighSpeedVideoSizes = socketState;
        com.apollographql.apollo.network.websocket.internal.SocketState socketState2 = new com.apollographql.apollo.network.websocket.internal.SocketState("AwaitAck", 1);
        getHighSpeedVideoFpsRangesFor = socketState2;
        com.apollographql.apollo.network.websocket.internal.SocketState socketState3 = new com.apollographql.apollo.network.websocket.internal.SocketState("Connected", 2);
        Camera2StreamConfigurationMap = socketState3;
        com.apollographql.apollo.network.websocket.internal.SocketState socketState4 = new com.apollographql.apollo.network.websocket.internal.SocketState("ShutDown", 3);
        getHighSpeedVideoFpsRanges = socketState4;
        com.apollographql.apollo.network.websocket.internal.SocketState[] socketStateArr = {socketState, socketState2, socketState3, socketState4};
        getHighSpeedVideoSizesFor = socketStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(socketStateArr);
    }

    public static com.apollographql.apollo.network.websocket.internal.SocketState valueOf(java.lang.String str) {
        return (com.apollographql.apollo.network.websocket.internal.SocketState) java.lang.Enum.valueOf(com.apollographql.apollo.network.websocket.internal.SocketState.class, str);
    }

    public static com.apollographql.apollo.network.websocket.internal.SocketState[] values() {
        return (com.apollographql.apollo.network.websocket.internal.SocketState[]) getHighSpeedVideoSizesFor.clone();
    }
}
