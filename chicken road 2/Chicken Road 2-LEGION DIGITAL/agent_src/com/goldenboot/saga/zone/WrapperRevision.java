package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AlphaCreator;
import com.goldenboot.saga.zone.LayoutPipeline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WrapperRevision extends RemoteCycle {
    public final AlphaCreator evictLayout = new AlphaCreator();
    public final AlphaCreator growPayload = new AlphaCreator();

    public final void clipOrigin(Object obj, IconExporter iconExporter) {
        AlphaCreator alphaCreator = this.evictLayout;
        LayoutPipeline.TooltipReducer tooltipReducer = LayoutPipeline.TooltipReducer.injectMetric;
        alphaCreator.popBlueprint(tooltipReducer);
        AlphaCreator evictLayout = AlphaCreator.BounceHandler.evictLayout(alphaCreator);
        AlphaCreator.BounceHandler.growPayload(evictLayout, LayoutPipeline.ConsumerMaker.evictLayout(0), obj);
        int evictLayout2 = LayoutPipeline.ConsumerMaker.evictLayout(1);
        Intrinsics.checkNotNull(iconExporter, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        AlphaCreator.BounceHandler.growPayload(evictLayout, evictLayout2, (IconExporter) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iconExporter, 2));
        alphaCreator.injectMetric(tooltipReducer);
    }

    public final void detachStream(ToastBinder toastBinder, ElevationStack elevationStack, BounceRouter bounceRouter, TabAllocator tabAllocator) {
        if (!this.growPayload.clipOrigin()) {
            MorphPatch.inflateAdapter("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.evictLayout.detachStream(toastBinder, elevationStack, bounceRouter, tabAllocator);
    }

    public final void evictLayout() {
        this.growPayload.evictLayout();
        this.evictLayout.evictLayout();
    }

    public final void growPayload(ElevationNode elevationNode, int i, TouchEvaluator touchEvaluator) {
        AlphaCreator alphaCreator = this.evictLayout;
        LayoutPipeline.CardSampler cardSampler = LayoutPipeline.CardSampler.injectMetric;
        alphaCreator.popBlueprint(cardSampler);
        AlphaCreator evictLayout = AlphaCreator.BounceHandler.evictLayout(alphaCreator);
        AlphaCreator.BounceHandler.growPayload(evictLayout, LayoutPipeline.ConsumerMaker.evictLayout(0), elevationNode);
        evictLayout.injectMetric[evictLayout.detachStream - evictLayout.evictLayout[evictLayout.growPayload - 1].detachStream()] = i;
        AlphaCreator.BounceHandler.growPayload(evictLayout, LayoutPipeline.ConsumerMaker.evictLayout(1), touchEvaluator);
        alphaCreator.injectMetric(cardSampler);
        AlphaCreator alphaCreator2 = this.growPayload;
        LayoutPipeline.FeatureStreamer featureStreamer = LayoutPipeline.FeatureStreamer.injectMetric;
        alphaCreator2.popBlueprint(featureStreamer);
        AlphaCreator evictLayout2 = AlphaCreator.BounceHandler.evictLayout(alphaCreator2);
        evictLayout2.injectMetric[evictLayout2.detachStream - evictLayout2.evictLayout[evictLayout2.growPayload - 1].detachStream()] = i;
        AlphaCreator.BounceHandler.growPayload(evictLayout2, LayoutPipeline.ConsumerMaker.evictLayout(0), touchEvaluator);
        alphaCreator2.injectMetric(featureStreamer);
    }

    public final void injectMetric() {
        if (!this.growPayload.flushSample()) {
            MorphPatch.inflateAdapter("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.growPayload.updateTimer(this.evictLayout);
    }

    public final boolean releaseHeader() {
        return this.evictLayout.clipOrigin();
    }
}
