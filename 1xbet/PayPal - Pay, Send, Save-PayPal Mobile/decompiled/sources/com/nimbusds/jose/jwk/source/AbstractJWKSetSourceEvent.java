package com.nimbusds.jose.jwk.source;

/* loaded from: classes10.dex */
class AbstractJWKSetSourceEvent<S extends com.nimbusds.jose.jwk.source.JWKSetSource<C>, C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.util.events.Event<S, C> {
    private final C context;
    private final S source;

    AbstractJWKSetSourceEvent(S s, C c) {
        java.util.Objects.requireNonNull(s);
        this.source = s;
        this.context = c;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public S getSource() {
        return this.source;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public C getContext() {
        return this.context;
    }
}
