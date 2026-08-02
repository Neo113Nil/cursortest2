package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class BodyPartID extends org.bouncycastle.asn1.ASN1Object {
    public static final long bodyIdMax = 4294967295L;
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BodyPartID(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this(r3.longValue());
        java.math.BigInteger value = aSN1Integer.getValue();
        if (value.bitLength() > 32) {
            throw new java.lang.IllegalArgumentException("id out of range");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.ASN1Integer(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public long getID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cmc.BodyPartID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.BodyPartID) {
            return (org.bouncycastle.asn1.cmc.BodyPartID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.BodyPartID(org.bouncycastle.asn1.ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public BodyPartID(long j) {
        if (j < 0 || j > 4294967295L) {
            throw new java.lang.IllegalArgumentException("id out of range");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }
}
