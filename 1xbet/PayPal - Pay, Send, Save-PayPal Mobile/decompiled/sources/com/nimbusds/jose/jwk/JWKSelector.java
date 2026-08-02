package com.nimbusds.jose.jwk;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class JWKSelector {
    private final com.nimbusds.jose.jwk.JWKMatcher matcher;

    public JWKSelector(com.nimbusds.jose.jwk.JWKMatcher jWKMatcher) {
        if (jWKMatcher == null) {
            throw new java.lang.IllegalArgumentException("The JWK matcher must not be null");
        }
        this.matcher = jWKMatcher;
    }

    public final com.nimbusds.jose.jwk.JWKMatcher getMatcher() {
        return this.matcher;
    }

    public final java.util.List<com.nimbusds.jose.jwk.JWK> select(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jWKSet != null) {
            for (com.nimbusds.jose.jwk.JWK jwk : jWKSet.getKeys()) {
                if (this.matcher.matches(jwk)) {
                    linkedList.add(jwk);
                }
            }
        }
        return linkedList;
    }
}
