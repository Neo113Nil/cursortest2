package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public class ECPair {
    private final org.bouncycastle.math.ec.ECPoint Camera2StreamConfigurationMap;
    private final org.bouncycastle.math.ec.ECPoint getHighResolutionOutputSizeshNQ4ISI;

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode() + (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 37);
    }

    public org.bouncycastle.math.ec.ECPoint getY() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.math.ec.ECPoint getX() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean equals(org.bouncycastle.crypto.ec.ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.crypto.ec.ECPair) {
            return equals((org.bouncycastle.crypto.ec.ECPair) obj);
        }
        return false;
    }

    public ECPair(org.bouncycastle.math.ec.ECPoint eCPoint, org.bouncycastle.math.ec.ECPoint eCPoint2) {
        this.Camera2StreamConfigurationMap = eCPoint;
        this.getHighResolutionOutputSizeshNQ4ISI = eCPoint2;
    }
}
