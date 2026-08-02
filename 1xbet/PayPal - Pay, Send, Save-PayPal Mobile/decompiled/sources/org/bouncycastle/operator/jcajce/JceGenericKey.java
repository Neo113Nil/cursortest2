package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceGenericKey extends org.bouncycastle.operator.GenericKey {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JceGenericKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.Key key) {
        super(algorithmIdentifier, r0 != null ? r0 : key);
        byte[] encoded = key.getEncoded();
    }
}
