package okhttp3;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0007¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0019H\u0007¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002042\u0006\u00109\u001a\u00020\u0000H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0002H\u0016¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b\u0007\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b\t\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\b\u000b\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\b\r\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\b\u000f\u00102R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\b\u0011\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\b\u0013\u0010,R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\b\u001a\u0010*R\u001a\u0010F\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010\u001fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\b\u0016\u0010'R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010H\u001a\u0004\b\u0018\u0010'"}, d2 = {"Lokhttp3/Address;", "", "", "uriHost", "", "uriPort", "Lokhttp3/Dns;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "Lokhttp3/Authenticator;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "Lokhttp3/Protocol;", "protocols", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_dns", "()Lokhttp3/Dns;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "-deprecated_proxyAuthenticator", "()Lokhttp3/Authenticator;", "-deprecated_protocols", "()Ljava/util/List;", "-deprecated_connectionSpecs", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "-deprecated_proxy", "()Ljava/net/Proxy;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "equalsNonHost$okhttp", "(Lokhttp3/Address;)Z", "toString", "()Ljava/lang/String;", "Lokhttp3/Dns;", "Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "Lokhttp3/Authenticator;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "url", "Lokhttp3/HttpUrl;", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Address {
    private final okhttp3.CertificatePinner certificatePinner;
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private final okhttp3.Dns dns;
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;
    private final java.util.List<okhttp3.Protocol> protocols;
    private final java.net.Proxy proxy;
    private final okhttp3.Authenticator proxyAuthenticator;
    private final java.net.ProxySelector proxySelector;
    private final javax.net.SocketFactory socketFactory;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactory;
    private final okhttp3.HttpUrl url;

    public Address(java.lang.String str, int i, okhttp3.Dns dns, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, okhttp3.CertificatePinner certificatePinner, okhttp3.Authenticator authenticator, java.net.Proxy proxy, java.util.List<? extends okhttp3.Protocol> list, java.util.List<okhttp3.ConnectionSpec> list2, java.net.ProxySelector proxySelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxySelector, "");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new okhttp3.HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = okhttp3.internal._UtilJvmKt.toImmutableList(list);
        this.connectionSpecs = okhttp3.internal._UtilJvmKt.toImmutableList(list2);
    }

    public final okhttp3.Dns dns() {
        return this.dns;
    }

    public final javax.net.SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final okhttp3.CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final okhttp3.Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final java.net.Proxy proxy() {
        return this.proxy;
    }

    public final java.net.ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final okhttp3.HttpUrl url() {
        return this.url;
    }

    public final java.util.List<okhttp3.Protocol> protocols() {
        return this.protocols;
    }

    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "url", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final okhttp3.HttpUrl getUrl() {
        return this.url;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "dns", imports = {}))
    /* renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final okhttp3.Dns getDns() {
        return this.dns;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "socketFactory", imports = {}))
    /* renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final javax.net.SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final okhttp3.Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "protocols", imports = {}))
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m24276deprecated_protocols() {
        return this.protocols;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "connectionSpecs", imports = {}))
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m24273deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxySelector", imports = {}))
    /* renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final java.net.ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final java.net.Proxy getProxy() {
        return this.proxy;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sslSocketFactory", imports = {}))
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name and from getter */
    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hostnameVerifier", imports = {}))
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final javax.net.ssl.HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "certificatePinner", imports = {}))
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final okhttp3.CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.Address)) {
            return false;
        }
        okhttp3.Address address = (okhttp3.Address) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        int hashCode2 = this.dns.hashCode();
        int hashCode3 = this.proxyAuthenticator.hashCode();
        int hashCode4 = this.protocols.hashCode();
        int hashCode5 = this.connectionSpecs.hashCode();
        int hashCode6 = this.proxySelector.hashCode();
        int hashCode7 = java.util.Objects.hashCode(this.proxy);
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + java.util.Objects.hashCode(this.sslSocketFactory)) * 31) + java.util.Objects.hashCode(this.hostnameVerifier)) * 31) + java.util.Objects.hashCode(this.certificatePinner);
    }

    public final boolean equalsNonHost$okhttp(okhttp3.Address that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dns, that.dns) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxyAuthenticator, that.proxyAuthenticator) && kotlin.jvm.internal.Intrinsics.areEqual(this.protocols, that.protocols) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectionSpecs, that.connectionSpecs) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxySelector, that.proxySelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.proxy, that.proxy) && kotlin.jvm.internal.Intrinsics.areEqual(this.sslSocketFactory, that.sslSocketFactory) && kotlin.jvm.internal.Intrinsics.areEqual(this.hostnameVerifier, that.hostnameVerifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Address{");
        sb2.append(this.url.host());
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new java.lang.StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new java.lang.StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
