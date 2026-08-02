package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class OCSPResponseStatus extends org.bouncycastle.asn1.ASN1Object {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;
    private org.bouncycastle.asn1.ASN1Enumerated getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public int getIntValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.intValueExact();
    }

    public static org.bouncycastle.asn1.ocsp.OCSPResponseStatus getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.OCSPResponseStatus) {
            return (org.bouncycastle.asn1.ocsp.OCSPResponseStatus) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.OCSPResponseStatus(org.bouncycastle.asn1.ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    private OCSPResponseStatus(org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Enumerated;
    }

    public OCSPResponseStatus(int i) {
        this(new org.bouncycastle.asn1.ASN1Enumerated(i));
    }
}
