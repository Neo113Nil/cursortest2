package org.bouncycastle.jce.interfaces;

/* loaded from: classes17.dex */
public interface MQVPublicKey extends java.security.PublicKey {
    java.security.PublicKey getEphemeralKey();

    java.security.PublicKey getStaticKey();
}
