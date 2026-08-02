package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class PKMACBuilder {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cert.crmf.PKMACValuesCalculator getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private int getInputFormats;
    private java.security.SecureRandom getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PBMParameter getOutputFormats;

    public org.bouncycastle.cert.crmf.PKMACBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getInputSizeshNQ4ISI = secureRandom;
        return this;
    }

    public org.bouncycastle.cert.crmf.PKMACBuilder setSaltLength(int i) {
        if (i < 8) {
            throw new java.lang.IllegalArgumentException("salt length must be at least 8 bytes");
        }
        this.getInputFormats = i;
        return this;
    }

    public org.bouncycastle.cert.crmf.PKMACBuilder setParameters(org.bouncycastle.asn1.cmp.PBMParameter pBMParameter) {
        Camera2StreamConfigurationMap(pBMParameter.getIterationCount().intValueExact());
        this.getOutputFormats = pBMParameter;
        return this;
    }

    public org.bouncycastle.cert.crmf.PKMACBuilder setIterationCount(int i) {
        if (i < 100) {
            throw new java.lang.IllegalArgumentException("iteration count must be at least 100");
        }
        Camera2StreamConfigurationMap(i);
        this.getHighSpeedVideoFpsRanges = i;
        return this;
    }

    public org.bouncycastle.operator.MacCalculator build(char[] cArr) throws org.bouncycastle.cert.crmf.CRMFException {
        org.bouncycastle.asn1.cmp.PBMParameter pBMParameter = this.getOutputFormats;
        if (pBMParameter != null) {
            return getHighSpeedVideoFpsRangesFor(pBMParameter, cArr);
        }
        byte[] bArr = new byte[this.getInputFormats];
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new java.security.SecureRandom();
        }
        this.getInputSizeshNQ4ISI.nextBytes(bArr);
        return getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.cmp.PBMParameter(bArr, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes), cArr);
    }

    private org.bouncycastle.operator.MacCalculator getHighSpeedVideoFpsRangesFor(final org.bouncycastle.asn1.cmp.PBMParameter pBMParameter, char[] cArr) throws org.bouncycastle.cert.crmf.CRMFException {
        byte[] uTF8ByteArray = org.bouncycastle.util.Strings.toUTF8ByteArray(cArr);
        byte[] octets = pBMParameter.getSalt().getOctets();
        final byte[] bArr = new byte[uTF8ByteArray.length + octets.length];
        java.lang.System.arraycopy(uTF8ByteArray, 0, bArr, 0, uTF8ByteArray.length);
        java.lang.System.arraycopy(octets, 0, bArr, uTF8ByteArray.length, octets.length);
        this.getHighSpeedVideoFpsRangesFor.setup(pBMParameter.getOwf(), pBMParameter.getMac());
        int intValueExact = pBMParameter.getIterationCount().intValueExact();
        do {
            bArr = this.getHighSpeedVideoFpsRangesFor.calculateDigest(bArr);
            intValueExact--;
        } while (intValueExact > 0);
        return new org.bouncycastle.operator.MacCalculator() { // from class: org.bouncycastle.cert.crmf.PKMACBuilder.1
            java.io.ByteArrayOutputStream getHighSpeedVideoFpsRangesFor = new java.io.ByteArrayOutputStream();

            @Override // org.bouncycastle.operator.MacCalculator
            public java.io.OutputStream getOutputStream() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public byte[] getMac() {
                try {
                    return org.bouncycastle.cert.crmf.PKMACBuilder.this.getHighSpeedVideoFpsRangesFor.calculateMac(bArr, this.getHighSpeedVideoFpsRangesFor.toByteArray());
                } catch (org.bouncycastle.cert.crmf.CRMFException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception calculating mac: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
                }
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public org.bouncycastle.operator.GenericKey getKey() {
                return new org.bouncycastle.operator.GenericKey(getAlgorithmIdentifier(), bArr);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.cmp.CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
            }
        };
    }

    private void Camera2StreamConfigurationMap(int i) {
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 <= 0 || i <= i2) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("iteration count exceeds limit (");
        sb.append(i);
        sb.append(" > ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(")");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public PKMACBuilder(org.bouncycastle.cert.crmf.PKMACValuesCalculator pKMACValuesCalculator, int i) {
        this.getInputFormats = 20;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = pKMACValuesCalculator;
    }

    public PKMACBuilder(org.bouncycastle.cert.crmf.PKMACValuesCalculator pKMACValuesCalculator) {
        this(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.iana.IANAObjectIdentifiers.hmacSHA1, org.bouncycastle.asn1.DERNull.INSTANCE), pKMACValuesCalculator);
    }

    private PKMACBuilder(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.cert.crmf.PKMACValuesCalculator pKMACValuesCalculator) {
        this.getInputFormats = 20;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = 1000;
        this.getHighSpeedVideoSizes = algorithmIdentifier2;
        this.getHighSpeedVideoFpsRangesFor = pKMACValuesCalculator;
    }
}
