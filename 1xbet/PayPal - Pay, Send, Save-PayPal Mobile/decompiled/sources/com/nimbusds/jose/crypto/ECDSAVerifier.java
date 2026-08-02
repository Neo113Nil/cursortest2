package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class ECDSAVerifier extends com.nimbusds.jose.crypto.impl.ECDSAProvider implements com.nimbusds.jose.JWSVerifier, com.nimbusds.jose.CriticalHeaderParamsAware {
    private final com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral critPolicy;
    private final java.security.interfaces.ECPublicKey publicKey;

    public ECDSAVerifier(java.security.interfaces.ECPublicKey eCPublicKey) throws com.nimbusds.jose.JOSEException {
        this(eCPublicKey, null);
    }

    public ECDSAVerifier(com.nimbusds.jose.jwk.ECKey eCKey) throws com.nimbusds.jose.JOSEException {
        this(eCKey.toECPublicKey());
    }

    public ECDSAVerifier(java.security.interfaces.ECPublicKey eCPublicKey, java.util.Set<java.lang.String> set) throws com.nimbusds.jose.JOSEException {
        super(com.nimbusds.jose.crypto.impl.ECDSA.resolveAlgorithm(eCPublicKey));
        com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        this.publicKey = eCPublicKey;
        if (!com.nimbusds.jose.crypto.utils.ECChecks.isPointOnCurve(eCPublicKey, com.nimbusds.jose.jwk.Curve.forJWSAlgorithm(supportedECDSAAlgorithm()).iterator().next().toECParameterSpec())) {
            throw new com.nimbusds.jose.JOSEException("Curve / public key parameters mismatch");
        }
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    public java.security.interfaces.ECPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public java.util.Set<java.lang.String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr, com.nimbusds.jose.util.Base64URL base64URL) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (!supportedJWSAlgorithms().contains(algorithm)) {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(algorithm, supportedJWSAlgorithms()));
        }
        if (!this.critPolicy.headerPasses(jWSHeader)) {
            return false;
        }
        byte[] decode = base64URL.decode();
        try {
            com.nimbusds.jose.crypto.impl.ECDSA.ensureLegalSignature(decode, algorithm);
            byte[] transcodeSignatureToDER = com.nimbusds.jose.crypto.impl.ECDSA.transcodeSignatureToDER(decode);
            java.security.Signature signerAndVerifier = com.nimbusds.jose.crypto.impl.ECDSA.getSignerAndVerifier(algorithm, getJCAContext().getProvider());
            try {
                signerAndVerifier.initVerify(this.publicKey);
                signerAndVerifier.update(bArr);
                return signerAndVerifier.verify(transcodeSignatureToDER);
            } catch (java.security.InvalidKeyException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EC public key: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            } catch (java.security.SignatureException unused) {
                return false;
            }
        } catch (com.nimbusds.jose.JOSEException unused2) {
            return false;
        }
    }
}
