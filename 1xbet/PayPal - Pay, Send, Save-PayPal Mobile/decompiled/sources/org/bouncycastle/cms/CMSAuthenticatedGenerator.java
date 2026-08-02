package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthenticatedGenerator extends org.bouncycastle.cms.CMSEnvelopedGenerator {
    protected org.bouncycastle.cms.CMSAttributeTableGenerator authGen;
    protected org.bouncycastle.cms.CMSAttributeTableGenerator unauthGen;

    public void setUnauthenticatedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unauthGen = cMSAttributeTableGenerator;
    }

    public void setAuthenticatedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.authGen = cMSAttributeTableGenerator;
    }

    protected java.util.Map getBaseParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, aSN1ObjectIdentifier);
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER, algorithmIdentifier);
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, org.bouncycastle.util.Arrays.clone(bArr));
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.MAC_ALGORITHM_IDENTIFIER, algorithmIdentifier2);
        return hashMap;
    }
}
