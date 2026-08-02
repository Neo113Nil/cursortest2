package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class ECKeyUtil {
    public static java.security.PublicKey publicToExplicitParameters(java.security.PublicKey publicKey, java.security.Provider provider) throws java.lang.IllegalArgumentException, java.security.NoSuchAlgorithmException {
        org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters;
        try {
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(publicKey.getEncoded()));
            if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001)) {
                throw new java.lang.IllegalArgumentException("cannot convert GOST key to explicit parameters.");
            }
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                x9ECParameters = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters()));
                if (x9ECParameters.hasSeed()) {
                    x9ECParameters = new org.bouncycastle.asn1.x9.X9ECParameters(x9ECParameters.getCurve(), x9ECParameters.getBaseEntry(), x9ECParameters.getN(), x9ECParameters.getH());
                }
            } else {
                if (!x962Parameters.isImplicitlyCA()) {
                    return publicKey;
                }
                x9ECParameters = new org.bouncycastle.asn1.x9.X9ECParameters(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve(), new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getG(), false), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getN(), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getH());
            }
            return java.security.KeyFactory.getInstance(publicKey.getAlgorithm(), provider).generatePublic(new java.security.spec.X509EncodedKeySpec(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, new org.bouncycastle.asn1.x9.X962Parameters(x9ECParameters)), subjectPublicKeyInfo.getPublicKeyData().getBytes()).getEncoded()));
        } catch (java.lang.IllegalArgumentException e) {
            throw e;
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw e2;
        } catch (java.lang.Exception e3) {
            throw new org.bouncycastle.jce.ECKeyUtil.UnexpectedException(e3);
        }
    }

    public static java.security.PublicKey publicToExplicitParameters(java.security.PublicKey publicKey, java.lang.String str) throws java.lang.IllegalArgumentException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        java.security.Provider provider = java.security.Security.getProvider(str);
        if (provider != null) {
            return publicToExplicitParameters(publicKey, provider);
        }
        throw new java.security.NoSuchProviderException("cannot find provider: ".concat(java.lang.String.valueOf(str)));
    }

    static class UnexpectedException extends java.lang.RuntimeException {
        private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        UnexpectedException(java.lang.Throwable th) {
            super(th.toString());
            this.getHighSpeedVideoFpsRangesFor = th;
        }
    }

    public static java.security.PrivateKey privateToExplicitParameters(java.security.PrivateKey privateKey, java.security.Provider provider) throws java.lang.IllegalArgumentException, java.security.NoSuchAlgorithmException {
        org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters;
        try {
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(privateKey.getEncoded()));
            if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001)) {
                throw new java.io.UnsupportedEncodingException("cannot convert GOST key to explicit parameters.");
            }
            org.bouncycastle.asn1.x9.X962Parameters x962Parameters = org.bouncycastle.asn1.x9.X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                x9ECParameters = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters()));
                if (x9ECParameters.hasSeed()) {
                    x9ECParameters = new org.bouncycastle.asn1.x9.X9ECParameters(x9ECParameters.getCurve(), x9ECParameters.getBaseEntry(), x9ECParameters.getN(), x9ECParameters.getH());
                }
            } else {
                if (!x962Parameters.isImplicitlyCA()) {
                    return privateKey;
                }
                x9ECParameters = new org.bouncycastle.asn1.x9.X9ECParameters(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve(), new org.bouncycastle.asn1.x9.X9ECPoint(org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getG(), false), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getN(), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getH());
            }
            return java.security.KeyFactory.getInstance(privateKey.getAlgorithm(), provider).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey, new org.bouncycastle.asn1.x9.X962Parameters(x9ECParameters)), privateKeyInfo.parsePrivateKey()).getEncoded()));
        } catch (java.lang.IllegalArgumentException e) {
            throw e;
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw e2;
        } catch (java.lang.Exception e3) {
            throw new org.bouncycastle.jce.ECKeyUtil.UnexpectedException(e3);
        }
    }

    public static java.security.PrivateKey privateToExplicitParameters(java.security.PrivateKey privateKey, java.lang.String str) throws java.lang.IllegalArgumentException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        java.security.Provider provider = java.security.Security.getProvider(str);
        if (provider != null) {
            return privateToExplicitParameters(privateKey, provider);
        }
        throw new java.security.NoSuchProviderException("cannot find provider: ".concat(java.lang.String.valueOf(str)));
    }
}
