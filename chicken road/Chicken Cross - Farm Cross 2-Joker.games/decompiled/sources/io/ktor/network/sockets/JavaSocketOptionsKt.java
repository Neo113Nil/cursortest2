package io.ktor.network.sockets;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.ktor.network.sockets.SocketOptions;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JavaSocketOptions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljava/nio/channels/SelectableChannel;", "", "nonBlocking", "(Ljava/nio/channels/SelectableChannel;)V", "Lio/ktor/network/sockets/SocketOptions;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "assignOptions", "(Ljava/nio/channels/SelectableChannel;Lio/ktor/network/sockets/SocketOptions;)V", "", "java7NetworkApisAvailable", "Z", "getJava7NetworkApisAvailable", "()Z", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JavaSocketOptionsKt {
    private static final boolean java7NetworkApisAvailable;

    public static final boolean getJava7NetworkApisAvailable() {
        return java7NetworkApisAvailable;
    }

    static {
        boolean z;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        java7NetworkApisAvailable = z;
    }

    public static final void nonBlocking(SelectableChannel selectableChannel) {
        Intrinsics.checkNotNullParameter(selectableChannel, "<this>");
        selectableChannel.configureBlocking(false);
    }

    public static final void assignOptions(SelectableChannel selectableChannel, SocketOptions options) {
        Intrinsics.checkNotNullParameter(selectableChannel, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        if (selectableChannel instanceof SocketChannel) {
            if (!TypeOfService.m8010equalsimpl0(options.getTypeOfService(), TypeOfService.INSTANCE.m8020getUNDEFINEDzieKYfw())) {
                if (java7NetworkApisAvailable) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.IP_TOS, (SocketOption) Integer.valueOf(options.getTypeOfService() & 255));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTrafficClass(options.getTypeOfService() & 255);
                }
            }
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_REUSEADDR, (SocketOption) true);
                } else {
                    ((SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((SocketChannel) selectableChannel);
            }
            if (options instanceof SocketOptions.PeerSocketOptions) {
                SocketOptions.PeerSocketOptions peerSocketOptions = (SocketOptions.PeerSocketOptions) options;
                Integer valueOf = Integer.valueOf(peerSocketOptions.getReceiveBufferSize());
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (java7NetworkApisAvailable) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_RCVBUF, (SocketOption) Integer.valueOf(intValue));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setReceiveBufferSize(intValue);
                    }
                }
                Integer valueOf2 = Integer.valueOf(peerSocketOptions.getSendBufferSize());
                if (valueOf2.intValue() <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    if (java7NetworkApisAvailable) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_SNDBUF, (SocketOption) Integer.valueOf(intValue2));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSendBufferSize(intValue2);
                    }
                }
            }
            if (options instanceof SocketOptions.TCPClientSocketOptions) {
                SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = (SocketOptions.TCPClientSocketOptions) options;
                Integer valueOf3 = Integer.valueOf(tCPClientSocketOptions.getLingerSeconds());
                if (valueOf3.intValue() < 0) {
                    valueOf3 = null;
                }
                if (valueOf3 != null) {
                    int intValue3 = valueOf3.intValue();
                    if (java7NetworkApisAvailable) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_LINGER, (SocketOption) Integer.valueOf(intValue3));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSoLinger(true, intValue3);
                    }
                }
                Boolean keepAlive = tCPClientSocketOptions.getKeepAlive();
                if (keepAlive != null) {
                    boolean booleanValue = keepAlive.booleanValue();
                    if (java7NetworkApisAvailable) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_KEEPALIVE, (SocketOption) Boolean.valueOf(booleanValue));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setKeepAlive(booleanValue);
                    }
                }
                if (java7NetworkApisAvailable) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.TCP_NODELAY, (SocketOption) Boolean.valueOf(tCPClientSocketOptions.getNoDelay()));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTcpNoDelay(tCPClientSocketOptions.getNoDelay());
                }
            }
        }
        if (selectableChannel instanceof ServerSocketChannel) {
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((ServerSocketChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_REUSEADDR, (SocketOption) true);
                } else {
                    ((ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof DatagramChannel) {
            if (!TypeOfService.m8010equalsimpl0(options.getTypeOfService(), TypeOfService.INSTANCE.m8020getUNDEFINEDzieKYfw())) {
                if (java7NetworkApisAvailable) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.IP_TOS, (SocketOption) Integer.valueOf(options.getTypeOfService() & 255));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setTrafficClass(options.getTypeOfService() & 255);
                }
            }
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_REUSEADDR, (SocketOption) true);
                } else {
                    ((DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((DatagramChannel) selectableChannel);
            }
            if (options instanceof SocketOptions.UDPSocketOptions) {
                if (java7NetworkApisAvailable) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_BROADCAST, (SocketOption) Boolean.valueOf(((SocketOptions.UDPSocketOptions) options).getBroadcast()));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setBroadcast(((SocketOptions.UDPSocketOptions) options).getBroadcast());
                }
            }
            if (options instanceof SocketOptions.PeerSocketOptions) {
                SocketOptions.PeerSocketOptions peerSocketOptions2 = (SocketOptions.PeerSocketOptions) options;
                Integer valueOf4 = Integer.valueOf(peerSocketOptions2.getReceiveBufferSize());
                if (valueOf4.intValue() <= 0) {
                    valueOf4 = null;
                }
                if (valueOf4 != null) {
                    int intValue4 = valueOf4.intValue();
                    if (java7NetworkApisAvailable) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_RCVBUF, (SocketOption) Integer.valueOf(intValue4));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setReceiveBufferSize(intValue4);
                    }
                }
                Integer valueOf5 = Integer.valueOf(peerSocketOptions2.getSendBufferSize());
                Integer num = valueOf5.intValue() > 0 ? valueOf5 : null;
                if (num != null) {
                    int intValue5 = num.intValue();
                    if (java7NetworkApisAvailable) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_SNDBUF, (SocketOption) Integer.valueOf(intValue5));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setSendBufferSize(intValue5);
                    }
                }
            }
        }
    }
}
