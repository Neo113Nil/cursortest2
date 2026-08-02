package org.bouncycastle.pqc.crypto.util;

/* loaded from: classes17.dex */
public class PrivateKeyInfoFactory {
    private static org.bouncycastle.pqc.asn1.XMSSMTPrivateKey getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters) throws java.io.IOException {
        byte[] encoded = xMSSMTPrivateKeyParameters.getEncoded();
        int treeDigestSize = xMSSMTPrivateKeyParameters.getParameters().getTreeDigestSize();
        int height = xMSSMTPrivateKeyParameters.getParameters().getHeight();
        int i = (height + 7) / 8;
        long bytesToXBigEndian = (int) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.bytesToXBigEndian(encoded, 0, i);
        if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(height, bytesToXBigEndian)) {
            throw new java.lang.IllegalArgumentException("index out of bounds");
        }
        byte[] extractBytesAtOffset = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i, treeDigestSize);
        int i2 = i + treeDigestSize;
        byte[] extractBytesAtOffset2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i2, treeDigestSize);
        int i3 = i2 + treeDigestSize;
        byte[] extractBytesAtOffset3 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i3, treeDigestSize);
        int i4 = i3 + treeDigestSize;
        byte[] extractBytesAtOffset4 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i4, treeDigestSize);
        int i5 = i4 + treeDigestSize;
        byte[] extractBytesAtOffset5 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i5, encoded.length - i5);
        try {
            org.bouncycastle.pqc.crypto.xmss.BDSStateMap bDSStateMap = (org.bouncycastle.pqc.crypto.xmss.BDSStateMap) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.deserialize(extractBytesAtOffset5, org.bouncycastle.pqc.crypto.xmss.BDSStateMap.class);
            return bDSStateMap.getMaxIndex() != (1 << height) - 1 ? new org.bouncycastle.pqc.asn1.XMSSMTPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5, bDSStateMap.getMaxIndex()) : new org.bouncycastle.pqc.asn1.XMSSMTPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5);
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot parse BDSStateMap: ");
            sb.append(e.getMessage());
            throw new java.io.IOException(sb.toString());
        }
    }

    private static org.bouncycastle.pqc.asn1.XMSSPrivateKey getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters) throws java.io.IOException {
        byte[] encoded = xMSSPrivateKeyParameters.getEncoded();
        int treeDigestSize = xMSSPrivateKeyParameters.getParameters().getTreeDigestSize();
        int height = xMSSPrivateKeyParameters.getParameters().getHeight();
        int bytesToXBigEndian = (int) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.bytesToXBigEndian(encoded, 0, 4);
        if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(height, bytesToXBigEndian)) {
            throw new java.lang.IllegalArgumentException("index out of bounds");
        }
        byte[] extractBytesAtOffset = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, 4, treeDigestSize);
        int i = treeDigestSize + 4;
        byte[] extractBytesAtOffset2 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i, treeDigestSize);
        int i2 = i + treeDigestSize;
        byte[] extractBytesAtOffset3 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i2, treeDigestSize);
        int i3 = i2 + treeDigestSize;
        byte[] extractBytesAtOffset4 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i3, treeDigestSize);
        int i4 = i3 + treeDigestSize;
        byte[] extractBytesAtOffset5 = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.extractBytesAtOffset(encoded, i4, encoded.length - i4);
        try {
            org.bouncycastle.pqc.crypto.xmss.BDS bds = (org.bouncycastle.pqc.crypto.xmss.BDS) org.bouncycastle.pqc.crypto.xmss.XMSSUtil.deserialize(extractBytesAtOffset5, org.bouncycastle.pqc.crypto.xmss.BDS.class);
            return bds.getMaxIndex() != (1 << height) - 1 ? new org.bouncycastle.pqc.asn1.XMSSPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5, bds.getMaxIndex()) : new org.bouncycastle.pqc.asn1.XMSSPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5);
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot parse BDS: ");
            sb.append(e.getMessage());
            throw new java.io.IOException(sb.toString());
        }
    }

    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo createPrivateKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.asn1.ASN1Set aSN1Set) throws java.io.IOException {
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) {
            org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters qTESLAPrivateKeyParameters = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(org.bouncycastle.pqc.crypto.util.Utils.getHighResolutionOutputSizeshNQ4ISI(qTESLAPrivateKeyParameters.getSecurityCategory()), new org.bouncycastle.asn1.DEROctetString(qTESLAPrivateKeyParameters.getSecret()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters) {
            org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, new org.bouncycastle.pqc.asn1.SPHINCS256KeyParams(org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRanges(sPHINCSPrivateKeyParameters.getTreeDigest()))), new org.bouncycastle.asn1.DEROctetString(sPHINCSPrivateKeyParameters.getKeyData()));
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters) {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.newHope);
            short[] secData = ((org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters) asymmetricKeyParameter).getSecData();
            byte[] bArr = new byte[secData.length * 2];
            for (int i = 0; i != secData.length; i++) {
                org.bouncycastle.util.Pack.shortToLittleEndian(secData[i], bArr, i * 2);
            }
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(algorithmIdentifier, new org.bouncycastle.asn1.DEROctetString(bArr));
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) {
            org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) asymmetricKeyParameter;
            byte[] build = org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(1).bytes(lMSPrivateKeyParameters).build();
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new org.bouncycastle.asn1.DEROctetString(build), aSN1Set, org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(1).bytes(lMSPrivateKeyParameters.getPublicKey()).build());
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) {
            org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) asymmetricKeyParameter;
            byte[] build2 = org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes(hSSPrivateKeyParameters).build();
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new org.bouncycastle.asn1.DEROctetString(build2), aSN1Set, org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes(hSSPrivateKeyParameters.getPublicKey().getLMSPublicKey()).build());
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) {
            org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss, new org.bouncycastle.pqc.asn1.XMSSKeyParams(xMSSPrivateKeyParameters.getParameters().getHeight(), org.bouncycastle.pqc.crypto.util.Utils.getHighResolutionOutputSizeshNQ4ISI(xMSSPrivateKeyParameters.getTreeDigest()))), getHighResolutionOutputSizeshNQ4ISI(xMSSPrivateKeyParameters), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) {
            org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss_mt, new org.bouncycastle.pqc.asn1.XMSSMTKeyParams(xMSSMTPrivateKeyParameters.getParameters().getHeight(), xMSSMTPrivateKeyParameters.getParameters().getLayers(), org.bouncycastle.pqc.crypto.util.Utils.getHighResolutionOutputSizeshNQ4ISI(xMSSMTPrivateKeyParameters.getTreeDigest()))), getHighSpeedVideoFpsRangesFor(xMSSMTPrivateKeyParameters), aSN1Set);
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters)) {
            throw new java.io.IOException("key parameters not recognized");
        }
        org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters) asymmetricKeyParameter;
        return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2), new org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey(mcElieceCCA2PrivateKeyParameters.getN(), mcElieceCCA2PrivateKeyParameters.getK(), mcElieceCCA2PrivateKeyParameters.getField(), mcElieceCCA2PrivateKeyParameters.getGoppaPoly(), mcElieceCCA2PrivateKeyParameters.getP(), org.bouncycastle.pqc.crypto.util.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PrivateKeyParameters.getDigest())));
    }

    public static org.bouncycastle.asn1.pkcs.PrivateKeyInfo createPrivateKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        return createPrivateKeyInfo(asymmetricKeyParameter, null);
    }

    private PrivateKeyInfoFactory() {
    }
}
