package org.bouncycastle.util.test;

/* loaded from: classes17.dex */
public class TestRandomData extends org.bouncycastle.util.test.FixedSecureRandom {
    public TestRandomData(byte[] bArr) {
        super(new org.bouncycastle.util.test.FixedSecureRandom.Source[]{new org.bouncycastle.util.test.FixedSecureRandom.Data(bArr)});
    }

    public TestRandomData(java.lang.String str) {
        super(new org.bouncycastle.util.test.FixedSecureRandom.Source[]{new org.bouncycastle.util.test.FixedSecureRandom.Data(org.bouncycastle.util.encoders.Hex.decode(str))});
    }
}
