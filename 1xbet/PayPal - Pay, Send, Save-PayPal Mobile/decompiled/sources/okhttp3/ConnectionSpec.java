package okhttp3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0002+*B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b\u0004\u0010\u0012R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b)\u0010\u000e"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuites", "()Ljava/util/List;", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersions", "-deprecated_supportsTlsExtensions", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "", "apply$okhttp", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "isCompatible", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "[Ljava/lang/String;", "getCipherSuitesAsString$okhttp", "()[Ljava/lang/String;", "cipherSuites", "tlsVersions", "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionSpec {
    private static final java.util.List<okhttp3.CipherSuite> APPROVED_CIPHER_SUITES;
    public static final okhttp3.ConnectionSpec CLEARTEXT;
    public static final okhttp3.ConnectionSpec COMPATIBLE_TLS;
    public static final okhttp3.ConnectionSpec MODERN_TLS;
    private static final java.util.List<okhttp3.CipherSuite> RESTRICTED_CIPHER_SUITES;
    public static final okhttp3.ConnectionSpec RESTRICTED_TLS;
    private final java.lang.String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final java.lang.String[] tlsVersionsAsString;

    public ConnectionSpec(boolean z, boolean z2, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    /* renamed from: isTls, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    /* renamed from: getCipherSuitesAsString$okhttp, reason: from getter */
    public final java.lang.String[] getCipherSuitesAsString() {
        return this.cipherSuitesAsString;
    }

    public final java.util.List<okhttp3.CipherSuite> cipherSuites() {
        java.lang.String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(okhttp3.CipherSuite.INSTANCE.forJavaName(str));
        }
        return arrayList;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuites", imports = {}))
    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final java.util.List<okhttp3.CipherSuite> m24302deprecated_cipherSuites() {
        return cipherSuites();
    }

    public final java.util.List<okhttp3.TlsVersion> tlsVersions() {
        java.lang.String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(okhttp3.TlsVersion.INSTANCE.forJavaName(str));
        }
        return arrayList;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersions", imports = {}))
    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final java.util.List<okhttp3.TlsVersion> m24304deprecated_tlsVersions() {
        return tlsVersions();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name and from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final boolean isCompatible(javax.net.ssl.SSLSocket socket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        if (!this.isTls) {
            return false;
        }
        java.lang.String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !okhttp3.internal._UtilCommonKt.hasIntersection(strArr, socket.getEnabledProtocols(), kotlin.comparisons.ComparisonsKt.naturalOrder())) {
            return false;
        }
        java.lang.String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || okhttp3.internal._UtilCommonKt.hasIntersection(strArr2, socket.getEnabledCipherSuites(), okhttp3.CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof okhttp3.ConnectionSpec)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z = this.isTls;
        okhttp3.ConnectionSpec connectionSpec = (okhttp3.ConnectionSpec) other;
        if (z != connectionSpec.isTls) {
            return false;
        }
        return !z || (java.util.Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && java.util.Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
    }

    public final int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        java.lang.String[] strArr = this.cipherSuitesAsString;
        int hashCode = strArr != null ? java.util.Arrays.hashCode(strArr) : 0;
        java.lang.String[] strArr2 = this.tlsVersionsAsString;
        return ((((hashCode + 527) * 31) + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final java.lang.String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(java.util.Objects.toString(cipherSuites(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(java.util.Objects.toString(tlsVersions(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.supportsTlsExtensions);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b\"\u00020\u000f¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u000b\"\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b\"\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010\u0015\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u0005"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "", "tls", "<init>", "(Z)V", "Lokhttp3/ConnectionSpec;", "connectionSpec", "(Lokhttp3/ConnectionSpec;)V", "allEnabledCipherSuites", "()Lokhttp3/ConnectionSpec$Builder;", "", "Lokhttp3/CipherSuite;", "cipherSuites", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "allEnabledTlsVersions", "Lokhttp3/TlsVersion;", "tlsVersions", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "supportsTlsExtensions", "(Z)Lokhttp3/ConnectionSpec$Builder;", "build", "()Lokhttp3/ConnectionSpec;", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private java.lang.String[] tlsVersions;

        /* renamed from: getTls$okhttp, reason: from getter */
        public final boolean getTls() {
            return this.tls;
        }

        public final void setTls$okhttp(boolean z) {
            this.tls = z;
        }

        /* renamed from: getCipherSuites$okhttp, reason: from getter */
        public final java.lang.String[] getCipherSuites() {
            return this.cipherSuites;
        }

        public final void setCipherSuites$okhttp(java.lang.String[] strArr) {
            this.cipherSuites = strArr;
        }

        /* renamed from: getTlsVersions$okhttp, reason: from getter */
        public final java.lang.String[] getTlsVersions() {
            return this.tlsVersions;
        }

        public final void setTlsVersions$okhttp(java.lang.String[] strArr) {
            this.tlsVersions = strArr;
        }

        /* renamed from: getSupportsTlsExtensions$okhttp, reason: from getter */
        public final boolean getSupportsTlsExtensions() {
            return this.supportsTlsExtensions;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public Builder(boolean z) {
            this.tls = z;
        }

        public Builder(okhttp3.ConnectionSpec connectionSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpec, "");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.getCipherSuitesAsString();
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            this.cipherSuites = null;
            return this;
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(okhttp3.CipherSuite... cipherSuites) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuites, "");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(cipherSuites.length);
            for (okhttp3.CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.javaName());
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            return cipherSuites((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(java.lang.String... cipherSuites) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipherSuites, "");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (cipherSuites.length == 0) {
                throw new java.lang.IllegalArgumentException("At least one cipher suite is required".toString());
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(cipherSuites, cipherSuites.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.cipherSuites = (java.lang.String[]) copyOf;
            return this;
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            this.tlsVersions = null;
            return this;
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(okhttp3.TlsVersion... tlsVersions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersions, "");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(tlsVersions.length);
            for (okhttp3.TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            return tlsVersions((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(java.lang.String... tlsVersions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlsVersions, "");
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (tlsVersions.length == 0) {
                throw new java.lang.IllegalArgumentException("At least one TLS version is required".toString());
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(tlsVersions, tlsVersions.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.tlsVersions = (java.lang.String[]) copyOf;
            return this;
        }

        @kotlin.Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        public final okhttp3.ConnectionSpec build() {
            return new okhttp3.ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }
    }

    static {
        java.util.List<okhttp3.CipherSuite> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new okhttp3.CipherSuite[]{okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256});
        RESTRICTED_CIPHER_SUITES = listOf;
        java.util.List<okhttp3.CipherSuite> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new okhttp3.CipherSuite[]{okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA});
        APPROVED_CIPHER_SUITES = listOf2;
        okhttp3.ConnectionSpec.Builder builder = new okhttp3.ConnectionSpec.Builder(true);
        okhttp3.CipherSuite[] cipherSuiteArr = (okhttp3.CipherSuite[]) listOf.toArray(new okhttp3.CipherSuite[0]);
        RESTRICTED_TLS = builder.cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length)).tlsVersions(okhttp3.TlsVersion.TLS_1_3, okhttp3.TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        okhttp3.ConnectionSpec.Builder builder2 = new okhttp3.ConnectionSpec.Builder(true);
        java.util.List<okhttp3.CipherSuite> list = listOf2;
        okhttp3.CipherSuite[] cipherSuiteArr2 = (okhttp3.CipherSuite[]) list.toArray(new okhttp3.CipherSuite[0]);
        MODERN_TLS = builder2.cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(okhttp3.TlsVersion.TLS_1_3, okhttp3.TlsVersion.TLS_1_2).supportsTlsExtensions(true).build();
        okhttp3.ConnectionSpec.Builder builder3 = new okhttp3.ConnectionSpec.Builder(true);
        okhttp3.CipherSuite[] cipherSuiteArr3 = (okhttp3.CipherSuite[]) list.toArray(new okhttp3.CipherSuite[0]);
        COMPATIBLE_TLS = builder3.cipherSuites((okhttp3.CipherSuite[]) java.util.Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length)).tlsVersions(okhttp3.TlsVersion.TLS_1_3, okhttp3.TlsVersion.TLS_1_2, okhttp3.TlsVersion.TLS_1_1, okhttp3.TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new okhttp3.ConnectionSpec.Builder(false).build();
    }

    public final void apply$okhttp(javax.net.ssl.SSLSocket sslSocket, boolean isFallback) {
        java.lang.String[] enabledProtocols;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        java.lang.String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.Intrinsics.checkNotNull(enabledCipherSuites);
        java.lang.String[] effectiveCipherSuites = okhttp3.internal.Internal.effectiveCipherSuites(this, enabledCipherSuites);
        if (this.tlsVersionsAsString != null) {
            java.lang.String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "");
            enabledProtocols = okhttp3.internal._UtilCommonKt.intersect(enabledProtocols2, this.tlsVersionsAsString, kotlin.comparisons.ComparisonsKt.naturalOrder());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        java.lang.String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.Intrinsics.checkNotNull(supportedCipherSuites);
        int indexOf = okhttp3.internal._UtilCommonKt.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", okhttp3.CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
        if (isFallback && indexOf != -1) {
            java.lang.String str = supportedCipherSuites[indexOf];
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            effectiveCipherSuites = okhttp3.internal._UtilCommonKt.concat(effectiveCipherSuites, str);
        }
        okhttp3.ConnectionSpec build = new okhttp3.ConnectionSpec.Builder(this).cipherSuites((java.lang.String[]) java.util.Arrays.copyOf(effectiveCipherSuites, effectiveCipherSuites.length)).tlsVersions((java.lang.String[]) java.util.Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
        if (build.tlsVersions() != null) {
            sslSocket.setEnabledProtocols(build.tlsVersionsAsString);
        }
        if (build.cipherSuites() != null) {
            sslSocket.setEnabledCipherSuites(build.cipherSuitesAsString);
        }
    }
}
