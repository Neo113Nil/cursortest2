package okhttp3.internal.tls;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustRootIndex", "<init>", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "clean", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Ljava/security/cert/X509Certificate;", "p0", "p1", "", "p2", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/security/cert/X509Certificate;Ljava/security/cert/X509Certificate;I)Z", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "Lokhttp3/internal/tls/TrustRootIndex;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okhttp3.internal.tls.TrustRootIndex getHighResolutionOutputSizeshNQ4ISI;

    public BasicCertificateChainCleaner(okhttp3.internal.tls.TrustRootIndex trustRootIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustRootIndex, "");
        this.getHighResolutionOutputSizeshNQ4ISI = trustRootIndex;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> chain, java.lang.String hostname) throws javax.net.ssl.SSLPeerUnverifiedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(chain);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object removeFirst = arrayDeque.removeFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(removeFirst, "");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            java.lang.Object obj = arrayList.get(arrayList.size() - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) obj;
            java.security.cert.X509Certificate findByIssuerAndSignature = this.getHighResolutionOutputSizeshNQ4ISI.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !kotlin.jvm.internal.Intrinsics.areEqual(x509Certificate, findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (getHighSpeedVideoFpsRangesFor(findByIssuerAndSignature, findByIssuerAndSignature, arrayList.size() - 2)) {
                    return arrayList;
                }
                z = true;
            } else {
                java.util.Iterator it = arrayDeque.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) next;
                    if (getHighSpeedVideoFpsRangesFor(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new javax.net.ssl.SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(java.lang.String.valueOf(x509Certificate)));
                }
                return arrayList;
            }
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException("Certificate chain too long: ".concat(java.lang.String.valueOf(arrayList)));
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.security.cert.X509Certificate p0, java.security.cert.X509Certificate p1, int p2) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p0.getIssuerDN(), p1.getSubjectDN()) || p1.getBasicConstraints() < p2) {
            return false;
        }
        try {
            p0.verify(p1.getPublicKey());
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof okhttp3.internal.tls.BasicCertificateChainCleaner) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.internal.tls.BasicCertificateChainCleaner) other).getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
