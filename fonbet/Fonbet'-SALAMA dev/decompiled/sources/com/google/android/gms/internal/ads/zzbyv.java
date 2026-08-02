package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class zzbyv extends ScheduledThreadPoolExecutor {
    public zzbyv(int i7, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
