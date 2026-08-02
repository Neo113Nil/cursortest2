package com.google.common.escape;

/* loaded from: classes9.dex */
final class Platform {
    private static final java.lang.ThreadLocal<char[]> DEST_TL = new java.lang.ThreadLocal<char[]>() { // from class: com.google.common.escape.Platform.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    static char[] charBufferFromThreadLocal() {
        return (char[]) java.util.Objects.requireNonNull(DEST_TL.get());
    }
}
