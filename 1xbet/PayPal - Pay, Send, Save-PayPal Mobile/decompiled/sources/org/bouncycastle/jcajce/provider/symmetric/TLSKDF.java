package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class TLSKDF {

    public static class TLS12 extends org.bouncycastle.jcajce.provider.symmetric.TLSKDF.TLSKeyMaterialFactory {
        private final org.bouncycastle.crypto.Mac getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (!(keySpec instanceof org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec tLSKeyMaterialSpec = (org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec) keySpec;
            org.bouncycastle.crypto.Mac mac = this.getHighSpeedVideoSizes;
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toByteArray(tLSKeyMaterialSpec.getLabel()), tLSKeyMaterialSpec.getSeed());
            byte[] secret = tLSKeyMaterialSpec.getSecret();
            byte[] bArr = new byte[tLSKeyMaterialSpec.getLength()];
            org.bouncycastle.jcajce.provider.symmetric.TLSKDF.getHighResolutionOutputSizeshNQ4ISI(mac, secret, concatenate, bArr);
            return new javax.crypto.spec.SecretKeySpec(bArr, this.algName);
        }

        protected TLS12(java.lang.String str, org.bouncycastle.crypto.Mac mac) {
            super(str);
            this.getHighSpeedVideoSizes = mac;
        }
    }

    static /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec tLSKeyMaterialSpec) {
        org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(org.bouncycastle.crypto.util.DigestFactory.createMD5());
        org.bouncycastle.crypto.macs.HMac hMac2 = new org.bouncycastle.crypto.macs.HMac(org.bouncycastle.crypto.util.DigestFactory.createSHA1());
        byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.util.Strings.toByteArray(tLSKeyMaterialSpec.getLabel()), tLSKeyMaterialSpec.getSeed());
        byte[] secret = tLSKeyMaterialSpec.getSecret();
        int length = (secret.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(secret, 0, bArr, 0, length);
        java.lang.System.arraycopy(secret, secret.length - length, bArr2, 0, length);
        int length2 = tLSKeyMaterialSpec.getLength();
        byte[] bArr3 = new byte[length2];
        byte[] bArr4 = new byte[length2];
        getHighResolutionOutputSizeshNQ4ISI(hMac, bArr, concatenate, bArr3);
        getHighResolutionOutputSizeshNQ4ISI(hMac2, bArr2, concatenate, bArr4);
        for (int i = 0; i < length2; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr4[i]);
        }
        return bArr3;
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$TLS10");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS10KDF", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$TLS11");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS11KDF", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$TLS12withSHA256");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA256KDF", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$TLS12withSHA384");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA384KDF", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$TLS12withSHA512");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA512KDF", sb5.toString());
        }
    }

    public static final class TLS10 extends org.bouncycastle.jcajce.provider.symmetric.TLSKDF.TLSKeyMaterialFactory {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public final javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (keySpec instanceof org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec) {
                return new javax.crypto.spec.SecretKeySpec(org.bouncycastle.jcajce.provider.symmetric.TLSKDF.getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec) keySpec), this.algName);
            }
            throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
        }

        public TLS10() {
            super("TLS10KDF");
        }
    }

    public static final class TLS11 extends org.bouncycastle.jcajce.provider.symmetric.TLSKDF.TLSKeyMaterialFactory {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public final javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (keySpec instanceof org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec) {
                return new javax.crypto.spec.SecretKeySpec(org.bouncycastle.jcajce.provider.symmetric.TLSKDF.getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.jcajce.spec.TLSKeyMaterialSpec) keySpec), this.algName);
            }
            throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
        }

        public TLS11() {
            super("TLS11KDF");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.Mac mac, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mac.init(new org.bouncycastle.crypto.params.KeyParameter(bArr));
        int macSize = mac.getMacSize();
        int length = ((bArr3.length + macSize) - 1) / macSize;
        int macSize2 = mac.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[mac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            mac.update(bArr6, 0, bArr6.length);
            mac.doFinal(bArr4, 0);
            mac.update(bArr4, 0, macSize2);
            mac.update(bArr2, 0, bArr2.length);
            mac.doFinal(bArr5, 0);
            int i2 = macSize * i;
            java.lang.System.arraycopy(bArr5, 0, bArr3, i2, java.lang.Math.min(macSize, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }

    public static final class TLS12withSHA256 extends org.bouncycastle.jcajce.provider.symmetric.TLSKDF.TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA256Digest()));
        }
    }

    public static final class TLS12withSHA384 extends org.bouncycastle.jcajce.provider.symmetric.TLSKDF.TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA384Digest()));
        }
    }

    public static final class TLS12withSHA512 extends org.bouncycastle.jcajce.provider.symmetric.TLSKDF.TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA512Digest()));
        }
    }

    public static class TLSKeyMaterialFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        protected TLSKeyMaterialFactory(java.lang.String str) {
            super(str, null);
        }
    }
}
