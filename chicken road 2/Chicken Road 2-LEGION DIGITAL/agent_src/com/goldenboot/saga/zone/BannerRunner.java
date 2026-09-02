package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.PagerAnalyzer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class BannerRunner {
    public static final Integer clipOrigin(PointerEdge pointerEdge, WorkerIndex workerIndex, int i, int i2) {
        Integer clipOrigin;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int storeCharset = pointerEdge.storeCharset(i) + i;
            if (pointerEdge.filterPayload(i) && pointerEdge.flattenPackage(i) == 206 && Intrinsics.areEqual(pointerEdge.injectConstraint(i), MorphPatch.inflateEdge())) {
                Object syncScope = pointerEdge.syncScope(i, 0);
                PagerAnalyzer.ActivityMutator activityMutator = syncScope instanceof PagerAnalyzer.ActivityMutator ? (PagerAnalyzer.ActivityMutator) syncScope : null;
                if (activityMutator != null && Intrinsics.areEqual(activityMutator.evictLayout(), workerIndex)) {
                    return Integer.valueOf(i);
                }
            }
            if (pointerEdge.releaseHeader(i) && (clipOrigin = clipOrigin(pointerEdge, workerIndex, i + 1, storeCharset)) != null) {
                return Integer.valueOf(clipOrigin.intValue());
            }
            i = storeCharset;
        }
    }

    public static final ToolbarGenerator detachStream(ComponentSender componentSender, TouchRecord touchRecord) {
        PointerEdge unlockMessage = componentSender.unlockMessage();
        try {
            Ref.IntRef intRef = new Ref.IntRef();
            while (intRef.element < componentSender.syncScope()) {
                if (unlockMessage.unlockMessage(intRef.element) && ((Boolean) touchRecord.invoke(unlockMessage.dispatchTimezone(intRef.element))).booleanValue()) {
                    return new ToolbarGenerator(intRef.element, null);
                }
                int resumeSignature = unlockMessage.resumeSignature(intRef.element);
                for (int i = 0; i < resumeSignature; i++) {
                    if (((Boolean) touchRecord.invoke(unlockMessage.syncScope(intRef.element, i))).booleanValue()) {
                        return new ToolbarGenerator(intRef.element, Integer.valueOf(i));
                    }
                }
                intRef.element++;
            }
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            return null;
        } finally {
            unlockMessage.detachStream();
        }
    }

    public static final List evictLayout(PointerEdge pointerEdge) {
        if (pointerEdge.applyTask() || pointerEdge.decodePath() == 0) {
            return CursorBuilder.peekRevision();
        }
        DefaultBroadcaster defaultBroadcaster = new DefaultBroadcaster(pointerEdge);
        int purgeNode = pointerEdge.purgeNode();
        Object valueOf = Integer.valueOf(pointerEdge.drawScope());
        while (purgeNode >= 0) {
            defaultBroadcaster.clipOrigin(pointerEdge.expandArgs().mapJob(purgeNode), valueOf);
            valueOf = pointerEdge.evictLayout(purgeNode);
            purgeNode = pointerEdge.prepareTask(purgeNode);
        }
        return defaultBroadcaster.applyTask();
    }

    public static final List flushSample(PointerEdge pointerEdge, int i, Object obj) {
        DefaultBroadcaster defaultBroadcaster = new DefaultBroadcaster(pointerEdge);
        int prepareTask = pointerEdge.prepareTask(i);
        TouchEvaluator evictLayout = pointerEdge.evictLayout(i);
        while (i >= 0) {
            defaultBroadcaster.clipOrigin(pointerEdge.expandArgs().mapJob(i), obj);
            if (prepareTask >= 0) {
                TouchEvaluator touchEvaluator = evictLayout;
                evictLayout = pointerEdge.evictLayout(prepareTask);
                i = prepareTask;
                prepareTask = pointerEdge.prepareTask(prepareTask);
                obj = touchEvaluator;
            } else {
                i = prepareTask;
                obj = evictLayout;
            }
        }
        return defaultBroadcaster.applyTask();
    }

    public static final List growPayload(ElevationStack elevationStack, Object obj, int i, Integer num) {
        if (elevationStack.resolveDelta() || elevationStack.injectField() == 0) {
            return CursorBuilder.peekRevision();
        }
        BoxLink boxLink = new BoxLink(elevationStack);
        int intValue = num != null ? num.intValue() : elevationStack.serializeTask() < 0 ? elevationStack.updateConstraint(i) : elevationStack.serializeTask();
        if (obj == null) {
            obj = Integer.valueOf(elevationStack.removeCount(i));
        }
        while (i >= 0) {
            boxLink.clipOrigin(elevationStack.updateRule(i), obj);
            obj = elevationStack.mergeLocale(i);
            if (intValue >= 0) {
                int i2 = intValue;
                intValue = elevationStack.updateConstraint(intValue);
                i = i2;
            } else {
                i = intValue;
            }
        }
        return boxLink.applyTask();
    }

    public static /* synthetic */ List injectMetric(ElevationStack elevationStack, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = elevationStack.resetValue();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return growPayload(elevationStack, obj, i, num);
    }

    public static final Integer releaseHeader(ComponentSender componentSender, WorkerIndex workerIndex) {
        PointerEdge unlockMessage = componentSender.unlockMessage();
        try {
            return clipOrigin(unlockMessage, workerIndex, 0, unlockMessage.decodePath());
        } finally {
            unlockMessage.detachStream();
        }
    }
}
