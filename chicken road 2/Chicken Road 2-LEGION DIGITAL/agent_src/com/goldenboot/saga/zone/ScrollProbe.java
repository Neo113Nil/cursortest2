package com.goldenboot.saga.zone;

import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ScrollProbe {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements TabAllocator {
        public final /* synthetic */ ElevationStack notifyMessage;
        public final /* synthetic */ TabAllocator reduceScope;

        public ActivityMutator(TabAllocator tabAllocator, ElevationStack elevationStack) {
            this.reduceScope = tabAllocator;
            this.notifyMessage = elevationStack;
        }

        @Override // com.goldenboot.saga.zone.TabAllocator
        public List applyTask(Integer num) {
            List applyTask = this.reduceScope.applyTask(null);
            int serializeTask = this.notifyMessage.serializeTask();
            if (serializeTask < 0) {
                return applyTask;
            }
            ElevationStack elevationStack = this.notifyMessage;
            return CursorCollector.refreshCounter(BannerRunner.growPayload(elevationStack, num, serializeTask, Integer.valueOf(elevationStack.updateConstraint(serializeTask))), applyTask);
        }
    }

    public static final int applyTask(ElevationStack elevationStack, TouchEvaluator touchEvaluator, ToastBinder toastBinder) {
        int syncScope = elevationStack.syncScope(touchEvaluator);
        if (!(elevationStack.resetValue() < syncScope)) {
            MorphPatch.inflateAdapter("Check failed");
        }
        popBlueprint(elevationStack, toastBinder, syncScope);
        int updateTimer = updateTimer(elevationStack);
        while (elevationStack.resetValue() < syncScope) {
            if (elevationStack.protectGauge(syncScope)) {
                if (elevationStack.peekDescriptor()) {
                    toastBinder.detachStream(elevationStack.subscribeEvent(elevationStack.resetValue()));
                    updateTimer = 0;
                }
                elevationStack.prependOptions();
            } else {
                updateTimer += elevationStack.closeSource();
            }
        }
        if (!(elevationStack.resetValue() == syncScope)) {
            MorphPatch.inflateAdapter("Check failed");
        }
        return updateTimer;
    }

    public static final Throwable clipOrigin(Throwable th, final TabAllocator tabAllocator, final ElevationStack elevationStack, final TouchEvaluator touchEvaluator) {
        return tabAllocator == null ? th : BadgeCounter.growPayload(th, new ElevationNode() { // from class: com.goldenboot.saga.zone.StyleBus
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                List flushSample;
                flushSample = ScrollProbe.flushSample(TouchEvaluator.this, elevationStack, tabAllocator);
                return flushSample;
            }
        });
    }

    public static final TabAllocator drawField(TabAllocator tabAllocator, ElevationStack elevationStack) {
        return new ActivityMutator(tabAllocator, elevationStack);
    }

    public static final List flushSample(TouchEvaluator touchEvaluator, ElevationStack elevationStack, TabAllocator tabAllocator) {
        if (touchEvaluator != null) {
            elevationStack.compressBody(touchEvaluator);
        }
        List injectMetric = BannerRunner.injectMetric(elevationStack, null, 0, null, 7, null);
        SharedMutex sharedMutex = (SharedMutex) CursorCollector.handleFooter(injectMetric);
        Integer injectMetric2 = sharedMutex != null ? sharedMutex.injectMetric() : null;
        List applyTask = tabAllocator.applyTask(injectMetric2);
        if (injectMetric2 != null && !applyTask.isEmpty()) {
            applyTask = CursorCollector.refreshCounter(DefaultBenchmark.releaseHeader(SharedMutex.growPayload((SharedMutex) CursorCollector.formatPosition(applyTask), null, injectMetric2, 1, null)), CursorCollector.connectComponent(applyTask, 1));
        }
        return CursorCollector.refreshCounter(injectMetric, applyTask);
    }

    public static final void popBlueprint(ElevationStack elevationStack, ToastBinder toastBinder, int i) {
        while (!elevationStack.compressVersion(i)) {
            elevationStack.closeComponent();
            if (elevationStack.growCallback(elevationStack.serializeTask())) {
                toastBinder.applyTask();
            }
            elevationStack.updateAction();
        }
    }

    public static final int updateTimer(ElevationStack elevationStack) {
        int resetValue = elevationStack.resetValue();
        int serializeTask = elevationStack.serializeTask();
        while (serializeTask >= 0 && !elevationStack.growCallback(serializeTask)) {
            serializeTask = elevationStack.updateConstraint(serializeTask);
        }
        int i = serializeTask + 1;
        int i2 = 0;
        while (i < resetValue) {
            if (elevationStack.refreshCounter(resetValue, i)) {
                if (elevationStack.growCallback(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += elevationStack.growCallback(i) ? 1 : elevationStack.executeConfig(i);
                i += elevationStack.purgeMetric(i);
            }
        }
        return i2;
    }
}
