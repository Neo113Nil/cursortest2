package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "clean", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljavax/net/ssl/X509TrustManager;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroid/net/http/X509TrustManagerExtensions;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion INSTANCE = new okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.net.ssl.X509TrustManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.net.http.X509TrustManagerExtensions getHighResolutionOutputSizeshNQ4ISI;

    public AndroidCertificateChainCleaner(javax.net.ssl.X509TrustManager x509TrustManager, android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509TrustManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "");
        this.getHighSpeedVideoFpsRangesFor = x509TrustManager;
        this.getHighResolutionOutputSizeshNQ4ISI = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> chain, java.lang.String hostname) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        try {
            java.util.List<java.security.cert.X509Certificate> checkServerTrusted = this.getHighResolutionOutputSizeshNQ4ISI.checkServerTrusted((java.security.cert.X509Certificate[]) chain.toArray(new java.security.cert.X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "");
            return checkServerTrusted;
        } catch (java.security.cert.CertificateException e) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.internal.platform.android.AndroidCertificateChainCleaner) && ((okhttp3.internal.platform.android.AndroidCertificateChainCleaner) other).getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "buildIfSupported", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.platform.android.AndroidCertificateChainCleaner buildIfSupported(javax.net.ssl.X509TrustManager trustManager) {
            android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
            try {
                x509TrustManagerExtensions = new android.net.http.X509TrustManagerExtensions(trustManager);
            } catch (java.lang.IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new okhttp3.internal.platform.android.AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
