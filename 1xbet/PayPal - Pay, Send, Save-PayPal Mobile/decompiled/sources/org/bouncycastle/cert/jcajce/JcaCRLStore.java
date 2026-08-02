package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaCRLStore extends org.bouncycastle.util.CollectionStore {
    private static java.util.Collection Camera2StreamConfigurationMap(java.util.Collection collection) throws java.security.cert.CRLException {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (java.lang.Object obj : collection) {
            if (obj instanceof java.security.cert.X509CRL) {
                try {
                    arrayList.add(new org.bouncycastle.cert.X509CRLHolder(((java.security.cert.X509CRL) obj).getEncoded()));
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot read encoding: ");
                    sb.append(e.getMessage());
                    throw new java.security.cert.CRLException(sb.toString());
                }
            } else {
                arrayList.add((org.bouncycastle.cert.X509CRLHolder) obj);
            }
        }
        return arrayList;
    }

    public JcaCRLStore(java.util.Collection collection) throws java.security.cert.CRLException {
        super(Camera2StreamConfigurationMap(collection));
    }
}
