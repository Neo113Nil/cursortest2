package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSEvidenceRecordGenerator {
    private final org.bouncycastle.operator.DigestCalculatorProvider getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.tsp.ers.ERSEvidenceRecord generate(org.bouncycastle.tsp.ers.ERSArchiveTimeStamp eRSArchiveTimeStamp) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        return new org.bouncycastle.tsp.ers.ERSEvidenceRecord(new org.bouncycastle.asn1.tsp.EvidenceRecord((org.bouncycastle.asn1.tsp.CryptoInfos) null, (org.bouncycastle.asn1.tsp.EncryptionInfo) null, eRSArchiveTimeStamp.toASN1Structure()), this.getHighSpeedVideoFpsRangesFor);
    }

    public ERSEvidenceRecordGenerator(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) {
        this.getHighSpeedVideoFpsRangesFor = digestCalculatorProvider;
    }
}
