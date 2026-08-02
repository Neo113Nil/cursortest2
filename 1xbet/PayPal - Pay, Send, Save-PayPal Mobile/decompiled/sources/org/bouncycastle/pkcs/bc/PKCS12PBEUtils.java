package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
class PKCS12PBEUtils {
    private static java.util.Map Camera2StreamConfigurationMap = new java.util.HashMap();
    private static java.util.Set getHighSpeedVideoFpsRanges = new java.util.HashSet();
    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();

    static org.bouncycastle.crypto.CipherParameters getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.ExtendedDigest extendedDigest, int i, org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams, char[] cArr) {
        org.bouncycastle.crypto.generators.PKCS12ParametersGenerator pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(extendedDigest);
        pKCS12ParametersGenerator.init(org.bouncycastle.crypto.generators.PKCS12ParametersGenerator.PKCS12PasswordToBytes(cArr), pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        if (getHighSpeedVideoFpsRanges.contains(aSN1ObjectIdentifier)) {
            return pKCS12ParametersGenerator.generateDerivedParameters(((java.lang.Integer) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier)).intValue());
        }
        org.bouncycastle.crypto.CipherParameters generateDerivedParameters = pKCS12ParametersGenerator.generateDerivedParameters(((java.lang.Integer) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier)).intValue(), i * 8);
        if (getHighResolutionOutputSizeshNQ4ISI.contains(aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.params.DESedeParameters.setOddParity(((org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
        }
        return generateDerivedParameters;
    }

    static org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.crypto.BlockCipher dESedeEngine;
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC)) {
            dESedeEngine = new org.bouncycastle.crypto.engines.DESedeEngine();
        } else {
            if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC) && !aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC)) {
                throw new java.lang.IllegalStateException("unknown algorithm");
            }
            dESedeEngine = new org.bouncycastle.crypto.engines.RC2Engine();
        }
        return new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(dESedeEngine), new org.bouncycastle.crypto.paddings.PKCS7Padding());
    }

    static org.bouncycastle.operator.MacCalculator getHighSpeedVideoFpsRanges(final org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.ExtendedDigest extendedDigest, final org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams, final char[] cArr) {
        org.bouncycastle.crypto.generators.PKCS12ParametersGenerator pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(extendedDigest);
        pKCS12ParametersGenerator.init(org.bouncycastle.crypto.generators.PKCS12ParametersGenerator.PKCS12PasswordToBytes(cArr), pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        org.bouncycastle.crypto.params.KeyParameter keyParameter = (org.bouncycastle.crypto.params.KeyParameter) pKCS12ParametersGenerator.generateDerivedMacParameters(extendedDigest.getDigestSize() * 8);
        final org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(extendedDigest);
        hMac.init(keyParameter);
        return new org.bouncycastle.operator.MacCalculator() { // from class: org.bouncycastle.pkcs.bc.PKCS12PBEUtils.1
            @Override // org.bouncycastle.operator.MacCalculator
            public final java.io.OutputStream getOutputStream() {
                return new org.bouncycastle.crypto.io.MacOutputStream(hMac);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public final byte[] getMac() {
                byte[] bArr = new byte[hMac.getMacSize()];
                hMac.doFinal(bArr, 0);
                return bArr;
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public final org.bouncycastle.operator.GenericKey getKey() {
                return new org.bouncycastle.operator.GenericKey(getAlgorithmIdentifier(), org.bouncycastle.crypto.generators.PKCS12ParametersGenerator.PKCS12PasswordToBytes(cArr));
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public final org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier.this, pKCS12PBEParams);
            }
        };
    }

    PKCS12PBEUtils() {
    }

    static {
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, org.bouncycastle.util.Integers.valueOf(128));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, org.bouncycastle.util.Integers.valueOf(40));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, org.bouncycastle.util.Integers.valueOf(192));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, org.bouncycastle.util.Integers.valueOf(128));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, org.bouncycastle.util.Integers.valueOf(128));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, org.bouncycastle.util.Integers.valueOf(40));
        getHighSpeedVideoFpsRanges.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4);
        getHighSpeedVideoFpsRanges.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC);
    }
}
