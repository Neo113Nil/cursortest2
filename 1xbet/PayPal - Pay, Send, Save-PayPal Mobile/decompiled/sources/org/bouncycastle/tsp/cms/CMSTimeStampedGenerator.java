package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
public class CMSTimeStampedGenerator {
    protected java.net.URI dataUri;
    protected org.bouncycastle.asn1.cms.MetaData metaData;

    public void setMetaData(boolean z, java.lang.String str, java.lang.String str2, org.bouncycastle.asn1.cms.Attributes attributes) {
        this.metaData = new org.bouncycastle.asn1.cms.MetaData(org.bouncycastle.asn1.ASN1Boolean.getInstance(z), str != null ? new org.bouncycastle.asn1.DERUTF8String(str) : null, str2 != null ? new org.bouncycastle.asn1.DERIA5String(str2) : null, attributes);
    }

    public void setMetaData(boolean z, java.lang.String str, java.lang.String str2) {
        setMetaData(z, str, str2, null);
    }

    public void setDataUri(java.net.URI uri) {
        this.dataUri = uri;
    }

    public void initialiseMessageImprintDigestCalculator(org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        new org.bouncycastle.tsp.cms.MetaDataUtil(this.metaData).Camera2StreamConfigurationMap(digestCalculator);
    }
}
