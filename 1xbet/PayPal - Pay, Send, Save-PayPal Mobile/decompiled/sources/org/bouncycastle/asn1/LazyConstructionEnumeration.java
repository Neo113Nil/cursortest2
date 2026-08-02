package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class LazyConstructionEnumeration implements java.util.Enumeration {
    private org.bouncycastle.asn1.ASN1InputStream Camera2StreamConfigurationMap;
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes();

    @Override // java.util.Enumeration
    public java.lang.Object nextElement() {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        if (obj == null) {
            throw new java.util.NoSuchElementException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes();
        return obj;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    private java.lang.Object getHighSpeedVideoSizes() {
        try {
            return this.Camera2StreamConfigurationMap.readObject();
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.asn1.ASN1ParsingException("malformed ASN.1: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public LazyConstructionEnumeration(byte[] bArr) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1InputStream(bArr, true);
    }
}
