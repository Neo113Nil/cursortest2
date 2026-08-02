package org.bouncycastle.its.jcajce;

/* loaded from: classes17.dex */
public class JcaITSContentSigner implements org.bouncycastle.its.operator.ITSContentSigner {
    private final byte[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.operator.DigestCalculator getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final java.security.interfaces.ECPrivateKey getInputSizeshNQ4ISI;
    private final org.bouncycastle.its.ITSCertificate getOutputMinFrameDuration;

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public boolean isForSelfSigning() {
        return this.Camera2StreamConfigurationMap == null;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getSignature() {
        byte[] digest = this.getHighResolutionOutputSizeshNQ4ISI.getDigest();
        try {
            java.security.Signature createSignature = this.getHighSpeedVideoFpsRangesFor.createSignature(this.getHighSpeedVideoSizesFor);
            createSignature.initSign(this.getInputSizeshNQ4ISI);
            createSignature.update(digest, 0, digest.length);
            createSignature.update(this.getHighResolutionOutputSizeshNQ4ISI.getDigest());
            return createSignature.sign();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public static class Builder {
        private org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

        public org.bouncycastle.its.jcajce.JcaITSContentSigner.Builder setProvider(java.security.Provider provider) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
            return this;
        }

        public org.bouncycastle.its.jcajce.JcaITSContentSigner.Builder setProvider(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
            return this;
        }

        public org.bouncycastle.its.jcajce.JcaITSContentSigner build(java.security.PrivateKey privateKey, org.bouncycastle.its.ITSCertificate iTSCertificate) {
            return new org.bouncycastle.its.jcajce.JcaITSContentSigner((java.security.interfaces.ECPrivateKey) privateKey, iTSCertificate, this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }

        public org.bouncycastle.its.jcajce.JcaITSContentSigner build(java.security.PrivateKey privateKey) {
            return new org.bouncycastle.its.jcajce.JcaITSContentSigner((java.security.interfaces.ECPrivateKey) privateKey, null, this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public java.io.OutputStream getOutputStream() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOutputStream();
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getAssociatedCertificateDigest() {
        return org.bouncycastle.util.Arrays.clone(this.getInputFormats);
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public org.bouncycastle.its.ITSCertificate getAssociatedCertificate() {
        return this.getOutputMinFrameDuration;
    }

    /* synthetic */ JcaITSContentSigner(java.security.interfaces.ECPrivateKey eCPrivateKey, org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, byte b) {
        this(eCPrivateKey, iTSCertificate, jcaJceHelper);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JcaITSContentSigner(java.security.interfaces.ECPrivateKey eCPrivateKey, org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        java.lang.String str;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        this.getInputSizeshNQ4ISI = eCPrivateKey;
        this.getOutputMinFrameDuration = iTSCertificate;
        this.getHighSpeedVideoFpsRangesFor = jcaJceHelper;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(eCPrivateKey.getEncoded()).getPrivateKeyAlgorithm().getParameters());
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        try {
            try {
                if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1)) {
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
                } else {
                    if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
                        if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                            throw new java.lang.IllegalArgumentException("unknown key type");
                        }
                        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
                        str = "SHA384withECDSA";
                        this.getHighSpeedVideoSizesFor = str;
                        org.bouncycastle.operator.DigestCalculator digestCalculator = new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.getHighSpeedVideoSizes);
                        this.getHighResolutionOutputSizeshNQ4ISI = digestCalculator;
                        if (iTSCertificate != null) {
                            this.Camera2StreamConfigurationMap = null;
                            this.getInputFormats = digestCalculator.getDigest();
                            return;
                        }
                        try {
                            byte[] encoded = iTSCertificate.getEncoded();
                            this.Camera2StreamConfigurationMap = encoded;
                            digestCalculator.getOutputStream().write(encoded, 0, encoded.length);
                            this.getInputFormats = digestCalculator.getDigest();
                            return;
                        } catch (java.io.IOException e) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("signer certificate encoding failed: ");
                            sb.append(e.getMessage());
                            throw new java.lang.IllegalStateException(sb.toString());
                        }
                    }
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
                }
                org.bouncycastle.operator.DigestCalculator digestCalculator2 = new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.getHighSpeedVideoSizes);
                this.getHighResolutionOutputSizeshNQ4ISI = digestCalculator2;
                if (iTSCertificate != null) {
                }
            } catch (org.bouncycastle.operator.OperatorCreationException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot recognise digest type: ");
                sb2.append(this.getHighSpeedVideoSizes.getAlgorithm());
                throw new java.lang.IllegalStateException(sb2.toString(), e2);
            }
        } catch (java.lang.Exception e3) {
            throw new java.lang.IllegalStateException(e3.getMessage(), e3);
        }
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        str = "SHA256withECDSA";
        this.getHighSpeedVideoSizesFor = str;
    }
}
