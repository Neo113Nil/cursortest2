package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public interface JwsCustomizer {
    void customize(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list);
}
