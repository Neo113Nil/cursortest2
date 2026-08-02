package org.bouncycastle.pqc.crypto.util;

/* loaded from: classes17.dex */
public class PublicKeyFactory {
    private static java.util.Map Camera2StreamConfigurationMap;

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(byte[] bArr) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, java.lang.Object obj) throws java.io.IOException {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter subjectPublicKeyInfoConverter = (org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter) Camera2StreamConfigurationMap.get(algorithm.getAlgorithm());
        if (subjectPublicKeyInfoConverter != null) {
            return subjectPublicKeyInfoConverter.getHighSpeedVideoFpsRangesFor(subjectPublicKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier in public key not recognised: ");
        sb.append(algorithm.getAlgorithm());
        throw new java.io.IOException(sb.toString());
    }

    static class LMSConverter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
            if (org.bouncycastle.util.Pack.bigEndianToInt(octets, 0) == 1) {
                return org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters.getInstance(org.bouncycastle.util.Arrays.copyOfRange(octets, 4, octets.length));
            }
            if (octets.length == 64) {
                octets = org.bouncycastle.util.Arrays.copyOfRange(octets, 4, octets.length);
            }
            return org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters.getInstance(octets);
        }

        /* synthetic */ LMSConverter(byte b) {
            this();
        }

        private LMSConverter() {
            super((byte) 0);
        }
    }

    static class McElieceCCA2Converter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey mcElieceCCA2PublicKey = org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            return new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters(mcElieceCCA2PublicKey.getN(), mcElieceCCA2PublicKey.getT(), mcElieceCCA2PublicKey.getG(), org.bouncycastle.pqc.crypto.util.Utils.Camera2StreamConfigurationMap(mcElieceCCA2PublicKey.getDigest().getAlgorithm()));
        }

        /* synthetic */ McElieceCCA2Converter(byte b) {
            this();
        }

        private McElieceCCA2Converter() {
            super((byte) 0);
        }
    }

    static class NHConverter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            return new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getBytes());
        }

        /* synthetic */ NHConverter(byte b) {
            this();
        }

        private NHConverter() {
            super((byte) 0);
        }
    }

    static class QTeslaConverter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            return new org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters(org.bouncycastle.pqc.crypto.util.Utils.Camera2StreamConfigurationMap(subjectPublicKeyInfo.getAlgorithm()), subjectPublicKeyInfo.getPublicKeyData().getOctets());
        }

        /* synthetic */ QTeslaConverter(byte b) {
            this();
        }

        private QTeslaConverter() {
            super((byte) 0);
        }
    }

    static class SPHINCSConverter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            return new org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getBytes(), org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.asn1.SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters())));
        }

        /* synthetic */ SPHINCSConverter(byte b) {
            this();
        }

        private SPHINCSConverter() {
            super((byte) 0);
        }
    }

    static class XMSSConverter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder withPublicKey;
            org.bouncycastle.pqc.asn1.XMSSKeyParams xMSSKeyParams = org.bouncycastle.pqc.asn1.XMSSKeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (xMSSKeyParams != null) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = xMSSKeyParams.getTreeDigest().getAlgorithm();
                org.bouncycastle.pqc.asn1.XMSSPublicKey xMSSPublicKey = org.bouncycastle.pqc.asn1.XMSSPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                withPublicKey = new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(new org.bouncycastle.pqc.crypto.xmss.XMSSParameters(xMSSKeyParams.getHeight(), org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRanges(algorithm))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot());
            } else {
                byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
                withPublicKey = new org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters.Builder(org.bouncycastle.pqc.crypto.xmss.XMSSParameters.lookupByOID(org.bouncycastle.util.Pack.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return withPublicKey.build();
        }

        /* synthetic */ XMSSConverter(byte b) {
            this();
        }

        private XMSSConverter() {
            super((byte) 0);
        }
    }

    static class XMSSMTConverter extends org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter {
        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        final org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
            org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder withPublicKey;
            org.bouncycastle.pqc.asn1.XMSSMTKeyParams xMSSMTKeyParams = org.bouncycastle.pqc.asn1.XMSSMTKeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (xMSSMTKeyParams != null) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
                org.bouncycastle.pqc.asn1.XMSSPublicKey xMSSPublicKey = org.bouncycastle.pqc.asn1.XMSSPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                withPublicKey = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder(new org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), org.bouncycastle.pqc.crypto.util.Utils.getHighSpeedVideoFpsRanges(algorithm))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot());
            } else {
                byte[] octets = org.bouncycastle.asn1.ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
                withPublicKey = new org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters.Builder(org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters.lookupByOID(org.bouncycastle.util.Pack.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return withPublicKey.build();
        }

        /* synthetic */ XMSSMTConverter(byte b) {
            this();
        }

        private XMSSMTConverter() {
            super((byte) 0);
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        return createKey(subjectPublicKeyInfo, null);
    }

    static abstract class SubjectPublicKeyInfoConverter {
        abstract org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException;

        /* synthetic */ SubjectPublicKeyInfoConverter(byte b) {
            this();
        }

        private SubjectPublicKeyInfoConverter() {
        }
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(java.io.InputStream inputStream) throws java.io.IOException {
        return createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject()));
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap;
        byte b = 0;
        hashMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_I, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.QTeslaConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_III, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.QTeslaConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.sphincs256, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SPHINCSConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.newHope, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.NHConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.XMSSConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.xmss_mt, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.XMSSMTConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmss, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.XMSSConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.isara.IsaraObjectIdentifiers.id_alg_xmssmt, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.XMSSMTConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.LMSConverter(b));
        Camera2StreamConfigurationMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcElieceCca2, new org.bouncycastle.pqc.crypto.util.PublicKeyFactory.McElieceCCA2Converter(b));
    }
}
