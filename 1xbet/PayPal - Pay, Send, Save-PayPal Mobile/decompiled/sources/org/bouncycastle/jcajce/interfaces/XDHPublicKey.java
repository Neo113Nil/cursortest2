package org.bouncycastle.jcajce.interfaces;

/* loaded from: classes17.dex */
public interface XDHPublicKey extends org.bouncycastle.jcajce.interfaces.XDHKey, java.security.PublicKey {
    java.math.BigInteger getU();

    byte[] getUEncoding();
}
