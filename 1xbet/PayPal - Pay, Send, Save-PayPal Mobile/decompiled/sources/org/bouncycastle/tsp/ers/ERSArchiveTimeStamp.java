package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSArchiveTimeStamp {
    private final org.bouncycastle.tsp.TimeStampToken Camera2StreamConfigurationMap;
    private org.bouncycastle.tsp.ers.ERSRootNodeCalculator getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.operator.DigestCalculator getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.tsp.ArchiveTimeStamp getHighSpeedVideoSizes;

    public void validatePresent(byte[] bArr, java.util.Date date) throws org.bouncycastle.tsp.ers.ERSException, org.bouncycastle.operator.OperatorCreationException {
        int i;
        if (this.Camera2StreamConfigurationMap.getTimeStampInfo().getGenTime().after(date)) {
            throw new org.bouncycastle.tsp.ers.ArchiveTimeStampValidationException("timestamp generation time is in the future");
        }
        org.bouncycastle.operator.DigestCalculator digestCalculator = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.tsp.PartialHashtree[] reducedHashTree = this.getHighSpeedVideoSizes.getReducedHashTree();
        if (reducedHashTree != null) {
            while (i != reducedHashTree.length) {
                org.bouncycastle.asn1.tsp.PartialHashtree partialHashtree = reducedHashTree[i];
                i = (!partialHashtree.containsHash(bArr) && (partialHashtree.getValueCount() <= 1 || !org.bouncycastle.util.Arrays.areEqual(bArr, org.bouncycastle.tsp.ers.ERSUtil.getHighResolutionOutputSizeshNQ4ISI(digestCalculator, partialHashtree.getValues())))) ? i + 1 : 0;
            }
            throw new org.bouncycastle.tsp.ers.ArchiveTimeStampValidationException("object hash not found");
        }
        if (!org.bouncycastle.util.Arrays.areEqual(bArr, this.Camera2StreamConfigurationMap.getTimeStampInfo().getMessageImprintDigest())) {
            throw new org.bouncycastle.tsp.ers.ArchiveTimeStampValidationException("object hash not found in wrapped timestamp");
        }
        if (this.getHighSpeedVideoSizes.getReducedHashTree() != null) {
            bArr = this.getHighSpeedVideoFpsRanges.computeRootHash(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.getReducedHashTree());
        }
        org.bouncycastle.tsp.TimeStampToken timeStampToken = this.Camera2StreamConfigurationMap;
        if (bArr != null && !org.bouncycastle.util.Arrays.areEqual(bArr, timeStampToken.getTimeStampInfo().getMessageImprintDigest())) {
            throw new org.bouncycastle.tsp.ers.ArchiveTimeStampValidationException("timestamp hash does not match root");
        }
    }

    public void validatePresent(org.bouncycastle.tsp.ers.ERSData eRSData, java.util.Date date) throws org.bouncycastle.tsp.ers.ERSException, org.bouncycastle.operator.OperatorCreationException {
        validatePresent(eRSData.getHash(this.getHighSpeedVideoFpsRangesFor), date);
    }

    public void validate(org.bouncycastle.cms.SignerInformationVerifier signerInformationVerifier) throws org.bouncycastle.tsp.TSPException {
        this.Camera2StreamConfigurationMap.validate(signerInformationVerifier);
    }

    public org.bouncycastle.asn1.tsp.ArchiveTimeStamp toASN1Structure() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.tsp.TimeStampToken getTimeStampToken() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.cert.X509CertificateHolder getSigningCertificate() {
        org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> certificates = this.Camera2StreamConfigurationMap.getCertificates();
        if (certificates == null) {
            return null;
        }
        java.util.Collection<org.bouncycastle.cert.X509CertificateHolder> matches = certificates.getMatches(this.Camera2StreamConfigurationMap.getSID());
        if (matches.isEmpty()) {
            return null;
        }
        return matches.iterator().next();
    }

    public java.util.Date getGenTime() {
        return this.Camera2StreamConfigurationMap.getTimeStampInfo().getGenTime();
    }

    public java.util.Date getExpiryTime() {
        org.bouncycastle.cert.X509CertificateHolder signingCertificate = getSigningCertificate();
        if (signingCertificate != null) {
            return signingCertificate.getNotAfter();
        }
        return null;
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoSizes.getEncoded();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.getHighSpeedVideoSizes.getDigestAlgorithmIdentifier();
    }

    public ERSArchiveTimeStamp(byte[] bArr, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        this(org.bouncycastle.asn1.tsp.ArchiveTimeStamp.getInstance(bArr), digestCalculatorProvider);
    }

    public ERSArchiveTimeStamp(org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.tsp.ers.BinaryTreeRootCalculator();
        try {
            this.getHighSpeedVideoSizes = archiveTimeStamp;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.tsp.TimeStampToken(archiveTimeStamp.getTimeStamp());
            this.getHighSpeedVideoFpsRangesFor = digestCalculatorProvider.get(archiveTimeStamp.getDigestAlgorithmIdentifier());
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.tsp.ers.ERSException(e.getMessage(), e);
        } catch (org.bouncycastle.operator.OperatorCreationException e2) {
            throw new org.bouncycastle.tsp.ers.ERSException(e2.getMessage(), e2);
        }
    }

    ERSArchiveTimeStamp(org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp, org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.tsp.ers.ERSRootNodeCalculator eRSRootNodeCalculator) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.tsp.ers.BinaryTreeRootCalculator();
        try {
            this.getHighSpeedVideoSizes = archiveTimeStamp;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.tsp.TimeStampToken(archiveTimeStamp.getTimeStamp());
            this.getHighSpeedVideoFpsRangesFor = digestCalculator;
            this.getHighSpeedVideoFpsRanges = eRSRootNodeCalculator;
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.tsp.ers.ERSException(e.getMessage(), e);
        }
    }
}
