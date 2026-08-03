package okhttp3.internal.authenticator;

/* compiled from: JavaNetAuthenticator.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "defaultDns", "Lokhttp3/Dns;", "(Lokhttp3/Dns;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", com.ironsource.Ve.n, "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "dns", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns defaultDns;

    /* compiled from: JavaNetAuthenticator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.net.Proxy.Type.values().length];
            try {
                iArr[java.net.Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JavaNetAuthenticator(okhttp3.Dns defaultDns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns dns, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? okhttp3.Dns.SYSTEM : dns);
    }

    @Override // okhttp3.Authenticator
    public okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) throws java.io.IOException {
        java.net.Proxy proxy;
        okhttp3.Dns dns;
        java.net.PasswordAuthentication requestPasswordAuthentication;
        okhttp3.Address address;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        java.util.List<okhttp3.Challenge> challenges = response.challenges();
        okhttp3.Request request = response.request();
        okhttp3.HttpUrl url = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = java.net.Proxy.NO_PROXY;
        }
        for (okhttp3.Challenge challenge : challenges) {
            if (kotlin.text.StringsKt.equals(io.ktor.http.auth.AuthScheme.Basic, challenge.scheme(), true)) {
                if (route == null || (address = route.address()) == null || (dns = address.dns()) == null) {
                    dns = this.defaultDns;
                }
                if (z) {
                    java.net.SocketAddress address2 = proxy.address();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(address2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) address2;
                    java.lang.String hostName = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, url, dns), inetSocketAddress.getPort(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    java.lang.String host = url.host();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(host, connectToInetAddress(proxy, url, dns), url.port(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    java.lang.String str = z ? com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION : com.google.common.net.HttpHeaders.AUTHORIZATION;
                    java.lang.String userName = requestPasswordAuthentication.getUserName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return request.newBuilder().header(str, okhttp3.Credentials.basic(userName, new java.lang.String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy proxy, okhttp3.HttpUrl httpUrl, okhttp3.Dns dns) throws java.io.IOException {
        java.net.Proxy.Type type = proxy.type();
        if (type != null && okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return (java.net.InetAddress) kotlin.collections.CollectionsKt.first((java.util.List) dns.lookup(httpUrl.host()));
        }
        java.net.SocketAddress address = proxy.address();
        kotlin.jvm.internal.Intrinsics.checkNotNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        java.net.InetAddress address2 = ((java.net.InetSocketAddress) address).getAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address2, "address() as InetSocketAddress).address");
        return address2;
    }
}
