package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampRequest {
    private static java.util.Set Camera2StreamConfigurationMap = java.util.Collections.unmodifiableSet(new java.util.HashSet());
    org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.tsp.TimeStampReq getHighSpeedVideoSizes;

    public void validate(java.util.Set set, java.util.Set set2, java.util.Set set3) throws org.bouncycastle.tsp.TSPException {
        java.util.Set highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(set);
        java.util.Set highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(set2);
        java.util.Set highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(set3);
        if (!highResolutionOutputSizeshNQ4ISI.contains(getMessageImprintAlgOID())) {
            throw new org.bouncycastle.tsp.TSPValidationException("request contains unknown algorithm", 128);
        }
        if (highResolutionOutputSizeshNQ4ISI2 != null && getReqPolicy() != null && !highResolutionOutputSizeshNQ4ISI2.contains(getReqPolicy())) {
            throw new org.bouncycastle.tsp.TSPValidationException("request contains unknown policy", 256);
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges;
        if (extensions != null && highResolutionOutputSizeshNQ4ISI3 != null) {
            java.util.Enumeration oids = extensions.oids();
            while (oids.hasMoreElements()) {
                if (!highResolutionOutputSizeshNQ4ISI3.contains((org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement())) {
                    throw new org.bouncycastle.tsp.TSPValidationException("request contains unknown extension", 8388608);
                }
            }
        }
        if (org.bouncycastle.tsp.TSPUtil.Camera2StreamConfigurationMap(getMessageImprintAlgOID().getId()) != getMessageImprintDigest().length) {
            throw new org.bouncycastle.tsp.TSPValidationException("imprint digest the wrong length", 4);
        }
    }

    public boolean hasExtensions() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public int getVersion() {
        return this.getHighSpeedVideoSizes.getVersion().intValueExact();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getReqPolicy() {
        if (this.getHighSpeedVideoSizes.getReqPolicy() != null) {
            return this.getHighSpeedVideoSizes.getReqPolicy();
        }
        return null;
    }

    public java.math.BigInteger getNonce() {
        if (this.getHighSpeedVideoSizes.getNonce() != null) {
            return this.getHighSpeedVideoSizes.getNonce().getValue();
        }
        return null;
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return this.getHighSpeedVideoFpsRanges == null ? Camera2StreamConfigurationMap : java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(this.getHighSpeedVideoFpsRanges.getNonCriticalExtensionOIDs())));
    }

    public byte[] getMessageImprintDigest() {
        return this.getHighSpeedVideoSizes.getMessageImprint().getHashedMessage();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getMessageImprintAlgOID() {
        return this.getHighSpeedVideoSizes.getMessageImprint().getHashAlgorithm().getAlgorithm();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMessageImprintAlgID() {
        return this.getHighSpeedVideoSizes.getMessageImprint().getHashAlgorithm();
    }

    public java.util.List getExtensionOIDs() {
        return org.bouncycastle.tsp.TSPUtil.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoSizes.getEncoded();
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return this.getHighSpeedVideoFpsRanges == null ? Camera2StreamConfigurationMap : java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(this.getHighSpeedVideoFpsRanges.getCriticalExtensionOIDs())));
    }

    public boolean getCertReq() {
        if (this.getHighSpeedVideoSizes.getCertReq() != null) {
            return this.getHighSpeedVideoSizes.getCertReq().isTrue();
        }
        return false;
    }

    private static org.bouncycastle.asn1.tsp.TimeStampReq getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.tsp.TimeStampReq.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject());
        } catch (java.lang.ClassCastException e) {
            throw new java.io.IOException("malformed request: ".concat(java.lang.String.valueOf(e)));
        } catch (java.lang.IllegalArgumentException e2) {
            throw new java.io.IOException("malformed request: ".concat(java.lang.String.valueOf(e2)));
        }
    }

    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI(java.util.Set set) {
        if (set == null) {
            return set;
        }
        java.util.HashSet hashSet = new java.util.HashSet(set.size());
        for (java.lang.Object obj : set) {
            if (obj instanceof java.lang.String) {
                hashSet.add(new org.bouncycastle.asn1.ASN1ObjectIdentifier((java.lang.String) obj));
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public TimeStampRequest(byte[] bArr) throws java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public TimeStampRequest(org.bouncycastle.asn1.tsp.TimeStampReq timeStampReq) {
        this.getHighSpeedVideoSizes = timeStampReq;
        this.getHighSpeedVideoFpsRanges = timeStampReq.getExtensions();
    }

    public TimeStampRequest(java.io.InputStream inputStream) throws java.io.IOException {
        this(getHighResolutionOutputSizeshNQ4ISI(inputStream));
    }
}
