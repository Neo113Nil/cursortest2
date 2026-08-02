package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public abstract class X9ECParametersHolder {
    private org.bouncycastle.asn1.x9.X9ECParameters getHighSpeedVideoFpsRangesFor;

    protected abstract org.bouncycastle.asn1.x9.X9ECParameters createParameters();

    public org.bouncycastle.asn1.x9.X9ECParameters getParameters() {
        org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters;
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = createParameters();
            }
            x9ECParameters = this.getHighSpeedVideoFpsRangesFor;
        }
        return x9ECParameters;
    }
}
