package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509ExtensionsGenerator {
    private java.util.Hashtable getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
    private java.util.Vector getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();

    public void reset() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Vector();
    }

    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public org.bouncycastle.asn1.x509.X509Extensions generate() {
        return new org.bouncycastle.asn1.x509.X509Extensions(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        if (!this.getHighSpeedVideoFpsRangesFor.containsKey(aSN1ObjectIdentifier)) {
            this.getHighResolutionOutputSizeshNQ4ISI.addElement(aSN1ObjectIdentifier);
            this.getHighSpeedVideoFpsRangesFor.put(aSN1ObjectIdentifier, new org.bouncycastle.asn1.x509.X509Extension(z, new org.bouncycastle.asn1.DEROctetString(bArr)));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
            sb.append(aSN1ObjectIdentifier);
            sb.append(" already added");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public void addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        try {
            addExtension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException("error encoding value: ".concat(java.lang.String.valueOf(e)));
        }
    }
}
