package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class CipherFactory {
    private static final short[] getHighResolutionOutputSizeshNQ4ISI = {93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, com.visa.cbp.setDeviceName._CREATION, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, com.visa.cbp.setDeviceName.coroutineBoundary, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, com.visa.cbp.setDeviceName.unwrapAs, 64, 140, 226, 203, com.visa.cbp.setDeviceName.isOutputSupportedFor, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 0, 200, 127, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 69, 170, 43, 194, 177, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 213, 186, 242, 173, 25, com.visa.cbp.getEncExpo.invoke, 103, 54, 247, 15, 10, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, 125, 227, 157, 233, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

    public static java.lang.Object createContentCipher(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.modes.AEADBlockCipher highSpeedVideoFpsRangesFor;
        org.bouncycastle.crypto.params.AEADParameters aEADParameters;
        org.bouncycastle.crypto.modes.CBCBlockCipher cBCBlockCipher;
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rc4)) {
            org.bouncycastle.crypto.engines.RC4Engine rC4Engine = new org.bouncycastle.crypto.engines.RC4Engine();
            rC4Engine.init(z, cipherParameters);
            return rC4Engine;
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM)) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm());
            org.bouncycastle.internal.asn1.cms.GCMParameters gCMParameters = org.bouncycastle.internal.asn1.cms.GCMParameters.getInstance(algorithmIdentifier.getParameters());
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
                throw new java.lang.IllegalArgumentException("key data must be accessible for GCM operation");
            }
            aEADParameters = new org.bouncycastle.crypto.params.AEADParameters((org.bouncycastle.crypto.params.KeyParameter) cipherParameters, gCMParameters.getIcvLen() * 8, gCMParameters.getNonce());
        } else {
            if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM)) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = algorithmIdentifier.getAlgorithm();
                if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2)) {
                    cBCBlockCipher = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.AESEngine());
                } else if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2)) {
                    cBCBlockCipher = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine());
                } else if (org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2)) {
                    cBCBlockCipher = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine());
                } else if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2)) {
                    cBCBlockCipher = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine());
                } else {
                    if (!org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cast5CBC.equals((org.bouncycastle.asn1.ASN1Primitive) algorithm2)) {
                        throw new java.lang.IllegalArgumentException("cannot recognise cipher: ".concat(java.lang.String.valueOf(algorithm2)));
                    }
                    cBCBlockCipher = new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.CAST5Engine());
                }
                org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher paddedBufferedBlockCipher = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(cBCBlockCipher, new org.bouncycastle.crypto.paddings.PKCS7Padding());
                org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = algorithmIdentifier.getParameters().toASN1Primitive();
                if (aSN1Primitive == null || (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Null)) {
                    if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.getHighSpeedVideoFpsRangesFor) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.getHighSpeedVideoSizes)) {
                        paddedBufferedBlockCipher.init(z, new org.bouncycastle.crypto.params.ParametersWithIV(cipherParameters, new byte[8]));
                        return paddedBufferedBlockCipher;
                    }
                    paddedBufferedBlockCipher.init(z, cipherParameters);
                    return paddedBufferedBlockCipher;
                }
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.getHighSpeedVideoFpsRangesFor) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC)) {
                    paddedBufferedBlockCipher.init(z, new org.bouncycastle.crypto.params.ParametersWithIV(cipherParameters, org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Primitive).getOctets()));
                    return paddedBufferedBlockCipher;
                }
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.getHighSpeedVideoSizes)) {
                    paddedBufferedBlockCipher.init(z, new org.bouncycastle.crypto.params.ParametersWithIV(cipherParameters, org.bouncycastle.asn1.misc.CAST5CBCParameters.getInstance(aSN1Primitive).getIV()));
                    return paddedBufferedBlockCipher;
                }
                if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC)) {
                    throw new java.lang.IllegalArgumentException("cannot match parameters");
                }
                org.bouncycastle.asn1.pkcs.RC2CBCParameter rC2CBCParameter = org.bouncycastle.asn1.pkcs.RC2CBCParameter.getInstance(aSN1Primitive);
                paddedBufferedBlockCipher.init(z, new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.RC2Parameters(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey(), getHighResolutionOutputSizeshNQ4ISI[rC2CBCParameter.getRC2ParameterVersion().intValue()]), rC2CBCParameter.getIV()));
                return paddedBufferedBlockCipher;
            }
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm());
            org.bouncycastle.internal.asn1.cms.CCMParameters cCMParameters = org.bouncycastle.internal.asn1.cms.CCMParameters.getInstance(algorithmIdentifier.getParameters());
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
                throw new java.lang.IllegalArgumentException("key data must be accessible for GCM operation");
            }
            aEADParameters = new org.bouncycastle.crypto.params.AEADParameters((org.bouncycastle.crypto.params.KeyParameter) cipherParameters, cCMParameters.getIcvLen() * 8, cCMParameters.getNonce());
        }
        highSpeedVideoFpsRangesFor.init(z, aEADParameters);
        return highSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.crypto.io.CipherOutputStream createOutputStream(java.io.OutputStream outputStream, java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.crypto.BufferedBlockCipher) {
            return new org.bouncycastle.crypto.io.CipherOutputStream(outputStream, (org.bouncycastle.crypto.BufferedBlockCipher) obj);
        }
        if (obj instanceof org.bouncycastle.crypto.StreamCipher) {
            return new org.bouncycastle.crypto.io.CipherOutputStream(outputStream, (org.bouncycastle.crypto.StreamCipher) obj);
        }
        if (obj instanceof org.bouncycastle.crypto.modes.AEADBlockCipher) {
            return new org.bouncycastle.crypto.io.CipherOutputStream(outputStream, (org.bouncycastle.crypto.modes.AEADBlockCipher) obj);
        }
        throw new java.lang.IllegalArgumentException("unknown cipher object: ".concat(java.lang.String.valueOf(obj)));
    }

    private static org.bouncycastle.crypto.modes.AEADBlockCipher getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.AESEngine());
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.crypto.modes.CCMBlockCipher(new org.bouncycastle.crypto.engines.AESEngine());
        }
        throw new java.lang.IllegalArgumentException("cannot recognise cipher: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }
}
