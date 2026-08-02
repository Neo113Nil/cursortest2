package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JcaContentSignerBuilder {
    private java.security.spec.AlgorithmParameterSpec Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    public org.bouncycastle.operator.jcajce.JcaContentSignerBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        return this;
    }

    public org.bouncycastle.operator.jcajce.JcaContentSignerBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JcaContentSignerBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public org.bouncycastle.operator.ContentSigner build(java.security.PrivateKey privateKey) throws org.bouncycastle.operator.OperatorCreationException {
        if (privateKey instanceof org.bouncycastle.jcajce.CompositePrivateKey) {
            return getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.jcajce.CompositePrivateKey) privateKey);
        }
        try {
            java.security.Signature highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoSizes;
            java.security.SecureRandom secureRandom = this.getHighResolutionOutputSizeshNQ4ISI;
            if (secureRandom != null) {
                highSpeedVideoSizes.initSign(privateKey, secureRandom);
            } else {
                highSpeedVideoSizes.initSign(privateKey);
            }
            return new org.bouncycastle.operator.ContentSigner(highSpeedVideoSizes, algorithmIdentifier) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.1
                private java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ java.security.Signature getHighSpeedVideoFpsRanges;
                final /* synthetic */ org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        return this.getHighSpeedVideoFpsRanges.sign();
                    } catch (java.security.SignatureException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining signature: ");
                        sb.append(e.getMessage());
                        throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
                    }
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public java.io.OutputStream getOutputStream() {
                    return this.getHighResolutionOutputSizeshNQ4ISI;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.getHighSpeedVideoSizes;
                }

                {
                    this.getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = algorithmIdentifier;
                    this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(highSpeedVideoSizes);
                }
            };
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create signer: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    private static org.bouncycastle.asn1.pkcs.RSASSAPSSparams getHighSpeedVideoFpsRangesFor(java.security.spec.PSSParameterSpec pSSParameterSpec) {
        org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find = defaultDigestAlgorithmIdentifierFinder.find(pSSParameterSpec.getDigestAlgorithm());
        if (find.getParameters() == null) {
            find = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(find.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find2 = defaultDigestAlgorithmIdentifierFinder.find(((java.security.spec.MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm());
        if (find2.getParameters() == null) {
            find2 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(find2.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        return new org.bouncycastle.asn1.pkcs.RSASSAPSSparams(find, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, find2), new org.bouncycastle.asn1.ASN1Integer(pSSParameterSpec.getSaltLength()), new org.bouncycastle.asn1.ASN1Integer(pSSParameterSpec.getTrailerField()));
    }

    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec compositeAlgorithmSpec) {
        org.bouncycastle.asn1.ASN1Encodable highSpeedVideoFpsRangesFor;
        org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder defaultSignatureAlgorithmIdentifierFinder = new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.List<java.lang.String> algorithmNames = compositeAlgorithmSpec.getAlgorithmNames();
        java.util.List<java.security.spec.AlgorithmParameterSpec> parameterSpecs = compositeAlgorithmSpec.getParameterSpecs();
        for (int i = 0; i != algorithmNames.size(); i++) {
            java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = parameterSpecs.get(i);
            if (algorithmParameterSpec == null) {
                highSpeedVideoFpsRangesFor = defaultSignatureAlgorithmIdentifierFinder.find(algorithmNames.get(i));
            } else {
                if (!(algorithmParameterSpec instanceof java.security.spec.PSSParameterSpec)) {
                    throw new java.lang.IllegalArgumentException("unrecognized parameterSpec");
                }
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((java.security.spec.PSSParameterSpec) algorithmParameterSpec);
            }
            aSN1EncodableVector.add(highSpeedVideoFpsRangesFor);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    private org.bouncycastle.operator.ContentSigner getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.jcajce.CompositePrivateKey compositePrivateKey) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            java.util.List<java.security.PrivateKey> privateKeys = compositePrivateKey.getPrivateKeys();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighSpeedVideoSizes.getParameters());
            int size = aSN1Sequence.size();
            java.security.Signature[] signatureArr = new java.security.Signature[size];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                java.security.Signature highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i)));
                signatureArr[i] = highSpeedVideoSizes;
                if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                    highSpeedVideoSizes.initSign(privateKeys.get(i), this.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    highSpeedVideoSizes.initSign(privateKeys.get(i));
                }
            }
            java.io.OutputStream createStream = org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signatureArr[0]);
            int i2 = 1;
            while (i2 != size) {
                org.bouncycastle.util.io.TeeOutputStream teeOutputStream = new org.bouncycastle.util.io.TeeOutputStream(createStream, org.bouncycastle.jcajce.io.OutputStreamFactory.createStream(signatureArr[i2]));
                i2++;
                createStream = teeOutputStream;
            }
            return new org.bouncycastle.operator.ContentSigner(createStream, signatureArr) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.2
                java.io.OutputStream Camera2StreamConfigurationMap;
                final /* synthetic */ java.security.Signature[] getHighSpeedVideoFpsRanges;
                final /* synthetic */ java.io.OutputStream getHighSpeedVideoSizes;

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                        for (int i3 = 0; i3 != this.getHighSpeedVideoFpsRanges.length; i3++) {
                            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(this.getHighSpeedVideoFpsRanges[i3].sign()));
                        }
                        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
                    } catch (java.io.IOException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding signature: ");
                        sb.append(e.getMessage());
                        throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
                    } catch (java.security.SignatureException e2) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("exception obtaining signature: ");
                        sb2.append(e2.getMessage());
                        throw new org.bouncycastle.operator.RuntimeOperatorException(sb2.toString(), e2);
                    }
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public java.io.OutputStream getOutputStream() {
                    return this.Camera2StreamConfigurationMap;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                    return org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.this.getHighSpeedVideoSizes;
                }

                {
                    this.getHighSpeedVideoSizes = createStream;
                    this.getHighSpeedVideoFpsRanges = signatureArr;
                    this.Camera2StreamConfigurationMap = createStream;
                }
            };
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create signer: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    public JcaContentSignerBuilder(java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoFpsRanges = str;
        if (algorithmParameterSpec instanceof java.security.spec.PSSParameterSpec) {
            java.security.spec.PSSParameterSpec pSSParameterSpec = (java.security.spec.PSSParameterSpec) algorithmParameterSpec;
            this.Camera2StreamConfigurationMap = pSSParameterSpec;
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS, getHighSpeedVideoFpsRangesFor(pSSParameterSpec));
        } else {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown sigParamSpec: ");
                sb.append(algorithmParameterSpec == null ? "null" : algorithmParameterSpec.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec compositeAlgorithmSpec = (org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec) algorithmParameterSpec;
            this.Camera2StreamConfigurationMap = compositeAlgorithmSpec;
            algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite, getHighSpeedVideoSizes(compositeAlgorithmSpec));
        }
        this.getHighSpeedVideoSizes = algorithmIdentifier;
    }

    public JcaContentSignerBuilder(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder().find(str);
        this.Camera2StreamConfigurationMap = null;
    }
}
