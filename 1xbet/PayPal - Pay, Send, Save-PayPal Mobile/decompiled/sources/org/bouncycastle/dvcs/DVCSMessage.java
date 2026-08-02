package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public abstract class DVCSMessage {
    private final org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;

    public abstract org.bouncycastle.asn1.ASN1Encodable getContent();

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRanges.getContentType();
    }

    protected DVCSMessage(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighSpeedVideoFpsRanges = contentInfo;
    }
}
