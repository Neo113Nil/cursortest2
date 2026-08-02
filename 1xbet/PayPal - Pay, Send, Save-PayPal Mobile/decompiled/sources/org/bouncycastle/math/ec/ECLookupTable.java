package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public interface ECLookupTable {
    int getSize();

    org.bouncycastle.math.ec.ECPoint lookup(int i);

    org.bouncycastle.math.ec.ECPoint lookupVar(int i);
}
