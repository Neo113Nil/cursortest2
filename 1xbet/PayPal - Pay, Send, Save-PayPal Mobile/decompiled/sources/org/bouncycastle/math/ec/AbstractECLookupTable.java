package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public abstract class AbstractECLookupTable implements org.bouncycastle.math.ec.ECLookupTable {
    @Override // org.bouncycastle.math.ec.ECLookupTable
    public org.bouncycastle.math.ec.ECPoint lookupVar(int i) {
        return lookup(i);
    }
}
