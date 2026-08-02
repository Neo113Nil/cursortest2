package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0017\u001a\u0006*\u00020\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0018\u0010\u001e\u001a\u0006*\u00020\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001b\u001a\u0006*\u00020\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "", "isSupported", "()Z", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Class;", "getHighSpeedVideoSizes", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRanges", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class AndroidSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter.Companion INSTANCE;
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory playProviderFactory;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Class<? super javax.net.ssl.SSLSocket> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.reflect.Method getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.reflect.Method Camera2StreamConfigurationMap;

    public AndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.getHighSpeedVideoSizes = cls;
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", java.lang.Boolean.TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethod, "");
        this.getHighSpeedVideoFpsRangesFor = declaredMethod;
        this.Camera2StreamConfigurationMap = cls.getMethod("setHostname", java.lang.String.class);
        this.getHighResolutionOutputSizeshNQ4ISI = cls.getMethod("getAlpnSelectedProtocol", new java.lang.Class[0]);
        this.getHighSpeedVideoFpsRanges = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* bridge */ boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public /* bridge */ javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return okhttp3.internal.platform.AndroidPlatform.INSTANCE.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        return this.getHighSpeedVideoSizes.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        if (matchesSocket(sslSocket)) {
            try {
                this.getHighSpeedVideoFpsRangesFor.invoke(sslSocket, java.lang.Boolean.TRUE);
                this.getHighSpeedVideoFpsRanges.invoke(sslSocket, okhttp3.internal.platform.Platform.INSTANCE.concatLengthPrefixed(protocols));
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getHighResolutionOutputSizeshNQ4ISI.invoke(sslSocket, new java.lang.Object[0]);
            if (bArr != null) {
                return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
            }
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if ((cause instanceof java.lang.NullPointerException) && kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new java.lang.AssertionError(e2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "<init>", "()V", "", com.visa.cbp.ConsumerInfo.setSignature, "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "factory", "(Ljava/lang/String;)Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory;
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory(final java.lang.String packageName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            return new okhttp3.internal.platform.android.DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public final boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
                    java.lang.String name2 = sslSocket.getClass().getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(packageName);
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    return kotlin.text.StringsKt.startsWith$default(name2, sb.toString(), false, 2, (java.lang.Object) null);
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public final okhttp3.internal.platform.android.SocketAdapter create(javax.net.ssl.SSLSocket sslSocket) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
                    return okhttp3.internal.platform.android.AndroidSocketAdapter.Companion.access$build(okhttp3.internal.platform.android.AndroidSocketAdapter.INSTANCE, sslSocket.getClass());
                }
            };
        }

        public static final /* synthetic */ okhttp3.internal.platform.android.AndroidSocketAdapter access$build(okhttp3.internal.platform.android.AndroidSocketAdapter.Companion companion, java.lang.Class cls) {
            java.lang.Class cls2 = cls;
            while (cls2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new java.lang.AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(java.lang.String.valueOf(cls)));
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls2);
            return new okhttp3.internal.platform.android.AndroidSocketAdapter(cls2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        okhttp3.internal.platform.android.AndroidSocketAdapter.Companion companion = new okhttp3.internal.platform.android.AndroidSocketAdapter.Companion(null);
        INSTANCE = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }
}
