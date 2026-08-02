package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIFreeText extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int size() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public org.bouncycastle.asn1.ASN1UTF8String getStringAtUTF8(int i) {
        return (org.bouncycastle.asn1.ASN1UTF8String) this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i);
    }

    public org.bouncycastle.asn1.DERUTF8String getStringAt(int i) {
        org.bouncycastle.asn1.ASN1UTF8String stringAtUTF8 = getStringAtUTF8(i);
        return (stringAtUTF8 == null || (stringAtUTF8 instanceof org.bouncycastle.asn1.DERUTF8String)) ? (org.bouncycastle.asn1.DERUTF8String) stringAtUTF8 : new org.bouncycastle.asn1.DERUTF8String(stringAtUTF8.getString());
    }

    public static org.bouncycastle.asn1.cmp.PKIFreeText getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmp.PKIFreeText getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PKIFreeText) {
            return (org.bouncycastle.asn1.cmp.PKIFreeText) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PKIFreeText(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PKIFreeText(org.bouncycastle.asn1.ASN1UTF8String[] aSN1UTF8StringArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(aSN1UTF8StringArr);
    }

    public PKIFreeText(java.lang.String[] strArr) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(strArr.length);
        for (java.lang.String str : strArr) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(str));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public PKIFreeText(org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(aSN1UTF8String);
    }

    private PKIFreeText(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            if (!(objects.nextElement() instanceof org.bouncycastle.asn1.ASN1UTF8String)) {
                throw new java.lang.IllegalArgumentException("attempt to insert non UTF8 STRING into PKIFreeText");
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }

    public PKIFreeText(java.lang.String str) {
        this(new org.bouncycastle.asn1.DERUTF8String(str));
    }
}
