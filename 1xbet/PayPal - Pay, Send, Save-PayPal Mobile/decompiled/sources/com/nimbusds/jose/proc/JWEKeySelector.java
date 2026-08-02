package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JWEKeySelector<C extends com.nimbusds.jose.proc.SecurityContext> {
    java.util.List<? extends java.security.Key> selectJWEKeys(com.nimbusds.jose.JWEHeader jWEHeader, C c) throws com.nimbusds.jose.KeySourceException;
}
