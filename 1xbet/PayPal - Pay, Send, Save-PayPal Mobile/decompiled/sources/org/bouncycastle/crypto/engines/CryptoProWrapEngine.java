package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class CryptoProWrapEngine extends org.bouncycastle.crypto.engines.GOST28147WrapEngine {
    private static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int littleEndianToInt = org.bouncycastle.util.Pack.littleEndianToInt(bArr, i4 * 4);
                if (((1 << i4) & bArr2[i]) != 0) {
                    i2 += littleEndianToInt;
                } else {
                    i3 += littleEndianToInt;
                }
            }
            byte[] bArr4 = new byte[8];
            org.bouncycastle.util.Pack.intToLittleEndian(i2, bArr4, 0);
            org.bouncycastle.util.Pack.intToLittleEndian(i3, bArr4, 4);
            org.bouncycastle.crypto.modes.GCFBBlockCipher gCFBBlockCipher = new org.bouncycastle.crypto.modes.GCFBBlockCipher(new org.bouncycastle.crypto.engines.GOST28147Engine());
            gCFBBlockCipher.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.ParametersWithSBox(new org.bouncycastle.crypto.params.KeyParameter(bArr), bArr3), bArr4));
            gCFBBlockCipher.processBlock(bArr, 0, bArr, 0);
            gCFBBlockCipher.processBlock(bArr, 8, bArr, 8);
            gCFBBlockCipher.processBlock(bArr, 16, bArr, 16);
            gCFBBlockCipher.processBlock(bArr, 24, bArr, 24);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.engines.GOST28147WrapEngine, org.bouncycastle.crypto.Wrapper
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        byte[] bArr;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters();
        }
        org.bouncycastle.crypto.params.ParametersWithUKM parametersWithUKM = (org.bouncycastle.crypto.params.ParametersWithUKM) cipherParameters;
        if (parametersWithUKM.getParameters() instanceof org.bouncycastle.crypto.params.ParametersWithSBox) {
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithSBox) parametersWithUKM.getParameters()).getParameters();
            bArr = ((org.bouncycastle.crypto.params.ParametersWithSBox) parametersWithUKM.getParameters()).getSBox();
        } else {
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithUKM.getParameters();
            bArr = null;
        }
        org.bouncycastle.crypto.params.KeyParameter keyParameter2 = new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoSizes(keyParameter.getKey(), parametersWithUKM.getUKM(), bArr));
        super.init(z, bArr != null ? new org.bouncycastle.crypto.params.ParametersWithUKM(new org.bouncycastle.crypto.params.ParametersWithSBox(keyParameter2, bArr), parametersWithUKM.getUKM()) : new org.bouncycastle.crypto.params.ParametersWithUKM(keyParameter2, parametersWithUKM.getUKM()));
    }
}
