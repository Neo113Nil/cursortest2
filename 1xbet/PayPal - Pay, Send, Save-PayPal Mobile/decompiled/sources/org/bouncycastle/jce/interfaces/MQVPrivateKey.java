package org.bouncycastle.jce.interfaces;

/* loaded from: classes17.dex */
public interface MQVPrivateKey extends java.security.PrivateKey {
    java.security.PrivateKey getEphemeralPrivateKey();

    java.security.PublicKey getEphemeralPublicKey();

    java.security.PrivateKey getStaticPrivateKey();
}
