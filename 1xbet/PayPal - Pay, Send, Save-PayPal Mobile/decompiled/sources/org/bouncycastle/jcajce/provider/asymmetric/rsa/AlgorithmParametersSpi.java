package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    protected abstract java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException;

    public static class OAEP extends org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi {
        javax.crypto.spec.OAEPParameterSpec Camera2StreamConfigurationMap;

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.OAEPParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return this.Camera2StreamConfigurationMap;
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "OAEP Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!str.equalsIgnoreCase("X.509") && !str.equalsIgnoreCase("ASN.1")) {
                throw new java.io.IOException("Unknown parameter format ".concat(java.lang.String.valueOf(str)));
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            try {
                org.bouncycastle.asn1.pkcs.RSAESOAEPparams rSAESOAEPparams = org.bouncycastle.asn1.pkcs.RSAESOAEPparams.getInstance(bArr);
                if (rSAESOAEPparams.getMaskGenAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1)) {
                    this.Camera2StreamConfigurationMap = new javax.crypto.spec.OAEPParameterSpec(org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(rSAESOAEPparams.getHashAlgorithm().getAlgorithm()), javax.crypto.spec.OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new java.security.spec.MGF1ParameterSpec(org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(rSAESOAEPparams.getMaskGenAlgorithm().getParameters()).getAlgorithm())), new javax.crypto.spec.PSource.PSpecified(org.bouncycastle.asn1.ASN1OctetString.getInstance(rSAESOAEPparams.getPSourceAlgorithm().getParameters()).getOctets()));
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown mask generation function: ");
                    sb.append(rSAESOAEPparams.getMaskGenAlgorithm().getAlgorithm());
                    throw new java.io.IOException(sb.toString());
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw new java.io.IOException("Not a valid OAEP Parameter encoding.");
            } catch (java.lang.ClassCastException unused2) {
                throw new java.io.IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.OAEPParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            }
            this.Camera2StreamConfigurationMap = (javax.crypto.spec.OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            try {
                return new org.bouncycastle.asn1.pkcs.RSAESOAEPparams(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.jcajce.provider.util.DigestFactory.getOID(this.Camera2StreamConfigurationMap.getDigestAlgorithm()), org.bouncycastle.asn1.DERNull.INSTANCE), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.jcajce.provider.util.DigestFactory.getOID(((java.security.spec.MGF1ParameterSpec) this.Camera2StreamConfigurationMap.getMGFParameters()).getDigestAlgorithm()), org.bouncycastle.asn1.DERNull.INSTANCE)), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_pSpecified, new org.bouncycastle.asn1.DEROctetString(((javax.crypto.spec.PSource.PSpecified) this.Camera2StreamConfigurationMap.getPSource()).getValue()))).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } catch (java.io.IOException unused) {
                throw new java.lang.RuntimeException("Error encoding OAEPParameters");
            }
        }
    }

    public static class PSS extends org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi {
        java.security.spec.PSSParameterSpec getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == java.security.spec.PSSParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return this.getHighSpeedVideoSizes;
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "PSS Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str) && !str.equalsIgnoreCase("X.509")) {
                throw new java.io.IOException("Unknown parameter format ".concat(java.lang.String.valueOf(str)));
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            try {
                org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(bArr);
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm();
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1)) {
                    this.getHighSpeedVideoSizes = new java.security.spec.PSSParameterSpec(org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()), java.security.spec.PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new java.security.spec.MGF1ParameterSpec(org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()).getAlgorithm())), rSASSAPSSparams.getSaltLength().intValue(), rSASSAPSSparams.getTrailerField().intValue());
                    return;
                }
                if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown mask generation function: ");
                    sb.append(rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm());
                    throw new java.io.IOException(sb.toString());
                }
                this.getHighSpeedVideoSizes = new java.security.spec.PSSParameterSpec(org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()), algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128) ? "SHAKE128" : "SHAKE256", null, rSASSAPSSparams.getSaltLength().intValue(), rSASSAPSSparams.getTrailerField().intValue());
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw new java.io.IOException("Not a valid PSS Parameter encoding.");
            } catch (java.lang.ClassCastException unused2) {
                throw new java.io.IOException("Not a valid PSS Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof java.security.spec.PSSParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            }
            this.getHighSpeedVideoSizes = (java.security.spec.PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() throws java.io.IOException {
            org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams;
            java.security.spec.PSSParameterSpec pSSParameterSpec = this.getHighSpeedVideoSizes;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.jcajce.provider.util.DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm()), org.bouncycastle.asn1.DERNull.INSTANCE);
            java.security.spec.MGF1ParameterSpec mGF1ParameterSpec = (java.security.spec.MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (mGF1ParameterSpec != null) {
                rSASSAPSSparams = new org.bouncycastle.asn1.pkcs.RSASSAPSSparams(algorithmIdentifier, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.jcajce.provider.util.DigestFactory.getOID(mGF1ParameterSpec.getDigestAlgorithm()), org.bouncycastle.asn1.DERNull.INSTANCE)), new org.bouncycastle.asn1.ASN1Integer(pSSParameterSpec.getSaltLength()), new org.bouncycastle.asn1.ASN1Integer(pSSParameterSpec.getTrailerField()));
            } else {
                rSASSAPSSparams = new org.bouncycastle.asn1.pkcs.RSASSAPSSparams(algorithmIdentifier, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") ? org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128 : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256), new org.bouncycastle.asn1.ASN1Integer(pSSParameterSpec.getSaltLength()), new org.bouncycastle.asn1.ASN1Integer(pSSParameterSpec.getTrailerField()));
            }
            return rSASSAPSSparams.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        }
    }

    protected boolean isASN1FormatString(java.lang.String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new java.lang.NullPointerException("argument to getParameterSpec must not be null");
    }
}
