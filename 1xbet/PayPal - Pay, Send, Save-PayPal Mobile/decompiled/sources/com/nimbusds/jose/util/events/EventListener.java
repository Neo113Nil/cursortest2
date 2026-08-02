package com.nimbusds.jose.util.events;

/* loaded from: classes10.dex */
public interface EventListener<S, C extends com.nimbusds.jose.proc.SecurityContext> {
    void notify(com.nimbusds.jose.util.events.Event<S, C> event);
}
