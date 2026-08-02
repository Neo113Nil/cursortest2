package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
public class BcPKCS10CertificationRequestBuilder extends org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder {
    public BcPKCS10CertificationRequestBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        super(x500Name, org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }
}
