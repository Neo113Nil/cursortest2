package org.bouncycastle.pqc.crypto.util;

/* loaded from: classes17.dex */
public class PrivateKeyFactory {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(byte[] bArr) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.on(org.bouncycastle.asn1.bc.BCObjectIdentifiers.qTESLA)) {
            return new org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters(org.bouncycastle.pqc.crypto.util.Utils.Camera2StreamConfigurationMap(privateKeyInfo.getPrivateKeyAlgorithm()), org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.bc.BCObjectIdentifiers.sphincs256)) {
            return new org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters(org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets(), org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.asn1.SPHINCS256KeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters())));
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.bc.BCObjectIdentifiers.newHope)) {
            return new org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters(getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets()));
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig)) {
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            org.bouncycastle.asn1.ASN1BitString publicKeyData = privateKeyInfo.getPublicKeyData();
            if (org.bouncycastle.util.Pack.bigEndianToInt(octets, 0) == 1) {
                if (publicKeyData == null) {
                    return org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.getInstance(org.bouncycastle.util.Arrays.copyOfRange(octets, 4, octets.length));
                }
                byte[] octets2 = publicKeyData.getOctets();
                return org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.getInstance(org.bouncycastle.util.Arrays.copyOfRange(octets, 4, octets.length), org.bouncycastle.util.Arrays.copyOfRange(octets2, 4, octets2.length));
            }
            if (publicKeyData == null) {
                return org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters.getInstance(org.bouncycastle.util.Arrays.copyOfRange(octets, 4, octets.length));
            }
            return org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters.getInstance(org.bouncycastle.util.Arrays.copyOfRange(octets, 4, octets.length), publicKeyData.getOctets());
        }
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.bc.BCObjectIdentifiers.xmss)) {
            org.bouncycastle.pqc.asn1.XMSSKeyParams xMSSKeyParams = org.bouncycastle.pqc.asn1.XMSSKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = xMSSKeyParams.getTreeDigest().getAlgorithm();
            org.bouncycastle.pqc.asn1.XMSSPrivateKey xMSSPrivateKey = org.bouncycastle.pqc.asn1.XMSSPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            try {
                org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder withRoot = new org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters.Builder(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(xMSSKeyParams.getHeight(), org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRanges(algorithm2))).withIndex(xMSSPrivateKey.getIndex()).withSecretKeySeed(xMSSPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSPrivateKey.getPublicSeed()).withRoot(xMSSPrivateKey.getRoot());
                if (xMSSPrivateKey.getVersion() != 0) {
                    withRoot.withMaxIndex(xMSSPrivateKey.getMaxIndex());
                }
                if (xMSSPrivateKey.getBdsState() != null) {
                    withRoot.withBDSState(((org.bouncycastle.pqc.crypto.xmss.BDS) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.deserialize(xMSSPrivateKey.getBdsState(), org.bouncycastle.pqc.crypto.xmss.BDS.class)).withWOTSDigest(algorithm2));
                }
                return withRoot.build();
            } catch (java.lang.ClassNotFoundException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassNotFoundException processing BDS state: ");
                sb.append(e.getMessage());
                throw new java.io.IOException(sb.toString());
            }
        }
        if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss_mt)) {
            if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2)) {
                throw new java.lang.RuntimeException("algorithm identifier in private key not recognised");
            }
            org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey mcElieceCCA2PrivateKey = org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters(mcElieceCCA2PrivateKey.getN(), mcElieceCCA2PrivateKey.getK(), mcElieceCCA2PrivateKey.getField(), mcElieceCCA2PrivateKey.getGoppaPoly(), mcElieceCCA2PrivateKey.getP(), org.bouncycastle.pqc.crypto.util.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PrivateKey.getDigest().getAlgorithm()));
        }
        org.bouncycastle.pqc.asn1.XMSSMTKeyParams xMSSMTKeyParams = org.bouncycastle.pqc.asn1.XMSSMTKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm3 = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
        try {
            org.bouncycastle.pqc.asn1.XMSSMTPrivateKey xMSSMTPrivateKey = org.bouncycastle.pqc.asn1.XMSSMTPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder withRoot2 = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters.Builder(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRanges(algorithm3))).withIndex(xMSSMTPrivateKey.getIndex()).withSecretKeySeed(xMSSMTPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKey.getPublicSeed()).withRoot(xMSSMTPrivateKey.getRoot());
            if (xMSSMTPrivateKey.getVersion() != 0) {
                withRoot2.withMaxIndex(xMSSMTPrivateKey.getMaxIndex());
            }
            if (xMSSMTPrivateKey.getBdsState() != null) {
                withRoot2.withBDSState(((org.bouncycastle.pqc.crypto.xmss.BDSStateMap) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.deserialize(xMSSMTPrivateKey.getBdsState(), org.bouncycastle.pqc.crypto.xmss.BDSStateMap.class)).withWOTSDigest(algorithm3));
            }
            return withRoot2.build();
        } catch (java.lang.ClassNotFoundException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ClassNotFoundException processing BDS state: ");
            sb2.append(e2.getMessage());
            throw new java.io.IOException(sb2.toString());
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(java.io.InputStream inputStream) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject()));
    }

    private static short[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = org.bouncycastle.util.Pack.littleEndianToShort(bArr, i * 2);
        }
        return sArr;
    }
}
