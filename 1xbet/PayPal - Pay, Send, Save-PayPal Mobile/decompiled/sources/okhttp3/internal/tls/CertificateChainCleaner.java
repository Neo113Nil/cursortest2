package okhttp3.internal.tls;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "clean", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CertificateChainCleaner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.tls.CertificateChainCleaner.Companion INSTANCE = new okhttp3.internal.tls.CertificateChainCleaner.Companion(null);

    public abstract java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> chain, java.lang.String hostname) throws javax.net.ssl.SSLPeerUnverifiedException;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/tls/CertificateChainCleaner;", "get", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "", "Ljava/security/cert/X509Certificate;", "caCerts", "([Ljava/security/cert/X509Certificate;)Lokhttp3/internal/tls/CertificateChainCleaner;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.tls.CertificateChainCleaner get(javax.net.ssl.X509TrustManager trustManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "");
            return okhttp3.internal.platform.Platform.INSTANCE.get().buildCertificateChainCleaner(trustManager);
        }

        public final okhttp3.internal.tls.CertificateChainCleaner get(java.security.cert.X509Certificate... caCerts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caCerts, "");
            return new okhttp3.internal.tls.BasicCertificateChainCleaner(new okhttp3.internal.tls.BasicTrustRootIndex((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(caCerts, caCerts.length)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
