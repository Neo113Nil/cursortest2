package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECPrivateKeyParameters extends org.bouncycastle.crypto.params.ECKeyParameters {
    private final java.math.BigInteger Camera2StreamConfigurationMap;

    public java.math.BigInteger getD() {
        return this.Camera2StreamConfigurationMap;
    }

    public ECPrivateKeyParameters(java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.Camera2StreamConfigurationMap = eCDomainParameters.validatePrivateScalar(bigInteger);
    }
}
