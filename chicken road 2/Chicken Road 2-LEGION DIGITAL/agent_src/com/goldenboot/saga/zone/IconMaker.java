package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class IconMaker {
    public static final Object evictLayout = new Object();

    public static final int clipOrigin(int i) {
        return evictLayout(1, i);
    }

    public static final PinchPage detachStream(int i, boolean z, Object obj, NotificationFence notificationFence, int i2) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1371)");
        }
        Object clipOrigin = notificationFence.clipOrigin();
        if (clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new DpadEdge(i, z, obj);
            notificationFence.bindBody(clipOrigin);
        }
        DpadEdge dpadEdge = (DpadEdge) clipOrigin;
        dpadEdge.notifyMessage(obj);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return dpadEdge;
    }

    public static final int evictLayout(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final PinchPage growPayload(int i, boolean z, Object obj) {
        return new DpadEdge(i, z, obj);
    }

    public static final int injectMetric(int i) {
        return evictLayout(2, i);
    }

    public static final boolean releaseHeader(FeedbackWriter feedbackWriter, FeedbackWriter feedbackWriter2) {
        if (feedbackWriter == null) {
            return true;
        }
        if (!(feedbackWriter instanceof ColumnValve) || !(feedbackWriter2 instanceof ColumnValve)) {
            return false;
        }
        ColumnValve columnValve = (ColumnValve) feedbackWriter;
        return !columnValve.purgeNode() || Intrinsics.areEqual(feedbackWriter, feedbackWriter2) || Intrinsics.areEqual(columnValve.updateTimer(), ((ColumnValve) feedbackWriter2).updateTimer());
    }
}
