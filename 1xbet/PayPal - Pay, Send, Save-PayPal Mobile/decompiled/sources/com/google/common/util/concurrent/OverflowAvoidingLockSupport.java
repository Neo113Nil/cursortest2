package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    static void parkNanos(java.lang.Object obj, long j) {
        java.util.concurrent.locks.LockSupport.parkNanos(obj, java.lang.Math.min(j, MAX_NANOSECONDS_THRESHOLD));
    }
}
