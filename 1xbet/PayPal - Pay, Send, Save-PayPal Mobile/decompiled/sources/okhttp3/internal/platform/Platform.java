package okhttp3.internal.platform;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0011\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010'\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020%2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010\u0006"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "", "getPrefix", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "getHandshakeServerNames", "(Ljavax/net/ssl/SSLSocket;)Ljava/util/List;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "closer", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "newSslSocketFactory", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class Platform {
    private static final java.util.logging.Logger Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Platform.Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static volatile okhttp3.internal.platform.Platform getHighSpeedVideoSizes;

    public final java.lang.String getPrefix() {
        return "OkHttp";
    }

    public javax.net.ssl.SSLContext newSSLContext() {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext, "");
        return sSLContext;
    }

    public javax.net.ssl.X509TrustManager platformTrustManager() {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(trustManager, "");
                return (javax.net.ssl.X509TrustManager) trustManager;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected default trust managers: ");
        java.lang.String arrays = java.util.Arrays.toString(trustManagers);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        sb.append(arrays);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("sun.security.ssl.SSLContextImpl");
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
            java.lang.Object readFieldOrNull = okhttp3.internal._UtilJvmKt.readFieldOrNull(sslSocketFactory, cls, "context");
            if (readFieldOrNull == null) {
                return null;
            }
            return (javax.net.ssl.X509TrustManager) okhttp3.internal._UtilJvmKt.readFieldOrNull(readFieldOrNull, javax.net.ssl.X509TrustManager.class, "trustManager");
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.RuntimeException e) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }

    public java.util.List<java.lang.String> getHandshakeServerNames(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        javax.net.ssl.SSLSession session = sslSocket.getSession();
        javax.net.ssl.ExtendedSSLSession extendedSSLSession = session instanceof javax.net.ssl.ExtendedSSLSession ? (javax.net.ssl.ExtendedSSLSession) session : null;
        if (extendedSSLSession == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        try {
            java.util.List<javax.net.ssl.SNIServerName> requestedServerNames = extendedSSLSession.getRequestedServerNames();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestedServerNames, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (javax.net.ssl.SNIServerName sNIServerName : requestedServerNames) {
                javax.net.ssl.SNIHostName sNIHostName = sNIServerName instanceof javax.net.ssl.SNIHostName ? (javax.net.ssl.SNIHostName) sNIServerName : null;
                java.lang.String asciiName = sNIHostName != null ? sNIHostName.getAsciiName() : null;
                if (asciiName != null) {
                    arrayList.add(asciiName);
                }
            }
            return arrayList;
        } catch (java.lang.UnsupportedOperationException unused) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    public void connectSocket(java.net.Socket socket, java.net.InetSocketAddress address, int connectTimeout) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        socket.connect(address, connectTimeout);
    }

    public static /* synthetic */ void log$default(okhttp3.internal.platform.Platform platform, java.lang.String str, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform.log(str, i, th);
    }

    public void log(java.lang.String message, int level, java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        Camera2StreamConfigurationMap.log(level == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, message, t);
    }

    public java.lang.Object getStackTraceForCloseable(java.lang.String closer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closer, "");
        if (Camera2StreamConfigurationMap.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable(closer);
        }
        return null;
    }

    public void logCloseableLeak(java.lang.String message, java.lang.Object stackTrace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        if (stackTrace == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(message);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            message = sb.toString();
        }
        log(message, 5, (java.lang.Throwable) stackTrace);
    }

    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
        return new okhttp3.internal.tls.BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
        java.security.cert.X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new okhttp3.internal.tls.BasicTrustRootIndex((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
        try {
            javax.net.ssl.SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new javax.net.ssl.TrustManager[]{trustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.AssertionError("No System TLS: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001e\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "get", "()Lokhttp3/internal/platform/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "", "resetForTests", "(Lokhttp3/internal/platform/Platform;)V", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "(Ljava/util/List;)Ljava/util/List;", "", "concatLengthPrefixed", "(Ljava/util/List;)[B", "getHighSpeedVideoSizes", "Lokhttp3/internal/platform/Platform;", "getHighSpeedVideoFpsRangesFor", "", "INFO", com.visa.cbp.getEncExpo.warmup, "WARN", "Ljava/util/logging/Logger;", "Camera2StreamConfigurationMap", "Ljava/util/logging/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "", "isAndroid", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.internal.platform.Platform get() {
            return okhttp3.internal.platform.Platform.getHighSpeedVideoSizes;
        }

        public final void resetForTests(okhttp3.internal.platform.Platform platform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
            okhttp3.internal.platform.Platform.getHighSpeedVideoSizes = platform;
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.resetForTests$okhttp();
        }

        public final java.util.List<java.lang.String> alpnProtocolNames(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : protocols) {
                if (((okhttp3.Protocol) obj) != okhttp3.Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((okhttp3.Protocol) it.next()).toString());
            }
            return arrayList3;
        }

        public final boolean isAndroid() {
            return okhttp3.internal.platform.PlatformRegistry.INSTANCE.isAndroid();
        }

        public final byte[] concatLengthPrefixed(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
            okio.Buffer buffer = new okio.Buffer();
            for (java.lang.String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        public static final /* synthetic */ okhttp3.internal.platform.Platform access$findPlatform(okhttp3.internal.platform.Platform.Companion companion) {
            return okhttp3.internal.platform.PlatformRegistry.INSTANCE.findPlatform();
        }

        public static /* synthetic */ void resetForTests$default(okhttp3.internal.platform.Platform.Companion companion, okhttp3.internal.platform.Platform platform, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                platform = okhttp3.internal.platform.PlatformRegistry.INSTANCE.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.internal.platform.Platform.Companion companion = new okhttp3.internal.platform.Platform.Companion(null);
        INSTANCE = companion;
        getHighSpeedVideoSizes = okhttp3.internal.platform.Platform.Companion.access$findPlatform(companion);
        Camera2StreamConfigurationMap = java.util.logging.Logger.getLogger(okhttp3.OkHttpClient.class.getName());
    }

    public boolean isCleartextTrafficPermitted(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        return true;
    }

    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        return null;
    }

    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
    }

    public void afterHandshake(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.internal.platform.Platform get() {
        return INSTANCE.get();
    }
}
