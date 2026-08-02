package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public interface VerificationKeyResolver {
    java.security.Key resolveKey(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException;
}
