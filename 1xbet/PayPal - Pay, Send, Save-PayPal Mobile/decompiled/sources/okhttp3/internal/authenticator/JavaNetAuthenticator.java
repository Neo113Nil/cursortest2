package okhttp3.internal.authenticator;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "Lokhttp3/Dns;", "defaultDns", "<init>", "(Lokhttp3/Dns;)V", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "Ljava/net/Proxy;", "Lokhttp3/HttpUrl;", "p0", "p1", "Ljava/net/InetAddress;", "Camera2StreamConfigurationMap", "(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;", "getHighSpeedVideoFpsRanges", "Lokhttp3/Dns;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns getHighSpeedVideoFpsRanges;

    public JavaNetAuthenticator(okhttp3.Dns dns) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
        this.getHighSpeedVideoFpsRanges = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns dns, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? okhttp3.Dns.SYSTEM : dns);
    }

    @Override // okhttp3.Authenticator
    public final okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) throws java.io.IOException {
        java.net.Proxy proxy;
        java.net.PasswordAuthentication requestPasswordAuthentication;
        okhttp3.Address address;
        okhttp3.Dns dns;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.util.List<okhttp3.Challenge> challenges = response.challenges();
        okhttp3.Request request = response.request();
        okhttp3.HttpUrl url = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = java.net.Proxy.NO_PROXY;
        }
        for (okhttp3.Challenge challenge : challenges) {
            if (kotlin.text.StringsKt.equals(io.ktor.http.auth.AuthScheme.Basic, challenge.scheme(), true)) {
                okhttp3.Dns dns2 = (route == null || (address = route.address()) == null || (dns = address.dns()) == null) ? this.getHighSpeedVideoFpsRanges : dns;
                if (z) {
                    java.net.SocketAddress address2 = proxy.address();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(address2, "");
                    java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) address2;
                    java.lang.String hostName = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(proxy);
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, Camera2StreamConfigurationMap(proxy, url, dns2), inetSocketAddress.getPort(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), java.net.Authenticator.RequestorType.PROXY);
                } else {
                    java.lang.String host = url.host();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(proxy);
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(host, Camera2StreamConfigurationMap(proxy, url, dns2), url.port(), url.scheme(), challenge.realm(), challenge.scheme(), url.url(), java.net.Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    java.lang.String str = z ? com.google.common.net.HttpHeaders.PROXY_AUTHORIZATION : "Authorization";
                    java.lang.String userName = requestPasswordAuthentication.getUserName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(userName, "");
                    char[] password = requestPasswordAuthentication.getPassword();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(password, "");
                    return request.newBuilder().header(str, okhttp3.Credentials.basic(userName, new java.lang.String(password), challenge.charset())).build();
                }
            }
        }
        return null;
    }

    private static java.net.InetAddress Camera2StreamConfigurationMap(java.net.Proxy proxy, okhttp3.HttpUrl httpUrl, okhttp3.Dns dns) throws java.io.IOException {
        java.net.Proxy.Type type = proxy.type();
        if (type != null && okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return (java.net.InetAddress) kotlin.collections.CollectionsKt.first((java.util.List) dns.lookup(httpUrl.host()));
        }
        java.net.SocketAddress address = proxy.address();
        kotlin.jvm.internal.Intrinsics.checkNotNull(address, "");
        java.net.InetAddress address2 = ((java.net.InetSocketAddress) address).getAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address2, "");
        return address2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
}
