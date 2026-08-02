package com.nimbusds.jose.proc;

/* loaded from: classes10.dex */
public interface JOSEProcessor<C extends com.nimbusds.jose.proc.SecurityContext> {
    com.nimbusds.jose.Payload process(com.nimbusds.jose.JOSEObject jOSEObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jose.Payload process(com.nimbusds.jose.JWEObject jWEObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jose.Payload process(com.nimbusds.jose.JWSObject jWSObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jose.Payload process(com.nimbusds.jose.PlainObject plainObject, C c) throws com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;

    com.nimbusds.jose.Payload process(java.lang.String str, C c) throws java.text.ParseException, com.nimbusds.jose.proc.BadJOSEException, com.nimbusds.jose.JOSEException;
}
