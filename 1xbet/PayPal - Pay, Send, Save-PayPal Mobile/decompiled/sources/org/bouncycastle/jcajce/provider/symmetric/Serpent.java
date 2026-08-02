package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Serpent {

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.symmetric.Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Serpent", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.Serpent", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.Serpent", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$TECB");
            configurableProvider.addAlgorithm("Cipher.Tnepres", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$TKeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.Tnepres", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$TAlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.Tnepres", sb6.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_128_ECB;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb7.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_192_ECB;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb8.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_256_ECB;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb9.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_128_CBC;
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, sb10.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_192_CBC;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, sb11.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_256_CBC;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, sb12.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_128_CFB;
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, sb13.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_192_CFB;
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, sb14.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_256_CFB;
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, sb15.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_128_OFB;
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, sb16.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_192_OFB;
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, sb17.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent_256_OFB;
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, sb18.toString());
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$SerpentGMAC");
            java.lang.String obj = sb19.toString();
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "SERPENT", obj, sb20.toString());
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(str);
            sb21.append("$TSerpentGMAC");
            java.lang.String obj2 = sb21.toString();
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$TKeyGen");
            addGMacAlgorithm(configurableProvider, "TNEPRES", obj2, sb22.toString());
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$Poly1305");
            java.lang.String obj3 = sb23.toString();
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            sb24.append(str);
            sb24.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "SERPENT", obj3, sb24.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Serpent IV";
        }
    }

    public static class TAlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.SerpentEngine()), 128);
        }
    }

    public static class CFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.SerpentEngine(), 128)), 128);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.SerpentEngine();
                }
            });
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class OFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.SerpentEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new org.bouncycastle.crypto.engines.SerpentEngine()));
        }
    }

    public static class Poly1305KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    public static class SerpentGMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SerpentGMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.SerpentEngine())));
        }
    }

    public static class TECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public TECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.TnepresEngine();
                }
            });
        }
    }

    public static class TKeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class TSerpentGMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public TSerpentGMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.TnepresEngine())));
        }
    }

    private Serpent() {
    }
}
