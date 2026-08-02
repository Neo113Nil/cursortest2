package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class FixedPointPreCompInfo implements org.bouncycastle.math.ec.PreCompInfo {
    protected org.bouncycastle.math.ec.ECPoint offset = null;
    protected org.bouncycastle.math.ec.ECLookupTable lookupTable = null;
    protected int width = -1;

    public void setWidth(int i) {
        this.width = i;
    }

    public void setOffset(org.bouncycastle.math.ec.ECPoint eCPoint) {
        this.offset = eCPoint;
    }

    public void setLookupTable(org.bouncycastle.math.ec.ECLookupTable eCLookupTable) {
        this.lookupTable = eCLookupTable;
    }

    public int getWidth() {
        return this.width;
    }

    public org.bouncycastle.math.ec.ECPoint getOffset() {
        return this.offset;
    }

    public org.bouncycastle.math.ec.ECLookupTable getLookupTable() {
        return this.lookupTable;
    }
}
