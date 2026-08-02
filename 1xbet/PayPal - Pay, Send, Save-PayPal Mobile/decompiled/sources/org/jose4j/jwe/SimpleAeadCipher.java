package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class SimpleAeadCipher {
    public static final java.lang.String GCM_TRANSFORMATION_NAME = "AES/GCM/NoPadding";
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public SimpleAeadCipher(java.lang.String str, int i) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public javax.crypto.Cipher getInitialisedCipher(java.security.Key key, byte[] bArr, int i, java.lang.String str) throws org.jose4j.lang.JoseException {
        javax.crypto.Cipher highResolutionOutputSizeshNQ4ISI = org.jose4j.jwe.CipherUtil.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, str);
        try {
            highResolutionOutputSizeshNQ4ISI.init(i, key, new javax.crypto.spec.GCMParameterSpec(org.jose4j.lang.ByteUtil.bitLength(this.getHighResolutionOutputSizeshNQ4ISI), bArr));
            return highResolutionOutputSizeshNQ4ISI;
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new org.jose4j.lang.JoseException(e.toString(), e);
        } catch (java.security.InvalidKeyException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key for ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new org.jose4j.lang.JoseException(sb.toString(), e2);
        }
    }

    public org.jose4j.jwe.SimpleAeadCipher.CipherOutput encrypt(java.security.Key key, byte[] bArr, byte[] bArr2, byte[] bArr3, java.lang.String str) throws org.jose4j.lang.JoseException {
        javax.crypto.Cipher initialisedCipher = getInitialisedCipher(key, bArr, 1, str);
        if (bArr3 != null && bArr3.length > 0) {
            initialisedCipher.updateAAD(bArr3);
        }
        try {
            byte[] doFinal = initialisedCipher.doFinal(bArr2);
            org.jose4j.jwe.SimpleAeadCipher.CipherOutput cipherOutput = new org.jose4j.jwe.SimpleAeadCipher.CipherOutput();
            int length = doFinal.length - this.getHighResolutionOutputSizeshNQ4ISI;
            cipherOutput.getHighResolutionOutputSizeshNQ4ISI = org.jose4j.lang.ByteUtil.subArray(doFinal, 0, length);
            cipherOutput.getHighSpeedVideoFpsRanges = org.jose4j.lang.ByteUtil.subArray(doFinal, length, this.getHighResolutionOutputSizeshNQ4ISI);
            return cipherOutput;
        } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
            throw new org.jose4j.lang.JoseException(e.toString(), e);
        }
    }

    public byte[] decrypt(java.security.Key key, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.String str) throws org.jose4j.lang.JoseException {
        return decrypt(bArr2, bArr3, bArr4, getInitialisedCipher(key, bArr, 2, str));
    }

    public boolean isAvailable(org.slf4j.Logger logger, int i, int i2, java.lang.String str) {
        if (!org.jose4j.jwe.CipherStrengthSupport.isAvailable(this.getHighSpeedVideoFpsRangesFor, i)) {
            return false;
        }
        byte[] bArr = {com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 108, 97, 105, 110, 116, 101, 120, 116};
        byte[] bArr2 = {97, 97, 100};
        byte[] randomBytes = org.jose4j.lang.ByteUtil.randomBytes(i);
        try {
            encrypt(new org.jose4j.keys.AesKey(randomBytes), org.jose4j.lang.ByteUtil.randomBytes(i2), bArr, bArr2, null);
            return true;
        } catch (java.lang.Throwable th) {
            logger.debug("{} is not available ({}).", str, org.jose4j.lang.ExceptionHelp.toStringWithCauses(th));
            return false;
        }
    }

    public static class CipherOutput {
        private byte[] getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoFpsRanges;

        public byte[] getCiphertext() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public byte[] getTag() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, javax.crypto.Cipher cipher) throws org.jose4j.lang.JoseException {
        if (bArr3 != null && bArr3.length > 0) {
            cipher.updateAAD(bArr3);
        }
        try {
            return cipher.doFinal(org.jose4j.lang.ByteUtil.concat(bArr, bArr2));
        } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
            throw new org.jose4j.lang.JoseException(e.toString(), e);
        }
    }
}
