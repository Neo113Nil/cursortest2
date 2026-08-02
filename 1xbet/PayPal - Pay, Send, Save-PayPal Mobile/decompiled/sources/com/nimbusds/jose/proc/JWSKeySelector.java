package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JWSKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> {
    java.util.List<? extends java.security.Key> selectJWSKeys(com.nimbusds.jose.JWSHeader jWSHeader, C c) throws com.nimbusds.jose.KeySourceException;
}
