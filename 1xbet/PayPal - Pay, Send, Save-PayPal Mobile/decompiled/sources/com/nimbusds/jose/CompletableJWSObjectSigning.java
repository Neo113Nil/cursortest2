package com.nimbusds.jose;

/* loaded from: classes4.dex */
public interface CompletableJWSObjectSigning {
    com.nimbusds.jose.util.Base64URL complete() throws com.nimbusds.jose.JOSEException;

    java.security.Signature getInitializedSignature();
}
