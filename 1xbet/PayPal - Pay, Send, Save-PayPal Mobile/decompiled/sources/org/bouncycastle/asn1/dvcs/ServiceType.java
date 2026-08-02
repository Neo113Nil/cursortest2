package org.bouncycastle.asn1.dvcs;

/* loaded from: classes17.dex */
public class ServiceType extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Enumerated getHighSpeedVideoFpsRangesFor;
    public static final org.bouncycastle.asn1.dvcs.ServiceType CPD = new org.bouncycastle.asn1.dvcs.ServiceType(1);
    public static final org.bouncycastle.asn1.dvcs.ServiceType VSD = new org.bouncycastle.asn1.dvcs.ServiceType(2);
    public static final org.bouncycastle.asn1.dvcs.ServiceType VPKC = new org.bouncycastle.asn1.dvcs.ServiceType(3);
    public static final org.bouncycastle.asn1.dvcs.ServiceType CCPD = new org.bouncycastle.asn1.dvcs.ServiceType(4);

    public java.lang.String toString() {
        int intValueExact = this.getHighSpeedVideoFpsRangesFor.intValueExact();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append(intValueExact);
        sb.append(intValueExact == CPD.getHighSpeedVideoFpsRangesFor.intValueExact() ? "(CPD)" : intValueExact == VSD.getHighSpeedVideoFpsRangesFor.intValueExact() ? "(VSD)" : intValueExact == VPKC.getHighSpeedVideoFpsRangesFor.intValueExact() ? "(VPKC)" : intValueExact == CCPD.getHighSpeedVideoFpsRangesFor.intValueExact() ? "(CCPD)" : com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getValue() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public static org.bouncycastle.asn1.dvcs.ServiceType getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Enumerated.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.dvcs.ServiceType getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.dvcs.ServiceType) {
            return (org.bouncycastle.asn1.dvcs.ServiceType) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.dvcs.ServiceType(org.bouncycastle.asn1.ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    private ServiceType(org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Enumerated;
    }

    public ServiceType(int i) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Enumerated(i);
    }
}
