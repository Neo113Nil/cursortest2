package com.nimbusds.jose.util.events;

/* loaded from: classes10.dex */
public interface Event<S, C extends com.nimbusds.jose.proc.SecurityContext> {
    C getContext();

    S getSource();
}
