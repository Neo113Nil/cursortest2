package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ClipboardTimer {
    public static final ActivityMutator releaseHeader = new ActivityMutator(null);
    public final List detachStream;
    public final List evictLayout;
    public final float growPayload;
    public final float injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipboardTimer(List features, float f, float f2) {
        List list;
        List list2;
        ListenerCollector listenerCollector;
        List evictLayout;
        Intrinsics.checkNotNullParameter(features, "features");
        this.evictLayout = features;
        this.growPayload = f;
        this.injectMetric = f2;
        List injectMetric = DefaultBenchmark.injectMetric();
        int i = 0;
        ListenerCollector listenerCollector2 = null;
        if (features.size() <= 0 || ((SetupArchive) features.get(0)).evictLayout().size() != 3) {
            list = null;
            list2 = null;
        } else {
            AlarmFacilitator peekRevision = ((ListenerCollector) ((SetupArchive) features.get(0)).evictLayout().get(1)).peekRevision(0.5f);
            ListenerCollector listenerCollector3 = (ListenerCollector) peekRevision.evictLayout();
            ListenerCollector listenerCollector4 = (ListenerCollector) peekRevision.growPayload();
            list2 = CursorBuilder.attachConfig(((SetupArchive) features.get(0)).evictLayout().get(0), listenerCollector3);
            list = CursorBuilder.attachConfig(listenerCollector4, ((SetupArchive) features.get(0)).evictLayout().get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i2 = 0;
            ListenerCollector listenerCollector5 = null;
            while (true) {
                if (i2 == 0 && list != null) {
                    evictLayout = list;
                } else if (i2 != this.evictLayout.size()) {
                    evictLayout = ((SetupArchive) this.evictLayout.get(i2)).evictLayout();
                } else if (list2 == null) {
                    break;
                } else {
                    evictLayout = list2;
                }
                int size2 = evictLayout.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ListenerCollector listenerCollector6 = (ListenerCollector) evictLayout.get(i3);
                    if (!listenerCollector6.notifyMessage()) {
                        if (listenerCollector5 != null) {
                            injectMetric.add(listenerCollector5);
                        }
                        if (listenerCollector2 == null) {
                            listenerCollector2 = listenerCollector6;
                            listenerCollector5 = listenerCollector2;
                        } else {
                            listenerCollector5 = listenerCollector6;
                        }
                    } else if (listenerCollector5 != null) {
                        listenerCollector5.popBlueprint()[6] = listenerCollector6.detachStream();
                        listenerCollector5.popBlueprint()[7] = listenerCollector6.releaseHeader();
                    }
                }
                if (i2 == size) {
                    break;
                } else {
                    i2++;
                }
            }
            listenerCollector = listenerCollector2;
            listenerCollector2 = listenerCollector5;
        } else {
            listenerCollector = null;
        }
        if (listenerCollector2 != null && listenerCollector != null) {
            injectMetric.add(PipelineVersion.evictLayout(listenerCollector2.growPayload(), listenerCollector2.injectMetric(), listenerCollector2.clipOrigin(), listenerCollector2.flushSample(), listenerCollector2.updateTimer(), listenerCollector2.applyTask(), listenerCollector.growPayload(), listenerCollector.injectMetric()));
        }
        List evictLayout2 = DefaultBenchmark.evictLayout(injectMetric);
        this.detachStream = evictLayout2;
        Object obj = evictLayout2.get(evictLayout2.size() - 1);
        int size3 = evictLayout2.size();
        while (i < size3) {
            ListenerCollector listenerCollector7 = (ListenerCollector) this.detachStream.get(i);
            ListenerCollector listenerCollector8 = (ListenerCollector) obj;
            if (Math.abs(listenerCollector7.growPayload() - listenerCollector8.detachStream()) > 1.0E-4f || Math.abs(listenerCollector7.injectMetric() - listenerCollector8.releaseHeader()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i++;
            obj = listenerCollector7;
        }
    }

    public static /* synthetic */ float[] injectMetric(ClipboardTimer clipboardTimer, float[] fArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = new float[4];
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return clipboardTimer.growPayload(fArr, z);
    }

    public final ClipboardTimer applyTask(ParallelPartition f) {
        Intrinsics.checkNotNullParameter(f, "f");
        long peekRevision = SlotVersion.peekRevision(NavBarMaker.growPayload(this.growPayload, this.injectMetric), f);
        List injectMetric = DefaultBenchmark.injectMetric();
        int size = this.evictLayout.size();
        for (int i = 0; i < size; i++) {
            injectMetric.add(((SetupArchive) this.evictLayout.get(i)).growPayload(f));
        }
        return new ClipboardTimer(DefaultBenchmark.evictLayout(injectMetric), SlotVersion.flushSample(peekRevision), SlotVersion.updateTimer(peekRevision));
    }

    public final float clipOrigin() {
        return this.injectMetric;
    }

    public final float[] detachStream(float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.detachStream.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            ListenerCollector listenerCollector = (ListenerCollector) this.detachStream.get(i);
            float releaseHeader2 = ActivitySupervisor.releaseHeader(listenerCollector.growPayload() - this.growPayload, listenerCollector.injectMetric() - this.injectMetric);
            long drawField = listenerCollector.drawField(0.5f);
            f = Math.max(f, Math.max(releaseHeader2, ActivitySupervisor.releaseHeader(SlotVersion.flushSample(drawField) - this.growPayload, SlotVersion.updateTimer(drawField) - this.injectMetric)));
        }
        float sqrt = (float) Math.sqrt(f);
        float f2 = this.growPayload;
        bounds[0] = f2 - sqrt;
        float f3 = this.injectMetric;
        bounds[1] = f3 - sqrt;
        bounds[2] = f2 + sqrt;
        bounds[3] = f3 + sqrt;
        return bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClipboardTimer) {
            return Intrinsics.areEqual(this.evictLayout, ((ClipboardTimer) obj).evictLayout);
        }
        return false;
    }

    public final float[] evictLayout(float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return injectMetric(this, bounds, false, 2, null);
    }

    public final List flushSample() {
        return this.detachStream;
    }

    public final float[] growPayload(float[] bounds, boolean z) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.detachStream.size();
        float f = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            ((ListenerCollector) this.detachStream.get(i)).evictLayout(bounds, z);
            f2 = Math.min(f2, bounds[0]);
            f3 = Math.min(f3, bounds[1]);
            f = Math.max(f, bounds[2]);
            f4 = Math.max(f4, bounds[3]);
        }
        bounds[0] = f2;
        bounds[1] = f3;
        bounds[2] = f;
        bounds[3] = f4;
        return bounds;
    }

    public int hashCode() {
        return this.evictLayout.hashCode();
    }

    public final float releaseHeader() {
        return this.growPayload;
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + CursorCollector.computeTarget(this.detachStream, null, null, null, 0, null, null, 63, null) + " || Features = " + CursorCollector.computeTarget(this.evictLayout, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.growPayload + ", " + this.injectMetric + ")]";
    }

    public final List updateTimer() {
        return this.evictLayout;
    }
}
