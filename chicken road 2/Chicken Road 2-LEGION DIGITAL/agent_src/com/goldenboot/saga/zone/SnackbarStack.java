package com.goldenboot.saga.zone;

import android.os.Trace;
import androidx.compose.ui.layout.PaddingRing;
import com.goldenboot.saga.zone.LayoutBlock;
import com.goldenboot.saga.zone.ScaleParser;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SnackbarStack {
    public final SingletonPump evictLayout;
    public final androidx.compose.ui.layout.PaddingRing growPayload;
    public final TextNotifier injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class ActivityMutator implements ScaleParser.BounceHandler, ContentHolder {
        public boolean applyTask;
        public boolean clipOrigin;
        public PaddingRing.BounceHandler detachStream;
        public final int evictLayout;
        public boolean flushSample;
        public final long growPayload;
        public final MenuGraph injectMetric;
        public boolean releaseHeader;
        public C0169ActivityMutator updateTimer;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.SnackbarStack$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public final class C0169ActivityMutator {
            public int detachStream;
            public final List evictLayout;
            public final List[] growPayload;
            public int injectMetric;

            public C0169ActivityMutator(List list) {
                this.evictLayout = list;
                this.growPayload = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean evictLayout(SubscriberCycle subscriberCycle) {
                if (this.injectMetric >= this.evictLayout.size()) {
                    return false;
                }
                if (ActivityMutator.this.clipOrigin) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.injectMetric < this.evictLayout.size()) {
                    try {
                        if (this.growPayload[this.injectMetric] == null) {
                            if (subscriberCycle.evictLayout() <= 0) {
                                return true;
                            }
                            List[] listArr = this.growPayload;
                            int i = this.injectMetric;
                            listArr[i] = ((ScaleParser) this.evictLayout.get(i)).growPayload();
                        }
                        List list = this.growPayload[this.injectMetric];
                        Intrinsics.checkNotNull(list);
                        while (this.detachStream < list.size()) {
                            if (((ContentHolder) list.get(this.detachStream)).evictLayout(subscriberCycle)) {
                                return true;
                            }
                            this.detachStream++;
                        }
                        this.detachStream = 0;
                        this.injectMetric++;
                    } finally {
                        Trace.endSection();
                    }
                }
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                return false;
            }
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class BounceHandler extends Lambda implements TouchRecord {
            public final /* synthetic */ Ref.ObjectRef reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BounceHandler(Ref.ObjectRef objectRef) {
                super(1);
                this.reduceScope = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.goldenboot.saga.zone.TouchRecord
            /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
            public final LayoutBlock.Companion.EnumC0126ActivityMutator invoke(LayoutBlock layoutBlock) {
                T t;
                Intrinsics.checkNotNull(layoutBlock, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                ScaleParser evictMessage = ((ViewSnapshot) layoutBlock).evictMessage();
                Ref.ObjectRef objectRef = this.reduceScope;
                List list = (List) objectRef.element;
                if (list != null) {
                    list.add(evictMessage);
                    t = list;
                } else {
                    t = CursorBuilder.attachConfig(evictMessage);
                }
                objectRef.element = t;
                return LayoutBlock.Companion.EnumC0126ActivityMutator.notifyMessage;
            }
        }

        public /* synthetic */ ActivityMutator(SnackbarStack snackbarStack, int i, long j, MenuGraph menuGraph, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j, menuGraph);
        }

        public final boolean applyTask(SubscriberCycle subscriberCycle, long j) {
            long evictLayout = subscriberCycle.evictLayout();
            return (this.applyTask && evictLayout > 0) || j < evictLayout;
        }

        @Override // com.goldenboot.saga.zone.ScaleParser.BounceHandler
        public void cancel() {
            if (this.clipOrigin) {
                return;
            }
            this.clipOrigin = true;
            PaddingRing.BounceHandler bounceHandler = this.detachStream;
            if (bounceHandler != null) {
                bounceHandler.evictLayout();
            }
            this.detachStream = null;
        }

        public final void clipOrigin() {
            if (!releaseHeader()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            }
            if (this.detachStream != null) {
                throw new IllegalArgumentException("Request was already composed!");
            }
            PanelRouter panelRouter = (PanelRouter) SnackbarStack.this.evictLayout.detachStream().invoke();
            Object evictLayout = panelRouter.evictLayout(this.evictLayout);
            this.detachStream = SnackbarStack.this.growPayload.popBlueprint(evictLayout, SnackbarStack.this.evictLayout.growPayload(this.evictLayout, evictLayout, panelRouter.detachStream(this.evictLayout)));
        }

        public final boolean detachStream() {
            return this.detachStream != null;
        }

        @Override // com.goldenboot.saga.zone.ContentHolder
        public boolean evictLayout(SubscriberCycle subscriberCycle) {
            long detachStream;
            long detachStream2;
            long detachStream3;
            long detachStream4;
            if (!releaseHeader()) {
                return false;
            }
            Object detachStream5 = ((PanelRouter) SnackbarStack.this.evictLayout.detachStream().invoke()).detachStream(this.evictLayout);
            if (!detachStream()) {
                if (!applyTask(subscriberCycle, (detachStream5 == null || !this.injectMetric.clipOrigin().evictLayout(detachStream5)) ? this.injectMetric.releaseHeader() : this.injectMetric.clipOrigin().detachStream(detachStream5))) {
                    return true;
                }
                MenuGraph menuGraph = this.injectMetric;
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    clipOrigin();
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (detachStream5 != null) {
                        detachStream4 = menuGraph.detachStream(nanoTime2, menuGraph.clipOrigin().clipOrigin(detachStream5, 0L));
                        menuGraph.clipOrigin().connectPatch(detachStream5, detachStream4);
                    }
                    detachStream3 = menuGraph.detachStream(nanoTime2, menuGraph.releaseHeader());
                    menuGraph.injectMetric = detachStream3;
                } finally {
                }
            }
            if (!this.applyTask) {
                if (!this.flushSample) {
                    if (subscriberCycle.evictLayout() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.updateTimer = updateTimer();
                        this.flushSample = true;
                        DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                    } finally {
                    }
                }
                C0169ActivityMutator c0169ActivityMutator = this.updateTimer;
                if (c0169ActivityMutator != null ? c0169ActivityMutator.evictLayout(subscriberCycle) : false) {
                    return true;
                }
            }
            if (!this.releaseHeader && !PagerPlanner.drawRequest(this.growPayload)) {
                if (!applyTask(subscriberCycle, (detachStream5 == null || !this.injectMetric.updateTimer().evictLayout(detachStream5)) ? this.injectMetric.flushSample() : this.injectMetric.updateTimer().detachStream(detachStream5))) {
                    return true;
                }
                MenuGraph menuGraph2 = this.injectMetric;
                long nanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    flushSample(this.growPayload);
                    DpadBuilder dpadBuilder3 = DpadBuilder.evictLayout;
                    Trace.endSection();
                    long nanoTime4 = System.nanoTime() - nanoTime3;
                    if (detachStream5 != null) {
                        detachStream2 = menuGraph2.detachStream(nanoTime4, menuGraph2.updateTimer().clipOrigin(detachStream5, 0L));
                        menuGraph2.updateTimer().connectPatch(detachStream5, detachStream2);
                    }
                    detachStream = menuGraph2.detachStream(nanoTime4, menuGraph2.flushSample());
                    menuGraph2.detachStream = detachStream;
                } finally {
                }
            }
            return false;
        }

        public final void flushSample(long j) {
            if (this.clipOrigin) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.releaseHeader) {
                throw new IllegalArgumentException("Request was already measured!");
            }
            this.releaseHeader = true;
            PaddingRing.BounceHandler bounceHandler = this.detachStream;
            if (bounceHandler == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            int growPayload = bounceHandler.growPayload();
            for (int i = 0; i < growPayload; i++) {
                bounceHandler.detachStream(i, j);
            }
        }

        @Override // com.goldenboot.saga.zone.ScaleParser.BounceHandler
        public void growPayload() {
            this.applyTask = true;
        }

        public final boolean releaseHeader() {
            if (this.clipOrigin) {
                return false;
            }
            int itemCount = ((PanelRouter) SnackbarStack.this.evictLayout.detachStream().invoke()).getItemCount();
            int i = this.evictLayout;
            return i >= 0 && i < itemCount;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.evictLayout + ", constraints = " + ((Object) PagerPlanner.gatherAdapter(this.growPayload)) + ", isComposed = " + detachStream() + ", isMeasured = " + this.releaseHeader + ", isCanceled = " + this.clipOrigin + " }";
        }

        public final C0169ActivityMutator updateTimer() {
            PaddingRing.BounceHandler bounceHandler = this.detachStream;
            if (bounceHandler == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            bounceHandler.releaseHeader("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new BounceHandler(objectRef));
            List list = (List) objectRef.element;
            if (list != null) {
                return new C0169ActivityMutator(list);
            }
            return null;
        }

        public ActivityMutator(int i, long j, MenuGraph menuGraph) {
            this.evictLayout = i;
            this.growPayload = j;
            this.injectMetric = menuGraph;
        }
    }

    public SnackbarStack(SingletonPump singletonPump, androidx.compose.ui.layout.PaddingRing paddingRing, TextNotifier textNotifier) {
        this.evictLayout = singletonPump;
        this.growPayload = paddingRing;
        this.injectMetric = textNotifier;
    }

    public final ScaleParser.BounceHandler detachStream(int i, long j, MenuGraph menuGraph) {
        ActivityMutator activityMutator = new ActivityMutator(this, i, j, menuGraph, null);
        this.injectMetric.evictLayout(activityMutator);
        return activityMutator;
    }

    public final ContentHolder injectMetric(int i, long j, MenuGraph menuGraph) {
        return new ActivityMutator(this, i, j, menuGraph, null);
    }
}
