package io.ktor.network.sockets;

/* compiled from: Builders.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0006*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005*\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketBuilder;", "aSocket", "(Lio/ktor/network/selector/SelectorManager;)Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "T", "tcpNoDelay", "(Lio/ktor/network/sockets/Configurable;)Lio/ktor/network/sockets/Configurable;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuildersKt {
    public static final io.ktor.network.sockets.SocketBuilder aSocket(io.ktor.network.selector.SelectorManager selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        return new io.ktor.network.sockets.SocketBuilder(selector, io.ktor.network.sockets.SocketOptions.INSTANCE.create$ktor_network());
    }

    @kotlin.Deprecated(message = "noDelay is true by default", replaceWith = @kotlin.ReplaceWith(expression = "this", imports = {}))
    public static final <T extends io.ktor.network.sockets.Configurable<? extends T, ?>> T tcpNoDelay(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        return (T) t.configure(new kotlin.jvm.functions.Function1<?, kotlin.Unit>() { // from class: io.ktor.network.sockets.BuildersKt$tcpNoDelay$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke((io.ktor.network.sockets.SocketOptions) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(io.ktor.network.sockets.SocketOptions configure) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configure, "$this$configure");
                if (configure instanceof io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) {
                    ((io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) configure).setNoDelay(true);
                }
            }
        });
    }
}
