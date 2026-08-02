package com.google.common.base;

/* loaded from: classes9.dex */
final class Internal {
    static long toNanosSaturated(java.time.Duration duration) {
        try {
            return duration.toNanos();
        } catch (java.lang.ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    private Internal() {
    }
}
