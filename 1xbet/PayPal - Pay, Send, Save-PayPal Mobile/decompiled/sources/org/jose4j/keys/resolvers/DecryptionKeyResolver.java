package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public interface DecryptionKeyResolver {
    java.security.Key resolveKey(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException;
}
