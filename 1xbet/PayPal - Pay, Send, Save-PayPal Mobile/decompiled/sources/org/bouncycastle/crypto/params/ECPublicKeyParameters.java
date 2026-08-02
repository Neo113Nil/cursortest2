package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECPublicKeyParameters extends org.bouncycastle.crypto.params.ECKeyParameters {
    private final org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap;

    public org.bouncycastle.math.ec.ECPoint getQ() {
        return this.Camera2StreamConfigurationMap;
    }

    public ECPublicKeyParameters(org.bouncycastle.math.ec.ECPoint eCPoint, org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.Camera2StreamConfigurationMap = eCDomainParameters.validatePublicPoint(eCPoint);
    }
}
