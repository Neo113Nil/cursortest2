package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class VPKCRequestBuilder extends org.bouncycastle.dvcs.DVCSRequestBuilder {
    private java.util.List getHighSpeedVideoFpsRangesFor;

    public void setRequestTime(java.util.Date date) {
        this.requestInformationBuilder.setRequestTime(new org.bouncycastle.asn1.dvcs.DVCSTime(date));
    }

    public org.bouncycastle.dvcs.DVCSRequest build() throws org.bouncycastle.dvcs.DVCSException {
        java.util.List list = this.getHighSpeedVideoFpsRangesFor;
        return createDVCRequest(new org.bouncycastle.asn1.dvcs.Data((org.bouncycastle.asn1.dvcs.TargetEtcChain[]) list.toArray(new org.bouncycastle.asn1.dvcs.TargetEtcChain[list.size()])));
    }

    public void addTargetChain(org.bouncycastle.dvcs.TargetChain targetChain) {
        this.getHighSpeedVideoFpsRangesFor.add(targetChain.toASN1Structure());
    }

    public void addTargetChain(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        this.getHighSpeedVideoFpsRangesFor.add(new org.bouncycastle.asn1.dvcs.TargetEtcChain(new org.bouncycastle.asn1.dvcs.CertEtcToken(0, x509CertificateHolder.toASN1Structure())));
    }

    public void addTargetChain(org.bouncycastle.asn1.x509.Extension extension) {
        this.getHighSpeedVideoFpsRangesFor.add(new org.bouncycastle.asn1.dvcs.TargetEtcChain(new org.bouncycastle.asn1.dvcs.CertEtcToken(extension)));
    }

    public VPKCRequestBuilder() {
        super(new org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder(org.bouncycastle.asn1.dvcs.ServiceType.VPKC));
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }
}
