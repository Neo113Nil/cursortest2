package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAbsentContent implements org.bouncycastle.cms.CMSTypedData, org.bouncycastle.cms.CMSReadable {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.cms.CMSProcessable
    public java.lang.Object getContent() {
        return null;
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public java.io.InputStream getInputStream() {
        return null;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException {
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public CMSAbsentContent(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }

    public CMSAbsentContent() {
        this(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data);
    }
}
