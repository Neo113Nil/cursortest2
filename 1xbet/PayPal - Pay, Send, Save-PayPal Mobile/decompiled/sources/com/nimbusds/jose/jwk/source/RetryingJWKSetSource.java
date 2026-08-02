package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class RetryingJWKSetSource<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.JWKSetSourceWrapper<C> {
    private final com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C>, C> eventListener;

    public static class RetrialEvent<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent<com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C>, C> {
        private final java.lang.Exception exception;

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.proc.SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ com.nimbusds.jose.jwk.source.JWKSetSource getSource() {
            return super.getSource();
        }

        private RetrialEvent(com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C> retryingJWKSetSource, java.lang.Exception exc, C c) {
            super(retryingJWKSetSource, c);
            java.util.Objects.requireNonNull(exc);
            this.exception = exc;
        }

        public java.lang.Exception getException() {
            return this.exception;
        }
    }

    public RetryingJWKSetSource(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource);
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        try {
            return getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c);
        } catch (com.nimbusds.jose.jwk.source.JWKSetUnavailableException e) {
            com.nimbusds.jose.util.events.EventListener<com.nimbusds.jose.jwk.source.RetryingJWKSetSource<C>, C> eventListener = this.eventListener;
            if (eventListener != null) {
                eventListener.notify(new com.nimbusds.jose.jwk.source.RetryingJWKSetSource.RetrialEvent(e, c));
            }
            return getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c);
        }
    }
}
