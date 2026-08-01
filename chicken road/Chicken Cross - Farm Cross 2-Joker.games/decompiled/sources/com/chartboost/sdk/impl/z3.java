package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* loaded from: classes4.dex */
public abstract class z3 {
    public static final int b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j = cacheSpan.lastTouchTimestamp;
        long j2 = cacheSpan2.lastTouchTimestamp;
        return j - j2 == 0 ? cacheSpan.compareTo(cacheSpan2) : j < j2 ? -1 : 1;
    }
}
