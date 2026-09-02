package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class FeedbackHub {
    public static final boolean evictLayout = false;
    public static final ThreadLocal[] growPayload;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        growPayload = threadLocalArr;
    }

    public static final boolean evictLayout() {
        return evictLayout;
    }
}
