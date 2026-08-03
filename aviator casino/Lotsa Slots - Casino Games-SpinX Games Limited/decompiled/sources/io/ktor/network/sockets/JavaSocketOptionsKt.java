package io.ktor.network.sockets;

/* compiled from: JavaSocketOptions.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljava/nio/channels/SelectableChannel;", "", "nonBlocking", "(Ljava/nio/channels/SelectableChannel;)V", "Lio/ktor/network/sockets/SocketOptions;", "options", "assignOptions", "(Ljava/nio/channels/SelectableChannel;Lio/ktor/network/sockets/SocketOptions;)V", "", "java7NetworkApisAvailable", "Z", "getJava7NetworkApisAvailable", "()Z", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JavaSocketOptionsKt {
    private static final boolean java7NetworkApisAvailable;

    public static final boolean getJava7NetworkApisAvailable() {
        return java7NetworkApisAvailable;
    }

    static {
        boolean z;
        try {
            java.lang.Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
            z = false;
        }
        java7NetworkApisAvailable = z;
    }

    public static final void nonBlocking(java.nio.channels.SelectableChannel selectableChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectableChannel, "<this>");
        selectableChannel.configureBlocking(false);
    }

    public static final void assignOptions(java.nio.channels.SelectableChannel selectableChannel, io.ktor.network.sockets.SocketOptions options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectableChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        if (selectableChannel instanceof java.nio.channels.SocketChannel) {
            if (!io.ktor.network.sockets.TypeOfService.m10729equalsimpl0(options.getTypeOfService(), io.ktor.network.sockets.TypeOfService.INSTANCE.m10739getUNDEFINEDzieKYfw())) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.IP_TOS, (java.net.SocketOption) java.lang.Integer.valueOf(options.getTypeOfService() & 255));
                } else {
                    ((java.nio.channels.SocketChannel) selectableChannel).socket().setTrafficClass(options.getTypeOfService() & 255);
                }
            }
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_REUSEADDR, (java.net.SocketOption) true);
                } else {
                    ((java.nio.channels.SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                io.ktor.network.sockets.SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((java.nio.channels.SocketChannel) selectableChannel);
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.PeerSocketOptions) {
                io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions = (io.ktor.network.sockets.SocketOptions.PeerSocketOptions) options;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(peerSocketOptions.getReceiveBufferSize());
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_RCVBUF, (java.net.SocketOption) java.lang.Integer.valueOf(intValue));
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setReceiveBufferSize(intValue);
                    }
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(peerSocketOptions.getSendBufferSize());
                if (valueOf2.intValue() <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_SNDBUF, (java.net.SocketOption) java.lang.Integer.valueOf(intValue2));
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setSendBufferSize(intValue2);
                    }
                }
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) {
                io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = (io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) options;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(tCPClientSocketOptions.getLingerSeconds());
                if (valueOf3.intValue() < 0) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    int intValue3 = valueOf3.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_LINGER, (java.net.SocketOption) java.lang.Integer.valueOf(intValue3));
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setSoLinger(true, intValue3);
                    }
                }
                java.lang.Boolean keepAlive = tCPClientSocketOptions.getKeepAlive();
                if (keepAlive != null) {
                    boolean booleanValue = keepAlive.booleanValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_KEEPALIVE, (java.net.SocketOption) keepAlive);
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setKeepAlive(booleanValue);
                    }
                }
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.TCP_NODELAY, (java.net.SocketOption) java.lang.Boolean.valueOf(tCPClientSocketOptions.getNoDelay()));
                } else {
                    ((java.nio.channels.SocketChannel) selectableChannel).socket().setTcpNoDelay(tCPClientSocketOptions.getNoDelay());
                }
            }
        }
        if (selectableChannel instanceof java.nio.channels.ServerSocketChannel) {
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.ServerSocketChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_REUSEADDR, (java.net.SocketOption) true);
                } else {
                    ((java.nio.channels.ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                io.ktor.network.sockets.SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((java.nio.channels.ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof java.nio.channels.DatagramChannel) {
            if (!io.ktor.network.sockets.TypeOfService.m10729equalsimpl0(options.getTypeOfService(), io.ktor.network.sockets.TypeOfService.INSTANCE.m10739getUNDEFINEDzieKYfw())) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.IP_TOS, (java.net.SocketOption) java.lang.Integer.valueOf(options.getTypeOfService() & 255));
                } else {
                    ((java.nio.channels.DatagramChannel) selectableChannel).socket().setTrafficClass(options.getTypeOfService() & 255);
                }
            }
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_REUSEADDR, (java.net.SocketOption) true);
                } else {
                    ((java.nio.channels.DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                io.ktor.network.sockets.SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((java.nio.channels.DatagramChannel) selectableChannel);
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.UDPSocketOptions) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_BROADCAST, (java.net.SocketOption) java.lang.Boolean.valueOf(((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) options).getBroadcast()));
                } else {
                    ((java.nio.channels.DatagramChannel) selectableChannel).socket().setBroadcast(((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) options).getBroadcast());
                }
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.PeerSocketOptions) {
                io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions2 = (io.ktor.network.sockets.SocketOptions.PeerSocketOptions) options;
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(peerSocketOptions2.getReceiveBufferSize());
                if (valueOf4.intValue() <= 0) {
                    valueOf4 = null;
                }
                if (valueOf4 != null) {
                    int intValue4 = valueOf4.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_RCVBUF, (java.net.SocketOption) java.lang.Integer.valueOf(intValue4));
                    } else {
                        ((java.nio.channels.DatagramChannel) selectableChannel).socket().setReceiveBufferSize(intValue4);
                    }
                }
                java.lang.Integer valueOf5 = java.lang.Integer.valueOf(peerSocketOptions2.getSendBufferSize());
                java.lang.Integer num = valueOf5.intValue() > 0 ? valueOf5 : null;
                if (num != null) {
                    int intValue5 = num.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.net.SocketOption>) java.net.StandardSocketOptions.SO_SNDBUF, (java.net.SocketOption) java.lang.Integer.valueOf(intValue5));
                    } else {
                        ((java.nio.channels.DatagramChannel) selectableChannel).socket().setSendBufferSize(intValue5);
                    }
                }
            }
        }
    }
}
