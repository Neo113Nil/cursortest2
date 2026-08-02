package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public abstract class DVCSRequestBuilder {
    protected final org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder requestInformationBuilder;
    private final org.bouncycastle.asn1.x509.ExtensionsGenerator getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
    private final org.bouncycastle.cms.CMSSignedDataGenerator getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.CMSSignedDataGenerator();

    public void setRequester(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.requestInformationBuilder.setRequester(generalName);
    }

    public void setNonce(java.math.BigInteger bigInteger) {
        this.requestInformationBuilder.setNonce(bigInteger);
    }

    public void setDataLocations(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.requestInformationBuilder.setDataLocations(generalNames);
    }

    public void setDataLocations(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.requestInformationBuilder.setDataLocations(generalName);
    }

    public void setDVCS(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this.requestInformationBuilder.setDVCS(generalNames);
    }

    public void setDVCS(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.requestInformationBuilder.setDVCS(generalName);
    }

    protected org.bouncycastle.dvcs.DVCSRequest createDVCRequest(org.bouncycastle.asn1.dvcs.Data data) throws org.bouncycastle.dvcs.DVCSException {
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            this.requestInformationBuilder.setExtensions(this.getHighSpeedVideoFpsRanges.generate());
        }
        return new org.bouncycastle.dvcs.DVCSRequest(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers.id_ct_DVCSRequestData, new org.bouncycastle.asn1.dvcs.DVCSRequest(this.requestInformationBuilder.build(), data)));
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.dvcs.DVCSException {
        try {
            this.getHighSpeedVideoFpsRanges.addExtension(aSN1ObjectIdentifier, z, aSN1Encodable);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.dvcs.DVCSException(sb.toString(), e);
        }
    }

    protected DVCSRequestBuilder(org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder dVCSRequestInformationBuilder) {
        this.requestInformationBuilder = dVCSRequestInformationBuilder;
    }
}
