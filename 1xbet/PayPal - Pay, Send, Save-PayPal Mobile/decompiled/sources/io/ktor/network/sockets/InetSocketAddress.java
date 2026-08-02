package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011"}, d2 = {"Lio/ktor/network/sockets/InetSocketAddress;", "Lio/ktor/network/sockets/SocketAddress;", "Ljava/net/InetSocketAddress;", "address", "<init>", "(Ljava/net/InetSocketAddress;)V", "", "hostname", "", "port", "(Ljava/lang/String;I)V", "", "resolveAddress", "()[B", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lio/ktor/network/sockets/InetSocketAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/net/InetSocketAddress;", "getAddress$ktor_network", "()Ljava/net/InetSocketAddress;", "getHostname", "getPort"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InetSocketAddress extends io.ktor.network.sockets.SocketAddress {
    private final java.net.InetSocketAddress address;

    @Override // io.ktor.network.sockets.SocketAddress
    /* renamed from: getAddress$ktor_network, reason: from getter */
    public final java.net.InetSocketAddress getAddress() {
        return this.address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InetSocketAddress(java.net.InetSocketAddress inetSocketAddress) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        this.address = inetSocketAddress;
    }

    public final java.lang.String getHostname() {
        java.lang.String hostName = getAddress().getHostName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hostName, "");
        return hostName;
    }

    public final int getPort() {
        return getAddress().getPort();
    }

    public final byte[] resolveAddress() {
        java.net.InetAddress address = getAddress().getAddress();
        if (address != null) {
            return address.getAddress();
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InetSocketAddress(java.lang.String str, int i) {
        this(new java.net.InetSocketAddress(str, i));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public final java.lang.String component1() {
        return getHostname();
    }

    public final int component2() {
        return getPort();
    }

    public final io.ktor.network.sockets.InetSocketAddress copy(java.lang.String hostname, int port) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        return new io.ktor.network.sockets.InetSocketAddress(hostname, port);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(getAddress(), ((io.ktor.network.sockets.InetSocketAddress) other).getAddress());
    }

    public final int hashCode() {
        return getAddress().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = getAddress().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ io.ktor.network.sockets.InetSocketAddress copy$default(io.ktor.network.sockets.InetSocketAddress inetSocketAddress, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = inetSocketAddress.getHostname();
        }
        if ((i2 & 2) != 0) {
            i = inetSocketAddress.getPort();
        }
        return inetSocketAddress.copy(str, i);
    }
}
