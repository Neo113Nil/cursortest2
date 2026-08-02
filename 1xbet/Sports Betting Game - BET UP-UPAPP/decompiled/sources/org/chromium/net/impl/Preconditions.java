package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkDirect(ByteBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static void checkHasRemaining(ByteBuffer buffer) {
        if (!buffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
