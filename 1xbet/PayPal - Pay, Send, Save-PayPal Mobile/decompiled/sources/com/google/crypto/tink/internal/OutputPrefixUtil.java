package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class OutputPrefixUtil {
    public static final com.google.crypto.tink.util.Bytes EMPTY_PREFIX = com.google.crypto.tink.util.Bytes.copyFrom(new byte[0]);
    public static final byte LEGACY_START_BYTE = 0;
    public static final int NON_EMPTY_PREFIX_SIZE = 5;
    public static final byte TINK_START_BYTE = 1;

    public static final com.google.crypto.tink.util.Bytes getLegacyOutputPrefix(int i) {
        return com.google.crypto.tink.util.Bytes.copyFrom(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final com.google.crypto.tink.util.Bytes getTinkOutputPrefix(int i) {
        return com.google.crypto.tink.util.Bytes.copyFrom(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }

    private OutputPrefixUtil() {
    }
}
