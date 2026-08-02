package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class GeneralPKIMessage {
    private final org.bouncycastle.asn1.cmp.PKIMessage getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.cmp.PKIMessage toASN1Structure() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean hasProtection() {
        return this.getHighSpeedVideoSizes.getHeader().getProtectionAlg() != null;
    }

    public org.bouncycastle.asn1.cmp.PKIHeader getHeader() {
        return this.getHighSpeedVideoSizes.getHeader();
    }

    public org.bouncycastle.asn1.cmp.PKIBody getBody() {
        return this.getHighSpeedVideoSizes.getBody();
    }

    private static org.bouncycastle.asn1.cmp.PKIMessage getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.cmp.PKIMessage.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb2.toString(), e2);
        }
    }

    public GeneralPKIMessage(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoFpsRangesFor(bArr));
    }

    public GeneralPKIMessage(org.bouncycastle.asn1.cmp.PKIMessage pKIMessage) {
        this.getHighSpeedVideoSizes = pKIMessage;
    }
}
