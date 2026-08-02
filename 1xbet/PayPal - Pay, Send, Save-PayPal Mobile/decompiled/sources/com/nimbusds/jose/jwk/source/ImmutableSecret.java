package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class ImmutableSecret<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.ImmutableJWKSet<C> {
    public ImmutableSecret(byte[] bArr) {
        super(new com.nimbusds.jose.jwk.JWKSet(new com.nimbusds.jose.jwk.OctetSequenceKey.Builder(bArr).build()));
    }

    public ImmutableSecret(javax.crypto.SecretKey secretKey) {
        super(new com.nimbusds.jose.jwk.JWKSet(new com.nimbusds.jose.jwk.OctetSequenceKey.Builder(secretKey).build()));
    }

    public byte[] getSecret() {
        return ((com.nimbusds.jose.jwk.OctetSequenceKey) getJWKSet().getKeys().get(0)).toByteArray();
    }

    public javax.crypto.SecretKey getSecretKey() {
        return ((com.nimbusds.jose.jwk.OctetSequenceKey) getJWKSet().getKeys().get(0)).toSecretKey();
    }
}
