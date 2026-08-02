package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECNamedDomainParameters extends org.bouncycastle.crypto.params.ECDomainParameters {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ECNamedDomainParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        super(eCCurve, eCPoint, bigInteger, bigInteger2, bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }

    public ECNamedDomainParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this(aSN1ObjectIdentifier, eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECNamedDomainParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.math.ec.ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        this(aSN1ObjectIdentifier, eCCurve, eCPoint, bigInteger, org.bouncycastle.math.ec.ECConstants.ONE, null);
    }

    public ECNamedDomainParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        super(eCDomainParameters.getCurve(), eCDomainParameters.getG(), eCDomainParameters.getN(), eCDomainParameters.getH(), eCDomainParameters.getSeed());
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }

    public ECNamedDomainParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters) {
        super(x9ECParameters);
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }
}
