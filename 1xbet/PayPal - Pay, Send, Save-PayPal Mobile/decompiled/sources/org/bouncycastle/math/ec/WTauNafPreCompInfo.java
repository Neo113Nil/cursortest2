package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class WTauNafPreCompInfo implements org.bouncycastle.math.ec.PreCompInfo {
    protected org.bouncycastle.math.ec.ECPoint.AbstractF2m[] preComp = null;

    public void setPreComp(org.bouncycastle.math.ec.ECPoint.AbstractF2m[] abstractF2mArr) {
        this.preComp = abstractF2mArr;
    }

    public org.bouncycastle.math.ec.ECPoint.AbstractF2m[] getPreComp() {
        return this.preComp;
    }
}
