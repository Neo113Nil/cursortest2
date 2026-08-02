package okhttp3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lokhttp3/Route;", "", "Lokhttp3/Address;", "address", "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "-deprecated_address", "()Lokhttp3/Address;", "-deprecated_proxy", "()Ljava/net/Proxy;", "-deprecated_socketAddress", "()Ljava/net/InetSocketAddress;", "", "requiresTunnel", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lokhttp3/Address;", "Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Route {
    private final okhttp3.Address address;
    private final java.net.Proxy proxy;
    private final java.net.InetSocketAddress socketAddress;

    public Route(okhttp3.Address address, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final okhttp3.Address address() {
        return this.address;
    }

    public final java.net.Proxy proxy() {
        return this.proxy;
    }

    public final java.net.InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "address", imports = {}))
    /* renamed from: -deprecated_address, reason: not valid java name and from getter */
    public final okhttp3.Address getAddress() {
        return this.address;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final java.net.Proxy getProxy() {
        return this.proxy;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketAddress", imports = {}))
    /* renamed from: -deprecated_socketAddress, reason: not valid java name and from getter */
    public final java.net.InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public final boolean requiresTunnel() {
        if (this.proxy.type() != java.net.Proxy.Type.HTTP) {
            return false;
        }
        return this.address.sslSocketFactory() != null || this.address.protocols().contains(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE);
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.Route)) {
            return false;
        }
        okhttp3.Route route = (okhttp3.Route) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(route.address, this.address) && kotlin.jvm.internal.Intrinsics.areEqual(route.proxy, this.proxy) && kotlin.jvm.internal.Intrinsics.areEqual(route.socketAddress, this.socketAddress);
    }

    public final int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String hostAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String host = this.address.url().host();
        java.net.InetAddress address = this.socketAddress.getAddress();
        java.lang.String canonicalHost = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : okhttp3.internal._HostnamesCommonKt.toCanonicalHost(hostAddress);
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null)) {
            sb.append("[");
            sb.append(host);
            sb.append("]");
        } else {
            sb.append(host);
        }
        if (this.address.url().port() != this.socketAddress.getPort() || kotlin.jvm.internal.Intrinsics.areEqual(host, canonicalHost)) {
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(this.address.url().port());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(host, canonicalHost)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.proxy, java.net.Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (canonicalHost == null) {
                sb.append("<unresolved>");
            } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) canonicalHost, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null)) {
                sb.append("[");
                sb.append(canonicalHost);
                sb.append("]");
            } else {
                sb.append(canonicalHost);
            }
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(this.socketAddress.getPort());
        }
        return sb.toString();
    }
}
