package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
abstract class ASN1UniversalType extends org.bouncycastle.asn1.ASN1Type {
    final org.bouncycastle.asn1.ASN1Tag getHighResolutionOutputSizeshNQ4ISI;

    org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
        throw new java.lang.IllegalStateException("unexpected implicit primitive encoding");
    }

    org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        throw new java.lang.IllegalStateException("unexpected implicit constructed encoding");
    }

    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (this.getHighSpeedVideoSizes.isInstance(aSN1Primitive)) {
            return aSN1Primitive;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected object: ");
        sb.append(aSN1Primitive.getClass().getName());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    ASN1UniversalType(java.lang.Class cls, int i) {
        super(cls);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Tag.getHighSpeedVideoFpsRanges(i);
    }
}
