package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class ECPublicKeySpec extends org.bouncycastle.jce.spec.ECKeySpec {
    private org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap;

    public org.bouncycastle.math.ec.ECPoint getQ() {
        return this.Camera2StreamConfigurationMap;
    }

    public ECPublicKeySpec(org.bouncycastle.math.ec.ECPoint eCPoint, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.Camera2StreamConfigurationMap = eCPoint.normalize();
        } else {
            this.Camera2StreamConfigurationMap = eCPoint;
        }
    }
}
