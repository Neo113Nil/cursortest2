package com.goldenboot.saga.zone;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class LongPressPort extends ViewPipe implements ListDeserializer {
    public final GradientComposer clipOrigin;
    public final RuntimeMaker flushSample;
    public final RailMeter releaseHeader;

    public LongPressPort(RailMeter railMeter, GradientComposer gradientComposer, RuntimeMaker runtimeMaker, TouchRecord touchRecord) {
        super(touchRecord);
        this.releaseHeader = railMeter;
        this.clipOrigin = gradientComposer;
        this.flushSample = runtimeMaker;
    }

    public final boolean clipRule(StepperAdministrator stepperAdministrator, EdgeEffect edgeEffect, Canvas canvas) {
        return escapeDelta(180.0f, FadeDispatcher.evictLayout(-ShapeSender.inflateAdapter(stepperAdministrator.releaseHeader()), (-ShapeSender.peekRevision(stepperAdministrator.releaseHeader())) + stepperAdministrator.purgeEdge(this.flushSample.evictLayout().evictLayout())), edgeEffect, canvas);
    }

    public final boolean escapeDelta(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(RuntimeHeap.connectPatch(j), RuntimeHeap.resetDelta(j));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean normalizeMetadata(StepperAdministrator stepperAdministrator, EdgeEffect edgeEffect, Canvas canvas) {
        return escapeDelta(270.0f, FadeDispatcher.evictLayout(-ShapeSender.peekRevision(stepperAdministrator.releaseHeader()), stepperAdministrator.purgeEdge(this.flushSample.evictLayout().detachStream(stepperAdministrator.getLayoutDirection()))), edgeEffect, canvas);
    }

    public final boolean resetComponent(StepperAdministrator stepperAdministrator, EdgeEffect edgeEffect, Canvas canvas) {
        return escapeDelta(90.0f, FadeDispatcher.evictLayout(0.0f, (-ChipChain.injectMetric(ShapeSender.inflateAdapter(stepperAdministrator.releaseHeader()))) + stepperAdministrator.purgeEdge(this.flushSample.evictLayout().growPayload(stepperAdministrator.getLayoutDirection()))), edgeEffect, canvas);
    }

    @Override // com.goldenboot.saga.zone.ListDeserializer
    public void unlockMessage(PublisherSegment publisherSegment) {
        this.releaseHeader.attachConfig(publisherSegment.releaseHeader());
        if (ShapeSender.drawRequest(publisherSegment.releaseHeader())) {
            publisherSegment.compressPrefs();
            return;
        }
        publisherSegment.compressPrefs();
        this.releaseHeader.popBlueprint().getValue();
        Canvas detachStream = EmitterHook.detachStream(publisherSegment.getDrawContext().applyTask());
        GradientComposer gradientComposer = this.clipOrigin;
        boolean normalizeMetadata = gradientComposer.attachConfig() ? normalizeMetadata(publisherSegment, gradientComposer.updateTimer(), detachStream) : false;
        if (gradientComposer.drawScope()) {
            normalizeMetadata = wrapModel(publisherSegment, gradientComposer.connectJob(), detachStream) || normalizeMetadata;
        }
        if (gradientComposer.purgeNode()) {
            normalizeMetadata = resetComponent(publisherSegment, gradientComposer.popBlueprint(), detachStream) || normalizeMetadata;
        }
        if (gradientComposer.reduceScope()) {
            normalizeMetadata = clipRule(publisherSegment, gradientComposer.clipOrigin(), detachStream) || normalizeMetadata;
        }
        if (normalizeMetadata) {
            this.releaseHeader.drawField();
        }
    }

    public final boolean wrapModel(StepperAdministrator stepperAdministrator, EdgeEffect edgeEffect, Canvas canvas) {
        return escapeDelta(0.0f, FadeDispatcher.evictLayout(0.0f, stepperAdministrator.purgeEdge(this.flushSample.evictLayout().injectMetric())), edgeEffect, canvas);
    }
}
