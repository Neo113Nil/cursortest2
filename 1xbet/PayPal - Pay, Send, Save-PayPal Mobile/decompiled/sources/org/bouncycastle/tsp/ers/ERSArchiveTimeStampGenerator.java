package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class ERSArchiveTimeStampGenerator {
    private final org.bouncycastle.operator.DigestCalculator getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List<org.bouncycastle.tsp.ers.ERSData> Camera2StreamConfigurationMap = new java.util.ArrayList();
    private org.bouncycastle.tsp.ers.ERSRootNodeCalculator getHighSpeedVideoFpsRangesFor = new org.bouncycastle.tsp.ers.BinaryTreeRootCalculator();

    public org.bouncycastle.tsp.TimeStampRequest generateTimeStampRequest(org.bouncycastle.tsp.TimeStampRequestGenerator timeStampRequestGenerator, java.math.BigInteger bigInteger) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        return timeStampRequestGenerator.generate(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmIdentifier(), this.getHighSpeedVideoFpsRangesFor.computeRootHash(this.getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoFpsRanges()), bigInteger);
    }

    public org.bouncycastle.tsp.TimeStampRequest generateTimeStampRequest(org.bouncycastle.tsp.TimeStampRequestGenerator timeStampRequestGenerator) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        return timeStampRequestGenerator.generate(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmIdentifier(), this.getHighSpeedVideoFpsRangesFor.computeRootHash(this.getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoFpsRanges()));
    }

    public org.bouncycastle.tsp.ers.ERSArchiveTimeStamp generateArchiveTimeStamp(org.bouncycastle.tsp.TimeStampResponse timeStampResponse) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.ers.ERSException {
        org.bouncycastle.asn1.tsp.PartialHashtree[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        byte[] computeRootHash = this.getHighSpeedVideoFpsRangesFor.computeRootHash(this.getHighResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRanges);
        org.bouncycastle.asn1.tsp.TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmIdentifier())) {
            throw new org.bouncycastle.tsp.ers.ERSException("time stamp imprint for wrong algorithm");
        }
        if (org.bouncycastle.util.Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), computeRootHash)) {
            return new org.bouncycastle.tsp.ers.ERSArchiveTimeStamp(highSpeedVideoFpsRanges.length == 1 ? new org.bouncycastle.asn1.tsp.ArchiveTimeStamp(null, null, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()) : new org.bouncycastle.asn1.tsp.ArchiveTimeStamp(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmIdentifier(), highSpeedVideoFpsRanges, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }
        throw new org.bouncycastle.tsp.ers.ERSException("time stamp imprint for wrong root hash");
    }

    public void addData(org.bouncycastle.tsp.ers.ERSData eRSData) {
        this.Camera2StreamConfigurationMap.add(eRSData);
    }

    public void addAllData(java.util.List<org.bouncycastle.tsp.ers.ERSData> list) {
        this.Camera2StreamConfigurationMap.addAll(list);
    }

    private org.bouncycastle.asn1.tsp.PartialHashtree[] getHighSpeedVideoFpsRanges() {
        org.bouncycastle.tsp.ers.ERSDataGroup eRSDataGroup;
        java.util.List<byte[]> highSpeedVideoSizes = org.bouncycastle.tsp.ers.ERSUtil.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.tsp.PartialHashtree[] partialHashtreeArr = new org.bouncycastle.asn1.tsp.PartialHashtree[highSpeedVideoSizes.size()];
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i != this.Camera2StreamConfigurationMap.size(); i++) {
            if (this.Camera2StreamConfigurationMap.get(i) instanceof org.bouncycastle.tsp.ers.ERSDataGroup) {
                hashSet.add((org.bouncycastle.tsp.ers.ERSDataGroup) this.Camera2StreamConfigurationMap.get(i));
            }
        }
        for (int i2 = 0; i2 != highSpeedVideoSizes.size(); i2++) {
            byte[] bArr = highSpeedVideoSizes.get(i2);
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    eRSDataGroup = null;
                    break;
                }
                eRSDataGroup = (org.bouncycastle.tsp.ers.ERSDataGroup) it.next();
                if (org.bouncycastle.util.Arrays.areEqual(eRSDataGroup.getHash(this.getHighResolutionOutputSizeshNQ4ISI), bArr)) {
                    java.util.List<byte[]> hashes = eRSDataGroup.getHashes(this.getHighResolutionOutputSizeshNQ4ISI);
                    partialHashtreeArr[i2] = new org.bouncycastle.asn1.tsp.PartialHashtree((byte[][]) hashes.toArray(new byte[hashes.size()][]));
                    break;
                }
            }
            if (eRSDataGroup == null) {
                partialHashtreeArr[i2] = new org.bouncycastle.asn1.tsp.PartialHashtree(bArr);
            } else {
                hashSet.remove(eRSDataGroup);
            }
        }
        return partialHashtreeArr;
    }

    public ERSArchiveTimeStampGenerator(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this.getHighResolutionOutputSizeshNQ4ISI = digestCalculator;
    }
}
