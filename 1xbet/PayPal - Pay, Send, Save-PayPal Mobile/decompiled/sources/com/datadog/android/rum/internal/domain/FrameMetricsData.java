package com.datadog.android.rum.internal.domain;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b+\b\u0080\b\u0018\u0000 ]2\u00020\u0001:\u0001]B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJ°\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0019J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104R\"\u0010\u0007\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u00108R\"\u0010\u000b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\b9\u0010\u001b\"\u0004\b:\u00108R\"\u0010\u0013\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u00108R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010#\"\u0004\b?\u0010@R\"\u0010\t\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u00108R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010FR\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010JR\"\u0010\u0012\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u00105\u001a\u0004\bK\u0010\u001b\"\u0004\bL\u00108R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u00105\u001a\u0004\bM\u0010\u001b\"\u0004\bN\u00108R\"\u0010\u0010\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00105\u001a\u0004\bO\u0010\u001b\"\u0004\bP\u00108R\"\u0010\b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\bQ\u0010\u001b\"\u0004\bR\u00108R\"\u0010\f\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u00108R\"\u0010\n\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00105\u001a\u0004\bU\u0010\u001b\"\u0004\bV\u00108R\"\u0010\r\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\bW\u0010\u001b\"\u0004\bX\u00108R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u00105\u001a\u0004\bY\u0010\u001b\"\u0004\bZ\u00108R\"\u0010\u0011\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00105\u001a\u0004\b[\u0010\u001b\"\u0004\b\\\u00108"}, d2 = {"Lcom/datadog/android/rum/internal/domain/FrameMetricsData;", "", "", "droppedFrames", "", "unknownDelayDuration", "inputHandlingDuration", "animationDuration", "layoutMeasureDuration", "drawDuration", "syncDuration", "commandIssueDuration", "swapBuffersDuration", "totalDuration", "", "firstDrawFrame", "intendedVsyncTimestamp", "vsyncTimestamp", "gpuDuration", "deadline", "", "displayRefreshRate", "<init>", "(IJJJJJJJJJZJJJJD)V", "component1", "()I", "component10", "()J", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "()D", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJJJJJJJJJZJJJJD)Lcom/datadog/android/rum/internal/domain/FrameMetricsData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getAnimationDuration", "setAnimationDuration", "(J)V", "getCommandIssueDuration", "setCommandIssueDuration", "getDeadline", "setDeadline", "D", "getDisplayRefreshRate", "setDisplayRefreshRate", "(D)V", "getDrawDuration", "setDrawDuration", com.visa.cbp.getEncExpo.warmup, "getDroppedFrames", "setDroppedFrames", "(I)V", "Z", "getFirstDrawFrame", "setFirstDrawFrame", "(Z)V", "getGpuDuration", "setGpuDuration", "getInputHandlingDuration", "setInputHandlingDuration", "getIntendedVsyncTimestamp", "setIntendedVsyncTimestamp", "getLayoutMeasureDuration", "setLayoutMeasureDuration", "getSwapBuffersDuration", "setSwapBuffersDuration", "getSyncDuration", "setSyncDuration", "getTotalDuration", "setTotalDuration", "getUnknownDelayDuration", "setUnknownDelayDuration", "getVsyncTimestamp", "setVsyncTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FrameMetricsData {
    private long animationDuration;
    private long commandIssueDuration;
    private long deadline;
    private double displayRefreshRate;
    private long drawDuration;
    private int droppedFrames;
    private boolean firstDrawFrame;
    private long gpuDuration;
    private long inputHandlingDuration;
    private long intendedVsyncTimestamp;
    private long layoutMeasureDuration;
    private long swapBuffersDuration;
    private long syncDuration;
    private long totalDuration;
    private long unknownDelayDuration;
    private long vsyncTimestamp;

    public FrameMetricsData(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, long j10, long j11, long j12, long j13, double d) {
        this.droppedFrames = i;
        this.unknownDelayDuration = j;
        this.inputHandlingDuration = j2;
        this.animationDuration = j3;
        this.layoutMeasureDuration = j4;
        this.drawDuration = j5;
        this.syncDuration = j6;
        this.commandIssueDuration = j7;
        this.swapBuffersDuration = j8;
        this.totalDuration = j9;
        this.firstDrawFrame = z;
        this.intendedVsyncTimestamp = j10;
        this.vsyncTimestamp = j11;
        this.gpuDuration = j12;
        this.deadline = j13;
        this.displayRefreshRate = d;
    }

    public /* synthetic */ FrameMetricsData(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, long j10, long j11, long j12, long j13, double d, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? 0L : j4, (i2 & 32) != 0 ? 0L : j5, (i2 & 64) != 0 ? 0L : j6, (i2 & 128) != 0 ? 0L : j7, (i2 & 256) != 0 ? 0L : j8, (i2 & 512) != 0 ? 0L : j9, (i2 & 1024) == 0 ? z : false, (i2 & 2048) != 0 ? 0L : j10, (i2 & 4096) != 0 ? 0L : j11, (i2 & 8192) != 0 ? 0L : j12, (i2 & 16384) == 0 ? j13 : 0L, (i2 & 32768) != 0 ? 60.0d : d);
    }

    public final int getDroppedFrames() {
        return this.droppedFrames;
    }

    public final void setDroppedFrames(int i) {
        this.droppedFrames = i;
    }

    public final long getUnknownDelayDuration() {
        return this.unknownDelayDuration;
    }

    public final void setUnknownDelayDuration(long j) {
        this.unknownDelayDuration = j;
    }

    public final long getInputHandlingDuration() {
        return this.inputHandlingDuration;
    }

    public final void setInputHandlingDuration(long j) {
        this.inputHandlingDuration = j;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final void setAnimationDuration(long j) {
        this.animationDuration = j;
    }

    public final long getLayoutMeasureDuration() {
        return this.layoutMeasureDuration;
    }

    public final void setLayoutMeasureDuration(long j) {
        this.layoutMeasureDuration = j;
    }

    public final long getDrawDuration() {
        return this.drawDuration;
    }

    public final void setDrawDuration(long j) {
        this.drawDuration = j;
    }

    public final long getSyncDuration() {
        return this.syncDuration;
    }

    public final void setSyncDuration(long j) {
        this.syncDuration = j;
    }

    public final long getCommandIssueDuration() {
        return this.commandIssueDuration;
    }

    public final void setCommandIssueDuration(long j) {
        this.commandIssueDuration = j;
    }

    public final long getSwapBuffersDuration() {
        return this.swapBuffersDuration;
    }

    public final void setSwapBuffersDuration(long j) {
        this.swapBuffersDuration = j;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public final boolean getFirstDrawFrame() {
        return this.firstDrawFrame;
    }

    public final void setFirstDrawFrame(boolean z) {
        this.firstDrawFrame = z;
    }

    public final long getIntendedVsyncTimestamp() {
        return this.intendedVsyncTimestamp;
    }

    public final void setIntendedVsyncTimestamp(long j) {
        this.intendedVsyncTimestamp = j;
    }

    public final long getVsyncTimestamp() {
        return this.vsyncTimestamp;
    }

    public final void setVsyncTimestamp(long j) {
        this.vsyncTimestamp = j;
    }

    public final long getGpuDuration() {
        return this.gpuDuration;
    }

    public final void setGpuDuration(long j) {
        this.gpuDuration = j;
    }

    public final long getDeadline() {
        return this.deadline;
    }

    public final void setDeadline(long j) {
        this.deadline = j;
    }

    public final double getDisplayRefreshRate() {
        return this.displayRefreshRate;
    }

    public final void setDisplayRefreshRate(double d) {
        this.displayRefreshRate = d;
    }

    public final java.lang.String toString() {
        int i = this.droppedFrames;
        long j = this.unknownDelayDuration;
        long j2 = this.inputHandlingDuration;
        long j3 = this.animationDuration;
        long j4 = this.layoutMeasureDuration;
        long j5 = this.drawDuration;
        long j6 = this.syncDuration;
        long j7 = this.commandIssueDuration;
        long j8 = this.swapBuffersDuration;
        long j9 = this.totalDuration;
        boolean z = this.firstDrawFrame;
        long j10 = this.intendedVsyncTimestamp;
        long j11 = this.vsyncTimestamp;
        long j12 = this.gpuDuration;
        long j13 = this.deadline;
        double d = this.displayRefreshRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameMetricsData(droppedFrames=");
        sb.append(i);
        sb.append(", unknownDelayDuration=");
        sb.append(j);
        sb.append(", inputHandlingDuration=");
        sb.append(j2);
        sb.append(", animationDuration=");
        sb.append(j3);
        sb.append(", layoutMeasureDuration=");
        sb.append(j4);
        sb.append(", drawDuration=");
        sb.append(j5);
        sb.append(", syncDuration=");
        sb.append(j6);
        sb.append(", commandIssueDuration=");
        sb.append(j7);
        sb.append(", swapBuffersDuration=");
        sb.append(j8);
        sb.append(", totalDuration=");
        sb.append(j9);
        sb.append(", firstDrawFrame=");
        sb.append(z);
        sb.append(", intendedVsyncTimestamp=");
        sb.append(j10);
        sb.append(", vsyncTimestamp=");
        sb.append(j11);
        sb.append(", gpuDuration=");
        sb.append(j12);
        sb.append(", deadline=");
        sb.append(j13);
        sb.append(", displayRefreshRate=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.droppedFrames) * 31) + java.lang.Long.hashCode(this.unknownDelayDuration)) * 31) + java.lang.Long.hashCode(this.inputHandlingDuration)) * 31) + java.lang.Long.hashCode(this.animationDuration)) * 31) + java.lang.Long.hashCode(this.layoutMeasureDuration)) * 31) + java.lang.Long.hashCode(this.drawDuration)) * 31) + java.lang.Long.hashCode(this.syncDuration)) * 31) + java.lang.Long.hashCode(this.commandIssueDuration)) * 31) + java.lang.Long.hashCode(this.swapBuffersDuration)) * 31) + java.lang.Long.hashCode(this.totalDuration)) * 31) + java.lang.Boolean.hashCode(this.firstDrawFrame)) * 31) + java.lang.Long.hashCode(this.intendedVsyncTimestamp)) * 31) + java.lang.Long.hashCode(this.vsyncTimestamp)) * 31) + java.lang.Long.hashCode(this.gpuDuration)) * 31) + java.lang.Long.hashCode(this.deadline)) * 31) + java.lang.Double.hashCode(this.displayRefreshRate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.FrameMetricsData)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.FrameMetricsData frameMetricsData = (com.datadog.android.rum.internal.domain.FrameMetricsData) other;
        return this.droppedFrames == frameMetricsData.droppedFrames && this.unknownDelayDuration == frameMetricsData.unknownDelayDuration && this.inputHandlingDuration == frameMetricsData.inputHandlingDuration && this.animationDuration == frameMetricsData.animationDuration && this.layoutMeasureDuration == frameMetricsData.layoutMeasureDuration && this.drawDuration == frameMetricsData.drawDuration && this.syncDuration == frameMetricsData.syncDuration && this.commandIssueDuration == frameMetricsData.commandIssueDuration && this.swapBuffersDuration == frameMetricsData.swapBuffersDuration && this.totalDuration == frameMetricsData.totalDuration && this.firstDrawFrame == frameMetricsData.firstDrawFrame && this.intendedVsyncTimestamp == frameMetricsData.intendedVsyncTimestamp && this.vsyncTimestamp == frameMetricsData.vsyncTimestamp && this.gpuDuration == frameMetricsData.gpuDuration && this.deadline == frameMetricsData.deadline && java.lang.Double.compare(this.displayRefreshRate, frameMetricsData.displayRefreshRate) == 0;
    }

    public final com.datadog.android.rum.internal.domain.FrameMetricsData copy(int droppedFrames, long unknownDelayDuration, long inputHandlingDuration, long animationDuration, long layoutMeasureDuration, long drawDuration, long syncDuration, long commandIssueDuration, long swapBuffersDuration, long totalDuration, boolean firstDrawFrame, long intendedVsyncTimestamp, long vsyncTimestamp, long gpuDuration, long deadline, double displayRefreshRate) {
        return new com.datadog.android.rum.internal.domain.FrameMetricsData(droppedFrames, unknownDelayDuration, inputHandlingDuration, animationDuration, layoutMeasureDuration, drawDuration, syncDuration, commandIssueDuration, swapBuffersDuration, totalDuration, firstDrawFrame, intendedVsyncTimestamp, vsyncTimestamp, gpuDuration, deadline, displayRefreshRate);
    }

    /* renamed from: component9, reason: from getter */
    public final long getSwapBuffersDuration() {
        return this.swapBuffersDuration;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCommandIssueDuration() {
        return this.commandIssueDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final long getSyncDuration() {
        return this.syncDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDrawDuration() {
        return this.drawDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLayoutMeasureDuration() {
        return this.layoutMeasureDuration;
    }

    /* renamed from: component4, reason: from getter */
    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final long getInputHandlingDuration() {
        return this.inputHandlingDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUnknownDelayDuration() {
        return this.unknownDelayDuration;
    }

    /* renamed from: component16, reason: from getter */
    public final double getDisplayRefreshRate() {
        return this.displayRefreshRate;
    }

    /* renamed from: component15, reason: from getter */
    public final long getDeadline() {
        return this.deadline;
    }

    /* renamed from: component14, reason: from getter */
    public final long getGpuDuration() {
        return this.gpuDuration;
    }

    /* renamed from: component13, reason: from getter */
    public final long getVsyncTimestamp() {
        return this.vsyncTimestamp;
    }

    /* renamed from: component12, reason: from getter */
    public final long getIntendedVsyncTimestamp() {
        return this.intendedVsyncTimestamp;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getFirstDrawFrame() {
        return this.firstDrawFrame;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDroppedFrames() {
        return this.droppedFrames;
    }

    public FrameMetricsData() {
        this(0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, 0L, 0L, 0L, 0L, 0.0d, 65535, null);
    }
}
