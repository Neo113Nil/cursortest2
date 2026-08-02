package io.ktor.util.network;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00060\u0004j\u0002`\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0019\u0010\u000b\u001a\u00020\u0000*\u00060\u0004j\u0002`\u00058G¢\u0006\u0006\u001a\u0004\b\n\u0010\t\"\u0019\u0010\u0003\u001a\u00020\u0002*\u00060\u0004j\u0002`\u00058G¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000e\"\u00020\u00042\u00020\u0004*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f"}, d2 = {"", "hostname", "", "port", "Ljava/net/SocketAddress;", "Lio/ktor/util/network/getHighSpeedVideoSizes;", "NetworkAddress", "(Ljava/lang/String;I)Ljava/net/SocketAddress;", "getHostname", "(Ljava/net/SocketAddress;)Ljava/lang/String;", "getAddress", "address", "getPort", "(Ljava/net/SocketAddress;)I", "getHighSpeedVideoSizes", "Ljava/nio/channels/UnresolvedAddressException;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NetworkAddressJvmKt {
    public static final java.lang.String getHostname(java.net.SocketAddress socketAddress) {
        java.net.InetAddress address;
        java.lang.String hostName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketAddress, "");
        boolean z = socketAddress instanceof java.net.InetSocketAddress;
        java.lang.String str = null;
        java.net.InetSocketAddress inetSocketAddress = z ? (java.net.InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null && (hostName = inetSocketAddress.getHostName()) != null) {
            return hostName;
        }
        java.net.InetSocketAddress inetSocketAddress2 = z ? (java.net.InetSocketAddress) socketAddress : null;
        if (inetSocketAddress2 != null && (address = inetSocketAddress2.getAddress()) != null) {
            str = address.getHostName();
        }
        return str == null ? "" : str;
    }

    public static final java.lang.String getAddress(java.net.SocketAddress socketAddress) {
        java.lang.String hostString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketAddress, "");
        java.net.InetSocketAddress inetSocketAddress = socketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) socketAddress : null;
        return (inetSocketAddress == null || (hostString = inetSocketAddress.getHostString()) == null) ? "" : hostString;
    }

    public static final int getPort(java.net.SocketAddress socketAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketAddress, "");
        java.net.InetSocketAddress inetSocketAddress = socketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null) {
            return inetSocketAddress.getPort();
        }
        return 0;
    }

    public static final java.net.SocketAddress NetworkAddress(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new java.net.InetSocketAddress(str, i);
    }
}
