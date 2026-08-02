package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSProcessableFile implements org.bouncycastle.cms.CMSTypedData, org.bouncycastle.cms.CMSReadable {
    private final java.io.File getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.util.io.Streams.pipeAll(fileInputStream, outputStream, this.getHighSpeedVideoFpsRangesFor);
        fileInputStream.close();
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public java.io.InputStream getInputStream() throws java.io.IOException, org.bouncycastle.cms.CMSException {
        return new java.io.BufferedInputStream(new java.io.FileInputStream(this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public java.lang.Object getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public CMSProcessableFile(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.File file, int i) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = file;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public CMSProcessableFile(java.io.File file, int i) {
        this(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, file, i);
    }

    public CMSProcessableFile(java.io.File file) {
        this(file, 32768);
    }
}
