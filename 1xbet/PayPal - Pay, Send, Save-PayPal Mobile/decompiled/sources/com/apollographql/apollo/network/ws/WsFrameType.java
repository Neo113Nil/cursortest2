package com.apollographql.apollo.network.ws;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsFrameType;", "", "<init>", "(Ljava/lang/String;I)V", "Text", "Binary"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WsFrameType {
    public static final com.apollographql.apollo.network.ws.WsFrameType Binary;
    public static final com.apollographql.apollo.network.ws.WsFrameType Text;
    private static final /* synthetic */ com.apollographql.apollo.network.ws.WsFrameType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private WsFrameType(java.lang.String str, int i) {
    }

    static {
        com.apollographql.apollo.network.ws.WsFrameType wsFrameType = new com.apollographql.apollo.network.ws.WsFrameType("Text", 0);
        Text = wsFrameType;
        com.apollographql.apollo.network.ws.WsFrameType wsFrameType2 = new com.apollographql.apollo.network.ws.WsFrameType("Binary", 1);
        Binary = wsFrameType2;
        com.apollographql.apollo.network.ws.WsFrameType[] wsFrameTypeArr = {wsFrameType, wsFrameType2};
        getHighSpeedVideoFpsRanges = wsFrameTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(wsFrameTypeArr);
    }

    public static com.apollographql.apollo.network.ws.WsFrameType valueOf(java.lang.String str) {
        return (com.apollographql.apollo.network.ws.WsFrameType) java.lang.Enum.valueOf(com.apollographql.apollo.network.ws.WsFrameType.class, str);
    }

    public static com.apollographql.apollo.network.ws.WsFrameType[] values() {
        return (com.apollographql.apollo.network.ws.WsFrameType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<com.apollographql.apollo.network.ws.WsFrameType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
