package okhttp3.internal.platform;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "Lokhttp3/internal/platform/ContextAwarePlatform;", "<init>", "()V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "", "level", "", "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "Lokhttp3/internal/platform/android/SocketAdapter;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Android10Platform extends okhttp3.internal.platform.Platform implements okhttp3.internal.platform.ContextAwarePlatform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Android10Platform.Companion INSTANCE = new okhttp3.internal.platform.Android10Platform.Companion(null);
    private static final boolean isSupported;
    private android.content.Context applicationContext;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> getHighSpeedVideoFpsRanges;

    public Android10Platform() {
        java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new okhttp3.internal.platform.android.SocketAdapter[]{okhttp3.internal.platform.android.Android10SocketAdapter.INSTANCE.buildIfSupported(), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.ConscryptSocketAdapter.INSTANCE.getFactory()), new okhttp3.internal.platform.android.DeferredSocketAdapter(okhttp3.internal.platform.android.BouncyCastleSocketAdapter.INSTANCE.getFactory())});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOfNotNull) {
            if (((okhttp3.internal.platform.android.SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.getHighSpeedVideoFpsRanges = arrayList;
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
    public final javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
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
    public final javax.net.ssl.SSLContext newSSLContext() {
        android.os.StrictMode.noteSlowCall("newSSLContext");
        return super.newSSLContext();
    }

    @Override // okhttp3.internal.platform.Platform
    public final okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
        android.os.StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.buildTrustRootIndex(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
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
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
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
    public final java.lang.Object getStackTraceForCloseable(java.lang.String closer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closer, "");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.util.CloseGuard closeGuard = new android.util.CloseGuard();
            closeGuard.open(closer);
            return closeGuard;
        }
        return super.getStackTraceForCloseable(closer);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void logCloseableLeak(java.lang.String message, java.lang.Object stackTrace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace, "");
            ((android.util.CloseGuard) stackTrace).warnIfOpen();
        } else {
            super.logCloseableLeak(message, stackTrace);
        }
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
    public final void log(java.lang.String message, int level, java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        if (level == 5) {
            okhttp3.internal.platform.AndroidPlatform.INSTANCE.getTag();
        } else {
            okhttp3.internal.platform.AndroidPlatform.INSTANCE.getTag();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "buildIfSupported", "()Lokhttp3/internal/platform/Platform;", "", "isSupported", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.Android10Platform.isSupported;
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
            if (isSupported()) {
                return new okhttp3.internal.platform.Android10Platform();
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        isSupported = okhttp3.internal.platform.Platform.INSTANCE.isAndroid() && android.os.Build.VERSION.SDK_INT >= 29;
    }
}
