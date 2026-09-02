package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class AlphaCreator extends RemoteCycle {
    public int clipOrigin;
    public int detachStream;
    public int flushSample;
    public int growPayload;
    public LayoutPipeline[] evictLayout = new LayoutPipeline[16];
    public int[] injectMetric = new int[16];
    public Object[] releaseHeader = new Object[16];

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class ActivityMutator implements ServicePool {
        public int evictLayout;
        public int growPayload;
        public int injectMetric;

        public ActivityMutator() {
        }

        @Override // com.goldenboot.saga.zone.ServicePool
        public Object evictLayout(int i) {
            return AlphaCreator.this.releaseHeader[this.injectMetric + i];
        }

        @Override // com.goldenboot.saga.zone.ServicePool
        public int getInt(int i) {
            return AlphaCreator.this.injectMetric[this.growPayload + i];
        }

        public final LayoutPipeline growPayload() {
            return AlphaCreator.this.evictLayout[this.evictLayout];
        }

        public final boolean injectMetric() {
            if (this.evictLayout >= AlphaCreator.this.growPayload) {
                return false;
            }
            LayoutPipeline growPayload = growPayload();
            this.growPayload += growPayload.detachStream();
            this.injectMetric += growPayload.clipOrigin();
            int i = this.evictLayout + 1;
            this.evictLayout = i;
            return i < AlphaCreator.this.growPayload;
        }
    }

    public final void applyTask(LayoutPipeline layoutPipeline) {
        popBlueprint(layoutPipeline);
    }

    public final boolean clipOrigin() {
        return releaseHeader() == 0;
    }

    public final void connectJob(int i, int i2) {
        Object[] objArr = new Object[growPayload(i, i2)];
        System.arraycopy(this.releaseHeader, 0, objArr, 0, i);
        this.releaseHeader = objArr;
    }

    public final void detachStream(ToastBinder toastBinder, ElevationStack elevationStack, BounceRouter bounceRouter, TabAllocator tabAllocator) {
        if (flushSample()) {
            ActivityMutator activityMutator = new ActivityMutator();
            while (true) {
                ToastBinder toastBinder2 = toastBinder;
                ElevationStack elevationStack2 = elevationStack;
                BounceRouter bounceRouter2 = bounceRouter;
                TabAllocator tabAllocator2 = tabAllocator;
                activityMutator.growPayload().growPayload(activityMutator, toastBinder2, elevationStack2, bounceRouter2, tabAllocator2);
                if (!activityMutator.injectMetric()) {
                    break;
                }
                toastBinder = toastBinder2;
                elevationStack = elevationStack2;
                bounceRouter = bounceRouter2;
                tabAllocator = tabAllocator2;
            }
        }
        evictLayout();
    }

    public final void drawField(int i, int i2) {
        int[] iArr = new int[growPayload(i, i2)];
        InsetsReader.updateTimer(this.injectMetric, iArr, 0, 0, i);
        this.injectMetric = iArr;
    }

    public final void evictLayout() {
        this.growPayload = 0;
        this.detachStream = 0;
        InsetsReader.inflateAdapter(this.releaseHeader, null, 0, this.clipOrigin);
        this.clipOrigin = 0;
    }

    public final boolean flushSample() {
        return releaseHeader() != 0;
    }

    public final int growPayload(int i, int i2) {
        return CellEntry.releaseHeader(i + CellEntry.updateTimer(i, ContentOperation.RotationZ), i2);
    }

    public final void injectMetric(LayoutPipeline layoutPipeline) {
        int i = this.flushSample;
        int detachStream = layoutPipeline.detachStream();
        if (i == ((detachStream == 0 ? 0 : -1) >>> (32 - detachStream))) {
            layoutPipeline.clipOrigin();
        }
    }

    public final void peekRevision() {
        int updateTimer = CellEntry.updateTimer(this.growPayload, ContentOperation.RotationZ);
        int i = this.growPayload;
        LayoutPipeline[] layoutPipelineArr = new LayoutPipeline[updateTimer + i];
        System.arraycopy(this.evictLayout, 0, layoutPipelineArr, 0, i);
        this.evictLayout = layoutPipelineArr;
    }

    public final void popBlueprint(LayoutPipeline layoutPipeline) {
        if (this.growPayload == this.evictLayout.length) {
            peekRevision();
        }
        int detachStream = this.detachStream + layoutPipeline.detachStream();
        int length = this.injectMetric.length;
        if (detachStream > length) {
            drawField(length, detachStream);
        }
        int clipOrigin = this.clipOrigin + layoutPipeline.clipOrigin();
        int length2 = this.releaseHeader.length;
        if (clipOrigin > length2) {
            connectJob(length2, clipOrigin);
        }
        LayoutPipeline[] layoutPipelineArr = this.evictLayout;
        int i = this.growPayload;
        this.growPayload = i + 1;
        layoutPipelineArr[i] = layoutPipeline;
        this.detachStream += layoutPipeline.detachStream();
        this.clipOrigin += layoutPipeline.clipOrigin();
    }

    public final int releaseHeader() {
        return this.growPayload;
    }

    public String toString() {
        return super.toString();
    }

    public final void updateTimer(AlphaCreator alphaCreator) {
        LayoutPipeline[] layoutPipelineArr = this.evictLayout;
        int i = this.growPayload - 1;
        this.growPayload = i;
        LayoutPipeline layoutPipeline = layoutPipelineArr[i];
        layoutPipelineArr[i] = null;
        alphaCreator.popBlueprint(layoutPipeline);
        Object[] objArr = this.releaseHeader;
        Object[] objArr2 = alphaCreator.releaseHeader;
        int clipOrigin = alphaCreator.clipOrigin - layoutPipeline.clipOrigin();
        int clipOrigin2 = this.clipOrigin - layoutPipeline.clipOrigin();
        System.arraycopy(objArr, clipOrigin2, objArr2, clipOrigin, this.clipOrigin - clipOrigin2);
        InsetsReader.inflateAdapter(this.releaseHeader, null, this.clipOrigin - layoutPipeline.clipOrigin(), this.clipOrigin);
        InsetsReader.updateTimer(this.injectMetric, alphaCreator.injectMetric, alphaCreator.detachStream - layoutPipeline.detachStream(), this.detachStream - layoutPipeline.detachStream(), this.detachStream);
        this.clipOrigin -= layoutPipeline.clipOrigin();
        this.detachStream -= layoutPipeline.detachStream();
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public static final void detachStream(AlphaCreator alphaCreator, int i, Object obj, int i2, Object obj2, int i3, Object obj3, int i4, Object obj4) {
            int clipOrigin = alphaCreator.clipOrigin - alphaCreator.evictLayout[alphaCreator.growPayload - 1].clipOrigin();
            Object[] objArr = alphaCreator.releaseHeader;
            objArr[i + clipOrigin] = obj;
            objArr[i2 + clipOrigin] = obj2;
            objArr[i3 + clipOrigin] = obj3;
            objArr[clipOrigin + i4] = obj4;
        }

        public static final void growPayload(AlphaCreator alphaCreator, int i, Object obj) {
            alphaCreator.releaseHeader[(alphaCreator.clipOrigin - alphaCreator.evictLayout[alphaCreator.growPayload - 1].clipOrigin()) + i] = obj;
        }

        public static final void injectMetric(AlphaCreator alphaCreator, int i, Object obj, int i2, Object obj2) {
            int clipOrigin = alphaCreator.clipOrigin - alphaCreator.evictLayout[alphaCreator.growPayload - 1].clipOrigin();
            Object[] objArr = alphaCreator.releaseHeader;
            objArr[i + clipOrigin] = obj;
            objArr[clipOrigin + i2] = obj2;
        }

        public static final void releaseHeader(AlphaCreator alphaCreator, int i, Object obj, int i2, Object obj2, int i3, Object obj3) {
            int clipOrigin = alphaCreator.clipOrigin - alphaCreator.evictLayout[alphaCreator.growPayload - 1].clipOrigin();
            Object[] objArr = alphaCreator.releaseHeader;
            objArr[i + clipOrigin] = obj;
            objArr[i2 + clipOrigin] = obj2;
            objArr[clipOrigin + i3] = obj3;
        }

        public static AlphaCreator evictLayout(AlphaCreator alphaCreator) {
            return alphaCreator;
        }
    }
}
