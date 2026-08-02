package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class TestRandomBigInteger extends org.bouncycastle.util.test.FixedSecureRandom {
    public TestRandomBigInteger(byte[] bArr) {
        super(new org.bouncycastle.util.test.FixedSecureRandom.Source[]{new org.bouncycastle.util.test.FixedSecureRandom.BigInteger(bArr)});
    }

    public TestRandomBigInteger(java.lang.String str, int i) {
        super(new org.bouncycastle.util.test.FixedSecureRandom.Source[]{new org.bouncycastle.util.test.FixedSecureRandom.BigInteger(org.bouncycastle.util.BigIntegers.asUnsignedByteArray(new java.math.BigInteger(str, i)))});
    }

    public TestRandomBigInteger(java.lang.String str) {
        this(str, 10);
    }

    public TestRandomBigInteger(int i, byte[] bArr) {
        super(new org.bouncycastle.util.test.FixedSecureRandom.Source[]{new org.bouncycastle.util.test.FixedSecureRandom.BigInteger(i, bArr)});
    }
}
