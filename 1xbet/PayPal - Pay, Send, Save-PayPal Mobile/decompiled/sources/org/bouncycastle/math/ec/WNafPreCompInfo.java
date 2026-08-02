package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class WNafPreCompInfo implements org.bouncycastle.math.ec.PreCompInfo {
    volatile int Camera2StreamConfigurationMap = 4;
    protected int confWidth = -1;
    protected org.bouncycastle.math.ec.ECPoint[] preComp = null;
    protected org.bouncycastle.math.ec.ECPoint[] preCompNeg = null;
    protected org.bouncycastle.math.ec.ECPoint twice = null;
    protected int width = -1;

    public void setWidth(int i) {
        this.width = i;
    }

    public void setTwice(org.bouncycastle.math.ec.ECPoint eCPoint) {
        this.twice = eCPoint;
    }

    public void setPreCompNeg(org.bouncycastle.math.ec.ECPoint[] eCPointArr) {
        this.preCompNeg = eCPointArr;
    }

    public void setPreComp(org.bouncycastle.math.ec.ECPoint[] eCPointArr) {
        this.preComp = eCPointArr;
    }

    public void setConfWidth(int i) {
        this.confWidth = i;
    }

    public boolean isPromoted() {
        return this.Camera2StreamConfigurationMap <= 0;
    }

    public int getWidth() {
        return this.width;
    }

    public org.bouncycastle.math.ec.ECPoint getTwice() {
        return this.twice;
    }

    public org.bouncycastle.math.ec.ECPoint[] getPreCompNeg() {
        return this.preCompNeg;
    }

    public org.bouncycastle.math.ec.ECPoint[] getPreComp() {
        return this.preComp;
    }

    public int getConfWidth() {
        return this.confWidth;
    }
}
