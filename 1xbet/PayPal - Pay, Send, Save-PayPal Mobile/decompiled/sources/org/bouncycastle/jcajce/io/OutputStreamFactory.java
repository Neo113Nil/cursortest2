package org.bouncycastle.jcajce.io;

/* loaded from: classes17.dex */
public class OutputStreamFactory {
    public static java.io.OutputStream createStream(javax.crypto.Mac mac) {
        return new org.bouncycastle.jcajce.io.MacUpdatingOutputStream(mac);
    }

    public static java.io.OutputStream createStream(java.security.Signature signature) {
        return new org.bouncycastle.jcajce.io.SignatureUpdatingOutputStream(signature);
    }

    public static java.io.OutputStream createStream(java.security.MessageDigest messageDigest) {
        return new org.bouncycastle.jcajce.io.DigestUpdatingOutputStream(messageDigest);
    }
}
