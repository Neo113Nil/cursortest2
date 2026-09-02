package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ClipboardTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class InitHelper {
    public static final float[] applyTask(int i, float f, float f2, float f3, float f4) {
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f5 = i;
            long connectJob = ActivitySupervisor.connectJob(f, (ActivitySupervisor.flushSample() / f5) * 2 * i3, 0L, 4, null);
            fArr[i2] = SlotVersion.flushSample(connectJob) + f3;
            fArr[i2 + 1] = SlotVersion.updateTimer(connectJob) + f4;
            long connectJob2 = ActivitySupervisor.connectJob(f2, (ActivitySupervisor.flushSample() / f5) * ((i3 * 2) + 1), 0L, 4, null);
            int i4 = i2 + 3;
            fArr[i2 + 2] = SlotVersion.flushSample(connectJob2) + f3;
            i2 += 4;
            fArr[i4] = SlotVersion.updateTimer(connectJob2) + f4;
        }
        return fArr;
    }

    public static final ClipboardTimer clipOrigin(ClipboardTimer.ActivityMutator activityMutator, int i, float f, float f2, DialogInterpreter rounding) {
        Intrinsics.checkNotNullParameter(activityMutator, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return updateTimer(activityMutator, i, f, f2, rounding, null, null, 0.0f, 0.0f, 240, null);
    }

    public static /* synthetic */ ClipboardTimer detachStream(ClipboardTimer.ActivityMutator activityMutator, int i, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        return injectMetric(activityMutator, i, f, f2, f3);
    }

    public static final ClipboardTimer evictLayout(ClipboardTimer.ActivityMutator activityMutator) {
        Intrinsics.checkNotNullParameter(activityMutator, "<this>");
        return detachStream(activityMutator, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static final ClipboardTimer flushSample(ClipboardTimer.ActivityMutator activityMutator, int i, float f, float f2, DialogInterpreter rounding, DialogInterpreter dialogInterpreter, List list, float f3, float f4) {
        Intrinsics.checkNotNullParameter(activityMutator, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f2 >= f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        if (list == null && dialogInterpreter != null) {
            WatcherLogger attachConfig = CellEntry.attachConfig(0, i);
            list = new ArrayList();
            Iterator it = attachConfig.iterator();
            while (it.hasNext()) {
                ((SubscriberChunk) it).nextInt();
                ReceiverCollection.expandArgs(list, CursorBuilder.notifyMessage(rounding, dialogInterpreter));
            }
        }
        return GlobalFence.injectMetric(applyTask(i, f, f2, f3, f4), rounding, list, f3, f4);
    }

    public static final ClipboardTimer growPayload(ClipboardTimer.ActivityMutator activityMutator, int i) {
        Intrinsics.checkNotNullParameter(activityMutator, "<this>");
        return detachStream(activityMutator, i, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final ClipboardTimer injectMetric(ClipboardTimer.ActivityMutator activityMutator, int i, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(activityMutator, "<this>");
        if (i >= 3) {
            return GlobalFence.detachStream(i, f / ((float) Math.cos(ActivitySupervisor.flushSample() / i)), f2, f3, new DialogInterpreter(f, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static final ClipboardTimer releaseHeader(ClipboardTimer.ActivityMutator activityMutator, float f, float f2, DialogInterpreter rounding, List list, float f3, float f4) {
        Intrinsics.checkNotNullParameter(activityMutator, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float f5 = 2;
        float f6 = f / f5;
        float f7 = f3 - f6;
        float f8 = f2 / f5;
        float f9 = f4 - f8;
        float f10 = f6 + f3;
        float f11 = f8 + f4;
        return GlobalFence.injectMetric(new float[]{f10, f11, f7, f11, f7, f9, f10, f9}, rounding, list, f3, f4);
    }

    public static /* synthetic */ ClipboardTimer updateTimer(ClipboardTimer.ActivityMutator activityMutator, int i, float f, float f2, DialogInterpreter dialogInterpreter, DialogInterpreter dialogInterpreter2, List list, float f3, float f4, int i2, Object obj) {
        return flushSample(activityMutator, i, (i2 & 2) != 0 ? 1.0f : f, (i2 & 4) != 0 ? 0.5f : f2, (i2 & 8) != 0 ? DialogInterpreter.detachStream : dialogInterpreter, (i2 & 16) != 0 ? null : dialogInterpreter2, (i2 & 32) == 0 ? list : null, (i2 & 64) != 0 ? 0.0f : f3, (i2 & ContentOperation.SpotShadowColor) != 0 ? 0.0f : f4);
    }
}
