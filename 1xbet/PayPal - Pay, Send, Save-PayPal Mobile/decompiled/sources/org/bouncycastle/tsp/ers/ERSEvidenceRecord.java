package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSEvidenceRecord {
    private final org.bouncycastle.operator.DigestCalculatorProvider Camera2StreamConfigurationMap;
    private final org.bouncycastle.tsp.ers.ERSArchiveTimeStamp getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.tsp.EvidenceRecord getHighSpeedVideoFpsRanges;

    public void validatePresent(byte[] bArr, java.util.Date date) throws org.bouncycastle.tsp.ers.ERSException, org.bouncycastle.operator.OperatorCreationException {
        this.getHighResolutionOutputSizeshNQ4ISI.validatePresent(bArr, date);
    }

    public void validatePresent(org.bouncycastle.tsp.ers.ERSData eRSData, java.util.Date date) throws org.bouncycastle.tsp.ers.ERSException, org.bouncycastle.operator.OperatorCreationException {
        this.getHighResolutionOutputSizeshNQ4ISI.validatePresent(eRSData, date);
    }

    public void validate(org.bouncycastle.cms.SignerInformationVerifier signerInformationVerifier) throws org.bouncycastle.tsp.TSPException {
        this.getHighResolutionOutputSizeshNQ4ISI.validate(signerInformationVerifier);
    }

    public org.bouncycastle.cert.X509CertificateHolder getSigningCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSigningCertificate();
    }

    public org.bouncycastle.tsp.ers.ERSArchiveTimeStamp getLastArchiveTimeStamp() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getEncoded();
    }

    public ERSEvidenceRecord(byte[] bArr, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        this(org.bouncycastle.asn1.tsp.EvidenceRecord.getInstance(bArr), digestCalculatorProvider);
    }

    public ERSEvidenceRecord(org.bouncycastle.asn1.tsp.EvidenceRecord evidenceRecord, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        this.getHighSpeedVideoFpsRanges = evidenceRecord;
        this.Camera2StreamConfigurationMap = digestCalculatorProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.tsp.ers.ERSArchiveTimeStamp(evidenceRecord.getArchiveTimeStampSequence().getArchiveTimeStampChains()[r3.length - 1].getArchiveTimestamps()[r3.length - 1], digestCalculatorProvider);
    }
}
