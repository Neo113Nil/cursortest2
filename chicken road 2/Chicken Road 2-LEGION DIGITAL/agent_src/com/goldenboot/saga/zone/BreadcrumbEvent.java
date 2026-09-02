package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BreadcrumbEvent {
    public final TextStyle applyTask;
    public final TextStyle clipOrigin;
    public final TextStyle connectJob;
    public final TextStyle detachStream;
    public final TextStyle drawField;
    public final TextStyle evictLayout;
    public final TextStyle flushSample;
    public final TextStyle growPayload;
    public final TextStyle injectMetric;
    public final TextStyle peekRevision;
    public final TextStyle popBlueprint;
    public final TextStyle reduceScope;
    public final TextStyle releaseHeader;
    public final TextStyle serializeOffset;
    public final TextStyle updateTimer;

    public BreadcrumbEvent(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        this.evictLayout = textStyle;
        this.growPayload = textStyle2;
        this.injectMetric = textStyle3;
        this.detachStream = textStyle4;
        this.releaseHeader = textStyle5;
        this.clipOrigin = textStyle6;
        this.flushSample = textStyle7;
        this.updateTimer = textStyle8;
        this.applyTask = textStyle9;
        this.popBlueprint = textStyle10;
        this.drawField = textStyle11;
        this.connectJob = textStyle12;
        this.peekRevision = textStyle13;
        this.serializeOffset = textStyle14;
        this.reduceScope = textStyle15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BreadcrumbEvent)) {
            return false;
        }
        BreadcrumbEvent breadcrumbEvent = (BreadcrumbEvent) obj;
        return Intrinsics.areEqual(this.evictLayout, breadcrumbEvent.evictLayout) && Intrinsics.areEqual(this.growPayload, breadcrumbEvent.growPayload) && Intrinsics.areEqual(this.injectMetric, breadcrumbEvent.injectMetric) && Intrinsics.areEqual(this.detachStream, breadcrumbEvent.detachStream) && Intrinsics.areEqual(this.releaseHeader, breadcrumbEvent.releaseHeader) && Intrinsics.areEqual(this.clipOrigin, breadcrumbEvent.clipOrigin) && Intrinsics.areEqual(this.flushSample, breadcrumbEvent.flushSample) && Intrinsics.areEqual(this.updateTimer, breadcrumbEvent.updateTimer) && Intrinsics.areEqual(this.applyTask, breadcrumbEvent.applyTask) && Intrinsics.areEqual(this.popBlueprint, breadcrumbEvent.popBlueprint) && Intrinsics.areEqual(this.drawField, breadcrumbEvent.drawField) && Intrinsics.areEqual(this.connectJob, breadcrumbEvent.connectJob) && Intrinsics.areEqual(this.peekRevision, breadcrumbEvent.peekRevision) && Intrinsics.areEqual(this.serializeOffset, breadcrumbEvent.serializeOffset) && Intrinsics.areEqual(this.reduceScope, breadcrumbEvent.reduceScope);
    }

    public final TextStyle evictLayout() {
        return this.popBlueprint;
    }

    public final TextStyle growPayload() {
        return this.updateTimer;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.evictLayout.hashCode() * 31) + this.growPayload.hashCode()) * 31) + this.injectMetric.hashCode()) * 31) + this.detachStream.hashCode()) * 31) + this.releaseHeader.hashCode()) * 31) + this.clipOrigin.hashCode()) * 31) + this.flushSample.hashCode()) * 31) + this.updateTimer.hashCode()) * 31) + this.applyTask.hashCode()) * 31) + this.popBlueprint.hashCode()) * 31) + this.drawField.hashCode()) * 31) + this.connectJob.hashCode()) * 31) + this.peekRevision.hashCode()) * 31) + this.serializeOffset.hashCode()) * 31) + this.reduceScope.hashCode();
    }

    public String toString() {
        return "Typography(displayLarge=" + this.evictLayout + ", displayMedium=" + this.growPayload + ",displaySmall=" + this.injectMetric + ", headlineLarge=" + this.detachStream + ", headlineMedium=" + this.releaseHeader + ", headlineSmall=" + this.clipOrigin + ", titleLarge=" + this.flushSample + ", titleMedium=" + this.updateTimer + ", titleSmall=" + this.applyTask + ", bodyLarge=" + this.popBlueprint + ", bodyMedium=" + this.drawField + ", bodySmall=" + this.connectJob + ", labelLarge=" + this.peekRevision + ", labelMedium=" + this.serializeOffset + ", labelSmall=" + this.reduceScope + ')';
    }

    public /* synthetic */ BreadcrumbEvent(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ServiceNotifier.evictLayout.detachStream() : textStyle, (i & 2) != 0 ? ServiceNotifier.evictLayout.releaseHeader() : textStyle2, (i & 4) != 0 ? ServiceNotifier.evictLayout.clipOrigin() : textStyle3, (i & 8) != 0 ? ServiceNotifier.evictLayout.flushSample() : textStyle4, (i & 16) != 0 ? ServiceNotifier.evictLayout.updateTimer() : textStyle5, (i & 32) != 0 ? ServiceNotifier.evictLayout.applyTask() : textStyle6, (i & 64) != 0 ? ServiceNotifier.evictLayout.peekRevision() : textStyle7, (i & ContentOperation.SpotShadowColor) != 0 ? ServiceNotifier.evictLayout.serializeOffset() : textStyle8, (i & ContentOperation.RotationX) != 0 ? ServiceNotifier.evictLayout.reduceScope() : textStyle9, (i & ContentOperation.RotationY) != 0 ? ServiceNotifier.evictLayout.evictLayout() : textStyle10, (i & ContentOperation.RotationZ) != 0 ? ServiceNotifier.evictLayout.growPayload() : textStyle11, (i & ContentOperation.CameraDistance) != 0 ? ServiceNotifier.evictLayout.injectMetric() : textStyle12, (i & ContentOperation.TransformOrigin) != 0 ? ServiceNotifier.evictLayout.popBlueprint() : textStyle13, (i & ContentOperation.Shape) != 0 ? ServiceNotifier.evictLayout.drawField() : textStyle14, (i & ContentOperation.Clip) != 0 ? ServiceNotifier.evictLayout.connectJob() : textStyle15);
    }
}
