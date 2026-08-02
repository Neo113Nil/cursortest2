package com.paypal.oslo.core.network.connectivity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/NetworkTransport;", "", "<init>", "(Ljava/lang/String;I)V", "WIFI", "CELLULAR", "ETHERNET", "BLUETOOTH", "UNKNOWN", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkTransport {
    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport BLUETOOTH;
    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport CELLULAR;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport ETHERNET;
    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport NONE;
    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport UNKNOWN;
    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport WIFI;
    private static final /* synthetic */ com.paypal.oslo.core.network.connectivity.NetworkTransport[] getHighSpeedVideoFpsRanges;

    private NetworkTransport(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport = new com.paypal.oslo.core.network.connectivity.NetworkTransport("WIFI", 0);
        WIFI = networkTransport;
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport2 = new com.paypal.oslo.core.network.connectivity.NetworkTransport("CELLULAR", 1);
        CELLULAR = networkTransport2;
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport3 = new com.paypal.oslo.core.network.connectivity.NetworkTransport("ETHERNET", 2);
        ETHERNET = networkTransport3;
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport4 = new com.paypal.oslo.core.network.connectivity.NetworkTransport("BLUETOOTH", 3);
        BLUETOOTH = networkTransport4;
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport5 = new com.paypal.oslo.core.network.connectivity.NetworkTransport("UNKNOWN", 4);
        UNKNOWN = networkTransport5;
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport6 = new com.paypal.oslo.core.network.connectivity.NetworkTransport("NONE", 5);
        NONE = networkTransport6;
        com.paypal.oslo.core.network.connectivity.NetworkTransport[] networkTransportArr = {networkTransport, networkTransport2, networkTransport3, networkTransport4, networkTransport5, networkTransport6};
        getHighSpeedVideoFpsRanges = networkTransportArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(networkTransportArr);
    }

    public static com.paypal.oslo.core.network.connectivity.NetworkTransport[] values() {
        return (com.paypal.oslo.core.network.connectivity.NetworkTransport[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.network.connectivity.NetworkTransport valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.network.connectivity.NetworkTransport) java.lang.Enum.valueOf(com.paypal.oslo.core.network.connectivity.NetworkTransport.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.network.connectivity.NetworkTransport> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
