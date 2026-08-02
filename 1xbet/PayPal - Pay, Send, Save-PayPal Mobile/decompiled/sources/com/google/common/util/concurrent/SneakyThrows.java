package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class SneakyThrows<T extends java.lang.Throwable> {
    static java.lang.Error sneakyThrow(java.lang.Throwable th) {
        throw new com.google.common.util.concurrent.SneakyThrows().throwIt(th);
    }

    private java.lang.Error throwIt(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    private SneakyThrows() {
    }
}
