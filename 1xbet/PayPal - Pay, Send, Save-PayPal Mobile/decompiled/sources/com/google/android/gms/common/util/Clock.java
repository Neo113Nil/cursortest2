package com.google.android.gms.common.util;

/* loaded from: classes4.dex */
public interface Clock {
    default long currentThreadTimeMillis() {
        return android.os.SystemClock.currentThreadTimeMillis();
    }

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}
