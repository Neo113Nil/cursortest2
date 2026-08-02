package org.bouncycastle.its.bc;

/* loaded from: classes17.dex */
public class BcITSImplicitCertificateBuilder extends org.bouncycastle.its.ITSImplicitCertificateBuilder {
    public BcITSImplicitCertificateBuilder(org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        super(iTSCertificate, new org.bouncycastle.operator.bc.BcDigestCalculatorProvider(), builder);
    }
}
