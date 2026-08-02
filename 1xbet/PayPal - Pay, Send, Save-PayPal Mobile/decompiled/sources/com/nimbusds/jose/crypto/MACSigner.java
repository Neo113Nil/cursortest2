package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class MACSigner extends com.nimbusds.jose.crypto.impl.MACProvider implements com.nimbusds.jose.JWSSigner {
    public static int getMinRequiredSecretLength(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) throws com.nimbusds.jose.JOSEException {
        if (com.nimbusds.jose.JWSAlgorithm.HS256.equals(jWSAlgorithm)) {
            return 256;
        }
        if (com.nimbusds.jose.JWSAlgorithm.HS384.equals(jWSAlgorithm)) {
            return 384;
        }
        if (com.nimbusds.jose.JWSAlgorithm.HS512.equals(jWSAlgorithm)) {
            return 512;
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, SUPPORTED_ALGORITHMS));
    }

    public static java.util.Set<com.nimbusds.jose.JWSAlgorithm> getCompatibleAlgorithms(int i) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (i >= 256) {
            linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.HS256);
        }
        if (i >= 384) {
            linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.HS384);
        }
        if (i >= 512) {
            linkedHashSet.add(com.nimbusds.jose.JWSAlgorithm.HS512);
        }
        return java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public MACSigner(byte[] bArr) throws com.nimbusds.jose.KeyLengthException {
        super(bArr, getCompatibleAlgorithms(com.nimbusds.jose.util.ByteUtils.bitLength(bArr.length)));
    }

    public MACSigner(java.lang.String str) throws com.nimbusds.jose.KeyLengthException {
        this(str.getBytes(com.nimbusds.jose.util.StandardCharset.UTF_8));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MACSigner(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey, r0);
        java.util.Set<com.nimbusds.jose.JWSAlgorithm> set;
        if (secretKey.getEncoded() != null) {
            set = getCompatibleAlgorithms(com.nimbusds.jose.util.ByteUtils.bitLength(secretKey.getEncoded()));
        } else {
            set = SUPPORTED_ALGORITHMS;
        }
    }

    public MACSigner(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) throws com.nimbusds.jose.KeyLengthException {
        this(octetSequenceKey.toByteArray());
    }

    @Override // com.nimbusds.jose.JWSSigner
    public com.nimbusds.jose.util.Base64URL sign(com.nimbusds.jose.JWSHeader jWSHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        if (getSecret() != null) {
            int minRequiredSecretLength = getMinRequiredSecretLength(jWSHeader.getAlgorithm());
            if (getSecret().length < com.nimbusds.jose.util.ByteUtils.byteLength(minRequiredSecretLength)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The secret length for ");
                sb.append(jWSHeader.getAlgorithm());
                sb.append(" must be at least ");
                sb.append(minRequiredSecretLength);
                sb.append(" bits");
                throw new com.nimbusds.jose.KeyLengthException(sb.toString());
            }
        }
        return com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.HMAC.compute(getJCAAlgorithmName(jWSHeader.getAlgorithm()), getSecretKey(), bArr, getJCAContext().getProvider()));
    }
}
