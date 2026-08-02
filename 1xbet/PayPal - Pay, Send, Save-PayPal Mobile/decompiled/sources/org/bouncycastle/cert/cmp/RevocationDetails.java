package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class RevocationDetails {
    private org.bouncycastle.asn1.cmp.RevDetails getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmp.RevDetails toASN1Structure() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getHighSpeedVideoSizes.getCertDetails().getSubject();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoSizes.getCertDetails().getSerialNumber().getValue();
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoSizes.getCertDetails().getIssuer();
    }

    public RevocationDetails(org.bouncycastle.asn1.cmp.RevDetails revDetails) {
        this.getHighSpeedVideoSizes = revDetails;
    }
}
