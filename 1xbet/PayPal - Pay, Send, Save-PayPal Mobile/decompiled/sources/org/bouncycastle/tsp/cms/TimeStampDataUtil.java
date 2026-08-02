package org.bouncycastle.tsp.cms;

/* loaded from: classes17.dex */
class TimeStampDataUtil {
    final org.bouncycastle.asn1.cms.TimeStampAndCRL[] getHighSpeedVideoFpsRanges;
    final org.bouncycastle.tsp.cms.MetaDataUtil getHighSpeedVideoSizes;

    final org.bouncycastle.operator.DigestCalculator getHighSpeedVideoSizes(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges[0]).getTimeStampInfo().getMessageImprintAlgOID()));
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(digestCalculator);
            return digestCalculator;
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to extract algorithm ID: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws org.bouncycastle.tsp.cms.ImprintDigestInvalidException, org.bouncycastle.cms.CMSException {
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr = this.getHighSpeedVideoFpsRanges;
            if (i >= timeStampAndCRLArr.length) {
                return;
            }
            try {
                org.bouncycastle.tsp.TimeStampToken highSpeedVideoSizes = getHighSpeedVideoSizes(timeStampAndCRLArr[i]);
                if (i > 0) {
                    org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(highSpeedVideoSizes.getTimeStampInfo().getHashAlgorithm());
                    digestCalculator.getOutputStream().write(this.getHighSpeedVideoFpsRanges[i - 1].getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                    bArr = digestCalculator.getDigest();
                }
                if (!org.bouncycastle.util.Arrays.areEqual(bArr, highSpeedVideoSizes.getTimeStampInfo().getMessageImprintDigest())) {
                    throw new org.bouncycastle.tsp.cms.ImprintDigestInvalidException("hash calculated is different from MessageImprintDigest found in TimeStampToken", highSpeedVideoSizes);
                }
                i++;
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception calculating hash: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            } catch (org.bouncycastle.operator.OperatorCreationException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create digest: ");
                sb2.append(e2.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb2.toString(), e2);
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, org.bouncycastle.tsp.TimeStampToken timeStampToken) throws org.bouncycastle.tsp.cms.ImprintDigestInvalidException, org.bouncycastle.cms.CMSException {
        try {
            byte[] encoded = timeStampToken.getEncoded();
            int i = 0;
            while (true) {
                org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr = this.getHighSpeedVideoFpsRanges;
                if (i >= timeStampAndCRLArr.length) {
                    throw new org.bouncycastle.tsp.cms.ImprintDigestInvalidException("passed in token not associated with timestamps present", timeStampToken);
                }
                try {
                    org.bouncycastle.tsp.TimeStampToken highSpeedVideoSizes = getHighSpeedVideoSizes(timeStampAndCRLArr[i]);
                    if (i > 0) {
                        org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(highSpeedVideoSizes.getTimeStampInfo().getHashAlgorithm());
                        digestCalculator.getOutputStream().write(this.getHighSpeedVideoFpsRanges[i - 1].getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                        bArr = digestCalculator.getDigest();
                    }
                    if (!org.bouncycastle.util.Arrays.areEqual(bArr, highSpeedVideoSizes.getTimeStampInfo().getMessageImprintDigest())) {
                        throw new org.bouncycastle.tsp.cms.ImprintDigestInvalidException("hash calculated is different from MessageImprintDigest found in TimeStampToken", highSpeedVideoSizes);
                    }
                    if (org.bouncycastle.util.Arrays.areEqual(highSpeedVideoSizes.getEncoded(), encoded)) {
                        return;
                    } else {
                        i++;
                    }
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception calculating hash: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
                } catch (org.bouncycastle.operator.OperatorCreationException e2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create digest: ");
                    sb2.append(e2.getMessage());
                    throw new org.bouncycastle.cms.CMSException(sb2.toString(), e2);
                }
            }
        } catch (java.io.IOException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("exception encoding timeStampToken: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb3.toString(), e3);
        }
    }

    final org.bouncycastle.tsp.TimeStampToken[] getHighSpeedVideoFpsRangesFor() throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.tsp.TimeStampToken[] timeStampTokenArr = new org.bouncycastle.tsp.TimeStampToken[this.getHighSpeedVideoFpsRanges.length];
        int i = 0;
        while (true) {
            org.bouncycastle.asn1.cms.TimeStampAndCRL[] timeStampAndCRLArr = this.getHighSpeedVideoFpsRanges;
            if (i >= timeStampAndCRLArr.length) {
                return timeStampTokenArr;
            }
            timeStampTokenArr[i] = getHighSpeedVideoSizes(timeStampAndCRLArr[i]);
            i++;
        }
    }

    private static org.bouncycastle.tsp.TimeStampToken getHighSpeedVideoSizes(org.bouncycastle.asn1.cms.TimeStampAndCRL timeStampAndCRL) throws org.bouncycastle.cms.CMSException {
        try {
            return new org.bouncycastle.tsp.TimeStampToken(timeStampAndCRL.getTimeStampToken());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to parse token data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("token data invalid: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb2.toString(), e2);
        } catch (org.bouncycastle.tsp.TSPException e3) {
            if (e3.getCause() instanceof org.bouncycastle.cms.CMSException) {
                throw ((org.bouncycastle.cms.CMSException) e3.getCause());
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("token data invalid: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb3.toString(), e3);
        }
    }

    final byte[] getHighSpeedVideoSizes(org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.TimeStampAndCRL timeStampAndCRL = this.getHighSpeedVideoFpsRanges[r0.length - 1];
        java.io.OutputStream outputStream = digestCalculator.getOutputStream();
        try {
            outputStream.write(timeStampAndCRL.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception calculating hash: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    TimeStampDataUtil(org.bouncycastle.asn1.cms.TimeStampedDataParser timeStampedDataParser) throws java.io.IOException {
        this.getHighSpeedVideoSizes = new org.bouncycastle.tsp.cms.MetaDataUtil(timeStampedDataParser.getMetaData());
        this.getHighSpeedVideoFpsRanges = timeStampedDataParser.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    TimeStampDataUtil(org.bouncycastle.asn1.cms.TimeStampedData timeStampedData) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.tsp.cms.MetaDataUtil(timeStampedData.getMetaData());
        this.getHighSpeedVideoFpsRanges = timeStampedData.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }
}
