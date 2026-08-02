package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", "options", "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions;)V", "Lio/ktor/network/sockets/TcpSocketBuilder;", "tcp", "()Lio/ktor/network/sockets/TcpSocketBuilder;", "Lio/ktor/network/sockets/UDPSocketBuilder;", "udp", "()Lio/ktor/network/sockets/UDPSocketBuilder;", "Camera2StreamConfigurationMap", "Lio/ktor/network/selector/SelectorManager;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/network/sockets/SocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocketBuilder implements io.ktor.network.sockets.Configurable<io.ktor.network.sockets.SocketBuilder, io.ktor.network.sockets.SocketOptions> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.network.selector.SelectorManager getHighResolutionOutputSizeshNQ4ISI;
    private io.ktor.network.sockets.SocketOptions options;

    public SocketBuilder(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions socketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectorManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketOptions, "");
        this.getHighResolutionOutputSizeshNQ4ISI = selectorManager;
        this.options = socketOptions;
    }

    @Override // io.ktor.network.sockets.Configurable
    public final io.ktor.network.sockets.SocketBuilder configure(kotlin.jvm.functions.Function1<? super io.ktor.network.sockets.SocketOptions, kotlin.Unit> function1) {
        return (io.ktor.network.sockets.SocketBuilder) io.ktor.network.sockets.Configurable.DefaultImpls.configure(this, function1);
    }

    @Override // io.ktor.network.sockets.Configurable
    public final io.ktor.network.sockets.SocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public final void setOptions(io.ktor.network.sockets.SocketOptions socketOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketOptions, "");
        this.options = socketOptions;
    }

    public final io.ktor.network.sockets.TcpSocketBuilder tcp() {
        return new io.ktor.network.sockets.TcpSocketBuilder(this.getHighResolutionOutputSizeshNQ4ISI, getOptions().peer$ktor_network());
    }

    public final io.ktor.network.sockets.UDPSocketBuilder udp() {
        return new io.ktor.network.sockets.UDPSocketBuilder(this.getHighResolutionOutputSizeshNQ4ISI, getOptions().peer$ktor_network().udp$ktor_network());
    }
}
