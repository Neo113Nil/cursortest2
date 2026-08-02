package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class CRLReason extends org.bouncycastle.asn1.ASN1Object {
    public static final int AA_COMPROMISE = 10;
    public static final int AFFILIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final int PRIVILEGE_WITHDRAWN = 9;
    public static final int REMOVE_FROM_CRL = 8;
    public static final int SUPERSEDED = 4;
    public static final int UNSPECIFIED = 0;
    public static final int aACompromise = 10;
    public static final int affiliationChanged = 3;
    public static final int cACompromise = 2;
    public static final int certificateHold = 6;
    public static final int cessationOfOperation = 5;
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private static final java.util.Hashtable getHighSpeedVideoFpsRanges = new java.util.Hashtable();
    public static final int keyCompromise = 1;
    public static final int privilegeWithdrawn = 9;
    public static final int removeFromCRL = 8;
    public static final int superseded = 4;
    public static final int unspecified = 0;
    private org.bouncycastle.asn1.ASN1Enumerated getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        int intValue = getValue().intValue();
        return "CRLReason: ".concat(java.lang.String.valueOf((intValue < 0 || intValue > 10) ? "invalid" : getHighResolutionOutputSizeshNQ4ISI[intValue]));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getValue() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public static org.bouncycastle.asn1.x509.CRLReason lookup(int i) {
        java.lang.Integer valueOf = org.bouncycastle.util.Integers.valueOf(i);
        java.util.Hashtable hashtable = getHighSpeedVideoFpsRanges;
        if (!hashtable.containsKey(valueOf)) {
            hashtable.put(valueOf, new org.bouncycastle.asn1.x509.CRLReason(i));
        }
        return (org.bouncycastle.asn1.x509.CRLReason) hashtable.get(valueOf);
    }

    public static org.bouncycastle.asn1.x509.CRLReason getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.CRLReason) {
            return (org.bouncycastle.asn1.x509.CRLReason) obj;
        }
        if (obj != null) {
            return lookup(org.bouncycastle.asn1.ASN1Enumerated.getInstance(obj).intValueExact());
        }
        return null;
    }

    private CRLReason(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Enumerated(i);
    }
}
