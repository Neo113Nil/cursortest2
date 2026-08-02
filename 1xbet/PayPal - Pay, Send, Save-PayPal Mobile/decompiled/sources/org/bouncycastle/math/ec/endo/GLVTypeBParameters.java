package org.bouncycastle.math.ec.endo;

/* loaded from: classes17.dex */
public class GLVTypeBParameters {
    protected final java.math.BigInteger beta;
    protected final java.math.BigInteger lambda;
    protected final org.bouncycastle.math.ec.endo.ScalarSplitParameters splitParams;

    public org.bouncycastle.math.ec.endo.ScalarSplitParameters getSplitParams() {
        return this.splitParams;
    }

    public java.math.BigInteger getLambda() {
        return this.lambda;
    }

    public java.math.BigInteger getBeta() {
        return this.beta;
    }

    public GLVTypeBParameters(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.math.ec.endo.ScalarSplitParameters scalarSplitParameters) {
        this.beta = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = scalarSplitParameters;
    }
}
