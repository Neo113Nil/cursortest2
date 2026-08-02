package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter;", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "sslSocketFactory", "", "matchesSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Class;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StandardAndroidSocketAdapter extends okhttp3.internal.platform.android.AndroidSocketAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion INSTANCE = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Class<? super javax.net.ssl.SSLSocketFactory> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Class<?> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> cls, java.lang.Class<? super javax.net.ssl.SSLSocketFactory> cls2, java.lang.Class<?> cls3) {
        super(cls);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls3, "");
        this.Camera2StreamConfigurationMap = cls2;
        this.getHighSpeedVideoFpsRangesFor = cls3;
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        return this.Camera2StreamConfigurationMap.isInstance(sslSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public final javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "");
        java.lang.Object readFieldOrNull = okhttp3.internal._UtilJvmKt.readFieldOrNull(sslSocketFactory, this.getHighSpeedVideoFpsRangesFor, "sslParameters");
        kotlin.jvm.internal.Intrinsics.checkNotNull(readFieldOrNull);
        javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) okhttp3.internal._UtilJvmKt.readFieldOrNull(readFieldOrNull, javax.net.ssl.X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (javax.net.ssl.X509TrustManager) okhttp3.internal._UtilJvmKt.readFieldOrNull(readFieldOrNull, javax.net.ssl.X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "<init>", "()V", "", com.visa.cbp.ConsumerInfo.setSignature, "Lokhttp3/internal/platform/android/SocketAdapter;", "buildIfSupported", "(Ljava/lang/String;)Lokhttp3/internal/platform/android/SocketAdapter;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ okhttp3.internal.platform.android.SocketAdapter buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion companion, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(str);
        }

        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported(java.lang.String packageName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "");
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(packageName);
                sb.append(".OpenSSLSocketImpl");
                java.lang.Class<?> cls = java.lang.Class.forName(sb.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(packageName);
                sb2.append(".OpenSSLSocketFactoryImpl");
                java.lang.Class<?> cls2 = java.lang.Class.forName(sb2.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls2, "");
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(packageName);
                sb3.append(".SSLParametersImpl");
                java.lang.Class<?> cls3 = java.lang.Class.forName(sb3.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls3);
                return new okhttp3.internal.platform.android.StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (java.lang.Exception e) {
                okhttp3.internal.platform.android.AndroidLog androidLog = okhttp3.internal.platform.android.AndroidLog.INSTANCE;
                java.lang.String name2 = okhttp3.OkHttpClient.class.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                androidLog.androidLog$okhttp(name2, 5, "unable to load android socket classes", e);
                return null;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
