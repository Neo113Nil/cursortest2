package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class PEMEncryptedKeyPair {
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.openssl.PEMKeyPairParser getHighSpeedVideoFpsRangesFor;

    public java.lang.String getDekAlgName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.openssl.PEMKeyPair decryptKeyPair(org.bouncycastle.openssl.PEMDecryptorProvider pEMDecryptorProvider) throws java.io.IOException {
        try {
            return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(pEMDecryptorProvider.get(this.getHighSpeedVideoFpsRanges).decrypt(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
        } catch (java.io.IOException e) {
            throw e;
        } catch (org.bouncycastle.operator.OperatorCreationException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create extraction operator: ");
            sb.append(e2.getMessage());
            throw new org.bouncycastle.openssl.PEMException(sb.toString(), e2);
        } catch (java.lang.Exception e3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("exception processing key pair: ");
            sb2.append(e3.getMessage());
            throw new org.bouncycastle.openssl.PEMException(sb2.toString(), e3);
        }
    }

    PEMEncryptedKeyPair(java.lang.String str, byte[] bArr, byte[] bArr2, org.bouncycastle.openssl.PEMKeyPairParser pEMKeyPairParser) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        this.getHighSpeedVideoFpsRangesFor = pEMKeyPairParser;
    }
}
