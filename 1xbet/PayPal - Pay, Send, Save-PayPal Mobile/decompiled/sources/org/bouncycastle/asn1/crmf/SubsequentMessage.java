package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class SubsequentMessage extends org.bouncycastle.asn1.ASN1Integer {
    public static final org.bouncycastle.asn1.crmf.SubsequentMessage encrCert = new org.bouncycastle.asn1.crmf.SubsequentMessage(0);
    public static final org.bouncycastle.asn1.crmf.SubsequentMessage challengeResp = new org.bouncycastle.asn1.crmf.SubsequentMessage(1);

    public static org.bouncycastle.asn1.crmf.SubsequentMessage valueOf(int i) {
        if (i == 0) {
            return encrCert;
        }
        if (i == 1) {
            return challengeResp;
        }
        throw new java.lang.IllegalArgumentException("unknown value: ".concat(java.lang.String.valueOf(i)));
    }

    private SubsequentMessage(int i) {
        super(i);
    }
}
