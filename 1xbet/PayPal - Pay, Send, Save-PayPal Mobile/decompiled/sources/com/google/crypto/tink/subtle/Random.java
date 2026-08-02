package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class Random {
    public static byte[] randBytes(int i) {
        return com.google.crypto.tink.internal.Random.randBytes(i);
    }

    public static final int randInt(int i) {
        return com.google.crypto.tink.internal.Random.randInt(i);
    }

    public static final int randInt() {
        return com.google.crypto.tink.internal.Random.randInt();
    }

    private Random() {
    }
}
