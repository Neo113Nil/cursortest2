package okhttp3.internal.platform;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002?>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u001d\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010,J)\u00101\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Lokhttp3/internal/platform/ContextAwarePlatform;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "getHandshakeServerNames", "(Ljavax/net/ssl/SSLSocket;)Ljava/util/List;", "message", "level", "", "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "Lokhttp3/internal/platform/android/SocketAdapter;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Camera2StreamConfigurationMap", "Companion", "CustomTrustRootIndex"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidPlatform extends okhttp3.internal.platform.Platform implements okhttp3.internal.platform.ContextAwarePlatform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.AndroidPlatform.Companion INSTANCE = new okhttp3.internal.platform.AndroidPlatform.Companion(null);
    private static final java.lang.String Tag = "OkHttp";
    private static final boolean isSupported;
    private android.content.Context applicationContext;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> Camera2StreamConfigurationMap;

    @Override // okhttp3.internal.platform.Platform
    public final void log(java.lang.String message, int level, java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }

    public AndroidPlatform() {
        java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new okhttp3.internal.platform.android.SocketAdapter[]{okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.INSTANCE, null, 1, null), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.ConscryptSocketAdapter.INSTANCE.getFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.BouncyCastleSocketAdapter.INSTANCE.getFactory())});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOfNotNull) {
            if (((okhttp3.internal.platform.android.SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.Camera2StreamConfigurationMap = arrayList;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final android.content.Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final void setApplicationContext(android.content.Context context) {
        this.applicationContext = context;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void connectSocket(java.net.Socket socket, java.net.InetSocketAddress address, int connectTimeout) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        try {
            socket.connect(address, connectTimeout);
        } catch (java.lang.ClassCastException e) {
            if (android.os.Build.VERSION.SDK_INT == 26) {
                throw new java.io.IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final javax.net.ssl.SSLContext newSSLContext() {
        android.os.StrictMode.noteSlowCall("newSSLContext");
        return super.newSSLContext();
    }

    @Override // okhttp3.internal.platform.Platform
    public final javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((okhttp3.internal.platform.android.SocketAdapter) obj).matchesSocketFactory(sslSocketFactory)) {
                break;
            }
        }
        okhttp3.internal.platform.android.SocketAdapter socketAdapter = (okhttp3.internal.platform.android.SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sslSocketFactory);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((okhttp3.internal.platform.android.SocketAdapter) obj).matchesSocket(sslSocket)) {
                    break;
                }
            }
        }
        okhttp3.internal.platform.android.SocketAdapter socketAdapter = (okhttp3.internal.platform.android.SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((okhttp3.internal.platform.android.SocketAdapter) obj).matchesSocket(sslSocket)) {
                break;
            }
        }
        okhttp3.internal.platform.android.SocketAdapter socketAdapter = (okhttp3.internal.platform.android.SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean isCleartextTrafficPermitted(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
        okhttp3.internal.platform.android.AndroidCertificateChainCleaner buildIfSupported = okhttp3.internal.platform.android.AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
        return buildIfSupported != null ? buildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
        try {
            android.os.StrictMode.noteSlowCall("buildTrustRootIndex");
            java.lang.reflect.Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", java.security.cert.X509Certificate.class);
            declaredMethod.setAccessible(true);
            kotlin.jvm.internal.Intrinsics.checkNotNull(declaredMethod);
            return new okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex(trustManager, declaredMethod);
        } catch (java.lang.NoSuchMethodException unused) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final java.util.List<java.lang.String> getHandshakeServerNames(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        return super.getHandshakeServerNames(sslSocket);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "copy", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljavax/net/ssl/X509TrustManager;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/reflect/Method;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final javax.net.ssl.X509TrustManager getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.reflect.Method Camera2StreamConfigurationMap;

        public CustomTrustRootIndex(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509TrustManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.getHighResolutionOutputSizeshNQ4ISI = x509TrustManager;
            this.Camera2StreamConfigurationMap = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate cert) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cert, "");
            try {
                java.lang.Object invoke = this.Camera2StreamConfigurationMap.invoke(this.getHighResolutionOutputSizeshNQ4ISI, cert);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                return ((java.security.cert.TrustAnchor) invoke).getTrustedCert();
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError("unable to get issues and signature", e);
            } catch (java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomTrustRootIndex(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex)) {
                return false;
            }
            okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex customTrustRootIndex = (okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, customTrustRootIndex.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, customTrustRootIndex.Camera2StreamConfigurationMap);
        }

        public final okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy(javax.net.ssl.X509TrustManager trustManager, java.lang.reflect.Method findByIssuerAndSignatureMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "");
            return new okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex(trustManager, findByIssuerAndSignatureMethod);
        }

        public static /* synthetic */ okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy$default(okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex customTrustRootIndex, javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = customTrustRootIndex.getHighResolutionOutputSizeshNQ4ISI;
            }
            if ((i & 2) != 0) {
                method = customTrustRootIndex.Camera2StreamConfigurationMap;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "buildIfSupported", "()Lokhttp3/internal/platform/Platform;", "", "Tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "", "isSupported", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getTag() {
            return okhttp3.internal.platform.AndroidPlatform.Tag;
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.AndroidPlatform.isSupported;
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
            if (isSupported()) {
                return new okhttp3.internal.platform.AndroidPlatform();
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        isSupported = okhttp3.internal.platform.Platform.INSTANCE.isAndroid() && android.os.Build.VERSION.SDK_INT < 29;
    }
}
