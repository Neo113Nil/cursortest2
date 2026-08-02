package org.bouncycastle.pqc.crypto.util;

/* loaded from: classes17.dex */
public class SubjectPublicKeyInfoFactory {
    public static org.bouncycastle.asn1.x509.SubjectPublicKeyInfo createSubjectPublicKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters) {
            org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters qTESLAPublicKeyParameters = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(org.bouncycastle.pqc.crypto.util.Utils.getHighResolutionOutputSizeshNQ4ISI(qTESLAPublicKeyParameters.getSecurityCategory()), qTESLAPublicKeyParameters.getPublicData());
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters) {
            org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters = (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, new org.bouncycastle.pqc.asn1.SPHINCS256KeyParams(org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRanges(sPHINCSPublicKeyParameters.getTreeDigest()))), sPHINCSPublicKeyParameters.getKeyData());
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.newHope), ((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) asymmetricKeyParameter).getPubData());
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(1).bytes((org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) asymmetricKeyParameter).build()));
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) {
            org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters hSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(hSSPublicKeyParameters.getL()).bytes(hSSPublicKeyParameters.getLMSPublicKey()).build()));
        }
        if (asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) {
            org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters xMSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters) asymmetricKeyParameter;
            byte[] publicSeed = xMSSPublicKeyParameters.getPublicSeed();
            byte[] root = xMSSPublicKeyParameters.getRoot();
            byte[] encoded = xMSSPublicKeyParameters.getEncoded();
            return encoded.length > publicSeed.length + root.length ? new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss), new org.bouncycastle.asn1.DEROctetString(encoded)) : new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss, new org.bouncycastle.pqc.asn1.XMSSKeyParams(xMSSPublicKeyParameters.getParameters().getHeight(), org.bouncycastle.pqc.crypto.util.Utils.getHighResolutionOutputSizeshNQ4ISI(xMSSPublicKeyParameters.getTreeDigest()))), new org.bouncycastle.pqc.asn1.XMSSPublicKey(publicSeed, root));
        }
        if (!(asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters)) {
            if (!(asymmetricKeyParameter instanceof org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters)) {
                throw new java.io.IOException("key parameters not recognized");
            }
            org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters) asymmetricKeyParameter;
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2), new org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey(mcElieceCCA2PublicKeyParameters.getN(), mcElieceCCA2PublicKeyParameters.getT(), mcElieceCCA2PublicKeyParameters.getG(), org.bouncycastle.pqc.crypto.util.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PublicKeyParameters.getDigest())));
        }
        org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters) asymmetricKeyParameter;
        byte[] publicSeed2 = xMSSMTPublicKeyParameters.getPublicSeed();
        byte[] root2 = xMSSMTPublicKeyParameters.getRoot();
        byte[] encoded2 = xMSSMTPublicKeyParameters.getEncoded();
        return encoded2.length > publicSeed2.length + root2.length ? new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt), new org.bouncycastle.asn1.DEROctetString(encoded2)) : new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss_mt, new org.bouncycastle.pqc.asn1.XMSSMTKeyParams(xMSSMTPublicKeyParameters.getParameters().getHeight(), xMSSMTPublicKeyParameters.getParameters().getLayers(), org.bouncycastle.pqc.crypto.util.Utils.getHighResolutionOutputSizeshNQ4ISI(xMSSMTPublicKeyParameters.getTreeDigest()))), new org.bouncycastle.pqc.asn1.XMSSMTPublicKey(xMSSMTPublicKeyParameters.getPublicSeed(), xMSSMTPublicKeyParameters.getRoot()));
    }

    private SubjectPublicKeyInfoFactory() {
    }
}
