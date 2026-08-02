package com.google.protobuf;

/* loaded from: classes9.dex */
final class Java8Compatibility {
    static void clear(java.nio.Buffer buffer) {
        buffer.clear();
    }

    static void flip(java.nio.Buffer buffer) {
        buffer.flip();
    }

    static void limit(java.nio.Buffer buffer, int i) {
        buffer.limit(i);
    }

    static void mark(java.nio.Buffer buffer) {
        buffer.mark();
    }

    static void position(java.nio.Buffer buffer, int i) {
        buffer.position(i);
    }

    static void reset(java.nio.Buffer buffer) {
        buffer.reset();
    }

    private Java8Compatibility() {
    }
}
