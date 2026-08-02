package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class SignatureSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.DSABase {
    @Override // java.security.SignatureSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(publicKey);
        this.digest.reset();
        this.signer.init(false, highResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        if (this.appRandom != null) {
            this.signer.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(generatePrivateKeyParameter, this.appRandom));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    public static class ecCVCDSA extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA3_224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA3_224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA3_256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA3_256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA3_384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA3_384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA3_512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA3_512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecCVCDSA512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecCVCDSA512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSA extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSA224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSA256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSA384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSA512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSA512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSARipeMD160 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSARipeMD160() {
            super(new org.bouncycastle.crypto.digests.RIPEMD160Digest(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSASha3_224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSASha3_224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSASha3_256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSASha3_256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSASha3_384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSASha3_384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSASha3_512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSASha3_512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSAShake128 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSAShake128() {
            super(new org.bouncycastle.crypto.digests.SHAKEDigest(128), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(new org.bouncycastle.crypto.digests.SHAKEDigest(128))), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSAShake256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSAShake256() {
            super(new org.bouncycastle.crypto.digests.SHAKEDigest(256), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(new org.bouncycastle.crypto.digests.SHAKEDigest(256))), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDSAnone extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDSAnone() {
            super(new org.bouncycastle.crypto.digests.NullDigest(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSA extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSA() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA1())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSA224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSA224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA224())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSA256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSA256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA256())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSA384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSA384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA384())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSA512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSA512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA512())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSASha3_224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSASha3_224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSASha3_256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSASha3_256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSASha3_384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSASha3_384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecDetDSASha3_512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecDetDSASha3_512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512(), new org.bouncycastle.crypto.signers.ECDSASigner(new org.bouncycastle.crypto.signers.HMacDSAKCalculator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512())), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecNR extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecNR() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.crypto.signers.ECNRSigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecNR224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecNR224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.crypto.signers.ECNRSigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecNR256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecNR256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.crypto.signers.ECNRSigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecNR384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecNR384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.crypto.signers.ECNRSigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecNR512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecNR512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.crypto.signers.ECNRSigner(), org.bouncycastle.crypto.signers.StandardDSAEncoding.INSTANCE);
        }
    }

    public static class ecPlainDSARP160 extends org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi {
        public ecPlainDSARP160() {
            super(new org.bouncycastle.crypto.digests.RIPEMD160Digest(), new org.bouncycastle.crypto.signers.ECDSASigner(), org.bouncycastle.crypto.signers.PlainDSAEncoding.INSTANCE);
        }
    }

    SignatureSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.crypto.DSAExt dSAExt, org.bouncycastle.crypto.signers.DSAEncoding dSAEncoding) {
        super(digest, dSAExt, dSAEncoding);
    }
}
