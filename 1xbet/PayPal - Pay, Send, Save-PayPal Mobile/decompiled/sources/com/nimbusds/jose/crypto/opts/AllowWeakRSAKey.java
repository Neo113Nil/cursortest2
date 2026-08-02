package com.nimbusds.jose.crypto.opts;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class AllowWeakRSAKey implements com.nimbusds.jose.JWSSignerOption {
    private static final com.nimbusds.jose.crypto.opts.AllowWeakRSAKey SINGLETON = new com.nimbusds.jose.crypto.opts.AllowWeakRSAKey();

    public static com.nimbusds.jose.crypto.opts.AllowWeakRSAKey getInstance() {
        return SINGLETON;
    }

    private AllowWeakRSAKey() {
    }

    public final java.lang.String toString() {
        return "AllowWeakRSAKey";
    }
}
