package org.jose4j.jwa;

/* loaded from: classes18.dex */
public interface Algorithm {
    java.lang.String getAlgorithmIdentifier();

    java.lang.String getJavaAlgorithm();

    org.jose4j.keys.KeyPersuasion getKeyPersuasion();

    java.lang.String getKeyType();

    boolean isAvailable();
}
