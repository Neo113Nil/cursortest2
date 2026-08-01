package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcgf extends ScheduledThreadPoolExecutor {
    zzcgf(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
