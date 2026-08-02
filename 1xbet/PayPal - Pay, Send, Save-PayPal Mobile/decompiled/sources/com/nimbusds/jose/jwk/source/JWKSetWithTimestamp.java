package com.nimbusds.jose.jwk.source;

@java.lang.Deprecated
@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class JWKSetWithTimestamp {
    private final com.nimbusds.jose.jwk.JWKSet jwkSet;
    private final java.util.Date timestamp;

    public JWKSetWithTimestamp(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        this(jWKSet, new java.util.Date());
    }

    public JWKSetWithTimestamp(com.nimbusds.jose.jwk.JWKSet jWKSet, java.util.Date date) {
        if (jWKSet == null) {
            throw new java.lang.IllegalArgumentException("The JWK set must not be null");
        }
        this.jwkSet = jWKSet;
        if (date == null) {
            throw new java.lang.IllegalArgumentException("The timestamp must not null");
        }
        this.timestamp = date;
    }

    public final com.nimbusds.jose.jwk.JWKSet getJWKSet() {
        return this.jwkSet;
    }

    public final java.util.Date getDate() {
        return this.timestamp;
    }
}
