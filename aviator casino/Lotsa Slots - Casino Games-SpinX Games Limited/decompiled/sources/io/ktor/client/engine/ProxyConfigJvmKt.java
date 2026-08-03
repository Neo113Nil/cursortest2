package io.ktor.client.engine;

/* compiled from: ProxyConfigJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b*\n\u0010\n\"\u00020\u00002\u00020\u0000¨\u0006\u000b"}, d2 = {"Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "Ljava/net/SocketAddress;", "Lio/ktor/util/network/NetworkAddress;", "resolveAddress", "(Ljava/net/Proxy;)Ljava/net/SocketAddress;", "Lio/ktor/client/engine/ProxyType;", "getType", "(Ljava/net/Proxy;)Lio/ktor/client/engine/ProxyType;", "type", "ProxyConfig", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProxyConfigJvmKt {

    /* compiled from: ProxyConfigJvm.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[java.net.Proxy.Type.HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final java.net.SocketAddress resolveAddress(java.net.Proxy proxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "<this>");
        java.net.SocketAddress address = proxy.address();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "address(...)");
        return address;
    }

    public static final io.ktor.client.engine.ProxyType getType(java.net.Proxy proxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "<this>");
        java.net.Proxy.Type type = proxy.type();
        int i = type == null ? -1 : io.ktor.client.engine.ProxyConfigJvmKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return io.ktor.client.engine.ProxyType.SOCKS;
        }
        if (i == 2) {
            return io.ktor.client.engine.ProxyType.HTTP;
        }
        return io.ktor.client.engine.ProxyType.UNKNOWN;
    }
}
