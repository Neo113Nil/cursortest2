package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class X9IntegerConverter {
    public byte[] integerToBytes(java.math.BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        }
        if (i <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
        return bArr2;
    }

    public int getByteLength(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        return (eCFieldElement.getFieldSize() + 7) / 8;
    }

    public int getByteLength(org.bouncycastle.math.ec.ECCurve eCCurve) {
        return (eCCurve.getFieldSize() + 7) / 8;
    }
}
