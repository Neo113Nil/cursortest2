package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J(\u0010\t\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\u00028\u00018'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/network/sockets/Configurable;", "T", "Lio/ktor/network/sockets/SocketOptions;", "Options", "", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "configure", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/network/sockets/Configurable;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions;)V", "options"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Configurable<T extends io.ktor.network.sockets.Configurable<? extends T, Options>, Options extends io.ktor.network.sockets.SocketOptions> {
    T configure(kotlin.jvm.functions.Function1<? super Options, kotlin.Unit> block);

    Options getOptions();

    void setOptions(Options options);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static <T extends io.ktor.network.sockets.Configurable<? extends T, Options>, Options extends io.ktor.network.sockets.SocketOptions> T configure(io.ktor.network.sockets.Configurable<? extends T, Options> configurable, kotlin.jvm.functions.Function1<? super Options, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            io.ktor.network.sockets.SocketOptions copy$ktor_network = configurable.getOptions().copy$ktor_network();
            kotlin.jvm.internal.Intrinsics.checkNotNull(copy$ktor_network, "");
            function1.invoke(copy$ktor_network);
            configurable.setOptions(copy$ktor_network);
            kotlin.jvm.internal.Intrinsics.checkNotNull(configurable, "");
            return configurable;
        }
    }
}
