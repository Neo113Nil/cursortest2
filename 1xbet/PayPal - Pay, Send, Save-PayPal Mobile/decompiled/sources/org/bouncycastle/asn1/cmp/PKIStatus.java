package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class PKIStatus extends org.bouncycastle.asn1.ASN1Object {
    public static final int GRANTED = 0;
    public static final int GRANTED_WITH_MODS = 1;
    public static final int KEY_UPDATE_WARNING = 6;
    public static final int REJECTION = 2;
    public static final int REVOCATION_NOTIFICATION = 5;
    public static final int REVOCATION_WARNING = 4;
    public static final int WAITING = 3;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    public static final org.bouncycastle.asn1.cmp.PKIStatus granted = new org.bouncycastle.asn1.cmp.PKIStatus(0);
    public static final org.bouncycastle.asn1.cmp.PKIStatus grantedWithMods = new org.bouncycastle.asn1.cmp.PKIStatus(1);
    public static final org.bouncycastle.asn1.cmp.PKIStatus rejection = new org.bouncycastle.asn1.cmp.PKIStatus(2);
    public static final org.bouncycastle.asn1.cmp.PKIStatus waiting = new org.bouncycastle.asn1.cmp.PKIStatus(3);
    public static final org.bouncycastle.asn1.cmp.PKIStatus revocationWarning = new org.bouncycastle.asn1.cmp.PKIStatus(4);
    public static final org.bouncycastle.asn1.cmp.PKIStatus revocationNotification = new org.bouncycastle.asn1.cmp.PKIStatus(5);
    public static final org.bouncycastle.asn1.cmp.PKIStatus keyUpdateWaiting = new org.bouncycastle.asn1.cmp.PKIStatus(6);

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public static org.bouncycastle.asn1.cmp.PKIStatus getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.PKIStatus) {
            return (org.bouncycastle.asn1.cmp.PKIStatus) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.PKIStatus(org.bouncycastle.asn1.ASN1Integer.getInstance(obj));
        }
        return null;
    }

    private PKIStatus(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
    }

    private PKIStatus(int i) {
        this(new org.bouncycastle.asn1.ASN1Integer(i));
    }
}
