package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JOSEObjectTypeVerifier<C extends com.nimbusds.jose.proc.SecurityContext> {
    void verify(com.nimbusds.jose.JOSEObjectType jOSEObjectType, C c) throws com.nimbusds.jose.proc.BadJOSEException;
}
