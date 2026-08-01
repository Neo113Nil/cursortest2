package com.chartboost.sdk.impl;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class ph {
    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return System.nanoTime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }
}
