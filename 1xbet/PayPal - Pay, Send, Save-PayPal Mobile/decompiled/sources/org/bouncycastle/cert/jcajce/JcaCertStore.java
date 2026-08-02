package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaCertStore extends org.bouncycastle.util.CollectionStore {
    private static java.util.Collection getHighSpeedVideoSizes(java.util.Collection collection) throws java.security.cert.CertificateEncodingException {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (java.lang.Object obj : collection) {
            if (obj instanceof java.security.cert.X509Certificate) {
                try {
                    arrayList.add(new org.bouncycastle.cert.X509CertificateHolder(((java.security.cert.X509Certificate) obj).getEncoded()));
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to read encoding: ");
                    sb.append(e.getMessage());
                    throw new java.security.cert.CertificateEncodingException(sb.toString());
                }
            } else {
                arrayList.add((org.bouncycastle.cert.X509CertificateHolder) obj);
            }
        }
        return arrayList;
    }

    public JcaCertStore(java.util.Collection collection) throws java.security.cert.CertificateEncodingException {
        super(getHighSpeedVideoSizes(collection));
    }
}
