package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSProcessableByteArray implements org.bouncycastle.cms.CMSTypedData, org.bouncycastle.cms.CMSReadable {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        outputStream.write(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public java.io.InputStream getInputStream() {
        return new java.io.ByteArrayInputStream(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public java.lang.Object getContent() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public CMSProcessableByteArray(byte[] bArr) {
        this(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, bArr);
    }

    public CMSProcessableByteArray(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = bArr;
    }
}
