package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AttrSemaphore;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ChannelProvider {
    public static final StackTraceElement evictLayout = new DividerStage().evictLayout();
    public static final String growPayload;
    public static final String injectMetric;

    static {
        Object growPayload2;
        Object growPayload3;
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            growPayload2 = AttrSemaphore.growPayload(ConfigValidator.class.getCanonicalName());
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            growPayload2 = AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
        if (AttrSemaphore.detachStream(growPayload2) != null) {
            growPayload2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        growPayload = (String) growPayload2;
        try {
            growPayload3 = AttrSemaphore.growPayload(ChannelProvider.class.getCanonicalName());
        } catch (Throwable th2) {
            AttrSemaphore.ActivityMutator activityMutator3 = AttrSemaphore.notifyMessage;
            growPayload3 = AttrSemaphore.growPayload(ColumnForger.evictLayout(th2));
        }
        if (AttrSemaphore.detachStream(growPayload3) != null) {
            growPayload3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        injectMetric = (String) growPayload3;
    }

    public static final Throwable evictLayout(Throwable th) {
        return th;
    }
}
