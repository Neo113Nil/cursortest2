package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "socketAdapterFactory", "<init>", "(Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;)V", "", "isSupported", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/SocketAdapter;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getHighSpeedVideoSizes", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeferredSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private okhttp3.internal.platform.android.SocketAdapter getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "Lokhttp3/internal/platform/android/SocketAdapter;", "create", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/SocketAdapter;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        okhttp3.internal.platform.android.SocketAdapter create(javax.net.ssl.SSLSocket sslSocket);

        boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return true;
    }

    public DeferredSocketAdapter(okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.getHighSpeedVideoSizes = factory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final /* bridge */ boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final /* bridge */ javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        return this.getHighSpeedVideoSizes.matchesSocket(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<? extends okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "");
        okhttp3.internal.platform.android.SocketAdapter highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(sslSocket);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            highResolutionOutputSizeshNQ4ISI.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "");
        okhttp3.internal.platform.android.SocketAdapter highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(sslSocket);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    private final okhttp3.internal.platform.android.SocketAdapter getHighResolutionOutputSizeshNQ4ISI(javax.net.ssl.SSLSocket p0) {
        okhttp3.internal.platform.android.SocketAdapter socketAdapter;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null && this.getHighSpeedVideoSizes.matchesSocket(p0)) {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.create(p0);
            }
            socketAdapter = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return socketAdapter;
    }
}
