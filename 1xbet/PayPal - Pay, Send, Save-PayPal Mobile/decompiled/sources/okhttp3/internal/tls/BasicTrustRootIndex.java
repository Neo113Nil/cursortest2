package okhttp3.internal.tls;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "Ljava/security/cert/X509Certificate;", "caCerts", "<init>", "([Ljava/security/cert/X509Certificate;)V", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ljavax/security/auth/x500/X500Principal;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BasicTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> getHighSpeedVideoFpsRangesFor;

    public BasicTrustRootIndex(java.security.cert.X509Certificate... x509CertificateArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x509CertificateArr, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.security.cert.X509Certificate x509Certificate : x509CertificateArr) {
            javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            java.lang.Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = (java.util.Set) new java.util.LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((java.util.Set) obj).add(x509Certificate);
        }
        this.getHighSpeedVideoFpsRangesFor = linkedHashMap;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public final java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate cert) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cert, "");
        java.util.Set<java.security.cert.X509Certificate> set = this.getHighSpeedVideoFpsRangesFor.get(cert.getIssuerX500Principal());
        java.lang.Object obj = null;
        if (set == null) {
            return null;
        }
        java.util.Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            try {
                cert.verify(((java.security.cert.X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        return (java.security.cert.X509Certificate) obj;
    }

    public final boolean equals(java.lang.Object other) {
        if (other != this) {
            return (other instanceof okhttp3.internal.tls.BasicTrustRootIndex) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.internal.tls.BasicTrustRootIndex) other).getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
        }
        return true;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
