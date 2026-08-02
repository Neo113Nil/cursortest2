package com.nimbusds.jose.crypto.opts;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class UserAuthenticationRequired implements com.nimbusds.jose.JWSSignerOption {
    private static final com.nimbusds.jose.crypto.opts.UserAuthenticationRequired SINGLETON = new com.nimbusds.jose.crypto.opts.UserAuthenticationRequired();

    public static com.nimbusds.jose.crypto.opts.UserAuthenticationRequired getInstance() {
        return SINGLETON;
    }

    private UserAuthenticationRequired() {
    }

    public final java.lang.String toString() {
        return "UserAuthenticationRequired";
    }
}
