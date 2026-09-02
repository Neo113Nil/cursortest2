package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.HeaderGuard;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class StylusPlanner {
    public int applyTask;
    public int clipOrigin;
    public int detachStream;
    public final ActivityHelper evictLayout;
    public final List flushSample;
    public final ArrayList growPayload;
    public int injectMetric;
    public int releaseHeader;
    public List updateTimer;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements SnackbarInstantiator {
        public static final BounceHandler evictLayout = new BounceHandler();
        public static int growPayload;
        public static int injectMetric;

        public void evictLayout(int i) {
            growPayload = i;
        }

        public void growPayload(int i) {
            injectMetric = i;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow {
        public final int evictLayout;
        public final List growPayload;

        public FeedbackFlow(int i, List list) {
            this.evictLayout = i;
            this.growPayload = list;
        }

        public final int evictLayout() {
            return this.evictLayout;
        }

        public final List growPayload() {
            return this.growPayload;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends Lambda implements TouchRecord {
        public final /* synthetic */ int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayerUseCase(int i) {
            super(1);
            this.reduceScope = i;
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(ActivityMutator activityMutator) {
            return Integer.valueOf(activityMutator.evictLayout() - this.reduceScope);
        }
    }

    public StylusPlanner(ActivityHelper activityHelper) {
        this.evictLayout = activityHelper;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new ActivityMutator(i, i, 2, null));
        this.growPayload = arrayList;
        this.clipOrigin = -1;
        this.flushSample = new ArrayList();
        this.updateTimer = CursorBuilder.peekRevision();
    }

    public final int applyTask(int i, int i2) {
        BounceHandler bounceHandler = BounceHandler.evictLayout;
        bounceHandler.evictLayout(i2);
        bounceHandler.growPayload(this.applyTask);
        HeaderGuard.ActivityMutator activityMutator = this.evictLayout.clipOrigin().get(i);
        return HoverGuard.detachStream(((HoverGuard) ((ApplicationCollection) activityMutator.injectMetric()).injectMetric().invoke(bounceHandler, Integer.valueOf(i - activityMutator.growPayload()))).flushSample());
    }

    public final int clipOrigin() {
        return this.evictLayout.clipOrigin().evictLayout();
    }

    public final int detachStream(int i) {
        int i2 = 0;
        if (clipOrigin() <= 0) {
            return 0;
        }
        if (i >= clipOrigin()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.evictLayout.applyTask()) {
            return i / this.applyTask;
        }
        int drawField = CursorBuilder.drawField(this.growPayload, 0, 0, new LayerUseCase(i), 3, null);
        int i3 = 2;
        if (drawField < 0) {
            drawField = (-drawField) - 2;
        }
        int evictLayout = evictLayout() * drawField;
        int evictLayout2 = ((ActivityMutator) this.growPayload.get(drawField)).evictLayout();
        if (evictLayout2 > i) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i4 = 0;
        while (true) {
            if (evictLayout2 >= i) {
                break;
            }
            int i5 = evictLayout2 + 1;
            int applyTask = applyTask(evictLayout2, this.applyTask - i4);
            i4 += applyTask;
            int i6 = this.applyTask;
            if (i4 >= i6) {
                if (i4 == i6) {
                    evictLayout++;
                    i4 = 0;
                } else {
                    evictLayout++;
                    i4 = applyTask;
                }
            }
            if (evictLayout % evictLayout() == 0 && evictLayout / evictLayout() >= this.growPayload.size()) {
                this.growPayload.add(new ActivityMutator(i5 - (i4 <= 0 ? 0 : 1), i2, i3, null));
            }
            evictLayout2 = i5;
        }
        return i4 + applyTask(i, this.applyTask - i4) > this.applyTask ? evictLayout + 1 : evictLayout;
    }

    public final int evictLayout() {
        return ((int) Math.sqrt((clipOrigin() * 1.0d) / this.applyTask)) + 1;
    }

    public final void flushSample() {
        this.growPayload.clear();
        int i = 0;
        this.growPayload.add(new ActivityMutator(i, i, 2, null));
        this.injectMetric = 0;
        this.detachStream = 0;
        this.releaseHeader = 0;
        this.clipOrigin = -1;
        this.flushSample.clear();
    }

    public final List growPayload(int i) {
        if (i == this.updateTimer.size()) {
            return this.updateTimer;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(HoverGuard.evictLayout(ServerSource.evictLayout(1)));
        }
        this.updateTimer = arrayList;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (r7 < r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FeedbackFlow injectMetric(int i) {
        int i2;
        int i3;
        int i4;
        if (!this.evictLayout.applyTask()) {
            int i5 = i * this.applyTask;
            return new FeedbackFlow(i5, growPayload(CellEntry.releaseHeader(CellEntry.updateTimer(this.applyTask, clipOrigin() - i5), 0)));
        }
        boolean z = true;
        int min = Math.min(i / evictLayout(), this.growPayload.size() - 1);
        int evictLayout = evictLayout() * min;
        int evictLayout2 = ((ActivityMutator) this.growPayload.get(min)).evictLayout();
        int growPayload = ((ActivityMutator) this.growPayload.get(min)).growPayload();
        int i6 = this.injectMetric;
        if (evictLayout <= i6 && i6 <= i) {
            evictLayout2 = this.detachStream;
            growPayload = this.releaseHeader;
            evictLayout = i6;
        } else if (min == this.clipOrigin && (i2 = i - evictLayout) < this.flushSample.size()) {
            evictLayout2 = ((Number) this.flushSample.get(i2)).intValue();
            evictLayout = i;
            growPayload = 0;
        }
        if (evictLayout % evictLayout() == 0) {
            int evictLayout3 = evictLayout();
            int i7 = i - evictLayout;
            if (2 <= i7) {
            }
        }
        z = false;
        if (z) {
            this.clipOrigin = min;
            this.flushSample.clear();
        }
        if (evictLayout > i) {
            throw new IllegalStateException("currentLine > lineIndex");
        }
        while (evictLayout < i && evictLayout2 < clipOrigin()) {
            if (z) {
                this.flushSample.add(Integer.valueOf(evictLayout2));
            }
            int i8 = 0;
            while (i8 < this.applyTask && evictLayout2 < clipOrigin()) {
                if (growPayload == 0) {
                    i4 = growPayload;
                    growPayload = applyTask(evictLayout2, this.applyTask - i8);
                } else {
                    i4 = 0;
                }
                i8 += growPayload;
                if (i8 > this.applyTask) {
                    break;
                }
                evictLayout2++;
                growPayload = i4;
            }
            evictLayout++;
            if (evictLayout % evictLayout() == 0 && evictLayout2 < clipOrigin()) {
                if (this.growPayload.size() != evictLayout / evictLayout()) {
                    throw new IllegalStateException("invalid starting point");
                }
                this.growPayload.add(new ActivityMutator(evictLayout2, growPayload));
            }
        }
        this.injectMetric = i;
        this.detachStream = evictLayout2;
        this.releaseHeader = growPayload;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = evictLayout2;
        while (i9 < this.applyTask && i10 < clipOrigin()) {
            if (growPayload == 0) {
                int i11 = growPayload;
                growPayload = applyTask(i10, this.applyTask - i9);
                i3 = i11;
            } else {
                i3 = 0;
            }
            i9 += growPayload;
            if (i9 > this.applyTask) {
                break;
            }
            i10++;
            arrayList.add(HoverGuard.evictLayout(ServerSource.evictLayout(growPayload)));
            growPayload = i3;
        }
        return new FeedbackFlow(evictLayout2, arrayList);
    }

    public final int releaseHeader() {
        return this.applyTask;
    }

    public final void updateTimer(int i) {
        if (i != this.applyTask) {
            this.applyTask = i;
            flushSample();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public final int evictLayout;
        public final int growPayload;

        public ActivityMutator(int i, int i2) {
            this.evictLayout = i;
            this.growPayload = i2;
        }

        public final int evictLayout() {
            return this.evictLayout;
        }

        public final int growPayload() {
            return this.growPayload;
        }

        public /* synthetic */ ActivityMutator(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
