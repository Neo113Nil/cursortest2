package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampTokenInfo {
    org.bouncycastle.asn1.tsp.TSTInfo getHighResolutionOutputSizeshNQ4ISI;
    java.util.Date getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.tsp.TSTInfo toTSTInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.tsp.TSTInfo toASN1Structure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isOrdered() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOrdering().isTrue();
    }

    public org.bouncycastle.asn1.x509.GeneralName getTsa() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTsa();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSerialNumber().getValue();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getPolicy() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getPolicy();
    }

    public java.math.BigInteger getNonce() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getNonce() != null) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getNonce().getValue();
        }
        return null;
    }

    public byte[] getMessageImprintDigest() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMessageImprint().getHashedMessage();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getMessageImprintAlgOID() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMessageImprint().getHashAlgorithm().getAlgorithm();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getHashAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMessageImprint().getHashAlgorithm();
    }

    public org.bouncycastle.tsp.GenTimeAccuracy getGenTimeAccuracy() {
        if (getAccuracy() != null) {
            return new org.bouncycastle.tsp.GenTimeAccuracy(getAccuracy());
        }
        return null;
    }

    public java.util.Date getGenTime() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getExtensions();
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    public org.bouncycastle.asn1.tsp.Accuracy getAccuracy() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAccuracy();
    }

    TimeStampTokenInfo(org.bouncycastle.asn1.tsp.TSTInfo tSTInfo) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        this.getHighResolutionOutputSizeshNQ4ISI = tSTInfo;
        try {
            this.getHighSpeedVideoSizes = tSTInfo.getGenTime().getDate();
        } catch (java.text.ParseException unused) {
            throw new org.bouncycastle.tsp.TSPException("unable to parse genTime field");
        }
    }
}
