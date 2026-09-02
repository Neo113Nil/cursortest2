package com.goldenboot.saga.zone;

import android.R;

/* loaded from: classes.dex */
public abstract class GroupCoordinator {
    public static int clipOrigin = 0;
    public static int detachStream = 2;
    public static int flushSample = 1;
    public static int growPayload = 0;
    public static int injectMetric = 1;
    public static int[] evictLayout = {R.attr.name, R.attr.id, R.attr.tag};
    public static int[] releaseHeader = {R.attr.name, R.attr.tag};
}
